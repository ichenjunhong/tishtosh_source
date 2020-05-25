package com.p683ss.android.ugc.aweme.commercialize.star;

import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.b */
public final class C26257b {

    /* renamed from: a */
    public static final C26257b f69325a = new C26257b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f69326b;

    /* renamed from: c */
    private static String f69327c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.b$a */
    public static final class C26258a implements C17824h<C26259c> {

        /* renamed from: a */
        final /* synthetic */ C52670a f69328a;

        C26258a(C52670a aVar) {
            this.f69328a = aVar;
        }

        public final void onFailure(Throwable th) {
            C52711k.m112240b(th, "t");
            C26257b.f69326b = false;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            boolean z;
            C26259c cVar = (C26259c) obj;
            if (cVar != null) {
                if (cVar.f69329a > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    cVar = null;
                }
                if (cVar != null) {
                    C26257b.f69326b = true;
                    this.f69328a.invoke();
                }
            }
        }
    }

    private C26257b() {
    }

    /* renamed from: a */
    public static boolean m63629a() {
        return f69326b;
    }

    static {
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf starAtlasOrderWebUrl = inst.getStarAtlasOrderWebUrl();
        C52711k.m112236a((Object) starAtlasOrderWebUrl, "SharePrefCache.inst().starAtlasOrderWebUrl");
        Object d = starAtlasOrderWebUrl.mo47782d();
        C52711k.m112236a(d, "SharePrefCache.inst().starAtlasOrderWebUrl.cache");
        f69327c = (String) d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0.getStarAtlas() == 1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r0.isWithStarAtlasEntry() == false) goto L_0x0046;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m63630b() {
        /*
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            r1 = 1
            if (r0 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.profile.model.CommerceUserInfo r0 = r0.getCommerceUserInfo()
            if (r0 == 0) goto L_0x001c
            int r0 = r0.getStarAtlas()
            if (r0 == r1) goto L_0x0044
        L_0x001c:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r2 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r2 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            java.lang.String r2 = "AccountProxyService.userService().curUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            boolean r0 = r0.isWithStarAtlasEntry()
            if (r0 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r0 = 0
            return r0
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.star.C26257b.m63630b():boolean");
    }
}
