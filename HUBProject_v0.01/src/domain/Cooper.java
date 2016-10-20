package domain;

import java.sql.Date;
import java.util.List;

public class Cooper {
	private int coId;
	private String coName;
	private String coBanner;
	private Date startDay;
	private Date lastDay;
	private List<String> connChains;

	public Cooper() {
	}

	public int getCoId() {
		return coId;
	}

	public void setCoId(int coId) {
		this.coId = coId;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getCoBanner() {
		return coBanner;
	}

	public void setCoBanner(String coBanner) {
		this.coBanner = coBanner;
	}

	public Date getStartDay() {
		return startDay;
	}

	public void setStartDay(Date startDay) {
		this.startDay = startDay;
	}

	public Date getLastDay() {
		return lastDay;
	}

	public void setLastDay(Date lastDay) {
		this.lastDay = lastDay;
	}

	public List<String> getConnChains() {
		return connChains;
	}

	public void setConnChains(List<String> connChains) {
		this.connChains = connChains;
	}
}
