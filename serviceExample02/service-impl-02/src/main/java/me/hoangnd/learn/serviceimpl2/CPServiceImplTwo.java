/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hoangnd.learn.serviceimpl2;

import me.hoangnd.learn.service.shared.CPService;

/**
 *
 * @author james
 */
public class CPServiceImplTwo implements CPService {
    @Override
    public String show(){
        System.out.println("CPServiceImplTwo has been loaded....");
        return "CPServiceImplTwo has been loaded....";
    }
}
