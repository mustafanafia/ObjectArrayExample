//********************************************************************
//  File IO Example
//
//  Used to demonstrate an array of Objects
//
//  This program provides several examples and should not be taken
//  as the ideal way of completing all of these tasks in one program.
//  Each section is a different example.
//********************************************************************

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class StudentArray
{

	public static void main (String[] args) throws IOException
	{
   	String fileRecord = "";				// String for holding a record (line from the file)

   	Scanner fileScan, lineScan;			// Scanner objects used to read from the file -- there are 2
   										// filescan is an object that represents the input file
   										// linescan is an object that holds and represents one record (line) from the file

   	int count = 0;						// count will hold the number of records in the array

   	Student studentArray [] = new Student [50];

	String firstName = "", lastName = "", studentID = "", major = "";
	double gpa = 0.0;

	//--------------EXAMPLE 1: READING FROM A FILE AND STORING IN AN OBJECT ARRAY----------------------


   	//-------------------------------------------------------------------------------------------------
   	//  Creation of File object and connect it to the Scanner object named fileScan
   	//  This allows data to be read from a file named StudentExample.txt
   	//-------------------------------------------------------------------------------------------------

   	fileScan = new Scanner (new File("StudentExample.txt"));

   	//-------------------------------------------------------------------------------------------------
   	//  The while loop reads lines from the text file and stores the student data into an array of
   	//  Student objects (instantiated from the Student class).
   	//  The loop is processed as long is there is additional data in the file
   	//  The method hasNext() does not read data from the file.  It simply checks to see if there is
   	//  data.  If there is data, it returns true.  If there is not data, it returns false.
   	//-------------------------------------------------------------------------------------------------

   		while (fileScan.hasNext())
   		{
   			//-----------------------------------------------------------------------------------------
   			//  Because the nextLine( ) method was used, this will read a entire line from the file
   			//  and saved it in a string variable named fileRecord.
   			//  The fileRecord string will contain ALL data about one student from the file
   			//-----------------------------------------------------------------------------------------

   			fileRecord = fileScan.nextLine();

   			//-----------------------------------------------------------------------------------------
   			//  A SECOND scanner object is used to read individual items from the line read and stored
   			//  fileRecord.  The comma is used as the delimiter since that is how the file is structured.
   			//  Notice you can use any of the methods we have used from the Scanner class to read from
   			//  the keyboard:  next(), nextInt(), nextFloat(), etc.
   			//  Each piece of date is stored in a variable and then the collection is used to instantiate
   			//  a Student object.  The Student objects are stored in the array.
   			//-----------------------------------------------------------------------------------------

   			lineScan = new Scanner(fileRecord);
   			lineScan.useDelimiter(",");

   		    studentID = lineScan.next();
   		    firstName = lineScan.next();
   		    lastName = lineScan.next();
   		    major = lineScan.next();
   		    gpa = lineScan.nextDouble();

			studentArray[count] = new Student(studentID, lastName, firstName, major, gpa);
   			count++;

   		}

  	//------------------------------------------------------------------------------
  	//	EXAMPLE 2:  ACCESSING DATA IN AN OBJECT ARRAY USING ACCESSORS FROM THE CLASS
  	//------------------------------------------------------------------------------

   	//-----------------------------------------------------
   	//  This example must displays names from the array objects.
   	//-----------------------------------------------------

   	System.out.println("Example: Accessing Student Names and Displaying Them\n");

   	for (int i = 0; i < count; i++)
   	{
		// Display select data from the array

		lastName = studentArray[i].getLastName();			// Using an accessor from the Student class
		firstName = studentArray[i].getFirstName();			// Using an accessor from the Student class

		System.out.println(firstName + " " + lastName);

	}

  	//------------------------------------------------------------------------------
  	//	EXAMPLE 3:  ACCESSING DATA IN AN OBJECT ARRAY USING ACCESSORS FROM THE CLASS
  	//------------------------------------------------------------------------------

   	//-----------------------------------------------------
   	//  This example calculates an overall average of the GPAs
   	//-----------------------------------------------------

   	System.out.println("\nExample: Calculating Average Student GPA\n");
	int sum = 0;
	double average = 0.0;
	DecimalFormat fmt = new DecimalFormat ("##0.00");

	for (int i = 0; i < count; i++)
	{ 	sum += studentArray[i].getGPA();	}

	average = sum/count;

    System.out.println("The average GPA of the students is: " + average + "\n\n");

   }	  //  End of main method
}         //  End of class
