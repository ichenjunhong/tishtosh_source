package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.z */
public final class C26147z implements Serializable {

    /* renamed from: a */
    private final String f69044a;

    /* renamed from: b */
    private long f69045b;

    /* renamed from: c */
    private final AwemeRawAd f69046c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.z$a */
    public static final class C26148a {

        /* renamed from: a */
        public String f69047a = "";

        /* renamed from: b */
        public long f69048b;

        /* renamed from: c */
        public AwemeRawAd f69049c;

        /* renamed from: a */
        public final C26147z mo53763a() {
            C26147z zVar = new C26147z(this.f69047a, this.f69048b, this.f69049c, null);
            return zVar;
        }

        /* renamed from: a */
        public final C26148a mo53760a(long j) {
            C26148a aVar = this;
            aVar.f69048b = j;
            return aVar;
        }

        /* renamed from: a */
        public final C26148a mo53761a(AwemeRawAd awemeRawAd) {
            C26148a aVar = this;
            aVar.f69049c = awemeRawAd;
            return aVar;
        }

        /* renamed from: a */
        public final C26148a mo53762a(String str) {
            C52711k.m112240b(str, "tag");
            C26148a aVar = this;
            aVar.f69047a = str;
            return aVar;
        }
    }

    public static /* synthetic */ C26147z copy$default(C26147z zVar, String str, long j, AwemeRawAd awemeRawAd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zVar.f69044a;
        }
        if ((i & 2) != 0) {
            j = zVar.f69045b;
        }
        if ((i & 4) != 0) {
            awemeRawAd = zVar.f69046c;
        }
        return zVar.copy(str, j, awemeRawAd);
    }

    public final String component1() {
        return this.f69044a;
    }

    public final long component2() {
        return this.f69045b;
    }

    public final AwemeRawAd component3() {
        return this.f69046c;
    }

    public final C26147z copy(String str, long j, AwemeRawAd awemeRawAd) {
        C52711k.m112240b(str, "tag");
        return new C26147z(str, j, awemeRawAd);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26147z) {
                C26147z zVar = (C26147z) obj;
                if (C52711k.m112239a((Object) this.f69044a, (Object) zVar.f69044a)) {
                    if (!(this.f69045b == zVar.f69045b) || !C52711k.m112239a((Object) this.f69046c, (Object) zVar.f69046c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final AwemeRawAd getAwemeRawAd() {
        return this.f69046c;
    }

    public final long getStartTime() {
        return this.f69045b;
    }

    public final String getTag() {
        return this.f69044a;
    }

    public final int hashCode() {
        String str = this.f69044a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.f69045b)) * 31;
        AwemeRawAd awemeRawAd = this.f69046c;
        if (awemeRawAd != null) {
            i = awemeRawAd.hashCode();
        }
        return hashCode + i;
    }

    public final String toJson() {
        String b = new C17971f().mo34889b(this);
        C52711k.m112236a((Object) b, "Gson().toJson(this)");
        return b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("tag=");
        sb.append(this.f69044a);
        sb.append(", startTime=");
        sb.append(this.f69045b);
        sb.append(", awemeRawAd=");
        sb.append(this.f69046c);
        return sb.toString();
    }

    public final void setStartTime(long j) {
        this.f69045b = j;
    }

    private C26147z(String str, long j, AwemeRawAd awemeRawAd) {
        this.f69044a = str;
        this.f69045b = j;
        this.f69046c = awemeRawAd;
    }

    public /* synthetic */ C26147z(String str, long j, AwemeRawAd awemeRawAd, C52707g gVar) {
        this(str, j, awemeRawAd);
    }
}
