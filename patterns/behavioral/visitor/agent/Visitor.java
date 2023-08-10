package patterns.behavioral.visitor.agent;

import patterns.behavioral.visitor.insured.Bank;
import patterns.behavioral.visitor.insured.Factory;
import patterns.behavioral.visitor.insured.HouseHold;

public interface Visitor {
    void insure(HouseHold houseHold);
    void insure(Factory factory);
    void insure(Bank bank);
}
