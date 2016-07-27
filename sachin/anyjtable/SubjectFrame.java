
package com.sachin.anyjtable;

import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Description:
 * 
 * @author Sachin 2016��7��27�� 402948325@qq.com
 */
public class SubjectFrame extends javax.swing.JFrame {
	private javax.swing.JButton refreshBtn;
	private javax.swing.JButton openOriginalTitleBtn;
	private javax.swing.JButton openTitleBtn;
	private javax.swing.JButton exitBtn;
	private javax.swing.JPanel buttonPanel;
	private javax.swing.JScrollPane jsDSTableScroll;
	private javax.swing.JScrollPane jsMathTableScroll;
	private javax.swing.JTabbedPane jTabbedPane;
	private javax.swing.JTable dsTable;
	private javax.swing.JTable mathTabel;

	private static final String TITLE = "title";
	public static final String DSCATALOGS = "���ݽṹ";
	private static final String MATHCATALOGS = "��ɢ��ѧ";
	private Map<String, List<CatalogInfo>> catalogs = new HashMap<String, List<CatalogInfo>>();

	/**
	 * Creates new form SubjectFrame
	 */
	public SubjectFrame(Map<String, List<CatalogInfo>> catalogs) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.catalogs = catalogs;
		initComponents();

	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		this.setTitle(TITLE);

		jTabbedPane = new javax.swing.JTabbedPane();
		jsDSTableScroll = new javax.swing.JScrollPane();
		dsTable = new javax.swing.JTable();
		jsMathTableScroll = new javax.swing.JScrollPane();
		mathTabel = new javax.swing.JTable();
		buttonPanel = new javax.swing.JPanel();
		refreshBtn = new javax.swing.JButton();
		openOriginalTitleBtn = new javax.swing.JButton();
		openTitleBtn = new javax.swing.JButton();
		exitBtn = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setMaximumSize(new java.awt.Dimension(0, 0));
		jTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

		mathTabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		dsTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		jsMathTableScroll.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				resizeTable(true, jsMathTableScroll, mathTabel);
			}
		});

		jsDSTableScroll.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				resizeTable(true, jsDSTableScroll, dsTable);
			}
		});
		boolean setDsCatalog = false;
		boolean setMathCatalog = false;
		for (Entry<String, List<CatalogInfo>> entry : catalogs.entrySet()) {

			if (entry.getKey().equals(DSCATALOGS)) {
				dsTable.setModel(new CatalogTableModelImpl(entry.getValue()));
				setDsCatalog = true;
			} else if (entry.getKey().equals(MATHCATALOGS)) {
				mathTabel.setModel(new CatalogTableModelImpl(entry.getValue()));
				setMathCatalog = true;
			}

		}

		if (!setDsCatalog) {
			dsTable.setModel(new CatalogTableModelImpl());
		}
		if (!setMathCatalog) {
			mathTabel.setModel(new CatalogTableModelImpl());
		}

		jsDSTableScroll.setViewportView(dsTable);

		jTabbedPane.addTab("���ݽṹ", jsDSTableScroll);

		mathTabel.setColumnSelectionAllowed(true);
		mathTabel.setMaximumSize(new java.awt.Dimension(0, 0));
		jsMathTableScroll.setViewportView(mathTabel);
		mathTabel.getColumnModel().getSelectionModel()
				.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

		jTabbedPane.addTab("��ɢ��ѧ", jsMathTableScroll);

		refreshBtn.setText("ˢ��");
		refreshBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				refreshTableActionPerformed(evt);
			}
		});

		openOriginalTitleBtn.setText("��ԭ��");

		openTitleBtn.setText("��");
		openTitleBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		exitBtn.setText("�˳�");
		exitBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(buttonPanel);
		buttonPanel.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(refreshBtn)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(openOriginalTitleBtn).addGap(18, 18, 18).addComponent(openTitleBtn)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(exitBtn)
						.addGap(41, 41, 41)));
		jPanel1Layout
				.setVerticalGroup(
						jPanel1Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addContainerGap(24,
												Short.MAX_VALUE)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(refreshBtn).addComponent(openOriginalTitleBtn)
												.addComponent(openTitleBtn).addComponent(exitBtn))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGap(22, 22, 22)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 638,
												Short.MAX_VALUE)
										.addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(24, 24, 24)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
						.addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
						.addGap(28, 28, 28)
						.addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(20, 20, 20)));

		pack();
	}// </editor-fold>

	private void refreshTableActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		List<CatalogInfo> list = new ArrayList<CatalogInfo>();

		for (int i = 0; i < 100; i++) {
			Random random = new Random(System.currentTimeMillis());
			int k = random.nextInt();
			CatalogInfo ca = new CatalogInfo();
			ca.setChapName(random + "_____" + String.valueOf(k));
			ca.setFinishTime(new Date());
			ca.setPid(k);
			ca.setpName(random.toString());
			ca.setScore((float) k);
			ca.setStartTime(new Date());
			ca.setUpdateTime(new Date());
			list.add(ca);

		}

		Map<String, List<CatalogInfo>> catalogs = new HashMap<String, List<CatalogInfo>>();
		catalogs.put(DSCATALOGS, list);
		onNetTouchEvent(catalogs);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	public void resizeTable(boolean bool, JScrollPane jsp, JTable jg_table) {
		Dimension containerwidth = null;

		// ������ʾ�������������С�ı䣬ʹ��ʵ�ʴ�С��������ѡ��С
		containerwidth = jsp.getSize();

		// ������������ getTable().
		int allwidth = jg_table.getIntercellSpacing().width;
		for (int j = 0; j < jg_table.getColumnCount(); j++) {
			// �����������Ŀ��
			int max = 0;
			for (int i = 0; i < jg_table.getRowCount(); i++) {
				int width = jg_table.getCellRenderer(i, j)
						.getTableCellRendererComponent(jg_table, jg_table.getValueAt(i, j), false, false, i, j)
						.getPreferredSize().width;
				if (width > max) {
					max = width;
				}
			}
			// �����ͷ�Ŀ��
			int headerwidth = jg_table.getTableHeader()
					.getDefaultRenderer().getTableCellRendererComponent(jg_table,
							jg_table.getColumnModel().getColumn(j).getIdentifier(), false, false, -1, j)
					.getPreferredSize().width;
			// �п�����ӦΪ��ͷ���
			max += headerwidth;
			// �����п�
			jg_table.getColumnModel().getColumn(j).setPreferredWidth(max);
			// �����������ȸ�ֵ���ǵ�Ҫ���ϵ�Ԫ��֮����������1������
			allwidth += max + jg_table.getIntercellSpacing().width;
		}
		allwidth += jg_table.getIntercellSpacing().width;
		System.out.println("allwidth:" + allwidth);

		// ������ʵ�ʿ�ȴ�С�������Ŀ�ȣ�����Ҫ�����ֶ���Ӧ�������ñ������Ӧ
		if (allwidth > containerwidth.width) {
			jg_table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		} else {
			jg_table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(SubjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SubjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SubjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SubjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SubjectFrame(null).setVisible(true);
			}
		});
	}

	public void onNetTouchEvent(Object msg) {
		updateTable(msg);
	}

	private void updateTable(Object msg) {
		Map<String, List<CatalogInfo>> mapInfo = (Map<String, List<CatalogInfo>>) msg;

		for (Entry<String, List<CatalogInfo>> entry : mapInfo.entrySet()) {
		
			if (entry.getKey().equals(DSCATALOGS)) {
				dsTable.setModel(new CatalogTableModelImpl(entry.getValue()));

			} else if (entry.getKey().equals(MATHCATALOGS)) {
				mathTabel.setModel(new CatalogTableModelImpl(entry.getValue()));

			}

		}
		resizeTable(true, jsMathTableScroll, mathTabel);
		resizeTable(true, jsDSTableScroll, dsTable);
		jTabbedPane.validate();
	}

}
