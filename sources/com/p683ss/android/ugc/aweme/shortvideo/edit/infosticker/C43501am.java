package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.p2195a.C43488a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a;
import com.p683ss.android.ugc.aweme.sticker.data.C45868a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am */
public final class C43501am implements C43509at<C43488a>, Cloneable {

    /* renamed from: A */
    private static final int f109991A = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 14.0f));

    /* renamed from: B */
    private static final int f109992B = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 8.0f));

    /* renamed from: a */
    static final float f109993a = C9432q.m18687b((Context) C39629l.m88233b(), 44.0f);

    /* renamed from: k */
    static Bitmap f109994k;

    /* renamed from: l */
    static Bitmap f109995l;

    /* renamed from: m */
    static Bitmap f109996m;

    /* renamed from: z */
    private static final int f109997z = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 12.0f));

    /* renamed from: C */
    private final C43530d f109998C;

    /* renamed from: D */
    private PointF[] f109999D = {new PointF(), new PointF(), new PointF(), new PointF()};

    /* renamed from: E */
    private Paint f110000E;

    /* renamed from: b */
    public float f110001b = 0.15f;

    /* renamed from: c */
    public float f110002c = 3.0f;

    /* renamed from: d */
    public StickerItemModel f110003d;

    /* renamed from: e */
    boolean f110004e;

    /* renamed from: f */
    Paint f110005f = new Paint();

    /* renamed from: g */
    public RectF f110006g;

    /* renamed from: h */
    Rect f110007h;

    /* renamed from: i */
    public RectF f110008i;

    /* renamed from: j */
    public Matrix f110009j;

    /* renamed from: n */
    RectF f110010n;

    /* renamed from: o */
    RectF f110011o;

    /* renamed from: p */
    RectF f110012p;

    /* renamed from: q */
    public RectF f110013q;

    /* renamed from: r */
    public RectF f110014r;

    /* renamed from: s */
    public RectF f110015s;

    /* renamed from: t */
    public long f110016t;

    /* renamed from: u */
    public boolean f110017u = true;

    /* renamed from: v */
    PointF[] f110018v = new PointF[4];

    /* renamed from: w */
    public float f110019w = 1.0f;

    /* renamed from: x */
    public boolean f110020x = false;

    /* renamed from: y */
    boolean f110021y = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities);

    /* renamed from: d */
    public final int mo88515d() {
        return this.f110003d.startTime;
    }

    /* renamed from: e */
    public final int mo88516e() {
        return this.f110003d.endTime;
    }

    /* renamed from: f */
    public final float mo88518f() {
        return this.f110003d.rotateAngle;
    }

    public final int hashCode() {
        return this.f110003d.hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C43501am clone() {
        try {
            return (C43501am) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo88508a() {
        if (this.f110003d.isLyric()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public C43488a mo52072c() {
        C43488a aVar = new C43488a(this.f110003d.startTime, this.f110003d.endTime, this.f110003d.rotateAngle, this.f110003d.scale, this.f110003d.currentOffsetX, this.f110003d.currentOffsetY);
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo88510b() {
        this.f110008i.left -= (float) f109997z;
        this.f110008i.right += (float) f109997z;
        this.f110008i.top -= (float) f109997z;
        this.f110008i.bottom += (float) f109997z;
    }

    /* renamed from: a */
    public final int mo52063a(int i) {
        return mo88515d();
    }

    /* renamed from: b */
    public final int mo52069b(int i) {
        return mo88516e();
    }

    /* renamed from: c */
    public final int mo52071c(int i) {
        return this.f110003d.uiStartTime;
    }

    /* renamed from: d */
    public final int mo52073d(int i) {
        return this.f110003d.uiEndTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43501am)) {
            return false;
        }
        return this.f110003d.equals(((C43501am) obj).f110003d);
    }

    public final void setAlpha(boolean z) {
        if (z) {
            this.f109998C.f110111e.mo43041c(this.f110003d.f91605id, 1.0f);
        } else {
            this.f109998C.f110111e.mo43041c(this.f110003d.f91605id, 0.3137255f);
        }
    }

    /* renamed from: b */
    private static void m95340b(RectF rectF) {
        rectF.left -= (float) f109992B;
        rectF.right += (float) f109992B;
        rectF.top -= (float) f109992B;
        rectF.bottom += (float) f109992B;
    }

    /* renamed from: a */
    public final void mo88505a(float f) {
        if (f != 0.0f) {
            this.f110009j.postRotate(f, this.f110006g.centerX(), this.f110006g.centerY());
            C43454a.m95252a(this.f110013q, this.f110006g.centerX(), this.f110006g.centerY(), f);
            C43454a.m95252a(this.f110014r, this.f110006g.centerX(), this.f110006g.centerY(), f);
            C43454a.m95252a(this.f110015s, this.f110006g.centerX(), this.f110006g.centerY(), f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo88507a(RectF rectF) {
        this.f110007h = new Rect(0, 0, f109994k.getWidth(), f109994k.getHeight());
        this.f110010n = new RectF(rectF.left - ((float) f109991A), rectF.top - ((float) f109991A), rectF.left + ((float) f109991A), rectF.top + ((float) f109991A));
        this.f110011o = new RectF(rectF.right - ((float) f109991A), rectF.bottom - ((float) f109991A), rectF.right + ((float) f109991A), rectF.bottom + ((float) f109991A));
        this.f110012p = new RectF(rectF.right - ((float) f109991A), rectF.top - ((float) f109991A), rectF.right + ((float) f109991A), rectF.top + ((float) f109991A));
        this.f110013q = new RectF(this.f110011o);
        this.f110014r = new RectF(this.f110010n);
        this.f110015s = new RectF(this.f110012p);
        m95340b(this.f110013q);
        m95340b(this.f110014r);
        m95340b(this.f110015s);
        for (int i = 0; i < 4; i++) {
            this.f110018v[i] = new PointF();
        }
    }

    /* renamed from: b */
    public final void mo88511b(float f) {
        this.f110019w *= f;
        this.f110009j.postScale(f, f, this.f110006g.centerX(), this.f110006g.centerY());
        C43454a.m95251a(this.f110006g, f);
        this.f110008i.set(this.f110006g);
        mo88510b();
        this.f110011o.offsetTo(this.f110008i.right - ((float) f109991A), this.f110008i.bottom - ((float) f109991A));
        this.f110010n.offsetTo(this.f110008i.left - ((float) f109991A), this.f110008i.top - ((float) f109991A));
        this.f110012p.offsetTo(this.f110008i.right - ((float) f109991A), this.f110008i.top - ((float) f109991A));
        this.f110013q.offsetTo(this.f110011o.left - ((float) f109992B), this.f110011o.top - ((float) f109992B));
        this.f110014r.offsetTo(this.f110010n.left - ((float) f109992B), this.f110010n.top - ((float) f109992B));
        this.f110015s.offsetTo(this.f110012p.left - ((float) f109992B), this.f110012p.top - ((float) f109992B));
        C43454a.m95252a(this.f110013q, this.f110006g.centerX(), this.f110006g.centerY(), this.f110003d.rotateAngle);
        C43454a.m95252a(this.f110014r, this.f110006g.centerX(), this.f110006g.centerY(), this.f110003d.rotateAngle);
        C43454a.m95252a(this.f110015s, this.f110006g.centerX(), this.f110006g.centerY(), this.f110003d.rotateAngle);
    }

    /* renamed from: c */
    public final PointF[] mo88513c(float f) {
        this.f109999D[0].x = this.f110006g.left;
        this.f109999D[0].y = this.f110006g.top;
        this.f109999D[1].x = this.f110006g.right;
        this.f109999D[1].y = this.f110006g.top;
        this.f109999D[2].x = this.f110006g.right;
        this.f109999D[2].y = this.f110006g.bottom;
        this.f109999D[3].x = this.f110006g.left;
        this.f109999D[3].y = this.f110006g.bottom;
        for (PointF a : this.f109999D) {
            C43454a.m95250a(a, this.f110006g.centerX(), this.f110006g.centerY(), (float) Math.toRadians((double) mo88518f()));
        }
        PointF pointF = this.f109999D[0];
        pointF.x -= f;
        PointF pointF2 = this.f109999D[1];
        pointF2.x -= f;
        PointF pointF3 = this.f109999D[2];
        pointF3.x -= f;
        PointF pointF4 = this.f109999D[3];
        pointF4.x -= f;
        return this.f109999D;
    }

    /* renamed from: a */
    public final void mo88506a(float f, float f2) {
        this.f110009j.postTranslate(f, f2);
        this.f110006g.offset(f, f2);
        this.f110008i.offset(f, f2);
        this.f110010n.offset(f, f2);
        this.f110011o.offset(f, f2);
        this.f110012p.offset(f, f2);
        this.f110013q.offset(f, f2);
        this.f110014r.offset(f, f2);
        this.f110015s.offset(f, f2);
    }

    /* renamed from: b */
    public final PointF[] mo88512b(float f, float f2) {
        PointF[] pointFArr = new PointF[this.f110018v.length];
        for (int i = 0; i < pointFArr.length; i++) {
            pointFArr[i] = new PointF();
            pointFArr[i].x = this.f110018v[i].x;
            pointFArr[i].y = this.f110018v[i].y;
        }
        int length = pointFArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            PointF pointF = pointFArr[i2];
            C43454a.m95250a(pointF, this.f110006g.centerX(), this.f110006g.centerY(), (float) Math.toRadians((double) mo88518f()));
            pointF.x -= f;
            pointF.y -= f2;
        }
        return pointFArr;
    }

    C43501am(Context context, StickerItemModel stickerItemModel, C43530d dVar) {
        this.f110003d = stickerItemModel;
        this.f109998C = dVar;
        this.f110005f.setColor(context.getResources().getColor(R.color.pm));
        this.f110005f.setStyle(Style.STROKE);
        this.f110005f.setAntiAlias(true);
        this.f110005f.setStrokeWidth(2.0f);
        this.f110000E = new Paint();
        this.f110000E.setColor(-65536);
        if (f109994k == null) {
            f109994k = BitmapFactory.decodeResource(context.getResources(), R.drawable.aea);
        }
        if (f109995l == null) {
            f109995l = BitmapFactory.decodeResource(context.getResources(), R.drawable.aec);
        }
        if (f109996m == null) {
            f109996m = BitmapFactory.decodeResource(context.getResources(), R.drawable.aef);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo52068a(C45868a aVar, int i, int i2) {
        C43488a aVar2 = (C43488a) aVar;
        C43530d dVar = this.f109998C;
        dVar.mo88600a(this, aVar2.f109963a, aVar2.f109964b, false);
        C43488a h = mo52072c();
        dVar.mo88599a(this, (aVar2.f109967e - h.f109967e) * ((float) i), (aVar2.f109968f - h.f109968f) * ((float) i2));
        dVar.mo88598a(this, aVar2.f109965c - h.f109965c);
        dVar.mo88606b(this, aVar2.f109966d / h.f109966d);
    }

    /* renamed from: a */
    public final boolean mo88509a(int i, int i2, int i3, int i4, float f, float f2) {
        float f3 = ((((float) i) * f) - (this.f110003d.initWidth / 2.0f)) + ((float) i3);
        float f4 = ((((float) i2) * f2) - (this.f110003d.initHeight / 2.0f)) + ((float) i4);
        this.f110006g = new RectF(f3, f4, this.f110003d.initWidth + f3, this.f110003d.initHeight + f4);
        this.f110009j = new Matrix();
        if (this.f110020x) {
            this.f110001b = 0.5f;
            this.f110002c = 3.0f;
        } else {
            this.f110001b = Math.max(f109993a / this.f110003d.initWidth, f109993a / this.f110003d.initHeight);
        }
        this.f110008i = new RectF(this.f110006g);
        mo88510b();
        mo88507a(this.f110008i);
        return true;
    }
}
