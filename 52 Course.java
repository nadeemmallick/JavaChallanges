class Course {
    static int maxCapacity = 60;
    String courseName;
    int enrollment;

    String[] enrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollment = 0;
        this.enrolledStudents =new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrolledStudent(String studentName) {
        if (enrollment < maxCapacity) {
            enrolledStudents[enrollment] = studentName;
            enrollment++;
        } else {
            System.out.println("Course is full!");
        }

    }

    void unenrolledStudent() {
        for (int i = 0; i < enrollment; i++) {
            if (enrolledStudents[i].equals("Ali")) {
                // Shift students left
                for (int j = i; j < enrollment - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[enrollment - 1] = null;
                enrollment--;
                System.out.println("Ali" + " removed successfully.");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    void displayStudents() {
        System.out.println("Students in " + courseName + ":");
        for (int i = 0; i < enrollment; i++) {
            System.out.println("- " + enrolledStudents[i]);
        }
    }
    public static void main(String[] args) {
        Course course = new Course("Java Programming");

        // Enroll students
        course.enrolledStudent("Nadeem");
        course.enrolledStudent("Ali");
        course.enrolledStudent("Rahul");

        // Display students
        course.displayStudents();

        // Remove a student
        course.unenrolledStudent();

        // Display again
        course.displayStudents();


    }

    }




