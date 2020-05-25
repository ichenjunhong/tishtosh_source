package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

final class axd implements baa {

    /* renamed from: a */
    private final axa f41490a;

    /* renamed from: b */
    private int f41491b;

    /* renamed from: c */
    private int f41492c;

    /* renamed from: d */
    private int f41493d;

    /* renamed from: a */
    public static axd m34377a(axa axa) {
        if (axa.f41480c != null) {
            return axa.f41480c;
        }
        return new axd(axa);
    }

    private axd(axa axa) {
        this.f41490a = (axa) ayb.m34770a(axa, "input");
    }

    /* renamed from: a */
    public final int mo29659a() throws IOException {
        if (this.f41493d != 0) {
            this.f41491b = this.f41493d;
            this.f41493d = 0;
        } else {
            this.f41491b = this.f41490a.mo29634a();
        }
        if (this.f41491b == 0 || this.f41491b == this.f41492c) {
            return Integer.MAX_VALUE;
        }
        return this.f41491b >>> 3;
    }

    /* renamed from: b */
    public final int mo29664b() {
        return this.f41491b;
    }

    /* renamed from: c */
    public final boolean mo29669c() throws IOException {
        if (this.f41490a.mo29657t() || this.f41491b == this.f41492c) {
            return false;
        }
        return this.f41490a.mo29637b(this.f41491b);
    }

    /* renamed from: a */
    private final void m34379a(int i) throws IOException {
        if ((this.f41491b & 7) != i) {
            throw ayi.m34783f();
        }
    }

    /* renamed from: d */
    public final double mo29670d() throws IOException {
        m34379a(1);
        return this.f41490a.mo29636b();
    }

    /* renamed from: e */
    public final float mo29672e() throws IOException {
        m34379a(5);
        return this.f41490a.mo29638c();
    }

    /* renamed from: f */
    public final long mo29674f() throws IOException {
        m34379a(0);
        return this.f41490a.mo29640d();
    }

    /* renamed from: g */
    public final long mo29676g() throws IOException {
        m34379a(0);
        return this.f41490a.mo29642e();
    }

    /* renamed from: h */
    public final int mo29678h() throws IOException {
        m34379a(0);
        return this.f41490a.mo29643f();
    }

    /* renamed from: i */
    public final long mo29680i() throws IOException {
        m34379a(1);
        return this.f41490a.mo29644g();
    }

    /* renamed from: j */
    public final int mo29682j() throws IOException {
        m34379a(5);
        return this.f41490a.mo29645h();
    }

    /* renamed from: k */
    public final boolean mo29685k() throws IOException {
        m34379a(0);
        return this.f41490a.mo29646i();
    }

    /* renamed from: l */
    public final String mo29686l() throws IOException {
        m34379a(2);
        return this.f41490a.mo29647j();
    }

    /* renamed from: m */
    public final String mo29688m() throws IOException {
        m34379a(2);
        return this.f41490a.mo29648k();
    }

    /* renamed from: a */
    public final <T> T mo29660a(bab<T> bab, axm axm) throws IOException {
        m34379a(2);
        return m34382c(bab, axm);
    }

    /* renamed from: b */
    public final <T> T mo29665b(bab<T> bab, axm axm) throws IOException {
        m34379a(3);
        return m34384d(bab, axm);
    }

    /* renamed from: c */
    private final <T> T m34382c(bab<T> bab, axm axm) throws IOException {
        int m = this.f41490a.mo29650m();
        if (this.f41490a.f41478a < this.f41490a.f41479b) {
            int c = this.f41490a.mo29639c(m);
            T a = bab.mo29894a();
            this.f41490a.f41478a++;
            bab.mo29895a(a, this, axm);
            bab.mo29901c(a);
            this.f41490a.mo29635a(0);
            this.f41490a.f41478a--;
            this.f41490a.mo29641d(c);
            return a;
        }
        throw new ayi("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: d */
    private final <T> T m34384d(bab<T> bab, axm axm) throws IOException {
        int i = this.f41492c;
        this.f41492c = ((this.f41491b >>> 3) << 3) | 4;
        try {
            T a = bab.mo29894a();
            bab.mo29895a(a, this, axm);
            bab.mo29901c(a);
            if (this.f41491b == this.f41492c) {
                return a;
            }
            throw ayi.m34784g();
        } finally {
            this.f41492c = i;
        }
    }

    /* renamed from: n */
    public final awo mo29690n() throws IOException {
        m34379a(2);
        return this.f41490a.mo29649l();
    }

    /* renamed from: o */
    public final int mo29692o() throws IOException {
        m34379a(0);
        return this.f41490a.mo29650m();
    }

    /* renamed from: p */
    public final int mo29694p() throws IOException {
        m34379a(0);
        return this.f41490a.mo29651n();
    }

    /* renamed from: q */
    public final int mo29696q() throws IOException {
        m34379a(5);
        return this.f41490a.mo29652o();
    }

    /* renamed from: r */
    public final long mo29698r() throws IOException {
        m34379a(1);
        return this.f41490a.mo29653p();
    }

    /* renamed from: s */
    public final int mo29699s() throws IOException {
        m34379a(0);
        return this.f41490a.mo29654q();
    }

    /* renamed from: t */
    public final long mo29700t() throws IOException {
        m34379a(0);
        return this.f41490a.mo29655r();
    }

    /* renamed from: a */
    public final void mo29661a(List<Double> list) throws IOException {
        int a;
        int a2;
        if (list instanceof axi) {
            axi axi = (axi) list;
            switch (this.f41491b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f41490a.mo29650m();
                    m34381b(m);
                    int u = this.f41490a.mo29658u() + m;
                    do {
                        axi.mo29780a(this.f41490a.mo29636b());
                    } while (this.f41490a.mo29658u() < u);
                    return;
                default:
                    throw ayi.m34783f();
            }
            do {
                axi.mo29780a(this.f41490a.mo29636b());
                if (!this.f41490a.mo29657t()) {
                    a2 = this.f41490a.mo29634a();
                } else {
                    return;
                }
            } while (a2 == this.f41491b);
            this.f41493d = a2;
            return;
        }
        switch (this.f41491b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f41490a.mo29650m();
                m34381b(m2);
                int u2 = this.f41490a.mo29658u() + m2;
                do {
                    list.add(Double.valueOf(this.f41490a.mo29636b()));
                } while (this.f41490a.mo29658u() < u2);
                return;
            default:
                throw ayi.m34783f();
        }
        do {
            list.add(Double.valueOf(this.f41490a.mo29636b()));
            if (!this.f41490a.mo29657t()) {
                a = this.f41490a.mo29634a();
            } else {
                return;
            }
        } while (a == this.f41491b);
        this.f41493d = a;
    }

    /* renamed from: b */
    public final void mo29666b(List<Float> list) throws IOException {
        int a;
        int a2;
        if (list instanceof axw) {
            axw axw = (axw) list;
            int i = this.f41491b & 7;
            if (i == 2) {
                int m = this.f41490a.mo29650m();
                m34383c(m);
                int u = this.f41490a.mo29658u() + m;
                do {
                    axw.mo29813a(this.f41490a.mo29638c());
                } while (this.f41490a.mo29658u() < u);
            } else if (i == 5) {
                do {
                    axw.mo29813a(this.f41490a.mo29638c());
                    if (!this.f41490a.mo29657t()) {
                        a2 = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41491b);
                this.f41493d = a2;
            } else {
                throw ayi.m34783f();
            }
        } else {
            int i2 = this.f41491b & 7;
            if (i2 == 2) {
                int m2 = this.f41490a.mo29650m();
                m34383c(m2);
                int u2 = this.f41490a.mo29658u() + m2;
                do {
                    list.add(Float.valueOf(this.f41490a.mo29638c()));
                } while (this.f41490a.mo29658u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f41490a.mo29638c()));
                    if (!this.f41490a.mo29657t()) {
                        a = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a == this.f41491b);
                this.f41493d = a;
            } else {
                throw ayi.m34783f();
            }
        }
    }

    /* renamed from: c */
    public final void mo29668c(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ayx) {
            ayx ayx = (ayx) list;
            int i = this.f41491b & 7;
            if (i == 0) {
                do {
                    ayx.mo29864a(this.f41490a.mo29640d());
                    if (!this.f41490a.mo29657t()) {
                        a2 = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41491b);
                this.f41493d = a2;
            } else if (i == 2) {
                int u = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    ayx.mo29864a(this.f41490a.mo29640d());
                } while (this.f41490a.mo29658u() < u);
                m34385d(u);
            } else {
                throw ayi.m34783f();
            }
        } else {
            int i2 = this.f41491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f41490a.mo29640d()));
                    if (!this.f41490a.mo29657t()) {
                        a = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a == this.f41491b);
                this.f41493d = a;
            } else if (i2 == 2) {
                int u2 = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    list.add(Long.valueOf(this.f41490a.mo29640d()));
                } while (this.f41490a.mo29658u() < u2);
                m34385d(u2);
            } else {
                throw ayi.m34783f();
            }
        }
    }

    /* renamed from: d */
    public final void mo29671d(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ayx) {
            ayx ayx = (ayx) list;
            int i = this.f41491b & 7;
            if (i == 0) {
                do {
                    ayx.mo29864a(this.f41490a.mo29642e());
                    if (!this.f41490a.mo29657t()) {
                        a2 = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41491b);
                this.f41493d = a2;
            } else if (i == 2) {
                int u = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    ayx.mo29864a(this.f41490a.mo29642e());
                } while (this.f41490a.mo29658u() < u);
                m34385d(u);
            } else {
                throw ayi.m34783f();
            }
        } else {
            int i2 = this.f41491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f41490a.mo29642e()));
                    if (!this.f41490a.mo29657t()) {
                        a = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a == this.f41491b);
                this.f41493d = a;
            } else if (i2 == 2) {
                int u2 = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    list.add(Long.valueOf(this.f41490a.mo29642e()));
                } while (this.f41490a.mo29658u() < u2);
                m34385d(u2);
            } else {
                throw ayi.m34783f();
            }
        }
    }

    /* renamed from: e */
    public final void mo29673e(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof aya) {
            aya aya = (aya) list;
            int i = this.f41491b & 7;
            if (i == 0) {
                do {
                    aya.mo29835d(this.f41490a.mo29643f());
                    if (!this.f41490a.mo29657t()) {
                        a2 = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41491b);
                this.f41493d = a2;
            } else if (i == 2) {
                int u = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    aya.mo29835d(this.f41490a.mo29643f());
                } while (this.f41490a.mo29658u() < u);
                m34385d(u);
            } else {
                throw ayi.m34783f();
            }
        } else {
            int i2 = this.f41491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29643f()));
                    if (!this.f41490a.mo29657t()) {
                        a = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a == this.f41491b);
                this.f41493d = a;
            } else if (i2 == 2) {
                int u2 = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29643f()));
                } while (this.f41490a.mo29658u() < u2);
                m34385d(u2);
            } else {
                throw ayi.m34783f();
            }
        }
    }

    /* renamed from: f */
    public final void mo29675f(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ayx) {
            ayx ayx = (ayx) list;
            switch (this.f41491b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f41490a.mo29650m();
                    m34381b(m);
                    int u = this.f41490a.mo29658u() + m;
                    do {
                        ayx.mo29864a(this.f41490a.mo29644g());
                    } while (this.f41490a.mo29658u() < u);
                    return;
                default:
                    throw ayi.m34783f();
            }
            do {
                ayx.mo29864a(this.f41490a.mo29644g());
                if (!this.f41490a.mo29657t()) {
                    a2 = this.f41490a.mo29634a();
                } else {
                    return;
                }
            } while (a2 == this.f41491b);
            this.f41493d = a2;
            return;
        }
        switch (this.f41491b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f41490a.mo29650m();
                m34381b(m2);
                int u2 = this.f41490a.mo29658u() + m2;
                do {
                    list.add(Long.valueOf(this.f41490a.mo29644g()));
                } while (this.f41490a.mo29658u() < u2);
                return;
            default:
                throw ayi.m34783f();
        }
        do {
            list.add(Long.valueOf(this.f41490a.mo29644g()));
            if (!this.f41490a.mo29657t()) {
                a = this.f41490a.mo29634a();
            } else {
                return;
            }
        } while (a == this.f41491b);
        this.f41493d = a;
    }

    /* renamed from: g */
    public final void mo29677g(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof aya) {
            aya aya = (aya) list;
            int i = this.f41491b & 7;
            if (i == 2) {
                int m = this.f41490a.mo29650m();
                m34383c(m);
                int u = this.f41490a.mo29658u() + m;
                do {
                    aya.mo29835d(this.f41490a.mo29645h());
                } while (this.f41490a.mo29658u() < u);
            } else if (i == 5) {
                do {
                    aya.mo29835d(this.f41490a.mo29645h());
                    if (!this.f41490a.mo29657t()) {
                        a2 = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41491b);
                this.f41493d = a2;
            } else {
                throw ayi.m34783f();
            }
        } else {
            int i2 = this.f41491b & 7;
            if (i2 == 2) {
                int m2 = this.f41490a.mo29650m();
                m34383c(m2);
                int u2 = this.f41490a.mo29658u() + m2;
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29645h()));
                } while (this.f41490a.mo29658u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29645h()));
                    if (!this.f41490a.mo29657t()) {
                        a = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a == this.f41491b);
                this.f41493d = a;
            } else {
                throw ayi.m34783f();
            }
        }
    }

    /* renamed from: h */
    public final void mo29679h(List<Boolean> list) throws IOException {
        int a;
        int a2;
        if (list instanceof awm) {
            awm awm = (awm) list;
            int i = this.f41491b & 7;
            if (i == 0) {
                do {
                    awm.mo29604a(this.f41490a.mo29646i());
                    if (!this.f41490a.mo29657t()) {
                        a2 = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41491b);
                this.f41493d = a2;
            } else if (i == 2) {
                int u = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    awm.mo29604a(this.f41490a.mo29646i());
                } while (this.f41490a.mo29658u() < u);
                m34385d(u);
            } else {
                throw ayi.m34783f();
            }
        } else {
            int i2 = this.f41491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f41490a.mo29646i()));
                    if (!this.f41490a.mo29657t()) {
                        a = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a == this.f41491b);
                this.f41493d = a;
            } else if (i2 == 2) {
                int u2 = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    list.add(Boolean.valueOf(this.f41490a.mo29646i()));
                } while (this.f41490a.mo29658u() < u2);
                m34385d(u2);
            } else {
                throw ayi.m34783f();
            }
        }
    }

    /* renamed from: i */
    public final void mo29681i(List<String> list) throws IOException {
        m34380a(list, false);
    }

    /* renamed from: j */
    public final void mo29683j(List<String> list) throws IOException {
        m34380a(list, true);
    }

    /* renamed from: a */
    private final void m34380a(List<String> list, boolean z) throws IOException {
        int a;
        int a2;
        if ((this.f41491b & 7) != 2) {
            throw ayi.m34783f();
        } else if (!(list instanceof ays) || z) {
            do {
                list.add(z ? mo29688m() : mo29686l());
                if (!this.f41490a.mo29657t()) {
                    a = this.f41490a.mo29634a();
                } else {
                    return;
                }
            } while (a == this.f41491b);
            this.f41493d = a;
        } else {
            ays ays = (ays) list;
            do {
                ays.mo29855a(mo29690n());
                if (!this.f41490a.mo29657t()) {
                    a2 = this.f41490a.mo29634a();
                } else {
                    return;
                }
            } while (a2 == this.f41491b);
            this.f41493d = a2;
        }
    }

    /* renamed from: a */
    public final <T> void mo29662a(List<T> list, bab<T> bab, axm axm) throws IOException {
        int a;
        if ((this.f41491b & 7) == 2) {
            int i = this.f41491b;
            do {
                list.add(m34382c(bab, axm));
                if (!this.f41490a.mo29657t() && this.f41493d == 0) {
                    a = this.f41490a.mo29634a();
                } else {
                    return;
                }
            } while (a == i);
            this.f41493d = a;
            return;
        }
        throw ayi.m34783f();
    }

    /* renamed from: b */
    public final <T> void mo29667b(List<T> list, bab<T> bab, axm axm) throws IOException {
        int a;
        if ((this.f41491b & 7) == 3) {
            int i = this.f41491b;
            do {
                list.add(m34384d(bab, axm));
                if (!this.f41490a.mo29657t() && this.f41493d == 0) {
                    a = this.f41490a.mo29634a();
                } else {
                    return;
                }
            } while (a == i);
            this.f41493d = a;
            return;
        }
        throw ayi.m34783f();
    }

    /* renamed from: k */
    public final void mo29684k(List<awo> list) throws IOException {
        int a;
        if ((this.f41491b & 7) == 2) {
            do {
                list.add(mo29690n());
                if (!this.f41490a.mo29657t()) {
                    a = this.f41490a.mo29634a();
                } else {
                    return;
                }
            } while (a == this.f41491b);
            this.f41493d = a;
            return;
        }
        throw ayi.m34783f();
    }

    /* renamed from: l */
    public final void mo29687l(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof aya) {
            aya aya = (aya) list;
            int i = this.f41491b & 7;
            if (i == 0) {
                do {
                    aya.mo29835d(this.f41490a.mo29650m());
                    if (!this.f41490a.mo29657t()) {
                        a2 = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41491b);
                this.f41493d = a2;
            } else if (i == 2) {
                int u = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    aya.mo29835d(this.f41490a.mo29650m());
                } while (this.f41490a.mo29658u() < u);
                m34385d(u);
            } else {
                throw ayi.m34783f();
            }
        } else {
            int i2 = this.f41491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29650m()));
                    if (!this.f41490a.mo29657t()) {
                        a = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a == this.f41491b);
                this.f41493d = a;
            } else if (i2 == 2) {
                int u2 = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29650m()));
                } while (this.f41490a.mo29658u() < u2);
                m34385d(u2);
            } else {
                throw ayi.m34783f();
            }
        }
    }

    /* renamed from: m */
    public final void mo29689m(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof aya) {
            aya aya = (aya) list;
            int i = this.f41491b & 7;
            if (i == 0) {
                do {
                    aya.mo29835d(this.f41490a.mo29651n());
                    if (!this.f41490a.mo29657t()) {
                        a2 = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41491b);
                this.f41493d = a2;
            } else if (i == 2) {
                int u = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    aya.mo29835d(this.f41490a.mo29651n());
                } while (this.f41490a.mo29658u() < u);
                m34385d(u);
            } else {
                throw ayi.m34783f();
            }
        } else {
            int i2 = this.f41491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29651n()));
                    if (!this.f41490a.mo29657t()) {
                        a = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a == this.f41491b);
                this.f41493d = a;
            } else if (i2 == 2) {
                int u2 = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29651n()));
                } while (this.f41490a.mo29658u() < u2);
                m34385d(u2);
            } else {
                throw ayi.m34783f();
            }
        }
    }

    /* renamed from: n */
    public final void mo29691n(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof aya) {
            aya aya = (aya) list;
            int i = this.f41491b & 7;
            if (i == 2) {
                int m = this.f41490a.mo29650m();
                m34383c(m);
                int u = this.f41490a.mo29658u() + m;
                do {
                    aya.mo29835d(this.f41490a.mo29652o());
                } while (this.f41490a.mo29658u() < u);
            } else if (i == 5) {
                do {
                    aya.mo29835d(this.f41490a.mo29652o());
                    if (!this.f41490a.mo29657t()) {
                        a2 = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41491b);
                this.f41493d = a2;
            } else {
                throw ayi.m34783f();
            }
        } else {
            int i2 = this.f41491b & 7;
            if (i2 == 2) {
                int m2 = this.f41490a.mo29650m();
                m34383c(m2);
                int u2 = this.f41490a.mo29658u() + m2;
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29652o()));
                } while (this.f41490a.mo29658u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29652o()));
                    if (!this.f41490a.mo29657t()) {
                        a = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a == this.f41491b);
                this.f41493d = a;
            } else {
                throw ayi.m34783f();
            }
        }
    }

    /* renamed from: o */
    public final void mo29693o(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ayx) {
            ayx ayx = (ayx) list;
            switch (this.f41491b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f41490a.mo29650m();
                    m34381b(m);
                    int u = this.f41490a.mo29658u() + m;
                    do {
                        ayx.mo29864a(this.f41490a.mo29653p());
                    } while (this.f41490a.mo29658u() < u);
                    return;
                default:
                    throw ayi.m34783f();
            }
            do {
                ayx.mo29864a(this.f41490a.mo29653p());
                if (!this.f41490a.mo29657t()) {
                    a2 = this.f41490a.mo29634a();
                } else {
                    return;
                }
            } while (a2 == this.f41491b);
            this.f41493d = a2;
            return;
        }
        switch (this.f41491b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f41490a.mo29650m();
                m34381b(m2);
                int u2 = this.f41490a.mo29658u() + m2;
                do {
                    list.add(Long.valueOf(this.f41490a.mo29653p()));
                } while (this.f41490a.mo29658u() < u2);
                return;
            default:
                throw ayi.m34783f();
        }
        do {
            list.add(Long.valueOf(this.f41490a.mo29653p()));
            if (!this.f41490a.mo29657t()) {
                a = this.f41490a.mo29634a();
            } else {
                return;
            }
        } while (a == this.f41491b);
        this.f41493d = a;
    }

    /* renamed from: p */
    public final void mo29695p(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof aya) {
            aya aya = (aya) list;
            int i = this.f41491b & 7;
            if (i == 0) {
                do {
                    aya.mo29835d(this.f41490a.mo29654q());
                    if (!this.f41490a.mo29657t()) {
                        a2 = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41491b);
                this.f41493d = a2;
            } else if (i == 2) {
                int u = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    aya.mo29835d(this.f41490a.mo29654q());
                } while (this.f41490a.mo29658u() < u);
                m34385d(u);
            } else {
                throw ayi.m34783f();
            }
        } else {
            int i2 = this.f41491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29654q()));
                    if (!this.f41490a.mo29657t()) {
                        a = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a == this.f41491b);
                this.f41493d = a;
            } else if (i2 == 2) {
                int u2 = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    list.add(Integer.valueOf(this.f41490a.mo29654q()));
                } while (this.f41490a.mo29658u() < u2);
                m34385d(u2);
            } else {
                throw ayi.m34783f();
            }
        }
    }

    /* renamed from: q */
    public final void mo29697q(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ayx) {
            ayx ayx = (ayx) list;
            int i = this.f41491b & 7;
            if (i == 0) {
                do {
                    ayx.mo29864a(this.f41490a.mo29655r());
                    if (!this.f41490a.mo29657t()) {
                        a2 = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41491b);
                this.f41493d = a2;
            } else if (i == 2) {
                int u = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    ayx.mo29864a(this.f41490a.mo29655r());
                } while (this.f41490a.mo29658u() < u);
                m34385d(u);
            } else {
                throw ayi.m34783f();
            }
        } else {
            int i2 = this.f41491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f41490a.mo29655r()));
                    if (!this.f41490a.mo29657t()) {
                        a = this.f41490a.mo29634a();
                    } else {
                        return;
                    }
                } while (a == this.f41491b);
                this.f41493d = a;
            } else if (i2 == 2) {
                int u2 = this.f41490a.mo29658u() + this.f41490a.mo29650m();
                do {
                    list.add(Long.valueOf(this.f41490a.mo29655r()));
                } while (this.f41490a.mo29658u() < u2);
                m34385d(u2);
            } else {
                throw ayi.m34783f();
            }
        }
    }

    /* renamed from: b */
    private static void m34381b(int i) throws IOException {
        if ((i & 7) != 0) {
            throw ayi.m34784g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (mo29669c() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        throw new com.google.android.gms.internal.ads.ayi("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo29663a(java.util.Map<K, V> r6, com.google.android.gms.internal.ads.azc<K, V> r7, com.google.android.gms.internal.ads.axm r8) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            r5.m34379a(r0)
            com.google.android.gms.internal.ads.axa r0 = r5.f41490a
            int r0 = r0.mo29650m()
            com.google.android.gms.internal.ads.axa r1 = r5.f41490a
            int r0 = r1.mo29639c(r0)
            K r1 = r7.f41657b
            V r2 = r7.f41659d
        L_0x0014:
            int r3 = r5.mo29659a()     // Catch:{ all -> 0x0067 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005e
            com.google.android.gms.internal.ads.axa r4 = r5.f41490a     // Catch:{ all -> 0x0067 }
            boolean r4 = r4.mo29657t()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x005e
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.mo29669c()     // Catch:{ ayj -> 0x004f }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.ads.bbj r3 = r7.f41658c     // Catch:{ ayj -> 0x004f }
            V r4 = r7.f41659d     // Catch:{ ayj -> 0x004f }
            java.lang.Class r4 = r4.getClass()     // Catch:{ ayj -> 0x004f }
            java.lang.Object r3 = r5.m34378a(r3, r4, r8)     // Catch:{ ayj -> 0x004f }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.ads.bbj r3 = r7.f41656a     // Catch:{ ayj -> 0x004f }
            r4 = 0
            java.lang.Object r3 = r5.m34378a(r3, r4, r4)     // Catch:{ ayj -> 0x004f }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            com.google.android.gms.internal.ads.ayi r3 = new com.google.android.gms.internal.ads.ayi     // Catch:{ ayj -> 0x004f }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ ayj -> 0x004f }
            throw r3     // Catch:{ ayj -> 0x004f }
        L_0x004f:
            boolean r3 = r5.mo29669c()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.android.gms.internal.ads.ayi r6 = new com.google.android.gms.internal.ads.ayi     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x005e:
            r6.put(r1, r2)     // Catch:{ all -> 0x0067 }
            com.google.android.gms.internal.ads.axa r6 = r5.f41490a
            r6.mo29641d(r0)
            return
        L_0x0067:
            r6 = move-exception
            com.google.android.gms.internal.ads.axa r7 = r5.f41490a
            r7.mo29641d(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axd.mo29663a(java.util.Map, com.google.android.gms.internal.ads.azc, com.google.android.gms.internal.ads.axm):void");
    }

    /* renamed from: a */
    private final Object m34378a(bbj bbj, Class<?> cls, axm axm) throws IOException {
        switch (axe.f41494a[bbj.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo29685k());
            case 2:
                return mo29690n();
            case 3:
                return Double.valueOf(mo29670d());
            case 4:
                return Integer.valueOf(mo29694p());
            case 5:
                return Integer.valueOf(mo29682j());
            case 6:
                return Long.valueOf(mo29680i());
            case 7:
                return Float.valueOf(mo29672e());
            case 8:
                return Integer.valueOf(mo29678h());
            case 9:
                return Long.valueOf(mo29676g());
            case 10:
                m34379a(2);
                return m34382c(azx.m34942a().mo29905a(cls), axm);
            case 11:
                return Integer.valueOf(mo29696q());
            case 12:
                return Long.valueOf(mo29698r());
            case 13:
                return Integer.valueOf(mo29699s());
            case 14:
                return Long.valueOf(mo29700t());
            case 15:
                return mo29688m();
            case 16:
                return Integer.valueOf(mo29692o());
            case 17:
                return Long.valueOf(mo29674f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: c */
    private static void m34383c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw ayi.m34784g();
        }
    }

    /* renamed from: d */
    private final void m34385d(int i) throws IOException {
        if (this.f41490a.mo29658u() != i) {
            throw ayi.m34778a();
        }
    }
}
