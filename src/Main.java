public class Main {
    public static void main(String[] args) {


        BasicStructure audi= new BasicStructure();
        audi.color="Black";
        audi.model="A3";
        audi.power="5000 cc";


        Engine engine=new Engine();
        engine.cylinders="8";
        engine.size="450 cc";
        engine.weight="6500kg";
        System.out.println(engine.cylinders);
        System.out.println(engine.size);
        System.out.println(engine.weight);


        Colors colors=new Colors();
        colors.colorLights="True";
        colors.colorTire="False";
        colors.colorWindows="True";



    }
}
// video Class 5 Merging  min 45