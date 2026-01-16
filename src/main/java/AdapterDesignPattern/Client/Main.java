package AdapterDesignPattern.Client;

import AdapterDesignPattern.Adaptee.WeightMachineInUK;
import AdapterDesignPattern.Adapter.WeightMachineAdapter;
import AdapterDesignPattern.Adapter.WeightMachineInIndia;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineInIndia(new WeightMachineInUK());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
