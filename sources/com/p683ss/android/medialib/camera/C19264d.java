package com.p683ss.android.medialib.camera;

import android.content.Context;
import android.graphics.Point;

/* renamed from: com.ss.android.medialib.camera.d */
public final class C19264d {

    /* renamed from: a */
    public static final String[] f53163a = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};

    /* renamed from: b */
    public Context f53164b;

    /* renamed from: c */
    public int f53165c = 1;

    /* renamed from: d */
    public int f53166d = 7;

    /* renamed from: e */
    public int f53167e = 30;

    /* renamed from: f */
    public int f53168f = 1280;

    /* renamed from: g */
    public int f53169g = 720;

    /* renamed from: h */
    public boolean f53170h;

    /* renamed from: i */
    public int f53171i = -1;

    /* renamed from: j */
    public int f53172j = -1;

    /* renamed from: k */
    public boolean f53173k;

    /* renamed from: l */
    public boolean f53174l;

    /* renamed from: m */
    public boolean f53175m;

    /* renamed from: n */
    public Point f53176n;

    /* renamed from: o */
    public int f53177o = 1;

    /* renamed from: p */
    public int f53178p = 1;

    /* renamed from: q */
    public byte f53179q = 1;

    /* renamed from: r */
    public String f53180r = "auto";

    /* renamed from: s */
    public boolean f53181s = true;

    /* renamed from: a */
    public final boolean mo39711a() {
        if (this.f53164b == null || this.f53168f <= 0 || this.f53169g <= 0 || this.f53166d <= 0 || this.f53167e < this.f53166d) {
            return false;
        }
        return true;
    }

    public C19264d(Context context, int i) {
        this.f53164b = context;
        this.f53165c = i;
    }
}
