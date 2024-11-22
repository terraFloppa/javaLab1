public class Student {
    private String firstName, lastName, group;  // Имя, фамилия и название группы
    private int course;                         // Номер курса
    private int[] grades;                       // Оценки

    public Student() {}

    public Student(String firstName, String lastName, String group, int course, int[] grades)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getFullName() { return firstName + " " + lastName; }

    public double getAvgGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum /= grades.length;
    }

    public void advanceCourse() { course++; }

    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public String getGroup()     { return group; }
    public int getCourse()       { return course; }
    public int[] getGrades()     { return grades; }
}
