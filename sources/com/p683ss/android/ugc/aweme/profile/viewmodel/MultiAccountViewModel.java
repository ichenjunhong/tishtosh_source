package com.p683ss.android.ugc.aweme.profile.viewmodel;

import android.app.Activity;
import android.arch.lifecycle.C0209x;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.sdk.account.p844a.p846b.C13003d;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.user.C47538a;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel */
public final class MultiAccountViewModel extends C0209x {

    /* renamed from: a */
    public static final String f103548a = f103548a;

    /* renamed from: b */
    public static final String f103549b = f103549b;

    /* renamed from: c */
    public static final String f103550c = f103550c;

    /* renamed from: d */
    public static int f103551d;

    /* renamed from: e */
    public static long f103552e;

    /* renamed from: f */
    public static final C40595a f103553f = new C40595a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel$a */
    public static final class C40595a {
        private C40595a() {
        }

        /* renamed from: a */
        private static String m90022a() {
            return MultiAccountViewModel.f103548a;
        }

        /* renamed from: b */
        private static String m90024b() {
            return MultiAccountViewModel.f103549b;
        }

        /* renamed from: c */
        private static String m90025c() {
            return MultiAccountViewModel.f103550c;
        }

        public /* synthetic */ C40595a(C52707g gVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
            if (com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f103551d != com.p683ss.android.ugc.aweme.account.C20902b.m53242a().allUidList().size()) goto L_0x0059;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo82864a(boolean r7) {
            /*
                r6 = this;
                boolean r0 = com.p683ss.android.ugc.aweme.account.experiment.C20966a.m53329a()
                if (r0 != 0) goto L_0x0007
                return
            L_0x0007:
                long r0 = com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f103552e
                r2 = 0
                r4 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto L_0x0030
                android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                java.lang.String r1 = m90022a()
                android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r0, r1, r4)
                java.lang.String r1 = m90024b()
                int r1 = r0.getInt(r1, r4)
                com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f103551d = r1
                java.lang.String r1 = m90025c()
                long r0 = r0.getLong(r1, r2)
                com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f103552e = r0
            L_0x0030:
                if (r7 != 0) goto L_0x0059
                com.ss.android.ugc.aweme.IAccountUserService r7 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
                java.lang.String r0 = "AccountUserProxyService.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
                boolean r7 = r7.isLogin()
                if (r7 == 0) goto L_0x00b9
                long r0 = com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f103552e
                boolean r7 = com.p683ss.android.ugc.aweme.utils.C47685au.m103202a(r0)
                if (r7 == 0) goto L_0x0059
                int r7 = com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f103551d
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
                java.util.List r0 = r0.allUidList()
                int r0 = r0.size()
                if (r7 == r0) goto L_0x00b9
            L_0x0059:
                com.ss.android.ugc.aweme.IAccountUserService r7 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
                java.util.List r7 = r7.allUidList()
                int r7 = r7.size()
                com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f103551d = r7
                java.util.Calendar r7 = java.util.Calendar.getInstance()
                java.lang.String r0 = "Calendar.getInstance()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
                java.util.Date r7 = r7.getTime()
                java.lang.String r0 = "Calendar.getInstance().time"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
                long r0 = r7.getTime()
                com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f103552e = r0
                android.content.Context r7 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                java.lang.String r0 = m90022a()
                android.content.SharedPreferences r7 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r7, r0, r4)
                android.content.SharedPreferences$Editor r7 = r7.edit()
                java.lang.String r0 = m90024b()
                int r1 = com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f103551d
                android.content.SharedPreferences$Editor r7 = r7.putInt(r0, r1)
                java.lang.String r0 = m90025c()
                long r1 = com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f103552e
                android.content.SharedPreferences$Editor r7 = r7.putLong(r0, r1)
                r7.apply()
                java.lang.String r7 = "multi_account_status"
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "account_num"
                int r2 = com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f103551d
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r0)
            L_0x00b9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.C40595a.mo82864a(boolean):void");
        }

        /* renamed from: a */
        public static void m90023a(FragmentActivity fragmentActivity, String str, String str2) {
            C52711k.m112240b(str, "enterFrom");
            C52711k.m112240b(str2, "enterMethod");
            Activity activity = fragmentActivity;
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            C27965f.m66720a(activity, str, str2, C47661ab.m103163a().mo94972a("previous_uid", a.getCurUserId()).mo94973a("force_use_default_login_method", true).mo94973a("is_multi_account", true).mo94973a("need_auto_fill_latest_login_info", false).f120139a);
        }
    }

    /* renamed from: a */
    public static List<C47538a> m90020a() {
        List allUidList = C20902b.m53242a().allUidList();
        C52711k.m112236a((Object) allUidList, "AccountUserProxyService.get().allUidList()");
        Iterable<String> iterable = allUidList;
        Collection arrayList = new ArrayList();
        for (String findSignificanUserInfo : iterable) {
            C47538a findSignificanUserInfo2 = C20902b.m53242a().findSignificanUserInfo(findSignificanUserInfo);
            if (findSignificanUserInfo2 != null) {
                arrayList.add(findSignificanUserInfo2);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public static void m90021a(String str, Bundle bundle, C13003d dVar) {
        C52711k.m112240b(str, "uid");
        C20854a.m53162b().switchAccount(str, bundle, dVar);
    }
}
