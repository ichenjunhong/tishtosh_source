package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import com.p683ss.android.ugc.aweme.app.C23131p;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.a */
public final class C37914a extends BitmapDrawable {

    /* renamed from: a */
    private Bitmap f96541a;

    public C37914a(Bitmap bitmap) {
        super(bitmap);
        this.f96541a = bitmap;
    }

    public final void draw(Canvas canvas) {
        if (this.f96541a != null) {
            if (this.f96541a.isRecycled()) {
                C23131p.m56692a("bitmap_draw_after_recycled", "bitmap recycled", null);
                return;
            }
            try {
                super.draw(canvas);
            } catch (Exception e) {
                C23131p.m56692a("bitmap_draw_after_recycled", e.getMessage(), null);
            }
        }
    }
}
