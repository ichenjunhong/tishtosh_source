package net.openid.appauth.p2680a;

import android.content.Context;
import android.support.customtabs.C0367b;
import android.support.customtabs.C0376d;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import net.openid.appauth.p2682c.C53455a;

/* renamed from: net.openid.appauth.a.e */
public final class C53447e {

    /* renamed from: a */
    public final AtomicReference<C0367b> f132171a = new AtomicReference<>();

    /* renamed from: b */
    public final CountDownLatch f132172b = new CountDownLatch(1);

    /* renamed from: c */
    private final WeakReference<Context> f132173c;

    /* renamed from: d */
    private C0376d f132174d;

    /* renamed from: a */
    public final C0367b mo111202a() {
        try {
            this.f132172b.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            C53455a.m113514b("Interrupted while waiting for browser connection", new Object[0]);
            this.f132172b.countDown();
        }
        return (C0367b) this.f132171a.get();
    }

    public C53447e(Context context) {
        this.f132173c = new WeakReference<>(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo111203a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.support.customtabs.d r0 = r2.f132174d     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            net.openid.appauth.a.e$1 r0 = new net.openid.appauth.a.e$1     // Catch:{ all -> 0x002f }
            r0.<init>()     // Catch:{ all -> 0x002f }
            r2.f132174d = r0     // Catch:{ all -> 0x002f }
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.f132173c     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x002f }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0020
            android.support.customtabs.d r1 = r2.f132174d     // Catch:{ all -> 0x002f }
            boolean r3 = android.support.customtabs.C0367b.m917a(r0, r3, r1)     // Catch:{ all -> 0x002f }
            if (r3 != 0) goto L_0x002d
        L_0x0020:
            java.lang.String r3 = "Unable to bind custom tabs service"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x002f }
            net.openid.appauth.p2682c.C53455a.m113514b(r3, r0)     // Catch:{ all -> 0x002f }
            java.util.concurrent.CountDownLatch r3 = r2.f132172b     // Catch:{ all -> 0x002f }
            r3.countDown()     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r2)
            return
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.p2680a.C53447e.mo111203a(java.lang.String):void");
    }
}
