package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.C2240a;
import com.p683ss.android.ugc.aweme.feed.monitor.C30514a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public final class bpb implements bok {

    /* renamed from: F */
    private static final bon f43215F = new bpc();

    /* renamed from: G */
    private static final byte[] f43216G = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: H */
    private static final byte[] f43217H = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static final UUID f43218I = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    int f43219A;

    /* renamed from: B */
    int f43220B;

    /* renamed from: C */
    int f43221C;

    /* renamed from: D */
    boolean f43222D;

    /* renamed from: E */
    bom f43223E;

    /* renamed from: J */
    private final boz f43224J;

    /* renamed from: K */
    private final btr f43225K;

    /* renamed from: L */
    private final btr f43226L;

    /* renamed from: M */
    private final btr f43227M;

    /* renamed from: N */
    private final btr f43228N;

    /* renamed from: O */
    private final btr f43229O;

    /* renamed from: P */
    private final btr f43230P;

    /* renamed from: Q */
    private final btr f43231Q;

    /* renamed from: R */
    private ByteBuffer f43232R;

    /* renamed from: S */
    private long f43233S;

    /* renamed from: T */
    private int f43234T;

    /* renamed from: U */
    private boolean f43235U;

    /* renamed from: V */
    private boolean f43236V;

    /* renamed from: W */
    private boolean f43237W;

    /* renamed from: X */
    private boolean f43238X;

    /* renamed from: Y */
    private byte f43239Y;

    /* renamed from: Z */
    private int f43240Z;

    /* renamed from: a */
    final bpg f43241a;

    /* renamed from: aa */
    private int f43242aa;

    /* renamed from: ab */
    private int f43243ab;

    /* renamed from: ac */
    private boolean f43244ac;

    /* renamed from: b */
    final SparseArray<bpe> f43245b;

    /* renamed from: c */
    final boolean f43246c;

    /* renamed from: d */
    final btr f43247d;

    /* renamed from: e */
    final btr f43248e;

    /* renamed from: f */
    long f43249f;

    /* renamed from: g */
    long f43250g;

    /* renamed from: h */
    long f43251h;

    /* renamed from: i */
    long f43252i;

    /* renamed from: j */
    long f43253j;

    /* renamed from: k */
    bpe f43254k;

    /* renamed from: l */
    boolean f43255l;

    /* renamed from: m */
    int f43256m;

    /* renamed from: n */
    long f43257n;

    /* renamed from: o */
    boolean f43258o;

    /* renamed from: p */
    long f43259p;

    /* renamed from: q */
    long f43260q;

    /* renamed from: r */
    btl f43261r;

    /* renamed from: s */
    btl f43262s;

    /* renamed from: t */
    boolean f43263t;

    /* renamed from: u */
    int f43264u;

    /* renamed from: v */
    long f43265v;

    /* renamed from: w */
    long f43266w;

    /* renamed from: x */
    int f43267x;

    /* renamed from: y */
    int f43268y;

    /* renamed from: z */
    int[] f43269z;

    public bpb() {
        this(0);
    }

    private bpb(int i) {
        this(new bov(), 0);
    }

    private bpb(boz boz, int i) {
        this.f43250g = -1;
        this.f43251h = -9223372036854775807L;
        this.f43252i = -9223372036854775807L;
        this.f43253j = -9223372036854775807L;
        this.f43259p = -1;
        this.f43233S = -1;
        this.f43260q = -9223372036854775807L;
        this.f43224J = boz;
        this.f43224J.mo30522a((bpa) new bpd(this, null));
        this.f43246c = true;
        this.f43241a = new bpg();
        this.f43245b = new SparseArray<>();
        this.f43247d = new btr(4);
        this.f43227M = new btr(ByteBuffer.allocate(4).putInt(-1).array());
        this.f43248e = new btr(4);
        this.f43225K = new btr(bto.f43849a);
        this.f43226L = new btr(4);
        this.f43228N = new btr();
        this.f43229O = new btr();
        this.f43230P = new btr(8);
        this.f43231Q = new btr();
    }

    /* renamed from: a */
    public final boolean mo30509a(bol bol) throws IOException, InterruptedException {
        bol bol2 = bol;
        bpf bpf = new bpf();
        long c = bol.mo30503c();
        long j = 1024;
        if (c != -1 && c <= 1024) {
            j = c;
        }
        int i = (int) j;
        bol2.mo30505c(bpf.f43313a.f43867a, 0, 4);
        long f = bpf.f43313a.mo30702f();
        bpf.f43314b = 4;
        while (true) {
            if (f != 440786851) {
                int i2 = bpf.f43314b + 1;
                bpf.f43314b = i2;
                if (i2 == i) {
                    break;
                }
                bol2.mo30505c(bpf.f43313a.f43867a, 0, 1);
                f = ((f << 8) & -256) | ((long) (bpf.f43313a.f43867a[0] & 255));
            } else {
                long a = bpf.mo30536a(bol2);
                long j2 = (long) bpf.f43314b;
                if (a == Long.MIN_VALUE || (c != -1 && j2 + a >= c)) {
                    return false;
                }
                while (true) {
                    long j3 = j2 + a;
                    if (((long) bpf.f43314b) < j3) {
                        if (bpf.mo30536a(bol2) == Long.MIN_VALUE) {
                            break;
                        }
                        long a2 = bpf.mo30536a(bol2);
                        if (a2 < 0 || a2 > 2147483647L) {
                            return false;
                        }
                        if (a2 != 0) {
                            bol2.mo30504c((int) a2);
                            bpf.f43314b = (int) (((long) bpf.f43314b) + a2);
                        }
                    } else if (((long) bpf.f43314b) == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo30508a(bom bom) {
        this.f43223E = bom;
    }

    /* renamed from: a */
    public final void mo30507a(long j, long j2) {
        this.f43260q = -9223372036854775807L;
        this.f43264u = 0;
        this.f43224J.mo30521a();
        this.f43241a.mo30538a();
        m36366b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo30506a(com.google.android.gms.internal.ads.bol r9, com.google.android.gms.internal.ads.boq r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.f43244ac = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003c
            boolean r3 = r8.f43244ac
            if (r3 != 0) goto L_0x003c
            com.google.android.gms.internal.ads.boz r2 = r8.f43224J
            boolean r2 = r2.mo30523a(r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.mo30500b()
            boolean r5 = r8.f43258o
            if (r5 == 0) goto L_0x0025
            r8.f43233S = r3
            long r3 = r8.f43259p
            r10.f43202a = r3
            r8.f43258o = r0
        L_0x0023:
            r3 = 1
            goto L_0x0039
        L_0x0025:
            boolean r3 = r8.f43255l
            if (r3 == 0) goto L_0x0038
            long r3 = r8.f43233S
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0038
            long r3 = r8.f43233S
            r10.f43202a = r3
            r8.f43233S = r5
            goto L_0x0023
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003c:
            if (r2 == 0) goto L_0x003f
            return r0
        L_0x003f:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bpb.mo30506a(com.google.android.gms.internal.ads.bol, com.google.android.gms.internal.ads.boq):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30535a(bpe bpe, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(bpe.f43287a)) {
            byte[] bArr2 = this.f43229O.f43867a;
            long j2 = this.f43266w;
            if (j2 == -9223372036854775807L) {
                bArr = f43217H;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = btw.m36763a(C2240a.m6773a(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (C30514a.f79747n * i3))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            bpe.f43285O.mo30517a(this.f43229O, this.f43229O.f43869c);
            this.f43243ab += this.f43229O.f43869c;
        }
        bpe.f43285O.mo30516a(j, this.f43221C, this.f43243ab, 0, bpe.f43293g);
        this.f43244ac = true;
        m36366b();
    }

    /* renamed from: b */
    private final void m36366b() {
        this.f43234T = 0;
        this.f43243ab = 0;
        this.f43242aa = 0;
        this.f43235U = false;
        this.f43236V = false;
        this.f43238X = false;
        this.f43240Z = 0;
        this.f43239Y = 0;
        this.f43237W = false;
        this.f43228N.mo30690a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30533a(bol bol, int i) throws IOException, InterruptedException {
        if (this.f43247d.f43869c < i) {
            if (this.f43247d.mo30696c() < i) {
                this.f43247d.mo30692a(Arrays.copyOf(this.f43247d.f43867a, Math.max(this.f43247d.f43867a.length << 1, i)), this.f43247d.f43869c);
            }
            bol.mo30502b(this.f43247d.f43867a, this.f43247d.f43869c, i - this.f43247d.f43869c);
            this.f43247d.mo30695b(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30534a(bol bol, bpe bpe, int i) throws IOException, InterruptedException {
        if ("S_TEXT/UTF8".equals(bpe.f43287a)) {
            int length = f43216G.length + i;
            if (this.f43229O.mo30696c() < length) {
                this.f43229O.f43867a = Arrays.copyOf(f43216G, length + i);
            }
            bol.mo30502b(this.f43229O.f43867a, f43216G.length, i);
            this.f43229O.mo30697c(0);
            this.f43229O.mo30695b(length);
            return;
        }
        bot bot = bpe.f43285O;
        if (!this.f43235U) {
            if (bpe.f43291e) {
                this.f43221C &= -1073741825;
                int i2 = 128;
                if (!this.f43236V) {
                    bol.mo30502b(this.f43247d.f43867a, 0, 1);
                    this.f43234T++;
                    if ((this.f43247d.f43867a[0] & 128) != 128) {
                        this.f43239Y = this.f43247d.f43867a[0];
                        this.f43236V = true;
                    } else {
                        throw new bmk("Extension bit is set in signal byte");
                    }
                }
                if ((this.f43239Y & 1) == 1) {
                    boolean z = (this.f43239Y & 2) == 2;
                    this.f43221C |= 1073741824;
                    if (!this.f43237W) {
                        bol.mo30502b(this.f43230P.f43867a, 0, 8);
                        this.f43234T += 8;
                        this.f43237W = true;
                        byte[] bArr = this.f43247d.f43867a;
                        if (!z) {
                            i2 = 0;
                        }
                        bArr[0] = (byte) (i2 | 8);
                        this.f43247d.mo30697c(0);
                        bot.mo30517a(this.f43247d, 1);
                        this.f43243ab++;
                        this.f43230P.mo30697c(0);
                        bot.mo30517a(this.f43230P, 8);
                        this.f43243ab += 8;
                    }
                    if (z) {
                        if (!this.f43238X) {
                            bol.mo30502b(this.f43247d.f43867a, 0, 1);
                            this.f43234T++;
                            this.f43247d.mo30697c(0);
                            this.f43240Z = this.f43247d.mo30698d();
                            this.f43238X = true;
                        }
                        int i3 = this.f43240Z << 2;
                        this.f43247d.mo30691a(i3);
                        bol.mo30502b(this.f43247d.f43867a, 0, i3);
                        this.f43234T += i3;
                        short s = (short) ((this.f43240Z / 2) + 1);
                        int i4 = (s * 6) + 2;
                        if (this.f43232R == null || this.f43232R.capacity() < i4) {
                            this.f43232R = ByteBuffer.allocate(i4);
                        }
                        this.f43232R.position(0);
                        this.f43232R.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.f43240Z) {
                            int i7 = this.f43247d.mo30705i();
                            if (i5 % 2 == 0) {
                                this.f43232R.putShort((short) (i7 - i6));
                            } else {
                                this.f43232R.putInt(i7 - i6);
                            }
                            i5++;
                            i6 = i7;
                        }
                        int i8 = (i - this.f43234T) - i6;
                        if (this.f43240Z % 2 == 1) {
                            this.f43232R.putInt(i8);
                        } else {
                            this.f43232R.putShort((short) i8);
                            this.f43232R.putInt(0);
                        }
                        this.f43231Q.mo30692a(this.f43232R.array(), i4);
                        bot.mo30517a(this.f43231Q, i4);
                        this.f43243ab += i4;
                    }
                }
            } else if (bpe.f43292f != null) {
                this.f43228N.mo30692a(bpe.f43292f, bpe.f43292f.length);
            }
            this.f43235U = true;
        }
        int i9 = i + this.f43228N.f43869c;
        if ("V_MPEG4/ISO/AVC".equals(bpe.f43287a) || "V_MPEGH/ISO/HEVC".equals(bpe.f43287a)) {
            byte[] bArr2 = this.f43226L.f43867a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i10 = bpe.f43286P;
            int i11 = 4 - bpe.f43286P;
            while (this.f43234T < i9) {
                if (this.f43242aa == 0) {
                    int min = Math.min(i10, this.f43228N.mo30694b());
                    bol.mo30502b(bArr2, i11 + min, i10 - min);
                    if (min > 0) {
                        this.f43228N.mo30693a(bArr2, i11, min);
                    }
                    this.f43234T += i10;
                    this.f43226L.mo30697c(0);
                    this.f43242aa = this.f43226L.mo30705i();
                    this.f43225K.mo30697c(0);
                    bot.mo30517a(this.f43225K, 4);
                    this.f43243ab += 4;
                } else {
                    this.f43242aa -= m36363a(bol, bot, this.f43242aa);
                }
            }
        } else {
            while (this.f43234T < i9) {
                m36363a(bol, bot, i9 - this.f43234T);
            }
        }
        if ("A_VORBIS".equals(bpe.f43287a)) {
            this.f43227M.mo30697c(0);
            bot.mo30517a(this.f43227M, 4);
            this.f43243ab += 4;
        }
    }

    /* renamed from: a */
    private final int m36363a(bol bol, bot bot, int i) throws IOException, InterruptedException {
        int i2;
        int b = this.f43228N.mo30694b();
        if (b > 0) {
            i2 = Math.min(i, b);
            bot.mo30517a(this.f43228N, i2);
        } else {
            i2 = bot.mo30515a(bol, i, false);
        }
        this.f43234T += i2;
        this.f43243ab += i2;
        return i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo30532a(long j) throws bmk {
        if (this.f43251h != -9223372036854775807L) {
            return btw.m36758a(j, this.f43251h, 1000);
        }
        throw new bmk("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    static int[] m36365a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length << 1, i)];
    }
}
