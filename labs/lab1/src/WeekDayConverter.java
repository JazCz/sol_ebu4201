public class WeekDayConverter{
    public static void main(String[] args) {
        String c =args[0];
        switch (c){
            case "1": 
                System.out.println("The 1th day of the week is Monday");
                break;
            case "2": 
                System.out.println("The 2th day of the week is Tuesday");
                break;
            case "3": 
                System.out.println("The 3th day of the week is Wednesday");
                break;
            case "4": 
                System.out.println("The 4th day of the week is Thursday");
                break;
            case "5": 
                System.out.println("The 5th day of the week is Friday");
                break;
            case "6": 
                System.out.println("The 6th day of the week is Saturday");
                break;
            case "7": 
                System.out.println("The 7th day of the week is Sunday");
                break;
            default:
                break;
        }

    }

}