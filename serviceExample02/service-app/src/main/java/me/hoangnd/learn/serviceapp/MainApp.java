/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hoangnd.learn.serviceapp;

import me.hoangnd.learn.service.shared.CPService;

/**
 *
 * @author james
 */
public class MainApp {

    public static void main(String[] args) {
        CPService cPService = CPService.getDefault();
        System.out.println(cPService.show());
    }
}
