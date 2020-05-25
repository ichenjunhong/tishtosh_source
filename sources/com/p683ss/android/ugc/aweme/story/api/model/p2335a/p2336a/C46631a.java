package com.p683ss.android.ugc.aweme.story.api.model.p2335a.p2336a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.api.model.a.a.a */
public final class C46631a implements Serializable {
    @C17952c(mo34828a = "ad_id")

    /* renamed from: a */
    private long f117633a;
    @C17952c(mo34828a = "ad_name")

    /* renamed from: b */
    private String f117634b;
    @C17952c(mo34828a = "jump_url")

    /* renamed from: c */
    private String f117635c;
    @C17952c(mo34828a = "pic_url")

    /* renamed from: d */
    private List<UrlModel> f117636d;
    @C17952c(mo34828a = "is_high_level")

    /* renamed from: e */
    private boolean f117637e;

    public final String getAdName() {
        return this.f117634b;
    }

    public final long getId() {
        return this.f117633a;
    }

    public final String getJumpUrl() {
        return this.f117635c;
    }

    public final List<UrlModel> getPicUrlList() {
        return this.f117636d;
    }

    public final boolean isHighLevel() {
        return this.f117637e;
    }

    public final C46631a setAdName(String str) {
        this.f117634b = str;
        return this;
    }

    public final C46631a setHighLevel(boolean z) {
        this.f117637e = z;
        return this;
    }

    public final C46631a setId(long j) {
        this.f117633a = j;
        return this;
    }

    public final C46631a setJumpUrl(String str) {
        this.f117635c = str;
        return this;
    }

    public final C46631a setPicUrlList(List<UrlModel> list) {
        this.f117636d = list;
        return this;
    }
}
