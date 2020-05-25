package com.p683ss.android.ugc.aweme.protection.gradientpunish;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p879t.p882c.C13248c;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.gradientpunish.a */
public final class C40878a {

    /* renamed from: a */
    public static Dialog f104051a;

    /* renamed from: b */
    public static final C23543g f104052b = new C23543g(C11010c.m22280a(), "gradient_punish_warning");

    /* renamed from: c */
    public static final C40878a f104053c = new C40878a();

    /* renamed from: com.ss.android.ugc.aweme.protection.gradientpunish.a$a */
    public static final class C40879a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f104054a;

        /* renamed from: b */
        final /* synthetic */ String f104055b;

        public C40879a(Activity activity, String str) {
            this.f104054a = activity;
            this.f104055b = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C40878a.m90439a((Context) this.f104054a);
            C26890h.m65011a("enter_violation_record", C23089d.m56640a().mo47829a("enter_method", "dialog").mo47829a("enter_from", this.f104055b).f61491a);
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            String curUserId = a.getCurUserId();
            C52711k.m112236a((Object) curUserId, "userId");
            C40878a.m90440a(curUserId, true);
            C40878a aVar = C40878a.f104053c;
            Dialog dialog = C40878a.f104051a;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    private C40878a() {
    }

    /* renamed from: b */
    public static final GradientPunishWarning m90443b() {
        try {
            return (GradientPunishWarning) C10193n.m20607a().mo18202a(GradientPunishWarningSettings.class, "gradient_punish_warning", C10181b.m20511a().mo18175c().getGradientPunishWarning(), "com.ss.android.ugc.aweme.protection.gradientpunish.GradientPunishWarning", GradientPunishWarning.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m90441a() {
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        if (a.isLogin()) {
            IAccountUserService a2 = C20902b.m53242a();
            C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
            String curUserId = a2.getCurUserId();
            C52711k.m112236a((Object) curUserId, "AccountUserProxyService.get().curUserId");
            if (m90442a(curUserId)) {
                IAccountUserService a3 = C20902b.m53242a();
                C52711k.m112236a((Object) a3, "AccountUserProxyService.get()");
                String curUserId2 = a3.getCurUserId();
                C52711k.m112236a((Object) curUserId2, "AccountUserProxyService.get().curUserId");
                if (!m90445c(curUserId2, false)) {
                    C47718bf.m103288a(new C40880b());
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final void m90439a(Context context) {
        String str;
        C52711k.m112240b(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview");
        String str2 = "url";
        GradientPunishWarning b = m90443b();
        if (b != null) {
            str = b.getDetailUrl();
        } else {
            str = null;
        }
        buildRoute.withParam(str2, str).withParam("hide_nav_bar", true).open();
    }

    /* renamed from: a */
    private static boolean m90442a(String str) {
        C52711k.m112240b(str, "uid");
        GradientPunishWarning b = m90443b();
        if (b == null || b.getWarnType() == 0) {
            m90440a(str, false);
            return false;
        } else if (b.getWarnType() < 3 || C13248c.m26638a(b.getDialogMessage()) || C13248c.m26638a(b.getDialogButton()) || C13248c.m26638a(b.getDetailUrl())) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static final void m90440a(String str, boolean z) {
        C52711k.m112240b(str, "userId");
        C23543g gVar = f104052b;
        StringBuilder sb = new StringBuilder("has_click_warning_dialog_");
        sb.append(str);
        gVar.mo48710b(sb.toString(), z);
    }

    /* renamed from: b */
    public static final void m90444b(String str, boolean z) {
        C52711k.m112240b(str, "userId");
        C23543g gVar = f104052b;
        StringBuilder sb = new StringBuilder("has_click_warning_bubble_");
        sb.append(str);
        gVar.mo48710b(sb.toString(), z);
    }

    /* renamed from: c */
    private static boolean m90445c(String str, boolean z) {
        C52711k.m112240b(str, "userId");
        C23543g gVar = f104052b;
        StringBuilder sb = new StringBuilder("has_click_warning_dialog_");
        sb.append(str);
        return gVar.mo48705a(sb.toString(), false);
    }
}
