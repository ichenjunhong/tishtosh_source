package com.facebook.imagepipeline.nativecode;

/* renamed from: com.facebook.imagepipeline.nativecode.f */
public final class C14227f {

    /* renamed from: a */
    public static boolean f37125a;

    /* renamed from: b */
    private static C14226e f37126b;

    /* renamed from: a */
    public static C14226e m29167a() {
        return f37126b;
    }

    static {
        try {
            f37126b = (C14226e) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            f37125a = true;
        } catch (Throwable unused) {
            f37125a = false;
        }
    }
}
