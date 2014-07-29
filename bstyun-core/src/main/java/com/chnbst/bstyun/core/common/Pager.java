/**
 * 
 * @project
 * @author LiQiang
 * @version 1.0
 * @data 2014-07-28
 */
package com.chnbst.bstyun.core.common;

/**
 * 分页器
 * 
 * @author LiQiang
 * 
 */
public class Pager {

	/**
	 * 每页显示的记录数(默认为20条,可以通过set改变其数量)
	 */
	private int pageSize = 20;

	/**
	 * 总记录数
	 */
	private int totalRows;

	/**
	 * 当前页码
	 */
	private int curPage;
	/**
	 * 当前开始下标
	 */
	private int start;

	/**
	 * 当前结束下标
	 */
	private int end;

	/**
	 * 排列方式
	 */
	private String sort;

	/**
	 * 总页数
	 */
	private int totalPages;

	/**
	 * 返回当前页面数
	 * 
	 * @return
	 */
	public int getCurPage() {

		if (curPage < 1) {

			this.curPage = 1;
		}

		return curPage;
	}

	/**
	 * 返回总页数
	 * 
	 * @return
	 */
	public int getTotalPages() {

		totalPages = (int) Math.ceil((double) totalRows / pageSize);
		return totalPages;
	}

	/**
	 * 返回总行数
	 * 
	 * @return
	 */
	public int getTotalRows() {

		return totalRows;
	}

	/**
	 * 第一页
	 * 
	 * @return
	 */
	public int firstPage() {

		return 1;
	}

	/**
	 * 最后一页
	 * 
	 * @return
	 */
	public int lastPage() {

		return getTotalPages();
	}

	/**
	 * 上一页
	 * 
	 * @return
	 */
	public int previousPage() {

		return (curPage - 1 > getTotalPages()) ? getTotalPages() : curPage - 1;
	}

	/**
	 * 下一页
	 * 
	 * @return
	 */
	public int nextPage() {

		return (curPage + 1 > getTotalPages()) ? getTotalPages() : curPage + 1;
	}

	/**
	 * 是否是第一页
	 * 
	 * @return
	 */
	public boolean isFirstPage() {

		return (curPage == 1) ? true : false;
	}

	/**
	 * 是否是最后一页
	 * 
	 * @return
	 */
	public boolean isLastPage() {

		return (curPage == getTotalPages()) ? true : false;
	}

	/**
	 * 当前开始下标
	 */
	public int getStart() {
		// start = (curPage <= 1) ? 0 : ((curPage - 1) * pageSize) + 1;
		// oracle的分页

		start = (curPage <= 1) ? 0 : ((curPage - 1) * pageSize); // mysql的分页

		return start;
	}

	/**
	 * 当前结束下标
	 */
	public int getEnd() {
		end = getStart() + pageSize - 1;

		return end;
	}

	/**
	 * 每页显示的记录数(默认为10条,可以通过set改变其数量)
	 * 
	 * @return
	 */
	public int getPageSize() {

		return pageSize;
	}

	public void setCurPage(int curPage) {

		this.curPage = curPage;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getSort() {
		return sort;
	}

	public void setSord(String sort) {
		this.sort = sort;
	}
}