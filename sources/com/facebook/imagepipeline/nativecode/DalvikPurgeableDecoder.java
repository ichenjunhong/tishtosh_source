package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.Build.VERSION;
import com.C2240a;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13696m;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.common.C13954f;
import com.facebook.imagepipeline.memory.C14070b;
import com.facebook.imagepipeline.memory.C14072c;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p972l.C14056f;
import com.facebook.imageutils.C14250a;
import java.util.Locale;

public abstract class DalvikPurgeableDecoder implements C14056f {
    protected static final byte[] EOI = {-1, -39};
    private final C14070b mUnpooledBitmapsCounter = C14072c.m28789a();

    private static native void nativePinBitmap(Bitmap bitmap);

    /* access modifiers changed from: protected */
    public abstract Bitmap decodeByteArrayAsPurgeable(C13715a<C13709h> aVar, Options options);

    /* access modifiers changed from: protected */
    public abstract Bitmap decodeJPEGByteArrayAsPurgeable(C13715a<C13709h> aVar, int i, Options options);

    protected DalvikPurgeableDecoder() {
    }

    static {
        C14222a.m29163a();
    }

    public C13715a<Bitmap> pinBitmap(Bitmap bitmap) {
        C13689i.m27652a(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.mUnpooledBitmapsCounter.mo26327a(bitmap)) {
                return C13715a.m27747a(bitmap, this.mUnpooledBitmapsCounter.f36779a);
            }
            int a = C14250a.m29204a(bitmap);
            bitmap.recycle();
            throw new C13954f(C2240a.m6773a(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(a), Integer.valueOf(this.mUnpooledBitmapsCounter.mo26326a()), Long.valueOf(this.mUnpooledBitmapsCounter.mo26328b()), Integer.valueOf(this.mUnpooledBitmapsCounter.mo26330c()), Integer.valueOf(this.mUnpooledBitmapsCounter.mo26331d())}));
        } catch (Exception e) {
            bitmap.recycle();
            throw C13696m.m27667b(e);
        }
    }

    public static boolean endsWithEOI(C13715a<C13709h> aVar, int i) {
        C13709h hVar = (C13709h) aVar.mo25630a();
        if (i >= 2 && hVar.mo25607a(i - 2) == -1 && hVar.mo25607a(i - 1) == -39) {
            return true;
        }
        return false;
    }

    public static Options getBitmapFactoryOptions(int i, Config config) {
        Options options = new Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    public C13715a<Bitmap> decodeFromEncodedImage(C14044e eVar, Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(eVar, config, rect, false);
    }

    public C13715a<Bitmap> decodeJPEGFromEncodedImage(C14044e eVar, Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i, false);
    }

    public C13715a<Bitmap> decodeFromEncodedImageWithColorSpace(C14044e eVar, Config config, Rect rect, boolean z) {
        Options bitmapFactoryOptions = getBitmapFactoryOptions(eVar.f36707h, config);
        C13715a b = eVar.mo26263b();
        C13689i.m27652a(b);
        try {
            return pinBitmap(decodeByteArrayAsPurgeable(b, bitmapFactoryOptions));
        } finally {
            C13715a.m27752c(b);
        }
    }

    public C13715a<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(C14044e eVar, Config config, Rect rect, int i, boolean z) {
        Options bitmapFactoryOptions = getBitmapFactoryOptions(eVar.f36707h, config);
        C13715a b = eVar.mo26263b();
        C13689i.m27652a(b);
        try {
            return pinBitmap(decodeJPEGByteArrayAsPurgeable(b, i, bitmapFactoryOptions));
        } finally {
            C13715a.m27752c(b);
        }
    }
}
