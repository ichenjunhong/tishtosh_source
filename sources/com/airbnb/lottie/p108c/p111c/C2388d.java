package com.airbnb.lottie.p108c.p111c;

import com.C2240a;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p108c.p109a.C2351j;
import com.airbnb.lottie.p108c.p109a.C2352k;
import com.airbnb.lottie.p108c.p109a.C2353l;
import com.airbnb.lottie.p108c.p110b.C2358b;
import com.airbnb.lottie.p108c.p110b.C2363g;
import com.airbnb.lottie.p115g.C2468a;
import java.util.List;
import java.util.Locale;

/* renamed from: com.airbnb.lottie.c.c.d */
public final class C2388d {

    /* renamed from: a */
    public final List<C2358b> f7451a;

    /* renamed from: b */
    public final C2408e f7452b;

    /* renamed from: c */
    public final String f7453c;

    /* renamed from: d */
    public final long f7454d;

    /* renamed from: e */
    public final C2389a f7455e;

    /* renamed from: f */
    public final long f7456f;

    /* renamed from: g */
    public final String f7457g;

    /* renamed from: h */
    public final List<C2363g> f7458h;

    /* renamed from: i */
    public final C2353l f7459i;

    /* renamed from: j */
    public final int f7460j;

    /* renamed from: k */
    public final int f7461k;

    /* renamed from: l */
    public final int f7462l;

    /* renamed from: m */
    public final float f7463m;

    /* renamed from: n */
    final float f7464n;

    /* renamed from: o */
    public final int f7465o;

    /* renamed from: p */
    public final int f7466p;

    /* renamed from: q */
    public final C2351j f7467q;

    /* renamed from: r */
    public final C2352k f7468r;

    /* renamed from: s */
    public final C2343b f7469s;

    /* renamed from: t */
    public final List<C2468a<Float>> f7470t;

    /* renamed from: u */
    public final C2390b f7471u;

    /* renamed from: com.airbnb.lottie.c.c.d$a */
    public enum C2389a {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown
    }

    /* renamed from: com.airbnb.lottie.c.c.d$b */
    public enum C2390b {
        None,
        Add,
        Invert,
        Unknown
    }

    public final String toString() {
        return mo6756a("");
    }

    /* renamed from: a */
    public final String mo6756a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.f7453c);
        sb.append("\n");
        C2388d a = this.f7452b.mo6778a(this.f7456f);
        if (a != null) {
            sb.append("\t\tParents: ");
            sb.append(a.f7453c);
            C2388d a2 = this.f7452b.mo6778a(a.f7456f);
            while (a2 != null) {
                sb.append("->");
                sb.append(a2.f7453c);
                a2 = this.f7452b.mo6778a(a2.f7456f);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.f7458h.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.f7458h.size());
            sb.append("\n");
        }
        if (!(this.f7460j == 0 || this.f7461k == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(C2240a.m6773a(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f7460j), Integer.valueOf(this.f7461k), Integer.valueOf(this.f7462l)}));
        }
        if (!this.f7451a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object next : this.f7451a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public C2388d(List<C2358b> list, C2408e eVar, String str, long j, C2389a aVar, long j2, String str2, List<C2363g> list2, C2353l lVar, int i, int i2, int i3, float f, float f2, int i4, int i5, C2351j jVar, C2352k kVar, List<C2468a<Float>> list3, C2390b bVar, C2343b bVar2) {
        this.f7451a = list;
        this.f7452b = eVar;
        this.f7453c = str;
        this.f7454d = j;
        this.f7455e = aVar;
        this.f7456f = j2;
        this.f7457g = str2;
        this.f7458h = list2;
        this.f7459i = lVar;
        this.f7460j = i;
        this.f7461k = i2;
        this.f7462l = i3;
        this.f7463m = f;
        this.f7464n = f2;
        this.f7465o = i4;
        this.f7466p = i5;
        this.f7467q = jVar;
        this.f7468r = kVar;
        this.f7470t = list3;
        this.f7471u = bVar;
        this.f7469s = bVar2;
    }
}
