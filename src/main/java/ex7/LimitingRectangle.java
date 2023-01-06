package ex7;

public class LimitingRectangle {
    private int[][] points;
    private  int minX, maxX, minY, maxY;


    public LimitingRectangle(int[][] points) {
        this.points = points;
        evaluateBorders();
    }

    public int getWidth(){
        return maxX - minX;
    }

    public int getHeight(){
        return maxY - minY;
    }

    private void evaluateBorders(){
        minX = points[0][0];
        maxX = points[0][0];
        minY = points[0][1];
        maxY = points[0][1];
        for(int i = 0; i < points.length; i++){
            if(minX > points[i][0]) minX = points[i][0];
            if(maxX < points[i][0]) maxX = points[i][0];
            if(minY > points[i][1]) minY = points[i][1];
            if(maxY < points[i][1]) maxY = points[i][1];

        }
    }

    public String getBorders(){
        return String.format("%d, %d, %d, %d", minY, maxY, minX, maxX);
    }
}
