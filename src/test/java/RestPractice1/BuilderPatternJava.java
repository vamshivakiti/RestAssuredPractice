package RestPractice1;

public class BuilderPatternJava {
    public BuilderPatternJava groundFloor(){
        System.out.println("Ground Floor");
       return this;
    }
    public BuilderPatternJava FirstFloor(String name){
        System.out.println(" First Flor"+name);
        return this;
    }
    public BuilderPatternJava SecondFloor(String name, String color){
        System.out.println(" Second Floor"+name+ color);
        return this;
    }

    public static void main(String[] args) {
        BuilderPatternJava bd = new BuilderPatternJava();
        bd.groundFloor().FirstFloor("FF").SecondFloor("SF","Blue");
       // bd.SecondFloor("SF","Yellow").FirstFloor("FF").FirstFloor("FF");
    }
}
