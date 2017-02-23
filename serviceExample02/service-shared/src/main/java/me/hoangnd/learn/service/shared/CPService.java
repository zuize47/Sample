/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hoangnd.learn.service.shared;

import java.util.ServiceLoader;

/**
 *
 * @author james
 */
public interface CPService {
    
    public static CPService getDefault(){
        ServiceLoader<CPService> ldr = ServiceLoader.load(CPService.class);
        for (CPService provider : ldr) {
            //We are only expecting one
            return provider;
        }
        throw new Error ("No CPService registered");
    }
    
    public void show();
}
