
public class Bins {

    private int[][] bin;

    public Bins(int start, int end){
        int size = end - start+1;
        this.bin = new int[2][size];
        for(int i = 0; i < bin[0].length; i++){
            bin[0][i] = start;
            bin[1][i] = 0;
            start++;
        }
    }

    public int getBin(int check){
        for(int i = 0; i < bin[0].length; i++){
            if(bin[0][i] == check){
                return bin[1][i];
            }
        }
        return 0;
    }

    public void incrementBin(int check){
        for(int i = 0; i < bin[0].length; i++){
            if(bin[0][i] == check){
                bin[1][i]++; // bin[1][i] = bin[1][i] + 1;
            }
        }
    }





//    public static void main(String[] args) {
//        Bins test = new Bins(2,12);
//    }

//    0[i]{2,3,4,5,6,7,8,9,10,11,12}
//    1[i]{0,0,0,0,0,0,0,0,0 ,0 ,0}
}
