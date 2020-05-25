package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;

public final class bjc implements bii, bjb, bky {

    /* renamed from: A */
    private bjd f42557A;

    /* renamed from: B */
    private IOException f42558B;

    /* renamed from: C */
    private boolean f42559C;

    /* renamed from: D */
    private int f42560D;

    /* renamed from: E */
    private long f42561E;

    /* renamed from: F */
    private boolean f42562F;

    /* renamed from: G */
    private int f42563G;

    /* renamed from: a */
    int f42564a;

    /* renamed from: b */
    private final biz f42565b;

    /* renamed from: c */
    private final bko f42566c;

    /* renamed from: d */
    private final int f42567d;

    /* renamed from: e */
    private final SparseArray<bje> f42568e;

    /* renamed from: f */
    private final int f42569f;

    /* renamed from: g */
    private final boolean f42570g;

    /* renamed from: h */
    private final Uri f42571h;

    /* renamed from: i */
    private final bkm f42572i;

    /* renamed from: j */
    private volatile boolean f42573j;

    /* renamed from: k */
    private volatile bjk f42574k;

    /* renamed from: l */
    private volatile bir f42575l;

    /* renamed from: m */
    private boolean f42576m;

    /* renamed from: n */
    private int f42577n;

    /* renamed from: o */
    private bij[] f42578o;

    /* renamed from: p */
    private long f42579p;

    /* renamed from: q */
    private boolean[] f42580q;

    /* renamed from: r */
    private boolean[] f42581r;

    /* renamed from: s */
    private boolean[] f42582s;

    /* renamed from: t */
    private int f42583t;

    /* renamed from: u */
    private long f42584u;

    /* renamed from: v */
    private long f42585v;

    /* renamed from: w */
    private long f42586w;

    /* renamed from: x */
    private boolean f42587x;

    /* renamed from: y */
    private long f42588y;

    /* renamed from: z */
    private bkx f42589z;

    public bjc(Uri uri, bkm bkm, biz biz, int i, int i2) {
        this(uri, bkm, biz, 2, i2, -1);
    }

    private bjc(Uri uri, bkm bkm, biz biz, int i, int i2, int i3) {
        this.f42571h = uri;
        this.f42572i = bkm;
        this.f42565b = biz;
        this.f42583t = 2;
        this.f42567d = i2;
        this.f42569f = -1;
        this.f42568e = new SparseArray<>();
        this.f42566c = new bko(262144);
        this.f42586w = -1;
        this.f42570g = true;
        biz.mo30269a(this);
    }

    /* renamed from: a */
    public final boolean mo30170a(long j) throws IOException {
        boolean z;
        if (this.f42576m) {
            return true;
        }
        if (this.f42589z == null) {
            this.f42589z = new bkx("Loader:ExtractorSampleSource");
        }
        m35864e();
        if (this.f42574k != null && this.f42573j) {
            int i = 0;
            while (true) {
                if (i >= this.f42568e.size()) {
                    z = true;
                    break;
                }
                if (!(((bje) this.f42568e.valueAt(i)).f42555f != null)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                int size = this.f42568e.size();
                this.f42582s = new boolean[size];
                this.f42581r = new boolean[size];
                this.f42580q = new boolean[size];
                this.f42578o = new bij[size];
                this.f42579p = -1;
                for (int i2 = 0; i2 < size; i2++) {
                    bie bie = ((bje) this.f42568e.valueAt(i2)).f42555f;
                    this.f42578o[i2] = new bij(bie.f42471a, bie.f42472b);
                    if (bie.f42472b != -1 && bie.f42472b > this.f42579p) {
                        this.f42579p = bie.f42472b;
                    }
                }
                this.f42576m = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo30166a() {
        return this.f42568e.size();
    }

    /* renamed from: a */
    public final bij mo30168a(int i) {
        blg.m36001b(this.f42576m);
        return this.f42578o[i];
    }

    /* renamed from: a */
    public final void mo30169a(int i, long j) {
        blg.m36001b(this.f42576m);
        blg.m36001b(!this.f42582s[i]);
        this.f42577n++;
        this.f42582s[i] = true;
        this.f42580q[i] = true;
        if (this.f42577n == 1) {
            mo30175c(j);
        }
    }

    /* renamed from: b */
    public final void mo30172b(int i) {
        blg.m36001b(this.f42576m);
        blg.m36001b(this.f42582s[i]);
        this.f42577n--;
        this.f42582s[i] = false;
        this.f42581r[i] = false;
        if (this.f42577n == 0) {
            if (this.f42589z.f42828c) {
                this.f42589z.mo30315a();
            } else {
                m35867h();
                this.f42566c.mo30313a(0);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo30173b(long j) throws IOException {
        blg.m36001b(this.f42576m);
        blg.m36001b(this.f42577n > 0);
        this.f42584u = j;
        long j2 = this.f42584u;
        for (int i = 0; i < this.f42582s.length; i++) {
            if (!this.f42582s[i]) {
                bje bje = (bje) this.f42568e.valueAt(i);
                while (bje.f42550a.mo30284a(bje.f42551b) && bje.f42551b.f42490e < j2) {
                    bje.f42550a.mo30281a();
                    bje.f42552c = true;
                }
                bje.f42553d = Long.MIN_VALUE;
            }
        }
        return this.f42562F || m35864e();
    }

    /* renamed from: a */
    public final int mo30167a(int i, long j, bif bif, bih bih, boolean z) throws IOException {
        this.f42584u = j;
        int i2 = 0;
        if (this.f42581r[i]) {
            this.f42581r[i] = false;
            return -5;
        } else if (z || m35868i()) {
            return -2;
        } else {
            bje bje = (bje) this.f42568e.valueAt(i);
            if (this.f42580q[i]) {
                bif.f42484a = bje.f42555f;
                bif.f42485b = this.f42575l;
                this.f42580q[i] = false;
                return -4;
            } else if (bje.mo30265a(bih)) {
                boolean z2 = this.f42570g && bih.f42490e < this.f42585v;
                int i3 = bih.f42489d;
                if (z2) {
                    i2 = 134217728;
                }
                bih.f42489d = i3 | i2;
                bih.f42490e += this.f42588y;
                return -3;
            } else if (this.f42562F) {
                return -1;
            } else {
                return -2;
            }
        }
    }

    /* renamed from: c */
    public final void mo30175c(long j) {
        blg.m36001b(this.f42576m);
        blg.m36001b(this.f42577n > 0);
        bjk bjk = this.f42574k;
        this.f42585v = j;
        if ((m35868i() ? this.f42586w : this.f42584u) != j) {
            this.f42584u = j;
            boolean z = !m35868i();
            int i = 0;
            while (z && i < this.f42568e.size()) {
                z &= ((bje) this.f42568e.valueAt(i)).mo30264a(j);
                i++;
            }
            if (!z) {
                m35863d(j);
            }
            for (int i2 = 0; i2 < this.f42581r.length; i2++) {
                this.f42581r[i2] = true;
            }
        }
    }

    /* renamed from: b */
    public final long mo30171b() {
        if (this.f42562F) {
            return -3;
        }
        if (m35868i()) {
            return this.f42586w;
        }
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.f42568e.size(); i++) {
            j = Math.max(j, ((bje) this.f42568e.valueAt(i)).f42554e);
        }
        return j == Long.MIN_VALUE ? this.f42584u : j;
    }

    /* renamed from: c */
    public final void mo30174c() {
        blg.m36001b(this.f42583t > 0);
        int i = this.f42583t - 1;
        this.f42583t = i;
        if (i == 0 && this.f42589z != null) {
            bkx bkx = this.f42589z;
            if (bkx.f42828c) {
                bkx.mo30315a();
            }
            bkx.f42826a.shutdown();
            this.f42589z = null;
        }
    }

    /* renamed from: a */
    public final void mo30275a(blb blb) {
        this.f42562F = true;
    }

    /* renamed from: b */
    public final void mo30277b(blb blb) {
        if (this.f42577n > 0) {
            m35863d(this.f42586w);
            return;
        }
        m35867h();
        this.f42566c.mo30313a(0);
    }

    /* renamed from: a */
    public final void mo30276a(blb blb, IOException iOException) {
        this.f42558B = iOException;
        int i = 1;
        if (this.f42564a <= this.f42563G) {
            i = 1 + this.f42560D;
        }
        this.f42560D = i;
        this.f42561E = SystemClock.elapsedRealtime();
        m35865f();
    }

    /* renamed from: c */
    public final bjl mo30273c(int i) {
        bje bje = (bje) this.f42568e.get(i);
        if (bje != null) {
            return bje;
        }
        bje bje2 = new bje(this, this.f42566c);
        this.f42568e.put(i, bje2);
        return bje2;
    }

    /* renamed from: d */
    public final void mo30274d() {
        this.f42573j = true;
    }

    /* renamed from: a */
    public final void mo30272a(bjk bjk) {
        this.f42574k = bjk;
    }

    /* renamed from: a */
    public final void mo30271a(bir bir) {
        this.f42575l = bir;
    }

    /* renamed from: e */
    private final boolean m35864e() throws IOException {
        boolean z;
        m35865f();
        boolean z2 = false;
        if (m35868i()) {
            return false;
        }
        if (this.f42576m) {
            int i = 0;
            while (true) {
                if (i < this.f42582s.length) {
                    if (this.f42582s[i] && !((bje) this.f42568e.valueAt(i)).mo30266b()) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: d */
    private final void m35863d(long j) {
        this.f42586w = j;
        this.f42562F = false;
        if (this.f42589z.f42828c) {
            this.f42589z.mo30315a();
            return;
        }
        m35867h();
        m35865f();
    }

    /* renamed from: f */
    private final void m35865f() {
        if (!this.f42562F && !this.f42589z.f42828c) {
            boolean z = true;
            if (this.f42558B != null) {
                if (this.f42557A == null) {
                    z = false;
                }
                blg.m36001b(z);
                if (SystemClock.elapsedRealtime() - this.f42561E >= Math.min((((long) this.f42560D) - 1) * 1000, 5000)) {
                    this.f42558B = null;
                    if (!this.f42576m) {
                        for (int i = 0; i < this.f42568e.size(); i++) {
                            ((bje) this.f42568e.valueAt(i)).mo30260a();
                        }
                        this.f42557A = m35866g();
                    } else {
                        bjk bjk = this.f42574k;
                    }
                    this.f42563G = this.f42564a;
                    this.f42589z.mo30316a(this.f42557A, this);
                }
                return;
            }
            this.f42588y = 0;
            this.f42587x = false;
            if (!this.f42576m) {
                this.f42557A = m35866g();
            } else {
                blg.m36001b(m35868i());
                if (this.f42579p == -1 || this.f42586w < this.f42579p) {
                    bjd bjd = new bjd(this.f42571h, this.f42572i, this.f42565b, this.f42566c, this.f42567d, this.f42574k.mo30254a(this.f42586w));
                    this.f42557A = bjd;
                    this.f42586w = -1;
                } else {
                    this.f42562F = true;
                    this.f42586w = -1;
                    return;
                }
            }
            this.f42563G = this.f42564a;
            this.f42589z.mo30316a(this.f42557A, this);
        }
    }

    /* renamed from: g */
    private final bjd m35866g() {
        bjd bjd = new bjd(this.f42571h, this.f42572i, this.f42565b, this.f42566c, this.f42567d, 0);
        return bjd;
    }

    /* renamed from: h */
    private final void m35867h() {
        for (int i = 0; i < this.f42568e.size(); i++) {
            ((bje) this.f42568e.valueAt(i)).mo30260a();
        }
        this.f42557A = null;
        this.f42558B = null;
        this.f42560D = 0;
        this.f42559C = false;
    }

    /* renamed from: i */
    private final boolean m35868i() {
        return this.f42586w != -1;
    }
}
