package com.wise.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MaWenZhe
 * @Description   分页
 * @date 2017/9/13
 */

public class PageBean<W> {

    private int count;//总记录数
    private int totalPage;//总页
    private int pageSize;//每页记录
    private int currentPage;//当

    private int page; //

    private List<W> data = new ArrayList<>();   //总共返回了几条然后从在集合里面

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List<W> getData() {
        return data;
    }

    public void setData(List<W> data) {
        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

}
