package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import com.squareup.p1094a.C18350ae;
import com.squareup.p1094a.C18396v.C18402d;
import com.twitter.sdk.android.tweetui.internal.C52296f.C52297a;

/* renamed from: com.twitter.sdk.android.tweetui.internal.b */
public final class C52291b extends FrameLayout implements C18350ae {

    /* renamed from: a */
    final MultiTouchImageView f130230a;

    /* renamed from: b */
    final ProgressBar f130231b;

    public C52291b(Context context) {
        this(context, new MultiTouchImageView(context), new ProgressBar(context));
    }

    public final void setSwipeToDismissCallback(C52297a aVar) {
        this.f130230a.setOnTouchListener(C52296f.m111732a(this.f130230a, aVar));
    }

    /* renamed from: a */
    public final void mo36797a(Drawable drawable) {
        this.f130230a.setImageResource(17170445);
        this.f130231b.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo36796a(Bitmap bitmap, C18402d dVar) {
        this.f130230a.setImageBitmap(bitmap);
        this.f130231b.setVisibility(8);
    }

    private C52291b(Context context, MultiTouchImageView multiTouchImageView, ProgressBar progressBar) {
        super(context);
        this.f130230a = multiTouchImageView;
        this.f130231b = progressBar;
        progressBar.setLayoutParams(new LayoutParams(-2, -2, 17));
        addView(progressBar);
        multiTouchImageView.setLayoutParams(new LayoutParams(-1, -1, 17));
        addView(multiTouchImageView);
    }
}
