public class DistanceOfPoints {
    public static void main(String[]args){


        double x1,x2,y1,y2,diff,distance;

        x1 = Double.parseDouble(args[0]); 
        y1 = Double.parseDouble(args[1]);
        x2 = Double.parseDouble(args[2]);
        y2 = Double.parseDouble(args[3]);

        diff = Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
        distance = Math.sqrt(diff);
        System.out.println("Distance is: "+distance);

    }
}