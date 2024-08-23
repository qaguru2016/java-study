public class LargestNo {
    public static void main(String[] args) {
        int[] nos = {20,340,19,97,28,55};
        int largest = nos[0];
        for(int i=1;i< nos.length;i++){
            if(nos[i]>largest){
                largest = nos[i];
            }
        }
        System.out.println("Largest No : " + largest);
    }
}
