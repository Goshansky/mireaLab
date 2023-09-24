package lab6.number12;
import java.util.*;
class MyStringBuilder {
    private StringBuilder stringBuilder;
    private List<Command> commandHistory;

    public MyStringBuilder() {
        stringBuilder = new StringBuilder();
        commandHistory = new ArrayList<>();
    }

    public void append(String text) {
        Command command = new AppendCommand(text);
        command.execute(stringBuilder);
        commandHistory.add(command);
    }

    public void delete(int start, int end) {
        Command command = new DeleteCommand(start, end);
        command.execute(stringBuilder);
        commandHistory.add(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo(stringBuilder);
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}

