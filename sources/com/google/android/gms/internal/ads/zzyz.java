package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.C14912d;
import com.google.android.gms.ads.C15043m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public class zzyz extends AbstractSafeParcelable {
    public static final Creator<zzyz> CREATOR = new bzw();

    /* renamed from: a */
    public final String f46338a;

    /* renamed from: b */
    public final int f46339b;

    /* renamed from: c */
    public final int f46340c;

    /* renamed from: d */
    public final boolean f46341d;

    /* renamed from: e */
    public final int f46342e;

    /* renamed from: f */
    public final int f46343f;

    /* renamed from: g */
    public final zzyz[] f46344g;

    /* renamed from: h */
    public final boolean f46345h;

    /* renamed from: i */
    public final boolean f46346i;

    /* renamed from: j */
    public boolean f46347j;

    /* renamed from: a */
    public static int m39301a(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* renamed from: a */
    public static zzyz m39303a(Context context) {
        zzyz zzyz = new zzyz("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
        return zzyz;
    }

    /* renamed from: a */
    public static zzyz m39302a() {
        zzyz zzyz = new zzyz("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
        return zzyz;
    }

    public zzyz() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public zzyz(Context context, C14912d dVar) {
        this(context, new C14912d[]{dVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzyz(android.content.Context r13, com.google.android.gms.ads.C14912d[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            int r2 = r1.f38464k
            r3 = 1
            r4 = -3
            if (r2 != r4) goto L_0x0013
            int r2 = r1.f38465l
            r4 = -4
            if (r2 != r4) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            r12.f46346i = r2
            boolean r2 = r12.f46346i
            if (r2 == 0) goto L_0x0027
            com.google.android.gms.ads.d r2 = com.google.android.gms.ads.C14912d.f38454a
            int r2 = r2.f38464k
            r12.f46342e = r2
            com.google.android.gms.ads.d r2 = com.google.android.gms.ads.C14912d.f38454a
            int r2 = r2.f38465l
            r12.f46339b = r2
            goto L_0x002f
        L_0x0027:
            int r2 = r1.f38464k
            r12.f46342e = r2
            int r2 = r1.f38465l
            r12.f46339b = r2
        L_0x002f:
            int r2 = r12.f46342e
            r4 = -1
            if (r2 != r4) goto L_0x0036
            r2 = 1
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            int r4 = r12.f46339b
            r5 = -2
            if (r4 != r5) goto L_0x003e
            r4 = 1
            goto L_0x003f
        L_0x003e:
            r4 = 0
        L_0x003f:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x00b4
            android.content.res.Resources r6 = r13.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r7 = 2
            if (r6 != r7) goto L_0x006b
            android.content.res.Resources r6 = r13.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r7 = r6.heightPixels
            float r7 = (float) r7
            float r6 = r6.density
            float r7 = r7 / r6
            int r6 = (int) r7
            r7 = 600(0x258, float:8.41E-43)
            if (r6 >= r7) goto L_0x006b
            r6 = 1
            goto L_0x006c
        L_0x006b:
            r6 = 0
        L_0x006c:
            if (r6 == 0) goto L_0x0094
            boolean r6 = com.google.android.gms.internal.ads.aes.m32764c(r13)
            if (r6 == 0) goto L_0x0094
            int r6 = r5.widthPixels
            android.content.res.Resources r7 = r13.getResources()
            java.lang.String r8 = "navigation_bar_width"
            java.lang.String r9 = "dimen"
            java.lang.String r10 = "android"
            int r7 = r7.getIdentifier(r8, r9, r10)
            if (r7 <= 0) goto L_0x008f
            android.content.res.Resources r8 = r13.getResources()
            int r7 = r8.getDimensionPixelSize(r7)
            goto L_0x0090
        L_0x008f:
            r7 = 0
        L_0x0090:
            int r6 = r6 - r7
            r12.f46343f = r6
            goto L_0x0098
        L_0x0094:
            int r6 = r5.widthPixels
            r12.f46343f = r6
        L_0x0098:
            int r6 = r12.f46343f
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r9)
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00be
            int r8 = r8 + 1
            goto L_0x00be
        L_0x00b4:
            int r8 = r12.f46342e
            int r6 = r12.f46342e
            int r6 = com.google.android.gms.internal.ads.aes.m32749a(r5, r6)
            r12.f46343f = r6
        L_0x00be:
            if (r4 == 0) goto L_0x00c5
            int r6 = m39301a(r5)
            goto L_0x00c7
        L_0x00c5:
            int r6 = r12.f46339b
        L_0x00c7:
            int r5 = com.google.android.gms.internal.ads.aes.m32749a(r5, r6)
            r12.f46340c = r5
            if (r2 != 0) goto L_0x00e2
            if (r4 == 0) goto L_0x00d2
            goto L_0x00e2
        L_0x00d2:
            boolean r2 = r12.f46346i
            if (r2 == 0) goto L_0x00db
            java.lang.String r1 = "320x50_mb"
            r12.f46338a = r1
            goto L_0x00ff
        L_0x00db:
            java.lang.String r1 = r1.toString()
            r12.f46338a = r1
            goto L_0x00ff
        L_0x00e2:
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "x"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "_as"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r12.f46338a = r1
        L_0x00ff:
            int r1 = r14.length
            if (r1 <= r3) goto L_0x0119
            int r1 = r14.length
            com.google.android.gms.internal.ads.zzyz[] r1 = new com.google.android.gms.internal.ads.zzyz[r1]
            r12.f46344g = r1
            r1 = 0
        L_0x0108:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x011c
            com.google.android.gms.internal.ads.zzyz[] r2 = r12.f46344g
            com.google.android.gms.internal.ads.zzyz r3 = new com.google.android.gms.internal.ads.zzyz
            r4 = r14[r1]
            r3.<init>(r13, r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x0108
        L_0x0119:
            r13 = 0
            r12.f46344g = r13
        L_0x011c:
            r12.f46345h = r0
            r12.f46347j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyz.<init>(android.content.Context, com.google.android.gms.ads.d[]):void");
    }

    public zzyz(zzyz zzyz, zzyz[] zzyzArr) {
        this(zzyz.f46338a, zzyz.f46339b, zzyz.f46340c, zzyz.f46341d, zzyz.f46342e, zzyz.f46343f, zzyzArr, zzyz.f46345h, zzyz.f46346i, zzyz.f46347j);
    }

    zzyz(String str, int i, int i2, boolean z, int i3, int i4, zzyz[] zzyzArr, boolean z2, boolean z3, boolean z4) {
        this.f46338a = str;
        this.f46339b = i;
        this.f46340c = i2;
        this.f46341d = z;
        this.f46342e = i3;
        this.f46343f = i4;
        this.f46344g = zzyzArr;
        this.f46345h = z2;
        this.f46346i = z3;
        this.f46347j = z4;
    }

    /* renamed from: b */
    public final C14912d mo31647b() {
        return C15043m.m31117a(this.f46342e, this.f46339b, this.f46338a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f46338a, false);
        C15469b.m32195b(parcel, 3, this.f46339b);
        C15469b.m32195b(parcel, 4, this.f46340c);
        C15469b.m32189a(parcel, 5, this.f46341d);
        C15469b.m32195b(parcel, 6, this.f46342e);
        C15469b.m32195b(parcel, 7, this.f46343f);
        C15469b.m32191a(parcel, 8, (T[]) this.f46344g, i, false);
        C15469b.m32189a(parcel, 9, this.f46345h);
        C15469b.m32189a(parcel, 10, this.f46346i);
        C15469b.m32189a(parcel, 11, this.f46347j);
        C15469b.m32197c(parcel, a);
    }
}
