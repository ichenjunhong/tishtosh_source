package com.p683ss.android.ugc.aweme.requestcombine;

import com.p683ss.android.ugc.aweme.antiaddic.C22692c;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1807im.C33206p.C33207a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.e */
public final class C41234e {

    /* renamed from: a */
    public static final C41235a f104680a = new C41235a(null);

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.e$a */
    public static final class C41235a {

        /* renamed from: com.ss.android.ugc.aweme.requestcombine.e$a$a */
        public static final class C41236a implements C22692c {

            /* renamed from: a */
            final /* synthetic */ int f104681a;

            public C41236a(int i) {
                this.f104681a = i;
            }

            /* renamed from: a */
            public final void mo47081a(Exception exc) {
                C52711k.m112240b(exc, "e");
                C41235a.m90963a(this.f104681a, null);
            }

            /* renamed from: a */
            public final void mo47080a(C41686c cVar, boolean z) {
                C52711k.m112240b(cVar, "settings");
                if (this.f104681a == 1 && !z && TimeLockRuler.sLastContentFilterState && C22714d.m55951b(cVar) == C22687a.CHILD && cVar.f105479V == 0) {
                    TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                    if (userSetting != null) {
                        userSetting.setContentFilterOn(false);
                        TimeLockRuler.applyUserSetting(userSetting);
                    }
                    C22722h.m55978a();
                }
                C33207a.m76310a().mo70458a(Integer.valueOf(cVar.f105498n));
                C41235a.m90963a(this.f104681a, cVar);
            }
        }

        private C41235a() {
        }

        public /* synthetic */ C41235a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m90963a(int i, C41686c cVar) {
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
}
