package com.bytedance.android.live.broadcast.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

public class WaitingReviewInfo {
    @C17952c(mo34828a = "audit_content")
    private String content;
    @C17952c(mo34828a = "audit_status")
    private int status;
    @C17952c(mo34828a = "total_queue_cnt")
    private int totalWaitingCount;
    @C17952c(mo34828a = "cur_wait_cnt")
    private int waitingCount;
    @C17952c(mo34828a = "rule_info")
    private List<C3460g> waitingReviewRules;
    @C17952c(mo34828a = "to_wait_time")
    private int waitingTime;

    public String getContent() {
        return this.content;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTotalWaitingCount() {
        return this.totalWaitingCount;
    }

    public int getWaitingCount() {
        return this.waitingCount;
    }

    public List<C3460g> getWaitingReviewRules() {
        return this.waitingReviewRules;
    }

    public int getWaitingTime() {
        return this.waitingTime;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalWaitingCount(int i) {
        this.totalWaitingCount = i;
    }

    public void setWaitingCount(int i) {
        this.waitingCount = i;
    }

    public void setWaitingReviewRules(List<C3460g> list) {
        this.waitingReviewRules = list;
    }

    public void setWaitingTime(int i) {
        this.waitingTime = i;
    }
}
