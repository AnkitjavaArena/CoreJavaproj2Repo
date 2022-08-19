package test;

import java.util.Date;

public class TransLog {
	private final long hAccNo,bAccNo;
	private final float amt;
	private final Date d;
	public TransLog(long hAccNo, long bAccNo, float amt, Date d) {
		super();
		this.hAccNo = hAccNo;
		this.bAccNo = bAccNo;
		this.amt = amt;
		this.d = d;
	}
	public long gethAccNo() {
		return hAccNo;
	}
	public long getbAccNo() {
		return bAccNo;
	}
	public float getAmt() {
		return amt;
	}
	public Date getD() {
		return d;
	}
}//end of class
