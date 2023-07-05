package com.bootcoding.oops.CouplingEx2;

public class StudentHasResult {
 public static void main(String[] args) {
   Result result=new Result();
   result.Type="Semister";
   result.totalMarks=300.00;
   result.obtained_marks=240.00;
   result.percentage= result.percentage;
   result.pass_fail="Pass";

   Student student=new Student();
   student.name="Rahul";
   student.ID="Kf20CS036";
   student.rollNo=40;
   student.Standard=4;
   student.DoB="14-6-2016";
   student.contact=7498771237l;
   student.result=result;


  System.out.println("Studnet name : "+student.name);
  System.out.println("Student Id : "+student.ID);
  System.out.println("Student Roll-no. : "+student.rollNo);
  System.out.println("Student Standard : "+student.Standard);
  System.out.println("Studnet DOB : "+student.DoB);
  System.out.println("Student contact : "+student.contact);
  System.out.println("Result Type : "+student.result.Type);
  System.out.println("tital Marks : "+student.result.totalMarks);
  System.out.println("Obtained Marks : "+student.result.obtained_marks);

  System.out.println("Result : "+student.result.pass_fail);

 }

}
