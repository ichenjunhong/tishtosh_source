package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.ugc.aweme.setting.y */
final /* synthetic */ class C41910y implements Callable {

    /* renamed from: a */
    private final AtomicReference f106064a;

    /* renamed from: b */
    private final AtomicReference f106065b;

    /* renamed from: c */
    private final AtomicReference f106066c;

    C41910y(AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3) {
        this.f106064a = atomicReference;
        this.f106065b = atomicReference2;
        this.f106066c = atomicReference3;
    }

    public final Object call() {
        SettingsManagerProxy.inst().notifySettingsChange((Throwable) this.f106064a.get(), (IESSettings) this.f106065b.get(), (String) this.f106066c.get());
        return null;
    }
}
