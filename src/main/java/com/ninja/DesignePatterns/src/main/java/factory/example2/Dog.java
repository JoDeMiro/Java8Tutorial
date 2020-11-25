package factory.example2;

// First, I’ll create a Dog interface. Any dog that my factory returns must implement this Java interface,
// so for the purposes of this example, I’ll keep this interface very simple.
// I’ll just specify that any class that calls itself a Dog must implement a speak method that looks like this:

public interface Dog {
    public void speak();
}
