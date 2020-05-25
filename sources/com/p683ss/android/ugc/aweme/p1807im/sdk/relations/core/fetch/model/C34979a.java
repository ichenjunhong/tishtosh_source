package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.model.a */
public final class C34979a extends IMContact {

    /* renamed from: a */
    private final String f90001a;

    public final UrlModel getDisplayAvatar() {
        return null;
    }

    public final String getDisplayName() {
        return "";
    }

    public final String getNickName() {
        return "";
    }

    public final String getNotice() {
        return this.f90001a;
    }

    public final String getUserName() {
        return "";
    }

    public final String toUidString() {
        return "";
    }

    public C34979a(String str) {
        C52711k.m112240b(str, "notice");
        this.f90001a = str;
    }
}
