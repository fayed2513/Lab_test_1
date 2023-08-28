public class Robot {
    Point point = new Point(0,0,"W");
    private String direction;
    public Robot(){
        direction = "S";
    }
    public void turnLeft(){
        if(direction == "S"){
            direction = "W";
        }if(direction == "W"){
            direction = "N";
        }if(direction == "N"){
            direction = "E";
        }if(direction == "E") {
            direction = "S";
        }
    }
    public void turnRight(){
        if(direction == "S"){
            direction = "E";
        }if(direction == "E"){
            direction = "N";
        }if(direction == "N"){
            direction = "W";
        }if(direction == "W") {
            direction = "S";
        }
    }
    public void move(){
        if(direction == "S")
            point.y--;
        if(direction == "W")
            point.x++;
        if(direction == "N"){
            point.y++;
        }
        if(direction == "E")
            point.x--;
    }
    public String getDirection(){
        return direction;
    }
    public Point getLocation(){
        System.out.println("x = " + point.x);
        System.out.println("y = " + point.y);
        return null;
    }
}
