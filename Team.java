public class Team {
    // atribute ms.davy
    private int[] sample = {1, 2, 3, 4, 5};
    // constuctor mr.phanang
    public static void main(String[] args) {
        
    }
        
    
    // method sum ms.phaleng
    public int sum(int[] input){
        int sum = 0;
        for(int i = 0; i < input.length; i++){
            sum += input[i];
        }
        System.out.println("The sum is: " + sum);
        return sum;

    }
    // method max mr.yun
public int max(int[] input){
    int max = input[0];
    for(int i = 1; i < input.length; i++){
        if(input[i]> max){
            max = input[i];
        }
    }
}
 system.out.println("Max:"+ max);
 retuen max;
}
      