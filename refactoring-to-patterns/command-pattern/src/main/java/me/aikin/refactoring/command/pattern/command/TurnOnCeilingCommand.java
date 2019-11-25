package me.aikin.refactoring.command.pattern.command;

import me.aikin.refactoring.command.pattern.reciever.Ceiling;

public class TurnOnCeilingCommand extends Command {
    private final Ceiling ceiling;

    public TurnOnCeilingCommand(Ceiling ceiling) {
        this.ceiling = ceiling;
    }


    @Override
    public void execute() {
        ceiling.high();
    }
}
