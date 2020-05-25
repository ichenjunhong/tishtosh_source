package com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.d.a.b */
public final class C36831b implements Serializable {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    private String f94139a;
    @C17952c(mo34828a = "name")

    /* renamed from: b */
    private String f94140b;
    @C17952c(mo34828a = "type")

    /* renamed from: c */
    private Integer f94141c;
    @C17952c(mo34828a = "play_cnt")

    /* renamed from: d */
    private Long f94142d = Long.valueOf(0);
    @C17952c(mo34828a = "poster")

    /* renamed from: e */
    private UrlModel f94143e;

    public final String getId() {
        return this.f94139a;
    }

    public final String getName() {
        return this.f94140b;
    }

    public final Long getPlayCnt() {
        return this.f94142d;
    }

    public final UrlModel getPoster() {
        return this.f94143e;
    }

    public final Integer getType() {
        return this.f94141c;
    }

    public final void setId(String str) {
        this.f94139a = str;
    }

    public final void setName(String str) {
        this.f94140b = str;
    }

    public final void setPlayCnt(Long l) {
        this.f94142d = l;
    }

    public final void setPoster(UrlModel urlModel) {
        this.f94143e = urlModel;
    }

    public final void setType(Integer num) {
        this.f94141c = num;
    }
}
