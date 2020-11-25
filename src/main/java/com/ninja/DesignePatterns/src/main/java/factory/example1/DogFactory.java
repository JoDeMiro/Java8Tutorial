package factory.example1;

// And as you’re about to see, the signature of the factory method shows that it will be returning
// a class which implements my base class, in this case, my Dog interface.

// Next I’ll define my Java “Factory” class, which in this case is a DogFactory class.
// As you can see from the code below, the DogFactory class has a static getDog method that returns a Dog
// that depends on the criteria that has been supplied.

public class DogFactory {
    public static Dog getDog(String criteria) {
        if (criteria.equals("small")) {
            return new Poodle();
        } else if (criteria.equals("big")) {
            return new Rottweiler();
        } else if (criteria.equals("working")) {
            return new SiberianHusky();
        }
        return null;
    }
}


// The factory does not say it's returning a Poodle, Rottweiler, or SiberianHusky
// — it just says it's returning something that implements the Dog interface.