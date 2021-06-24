package com.cs.business.abstracts;

import java.util.List;

import com.cs.model.Kayit;

public interface IKayitService {

	public int addKayit(Kayit kayit);

	public List<Kayit> listKayit();
}
