/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hoangnd.learn.serviceimpl01;

import me.hoangnd.learn.service.shared.CPService;

/**
 *
 * @author james
 */
public class CPServiceImplOne implements CPService {
    @Override
    public String show(){
        System.out.println("CPServiceImplOne has been loaded....");
        return "CPServiceImplOne has been loaded....";
    }
}
