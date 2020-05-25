package com.p683ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.photo.f */
final /* synthetic */ class C38675f implements Callable {

    /* renamed from: a */
    private final ImageView f98368a;

    /* renamed from: b */
    private final Bitmap f98369b;

    /* renamed from: c */
    private final C52670a f98370c;

    C38675f(ImageView imageView, Bitmap bitmap, C52670a aVar) {
        this.f98368a = imageView;
        this.f98369b = bitmap;
        this.f98370c = aVar;
    }

    public final Object call() {
        ImageView imageView = this.f98368a;
        Bitmap bitmap = this.f98369b;
        C52670a aVar = this.f98370c;
        imageView.setImageBitmap(bitmap);
        aVar.invoke();
        return null;
    }
}
