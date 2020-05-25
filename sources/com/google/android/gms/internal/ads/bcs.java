package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bcs extends bbt<bcs> {

    /* renamed from: h */
    private static volatile bcs[] f41877h;

    /* renamed from: c */
    public Integer f41878c;

    /* renamed from: d */
    public String f41879d;

    /* renamed from: e */
    public bco f41880e;

    /* renamed from: f */
    public Integer f41881f;

    /* renamed from: g */
    public String[] f41882g;

    /* renamed from: i */
    private bcq f41883i;

    /* renamed from: j */
    private Integer f41884j;

    /* renamed from: k */
    private int[] f41885k;

    /* renamed from: l */
    private String f41886l;

    /* renamed from: d */
    public static bcs[] m35412d() {
        if (f41877h == null) {
            synchronized (bbx.f41792a) {
                if (f41877h == null) {
                    f41877h = new bcs[0];
                }
            }
        }
        return f41877h;
    }

    public bcs() {
        this.f41878c = null;
        this.f41879d = null;
        this.f41880e = null;
        this.f41883i = null;
        this.f41884j = null;
        this.f41885k = bca.f41797a;
        this.f41886l = null;
        this.f41881f = null;
        this.f41882g = bca.f41799c;
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        bbr.mo30018a(1, this.f41878c.intValue());
        if (this.f41879d != null) {
            bbr.mo30021a(2, this.f41879d);
        }
        if (this.f41880e != null) {
            bbr.mo30020a(3, (bby) this.f41880e);
        }
        if (this.f41885k != null && this.f41885k.length > 0) {
            for (int a : this.f41885k) {
                bbr.mo30018a(6, a);
            }
        }
        if (this.f41881f != null) {
            bbr.mo30018a(8, this.f41881f.intValue());
        }
        if (this.f41882g != null && this.f41882g.length > 0) {
            for (String str : this.f41882g) {
                if (str != null) {
                    bbr.mo30021a(9, str);
                }
            }
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a() + bbr.m35316b(1, this.f41878c.intValue());
        if (this.f41879d != null) {
            a += bbr.m35318b(2, this.f41879d);
        }
        if (this.f41880e != null) {
            a += bbr.m35317b(3, (bby) this.f41880e);
        }
        if (this.f41885k != null && this.f41885k.length > 0) {
            int i = 0;
            for (int a2 : this.f41885k) {
                i += bbr.m35309a(a2);
            }
            a = a + i + (this.f41885k.length * 1);
        }
        if (this.f41881f != null) {
            a += bbr.m35316b(8, this.f41881f.intValue());
        }
        if (this.f41882g == null || this.f41882g.length <= 0) {
            return a;
        }
        int i2 = 0;
        int i3 = 0;
        for (String str : this.f41882g) {
            if (str != null) {
                i3++;
                i2 += bbr.m35311a(str);
            }
        }
        return a + i2 + (i3 * 1);
    }
}
