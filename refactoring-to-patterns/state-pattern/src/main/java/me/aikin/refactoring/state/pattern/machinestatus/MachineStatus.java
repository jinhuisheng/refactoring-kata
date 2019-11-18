package me.aikin.refactoring.state.pattern.machinestatus;

import me.aikin.refactoring.state.pattern.GumballMachine;

/**
 * @author huisheng.jin
 * @version 2019/11/18.
 */
public interface MachineStatus {
    MachineStatus NO_QUARTER = new NoQuarterMachineStatus();
    MachineStatus HAS_QUARTER = new HasQuarterMachineStatus();
    MachineStatus SOLD_OUT = new SoldOutMachineStatus();
    MachineStatus SOLD = new SoldMachineStatus();

    String insertQuarter(GumballMachine gumballMachine);

    String turnCrank(GumballMachine gumballMachine);

    String dispense(GumballMachine gumballMachine);

    String ejectQuarter(GumballMachine gumballMachine);
}
