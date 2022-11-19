import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisConnectionException;
import org.redisson.config.Config;

import java.util.Random;

import static java.lang.System.out;

public class RedisClient {
    private RedissonClient redisson;

    public RedisClient() {}

    public RedisClient(RedissonClient redisson) {
        this.redisson = redisson;
    }

    private int idUsers = 1;


    void init() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        try {
            redisson = Redisson.create(config);
        } catch (RedisConnectionException Exc) {
            out.println("Не удалось подключиться к Redis");
            out.println(Exc.getMessage());
        }
    }
    int userRandom(){
        return (int) (Math.random() * 20);
    }

    int UsersNumber() {
        return idUsers++;
    }
}
