package duke.command;

import duke.Ui;
import duke.Storage;

import duke.task.TaskList;

public class QueryCommand extends Command {
    private CommandType commandType;

    public QueryCommand(CommandType commandType) {
        this.commandType = commandType;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
            String[] lines = tasks.getTasks();
            ui.showTasks(lines);
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String toString() {
        return commandType.toString();
    }
}
