package com.squareup.p1094a;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import com.squareup.p1094a.C18396v.C18403e;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.a.y */
public final class C18409y {

    /* renamed from: s */
    private static final long f50838s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f50839a;

    /* renamed from: b */
    long f50840b;

    /* renamed from: c */
    int f50841c;

    /* renamed from: d */
    public final Uri f50842d;

    /* renamed from: e */
    public final int f50843e;

    /* renamed from: f */
    public final String f50844f;

    /* renamed from: g */
    public final List<C18352ag> f50845g;

    /* renamed from: h */
    public final int f50846h;

    /* renamed from: i */
    public final int f50847i;

    /* renamed from: j */
    public final boolean f50848j;

    /* renamed from: k */
    public final boolean f50849k;

    /* renamed from: l */
    public final boolean f50850l;

    /* renamed from: m */
    public final float f50851m;

    /* renamed from: n */
    public final float f50852n;

    /* renamed from: o */
    public final float f50853o;

    /* renamed from: p */
    public final boolean f50854p;

    /* renamed from: q */
    public final Config f50855q;

    /* renamed from: r */
    public final C18403e f50856r;

    /* renamed from: com.squareup.a.y$a */
    public static final class C18411a {

        /* renamed from: a */
        public boolean f50857a;

        /* renamed from: b */
        public boolean f50858b;

        /* renamed from: c */
        public List<C18352ag> f50859c;

        /* renamed from: d */
        public Config f50860d;

        /* renamed from: e */
        private Uri f50861e;

        /* renamed from: f */
        private int f50862f;

        /* renamed from: g */
        private String f50863g;

        /* renamed from: h */
        private int f50864h;

        /* renamed from: i */
        private int f50865i;

        /* renamed from: j */
        private boolean f50866j;

        /* renamed from: k */
        private float f50867k;

        /* renamed from: l */
        private float f50868l;

        /* renamed from: m */
        private float f50869m;

        /* renamed from: n */
        private boolean f50870n;

        /* renamed from: o */
        private C18403e f50871o;

        /* renamed from: a */
        public final boolean mo36876a() {
            if (this.f50861e == null && this.f50862f == 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo36877b() {
            if (this.f50864h == 0 && this.f50865i == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final C18409y mo36878c() {
            if (this.f50858b && this.f50857a) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f50857a && this.f50864h == 0 && this.f50865i == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.f50858b && this.f50864h == 0 && this.f50865i == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f50871o == null) {
                    this.f50871o = C18403e.NORMAL;
                }
                C18409y yVar = r2;
                C18409y yVar2 = new C18409y(this.f50861e, this.f50862f, this.f50863g, this.f50859c, this.f50864h, this.f50865i, this.f50857a, this.f50858b, this.f50866j, this.f50867k, this.f50868l, this.f50869m, this.f50870n, this.f50860d, this.f50871o);
                return yVar;
            }
        }

        /* renamed from: a */
        public final C18411a mo36875a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f50864h = i;
                this.f50865i = i2;
                return this;
            }
        }

        C18411a(Uri uri, int i, Config config) {
            this.f50861e = uri;
            this.f50862f = i;
            this.f50860d = config;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo36873e() {
        if (this.f50845g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo36871c() {
        if (this.f50846h == 0 && this.f50847i == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo36870b() {
        StringBuilder sb = new StringBuilder("[R");
        sb.append(this.f50839a);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo36872d() {
        if (mo36871c() || this.f50851m != 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo36869a() {
        long nanoTime = System.nanoTime() - this.f50840b;
        if (nanoTime > f50838s) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo36870b());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo36870b());
        sb2.append('+');
        sb2.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
        sb2.append("ms");
        return sb2.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        if (this.f50843e > 0) {
            sb.append(this.f50843e);
        } else {
            sb.append(this.f50842d);
        }
        if (this.f50845g != null && !this.f50845g.isEmpty()) {
            for (C18352ag agVar : this.f50845g) {
                sb.append(' ');
                sb.append(agVar.mo36799a());
            }
        }
        if (this.f50844f != null) {
            sb.append(" stableKey(");
            sb.append(this.f50844f);
            sb.append(')');
        }
        if (this.f50846h > 0) {
            sb.append(" resize(");
            sb.append(this.f50846h);
            sb.append(',');
            sb.append(this.f50847i);
            sb.append(')');
        }
        if (this.f50848j) {
            sb.append(" centerCrop");
        }
        if (this.f50849k) {
            sb.append(" centerInside");
        }
        if (this.f50851m != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f50851m);
            if (this.f50854p) {
                sb.append(" @ ");
                sb.append(this.f50852n);
                sb.append(',');
                sb.append(this.f50853o);
            }
            sb.append(')');
        }
        if (this.f50855q != null) {
            sb.append(' ');
            sb.append(this.f50855q);
        }
        sb.append('}');
        return sb.toString();
    }

    private C18409y(Uri uri, int i, String str, List<C18352ag> list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Config config, C18403e eVar) {
        this.f50842d = uri;
        this.f50843e = i;
        this.f50844f = str;
        if (list == null) {
            this.f50845g = null;
        } else {
            this.f50845g = Collections.unmodifiableList(list);
        }
        this.f50846h = i2;
        this.f50847i = i3;
        this.f50848j = z;
        this.f50849k = z2;
        this.f50850l = z3;
        this.f50851m = f;
        this.f50852n = f2;
        this.f50853o = f3;
        this.f50854p = z4;
        this.f50855q = config;
        this.f50856r = eVar;
    }
}
