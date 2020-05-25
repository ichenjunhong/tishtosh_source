package com.p683ss.android.ugc.aweme.services.storage;

import com.p683ss.android.ugc.aweme.services.effect.EffectService;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.storage.StorageServiceImpl$checkStorageClean$1 */
final class StorageServiceImpl$checkStorageClean$1<V> implements Callable<TResult> {
    public static final StorageServiceImpl$checkStorageClean$1 INSTANCE = new StorageServiceImpl$checkStorageClean$1();

    StorageServiceImpl$checkStorageClean$1() {
    }

    public final void call() {
        EffectService instance = EffectService.getInstance();
        C52711k.m112236a((Object) instance, "EffectService.getInstance()");
        C47723bk.m103315c(instance.getCacheDir());
    }
}
