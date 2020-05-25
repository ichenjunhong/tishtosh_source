package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class bkd implements biz {

    /* renamed from: A */
    long f42730A;

    /* renamed from: B */
    boolean f42731B;

    /* renamed from: C */
    bjb f42732C;

    /* renamed from: D */
    private final bka f42733D;

    /* renamed from: E */
    private long f42734E;

    /* renamed from: F */
    private boolean f42735F;

    /* renamed from: a */
    final bkc f42736a;

    /* renamed from: b */
    final bll f42737b;

    /* renamed from: c */
    final bll f42738c;

    /* renamed from: d */
    final bll f42739d;

    /* renamed from: e */
    long f42740e;

    /* renamed from: f */
    long f42741f;

    /* renamed from: g */
    long f42742g;

    /* renamed from: h */
    long f42743h;

    /* renamed from: i */
    bkg f42744i;

    /* renamed from: j */
    bkg f42745j;

    /* renamed from: k */
    bkg f42746k;

    /* renamed from: l */
    boolean f42747l;

    /* renamed from: m */
    int f42748m;

    /* renamed from: n */
    long f42749n;

    /* renamed from: o */
    boolean f42750o;

    /* renamed from: p */
    long f42751p;

    /* renamed from: q */
    int f42752q;

    /* renamed from: r */
    long f42753r;

    /* renamed from: s */
    blj f42754s;

    /* renamed from: t */
    blj f42755t;

    /* renamed from: u */
    boolean f42756u;

    /* renamed from: v */
    int f42757v;

    /* renamed from: w */
    int f42758w;

    /* renamed from: x */
    int f42759x;

    /* renamed from: y */
    int f42760y;

    /* renamed from: z */
    int f42761z;

    public bkd() {
        this(new bjw());
    }

    private bkd(bka bka) {
        this.f42740e = -1;
        this.f42741f = -1;
        this.f42742g = 1000000;
        this.f42743h = -1;
        this.f42751p = -1;
        this.f42734E = -1;
        this.f42753r = -1;
        this.f42733D = bka;
        this.f42733D.mo30294a((bkb) new bkf(this));
        this.f42736a = new bkc();
        this.f42737b = new bll(4);
        this.f42738c = new bll(ByteBuffer.allocate(4).putInt(-1).array());
        this.f42739d = new bll(4);
    }

    /* renamed from: a */
    public final void mo30269a(bjb bjb) {
        this.f42732C = bjb;
    }

    /* renamed from: a */
    public final void mo30268a() {
        this.f42753r = -1;
        this.f42758w = 0;
        this.f42733D.mo30293a();
        this.f42736a.mo30305a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo30267a(com.google.android.gms.internal.ads.bja r9, com.google.android.gms.internal.ads.bjf r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.f42735F = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003f
            boolean r3 = r8.f42735F
            if (r3 != 0) goto L_0x003f
            com.google.android.gms.internal.ads.bka r2 = r8.f42733D
            boolean r2 = r2.mo30295a(r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.mo30255a()
            boolean r5 = r8.f42750o
            if (r5 == 0) goto L_0x0027
            r8.f42734E = r3
            long r3 = r8.f42751p
            r10.f42599a = r3
            r8.f42752q = r1
            r8.f42750o = r0
        L_0x0025:
            r3 = 1
            goto L_0x003c
        L_0x0027:
            int r3 = r8.f42752q
            r4 = 2
            if (r3 != r4) goto L_0x003b
            long r3 = r8.f42734E
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x003b
            long r3 = r8.f42734E
            r10.f42599a = r3
            r8.f42734E = r5
            goto L_0x0025
        L_0x003b:
            r3 = 0
        L_0x003c:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003f:
            if (r2 == 0) goto L_0x0042
            return r0
        L_0x0042:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bkd.mo30267a(com.google.android.gms.internal.ads.bja, com.google.android.gms.internal.ads.bjf):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30307a(bjl bjl) {
        bjl.mo30261a(this.f42730A, this.f42761z, this.f42759x, 0, null);
        this.f42758w = 0;
        this.f42735F = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ArrayList<byte[]> mo30308b() throws big {
        try {
            byte[] bArr = this.f42745j.f42772j;
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (bArr[i] == -1) {
                    i2 += NormalGiftView.ALPHA_255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + bArr[i];
                int i5 = 0;
                while (bArr[i3] == -1) {
                    i5 += NormalGiftView.ALPHA_255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + bArr[i3];
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            byte[] bArr3 = new byte[(bArr.length - i9)];
                            System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                            ArrayList<byte[]> arrayList = new ArrayList<>(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new big("Error parsing vorbis codec private");
                    }
                    throw new big("Error parsing vorbis codec private");
                }
                throw new big("Error parsing vorbis codec private");
            }
            throw new big("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new big("Error parsing vorbis codec private");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo30306a(long j) {
        return TimeUnit.NANOSECONDS.toMicros(j * this.f42742g);
    }

    /* renamed from: a */
    static boolean m35932a(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str);
    }
}
