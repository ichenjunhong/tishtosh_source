package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.w */
public final class C26144w implements Serializable {
    @C17952c(mo34828a = "render_type")

    /* renamed from: a */
    private final String f69033a;
    @C17952c(mo34828a = "is_support_native_animation")

    /* renamed from: b */
    private final boolean f69034b;
    @C17952c(mo34828a = "animation_type")

    /* renamed from: c */
    private final String f69035c;
    @C17952c(mo34828a = "gecko_channel")

    /* renamed from: d */
    private final List<String> f69036d;
    @C17952c(mo34828a = "site_type")

    /* renamed from: e */
    private final String f69037e;
    @C17952c(mo34828a = "lynx_scheme")

    /* renamed from: f */
    private final String f69038f;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r8v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.commercialize.model.C26144w copy$default(com.p683ss.android.ugc.aweme.commercialize.model.C26144w r4, java.lang.String r5, boolean r6, java.lang.String r7, java.util.List<java.lang.String> r8, java.lang.String r9, java.lang.String r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = r4.f69033a
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            boolean r6 = r4.f69034b
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            java.lang.String r7 = r4.f69035c
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            java.util.List<java.lang.String> r8 = r4.f69036d
        L_0x001a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            java.lang.String r9 = r4.f69037e
        L_0x0021:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            java.lang.String r10 = r4.f69038f
        L_0x0028:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            com.ss.android.ugc.aweme.commercialize.model.w r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.model.C26144w.copy$default(com.ss.android.ugc.aweme.commercialize.model.w, java.lang.String, boolean, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, java.lang.Object):com.ss.android.ugc.aweme.commercialize.model.w");
    }

    public final String component1() {
        return this.f69033a;
    }

    public final boolean component2() {
        return this.f69034b;
    }

    public final String component3() {
        return this.f69035c;
    }

    public final List<String> component4() {
        return this.f69036d;
    }

    public final String component5() {
        return this.f69037e;
    }

    public final String component6() {
        return this.f69038f;
    }

    public final C26144w copy(String str, boolean z, String str2, List<String> list, String str3, String str4) {
        C26144w wVar = new C26144w(str, z, str2, list, str3, str4);
        return wVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26144w) {
                C26144w wVar = (C26144w) obj;
                if (C52711k.m112239a((Object) this.f69033a, (Object) wVar.f69033a)) {
                    if (!(this.f69034b == wVar.f69034b) || !C52711k.m112239a((Object) this.f69035c, (Object) wVar.f69035c) || !C52711k.m112239a((Object) this.f69036d, (Object) wVar.f69036d) || !C52711k.m112239a((Object) this.f69037e, (Object) wVar.f69037e) || !C52711k.m112239a((Object) this.f69038f, (Object) wVar.f69038f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getAnimationType() {
        return this.f69035c;
    }

    public final List<String> getGeckoChannel() {
        return this.f69036d;
    }

    public final String getLynxScheme() {
        return this.f69038f;
    }

    public final String getRenderType() {
        return this.f69033a;
    }

    public final String getSiteType() {
        return this.f69037e;
    }

    public final int hashCode() {
        String str = this.f69033a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f69034b;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f69035c;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f69036d;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.f69037e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f69038f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final boolean isSupportNativeAnimation() {
        return this.f69034b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeSiteConfig(renderType=");
        sb.append(this.f69033a);
        sb.append(", isSupportNativeAnimation=");
        sb.append(this.f69034b);
        sb.append(", animationType=");
        sb.append(this.f69035c);
        sb.append(", geckoChannel=");
        sb.append(this.f69036d);
        sb.append(", siteType=");
        sb.append(this.f69037e);
        sb.append(", lynxScheme=");
        sb.append(this.f69038f);
        sb.append(")");
        return sb.toString();
    }

    public C26144w(String str, boolean z, String str2, List<String> list, String str3, String str4) {
        this.f69033a = str;
        this.f69034b = z;
        this.f69035c = str2;
        this.f69036d = list;
        this.f69037e = str3;
        this.f69038f = str4;
    }

    public /* synthetic */ C26144w(String str, boolean z, String str2, List list, String str3, String str4, int i, C52707g gVar) {
        boolean z2;
        if ((i & 2) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this(str, z2, str2, list, str3, str4);
    }
}
