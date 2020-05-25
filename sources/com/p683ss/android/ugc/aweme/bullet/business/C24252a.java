package com.p683ss.android.ugc.aweme.bullet.business;

import android.app.Activity;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.p649b.C10492a;
import com.bytedance.ies.bullet.p628b.p641h.C10345a;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.p683ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24302c;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.a */
public final class C24252a implements C24254b {

    /* renamed from: a */
    C10345a f64359a;

    /* renamed from: b */
    private WeakReference<Activity> f64360b;

    /* renamed from: c */
    private C10578a f64361c;

    /* renamed from: d */
    private C24302c f64362d;

    /* renamed from: e */
    private C10492a f64363e;

    /* renamed from: f */
    private WebView f64364f;

    /* renamed from: g */
    private boolean f64365g = true;

    /* renamed from: h */
    private final BulletBusinessService f64366h = new BulletBusinessService(this);

    /* renamed from: b */
    public final C10578a mo50019b() {
        return this.f64361c;
    }

    /* renamed from: c */
    public final C10492a mo50020c() {
        return this.f64363e;
    }

    /* renamed from: d */
    public final WebView mo50021d() {
        return this.f64364f;
    }

    /* renamed from: e */
    public final boolean mo50022e() {
        return this.f64365g;
    }

    /* renamed from: a */
    public final Activity mo50010a() {
        WeakReference<Activity> weakReference = this.f64360b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo50013a(WebView webView) {
        this.f64364f = webView;
    }

    /* renamed from: a */
    public final void mo50012a(Activity activity) {
        this.f64360b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public final <T extends Business> T mo50011a(Class<T> cls) {
        C52711k.m112240b(cls, "_cls");
        return this.f64366h.mo49980a(cls);
    }

    /* renamed from: a */
    public final void mo50014a(C10345a aVar) {
        this.f64359a = aVar;
    }

    /* renamed from: a */
    public final void mo50015a(C10492a aVar) {
        this.f64363e = aVar;
    }

    /* renamed from: a */
    public final void mo50016a(C10578a aVar) {
        C52711k.m112240b(aVar, "params");
        this.f64361c = aVar;
    }

    /* renamed from: a */
    public final void mo50017a(C24302c cVar) {
        this.f64362d = cVar;
    }

    /* renamed from: a */
    public final void mo50018a(boolean z) {
        this.f64365g = false;
    }
}
