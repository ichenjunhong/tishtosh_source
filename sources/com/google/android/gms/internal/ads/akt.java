package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.api.C15239h;
import java.lang.ref.WeakReference;
import java.util.Map;

@C16299uq
public abstract class akt implements C15239h {

    /* renamed from: a */
    protected Context f40782a;

    /* renamed from: b */
    protected String f40783b;

    /* renamed from: c */
    protected WeakReference<aib> f40784c;

    public akt(aib aib) {
        this.f40782a = aib.getContext();
        this.f40783b = C14963ax.m30831a().mo28670b(this.f40782a, aib.mo28944k().f46237a);
        this.f40784c = new WeakReference<>(aib);
    }

    /* renamed from: a */
    public abstract void mo29088a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29089a(int i) {
    }

    /* renamed from: a */
    public abstract boolean mo29093a(String str);

    /* renamed from: b */
    public void mo28127b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29096b(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo29097c(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo29098d(int i) {
    }

    /* renamed from: a */
    public boolean mo29094a(String str, String[] strArr) {
        return mo29093a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29090a(String str, String str2, int i) {
        aes.f40377a.post(new akz(this, str, str2, i));
    }

    /* renamed from: a */
    public final void mo29091a(String str, String str2, long j) {
        Handler handler = aes.f40377a;
        ala ala = new ala(this, str, str2, j);
        handler.post(ala);
    }

    /* renamed from: a */
    public final void mo29092a(String str, String str2, String str3, String str4) {
        Handler handler = aes.f40377a;
        alb alb = new alb(this, str, str2, str3, str4);
        handler.post(alb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo29095b(String str) {
        return aes.m32751a(str);
    }

    /* renamed from: a */
    static /* synthetic */ void m33179a(akt akt, String str, Map map) {
        aib aib = (aib) akt.f40784c.get();
        if (aib != null) {
            aib.mo29242a(str, map);
        }
    }
}
