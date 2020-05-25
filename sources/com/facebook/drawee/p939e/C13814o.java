package com.facebook.drawee.p939e;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.imagepipeline.p976p.C14237b;

/* renamed from: com.facebook.drawee.e.o */
public final class C13814o extends C13813n {
    public C13814o(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    public final void draw(Canvas canvas) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("RoundedNinePatchDrawable#draw");
        }
        if (!mo25850a()) {
            super.draw(canvas);
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            return;
        }
        mo25863b();
        mo25864c();
        canvas.clipPath(this.f36033f);
        super.draw(canvas);
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }
}
