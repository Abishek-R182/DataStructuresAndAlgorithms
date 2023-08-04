public class Leapyear {

        public static  void main(String[] args){
            isleapyear(2016);
        }
        public static boolean isleapyear(int year){
        if (year <= 1 && year >= 9999){
            return false;
        }else if (year % 100 == 0){
            if(year % 400 == 0){
                System.out.println(year + " is a leap year");
            }else{
                System.out.println(year + " is not a leap year");
            }
        }else{
            if(year % 4 == 0){
                System.out.println(year + " is a leap year");
            }else{
                System.out.println(year + " is not a leap year");
            }
        }

        return true ;
    }
}

