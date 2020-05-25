package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.ttm.player.MediaPlayer;
import java.util.Arrays;

final class bnu {

    /* renamed from: a */
    final int f43121a;

    /* renamed from: b */
    final int f43122b = (this.f43133m * 2);

    /* renamed from: c */
    short[] f43123c;

    /* renamed from: d */
    short[] f43124d;

    /* renamed from: e */
    public float f43125e;

    /* renamed from: f */
    public float f43126f;

    /* renamed from: g */
    int f43127g;

    /* renamed from: h */
    public int f43128h;

    /* renamed from: i */
    int f43129i;

    /* renamed from: j */
    int f43130j;

    /* renamed from: k */
    private final int f43131k;

    /* renamed from: l */
    private final int f43132l;

    /* renamed from: m */
    private final int f43133m;

    /* renamed from: n */
    private final short[] f43134n = new short[this.f43122b];

    /* renamed from: o */
    private int f43135o = this.f43122b;

    /* renamed from: p */
    private int f43136p;

    /* renamed from: q */
    private int f43137q;

    /* renamed from: r */
    private short[] f43138r;

    /* renamed from: s */
    private int f43139s;

    /* renamed from: t */
    private int f43140t;

    /* renamed from: u */
    private int f43141u;

    /* renamed from: v */
    private int f43142v;

    /* renamed from: w */
    private int f43143w;

    /* renamed from: x */
    private int f43144x;

    public bnu(int i, int i2) {
        this.f43131k = i;
        this.f43121a = i2;
        this.f43132l = i / MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        this.f43133m = i / 65;
        this.f43123c = new short[(this.f43122b * i2)];
        this.f43136p = this.f43122b;
        this.f43124d = new short[(this.f43122b * i2)];
        this.f43137q = this.f43122b;
        this.f43138r = new short[(this.f43122b * i2)];
        this.f43125e = 1.0f;
        this.f43126f = 1.0f;
    }

    /* renamed from: b */
    private final void m36268b(int i) {
        if (this.f43128h + i > this.f43136p) {
            this.f43136p += (this.f43136p / 2) + i;
            this.f43124d = Arrays.copyOf(this.f43124d, this.f43136p * this.f43121a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30475a(int i) {
        if (this.f43127g + i > this.f43135o) {
            this.f43135o += (this.f43135o / 2) + i;
            this.f43123c = Arrays.copyOf(this.f43123c, this.f43135o * this.f43121a);
        }
    }

    /* renamed from: a */
    private final void m36267a(short[] sArr, int i, int i2) {
        m36268b(i2);
        System.arraycopy(sArr, i * this.f43121a, this.f43124d, this.f43128h * this.f43121a, this.f43121a * i2);
        this.f43128h += i2;
    }

    /* renamed from: b */
    private final void m36269b(short[] sArr, int i, int i2) {
        int i3 = this.f43122b / i2;
        int i4 = this.f43121a * i2;
        int i5 = i * this.f43121a;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                i7 += sArr[(i6 * i4) + i5 + i8];
            }
            this.f43134n[i6] = (short) (i7 / i4);
        }
    }

    /* renamed from: a */
    private final int m36265a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f43121a;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = NormalGiftView.ALPHA_255;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i6 < i5 * i2) {
                i6 = i2;
                i5 = i9;
            }
            if (i9 * i8 > i7 * i2) {
                i8 = i2;
                i7 = i9;
            }
            i2++;
        }
        this.f43143w = i5 / i6;
        this.f43144x = i7 / i8;
        return i6;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30474a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f43128h;
        float f = this.f43125e / this.f43126f;
        double d = (double) f;
        int i5 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            m36267a(this.f43123c, 0, this.f43127g);
            this.f43127g = 0;
        } else if (this.f43127g >= this.f43122b) {
            int i6 = this.f43127g;
            int i7 = 0;
            while (true) {
                if (this.f43130j > 0) {
                    int min = Math.min(this.f43122b, this.f43130j);
                    m36267a(this.f43123c, i7, min);
                    this.f43130j -= min;
                    i7 += min;
                } else {
                    short[] sArr = this.f43123c;
                    int i8 = this.f43131k > 4000 ? this.f43131k / 4000 : 1;
                    if (this.f43121a == i5 && i8 == i5) {
                        i = m36265a(sArr, i7, this.f43132l, this.f43133m);
                    } else {
                        m36269b(sArr, i7, i8);
                        int a = m36265a(this.f43134n, 0, this.f43132l / i8, this.f43133m / i8);
                        if (i8 != i5) {
                            int i9 = a * i8;
                            int i10 = i8 << 2;
                            int i11 = i9 - i10;
                            int i12 = i9 + i10;
                            if (i11 < this.f43132l) {
                                i11 = this.f43132l;
                            }
                            if (i12 > this.f43133m) {
                                i12 = this.f43133m;
                            }
                            if (this.f43121a == i5) {
                                i = m36265a(sArr, i7, i11, i12);
                            } else {
                                m36269b(sArr, i7, i5);
                                i = m36265a(this.f43134n, 0, i11, i12);
                            }
                        } else {
                            i = a;
                        }
                    }
                    int i13 = this.f43143w;
                    int i14 = i13 != 0 && this.f43141u != 0 && this.f43144x <= i13 * 3 && (i13 << 1) > this.f43142v * 3 ? this.f43141u : i;
                    this.f43142v = this.f43143w;
                    this.f43141u = i;
                    if (d > 1.0d) {
                        short[] sArr2 = this.f43123c;
                        if (f >= 2.0f) {
                            i3 = (int) (((float) i14) / (f - 1.0f));
                        } else {
                            this.f43130j = (int) ((((float) i14) * (2.0f - f)) / (f - 1.0f));
                            i3 = i14;
                        }
                        m36268b(i3);
                        int i15 = i3;
                        int i16 = i14;
                        int i17 = i7;
                        m36266a(i3, this.f43121a, this.f43124d, this.f43128h, sArr2, i7, sArr2, i7 + i14);
                        this.f43128h += i15;
                        i7 = i17 + i16 + i15;
                    } else {
                        int i18 = i14;
                        int i19 = i7;
                        short[] sArr3 = this.f43123c;
                        if (f < 0.5f) {
                            i2 = (int) ((((float) i18) * f) / (1.0f - f));
                        } else {
                            this.f43130j = (int) ((((float) i18) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                            i2 = i18;
                        }
                        int i20 = i18 + i2;
                        m36268b(i20);
                        System.arraycopy(sArr3, this.f43121a * i19, this.f43124d, this.f43128h * this.f43121a, this.f43121a * i18);
                        int i21 = i20;
                        m36266a(i2, this.f43121a, this.f43124d, this.f43128h + i18, sArr3, i19 + i18, sArr3, i19);
                        this.f43128h += i21;
                        i7 = i19 + i2;
                    }
                }
                if (this.f43122b + i7 > i6) {
                    break;
                }
                i5 = 1;
            }
            int i22 = this.f43127g - i7;
            System.arraycopy(this.f43123c, i7 * this.f43121a, this.f43123c, 0, this.f43121a * i22);
            this.f43127g = i22;
        }
        if (this.f43126f != 1.0f) {
            float f2 = this.f43126f;
            if (this.f43128h != i4) {
                int i23 = (int) (((float) this.f43131k) / f2);
                int i24 = this.f43131k;
                while (true) {
                    if (i23 <= 16384 && i24 <= 16384) {
                        break;
                    }
                    i23 /= 2;
                    i24 /= 2;
                }
                int i25 = this.f43128h - i4;
                if (this.f43129i + i25 > this.f43137q) {
                    this.f43137q += (this.f43137q / 2) + i25;
                    this.f43138r = Arrays.copyOf(this.f43138r, this.f43137q * this.f43121a);
                }
                System.arraycopy(this.f43124d, this.f43121a * i4, this.f43138r, this.f43129i * this.f43121a, this.f43121a * i25);
                this.f43128h = i4;
                this.f43129i += i25;
                int i26 = 0;
                while (true) {
                    int i27 = 1;
                    if (i26 >= this.f43129i - 1) {
                        break;
                    }
                    while ((this.f43139s + i27) * i23 > this.f43140t * i24) {
                        m36268b(i27);
                        for (int i28 = 0; i28 < this.f43121a; i28++) {
                            short[] sArr4 = this.f43124d;
                            int i29 = (this.f43128h * this.f43121a) + i28;
                            short[] sArr5 = this.f43138r;
                            int i30 = (this.f43121a * i26) + i28;
                            short s = sArr5[i30];
                            short s2 = sArr5[i30 + this.f43121a];
                            int i31 = (this.f43139s + 1) * i23;
                            int i32 = i31 - (this.f43140t * i24);
                            int i33 = i31 - (this.f43139s * i23);
                            sArr4[i29] = (short) (((s * i32) + ((i33 - i32) * s2)) / i33);
                        }
                        i27 = 1;
                        this.f43140t++;
                        this.f43128h++;
                    }
                    this.f43139s += i27;
                    if (this.f43139s == i24) {
                        this.f43139s = 0;
                        bti.m36701b(this.f43140t == i23);
                        this.f43140t = 0;
                    }
                    i26++;
                }
                int i34 = this.f43129i - 1;
                if (i34 != 0) {
                    System.arraycopy(this.f43138r, this.f43121a * i34, this.f43138r, 0, (this.f43129i - i34) * this.f43121a);
                    this.f43129i -= i34;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m36266a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }
}
