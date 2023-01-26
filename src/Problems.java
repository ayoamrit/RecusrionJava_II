public class Problems {

    public static void main(String[] args){

        //initializing integer
        int number = 751877657;
        int numberLength = String.valueOf(number).length();  //length

        //printing the result
        System.out.println("Number '7' occurred "+countOccurrence(number,numberLength-1)+" times.");
    }

    private static int countOccurrence(int number, int numberLength){

        if(numberLength >= 0){

            char c = String.valueOf(number).charAt(numberLength);

            if(c == '7'){
                return 1 + countOccurrence(number, numberLength - 1);
            }
            else{
                return countOccurrence(number, numberLength - 1);
            }
        }
        else{
            return 0;
        }
    }

}
