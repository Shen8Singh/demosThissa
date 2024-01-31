package src.Main;

import java.util.*;

import src.Student.Demos;

class Main{

    public static void main(String[] args){

        
        System.out.println("Login Page");

        System.out.println("Enter your username : ");    
        String uName = new Scanner(System.in).nextLine();

        System.out.println("Enter your Password : ");    
        String uPass = new Scanner(System.in).nextLine();

        Demos Cat = new Demos(){

            @Override
            public void play() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'play'");
            }

            @Override
            public void walk() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'walk'");
            }

            @Override
            public void sleep() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'sleep'");
            }                
        };
    }
}