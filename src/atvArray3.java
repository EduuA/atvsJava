public class atvArray3 {
    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        inteiros(num);
    
    }

    public static void inteiros(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 ==0) {
                System.out.println(array[i]);
            }
        }
    }

}
