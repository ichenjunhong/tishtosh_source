package com.p683ss.android.ugc.aweme.commercialize.egg.p1557b;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25751b;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.a */
public abstract class C25752a {

    /* renamed from: d */
    public final Context f68101d;

    /* renamed from: e */
    public C25751b f68102e;

    /* renamed from: f */
    public C25746b f68103f;

    /* renamed from: g */
    public int f68104g = 1;

    /* renamed from: h */
    public boolean f68105h = true;

    /* renamed from: i */
    public final CommerceEggLayout f68106i;

    /* renamed from: a */
    public abstract void mo52951a();

    /* renamed from: b */
    public abstract void mo52953b();

    /* renamed from: c */
    public final void mo52954c() {
        m62345a(true, null);
    }

    public C25752a(CommerceEggLayout commerceEggLayout) {
        C52711k.m112240b(commerceEggLayout, "eggLayout");
        this.f68106i = commerceEggLayout;
        Context context = this.f68106i.getContext();
        C52711k.m112236a((Object) context, "eggLayout.context");
        this.f68101d = context;
    }

    /* renamed from: a */
    public final void mo52952a(String str) {
        m62345a(false, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m62345a(boolean z, String str) {
        C25945k.m62932w().mo53030a(this.f68102e, z, str);
    }
}
