/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hoangnd.learn.serviceapp;

import java.util.ServiceLoader;
import me.hoangnd.learn.service.shared.CPService;

/**
 *
 * @author james
 */
public class MainApp {

    public static void main(String[] args) {
        ServiceLoader<CPService> ldr = ServiceLoader.load(CPService.class);
        for (CPService provider : ldr) {
            //We are only expecting one
            provider.show();
        }
    }
}
