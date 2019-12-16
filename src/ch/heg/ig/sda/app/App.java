/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heg.ig.sda.app;

import ch.heg.ig.sda.business.Drone;

public class App {

    private List

    public static void main(String[] args) {
        Drone drone1 = new Drone(20,"DronevenerV1", 5);

        Drone drone2 = new Drone(15,"DronePOURAVOSV1", 2);

        System.out.println(drone1.toString());
        System.out.println(drone2.toString());
    }

}
