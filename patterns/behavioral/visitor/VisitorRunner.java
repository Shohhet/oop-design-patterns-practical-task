package patterns.behavioral.visitor;

import patterns.behavioral.visitor.agent.InsuranceAgent;
import patterns.behavioral.visitor.agent.Visitor;
import patterns.behavioral.visitor.insured.Bank;
import patterns.behavioral.visitor.insured.Factory;
import patterns.behavioral.visitor.insured.HouseHold;
import patterns.behavioral.visitor.insured.Insured;

public class VisitorRunner {
    public static void main(String[] args) {
        Visitor insuranceAgent = new InsuranceAgent();
        Insured houseHold = new HouseHold();
        Insured factory = new Factory();
        Insured bank = new Bank();
        houseHold.insure(insuranceAgent);
        factory.insure(insuranceAgent);
        bank.insure(insuranceAgent);
    }
}
