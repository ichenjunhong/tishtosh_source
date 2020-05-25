package com.p683ss.android.ugc.aweme.profile.adapter;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.m */
final /* synthetic */ class C39752m implements Callable {

    /* renamed from: a */
    private final C39744e f101482a;

    /* renamed from: b */
    private final Bitmap f101483b;

    C39752m(C39744e eVar, Bitmap bitmap) {
        this.f101482a = eVar;
        this.f101483b = bitmap;
    }

    public final Object call() {
        C39744e eVar = this.f101482a;
        Bitmap bitmap = this.f101483b;
        if (!(eVar.f101470b == null || bitmap == null)) {
            eVar.f101470b.setImageBitmap(bitmap);
        }
        return null;
    }
}
