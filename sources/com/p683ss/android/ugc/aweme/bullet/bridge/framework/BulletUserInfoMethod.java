package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.BulletUserInfoMethod */
public final class BulletUserInfoMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24181a f64156b = new C24181a(null);

    /* renamed from: c */
    private final String f64157c = "uniUserInfo";

    /* renamed from: d */
    private C10269a f64158d = C10269a.PROTECT;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.BulletUserInfoMethod$a */
    public static final class C24181a {
        private C24181a() {
        }

        public /* synthetic */ C24181a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64158d;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64157c;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64158d = aVar;
    }

    public BulletUserInfoMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49906a(org.json.JSONObject r14, com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a r15) {
        /*
            r13 = this;
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r0)
            java.lang.String r14 = "iReturn"
            p2628d.p2639f.p2641b.C52711k.m112240b(r15, r14)
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r0 = "res"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.IAccountUserService r4 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r5 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getCurUser()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x00a9
            com.ss.android.ugc.aweme.IAccountUserService r7 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r8 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            boolean r7 = r7.isLogin()
            if (r7 == 0) goto L_0x00a9
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r0 = r0.getCurUserId()
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.String r2 = r4.getNickname()
            if (r2 != 0) goto L_0x0055
            java.lang.String r2 = ""
        L_0x0055:
            java.lang.String r3 = r4.getUniqueId()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = r4.getShortId()
            java.lang.String r7 = "user.shortId"
        L_0x0067:
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
            goto L_0x0072
        L_0x006b:
            java.lang.String r3 = r4.getUniqueId()
            java.lang.String r7 = "user.uniqueId"
            goto L_0x0067
        L_0x0072:
            java.lang.String r7 = r4.getBindPhone()
            java.lang.String r8 = "user.bindPhone"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.String r8 = r4.getSecUid()
            java.lang.String r9 = "user.secUid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = r4.getAvatarMedium()
            if (r9 == 0) goto L_0x00a7
            java.util.List r10 = r9.getUrlList()
            if (r10 == 0) goto L_0x00a7
            java.util.List r10 = r9.getUrlList()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x00a7
            java.lang.String r10 = "avatar_url"
            java.util.List r9 = r9.getUrlList()
            java.lang.Object r6 = r9.get(r6)
            r14.put(r10, r6)
        L_0x00a7:
            r6 = 1
            goto L_0x00b2
        L_0x00a9:
            r7 = -1
            r11 = r2
            r2 = r0
            r12 = r3
            r3 = r1
            r0 = r7
            r7 = r11
            r8 = r12
        L_0x00b2:
            java.lang.String r9 = "is_login"
            r14.put(r9, r6)
            java.lang.String r9 = "success"
            r14.put(r9, r6)
            java.lang.String r6 = "user_id"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r14.put(r6, r0)
            java.lang.String r0 = "nickname"
            r14.put(r0, r2)
            java.lang.String r0 = "unique_id"
            r14.put(r0, r3)
            java.lang.String r0 = "bind_phone"
            r14.put(r0, r7)
            java.lang.String r0 = "code"
            r14.put(r0, r5)
            java.lang.String r0 = "sec_user_id"
            r14.put(r0, r8)
            com.ss.android.ugc.aweme.commercialize.model.f$a r0 = com.p683ss.android.ugc.aweme.commercialize.model.C26121f.f68971d
            java.lang.Long r0 = r0.mo53637b(r4)
            if (r0 == 0) goto L_0x00ef
            java.lang.String r1 = "decoration_id"
            long r2 = r0.longValue()
            r14.put(r1, r2)
        L_0x00ef:
            r15.mo49911a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.bridge.framework.BulletUserInfoMethod.mo49906a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
