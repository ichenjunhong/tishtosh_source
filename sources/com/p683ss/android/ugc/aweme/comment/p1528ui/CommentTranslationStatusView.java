package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView */
public class CommentTranslationStatusView extends FrameLayout {

    /* renamed from: a */
    private LinearLayout f66928a;

    /* renamed from: b */
    private ObjectAnimator f66929b;

    /* renamed from: c */
    private boolean f66930c;

    public CommentTranslationStatusView(Context context) {
        this(context, null);
    }

    public void setLoading(boolean z) {
        int i;
        if (this.f66930c != z) {
            if (z) {
                this.f66929b.start();
            } else {
                this.f66929b.cancel();
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            setVisibility(i);
            this.f66930c = z;
        }
    }

    public CommentTranslationStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommentTranslationStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f66928a = new LinearLayout(getContext());
        this.f66928a.setLayoutParams(new LayoutParams(-2, -1));
        this.f66928a.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.cj1);
        this.f66929b = ObjectAnimator.ofFloat(imageView, "rotation", new float[]{0.0f, 360.0f}).setDuration(800);
        this.f66929b.setInterpolator(new LinearInterpolator());
        this.f66929b.setRepeatCount(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        this.f66928a.addView(imageView);
        DmtTextView dmtTextView = new DmtTextView(getContext());
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setTextColor(getContext().getResources().getColor(R.color.a8j));
        dmtTextView.setText(R.string.a9q);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) C9432q.m18687b(getContext(), 1.0f);
        layoutParams2.gravity = 16;
        dmtTextView.setLayoutParams(layoutParams2);
        this.f66928a.addView(dmtTextView);
        addView(this.f66928a);
        setLoading(false);
    }
}
