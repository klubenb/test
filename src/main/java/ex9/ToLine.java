package ex9;

public class ToLine {
    private int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize(){
        int[] line = new int[data.length*2];
        int lineIterator = 0;
        for(int i = 0; i <data.length; i++){
            line[lineIterator] = data[i][0];
            lineIterator++;
            line[lineIterator] = data[i][1];
            lineIterator++;
        }
        return line;
    }
}
