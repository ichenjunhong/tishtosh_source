package com.p683ss.android.ugc.aweme.share.improve.p2162b;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42098k;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b.c */
public final class C42136c extends C42132a {

    /* renamed from: b */
    public static final C42137a f106597b = new C42137a(null);

    /* renamed from: c */
    private final C42098k f106598c;

    /* renamed from: d */
    private final SharePackage f106599d;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.c$a */
    public static final class C42137a {
        private C42137a() {
        }

        public /* synthetic */ C42137a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.dxg;
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        return true;
    }

    /* renamed from: a */
    public final boolean mo86133a(C42323i iVar, Context context) {
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: a */
    public final boolean mo86135a(C42325k kVar, Context context) {
        C52711k.m112240b(kVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "download";
    }

    /* renamed from: c */
    public final String mo86137c() {
        String string = C11010c.m22280a().getString(this.f106598c.mo49953b());
        C52711k.m112236a((Object) string, "AppContextManager.getApp…downloadAction.labelId())");
        return string;
    }

    public C42136c(C42098k kVar, SharePackage sharePackage) {
        C52711k.m112240b(kVar, "downloadAction");
        C52711k.m112240b(sharePackage, "sharePackage");
        this.f106598c = kVar;
        this.f106599d = sharePackage;
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        this.f106598c.mo49950a(context, this.f106599d);
        return true;
    }
}
