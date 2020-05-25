package com.p683ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.graphics.Bitmap;
import com.p683ss.android.ugc.awemepushlib.p2406a.C48428b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.e */
final /* synthetic */ class C48483e implements Callable {

    /* renamed from: a */
    private final Bitmap[] f121898a;

    /* renamed from: b */
    private final C48428b f121899b;

    /* renamed from: c */
    private final Context f121900c;

    /* renamed from: d */
    private final Bitmap[] f121901d;

    /* renamed from: e */
    private final int f121902e;

    C48483e(Bitmap[] bitmapArr, C48428b bVar, Context context, Bitmap[] bitmapArr2, int i) {
        this.f121898a = bitmapArr;
        this.f121899b = bVar;
        this.f121900c = context;
        this.f121901d = bitmapArr2;
        this.f121902e = i;
    }

    public final Object call() {
        return MessageShowHandler.m104884a(this.f121898a, this.f121899b, this.f121900c, this.f121901d, this.f121902e);
    }
}
