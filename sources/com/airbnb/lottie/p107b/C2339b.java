package com.airbnb.lottie.p107b;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.C2337b;
import com.airbnb.lottie.C2472h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.airbnb.lottie.b.b */
public final class C2339b {

    /* renamed from: c */
    private static final Object f7286c = new Object();

    /* renamed from: a */
    public final Context f7287a;

    /* renamed from: b */
    public C2337b f7288b;

    /* renamed from: d */
    private String f7289d;

    /* renamed from: e */
    private final Map<String, C2472h> f7290e;

    /* renamed from: a */
    public final void mo6734a() {
        synchronized (f7286c) {
            for (Entry value : this.f7290e.entrySet()) {
                C2472h hVar = (C2472h) value.getValue();
                Bitmap bitmap = hVar.f7635f;
                if (bitmap != null) {
                    bitmap.recycle();
                    hVar.f7635f = null;
                }
            }
        }
    }

    /* renamed from: a */
    public final Bitmap mo6733a(String str) {
        C2472h hVar = (C2472h) this.f7290e.get(str);
        if (hVar == null) {
            return null;
        }
        Bitmap bitmap = hVar.f7635f;
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f7288b != null) {
            Bitmap a = this.f7288b.mo6732a(hVar);
            if (a != null) {
                m6965a(str, a);
            }
            return a;
        }
        String str2 = hVar.f7633d;
        Options options = new Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f7289d)) {
                    AssetManager assets = this.f7287a.getAssets();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f7289d);
                    sb.append(str2);
                    return m6965a(str, BitmapFactory.decodeStream(assets.open(sb.toString()), null, options));
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException unused) {
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                return m6965a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private Bitmap m6965a(String str, Bitmap bitmap) {
        synchronized (f7286c) {
            ((C2472h) this.f7290e.get(str)).f7635f = bitmap;
        }
        return bitmap;
    }

    public C2339b(Callback callback, String str, C2337b bVar, Map<String, C2472h> map) {
        this.f7289d = str;
        if (!TextUtils.isEmpty(str) && this.f7289d.charAt(this.f7289d.length() - 1) != '/') {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7289d);
            sb.append('/');
            this.f7289d = sb.toString();
        }
        if (!(callback instanceof View)) {
            this.f7290e = new HashMap();
            this.f7287a = null;
            return;
        }
        this.f7287a = ((View) callback).getContext();
        this.f7290e = map;
        this.f7288b = bVar;
    }
}
