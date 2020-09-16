package Day02.day0206;

public class Bike implements Vehicle{
    @Override
    public String start() {
        return "8点出发";
    }

    @Override
    public String stop() {
        return "9点到";
    }
}
