public class ShiftingElements {
    public static void main(String[] args) {
        //Creat an array
        int [] k = new int [5];

        //Inset elements in the array
        for (int i = 0; i < k.length; i++){
            k[i] = (int)(Math.random()*k.length);
        }

        //Array before shifting
        System.out.println("Array before shifting: ");

        for(int i = 0; i < k.length; i++){
            System.out.println(k[i] + " ");
        }
        //Shift the array
        int temp = k[0]; //Retain the first element
        for(int i = 1; i < k.length; i++){
            k[i -1] = k[i];
        }
        //Move the first element to fill the last position
        k[k.length - 1] = temp;

        //Array after shifting
        System.out.println("\nArray after shifting: ");
        for(int i = 0; i < k.length; i++){
            System.out.println(k[i] + " ");
        }
    }
}
