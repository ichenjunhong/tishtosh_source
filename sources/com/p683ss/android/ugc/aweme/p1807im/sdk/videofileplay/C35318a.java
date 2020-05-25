package com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay;

import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.p1895a.C35321b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.a */
public final class C35318a {

    /* renamed from: a */
    public static final C35318a f90678a = new C35318a();

    /* renamed from: b */
    private static EncryptedVideoApi f90679b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.a$a */
    static final class C35319a<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C35319a f90680a = new C35319a();

        C35319a() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return null;
        }
    }

    private C35318a() {
    }

    /* renamed from: a */
    private static EncryptedVideoApi m79919a() {
        if (f90679b == null) {
            IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
            if (createIRetrofitServicebyMonsterPlugin != null) {
                f90679b = (EncryptedVideoApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit("https://aweme.snssdk.com/").create(EncryptedVideoApi.class);
            }
        }
        return f90679b;
    }

    /* renamed from: a */
    public static C0013i<C35321b> m79918a(String str) {
        C52711k.m112240b(str, "tosKey");
        if (m79919a() != null) {
            EncryptedVideoApi a = m79919a();
            if (a == null) {
                C52711k.m112234a();
            }
            return a.getVideoPlayUrl(str);
        }
        C0013i<C35321b> a2 = C0013i.m16a((Callable<TResult>) C35319a.f90680a);
        C52711k.m112236a((Object) a2, "Task.callInBackground { null }");
        return a2;
    }
}
