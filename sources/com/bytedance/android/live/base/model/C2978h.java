package com.bytedance.android.live.base.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.h */
public final class C2978h {
    @C17952c(mo34828a = "uri")

    /* renamed from: a */
    public String f8729a;
    @C17952c(mo34828a = "url_list")

    /* renamed from: b */
    public List<String> f8730b;

    /* renamed from: a */
    public final ImageModel mo7701a() {
        return new ImageModel(this.f8729a, this.f8730b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UrlStruct{uri='");
        sb.append(this.f8729a);
        sb.append('\'');
        sb.append(", urlList=");
        sb.append(this.f8730b);
        sb.append('}');
        return sb.toString();
    }
}
