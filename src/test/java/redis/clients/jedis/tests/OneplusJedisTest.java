package redis.clients.jedis.tests;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuyexin on 17/4/24.
 */
public class OneplusJedisTest {

	private static String REDIS_HOST = "localhost";

	private static int REDIS_PORT = 6379;

	@Test
	public void opstockTest(){
		Jedis jedis = new Jedis(REDIS_HOST, REDIS_PORT);
		String result = jedis.opstock("{\"stock1\":-1, \"stock2\":-1}", "logList", "logId", "'{\"res\":\"ok\"}'");
		System.out.println("result:" + result);
		assertEquals(true, result.contains("\"ret\":1"));
	}


}
