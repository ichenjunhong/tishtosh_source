package com.p683ss.android.ugc.aweme.effect;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.io.File;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectJobService */
public class EffectJobService extends Service {
    /* renamed from: a */
    static final /* synthetic */ Object m68518a() throws Exception {
        try {
            AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().clearDraftEffectCache();
        } catch (Exception unused) {
        }
        return null;
    }

    public void onCreate() {
        String effectCacheDir = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().effectCacheDir();
        if (!TextUtils.isEmpty(effectCacheDir) && new File(effectCacheDir).list() != null && new File(effectCacheDir).list().length != 0) {
            C0013i.m18a(C29214s.f76521a, (Executor) C24076h.m58902c()).mo30c(new C29215t(this), C0013i.f25b);
        }
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
