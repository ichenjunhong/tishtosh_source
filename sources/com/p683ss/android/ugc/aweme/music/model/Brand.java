package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.Brand */
public class Brand implements Serializable {
    @C17952c(mo34828a = "heat")
    private int heat;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private int f95399id;
    @C17952c(mo34828a = "logo_url")
    private UrlModel logoUrl;
    @C17952c(mo34828a = "name")
    private String name;
    @C17952c(mo34828a = "rank")
    private int rank;
    @C17952c(mo34828a = "rank_diff")
    private int rankDiff;

    public int getHeat() {
        return this.heat;
    }

    public int getId() {
        return this.f95399id;
    }

    public UrlModel getLogoUrl() {
        return this.logoUrl;
    }

    public String getName() {
        return this.name;
    }

    public int getRank() {
        return this.rank;
    }

    public int getRankDiff() {
        return this.rankDiff;
    }

    public void setHeat(int i) {
        this.heat = i;
    }

    public void setId(int i) {
        this.f95399id = i;
    }

    public void setLogoUrl(UrlModel urlModel) {
        this.logoUrl = urlModel;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setRankDiff(int i) {
        this.rankDiff = i;
    }
}
