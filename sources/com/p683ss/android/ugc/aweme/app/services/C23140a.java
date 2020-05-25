package com.p683ss.android.ugc.aweme.app.services;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.common.config.AppConfig;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.newmedia.C19557h;
import com.p683ss.android.newmedia.p1202ui.webview.SSWebView;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.friends.api.FriendApi;
import com.p683ss.android.ugc.aweme.main.service.C36679a;
import com.p683ss.android.ugc.aweme.profile.api.C39791d;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.util.C47611a;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.services.a */
public final class C23140a implements C36679a {

    /* renamed from: a */
    public static final C23141a f61571a = new C23141a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.services.a$a */
    public static final class C23141a {

        /* renamed from: com.ss.android.ugc.aweme.app.services.a$a$a */
        static final class C23142a<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

            /* renamed from: a */
            final /* synthetic */ String f61572a;

            /* renamed from: b */
            final /* synthetic */ Keva f61573b;

            C23142a(String str, Keva keva) {
                this.f61572a = str;
                this.f61573b = keva;
            }

            public final /* synthetic */ Object then(C0013i iVar) {
                C52711k.m112236a((Object) iVar, "it");
                if (iVar.mo26b() && !iVar.mo33d() && !iVar.mo31c()) {
                    this.f61573b.storeLong(this.f61572a, System.currentTimeMillis());
                }
                return null;
            }
        }

        private C23141a() {
        }

        public /* synthetic */ C23141a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m56731a(String str, String str2, String str3) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin() && !TextUtils.isEmpty(str) && ((!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) && C23153b.m56740a(C11010c.m22280a()))) {
                IAccountUserService g2 = C20854a.m53167g();
                C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
                String str4 = g2.getCurUserId().toString();
                StringBuilder sb = new StringBuilder("token_upload_history_");
                sb.append(str4);
                Keva repo = Keva.getRepo(sb.toString());
                if (System.currentTimeMillis() - repo.getLong(str, 0) >= C10181b.m20511a().mo18169a(FbUploadTokenTime.class, true, "need_upload_fb_time", 31744, (long) FbUploadTokenTime.group0)) {
                    repo.storeLong(str, System.currentTimeMillis());
                    ((FriendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(FriendApi.class)).uploadAccessToken(str, str2, str3).mo19a((C0011g<TResult, TContinuationResult>) new C23142a<TResult,TContinuationResult>(str, repo));
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo47860a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C18845b.f52040e);
        sb.append(C39791d.m88506a(true));
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo47861a(String str) {
        C47611a.m103070b("Login", null, null);
        C47611a.m103066a("login", "product", str);
    }

    /* renamed from: a */
    public final void mo47862a(String str, WebView webView) {
        if (webView != null && !C9431p.m18664a(str)) {
            boolean a = C19547d.m47842a(str);
            Context context = webView.getContext();
            if (!(webView instanceof SSWebView) && a && context != null) {
                str = AppConfig.getInstance(context).filterUrlOnUIThread(str);
            }
            C19557h.m47858a(webView, str);
        }
    }

    /* renamed from: a */
    public final void mo47863a(String str, String str2, String str3) {
        C23141a.m56731a(str, str2, str3);
    }
}
