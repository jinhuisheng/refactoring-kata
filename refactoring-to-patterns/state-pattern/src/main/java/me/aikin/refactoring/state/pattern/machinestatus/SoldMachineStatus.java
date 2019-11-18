package me.aikin.refactoring.state.pattern.machinestatus;

import me.aikin.refactoring.state.pattern.GumballMachine;

/**
 * @author huisheng.jin
 * @version 2019/11/18.
 */
public class SoldMachineStatus implements MachineStatus {
    private final String soldMessage = "soldMessage";
    private final String noGumballMessage = "noGumballMessage";
    private final String dispenseSuccessMessage = "dispenseSuccessMessage";

    @Override
    public String insertQuarter(GumballMachine gumballMachine) {
        return soldMessage;
    }

    @Override
    public String turnCrank(GumballMachine gumballMachine) {
        return soldMessage;
    }

    @Override
    public String dispense(GumballMachine gumballMachine) {
        gumballMachine.setGumballNum(gumballMachine.getGumballNum() - 1);
        if (gumballMachine.getGumballNum() == 0) {
            gumballMachine.setStatus(MachineStatus.SOLD_OUT);
            return noGumballMessage;
        }

        gumballMachine.setStatus(MachineStatus.NO_QUARTER);
        return dispenseSuccessMessage;
    }

    @Override
    public String ejectQuarter(GumballMachine gumballMachine) {
        return soldMessage;
    }
}
