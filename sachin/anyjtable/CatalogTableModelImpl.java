package com.sachin.anyjtable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;



/**
 * Description:
 * @author Sachin    402948325@qq.com
 * 2016��7��27��
 */
public class CatalogTableModelImpl implements TableModel {

	private List<CatalogInfo> infoList = new ArrayList<CatalogInfo>();
	String[] columName = new String[] { "����", "ϰ���� ", "ͨ��", "����", "�����д�", "�����д�", "��ȷ����", "�������", "�ύʱ�� ", "�״�ͨ��ʱ�� ",
			"����ʼʱ��", "Ҫ�����ʱ��", "�÷�", "��Ŀ˵��" };

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
			// ͨ��
			break;
		case 3:
			// ����
			break;
		case 4:
			// �����д�
			break;
		case 5:
			// �����д�
			break;
		case 6:
			// ��ȷ����
			break;
		case 7:
			// �������
			break;
		case 8:
			// �ύʱ��
			break;
		case 9:
			// �״�ͨ��ʱ��
			break;
		case 10:
			// ����ʼʱ��
			break;
		case 11:
			// Ҫ�����ʱ��
			break;
		case 12:
			// �÷�
			value = beanObj.getScore().toString();
			break;
		case 13:
			// ��Ŀ˵��
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
