package com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.a.a.c */
public final class C29387c implements Serializable {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    private long f76972a;
    @C17952c(mo34828a = "display_name")

    /* renamed from: b */
    private String f76973b = "";
    @C17952c(mo34828a = "version")

    /* renamed from: c */
    private long f76974c;
    @C17952c(mo34828a = "mini_cover")

    /* renamed from: d */
    private String f76975d = "";
    @C17952c(mo34828a = "stickers")

    /* renamed from: e */
    private List<C29385a> f76976e;

    /* renamed from: f */
    private String f76977f = "";

    /* renamed from: g */
    private String f76978g = "";

    /* renamed from: h */
    private String f76979h = "";

    public final String getDisplayName() {
        return this.f76973b;
    }

    public final long getId() {
        return this.f76972a;
    }

    public final String getMd5() {
        return this.f76977f;
    }

    public final String getMiniCover() {
        return this.f76975d;
    }

    public final String getPicFileDirPath() {
        return this.f76979h;
    }

    public final String getResDirPath() {
        return this.f76978g;
    }

    public final List<C29385a> getStickers() {
        return this.f76976e;
    }

    public final long getVersion() {
        return this.f76974c;
    }

    public final String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder("OnlineSmallEmojiResInfo{md5=");
        sb.append(this.f76977f);
        sb.append(", resDirPath=");
        sb.append(this.f76978g);
        sb.append(", picFilePath=");
        sb.append(this.f76979h);
        sb.append(", stickers=");
        List<C29385a> list = this.f76976e;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append('}');
        return sb.toString();
    }

    public final boolean isValid() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Collection collection = this.f76976e;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.f76977f.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.f76978g.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (this.f76979h.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void setDisplayName(String str) {
        this.f76973b = str;
    }

    public final void setId(long j) {
        this.f76972a = j;
    }

    public final void setMiniCover(String str) {
        this.f76975d = str;
    }

    public final void setStickers(List<C29385a> list) {
        this.f76976e = list;
    }

    public final void setVersion(long j) {
        this.f76974c = j;
    }

    public final void setMd5(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f76977f = str;
    }

    public final void setPicFileDirPath(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f76979h = str;
    }

    public final void setResDirPath(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f76978g = str;
    }
}
