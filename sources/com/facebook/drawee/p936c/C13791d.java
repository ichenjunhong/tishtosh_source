package com.facebook.drawee.p936c;

import android.graphics.drawable.Animatable;

/* renamed from: com.facebook.drawee.c.d */
public interface C13791d<INFO> {
    void onFailure(String str, Throwable th);

    void onFinalImageSet(String str, INFO info, Animatable animatable);

    void onIntermediateImageFailed(String str, Throwable th);

    void onIntermediateImageSet(String str, INFO info);

    void onRelease(String str);

    void onSubmit(String str, Object obj);
}
