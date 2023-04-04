import java.util.Scanner;
public class WeatherSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("         \t\tTODAY`S WEATHER \n");
        System.out.print("LOCATION\t\tWEATHER\t\t\tTEMPERATURE\n");
        System.out.print("Manila, Philippines\tSunny\t\t\t32 C\n");
        System.out.print("New York, USA\t        Passing Clouds\t\t12 C\n");
        System.out.print("London, Uk\t        Chilly\t\t\t-1 C\n");
        System.out.print("Tokyo, Japan\t\tCloudy\t\t\t18 C\n");
        System.out.print("Barcelona, Spain\tCloudy\t\t\t9 C\n");
        
        System.out.print("Press enter to exit : ");
        String pressEnter = input.nextLine();
        
        
    }
}
