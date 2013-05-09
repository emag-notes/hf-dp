package org.emamotor.hfdp.command.party.client;

import org.emamotor.hfdp.command.party.Command;
import org.emamotor.hfdp.command.party.Hottub;
import org.emamotor.hfdp.command.party.HottubOffCommand;
import org.emamotor.hfdp.command.party.HottubOnCommand;
import org.emamotor.hfdp.command.party.Light;
import org.emamotor.hfdp.command.party.LightOffCommand;
import org.emamotor.hfdp.command.party.LightOnCommand;
import org.emamotor.hfdp.command.party.MacroCommand;
import org.emamotor.hfdp.command.party.RemoteControl;
import org.emamotor.hfdp.command.party.Stereo;
import org.emamotor.hfdp.command.party.StereoOffCommand;
import org.emamotor.hfdp.command.party.StereoOnCommand;
import org.emamotor.hfdp.command.party.TV;
import org.emamotor.hfdp.command.party.TVOffCommand;
import org.emamotor.hfdp.command.party.TVOnCommand;

public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
 
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
        System.out.println("--- Undo Macro ---");
        remoteControl.undoButtonWasPushed();
	}
}
