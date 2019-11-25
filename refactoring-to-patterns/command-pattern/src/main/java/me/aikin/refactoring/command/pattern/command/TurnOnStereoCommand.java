package me.aikin.refactoring.command.pattern.command;

import me.aikin.refactoring.command.pattern.reciever.Stereo;

public class TurnOnStereoCommand extends Command {
    private Stereo stereo;

    public TurnOnStereoCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCdStatus(true);
        stereo.setVolume(11);
    }
}