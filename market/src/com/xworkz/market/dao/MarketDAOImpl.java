package com.xworkz.market.dao;

import java.util.*;

import com.xworkz.market.dto.MarketDTO;

public class MarketDAOImpl implements MarketDAO {

	private Collection<MarketDTO> collection = new ArrayList<MarketDTO>();

	@Override
	public boolean save(MarketDTO dto) {
		boolean added = collection.add(dto);
		System.out.println("dto:" + dto);
		System.out.println("dto was added:" + added);
		return added;
	}

	@Override
	public MarketDTO find(MarketSearch search) {
		Iterator<MarketDTO> iterator = this.collection.iterator();
		MarketDTO temp = null;
		while (iterator.hasNext()) {
			MarketDTO marketDTO = iterator.next();
			if (search.test(marketDTO)) {
				temp = marketDTO;
				break;
			}
		}
		return temp;
	}

	@Override
	public Collection<MarketDTO> findAll(MarketSearch search) {
		Iterator<MarketDTO> itr = this.collection.iterator();
		Collection<MarketDTO> temp = new ArrayList<MarketDTO>();
		while (itr.hasNext()) {
			MarketDTO marketDTO = (MarketDTO) itr.next();
			if (search.test(marketDTO)) {
				temp.add(marketDTO);
			}
		}
		return temp;
	}
}
