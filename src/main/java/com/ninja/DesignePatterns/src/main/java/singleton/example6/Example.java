package singleton.example6;

public class Example {
    public static void main(String[] args) {

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        threadSafeSingleton.method();

        System.out.println(threadSafeSingleton);


        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        billPughSingleton.method();

        System.out.println(billPughSingleton);


        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
        lazyInitializedSingleton.method();

        System.out.println(lazyInitializedSingleton);


        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        staticBlockSingleton.method();

        System.out.println(staticBlockSingleton);
    }
}
