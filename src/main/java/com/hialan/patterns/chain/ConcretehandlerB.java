package com.hialan.patterns.chain;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/20/15 14:22
 */
public class ConcretehandlerB extends Handler {
	@Override
	protected Level getHandlerLevel() {
		return new Level(3);
	}

	@Override
	public Response response(Request request) {
		System.out.println("handled request by B");
		return null;
	}
}
