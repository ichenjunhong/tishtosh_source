package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bd */
public final class C30789bd implements C13791d<C14045f> {

    /* renamed from: a */
    private View f80664a;

    /* renamed from: b */
    private Context f80665b;

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

    public C30789bd(View view, Context context) {
        this.f80664a = view;
        this.f80665b = context;
    }

    public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
        C14045f fVar = (C14045f) obj;
        if (fVar != null) {
            LayoutParams layoutParams = this.f80664a.getLayoutParams();
            int width = (int) (((float) fVar.getWidth()) * (((float) layoutParams.height) / ((float) fVar.getHeight())));
            if (width != layoutParams.width) {
                layoutParams.width = width;
                this.f80664a.setLayoutParams(layoutParams);
            }
        }
    }
}
