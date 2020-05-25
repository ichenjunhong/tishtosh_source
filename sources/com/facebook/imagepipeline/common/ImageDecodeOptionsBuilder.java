package com.facebook.imagepipeline.common;

import android.graphics.Bitmap.Config;
import com.facebook.imagepipeline.p956a.p958b.C13916b;
import com.facebook.imagepipeline.p967g.C14030c;
import com.facebook.imagepipeline.p978r.C14249a;

public class ImageDecodeOptionsBuilder {

    /* renamed from: a */
    public int f36371a = 100;

    /* renamed from: b */
    public boolean f36372b;

    /* renamed from: c */
    public int f36373c = C13916b.f36309b;

    /* renamed from: d */
    public boolean f36374d;

    /* renamed from: e */
    public boolean f36375e;

    /* renamed from: f */
    public boolean f36376f;

    /* renamed from: g */
    public boolean f36377g;

    /* renamed from: h */
    public Config f36378h = Config.ARGB_8888;

    /* renamed from: i */
    public C14030c f36379i;

    /* renamed from: j */
    public C14249a f36380j;

    /* renamed from: k */
    public Object f36381k;

    /* renamed from: a */
    public final C13950b mo26114a() {
        return new C13950b(this);
    }

    /* renamed from: a */
    public final ImageDecodeOptionsBuilder mo26112a(int i) {
        this.f36373c = i;
        return this;
    }

    public ImageDecodeOptionsBuilder setBitmapConfig(Config config) {
        this.f36378h = config;
        return this;
    }

    /* renamed from: a */
    public final ImageDecodeOptionsBuilder mo26113a(boolean z) {
        this.f36375e = z;
        return this;
    }
}
