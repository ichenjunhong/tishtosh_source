package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.TopCropImageView */
public class TopCropImageView extends AppCompatImageView {
    /* renamed from: a */
    private void m89833a() {
        setScaleType(ScaleType.MATRIX);
    }

    /* renamed from: b */
    private void m89834b() {
        float f;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth * height > intrinsicHeight * width) {
                f = ((float) height) / ((float) intrinsicHeight);
            } else {
                f = ((float) width) / ((float) intrinsicWidth);
            }
            imageMatrix.setScale(f, f);
            setImageMatrix(imageMatrix);
        }
    }

    public TopCropImageView(Context context) {
        super(context);
        m89833a();
    }

    public TopCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m89833a();
    }

    public TopCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m89833a();
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        m89834b();
        return super.setFrame(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m89834b();
    }
}
