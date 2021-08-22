public class demo1 {
    public int circle(int height,int weight){
        if(height>20){
            return height*weight;
        }else if (height<=20&&height>10){
            height*=1.2;
            return height*weight;
        }else if (height>=0&&height<10){
            height*=1.4;
            return height*weight;
        }
        else {
            return Math.abs(height)*weight;
        }
    }
    public int circle2(int height,int weight){
        if(height>20){
            return height*weight;
        }else if (height<=20&&height>10){
            height*=1.2;
            return height*weight;
        }else if (height>=0&&height<10){
            height*=1.4;
            return height*weight;
        }
        else {
            return Math.abs(height)*weight;
        }
    }
}
