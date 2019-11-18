package me.aikin.refactoring.state.pattern.machinestatus;

import me.aikin.refactoring.state.pattern.GumballMachine;

/**
 * @author huisheng.jin
 * @version 2019/11/18.
 */
public class NoQuarterMachineStatus implements MachineStatus {
    private final String insertedQuarterMessage = "insertedQuarterMessage";
    private final String noQuarterMessage = "NoQuarterMessage";

    @Override
    public String insertQuarter(GumballMachine gumballMachine) {
        gumballMachine.setStatus(MachineStatus.HAS_QUARTER);
        return insertedQuarterMessage;
    }

    @Override
    public String turnCrank(GumballMachine gumballMachine) {
        return noQuarterMessage;
    }

    @Override
    public String dispense(GumballMachine gumballMachine) {
        return noQuarterMessage;
    }

    @Override
    public String ejectQuarter(GumballMachine gumballMachine) {
        return noQuarterMessage;
    }
}
