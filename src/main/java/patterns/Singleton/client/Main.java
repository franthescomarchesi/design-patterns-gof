package patterns.Singleton.client;

import patterns.Singleton.pattern.Singleton;

public class Main {
    
    public static void main(String[] args) {
        
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton2);

    }

}
