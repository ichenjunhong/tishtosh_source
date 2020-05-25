package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class bqd extends blr {

    /* renamed from: g */
    private static final byte[] f43538g;

    /* renamed from: A */
    private boolean f43539A;

    /* renamed from: B */
    private boolean f43540B;

    /* renamed from: C */
    private boolean f43541C;

    /* renamed from: D */
    private boolean f43542D;

    /* renamed from: E */
    private ByteBuffer[] f43543E;

    /* renamed from: F */
    private ByteBuffer[] f43544F;

    /* renamed from: G */
    private long f43545G;

    /* renamed from: H */
    private int f43546H;

    /* renamed from: I */
    private int f43547I;

    /* renamed from: J */
    private boolean f43548J;

    /* renamed from: K */
    private boolean f43549K;

    /* renamed from: L */
    private int f43550L;

    /* renamed from: M */
    private int f43551M;

    /* renamed from: N */
    private boolean f43552N;

    /* renamed from: O */
    private boolean f43553O;

    /* renamed from: P */
    private boolean f43554P;

    /* renamed from: Q */
    private boolean f43555Q;

    /* renamed from: R */
    private boolean f43556R;

    /* renamed from: S */
    private boolean f43557S;

    /* renamed from: h */
    public MediaCodec f43558h;

    /* renamed from: i */
    public bqc f43559i;

    /* renamed from: j */
    protected bob f43560j;

    /* renamed from: k */
    private final bqf f43561k;

    /* renamed from: l */
    private final boh<Object> f43562l;

    /* renamed from: m */
    private final boolean f43563m;

    /* renamed from: n */
    private final boc f43564n;

    /* renamed from: o */
    private final boc f43565o;

    /* renamed from: p */
    private final bmh f43566p;

    /* renamed from: q */
    private final List<Long> f43567q;

    /* renamed from: r */
    private final BufferInfo f43568r;

    /* renamed from: s */
    private zzlg f43569s;

    /* renamed from: t */
    private bof<Object> f43570t;

    /* renamed from: u */
    private bof<Object> f43571u;

    /* renamed from: v */
    private boolean f43572v;

    /* renamed from: w */
    private boolean f43573w;

    /* renamed from: x */
    private boolean f43574x;

    /* renamed from: y */
    private boolean f43575y;

    /* renamed from: z */
    private boolean f43576z;

    public bqd(int i, bqf bqf, boh<Object> boh, boolean z) {
        super(i);
        bti.m36701b(btw.f43878a >= 16);
        this.f43561k = (bqf) bti.m36697a(bqf);
        this.f43562l = boh;
        this.f43563m = z;
        this.f43564n = new boc(0);
        this.f43565o = new boc(0);
        this.f43566p = new bmh();
        this.f43567q = new ArrayList();
        this.f43568r = new BufferInfo();
        this.f43550L = 0;
        this.f43551M = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo30463a(bqf bqf, zzlg zzlg) throws bqj;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30466a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws blt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30550a(boc boc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30467a(bqc bqc, MediaCodec mediaCodec, zzlg zzlg, MediaCrypto mediaCrypto) throws bqj;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30468a(String str, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo30469a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws blt;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo30551a(MediaCodec mediaCodec, boolean z, zzlg zzlg, zzlg zzlg2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo30552a(bqc bqc) {
        return true;
    }

    /* renamed from: l */
    public final int mo30359l() {
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo30360m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo30361n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo30473t() throws blt {
    }

    /* renamed from: a */
    public final int mo30405a(zzlg zzlg) throws blt {
        try {
            return mo30463a(this.f43561k, zzlg);
        } catch (bqj e) {
            throw blt.zza(e, this.f42859b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bqc mo30465a(bqf bqf, zzlg zzlg, boolean z) throws bqj {
        return bqf.mo30556a(zzlg.f46253c, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo30553u() throws blt {
        if (this.f43558h == null && this.f43569s != null) {
            this.f43570t = this.f43571u;
            if (this.f43570t != null) {
                int a = this.f43570t.mo30490a();
                if (a == 0) {
                    throw blt.zza(this.f43570t.mo30491b(), this.f42859b);
                } else if (a == 3 || a == 4) {
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.f43559i == null) {
                    try {
                        this.f43559i = mo30465a(this.f43561k, this.f43569s, false);
                    } catch (bqj e) {
                        m36438a(new bqe(this.f43569s, (Throwable) e, false, -49998));
                    }
                    if (this.f43559i == null) {
                        m36438a(new bqe(this.f43569s, (Throwable) null, false, -49999));
                    }
                }
                if (mo30552a(this.f43559i)) {
                    String str = this.f43559i.f43532a;
                    this.f43572v = btw.f43878a < 21 && this.f43569s.f46255e.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
                    this.f43573w = btw.f43878a < 18 || (btw.f43878a == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (btw.f43878a == 19 && btw.f43881d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
                    this.f43574x = btw.f43878a < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(btw.f43879b) || "flounder_lte".equals(btw.f43879b) || "grouper".equals(btw.f43879b) || "tilapia".equals(btw.f43879b));
                    this.f43575y = btw.f43878a <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
                    this.f43576z = (btw.f43878a <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (btw.f43878a <= 19 && "hb2000".equals(btw.f43879b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
                    this.f43539A = btw.f43878a == 21 && "OMX.google.aac.decoder".equals(str);
                    this.f43540B = btw.f43878a <= 18 && this.f43569s.f46262l == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str2 = "createCodec:";
                        String valueOf = String.valueOf(str);
                        btv.m36752a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        this.f43558h = MediaCodec.createByCodecName(str);
                        btv.m36751a();
                        btv.m36752a("configureCodec");
                        mo30467a(this.f43559i, this.f43558h, this.f43569s, (MediaCrypto) null);
                        btv.m36751a();
                        btv.m36752a("startCodec");
                        this.f43558h.start();
                        btv.m36751a();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        mo30468a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.f43543E = this.f43558h.getInputBuffers();
                        this.f43544F = this.f43558h.getOutputBuffers();
                    } catch (Exception e2) {
                        m36438a(new bqe(this.f43569s, (Throwable) e2, false, str));
                    }
                    this.f43545G = mo30351d() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.f43546H = -1;
                    this.f43547I = -1;
                    this.f43557S = true;
                    this.f43560j.f43174a++;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m36438a(bqe bqe) throws blt {
        throw blt.zza(bqe, this.f42859b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30346a(boolean z) throws blt {
        this.f43560j = new bob();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30344a(long j, boolean z) throws blt {
        this.f43554P = false;
        this.f43555Q = false;
        if (this.f43558h != null) {
            this.f43545G = -9223372036854775807L;
            this.f43546H = -1;
            this.f43547I = -1;
            this.f43557S = true;
            this.f43556R = false;
            this.f43548J = false;
            this.f43567q.clear();
            this.f43541C = false;
            this.f43542D = false;
            if (this.f43573w || (this.f43576z && this.f43553O)) {
                mo30554v();
                mo30553u();
            } else if (this.f43551M != 0) {
                mo30554v();
                mo30553u();
            } else {
                this.f43558h.flush();
                this.f43552N = false;
            }
            if (this.f43549K && this.f43569s != null) {
                this.f43550L = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo30362o() {
        this.f43569s = null;
        try {
            mo30554v();
        } finally {
            this.f43570t = null;
            this.f43571u = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo30554v() {
        this.f43545G = -9223372036854775807L;
        this.f43546H = -1;
        this.f43547I = -1;
        this.f43556R = false;
        this.f43548J = false;
        this.f43567q.clear();
        this.f43543E = null;
        this.f43544F = null;
        this.f43559i = null;
        this.f43549K = false;
        this.f43552N = false;
        this.f43572v = false;
        this.f43573w = false;
        this.f43574x = false;
        this.f43575y = false;
        this.f43576z = false;
        this.f43540B = false;
        this.f43541C = false;
        this.f43542D = false;
        this.f43553O = false;
        this.f43550L = 0;
        this.f43551M = 0;
        this.f43564n.f43182c = null;
        if (this.f43558h != null) {
            this.f43560j.f43175b++;
            try {
                this.f43558h.stop();
                try {
                    this.f43558h.release();
                } finally {
                    this.f43558h = null;
                    if (!(this.f43570t == null || this.f43571u == this.f43570t)) {
                        this.f43570t = null;
                    }
                }
            } catch (Throwable th) {
                this.f43558h = null;
                if (!(this.f43570t == null || this.f43571u == this.f43570t)) {
                    this.f43570t = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo30402a(long j, long j2) throws blt {
        if (this.f43555Q) {
            mo30473t();
            return;
        }
        if (this.f43569s == null) {
            this.f43565o.mo30478a();
            int a = mo30340a(this.f43566p, this.f43565o, true);
            if (a == -5) {
                mo30470b(this.f43566p.f42966a);
            } else if (a == -4) {
                bti.m36701b(this.f43565o.mo30481c());
                this.f43554P = true;
                mo30472s();
                return;
            } else {
                return;
            }
        }
        mo30553u();
        if (this.f43558h != null) {
            btv.m36752a("drainAndFeed");
            do {
            } while (m36439b(j, j2));
            do {
            } while (mo30471r());
            btv.m36751a();
            return;
        }
        this.f42860c.mo30596a(j - this.f42861d);
        this.f43565o.mo30478a();
        int a2 = mo30340a(this.f43566p, this.f43565o, false);
        if (a2 == -5) {
            mo30470b(this.f43566p.f42966a);
            return;
        }
        if (a2 == -4) {
            bti.m36701b(this.f43565o.mo30481c());
            this.f43554P = true;
            mo30472s();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x014f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0150  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean mo30471r() throws com.google.android.gms.internal.ads.blt {
        /*
            r15 = this;
            android.media.MediaCodec r0 = r15.f43558h
            r1 = 0
            if (r0 == 0) goto L_0x020f
            int r0 = r15.f43551M
            r2 = 2
            if (r0 == r2) goto L_0x020f
            boolean r0 = r15.f43554P
            if (r0 == 0) goto L_0x0010
            goto L_0x020f
        L_0x0010:
            int r0 = r15.f43546H
            if (r0 >= 0) goto L_0x0032
            android.media.MediaCodec r0 = r15.f43558h
            r3 = 0
            int r0 = r0.dequeueInputBuffer(r3)
            r15.f43546H = r0
            int r0 = r15.f43546H
            if (r0 >= 0) goto L_0x0023
            return r1
        L_0x0023:
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n
            java.nio.ByteBuffer[] r3 = r15.f43543E
            int r4 = r15.f43546H
            r3 = r3[r4]
            r0.f43182c = r3
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n
            r0.mo30478a()
        L_0x0032:
            int r0 = r15.f43551M
            r3 = -1
            r4 = 1
            if (r0 != r4) goto L_0x004f
            boolean r0 = r15.f43575y
            if (r0 != 0) goto L_0x004c
            r15.f43553O = r4
            android.media.MediaCodec r5 = r15.f43558h
            int r6 = r15.f43546H
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r15.f43546H = r3
        L_0x004c:
            r15.f43551M = r2
            return r1
        L_0x004f:
            boolean r0 = r15.f43541C
            if (r0 == 0) goto L_0x0071
            r15.f43541C = r1
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n
            java.nio.ByteBuffer r0 = r0.f43182c
            byte[] r1 = f43538g
            r0.put(r1)
            android.media.MediaCodec r5 = r15.f43558h
            int r6 = r15.f43546H
            r7 = 0
            byte[] r0 = f43538g
            int r8 = r0.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r15.f43546H = r3
            r15.f43552N = r4
            return r4
        L_0x0071:
            boolean r0 = r15.f43556R
            if (r0 == 0) goto L_0x0078
            r0 = -4
            r5 = 0
            goto L_0x00b0
        L_0x0078:
            int r0 = r15.f43550L
            if (r0 != r4) goto L_0x009d
            r0 = 0
        L_0x007d:
            com.google.android.gms.internal.ads.zzlg r5 = r15.f43569s
            java.util.List<byte[]> r5 = r5.f46255e
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x009b
            com.google.android.gms.internal.ads.zzlg r5 = r15.f43569s
            java.util.List<byte[]> r5 = r5.f46255e
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.google.android.gms.internal.ads.boc r6 = r15.f43564n
            java.nio.ByteBuffer r6 = r6.f43182c
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x007d
        L_0x009b:
            r15.f43550L = r2
        L_0x009d:
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n
            java.nio.ByteBuffer r0 = r0.f43182c
            int r0 = r0.position()
            com.google.android.gms.internal.ads.bmh r5 = r15.f43566p
            com.google.android.gms.internal.ads.boc r6 = r15.f43564n
            int r5 = r15.mo30340a(r5, r6, r1)
            r14 = r5
            r5 = r0
            r0 = r14
        L_0x00b0:
            r6 = -3
            if (r0 != r6) goto L_0x00b4
            return r1
        L_0x00b4:
            r6 = -5
            if (r0 != r6) goto L_0x00ca
            int r0 = r15.f43550L
            if (r0 != r2) goto L_0x00c2
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n
            r0.mo30478a()
            r15.f43550L = r4
        L_0x00c2:
            com.google.android.gms.internal.ads.bmh r0 = r15.f43566p
            com.google.android.gms.internal.ads.zzlg r0 = r0.f42966a
            r15.mo30470b(r0)
            return r4
        L_0x00ca:
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n
            boolean r0 = r0.mo30481c()
            if (r0 == 0) goto L_0x0104
            int r0 = r15.f43550L
            if (r0 != r2) goto L_0x00dd
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n
            r0.mo30478a()
            r15.f43550L = r4
        L_0x00dd:
            r15.f43554P = r4
            boolean r0 = r15.f43552N
            if (r0 != 0) goto L_0x00e7
            r15.mo30472s()
            return r1
        L_0x00e7:
            boolean r0 = r15.f43575y     // Catch:{ CryptoException -> 0x00fc }
            if (r0 != 0) goto L_0x00fb
            r15.f43553O = r4     // Catch:{ CryptoException -> 0x00fc }
            android.media.MediaCodec r5 = r15.f43558h     // Catch:{ CryptoException -> 0x00fc }
            int r6 = r15.f43546H     // Catch:{ CryptoException -> 0x00fc }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00fc }
            r15.f43546H = r3     // Catch:{ CryptoException -> 0x00fc }
        L_0x00fb:
            return r1
        L_0x00fc:
            r0 = move-exception
            int r1 = r15.f42859b
            com.google.android.gms.internal.ads.blt r0 = com.google.android.gms.internal.ads.blt.zza(r0, r1)
            throw r0
        L_0x0104:
            boolean r0 = r15.f43557S
            if (r0 == 0) goto L_0x011c
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n
            boolean r0 = r0.mo30482d()
            if (r0 != 0) goto L_0x011c
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n
            r0.mo30478a()
            int r0 = r15.f43550L
            if (r0 != r2) goto L_0x011b
            r15.f43550L = r4
        L_0x011b:
            return r4
        L_0x011c:
            r15.f43557S = r1
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n
            boolean r0 = r0.mo30485e()
            com.google.android.gms.internal.ads.bof<java.lang.Object> r2 = r15.f43570t
            if (r2 == 0) goto L_0x0148
            com.google.android.gms.internal.ads.bof<java.lang.Object> r2 = r15.f43570t
            int r2 = r2.mo30490a()
            if (r2 == 0) goto L_0x013b
            r6 = 4
            if (r2 == r6) goto L_0x0148
            if (r0 != 0) goto L_0x0139
            boolean r2 = r15.f43563m
            if (r2 != 0) goto L_0x0148
        L_0x0139:
            r2 = 1
            goto L_0x0149
        L_0x013b:
            com.google.android.gms.internal.ads.bof<java.lang.Object> r0 = r15.f43570t
            com.google.android.gms.internal.ads.bog r0 = r0.mo30491b()
            int r1 = r15.f42859b
            com.google.android.gms.internal.ads.blt r0 = com.google.android.gms.internal.ads.blt.zza(r0, r1)
            throw r0
        L_0x0148:
            r2 = 0
        L_0x0149:
            r15.f43556R = r2
            boolean r2 = r15.f43556R
            if (r2 == 0) goto L_0x0150
            return r1
        L_0x0150:
            boolean r2 = r15.f43572v
            if (r2 == 0) goto L_0x01a3
            if (r0 != 0) goto L_0x01a3
            com.google.android.gms.internal.ads.boc r2 = r15.f43564n
            java.nio.ByteBuffer r2 = r2.f43182c
            int r6 = r2.position()
            r7 = 0
            r8 = 0
        L_0x0160:
            int r9 = r7 + 1
            if (r9 >= r6) goto L_0x0193
            byte r10 = r2.get(r7)
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 3
            if (r8 != r11) goto L_0x018a
            if (r10 != r4) goto L_0x018e
            byte r12 = r2.get(r9)
            r12 = r12 & 31
            r13 = 7
            if (r12 != r13) goto L_0x018e
            java.nio.ByteBuffer r8 = r2.duplicate()
            int r7 = r7 - r11
            r8.position(r7)
            r8.limit(r6)
            r2.position(r1)
            r2.put(r8)
            goto L_0x0196
        L_0x018a:
            if (r10 != 0) goto L_0x018e
            int r8 = r8 + 1
        L_0x018e:
            if (r10 == 0) goto L_0x0191
            r8 = 0
        L_0x0191:
            r7 = r9
            goto L_0x0160
        L_0x0193:
            r2.clear()
        L_0x0196:
            com.google.android.gms.internal.ads.boc r2 = r15.f43564n
            java.nio.ByteBuffer r2 = r2.f43182c
            int r2 = r2.position()
            if (r2 != 0) goto L_0x01a1
            return r4
        L_0x01a1:
            r15.f43572v = r1
        L_0x01a3:
            com.google.android.gms.internal.ads.boc r2 = r15.f43564n     // Catch:{ CryptoException -> 0x0207 }
            long r10 = r2.f43183d     // Catch:{ CryptoException -> 0x0207 }
            com.google.android.gms.internal.ads.boc r2 = r15.f43564n     // Catch:{ CryptoException -> 0x0207 }
            boolean r2 = r2.mo30480b()     // Catch:{ CryptoException -> 0x0207 }
            if (r2 == 0) goto L_0x01b8
            java.util.List<java.lang.Long> r2 = r15.f43567q     // Catch:{ CryptoException -> 0x0207 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x0207 }
            r2.add(r6)     // Catch:{ CryptoException -> 0x0207 }
        L_0x01b8:
            com.google.android.gms.internal.ads.boc r2 = r15.f43564n     // Catch:{ CryptoException -> 0x0207 }
            java.nio.ByteBuffer r2 = r2.f43182c     // Catch:{ CryptoException -> 0x0207 }
            r2.flip()     // Catch:{ CryptoException -> 0x0207 }
            com.google.android.gms.internal.ads.boc r2 = r15.f43564n     // Catch:{ CryptoException -> 0x0207 }
            r15.mo30550a(r2)     // Catch:{ CryptoException -> 0x0207 }
            if (r0 == 0) goto L_0x01e8
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n     // Catch:{ CryptoException -> 0x0207 }
            com.google.android.gms.internal.ads.bnx r0 = r0.f43181b     // Catch:{ CryptoException -> 0x0207 }
            android.media.MediaCodec$CryptoInfo r9 = r0.f43165i     // Catch:{ CryptoException -> 0x0207 }
            if (r5 != 0) goto L_0x01cf
            goto L_0x01de
        L_0x01cf:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x0207 }
            if (r0 != 0) goto L_0x01d7
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x0207 }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x0207 }
        L_0x01d7:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x0207 }
            r2 = r0[r1]     // Catch:{ CryptoException -> 0x0207 }
            int r2 = r2 + r5
            r0[r1] = r2     // Catch:{ CryptoException -> 0x0207 }
        L_0x01de:
            android.media.MediaCodec r6 = r15.f43558h     // Catch:{ CryptoException -> 0x0207 }
            int r7 = r15.f43546H     // Catch:{ CryptoException -> 0x0207 }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x0207 }
            goto L_0x01f9
        L_0x01e8:
            android.media.MediaCodec r6 = r15.f43558h     // Catch:{ CryptoException -> 0x0207 }
            int r7 = r15.f43546H     // Catch:{ CryptoException -> 0x0207 }
            r8 = 0
            com.google.android.gms.internal.ads.boc r0 = r15.f43564n     // Catch:{ CryptoException -> 0x0207 }
            java.nio.ByteBuffer r0 = r0.f43182c     // Catch:{ CryptoException -> 0x0207 }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x0207 }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x0207 }
        L_0x01f9:
            r15.f43546H = r3     // Catch:{ CryptoException -> 0x0207 }
            r15.f43552N = r4     // Catch:{ CryptoException -> 0x0207 }
            r15.f43550L = r1     // Catch:{ CryptoException -> 0x0207 }
            com.google.android.gms.internal.ads.bob r0 = r15.f43560j     // Catch:{ CryptoException -> 0x0207 }
            int r1 = r0.f43176c     // Catch:{ CryptoException -> 0x0207 }
            int r1 = r1 + r4
            r0.f43176c = r1     // Catch:{ CryptoException -> 0x0207 }
            return r4
        L_0x0207:
            r0 = move-exception
            int r1 = r15.f42859b
            com.google.android.gms.internal.ads.blt r0 = com.google.android.gms.internal.ads.blt.zza(r0, r1)
            throw r0
        L_0x020f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bqd.mo30471r():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo30470b(zzlg zzlg) throws blt {
        Object obj;
        zzlg zzlg2 = this.f43569s;
        this.f43569s = zzlg;
        zznd zznd = this.f43569s.f46256f;
        if (zzlg2 == null) {
            obj = null;
        } else {
            obj = zzlg2.f46256f;
        }
        boolean a = btw.m36762a((Object) zznd, obj);
        boolean z = true;
        if (!a) {
            if (this.f43569s.f46256f == null) {
                this.f43571u = null;
            } else if (this.f43562l != null) {
                this.f43571u = this.f43562l.mo30492a(Looper.myLooper(), this.f43569s.f46256f);
                bof<Object> bof = this.f43571u;
                bof<Object> bof2 = this.f43570t;
            } else {
                throw blt.zza(new IllegalStateException("Media requires a DrmSessionManager"), this.f42859b);
            }
        }
        if (this.f43571u == this.f43570t && this.f43558h != null && mo30551a(this.f43558h, this.f43559i.f43533b, zzlg2, this.f43569s)) {
            this.f43549K = true;
            this.f43550L = 1;
            if (!(this.f43574x && this.f43569s.f46257g == zzlg2.f46257g && this.f43569s.f46258h == zzlg2.f46258h)) {
                z = false;
            }
            this.f43541C = z;
        } else if (this.f43552N) {
            this.f43551M = 1;
        } else {
            mo30554v();
            mo30553u();
        }
    }

    /* renamed from: q */
    public boolean mo30404q() {
        return this.f43555Q;
    }

    /* renamed from: p */
    public boolean mo30403p() {
        if (this.f43569s != null && !this.f43556R) {
            if ((this.f42862e ? this.f42863f : this.f42860c.mo30597a()) || this.f43547I >= 0 || (this.f43545G != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f43545G)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m36439b(long j, long j2) throws blt {
        boolean z;
        boolean z2;
        if (this.f43547I < 0) {
            if (!this.f43539A || !this.f43553O) {
                this.f43547I = this.f43558h.dequeueOutputBuffer(this.f43568r, 0);
            } else {
                try {
                    this.f43547I = this.f43558h.dequeueOutputBuffer(this.f43568r, 0);
                } catch (IllegalStateException unused) {
                    mo30472s();
                    if (this.f43555Q) {
                        mo30554v();
                    }
                    return false;
                }
            }
            if (this.f43547I >= 0) {
                if (this.f43542D) {
                    this.f43542D = false;
                    this.f43558h.releaseOutputBuffer(this.f43547I, false);
                    this.f43547I = -1;
                    return true;
                } else if ((this.f43568r.flags & 4) != 0) {
                    mo30472s();
                    this.f43547I = -1;
                    return false;
                } else {
                    ByteBuffer byteBuffer = this.f43544F[this.f43547I];
                    if (byteBuffer != null) {
                        byteBuffer.position(this.f43568r.offset);
                        byteBuffer.limit(this.f43568r.offset + this.f43568r.size);
                    }
                    long j3 = this.f43568r.presentationTimeUs;
                    int size = this.f43567q.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z2 = false;
                            break;
                        } else if (((Long) this.f43567q.get(i)).longValue() == j3) {
                            this.f43567q.remove(i);
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    this.f43548J = z2;
                }
            } else if (this.f43547I == -2) {
                MediaFormat outputFormat = this.f43558h.getOutputFormat();
                if (this.f43574x && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f43542D = true;
                } else {
                    if (this.f43540B) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    mo30466a(this.f43558h, outputFormat);
                }
                return true;
            } else if (this.f43547I == -3) {
                this.f43544F = this.f43558h.getOutputBuffers();
                return true;
            } else {
                if (this.f43575y && (this.f43554P || this.f43551M == 2)) {
                    mo30472s();
                }
                return false;
            }
        }
        if (!this.f43539A || !this.f43553O) {
            z = mo30469a(j, j2, this.f43558h, this.f43544F[this.f43547I], this.f43547I, this.f43568r.flags, this.f43568r.presentationTimeUs, this.f43548J);
        } else {
            try {
                z = mo30469a(j, j2, this.f43558h, this.f43544F[this.f43547I], this.f43547I, this.f43568r.flags, this.f43568r.presentationTimeUs, this.f43548J);
            } catch (IllegalStateException unused2) {
                mo30472s();
                if (this.f43555Q) {
                    mo30554v();
                }
                return false;
            }
        }
        if (!z) {
            return false;
        }
        long j4 = this.f43568r.presentationTimeUs;
        this.f43547I = -1;
        return true;
    }

    /* renamed from: s */
    private final void mo30472s() throws blt {
        if (this.f43551M == 2) {
            mo30554v();
            mo30553u();
            return;
        }
        this.f43555Q = true;
        mo30473t();
    }

    static {
        String str = "0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78";
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        f43538g = bArr;
    }
}
