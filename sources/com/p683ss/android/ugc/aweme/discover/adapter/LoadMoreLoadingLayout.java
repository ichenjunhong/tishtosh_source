package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.common.widget.AbstractLoadingLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.LoadMoreLoadingLayout */
public class LoadMoreLoadingLayout extends AbstractLoadingLayout {

    /* renamed from: f */
    private int f72882f;

    public LoadMoreLoadingLayout(Context context) {
        this(context, null);
    }

    public LoadMoreLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), 1073741824), MeasureSpec.makeMeasureSpec((int) C9432q.m18687b(getContext(), (float) this.f72882f), 1073741824));
    }

    /* renamed from: a */
    public final void mo54879a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        super.mo54879a(i, i2);
        if (this.f70800a != null) {
            View view = this.f70800a;
            if (i2 == 0) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            view.setVisibility(i5);
        }
        View view2 = this.f70801b;
        int i6 = 8;
        if (i2 == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        View view3 = this.f70803d;
        if (i2 == 2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        View view4 = this.f70802c;
        if (i2 == 3) {
            i6 = 0;
        }
        view4.setVisibility(i6);
        if (i2 == 0) {
            this.f72882f = 0;
        } else {
            this.f72882f = 45;
        }
        requestLayout();
    }

    public LoadMoreLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72882f = 45;
        mo54879a(0, 0);
    }

    public void addView(View view, int i, int i2) {
        int i3;
        super.addView(view, i, i2);
        if (this.f70800a == view) {
            View view2 = this.f70800a;
            if (this.f70804e == 0) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view2.setVisibility(i3);
        }
    }

    /* renamed from: b */
    public final View mo54881b(Context context, AttributeSet attributeSet, int i) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, i);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(C0726c.m2098c(context, R.color.a1t));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.c0d);
        appCompatTextView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
            }
        });
        return appCompatTextView;
    }

    /* renamed from: c */
    public final View mo54882c(Context context, AttributeSet attributeSet, int i) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, i);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(C0726c.m2098c(context, R.color.a1t));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.c0e);
        appCompatTextView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
            }
        });
        return appCompatTextView;
    }

    /* renamed from: a */
    public final View mo54878a(Context context, AttributeSet attributeSet, int i) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, i);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setTextColor(C0726c.m2098c(context, R.color.a1a));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.c0f);
        ProgressBar progressBar = new ProgressBar(context, attributeSet, i);
        progressBar.setId(R.id.bhn);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateDrawable(context.getResources().getDrawable(R.drawable.b3m));
        int b = (int) C9432q.m18687b(context, 15.0f);
        LayoutParams layoutParams = new LayoutParams(b, b);
        layoutParams.setMargins(0, 0, (int) C9432q.m18687b(context, 5.0f), 0);
        progressBar.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        linearLayout.setGravity(16);
        linearLayout.addView(progressBar);
        linearLayout.addView(appCompatTextView);
        return linearLayout;
    }
}
