package com.p683ss.android.ugc.aweme.account.login;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.C13021f;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12994f;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13136m;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13140q;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13141r;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22144s;
import com.p683ss.android.ugc.aweme.account.base.C20916a;
import com.p683ss.android.ugc.aweme.account.login.bean.C21122a;
import com.p683ss.android.ugc.aweme.account.login.bean.EmailExistBean;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21092aa;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21120y;
import com.p683ss.android.ugc.aweme.account.net.ResetPwsResult;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import java.util.HashMap;
import java.util.Map;
import p001a.C0013i;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53073d;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.account.login.MusLoginManager */
public final class MusLoginManager {

    /* renamed from: a */
    public MusLoginApi f57209a = ((MusLoginApi) ((IRetrofitService) C23826bi.m58450a(IRetrofitService.class)).createNewRetrofit(C22144s.f59706a).create(MusLoginApi.class));

    /* renamed from: b */
    public C13011d f57210b = C13081d.m26312a(C23826bi.m58460b());

    /* renamed from: c */
    private C13021f f57211c = C13081d.m26313b(C23826bi.m58460b());

    /* renamed from: com.ss.android.ugc.aweme.account.login.MusLoginManager$MusLoginApi */
    public interface MusLoginApi {
        @C53075f(mo110603a = "/aweme/v1/passport/email-registered/")
        C17832m<EmailExistBean> emailExist(@C53089t(mo110619a = "mix_mode") String str, @C53089t(mo110619a = "email") String str2);

        @C53084o(mo110612a = "/aweme/v1/passport/reset-password-via-phone/")
        @C53074e
        C17832m<ResetPwsResult> resetPassword(@C53072c(mo110600a = "bind_token") String str, @C53072c(mo110600a = "uid") String str2, @C53072c(mo110600a = "new_pwd") String str3);

        @C53084o(mo110612a = "/aweme/v1/user/info/sync/")
        @C53074e
        C0013i<C21122a> syncUserInfo(@C53073d Map<String, String> map);

        @C53075f(mo110603a = "/aweme/v1/ftc/user/mode/")
        C0013i<C21122a> uploadUserMode(@C53089t(mo110619a = "user_mode") int i);

        @C53075f(mo110603a = "/aweme/v1/register/check/login/name/")
        C17832m<String> usernameVerify(@C53089t(mo110619a = "login_name") String str);
    }

    /* renamed from: a */
    public final C0013i<C21122a> mo45040a(HashMap<String, String> hashMap) {
        return this.f57209a.syncUserInfo(hashMap);
    }

    /* renamed from: a */
    public static String m53448a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C9395d.m18573a(bytes, 0, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public final void mo45041a(int i, C13136m mVar) {
        this.f57210b.mo24604a(i, mVar);
    }

    /* renamed from: a */
    public final void mo45043a(String str, C17824h<String> hVar) {
        C17825i.m43740a(this.f57209a.usernameVerify(str), hVar, C20916a.f56902a);
    }

    /* renamed from: a */
    public final void mo45044a(String str, C21092aa aaVar) {
        this.f57210b.mo24620a(str, (String) null, (C13140q) aaVar);
    }

    /* renamed from: b */
    public final void mo45048b(String str, String str2, String str3, C13141r rVar) {
        this.f57210b.mo24643b(str, str2, str3, rVar);
    }

    /* renamed from: c */
    public final void mo45050c(String str, String str2, String str3, C13141r rVar) {
        this.f57210b.mo24645c(str, str2, str3, rVar);
    }

    /* renamed from: a */
    public final void mo45042a(int i, String str, boolean z, C21120y yVar) {
        String str2 = str;
        C21120y yVar2 = yVar;
        this.f57210b.mo24612a("", "", i, 0, "", -1, z ? 1 : 0, str2, "", yVar2);
    }

    /* renamed from: a */
    public final void mo45045a(String str, String str2, String str3, C13141r rVar) {
        this.f57210b.mo24630a(str, str2, str3, rVar);
    }

    /* renamed from: b */
    public final void mo45049b(String str, String str2, String str3, String str4, C13141r rVar) {
        this.f57210b.mo24644b(str, str2, str3, str4, rVar);
    }

    /* renamed from: a */
    public final void mo45046a(String str, String str2, String str3, String str4, C13141r rVar) {
        this.f57210b.mo24637a(str, str2, str3, str4, rVar);
    }

    /* renamed from: a */
    public final void mo45047a(String str, String str2, String str3, String str4, String str5, String str6, C12989a<C12994f> aVar) {
        this.f57211c.mo24650a(str6, str5, str3, str, str2, 0, null, aVar);
    }
}
