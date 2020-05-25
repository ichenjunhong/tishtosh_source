package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class bpe {

    /* renamed from: A */
    public float f43271A;

    /* renamed from: B */
    public float f43272B;

    /* renamed from: C */
    public float f43273C;

    /* renamed from: D */
    public float f43274D;

    /* renamed from: E */
    public float f43275E;

    /* renamed from: F */
    public float f43276F;

    /* renamed from: G */
    public int f43277G;

    /* renamed from: H */
    public int f43278H;

    /* renamed from: I */
    public int f43279I;

    /* renamed from: J */
    public long f43280J;

    /* renamed from: K */
    public long f43281K;

    /* renamed from: L */
    public boolean f43282L;

    /* renamed from: M */
    public boolean f43283M;

    /* renamed from: N */
    String f43284N;

    /* renamed from: O */
    public bot f43285O;

    /* renamed from: P */
    public int f43286P;

    /* renamed from: a */
    public String f43287a;

    /* renamed from: b */
    public int f43288b;

    /* renamed from: c */
    public int f43289c;

    /* renamed from: d */
    public int f43290d;

    /* renamed from: e */
    public boolean f43291e;

    /* renamed from: f */
    public byte[] f43292f;

    /* renamed from: g */
    public bou f43293g;

    /* renamed from: h */
    public byte[] f43294h;

    /* renamed from: i */
    public zznd f43295i;

    /* renamed from: j */
    public int f43296j;

    /* renamed from: k */
    public int f43297k;

    /* renamed from: l */
    public int f43298l;

    /* renamed from: m */
    public int f43299m;

    /* renamed from: n */
    public int f43300n;

    /* renamed from: o */
    public byte[] f43301o;

    /* renamed from: p */
    public int f43302p;

    /* renamed from: q */
    public boolean f43303q;

    /* renamed from: r */
    public int f43304r;

    /* renamed from: s */
    public int f43305s;

    /* renamed from: t */
    public int f43306t;

    /* renamed from: u */
    public int f43307u;

    /* renamed from: v */
    public int f43308v;

    /* renamed from: w */
    public float f43309w;

    /* renamed from: x */
    public float f43310x;

    /* renamed from: y */
    public float f43311y;

    /* renamed from: z */
    public float f43312z;

    private bpe() {
        this.f43296j = -1;
        this.f43297k = -1;
        this.f43298l = -1;
        this.f43299m = -1;
        this.f43302p = -1;
        this.f43304r = -1;
        this.f43305s = -1;
        this.f43306t = -1;
        this.f43307u = 1000;
        this.f43308v = 200;
        this.f43309w = -1.0f;
        this.f43310x = -1.0f;
        this.f43311y = -1.0f;
        this.f43312z = -1.0f;
        this.f43271A = -1.0f;
        this.f43272B = -1.0f;
        this.f43273C = -1.0f;
        this.f43274D = -1.0f;
        this.f43275E = -1.0f;
        this.f43276F = -1.0f;
        this.f43277G = 1;
        this.f43278H = -1;
        this.f43279I = 8000;
        this.f43283M = true;
        this.f43284N = "eng";
    }

    /* renamed from: a */
    static List<byte[]> m36384a(btr btr) throws bmk {
        try {
            btr.mo30699d(16);
            byte[] bArr = btr.f43867a;
            int i = btr.f43868b;
            btr.f43868b = i + 1;
            long j = ((long) bArr[i]) & 255;
            byte[] bArr2 = btr.f43867a;
            int i2 = btr.f43868b;
            btr.f43868b = i2 + 1;
            long j2 = j | ((((long) bArr2[i2]) & 255) << 8);
            byte[] bArr3 = btr.f43867a;
            int i3 = btr.f43868b;
            btr.f43868b = i3 + 1;
            long j3 = j2 | ((((long) bArr3[i3]) & 255) << 16);
            byte[] bArr4 = btr.f43867a;
            int i4 = btr.f43868b;
            btr.f43868b = i4 + 1;
            if ((j3 | ((255 & ((long) bArr4[i4])) << 24)) != 826496599) {
                return null;
            }
            byte[] bArr5 = btr.f43867a;
            for (int i5 = btr.f43868b + 20; i5 < bArr5.length - 4; i5++) {
                if (bArr5[i5] == 0 && bArr5[i5 + 1] == 0 && bArr5[i5 + 2] == 1 && bArr5[i5 + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr5, i5, bArr5.length));
                }
            }
            throw new bmk("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new bmk("Error parsing FourCC VC1 codec private");
        }
    }

    /* renamed from: a */
    static List<byte[]> m36385a(byte[] bArr) throws bmk {
        try {
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
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new bmk("Error parsing vorbis codec private");
                    }
                    throw new bmk("Error parsing vorbis codec private");
                }
                throw new bmk("Error parsing vorbis codec private");
            }
            throw new bmk("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new bmk("Error parsing vorbis codec private");
        }
    }

    /* synthetic */ bpe(bpc bpc) {
        this();
    }

    /* renamed from: b */
    static boolean m36386b(btr btr) throws bmk {
        try {
            byte[] bArr = btr.f43867a;
            int i = btr.f43868b;
            btr.f43868b = i + 1;
            byte b = bArr[i] & 255;
            byte[] bArr2 = btr.f43867a;
            int i2 = btr.f43868b;
            btr.f43868b = i2 + 1;
            byte b2 = b | ((bArr2[i2] & 255) << 8);
            if (b2 == 1) {
                return true;
            }
            if (b2 != 65534) {
                return false;
            }
            btr.mo30697c(24);
            return btr.mo30704h() == bpb.f43218I.getMostSignificantBits() && btr.mo30704h() == bpb.f43218I.getLeastSignificantBits();
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new bmk("Error parsing MS/ACM codec private");
        }
    }
}
