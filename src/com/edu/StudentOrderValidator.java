package com.edu;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    private static void checkAll() {
        StudentOrder so = readStudentOrder();

        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding  wedAnswer = checkWedding(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);

        sendMail(so);
    }

    private static void sendMail(StudentOrder so) {

    }

    static StudentOrder readStudentOrder() {
        return new StudentOrder();
    }

    private static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("checkCityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
    private static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("checkWedding is running");
        return new AnswerWedding();
    }

    private static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("checkChildren is running");
        return new AnswerChildren();
    }
    private static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("checkStudent is running");
        return new AnswerStudent();

    }

}
