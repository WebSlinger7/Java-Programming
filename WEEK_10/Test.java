public class Test {
    public static void main(String[] args) {
        int [] values = new int [5];
        for(int i = 1; i < values.length; i++){
            values[i] = i + values [i -1];
        }
        values[0] = values[1] + values[4];
        for(int i = 0; i < values.length; i++){
            System.out.println("index of " + i + " is " + values[i]);
            
        }
    }
}
