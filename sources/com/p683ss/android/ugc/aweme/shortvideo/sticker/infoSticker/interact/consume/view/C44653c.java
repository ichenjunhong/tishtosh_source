package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.c */
public final class C44653c extends View {

    /* renamed from: a */
    private List<float[]> f112957a;

    /* renamed from: b */
    private final Paint f112958b = new Paint();

    /* renamed from: c */
    private final Path f112959c = new Path();

    public final List<float[]> getPoints() {
        return this.f112957a;
    }

    public final void setPoints(List<float[]> list) {
        this.f112957a = list;
    }

    public C44653c(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        if (C44588c.m97541a(context) && this.f112957a != null) {
            List<float[]> list = this.f112957a;
            if (list != null) {
                for (float[] fArr : list) {
                    if (fArr != null) {
                        this.f112959c.reset();
                        this.f112959c.moveTo(fArr[0], fArr[1]);
                        this.f112959c.lineTo(fArr[2], fArr[3]);
                        this.f112959c.lineTo(fArr[6], fArr[7]);
                        this.f112959c.lineTo(fArr[4], fArr[5]);
                        this.f112959c.close();
                        if (canvas != null) {
                            canvas.drawPath(this.f112959c, this.f112958b);
                        }
                    }
                }
            }
        }
    }
}
