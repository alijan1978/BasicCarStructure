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


        Lights lights=new Lights();

        lights.color="Red";
        lights.size="15cm";
        lights.intensity="2344lumen";
        

    }
}
// video Class 5 Merging  min 45