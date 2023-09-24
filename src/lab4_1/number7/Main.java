package lab4_1.number7;

public class Main {
    public static void main(String[] args) {
        StudyPeople[] studyPeople = new StudyPeople[4];
        studyPeople[0] = new Shkila("Иван", 15, 9);
        studyPeople[1] = new Shkila("Мария", 14, 8);
        studyPeople[2] = new Student("Петр", 20, "Университет А");
        studyPeople[3] = new Student("Анна", 19, "Университет Б");

        System.out.println("Школьники:");
        for (StudyPeople people : studyPeople) {
            if (people instanceof Shkila) {
                Shkila shkila = (Shkila) people;
                System.out.println(shkila);
            }
        }

        System.out.println("\nСтуденты:");
        for (StudyPeople people : studyPeople) {
            if (people instanceof Student) {
                Student student = (Student) people;
                System.out.println(student);
            }
        }
    }
}
