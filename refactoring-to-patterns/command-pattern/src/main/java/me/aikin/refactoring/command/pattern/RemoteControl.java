package me.aikin.refactoring.command.pattern;

import me.aikin.refactoring.command.pattern.command.Command;

import java.util.HashMap;

public class RemoteControl {
    private HashMap<Integer, Command> commandHashMap = new HashMap<>();

    public RemoteControl() {
    }

    public void on(int slot) {
        commandHashMap.get(slot).execute();
    }

    public void off(int slot) {
        commandHashMap.get(slot).execute();
    }

    public void setCommand(Integer slot, Command command) {
        this.commandHashMap.put(slot, command);
    }
}
