package com.project.memo.domain;

import lombok.Builder;
@Builder
public class Memo {
    private int memoSeq;
    private String userId;
    private String memoContents;
    private int memoColor;
    private String regdate;
}
