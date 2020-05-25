package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.a */
public final class C33728a extends PopupWindow {

    /* renamed from: a */
    public int f87495a;

    /* renamed from: b */
    public int f87496b;

    /* renamed from: c */
    public int f87497c;

    /* renamed from: d */
    private View f87498d;

    /* renamed from: e */
    private Context f87499e;

    /* renamed from: f */
    private int f87500f;

    /* renamed from: b */
    private void m77239b(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f87495a, iArr[0] + i, (iArr[1] - this.f87500f) + i2);
    }

    /* renamed from: d */
    private void m77241d(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f87495a, iArr[0] - view.getWidth(), iArr[1]);
    }

    /* renamed from: e */
    private void m77242e(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f87495a, iArr[0] + view.getWidth(), iArr[1]);
    }

    /* renamed from: c */
    private void m77240c(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = this.f87495a;
        double width = (double) (iArr[0] + (view.getWidth() / 2));
        double d = (double) this.f87497c;
        Double.isNaN(d);
        double d2 = d * 0.6666666666666666d;
        Double.isNaN(width);
        showAtLocation(view, i3, (int) (width - d2), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public final void mo71777a(View view, int i, int i2) {
        dismiss();
        if (view != null) {
            switch (this.f87496b) {
                case 0:
                    m77239b(view, i, i2);
                    return;
                case 1:
                    m77240c(view, i, i2);
                    return;
                case 2:
                    m77241d(view, i, i2);
                    return;
                case 3:
                    m77242e(view, i, i2);
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo71778a(View view, Activity activity, int i, int i2) {
        this.f87498d = view;
        this.f87499e = activity;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        this.f87497c = i;
        this.f87500f = i2;
    }
}
