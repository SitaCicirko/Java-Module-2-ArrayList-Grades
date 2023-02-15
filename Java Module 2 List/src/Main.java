
import java.util.*;

class Grades {
    public static void main (String[] args){

        List<Double> Grades = new ArrayList<>();
        Grades.add(4.5);
        Grades.add(2.5);
        Grades.add(3.5);
        Grades.add(6.0);
        Grades.add(2.5);
        Grades.add(1.5);
        Grades.add(1.0);
        Grades.add(4.0);
        Grades.add(5.0);
        Grades.add(5.0);
        Grades.add(4.0);
        Grades.add(4.0);
        Grades.add(3.0);
        Grades.add(2.5);
        Grades.add(2.0);

        System.out.println("Number of grades: " + Grades.size());
        System.out.println("Grades: " + Grades);

        double minGrade = Collections.min(Grades);
        double maxGrade = Collections.max(Grades);

        Grades.remove(Double.valueOf(minGrade));
        Grades.remove(Double.valueOf(maxGrade));

        double gradesSum = 0.0;
        double average = 0.0;

        for (double grade : Grades) {
            gradesSum += grade;
        }
        average = gradesSum/Grades.size();

        System.out.println(average);

    }
}
