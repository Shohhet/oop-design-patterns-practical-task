package patterns.behavioral.visitor.insured;

import patterns.behavioral.visitor.agent.Visitor;

public class Factory implements Insured{
    @Override
    public void insure(Visitor agent) {
        agent.insure(this);
    }
}
