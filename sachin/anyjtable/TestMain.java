package com.sachin.anyjtable;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.xml.crypto.Data;

/**
 * Description:
 * 
 * @author Sachin 402948325@qq.com 2016Äê7ÔÂ27ÈÕ
 */
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CatalogInfo> list = new ArrayList<CatalogInfo>();
		for (int i = 0; i < 100; i++) {
			Random random = new Random(System.currentTimeMillis());
			int k = random.nextInt();
			CatalogInfo ca = new CatalogInfo();
			ca.setChapName(random + "");
			ca.setFinishTime(new Date());
			ca.setPid(k);
			ca.setpName(random.toString());
			ca.setScore((float) k);
			ca.setStartTime(new Date());
			ca.setUpdateTime(new Date());
			list.add(ca);

		}

		Map<String, List<CatalogInfo>> catalogs = new HashMap<String, List<CatalogInfo>>();
		catalogs.put(SubjectFrame.DSCATALOGS, list);

		SubjectFrame frame = new SubjectFrame(catalogs);
		frame.setVisible(true);

	}

}
