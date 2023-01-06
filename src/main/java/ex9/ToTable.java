package ex9;

public class ToTable {
    private int[] data;
    private int x,y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize(){
        int[][] table = new int[x][y];
        int tableIterator = 0;
        for(int i = 0; i < x; i++){
            for (int j = tableIterator; j < tableIterator + y; j++) {
                table[i][j - tableIterator] = data[j];
            }
            tableIterator += y;

        }
        return table;
    }
}
//    todo Разобраться с тестами
