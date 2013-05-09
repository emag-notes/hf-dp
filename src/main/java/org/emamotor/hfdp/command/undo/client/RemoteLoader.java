package org.emamotor.hfdp.command.undo.client;

import org.emamotor.hfdp.command.undo.CeilingFan;
import org.emamotor.hfdp.command.undo.CeilingFanHighCommand;
import org.emamotor.hfdp.command.undo.CeilingFanMediumCommand;
import org.emamotor.hfdp.command.undo.CeilingFanOffCommand;
import org.emamotor.hfdp.command.undo.Light;
import org.emamotor.hfdp.command.undo.LightOffCommand;
import org.emamotor.hfdp.command.undo.LightOnCommand;
import org.emamotor.hfdp.command.undo.RemoteControlWithUndo;

public class RemoteLoader {

    public static void main(String... args) {

        System.out.println("===== Test Light =====");
        RemoteLoader.testLight();

        System.out.println("\n===== Test Fun =====");
        RemoteLoader.testFan();

    }

    private static void testLight() {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
    }

    private static void testFan() {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
    }
}
