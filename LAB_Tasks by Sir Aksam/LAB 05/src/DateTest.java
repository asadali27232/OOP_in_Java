public class DateTest {

    public static void main(String[] args) {

        try {
            Date date1 = new Date(10, 10, 2011);
            System.out.println(date1);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e);
        }

        try {
            Date date2 = new Date(32, 1, 2025);
            System.out.println(date2);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e);
        }


    }
}
