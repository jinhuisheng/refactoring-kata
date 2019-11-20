package me.aikin.refactoring.command.pattern.command;

import me.aikin.refactoring.command.pattern.Ceiling;

public class TurnOffCeilingCommand extends Command {
    private final Ceiling ceiling;

    public TurnOffCeilingCommand(Ceiling ceiling) {
        this.ceiling = ceiling;
    }


    @Override
    public void execute() {
        ceiling.off();
    }
}
