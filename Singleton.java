
class Logger {

    private static Logger l = null;

    //private constructor
    private Logger() {
        super();
    }

    public static Logger getLogger() {
        if (l == null) {
            l = new Logger();
        }
        return l;
    }
}

class Test {

    public Logger l = Logger.getLogger();

    public Logger getTestLogger() {
        return l;
    }
}

public class Singleton {

    public static void main(String[] args) {
        Test t = new Test();
        Logger l = Logger.getLogger();
        Logger tl = t.getTestLogger();
        //check the logger object is same for all return we get
        if (l == tl) {
            System.out.println("Same Object is returned for Logger class---->Singleton class"); 
        }else {
            System.out.println("Same Object is not returned for Logger class----> Not Singleton class");
        }

        //check test class normal
        Test t2 = new Test();
        if (t == t2) {
            System.out.println("Same Object is returned for Test class---->Singleton class"); 
        }else {
            System.out.println("Same Object is not returned for Test class----> Not Singleton class");
        }

    }
}
