package com.Backend.ForumApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.ForumApp.Models.Hilo;
import com.Backend.ForumApp.Service.HiloService;


@RestController
@RequestMapping("/api/hilos")
public class HiloController {

	
@Autowired
HiloService service;


@GetMapping
public ResponseEntity<List<Hilo>> getAllHilos() {
    List<Hilo> list = service.getAllHilos();

    return new ResponseEntity<List<Hilo>>(list, new HttpHeaders(), HttpStatus.OK);
}

@PostMapping
public ResponseEntity<Hilo> createHilo(@RequestBody Hilo myItem){
	Hilo created = service.createHilo(myItem);
    return new ResponseEntity<Hilo>(created, new HttpHeaders(), HttpStatus.OK);
}


}
