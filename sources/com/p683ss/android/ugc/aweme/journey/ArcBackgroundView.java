package com.p683ss.android.ugc.aweme.journey;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.journey.ArcBackgroundView */
public final class ArcBackgroundView extends View {

    /* renamed from: a */
    private int f91672a;

    /* renamed from: b */
    private int f91673b;

    /* renamed from: c */
    private int f91674c;

    /* renamed from: d */
    private Path f91675d;

    /* renamed from: e */
    private int f91676e;

    /* renamed from: f */
    private ShapeDrawable f91677f;

    /* renamed from: g */
    private PathShape f91678g;

    /* renamed from: h */
    private RectF f91679h;

    /* renamed from: i */
    private boolean f91680i;

    public ArcBackgroundView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ArcBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f91675d;
        if (path == null) {
            C52711k.m112234a();
        }
        path.reset();
        Path path2 = this.f91675d;
        if (path2 == null) {
            C52711k.m112234a();
        }
        path2.moveTo(0.0f, 0.0f);
        Path path3 = this.f91675d;
        if (path3 == null) {
            C52711k.m112234a();
        }
        path3.arcTo(this.f91679h, 0.0f, 180.0f);
        Path path4 = this.f91675d;
        if (path4 == null) {
            C52711k.m112234a();
        }
        path4.lineTo(0.0f, (float) this.f91673b);
        Path path5 = this.f91675d;
        if (path5 == null) {
            C52711k.m112234a();
        }
        path5.lineTo((float) this.f91672a, (float) this.f91673b);
        Path path6 = this.f91675d;
        if (path6 == null) {
            C52711k.m112234a();
        }
        path6.lineTo((float) this.f91672a, 0.0f);
        Path path7 = this.f91675d;
        if (path7 == null) {
            C52711k.m112234a();
        }
        path7.close();
        if (this.f91678g == null || this.f91680i) {
            Path path8 = this.f91675d;
            if (path8 == null) {
                C52711k.m112234a();
            }
            this.f91678g = new PathShape(path8, (float) this.f91672a, (float) this.f91673b);
            if (this.f91680i) {
                this.f91680i = false;
            }
        }
        ShapeDrawable shapeDrawable = this.f91677f;
        if (shapeDrawable == null) {
            C52711k.m112234a();
        }
        shapeDrawable.setShape(this.f91678g);
        ShapeDrawable shapeDrawable2 = this.f91677f;
        if (shapeDrawable2 == null) {
            C52711k.m112234a();
        }
        shapeDrawable2.setBounds(0, 0, this.f91672a, this.f91673b);
        ShapeDrawable shapeDrawable3 = this.f91677f;
        if (shapeDrawable3 == null) {
            C52711k.m112234a();
        }
        Paint paint = shapeDrawable3.getPaint();
        C52711k.m112236a((Object) paint, "mShapeDrawable!!.paint");
        paint.setColor(this.f91676e);
        ShapeDrawable shapeDrawable4 = this.f91677f;
        if (shapeDrawable4 == null) {
            C52711k.m112234a();
        }
        shapeDrawable4.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f91672a = MeasureSpec.getSize(i);
        this.f91673b = MeasureSpec.getSize(i2);
        this.f91680i = true;
    }

    public ArcBackgroundView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aas, R.attr.aat});
        this.f91676e = obtainStyledAttributes.getColor(0, this.f91676e);
        this.f91674c = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f91675d = new Path();
        obtainStyledAttributes.recycle();
        this.f91677f = new ShapeDrawable();
        this.f91679h = new RectF(0.0f, (float) (-this.f91674c), (float) (this.f91674c * 2), (float) this.f91674c);
    }

    public /* synthetic */ ArcBackgroundView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
