package ThreadPool.Micheal_BigMac;
import java.util.ArrayList;
import java.util.List;

public class TestThreadPool {

	public static void main(String[] args) {

		ThreadPool pool = new ThreadPool();
		List<String> resource = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			resource.add("task "+i);
		}

		for (String res : resource) {
			Executor executor = pool.getExecutor();
			executor.setTask(new ResourceLoader(res));
			executor.startTask();
		}
		pool.destroy();
	}

}
