
public class Main {
    public static void main(String[] args) {

        int beamLength = 14060;
        double kLinearTension=0.0000001;
        double tempAmp = 40.3;

        double elongation = beamLength*kLinearTension*tempAmp;

        System.out.println(elongation);



    }
}
