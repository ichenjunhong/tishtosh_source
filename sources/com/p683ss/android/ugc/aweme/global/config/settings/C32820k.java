package com.p683ss.android.ugc.aweme.global.config.settings;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.k */
final /* synthetic */ class C32820k implements Callable {

    /* renamed from: a */
    private final String f85442a;

    /* renamed from: b */
    private final Throwable f85443b;

    /* renamed from: c */
    private final String f85444c;

    C32820k(String str, Throwable th, String str2) {
        this.f85442a = str;
        this.f85443b = th;
        this.f85444c = str2;
    }

    public final Object call() {
        return SettingsUtil.m75692a(this.f85442a, this.f85443b, this.f85444c);
    }
}
