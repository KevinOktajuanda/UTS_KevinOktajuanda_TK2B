/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kevin.penjualan.controller;

import com.kevin.penjualan.VO.Pelanggan;
import com.kevin.penjualan.entity.Penjualan;
import com.kevin.penjualan.service.PenjualanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/penjualan")
public class PenjualanController {
    @Autowired
    private PenjualanService penjualanService;
    
    @PostMapping("/")
    public Penjualan savePenjualan(@RequestBody Penjualan penjualan){
        return penjualanService.savePenjualan(penjualan);
    }
    @GetMapping("/{KodeBarang}")
    public Penjualan findPenjualanByKodeBarang(@PathVariable("KodeBarang") Long penjualanKodeBarang){
        return penjualanService.findPenjualanByKodeBarang(penjualanKodeBarang);
    }
}
