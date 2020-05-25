package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.p030v4.p038f.C0800n;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C15893fp;
import com.google.android.gms.internal.ads.C15897ft;
import com.google.android.gms.internal.ads.C15900fw;
import com.google.android.gms.internal.ads.C15903fz;
import com.google.android.gms.internal.ads.C15907gc;
import com.google.android.gms.internal.ads.C15909ge;
import com.google.android.gms.internal.ads.C15994ji;
import com.google.android.gms.internal.ads.C16134on;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16309v;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.cal;
import com.google.android.gms.internal.ads.cap;
import com.google.android.gms.internal.ads.zzafl;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.j */
public final class C14998j extends cap {

    /* renamed from: a */
    final C15994ji f38714a;

    /* renamed from: b */
    final C15907gc f38715b;

    /* renamed from: c */
    private final Context f38716c;

    /* renamed from: d */
    private final cal f38717d;

    /* renamed from: e */
    private final C16134on f38718e;

    /* renamed from: f */
    private final C15893fp f38719f;

    /* renamed from: g */
    private final C15909ge f38720g;

    /* renamed from: h */
    private final C15897ft f38721h;

    /* renamed from: i */
    private final zzyz f38722i;

    /* renamed from: j */
    private final PublisherAdViewOptions f38723j;

    /* renamed from: k */
    private final C0800n<String, C15903fz> f38724k;

    /* renamed from: l */
    private final C0800n<String, C15900fw> f38725l;

    /* renamed from: m */
    private final zzafl f38726m;

    /* renamed from: n */
    private final zzaks f38727n;

    /* renamed from: o */
    private final C16309v f38728o;

    /* renamed from: p */
    private final String f38729p;

    /* renamed from: q */
    private final zzbgz f38730q;

    /* renamed from: r */
    private WeakReference<C14967ba> f38731r;

    /* renamed from: s */
    private final C14986bt f38732s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Object f38733t = new Object();

    C14998j(Context context, String str, C16134on onVar, zzbgz zzbgz, cal cal, C15893fp fpVar, C15909ge geVar, C15994ji jiVar, C15897ft ftVar, C0800n<String, C15903fz> nVar, C0800n<String, C15900fw> nVar2, zzafl zzafl, zzaks zzaks, C16309v vVar, C14986bt btVar, C15907gc gcVar, zzyz zzyz, PublisherAdViewOptions publisherAdViewOptions) {
        this.f38716c = context;
        this.f38729p = str;
        this.f38718e = onVar;
        this.f38730q = zzbgz;
        this.f38717d = cal;
        this.f38721h = ftVar;
        this.f38719f = fpVar;
        this.f38720g = geVar;
        this.f38714a = jiVar;
        this.f38724k = nVar;
        this.f38725l = nVar2;
        this.f38726m = zzafl;
        this.f38727n = zzaks;
        this.f38728o = vVar;
        this.f38732s = btVar;
        this.f38715b = gcVar;
        this.f38722i = zzyz;
        this.f38723j = publisherAdViewOptions;
        C15740bx.m36941a(this.f38716c);
    }

    /* renamed from: a */
    public final void mo27642a(zzyv zzyv) {
        m30978a((Runnable) new C14999k(this, zzyv));
    }

    /* renamed from: a */
    public final void mo27643a(zzyv zzyv, int i) {
        if (i > 0) {
            m30978a((Runnable) new C15000l(this, zzyv, i));
            return;
        }
        throw new IllegalArgumentException("Number of ads has to be more than 0");
    }

    /* renamed from: d */
    private final boolean m30979d() {
        return (this.f38719f == null && this.f38721h == null && this.f38720g == null && (this.f38724k == null || this.f38724k.size() <= 0)) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo27641a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f38733t
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f38731r     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f38731r     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.ba r1 = (com.google.android.gms.ads.internal.C14967ba) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.mo27551a()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14998j.mo27641a():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo27644b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f38733t
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f38731r     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f38731r     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.ba r1 = (com.google.android.gms.ads.internal.C14967ba) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.mo27550B_()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14998j.mo27644b():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27645c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f38733t
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f38731r     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f38731r     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.ba r1 = (com.google.android.gms.ads.internal.C14967ba) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r2 = r1.mo27494p()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14998j.mo27645c():boolean");
    }

    /* renamed from: e */
    private final List<String> m30980e() {
        ArrayList arrayList = new ArrayList();
        if (this.f38721h != null) {
            arrayList.add("1");
        }
        if (this.f38719f != null) {
            arrayList.add("2");
        }
        if (this.f38720g != null) {
            arrayList.add("6");
        }
        if (this.f38724k.size() > 0) {
            arrayList.add("3");
        }
        if (this.f38714a != null) {
            arrayList.add("2");
            arrayList.add("1");
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m30978a(Runnable runnable) {
        acd.f40245a.post(runnable);
    }

    /* renamed from: a */
    static /* synthetic */ void m30976a(C14998j jVar, zzyv zzyv) {
        C14980bn bnVar = new C14980bn(jVar.f38716c, jVar.f38732s, jVar.f38722i, jVar.f38729p, jVar.f38718e, jVar.f38730q);
        jVar.f38731r = new WeakReference<>(bnVar);
        C15907gc gcVar = jVar.f38715b;
        C15464q.m32132b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
        bnVar.f38501e.f38608B = gcVar;
        if (jVar.f38723j != null) {
            if (jVar.f38723j.f38469b != null) {
                bnVar.mo27461a(jVar.f38723j.f38469b);
            }
            bnVar.mo27475a(jVar.f38723j.f38468a);
        }
        C15893fp fpVar = jVar.f38719f;
        C15464q.m32132b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        bnVar.f38501e.f38644r = fpVar;
        C15909ge geVar = jVar.f38720g;
        C15464q.m32132b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
        bnVar.f38501e.f38646t = geVar;
        C15897ft ftVar = jVar.f38721h;
        C15464q.m32132b("setOnContentAdLoadedListener must be called on the main UI thread.");
        bnVar.f38501e.f38645s = ftVar;
        C0800n<String, C15903fz> nVar = jVar.f38724k;
        C15464q.m32132b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        bnVar.f38501e.f38649w = nVar;
        C0800n<String, C15900fw> nVar2 = jVar.f38725l;
        C15464q.m32132b("setOnCustomClickListener must be called on the main UI thread.");
        bnVar.f38501e.f38648v = nVar2;
        zzafl zzafl = jVar.f38726m;
        C15464q.m32132b("setNativeAdOptions must be called on the main UI thread.");
        bnVar.f38501e.f38650x = zzafl;
        bnVar.mo27613b(jVar.m30980e());
        bnVar.mo27457a(jVar.f38717d);
        bnVar.mo27464a(jVar.f38728o);
        ArrayList arrayList = new ArrayList();
        if (jVar.m30979d()) {
            arrayList.add(Integer.valueOf(1));
        }
        if (jVar.f38715b != null) {
            arrayList.add(Integer.valueOf(2));
        }
        bnVar.mo27614c((List<Integer>) arrayList);
        if (jVar.m30979d()) {
            zzyv.f46319c.putBoolean("ina", true);
        }
        if (jVar.f38715b != null) {
            zzyv.f46319c.putBoolean("iba", true);
        }
        bnVar.mo27482b(zzyv);
    }

    /* renamed from: a */
    static /* synthetic */ void m30977a(C14998j jVar, zzyv zzyv, int i) {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44288bV)).booleanValue() || jVar.f38714a == null) {
            C14943ad adVar = new C14943ad(jVar.f38716c, jVar.f38732s, zzyz.m39303a(jVar.f38716c), jVar.f38729p, jVar.f38718e, jVar.f38730q);
            jVar.f38731r = new WeakReference<>(adVar);
            C15893fp fpVar = jVar.f38719f;
            C15464q.m32132b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            adVar.f38501e.f38644r = fpVar;
            C15909ge geVar = jVar.f38720g;
            C15464q.m32132b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            adVar.f38501e.f38646t = geVar;
            C15994ji jiVar = jVar.f38714a;
            C15464q.m32132b("#008 Must be called on the main UI thread.: setInstreamAdLoadCallback");
            adVar.f38501e.f38647u = jiVar;
            C15897ft ftVar = jVar.f38721h;
            C15464q.m32132b("setOnContentAdLoadedListener must be called on the main UI thread.");
            adVar.f38501e.f38645s = ftVar;
            C0800n<String, C15903fz> nVar = jVar.f38724k;
            C15464q.m32132b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            adVar.f38501e.f38649w = nVar;
            adVar.mo27457a(jVar.f38717d);
            C0800n<String, C15900fw> nVar2 = jVar.f38725l;
            C15464q.m32132b("setOnCustomClickListener must be called on the main UI thread.");
            adVar.f38501e.f38648v = nVar2;
            adVar.mo27529b(jVar.m30980e());
            zzafl zzafl = jVar.f38726m;
            C15464q.m32132b("setNativeAdOptions must be called on the main UI thread.");
            adVar.f38501e.f38650x = zzafl;
            zzaks zzaks = jVar.f38727n;
            C15464q.m32132b("#008 Must be called on the main UI thread.: setInstreamAdConfiguration");
            adVar.f38501e.f38652z = zzaks;
            adVar.mo27464a(jVar.f38728o);
            C15464q.m32132b("setMaxNumberOfAds must be called on the main UI thread.");
            adVar.f38517m = i;
            adVar.mo27482b(zzyv);
            return;
        }
        if (jVar.f38717d != null) {
            try {
                jVar.f38717d.mo30870a(0);
            } catch (RemoteException e) {
                abv.m32795c("Failed calling onAdFailedToLoad.", e);
            }
        }
    }
}
