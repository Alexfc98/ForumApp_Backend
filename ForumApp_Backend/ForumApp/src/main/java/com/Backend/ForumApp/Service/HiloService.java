package com.Backend.ForumApp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Backend.ForumApp.Data.HiloData;
import com.Backend.ForumApp.Models.Hilo;

@Service
public class HiloService {
	
	

	 public List<Hilo> getAllHilos()
	    {
	        List<Hilo> list = HiloData.getHilosList();

	        if(list.size() > 0) {
	            return list;
	        } else {
	            return new ArrayList<Hilo>();
	        }
	    }

	 
	 public Hilo createHilo(Hilo entity){
	        HiloData.saveHilo(entity);
			return entity;   
	    }
	 
	 
}
