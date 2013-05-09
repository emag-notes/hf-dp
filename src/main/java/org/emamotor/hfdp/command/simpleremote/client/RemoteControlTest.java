package org.emamotor.hfdp.command.simpleremote.client;

import org.emamotor.hfdp.command.simpleremote.GarageDoor;
import org.emamotor.hfdp.command.simpleremote.GarageDoorOpenCommand;
import org.emamotor.hfdp.command.simpleremote.Light;
import org.emamotor.hfdp.command.simpleremote.LightOnCommand;
import org.emamotor.hfdp.command.simpleremote.SimpleRemoteControl;

/**
 * Command パターンにおけるクライアント
 */
public class RemoteControlTest {

    public static void main(String... args) {

        // リモコンはインボーカ。
        // リモコンは、リクエストを行うために使用できるコマンドオブジェクトを渡される。
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // リクエストのレシーバ
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        // コマンドを作成し、レシーバのコマンドを渡す
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        // コマンドをインボーカに渡し、コマンドの実行
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }

}
