package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.p683ss.android.ugc.tools.view.widget.AVTextView;

/* renamed from: com.ss.android.ugc.aweme.views.AlwaysMarqueeTextView */
public final class AlwaysMarqueeTextView extends AVTextView {
    public final boolean isFocused() {
        return true;
    }

    public AlwaysMarqueeTextView(Context context) {
        super(context);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            super.onWindowFocusChanged(z);
        }
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            super.onFocusChanged(z, i, rect);
        }
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
