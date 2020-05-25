package com.p683ss.android.ugc.aweme.emoji.views;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: com.ss.android.ugc.aweme.emoji.views.b */
public final class C29490b extends PopupWindow {

    /* renamed from: a */
    public int f77235a;

    /* renamed from: b */
    public int f77236b;

    /* renamed from: c */
    public int f77237c;

    /* renamed from: d */
    private View f77238d;

    /* renamed from: e */
    private Context f77239e;

    /* renamed from: f */
    private int f77240f;

    /* renamed from: a */
    public final void mo59596a(View view, Context context) {
        this.f77238d = view;
        this.f77239e = context;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        view.measure(0, 0);
        this.f77237c = view.getMeasuredWidth();
        this.f77240f = view.getMeasuredHeight();
    }

    /* renamed from: b */
    private void m69581b(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f77235a, iArr[0] + i, (iArr[1] - this.f77240f) + i2);
    }

    /* renamed from: d */
    private void m69583d(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f77235a, iArr[0] - view.getWidth(), iArr[1]);
    }

    /* renamed from: e */
    private void m69584e(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f77235a, iArr[0] + view.getWidth(), iArr[1]);
    }

    /* renamed from: c */
    private void m69582c(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i3 = this.f77235a;
        double width = (double) (iArr[0] + (view.getWidth() / 2));
        double d = (double) this.f77237c;
        Double.isNaN(d);
        double d2 = d * 0.6666666666666666d;
        Double.isNaN(width);
        showAtLocation(view, i3, (int) (width - d2), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public final void mo59595a(View view, int i, int i2) {
        dismiss();
        if (view != null) {
            switch (this.f77236b) {
                case 0:
                    m69581b(view, i, i2);
                    return;
                case 1:
                    m69582c(view, i, i2);
                    return;
                case 2:
                    m69583d(view, i, i2);
                    return;
                case 3:
                    m69584e(view, i, i2);
                    break;
            }
        }
    }
}
