package com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdLandPageLinksMethod */
public final class OpenAdLandPageLinksMethod extends BaseBridgeMethod {

    /* renamed from: b */
    private final String f64007b = "openAdLandPageLinks";

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64007b;
    }

    public OpenAdLandPageLinksMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
        if (r6 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x016e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49906a(org.json.JSONObject r11, com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a r12) {
        /*
            r10 = this;
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            java.lang.String r0 = "iReturn"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r0 = "url"
            java.lang.String r11 = r11.optString(r0)
            r0 = r11
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0020
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r0 = 0
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            r3 = -1
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "empty url"
            r12.mo49910a(r3, r0)
        L_0x0029:
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.String r4 = "url"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r4)
            com.bytedance.ies.bullet.b.e.i r4 = r10.mo49907g()
            r5 = 0
            if (r4 == 0) goto L_0x0042
            java.lang.Class<com.ss.android.ugc.aweme.bullet.module.ad.c> r6 = com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24302c.class
            com.bytedance.ies.bullet.b.i.r r4 = r4.mo18341a(r6)
            com.ss.android.ugc.aweme.bullet.module.ad.c r4 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24302c) r4
            goto L_0x0043
        L_0x0042:
            r4 = r5
        L_0x0043:
            com.ss.android.ugc.aweme.bullet.module.ad.d r6 = com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24303d.f64458a
            com.bytedance.ies.bullet.b.g.a.b r7 = r10.f27647a
            com.bytedance.ies.bullet.b.e.i r8 = r10.mo49907g()
            r6.mo50053a(r7, r8, r4)
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r6 = new com.ss.android.ugc.aweme.commercialize.utils.a.a$a
            r6.<init>()
            java.lang.String r7 = "landing_ad"
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r6 = r6.mo54040h(r7)
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r6 = r6.mo54030c(r11)
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r6.mo54035e(r11)
            r6 = 0
            if (r4 == 0) goto L_0x0074
            com.bytedance.ies.bullet.b.i.l r8 = r4.f64450b
            java.lang.Object r8 = r8.mo18457b()
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L_0x0074
            long r8 = r8.longValue()
            goto L_0x0075
        L_0x0074:
            r8 = r6
        L_0x0075:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54020a(r8)
            if (r4 == 0) goto L_0x0080
            java.lang.String r8 = r4.mo50049d()
            goto L_0x0081
        L_0x0080:
            r8 = r5
        L_0x0081:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54027b(r8)
            if (r4 == 0) goto L_0x0097
            java.lang.String r8 = r4.mo50048c()
            if (r8 == 0) goto L_0x0097
            java.lang.Long r8 = p2628d.p2650m.C52830p.m112396d(r8)
            if (r8 == 0) goto L_0x0097
            long r6 = r8.longValue()
        L_0x0097:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54026b(r6)
            if (r4 == 0) goto L_0x00aa
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r6 = r4.f64453f
            java.lang.Object r6 = r6.mo18457b()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x00ab
            java.lang.String r6 = ""
            goto L_0x00ab
        L_0x00aa:
            r6 = r5
        L_0x00ab:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54043k(r6)
            if (r4 == 0) goto L_0x00b6
            java.lang.String r6 = r4.mo50050e()
            goto L_0x00b7
        L_0x00b6:
            r6 = r5
        L_0x00b7:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54045m(r6)
            if (r4 == 0) goto L_0x00c9
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r6 = r4.f64456i
            if (r6 == 0) goto L_0x00c9
            java.lang.Object r6 = r6.mo18457b()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x00cb
        L_0x00c9:
            java.lang.String r6 = ""
        L_0x00cb:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26325a.C26326a) r11
            com.ss.android.ugc.aweme.commercialize.utils.a.a r7 = r11.f69476a
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r7 = r7.f69470a
            if (r6 != 0) goto L_0x00d5
            java.lang.String r6 = ""
        L_0x00d5:
            java.lang.String r8 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r8)
            r7.f69481e = r6
            if (r4 == 0) goto L_0x00ef
            com.bytedance.ies.bullet.b.i.j r6 = r4.f64451d
            if (r6 == 0) goto L_0x00ef
            java.lang.Object r6 = r6.mo18457b()
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x00ef
            int r6 = r6.intValue()
            goto L_0x00f0
        L_0x00ef:
            r6 = 0
        L_0x00f0:
            com.ss.android.ugc.aweme.commercialize.utils.a.a r7 = r11.f69476a
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r7 = r7.f69470a
            r7.f69482f = r6
            if (r4 == 0) goto L_0x0103
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r6 = r4.f64457j
            if (r6 == 0) goto L_0x0103
            java.lang.Object r6 = r6.mo18457b()
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0104
        L_0x0103:
            r6 = r5
        L_0x0104:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54037f(r6)
            if (r4 == 0) goto L_0x011b
            com.bytedance.ies.bullet.b.i.b r6 = r4.f64438M
            if (r6 == 0) goto L_0x011b
            java.lang.Object r6 = r6.mo18457b()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x011b
            boolean r6 = r6.booleanValue()
            goto L_0x011c
        L_0x011b:
            r6 = 0
        L_0x011c:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54031c(r6)
            if (r4 == 0) goto L_0x0133
            com.bytedance.ies.bullet.b.i.b r6 = r4.f28100G
            if (r6 == 0) goto L_0x0133
            java.lang.Object r6 = r6.mo18457b()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0133
            boolean r6 = r6.booleanValue()
            goto L_0x0134
        L_0x0133:
            r6 = 1
        L_0x0134:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54028b(r6)
            if (r4 == 0) goto L_0x014b
            com.bytedance.ies.bullet.b.i.j r6 = r4.f64439N
            if (r6 == 0) goto L_0x014b
            java.lang.Object r6 = r6.mo18457b()
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x014b
            int r6 = r6.intValue()
            goto L_0x014c
        L_0x014b:
            r6 = 0
        L_0x014c:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26325a.C26326a) r11
            com.ss.android.ugc.aweme.commercialize.utils.a.a r7 = r11.f69476a
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r7 = r7.f69471b
            r7.f69514l = r6
            if (r4 == 0) goto L_0x0167
            com.bytedance.ies.bullet.b.i.b r6 = r4.f64443R
            if (r6 == 0) goto L_0x0167
            java.lang.Object r6 = r6.mo18457b()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0167
            boolean r6 = r6.booleanValue()
            goto L_0x0168
        L_0x0167:
            r6 = 1
        L_0x0168:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54034d(r6)
            if (r4 == 0) goto L_0x017b
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r6 = r4.f64452e
            java.lang.Object r6 = r6.mo18457b()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x017c
            java.lang.String r6 = ""
            goto L_0x017c
        L_0x017b:
            r6 = r5
        L_0x017c:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54042j(r6)
            if (r4 == 0) goto L_0x0187
            java.lang.String r6 = r4.mo50051f()
            goto L_0x0188
        L_0x0187:
            r6 = r5
        L_0x0188:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54044l(r6)
            if (r4 == 0) goto L_0x019f
            com.bytedance.ies.bullet.b.i.j r6 = r4.f64440O
            if (r6 == 0) goto L_0x019f
            java.lang.Object r6 = r6.mo18457b()
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x019f
            int r6 = r6.intValue()
            goto L_0x01a0
        L_0x019f:
            r6 = 0
        L_0x01a0:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54029c(r6)
            if (r4 == 0) goto L_0x01b7
            com.bytedance.ies.bullet.b.i.j r6 = r4.f64441P
            if (r6 == 0) goto L_0x01b7
            java.lang.Object r6 = r6.mo18457b()
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x01b7
            int r6 = r6.intValue()
            goto L_0x01b8
        L_0x01b7:
            r6 = 0
        L_0x01b8:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54032d(r6)
            if (r4 == 0) goto L_0x01ce
            com.bytedance.ies.bullet.b.i.b r6 = r4.f64442Q
            if (r6 == 0) goto L_0x01ce
            java.lang.Object r6 = r6.mo18457b()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x01ce
            boolean r2 = r6.booleanValue()
        L_0x01ce:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54038f(r2)
            if (r4 == 0) goto L_0x01e1
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r2 = r4.f64454g
            java.lang.Object r2 = r2.mo18457b()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x01e2
            java.lang.String r2 = ""
            goto L_0x01e2
        L_0x01e1:
            r2 = r5
        L_0x01e2:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54048p(r2)
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54025b(r1)
            if (r4 == 0) goto L_0x01f9
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r1 = r4.f64455h
            java.lang.Object r1 = r1.mo18457b()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x01fa
            java.lang.String r1 = ""
            goto L_0x01fa
        L_0x01f9:
            r1 = r5
        L_0x01fa:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54046n(r1)
            if (r4 == 0) goto L_0x020b
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r1 = r4.f64457j
            if (r1 == 0) goto L_0x020b
            java.lang.Object r1 = r1.mo18457b()
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x020c
        L_0x020b:
            r1 = r5
        L_0x020c:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = r11.mo54047o(r1)
            long r1 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r11 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26325a.C26326a) r11
            com.ss.android.ugc.aweme.commercialize.utils.a.a r6 = r11.f69476a
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r6 = r6.f69471b
            r6.f69516n = r1
            if (r4 == 0) goto L_0x023b
            com.bytedance.ies.bullet.b.i.j r1 = r4.f64444S
            java.lang.Object r1 = r1.mo18457b()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x022f
            int r2 = r1.intValue()
            r4 = -2
            if (r2 != r4) goto L_0x0230
        L_0x022f:
            r1 = r5
        L_0x0230:
            if (r1 == 0) goto L_0x023b
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r11.mo54019a(r1)
        L_0x023b:
            com.ss.android.ugc.aweme.commercialize.utils.a.a r11 = r11.f69476a
            java.lang.String r1 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            java.lang.String r1 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.c$a
            r1.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r11 = r1.mo54092a(r11)
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r11 = r11.mo54090a(r0)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.g r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.a.g
            r1.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r11 = r11.mo54091a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.c r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.a.c
            r1.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r11 = r11.mo54091a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.d r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.a.d
            r1.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r11 = r11.mo54091a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.d$c r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.d$c
            r1.<init>(r0)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r11 = r11.mo54091a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.c r11 = r11.f69531a
            com.ss.android.ugc.aweme.commercialize.utils.a.g r11 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26365g) r11
            boolean r11 = r11.mo54089a()
            if (r11 == 0) goto L_0x028e
            r12.mo49911a(r5)
            return
        L_0x028e:
            java.lang.String r11 = "can not handle url"
            r12.mo49910a(r3, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.OpenAdLandPageLinksMethod.mo49906a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
