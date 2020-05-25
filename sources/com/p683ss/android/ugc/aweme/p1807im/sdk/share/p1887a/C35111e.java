package com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c.C35109a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.e */
final /* synthetic */ class C35111e implements C35109a {

    /* renamed from: a */
    private final Context f90295a;

    /* renamed from: b */
    private final List f90296b;

    /* renamed from: c */
    private final SharePackage f90297c;

    /* renamed from: d */
    private final BaseContent f90298d;

    /* renamed from: e */
    private final C23371a f90299e;

    C35111e(Context context, List list, SharePackage sharePackage, BaseContent baseContent, C23371a aVar) {
        this.f90295a = context;
        this.f90296b = list;
        this.f90297c = sharePackage;
        this.f90298d = baseContent;
        this.f90299e = aVar;
    }

    public final void onShare(String str) {
        Context context = this.f90295a;
        C35114h hVar = new C35114h(this.f90296b, str, this.f90297c, this.f90298d, this.f90299e);
        new C33220b(context, hVar).sendMsg();
    }
}
