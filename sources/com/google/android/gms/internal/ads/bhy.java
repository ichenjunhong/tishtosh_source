package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;

public final class bhy extends bhl {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final bic f42446f;

    /* renamed from: g */
    private final long f42447g;

    /* renamed from: h */
    private final int f42448h;

    /* renamed from: i */
    private final int f42449i;

    /* renamed from: j */
    private Surface f42450j;

    /* renamed from: k */
    private boolean f42451k;

    /* renamed from: l */
    private boolean f42452l;

    /* renamed from: m */
    private long f42453m;

    /* renamed from: n */
    private long f42454n;

    /* renamed from: o */
    private int f42455o;

    /* renamed from: p */
    private int f42456p;

    /* renamed from: q */
    private int f42457q;

    /* renamed from: r */
    private float f42458r;

    /* renamed from: s */
    private int f42459s;

    /* renamed from: t */
    private int f42460t;

    /* renamed from: u */
    private float f42461u;

    public bhy(bii bii, int i, long j, Handler handler, bic bic, int i2) {
        this(bii, null, true, 1, 0, null, handler, bic, -1);
    }

    private bhy(bii bii, biu biu, boolean z, int i, long j, bid bid, Handler handler, bic bic, int i2) {
        super(bii, null, true, handler, bic);
        this.f42448h = 1;
        this.f42446f = bic;
        this.f42449i = -1;
        this.f42453m = -1;
        this.f42456p = -1;
        this.f42457q = -1;
        this.f42458r = -1.0f;
        this.f42459s = -1;
        this.f42460t = -1;
        this.f42461u = -1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30187a(String str) {
        return blk.m36006a(str).equals("video") && super.mo30187a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30182a(long j, boolean z) {
        super.mo30182a(j, z);
        this.f42452l = false;
        if (z && this.f42447g > 0) {
            this.f42453m = (SystemClock.elapsedRealtime() * 1000) + this.f42447g;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30181a(long j) throws bgy {
        super.mo30181a(j);
        this.f42452l = false;
        this.f42453m = -1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r9.f42405d != 2) goto L_0x001f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30191e() {
        /*
            r9 = this;
            boolean r0 = super.mo30191e()
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 == 0) goto L_0x001f
            boolean r0 = r9.f42452l
            if (r0 != 0) goto L_0x001c
            android.media.MediaCodec r0 = r9.f42404c
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x001c
            int r0 = r9.f42405d
            r5 = 2
            if (r0 != r5) goto L_0x001f
        L_0x001c:
            r9.f42453m = r3
            return r2
        L_0x001f:
            long r5 = r9.f42453m
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            return r1
        L_0x0026:
            long r5 = android.os.SystemClock.elapsedRealtime()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            long r7 = r9.f42453m
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0035
            return r2
        L_0x0035:
            r9.f42453m = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bhy.mo30191e():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30188b() {
        super.mo30188b();
        this.f42455o = 0;
        this.f42454n = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo30189c() {
        this.f42453m = -1;
        m35749t();
        super.mo30189c();
    }

    /* renamed from: g */
    public final void mo30193g() {
        this.f42456p = -1;
        this.f42457q = -1;
        this.f42458r = -1.0f;
        this.f42459s = -1;
        this.f42460t = -1;
        this.f42461u = -1.0f;
        super.mo30193g();
    }

    /* renamed from: a */
    public final void mo30161a(int i, Object obj) throws bgy {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (this.f42450j != surface) {
                this.f42450j = surface;
                this.f42451k = false;
                int i2 = this.f42494e;
                if (i2 == 2 || i2 == 3) {
                    mo30202j();
                    mo30200h();
                }
            }
            return;
        }
        super.mo30161a(i, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo30201i() {
        return super.mo30201i() && this.f42450j != null && this.f42450j.isValid();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30183a(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, this.f42450j, mediaCrypto, 0);
        mediaCodec.setVideoScalingMode(this.f42448h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30197a(bif bif) throws bgy {
        float f;
        super.mo30197a(bif);
        if (bif.f42484a.f42475e == -1.0f) {
            f = 1.0f;
        } else {
            f = bif.f42484a.f42475e;
        }
        this.f42458r = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30184a(bie bie, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f42456p = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f42457q = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30198a(MediaCodec mediaCodec, boolean z, bie bie, bie bie2) {
        return bie2.f42471a.equals(bie.f42471a) && (z || (bie.f42473c == bie2.f42473c && bie.f42474d == bie2.f42474d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30186a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) {
        if (z) {
            blo.m36020a("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            blo.m36019a();
            this.f42402a.f42331f++;
            return true;
        }
        long elapsedRealtime = (bufferInfo.presentationTimeUs - j) - ((SystemClock.elapsedRealtime() * 1000) - j2);
        long nanoTime = System.nanoTime() + (elapsedRealtime * 1000);
        if (elapsedRealtime < -30000) {
            blo.m36020a("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            blo.m36019a();
            this.f42402a.f42332g++;
            this.f42455o++;
            if (this.f42455o == this.f42449i) {
                m35749t();
            }
            return true;
        } else if (!this.f42452l) {
            m35746a(mediaCodec, i);
            return true;
        } else if (this.f42494e != 3) {
            return false;
        } else {
            if (blp.f42854a >= 21) {
                if (elapsedRealtime < 50000) {
                    m35747r();
                    blo.m36020a("releaseOutputBufferTimed");
                    mediaCodec.releaseOutputBuffer(i, nanoTime);
                    blo.m36019a();
                    this.f42402a.f42330e++;
                    this.f42452l = true;
                    m35748s();
                    return true;
                }
            } else if (elapsedRealtime < 30000) {
                if (elapsedRealtime > 11000) {
                    try {
                        Thread.sleep((elapsedRealtime - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                m35746a(mediaCodec, i);
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m35746a(MediaCodec mediaCodec, int i) {
        m35747r();
        blo.m36020a("renderVideoBufferImmediate");
        mediaCodec.releaseOutputBuffer(i, true);
        blo.m36019a();
        this.f42402a.f42330e++;
        this.f42452l = true;
        m35748s();
    }

    /* renamed from: r */
    private final void m35747r() {
        if (this.f42403b != null && this.f42446f != null && (this.f42459s != this.f42456p || this.f42460t != this.f42457q || this.f42461u != this.f42458r)) {
            int i = this.f42456p;
            int i2 = this.f42457q;
            float f = this.f42458r;
            this.f42403b.post(new bhz(this, i, i2, f));
            this.f42459s = i;
            this.f42460t = i2;
            this.f42461u = f;
        }
    }

    /* renamed from: s */
    private final void m35748s() {
        if (this.f42403b != null && this.f42446f != null && !this.f42451k) {
            this.f42403b.post(new bia(this, this.f42450j));
            this.f42451k = true;
        }
    }

    /* renamed from: t */
    private final void m35749t() {
        if (this.f42403b != null && this.f42446f != null && this.f42455o != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f42403b.post(new bib(this, this.f42455o, elapsedRealtime - this.f42454n));
            this.f42455o = 0;
            this.f42454n = elapsedRealtime;
        }
    }
}
