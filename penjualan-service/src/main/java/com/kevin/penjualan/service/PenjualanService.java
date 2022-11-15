/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kevin.penjualan.service;

import com.kevin.penjualan.entity.Penjualan;
import com.kevin.penjualan.repository.PenjualanRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ASUS
 */
public class PenjualanService {
     @Autowired
    private PenjualanRepository penjualanRepository;
    private Long penjualanKodeBarang;
    
    public Penjualan savePenjualan(Penjualan penjualan){
        return penjualanRepository.save(penjualan);
    }
    
    public Penjualan findPenjualanByKodeBarang(Long PenjualanKodeBarang){
        return penjualanRepository.findByPenjualanKodeBarang(penjualanKodeBarang);
    }

}
