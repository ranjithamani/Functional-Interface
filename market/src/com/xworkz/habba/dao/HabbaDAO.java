package com.xworkz.habba.dao;

import java.util.Collection;

import com.xworkz.habba.dto.HabbaDTO;

public interface HabbaDAO {
	boolean ulisu(HabbaDTO dto);
	HabbaDTO ondanuHuduku(HabbaSearch search);
	Collection<HabbaDTO> yellavanuHuduku(HabbaSearch search);

}
