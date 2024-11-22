import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Александр", "Овчинкин", "О-23-ИВТ", 1, new int[] {3, 4, 5, 4}));
        students.add(new Student("Иван", "Никишов", "О-23-ИВТ", 1, new int[] {3, 2, 5, 5}));
        students.add(new Student("Сергей", "Кузин", "О-23-ИВТ", 1, new int[] {2, 2, 2, 2}));
        students.add(new Student("Максим", "Родин", "О-23-ИВТ", 1, new int[] {5, 3, 4, 4}));
        students.add(new Student("Игорь", "Сальников", "О-23-ИВТ", 1, new int[] {2, 2, 2, 2}));

        System.out.println("Студенты на первом курсе:");
        printStudents(students, 1);
        nextCourse(students);

        System.out.println("--------------------------\nСтуденты на втором курсе:");
        printStudents(students, 2);
    }

    // Переводим студентов на с следующий курс
    public static void nextCourse(List<Student> students) {
        // Удаляем тех, у кого ср-яя оценка меньше 3
        students.removeIf(student -> (student.getAvgGrade() < 3));

        // Переводим остальных на следующий курс
        for (Student student : students) {
            student.advanceCourse();
        }
    }

    // Выводим студентов на заданном курсе
    public static void printStudents(List<Student> students, int course) {
        for (Student student : students)
            if (student.getCourse() == course)
                System.out.println(student.getFullName());
    }
}
