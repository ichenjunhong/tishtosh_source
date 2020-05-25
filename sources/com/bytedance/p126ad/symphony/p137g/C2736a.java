package com.bytedance.p126ad.symphony.p137g;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.bytedance.p126ad.symphony.C2715d;
import com.bytedance.p126ad.symphony.p137g.C2737b.C2738a;
import com.bytedance.p126ad.symphony.p138h.C2739a;
import com.bytedance.p126ad.symphony.p139i.C2747f;
import com.bytedance.p126ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.p126ad.symphony.provider.C2752b;
import com.bytedance.p126ad.symphony.provider.C2752b.C2753a;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ad.symphony.g.a */
public class C2736a implements C2737b, C2738a {

    /* renamed from: b */
    private static final String f8266b = "a";

    /* renamed from: c */
    private String f8267c;

    /* renamed from: d */
    private List<C2737b> f8268d = new LinkedList();

    /* renamed from: e */
    private C2753a f8269e;

    /* renamed from: f */
    private C2752b f8270f;

    /* renamed from: g */
    private int f8271g;

    /* renamed from: h */
    private long f8272h;

    /* renamed from: i */
    private AtomicInteger f8273i = new AtomicInteger(0);

    /* renamed from: j */
    private boolean f8274j;

    /* renamed from: k */
    private C2739a f8275k;

    /* renamed from: d */
    public final int mo7291d() {
        return this.f8271g;
    }

    /* renamed from: e */
    public final List<C2737b> mo7292e() {
        return this.f8268d;
    }

    /* renamed from: a */
    public final void mo7284a() {
        this.f8273i.getAndAdd(1);
    }

    /* renamed from: b */
    public final int mo7289b() {
        return this.f8273i.decrementAndGet();
    }

    /* renamed from: c */
    public final void mo7290c() {
        if (this.f8270f != null) {
            this.f8270f.tryPreloadAd(this.f8267c, this.f8275k, this);
        }
    }

    /* renamed from: a */
    public final void mo7285a(C2737b bVar) {
        this.f8268d.add(bVar);
    }

    /* renamed from: a */
    public final void mo7286a(String str) {
        C2747f.m7838a();
        if (this.f8269e != null) {
            this.f8269e.mo7260a(str);
        }
    }

    /* renamed from: a */
    public final boolean mo7288a(Context context) {
        if (!AbsNativeAdProvider.isAdMobNativeAdProvider(this.f8271g) || VERSION.SDK_INT < 21) {
            return true;
        }
        try {
            if (context.getPackageManager().getPackageInfo("com.google.android.webview", 1) != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C2715d.m7770a(e);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo7287a(String str, String str2) {
        C2747f.m7838a();
        if (this.f8269e != null) {
            C2753a aVar = this.f8269e;
            String str3 = this.f8267c;
            int i = this.f8271g;
            double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - this.f8272h);
            Double.isNaN(elapsedRealtime);
            aVar.mo7261a(str3, str, i, str2, elapsedRealtime / 1000.0d);
            if (this.f8268d.isEmpty() && !this.f8274j) {
                this.f8269e.mo7260a(this.f8267c);
            }
        }
        if (!this.f8274j) {
            if (!this.f8268d.isEmpty()) {
                for (C2737b bVar : this.f8268d) {
                    if (bVar.mo7289b() == 0) {
                        bVar.mo7290c();
                    }
                }
                this.f8268d.clear();
            }
            if ("Request Timeout".equals(str2)) {
                this.f8274j = true;
            }
        }
    }

    public C2736a(String str, C2752b bVar, C2739a aVar, C2753a aVar2) {
        this.f8267c = str;
        this.f8269e = aVar2;
        this.f8270f = bVar;
        this.f8271g = this.f8270f.getProviderId();
        this.f8272h = SystemClock.elapsedRealtime();
        this.f8275k = aVar;
    }
}
