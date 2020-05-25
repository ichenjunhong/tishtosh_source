package com.p683ss.android.ugc.aweme.profile.edit;

import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lobby.C12322b;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12316a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.p683ss.android.ugc.trill.main.login.C50380a;
import com.p683ss.android.ugc.trill.main.login.C50381b;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.h */
public final class C39852h implements C9382a, C12316a {

    /* renamed from: e */
    private static final boolean f101680e = false;

    /* renamed from: a */
    public C39843c f101681a;

    /* renamed from: b */
    public FragmentActivity f101682b;

    /* renamed from: c */
    public C9381g f101683c = new C9381g(this);

    /* renamed from: d */
    public boolean f101684d;

    /* renamed from: a */
    public final void mo80955a(String str) {
        if (this.f101684d) {
            C26890h.m65011a("social_account_bind_failure", C23089d.m56640a().mo47829a("platform", "twitter").mo47829a("error_desc", str).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo23306a(AuthResult authResult) {
        String str;
        if (authResult.f32453a) {
            C39855i iVar = new C39855i(this, authResult.f32457e, authResult.f32462j.getString("username"), authResult.f32458f, authResult.f32459g);
            C47957v.m103771b(iVar);
            return;
        }
        C12322b bVar = authResult.f32455c;
        if (authResult.f32455c != null) {
            str = authResult.f32455c.getMessage();
        } else {
            str = "";
        }
        if (bVar != null && !TextUtils.equals(str, "Authorization failed, request was canceled.") && !TextUtils.equals(str, "Failed to get authorization, bundle incomplete")) {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : bVar.getStackTrace()) {
                sb.append(stackTraceElement.toString());
            }
            sb.append(bVar.getMessage());
            String sb2 = sb.toString();
            String str2 = "twitter";
            String str3 = "";
            if (C50381b.m108666a(C11010c.m22280a())) {
                C23131p.m57776a("aweme_thirdparty_login_error_rate", 0, C50380a.m108664a(str2).mo47824a("app_language", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage()).mo47824a("platform", str2).mo47824a("errorDesc", String.valueOf(sb2)).mo47824a("errorUrl", str3).mo47825b());
            }
            C32458a.m75148a((Throwable) bVar);
            mo80955a(bVar.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.obj
            boolean r0 = r0 instanceof java.lang.Exception
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0095
            java.lang.Object r0 = r6.obj
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r6.obj
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.profile.UserResponse
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r6.obj
            com.ss.android.ugc.aweme.profile.UserResponse r0 = (com.p683ss.android.ugc.aweme.profile.UserResponse) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            goto L_0x001f
        L_0x001b:
            java.lang.Object r0 = r6.obj
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.p683ss.android.ugc.aweme.profile.model.User) r0
        L_0x001f:
            int r6 = r6.what
            r3 = 112(0x70, float:1.57E-43)
            if (r6 != r3) goto L_0x0095
            com.ss.android.ugc.aweme.IAccountUserService r6 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            r6.updateCurUser(r0)
            boolean r6 = r5.f101684d
            if (r6 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.profile.edit.c r6 = r5.f101681a
            java.lang.String r0 = r0.getTwitterName()
            r6.mo80947d(r0)
            java.lang.String r6 = "social_account_bind_success"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "platform"
            java.lang.String r4 = "twitter"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r0)
            goto L_0x0065
        L_0x004d:
            com.ss.android.ugc.aweme.profile.edit.c r6 = r5.f101681a
            r6.mo80947d(r2)
            java.lang.String r6 = "social_account_unbind_success"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "platform"
            java.lang.String r4 = "twitter"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r0)
        L_0x0065:
            java.lang.String r6 = "twitter"
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            boolean r0 = com.p683ss.android.ugc.trill.main.login.C50381b.m108666a(r0)
            if (r0 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.app.f.c r0 = com.p683ss.android.ugc.trill.main.login.C50380a.m108664a(r6)
            java.lang.String r3 = "app_language"
            com.ss.android.ugc.aweme.language.I18nManagerService r4 = com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.language.I18nManagerService r4 = (com.p683ss.android.ugc.aweme.language.I18nManagerService) r4
            java.lang.String r4 = r4.getAppLanguage()
            com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47824a(r3, r4)
            java.lang.String r3 = "platform"
            com.ss.android.ugc.aweme.app.f.c r6 = r0.mo47824a(r3, r6)
            org.json.JSONObject r6 = r6.mo47825b()
            java.lang.String r0 = "aweme_thirdparty_login_error_rate"
            com.p683ss.android.ugc.aweme.app.C23131p.m57776a(r0, r1, r6)
            goto L_0x0096
        L_0x0095:
            r1 = 0
        L_0x0096:
            if (r1 != 0) goto L_0x00a2
            java.lang.String r6 = "Failed to retrieve data from TikTok server"
            r5.mo80955a(r6)
            com.ss.android.ugc.aweme.profile.edit.c r6 = r5.f101681a
            r6.mo80947d(r2)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.edit.C39852h.handleMsg(android.os.Message):void");
    }

    public C39852h(FragmentActivity fragmentActivity, C39843c cVar) {
        this.f101681a = cVar;
        this.f101682b = fragmentActivity;
    }
}
