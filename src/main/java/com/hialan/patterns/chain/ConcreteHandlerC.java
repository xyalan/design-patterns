package com.hialan.patterns.chain;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/20/15 14:23
 */
public class ConcreteHandlerC extends Handler {
	@Override
	protected Level getHandlerLevel() {
		return new Level(5);
	}

	@Override
	public Response response(Request request) {
		System.out.println("handled request by C");
		return null;
	}
}
