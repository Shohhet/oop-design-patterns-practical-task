package patterns.behavioral.visitor.insured;

import patterns.behavioral.visitor.agent.Visitor;

public interface Insured {
    void insure(Visitor agent);
}
