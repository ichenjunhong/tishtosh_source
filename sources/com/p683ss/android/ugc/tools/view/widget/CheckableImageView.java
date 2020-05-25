package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.tools.view.widget.CheckableImageView */
public class CheckableImageView extends AppCompatImageView {

    /* renamed from: a */
    public C50248a f125964a;

    /* renamed from: com.ss.android.ugc.tools.view.widget.CheckableImageView$a */
    public interface C50248a {
        /* renamed from: a */
        void mo92235a();

        /* renamed from: a */
        void mo92236a(int i);
    }

    public void setOnStateChangeListener(C50248a aVar) {
        this.f125964a = aVar;
    }

    public CheckableImageView(Context context) {
        this(context, null);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
