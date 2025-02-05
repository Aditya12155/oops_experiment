class superclass{
    private int var=2;
    public int getvar(){
        return var;
    }
}

class subclass extends superclass{
    public void display(){
        // System.out.println("Private number: " + var);
        System.out.println("Cannot acces the private var directly");
    }
}

class experiment5_1 {
    public static void main(String args[]){
        subclass obj = new subclass();
        obj.display();
        System.out.println("Accessing private var via method: " + obj.getvar());
    }
}
