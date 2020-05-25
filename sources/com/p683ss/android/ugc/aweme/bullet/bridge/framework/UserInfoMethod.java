package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod */
public final class UserInfoMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24222a f64265b = new C24222a(null);

    /* renamed from: c */
    private final String f64266c = "userInfo";

    /* renamed from: d */
    private C10269a f64267d = C10269a.PROTECT;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod$a */
    public static final class C24222a {
        private C24222a() {
        }

        public /* synthetic */ C24222a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64267d;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64266c;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64267d = aVar;
    }

    public UserInfoMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49906a(org.json.JSONObject r22, com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a r23) {
        /*
            r21 = this;
            r0 = r23
            java.lang.String r1 = "params"
            r2 = r22
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r1)
            java.lang.String r1 = "iReturn"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "res"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            com.ss.android.ugc.aweme.IAccountUserService r6 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r7 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            com.ss.android.ugc.aweme.profile.model.User r6 = r6.getCurUser()
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.IAccountUserService r9 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r10 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            boolean r9 = r9.isLogin()
            if (r9 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r3 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getCurUserId()
            long r2 = java.lang.Long.parseLong(r2)
            java.lang.String r4 = r6.getNickname()
            if (r4 != 0) goto L_0x0059
            java.lang.String r4 = ""
        L_0x0059:
            java.lang.String r5 = r6.getUniqueId()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x006a
            java.lang.String r5 = r6.getShortId()
            goto L_0x006e
        L_0x006a:
            java.lang.String r5 = r6.getUniqueId()
        L_0x006e:
            java.lang.String r9 = r6.getBindPhone()
            java.lang.String r10 = r6.getSecUid()
            com.ss.android.ugc.aweme.base.model.UrlModel r11 = r6.getAvatarMedium()
            if (r11 == 0) goto L_0x0099
            java.util.List r12 = r11.getUrlList()
            if (r12 == 0) goto L_0x0099
            java.util.List r12 = r11.getUrlList()
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x0099
            java.lang.String r12 = "avatar_url"
            java.util.List r11 = r11.getUrlList()
            java.lang.Object r8 = r11.get(r8)
            r1.put(r12, r8)
        L_0x0099:
            com.bytedance.ies.abmock.b r13 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.movie.experiment.MovieDetailExperiment> r14 = com.p683ss.android.ugc.aweme.movie.experiment.MovieDetailExperiment.class
            r15 = 1
            java.lang.String r16 = "mv_theme_mode_switch"
            r17 = 31744(0x7c00, float:4.4483E-41)
            r18 = 1
            boolean r8 = r13.mo18172a(r14, r15, r16, r17, r18)
            r11 = r8
            r8 = 1
            goto L_0x00bb
        L_0x00ad:
            r9 = -1
            r11 = 0
            r19 = r4
            r4 = r2
            r20 = r5
            r5 = r3
            r2 = r9
            r9 = r19
            r10 = r20
        L_0x00bb:
            java.lang.String r12 = "is_login"
            r1.put(r12, r8)
            java.lang.String r12 = "success"
            r1.put(r12, r8)
            java.lang.String r8 = "user_id"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.put(r8, r2)
            java.lang.String r2 = "nickname"
            r1.put(r2, r4)
            java.lang.String r2 = "unique_id"
            r1.put(r2, r5)
            java.lang.String r2 = "bind_phone"
            r1.put(r2, r9)
            java.lang.String r2 = "code"
            r1.put(r2, r7)
            java.lang.String r2 = "sec_user_id"
            r1.put(r2, r10)
            java.lang.String r2 = "isSupportMV"
            r1.put(r2, r11)
            com.ss.android.ugc.aweme.commercialize.model.f$a r2 = com.p683ss.android.ugc.aweme.commercialize.model.C26121f.f68971d
            java.lang.Long r2 = r2.mo53637b(r6)
            if (r2 == 0) goto L_0x00fd
            java.lang.String r3 = "decoration_id"
            long r4 = r2.longValue()
            r1.put(r3, r4)
        L_0x00fd:
            r0.mo49913a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod.mo49906a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
