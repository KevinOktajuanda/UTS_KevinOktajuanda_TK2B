/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kevin.penjualan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ASUS
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Penjualan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pelanggankodeBarang;
    private String pelangganNamaBarang;
    private String Harga;
    private String Jumlah;
    private String Total;
    private String Diskon;
    
}
