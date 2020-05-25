package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.bullet.api.IBulletService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Bullet_apiModule_ProvideIBulletServiceFactory implements C52867d<IBulletService> {

    /* renamed from: a */
    private final _Bullet_apiModule f50188a;

    public final IBulletService get() {
        return provideInstance(this.f50188a);
    }

    public _Bullet_apiModule_ProvideIBulletServiceFactory(_Bullet_apiModule _bullet_apimodule) {
        this.f50188a = _bullet_apimodule;
    }

    public static _Bullet_apiModule_ProvideIBulletServiceFactory create(_Bullet_apiModule _bullet_apimodule) {
        return new _Bullet_apiModule_ProvideIBulletServiceFactory(_bullet_apimodule);
    }

    public static IBulletService provideInstance(_Bullet_apiModule _bullet_apimodule) {
        return proxyProvideIBulletService(_bullet_apimodule);
    }

    public static IBulletService proxyProvideIBulletService(_Bullet_apiModule _bullet_apimodule) {
        return (IBulletService) C52869f.m112471a(_bullet_apimodule.provideIBulletService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
