package com.p683ss.android.ugc.aweme.search;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22884a.C22885a;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22887c;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.p683ss.android.ugc.aweme.login.C27965f;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.search.f */
public final class C41419f {

    /* renamed from: a */
    public static final C41419f f104984a = new C41419f();

    /* renamed from: com.ss.android.ugc.aweme.search.f$a */
    public static final class C41420a implements C23505g {

        /* renamed from: a */
        final /* synthetic */ Keva f104985a;

        /* renamed from: b */
        final /* synthetic */ Boolean f104986b;

        /* renamed from: c */
        final /* synthetic */ Runnable f104987c;

        /* renamed from: d */
        final /* synthetic */ C41421b f104988d;

        /* renamed from: a */
        public final void mo46279a() {
            this.f104985a.storeBoolean("login", true);
            if (!C52711k.m112239a((Object) this.f104986b, (Object) Boolean.valueOf(true))) {
                this.f104987c.run();
            }
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
            if (C52711k.m112239a((Object) this.f104986b, (Object) Boolean.valueOf(true))) {
                C22885a.m56357b(this.f104988d);
            }
            this.f104987c.run();
        }

        C41420a(Keva keva, Boolean bool, Runnable runnable, C41421b bVar) {
            this.f104985a = keva;
            this.f104986b = bool;
            this.f104987c = runnable;
            this.f104988d = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.f$b */
    public static final class C41421b implements C22887c {

        /* renamed from: a */
        final /* synthetic */ Runnable f104989a;

        /* renamed from: com.ss.android.ugc.aweme.search.f$b$a */
        static final class C41422a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C41421b f104990a;

            C41422a(C41421b bVar) {
                this.f104990a = bVar;
            }

            public final void run() {
                this.f104990a.f104989a.run();
            }
        }

        /* renamed from: a */
        public final void mo47682a() {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin()) {
                C23727n.m58239a(new C41422a(this), 200);
            }
            C22885a.m56357b(this);
        }

        C41421b(Runnable runnable) {
            this.f104989a = runnable;
        }
    }

    private C41419f() {
    }

    /* renamed from: a */
    private final int m91233a() {
        int c = m91235c();
        if (c == 1 || c == 2) {
            return 5;
        }
        return 30;
    }

    /* renamed from: b */
    private final int m91234b() {
        int c = m91235c();
        if (c == 1 || c == 3) {
            return 3;
        }
        return 1;
    }

    /* renamed from: c */
    private static int m91235c() {
        return C10181b.m20511a().mo18168a(NeedLoginWhenSearch.class, true, "need_login_when_search", 31744, 0);
    }

    /* renamed from: a */
    public final void mo84097a(Fragment fragment, String str, String str2, Runnable runnable, boolean z, String str3, String str4, Boolean bool) {
        Fragment fragment2 = fragment;
        String str5 = str;
        String str6 = str2;
        Runnable runnable2 = runnable;
        String str7 = str3;
        String str8 = str4;
        Boolean bool2 = bool;
        C52711k.m112240b(fragment2, "fragment");
        C52711k.m112240b(str5, "enterFrom");
        C52711k.m112240b(str6, "enterMethod");
        C52711k.m112240b(runnable2, "callBack");
        C52711k.m112240b(str7, "keyword");
        C52711k.m112240b(str8, "type");
        if (m91235c() == 0) {
            runnable.run();
            return;
        }
        Keva repo = Keva.getRepo("need_login_when_search_repo");
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin()) {
            repo.storeBoolean("login", true);
        }
        if (repo.getBoolean("login", false)) {
            runnable.run();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - repo.getLong("last_search_time", -1);
        String a = C10181b.m20511a().mo18171a(NeedLoginWhenSearch2.class, true, "need_login_when_search_time", 31744, NeedLoginWhenSearch2.group0);
        C52711k.m112236a((Object) a, "ABManager.getInstance().…nWhenSearch2::class.java)");
        if (currentTimeMillis > Long.parseLong(a)) {
            repo.storeInt("search_count", 0);
        }
        int i = repo.getInt("search_count", 0);
        int i2 = repo.getInt("login_count", 0);
        if (z || i == m91233a()) {
            i++;
            repo.storeInt("search_count", i);
            repo.storeLong("last_search_time", System.currentTimeMillis());
        }
        if (i > m91233a()) {
            int i3 = i2 + 1;
            if (i3 <= m91234b()) {
                repo.storeInt("login_count", i3);
                repo.storeInt("search_count", 0);
                HashMap hashMap = new HashMap();
                Map map = hashMap;
                map.put("search_keyword", str7);
                map.put("search_notify_limit_cnt", String.valueOf(i3));
                map.put("search_type", str8);
                Bundle bundle = new Bundle();
                bundle.putSerializable("extra_param", hashMap);
                C41421b bVar = new C41421b(runnable2);
                StringBuilder sb = new StringBuilder("search_");
                sb.append(str5);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder("search_");
                sb3.append(str6);
                C27965f.m66725a(fragment2, sb2, sb3.toString(), bundle, (C23505g) new C41420a(repo, bool2, runnable2, bVar));
                if (C52711k.m112239a((Object) bool2, (Object) Boolean.valueOf(true))) {
                    C22885a.m56355a((C22887c) bVar);
                }
                return;
            }
        }
        runnable.run();
    }
}
