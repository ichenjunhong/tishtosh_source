package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UserHonor */
public class UserHonor implements Serializable {
    @C17952c(mo34828a = "now_diamond")
    private long currentDiamond;
    @C17952c(mo34828a = "icon")
    private UrlModel currentHonorIcon;
    @C17952c(mo34828a = "name")
    private String currentHonorName;
    @C17952c(mo34828a = "diamond_icon")
    private UrlModel diamondIcon;
    @C17952c(mo34828a = "im_icon")
    private UrlModel imIcon;
    @C17952c(mo34828a = "level")
    private int level;
    @C17952c(mo34828a = "live_icon")
    private UrlModel liveIcon;
    @C17952c(mo34828a = "next_diamond")
    private long nextDiamond;
    @C17952c(mo34828a = "next_icon")
    private UrlModel nextHonorIcon;
    @C17952c(mo34828a = "next_name")
    private String nextHonorName;
    @C17952c(mo34828a = "total_diamond_count")
    private long totalDiamond;

    public long getCurrentDiamond() {
        return this.currentDiamond;
    }

    public UrlModel getCurrentHonorIcon() {
        return this.currentHonorIcon;
    }

    public String getCurrentHonorName() {
        return this.currentHonorName;
    }

    public UrlModel getDiamondIcon() {
        return this.diamondIcon;
    }

    public UrlModel getImIcon() {
        return this.imIcon;
    }

    public int getLevel() {
        return this.level;
    }

    public UrlModel getLiveIcon() {
        return this.liveIcon;
    }

    public long getNextDiamond() {
        return this.nextDiamond;
    }

    public UrlModel getNextHonorIcon() {
        return this.nextHonorIcon;
    }

    public String getNextHonorName() {
        return this.nextHonorName;
    }

    public long getTotalDiamond() {
        return this.totalDiamond;
    }

    public void setCurrentDiamond(long j) {
        this.currentDiamond = j;
    }

    public void setCurrentHonorIcon(UrlModel urlModel) {
        this.currentHonorIcon = urlModel;
    }

    public void setCurrentHonorName(String str) {
        this.currentHonorName = str;
    }

    public void setDiamondIcon(UrlModel urlModel) {
        this.diamondIcon = urlModel;
    }

    public void setImIcon(UrlModel urlModel) {
        this.imIcon = urlModel;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setLiveIcon(UrlModel urlModel) {
        this.liveIcon = urlModel;
    }

    public void setNextDiamond(long j) {
        this.nextDiamond = j;
    }

    public void setNextHonorIcon(UrlModel urlModel) {
        this.nextHonorIcon = urlModel;
    }

    public void setNextHonorName(String str) {
        this.nextHonorName = str;
    }

    public void setTotalDiamond(long j) {
        this.totalDiamond = j;
    }
}
