package love.programming;

public class Car {
    public String carType;
    private String carColour;
    private String gearType;

    public Car(){
        this("defaultType","defaultColour","defaultGearType");

    }

    public Car(String carType){
        carType = carType;
        System.out.println(carType);
    }

    public Car(String carType, String carColour){
//        this();
        this.carType = carType;
        this.carColour = carColour;
    }

    public Car(String type, String carColour, String gearType){
        this.carType = type;
        this.carColour = carColour;
        this.gearType = gearType;
    }

//    public Car() {
//
//    }

    //    public car(){}
//    public void Car(){}

    public void printCarType(){
        System.out.println("This car type and colour is " + carType + " ,"+carColour);
    }

    public void printCarColour(){
        System.out.println("This car type and colour is " +carType + " ,"  +carColour );
    }

    public void printGearType(){
        System.out.println("This car type,colour and gear type is " +carType +" ," +carColour+" ,"+ gearType );

    }



}
