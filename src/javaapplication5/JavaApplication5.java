
package javaapplication5;
import javaapplication5.Course;
import javaapplication5.Student;
import javaapplication5.StudentRegistration;
import javaapplication5.University;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author TAWSIF
 */
public class JavaApplication5 implements ActionListener, KeyListener, MouseListener{
	static Scanner s;
	static String saver="";
	static int nos=50;

    StudentRegistration [] sr=new StudentRegistration[nos];
    Database database = new Database();


    static int counter=0;
	ImageIcon icon=new ImageIcon("title.png");
	JLabel jbt=new JLabel(icon);
	JFrame jfr=new JFrame();
	JLabel j1=new JLabel("Name: ", JLabel.CENTER);
	JTextField j2=new JTextField("");
	JLabel j3=new JLabel("ID: ", JLabel.CENTER);
	JTextField j4=new JTextField("");
	JLabel j5=new JLabel("University: ", JLabel.CENTER);
	JComboBox j6=new JComboBox(new String[]{"", "BUET", "NSU", "BRAC", "AIUB", "IUT"});
	JLabel j7=new JLabel("Course 1: ", JLabel.CENTER);
	JComboBox j8=new JComboBox(new String[]{"", "CSE115", "CSE135", "CSE225"});
	JLabel j9=new JLabel("Course 2: ", JLabel.CENTER);
	JComboBox j10=new JComboBox(new String[]{"", "MAT120", "MAT130", "MAT140"});
	JLabel j11=new JLabel("Course 3: ", JLabel.CENTER);
	JComboBox j12=new JComboBox(new String[]{"", "ENG102", "ENG103", "ENG105"});
	JButton j13=new JButton("Add this Student");
	JButton j14=new JButton("Search");
	JButton j15=new JButton("Delete Student");
        JButton j16=new JButton("Exit");
    
    Student student;
    Course [] course;
    University university;


    static File f=new File("Info.doc");
    static PrintWriter pw;

    public static void main(String[] args) {
    	if(f.exists()){
            	try{
            		s=new Scanner(f);
            		while(s.hasNext()){
            			saver=saver+s.nextLine()+"\n";
            		}
            	}
            	catch(Exception ecp){
            		ecp.printStackTrace();
            	}
            }
        JavaApplication5 x1=new JavaApplication5();
		x1.Input();

        // TODO code application logic here
    }

    public void Input(){
        j6.addActionListener(this);
        j2.addMouseListener(this);
        j4.addMouseListener(this);
        j13.addActionListener(this);
        j14.addActionListener(this);
        j15.addActionListener(this);
        j16.addActionListener(this);
        jfr.setSize(640,450);
        JLabel empty=new JLabel(" ");
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gl=new GridLayout(8,1, 30, 30);
        jfr.getContentPane().setLayout(gl);
        jfr.getContentPane().add(jbt);
        JPanel jp1=new JPanel(new GridLayout(1,2));
        JPanel jp2=new JPanel(new GridLayout(1,2));
        JPanel jp3=new JPanel(new GridLayout(1,2));
        JPanel jp4=new JPanel(new GridLayout(1,2));
        JPanel jp5=new JPanel(new GridLayout(1,2));
        JPanel jp6=new JPanel(new GridLayout(1,2));
        JPanel jp7=new JPanel(new GridLayout(1,4));
        jp1.add(j1);
        jp1.add(j2);
        jp2.add(j3);
        jp2.add(j4);
        jp3.add(j5);
        jp3.add(j6);
        jp4.add(j7);
        jp4.add(j8);
        jp5.add(j9);
        jp5.add(j10);
        jp6.add(j11);
        jp6.add(j12);
        jp7.add(j13);
        jp7.add(j14);
        jp7.add(j15);
        jp7.add(j16);
        jfr.setResizable(false);
        jfr.getContentPane().add(jp1);
        jfr.getContentPane().add(jp2);
        jfr.getContentPane().add(jp3);
        jfr.getContentPane().add(jp4);
        jfr.getContentPane().add(jp5);
        jfr.getContentPane().add(jp6);
        jfr.getContentPane().add(jp7);
        jfr.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==j13){
            JavaApplication5 x2=new JavaApplication5();
            university=new University(j6.getSelectedItem().toString());
            student = new Student(j4.getText(),j2.getText(),university);
            Course [] course=new Course[3];
            course[0]=new Course(j8.getSelectedItem().toString(), university);
            course[1]=new Course(j10.getSelectedItem().toString(), university);
            course[2]=new Course(j12.getSelectedItem().toString(), university);

            sr[counter]=new StudentRegistration(student, course, university);
            saver = saver +"ID: "+student.getStudentId()+" "+sr[counter].getStudentRegistrationInfo()+". \n";
            counter++;
            jfr.dispose();
            if(counter>=nos)
            {
            }
            else{
            	x2.Input();
            }
        }
        else if(e.getSource()==j14){

            database.searchStudentRegistration(JOptionPane.showInputDialog("Enter the ID of the Student"));
        }

        else if(e.getSource()==j16){
            if(f.exists()){
              try{
		pw=new PrintWriter(f);
		s=new Scanner(f);
                  }
                   catch(Exception f){
		f.printStackTrace();
                  }
                 }
		else{
                    try{
		       f.createNewFile();
		       pw=new PrintWriter(f);
		      	s=new Scanner(f);
		       }
	        catch(Exception f){
	       	f.printStackTrace();
	     }
	}
            pw.print(saver+" ");
            pw.close();
            jfr.dispose();
        }
        else if(e.getSource()==j15){
            database.deleteStudentRegistration(JOptionPane.showInputDialog("Enter the ID of the Student you want to delete"));
            saver=database.saver2;
            //gotta finish writing this
        }
    }

    public void keyTyped(KeyEvent e) {

    }


    public void keyPressed(KeyEvent e) {

    }


    public void keyReleased(KeyEvent e) {

    }


    public void mouseClicked(MouseEvent e) {

    }


    public void mousePressed(MouseEvent e) {

    }


    public void mouseReleased(MouseEvent e) {

    }


    public void mouseEntered(MouseEvent e) {

    }


    public void mouseExited(MouseEvent e) {

    }
}
