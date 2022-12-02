package com.Backend.ForumApp.Data;

import java.util.ArrayList;
import java.util.List;

import com.Backend.ForumApp.Models.Hilo;
import com.Backend.ForumApp.Models.Post;


public class HiloData {

	private static List<Hilo> HilosList = new ArrayList<>();
	
	
	public static List<Hilo> getHilosList() {
		return HilosList;
	}

	
	
	public static void saveHilo(Hilo h) {
		HilosList.add(h);
	}
	

	
}
