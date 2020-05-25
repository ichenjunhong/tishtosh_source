package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.fresco.animation.p952c.C13877a;
import com.facebook.fresco.animation.p952c.p953a.C13880a;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a */
public class C26324a implements C13791d<C14045f> {

    /* renamed from: a */
    private boolean f69468a;

    /* renamed from: b */
    private RemoteImageView f69469b;

    public void onFailure(String str, Throwable th) {
    }

    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    public /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
    }

    public void onRelease(String str) {
    }

    public void onSubmit(String str, Object obj) {
    }

    public C26324a(boolean z, RemoteImageView remoteImageView) {
        this.f69468a = z;
        this.f69469b = remoteImageView;
    }

    /* renamed from: a */
    public void onFinalImageSet(String str, C14045f fVar, Animatable animatable) {
        if (animatable != null) {
            ValueAnimator a = C13880a.m28276a((C13877a) animatable);
            a.setRepeatCount(-1);
            a.start();
            if (this.f69468a && fVar != null) {
                this.f69469b.getLayoutParams().width = C9432q.m18670a(this.f69469b.getContext());
                this.f69469b.getLayoutParams().height = -2;
                this.f69469b.setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            }
        }
    }
}
