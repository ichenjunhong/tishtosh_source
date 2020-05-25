package com.p683ss.android.ugc.aweme.movie.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p879t.p882c.C13248c;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.movie.view.FeedMvTagView */
public final class FeedMvTagView extends FrameLayout {

    /* renamed from: a */
    private ImageView f94929a;

    /* renamed from: b */
    private DmtTextView f94930b;

    /* renamed from: c */
    private ImageView f94931c;

    /* renamed from: d */
    private LinearLayout f94932d;

    /* renamed from: e */
    private TextView f94933e;

    public final TextView getMFestivalName() {
        return this.f94933e;
    }

    public final ImageView getMMvIcon() {
        return this.f94929a;
    }

    public final DmtTextView getMMvName() {
        return this.f94930b;
    }

    public final ImageView getMRightArrow() {
        return this.f94931c;
    }

    public final LinearLayout getMTagContainer() {
        return this.f94932d;
    }

    public final void setMFestivalName(TextView textView) {
        this.f94933e = textView;
    }

    public final void setMMvIcon(ImageView imageView) {
        this.f94929a = imageView;
    }

    public final void setMMvName(DmtTextView dmtTextView) {
        this.f94930b = dmtTextView;
    }

    public final void setMRightArrow(ImageView imageView) {
        this.f94931c = imageView;
    }

    public final void setMTagContainer(LinearLayout linearLayout) {
        this.f94932d = linearLayout;
    }

    public FeedMvTagView(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null);
    }

    public final void setBackground(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.f94932d;
            if (linearLayout != null) {
                linearLayout.setBackground(getResources().getDrawable(intValue));
            }
        }
    }

    public final void setTagName(String str) {
        C52711k.m112240b(str, "str");
        DmtTextView dmtTextView = this.f94930b;
        if (dmtTextView != null) {
            dmtTextView.setText(str);
        }
        ImageView imageView = this.f94931c;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void setFestivalName(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        if (!C13248c.m26638a(str)) {
            TextView textView = this.f94933e;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f94933e;
            if (textView2 != null) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(str);
                textView2.setText(sb.toString());
            }
        }
    }

    public FeedMvTagView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        this(context, attributeSet, 0);
    }

    public FeedMvTagView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.b4w, this);
        this.f94929a = (ImageView) findViewById(R.id.b2q);
        this.f94930b = (DmtTextView) findViewById(R.id.dck);
        this.f94931c = (ImageView) findViewById(R.id.b3p);
        this.f94932d = (LinearLayout) findViewById(R.id.bp5);
        this.f94933e = (TextView) findViewById(R.id.d_a);
        TextView textView = this.f94933e;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
