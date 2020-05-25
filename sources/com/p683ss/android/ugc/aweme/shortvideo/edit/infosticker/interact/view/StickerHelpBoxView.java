package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView */
public class StickerHelpBoxView extends View {

    /* renamed from: A */
    private Paint f110412A;

    /* renamed from: B */
    private PointF[] f110413B;

    /* renamed from: C */
    private C43605a f110414C;

    /* renamed from: a */
    RectF f110415a;

    /* renamed from: b */
    RectF f110416b;

    /* renamed from: c */
    RectF f110417c;

    /* renamed from: d */
    float f110418d;

    /* renamed from: e */
    public boolean f110419e;

    /* renamed from: f */
    private Context f110420f;

    /* renamed from: g */
    private Rect f110421g;

    /* renamed from: h */
    private RectF f110422h;

    /* renamed from: i */
    private RectF f110423i;

    /* renamed from: j */
    private RectF f110424j;

    /* renamed from: k */
    private Bitmap f110425k;

    /* renamed from: l */
    private Bitmap f110426l;

    /* renamed from: m */
    private Bitmap f110427m;

    /* renamed from: n */
    private RectF f110428n;

    /* renamed from: o */
    private RectF f110429o;

    /* renamed from: p */
    private Paint f110430p;

    /* renamed from: q */
    private RectF f110431q;

    /* renamed from: r */
    private Paint f110432r;

    /* renamed from: s */
    private int f110433s;

    /* renamed from: t */
    private int f110434t;

    /* renamed from: u */
    private int f110435u;

    /* renamed from: v */
    private int f110436v;

    /* renamed from: w */
    private int f110437w;

    /* renamed from: x */
    private float f110438x;

    /* renamed from: y */
    private boolean f110439y;

    /* renamed from: z */
    private boolean f110440z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView$a */
    public interface C43605a {
        /* renamed from: a */
        void mo88918a(boolean z, boolean z2);
    }

    public PointF[] getFourAnglePoint() {
        return this.f110413B;
    }

    public RectF getHelpBoxRect() {
        return this.f110429o;
    }

    public float getRotateAngle() {
        return this.f110418d;
    }

    public RectF getRotateRect() {
        return this.f110416b;
    }

    public RectF getViewBoxRect() {
        return this.f110431q;
    }

    /* renamed from: b */
    public final void mo88907b() {
        if (!this.f110419e) {
            this.f110419e = true;
            invalidate();
            if (this.f110414C != null) {
                this.f110414C.mo88918a(true, false);
            }
        }
    }

    /* renamed from: a */
    public final void mo88903a() {
        RectF rectF = new RectF(this.f110428n);
        C43454a.m95251a(rectF, this.f110438x);
        if (this.f110439y) {
            this.f110431q.set(rectF.left - ((float) this.f110434t), rectF.top - ((float) this.f110435u), rectF.right + ((float) this.f110434t), rectF.bottom + ((float) this.f110435u));
        } else {
            this.f110431q.set(rectF);
        }
        this.f110429o.set(this.f110431q.left - ((float) this.f110433s), this.f110431q.top - ((float) this.f110433s), this.f110431q.right + ((float) this.f110433s), this.f110431q.bottom + ((float) this.f110433s));
        float width = (float) (((int) this.f110415a.width()) >> 1);
        this.f110415a.offsetTo(this.f110429o.left - width, this.f110429o.top - width);
        this.f110416b.offsetTo(this.f110429o.right - width, this.f110429o.bottom - width);
        this.f110417c.offsetTo(this.f110429o.left - width, this.f110429o.bottom - width);
        this.f110422h.set(this.f110415a);
        this.f110423i.set(this.f110416b);
        this.f110424j.set(this.f110417c);
        C43454a.m95252a(this.f110415a, this.f110429o.centerX(), this.f110429o.centerY(), this.f110418d);
        C43454a.m95252a(this.f110416b, this.f110429o.centerX(), this.f110429o.centerY(), this.f110418d);
        C43454a.m95252a(this.f110417c, this.f110429o.centerX(), this.f110429o.centerY(), this.f110418d);
        this.f110413B[0].x = this.f110431q.left;
        this.f110413B[0].y = this.f110431q.top;
        this.f110413B[1].x = this.f110431q.right;
        this.f110413B[1].y = this.f110431q.top;
        this.f110413B[2].x = this.f110431q.left;
        this.f110413B[2].y = this.f110431q.bottom;
        this.f110413B[3].x = this.f110431q.right;
        this.f110413B[3].y = this.f110431q.bottom;
        for (PointF a : this.f110413B) {
            C43454a.m95250a(a, this.f110429o.centerX(), this.f110429o.centerY(), (float) Math.toRadians((double) this.f110418d));
        }
    }

    public void setStickerShowHelpboxCallback(C43605a aVar) {
        this.f110414C = aVar;
    }

    public StickerHelpBoxView(Context context) {
        this(context, null);
    }

    public void setShowBg(boolean z) {
        this.f110439y = z;
        invalidate();
    }

    /* renamed from: a */
    public final void mo88905a(Rect rect) {
        this.f110428n.set(rect);
    }

    /* renamed from: a */
    public final void mo88906a(boolean z) {
        if (this.f110419e) {
            this.f110419e = false;
            invalidate();
            if (this.f110414C != null) {
                this.f110414C.mo88918a(false, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo88903a();
        canvas.save();
        canvas.rotate(this.f110418d, this.f110428n.centerX(), this.f110428n.centerY());
        if (this.f110439y) {
            canvas.drawRoundRect(this.f110431q, (float) this.f110436v, (float) this.f110436v, this.f110432r);
        }
        if (this.f110419e) {
            if (this.f110440z) {
                this.f110430p.setColor(-1);
                canvas.drawRect(this.f110429o, this.f110430p);
            } else {
                this.f110430p.setColor(-2130706433);
                canvas.drawRect(this.f110429o, this.f110430p);
                canvas.drawBitmap(this.f110425k, this.f110421g, this.f110422h, null);
                canvas.drawBitmap(this.f110426l, this.f110421g, this.f110423i, null);
                canvas.drawBitmap(this.f110427m, this.f110421g, this.f110424j, null);
            }
        }
        canvas.restore();
    }

    /* renamed from: a */
    public final void mo88904a(float f, float f2) {
        this.f110438x = f;
        this.f110418d = f2;
        invalidate();
    }

    /* renamed from: b */
    public final void mo88908b(float f, float f2) {
        this.f110428n.offset(f, f2);
        invalidate();
    }

    /* renamed from: c */
    public final boolean mo88909c(float f, float f2) {
        return C43454a.m95253b(this.f110429o, f, f2, this.f110418d);
    }

    public StickerHelpBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f110415a = new RectF();
        this.f110416b = new RectF();
        this.f110417c = new RectF();
        this.f110421g = new Rect();
        this.f110422h = new RectF();
        this.f110423i = new RectF();
        this.f110424j = new RectF();
        this.f110428n = new RectF();
        this.f110429o = new RectF();
        this.f110430p = new Paint();
        this.f110431q = new RectF();
        this.f110432r = new Paint();
        this.f110433s = 10;
        this.f110434t = 10;
        this.f110435u = 10;
        this.f110436v = 10;
        this.f110437w = 30;
        this.f110419e = false;
        this.f110439y = false;
        this.f110440z = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities);
        this.f110413B = new PointF[]{new PointF(), new PointF(), new PointF(), new PointF()};
        this.f110420f = context;
        this.f110437w = (int) C9432q.m18687b(context, 14.0f);
        this.f110425k = BitmapFactory.decodeResource(this.f110420f.getResources(), R.drawable.aea);
        this.f110426l = BitmapFactory.decodeResource(this.f110420f.getResources(), R.drawable.aec);
        this.f110427m = BitmapFactory.decodeResource(this.f110420f.getResources(), R.drawable.a21);
        this.f110415a = new RectF(0.0f, 0.0f, (float) (this.f110437w << 1), (float) (this.f110437w << 1));
        this.f110416b = new RectF(0.0f, 0.0f, (float) (this.f110437w << 1), (float) (this.f110437w << 1));
        this.f110417c = new RectF(0.0f, 0.0f, (float) (this.f110437w << 1), (float) (this.f110437w << 1));
        this.f110421g.set(0, 0, this.f110425k.getWidth(), this.f110425k.getHeight());
        this.f110430p.setColor(-2130706433);
        this.f110430p.setStyle(Style.STROKE);
        this.f110430p.setAntiAlias(true);
        this.f110430p.setStrokeWidth(2.0f);
        this.f110432r = new Paint(this.f110430p);
        this.f110432r.setColor(-1);
        this.f110432r.setStyle(Style.FILL);
        this.f110433s = (int) C9432q.m18687b(this.f110420f, 10.0f);
        this.f110434t = (int) C9432q.m18687b(this.f110420f, 16.0f);
        this.f110435u = (int) C9432q.m18687b(this.f110420f, 8.0f);
        this.f110436v = (int) C9432q.m18687b(this.f110420f, 5.0f);
        this.f110412A = new Paint();
        this.f110412A.setColor(-65536);
    }
}
