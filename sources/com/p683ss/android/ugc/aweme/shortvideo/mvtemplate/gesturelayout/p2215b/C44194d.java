package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2215b;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.d */
public final class C44194d {

    /* renamed from: a */
    public static final C44194d f111964a = new C44194d();

    /* renamed from: b */
    private static final C44197g f111965b;

    private C44194d() {
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f111965b = new C44196f();
        } else {
            f111965b = new C44195e();
        }
    }

    /* renamed from: a */
    public static PropertyValuesHolder m96837a(Property<?, PointF> property, Path path) {
        return f111965b.mo90106a(property, path);
    }
}
