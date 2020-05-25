package com.p683ss.android.ugc.aweme.commercialize.link;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.router.C41302w;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.d */
public final class C25953d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f68528a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25953d.class), "shownGuideUserIdSpCache", "getShownGuideUserIdSpCache()Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25953d.class), "settingItemEnteredUserId", "getSettingItemEnteredUserId()Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;"))};

    /* renamed from: b */
    public static final C25954a f68529b = new C25954a("ad_link_auth_page_publish", "aweme://webview/?url=https%3A%2F%2Fwww.douyin.com%2Ffalcon%2Frn%2Flink_plan%3Fhide_nav_bar%3D1%26enter_from%3Dpublish&hide_nav_bar=1&enter_from=publish&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_link_plan%26bg_theme%3D%2523161823%26hide_nav_bar%3D1%26enter_from%3Dpublish");

    /* renamed from: c */
    public static final C25954a f68530c = new C25954a("ad_link_auth_page_settings", "aweme://webview/?url=https%3A%2F%2Fwww.douyin.com%2Ffalcon%2Frn%2Flink_plan%3Fhide_nav_bar%3D1%26enter_from%3Dsettings&hide_nav_bar=1&enter_from=settings&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_link_plan%26bg_theme%3D%2523161823%26hide_nav_bar%3D1%26enter_from%3Dsettings");

    /* renamed from: d */
    public static final C25953d f68531d = new C25953d();

    /* renamed from: e */
    private static final C52668f f68532e = C52732g.m112285a(C25956c.f68537a);

    /* renamed from: f */
    private static final C52668f f68533f = C52732g.m112285a(C25955b.f68536a);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.d$a */
    public static final class C25954a {

        /* renamed from: a */
        private final C23051bf<String> f68534a;

        /* renamed from: b */
        private final String f68535b;

        /* renamed from: a */
        private String m62950a() {
            boolean z;
            String str = (String) this.f68534a.mo47782d();
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return this.f68535b;
            }
            return str;
        }

        /* renamed from: a */
        public final void mo53301a(Activity activity) {
            C41302w a = C41302w.m91042a();
            if (a != null) {
                a.mo83858a(activity, m62950a());
            }
        }

        /* renamed from: a */
        public final void mo53302a(String str) {
            boolean z;
            C23051bf<String> bfVar = this.f68534a;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "";
            }
            bfVar.mo47776a(str);
        }

        public C25954a(String str, String str2) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(str2, "default");
            this.f68535b = str2;
            this.f68534a = new C23051bf<>(str, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.d$b */
    static final class C25955b extends C52712l implements C52670a<C23051bf<String>> {

        /* renamed from: a */
        public static final C25955b f68536a = new C25955b();

        C25955b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23051bf("ad_link_auth_setting_item_entered_uid", "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.d$c */
    static final class C25956c extends C52712l implements C52670a<C23051bf<String>> {

        /* renamed from: a */
        public static final C25956c f68537a = new C25956c();

        C25956c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23051bf("ad_link_auth_guide_shown_uid", "");
        }
    }

    private C25953d() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m62948a() {
        /*
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            r1 = 0
            if (r0 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.profile.model.CommerceUserInfo r0 = r0.getCommerceUserInfo()
            if (r0 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.profile.model.LinkUserInfoStruct r0 = r0.getLinkUserInfo()
            if (r0 == 0) goto L_0x0020
            int r0 = r0.authStatus
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            r2 = 2
            boolean r0 = m62949a(r0, r2)
            if (r0 == 0) goto L_0x004e
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.profile.model.CommerceUserInfo r0 = r0.getCommerceUserInfo()
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.profile.model.LinkUserInfoStruct r0 = r0.getLinkUserInfo()
            if (r0 == 0) goto L_0x0046
            int r0 = r0.authType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0046:
            r0 = 1
            boolean r1 = m62949a(r1, r0)
            if (r1 == 0) goto L_0x004e
            return r0
        L_0x004e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.link.C25953d.m62948a():boolean");
    }

    /* renamed from: a */
    static boolean m62949a(Integer num, int i) {
        if (num != null && i == num.intValue()) {
            return true;
        }
        return false;
    }
}
