package com.hialan.patterns.chain;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/20/15 14:15
 */
abstract class Handler {
	private Handler nextHandler;

	public final Response handleRequest(Request request) {
		Response response = null;
		if (this.getHandlerLevel().above(request.getLevel())) {
			response = this.response(request);
		} else {
			if (this.nextHandler != null) {
				this.nextHandler.handleRequest(request);
			} else {
				System.out.println("-----没有合适的处理器-----");
			}
		}
		return response;
	}

	public void setNextHandler(Handler handler) {
		this.nextHandler = handler;
	}

	protected abstract Level getHandlerLevel();

	public abstract Response response(Request request);
}
