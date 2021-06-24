package com.cs.dao.concretes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cs.dao.abstracts.IKayitDao;
import com.cs.model.Kayit;

public class KayitDaoImpl implements IKayitDao {

	private JdbcTemplate jdbcTemplate;

	public KayitDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int addKayit(Kayit kayit) {
		String sql = "insert into kayit(adi,soyadi,kangrubu,ceptel,adres) values(?,?,?,?,?)";

		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] { kayit.getAdi(), kayit.getSoyadi(), kayit.getKanGrubu(),
							kayit.getCepTel(), kayit.getAdres()});

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Kayit> listKayit() {
		List<Kayit> kayitList = jdbcTemplate.query("SELECT * FROM KAYIT", new RowMapper<Kayit>() {

			@Override
			public Kayit mapRow(ResultSet rs, int rowNum) throws SQLException {
				Kayit kayit = new Kayit();

				kayit.setId(rs.getInt("kayit_id"));
				kayit.setAdi(rs.getString("adi"));
				kayit.setSoyadi(rs.getString("soyadi"));
				kayit.setKanGrubu(rs.getString("kangrubu"));
				kayit.setCepTel(rs.getString("ceptel"));
				kayit.setAdres(rs.getString("adres"));
				return kayit;
			}

		});

		return kayitList;
	}

}
