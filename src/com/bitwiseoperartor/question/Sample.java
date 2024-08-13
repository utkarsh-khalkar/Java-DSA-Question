package com.bitwiseoperartor.question;





class Father {

    public void car() {

        System.out.println("Father's Car");

    }

}



class Son extends Father {

    public void car() {

        System.out.println("Son's Car");

    }

}



public class Sample {

    public static void main(String[] args) {

        Son john = new Son();

        john.car();

    }



}