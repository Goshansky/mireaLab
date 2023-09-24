package lab6.number13;

class TextObserver implements Observer {
    private String name;

    public TextObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(StringBuilder subject) {
        System.out.println(name + " received an update: " + subject.toString());
    }
}

