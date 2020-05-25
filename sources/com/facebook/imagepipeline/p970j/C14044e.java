package com.facebook.imagepipeline.p970j;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.C2240a;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p923g.C13712j;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.common.C13949a;
import com.facebook.imageutils.C14256e;
import com.facebook.imageutils.C14261h;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.p955h.C13899b;
import com.facebook.p955h.C13900c;
import com.facebook.p955h.C13902d;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.j.e */
public class C14044e implements Closeable {

    /* renamed from: a */
    public final C13715a<C13709h> f36700a;

    /* renamed from: b */
    public final C13691k<FileInputStream> f36701b;

    /* renamed from: c */
    public C13900c f36702c;

    /* renamed from: d */
    public int f36703d;

    /* renamed from: e */
    public int f36704e;

    /* renamed from: f */
    public int f36705f;

    /* renamed from: g */
    public int f36706g;

    /* renamed from: h */
    public int f36707h;

    /* renamed from: i */
    public int f36708i;

    /* renamed from: j */
    public C13949a f36709j;

    /* renamed from: k */
    private ColorSpace f36710k;

    /* renamed from: l */
    private ColorSpace m28708l() {
        m28709m();
        return this.f36710k;
    }

    /* renamed from: b */
    public final C13715a<C13709h> mo26263b() {
        return C13715a.m27751b(this.f36700a);
    }

    public void close() {
        C13715a.m27752c(this.f36700a);
    }

    /* renamed from: e */
    public final int mo26268e() {
        m28709m();
        return this.f36703d;
    }

    /* renamed from: f */
    public final int mo26269f() {
        m28709m();
        return this.f36704e;
    }

    /* renamed from: g */
    public final int mo26270g() {
        m28709m();
        return this.f36705f;
    }

    /* renamed from: h */
    public final int mo26271h() {
        m28709m();
        return this.f36706g;
    }

    /* renamed from: m */
    private void m28709m() {
        if (this.f36705f < 0 || this.f36706g < 0) {
            mo26273j();
        }
    }

    /* renamed from: d */
    public final C13900c mo26267d() {
        m28709m();
        return this.f36702c;
    }

    /* renamed from: n */
    private Pair<Integer, Integer> m28710n() {
        Pair<Integer, Integer> a = C14261h.m29217a(mo26265c());
        if (a != null) {
            this.f36705f = ((Integer) a.first).intValue();
            this.f36706g = ((Integer) a.second).intValue();
        }
        return a;
    }

    /* renamed from: a */
    public final synchronized boolean mo26262a() {
        boolean z;
        if (C13715a.m27750a(this.f36700a) || this.f36701b != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: i */
    public final int mo26272i() {
        if (this.f36700a == null || this.f36700a.mo25630a() == null) {
            return this.f36708i;
        }
        return ((C13709h) this.f36700a.mo25630a()).mo25608a();
    }

    /* renamed from: k */
    private C14044e m28707k() {
        C14044e eVar;
        C14044e eVar2;
        if (this.f36701b != null) {
            eVar = new C14044e(this.f36701b, this.f36708i);
        } else {
            C13715a b = C13715a.m27751b(this.f36700a);
            if (b == null) {
                eVar2 = null;
            } else {
                try {
                    eVar2 = new C14044e(b);
                } catch (Throwable th) {
                    C13715a.m27752c(b);
                    throw th;
                }
            }
            C13715a.m27752c(b);
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.mo26264b(this);
        }
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[SYNTHETIC, Splitter:B:15:0x0030] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imageutils.C14255d m28712p() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4.mo26265c()     // Catch:{ all -> 0x002c }
            com.facebook.imageutils.d r1 = com.facebook.imageutils.C14250a.m29206b(r0)     // Catch:{ all -> 0x002a }
            android.graphics.ColorSpace r2 = r1.f37164b     // Catch:{ all -> 0x002a }
            r4.f36710k = r2     // Catch:{ all -> 0x002a }
            android.util.Pair<java.lang.Integer, java.lang.Integer> r2 = r1.f37163a     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0024
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x002a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x002a }
            int r3 = r3.intValue()     // Catch:{ all -> 0x002a }
            r4.f36705f = r3     // Catch:{ all -> 0x002a }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x002a }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x002a }
            int r2 = r2.intValue()     // Catch:{ all -> 0x002a }
            r4.f36706g = r2     // Catch:{ all -> 0x002a }
        L_0x0024:
            if (r0 == 0) goto L_0x0029
            r0.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return r1
        L_0x002a:
            r1 = move-exception
            goto L_0x002e
        L_0x002c:
            r1 = move-exception
            r0 = 0
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p970j.C14044e.m28712p():com.facebook.imageutils.d");
    }

    /* renamed from: c */
    public final InputStream mo26265c() {
        if (this.f36701b != null) {
            return (InputStream) this.f36701b.mo23157b();
        }
        C13715a b = C13715a.m27751b(this.f36700a);
        if (b == null) {
            return null;
        }
        try {
            return new C13712j((C13709h) b.mo25630a());
        } finally {
            C13715a.m27752c(b);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0047 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair<java.lang.Integer, java.lang.Integer> m28711o() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.mo26265c()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = 1
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
        L_0x000e:
            int r4 = r0.read(r2)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L_0x001a
            r1.write(r2, r6, r4)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            goto L_0x000e
        L_0x001a:
            byte[] r0 = r1.toByteArray()     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            int r2 = r0.length     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            int[] r0 = com.facebook.imageutils.C14254c.m29212a(r0, r2)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            if (r0 == 0) goto L_0x0047
            r2 = r0[r6]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r7.f36705f = r2     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r2 = r0[r3]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r7.f36706g = r2     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r2 = 2
            r2 = r0[r2]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r7.f36703d = r2     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r4 = r0[r6]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r0 = r0[r3]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r2.<init>(r4, r0)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            com.facebook.common.p920d.C13679b.m27633a(r1, r3)     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r2
        L_0x0047:
            com.facebook.common.p920d.C13679b.m27633a(r1, r3)     // Catch:{ IOException -> 0x0050 }
            goto L_0x0050
        L_0x004b:
            r0 = move-exception
            com.facebook.common.p920d.C13679b.m27633a(r1, r3)     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r0
        L_0x0050:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p970j.C14044e.m28711o():android.util.Pair");
    }

    /* renamed from: j */
    public final void mo26273j() {
        Pair<Integer, Integer> pair;
        C13900c a = C13902d.m28314a(mo26265c());
        this.f36702c = a;
        if (C13899b.m28308a(a)) {
            pair = m28710n();
        } else if (C13899b.m28310c(a)) {
            pair = m28711o();
        } else {
            pair = m28712p().f37163a;
        }
        if (a == C13899b.f36263a && this.f36703d == -1) {
            if (pair != null) {
                this.f36704e = C14256e.m29214a(mo26265c());
                this.f36703d = C14256e.m29213a(this.f36704e);
            }
        } else if (a == C13899b.f36273k && this.f36703d == -1) {
            this.f36704e = HeifExifUtil.m29201a(mo26265c());
            this.f36703d = C14256e.m29213a(this.f36704e);
        } else {
            this.f36703d = 0;
        }
    }

    /* renamed from: d */
    public static void m28705d(C14044e eVar) {
        if (eVar != null) {
            eVar.close();
        }
    }

    /* renamed from: a */
    public static C14044e m28703a(C14044e eVar) {
        if (eVar != null) {
            return eVar.m28707k();
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m28704c(C14044e eVar) {
        if (eVar.f36703d < 0 || eVar.f36705f < 0 || eVar.f36706g < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m28706e(C14044e eVar) {
        if (eVar == null || !eVar.mo26262a()) {
            return false;
        }
        return true;
    }

    private C14044e(C13691k<FileInputStream> kVar) {
        this.f36702c = C13900c.f36275a;
        this.f36703d = -1;
        this.f36705f = -1;
        this.f36706g = -1;
        this.f36707h = 1;
        this.f36708i = -1;
        C13689i.m27652a(kVar);
        this.f36700a = null;
        this.f36701b = kVar;
    }

    public C14044e(C13715a<C13709h> aVar) {
        this.f36702c = C13900c.f36275a;
        this.f36703d = -1;
        this.f36705f = -1;
        this.f36706g = -1;
        this.f36707h = 1;
        this.f36708i = -1;
        C13689i.m27655a(C13715a.m27750a(aVar));
        this.f36700a = aVar.clone();
        this.f36701b = null;
    }

    /* renamed from: b */
    public final void mo26264b(C14044e eVar) {
        this.f36702c = eVar.mo26267d();
        this.f36705f = eVar.mo26270g();
        this.f36706g = eVar.mo26271h();
        this.f36703d = eVar.mo26268e();
        this.f36704e = eVar.mo26269f();
        this.f36707h = eVar.f36707h;
        this.f36708i = eVar.mo26272i();
        this.f36709j = eVar.f36709j;
        this.f36710k = eVar.m28708l();
    }

    /* renamed from: a */
    public final String mo26261a(int i) {
        C13715a b = mo26263b();
        if (b == null) {
            return "";
        }
        int min = Math.min(mo26272i(), 10);
        byte[] bArr = new byte[min];
        try {
            C13709h hVar = (C13709h) b.mo25630a();
            if (hVar == null) {
                return "";
            }
            hVar.mo25609a(0, bArr, 0, min);
            b.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i2 = 0; i2 < min; i2++) {
                sb.append(C2240a.m6772a("%02X", new Object[]{Byte.valueOf(bArr[i2])}));
            }
            return sb.toString();
        } finally {
            b.close();
        }
    }

    private C14044e(C13691k<FileInputStream> kVar, int i) {
        this(kVar);
        this.f36708i = i;
    }
}
