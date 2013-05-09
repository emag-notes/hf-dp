package org.emamotor.hfdp.command.simpleremote;

public class SimpleRemoteControl {
    // コマンドを保持するするスロットを1つ持ち、
    // このコマンドは1つの機器を制御します。
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
