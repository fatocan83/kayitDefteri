package com.cs.dao.abstracts;

import java.util.List;

import com.cs.model.Kayit;

public interface IKayitDao {

	public int addKayit(Kayit kayit);

	public List<Kayit> listKayit();

}
