package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView */
public abstract class AbstractVideoEditView extends FrameLayout implements C43120d {

    /* renamed from: a */
    public boolean f108821a;

    public abstract View getEndSlide();

    public abstract View getStartSlide();

    public AbstractVideoEditView(Context context) {
        super(context);
    }

    public AbstractVideoEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractVideoEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
