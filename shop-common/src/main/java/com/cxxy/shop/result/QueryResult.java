package com.cxxy.shop.result;

import com.cxxy.shop.response.CentreCutPageResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class QueryResult<T> {

    private int pageSize;

    private int pageNum;

    private int totalCount;

    private List<T> dataList;

    public void copyTo(CentreCutPageResponse<T> response) {
        response.setPageNum(pageNum);
        response.setPageSize(pageSize);
        response.setTotalCount(totalCount);
        response.setDataList(dataList);
    }

    public QueryResult(int pageSize, int pageNum) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public QueryResult(int pageSize, int pageNum, int totalCount) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
    }

    public QueryResult(int pageSize, int pageNum, int totalCount, List<T> dataList) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.dataList = dataList;
    }
}
