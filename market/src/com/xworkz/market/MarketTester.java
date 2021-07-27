package com.xworkz.market;

import java.util.Collection;

import com.xworkz.market.dao.MarketDAO;
import com.xworkz.market.dao.MarketDAOImpl;
import com.xworkz.market.dto.MarketDTO;
import com.xworkz.market.dto.constants.MarketType;

public class MarketTester {

	public static void main(String[] args) {
		MarketDTO dto1 = new MarketDTO("AgroPro", "Mysore", 5, MarketType.AGRICULTURE);
		MarketDTO dto2 = new MarketDTO("SuperMarket", "Mandya", 9, MarketType.BUSINESS);
		MarketDTO dto3 = new MarketDTO("JioMart", "Bangalore", 7, MarketType.BUSINESS);
		MarketDTO dto4 = new MarketDTO("APMC", "Yashwanthpur", 14, MarketType.PERFECT_COMPETITION);
		MarketDTO dto5 = new MarketDTO("Flowers For You", "Kerala", 4, MarketType.AGRICULTURE);

		MarketDAO dao = new MarketDAOImpl();
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto5);

		MarketDTO found = dao.find((s) -> s.getName().equals("Flowers For You"));
		System.out.println("market by name:" + found);

		found = dao.find((k) -> k.getLocation().equals("Yashwanthpur"));
		System.out.println("market by location:" + found);

		found = dao.find((q) -> q.getNoOfShops() > 5);
		System.out.println("market by noOfShops:" + found);

		found = dao.find((q) -> q.getType().equals(MarketType.AGRICULTURE));
		System.out.println("market by type:" + found);

		Collection<MarketDTO> all = dao.findAll((z) -> z.getNoOfShops() > 6);
		for (MarketDTO marketDTO : all) {
			System.out.println("find all:" + marketDTO);
		}
	}

}
