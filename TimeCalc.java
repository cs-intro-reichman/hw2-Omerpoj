import javax.imageio.event.IIOWriteWarningListener;

public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMinutes = Integer.parseInt(args[1]);
        int totalMinutes = ((hours*60)+minutes+addMinutes);
        int totalHours = totalMinutes/60;
        int newHours = totalHours%24;
        int newMinutes = (totalMinutes-(totalHours*60));
        if (newHours < 10 || newMinutes < 10) {
                if (newMinutes < 10 && newHours >=10 && newMinutes != 0) {
                    System.out.println(newHours+":0"+newMinutes);
                }
                if (newHours < 10 && newMinutes >=10 && newHours != 0 && newMinutes!=1) {
                    System.out.println("0"+newHours+":"+newMinutes);
                }
                if (newHours == 0 && newMinutes == 0) {
                    System.out.println("00:00");
                }
                if (newHours != 0 && newMinutes == 0) {
                    System.out.println(newHours+":00");
                }
                if (newHours == 0 && newMinutes != 0) {
                    System.out.println("00:"+newMinutes);
                }
                if (newHours < 10 && newMinutes < 10 && newHours <= 1 && newMinutes <=1) {
                    System.out.println("0"+newHours+":0"+newMinutes);
                }
            }
        else{
            System.out.println(newHours+":"+newMinutes);
        }
        }
    }

