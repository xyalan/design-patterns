package com.hialan.patterns.builder;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/13/15 12:54
 */
public class Director {
	private Builder builder = new ConcreteBuilder();

	public Memo getOrderMemo() {
		builder.setPart("send fast by ups ", "order");
		return builder.getMemo();
	}

	public Memo getSellerMemo() {
		builder.setPart("Do not forget complimentary gift", "seller");
		return builder.getMemo();
	}

	public class ConcreteBuilder extends Builder {
		private Memo memo = new Memo();

		@Override
		public Memo getMemo() {
			return memo;
		}

		@Override
		public void setPart(String arg1, String arg2) {
			memo.setMemo(arg1);
			memo.setType(arg2);
		}
	}

}
