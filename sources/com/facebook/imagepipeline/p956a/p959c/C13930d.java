package com.facebook.imagepipeline.p956a.p959c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p956a.p957a.C13905a;
import com.facebook.imagepipeline.p956a.p957a.C13906b;
import com.facebook.imagepipeline.p956a.p957a.C13906b.C13907a;
import com.facebook.imagepipeline.p956a.p957a.C13906b.C13908b;

/* renamed from: com.facebook.imagepipeline.a.c.d */
public final class C13930d {

    /* renamed from: a */
    private final C13905a f36341a;

    /* renamed from: b */
    private final C13932a f36342b;

    /* renamed from: c */
    private final Paint f36343c = new Paint();

    /* renamed from: com.facebook.imagepipeline.a.c.d$a */
    public interface C13932a {
        /* renamed from: a */
        C13715a<Bitmap> mo26023a(int i);
    }

    /* renamed from: com.facebook.imagepipeline.a.c.d$b */
    enum C13933b {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    /* renamed from: a */
    private boolean m28390a(int i) {
        if (i == 0) {
            return true;
        }
        C13906b a = this.f36341a.mo26074a(i);
        C13906b a2 = this.f36341a.mo26074a(i - 1);
        if (a.f36287f == C13907a.NO_BLEND && m28391a(a)) {
            return true;
        }
        if (a2.f36288g != C13908b.DISPOSE_TO_BACKGROUND || !m28391a(a2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m28391a(C13906b bVar) {
        if (bVar.f36283b == 0 && bVar.f36284c == 0 && bVar.f36285d == this.f36341a.mo26080e() && bVar.f36286e == this.f36341a.mo26081f()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m28389a(Canvas canvas, C13906b bVar) {
        canvas.drawRect((float) bVar.f36283b, (float) bVar.f36284c, (float) (bVar.f36283b + bVar.f36285d), (float) (bVar.f36284c + bVar.f36286e), this.f36343c);
    }

    public C13930d(C13905a aVar, C13932a aVar2) {
        this.f36341a = aVar;
        this.f36342b = aVar2;
        this.f36343c.setColor(0);
        this.f36343c.setStyle(Style.FILL);
        this.f36343c.setXfermode(new PorterDuffXfermode(Mode.SRC));
    }

    /* renamed from: a */
    private int m28388a(int i, Canvas canvas) {
        C13933b bVar;
        while (i >= 0) {
            C13906b a = this.f36341a.mo26074a(i);
            C13908b bVar2 = a.f36288g;
            if (bVar2 == C13908b.DISPOSE_DO_NOT) {
                bVar = C13933b.REQUIRED;
            } else if (bVar2 == C13908b.DISPOSE_TO_BACKGROUND) {
                if (m28391a(a)) {
                    bVar = C13933b.NOT_REQUIRED;
                } else {
                    bVar = C13933b.REQUIRED;
                }
            } else if (bVar2 == C13908b.DISPOSE_TO_PREVIOUS) {
                bVar = C13933b.SKIP;
            } else {
                bVar = C13933b.ABORT;
            }
            switch (bVar) {
                case REQUIRED:
                    C13906b a2 = this.f36341a.mo26074a(i);
                    C13715a a3 = this.f36342b.mo26023a(i);
                    if (a3 == null) {
                        if (!m28390a(i)) {
                            break;
                        } else {
                            return i;
                        }
                    } else {
                        try {
                            canvas.drawBitmap((Bitmap) a3.mo25630a(), 0.0f, 0.0f, null);
                            if (a2.f36288g == C13908b.DISPOSE_TO_BACKGROUND) {
                                m28389a(canvas, a2);
                            }
                            return i + 1;
                        } finally {
                            a3.close();
                        }
                    }
                case NOT_REQUIRED:
                    return i + 1;
                case ABORT:
                    return i;
            }
            i--;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo26099a(int i, Bitmap bitmap) {
        int i2;
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, Mode.SRC);
        if (!m28390a(i)) {
            i2 = m28388a(i - 1, canvas);
        } else {
            i2 = i;
        }
        while (i2 < i) {
            C13906b a = this.f36341a.mo26074a(i2);
            C13908b bVar = a.f36288g;
            if (bVar != C13908b.DISPOSE_TO_PREVIOUS) {
                if (a.f36287f == C13907a.NO_BLEND) {
                    m28389a(canvas, a);
                }
                this.f36341a.mo26075a(i2, canvas);
                if (bVar == C13908b.DISPOSE_TO_BACKGROUND) {
                    m28389a(canvas, a);
                }
            }
            i2++;
        }
        C13906b a2 = this.f36341a.mo26074a(i);
        if (a2.f36287f == C13907a.NO_BLEND) {
            m28389a(canvas, a2);
        }
        this.f36341a.mo26075a(i, canvas);
    }
}
