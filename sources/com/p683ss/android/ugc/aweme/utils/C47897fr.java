package com.p683ss.android.ugc.aweme.utils;

import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.fr */
public final class C47897fr {

    /* renamed from: a */
    public static final C47898a f120492a = new C47898a(null);

    /* renamed from: com.ss.android.ugc.aweme.utils.fr$a */
    public static final class C47898a {
        private C47898a() {
        }

        /* renamed from: c */
        public final boolean mo95100c() {
            if (!m103610d() || !m103608a() || !m103612h()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public final boolean mo95101e() {
            if (!m103610d() || !m103613i() || !m103608a() || !m103612h()) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo95102f() {
            if (!m103610d() || !mo95100c() || (!m103613i() && !m103611g())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static boolean m103608a() {
            Integer num;
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
            if (curUser != null) {
                CommerceUserInfo commerceUserInfo = curUser.getCommerceUserInfo();
                if (commerceUserInfo != null) {
                    num = Integer.valueOf(commerceUserInfo.getStarAtlas());
                    if (num != null && num.intValue() == 1) {
                        return true;
                    }
                    return false;
                }
            }
            num = null;
            if (num != null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public static void m103609b() {
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
            ProfileServiceImpl.createIProfileServicebyMonsterPlugin().queryUser(ProfileServiceImpl.createIProfileServicebyMonsterPlugin().userUrl(curUser.getSecUid(), curUser.getUid(), curUser.getUniqueId(), 0), true, "");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x001c A[Catch:{ Exception -> 0x002a }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m103610d() {
            /*
                r0 = 0
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ Exception -> 0x002a }
                if (r1 == 0) goto L_0x0018
                com.ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection r1 = r1.getFeConfigCollection()     // Catch:{ Exception -> 0x002a }
                if (r1 == 0) goto L_0x0018
                com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig r1 = r1.getTcmEntrance()     // Catch:{ Exception -> 0x002a }
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = r1.getSchema()     // Catch:{ Exception -> 0x002a }
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                r2 = 1
                if (r1 == 0) goto L_0x002a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x002a }
                int r1 = r1.length()     // Catch:{ Exception -> 0x002a }
                if (r1 != 0) goto L_0x0026
                r1 = 1
                goto L_0x0027
            L_0x0026:
                r1 = 0
            L_0x0027:
                if (r1 != 0) goto L_0x002a
                r0 = 1
            L_0x002a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47897fr.C47898a.m103610d():boolean");
        }

        /* renamed from: g */
        private static boolean m103611g() {
            Boolean bool;
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
            if (curUser != null) {
                bool = Boolean.valueOf(curUser.proAccountTcmRedDot);
            } else {
                bool = null;
            }
            return bool.booleanValue();
        }

        /* renamed from: h */
        private static boolean m103612h() {
            Boolean bool;
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
            if (curUser != null) {
                bool = Boolean.valueOf(curUser.isProAccount());
            } else {
                bool = null;
            }
            return bool.booleanValue();
        }

        /* renamed from: i */
        private static boolean m103613i() {
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
            SharedPreferences a2 = C35807d.m80935a(C32463a.m75161a(), "tcm_pro_account", 0);
            StringBuilder sb = new StringBuilder("tcm_first_dot");
            sb.append(curUser.getUid());
            return a2.getBoolean(sb.toString(), true);
        }

        public /* synthetic */ C47898a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public static final boolean m103602a() {
        return C47898a.m103608a();
    }

    /* renamed from: b */
    public static final void m103603b() {
        C47898a.m103609b();
    }

    /* renamed from: c */
    public static final boolean m103604c() {
        return f120492a.mo95100c();
    }

    /* renamed from: d */
    public static final boolean m103605d() {
        return C47898a.m103610d();
    }

    /* renamed from: e */
    public static final boolean m103606e() {
        return f120492a.mo95101e();
    }

    /* renamed from: f */
    public static final boolean m103607f() {
        return f120492a.mo95102f();
    }
}
