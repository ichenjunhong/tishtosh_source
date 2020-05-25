package com.p683ss.android.ugc.aweme.common.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout */
public class MeasureLinearLayout extends LinearLayout {

    /* renamed from: a */
    public int f70769a;

    /* renamed from: b */
    private C26911a f70770b;

    /* renamed from: c */
    private int f70771c;

    public C26911a getKeyBoardObservable() {
        return this.f70770b;
    }

    public MeasureLinearLayout(Context context) {
        this(context, null);
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.f70771c
            int r1 = r8.f70769a
            if (r0 != r1) goto L_0x0076
            com.ss.android.ugc.aweme.common.keyboard.a r0 = r8.f70770b
            android.content.Context r1 = r8.getContext()
            int r2 = android.view.View.MeasureSpec.getSize(r10)
            boolean r3 = com.p683ss.android.ugc.aweme.utils.p2390d.C47801c.m103435d()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0043
            java.lang.String r3 = "window"
            java.lang.Object r3 = r1.getSystemService(r3)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>()
            android.view.Display r3 = r3.getDefaultDisplay()
            r3.getSize(r6)
            int r3 = r6.y
            if (r2 <= r3) goto L_0x0032
        L_0x0030:
            r3 = 1
            goto L_0x0044
        L_0x0032:
            int r6 = r0.f70773a
            if (r6 != 0) goto L_0x0039
            r0.f70773a = r3
            goto L_0x003f
        L_0x0039:
            int r6 = r0.f70773a
            if (r6 == r3) goto L_0x003f
            r3 = 1
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            if (r3 == 0) goto L_0x0043
            goto L_0x0030
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r3 != 0) goto L_0x007a
            int r3 = r0.f70774b
            if (r3 != 0) goto L_0x004d
            r0.f70774b = r2
            goto L_0x007a
        L_0x004d:
            int r3 = r0.f70774b
            if (r3 == r2) goto L_0x007a
            int r3 = r0.f70774b
            int r3 = r3 - r2
            int r6 = java.lang.Math.abs(r3)
            float r6 = (float) r6
            r7 = 1117782016(0x42a00000, float:80.0)
            float r1 = com.bytedance.common.utility.C9432q.m18687b(r1, r7)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x007a
            if (r3 <= 0) goto L_0x0068
            r0.f70775c = r5
            goto L_0x006a
        L_0x0068:
            r0.f70775c = r4
        L_0x006a:
            int r1 = java.lang.Math.abs(r3)
            boolean r3 = r0.f70775c
            r0.mo54866a(r3, r1)
            r0.f70774b = r2
            goto L_0x007a
        L_0x0076:
            int r0 = r8.f70769a
            r8.f70771c = r0
        L_0x007a:
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout.onMeasure(int, int):void");
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70770b = new C26911a();
    }
}
