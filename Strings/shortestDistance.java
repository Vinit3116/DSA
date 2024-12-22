package Strings;

public class shortestDistance {

    static float shortDistance(String str){
        int x=0;int y=0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);

            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int X1 = x*x;
        int Y1 = y*y;

        return (float) Math.sqrt(X1+Y1);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortDistance(str));
    }
}
