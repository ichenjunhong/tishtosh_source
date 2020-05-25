package com.facebook.imagepipeline.memory;

import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13702a;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p923g.C13714l;

/* renamed from: com.facebook.imagepipeline.memory.ac */
public final class C14067ac {

    /* renamed from: a */
    private final C14064ab f36764a;

    /* renamed from: b */
    private C14073d f36765b;

    /* renamed from: c */
    private C14081j f36766c;

    /* renamed from: d */
    private C14085n f36767d;

    /* renamed from: e */
    private C14098x f36768e;

    /* renamed from: f */
    private C13711i f36769f;

    /* renamed from: g */
    private C13714l f36770g;

    /* renamed from: h */
    private C13702a f36771h;

    /* renamed from: c */
    public final int mo26322c() {
        return this.f36764a.f36744c.f36778g;
    }

    /* renamed from: d */
    public final C13711i mo26323d() {
        return mo26319a(0);
    }

    /* renamed from: g */
    private C14081j m28773g() {
        if (this.f36766c == null) {
            this.f36766c = new C14081j(this.f36764a.f36745d, this.f36764a.f36746e, this.f36764a.f36747f);
        }
        return this.f36766c;
    }

    /* renamed from: h */
    private C14098x m28774h() {
        if (this.f36768e == null) {
            this.f36768e = new C14098x(this.f36764a.f36745d, this.f36764a.f36746e, this.f36764a.f36747f);
        }
        return this.f36768e;
    }

    /* renamed from: e */
    public final C13714l mo26324e() {
        if (this.f36770g == null) {
            this.f36770g = new C13714l(mo26325f());
        }
        return this.f36770g;
    }

    /* renamed from: f */
    public final C13702a mo26325f() {
        if (this.f36771h == null) {
            this.f36771h = new C14088o(this.f36764a.f36745d, this.f36764a.f36748g, this.f36764a.f36749h);
        }
        return this.f36771h;
    }

    /* renamed from: b */
    public final C14085n mo26321b() {
        if (this.f36767d == null) {
            this.f36767d = new C14085n(this.f36764a.f36745d, this.f36764a.f36744c);
        }
        return this.f36767d;
    }

    /* renamed from: a */
    public final C14073d mo26320a() {
        if (this.f36765b == null) {
            String str = this.f36764a.f36750i;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1868884870) {
                if (hashCode != -1106578487) {
                    if (hashCode != -404562712) {
                        if (hashCode == 95945896 && str.equals("dummy")) {
                            c = 0;
                        }
                    } else if (str.equals("experimental")) {
                        c = 1;
                    }
                } else if (str.equals("legacy")) {
                    c = 3;
                }
            } else if (str.equals("legacy_default_params")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    this.f36765b = new C14084m();
                    break;
                case 1:
                    this.f36765b = new C14089p(this.f36764a.f36751j, this.f36764a.f36752k, C14099y.m28869a());
                    break;
                case 2:
                    this.f36765b = new C14079h(this.f36764a.f36745d, C14082k.m28814a(), this.f36764a.f36743b);
                    break;
                default:
                    this.f36765b = new C14079h(this.f36764a.f36745d, this.f36764a.f36742a, this.f36764a.f36743b);
                    break;
            }
        }
        return this.f36765b;
    }

    public C14067ac(C14064ab abVar) {
        this.f36764a = (C14064ab) C13689i.m27652a(abVar);
    }

    /* renamed from: b */
    private C14092s m28772b(int i) {
        switch (i) {
            case 0:
                return m28774h();
            case 1:
                return m28773g();
            default:
                throw new IllegalArgumentException("Invalid MemoryChunkType");
        }
    }

    /* renamed from: a */
    public final C13711i mo26319a(int i) {
        if (this.f36769f == null) {
            this.f36769f = new C14095v(m28772b(i), mo26324e());
        }
        return this.f36769f;
    }
}
