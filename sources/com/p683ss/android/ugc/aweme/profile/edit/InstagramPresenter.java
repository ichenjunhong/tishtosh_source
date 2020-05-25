package com.p683ss.android.ugc.aweme.profile.edit;

import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12316a;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.InstagramPresenter */
public final class InstagramPresenter implements C9382a, C12316a {

    /* renamed from: a */
    static final String f101641a;

    /* renamed from: h */
    private static final boolean f101642h = false;

    /* renamed from: b */
    C39842b f101643b;

    /* renamed from: c */
    public FragmentActivity f101644c;

    /* renamed from: d */
    public C9381g f101645d;

    /* renamed from: e */
    public IAccountUserService f101646e;

    /* renamed from: f */
    InstagramApi f101647f = ((InstagramApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(InstagramApi.class));

    /* renamed from: g */
    public boolean f101648g;

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.InstagramPresenter$InstagramApi */
    public interface InstagramApi {
        @C12718t
        @C12705g
        C17832m<String> doPost(@C12699af String str, @C12704f Map<String, String> map);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f61282b);
        sb.append("/aweme/v1/instagram/bind/");
        f101641a = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo80919a(String str) {
        if (this.f101648g) {
            C26890h.m65011a("social_account_bind_failure", C23089d.m56640a().mo47829a("platform", "instagram").mo47829a("error_desc", str).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo23306a(AuthResult authResult) {
        String str;
        if (!authResult.f32453a) {
            this.f101643b.mo80945c(null);
            if (authResult.f32455c != null) {
                str = authResult.f32455c.getMessage();
            } else {
                str = "Lobby failed and no error info available";
            }
            mo80919a(str);
            return;
        }
        String string = authResult.f32462j.getString("code");
        if (!TextUtils.isEmpty(string)) {
            C47957v.m103771b(new C39846f(this, string));
            return;
        }
        this.f101643b.mo80945c(null);
        mo80919a("Authorization code is missing");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.obj
            boolean r0 = r0 instanceof java.lang.Exception
            r1 = 1
            if (r0 != 0) goto L_0x0076
            java.lang.Object r0 = r5.obj
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r5.obj
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.profile.UserResponse
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r5.obj
            com.ss.android.ugc.aweme.profile.UserResponse r0 = (com.p683ss.android.ugc.aweme.profile.UserResponse) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            goto L_0x001e
        L_0x001a:
            java.lang.Object r0 = r5.obj
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.p683ss.android.ugc.aweme.profile.model.User) r0
        L_0x001e:
            com.ss.android.ugc.aweme.profile.edit.b r2 = r4.f101643b
            java.lang.String r3 = r0.getInsId()
            r2.mo80945c(r3)
            int r2 = r5.what
            r3 = 6
            if (r2 != r3) goto L_0x0057
            com.ss.android.ugc.aweme.IAccountUserService r5 = r4.f101646e
            java.lang.String r0 = r0.getInsId()
            r5.updateInsId(r0)
            com.ss.android.ugc.aweme.base.c.c r5 = new com.ss.android.ugc.aweme.base.c.c
            com.ss.android.ugc.aweme.IAccountUserService r0 = r4.f101646e
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            r5.<init>(r0)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r5)
            java.lang.String r5 = "social_account_unbind_success"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "platform"
            java.lang.String r3 = "instagram"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r0)
            goto L_0x0077
        L_0x0057:
            int r5 = r5.what
            r2 = 112(0x70, float:1.57E-43)
            if (r5 != r2) goto L_0x0076
            com.ss.android.ugc.aweme.IAccountUserService r5 = r4.f101646e
            r5.updateCurUser(r0)
            java.lang.String r5 = "social_account_bind_success"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "platform"
            java.lang.String r3 = "instagram"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r0)
            goto L_0x0077
        L_0x0076:
            r1 = 0
        L_0x0077:
            if (r1 != 0) goto L_0x0084
            java.lang.String r5 = "Failed to retrieve data from TikTok server"
            r4.mo80919a(r5)
            com.ss.android.ugc.aweme.profile.edit.b r5 = r4.f101643b
            r0 = 0
            r5.mo80945c(r0)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.edit.InstagramPresenter.handleMsg(android.os.Message):void");
    }

    public InstagramPresenter(FragmentActivity fragmentActivity, C39842b bVar) {
        this.f101644c = fragmentActivity;
        this.f101643b = bVar;
        this.f101645d = new C9381g(this);
        this.f101646e = C20854a.m53167g();
    }
}
