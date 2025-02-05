class vehicle{
    String brand;
    String model;
    int price;
    public vehicle(String brand , String model , int price){
        this.price = price;
        this.brand = brand;
        this.model = model;   
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price in ruppee : " + price);
    }
}

class Car extends vehicle{
    int seatingcapacity;
    String fueltype;
    
        public Car(String brand , String model , int price , int seatingcapacity , String fueltype){
            super(brand , model , price);
            this.seatingcapacity=seatingcapacity;
            this.fueltype=fueltype;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingcapacity + ", Fuel Type: " + fueltype);
    }
}

class Electriccar extends Car{
    int batteryCapacity;
    double ChargingTime;
    public Electriccar(String brand , String model , int price , int seatingcapacity , String fueltype , int batteryCapacity, double ChargingTime){
            super(brand,model,price,seatingcapacity,fueltype);
            this.batteryCapacity= batteryCapacity;
            this.ChargingTime=ChargingTime;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Battery capacity :" + batteryCapacity + "A  Charging Time  : " + ChargingTime);
    }
}

class Motorcycle extends vehicle{
    int engineCapacity;
    String type;
    public Motorcycle(String brand , String model , int price , int engineCapacity , String type){
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }
}
class experiment5_3 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2500000 ,5,"petrol");
        car.displayDetails();
        Electriccar eCar = new Electriccar("Tesla", "Model 3", 45000, 5, "Electric", 75, 8.5);
        eCar.displayDetails();
    }
}
