package me.aikin.refactoring.command.pattern.command;

import me.aikin.refactoring.command.pattern.Light;

public class TurnOffLightCommand extends Command {

    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}