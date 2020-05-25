package com.p683ss.android.ugc.aweme.feed.unread;

import com.bytedance.retrofit2.p831b.C12706h;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadSunRoofApi */
public interface UnReadSunRoofApi {

    /* renamed from: a */
    public static final C31157a f81559a = C31157a.f81560a;

    /* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadSunRoofApi$a */
    public static final class C31157a {

        /* renamed from: a */
        static final /* synthetic */ C31157a f81560a = new C31157a();

        /* renamed from: b */
        private static UnReadSunRoofApi f81561b;

        private C31157a() {
        }

        /* renamed from: a */
        public final C31168b mo63991a() {
            try {
                if (f81561b == null) {
                    f81561b = (UnReadSunRoofApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(UnReadSunRoofApi.class);
                }
                UnReadSunRoofApi unReadSunRoofApi = f81561b;
                if (unReadSunRoofApi == null) {
                    C52711k.m112234a();
                }
                Object obj = unReadSunRoofApi.getUnReadSunRoofList().get();
                C52711k.m112236a(obj, "create().getUnReadSunRoofList().get()");
                return (C31168b) obj;
            } catch (ExecutionException e) {
                RuntimeException propagateCompatibleException = RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
                C52711k.m112236a((Object) propagateCompatibleException, "ServiceManager.get().get…ateCompatibleException(e)");
                throw propagateCompatibleException;
            }
        }
    }

    @C12706h(mo23876a = "/aweme/v1/familiar/unread/user/list/")
    C17832m<C31168b> getUnReadSunRoofList();
}
