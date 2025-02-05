class Player{
    String name;
    int age;
    String position;
    public Player(String name , int age , String position){
        this.name = name;
        this.age = age;
        this.position = position;
    }
    public void play(){
        System.out.println("The player name is " + name +" who is " + age + " years old");
    }
    public void train(){
        System.out.println("The position "+ name +" is training for is :" + position);
    }
}

class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

    public void play() {
        System.out.println(name + " is batting/bowling as a " + position);
    }
}

class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    public void play() {
        System.out.println(name + " is playing football as a " + position);
    }
}

class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }

    public void play() {
        System.out.println(name + " is playing hockey as a " + position);
    }
}



class experiment5_2 {
    public static void main(String[] args) {
        Player player = new Player("John", 25, "Goalkeeper");
        player.play();
        player.train();

        Football_Player player1 = new Football_Player("Aditya", 19, "Mid fielder");
        player1.play();
        player1.train();
    }
}
