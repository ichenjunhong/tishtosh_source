package com.p683ss.android.ugc.aweme.global.config.settings;

import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.j */
final /* synthetic */ class C32819j implements Callable {

    /* renamed from: a */
    private final String f85438a;

    /* renamed from: b */
    private final Throwable f85439b;

    /* renamed from: c */
    private final String f85440c;

    /* renamed from: d */
    private final IESSettings f85441d;

    C32819j(String str, Throwable th, String str2, IESSettings iESSettings) {
        this.f85438a = str;
        this.f85439b = th;
        this.f85440c = str2;
        this.f85441d = iESSettings;
    }

    public final Object call() {
        return SettingsUtil.m75693a(this.f85438a, this.f85439b, this.f85440c, this.f85441d);
    }
}
