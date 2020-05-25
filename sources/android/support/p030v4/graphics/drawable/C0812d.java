package android.support.p030v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1039e;

/* renamed from: android.support.v4.graphics.drawable.d */
public final class C0812d {

    /* renamed from: android.support.v4.graphics.drawable.d$a */
    static class C0813a extends C0810b {
        C0813a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2610a(int i, int i2, int i3, Rect rect, Rect rect2) {
            C1039e.m2969a(i, i2, i3, rect, rect2, 0);
        }
    }

    /* renamed from: a */
    public static C0810b m2344a(Resources resources, Bitmap bitmap) {
        if (VERSION.SDK_INT >= 21) {
            return new C0811c(resources, bitmap);
        }
        return new C0813a(resources, bitmap);
    }
}
