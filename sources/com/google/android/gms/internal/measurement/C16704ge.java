package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ge */
public abstract class C16704ge {

    /* renamed from: a */
    int f46953a;

    /* renamed from: b */
    int f46954b;

    /* renamed from: c */
    C16707gh f46955c = this;

    /* renamed from: d */
    private int f46956d;

    /* renamed from: a */
    public abstract int mo32038a() throws IOException;

    /* renamed from: a */
    public abstract <T extends C16775ik> T mo32039a(C16786iv<T> ivVar, C16721gq gqVar) throws IOException;

    /* renamed from: a */
    public abstract void mo32040a(int i) throws C16748hk;

    /* renamed from: b */
    public abstract double mo32041b() throws IOException;

    /* renamed from: b */
    public abstract boolean mo32042b(int i) throws IOException;

    /* renamed from: c */
    public abstract float mo32043c() throws IOException;

    /* renamed from: c */
    public abstract int mo32044c(int i) throws C16748hk;

    /* renamed from: d */
    public abstract long mo32045d() throws IOException;

    /* renamed from: d */
    public abstract void mo32046d(int i);

    /* renamed from: e */
    public abstract long mo32047e() throws IOException;

    /* renamed from: e */
    public abstract void mo32048e(int i) throws IOException;

    /* renamed from: f */
    public abstract int mo32049f() throws IOException;

    /* renamed from: g */
    public abstract long mo32050g() throws IOException;

    /* renamed from: h */
    public abstract int mo32051h() throws IOException;

    /* renamed from: i */
    public abstract boolean mo32052i() throws IOException;

    /* renamed from: j */
    public abstract String mo32053j() throws IOException;

    /* renamed from: k */
    public abstract String mo32054k() throws IOException;

    /* renamed from: l */
    public abstract C16691fs mo32055l() throws IOException;

    /* renamed from: m */
    public abstract int mo32056m() throws IOException;

    /* renamed from: n */
    public abstract int mo32057n() throws IOException;

    /* renamed from: o */
    public abstract int mo32058o() throws IOException;

    /* renamed from: p */
    public abstract long mo32059p() throws IOException;

    /* renamed from: q */
    public abstract int mo32060q() throws IOException;

    /* renamed from: r */
    public abstract long mo32061r() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public abstract long mo32062s() throws IOException;

    /* renamed from: t */
    public abstract boolean mo32063t() throws IOException;

    /* renamed from: u */
    public abstract int mo32064u();

    /* renamed from: a */
    static C16704ge m39889a(byte[] bArr, int i, int i2, boolean z) {
        C16706gg ggVar = new C16706gg(bArr, i, i2);
        try {
            ggVar.mo32044c(i2);
            return ggVar;
        } catch (C16748hk e) {
            throw new IllegalArgumentException(e);
        }
    }

    private C16704ge() {
        this.f46954b = 100;
        this.f46956d = Integer.MAX_VALUE;
    }
}
