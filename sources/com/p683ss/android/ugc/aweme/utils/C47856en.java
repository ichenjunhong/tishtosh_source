package com.p683ss.android.ugc.aweme.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.ss.android.ugc.aweme.utils.en */
public final class C47856en extends ViewOutlineProvider {

    /* renamed from: a */
    private int f120419a;

    public C47856en(int i) {
        this.f120419a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f120419a);
    }
}
