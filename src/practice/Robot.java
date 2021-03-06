
package practice;


public class Robot {
    private int x ;
    private int y ;
    
    private int endx;
    private int endy;
    private String path;
    
    public Robot(int x, int y, String path){
        this.x = x;
        this.y = y;
        this.path = path;
    }
    public void getEnd(int x, int y){
        for(int i = 0; i < path.length(); i++){
            char c = path.charAt(i);
            if(c == 'E'){
                y++;
            }
            if(c == 'K'){
                x++;
            }
            if(c == 'D'){
                y--;
            }
            if(c == 'N'){
                x--;
            }
        
        }
        this.endx = x;
        this.endy = y;
        System.out.println("(" + x + ", " + y + ")" );
    }
    public double getDistance(int x, int y){
        return Math.sqrt(Math.pow(endx - x, 2) + Math.pow(endy - y, 2));
    }
    public boolean includes(int size){
        int bound = (size - 1) / 2;
        return Math.abs(endx)  <= bound && Math.abs(endy)  <= bound;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getPath() {
        return path;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Robot{" + "x=" + x + ", y=" + y + ", path=" + path + '}';
    }

    public int getEndx() {
        return endx;
    }

    public int getEndy() {
        return endy;
    }
    
}
