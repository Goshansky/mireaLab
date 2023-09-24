package lab6.number12;

class DeleteCommand implements Command {
    private int start;
    private int end;
    private String deletedText;

    public DeleteCommand(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute(StringBuilder stringBuilder) {
        deletedText = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
    }

    @Override
    public void undo(StringBuilder stringBuilder) {
        stringBuilder.insert(start, deletedText);
    }
}