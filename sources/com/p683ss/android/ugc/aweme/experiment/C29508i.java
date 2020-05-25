package com.p683ss.android.ugc.aweme.experiment;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.profile.C39869f;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52820l;

/* renamed from: com.ss.android.ugc.aweme.experiment.i */
public final class C29508i implements C39869f {

    /* renamed from: a */
    public static final C23543g f77294a = new C23543g(C11010c.m22280a(), "change_username");

    /* renamed from: b */
    public static final C29508i f77295b = new C29508i();

    private C29508i() {
    }

    /* renamed from: b */
    public final boolean mo59619b() {
        if (!m69649c()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m69649c() {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        String e = C47915gg.m103656e(g.getCurUser());
        C52711k.m112236a((Object) e, "UserUtils.getHandle(user)");
        return m69647a(e);
    }

    /* renamed from: a */
    public final boolean mo59618a() {
        return C10181b.m20511a().mo18172a(TTNickNameToUsernameExperiment.class, true, "nickname_to_username_on_video_player", 31744, false);
    }

    /* renamed from: a */
    public static final boolean m69647a(String str) {
        C52711k.m112240b(str, "userName");
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            return true;
        }
        C52820l lVar = new C52820l("^(?![0-9]+$)[a-z0-9_.]{1,23}[a-z0-9_]$");
        try {
            Object a = C10193n.m20607a().mo18202a(ChangeUsernameRegexp.class, "handle_settings", C10181b.m20511a().mo18175c().getHandleSettings(), "com.ss.android.ugc.aweme.experiment.RegexpString", RegexpString.class);
            C52711k.m112236a(a, "SettingsManager.getInsta…ernameRegexp::class.java)");
            String regexp = ((RegexpString) a).getRegexp();
            if (regexp != null) {
                lVar = new C52820l(regexp);
            }
        } catch (Throwable unused) {
            lVar = new C52820l("^(?![0-9]+$)[a-z0-9_.]{1,23}[a-z0-9_]$");
        }
        return lVar.matches(charSequence);
    }

    /* renamed from: a */
    public static final long m69646a(String str, long j) {
        C52711k.m112240b(str, "userId");
        C23543g gVar = f77294a;
        StringBuilder sb = new StringBuilder("last_time_show_publish_success_window_");
        sb.append(str);
        return gVar.mo48700a(sb.toString(), 0);
    }

    /* renamed from: b */
    public static final void m69648b(String str, long j) {
        C52711k.m112240b(str, "userId");
        C23543g gVar = f77294a;
        StringBuilder sb = new StringBuilder("last_time_show_publish_success_window_");
        sb.append(str);
        gVar.mo48708b(sb.toString(), j);
    }
}
