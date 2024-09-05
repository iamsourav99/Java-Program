package mypackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static int m;
	static boolean play = false;
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	
			
				System.out.println("Enter number of subject");
				int totalSubject = scn.nextInt();
				int marks[] = new int[totalSubject];

				System.out.println("Enter details for Student ");
				System.out.print("Name:");
				String name = scn.next();
				System.out.println("Roll-No:");
				int rollNo = scn.nextInt();
				System.out.println("Full Marks=100");
				inputBasicDetails();
				input(marks);
				
				Student st = new Student(name, rollNo, marks);
				st.setTotalMarks(totalMarks(st.getMarks()));
				st.setAveragePercentage(averagePercentage(st.getTotalMarks(), totalSubject));
				st.setGrade(gradeCalculate(st.getAveragePercentage()));
				System.out.println("**********Result***********");
				System.out.println("Name: " + st.getName());
				System.out.println("Roll-No: " + st.getRollNo());
				System.out.println(st);

		}
		
	

	private static void inputBasicDetails() {
		// TODO Auto-generated method stub
		
	}



	private static void input(int marks[]) {
	    for (m = 0; m < marks.length; m++) {
	        boolean validInput = false;
	        while (!validInput) {
	            try {
	                System.out.println("Enter marks for Subject " + (m + 1) + ":");
	                int obtainMarks = scn.nextInt();
	                if (obtainMarks > 100 || obtainMarks < 0) {
	                    throw new IllegalArgumentException("Marks should be in the range of 0 to 100");
	                } else {
	                    marks[m] = obtainMarks;
	                    validInput = true;
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Please provide valid input");
	                scn.next();
	            } catch (IllegalArgumentException e) {
	                System.out.println(e.getMessage());
	            } catch (Exception e) {
	                System.out.println("An error occurred: " + e.getMessage());
	            }
	        }
	    }
	    play = true;
	}



//method grade calculator
	private static String gradeCalculate(double avg) {
		String grade;
		if (avg >= 90) {
			grade = "A+";
		} else if (avg >= 80) {
			grade = "A";
		} else if (avg >= 70) {
			grade = "B";
		} else if (avg >= 60) {
			grade = "C";
		} else if (avg >= 50) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;

	}

//method average percentage
	private static double averagePercentage(int totalMarksObtain, int totalSubject) {
		return (totalMarksObtain / totalSubject);
	}

//method total marks
	private static int totalMarks(int[] marks) {

		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		return sum;
	}

}
