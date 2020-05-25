package com.facebook.p955h;

import com.facebook.common.p920d.C13684g;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p928l.C13735c;
import com.facebook.p955h.C13900c.C13901a;

/* renamed from: com.facebook.h.a */
public final class C13898a implements C13901a {

    /* renamed from: b */
    private static final byte[] f36250b;

    /* renamed from: c */
    private static final int f36251c;

    /* renamed from: d */
    private static final byte[] f36252d;

    /* renamed from: e */
    private static final int f36253e;

    /* renamed from: f */
    private static final byte[] f36254f = C13903e.m28319a("GIF87a");

    /* renamed from: g */
    private static final byte[] f36255g = C13903e.m28319a("GIF89a");

    /* renamed from: h */
    private static final byte[] f36256h;

    /* renamed from: i */
    private static final int f36257i;

    /* renamed from: j */
    private static final byte[] f36258j;

    /* renamed from: k */
    private static final int f36259k;

    /* renamed from: l */
    private static final String[] f36260l = {"heic", "heix", "hevc", "hevx", "mif1", "msf1"};

    /* renamed from: m */
    private static final int f36261m;

    /* renamed from: a */
    final int f36262a = C13684g.m27643a(21, 20, f36251c, f36253e, 6, f36257i, f36259k, f36261m);

    /* renamed from: a */
    public final int mo26068a() {
        return this.f36262a;
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f36250b = bArr;
        f36251c = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f36252d = bArr2;
        f36253e = bArr2.length;
        byte[] a = C13903e.m28319a("BM");
        f36256h = a;
        f36257i = a.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f36258j = bArr3;
        f36259k = bArr3.length;
        StringBuilder sb = new StringBuilder("ftyp");
        sb.append(f36260l[0]);
        f36261m = C13903e.m28319a(sb.toString()).length;
    }

    /* renamed from: a */
    public final C13900c mo26069a(byte[] bArr, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C13689i.m27652a(bArr);
        boolean z10 = false;
        if (C13735c.m27786a(bArr, 0, i)) {
            C13689i.m27655a(C13735c.m27786a(bArr, 0, i));
            if (C13735c.m27787a(bArr, 12, C13735c.f35726e)) {
                return C13899b.f36268f;
            }
            if (C13735c.m27787a(bArr, 12, C13735c.f35727f)) {
                return C13899b.f36269g;
            }
            if (i < 21 || !C13735c.m27787a(bArr, 12, C13735c.f35728g)) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (!z6) {
                return C13900c.f36275a;
            }
            boolean a = C13735c.m27787a(bArr, 12, C13735c.f35728g);
            if ((bArr[20] & 2) == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!a || !z7) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (z8) {
                return C13899b.f36272j;
            }
            boolean a2 = C13735c.m27787a(bArr, 12, C13735c.f35728g);
            if ((bArr[20] & 16) == 16) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (a2 && z9) {
                z10 = true;
            }
            if (z10) {
                return C13899b.f36271i;
            }
            return C13899b.f36270h;
        }
        if (i < f36250b.length || !C13903e.m28318a(bArr, f36250b)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return C13899b.f36263a;
        }
        if (i < f36252d.length || !C13903e.m28318a(bArr, f36252d)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return C13899b.f36264b;
        }
        if (i < 6 || (!C13903e.m28318a(bArr, f36254f) && !C13903e.m28318a(bArr, f36255g))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            return C13899b.f36265c;
        }
        if (i < f36256h.length) {
            z4 = false;
        } else {
            z4 = C13903e.m28318a(bArr, f36256h);
        }
        if (z4) {
            return C13899b.f36266d;
        }
        if (i < f36258j.length) {
            z5 = false;
        } else {
            z5 = C13903e.m28318a(bArr, f36258j);
        }
        if (z5) {
            return C13899b.f36267e;
        }
        if (i >= f36261m && bArr[3] >= 8) {
            String[] strArr = f36260l;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str = strArr[i2];
                int length2 = bArr.length;
                StringBuilder sb = new StringBuilder("ftyp");
                sb.append(str);
                if (C13903e.m28317a(bArr, length2, C13903e.m28319a(sb.toString()), f36261m) >= 0) {
                    z10 = true;
                    break;
                }
                i2++;
            }
        }
        if (z10) {
            return C13899b.f36273k;
        }
        return C13900c.f36275a;
    }
}
