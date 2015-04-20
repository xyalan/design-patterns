package com.hialan.patterns.chain;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/20/15 14:19
 */
public class ConcreteHandlerA extends Handler {

	@Override
	protected Level getHandlerLevel() {
		return new Level(1);
	}

	@Override
	public Response response(Request request) {
		System.out.println("handled request by A");
		return null;
	}
}
