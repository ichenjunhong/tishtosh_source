package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.q */
public final class C39133q extends C37859b implements Serializable {

    /* renamed from: a */
    private String f99865a;
    @C17952c(mo34828a = "avatar")
    public UrlModel avatar;

    /* renamed from: b */
    private String f99866b;

    /* renamed from: c */
    private boolean f99867c;
    @C17952c(mo34828a = "content")
    public String content;
    @C17952c(mo34828a = "cost")
    public double cost;
    @C17952c(mo34828a = "date")
    public String date;
    public boolean expand;
    @C17952c(mo34828a = "images")
    public List<UrlModel> imageList;
    @C17952c(mo34828a = "nickname")
    public String nickname;
    @C17952c(mo34828a = "rating")
    public double rating;
    @C17952c(mo34828a = "src")
    public String src;
    @C17952c(mo34828a = "url")
    public String url;

    public final String getCommentId() {
        return this.f99866b;
    }

    public final int getFeedType() {
        return 65442;
    }

    public final List<UrlModel> getImages() {
        return this.imageList;
    }

    public final String getPoiId() {
        return this.f99865a;
    }

    public final boolean hasDivider() {
        return this.f99867c;
    }

    public final void setFeedType(int i) {
    }

    public final void setCommentId(String str) {
        this.f99866b = str;
    }

    public final void setHasDivider(boolean z) {
        this.f99867c = z;
    }

    public final void setPoiId(String str) {
        this.f99865a = str;
    }
}
