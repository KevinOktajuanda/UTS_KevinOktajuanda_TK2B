/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kevin.pelanggan.service;

import com.kevin.pelanggan.entity.Pelanggan;
import com.kevin.pelanggan.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ASUS
 */
public class PelangganService {
     @Autowired
    private PelangganRepository pelangganRepository;
    private Long pelangganKodeBarang;
    
    public Pelanggan savePelanggan(Pelanggan pelanggan){
        return pelangganRepository.save(pelanggan);
    }
    
    public Pelanggan findPelangganByKodeBarang(Long PelangganKodeBarang){
        return pelangganRepository.findByPelangganKodeBarang(pelangganKodeBarang);
    }

}