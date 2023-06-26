import java.util.Scanner;

class Student {
    private int academicScore;

    public Student(int academicScore) {
        this.academicScore = academicScore;
    }

    public int getAcademicScore() {
        return academicScore;
    }
}

class Sports {
    private int sportsScore;

    public Sports(int sportsScore) {
        this.sportsScore = sportsScore;
    }

    public int getSportsScore() {
        return sportsScore;
    }
}

class Result extends Student {
    private Sports sports;

    public Result(int academicScore, int sportsScore) {
        super(academicScore);
        this.sports = new Sports(sportsScore);
    }

    public void displayScores() {
        int academicScore = getAcademicScore();
        int sportsScore = sports.getSportsScore();

        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
    }
}

class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the academic score: ");
        int academicScore = scanner.nextInt();

        System.out.print("Enter the sports score: ");
        int sportsScore = scanner.nextInt();

        Result result = new Result(academicScore, sportsScore);
        result.displayScores();

        scanner.close();
    }
}

