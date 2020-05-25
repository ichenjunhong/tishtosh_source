package com.p683ss.android.ugc.aweme.antiaddic.lock;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.C22733e;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.SetTimeLockActivity;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.TeenagerModeAppealActivity;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.TimeUnlockActivity;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.C22770h.C22773a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23705a;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23706b;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23707c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.protection.api.p2098b.C40857a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.p2387a.C47659c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.h */
public final class C22722h {

    /* renamed from: a */
    public static boolean f60933a;

    /* renamed from: b */
    private static String f60934b;

    /* renamed from: c */
    public static String m55986c() {
        return f60934b;
    }

    /* renamed from: b */
    public static C23705a<Boolean> m55984b() {
        return C23707c.m58177a().mo49142b(TimeUnlockActivity.f60942b, Boolean.class);
    }

    /* renamed from: a */
    public static void m55978a() {
        C20854a.m53163c().saveSharedAccount(null);
        Context g = C11016e.m22312g();
        if (g == null) {
            g = C11010c.m22280a();
        }
        if (g instanceof MainActivity) {
            ((MainActivity) g).finish();
        }
        g.startActivity(C47659c.m103160a(g).setFlags(268468224));
    }

    /* renamed from: a */
    private static void m55979a(FragmentActivity fragmentActivity) {
        int e = fragmentActivity.getSupportFragmentManager().mo2237e();
        for (int i = 0; i < e; i++) {
            fragmentActivity.getSupportFragmentManager().mo2235c();
        }
    }

    /* renamed from: a */
    public static void m55980a(FragmentActivity fragmentActivity, int i) {
        m55979a(fragmentActivity);
        ((SetTimeLockActivity) fragmentActivity).mo47173a(C22733e.m56033c(i));
    }

    /* renamed from: b */
    public static void m55985b(FragmentActivity fragmentActivity, int i) {
        m55979a(fragmentActivity);
        ((SetTimeLockActivity) fragmentActivity).mo47173a(C22733e.m56030a(i));
    }

    /* renamed from: a */
    public static boolean m55983a(C23706b<Boolean> bVar, String str) {
        Activity g = C11016e.m22312g();
        if (!(g instanceof FragmentActivity) || g == null || !(g instanceof AmeActivity) || (g instanceof C40857a) || (g instanceof CrossPlatformActivity)) {
            return false;
        }
        Intent intent = new Intent(g, TimeUnlockActivity.class);
        if (bVar != null) {
            C23707c.m58177a().mo49140a(TimeUnlockActivity.f60942b, Boolean.class).mo49138a((FragmentActivity) g, bVar);
            if (((Boolean) C23183v.m56778a().mo47912h().mo47782d()).booleanValue()) {
                intent = new Intent(g, TeenagerModeAppealActivity.class);
                intent.putExtra("type", 2);
            }
            intent.putExtra("from", str);
        } else {
            C26890h.m65011a("time_lock_block_show", C23089d.m56640a().mo47829a("enter_from", "time_lock_block").f61491a);
        }
        g.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public static void m55982a(String str, String str2) {
        String str3;
        Integer num;
        String str4 = (String) SharePrefCache.inst().getTeenagerProtectionScheme().mo47782d();
        if (!TextUtils.isEmpty(str4)) {
            C41302w a = C41302w.m91042a();
            Uri parse = Uri.parse(str4);
            Builder builder = new Builder();
            builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath());
            for (String str5 : parse.getQueryParameterNames()) {
                if (TextUtils.equals("url", str5) || TextUtils.equals("rn_schema", str5)) {
                    Builder buildUpon = Uri.parse(parse.getQueryParameter(str5)).buildUpon();
                    buildUpon.appendQueryParameter("enter_from", str);
                    buildUpon.appendQueryParameter("type", str2);
                    String str6 = "minor_control_type";
                    TeenageModeSetting teenageModeSetting = C22721g.f60927a;
                    if (teenageModeSetting != null) {
                        num = Integer.valueOf(teenageModeSetting.getMinorControlType());
                    } else {
                        num = null;
                    }
                    buildUpon.appendQueryParameter(str6, String.valueOf(num));
                    str3 = buildUpon.toString();
                } else {
                    str3 = parse.getQueryParameter(str5);
                }
                builder.appendQueryParameter(str5, str3);
            }
            a.mo83861a(builder.build().toString());
        }
    }

    /* renamed from: a */
    public static void m55981a(FragmentActivity fragmentActivity, int i, TimeLockUserSetting timeLockUserSetting) {
        if (i == 0) {
            C10691a.m21533a((Context) fragmentActivity, (int) R.string.dyx).mo19066a();
            timeLockUserSetting.setTimeLockOn(true);
            C22773a aVar = (C22773a) ((TimeLockOptionViewModel) C0214z.m440a(fragmentActivity).mo359a(TimeLockOptionViewModel.class)).f61036a.getValue();
            if (aVar == null || aVar.f61019b == 0) {
                throw new RuntimeException("@dongzesong");
            }
            timeLockUserSetting.setLockTimeInMin(aVar.f61019b);
            C26890h.m65011a("open_time_lock_finish", C23089d.m56640a().mo47826a("set_time", aVar.f61019b).f61491a);
        } else {
            timeLockUserSetting.setContentFilterOn(true);
            C23183v.m56778a().mo47921q().mo47776a(Boolean.valueOf(true));
            C26890h.m65011a("open_teen_mode_finish", C23089d.m56640a().mo47826a("is_login", C20902b.m53242a().isLogin() ? 1 : 0).mo47829a("enter_from", f60934b).f61491a);
            new Handler(Looper.myLooper()).post(new Runnable() {
                public final void run() {
                    C22722h.m55978a();
                    C10691a.m21533a(C11010c.m22280a(), (int) R.string.d8g).mo19066a();
                }
            });
        }
        TimeLockRuler.applyUserSetting(timeLockUserSetting);
        m55980a(fragmentActivity, i);
    }
}
