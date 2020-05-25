package com.p683ss.android.ugc.aweme.newfollow.util;

import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45883c.C45884a;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.h */
public final class C37942h {
    /* renamed from: a */
    public static void m84841a(int i, int i2, TextureView textureView, float f) {
        m84842a(i, i2, textureView, f, (C45884a) null);
    }

    /* renamed from: a */
    private static void m84842a(int i, int i2, TextureView textureView, float f, C45884a aVar) {
        float f2;
        if (i2 > 0 && i > 0 && f > 0.0f) {
            float f3 = ((float) i2) / ((float) i);
            float f4 = 1.0f;
            if (f3 > f) {
                f2 = f3 / f;
            } else {
                f4 = f / f3;
                f2 = 1.0f;
            }
            int i3 = i / 2;
            int i4 = i2 / 2;
            if (textureView != null) {
                Matrix matrix = new Matrix();
                matrix.setScale(f2, f4, (float) i3, (float) i4);
                textureView.setTransform(matrix);
            }
        }
    }

    /* renamed from: a */
    public static void m84843a(int i, int i2, View view, int i3, int i4) {
        if (i2 > 0 && i > 0 && i3 > 0 && i4 > 0 && (view.getLayoutParams() instanceof LayoutParams)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            float f = (((float) i4) * 1.0f) / ((float) i3);
            float f2 = (float) i;
            if (f >= (((float) i2) * 1.0f) / f2) {
                layoutParams.width = i;
                layoutParams.height = i2;
            } else {
                layoutParams.width = i;
                layoutParams.height = (int) (f2 * f);
            }
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
        }
    }
}
