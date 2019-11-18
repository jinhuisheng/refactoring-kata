package me.aikin.refactoring.state.pattern.machinestatus;

import me.aikin.refactoring.state.pattern.GumballMachine;

/**
 * @author huisheng.jin
 * @version 2019/11/18.
 */
public class SoldOutMachineStatus implements MachineStatus {
    private final String soldOutMessage = "soldOutMessage";

    @Override
    public String insertQuarter(GumballMachine gumballMachine) {
        return soldOutMessage;
    }

    @Override
    public String turnCrank(GumballMachine gumballMachine) {
        return soldOutMessage;
    }

    @Override
    public String dispense(GumballMachine gumballMachine) {
        return soldOutMessage;
    }

    @Override
    public String ejectQuarter(GumballMachine gumballMachine) {
        return soldOutMessage;
    }
}
