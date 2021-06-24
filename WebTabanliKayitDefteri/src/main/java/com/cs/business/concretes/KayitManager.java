package com.cs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.business.abstracts.IKayitService;
import com.cs.dao.abstracts.IKayitDao;
import com.cs.model.Kayit;

@Service
public class KayitManager implements IKayitService {
	
	@Autowired
	private IKayitDao kayitDao;
	
	@Override
	@Transactional
	public int addKayit(Kayit kayit) {
		return kayitDao.addKayit(kayit);
	}

	@Override
	@Transactional
	public List<Kayit> listKayit() {
		return kayitDao.listKayit();
	}
}
