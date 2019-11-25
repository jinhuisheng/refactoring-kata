package me.aikin.refactoring.command.pattern;

import me.aikin.refactoring.command.pattern.command.*;
import me.aikin.refactoring.command.pattern.reciever.Ceiling;
import me.aikin.refactoring.command.pattern.reciever.CeilingSpeed;
import me.aikin.refactoring.command.pattern.reciever.Light;
import me.aikin.refactoring.command.pattern.reciever.Stereo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoteControlTest {

    @Test
    public void should_turn_on_light_when_press_first_on_button() {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(SlotTypeEnum.Light, new TurnOnLightCommand(light));
        remoteControl.on(SlotTypeEnum.Light);

        assertTrue(light.status());
    }


    @Test
    public void should_turn_off_light_when_press_first_off_button() {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(SlotTypeEnum.Light, new TurnOffLightCommand(light));
        remoteControl.off(SlotTypeEnum.Light);
        assertFalse(light.status());
    }

    @Test
    public void should_turn_on_ceiling_when_press_second_on_button() {
        Ceiling ceiling = new Ceiling();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(SlotTypeEnum.Ceiling, new TurnOnCeilingCommand(ceiling));
        remoteControl.on(SlotTypeEnum.Ceiling);
        assertEquals(CeilingSpeed.High, ceiling.getSpeed());
    }


    @Test
    public void should_turn_off_ceiling_when_press_second_off_button() {
        Ceiling ceiling = new Ceiling();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(SlotTypeEnum.Ceiling, new TurnOffCeilingCommand(ceiling));
        remoteControl.off(SlotTypeEnum.Ceiling);
        assertEquals(CeilingSpeed.Off, ceiling.getSpeed());
    }

    @Test
    public void should_turn_on_stereo_when_press_third_on_button() {
        Stereo stereo = new Stereo();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(SlotTypeEnum.Stereo, new TurnOnStereoCommand(stereo));
        remoteControl.on(SlotTypeEnum.Stereo);
        assertTrue(stereo.getStereoStatus());
        assertTrue(stereo.getCdStatus());
        assertEquals(11, stereo.getVolume());
    }

    @Test
    public void should_turn_off_stereo_when_press_third_off_button() {
        Stereo stereo = new Stereo();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(SlotTypeEnum.Stereo, new TurnOffStereoCommand(stereo));
        remoteControl.off(SlotTypeEnum.Stereo);
        assertFalse(stereo.getCdStatus());
        assertFalse(stereo.getCdStatus());
        assertEquals(0, stereo.getVolume());
    }


}