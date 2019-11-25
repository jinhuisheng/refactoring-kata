package me.aikin.refactoring.command.pattern.command;

import me.aikin.refactoring.command.pattern.reciever.Light;

public class TurnOnLightCommand extends Command {

    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}