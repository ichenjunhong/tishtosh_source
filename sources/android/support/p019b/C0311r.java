package android.support.p019b;

import android.os.Build.VERSION;

/* renamed from: android.support.b.r */
final class C0311r {

    /* renamed from: a */
    private static final boolean f767a;

    /* renamed from: b */
    private static final boolean f768b;

    /* renamed from: c */
    private static final boolean f769c;

    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        f767a = z;
        if (VERSION.SDK_INT >= 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        f768b = z2;
        if (VERSION.SDK_INT >= 28) {
            z3 = true;
        }
        f769c = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0107  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.view.View m683a(android.view.ViewGroup r16, android.view.View r17, android.view.View r18) {
        /*
            r0 = r16
            r1 = r17
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            int r3 = r18.getScrollX()
            int r3 = -r3
            float r3 = (float) r3
            int r4 = r18.getScrollY()
            int r4 = -r4
            float r4 = (float) r4
            r2.setTranslate(r3, r4)
            android.support.b.ai r3 = android.support.p019b.C0244ae.f597a
            r3.mo519a(r1, r2)
            android.support.b.ai r3 = android.support.p019b.C0244ae.f597a
            r3.mo520b(r0, r2)
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r17.getWidth()
            float r4 = (float) r4
            int r5 = r17.getHeight()
            float r5 = (float) r5
            r6 = 0
            r3.<init>(r6, r6, r4, r5)
            r2.mapRect(r3)
            float r4 = r3.left
            int r4 = java.lang.Math.round(r4)
            float r5 = r3.top
            int r5 = java.lang.Math.round(r5)
            float r6 = r3.right
            int r6 = java.lang.Math.round(r6)
            float r7 = r3.bottom
            int r7 = java.lang.Math.round(r7)
            android.widget.ImageView r8 = new android.widget.ImageView
            android.content.Context r9 = r17.getContext()
            r8.<init>(r9)
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
            r8.setScaleType(r9)
            boolean r9 = f767a
            r10 = 0
            if (r9 == 0) goto L_0x006e
            boolean r9 = r17.isAttachedToWindow()
            r9 = r9 ^ 1
            if (r0 != 0) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            boolean r11 = r16.isAttachedToWindow()
            goto L_0x0070
        L_0x006e:
            r9 = 0
        L_0x006f:
            r11 = 0
        L_0x0070:
            boolean r12 = f768b
            r13 = 0
            if (r12 == 0) goto L_0x008d
            if (r9 == 0) goto L_0x008d
            if (r11 != 0) goto L_0x007b
            goto L_0x0105
        L_0x007b:
            android.view.ViewParent r10 = r17.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r11 = r10.indexOfChild(r1)
            android.view.ViewGroupOverlay r12 = r16.getOverlay()
            r12.add(r1)
            goto L_0x008f
        L_0x008d:
            r10 = r13
            r11 = 0
        L_0x008f:
            float r12 = r3.width()
            int r12 = java.lang.Math.round(r12)
            float r14 = r3.height()
            int r14 = java.lang.Math.round(r14)
            if (r12 <= 0) goto L_0x00f5
            if (r14 <= 0) goto L_0x00f5
            r15 = 1233125376(0x49800000, float:1048576.0)
            int r13 = r12 * r14
            float r13 = (float) r13
            float r15 = r15 / r13
            r13 = 1065353216(0x3f800000, float:1.0)
            float r13 = java.lang.Math.min(r13, r15)
            float r12 = (float) r12
            float r12 = r12 * r13
            int r12 = java.lang.Math.round(r12)
            float r14 = (float) r14
            float r14 = r14 * r13
            int r14 = java.lang.Math.round(r14)
            float r15 = r3.left
            float r15 = -r15
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r15, r3)
            r2.postScale(r13, r13)
            boolean r3 = f769c
            if (r3 == 0) goto L_0x00e4
            android.graphics.Picture r3 = new android.graphics.Picture
            r3.<init>()
            android.graphics.Canvas r12 = r3.beginRecording(r12, r14)
            r12.concat(r2)
            r1.draw(r12)
            r3.endRecording()
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r3)
            goto L_0x00f5
        L_0x00e4:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r12, r14, r3)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r13)
            r3.concat(r2)
            r1.draw(r3)
        L_0x00f5:
            boolean r2 = f768b
            if (r2 == 0) goto L_0x0105
            if (r9 == 0) goto L_0x0105
            android.view.ViewGroupOverlay r0 = r16.getOverlay()
            r0.remove(r1)
            r10.addView(r1, r11)
        L_0x0105:
            if (r13 == 0) goto L_0x010a
            r8.setImageBitmap(r13)
        L_0x010a:
            int r0 = r6 - r4
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r2 = r7 - r5
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            r8.measure(r0, r1)
            r8.layout(r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p019b.C0311r.m683a(android.view.ViewGroup, android.view.View, android.view.View):android.view.View");
    }
}
