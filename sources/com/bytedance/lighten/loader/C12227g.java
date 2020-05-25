package com.bytedance.lighten.loader;

import com.bytedance.lighten.p766a.p769c.C12171f;
import com.bytedance.lighten.p766a.p769c.C12172g;
import com.facebook.imagepipeline.p975o.C14228a;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13624h;

/* renamed from: com.bytedance.lighten.loader.g */
final class C12227g extends C14228a {

    /* renamed from: a */
    private C12172g f32319a;

    /* renamed from: b */
    private C12171f f32320b;

    public final String getName() {
        return this.f32319a.mo23090a();
    }

    public final C13619c getPostprocessorCacheKey() {
        return new C13624h(this.f32319a.mo23090a());
    }

    public C12227g(C12172g gVar) {
        this.f32319a = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.common.p924h.C13715a<android.graphics.Bitmap> process(android.graphics.Bitmap r4, final com.facebook.imagepipeline.p963c.C13946f r5) {
        /*
            r3 = this;
            com.bytedance.lighten.a.c.f r0 = r3.f32320b
            if (r0 != 0) goto L_0x000b
            com.bytedance.lighten.loader.g$1 r0 = new com.bytedance.lighten.loader.g$1
            r0.<init>(r5)
            r3.f32320b = r0
        L_0x000b:
            r5 = 0
            com.bytedance.lighten.a.c.g r0 = r3.f32319a     // Catch:{ all -> 0x0029 }
            com.bytedance.lighten.a.c.f r1 = r3.f32320b     // Catch:{ all -> 0x0029 }
            com.bytedance.lighten.a.c.b r4 = r0.mo23089a(r4, r1)     // Catch:{ all -> 0x0029 }
            com.bytedance.lighten.loader.w r4 = (com.bytedance.lighten.loader.C12263w) r4     // Catch:{ all -> 0x0029 }
            com.facebook.common.h.a<android.graphics.Bitmap> r5 = r4.f32365a     // Catch:{ all -> 0x0024 }
            com.facebook.common.h.a r5 = com.facebook.common.p924h.C13715a.m27751b(r5)     // Catch:{ all -> 0x0024 }
            if (r4 == 0) goto L_0x0023
            com.facebook.common.h.a<android.graphics.Bitmap> r4 = r4.f32365a
            com.facebook.common.p924h.C13715a.m27752c(r4)
        L_0x0023:
            return r5
        L_0x0024:
            r5 = move-exception
            r2 = r5
            r5 = r4
            r4 = r2
            goto L_0x002a
        L_0x0029:
            r4 = move-exception
        L_0x002a:
            if (r5 == 0) goto L_0x0031
            com.facebook.common.h.a<android.graphics.Bitmap> r5 = r5.f32365a
            com.facebook.common.p924h.C13715a.m27752c(r5)
        L_0x0031:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lighten.loader.C12227g.process(android.graphics.Bitmap, com.facebook.imagepipeline.c.f):com.facebook.common.h.a");
    }
}
