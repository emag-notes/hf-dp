package org.emamotor.hfdp.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
