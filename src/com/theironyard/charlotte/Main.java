package com.theironyard.charlotte;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner in = new Scanner(System.in);

        // make a new VehicleInfo object
        VehicleInfo vh = new VehicleInfo();
        vh.setVin(12345);
        // for each field in VehicleInfo, use the
        // scanner to read in values. and populate.
        // the object.

        TelematicsService.report(vh);
    }
}
