package com.p683ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43193b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.AVCutMusicView */
public class AVCutMusicView extends View {

    /* renamed from: a */
    public C43187b f109124a;

    /* renamed from: b */
    private Paint f109125b;

    /* renamed from: c */
    private float f109126c;

    /* renamed from: d */
    private int f109127d;

    /* renamed from: e */
    private int f109128e;

    /* renamed from: f */
    private int f109129f;

    /* renamed from: g */
    private C43203d f109130g;

    /* renamed from: h */
    private RectF f109131h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.AVCutMusicView$a */
    static final class C43171a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AVCutMusicView f109132a;

        /* renamed from: b */
        final /* synthetic */ C43203d f109133b;

        C43171a(AVCutMusicView aVCutMusicView, C43203d dVar) {
            this.f109132a = aVCutMusicView;
            this.f109133b = dVar;
        }

        public final void run() {
            if (this.f109132a.f109124a != null) {
                this.f109132a.f109124a.mo87793a(this.f109133b.getMusicWavePointArray());
                this.f109132a.invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int getMHeight() {
        return this.f109128e;
    }

    /* access modifiers changed from: protected */
    public final Paint getMPaint() {
        return this.f109125b;
    }

    /* access modifiers changed from: protected */
    public final C43203d getMusicWaveBean() {
        return this.f109130g;
    }

    public final int getViewWidth() {
        return this.f109127d;
    }

    /* access modifiers changed from: protected */
    public final void setMHeight(int i) {
        this.f109128e = i;
    }

    /* access modifiers changed from: protected */
    public final void setMusicWaveBean(C43203d dVar) {
        this.f109130g = dVar;
    }

    public final void setViewWidth(int i) {
        this.f109127d = i;
    }

    /* access modifiers changed from: protected */
    public final void setMPaint(Paint paint) {
        C52711k.m112240b(paint, "<set-?>");
        this.f109125b = paint;
    }

    public AVCutMusicView(Context context) {
        C52711k.m112240b(context, "ctx");
        this(context, null, 0, 4, null);
    }

    public void setAudioWaveViewData(C43203d dVar) {
        if (dVar != null) {
            this.f109130g = dVar;
            post(new C43171a(this, dVar));
        }
    }

    public final void setColor(int i) {
        this.f109125b.setColor(i);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        canvas.save();
        this.f109124a.mo87792a(canvas);
        canvas.restore();
        canvas.save();
        this.f109131h.set(0.0f, 0.0f, ((float) this.f109129f) + (this.f109126c * ((float) getWidth())), (float) getHeight());
        canvas.clipRect(this.f109131h);
        C43187b bVar = this.f109124a;
        Paint paint = this.f109125b;
        C52711k.m112240b(canvas, "canvas");
        C52711k.m112240b(paint, "paint");
        int length = bVar.f109208f.length;
        for (int i = 0; i < length; i++) {
            int i2 = (int) (bVar.f109208f[i] * ((float) bVar.f109205c));
            int i3 = ((bVar.f109204b + bVar.f109203a) * i) + bVar.f109203a;
            int i4 = ((bVar.f109205c - i2) / 2) + bVar.f109206d;
            canvas.drawRoundRect(new RectF((float) i3, (float) i4, (float) (bVar.f109204b + i3), (float) (i2 + i4)), (float) bVar.f109207e, (float) bVar.f109207e, paint);
        }
    }

    /* renamed from: a */
    public final void mo87732a(int i, float f) {
        this.f109129f = i;
        this.f109126c = f;
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        if (this.f109130g != null) {
            C43203d dVar = this.f109130g;
            if (dVar == null) {
                C52711k.m112234a();
            }
            if (C43193b.m94756a(dVar.getMusicWavePointArray())) {
                int i3 = C43193b.m94753a().f109218a;
                C43191e a = C43193b.m94753a();
                if (a == null) {
                    C52711k.m112234a();
                }
                int i4 = a.f109219b;
                C43203d dVar2 = this.f109130g;
                if (dVar2 == null) {
                    C52711k.m112234a();
                }
                this.f109127d = ((dVar2.getMusicWavePointArray().length - 1) * (i3 + i4)) + i4;
                C43191e a2 = C43193b.m94753a();
                if (a2 == null) {
                    C52711k.m112234a();
                }
                this.f109128e = a2.f109220c;
                setMeasuredDimension(this.f109127d, this.f109128e);
                this.f109124a.mo87790a(this.f109127d, this.f109128e);
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public AVCutMusicView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f109131h = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843173}, i, 0);
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.f109125b = new Paint(1);
        this.f109125b.setStyle(Style.FILL);
        this.f109125b.setColor(color);
        this.f109124a = new C43187b();
        this.f109124a.mo87791a(context);
        this.f109124a.f109209g = false;
    }

    private /* synthetic */ AVCutMusicView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
