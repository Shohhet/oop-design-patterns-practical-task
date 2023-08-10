package patterns.behavioral.visitor.agent;

import patterns.behavioral.visitor.insured.Bank;
import patterns.behavioral.visitor.insured.Factory;
import patterns.behavioral.visitor.insured.HouseHold;

public class InsuranceAgent implements Visitor{
    @Override
    public void insure(HouseHold houseHold) {
        System.out.println("HouseHold get health insurance.");
    }

    @Override
    public void insure(Factory factory) {
        System.out.println("Factory get fire insurance.");
    }

    @Override
    public void insure(Bank bank) {
        System.out.println("Bank get robbery insurance.");
    }
}
