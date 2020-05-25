package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a */
public final class C43546a {
    /* renamed from: a */
    public static RectF m95604a(PointF[] pointFArr) {
        float f = pointFArr[0].x;
        float f2 = pointFArr[0].y;
        float f3 = f;
        float f4 = f2;
        for (PointF pointF : pointFArr) {
            if (pointF.x < f) {
                f = pointF.x;
            }
            if (pointF.x > f3) {
                f3 = pointF.x;
            }
            if (pointF.y < f2) {
                f2 = pointF.y;
            }
            if (pointF.y > f4) {
                f4 = pointF.y;
            }
        }
        return new RectF(f, f2, f3, f4);
    }

    /* renamed from: b */
    public static boolean m95606b(Rect rect, PointF[] pointFArr) {
        if (pointFArr == null || rect == null) {
            return false;
        }
        RectF a = m95604a(pointFArr);
        if (a.right < ((float) rect.left) || a.left > ((float) rect.right) || a.bottom < ((float) rect.top) || a.top > ((float) rect.bottom)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m95605a(Rect rect, PointF[] pointFArr) {
        boolean z = false;
        if (pointFArr == null || rect == null) {
            return false;
        }
        RectF a = m95604a(pointFArr);
        if (a.right < ((float) rect.left)) {
            z = true;
        }
        if (a.left > ((float) rect.right)) {
            z = true;
        }
        if (a.bottom < ((float) rect.top)) {
            z = true;
        }
        if (a.top > ((float) rect.bottom)) {
            return true;
        }
        return z;
    }
}
