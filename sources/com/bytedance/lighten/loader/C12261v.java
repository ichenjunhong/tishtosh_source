package com.bytedance.lighten.loader;

import com.bytedance.lighten.p766a.C12210u;
import com.facebook.drawee.p939e.C13816q.C13818b;

/* renamed from: com.bytedance.lighten.loader.v */
final class C12261v {

    /* renamed from: a */
    private static final C13818b f32363a = C13818b.f36067g;

    /* renamed from: a */
    public static C13818b m24734a(C12210u uVar) {
        C13818b bVar = f32363a;
        switch (uVar) {
            case FIT_XY:
                return C13818b.f36061a;
            case FIT_START:
                return C13818b.f36062b;
            case FIT_END:
                return C13818b.f36064d;
            case FIT_CENTER:
                return C13818b.f36063c;
            case CENTER:
                return C13818b.f36065e;
            case CENTER_CROP:
                return C13818b.f36067g;
            case CENTER_INSIDE:
                return C13818b.f36066f;
            case FOCUS_CROP:
                return C13818b.f36068h;
            default:
                return bVar;
        }
    }
}
