package javaapplication5;

/**
 * @(#)Database.java
 *
 *
 * @author
 * @version 1.00 2012/4/3
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Database{
    static Scanner scan;
    static String saver2="";
	private StudentRegistration [] studentRegistration;

    public Database() {
    }
    public void addStudentRegistration(StudentRegistration sr){
    	   studentRegistration[JavaApplication5.counter]=sr;
    }
    public void deleteStudentRegistration(String studentId){
    	int i=1;
        
        String output="";
        
        JavaApplication5 x5=new JavaApplication5();
            try{
            scan=new Scanner(x5.saver);
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            StringTokenizer str;
            while(scan.hasNext()){
                output=scan.nextLine();
                str=new StringTokenizer(output);
                while(str.hasMoreTokens()){
                i++;
                if(str.nextToken().equals(studentId))
                    {
                    i=0;
                    break;
                    }
                }
                if(i==0){
                    break;
                }
                else{
                    //System.out.println(output);
                    saver2=saver2+output+"\n";
                    //System.out.println(saver2);
                }
            }
        if(i==0){
            while(scan.hasNext()){
                saver2=saver2+scan.nextLine()+"\n";
            }
            JOptionPane.showMessageDialog(null, output+"\nhas been deleted.");
        }   
        else
    	{
            JOptionPane.showMessageDialog(null,"Not Found.");
 	}
    }
    public void searchStudentRegistration(String studentId){
	int i=1;
        String output="";
        JavaApplication5 x5=new JavaApplication5();

            scan=new Scanner(x5.saver);
            StringTokenizer str;
            while(scan.hasNext()){
                output=scan.nextLine();
                str=new StringTokenizer(output);
                while(str.hasMoreTokens()){
                i++;
                if(str.nextToken().equals(studentId))
                    {
                    i=0;
                    break;
                    }
                }
                if(i==0){
                    break;
                }
            }
        if(i==0){
            JOptionPane.showMessageDialog(null, output);
        }
        else
    	{
            JOptionPane.showMessageDialog(null,"Not Found.");
 	}

    }


	public void setStudentRegistration(StudentRegistration [] sr){
		this.studentRegistration=sr;
	}

	public StudentRegistration[] getStudentRegistration(){
		return studentRegistration;
	}
}        