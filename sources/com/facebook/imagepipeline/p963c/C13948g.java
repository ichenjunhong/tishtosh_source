package com.facebook.imagepipeline.p963c;

import android.graphics.Bitmap;
import com.facebook.common.p924h.C13718c;

/* renamed from: com.facebook.imagepipeline.c.g */
public final class C13948g implements C13718c<Bitmap> {

    /* renamed from: a */
    private static C13948g f36370a;

    private C13948g() {
    }

    /* renamed from: a */
    public static C13948g m28419a() {
        if (f36370a == null) {
            f36370a = new C13948g();
        }
        return f36370a;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25600a(Object obj) {
        ((Bitmap) obj).recycle();
    }
}
