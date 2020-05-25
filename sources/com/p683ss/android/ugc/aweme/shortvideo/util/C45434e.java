package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.e */
final /* synthetic */ class C45434e implements Callable {

    /* renamed from: a */
    private final Context f114822a;

    /* renamed from: b */
    private final String f114823b;

    C45434e(Context context, String str) {
        this.f114822a = context;
        this.f114823b = str;
    }

    public final Object call() {
        C45371a b = C45371a.m98923b(this.f114822a, this.f114823b);
        if (C45371a.f114736f.get(b.f114742e) != null) {
            C45371a.f114736f.remove(b.f114742e);
        }
        return null;
    }
}
