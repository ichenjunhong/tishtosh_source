package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import java.lang.reflect.Method;

public final class bil {

    /* renamed from: A */
    private long f42495A;

    /* renamed from: B */
    private float f42496B;

    /* renamed from: a */
    final bin f42497a;

    /* renamed from: b */
    AudioTrack f42498b;

    /* renamed from: c */
    int f42499c;

    /* renamed from: d */
    int f42500d;

    /* renamed from: e */
    int f42501e;

    /* renamed from: f */
    int f42502f;

    /* renamed from: g */
    long f42503g;

    /* renamed from: h */
    int f42504h;

    /* renamed from: i */
    long f42505i;

    /* renamed from: j */
    byte[] f42506j;

    /* renamed from: k */
    int f42507k;

    /* renamed from: l */
    int f42508l;

    /* renamed from: m */
    boolean f42509m;

    /* renamed from: n */
    int f42510n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final ConditionVariable f42511o = new ConditionVariable(true);

    /* renamed from: p */
    private final long[] f42512p;

    /* renamed from: q */
    private int f42513q;

    /* renamed from: r */
    private int f42514r;

    /* renamed from: s */
    private int f42515s;

    /* renamed from: t */
    private int f42516t;

    /* renamed from: u */
    private long f42517u;

    /* renamed from: v */
    private long f42518v;

    /* renamed from: w */
    private boolean f42519w;

    /* renamed from: x */
    private long f42520x;

    /* renamed from: y */
    private Method f42521y;

    /* renamed from: z */
    private long f42522z;

    public bil() {
        if (blp.f42854a >= 18) {
            try {
                this.f42521y = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (blp.f42854a >= 19) {
            this.f42497a = new bio();
        } else {
            this.f42497a = new bin(null);
        }
        this.f42512p = new long[10];
        this.f42496B = 1.0f;
        this.f42504h = 0;
    }

    /* renamed from: a */
    public final boolean mo30236a() {
        return this.f42498b != null;
    }

    /* renamed from: a */
    public final long mo30233a(boolean z) {
        long j;
        long j2;
        if (!(mo30236a() && this.f42505i != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f42498b.getPlayState() == 3) {
            long c = this.f42497a.mo30246c();
            if (c != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f42518v >= 30000) {
                    this.f42512p[this.f42515s] = c - nanoTime;
                    this.f42515s = (this.f42515s + 1) % 10;
                    if (this.f42516t < 10) {
                        this.f42516t++;
                    }
                    this.f42518v = nanoTime;
                    this.f42517u = 0;
                    for (int i = 0; i < this.f42516t; i++) {
                        this.f42517u += this.f42512p[i] / ((long) this.f42516t);
                    }
                }
                if (!this.f42509m && nanoTime - this.f42520x >= 500000) {
                    this.f42519w = this.f42497a.mo30247d();
                    if (this.f42519w) {
                        long e = this.f42497a.mo30248e() / 1000;
                        long f = this.f42497a.mo30249f();
                        if (e < this.f42522z) {
                            this.f42519w = false;
                        } else if (Math.abs(e - nanoTime) > 5000000) {
                            this.f42519w = false;
                        } else if (Math.abs(mo30237b(f) - c) > 5000000) {
                            this.f42519w = false;
                        }
                    }
                    if (this.f42521y != null) {
                        try {
                            this.f42495A = (((long) ((Integer) this.f42521y.invoke(this.f42498b, null)).intValue()) * 1000) - mo30237b(mo30232a((long) this.f42502f));
                            this.f42495A = Math.max(this.f42495A, 0);
                            if (this.f42495A > 5000000) {
                                this.f42495A = 0;
                            }
                        } catch (Exception unused) {
                            this.f42521y = null;
                        }
                    }
                    this.f42520x = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f42519w) {
            j = mo30237b(this.f42497a.mo30249f() + m35807c(nanoTime2 - (this.f42497a.mo30248e() / 1000))) + this.f42505i;
        } else {
            if (this.f42516t == 0) {
                j2 = this.f42497a.mo30246c() + this.f42505i;
            } else {
                j2 = nanoTime2 + this.f42517u + this.f42505i;
            }
            j = j2;
            if (!z) {
                j -= this.f42495A;
            }
        }
        return j;
    }

    /* renamed from: a */
    public final int mo30231a(int i) throws bip {
        this.f42511o.block();
        if (i == 0) {
            AudioTrack audioTrack = new AudioTrack(3, this.f42499c, this.f42513q, this.f42514r, this.f42502f, 1);
            this.f42498b = audioTrack;
        } else {
            AudioTrack audioTrack2 = new AudioTrack(3, this.f42499c, this.f42513q, this.f42514r, this.f42502f, 1, i);
            this.f42498b = audioTrack2;
        }
        int state = this.f42498b.getState();
        if (state == 1) {
            int audioSessionId = this.f42498b.getAudioSessionId();
            this.f42497a.mo30243a(this.f42498b, this.f42509m);
            mo30234a(this.f42496B);
            return audioSessionId;
        }
        try {
            this.f42498b.release();
        } catch (Exception unused) {
        } finally {
            this.f42498b = null;
        }
        throw new bip(state, this.f42499c, this.f42513q, this.f42502f);
    }

    /* renamed from: a */
    public final void mo30235a(MediaFormat mediaFormat, int i) {
        int i2;
        int integer = mediaFormat.getInteger("channel-count");
        if (integer == 6) {
            i2 = 252;
        } else if (integer != 8) {
            switch (integer) {
                case 1:
                    i2 = 4;
                    break;
                case 2:
                    i2 = 12;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unsupported channel count: ");
                    sb.append(integer);
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            i2 = 1020;
        }
        int integer2 = mediaFormat.getInteger("sample-rate");
        String string = mediaFormat.getString("mime");
        int i3 = "audio/ac3".equals(string) ? 5 : "audio/eac3".equals(string) ? 6 : blk.m36007b(string) ? 2 : 0;
        boolean z = true;
        boolean z2 = i3 == 5 || i3 == 6;
        if (!mo30236a() || this.f42499c != integer2 || this.f42513q != i2 || this.f42509m || z2) {
            mo30240d();
            this.f42514r = i3;
            this.f42499c = integer2;
            this.f42513q = i2;
            this.f42509m = z2;
            this.f42510n = 0;
            this.f42500d = integer * 2;
            this.f42501e = AudioTrack.getMinBufferSize(integer2, i2, i3);
            if (this.f42501e == -2) {
                z = false;
            }
            blg.m36001b(z);
            int i4 = this.f42501e << 2;
            int c = ((int) m35807c(250000)) * this.f42500d;
            int max = (int) Math.max((long) this.f42501e, m35807c(750000) * ((long) this.f42500d));
            if (i4 < c) {
                i4 = c;
            } else if (i4 > max) {
                i4 = max;
            }
            this.f42502f = i4;
        }
    }

    /* renamed from: b */
    public final void mo30238b() {
        if (mo30236a()) {
            this.f42522z = System.nanoTime() / 1000;
            this.f42498b.play();
        }
    }

    /* renamed from: c */
    public final boolean mo30239c() {
        return mo30236a() && (mo30232a(this.f42503g) > this.f42497a.mo30245b() || this.f42497a.mo30244a());
    }

    /* renamed from: a */
    public final void mo30234a(float f) {
        this.f42496B = f;
        if (mo30236a()) {
            if (blp.f42854a >= 21) {
                this.f42498b.setVolume(f);
                return;
            }
            this.f42498b.setStereoVolume(f, f);
        }
    }

    /* renamed from: d */
    public final void mo30240d() {
        if (mo30236a()) {
            this.f42503g = 0;
            this.f42508l = 0;
            this.f42505i = 0;
            this.f42495A = 0;
            mo30241e();
            if (this.f42498b.getPlayState() == 3) {
                this.f42498b.pause();
            }
            AudioTrack audioTrack = this.f42498b;
            this.f42498b = null;
            this.f42497a.mo30243a(null, false);
            this.f42511o.close();
            new bim(this, audioTrack).start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo30232a(long j) {
        if (!this.f42509m) {
            return j / ((long) this.f42500d);
        }
        if (this.f42510n == 0) {
            return 0;
        }
        return ((j << 3) * ((long) this.f42499c)) / ((long) (this.f42510n * 1000));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final long mo30237b(long j) {
        return (j * 1000000) / ((long) this.f42499c);
    }

    /* renamed from: c */
    private final long m35807c(long j) {
        return (j * ((long) this.f42499c)) / 1000000;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo30241e() {
        this.f42517u = 0;
        this.f42516t = 0;
        this.f42515s = 0;
        this.f42518v = 0;
        this.f42519w = false;
        this.f42520x = 0;
    }
}
