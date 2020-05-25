package com.p683ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.p683ss.android.ugc.aweme.shortvideo.p2261w.C45555b;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ExpandableMentionTextView */
public final class ExpandableMentionTextView extends MentionTextView implements C45555b {

    /* renamed from: d */
    private int f118638d;

    public final int getHookAtMaxWidth() {
        return this.f118638d;
    }

    public ExpandableMentionTextView(Context context) {
        C52711k.m112240b(context, "ctx");
        super(context);
    }

    public final void onMeasure(int i, int i2) {
        this.f118638d = MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
    }

    public ExpandableMentionTextView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "ctx");
        super(context, attributeSet);
    }

    public ExpandableMentionTextView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "ctx");
        super(context, attributeSet, i);
    }
}
