package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15428c.C15429a;
import com.google.android.gms.common.internal.C15428c.C15430b;
import com.google.android.gms.internal.ads.amq.C15587a;
import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class aom implements C15429a, C15430b {

    /* renamed from: a */
    private apa f41168a;

    /* renamed from: b */
    private final String f41169b;

    /* renamed from: c */
    private final String f41170c;

    /* renamed from: d */
    private final LinkedBlockingQueue<C15587a> f41171d;

    /* renamed from: e */
    private final HandlerThread f41172e = new HandlerThread("GassClient");

    public aom(Context context, String str, String str2) {
        this.f41169b = str;
        this.f41170c = str2;
        this.f41172e.start();
        this.f41168a = new apa(context, this.f41172e.getLooper(), this, this);
        this.f41171d = new LinkedBlockingQueue<>();
        this.f41168a.mo28409l();
    }

    /* renamed from: b */
    public final C15587a mo29424b(int i) {
        C15587a aVar;
        try {
            aVar = (C15587a) this.f41171d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            aVar = null;
        }
        return aVar == null ? m33827c() : aVar;
    }

    /* renamed from: a */
    private final apd m33825a() {
        try {
            return this.f41168a.mo29433s();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo28416a(int i) {
        try {
            this.f41171d.put(m33827c());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        m33826b();
        r3.f41172e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.f41171d.put(m33827c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        m33826b();
        r3.f41172e.quit();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[ExcHandler: all (r4v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28417a(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.apd r4 = r3.m33825a()
            if (r4 == 0) goto L_0x0043
            com.google.android.gms.internal.ads.zzbqo r0 = new com.google.android.gms.internal.ads.zzbqo     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r1 = r3.f41169b     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r2 = r3.f41170c     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.zzbqq r4 = r4.mo29438a(r0)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.amq$a r4 = r4.mo31596a()     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.amq$a> r0 = r3.f41171d     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.put(r4)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r3.m33826b()
            android.os.HandlerThread r4 = r3.f41172e
            r4.quit()
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0031
        L_0x0027:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.amq$a> r4 = r3.f41171d     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            com.google.android.gms.internal.ads.amq$a r0 = m33827c()     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            goto L_0x003a
        L_0x0031:
            r3.m33826b()
            android.os.HandlerThread r0 = r3.f41172e
            r0.quit()
            throw r4
        L_0x003a:
            r3.m33826b()
            android.os.HandlerThread r4 = r3.f41172e
            r4.quit()
            return
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aom.mo28417a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo28418a(ConnectionResult connectionResult) {
        try {
            this.f41171d.put(m33827c());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    private final void m33826b() {
        if (this.f41168a == null) {
            return;
        }
        if (this.f41168a.mo28404g() || this.f41168a.mo28405h()) {
            this.f41168a.mo28403f();
        }
    }

    /* renamed from: c */
    private static C15587a m33827c() {
        C15588a c = C15587a.m33511c();
        c.mo29298j(32768);
        return (C15587a) ((axz) c.mo29832e());
    }
}
