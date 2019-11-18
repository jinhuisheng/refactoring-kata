package me.aikin.refactoring.state.pattern;

import me.aikin.refactoring.state.pattern.machinestatus.MachineStatus;

public class GumballMachine {
    private int gumballNum;
    private MachineStatus machineStatus;

    public GumballMachine(int gumballNum, MachineStatus machineStatus) {
        this.gumballNum = gumballNum;
        this.machineStatus = machineStatus;
    }

    public String insertQuarter() {
        return machineStatus.insertQuarter(this);
    }

    public String turnCrank() {
        return machineStatus.turnCrank(this);
    }

    public String dispense() {
        return machineStatus.dispense(this);
    }

    public String ejectQuarter() {
        return machineStatus.ejectQuarter(this);
    }

    public void setStatus(MachineStatus machineStatus) {
        this.machineStatus = machineStatus;
    }

    public void setGumballNum(int gumballNum) {
        this.gumballNum = gumballNum;
    }

    public int getGumballNum() {
        return gumballNum;
    }

    public MachineStatus getState() {
        return this.machineStatus;
    }

}

