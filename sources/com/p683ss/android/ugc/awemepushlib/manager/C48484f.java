package com.p683ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.p683ss.android.ugc.awemepushlib.p2406a.C48428b;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.f */
final /* synthetic */ class C48484f implements C0011g {

    /* renamed from: a */
    private final Context f121903a;

    /* renamed from: b */
    private final Bitmap[] f121904b;

    /* renamed from: c */
    private final Bitmap[] f121905c;

    /* renamed from: d */
    private final int f121906d;

    /* renamed from: e */
    private final C48428b f121907e;

    C48484f(Context context, Bitmap[] bitmapArr, Bitmap[] bitmapArr2, int i, C48428b bVar) {
        this.f121903a = context;
        this.f121904b = bitmapArr;
        this.f121905c = bitmapArr2;
        this.f121906d = i;
        this.f121907e = bVar;
    }

    public final Object then(C0013i iVar) {
        return MessageShowHandler.m104889a(this.f121903a, this.f121904b[0], this.f121905c[0], this.f121906d, (Intent) null, this.f121907e);
    }
}
