package me.aikin.refactoring.state.pattern.machinestatus;

import me.aikin.refactoring.state.pattern.GumballMachine;

/**
 * @author huisheng.jin
 * @version 2019/11/18.
 */
public class HasQuarterMachineStatus implements MachineStatus {
    private final String hasQuarterMessage = "hasQuarterMessage";
    private final String soldCorrectMessage = "soldCorrectMessage";
    private final String ejectSuccessMessage = "ejectSuccessMessage";

    @Override
    public String insertQuarter(GumballMachine gumballMachine) {
        return hasQuarterMessage;
    }

    @Override
    public String turnCrank(GumballMachine gumballMachine) {
        gumballMachine.setStatus(MachineStatus.SOLD);
        return soldCorrectMessage;
    }

    @Override
    public String dispense(GumballMachine gumballMachine) {
        return hasQuarterMessage;
    }

    @Override
    public String ejectQuarter(GumballMachine gumballMachine) {
        gumballMachine.setStatus(MachineStatus.NO_QUARTER);
        return ejectSuccessMessage;
    }
}
