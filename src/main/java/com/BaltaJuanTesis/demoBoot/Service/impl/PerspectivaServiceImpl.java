package com.BaltaJuanTesis.demoBoot.Service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BaltaJuanTesis.demoBoot.Service.PerspectivaService;
import com.BaltaJuanTesis.demoBoot.modelo.Perspectiva;
import com.BaltaJuanTesis.demoBoot.repository.PerspectivaRepository;

@Service("PerspectivaService")
@Transactional
public class PerspectivaServiceImpl implements PerspectivaService {
	
	@Autowired
	private PerspectivaRepository PerspectivaRepository;

	public void savePerspectiva(Perspectiva user) {
		PerspectivaRepository.save(user);
		
	}

	public List<Perspectiva> findAllPerspectivas() {
		return (List<Perspectiva>) PerspectivaRepository.findAll();
	}


	
	



}