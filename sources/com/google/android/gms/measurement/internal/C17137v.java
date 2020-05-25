package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.C15514e;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.v */
public final class C17137v extends C17091ec {

    /* renamed from: a */
    final SSLSocketFactory f48467a;

    public C17137v(C17092ed edVar) {
        super(edVar);
        this.f48467a = VERSION.SDK_INT < 19 ? new C17103en() : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32904d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo33380e() {
        NetworkInfo networkInfo;
        mo33089j();
        try {
            networkInfo = C17138w.m42042a((ConnectivityManager) mo32850m().getSystemService("connectivity"));
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static byte[] m42024a(java.net.HttpURLConnection r5) throws java.io.IOException {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x003c }
            r1.<init>()     // Catch:{ all -> 0x003c }
            r2 = r5
            java.net.URLConnection r2 = (java.net.URLConnection) r2     // Catch:{ all -> 0x003c }
            boolean r3 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r2)     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x001a
            java.net.URL r3 = r2.getURL()     // Catch:{ all -> 0x003c }
            java.lang.String r2 = r2.getContentType()     // Catch:{ all -> 0x003c }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r3, r0, r0, r2)     // Catch:{ all -> 0x003c }
        L_0x001a:
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ all -> 0x003c }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
        L_0x0022:
            int r2 = r5.read(r0)     // Catch:{ all -> 0x0037 }
            if (r2 <= 0) goto L_0x002d
            r3 = 0
            r1.write(r0, r3, r2)     // Catch:{ all -> 0x0037 }
            goto L_0x0022
        L_0x002d:
            byte[] r0 = r1.toByteArray()     // Catch:{ all -> 0x0037 }
            if (r5 == 0) goto L_0x0036
            r5.close()
        L_0x0036:
            return r0
        L_0x0037:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x003d
        L_0x003c:
            r5 = move-exception
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r0.close()
        L_0x0042:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17137v.m42024a(java.net.HttpURLConnection):byte[]");
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C17099ej mo32906f() {
        return super.mo32906f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C17107er mo32908g() {
        return super.mo32908g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C17113ex mo32910h() {
        return super.mo32910h();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32834a() {
        super.mo32834a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32838b() {
        super.mo32838b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo32840c() {
        super.mo32840c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C17007b mo32848k() {
        return super.mo32848k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15514e mo32849l() {
        return super.mo32849l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo32850m() {
        return super.mo32850m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C17131p mo32851n() {
        return super.mo32851n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C17102em mo32852o() {
        return super.mo32852o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C17000at mo32853p() {
        return super.mo32853p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C17133r mo32854q() {
        return super.mo32854q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16986af mo32855r() {
        return super.mo32855r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C17110eu mo32856s() {
        return super.mo32856s();
    }
}
