public class SolarSystem {
    public static void main(String[] args) {

        BasicStructure bb=new BasicStructure();

        bb.planets="2";
        bb.moon="2";
        bb.stars="10";
        bb.sun="1";
        System.out.println("Solar System is ready.");

        FeatureSun fSun=new FeatureSun();
        fSun.temp="333555";
        fSun.color="green";
        fSun.radius="25532323 miles";

        Planet1 plan=new Planet1();
        plan.color="pink";
        plan.radius="1555511613 miles";
    }
}
