package com.p683ss.android.ugc.aweme.sharer.p2171a;

import android.content.Context;
import com.facebook.messenger.C14530a;
import com.facebook.messenger.C14531b;
import com.p683ss.android.ugc.aweme.sharer.C42316d;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42309a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.n */
public final class C42281n extends C42316d {

    /* renamed from: a */
    public static final C42282a f106839a = new C42282a(null);

    /* renamed from: b */
    private final C42309a f106840b;

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.n$a */
    public static final class C42282a {
        private C42282a() {
        }

        public /* synthetic */ C42282a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.anq;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "messenger";
    }

    /* renamed from: c */
    public final String mo86137c() {
        return "Messenger";
    }

    /* renamed from: d */
    public final String mo86230d() {
        return "com.facebook.orca";
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.atv;
    }

    public C42281n(C42309a aVar) {
        C52711k.m112240b(aVar, "activityProvider");
        this.f106840b = aVar;
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        if (C14530a.m29755a(context)) {
            return super.mo86134a(jVar, context);
        }
        C14530a.m29756b(context);
        return true;
    }

    /* renamed from: a */
    public final boolean mo86133a(C42323i iVar, Context context) {
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        C14530a.m29753a(this.f106840b.mo60818a(), 12306, C14531b.m29758a(iVar.f106880b, "image/*").mo26778a());
        return true;
    }

    /* renamed from: a */
    public final boolean mo86135a(C42325k kVar, Context context) {
        C52711k.m112240b(kVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        C14530a.m29753a(this.f106840b.mo60818a(), 12306, C14531b.m29758a(kVar.f106888b, "video/*").mo26778a());
        return true;
    }
}
