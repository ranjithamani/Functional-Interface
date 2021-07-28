package com.xworkz.habba.tester;

import java.util.Collection;

import com.xworkz.habba.dao.HabbaDAO;
import com.xworkz.habba.dao.HabbaDAOImpl;
import com.xworkz.habba.dto.HabbaDTO;
import com.xworkz.market.dto.constants.Religion;

public class HabbaTester {

	public static void main(String[] args) {
		HabbaDTO dto1 = new HabbaDTO("Deepavali", "Ellakade", 30, Religion.HINDU, "Kajjaya", true, false);
		HabbaDTO dto2 = new HabbaDTO("Varamaha Lakshmi", "Maneli", 1, Religion.HINDU, "Karjikay-Holige", true, false);
		HabbaDTO dto3 = new HabbaDTO("Ramzan", "Pakistan", 3, Religion.MUSLIM, "Mutton", false, false);
		HabbaDTO dto4 = new HabbaDTO("BuddaPoornima", "North", 11, Religion.BUDDHISTS, "Keeru", false, true);
		HabbaDTO dto5 = new HabbaDTO("Ganesha Chathurti", "Allover", 9, Religion.HINDU, "Kadubu", true, true);

		HabbaDAO dao = new HabbaDAOImpl();
        dao.ulisu(dto1);
        dao.ulisu(dto2);
        dao.ulisu(dto3);
        dao.ulisu(dto4);
        dao.ulisu(dto5);

        HabbaDTO found=dao.ondanuHuduku((s)->s.getName().equals("Deepavali"));
        System.out.println("found by name:"+found);
        
        found=dao.ondanuHuduku((k)->k.getRegion().equals("North"));
        System.out.println("found by region:"+found);
        
        found=dao.ondanuHuduku((k)->k.getReligion().equals(Religion.MUSLIM));
        System.out.println("found by religion:"+found);
        
        found=dao.ondanuHuduku((k)->k.getFood().equals("Kadubu"));
        System.out.println("found by food:"+found);
        
        Collection<HabbaDTO> temp=dao.yellavanuHuduku((g)->g.getNoOfDays()>9);
       for (HabbaDTO habbaDTO : temp) {
		System.out.println("find all:"+habbaDTO);
	}
	}

}
