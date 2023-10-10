public class Anglebt2Hands {
    public static void main(String[] args) {
        String str = "15:30";
        String h = "";
        String m = "";
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)!=':'){
                h = h + str.charAt(i);
            }
            else{
                i++;
                break;
            }
        }
        for(;i<str.length();i++){
                m = m + str.charAt(i);
        }
        double hour = Integer.parseInt(h);
        double minutes = Integer.parseInt(m);

        System.out.println("Hour = "+hour+"\n"+"Minutes = "+minutes);

        double hr_Angle = (hour % 12) * 30 + (minutes / 60.0) * 30;
        double m_Angle = minutes*6;
        double angle = Math.abs(hr_Angle - m_Angle);

        if(angle>180){
            angle = 360-angle;
        }
        System.out.println(angle);
    }
}
