package com.p683ss.android.ugc.aweme.profile.p2085c;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.support.p030v4.app.C0654k;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.profile.experiment.ProfileGuideTestMode;
import com.p683ss.android.ugc.aweme.profile.experiment.ProfileGuideTimeInterval;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2085c.C39828e.C39829a;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.c.d */
public final class C39826d {

    /* renamed from: a */
    public static final C39826d f101632a = new C39826d();

    /* renamed from: com.ss.android.ugc.aweme.profile.c.d$a */
    static final class C39827a<T> implements C1710e<String> {

        /* renamed from: a */
        final /* synthetic */ String f101633a;

        /* renamed from: b */
        final /* synthetic */ int f101634b;

        C39827a(String str, int i) {
            this.f101633a = str;
            this.f101634b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            C39826d.m88566a(this.f101633a, this.f101634b);
        }
    }

    private C39826d() {
    }

    /* renamed from: b */
    private static void m88571b() {
        C39829a.m88577a().mo80915c();
    }

    /* renamed from: a */
    public static final boolean m88568a() {
        if (!ProfileGuideTestMode.m88626a() && !ProfileGuideTimeInterval.m88627a()) {
            return false;
        }
        if (C39829a.m88577a().mo80913a()) {
            if (ProfileGuideTestMode.m88626a()) {
                m88566a("头像用户名引导 - 已经展示超过 5 次了，因为测试模式才展示", 0);
            } else {
                m88566a("头像用户名引导 - 已经展示过 5 次了", 1);
                return false;
            }
        }
        if (!C39829a.m88577a().mo80914b()) {
            return true;
        }
        m88566a("头像用户名引导 - 频控时间内不再展示", 1);
        return false;
    }

    /* renamed from: a */
    private static boolean m88569a(C0654k kVar) {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        if (curUser == null) {
            return false;
        }
        if (curUser.avatarUpdateReminder()) {
            C39815b.f101598g.mo80899a(kVar, null);
            m88571b();
            return true;
        } else if (!curUser.nicknameUpdateReminder()) {
            return false;
        } else {
            C39819c.f101614e.mo80907a(kVar, null);
            m88571b();
            return true;
        }
    }

    /* renamed from: b */
    private static boolean m88572b(C0654k kVar, Bundle bundle) {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        if (curUser == null) {
            return false;
        }
        if (curUser.avatarUpdateReminder() || !curUser.nicknameUpdateReminder()) {
            C39815b.f101598g.mo80899a(kVar, bundle);
        } else {
            C39819c.f101614e.mo80907a(kVar, null);
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m88573c(C0654k kVar, Bundle bundle) {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        if (curUser == null) {
            return false;
        }
        if (curUser.avatarUpdateReminder()) {
            C39815b.f101598g.mo80899a(kVar, bundle);
            return true;
        } else if (!curUser.nicknameUpdateReminder()) {
            return false;
        } else {
            C39819c.f101614e.mo80907a(kVar, bundle);
            return true;
        }
    }

    /* renamed from: a */
    public static final void m88566a(String str, int i) {
        C52711k.m112240b(str, "msg");
        if ((ProfileGuideTestMode.m88626a() || ProfileGuideTimeInterval.m88627a()) && TextUtils.equals(C11010c.m22295p(), "local_test")) {
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
            if (C52711k.m112239a((Object) currentThread, (Object) mainLooper.getThread())) {
                Toast makeText = Toast.makeText(C11010c.m22280a(), str, i);
                if (VERSION.SDK_INT == 25) {
                    C47905fy.m103630a(makeText);
                }
                makeText.show();
                return;
            }
            C2201v.m6614b("").mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C39827a<Object>(str, i));
        }
    }

    /* renamed from: a */
    public static final boolean m88570a(C0654k kVar, Bundle bundle) {
        Object obj;
        if (kVar == null) {
            return false;
        }
        String str = null;
        if (bundle != null) {
            obj = bundle.getString("show_type", "");
        } else {
            obj = null;
        }
        if (C52711k.m112239a(obj, (Object) "show_type_after_login_or_bind")) {
            return m88573c(kVar, bundle);
        }
        if (bundle != null) {
            str = bundle.getString("show_type", "");
        }
        if (C52711k.m112239a((Object) str, (Object) "show_type_profile_post_guide")) {
            return m88572b(kVar, bundle);
        }
        if (!m88568a()) {
            return false;
        }
        return m88569a(kVar);
    }
}
