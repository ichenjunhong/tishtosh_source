package com.p683ss.android.ugc.vcd;

import android.content.Context;
import com.p683ss.android.ugc.aweme.C23771be.C23772a.C23773a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.vcd.l */
public final class C50513l {

    /* renamed from: a */
    public static final C50513l f126627a = new C50513l();

    /* renamed from: b */
    private static boolean f126628b;

    private C50513l() {
    }

    /* renamed from: b */
    private static boolean m108856b() {
        User curUser = C50500a.f126595a.mo98408a().getCurUser();
        if (curUser != null) {
            String registerFrom = curUser.getRegisterFrom();
            if (registerFrom != null) {
                return C52830p.m112406a(registerFrom, "hotsoon", true);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m108855a() {
        if (!m108856b()) {
            return true;
        }
        User curUser = C50500a.f126595a.mo98408a().getCurUser();
        if (curUser == null) {
            return false;
        }
        if (curUser.getAwemeHotsoonAuthRelation() > 0 || f126628b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m108854a(Context context, C23773a aVar) {
        C52711k.m112240b(aVar, "callback");
        C50514m.m108857a(context, aVar);
    }
}
