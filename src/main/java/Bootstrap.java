import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;

public class Bootstrap {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx(new VertxOptions().setWorkerPoolSize(40));

    }
}
