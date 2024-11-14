public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMinutes = Integer.parseInt(args[1]);
        int totalMinutes = ((hours*60)+minutes+addMinutes);
        int totalHours = totalMinutes/60;
        int newHours = totalHours%24;
        System.out.println(newHours);
        int newMinutes = (totalMinutes-(totalHours*60));
        if (newHours == 0 || newMinutes == 0) {
            if (newHours<10) {
                newHours = Integer.parseInt(""+0+newHours);
            }
            if (newMinutes<10) {
                newHours = Integer.parseInt(""+0+newMinutes);
            }
        }
        if (newHours == 0 && newMinutes == 0) {
            System.out.println("00:00");
        }
        else{
            if (newHours == 0) {
                System.out.println("00:"+newMinutes);
            }
            if (newMinutes == 0) {
                System.out.println(newMinutes+":00");
            }
            if (newHours == 0 || newMinutes == 0) {
                if (newHours<10) {
                    newHours = Integer.parseInt(""+0+newHours);
                }
                if (newMinutes<10) {
                    newHours = Integer.parseInt(""+0+newMinutes);
                }
            }
            System.out.println(newHours+":"+newMinutes);
        }
    }
}

