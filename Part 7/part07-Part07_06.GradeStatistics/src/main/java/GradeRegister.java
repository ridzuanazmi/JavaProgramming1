
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class GradeRegister {

    private List<Integer> points;
    private int[] gradeDistribution;

    public GradeRegister() {
        this.points = new ArrayList<>();
        this.gradeDistribution = new int[6];
        System.out.println(Arrays.toString(this.gradeDistribution));
    }

    public void addGradeBasedOnPoints(int points) {
        if (points >= 0 && points <= 100) {
            this.points.add(points);
            int grade = convertPointsToGrade(points);
            this.gradeDistribution[grade]++;
        }
    }

    public static int convertPointsToGrade(int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else {
            return 5;
        }
    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        return 1.0 * sum / this.points.size();
    }

    public double averageOfPassingPoints() {
        int sum = 0;
        int count = 0;
        for (int point : this.points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }

        if (count == 0) {
            return -1;
        }

        return 1.0 * sum / count;
    }

    public double passPercentage() {
        int passingCount = 0;
        for (int point : this.points) {
            if (point >= 50) {
                passingCount++;
            }
        }
        return 100.0 * passingCount / this.points.size();
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeDistribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(this.gradeDistribution));
    }
}
