package com.sachin.anyjtable;

import java.io.Serializable;
import java.util.Date;


/**
 * Description:
 * @author Sachin
 * 2016Äê7ÔÂ27ÈÕ    402948325@qq.com
 */
public class CatalogInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pid;
	private String chapName;
	private String pName;
	private Float score;

	private Date startTime;
	private Date finishTime;
	private Date updateTime;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getChapName() {
		return chapName;
	}

	public void setChapName(String chapName) {
		this.chapName = chapName;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public CatalogInfo() {

	}

	public CatalogInfo(Integer pid, String chapName, String pName, Float score, Date startTime, Date finishTime,
			Date updateTime) {
		this.pid = pid;
		this.chapName = chapName;
		this.pName = pName;
		this.score = score;
		this.startTime = startTime;
		this.finishTime = finishTime;
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "CatalogInfo [pid=" + pid + ", chapName=" + chapName + ", pName=" + pName + ", score=" + score
				+ ", startTime=" + startTime + ", finishTime=" + finishTime + ", updateTime=" + updateTime + "]";
	}

}
