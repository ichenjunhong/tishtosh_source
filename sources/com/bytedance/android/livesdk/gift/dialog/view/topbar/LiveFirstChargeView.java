package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.FitTextView;
import com.ss.android.ugc.trill.R;

public class LiveFirstChargeView extends FrameLayout {

    /* renamed from: a */
    private LinearLayout f19783a;

    private ImageView getGuideIv() {
        return new ImageView(getContext());
    }

    private TextView getGuideTv() {
        FitTextView fitTextView = new FitTextView(getContext());
        fitTextView.setTextSize(12.0f);
        fitTextView.setTextColor(C3922z.m9909b((int) R.color.alt));
        fitTextView.setMaxLines(1);
        return fitTextView;
    }

    public LiveFirstChargeView(Context context) {
        this(context, null);
    }

    public LiveFirstChargeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveFirstChargeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.bxc, this);
        this.f19783a = (LinearLayout) findViewById(R.id.eka);
    }
}
