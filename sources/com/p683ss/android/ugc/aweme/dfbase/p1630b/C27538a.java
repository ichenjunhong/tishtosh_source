package com.p683ss.android.ugc.aweme.dfbase.p1630b;

import com.p683ss.android.ugc.aweme.dfbase.C27558m;
import com.p683ss.android.ugc.aweme.dfbase.C27559n;
import com.p683ss.android.ugc.aweme.dfbase.p1629a.C27533a;
import com.p683ss.android.ugc.aweme.dfbase.p1629a.C27534b;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.dfbase.b.a */
public final class C27538a {

    /* renamed from: a */
    public String f72397a;

    /* renamed from: b */
    public String f72398b;

    /* renamed from: c */
    public boolean f72399c;

    /* renamed from: d */
    public boolean f72400d;

    /* renamed from: e */
    public boolean f72401e;

    /* renamed from: f */
    public boolean f72402f;

    /* renamed from: g */
    public boolean f72403g;

    /* renamed from: h */
    public boolean f72404h;

    /* renamed from: i */
    public int f72405i;

    /* renamed from: j */
    public long f72406j;

    /* renamed from: k */
    public long f72407k;

    /* renamed from: l */
    public long f72408l;

    /* renamed from: m */
    public C27534b f72409m;

    /* renamed from: n */
    public Locale f72410n;

    /* renamed from: o */
    public C27541b f72411o;

    /* renamed from: p */
    public C27559n f72412p;

    /* renamed from: q */
    public List<String> f72413q;

    /* renamed from: com.ss.android.ugc.aweme.dfbase.b.a$a */
    public static class C27540a {

        /* renamed from: a */
        public String f72414a;

        /* renamed from: b */
        public String f72415b;

        /* renamed from: c */
        public boolean f72416c = true;

        /* renamed from: d */
        public boolean f72417d = C27533a.f72383d;

        /* renamed from: e */
        public boolean f72418e = C27533a.f72383d;

        /* renamed from: f */
        public boolean f72419f = C27533a.f72383d;

        /* renamed from: g */
        public boolean f72420g;

        /* renamed from: h */
        public boolean f72421h;

        /* renamed from: i */
        public int f72422i = 2;

        /* renamed from: j */
        public long f72423j = C27533a.f72381b;

        /* renamed from: k */
        public C27534b f72424k = C27534b.KEEP;

        /* renamed from: l */
        public List<String> f72425l;

        /* renamed from: a */
        public final C27540a mo55988a(int i) {
            this.f72422i = i;
            return this;
        }

        /* renamed from: b */
        public final C27540a mo55991b(boolean z) {
            this.f72420g = z;
            return this;
        }

        /* renamed from: a */
        public final C27540a mo55989a(String str) {
            this.f72414a = str;
            return this;
        }

        /* renamed from: a */
        public final C27540a mo55990a(boolean z) {
            this.f72416c = z;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dfbase.b.a$b */
    public enum C27541b {
        UNKNOWN,
        TIMEOUT,
        PENDING,
        RUNNING,
        DOWNLOADED,
        SUCCEEDED,
        FAILED,
        CANCELED;

        public final boolean isFinished() {
            if (this == SUCCEEDED || this == FAILED || this == CANCELED || this == DOWNLOADED || this == UNKNOWN) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo55982a() {
        this.f72403g = true;
        this.f72399c = false;
        this.f72405i = 0;
    }

    /* renamed from: c */
    public final boolean mo55985c() {
        if (this.f72413q != null) {
            for (String a : this.f72413q) {
                if (!C27558m.m66225a(a)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f72398b == null) {
            i = 0;
        } else {
            i = this.f72398b.hashCode();
        }
        int i3 = (i + 527) * 31;
        if (this.f72397a != null) {
            i2 = this.f72397a.hashCode();
        }
        return i3 + i2;
    }

    /* renamed from: b */
    public final String mo55984b() {
        if (this.f72413q == null || this.f72413q.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String append : this.f72413q) {
            sb.append(append);
            sb.append(" - ");
        }
        return sb.substring(0, sb.length() - 3);
    }

    /* renamed from: a */
    public final void mo55983a(long j) {
        this.f72408l = j;
        this.f72406j = j + System.currentTimeMillis();
    }

    private C27538a(C27540a aVar) {
        this.f72411o = C27541b.UNKNOWN;
        this.f72397a = aVar.f72414a;
        this.f72398b = aVar.f72415b;
        this.f72399c = aVar.f72416c;
        this.f72400d = aVar.f72417d;
        this.f72401e = aVar.f72418e;
        this.f72402f = aVar.f72419f;
        this.f72403g = aVar.f72420g;
        this.f72404h = aVar.f72421h;
        this.f72405i = aVar.f72422i;
        this.f72407k = aVar.f72423j;
        this.f72409m = aVar.f72424k;
        this.f72413q = aVar.f72425l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C27538a)) {
            return super.equals(obj);
        }
        C27538a aVar = (C27538a) obj;
        if (!this.f72398b.equals(aVar.f72398b) || !this.f72397a.equals(aVar.f72397a)) {
            return false;
        }
        return true;
    }
}
