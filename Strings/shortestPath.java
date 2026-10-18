public class shortestPath {
    public static float getShotestPath(String str){
        int x = 0; int y =0;
        for(int i =0; i<str.length(); i++){
            char direction = str.charAt(i);
            //south
            if(direction == 'S'){
                y--;
            }else if(direction == 'N'){
                y++;
            }else if(direction == 'W'){
                x--;
            }else{
                x++;
            }
        }
        int x2 = x*x;
        int y2= y*y;
       return(float) Math.sqrt(x2 + y2) ;
    }
    public static void main(String[] args) {
        String str = "NS";
        System.out.print(getShotestPath(str));
    }
}
