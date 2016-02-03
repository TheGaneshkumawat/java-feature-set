package com.inbravo.lambda;

/**
 * 
 * @author amit.dixit
 *
 */
public final class Sleeper {

	public static final void main(final String... args) {

		/* Runnable is a functional intefface now (java.lang.FunctionalInterface) */
		final Runnable sleeper = () -> {

			try {
				for (int i = 0; i < 100; i++) {

					System.out.println("Zzz");
					Thread.sleep(1000);
				}
			} catch (final InterruptedException e) {

				e.printStackTrace();
			}
		};

		/* Start new thread */
		new Thread(sleeper).start();
	}
}
