package com.p683ss.android.ugc.aweme.app.application.task;

import android.content.Context;
import android.webkit.URLUtil;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.android.account.token.C18500a;
import com.p683ss.android.account.token.C18501b;
import com.p683ss.android.account.token.C18508f;
import com.p683ss.android.account.token.C18509g;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.net.C37817y;
import com.p683ss.android.ugc.aweme.net.interceptor.TokenSdkCommonParamsInterceptorTTNet;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.utils.C47907fz;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.app.application.task.TokenSdkTask */
public class TokenSdkTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    private String getAppType() {
        int m = C11010c.m22292m();
        if (m == 5 || m == 4 || m == 3) {
            return "lite";
        }
        return C31483a.f82385b;
    }

    private void doRealTask() {
        if (C18920g.m46048a(C11010c.m22280a())) {
            C18501b bVar = new C18501b();
            bVar.f50987f = 600000;
            boolean z = true;
            bVar.f50986e = true;
            bVar.f50984c = new C18509g() {
                /* renamed from: a */
                public final void mo37769a(String str, JSONObject jSONObject) {
                    C26890h.m65012a(str, jSONObject);
                }

                /* renamed from: a */
                public final void mo37770a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                    boolean z;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!C20854a.m53167g().isLogin() || currentTimeMillis - C47907fz.f120503a < 300000) {
                        z = false;
                    } else {
                        C47907fz.f120503a = currentTimeMillis;
                        z = true;
                    }
                    if (z) {
                        C23131p.m57780a(str, (JSONObject) null, jSONObject);
                    }
                }
            };
            String str = TutorialVideoApiManager.f96873a;
            if (URLUtil.isNetworkUrl(str)) {
                if (URLUtil.isHttpUrl(str)) {
                    str = str.replace(WebKitApi.SCHEME_HTTP, WebKitApi.SCHEME_HTTPS);
                }
                bVar.f50982a = str;
                String a = C18508f.m44797a(str);
                if (a != null) {
                    bVar.f50983b.add(a);
                }
            }
            List asList = Arrays.asList(new String[]{"tiktokv.com", "tiktok.com", "byteoversea.com"});
            if (asList != null) {
                bVar.f50983b.addAll(asList);
            }
            C13333g.m26865a((C12727a) new TokenSdkCommonParamsInterceptorTTNet(getAppType()));
            C18500a.m44769a(C11010c.m22280a(), bVar);
            if (C37817y.f96284a == null) {
                if (C23859b.m58575b().mo49467b(C11010c.m22280a(), "awe_network_x_token_disabled", 0) != 0) {
                    z = false;
                }
                C37817y.f96284a = Boolean.valueOf(z);
            }
            C18500a.m44771a(C37817y.f96284a.booleanValue());
            C0013i.m12a(600).mo20a(C23024a.f61363a, (Executor) C0013i.f24a);
        }
    }

    static final /* synthetic */ Object lambda$doRealTask$0$TokenSdkTask(C0013i iVar) throws Exception {
        C32458a.m75144a("TokenSdkTask finished, start to fetch IM token");
        C33200k.m76279d().ensureIMState();
        return null;
    }

    public void run(Context context) {
        C32458a.m75144a("TokenSdkTask");
        doRealTask();
    }
}
