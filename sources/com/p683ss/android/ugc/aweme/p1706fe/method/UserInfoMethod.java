package com.p683ss.android.ugc.aweme.p1706fe.method;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.UserInfoMethod */
public final class UserInfoMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29847a f77923a = new C29847a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.UserInfoMethod$a */
    public static final class C29847a {
        private C29847a() {
        }

        public /* synthetic */ C29847a(C52707g gVar) {
            this();
        }
    }

    public UserInfoMethod() {
        this(null, 1, null);
    }

    public UserInfoMethod(C10757a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49914a(org.json.JSONObject r21, com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a r22) {
        /*
            r20 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "res"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            com.ss.android.ugc.aweme.IAccountUserService r5 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r6 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getCurUser()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.IAccountUserService r8 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r9 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            boolean r8 = r8.isLogin()
            if (r8 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r2 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r1 = r1.getCurUserId()
            long r1 = java.lang.Long.parseLong(r1)
            java.lang.String r3 = r5.getNickname()
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            java.lang.String r4 = r5.getUniqueId()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x005c
            java.lang.String r4 = r5.getShortId()
            goto L_0x0060
        L_0x005c:
            java.lang.String r4 = r5.getUniqueId()
        L_0x0060:
            java.lang.String r8 = r5.getBindPhone()
            java.lang.String r9 = r5.getSecUid()
            com.ss.android.ugc.aweme.base.model.UrlModel r10 = r5.getAvatarMedium()
            if (r10 == 0) goto L_0x008b
            java.util.List r11 = r10.getUrlList()
            if (r11 == 0) goto L_0x008b
            java.util.List r11 = r10.getUrlList()
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x008b
            java.lang.String r11 = "avatar_url"
            java.util.List r10 = r10.getUrlList()
            java.lang.Object r7 = r10.get(r7)
            r0.put(r11, r7)
        L_0x008b:
            com.bytedance.ies.abmock.b r12 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.movie.experiment.MovieDetailExperiment> r13 = com.p683ss.android.ugc.aweme.movie.experiment.MovieDetailExperiment.class
            r14 = 1
            java.lang.String r15 = "mv_theme_mode_switch"
            r16 = 31744(0x7c00, float:4.4483E-41)
            r17 = 1
            boolean r7 = r12.mo18172a(r13, r14, r15, r16, r17)
            r10 = r7
            r7 = 1
            goto L_0x00ad
        L_0x009f:
            r8 = -1
            r10 = 0
            r18 = r3
            r3 = r1
            r19 = r4
            r4 = r2
            r1 = r8
            r8 = r18
            r9 = r19
        L_0x00ad:
            java.lang.String r11 = "is_login"
            r0.put(r11, r7)
            java.lang.String r11 = "success"
            r0.put(r11, r7)
            java.lang.String r7 = "user_id"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r7, r1)
            java.lang.String r1 = "nickname"
            r0.put(r1, r3)
            java.lang.String r1 = "unique_id"
            r0.put(r1, r4)
            java.lang.String r1 = "bind_phone"
            r0.put(r1, r8)
            java.lang.String r1 = "code"
            r0.put(r1, r6)
            java.lang.String r1 = "sec_user_id"
            r0.put(r1, r9)
            java.lang.String r1 = "isSupportMV"
            r0.put(r1, r10)
            com.ss.android.ugc.aweme.commercialize.model.f$a r1 = com.p683ss.android.ugc.aweme.commercialize.model.C26121f.f68971d
            java.lang.Long r1 = r1.mo53637b(r5)
            if (r1 == 0) goto L_0x00ef
            java.lang.String r2 = "decoration_id"
            long r3 = r1.longValue()
            r0.put(r2, r3)
        L_0x00ef:
            r1 = r22
            r1.mo60041a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.UserInfoMethod.mo49914a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private /* synthetic */ UserInfoMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
