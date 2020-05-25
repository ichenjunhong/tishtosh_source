package com.p683ss.android.ugc.aweme.commercialize.link.p1573a;

import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.a.a */
public final class C25948a {

    /* renamed from: a */
    public final String f68507a;

    /* renamed from: b */
    public final C26138s f68508b;

    /* renamed from: c */
    public final Aweme f68509c;

    /* renamed from: d */
    public final boolean f68510d;

    /* renamed from: e */
    public final boolean f68511e;

    /* renamed from: f */
    public final int f68512f;

    /* renamed from: g */
    public final long f68513g;

    /* renamed from: h */
    public final String f68514h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.a.a$a */
    public static final class C25949a {

        /* renamed from: a */
        public String f68515a = "";

        /* renamed from: b */
        public C26138s f68516b;

        /* renamed from: c */
        public Aweme f68517c;

        /* renamed from: d */
        public boolean f68518d;

        /* renamed from: e */
        public boolean f68519e = true;

        /* renamed from: f */
        public int f68520f = -1;

        /* renamed from: g */
        public long f68521g = -1;

        /* renamed from: h */
        public String f68522h = "";

        /* renamed from: a */
        public final C25948a mo53298a() {
            C25948a aVar = new C25948a(this.f68515a, this.f68516b, this.f68517c, this.f68518d, this.f68519e, this.f68520f, this.f68521g, this.f68522h);
            return aVar;
        }

        /* renamed from: a */
        public final C25949a mo53292a(int i) {
            C25949a aVar = this;
            aVar.f68520f = i;
            return aVar;
        }

        /* renamed from: a */
        public final C25949a mo53293a(long j) {
            C25949a aVar = this;
            aVar.f68521g = j;
            return aVar;
        }

        /* renamed from: a */
        public final C25949a mo53294a(C26138s sVar) {
            C25949a aVar = this;
            aVar.f68516b = sVar;
            return aVar;
        }

        /* renamed from: a */
        public final C25949a mo53295a(Aweme aweme) {
            C25949a aVar = this;
            aVar.f68517c = aweme;
            return aVar;
        }

        /* renamed from: a */
        public final C25949a mo53296a(String str) {
            C25949a aVar = this;
            if (str == null) {
                str = "";
            }
            aVar.f68515a = str;
            return aVar;
        }

        /* renamed from: a */
        public final C25949a mo53297a(boolean z) {
            C25949a aVar = this;
            aVar.f68518d = z;
            return aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25948a) {
                C25948a aVar = (C25948a) obj;
                if (C52711k.m112239a((Object) this.f68507a, (Object) aVar.f68507a) && C52711k.m112239a((Object) this.f68508b, (Object) aVar.f68508b) && C52711k.m112239a((Object) this.f68509c, (Object) aVar.f68509c)) {
                    if (this.f68510d == aVar.f68510d) {
                        if (this.f68511e == aVar.f68511e) {
                            if (this.f68512f == aVar.f68512f) {
                                if (!(this.f68513g == aVar.f68513g) || !C52711k.m112239a((Object) this.f68514h, (Object) aVar.f68514h)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f68507a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C26138s sVar = this.f68508b;
        int hashCode2 = (hashCode + (sVar != null ? sVar.hashCode() : 0)) * 31;
        Aweme aweme = this.f68509c;
        int hashCode3 = (hashCode2 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        boolean z = this.f68510d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f68511e;
        if (z2) {
            z2 = true;
        }
        int hashCode4 = (((((i2 + (z2 ? 1 : 0)) * 31) + Integer.hashCode(this.f68512f)) * 31) + Long.hashCode(this.f68513g)) * 31;
        String str2 = this.f68514h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdLinkLogParams(label=");
        sb.append(this.f68507a);
        sb.append(", linkData=");
        sb.append(this.f68508b);
        sb.append(", aweme=");
        sb.append(this.f68509c);
        sb.append(", fromCommentDialog=");
        sb.append(this.f68510d);
        sb.append(", useLinkExtra=");
        sb.append(this.f68511e);
        sb.append(", visibleRatio=");
        sb.append(this.f68512f);
        sb.append(", showDuration=");
        sb.append(this.f68513g);
        sb.append(", refer=");
        sb.append(this.f68514h);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo53288b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (this.f68513g >= 0) {
                    jSONObject.put("duration", this.f68513g);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53287a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ad_extra_data")) {
                    jSONObject2 = jSONObject.getJSONObject("ad_extra_data");
                    C52711k.m112236a((Object) jSONObject2, "ext.getJSONObject(Commer…izeMob.Key.AD_EXTRA_DATA)");
                } else {
                    jSONObject2 = new JSONObject();
                }
                if (this.f68512f >= 0) {
                    jSONObject2.put("pixel_pct", this.f68512f);
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception unused) {
            }
        }
    }

    public C25948a(String str, C26138s sVar, Aweme aweme, boolean z, boolean z2, int i, long j, String str2) {
        C52711k.m112240b(str, "label");
        C52711k.m112240b(str2, "refer");
        this.f68507a = str;
        this.f68508b = sVar;
        this.f68509c = aweme;
        this.f68510d = z;
        this.f68511e = z2;
        this.f68512f = i;
        this.f68513g = j;
        this.f68514h = str2;
    }
}
