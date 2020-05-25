package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class bhl extends bik {

    /* renamed from: A */
    private int f42396A;

    /* renamed from: B */
    private boolean f42397B;

    /* renamed from: C */
    private boolean f42398C;

    /* renamed from: D */
    private boolean f42399D;

    /* renamed from: E */
    private boolean f42400E;

    /* renamed from: F */
    private long f42401F;

    /* renamed from: a */
    public final bgu f42402a;

    /* renamed from: b */
    protected final Handler f42403b;

    /* renamed from: c */
    MediaCodec f42404c;

    /* renamed from: d */
    public int f42405d;

    /* renamed from: f */
    private final biu f42406f;

    /* renamed from: g */
    private final boolean f42407g;

    /* renamed from: h */
    private final bii f42408h;

    /* renamed from: i */
    private final bih f42409i;

    /* renamed from: j */
    private final bif f42410j;

    /* renamed from: k */
    private final List<Long> f42411k;

    /* renamed from: l */
    private final BufferInfo f42412l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final bhq f42413m;

    /* renamed from: n */
    private bie f42414n;

    /* renamed from: o */
    private bir f42415o;

    /* renamed from: p */
    private boolean f42416p;

    /* renamed from: q */
    private ByteBuffer[] f42417q;

    /* renamed from: r */
    private ByteBuffer[] f42418r;

    /* renamed from: s */
    private long f42419s;

    /* renamed from: t */
    private int f42420t;

    /* renamed from: u */
    private int f42421u;

    /* renamed from: v */
    private boolean f42422v;

    /* renamed from: w */
    private boolean f42423w;

    /* renamed from: x */
    private int f42424x;

    /* renamed from: y */
    private int f42425y;

    /* renamed from: z */
    private boolean f42426z;

    public bhl(bii bii, biu biu, boolean z, Handler handler, bhq bhq) {
        blg.m36001b(blp.f42854a >= 16);
        this.f42408h = bii;
        this.f42406f = null;
        this.f42407g = true;
        this.f42403b = handler;
        this.f42413m = bhq;
        this.f42402a = new bgu();
        this.f42409i = new bih(0);
        this.f42410j = new bif();
        this.f42411k = new ArrayList();
        this.f42412l = new BufferInfo();
        this.f42424x = 0;
        this.f42425y = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30184a(bie bie, MediaFormat mediaFormat) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo30186a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) throws bgy;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo30198a(MediaCodec mediaCodec, boolean z, bie bie, bie bie2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo30187a(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo30188b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo30189c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo30199b(long j) throws bgy {
        try {
            if (!this.f42408h.mo30170a(j)) {
                return 0;
            }
            for (int i = 0; i < this.f42408h.mo30166a(); i++) {
                if (mo30187a(this.f42408h.mo30168a(i).f42492a)) {
                    this.f42396A = i;
                    return 1;
                }
            }
            return -1;
        } catch (IOException e) {
            throw new bgy((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30182a(long j, boolean z) {
        this.f42408h.mo30169a(this.f42396A, j);
        this.f42405d = 0;
        this.f42397B = false;
        this.f42398C = false;
        this.f42399D = false;
        this.f42401F = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30183a(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo30200h() throws bgy {
        MediaCrypto mediaCrypto;
        bgx bgx;
        if (mo30201i()) {
            String str = this.f42414n.f42471a;
            boolean z = false;
            if (this.f42415o == null) {
                mediaCrypto = null;
            } else if (this.f42406f != null) {
                if (!this.f42422v) {
                    this.f42422v = true;
                }
                int a = this.f42406f.mo30250a();
                if (a == 0) {
                    throw new bgy((Throwable) this.f42406f.mo30253c());
                } else if (a == 3 || a == 4) {
                    mediaCrypto = this.f42406f.mo30252b();
                    z = this.f42406f.mo30251a(str);
                } else {
                    return;
                }
            } else {
                throw new bgy("Media requires a DrmSessionManager");
            }
            try {
                bgx = mo30180a(str, z);
            } catch (bht e) {
                m35698a(new bhp(this.f42414n, (Throwable) e, -49998));
                bgx = null;
            }
            if (bgx == null) {
                m35698a(new bhp(this.f42414n, (Throwable) null, -49999));
            }
            String str2 = bgx.f42340a;
            this.f42416p = bgx.f42341b;
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f42404c = MediaCodec.createByCodecName(str2);
                mo30183a(this.f42404c, str2, this.f42414n.mo30219a(), mediaCrypto);
                this.f42404c.start();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j = elapsedRealtime2 - elapsedRealtime;
                if (!(this.f42403b == null || this.f42413m == null)) {
                    Handler handler = this.f42403b;
                    bho bho = new bho(this, str2, elapsedRealtime2, j);
                    handler.post(bho);
                }
                this.f42417q = this.f42404c.getInputBuffers();
                this.f42418r = this.f42404c.getOutputBuffers();
            } catch (Exception e2) {
                m35698a(new bhp(this.f42414n, (Throwable) e2, str2));
            }
            this.f42419s = this.f42494e == 3 ? SystemClock.elapsedRealtime() : -1;
            this.f42420t = -1;
            this.f42421u = -1;
            this.f42400E = true;
            this.f42402a.f42326a++;
        }
    }

    /* renamed from: a */
    private final void m35698a(bhp bhp) throws bgy {
        if (!(this.f42403b == null || this.f42413m == null)) {
            this.f42403b.post(new bhm(this, bhp));
        }
        throw new bgy((Throwable) bhp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo30201i() {
        return this.f42404c == null && this.f42414n != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo30193g() {
        this.f42414n = null;
        this.f42415o = null;
        try {
            mo30202j();
            try {
                if (this.f42422v) {
                    this.f42422v = false;
                }
            } finally {
                this.f42408h.mo30172b(this.f42396A);
            }
        } catch (Throwable th) {
            if (this.f42422v) {
                this.f42422v = false;
            }
            throw th;
        } finally {
            this.f42408h.mo30172b(this.f42396A);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo30202j() {
        if (this.f42404c != null) {
            this.f42419s = -1;
            this.f42420t = -1;
            this.f42421u = -1;
            this.f42399D = false;
            this.f42411k.clear();
            this.f42417q = null;
            this.f42418r = null;
            this.f42423w = false;
            this.f42426z = false;
            this.f42416p = false;
            this.f42424x = 0;
            this.f42425y = 0;
            this.f42402a.f42327b++;
            try {
                this.f42404c.stop();
                try {
                    this.f42404c.release();
                } finally {
                    this.f42404c = null;
                }
            } catch (Throwable th) {
                this.f42404c.release();
                throw th;
            } finally {
                this.f42404c = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo30203k() {
        this.f42408h.mo30174c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo30192f() {
        return this.f42401F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final long mo30204l() {
        return this.f42408h.mo30168a(this.f42396A).f42493b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final long mo30205m() {
        long b = this.f42408h.mo30171b();
        return (b == -1 || b == -3) ? b : Math.max(b, mo30192f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30181a(long j) throws bgy {
        this.f42401F = j;
        this.f42408h.mo30175c(j);
        this.f42405d = 0;
        this.f42397B = false;
        this.f42398C = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30196a(long j, long j2) throws bgy {
        boolean z;
        int i;
        try {
            int i2 = this.f42408h.mo30173b(j) ? this.f42405d == 0 ? 1 : this.f42405d : 0;
            this.f42405d = i2;
            if (this.f42404c != null && this.f42408h.mo30167a(this.f42396A, this.f42401F, this.f42410j, this.f42409i, true) == -5) {
                m35700r();
            }
            if (this.f42414n == null && this.f42408h.mo30167a(this.f42396A, this.f42401F, this.f42410j, this.f42409i, false) == -4) {
                mo30197a(this.f42410j);
            }
            if (this.f42404c == null && mo30201i()) {
                mo30200h();
            }
            if (this.f42404c != null) {
                do {
                    if (!this.f42398C) {
                        if (this.f42421u < 0) {
                            this.f42421u = this.f42404c.dequeueOutputBuffer(this.f42412l, 0);
                        }
                        if (this.f42421u == -2) {
                            mo30184a(this.f42414n, this.f42404c.getOutputFormat());
                            this.f42402a.f42328c++;
                        } else if (this.f42421u == -3) {
                            this.f42418r = this.f42404c.getOutputBuffers();
                            this.f42402a.f42329d++;
                        } else if (this.f42421u >= 0) {
                            if ((this.f42412l.flags & 4) == 0) {
                                long j3 = this.f42412l.presentationTimeUs;
                                int size = this.f42411k.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size) {
                                        i = -1;
                                        break;
                                    } else if (((Long) this.f42411k.get(i3)).longValue() == j3) {
                                        i = i3;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (mo30186a(j, j2, this.f42404c, this.f42418r[this.f42421u], this.f42412l, this.f42421u, i != -1)) {
                                    if (i != -1) {
                                        this.f42411k.remove(i);
                                    } else {
                                        this.f42401F = this.f42412l.presentationTimeUs;
                                    }
                                    this.f42421u = -1;
                                }
                            } else if (this.f42425y == 2) {
                                mo30202j();
                                mo30200h();
                            } else {
                                this.f42398C = true;
                            }
                        }
                        z = true;
                        continue;
                    }
                    z = false;
                    continue;
                } while (z);
                if (m35699a(true)) {
                    do {
                    } while (m35699a(false));
                }
            }
        } catch (IOException e) {
            throw new bgy((Throwable) e);
        }
    }

    /* renamed from: r */
    private final void m35700r() throws bgy {
        this.f42419s = -1;
        this.f42420t = -1;
        this.f42421u = -1;
        this.f42400E = true;
        this.f42399D = false;
        this.f42411k.clear();
        if (blp.f42854a < 18 || this.f42425y != 0) {
            mo30202j();
            mo30200h();
        } else {
            this.f42404c.flush();
            this.f42426z = false;
        }
        if (this.f42423w && this.f42414n != null) {
            this.f42424x = 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0124 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0125 A[SYNTHETIC, Splitter:B:79:0x0125] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m35699a(boolean r18) throws java.io.IOException, com.google.android.gms.internal.ads.bgy {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r1.f42397B
            r2 = 0
            if (r0 != 0) goto L_0x018e
            int r0 = r1.f42425y
            r3 = 2
            if (r0 != r3) goto L_0x000e
            goto L_0x018e
        L_0x000e:
            int r0 = r1.f42420t
            if (r0 >= 0) goto L_0x0032
            android.media.MediaCodec r0 = r1.f42404c
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r1.f42420t = r0
            int r0 = r1.f42420t
            if (r0 >= 0) goto L_0x0021
            return r2
        L_0x0021:
            com.google.android.gms.internal.ads.bih r0 = r1.f42409i
            java.nio.ByteBuffer[] r4 = r1.f42417q
            int r5 = r1.f42420t
            r4 = r4[r5]
            r0.f42487b = r4
            com.google.android.gms.internal.ads.bih r0 = r1.f42409i
            java.nio.ByteBuffer r0 = r0.f42487b
            r0.clear()
        L_0x0032:
            int r0 = r1.f42425y
            r4 = -1
            r5 = 1
            if (r0 != r5) goto L_0x0049
            android.media.MediaCodec r6 = r1.f42404c
            int r7 = r1.f42420t
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 4
            r6.queueInputBuffer(r7, r8, r9, r10, r12)
            r1.f42420t = r4
            r1.f42425y = r3
            return r2
        L_0x0049:
            boolean r0 = r1.f42399D
            r6 = -2
            if (r0 == 0) goto L_0x0050
            r0 = -3
            goto L_0x008e
        L_0x0050:
            int r0 = r1.f42424x
            if (r0 != r5) goto L_0x0075
            r0 = 0
        L_0x0055:
            com.google.android.gms.internal.ads.bie r7 = r1.f42414n
            java.util.List<byte[]> r7 = r7.f42476f
            int r7 = r7.size()
            if (r0 >= r7) goto L_0x0073
            com.google.android.gms.internal.ads.bie r7 = r1.f42414n
            java.util.List<byte[]> r7 = r7.f42476f
            java.lang.Object r7 = r7.get(r0)
            byte[] r7 = (byte[]) r7
            com.google.android.gms.internal.ads.bih r8 = r1.f42409i
            java.nio.ByteBuffer r8 = r8.f42487b
            r8.put(r7)
            int r0 = r0 + 1
            goto L_0x0055
        L_0x0073:
            r1.f42424x = r3
        L_0x0075:
            com.google.android.gms.internal.ads.bii r7 = r1.f42408h
            int r8 = r1.f42396A
            long r9 = r1.f42401F
            com.google.android.gms.internal.ads.bif r11 = r1.f42410j
            com.google.android.gms.internal.ads.bih r12 = r1.f42409i
            r13 = 0
            int r0 = r7.mo30167a(r8, r9, r11, r12, r13)
            if (r18 == 0) goto L_0x008e
            int r7 = r1.f42405d
            if (r7 != r5) goto L_0x008e
            if (r0 != r6) goto L_0x008e
            r1.f42405d = r3
        L_0x008e:
            if (r0 != r6) goto L_0x0091
            return r2
        L_0x0091:
            r6 = -5
            if (r0 != r6) goto L_0x0098
            r17.m35700r()
            return r5
        L_0x0098:
            r6 = -4
            if (r0 != r6) goto L_0x00ae
            int r0 = r1.f42424x
            if (r0 != r3) goto L_0x00a8
            com.google.android.gms.internal.ads.bih r0 = r1.f42409i
            java.nio.ByteBuffer r0 = r0.f42487b
            r0.clear()
            r1.f42424x = r5
        L_0x00a8:
            com.google.android.gms.internal.ads.bif r0 = r1.f42410j
            r1.mo30197a(r0)
            return r5
        L_0x00ae:
            if (r0 != r4) goto L_0x00d8
            int r0 = r1.f42424x
            if (r0 != r3) goto L_0x00bd
            com.google.android.gms.internal.ads.bih r0 = r1.f42409i
            java.nio.ByteBuffer r0 = r0.f42487b
            r0.clear()
            r1.f42424x = r5
        L_0x00bd:
            r1.f42397B = r5
            android.media.MediaCodec r6 = r1.f42404c     // Catch:{ CryptoException -> 0x00ce }
            int r7 = r1.f42420t     // Catch:{ CryptoException -> 0x00ce }
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 4
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x00ce }
            r1.f42420t = r4     // Catch:{ CryptoException -> 0x00ce }
            return r2
        L_0x00ce:
            r0 = move-exception
            r1.m35697a(r0)
            com.google.android.gms.internal.ads.bgy r2 = new com.google.android.gms.internal.ads.bgy
            r2.<init>(r0)
            throw r2
        L_0x00d8:
            boolean r0 = r1.f42400E
            if (r0 == 0) goto L_0x00f4
            com.google.android.gms.internal.ads.bih r0 = r1.f42409i
            boolean r0 = r0.mo30224b()
            if (r0 != 0) goto L_0x00f2
            com.google.android.gms.internal.ads.bih r0 = r1.f42409i
            java.nio.ByteBuffer r0 = r0.f42487b
            r0.clear()
            int r0 = r1.f42424x
            if (r0 != r3) goto L_0x00f1
            r1.f42424x = r5
        L_0x00f1:
            return r5
        L_0x00f2:
            r1.f42400E = r2
        L_0x00f4:
            com.google.android.gms.internal.ads.bih r0 = r1.f42409i
            boolean r0 = r0.mo30223a()
            boolean r3 = r1.f42422v
            if (r3 == 0) goto L_0x011d
            com.google.android.gms.internal.ads.biu r3 = r1.f42406f
            int r3 = r3.mo30250a()
            if (r3 == 0) goto L_0x0111
            r6 = 4
            if (r3 == r6) goto L_0x011d
            if (r0 != 0) goto L_0x010f
            boolean r3 = r1.f42407g
            if (r3 != 0) goto L_0x011d
        L_0x010f:
            r3 = 1
            goto L_0x011e
        L_0x0111:
            com.google.android.gms.internal.ads.bgy r0 = new com.google.android.gms.internal.ads.bgy
            com.google.android.gms.internal.ads.biu r2 = r1.f42406f
            java.lang.Exception r2 = r2.mo30253c()
            r0.<init>(r2)
            throw r0
        L_0x011d:
            r3 = 0
        L_0x011e:
            r1.f42399D = r3
            boolean r3 = r1.f42399D
            if (r3 == 0) goto L_0x0125
            return r2
        L_0x0125:
            com.google.android.gms.internal.ads.bih r3 = r1.f42409i     // Catch:{ CryptoException -> 0x0184 }
            java.nio.ByteBuffer r3 = r3.f42487b     // Catch:{ CryptoException -> 0x0184 }
            int r9 = r3.position()     // Catch:{ CryptoException -> 0x0184 }
            com.google.android.gms.internal.ads.bih r3 = r1.f42409i     // Catch:{ CryptoException -> 0x0184 }
            int r3 = r3.f42488c     // Catch:{ CryptoException -> 0x0184 }
            int r3 = r9 - r3
            com.google.android.gms.internal.ads.bih r6 = r1.f42409i     // Catch:{ CryptoException -> 0x0184 }
            long r14 = r6.f42490e     // Catch:{ CryptoException -> 0x0184 }
            com.google.android.gms.internal.ads.bih r6 = r1.f42409i     // Catch:{ CryptoException -> 0x0184 }
            int r6 = r6.f42489d     // Catch:{ CryptoException -> 0x0184 }
            r7 = 134217728(0x8000000, float:3.85186E-34)
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0142
            r6 = 1
            goto L_0x0143
        L_0x0142:
            r6 = 0
        L_0x0143:
            if (r6 == 0) goto L_0x014e
            java.util.List<java.lang.Long> r6 = r1.f42411k     // Catch:{ CryptoException -> 0x0184 }
            java.lang.Long r7 = java.lang.Long.valueOf(r14)     // Catch:{ CryptoException -> 0x0184 }
            r6.add(r7)     // Catch:{ CryptoException -> 0x0184 }
        L_0x014e:
            if (r0 == 0) goto L_0x0173
            com.google.android.gms.internal.ads.bih r0 = r1.f42409i     // Catch:{ CryptoException -> 0x0184 }
            com.google.android.gms.internal.ads.bgw r0 = r0.f42486a     // Catch:{ CryptoException -> 0x0184 }
            android.media.MediaCodec$CryptoInfo r13 = r0.f42339g     // Catch:{ CryptoException -> 0x0184 }
            if (r3 != 0) goto L_0x0159
            goto L_0x0168
        L_0x0159:
            int[] r0 = r13.numBytesOfClearData     // Catch:{ CryptoException -> 0x0184 }
            if (r0 != 0) goto L_0x0161
            int[] r0 = new int[r5]     // Catch:{ CryptoException -> 0x0184 }
            r13.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x0184 }
        L_0x0161:
            int[] r0 = r13.numBytesOfClearData     // Catch:{ CryptoException -> 0x0184 }
            r6 = r0[r2]     // Catch:{ CryptoException -> 0x0184 }
            int r6 = r6 + r3
            r0[r2] = r6     // Catch:{ CryptoException -> 0x0184 }
        L_0x0168:
            android.media.MediaCodec r10 = r1.f42404c     // Catch:{ CryptoException -> 0x0184 }
            int r11 = r1.f42420t     // Catch:{ CryptoException -> 0x0184 }
            r12 = 0
            r16 = 0
            r10.queueSecureInputBuffer(r11, r12, r13, r14, r16)     // Catch:{ CryptoException -> 0x0184 }
            goto L_0x017d
        L_0x0173:
            android.media.MediaCodec r6 = r1.f42404c     // Catch:{ CryptoException -> 0x0184 }
            int r7 = r1.f42420t     // Catch:{ CryptoException -> 0x0184 }
            r8 = 0
            r12 = 0
            r10 = r14
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x0184 }
        L_0x017d:
            r1.f42420t = r4     // Catch:{ CryptoException -> 0x0184 }
            r1.f42426z = r5     // Catch:{ CryptoException -> 0x0184 }
            r1.f42424x = r2     // Catch:{ CryptoException -> 0x0184 }
            return r5
        L_0x0184:
            r0 = move-exception
            r1.m35697a(r0)
            com.google.android.gms.internal.ads.bgy r2 = new com.google.android.gms.internal.ads.bgy
            r2.<init>(r0)
            throw r2
        L_0x018e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bhl.m35699a(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30197a(bif bif) throws bgy {
        bie bie = this.f42414n;
        this.f42414n = bif.f42484a;
        this.f42415o = bif.f42485b;
        if (this.f42404c != null && mo30198a(this.f42404c, this.f42416p, bie, this.f42414n)) {
            this.f42423w = true;
            this.f42424x = 1;
        } else if (this.f42426z) {
            this.f42425y = 1;
        } else {
            mo30202j();
            mo30200h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo30190d() {
        return this.f42398C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo30191e() {
        if (this.f42414n != null && !this.f42399D) {
            if (this.f42405d == 0 && this.f42421u < 0) {
                if (SystemClock.elapsedRealtime() < this.f42419s + 1000) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m35697a(CryptoException cryptoException) {
        if (this.f42403b != null && this.f42413m != null) {
            this.f42403b.post(new bhn(this, cryptoException));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bgx mo30180a(String str, boolean z) throws bht {
        Pair a = bhr.m35728a(str, z);
        if (a == null) {
            return null;
        }
        return new bgx((String) a.first, blp.f42854a >= 19 ? ((CodecCapabilities) a.second).isFeatureSupported("adaptive-playback") : false);
    }
}
