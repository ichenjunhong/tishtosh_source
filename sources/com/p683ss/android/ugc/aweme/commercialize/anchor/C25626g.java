package com.p683ss.android.ugc.aweme.commercialize.anchor;

import com.google.gson.p1076a.C17950a;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.g */
public final class C25626g {

    /* renamed from: o */
    public static final C25627a f67829o = new C25627a(null);
    @C17952c(mo34828a = "type")

    /* renamed from: a */
    public final int f67830a;
    @C17952c(mo34828a = "icon")

    /* renamed from: b */
    public final UrlModel f67831b;
    @C17952c(mo34828a = "title")

    /* renamed from: c */
    public final String f67832c;
    @C17952c(mo34828a = "web_url")

    /* renamed from: d */
    public final String f67833d;
    @C17952c(mo34828a = "added_icon")

    /* renamed from: e */
    public final UrlModel f67834e;
    @C17952c(mo34828a = "desc")

    /* renamed from: f */
    public final String f67835f;
    @C17952c(mo34828a = "content")

    /* renamed from: g */
    public final String f67836g;
    @C17952c(mo34828a = "is_recommend")

    /* renamed from: h */
    public boolean f67837h;
    @C17952c(mo34828a = "is_beta")

    /* renamed from: i */
    public final boolean f67838i;
    @C17952c(mo34828a = "hashtag")

    /* renamed from: j */
    public final String f67839j;
    @C17952c(mo34828a = "scope")

    /* renamed from: k */
    public final int f67840k;
    @C17950a(mo34824a = false, mo34825b = false)

    /* renamed from: l */
    public C52670a<C52860x> f67841l;
    @C17950a(mo34824a = false, mo34825b = false)

    /* renamed from: m */
    public ExtensionMisc f67842m;
    @C17950a(mo34824a = false, mo34825b = false)

    /* renamed from: n */
    public boolean f67843n;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.g$a */
    public static final class C25627a {
        private C25627a() {
        }

        public /* synthetic */ C25627a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25626g) {
                C25626g gVar = (C25626g) obj;
                if ((this.f67830a == gVar.f67830a) && C52711k.m112239a((Object) this.f67831b, (Object) gVar.f67831b) && C52711k.m112239a((Object) this.f67832c, (Object) gVar.f67832c) && C52711k.m112239a((Object) this.f67833d, (Object) gVar.f67833d) && C52711k.m112239a((Object) this.f67834e, (Object) gVar.f67834e) && C52711k.m112239a((Object) this.f67835f, (Object) gVar.f67835f) && C52711k.m112239a((Object) this.f67836g, (Object) gVar.f67836g)) {
                    if (this.f67837h == gVar.f67837h) {
                        if ((this.f67838i == gVar.f67838i) && C52711k.m112239a((Object) this.f67839j, (Object) gVar.f67839j)) {
                            if ((this.f67840k == gVar.f67840k) && C52711k.m112239a((Object) this.f67841l, (Object) gVar.f67841l) && C52711k.m112239a((Object) this.f67842m, (Object) gVar.f67842m)) {
                                if (this.f67843n == gVar.f67843n) {
                                    return true;
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
        int hashCode = Integer.hashCode(this.f67830a) * 31;
        UrlModel urlModel = this.f67831b;
        int i = 0;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str = this.f67832c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67833d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.f67834e;
        int hashCode5 = (hashCode4 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        String str3 = this.f67835f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f67836g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.f67837h;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f67838i;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str5 = this.f67839j;
        int hashCode8 = (((i3 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.f67840k)) * 31;
        C52670a<C52860x> aVar = this.f67841l;
        int hashCode9 = (hashCode8 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ExtensionMisc extensionMisc = this.f67842m;
        if (extensionMisc != null) {
            i = extensionMisc.hashCode();
        }
        int i4 = (hashCode9 + i) * 31;
        boolean z3 = this.f67843n;
        if (z3) {
            z3 = true;
        }
        return i4 + (z3 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorPublishStruct(type=");
        sb.append(this.f67830a);
        sb.append(", icon=");
        sb.append(this.f67831b);
        sb.append(", title=");
        sb.append(this.f67832c);
        sb.append(", webUrl=");
        sb.append(this.f67833d);
        sb.append(", addedIcon=");
        sb.append(this.f67834e);
        sb.append(", desc=");
        sb.append(this.f67835f);
        sb.append(", content=");
        sb.append(this.f67836g);
        sb.append(", isRecommend=");
        sb.append(this.f67837h);
        sb.append(", isBeta=");
        sb.append(this.f67838i);
        sb.append(", hashtag=");
        sb.append(this.f67839j);
        sb.append(", scope=");
        sb.append(this.f67840k);
        sb.append(", onClickAction=");
        sb.append(this.f67841l);
        sb.append(", extensionMisc=");
        sb.append(this.f67842m);
        sb.append(", enable=");
        sb.append(this.f67843n);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo52779a(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f67841l = aVar;
    }
}
