package smse.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import smse.model.DataGrid;

import com.opensymphony.xwork2.ActionSupport;

public class DataGridAction extends ActionSupport {
	private static final long serialVersionUID = 611848649754354011L;
	
	private List<DataGrid> dataGridList;
	
	public String genericDataGrid() {
		dataGridList = dataGridList == null ? new ArrayList<DataGrid>() : dataGridList;
		for (int i = 0; i < 100; i++) {
			DataGrid dataGrid = new DataGrid("20130313" + (i < 10 ? "0" + i : i), "利郎", "中国大通有限公司", "12436", "三级", "私有企业", new Date());
			dataGridList.add(dataGrid);
		}
		return SUCCESS;
	}

	public List<DataGrid> getDataGridList() {
		return dataGridList;
	}

	public void setDataGridList(List<DataGrid> dataGridList) {
		this.dataGridList = dataGridList;
	}
	
}
