package com.p683ss.android.ugc.aweme.setting.p2139h;

import com.p683ss.android.ugc.aweme.setting.api.BlackApiManager;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.h.b */
final /* synthetic */ class C41611b implements Callable {

    /* renamed from: a */
    private final C41610a f105337a;

    /* renamed from: b */
    private final int f105338b;

    /* renamed from: c */
    private final int f105339c;

    /* renamed from: d */
    private final int f105340d;

    C41611b(C41610a aVar, int i, int i2, int i3) {
        this.f105337a = aVar;
        this.f105338b = i;
        this.f105339c = i2;
        this.f105340d = i3;
    }

    public final Object call() {
        C41610a aVar = this.f105337a;
        int i = this.f105338b;
        int i2 = this.f105339c;
        int i3 = this.f105340d;
        int i4 = aVar.f105335a;
        return BlackApiManager.m91374a(i, 10);
    }
}
