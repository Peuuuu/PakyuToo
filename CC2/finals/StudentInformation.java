import java.util.Arrays;
public class StudentInformation {
    public static void main(String[] args) {
        // way 1
        String firstName[] = new String[6];
        firstName[0] = "Maria";
        firstName[1] = "Antonio";
        firstName[2] = "Juan";
        firstName[3] = "Pedro";
        firstName[4] = "Jim";
        firstName[5] = "Clara";
        char middleInitial[] = new char[6];
        middleInitial[0] = 'C';
        middleInitial[1] = 'B';
        middleInitial[2] = 'E';
        middleInitial[3] = 'F';
        middleInitial[4] = 'H';
        middleInitial[5] = 'M';
        String lastName[] = new String[6];
        lastName[0] = "Dela Cruz";
        lastName[1] = "San Juan";
        lastName[2] = "Guzman";
        lastName[3] = "Rizal";
        lastName[4] = "Cunanan";
        lastName[5] = "Seguin";
        int age[] = new int[6];
        age[0] = 19;
        age[1] = 20;
        age[2] = 21;
        age[3] = 22;
        age[4] = 23;
        age[5] = 24;
        int studentNo[] = new int[6];
        studentNo[0] = 20183015;
        studentNo[1] = 20195171;
        studentNo[2] = 20201538;
        studentNo[3] = 20217185;
        studentNo[4] = 20223157;
        studentNo[5] = 20235001;
        boolean isEnrolled[] = new boolean[6];
        isEnrolled[0] = true;
        isEnrolled[1] = false;
        isEnrolled[2] = true;
        isEnrolled[3] = false;
        isEnrolled[4] = true;
        isEnrolled[5] = false;
        // way 2
        String firstName2[] = {"Maria","Antonio","Juan","Pedro","Jim","Clara"};
        char middleInitial2[] = {'C','B','E','F','H','M'};
        String lastName2[] = {"Dela Cruz","San Juan","Guzman","Rizal","Cunanan","Seguin"};
        int age2[] = {19,20,21,22,23,24};
        int studentNo2[] = {20183015,20195171,20201538,20217185,20223157,20235001};
        boolean isEnrolled2[] = {true,false,true,false,true,false};
       
        // activity 3.1
        
        for (int i = 0; i < 6; i++) {
            System.out.println("-----------------------");
            System.out.println("| Student Information |");
            System.out.println("-----------------------");
            System.out.println("Fullname      : " + firstName[i] + " " + middleInitial[i] + ". " + lastName[i]);
            System.out.println("Age           : " + age[i]);
            System.out.println("Student Number: " + studentNo[i]);
            System.out.println("Is Enrolled?    " + isEnrolled[i]);
            System.out.println("================================");
        }
        
        // activity 3.2
        String nname[][] = {{"name1"},
                            {"name"}};
        System.out.println(Arrays.deepToString(nname));
        System.out.println("-----------------------");
        System.out.println("| Student Information |");
        System.out.println("-----------------------");
        System.out.println("firstName      = " + Arrays.toString(firstName));
        System.out.println("middleInitial  = " + Arrays.toString(middleInitial));
        System.out.println("lastName       = " + Arrays.toString(lastName));
        System.out.println("Age            = " + Arrays.toString(age));
        System.out.println("Student Number = " + Arrays.toString(studentNo));
        System.out.println("Is Enrolled    = " + Arrays.toString(isEnrolled));
        System.out.println("================================");
        }
        
    }
