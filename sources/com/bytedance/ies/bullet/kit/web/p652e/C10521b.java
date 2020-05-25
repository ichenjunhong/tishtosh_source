package com.bytedance.ies.bullet.kit.web.p652e;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.bullet.kit.web.p652e.C10521b;
import com.bytedance.ies.bullet.kit.web.p652e.C10522c;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10579b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.kit.web.e.b */
public abstract class C10521b<T extends C10521b<T, S>, S extends C10522c> extends C10579b<T, S> {
    public C10521b(Uri uri) {
        C52711k.m112240b(uri, "uri");
        Builder buildUpon = uri.buildUpon();
        C52711k.m112236a((Object) buildUpon, "uri.buildUpon()");
        super(buildUpon);
    }
}
