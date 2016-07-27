package com.sachin.anyjtable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;



/**
 * Description:
 * @author Sachin    402948325@qq.com
 * 2016年7月27日
 */
public class CatalogTableModelImpl implements TableModel {

	private List<CatalogInfo> infoList = new ArrayList<CatalogInfo>();
	String[] columName = new String[] { "章名", "习题名 ", "通过", "类型", "编译有错", "运行有错", "正确次数", "错误次数", "提交时间 ", "首次通过时间 ",
			"允许开始时间", "要求完成时间", "得分", "题目说明" };

	public  CatalogTableModelImpl(List<CatalogInfo> infoList) {
		// TODO Auto-generated constructor stub
		this.infoList = infoList;
	}
	public  CatalogTableModelImpl() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return infoList.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columName.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		return columName[columnIndex];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		CatalogInfo beanObj = infoList.get(rowIndex);
		String value = "";
		switch (columnIndex) {
		case 0:
			value = beanObj.getChapName();
			break;

		case 1:
			value = beanObj.getpName();
			break;
		case 2:
			// 通过
			break;
		case 3:
			// 类型
			break;
		case 4:
			// 编译有错
			break;
		case 5:
			// 运行有错
			break;
		case 6:
			// 正确次数
			break;
		case 7:
			// 错误次数
			break;
		case 8:
			// 提交时间
			break;
		case 9:
			// 首次通过时间
			break;
		case 10:
			// 允许开始时间
			break;
		case 11:
			// 要求完成时间
			break;
		case 12:
			// 得分
			value = beanObj.getScore().toString();
			break;
		case 13:
			// 题目说明
			break;
		default:
			break;
		}
		if (value == null || (value != null && value.equals(""))) {
			value = " ";
		}

		return value;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}
