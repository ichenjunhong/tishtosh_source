package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@C16299uq
public final class zzaxi extends AbstractSafeParcelable {
    public static final Creator<zzaxi> CREATOR = new C16327vr();

    /* renamed from: A */
    public final zzbaz f46156A;

    /* renamed from: B */
    public final List<String> f46157B;

    /* renamed from: C */
    public final List<String> f46158C;

    /* renamed from: D */
    public final boolean f46159D;

    /* renamed from: E */
    public final zzaxk f46160E;

    /* renamed from: F */
    public final boolean f46161F;

    /* renamed from: G */
    public String f46162G;

    /* renamed from: H */
    public final List<String> f46163H;

    /* renamed from: I */
    public final boolean f46164I;

    /* renamed from: J */
    public final String f46165J;

    /* renamed from: K */
    public final zzbbq f46166K;

    /* renamed from: L */
    public final String f46167L;

    /* renamed from: M */
    public final boolean f46168M;

    /* renamed from: N */
    public final boolean f46169N;

    /* renamed from: O */
    public final boolean f46170O;

    /* renamed from: P */
    public final int f46171P;

    /* renamed from: Q */
    public final boolean f46172Q;

    /* renamed from: R */
    public final List<String> f46173R;

    /* renamed from: S */
    public final boolean f46174S;

    /* renamed from: T */
    public final String f46175T;

    /* renamed from: U */
    public String f46176U;

    /* renamed from: V */
    public boolean f46177V;

    /* renamed from: W */
    public boolean f46178W;

    /* renamed from: X */
    private zzaxe f46179X;

    /* renamed from: Y */
    private final int f46180Y;

    /* renamed from: Z */
    private zzaxu f46181Z;

    /* renamed from: a */
    public final String f46182a;

    /* renamed from: aa */
    private Bundle f46183aa;

    /* renamed from: b */
    public String f46184b;

    /* renamed from: c */
    public final List<String> f46185c;

    /* renamed from: d */
    public final int f46186d;

    /* renamed from: e */
    public final List<String> f46187e;

    /* renamed from: f */
    public final long f46188f;

    /* renamed from: g */
    public final boolean f46189g;

    /* renamed from: h */
    public final long f46190h;

    /* renamed from: i */
    public final List<String> f46191i;

    /* renamed from: j */
    public final long f46192j;

    /* renamed from: k */
    public final int f46193k;

    /* renamed from: l */
    public final String f46194l;

    /* renamed from: m */
    public final long f46195m;

    /* renamed from: n */
    public final String f46196n;

    /* renamed from: o */
    public final boolean f46197o;

    /* renamed from: p */
    public final String f46198p;

    /* renamed from: q */
    public final String f46199q;

    /* renamed from: r */
    public final boolean f46200r;

    /* renamed from: s */
    public final boolean f46201s;

    /* renamed from: t */
    public final boolean f46202t;

    /* renamed from: u */
    public final boolean f46203u;

    /* renamed from: v */
    public final boolean f46204v;

    /* renamed from: w */
    public String f46205w;

    /* renamed from: x */
    public final String f46206x;

    /* renamed from: y */
    public final boolean f46207y;

    /* renamed from: z */
    public final boolean f46208z;

    public zzaxi(zzaxe zzaxe, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzbaz zzbaz, List<String> list4, List<String> list5, boolean z10, zzaxk zzaxk, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzbbq zzbbq, String str10, boolean z13, boolean z14, boolean z15, int i2, boolean z16, List<String> list7, boolean z17, String str11, String str12, boolean z18, boolean z19) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, zzbaz, list4, list5, z10, zzaxk, z11, str8, list6, z12, str9, zzbbq, str10, z13, z14, null, z15, 0, z16, list7, z17, str11, str12, z18, z19);
        this.f46179X = zzaxe;
    }

    public zzaxi(zzaxe zzaxe, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzbaz zzbaz, List<String> list4, List<String> list5, boolean z9, zzaxk zzaxk, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzbbq zzbbq, String str9, boolean z12, boolean z13, boolean z14, int i2, boolean z15, List<String> list7, boolean z16, String str10, String str11, boolean z17, boolean z18) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z7, z8, zzbaz, list4, list5, z9, zzaxk, z10, str7, list6, z11, str8, zzbbq, str9, z12, z13, null, z14, i2, z15, list7, z16, str10, str11, z17, z18);
        this.f46179X = zzaxe;
    }

    public zzaxi(int i) {
        this(19, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null, null, false, false);
    }

    public zzaxi(int i, long j) {
        this(19, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null, null, false, false);
    }

    zzaxi(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzaxu zzaxu, String str7, String str8, boolean z8, boolean z9, zzbaz zzbaz, List<String> list4, List<String> list5, boolean z10, zzaxk zzaxk, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzbbq zzbbq, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4, boolean z16, List<String> list7, boolean z17, String str12, String str13, boolean z18, boolean z19) {
        this.f46180Y = i;
        this.f46182a = str;
        this.f46184b = str2;
        List<String> list8 = null;
        this.f46185c = list != null ? Collections.unmodifiableList(list) : null;
        this.f46186d = i2;
        this.f46187e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f46188f = j;
        this.f46189g = z;
        this.f46190h = j2;
        this.f46191i = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f46192j = j3;
        this.f46193k = i3;
        this.f46194l = str3;
        this.f46195m = j4;
        this.f46196n = str4;
        this.f46197o = z2;
        this.f46198p = str5;
        this.f46199q = str6;
        this.f46200r = z3;
        this.f46201s = z4;
        this.f46202t = z5;
        this.f46203u = z6;
        this.f46168M = z13;
        this.f46204v = z7;
        this.f46181Z = zzaxu;
        this.f46205w = str7;
        this.f46206x = str8;
        if (this.f46184b == null && this.f46181Z != null) {
            zzayi zzayi = (zzayi) this.f46181Z.mo31582a(zzayi.CREATOR);
            if (zzayi != null && !TextUtils.isEmpty(zzayi.f46223a)) {
                this.f46184b = zzayi.f46223a;
            }
        }
        this.f46207y = z8;
        this.f46208z = z9;
        this.f46156A = zzbaz;
        this.f46157B = list4;
        this.f46158C = list5;
        this.f46159D = z10;
        this.f46160E = zzaxk;
        this.f46161F = z11;
        this.f46162G = str9;
        this.f46163H = list6;
        this.f46164I = z12;
        this.f46165J = str10;
        this.f46166K = zzbbq;
        this.f46167L = str11;
        this.f46169N = z14;
        this.f46183aa = bundle;
        this.f46170O = z15;
        this.f46171P = i4;
        this.f46172Q = z16;
        if (list7 != null) {
            list8 = Collections.unmodifiableList(list7);
        }
        this.f46173R = list8;
        this.f46174S = z17;
        this.f46175T = str12;
        this.f46176U = str13;
        this.f46177V = z18;
        this.f46178W = z19;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f46179X != null && this.f46179X.f46123a >= 9 && !TextUtils.isEmpty(this.f46184b)) {
            this.f46181Z = new zzaxu((SafeParcelable) new zzayi(this.f46184b));
            this.f46184b = null;
        }
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46180Y);
        C15469b.m32187a(parcel, 2, this.f46182a, false);
        C15469b.m32187a(parcel, 3, this.f46184b, false);
        C15469b.m32188a(parcel, 4, this.f46185c, false);
        C15469b.m32195b(parcel, 5, this.f46186d);
        C15469b.m32188a(parcel, 6, this.f46187e, false);
        C15469b.m32180a(parcel, 7, this.f46188f);
        C15469b.m32189a(parcel, 8, this.f46189g);
        C15469b.m32180a(parcel, 9, this.f46190h);
        C15469b.m32188a(parcel, 10, this.f46191i, false);
        C15469b.m32180a(parcel, 11, this.f46192j);
        C15469b.m32195b(parcel, 12, this.f46193k);
        C15469b.m32187a(parcel, 13, this.f46194l, false);
        C15469b.m32180a(parcel, 14, this.f46195m);
        C15469b.m32187a(parcel, 15, this.f46196n, false);
        C15469b.m32189a(parcel, 18, this.f46197o);
        C15469b.m32187a(parcel, 19, this.f46198p, false);
        C15469b.m32187a(parcel, 21, this.f46199q, false);
        C15469b.m32189a(parcel, 22, this.f46200r);
        C15469b.m32189a(parcel, 23, this.f46201s);
        C15469b.m32189a(parcel, 24, this.f46202t);
        C15469b.m32189a(parcel, 25, this.f46203u);
        C15469b.m32189a(parcel, 26, this.f46204v);
        C15469b.m32183a(parcel, 28, (Parcelable) this.f46181Z, i, false);
        C15469b.m32187a(parcel, 29, this.f46205w, false);
        C15469b.m32187a(parcel, 30, this.f46206x, false);
        C15469b.m32189a(parcel, 31, this.f46207y);
        C15469b.m32189a(parcel, 32, this.f46208z);
        C15469b.m32183a(parcel, 33, (Parcelable) this.f46156A, i, false);
        C15469b.m32188a(parcel, 34, this.f46157B, false);
        C15469b.m32188a(parcel, 35, this.f46158C, false);
        C15469b.m32189a(parcel, 36, this.f46159D);
        C15469b.m32183a(parcel, 37, (Parcelable) this.f46160E, i, false);
        C15469b.m32189a(parcel, 38, this.f46161F);
        C15469b.m32187a(parcel, 39, this.f46162G, false);
        C15469b.m32188a(parcel, 40, this.f46163H, false);
        C15469b.m32189a(parcel, 42, this.f46164I);
        C15469b.m32187a(parcel, 43, this.f46165J, false);
        C15469b.m32183a(parcel, 44, (Parcelable) this.f46166K, i, false);
        C15469b.m32187a(parcel, 45, this.f46167L, false);
        C15469b.m32189a(parcel, 46, this.f46168M);
        C15469b.m32189a(parcel, 47, this.f46169N);
        C15469b.m32181a(parcel, 48, this.f46183aa, false);
        C15469b.m32189a(parcel, 49, this.f46170O);
        C15469b.m32195b(parcel, 50, this.f46171P);
        C15469b.m32189a(parcel, 51, this.f46172Q);
        C15469b.m32188a(parcel, 52, this.f46173R, false);
        C15469b.m32189a(parcel, 53, this.f46174S);
        C15469b.m32187a(parcel, 54, this.f46175T, false);
        C15469b.m32187a(parcel, 55, this.f46176U, false);
        C15469b.m32189a(parcel, 56, this.f46177V);
        C15469b.m32189a(parcel, 57, this.f46178W);
        C15469b.m32197c(parcel, a);
    }
}
