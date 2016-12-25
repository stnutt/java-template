public class Hello {

    public String hello(String name) {
        return String.format("Hello, %s!", name);
    }

    public String hello() {
        return hello("World");
    }
}
