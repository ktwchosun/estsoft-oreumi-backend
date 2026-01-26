package com.example.step13.domain;


import lombok.Getter;
import lombok.ToString;
import org.springframework.data.domain.Pageable;

@Getter
@ToString
public class Pagination {
    private final long totalElements;
    private final int pageSize;
    private final int lastPage;
    private final int pageNumber;
    private final int pagesPerViewport;
    private final int startPage;
    private final int endPage;
    private final boolean prev;
    private final boolean next;

    private Pagination(Pageable pageable, long totalElements, int lastPage, int pagesPerViewport) {
        this.totalElements = totalElements;
        this.pageSize = pageable.getPageSize();
        this.lastPage = lastPage;
        this.pageNumber = pageable.getPageNumber() + 1;
        this.pagesPerViewport = pagesPerViewport;

        // 화면에 보여줄 페이지의 마지막 번호
        // = ((현재 페이지 번호) / (페이지 번호의 개수)) * (페이지 번호의 개수)
        int endPage = (int)(Math.ceil ((double)pageNumber / pagesPerViewport)) *  pagesPerViewport;

        // 화면에 보여줄 페이지의 시작 번호
        // = (페이지의 마지막 번호) - (페이지 번호의 개수) + 1
        int startPage = endPage - pagesPerViewport + 1;

        // 화면에 보여줄 페이지의 시작 번호는 0 보다 커야 한다.
        if (startPage <= 0) startPage = 1;

        // 화면에 보여줄 페이지의 마지막 번호는 마지막 페이지 번호보다 클 수 없다.
        if (lastPage < endPage) endPage = lastPage;

        this.startPage = startPage;
        this.endPage = endPage;

        this.prev = this.startPage > 1;

        this.next = this.endPage < lastPage;
    }

    public static Pagination of(Pageable pageable, long totalElements, int lastPage) {
        return new Pagination(pageable, totalElements, lastPage,10);
    }

    public static Pagination of(Pageable pageable, long totalElements) {
        return new Pagination(pageable, totalElements,
                (int)(Math.ceil((double)totalElements / pageable.getPageSize())), 10);
    }
}
