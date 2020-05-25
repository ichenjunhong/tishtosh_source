package com.p683ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.bytedance.router.interceptor.IInterceptor;
import com.p683ss.android.ugc.aweme.account.C20854a;
import java.util.ArrayList;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.router.a */
public final class C41266a implements IInterceptor {

    /* renamed from: a */
    public static final C41267a f104704a = new C41267a(null);

    /* renamed from: b */
    private final ArrayList<String> f104705b = C52575l.m112103d("mobile/phoneNumber", "password/change", "emailBind");

    /* renamed from: com.ss.android.ugc.aweme.router.a$a */
    public static final class C41267a {
        private C41267a() {
        }

        public /* synthetic */ C41267a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.router.a$b */
    static final class C41268b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f104706a;

        /* renamed from: b */
        final /* synthetic */ String f104707b;

        /* renamed from: c */
        final /* synthetic */ Bundle f104708c;

        C41268b(Context context, String str, Bundle bundle) {
            this.f104706a = context;
            this.f104707b = str;
            this.f104708c = bundle;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C20854a.m53165e().changeEmail((Activity) this.f104706a, this.f104707b, this.f104708c, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x000e
            android.net.Uri r1 = r6.getUri()
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.getHost()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            if (r6 == 0) goto L_0x001c
            android.net.Uri r6 = r6.getUri()
            if (r6 == 0) goto L_0x001c
            java.lang.String r6 = r6.getPath()
            goto L_0x001d
        L_0x001c:
            r6 = r0
        L_0x001d:
            java.lang.String r6 = p2628d.p2639f.p2641b.C52711k.m112231a(r1, r6)
            java.util.ArrayList<java.lang.String> r1 = r5.f104705b
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "accountUrl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r4 = 2
            boolean r2 = p2628d.p2650m.C52830p.m112411b(r6, r2, r3, r4, r0)
            if (r2 == 0) goto L_0x0027
            r6 = 1
            return r6
        L_0x0042:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.router.C41266a.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r12, com.bytedance.router.RouteIntent r13) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L_0x01a6
            r0 = 0
            if (r13 == 0) goto L_0x0013
            android.net.Uri r2 = r13.getUri()
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = r2.getHost()
            goto L_0x0014
        L_0x0013:
            r2 = r0
        L_0x0014:
            if (r13 == 0) goto L_0x0021
            android.net.Uri r3 = r13.getUri()
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = r3.getPath()
            goto L_0x0022
        L_0x0021:
            r3 = r0
        L_0x0022:
            java.lang.String r2 = p2628d.p2639f.p2641b.C52711k.m112231a(r2, r3)
            java.lang.String r3 = "mobile/phoneNumber"
            r4 = 2
            boolean r2 = p2628d.p2650m.C52830p.m112411b(r2, r3, r1, r4, r0)
            r3 = 1
            if (r2 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.ak r13 = com.p683ss.android.ugc.aweme.account.C20854a.m53165e()
            android.app.Activity r12 = (android.app.Activity) r12
            java.lang.String r1 = ""
            r13.bindMobile(r12, r1, r0, r0)
            goto L_0x01a5
        L_0x003d:
            if (r13 == 0) goto L_0x004a
            android.net.Uri r2 = r13.getUri()
            if (r2 == 0) goto L_0x004a
            java.lang.String r2 = r2.getHost()
            goto L_0x004b
        L_0x004a:
            r2 = r0
        L_0x004b:
            if (r13 == 0) goto L_0x0058
            android.net.Uri r5 = r13.getUri()
            if (r5 == 0) goto L_0x0058
            java.lang.String r5 = r5.getPath()
            goto L_0x0059
        L_0x0058:
            r5 = r0
        L_0x0059:
            java.lang.String r2 = p2628d.p2639f.p2641b.C52711k.m112231a(r2, r5)
            java.lang.String r5 = "password/change"
            boolean r2 = p2628d.p2650m.C52830p.m112411b(r2, r5, r1, r4, r0)
            if (r2 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.aw r5 = com.p683ss.android.ugc.aweme.account.C20854a.m53166f()
            r6 = r12
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r9 = 0
            r10 = 0
            r5.changePassword(r6, r7, r8, r9, r10)
            goto L_0x01a5
        L_0x0077:
            if (r13 == 0) goto L_0x0084
            android.net.Uri r2 = r13.getUri()
            if (r2 == 0) goto L_0x0084
            java.lang.String r2 = r2.getHost()
            goto L_0x0085
        L_0x0084:
            r2 = r0
        L_0x0085:
            if (r13 == 0) goto L_0x0092
            android.net.Uri r5 = r13.getUri()
            if (r5 == 0) goto L_0x0092
            java.lang.String r5 = r5.getPath()
            goto L_0x0093
        L_0x0092:
            r5 = r0
        L_0x0093:
            java.lang.String r2 = p2628d.p2639f.p2641b.C52711k.m112231a(r2, r5)
            java.lang.String r5 = "emailBind"
            boolean r2 = p2628d.p2650m.C52830p.m112411b(r2, r5, r1, r4, r0)
            if (r2 == 0) goto L_0x01a5
            com.ss.android.ugc.aweme.framework.services.IUserService r2 = com.p683ss.android.ugc.aweme.services.BaseUserService.getBaseUserService_Monster()
            java.lang.String r5 = "ServiceManager.get().get…IUserService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            com.ss.android.ugc.aweme.framework.services.IUserService r2 = (com.p683ss.android.ugc.aweme.framework.services.IUserService) r2
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getCurrentUser()
            if (r13 == 0) goto L_0x00bd
            android.content.Intent r5 = r13.getExtra()
            if (r5 == 0) goto L_0x00bd
            java.lang.String r6 = "enableSwitchPhone"
            java.lang.String r5 = r5.getStringExtra(r6)
            goto L_0x00be
        L_0x00bd:
            r5 = r0
        L_0x00be:
            java.lang.String r6 = "1"
            boolean r4 = p2628d.p2650m.C52830p.m112407a(r5, r6, r1, r4, r0)
            if (r4 == 0) goto L_0x00d3
            java.lang.String r4 = "curUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            boolean r2 = r2.isPhoneBinded()
            if (r2 != 0) goto L_0x00d3
            r2 = 1
            goto L_0x00d4
        L_0x00d3:
            r2 = 0
        L_0x00d4:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            if (r13 == 0) goto L_0x00f5
            android.content.Intent r5 = r13.getExtra()
            if (r5 == 0) goto L_0x00f5
            java.lang.String r5 = "needUsePhone"
            r4.putBoolean(r5, r2)
            java.lang.String r2 = "do_not_use_old_style"
            android.content.Intent r5 = r13.getExtra()
            java.lang.String r6 = "do_not_use_old_style"
            boolean r5 = r5.getBooleanExtra(r6, r1)
            r4.putBoolean(r2, r5)
        L_0x00f5:
            if (r13 == 0) goto L_0x0104
            android.content.Intent r13 = r13.getExtra()
            if (r13 == 0) goto L_0x0104
            java.lang.String r2 = "enterFrom"
            java.lang.String r13 = r13.getStringExtra(r2)
            goto L_0x0105
        L_0x0104:
            r13 = r0
        L_0x0105:
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r5 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getCurUser()
            if (r2 == 0) goto L_0x0119
            java.lang.String r2 = r2.getEmail()
            goto L_0x011a
        L_0x0119:
            r2 = r0
        L_0x011a:
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x018c
            com.ss.android.ugc.aweme.IAccountUserService r6 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r7 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            com.ss.android.ugc.aweme.profile.model.User r6 = r6.getCurUser()
            java.lang.String r7 = "AccountProxyService.userService().curUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            boolean r6 = r6.isEmailVerified()
            if (r6 == 0) goto L_0x018c
            com.bytedance.ies.dmt.ui.b.a$a r5 = new com.bytedance.ies.dmt.ui.b.a$a
            r5.<init>(r12)
            r6 = 2132543370(0x7f1c078a, float:2.0739871E38)
            com.bytedance.ies.dmt.ui.b.a$a r5 = r5.mo18885a(r6)
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = "Locale.US"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            r7 = 2132543369(0x7f1c0789, float:2.073987E38)
            java.lang.String r7 = r12.getString(r7)
            java.lang.String r8 = "context.getString(R.stri…irm_change_email_message)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r1] = r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r3)
            java.lang.String r1 = com.C2240a.m6773a(r6, r7, r1)
            java.lang.String r2 = "java.lang.String.format(locale, format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.bytedance.ies.dmt.ui.b.a$a r1 = r5.mo18902b(r1)
            r2 = 2132546995(0x7f1c15b3, float:2.0747224E38)
            com.ss.android.ugc.aweme.router.a$b r5 = new com.ss.android.ugc.aweme.router.a$b
            r5.<init>(r12, r13, r4)
            android.content.DialogInterface$OnClickListener r5 = (android.content.DialogInterface.OnClickListener) r5
            com.bytedance.ies.dmt.ui.b.a$a r12 = r1.mo18886a(r2, r5)
            r13 = 2132542529(0x7f1c0441, float:2.0738165E38)
            com.bytedance.ies.dmt.ui.b.a$a r12 = r12.mo18900b(r13, r0)
            com.bytedance.ies.dmt.ui.b.a r12 = r12.mo18897a()
            r12.mo18882b()
            goto L_0x01a5
        L_0x018c:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x019c
            com.ss.android.ugc.aweme.ak r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53165e()
            android.app.Activity r12 = (android.app.Activity) r12
            r1.verifyEmail(r12, r13, r4, r0)
            goto L_0x01a5
        L_0x019c:
            com.ss.android.ugc.aweme.ak r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53165e()
            android.app.Activity r12 = (android.app.Activity) r12
            r1.bindEmail(r12, r13, r4, r0)
        L_0x01a5:
            return r3
        L_0x01a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.router.C41266a.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
