package Structural.AdapterDesignPattern.Client;

import Structural.AdapterDesignPattern.Adaptee.WeightMachineInUK;
import Structural.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import Structural.AdapterDesignPattern.Adapter.WeightMachineInIndia;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineInIndia(new WeightMachineInUK());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
