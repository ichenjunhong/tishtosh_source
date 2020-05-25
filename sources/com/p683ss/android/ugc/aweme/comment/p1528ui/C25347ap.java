package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ap */
final /* synthetic */ class C25347ap implements Runnable {

    /* renamed from: a */
    private final KeyboardDialogFragment f67021a;

    /* renamed from: b */
    private final View f67022b;

    /* renamed from: c */
    private final int[] f67023c;

    /* renamed from: d */
    private final int[] f67024d;

    C25347ap(KeyboardDialogFragment keyboardDialogFragment, View view, int[] iArr, int[] iArr2) {
        this.f67021a = keyboardDialogFragment;
        this.f67022b = view;
        this.f67023c = iArr;
        this.f67024d = iArr2;
    }

    public final void run() {
        KeyboardDialogFragment keyboardDialogFragment = this.f67021a;
        View view = this.f67022b;
        int[] iArr = this.f67023c;
        int[] iArr2 = this.f67024d;
        if (keyboardDialogFragment.f66978n != null && keyboardDialogFragment.f66978n.isRunning()) {
            keyboardDialogFragment.f66978n.cancel();
        }
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache != null) {
            Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
            int width = createBitmap.getWidth();
            int i = iArr[0] - iArr2[0];
            int i2 = iArr[1] - iArr2[1];
            int i3 = keyboardDialogFragment.f66980p[0] - iArr2[0];
            int i4 = keyboardDialogFragment.f66980p[1] - iArr2[1];
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) keyboardDialogFragment.mGifEmojiDrawingCache.getLayoutParams();
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.width = width;
            LayoutParams layoutParams = keyboardDialogFragment.mGifEmojiLayout.getLayoutParams();
            int i5 = layoutParams.width;
            keyboardDialogFragment.f66978n = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(300);
            keyboardDialogFragment.f66978n.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator valueAnimator = keyboardDialogFragment.f66978n;
            C25348aq aqVar = new C25348aq(keyboardDialogFragment, createBitmap, marginLayoutParams, i, i3, i2, i4, layoutParams, width, i5);
            valueAnimator.addUpdateListener(aqVar);
            keyboardDialogFragment.f66978n.start();
        }
    }
}
