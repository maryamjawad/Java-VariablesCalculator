public class ApplicationVariables {

    public static void main(String[] args){
        //Declaration
        int var1 = 200;
        int var2 = 400;
        int var3 = 900;
        int var4 = 400;
        int sum;
        int multi;
        String A = "Maryam";
        String B = "Aslam";
        String C;
        Double num1 = 90.89;
        Double num2 = 67.56;
        Double sumDouble;



        //Processing
        sum = sumFunction(var1, var2);
        multi = multiFunction(var1,var2);
        C = sumString(A,B);
        sumDouble= sumDouble(num1,num2);


        //View
        System.out.println(sum);
        System.out.println(multi);
        System.out.println((C));
        System.out.println(sumDouble);
    }

    public static int sumFunction (int var1, int var2){
        return (var1 + var2);
    }

    public static int multiFunction (int var1, int var2){
        return (var1 * var2);
    }

    public static String sumString(String A,String B){
        return (A + " " + B);
    }
    public static Double sumDouble(Double num1, Double num2){
        return (num1 + num2);
    }

}

