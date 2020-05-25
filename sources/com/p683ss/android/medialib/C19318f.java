package com.p683ss.android.medialib;

/* renamed from: com.ss.android.medialib.f */
public class C19318f {

    /* renamed from: b */
    private static final String f53367b = "f";

    /* renamed from: c */
    private static volatile C19318f f53368c;

    /* renamed from: a */
    public FaceBeautyInvoker f53369a;

    /* renamed from: a */
    public static C19318f m47183a() {
        synchronized (C19318f.class) {
            if (f53368c == null) {
                synchronized (C19318f.class) {
                    if (f53368c == null) {
                        f53368c = new C19318f();
                    }
                }
            }
        }
        return f53368c;
    }

    /* renamed from: a */
    public final void mo39812a(float f) {
        if (this.f53369a != null) {
            this.f53369a.updateReactionBGAlpha(f);
        }
    }
}
