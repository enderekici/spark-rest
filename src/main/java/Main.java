import static spark.Spark.get;

public class Main {

    public static final String PONG = "pong";
    public static final String PING = "/ping";

    public static void main(String[] args) {
        get(PING, (req, res) -> PONG);
    }
}
