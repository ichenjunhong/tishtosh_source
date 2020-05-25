package com.p683ss.android.ugc.aweme.base.utils;

import android.graphics.Rect;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: com.ss.android.ugc.aweme.base.utils.c */
final /* synthetic */ class C23714c implements OnGlobalLayoutListener {

    /* renamed from: a */
    private final AndroidBug5497Workaround f63250a;

    C23714c(AndroidBug5497Workaround androidBug5497Workaround) {
        this.f63250a = androidBug5497Workaround;
    }

    public final void onGlobalLayout() {
        AndroidBug5497Workaround androidBug5497Workaround = this.f63250a;
        if (androidBug5497Workaround.f63231a != null && androidBug5497Workaround.f63232b != null) {
            Rect rect = new Rect();
            androidBug5497Workaround.f63231a.getWindowVisibleDisplayFrame(rect);
            double d = (double) rect.bottom;
            double height = (double) androidBug5497Workaround.f63231a.getHeight();
            Double.isNaN(height);
            if (d < height * 0.75d) {
                androidBug5497Workaround.f63232b.mo49145a();
            } else {
                androidBug5497Workaround.f63232b.mo49146b();
            }
        }
    }
}
