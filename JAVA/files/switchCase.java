package files;
public class switchCase {
    public static void main(String[] args) {
        int day=6;
        String dayname;
        switch (day) {
            case 1: dayname="Monday";
                break;
            case 2: dayname="Tuesday";
                break;
            case 3: dayname="Wednesday";
                break;
            case 4: dayname="Thursday";
                break;
            case 5: dayname="Friday";
                break;
            case 6: dayname="Saturday";
                break;
            case 7: dayname="Sunday";
                break;
            default: dayname="Invalid Day";
        }
        System.out.println(dayname);
    }
}
