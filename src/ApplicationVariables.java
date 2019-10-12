public class ApplicationVariables {

    public static void main(String[] args){
        int var1 = 200;
        int var2 = 400;
        int var3 = 900;
        int var4 = 400;
        int sum;

        sum = sumFunction(var1, var2);

        System.out.println(sum);
    }

    public static int sumFunction (int var1, int var2){
        return (var1 + var2);
    }
}
