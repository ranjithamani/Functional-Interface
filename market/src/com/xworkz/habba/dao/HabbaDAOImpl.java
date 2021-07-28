package com.xworkz.habba.dao;

import java.util.*;

import com.xworkz.habba.dto.HabbaDTO;

public class HabbaDAOImpl implements HabbaDAO {

	private Collection<HabbaDTO> collection = new ArrayList<HabbaDTO>();

	@Override
	public boolean ulisu(HabbaDTO dto) {
		boolean added = collection.add(dto);
		System.out.println("dto:" + dto);
		System.out.println("dto was added:" + added);
		return added;
	}

	@Override
	public HabbaDTO ondanuHuduku(HabbaSearch search) {
		List<HabbaDTO> temp = new ArrayList<HabbaDTO>();
		this.collection.forEach(e -> {
			if (search.huduku(e)) {
				temp.add(e);
			}
		});
		return temp.get(0);
	}

	@Override
	public Collection<HabbaDTO> yellavanuHuduku(HabbaSearch search) {
		Collection<HabbaDTO> value = new ArrayList<HabbaDTO>();
		this.collection.forEach(t -> {
			if (search.huduku(t)) {
				value.add(t);
			}
		});

		return value;
	}

}
