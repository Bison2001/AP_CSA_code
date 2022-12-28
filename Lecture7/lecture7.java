public class lecture7 {
    public static void main (String args[]) {

        double[] list1 = new double[3];

        list1[0] = 3.1;
        list1[1] = 3.3;
        list1[2] = 2.7;

        // for (int i = 0; i < list1.length; i++) {
        //     System.out.println(list1[i]);
        // }

        // for (double element : list1) {
        //     System.out.println(element);
        // }

        double[] geometric = new double[20];
        geometric[0] = 1.0;
        for (int i = 1; i < geometric.length; i++) {
            geometric[i] = geometric[i-1]/2;
        }
        
        for (double element : geometric) {
            System.out.print(element + " ");
        }


    }

    public static String[] Decompose(String input) {
        // this method takes a String as input and output an array of character of that String
        String[] output = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            output[i] = input.substring(i, i+1);
        }

        return output;
    }

    public static String Compose(String[] input) {
        // this method takes an array of string and concatenate them to one string
        String output = "";

        for (String str : input) {
            output += str;
        }

        return output;
    }
}