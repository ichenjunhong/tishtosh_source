package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43507as;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43549b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p2196a.C43548b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b.C44526a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b.C44539e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b.C44541f;
import com.p683ss.android.vesdk.VESize;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView */
public class InteractStickerBaseView extends FrameLayout {

    /* renamed from: A */
    private boolean f110364A;

    /* renamed from: B */
    private int f110365B;

    /* renamed from: C */
    private boolean f110366C;

    /* renamed from: D */
    private boolean f110367D;

    /* renamed from: E */
    private C44526a f110368E;

    /* renamed from: a */
    private PointF f110369a;

    /* renamed from: b */
    private PointF f110370b;

    /* renamed from: c */
    private long f110371c;

    /* renamed from: d */
    private Runnable f110372d;

    /* renamed from: e */
    protected Context f110373e;

    /* renamed from: f */
    protected float f110374f;

    /* renamed from: g */
    protected float f110375g;

    /* renamed from: h */
    protected int f110376h;

    /* renamed from: i */
    protected int f110377i;

    /* renamed from: j */
    protected StickerHelpBoxView f110378j;

    /* renamed from: k */
    protected View f110379k;

    /* renamed from: l */
    protected C43548b f110380l;

    /* renamed from: m */
    public boolean f110381m;

    /* renamed from: n */
    public boolean f110382n;

    /* renamed from: o */
    public boolean f110383o;

    /* renamed from: p */
    public boolean f110384p;

    /* renamed from: q */
    public boolean f110385q;

    /* renamed from: r */
    protected float f110386r;

    /* renamed from: s */
    protected float f110387s;

    /* renamed from: t */
    public long f110388t;

    /* renamed from: u */
    public boolean f110389u;

    /* renamed from: v */
    public C43549b f110390v;

    /* renamed from: w */
    private boolean f110391w;

    /* renamed from: x */
    private int f110392x;

    /* renamed from: y */
    private boolean f110393y;

    /* renamed from: z */
    private boolean f110394z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView$a */
    public class C43604a implements C44541f {
        /* renamed from: c */
        public final void mo88480c() {
        }

        /* renamed from: d */
        public final void mo88481d() {
        }

        /* renamed from: e */
        public final void mo88482e() {
        }

        /* renamed from: a */
        public final void mo88478a() {
            if (InteractStickerBaseView.this.f110380l != null) {
                InteractStickerBaseView.this.f110380l.mo88698b();
            }
        }

        /* renamed from: b */
        public final void mo88479b() {
            if (InteractStickerBaseView.this.f110380l != null) {
                InteractStickerBaseView.this.f110380l.mo88694a();
            }
        }

        public C43604a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo88710b() {
        return true;
    }

    /* renamed from: d */
    public boolean mo88713d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo88714e() {
        return false;
    }

    public View getContentView() {
        return this.f110379k;
    }

    public View getDrawView() {
        return null;
    }

    public boolean getLockMode() {
        return this.f110394z;
    }

    public float getRotateAngle() {
        return this.f110375g;
    }

    public float getScale() {
        return this.f110374f;
    }

    /* renamed from: m */
    private boolean m95817m() {
        if (this.f110392x == 1) {
            return true;
        }
        return false;
    }

    public PointF[] getFourAnglePoint() {
        return this.f110378j.getFourAnglePoint();
    }

    public RectF getViewPositionRect() {
        return this.f110378j.getViewBoxRect();
    }

    /* renamed from: i */
    public final void mo88887i() {
        m95814a(false);
    }

    /* renamed from: j */
    public final boolean mo88888j() {
        return this.f110378j.f110419e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ void mo88890l() {
        m95814a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C44526a mo88705a() {
        return new C44539e(this, new C43604a());
    }

    public int getContentViewHeight() {
        return (int) (((float) this.f110379k.getMeasuredHeight()) * this.f110374f);
    }

    public int getContentViewWidth() {
        return (int) (((float) this.f110379k.getMeasuredWidth()) * this.f110374f);
    }

    /* renamed from: k */
    public final boolean mo88889k() {
        if (this.f110392x == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f110368E.mo90471f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f110368E.mo90472g();
    }

    public PointF getContentViewPoint() {
        return new PointF(this.f110379k.getX(), this.f110379k.getY());
    }

    /* renamed from: h */
    public final boolean mo88886h() {
        if (this.f110381m || this.f110382n || this.f110383o || mo88889k()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void mo88712c() {
        if (mo88710b()) {
            this.f110378j.mo88907b();
            if (this.f110372d != null) {
                this.f110378j.removeCallbacks(this.f110372d);
            }
            this.f110378j.postDelayed(this.f110372d, 3000);
        }
    }

    /* renamed from: f */
    public final void mo88875f() {
        Rect rect = new Rect();
        int x = (int) this.f110379k.getX();
        int y = (int) this.f110379k.getY();
        rect.set(x, y, this.f110379k.getMeasuredWidth() + x, this.f110379k.getMeasuredHeight() + y);
        this.f110378j.mo88905a(rect);
        this.f110378j.mo88904a(this.f110374f, this.f110375g);
        this.f110378j.setStickerShowHelpboxCallback(new C43609d(this));
    }

    /* renamed from: g */
    public final void mo88876g() {
        float f;
        mo88875f();
        this.f110378j.mo88903a();
        float f2 = 0.0f;
        if (this.f110380l != null) {
            PointF a = this.f110380l.mo88691a(0.0f, 0.0f);
            f2 = a.x;
            f = a.y;
        } else {
            f = 0.0f;
        }
        float x = this.f110379k.getX() + f2;
        float y = this.f110379k.getY() + f;
        if (this.f110380l == null || !this.f110394z || this.f110380l.mo88700b(f2, f)) {
            this.f110379k.setX(x);
            this.f110379k.setY(y);
            this.f110378j.mo88908b(f2, f);
        }
    }

    public void setLockMode(boolean z) {
        this.f110394z = z;
    }

    public void setStickerEditListener(C43548b bVar) {
        this.f110380l = bVar;
    }

    public InteractStickerBaseView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m95814a(boolean z) {
        this.f110378j.mo88906a(z);
    }

    /* renamed from: a */
    public final PointF mo88863a(VESize vESize) {
        Rect rect = new Rect();
        this.f110379k.getHitRect(rect);
        rect.centerX();
        return new PointF(rect.exactCenterX(), rect.exactCenterY());
    }

    /* renamed from: b */
    public final void mo88870b(float f) {
        this.f110375g -= f;
        this.f110379k.setRotation(this.f110375g);
        this.f110378j.mo88904a(this.f110374f, this.f110375g);
    }

    /* renamed from: d */
    public final void mo88874d(float f) {
        this.f110374f *= f;
        this.f110379k.setScaleX(this.f110374f);
        this.f110379k.setScaleY(this.f110374f);
        this.f110378j.mo88904a(this.f110374f, this.f110375g);
    }

    /* renamed from: a */
    public final void mo88864a(float f) {
        mo88867a(f, Boolean.valueOf(true));
    }

    /* renamed from: c */
    public final void mo88873c(float f) {
        if (this.f110380l == null || !this.f110394z || this.f110380l.mo88701c(f)) {
            this.f110374f *= f;
            if (this.f110374f > this.f110386r) {
                this.f110374f = this.f110386r;
            } else if (this.f110374f < this.f110387s) {
                this.f110374f = this.f110387s;
            } else {
                this.f110379k.setScaleX(this.f110374f);
                this.f110379k.setScaleY(this.f110374f);
                this.f110378j.mo88904a(this.f110374f, this.f110375g);
            }
        }
    }

    /* renamed from: b */
    public boolean mo88711b(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!mo88710b()) {
            return false;
        }
        m95816c(motionEvent.getX(), motionEvent.getY());
        this.f110370b.set(motionEvent.getRawX(), motionEvent.getRawY());
        this.f110393y = this.f110378j.mo88909c(this.f110369a.x, this.f110369a.y);
        m95816c(this.f110379k.getX() + ((float) (this.f110379k.getWidth() / 2)), this.f110379k.getY() + ((float) (this.f110379k.getHeight() / 2)));
        this.f110369a.x += (float) this.f110376h;
        if (this.f110392x != -1) {
            if (this.f110380l != null && !mo88714e()) {
                RectF rectF = new RectF(this.f110378j.getHelpBoxRect());
                PointF a = mo88863a((VESize) null);
                if (this.f110390v != null) {
                    this.f110390v.f110203c = a.x - this.f110390v.f110203c;
                    this.f110390v.f110204d = a.y - this.f110390v.f110204d;
                }
                this.f110380l.mo88696a(this, this.f110369a.x, this.f110369a.y, rectF, true, this.f110390v);
            }
            if (System.currentTimeMillis() - this.f110371c > 300 && !mo88714e() && this.f110391w) {
                mo88712c();
                this.f110391w = false;
            }
            if (System.currentTimeMillis() - this.f110371c < 300 && !mo88714e()) {
                if (!m95817m()) {
                    if (this.f110392x == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (this.f110380l != null) {
                            this.f110380l.mo88694a();
                        }
                    } else if (mo88888j() || (this.f110366C && this.f110365B < 2)) {
                        if (this.f110380l != null && this.f110393y) {
                            new C43507as().f110029a.storeBoolean("interact_sticker_hint_set", true);
                            this.f110380l.mo88694a();
                        }
                        if (this.f110367D) {
                            mo88887i();
                        }
                    } else {
                        mo88712c();
                    }
                } else if (this.f110380l != null) {
                    this.f110380l.mo88695a(this);
                }
            }
            if (this.f110380l != null) {
                this.f110380l.mo88690a(true, false, mo88713d());
            }
            z = true;
        } else {
            if (this.f110382n && this.f110380l != null && !mo88714e()) {
                RectF rectF2 = new RectF(this.f110378j.getHelpBoxRect());
                PointF a2 = mo88863a((VESize) null);
                if (this.f110390v != null) {
                    this.f110390v.f110203c = a2.x - this.f110390v.f110203c;
                    this.f110390v.f110204d = a2.y - this.f110390v.f110204d;
                }
                this.f110380l.mo88696a(this, this.f110369a.x, this.f110369a.y, rectF2, true, this.f110390v);
                this.f110380l.mo88690a(true, true, mo88713d());
            }
            z = false;
        }
        if (m95817m()) {
            this.f110385q = true;
        }
        if (this.f110381m) {
            this.f110388t = System.currentTimeMillis();
        }
        this.f110389u = !this.f110384p;
        this.f110381m = false;
        this.f110383o = false;
        this.f110382n = false;
        this.f110384p = false;
        this.f110392x = -1;
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo88709a(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.mo88710b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            android.graphics.PointF r0 = r8.mo88863a(r0)
            float r2 = r0.x
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r0 = r0.y
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b r3 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b
            float r4 = r8.f110375g
            float r5 = r8.f110374f
            float r2 = r2.floatValue()
            float r0 = r0.floatValue()
            r3.<init>(r4, r5, r2, r0)
            r8.f110390v = r3
            r8.f110366C = r1
            r8.f110384p = r1
            boolean r0 = r8.f110367D
            r2 = 1
            if (r0 != 0) goto L_0x0056
            float r0 = r9.getX()
            float r3 = r9.getY()
            r8.m95816c(r0, r3)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView r0 = r8.f110378j
            android.graphics.PointF r3 = r8.f110369a
            float r3 = r3.x
            android.graphics.PointF r4 = r8.f110369a
            float r4 = r4.y
            android.graphics.RectF r5 = r0.f110416b
            float r0 = r0.f110418d
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a.m95253b(r5, r3, r4, r0)
            if (r0 == 0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            boolean r3 = r8.f110367D
            if (r3 != 0) goto L_0x007c
            float r3 = r9.getX()
            float r4 = r9.getY()
            r8.m95816c(r3, r4)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView r3 = r8.f110378j
            android.graphics.PointF r4 = r8.f110369a
            float r4 = r4.x
            android.graphics.PointF r5 = r8.f110369a
            float r5 = r5.y
            android.graphics.RectF r6 = r3.f110415a
            float r3 = r3.f110418d
            boolean r3 = com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a.m95253b(r6, r4, r5, r3)
            if (r3 == 0) goto L_0x007c
            r3 = 1
            goto L_0x007d
        L_0x007c:
            r3 = 0
        L_0x007d:
            boolean r4 = r8.f110367D
            if (r4 != 0) goto L_0x00a1
            float r4 = r9.getX()
            float r5 = r9.getY()
            r8.m95816c(r4, r5)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView r4 = r8.f110378j
            android.graphics.PointF r5 = r8.f110369a
            float r5 = r5.x
            android.graphics.PointF r6 = r8.f110369a
            float r6 = r6.y
            android.graphics.RectF r7 = r4.f110417c
            float r4 = r4.f110418d
            boolean r4 = com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a.m95253b(r7, r5, r6, r4)
            if (r4 == 0) goto L_0x00a1
            r1 = 1
        L_0x00a1:
            float r4 = r9.getX()
            float r5 = r9.getY()
            boolean r4 = r8.mo88872b(r4, r5)
            r8.f110381m = r4
            r4 = -1
            if (r0 == 0) goto L_0x00b6
            r0 = 2
            r8.f110392x = r0
            goto L_0x00cb
        L_0x00b6:
            if (r3 == 0) goto L_0x00bb
            r8.f110392x = r2
            goto L_0x00cb
        L_0x00bb:
            boolean r0 = r8.f110381m
            if (r0 == 0) goto L_0x00c3
            r0 = 3
            r8.f110392x = r0
            goto L_0x00cb
        L_0x00c3:
            if (r1 == 0) goto L_0x00c9
            r0 = 4
            r8.f110392x = r0
            goto L_0x00cb
        L_0x00c9:
            r8.f110392x = r4
        L_0x00cb:
            int r0 = r8.f110392x
            if (r0 == r4) goto L_0x00d1
            r8.f110384p = r2
        L_0x00d1:
            boolean r0 = r8.f110384p
            if (r0 != 0) goto L_0x00d8
            r8.mo88887i()
        L_0x00d8:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.m95816c(r0, r9)
            long r0 = java.lang.System.currentTimeMillis()
            r8.f110371c = r0
            boolean r9 = r8.f110384p
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView.mo88709a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final boolean mo88869a(C20382b bVar) {
        int i;
        if (!mo88710b() || !mo88886h()) {
            return false;
        }
        if (Math.abs(bVar.f55897i.x) + Math.abs(bVar.f55897i.y) < 1.0f) {
            return true;
        }
        if (mo88888j()) {
            this.f110366C = true;
        }
        this.f110365B = (int) (Math.abs(bVar.f55897i.x) + Math.abs(bVar.f55897i.y));
        if (!mo88889k()) {
            mo88866a(bVar.f55897i.x, bVar.f55897i.y, Boolean.valueOf(true));
            m95816c(this.f110379k.getX() + ((float) (this.f110379k.getWidth() / 2)), this.f110379k.getY() + ((float) (this.f110379k.getHeight() / 2)));
            this.f110369a.x += (float) this.f110376h;
            if (mo88886h() && this.f110380l != null) {
                this.f110380l.mo88696a(this, this.f110369a.x, this.f110369a.y, new RectF(this.f110378j.getHelpBoxRect()), false, null);
            }
        } else if (this.f110391w) {
            float f = bVar.f55897i.x;
            float f2 = bVar.f55897i.y;
            float centerX = this.f110378j.getHelpBoxRect().centerX();
            float centerY = this.f110378j.getHelpBoxRect().centerY();
            float centerX2 = this.f110378j.getRotateRect().centerX();
            float centerY2 = this.f110378j.getRotateRect().centerY();
            float f3 = f + centerX2;
            float f4 = f2 + centerY2;
            float f5 = centerX2 - centerX;
            float f6 = centerY2 - centerY;
            float f7 = f3 - centerX;
            float f8 = f4 - centerY;
            float sqrt = (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
            float sqrt2 = (float) Math.sqrt((double) ((f7 * f7) + (f8 * f8)));
            mo88873c(sqrt2 / sqrt);
            double d = (double) (((f5 * f7) + (f6 * f8)) / (sqrt * sqrt2));
            if (d <= 1.0d && d >= -1.0d) {
                float degrees = (float) Math.toDegrees(Math.acos(d));
                if ((f5 * f8) - (f7 * f6) > 0.0f) {
                    i = 1;
                } else {
                    i = -1;
                }
                mo88864a(-(((float) i) * degrees));
            }
        }
        if (!this.f110391w) {
            this.f110391w = mo88888j();
        }
        mo88887i();
        return true;
    }

    /* renamed from: b */
    public final void mo88871b(int i, int i2) {
        this.f110376h = i;
        this.f110377i = i2;
    }

    /* renamed from: c */
    private void m95816c(float f, float f2) {
        this.f110369a.set(f, f2);
        this.f110369a.offset((float) (-this.f110376h), (float) (-this.f110377i));
    }

    /* renamed from: b */
    public final boolean mo88872b(float f, float f2) {
        m95816c(f, f2);
        return this.f110378j.mo88909c(this.f110369a.x, this.f110369a.y);
    }

    public InteractStickerBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f110374f = 1.0f;
        this.f110369a = new PointF();
        this.f110370b = new PointF();
        this.f110372d = new C43607b(this);
        this.f110392x = -1;
        this.f110393y = false;
        this.f110394z = false;
        this.f110386r = 11.0f;
        this.f110387s = 0.4f;
        this.f110364A = false;
        this.f110388t = 0;
        this.f110365B = 0;
        this.f110366C = false;
        this.f110389u = false;
        this.f110367D = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities);
        this.f110368E = mo88705a();
    }

    /* renamed from: a */
    public final void mo88865a(float f, float f2) {
        float y = this.f110379k.getY() + f2;
        this.f110379k.setX(this.f110379k.getX() + f);
        this.f110379k.setY(y);
        this.f110378j.mo88908b(f, f2);
    }

    /* renamed from: a */
    public final void mo88867a(float f, Boolean bool) {
        if (this.f110380l != null) {
            int i = -1;
            if (bool.booleanValue()) {
                i = this.f110380l.mo88690a(false, true, mo88713d());
            }
            if (this.f110394z && !this.f110380l.mo88699b(f)) {
                return;
            }
            if (4 == i) {
                f = this.f110380l.mo88693a(f).floatValue();
            }
        }
        this.f110375g -= f;
        this.f110379k.setRotation(this.f110375g);
        this.f110378j.mo88904a(this.f110374f, this.f110375g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88868a(boolean z, boolean z2) {
        if (this.f110380l != null) {
            if (!z) {
                this.f110380l.mo88697a(false);
            } else if (mo88710b()) {
                this.f110380l.mo88697a(true);
            }
        }
        if (this.f110367D) {
            if (z && mo88710b()) {
                this.f110368E.mo90466a(this.f110378j.getHelpBoxRect(), (int) this.f110370b.x, (int) this.f110370b.y, this.f110378j.getRotateAngle());
            } else if (z2) {
                this.f110368E.mo90465a();
            } else {
                this.f110368E.mo90467b();
            }
        }
    }

    public InteractStickerBaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f110374f = 1.0f;
        this.f110369a = new PointF();
        this.f110370b = new PointF();
        this.f110372d = new C43608c(this);
        this.f110392x = -1;
        this.f110393y = false;
        this.f110394z = false;
        this.f110386r = 11.0f;
        this.f110387s = 0.4f;
        this.f110364A = false;
        this.f110388t = 0;
        this.f110365B = 0;
        this.f110366C = false;
        this.f110389u = false;
        this.f110367D = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities);
        this.f110368E = mo88705a();
    }

    /* renamed from: a */
    public final void mo88866a(float f, float f2, Boolean bool) {
        int i;
        if (this.f110380l != null) {
            if (bool.booleanValue()) {
                i = this.f110380l.mo88690a(false, false, mo88713d());
            } else {
                i = -1;
            }
            if (-1 != i) {
                PointF a = this.f110380l.mo88692a(f, f2, mo88713d());
                if (3 == i) {
                    f = a.x;
                    f2 = a.y;
                }
            }
        }
        float x = this.f110379k.getX() + f;
        float y = this.f110379k.getY() + f2;
        if (this.f110380l == null || !this.f110394z || this.f110380l.mo88700b(f, f2)) {
            this.f110379k.setX(x);
            this.f110379k.setY(y);
            this.f110378j.mo88908b(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f110364A != z) {
            this.f110364A = z;
            mo88875f();
        }
    }
}
