package me.aikin.refactoring.command.pattern.command;

import me.aikin.refactoring.command.pattern.reciever.Stereo;

public class TurnOffStereoCommand extends Command {
    private Stereo stereo;

    public TurnOffStereoCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}