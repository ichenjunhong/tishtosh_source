package com.facebook.drawee.p936c;

import android.graphics.drawable.Animatable;

/* renamed from: com.facebook.drawee.c.c */
public class C13790c<INFO> implements C13791d<INFO> {
    private static final C13791d<Object> NO_OP_LISTENER = new C13790c();

    public static <INFO> C13791d<INFO> getNoOpListener() {
        return NO_OP_LISTENER;
    }

    public void onFailure(String str, Throwable th) {
    }

    public void onFinalImageSet(String str, INFO info, Animatable animatable) {
    }

    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    public void onIntermediateImageSet(String str, INFO info) {
    }

    public void onRelease(String str) {
    }

    public void onSubmit(String str, Object obj) {
    }
}
