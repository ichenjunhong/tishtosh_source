package com.p683ss.android.ugc.aweme.poi.model.p2062a;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.a.f */
public final class C39092f implements Serializable {
    @C17952c(mo34828a = "class_option")

    /* renamed from: a */
    C39093g f99701a;
    @C17952c(mo34828a = "business_area_option")

    /* renamed from: b */
    C39093g f99702b;
    @C17952c(mo34828a = "title")

    /* renamed from: c */
    String f99703c;
    @C17952c(mo34828a = "description")

    /* renamed from: d */
    String f99704d;
    @C17952c(mo34828a = "banner_url")

    /* renamed from: e */
    UrlModel f99705e;
    @C17952c(mo34828a = "notch_banner_url")

    /* renamed from: f */
    UrlModel f99706f;
    @C17952c(mo34828a = "height")

    /* renamed from: g */
    int f99707g;
    @C17952c(mo34828a = "width")

    /* renamed from: h */
    int f99708h;
    @C17952c(mo34828a = "schema")

    /* renamed from: i */
    String f99709i;
    @C17952c(mo34828a = "bid")

    /* renamed from: j */
    String f99710j;
    @C17952c(mo34828a = "tag_list")

    /* renamed from: k */
    List<C39089c> f99711k;
    @C17952c(mo34828a = "district_code")

    /* renamed from: l */
    String f99712l;
    @C17952c(mo34828a = "explanation")

    /* renamed from: m */
    String f99713m;
    @C17952c(mo34828a = "banner_extra")

    /* renamed from: n */
    C39088b f99714n;

    public final UrlModel getBannerUrl() {
        return this.f99705e;
    }

    public final String getBid() {
        return this.f99710j;
    }

    public final C39093g getBusinessAreaOption() {
        return this.f99702b;
    }

    public final C39093g getClassOption() {
        return this.f99701a;
    }

    public final String getDescription() {
        return this.f99704d;
    }

    public final String getDistrictCode() {
        return this.f99712l;
    }

    public final String getExplanation() {
        return this.f99713m;
    }

    public final int getHeight() {
        return this.f99707g;
    }

    public final UrlModel getNotchBannerUrl() {
        return this.f99706f;
    }

    public final C39088b getPoiBannerExtra() {
        return this.f99714n;
    }

    public final String getSchema() {
        return this.f99709i;
    }

    public final String getTitle() {
        return this.f99703c;
    }

    public final int getWidth() {
        return this.f99708h;
    }

    public final String getTag() {
        if (C9376b.m18558a((Collection<T>) this.f99711k)) {
            return "";
        }
        return ((C39089c) this.f99711k.get(0)).f99689a;
    }

    public final void setPoiBannerExtra(C39088b bVar) {
        this.f99714n = bVar;
    }

    public final void updateSchema(String str) {
        this.f99709i = str;
    }
}
