package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.C15524o;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.tg */
final class C16262tg implements adx<C15827de> {

    /* renamed from: a */
    private final /* synthetic */ boolean f45598a;

    /* renamed from: b */
    private final /* synthetic */ double f45599b;

    /* renamed from: c */
    private final /* synthetic */ boolean f45600c;

    /* renamed from: d */
    private final /* synthetic */ String f45601d;

    /* renamed from: e */
    private final /* synthetic */ int f45602e;

    /* renamed from: f */
    private final /* synthetic */ int f45603f;

    /* renamed from: g */
    private final /* synthetic */ C16256ta f45604g;

    C16262tg(C16256ta taVar, boolean z, double d, boolean z2, String str, int i, int i2) {
        this.f45604g = taVar;
        this.f45598a = z;
        this.f45599b = d;
        this.f45600c = z2;
        this.f45601d = str;
        this.f45602e = i;
        this.f45603f = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C15827de mo28738a(InputStream inputStream) {
        Bitmap bitmap;
        Options options = new Options();
        options.inDensity = (int) (this.f45599b * 160.0d);
        if (!this.f45600c) {
            options.inPreferredConfig = Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Exception e) {
            abv.m32793b("Error grabbing image.", e);
            bitmap = null;
        }
        if (bitmap == null) {
            this.f45604g.mo31397a(2, this.f45598a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (C15524o.m32297e() && abv.m32495a()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int allocationByteCount = bitmap.getAllocationByteCount();
            long j = uptimeMillis2 - uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            abv.m32494a(sb.toString());
        }
        C15827de deVar = new C15827de(new BitmapDrawable(Resources.getSystem(), bitmap), Uri.parse(this.f45601d), this.f45599b, this.f45602e, this.f45603f);
        return deVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28737a() {
        this.f45604g.mo31397a(2, this.f45598a);
        return null;
    }
}
