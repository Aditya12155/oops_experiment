class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
    Student(){
        name = "default";
        age = 18;
    }
    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

}

class experiment4_1{
    public static void main(String[] args) {
        
        Student s1 = new Student("Aditya" ,  19);
        s1.printinfo();
        Student s2 = new Student();
        s2.printinfo();
    }
}