import java.net.InetAddress;

public class ABC {
	public static void main(String[] args) throws Exception {
		boolean reachable = InetAddress.getByName("localhost").isReachable(5_000);
		System.out.println("localhost is " + (reachable ? "reachable" : "unreachable"));
	}
}
