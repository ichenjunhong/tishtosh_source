package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoBottomButton */
public final class VideoBottomButton extends FrameLayout {

    /* renamed from: a */
    private TextView f80525a;

    /* renamed from: b */
    private RemoteImageView f80526b;

    public VideoBottomButton(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null);
    }

    public final void setBackgroundColor(int i) {
        setBackgroundColors(new int[]{i, i});
    }

    public final void setButtonBackground(UrlModel urlModel) {
        RemoteImageView remoteImageView = this.f80526b;
        if (remoteImageView == null) {
            C52711k.m112237a("ivBg");
        }
        C23515d.m57669a(remoteImageView, urlModel);
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = this.f80525a;
        if (textView == null) {
            C52711k.m112237a("textView");
        }
        textView.setText(charSequence);
    }

    public final void setBackgroundColors(int[] iArr) {
        C52711k.m112240b(iArr, "colors");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C9432q.m18687b(getContext(), 4.0f));
        gradientDrawable.setColors(iArr);
        gradientDrawable.setOrientation(Orientation.LEFT_RIGHT);
        setBackground(gradientDrawable);
    }

    public VideoBottomButton(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.b7d, this, true);
        View findViewById = findViewById(R.id.dhb);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.tv_title)");
        this.f80525a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.ayo);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.iv_button_bg)");
        this.f80526b = (RemoteImageView) findViewById2;
    }
}
