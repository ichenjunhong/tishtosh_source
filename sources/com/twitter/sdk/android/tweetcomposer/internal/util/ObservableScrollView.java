package com.twitter.sdk.android.tweetcomposer.internal.util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ObservableScrollView extends ScrollView {

    /* renamed from: a */
    C52252a f130101a;

    /* renamed from: com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView$a */
    public interface C52252a {
        /* renamed from: a */
        void mo108998a(int i);
    }

    public ObservableScrollView(Context context) {
        super(context);
    }

    public void setScrollViewListener(C52252a aVar) {
        this.f130101a = aVar;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f130101a != null) {
            this.f130101a.mo108998a(i2);
        }
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
