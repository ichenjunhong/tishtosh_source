package com.p683ss.android.ugc.aweme.commercialize;

import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.fresco.animation.p952c.C13877a;
import com.facebook.fresco.animation.p952c.p953a.C13880a;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.commercialize.a */
public final class C25588a implements C13791d<C14045f> {

    /* renamed from: a */
    private boolean f67734a;

    /* renamed from: b */
    private RemoteImageView f67735b;

    public final void onFailure(String str, Throwable th) {
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
    }

    public final void onRelease(String str) {
    }

    public final void onSubmit(String str, Object obj) {
    }

    public C25588a(boolean z, RemoteImageView remoteImageView) {
        this.f67734a = z;
        this.f67735b = remoteImageView;
    }

    public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
        C14045f fVar = (C14045f) obj;
        if (animatable != null) {
            ValueAnimator a = C13880a.m28276a((C13877a) animatable);
            a.setRepeatCount(-1);
            a.start();
            if (this.f67734a && fVar != null) {
                this.f67735b.getLayoutParams().width = C9432q.m18670a(this.f67735b.getContext());
                this.f67735b.getLayoutParams().height = -2;
                this.f67735b.setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            }
        }
    }
}
