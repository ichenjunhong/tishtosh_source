package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.x */
final /* synthetic */ class C41909x implements Callable {

    /* renamed from: a */
    private final String f106062a;

    /* renamed from: b */
    private final AwemeSettings f106063b;

    C41909x(String str, AwemeSettings awemeSettings) {
        this.f106062a = str;
        this.f106063b = awemeSettings;
    }

    public final Object call() {
        return C41715t.m91589a(this.f106062a, this.f106063b);
    }
}
