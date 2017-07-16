package com.acme.thread;

import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.concurrent.Executors;

@RunWith(JUnitPlatform.class)
public class ThreadLambdaTest {
	@Test
	public void lambdaThread() throws Exception {
		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
			}
		}).start();

	}

	@Test
	public void threadPool() throws Exception {
		Runnable runnable = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
			}
		};

		Executors.newFixedThreadPool(2).submit(runnable);
	}
}
