class Student {
    String name;
    int tamilMarks;
    int englishMarks;
    int scienceMarks;
    int mathsMarks;
    int computerScienceMarks;
// constructor
    Student(String name, int tamilMarks, int englishMarks, int scienceMarks, int mathsMarks, int computerScienceMarks) {
        this.name = name;
        this.tamilMarks = tamilMarks;
        this.englishMarks = englishMarks;
        this.scienceMarks = scienceMarks;
        this.mathsMarks = mathsMarks;
        this.computerScienceMarks = computerScienceMarks;
    }
    // Method to calculate average marks
    int getAverageMarks() {
        return (tamilMarks + englishMarks + scienceMarks + mathsMarks + computerScienceMarks);
    }
    // Method Functions
    String getGrade() {
        int averageMarks = getAverageMarks();
        if (averageMarks >= 90) {
            return "A";
        } else if (averageMarks >= 80) {
            return "B";
        } else if (averageMarks >= 70) {
            return "c";
        } else if (averageMarks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    String getPassFail() {
        return (getAverageMarks() >= 50) ? "Pass" : "Fail";
    }

    public static void main(String[] args) {
        Student student = new Student("Balaji", 80, 85, 0, 70, 90);
        String pattern = "*********************************";
        System.out.println(pattern);
        System.out.println("* Student Name\t\t: " + student.name);
        System.out.println("* Tamil Marks\t\t: " + student.tamilMarks);
        System.out.println("* English Marks\t\t: " + student.englishMarks);
        System.out.println("* Science Marks\t\t: " + student.scienceMarks);
        System.out.println("* Maths Marks\t\t: " + student.mathsMarks);
        System.out.println("* Computerscience Marks\t: " + student.computerScienceMarks);
        System.out.println("* Average Marks\t\t: " + student.getAverageMarks());
        System.out.println("* Grade\t\t\t: " + student.getGrade());
        System.out.println("* Status\t\t: " + student.getPassFail());  
        System.out.println(pattern);
    }
    
}