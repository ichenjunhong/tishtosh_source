package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a */
final /* synthetic */ class C46737a implements OnClickListener {

    /* renamed from: a */
    private final ColorSelectLayout f117962a;

    /* renamed from: b */
    private final ColorCircleView f117963b;

    C46737a(ColorSelectLayout colorSelectLayout, ColorCircleView colorCircleView) {
        this.f117962a = colorSelectLayout;
        this.f117963b = colorCircleView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        ColorSelectLayout colorSelectLayout = this.f117962a;
        ColorCircleView colorCircleView = this.f117963b;
        colorSelectLayout.mo93804a();
        ColorSelectLayout.m101452a(view, false);
        ((ColorCircleView) view).f117877c = true;
        if (colorSelectLayout.f117882a != null) {
            colorSelectLayout.f117882a.mo89546a(((Integer) view.getTag()).intValue());
        }
        colorSelectLayout.f117883b.mo93811a(colorCircleView);
    }
}
