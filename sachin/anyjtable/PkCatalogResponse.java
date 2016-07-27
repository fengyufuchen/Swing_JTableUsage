package com.sachin.anyjtable;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * @author Sachin
 * 2016Äê7ÔÂ27ÈÕ    402948325@qq.com
 */
public class PkCatalogResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private Map<String, List<CatalogInfo>> catalogs;
	private CatalogState catalogState;
	private String contextID;

	public static enum CatalogState {
		getCatalogSuccess, catalogNotExist
	}

	public Map<String, List<CatalogInfo>> getCatalogs() {
		return catalogs;
	}

	public void setCatalogs(Map<String, List<CatalogInfo>> catalogs) {
		this.catalogs = catalogs;
	}

	public CatalogState getCatalogState() {
		return catalogState;
	}

	public void setCatalogState(CatalogState catalogState) {
		this.catalogState = catalogState;
	}

	public String getContextID() {
		return contextID;
	}

	public void setContextID(String contextID) {
		this.contextID = contextID;
	}

}
