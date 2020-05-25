package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bcb.C15687a.C15691c;
import java.io.IOException;

public final class bcl extends bbt<bcl> {

    /* renamed from: c */
    public Integer f41847c;

    /* renamed from: d */
    public String f41848d;

    /* renamed from: e */
    public String f41849e;

    /* renamed from: f */
    public bcm f41850f;

    /* renamed from: g */
    public bcs[] f41851g;

    /* renamed from: h */
    public String f41852h;

    /* renamed from: i */
    public bcr f41853i;

    /* renamed from: j */
    public bct f41854j;

    /* renamed from: k */
    public String[] f41855k;

    /* renamed from: l */
    public String[] f41856l;

    /* renamed from: m */
    private C15691c f41857m;

    /* renamed from: n */
    private String f41858n;

    /* renamed from: o */
    private Boolean f41859o;

    /* renamed from: p */
    private String[] f41860p;

    /* renamed from: q */
    private String f41861q;

    /* renamed from: r */
    private Boolean f41862r;

    /* renamed from: s */
    private Boolean f41863s;

    /* renamed from: t */
    private byte[] f41864t;

    public bcl() {
        this.f41847c = null;
        this.f41857m = null;
        this.f41848d = null;
        this.f41849e = null;
        this.f41858n = null;
        this.f41850f = null;
        this.f41851g = bcs.m35412d();
        this.f41852h = null;
        this.f41853i = null;
        this.f41859o = null;
        this.f41860p = bca.f41799c;
        this.f41861q = null;
        this.f41862r = null;
        this.f41863s = null;
        this.f41864t = null;
        this.f41854j = null;
        this.f41855k = bca.f41799c;
        this.f41856l = bca.f41799c;
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        if (this.f41848d != null) {
            bbr.mo30021a(1, this.f41848d);
        }
        if (this.f41849e != null) {
            bbr.mo30021a(2, this.f41849e);
        }
        if (this.f41851g != null && this.f41851g.length > 0) {
            for (bcs bcs : this.f41851g) {
                if (bcs != null) {
                    bbr.mo30020a(4, (bby) bcs);
                }
            }
        }
        if (this.f41860p != null && this.f41860p.length > 0) {
            for (String str : this.f41860p) {
                if (str != null) {
                    bbr.mo30021a(6, str);
                }
            }
        }
        if (this.f41847c != null) {
            bbr.mo30018a(10, this.f41847c.intValue());
        }
        if (this.f41850f != null) {
            bbr.mo30020a(12, (bby) this.f41850f);
        }
        if (this.f41852h != null) {
            bbr.mo30021a(13, this.f41852h);
        }
        if (this.f41853i != null) {
            bbr.mo30020a(14, (bby) this.f41853i);
        }
        if (this.f41854j != null) {
            bbr.mo30020a(17, (bby) this.f41854j);
        }
        if (this.f41855k != null && this.f41855k.length > 0) {
            for (String str2 : this.f41855k) {
                if (str2 != null) {
                    bbr.mo30021a(20, str2);
                }
            }
        }
        if (this.f41856l != null && this.f41856l.length > 0) {
            for (String str3 : this.f41856l) {
                if (str3 != null) {
                    bbr.mo30021a(21, str3);
                }
            }
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a();
        if (this.f41848d != null) {
            a += bbr.m35318b(1, this.f41848d);
        }
        if (this.f41849e != null) {
            a += bbr.m35318b(2, this.f41849e);
        }
        if (this.f41851g != null && this.f41851g.length > 0) {
            int i = a;
            for (bcs bcs : this.f41851g) {
                if (bcs != null) {
                    i += bbr.m35317b(4, (bby) bcs);
                }
            }
            a = i;
        }
        if (this.f41860p != null && this.f41860p.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f41860p) {
                if (str != null) {
                    i3++;
                    i2 += bbr.m35311a(str);
                }
            }
            a = a + i2 + (i3 * 1);
        }
        if (this.f41847c != null) {
            a += bbr.m35316b(10, this.f41847c.intValue());
        }
        if (this.f41850f != null) {
            a += bbr.m35317b(12, (bby) this.f41850f);
        }
        if (this.f41852h != null) {
            a += bbr.m35318b(13, this.f41852h);
        }
        if (this.f41853i != null) {
            a += bbr.m35317b(14, (bby) this.f41853i);
        }
        if (this.f41854j != null) {
            a += bbr.m35317b(17, (bby) this.f41854j);
        }
        if (this.f41855k != null && this.f41855k.length > 0) {
            int i4 = 0;
            int i5 = 0;
            for (String str2 : this.f41855k) {
                if (str2 != null) {
                    i5++;
                    i4 += bbr.m35311a(str2);
                }
            }
            a = a + i4 + (i5 * 2);
        }
        if (this.f41856l == null || this.f41856l.length <= 0) {
            return a;
        }
        int i6 = 0;
        int i7 = 0;
        for (String str3 : this.f41856l) {
            if (str3 != null) {
                i7++;
                i6 += bbr.m35311a(str3);
            }
        }
        return a + i6 + (i7 * 2);
    }
}
