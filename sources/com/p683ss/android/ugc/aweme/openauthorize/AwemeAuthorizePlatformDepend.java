package com.p683ss.android.ugc.aweme.openauthorize;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.sdk.account.bdplatform.p854a.C13039b;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizePlatformDepend */
public final class AwemeAuthorizePlatformDepend implements C13039b {

    /* renamed from: a */
    private AuthorizeApi f97874a = ((AuthorizeApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(AuthorizeApi.class));

    /* renamed from: b */
    private ThreadPoolExecutor f97875b;

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizePlatformDepend$AuthorizeApi */
    public interface AuthorizeApi {
        @C12706h
        C17832m<String> doGet(@C12699af String str);

        @C12718t
        @C12705g
        C17832m<String> doPost(@C12699af String str, @C12704f Map<String, String> map);
    }

    /* renamed from: c */
    public final String mo24704c() {
        return "api.tiktokv.com";
    }

    /* renamed from: d */
    public final String mo24705d() {
        return "open-api.tiktok.com";
    }

    /* renamed from: a */
    public final boolean mo24702a() {
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        return a.isLogin();
    }

    /* renamed from: b */
    public final boolean mo24703b() {
        return C38471a.m85812a(AwemeApplication.m56199a());
    }

    /* renamed from: a */
    public final void mo24701a(Runnable runnable) {
        this.f97875b.execute(runnable);
    }

    /* renamed from: a */
    public final String mo24699a(String str) {
        Object obj = this.f97874a.doGet(str).get();
        C52711k.m112236a(obj, "mAuthorizeApi.doGet(p0).get()");
        return (String) obj;
    }

    public AwemeAuthorizePlatformDepend(C38480d dVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 5, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.f97875b = threadPoolExecutor;
    }

    /* renamed from: a */
    public final String mo24700a(String str, Map<String, String> map) {
        Object obj = this.f97874a.doPost(str, map).get();
        C52711k.m112236a(obj, "mAuthorizeApi.doPost(p0, p1).get()");
        return (String) obj;
    }
}
