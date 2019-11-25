package me.aikin.refactoring.command.pattern;

import me.aikin.refactoring.command.pattern.command.Command;

import java.util.HashMap;

public class RemoteControl {
    private HashMap<SlotTypeEnum, Command> commandHashMap = new HashMap<>();

    public RemoteControl() {
    }

    public void on(SlotTypeEnum slot) {
        commandHashMap.get(slot).execute();
    }

    public void off(SlotTypeEnum slot) {
        commandHashMap.get(slot).execute();
    }

    public void setCommand(SlotTypeEnum slotType, Command command) {
        this.commandHashMap.put(slotType, command);
    }
}
