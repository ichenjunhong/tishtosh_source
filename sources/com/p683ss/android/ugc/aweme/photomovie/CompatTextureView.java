package com.p683ss.android.ugc.aweme.photomovie;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.photomovie.CompatTextureView */
public class CompatTextureView extends TextureView {
    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
    }

    public CompatTextureView(Context context) {
        super(context);
    }

    public CompatTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompatTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
