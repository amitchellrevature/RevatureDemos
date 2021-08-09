package com.alec.day6;


// in proper Dependncy manageemnt
//class Engine{
//    public Engine(String type){
//
//    }
//}
//
//class Tyre{
//    public Tyre(String type){
//
//    }
//}
//
//class Car{
//    Engine engine;
//    Tyre tyre;
//
//    public  Car(){
//        this.engine = new Engine();
//        this.tyre = new Tyre();
//    }
//}

class Engine{

}

class Tyre{

}

class CarFactory2{
    public  static void getInstance(int id){
        switch (id){
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("");
                break;
        }
    }
}

class Car{
    Engine engine;
    Tyre tyre;

    public Car(Engine engine, Tyre tyre){
        this.engine = engine;
        this.tyre = tyre;
    }
}





public class Demo7 {
    public static void main(String[] args) {

    }
}
