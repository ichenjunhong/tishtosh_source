package com.p683ss.android.ugc.aweme.story.shootvideo.textrecord;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.d */
public final class C46715d {

    /* renamed from: e */
    public static final C46716a f117844e = new C46716a(null);
    @C17952c(mo34828a = "anchor_business_type")

    /* renamed from: a */
    public int f117845a;
    @C17952c(mo34828a = "source")

    /* renamed from: b */
    public int f117846b;
    @C17952c(mo34828a = "anchor_id")

    /* renamed from: c */
    public String f117847c;
    @C17952c(mo34828a = "anchor_content")

    /* renamed from: d */
    public String f117848d;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.d$a */
    public static final class C46716a {
        private C46716a() {
        }

        public /* synthetic */ C46716a(C52707g gVar) {
            this();
        }
    }

    public C46715d() {
        this(0, 0, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46715d) {
                C46715d dVar = (C46715d) obj;
                if (this.f117845a == dVar.f117845a) {
                    if (!(this.f117846b == dVar.f117846b) || !C52711k.m112239a((Object) this.f117847c, (Object) dVar.f117847c) || !C52711k.m112239a((Object) this.f117848d, (Object) dVar.f117848d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f117845a * 31) + this.f117846b) * 31;
        String str = this.f117847c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f117848d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TempPublishAnchorModel(anchorBusinessType=");
        sb.append(this.f117845a);
        sb.append(", source=");
        sb.append(this.f117846b);
        sb.append(", anchorId=");
        sb.append(this.f117847c);
        sb.append(", anchorContent=");
        sb.append(this.f117848d);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo93787a() {
        if (this.f117845a != 0 || this.f117847c == null || this.f117848d == null) {
            return false;
        }
        return true;
    }

    private C46715d(int i, int i2, String str, String str2) {
        this.f117845a = i;
        this.f117846b = i2;
        this.f117847c = str;
        this.f117848d = str2;
    }

    private /* synthetic */ C46715d(int i, int i2, String str, String str2, int i3, C52707g gVar) {
        this(-1, 0, null, null);
    }
}
