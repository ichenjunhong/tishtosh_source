package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.DmtAutoCenterScrollView */
public class DmtAutoCenterScrollView extends HorizontalScrollView {

    /* renamed from: a */
    static int f117889a = 16;

    /* renamed from: a */
    public final void mo93811a(View view) {
        if (getWidth() == 0) {
            postDelayed(new C46744b(this, view), 100);
        } else {
            smoothScrollTo(((view.getLeft() + view.getRight()) / 2) - (getWidth() / 2), 0);
        }
    }

    public DmtAutoCenterScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOverScrollMode(2);
    }
}
