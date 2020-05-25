package com.bytedance.ies.dmt.p664ui.widget;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build.VERSION;
import android.view.View;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.dmt.ui.widget.g */
public final class C10727g {

    /* renamed from: a */
    public float[] f28713a = new float[8];

    /* renamed from: b */
    public Path f28714b;

    /* renamed from: c */
    public Paint f28715c;

    /* renamed from: d */
    public boolean f28716d;

    /* renamed from: e */
    public int f28717e;

    /* renamed from: f */
    public int f28718f;

    /* renamed from: g */
    public ColorStateList f28719g;

    /* renamed from: h */
    public int f28720h;

    /* renamed from: i */
    public boolean f28721i;

    /* renamed from: j */
    public Region f28722j;

    /* renamed from: k */
    public RectF f28723k;

    /* renamed from: a */
    public final void mo19284a(View view) {
        float f;
        C52711k.m112240b(view, "view");
        RectF rectF = this.f28723k;
        if (rectF == null) {
            C52711k.m112237a("mLayer");
        }
        int width = (int) rectF.width();
        RectF rectF2 = this.f28723k;
        if (rectF2 == null) {
            C52711k.m112237a("mLayer");
        }
        int height = (int) rectF2.height();
        RectF rectF3 = new RectF();
        rectF3.left = (float) view.getPaddingLeft();
        rectF3.top = (float) view.getPaddingTop();
        float f2 = (float) width;
        rectF3.right = f2 - ((float) view.getPaddingRight());
        float f3 = (float) height;
        rectF3.bottom = f3 - ((float) view.getPaddingBottom());
        Path path = this.f28714b;
        if (path == null) {
            C52711k.m112237a("mClipPath");
        }
        path.reset();
        if (this.f28716d) {
            if (rectF3.width() >= rectF3.height()) {
                f = rectF3.height();
            } else {
                f = rectF3.width();
            }
            float f4 = f / 2.0f;
            float f5 = (float) (height / 2);
            PointF pointF = new PointF((float) (width / 2), f5);
            if (VERSION.SDK_INT <= 27) {
                Path path2 = this.f28714b;
                if (path2 == null) {
                    C52711k.m112237a("mClipPath");
                }
                path2.addCircle(pointF.x, pointF.y, f4, Direction.CW);
                Path path3 = this.f28714b;
                if (path3 == null) {
                    C52711k.m112237a("mClipPath");
                }
                path3.moveTo(0.0f, 0.0f);
                Path path4 = this.f28714b;
                if (path4 == null) {
                    C52711k.m112237a("mClipPath");
                }
                path4.moveTo(f2, f3);
            } else {
                float f6 = f5 - f4;
                Path path5 = this.f28714b;
                if (path5 == null) {
                    C52711k.m112237a("mClipPath");
                }
                path5.moveTo(rectF3.left, f6);
                Path path6 = this.f28714b;
                if (path6 == null) {
                    C52711k.m112237a("mClipPath");
                }
                path6.addCircle(pointF.x, f6 + f4, f4, Direction.CW);
            }
        } else {
            Path path7 = this.f28714b;
            if (path7 == null) {
                C52711k.m112237a("mClipPath");
            }
            path7.addRoundRect(rectF3, this.f28713a, Direction.CW);
        }
        Region region = new Region((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
        Region region2 = this.f28722j;
        if (region2 == null) {
            C52711k.m112237a("mAreaRegion");
        }
        Path path8 = this.f28714b;
        if (path8 == null) {
            C52711k.m112237a("mClipPath");
        }
        region2.setPath(path8, region);
    }
}
