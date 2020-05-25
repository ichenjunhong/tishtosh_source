package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.io.OutputStream;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a */
public final class C42607a implements C42625b<Bitmap> {
    /* renamed from: a */
    public final C42675s<Bitmap> mo86840a(InputStream inputStream) {
        C52711k.m112240b(inputStream, "inputStream");
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        C52711k.m112236a((Object) decodeStream, "bitmap");
        return new C42675s<>(decodeStream.getWidth(), decodeStream.getHeight(), decodeStream);
    }

    /* renamed from: a */
    public final void mo86841a(OutputStream outputStream, C42675s<Bitmap> sVar) {
        C52711k.m112240b(outputStream, "outputStream");
        C52711k.m112240b(sVar, "cacheData");
        ((Bitmap) sVar.f107977c).compress(CompressFormat.PNG, 100, outputStream);
    }
}
