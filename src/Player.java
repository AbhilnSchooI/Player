public class Player {

    // Attributes..
    private int numPlayers;
    private int x;
    private int y;
    private int z;
    private int direction;
    private int hp;
    private String name;


    // constructors
    public Player(){
        x = 0;
        y = 0;
        z = 0;
        direction = 1;
        hp = 20;
        numPlayers++;
        name = ("P" + numPlayers);
    }

    public Player(String name, int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        hp = 20;
        direction = 1;
        numPlayers++;
        this.name = name;
    }

    public Player(String name, int x, int y, int z, int hp, int direction){
        this.x = x;
        this.y = y;
        this.z = z;
        this.hp = hp;
        this.direction = direction;
        numPlayers++;
        this.name = name;
    }


    // accessors
    public int getNumPlayers(){
        return numPlayers;
    }

    public String getName(){
        return name;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }

    public int getHp(){
        return hp;
    }

    public int getDirection(){
        return direction;
    }

    // ToString
    public String toString(){
        String info = ("Name: " + name + "\nHealth: " + hp + "\nCordinates: X " + x + " Y " + y + " Z " + z + "\nDirection: " + direction);
        return  info;
    }

    //Mutators

    public void setHp(int hp){
        if(hp >= 0 && hp <= 100){
            this.hp = hp;
        }

    }

    public void setDirection(int direction){
        this.direction = direction;
    }

    public void move(int direction, int units){
        if (direction > 0 || direction <= 6) {
            this.direction = direction;
            if (direction == 1) {
                this.x += units;
            } else if (direction == 2) {
                this.x -= units;
            } else if (direction == 3) {
                this.y += units;
            } else if (direction == 4) {
                this.y -= units;
            } else if (direction == 5) {
                this.z += units;
            } else if (direction == 6) {
                this.z -= units;
            }
        }
    }

    public void teleport(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void attack(Player player, int damage) {
        this.hp += (damage/2);
        player.setHp(player.getHp() - damage);
    }
    //other methods
    public double getDistance(int x, int y, int z) {
        double xDistance = x - getX();
        double yDistance = y - getY();
        double zDistance = z - getZ();
        double distance = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2) + Math.pow(zDistance, 2));
        return distance;
    }

    public double getDistance(Player Player) {
        double xDistance = Player.getX() - getX();
        double yDistance = Player.getX() - getY();
        double zDistance = Player.getX() - getZ();
        double distance = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2) + Math.pow(zDistance, 2));
        return distance;
    }
}
