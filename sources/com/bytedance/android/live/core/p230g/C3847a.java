package com.bytedance.android.live.core.p230g;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.live.core.g.a */
public final class C3847a implements OnGlobalLayoutListener {

    /* renamed from: a */
    private WeakReference<View> f10831a;

    /* renamed from: b */
    private ViewTreeObserver f10832b;

    /* renamed from: c */
    private int f10833c;

    /* renamed from: d */
    private LayoutParams f10834d;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r5 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r5.f10831a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x0018
            android.view.ViewTreeObserver r0 = r5.f10832b
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x0017
            android.view.ViewTreeObserver r0 = r5.f10832b
            r0.removeGlobalOnLayoutListener(r5)
        L_0x0017:
            return
        L_0x0018:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.getWindowVisibleDisplayFrame(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L_0x0047
            android.view.WindowInsets r2 = r0.getRootWindowInsets()
            if (r2 == 0) goto L_0x0047
            int r3 = r2.getStableInsetTop()
            int r4 = r1.top
            if (r3 == r4) goto L_0x0047
            int r3 = r2.getStableInsetTop()
            int r4 = r1.top
            if (r3 >= r4) goto L_0x0047
            int r3 = r1.bottom
            int r1 = r1.top
            int r2 = r2.getStableInsetTop()
            int r1 = r1 - r2
            int r3 = r3 - r1
            goto L_0x0049
        L_0x0047:
            int r3 = r1.bottom
        L_0x0049:
            int r1 = r5.f10833c
            if (r3 == r1) goto L_0x0063
            android.view.ViewGroup$LayoutParams r1 = r5.f10834d
            r1.height = r3
            android.view.ViewGroup$LayoutParams r1 = r5.f10834d
            r0.setLayoutParams(r1)
            r0.getClass()
            com.bytedance.android.live.core.g.b r1 = new com.bytedance.android.live.core.g.b
            r1.<init>(r0)
            r0.post(r1)
            r5.f10833c = r3
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.p230g.C3847a.onGlobalLayout():void");
    }

    public C3847a(View view) {
        if (view != null) {
            this.f10831a = new WeakReference<>(view);
            this.f10832b = view.getViewTreeObserver();
            this.f10832b.addOnGlobalLayoutListener(this);
            this.f10834d = view.getLayoutParams();
        }
    }
}
