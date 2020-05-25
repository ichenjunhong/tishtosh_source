package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Bitmap;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.aq */
final /* synthetic */ class C25348aq implements AnimatorUpdateListener {

    /* renamed from: a */
    private final KeyboardDialogFragment f67025a;

    /* renamed from: b */
    private final Bitmap f67026b;

    /* renamed from: c */
    private final MarginLayoutParams f67027c;

    /* renamed from: d */
    private final int f67028d;

    /* renamed from: e */
    private final int f67029e;

    /* renamed from: f */
    private final int f67030f;

    /* renamed from: g */
    private final int f67031g;

    /* renamed from: h */
    private final LayoutParams f67032h;

    /* renamed from: i */
    private final int f67033i;

    /* renamed from: j */
    private final int f67034j;

    C25348aq(KeyboardDialogFragment keyboardDialogFragment, Bitmap bitmap, MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, LayoutParams layoutParams, int i5, int i6) {
        this.f67025a = keyboardDialogFragment;
        this.f67026b = bitmap;
        this.f67027c = marginLayoutParams;
        this.f67028d = i;
        this.f67029e = i2;
        this.f67030f = i3;
        this.f67031g = i4;
        this.f67032h = layoutParams;
        this.f67033i = i5;
        this.f67034j = i6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        KeyboardDialogFragment keyboardDialogFragment = this.f67025a;
        Bitmap bitmap = this.f67026b;
        MarginLayoutParams marginLayoutParams = this.f67027c;
        int i = this.f67028d;
        int i2 = this.f67029e;
        int i3 = this.f67030f;
        int i4 = this.f67031g;
        LayoutParams layoutParams = this.f67032h;
        int i5 = this.f67033i;
        int i6 = this.f67034j;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue == 0.0f) {
            keyboardDialogFragment.mGifEmojiDrawingCache.setImageBitmap(bitmap);
            keyboardDialogFragment.mGifEmojiDrawingCache.setVisibility(0);
            keyboardDialogFragment.mGifEmojiLayout.setVisibility(0);
            keyboardDialogFragment.mGifEmojiClear.setVisibility(8);
        } else if (floatValue == 1.0f) {
            keyboardDialogFragment.mGifEmojiDrawingCache.setVisibility(8);
            keyboardDialogFragment.mGifEmoji.setVisibility(0);
            keyboardDialogFragment.mGifEmojiClear.setVisibility(0);
            keyboardDialogFragment.mGifEmoji.setImageBitmap(bitmap);
        }
        float f = 1.0f - floatValue;
        marginLayoutParams.leftMargin = (int) ((((float) i) * f) + (((float) i2) * floatValue));
        marginLayoutParams.topMargin = (int) ((((float) i3) * f) + (((float) i4) * floatValue));
        layoutParams.width = (int) ((floatValue * ((float) i5)) + (f * ((float) i6)));
        keyboardDialogFragment.mGifEmojiDrawingCache.requestLayout();
        keyboardDialogFragment.mGifEmojiLayout.requestLayout();
    }
}
