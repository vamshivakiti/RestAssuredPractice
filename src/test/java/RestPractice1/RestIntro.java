package RestPractice1;

public class RestIntro {
    RestIntro one(){
        System.out.println("1");
        return this;
    }
    RestIntro two(){
        System.out.println("2");
        return this;
    }
    RestIntro three(){
        System.out.println("3");
        return this;
    }
    public static void main(String[] args) {
        /*
        * Rest assured is a java lib to automate RESR APIS
        * GET, Put,Post,Delete.Head....
        * Build functions---DirectFunctions
        * get().    Put().
        * Just add to project and use it.
        *
        * */
        RestIntro ri = new RestIntro();
        ri.one().two().three();
    }
}
