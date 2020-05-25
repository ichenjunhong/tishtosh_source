package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.internal.scribe.C52144aa;
import com.twitter.sdk.android.core.internal.scribe.C52158e.C52159a;
import java.util.ArrayList;

/* renamed from: com.twitter.sdk.android.tweetui.d */
public final class C52266d implements C52265c {

    /* renamed from: a */
    final C52312r f130134a;

    /* renamed from: a */
    public final void mo109023a() {
        this.f130134a.mo109123a(new C52159a().mo108873a("tfw").mo108875b("android").mo108876c("gallery").mo108879f("show").mo108874a());
    }

    /* renamed from: b */
    public final void mo109025b() {
        this.f130134a.mo109123a(new C52159a().mo108873a("tfw").mo108875b("android").mo108876c("gallery").mo108879f("navigate").mo108874a());
    }

    public final void dismiss() {
        this.f130134a.mo109123a(new C52159a().mo108873a("tfw").mo108875b("android").mo108876c("gallery").mo108879f("dismiss").mo108874a());
    }

    public C52266d(C52312r rVar) {
        this.f130134a = rVar;
    }

    /* renamed from: a */
    public final void mo109024a(C52144aa aaVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(aaVar);
        this.f130134a.mo109122a(new C52159a().mo108873a("tfw").mo108875b("android").mo108876c("gallery").mo108879f("impression").mo108874a(), arrayList);
    }
}
