package com.facebook.imagepipeline.p956a.p958b;

import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p964d.C13971h;
import com.facebook.imagepipeline.p965e.C13999f;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.p914c.p915a.C13619c;

/* renamed from: com.facebook.imagepipeline.a.b.b */
public final class C13916b {

    /* renamed from: a */
    public static C13923f f36308a;

    /* renamed from: b */
    public static int f36309b;
    private static C13915a sImpl;
    private static boolean sImplLoaded;

    /* renamed from: a */
    public static void m28350a(int i) {
        f36309b = i;
    }

    /* renamed from: a */
    public static C13915a m28349a(C13946f fVar, C13999f fVar2, C13971h<C13619c, C14042c> hVar) {
        if (!sImplLoaded) {
            try {
                sImpl = (C13915a) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(new Class[]{C13946f.class, C13999f.class, C13971h.class}).newInstance(new Object[]{fVar, fVar2, hVar});
            } catch (Throwable unused) {
            }
            if (sImpl != null) {
                sImplLoaded = true;
            }
        }
        return sImpl;
    }
}
