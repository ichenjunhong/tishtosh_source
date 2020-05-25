package com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a;

import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.h */
final /* synthetic */ class C35114h implements C33242d {

    /* renamed from: a */
    private final List f90302a;

    /* renamed from: b */
    private final String f90303b;

    /* renamed from: c */
    private final SharePackage f90304c;

    /* renamed from: d */
    private final BaseContent f90305d;

    /* renamed from: e */
    private final C23371a f90306e;

    C35114h(List list, String str, SharePackage sharePackage, BaseContent baseContent, C23371a aVar) {
        this.f90302a = list;
        this.f90303b = str;
        this.f90304c = sharePackage;
        this.f90305d = baseContent;
        this.f90306e = aVar;
    }

    public final void sendMsg() {
        List list = this.f90302a;
        String str = this.f90303b;
        SharePackage sharePackage = this.f90304c;
        BaseContent baseContent = this.f90305d;
        C23371a aVar = this.f90306e;
        C35106c.m79332a(list, str, sharePackage, baseContent, (String) null);
        if (aVar != null) {
            aVar.run(Boolean.valueOf(true));
        }
    }
}
