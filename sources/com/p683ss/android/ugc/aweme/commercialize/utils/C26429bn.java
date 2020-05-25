package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27114h;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g.C27178a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27298a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bn */
public class C26429bn implements C27114h {

    /* renamed from: a */
    protected final Activity f69678a;

    /* renamed from: b */
    protected C27298a f69679b;

    /* renamed from: c */
    protected C27235d f69680c;

    /* renamed from: d */
    protected final C27182a f69681d;

    /* renamed from: e */
    protected final C27177g f69682e = C27178a.m65596a(this);

    /* renamed from: a */
    public final void mo54143a(CharSequence charSequence, boolean z) {
    }

    /* renamed from: a */
    public final void mo54144a(String str) {
    }

    /* renamed from: b */
    public final void mo54145b() {
    }

    /* renamed from: c */
    public final void mo54147c() {
    }

    /* renamed from: d */
    public final C27235d mo54148d() {
        return this.f69680c;
    }

    /* renamed from: e */
    public final C27298a mo54149e() {
        return this.f69679b;
    }

    public Context getContext() {
        return this.f69678a;
    }

    public C27177g getCrossPlatformBusiness() {
        return this.f69682e;
    }

    public C27182a getCrossPlatformParams() {
        return this.f69681d;
    }

    /* renamed from: f */
    public final void mo54150f() {
        this.f69679b.mo54150f();
    }

    /* renamed from: g */
    public final boolean mo54151g() {
        return this.f69679b.mo54151g();
    }

    /* renamed from: b */
    public final void mo54146b(String str) {
        ((C27309j) this.f69679b.mo55670a(C27309j.class)).mo55730a(str);
    }

    public C26429bn(Activity activity, C27298a aVar, C27235d dVar, C27182a aVar2) {
        this.f69678a = activity;
        this.f69679b = aVar;
        this.f69680c = dVar;
        this.f69681d = aVar2;
    }
}
