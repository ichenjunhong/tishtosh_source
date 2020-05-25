package com.p683ss.android.ugc.aweme.requesttask.p2116a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.C22692c;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.p1807im.C33206p.C33207a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.a.c */
public final class C41241c implements C35889c {

    /* renamed from: a */
    private int f104685a = 1;

    /* renamed from: com.ss.android.ugc.aweme.requesttask.a.c$a */
    public static final class C41242a implements C22692c {

        /* renamed from: a */
        final /* synthetic */ C41241c f104686a;

        /* renamed from: b */
        final /* synthetic */ int f104687b;

        /* renamed from: a */
        public final void mo47081a(Exception exc) {
            C52711k.m112240b(exc, "e");
            C41241c.m90970a(this.f104687b, (C41686c) null);
        }

        C41242a(C41241c cVar, int i) {
            this.f104686a = cVar;
            this.f104687b = i;
        }

        /* renamed from: a */
        public final void mo47080a(C41686c cVar, boolean z) {
            C52711k.m112240b(cVar, "settings");
            if (this.f104687b == 1 && !z && TimeLockRuler.sLastContentFilterState && C22714d.m55951b(cVar) == C22687a.CHILD && cVar.f105479V == 0) {
                TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                if (userSetting != null) {
                    userSetting.setContentFilterOn(false);
                    TimeLockRuler.applyUserSetting(userSetting);
                }
                C22722h.m55978a();
            }
            C33207a.m76310a().mo70458a(Integer.valueOf(cVar.f105498n));
            C41241c.m90970a(this.f104687b, cVar);
        }
    }

    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.IDLE;
    }

    public C41241c(int i) {
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        int i = this.f104685a;
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        if (a.isLogin()) {
            ParentalPlatformManager.m55915a((C22692c) new C41242a(this, i));
        } else {
            m90970a(i, (C41686c) null);
        }
    }

    /* renamed from: a */
    protected static void m90970a(int i, C41686c cVar) {
        String str;
        String str2;
        String str3;
        if (i == 1) {
            if (TimeLockRuler.isTimeLockOn()) {
                str = "on";
            } else {
                str = "off";
            }
            if (TimeLockRuler.isContentFilterOn()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            if (C22714d.f60914a.mo47119b() == C22687a.CHILD || C22714d.f60914a.mo47119b() == C22687a.PARENT) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            C26890h.m65011a("time_lock_status", C23089d.m56640a().mo47829a("status", str).f61491a);
            C26890h.m65011a("teen_mode_status", C23089d.m56640a().mo47829a("status", str2).f61491a);
            C26890h.m65011a("kid_platform_status", C23089d.m56640a().mo47829a("status", str3).f61491a);
        }
    }
}
