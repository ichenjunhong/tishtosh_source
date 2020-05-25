package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import com.bytedance.lighten.p766a.C12192f;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p975o.C14228a;

/* renamed from: com.bytedance.lighten.loader.d */
final class C12224d extends C14228a {

    /* renamed from: a */
    private C12192f f32307a;

    C12224d(C12192f fVar) {
        this.f32307a = fVar;
    }

    public final C13715a<Bitmap> process(Bitmap bitmap, C13946f fVar) {
        return C13715a.m27751b(fVar.mo26110a(bitmap, this.f32307a.f32121a, this.f32307a.f32122b, this.f32307a.f32123c, this.f32307a.f32124d, (Object) null));
    }
}
