package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

public abstract class bsf extends bsl {

    /* renamed from: b */
    private final SparseArray<Map<brx, bsh>> f43765b = new SparseArray<>();

    /* renamed from: c */
    private final SparseBooleanArray f43766c = new SparseBooleanArray();

    /* renamed from: d */
    private int f43767d = 0;

    /* renamed from: e */
    private bsg f43768e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bsi[] mo30653a(bmn[] bmnArr, brx[] brxArr, int[][][] iArr) throws blt;

    /* renamed from: a */
    public final void mo30657a(int i, boolean z) {
        if (this.f43766c.get(i) != z) {
            this.f43766c.put(i, z);
            if (this.f43778a != null) {
                this.f43778a.mo30388b();
            }
        }
    }

    /* renamed from: a */
    public final bsn mo30656a(bmn[] bmnArr, brx brx) throws blt {
        int[] iArr;
        bmn[] bmnArr2 = bmnArr;
        brx brx2 = brx;
        int[] iArr2 = new int[(bmnArr2.length + 1)];
        brv[][] brvArr = new brv[(bmnArr2.length + 1)][];
        int[][][] iArr3 = new int[(bmnArr2.length + 1)][][];
        for (int i = 0; i < brvArr.length; i++) {
            brvArr[i] = new brv[brx2.f43741b];
            iArr3[i] = new int[brx2.f43741b][];
        }
        int[] iArr4 = new int[bmnArr2.length];
        for (int i2 = 0; i2 < iArr4.length; i2++) {
            iArr4[i2] = bmnArr2[i2].mo30359l();
        }
        for (int i3 = 0; i3 < brx2.f43741b; i3++) {
            brv a = brx2.mo30640a(i3);
            int length = bmnArr2.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= bmnArr2.length) {
                    i4 = length;
                    break;
                }
                bmn bmn = bmnArr2[i4];
                int i6 = length;
                for (int i7 = 0; i7 < a.f43722a; i7++) {
                    int a2 = bmn.mo30405a(a.mo30624a(i7)) & 3;
                    if (a2 > i5) {
                        if (a2 == 3) {
                            break;
                        }
                        i6 = i4;
                        i5 = a2;
                    }
                }
                i4++;
                length = i6;
            }
            if (i4 == bmnArr2.length) {
                iArr = new int[a.f43722a];
            } else {
                bmn bmn2 = bmnArr2[i4];
                int[] iArr5 = new int[a.f43722a];
                for (int i8 = 0; i8 < a.f43722a; i8++) {
                    iArr5[i8] = bmn2.mo30405a(a.mo30624a(i8));
                }
                iArr = iArr5;
            }
            int i9 = iArr2[i4];
            brvArr[i4][i9] = a;
            iArr3[i4][i9] = iArr;
            iArr2[i4] = iArr2[i4] + 1;
        }
        brx[] brxArr = new brx[bmnArr2.length];
        int[] iArr6 = new int[bmnArr2.length];
        for (int i10 = 0; i10 < bmnArr2.length; i10++) {
            int i11 = iArr2[i10];
            brxArr[i10] = new brx((brv[]) Arrays.copyOf(brvArr[i10], i11));
            iArr3[i10] = (int[][]) Arrays.copyOf(iArr3[i10], i11);
            iArr6[i10] = bmnArr2[i10].mo30339a();
        }
        brx brx3 = new brx((brv[]) Arrays.copyOf(brvArr[bmnArr2.length], iArr2[bmnArr2.length]));
        bsi[] a3 = mo30653a(bmnArr2, brxArr, iArr3);
        int i12 = 0;
        while (true) {
            bsh bsh = null;
            if (i12 < bmnArr2.length) {
                if (this.f43766c.get(i12)) {
                    a3[i12] = null;
                } else {
                    brx brx4 = brxArr[i12];
                    Map map = (Map) this.f43765b.get(i12);
                    if (map != null) {
                        bsh = (bsh) map.get(brx4);
                    }
                    if (bsh != null) {
                        throw new NoSuchMethodError();
                    }
                }
                i12++;
            } else {
                bsg bsg = new bsg(iArr6, brxArr, iArr4, iArr3, brx3);
                bmo[] bmoArr = new bmo[bmnArr2.length];
                for (int i13 = 0; i13 < bmnArr2.length; i13++) {
                    bmoArr[i13] = a3[i13] != null ? bmo.f42974a : null;
                }
                return new bsn(brx2, new bsk(a3), bsg, bmoArr);
            }
        }
    }

    /* renamed from: a */
    public final void mo30658a(Object obj) {
        this.f43768e = (bsg) obj;
    }
}
