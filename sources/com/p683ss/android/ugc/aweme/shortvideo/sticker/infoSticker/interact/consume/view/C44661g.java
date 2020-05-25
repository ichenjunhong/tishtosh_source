package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g */
public final class C44661g extends View {

    /* renamed from: a */
    private float[] f112978a;

    /* renamed from: b */
    private final Paint f112979b = new Paint();

    /* renamed from: c */
    private final Path f112980c = new Path();

    public final Path getPath() {
        return this.f112980c;
    }

    public final float[] getPoints() {
        return this.f112978a;
    }

    public final void setPoints(float[] fArr) {
        this.f112978a = fArr;
    }

    public C44661g(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        if (C44588c.m97541a(context) && this.f112978a != null) {
            this.f112980c.reset();
            Path path = this.f112980c;
            float[] fArr = this.f112978a;
            if (fArr == null) {
                C52711k.m112234a();
            }
            float f = fArr[0];
            float[] fArr2 = this.f112978a;
            if (fArr2 == null) {
                C52711k.m112234a();
            }
            path.moveTo(f, fArr2[1]);
            Path path2 = this.f112980c;
            float[] fArr3 = this.f112978a;
            if (fArr3 == null) {
                C52711k.m112234a();
            }
            float f2 = fArr3[2];
            float[] fArr4 = this.f112978a;
            if (fArr4 == null) {
                C52711k.m112234a();
            }
            path2.lineTo(f2, fArr4[3]);
            Path path3 = this.f112980c;
            float[] fArr5 = this.f112978a;
            if (fArr5 == null) {
                C52711k.m112234a();
            }
            float f3 = fArr5[6];
            float[] fArr6 = this.f112978a;
            if (fArr6 == null) {
                C52711k.m112234a();
            }
            path3.lineTo(f3, fArr6[7]);
            Path path4 = this.f112980c;
            float[] fArr7 = this.f112978a;
            if (fArr7 == null) {
                C52711k.m112234a();
            }
            float f4 = fArr7[4];
            float[] fArr8 = this.f112978a;
            if (fArr8 == null) {
                C52711k.m112234a();
            }
            path4.lineTo(f4, fArr8[5]);
            this.f112980c.close();
            if (canvas != null) {
                canvas.drawPath(this.f112980c, this.f112979b);
            }
        }
    }
}
