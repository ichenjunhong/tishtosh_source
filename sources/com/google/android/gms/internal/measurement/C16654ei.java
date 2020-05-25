package com.google.android.gms.internal.measurement;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ei */
public final class C16654ei extends C16843ku<C16654ei> {

    /* renamed from: m */
    private static volatile C16654ei[] f46855m;

    /* renamed from: a */
    public int f46856a;

    /* renamed from: b */
    public String f46857b;

    /* renamed from: c */
    public C16654ei[] f46858c;

    /* renamed from: d */
    public C16654ei[] f46859d;

    /* renamed from: e */
    public C16654ei[] f46860e;

    /* renamed from: f */
    public String f46861f;

    /* renamed from: g */
    public String f46862g;

    /* renamed from: h */
    public long f46863h;

    /* renamed from: i */
    public boolean f46864i;

    /* renamed from: j */
    public C16654ei[] f46865j;

    /* renamed from: k */
    public int[] f46866k;

    /* renamed from: l */
    public boolean f46867l;

    /* renamed from: a */
    private static int m39793a(int i) {
        if (i > 0 && i <= 17) {
            return i;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append(i);
        sb.append(" is not a valid enum Escaping");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static C16654ei[] m39794a() {
        if (f46855m == null) {
            synchronized (C16847ky.f47301b) {
                if (f46855m == null) {
                    f46855m = new C16654ei[0];
                }
            }
        }
        return f46855m;
    }

    public C16654ei() {
        this.f46856a = 1;
        this.f46857b = "";
        this.f46858c = m39794a();
        this.f46859d = m39794a();
        this.f46860e = m39794a();
        this.f46861f = "";
        this.f46862g = "";
        this.f46863h = 0;
        this.f46864i = false;
        this.f46865j = m39794a();
        this.f46866k = C16853ld.f47307a;
        this.f46867l = false;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16654ei)) {
            return false;
        }
        C16654ei eiVar = (C16654ei) obj;
        if (this.f46856a != eiVar.f46856a) {
            return false;
        }
        if (this.f46857b == null) {
            if (eiVar.f46857b != null) {
                return false;
            }
        } else if (!this.f46857b.equals(eiVar.f46857b)) {
            return false;
        }
        if (!C16847ky.m40903a((Object[]) this.f46858c, (Object[]) eiVar.f46858c) || !C16847ky.m40903a((Object[]) this.f46859d, (Object[]) eiVar.f46859d) || !C16847ky.m40903a((Object[]) this.f46860e, (Object[]) eiVar.f46860e)) {
            return false;
        }
        if (this.f46861f == null) {
            if (eiVar.f46861f != null) {
                return false;
            }
        } else if (!this.f46861f.equals(eiVar.f46861f)) {
            return false;
        }
        if (this.f46862g == null) {
            if (eiVar.f46862g != null) {
                return false;
            }
        } else if (!this.f46862g.equals(eiVar.f46862g)) {
            return false;
        }
        if (this.f46863h != eiVar.f46863h || this.f46864i != eiVar.f46864i || !C16847ky.m40903a((Object[]) this.f46865j, (Object[]) eiVar.f46865j) || !C16847ky.m40901a(this.f46866k, eiVar.f46866k) || this.f46867l != eiVar.f46867l) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return eiVar.f47288L == null || eiVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(eiVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 1237;
        int hashCode = (((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f46856a) * 31) + (this.f46857b == null ? 0 : this.f46857b.hashCode())) * 31) + C16847ky.m40899a((Object[]) this.f46858c)) * 31) + C16847ky.m40899a((Object[]) this.f46859d)) * 31) + C16847ky.m40899a((Object[]) this.f46860e)) * 31) + (this.f46861f == null ? 0 : this.f46861f.hashCode())) * 31) + (this.f46862g == null ? 0 : this.f46862g.hashCode())) * 31) + ((int) (this.f46863h ^ (this.f46863h >>> 32)))) * 31) + (this.f46864i ? 1231 : 1237)) * 31) + C16847ky.m40899a((Object[]) this.f46865j)) * 31) + C16847ky.m40897a(this.f46866k)) * 31;
        if (this.f46867l) {
            i2 = 1231;
        }
        int i3 = (hashCode + i2) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return i3 + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        ksVar.mo32442a(1, this.f46856a);
        if (this.f46857b != null && !this.f46857b.equals("")) {
            ksVar.mo32445a(2, this.f46857b);
        }
        if (this.f46858c != null && this.f46858c.length > 0) {
            for (C16654ei eiVar : this.f46858c) {
                if (eiVar != null) {
                    ksVar.mo32444a(3, (C16850la) eiVar);
                }
            }
        }
        if (this.f46859d != null && this.f46859d.length > 0) {
            for (C16654ei eiVar2 : this.f46859d) {
                if (eiVar2 != null) {
                    ksVar.mo32444a(4, (C16850la) eiVar2);
                }
            }
        }
        if (this.f46860e != null && this.f46860e.length > 0) {
            for (C16654ei eiVar3 : this.f46860e) {
                if (eiVar3 != null) {
                    ksVar.mo32444a(5, (C16850la) eiVar3);
                }
            }
        }
        if (this.f46861f != null && !this.f46861f.equals("")) {
            ksVar.mo32445a(6, this.f46861f);
        }
        if (this.f46862g != null && !this.f46862g.equals("")) {
            ksVar.mo32445a(7, this.f46862g);
        }
        if (this.f46863h != 0) {
            ksVar.mo32448b(8, this.f46863h);
        }
        if (this.f46867l) {
            ksVar.mo32446a(9, this.f46867l);
        }
        if (this.f46866k != null && this.f46866k.length > 0) {
            for (int a : this.f46866k) {
                ksVar.mo32442a(10, a);
            }
        }
        if (this.f46865j != null && this.f46865j.length > 0) {
            for (C16654ei eiVar4 : this.f46865j) {
                if (eiVar4 != null) {
                    ksVar.mo32444a(11, (C16850la) eiVar4);
                }
            }
        }
        if (this.f46864i) {
            ksVar.mo32446a(12, this.f46864i);
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b() + C16841ks.m40862b(1, this.f46856a);
        if (this.f46857b != null && !this.f46857b.equals("")) {
            b += C16841ks.m40864b(2, this.f46857b);
        }
        if (this.f46858c != null && this.f46858c.length > 0) {
            int i = b;
            for (C16654ei eiVar : this.f46858c) {
                if (eiVar != null) {
                    i += C16841ks.m40863b(3, (C16850la) eiVar);
                }
            }
            b = i;
        }
        if (this.f46859d != null && this.f46859d.length > 0) {
            int i2 = b;
            for (C16654ei eiVar2 : this.f46859d) {
                if (eiVar2 != null) {
                    i2 += C16841ks.m40863b(4, (C16850la) eiVar2);
                }
            }
            b = i2;
        }
        if (this.f46860e != null && this.f46860e.length > 0) {
            int i3 = b;
            for (C16654ei eiVar3 : this.f46860e) {
                if (eiVar3 != null) {
                    i3 += C16841ks.m40863b(5, (C16850la) eiVar3);
                }
            }
            b = i3;
        }
        if (this.f46861f != null && !this.f46861f.equals("")) {
            b += C16841ks.m40864b(6, this.f46861f);
        }
        if (this.f46862g != null && !this.f46862g.equals("")) {
            b += C16841ks.m40864b(7, this.f46862g);
        }
        if (this.f46863h != 0) {
            b += C16841ks.m40866c(8, this.f46863h);
        }
        if (this.f46867l) {
            b += C16841ks.m40861b(9) + 1;
        }
        if (this.f46866k != null && this.f46866k.length > 0) {
            int i4 = 0;
            for (int a : this.f46866k) {
                i4 += C16841ks.m40854a(a);
            }
            b = b + i4 + (this.f46866k.length * 1);
        }
        if (this.f46865j != null && this.f46865j.length > 0) {
            for (C16654ei eiVar4 : this.f46865j) {
                if (eiVar4 != null) {
                    b += C16841ks.m40863b(11, (C16850la) eiVar4);
                }
            }
        }
        return this.f46864i ? b + C16841ks.m40861b(12) + 1 : b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C16654ei mo31923a(C16839kq kqVar) throws IOException {
        int d;
        while (true) {
            int a = kqVar.mo32421a();
            switch (a) {
                case 0:
                    return this;
                case 8:
                    try {
                        d = kqVar.mo32430d();
                        if (d > 0 && d <= 8) {
                            this.f46856a = d;
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(36);
                            sb.append(d);
                            sb.append(" is not a valid enum Type");
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        kqVar.mo32433e(kqVar.mo32437i());
                        mo32451a(kqVar, a);
                        break;
                    }
                    break;
                case 18:
                    this.f46857b = kqVar.mo32429c();
                    break;
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    int a2 = C16853ld.m40927a(kqVar, 26);
                    int length = this.f46858c == null ? 0 : this.f46858c.length;
                    C16654ei[] eiVarArr = new C16654ei[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f46858c, 0, eiVarArr, 0, length);
                    }
                    while (length < eiVarArr.length - 1) {
                        eiVarArr[length] = new C16654ei();
                        kqVar.mo32425a((C16850la) eiVarArr[length]);
                        kqVar.mo32421a();
                        length++;
                    }
                    eiVarArr[length] = new C16654ei();
                    kqVar.mo32425a((C16850la) eiVarArr[length]);
                    this.f46858c = eiVarArr;
                    break;
                case 34:
                    int a3 = C16853ld.m40927a(kqVar, 34);
                    int length2 = this.f46859d == null ? 0 : this.f46859d.length;
                    C16654ei[] eiVarArr2 = new C16654ei[(a3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f46859d, 0, eiVarArr2, 0, length2);
                    }
                    while (length2 < eiVarArr2.length - 1) {
                        eiVarArr2[length2] = new C16654ei();
                        kqVar.mo32425a((C16850la) eiVarArr2[length2]);
                        kqVar.mo32421a();
                        length2++;
                    }
                    eiVarArr2[length2] = new C16654ei();
                    kqVar.mo32425a((C16850la) eiVarArr2[length2]);
                    this.f46859d = eiVarArr2;
                    break;
                case 42:
                    int a4 = C16853ld.m40927a(kqVar, 42);
                    int length3 = this.f46860e == null ? 0 : this.f46860e.length;
                    C16654ei[] eiVarArr3 = new C16654ei[(a4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f46860e, 0, eiVarArr3, 0, length3);
                    }
                    while (length3 < eiVarArr3.length - 1) {
                        eiVarArr3[length3] = new C16654ei();
                        kqVar.mo32425a((C16850la) eiVarArr3[length3]);
                        kqVar.mo32421a();
                        length3++;
                    }
                    eiVarArr3[length3] = new C16654ei();
                    kqVar.mo32425a((C16850la) eiVarArr3[length3]);
                    this.f46860e = eiVarArr3;
                    break;
                case 50:
                    this.f46861f = kqVar.mo32429c();
                    break;
                case 58:
                    this.f46862g = kqVar.mo32429c();
                    break;
                case UnReadVideoExperiment.RELATION_LIST /*64*/:
                    this.f46863h = kqVar.mo32432e();
                    break;
                case 72:
                    this.f46867l = kqVar.mo32426b();
                    break;
                case 80:
                    int a5 = C16853ld.m40927a(kqVar, 80);
                    int[] iArr = new int[a5];
                    int i = 0;
                    for (int i2 = 0; i2 < a5; i2++) {
                        if (i2 != 0) {
                            kqVar.mo32421a();
                        }
                        int i3 = kqVar.mo32437i();
                        try {
                            iArr[i] = m39793a(kqVar.mo32430d());
                            i++;
                        } catch (IllegalArgumentException unused2) {
                            kqVar.mo32433e(i3);
                            mo32451a(kqVar, a);
                        }
                    }
                    if (i != 0) {
                        int length4 = this.f46866k == null ? 0 : this.f46866k.length;
                        if (length4 != 0 || i != iArr.length) {
                            int[] iArr2 = new int[(length4 + i)];
                            if (length4 != 0) {
                                System.arraycopy(this.f46866k, 0, iArr2, 0, length4);
                            }
                            System.arraycopy(iArr, 0, iArr2, length4, i);
                            this.f46866k = iArr2;
                            break;
                        } else {
                            this.f46866k = iArr;
                            break;
                        }
                    } else {
                        break;
                    }
                case 82:
                    int c = kqVar.mo32428c(kqVar.mo32430d());
                    int i4 = kqVar.mo32437i();
                    int i5 = 0;
                    while (kqVar.mo32436h() > 0) {
                        try {
                            m39793a(kqVar.mo32430d());
                            i5++;
                        } catch (IllegalArgumentException unused3) {
                        }
                    }
                    if (i5 != 0) {
                        kqVar.mo32433e(i4);
                        int length5 = this.f46866k == null ? 0 : this.f46866k.length;
                        int[] iArr3 = new int[(i5 + length5)];
                        if (length5 != 0) {
                            System.arraycopy(this.f46866k, 0, iArr3, 0, length5);
                        }
                        while (kqVar.mo32436h() > 0) {
                            int i6 = kqVar.mo32437i();
                            try {
                                iArr3[length5] = m39793a(kqVar.mo32430d());
                                length5++;
                            } catch (IllegalArgumentException unused4) {
                                kqVar.mo32433e(i6);
                                mo32451a(kqVar, 80);
                            }
                        }
                        this.f46866k = iArr3;
                    }
                    kqVar.mo32431d(c);
                    break;
                case 90:
                    int a6 = C16853ld.m40927a(kqVar, 90);
                    int length6 = this.f46865j == null ? 0 : this.f46865j.length;
                    C16654ei[] eiVarArr4 = new C16654ei[(a6 + length6)];
                    if (length6 != 0) {
                        System.arraycopy(this.f46865j, 0, eiVarArr4, 0, length6);
                    }
                    while (length6 < eiVarArr4.length - 1) {
                        eiVarArr4[length6] = new C16654ei();
                        kqVar.mo32425a((C16850la) eiVarArr4[length6]);
                        kqVar.mo32421a();
                        length6++;
                    }
                    eiVarArr4[length6] = new C16654ei();
                    kqVar.mo32425a((C16850la) eiVarArr4[length6]);
                    this.f46865j = eiVarArr4;
                    break;
                case 96:
                    this.f46864i = kqVar.mo32426b();
                    break;
                default:
                    if (super.mo32451a(kqVar, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append(d);
        sb2.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb2.toString());
    }
}
