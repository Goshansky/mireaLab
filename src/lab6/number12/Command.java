package lab6.number12;

interface Command {
    void execute(StringBuilder stringBuilder);
    void undo(StringBuilder stringBuilder);
}
