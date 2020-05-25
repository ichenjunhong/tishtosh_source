package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.SystemClock;
import android.support.p030v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.lighten.p766a.p770d.C12186c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout.C44926a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout */
public class RecordLayout extends FrameLayout implements OnTouchListener {

    /* renamed from: A */
    public boolean f115211A;

    /* renamed from: B */
    private float f115212B;

    /* renamed from: C */
    private float f115213C;

    /* renamed from: D */
    private int f115214D;

    /* renamed from: E */
    private int f115215E;

    /* renamed from: F */
    private int f115216F;

    /* renamed from: G */
    private int f115217G;

    /* renamed from: H */
    private int f115218H;

    /* renamed from: I */
    private int f115219I;

    /* renamed from: J */
    private int f115220J;

    /* renamed from: K */
    private int f115221K;

    /* renamed from: L */
    private long f115222L;

    /* renamed from: M */
    private int f115223M;

    /* renamed from: N */
    private final int f115224N;

    /* renamed from: O */
    private long f115225O;

    /* renamed from: P */
    private long f115226P;

    /* renamed from: Q */
    private int[] f115227Q;

    /* renamed from: R */
    private C45612j f115228R;

    /* renamed from: S */
    private Activity f115229S;

    /* renamed from: T */
    private ArgbEvaluator f115230T;

    /* renamed from: U */
    private DashPathEffect f115231U;

    /* renamed from: V */
    private OnClickListener f115232V;

    /* renamed from: a */
    protected float f115233a;

    /* renamed from: b */
    protected float f115234b;

    /* renamed from: c */
    protected float f115235c;

    /* renamed from: d */
    protected int f115236d;

    /* renamed from: e */
    protected int f115237e;

    /* renamed from: f */
    protected int f115238f;

    /* renamed from: g */
    protected int f115239g;

    /* renamed from: h */
    protected Paint f115240h;

    /* renamed from: i */
    protected Paint f115241i;

    /* renamed from: j */
    protected float f115242j;

    /* renamed from: k */
    protected float f115243k;

    /* renamed from: l */
    protected long f115244l;

    /* renamed from: m */
    protected final RectF f115245m;

    /* renamed from: n */
    public boolean f115246n;

    /* renamed from: o */
    protected boolean f115247o;

    /* renamed from: p */
    protected boolean f115248p;

    /* renamed from: q */
    protected long f115249q;

    /* renamed from: r */
    protected boolean f115250r;

    /* renamed from: s */
    protected boolean f115251s;

    /* renamed from: t */
    protected boolean f115252t;

    /* renamed from: u */
    public C45582a f115253u;

    /* renamed from: v */
    public ImageView f115254v;

    /* renamed from: w */
    public FrameLayout f115255w;

    /* renamed from: x */
    protected ScaleGestureDetector f115256x;

    /* renamed from: y */
    protected C44926a f115257y;

    /* renamed from: z */
    protected C45583b f115258z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a */
    public enum C45582a {
        DEFAULT,
        PLAN_A,
        PLAN_B,
        PLAN_C
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b */
    public interface C45583b {
        /* renamed from: a */
        void mo87875a(float f);

        /* renamed from: a */
        void mo87876a(int i);

        /* renamed from: a */
        boolean mo87877a();

        /* renamed from: b */
        void mo87878b();

        /* renamed from: c */
        void mo87879c();

        /* renamed from: d */
        void mo87880d();

        /* renamed from: e */
        void mo87881e();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$c */
    class C45584c implements C45583b {

        /* renamed from: b */
        private final C45583b f115266b;

        /* renamed from: d */
        public final void mo87880d() {
            this.f115266b.mo87880d();
        }

        /* renamed from: e */
        public final void mo87881e() {
            this.f115266b.mo87881e();
        }

        /* renamed from: a */
        public final boolean mo87877a() {
            return this.f115266b.mo87877a();
        }

        /* renamed from: b */
        public final void mo87878b() {
            if (!RecordLayout.this.f115211A) {
                this.f115266b.mo87878b();
                RecordLayout.this.f115211A = true;
            }
        }

        /* renamed from: c */
        public final void mo87879c() {
            if (RecordLayout.this.f115211A) {
                this.f115266b.mo87879c();
                RecordLayout.this.f115211A = false;
            }
        }

        /* renamed from: a */
        public final void mo87875a(float f) {
            this.f115266b.mo87875a(f);
        }

        /* renamed from: a */
        public final void mo87876a(int i) {
            this.f115266b.mo87876a(i);
        }

        public C45584c(C45583b bVar) {
            this.f115266b = bVar;
        }
    }

    public int getCurrentScaleMode() {
        return this.f115238f;
    }

    public int getMode() {
        return this.f115237e;
    }

    /* renamed from: l */
    private void m99267l() {
        if (this.f115223M != -1) {
            this.f115237e = this.f115223M;
            this.f115223M = -1;
            invalidate();
        }
    }

    /* renamed from: d */
    private void m99256d() {
        if (this.f115255w == null) {
            return;
        }
        if (this.f115253u == C45582a.PLAN_B || this.f115253u == C45582a.PLAN_C) {
            this.f115255w.setVisibility(0);
        }
    }

    /* renamed from: e */
    private void m99259e() {
        if (this.f115255w == null) {
            return;
        }
        if (this.f115253u == C45582a.PLAN_B || this.f115253u == C45582a.PLAN_C) {
            this.f115255w.setVisibility(8);
        }
    }

    /* renamed from: g */
    private void m99262g() {
        if (this.f115254v != null && this.f115253u == C45582a.PLAN_C) {
            this.f115254v.setVisibility(0);
        }
    }

    /* renamed from: i */
    private void m99264i() {
        if (this.f115254v != null && this.f115253u == C45582a.PLAN_C) {
            this.f115254v.setVisibility(8);
        }
    }

    /* renamed from: j */
    private void m99265j() {
        if (this.f115240h != null && this.f115241i != null) {
            this.f115240h.setColor(this.f115217G);
            this.f115241i.setColor(this.f115218H);
        }
    }

    /* renamed from: m */
    private boolean m99268m() {
        if (System.currentTimeMillis() - this.f115225O < 300) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo91898a() {
        if (this.f115236d == 1) {
            mo91902b(2);
            invalidate();
            return;
        }
        if (this.f115236d == 3 || this.f115236d == 2) {
            mo91902b(4);
        }
    }

    /* renamed from: b */
    public final void mo91901b() {
        m99267l();
        if (this.f115236d == 3 || this.f115236d == 2) {
            mo91902b(4);
            this.f115211A = false;
        }
    }

    public DashPathEffect getDashPathEffect() {
        if (this.f115231U == null) {
            this.f115231U = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        }
        return this.f115231U;
    }

    /* renamed from: h */
    private void m99263h() {
        if (this.f115254v != null && this.f115253u == C45582a.PLAN_C) {
            if (this.f115237e == 3) {
                this.f115254v.setImageResource(R.drawable.cd7);
            } else if (this.f115237e == 1) {
                this.f115254v.setImageResource(R.drawable.cd6);
            }
        }
    }

    /* renamed from: k */
    private void m99266k() {
        if (this.f115240h != null && this.f115241i != null) {
            this.f115240h.setColor(getResources().getColor(R.color.a3c));
            this.f115241i.setColor(getResources().getColor(R.color.a3e));
        }
    }

    /* renamed from: c */
    public final void mo91903c() {
        m99267l();
        setHasBeenMoveScaled(false);
        this.f115258z.mo87881e();
        if (this.f115236d == 3 || this.f115236d == 2) {
            mo91902b(4);
        }
        this.f115258z.mo87879c();
        this.f115249q = System.currentTimeMillis();
        invalidate();
    }

    /* renamed from: f */
    private void m99261f() {
        if (this.f115255w != null) {
            if (this.f115253u == C45582a.PLAN_B) {
                if (this.f115237e == 3) {
                    this.f115255w.setBackground(C42430at.m93195a(this.f115218H, 0, (int) C12186c.m24630a(getContext(), 8.0f)));
                } else if (this.f115237e == 1) {
                    this.f115255w.setBackground(C42430at.m93195a(0, this.f115215E, 0));
                }
            } else if (this.f115253u == C45582a.PLAN_C) {
                if (this.f115237e == 3) {
                    this.f115255w.setBackground(C42430at.m93195a(0, this.f115217G, 0));
                } else if (this.f115237e == 1) {
                    this.f115255w.setBackground(C42430at.m93195a(0, this.f115215E, 0));
                }
            }
        }
    }

    public void setActivity(Activity activity) {
        this.f115229S = activity;
    }

    public void setCurrentScaleMode(int i) {
        this.f115238f = i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setOnGestureListener(C44926a aVar) {
        this.f115257y = aVar;
    }

    public void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.f115256x = scaleGestureDetector;
    }

    public RecordLayout(Context context) {
        this(context, null);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private int m99253c(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return this.f115224N;
    }

    /* renamed from: d */
    private void m99257d(int i) {
        this.f115239g = i;
        this.f115222L = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public final void mo91899a(int i) {
        super.setOnClickListener(this.f115232V);
        this.f115223M = this.f115237e;
        this.f115237e = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo91902b(int i) {
        this.f115236d = i;
        this.f115244l = SystemClock.uptimeMillis();
    }

    public void setColorSchemeBackground(FrameLayout frameLayout) {
        this.f115255w = frameLayout;
        m99261f();
        m99256d();
    }

    public void setColorSchemeIcon(ImageView imageView) {
        this.f115254v = imageView;
        m99263h();
        m99262g();
    }

    public void setHasBeenMoveScaled(boolean z) {
        this.f115246n = z;
        this.f115225O = System.currentTimeMillis();
    }

    public void setRecordListener(C45583b bVar) {
        if (bVar != null) {
            this.f115258z = new C45584c(bVar);
        } else {
            this.f115258z = null;
        }
    }

    /* renamed from: b */
    private int m99252b(long j) {
        int i;
        int i2;
        if (this.f115251s) {
            i2 = this.f115218H;
            i = this.f115216F;
        } else if (this.f115250r) {
            i2 = this.f115216F;
            i = this.f115218H;
        } else {
            i2 = this.f115218H;
            i = this.f115218H;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (uptimeMillis > 300) {
            return i;
        }
        return ((Integer) this.f115230T.evaluate((((float) uptimeMillis) * 1.0f) / 300.0f, Integer.valueOf(i2), Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    private int m99249a(long j) {
        int i;
        int i2;
        if (this.f115251s) {
            i2 = this.f115217G;
            i = this.f115215E;
        } else if (this.f115250r) {
            i2 = this.f115215E;
            i = this.f115217G;
        } else {
            i2 = this.f115217G;
            i = this.f115217G;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f115244l > 300) {
            return i;
        }
        return ((Integer) this.f115230T.evaluate((((float) (uptimeMillis - j)) * 1.0f) / 300.0f, Integer.valueOf(i2), Integer.valueOf(i))).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        if (r11.f115244l != 2) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (r11.f115239g != 0) goto L_0x0194;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.isEnabled()
            r1 = 1
            if (r0 != 0) goto L_0x000f
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            if (r0 == 0) goto L_0x000e
            r12.getAction()
        L_0x000e:
            return r1
        L_0x000f:
            int r0 = r12.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0039
            com.ss.android.ugc.aweme.shortvideo.widget.j r3 = r11.f115228R
            if (r3 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.shortvideo.widget.j r3 = r11.f115228R
            android.support.v4.app.FragmentActivity r4 = r3.f115375a
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = com.p683ss.android.ugc.aweme.shortvideo.widget.C45612j.m99352a(r4)
            boolean r5 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100085i(r4)
            if (r5 == 0) goto L_0x0035
            boolean r5 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100093q(r4)
            if (r5 != 0) goto L_0x0035
            com.ss.android.ugc.aweme.sticker.k r3 = r3.f115376b
            r3.mo90502a(r4)
            r3 = 1
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            if (r3 == 0) goto L_0x0039
            return r1
        L_0x0039:
            r3 = 261(0x105, float:3.66E-43)
            r4 = 2
            if (r0 == r3) goto L_0x0046
            r3 = 517(0x205, float:7.24E-43)
            if (r0 == r3) goto L_0x0043
            goto L_0x0048
        L_0x0043:
            r11.f115238f = r4
            goto L_0x0048
        L_0x0046:
            r11.f115238f = r1
        L_0x0048:
            int r3 = r11.f115237e
            r5 = 4
            r6 = 3
            if (r3 != r6) goto L_0x01a4
            long r7 = android.os.SystemClock.uptimeMillis()
            r3 = 0
            if (r0 != 0) goto L_0x00c9
            long r7 = android.os.SystemClock.uptimeMillis()
            r11.f115226P = r7
            float r0 = r12.getX()
            r11.f115233a = r0
            float r0 = r12.getY()
            r11.f115234b = r0
            float r0 = r12.getRawX()
            r11.f115212B = r0
            float r0 = r12.getRawY()
            r11.f115213C = r0
            int r0 = r11.f115236d
            if (r0 != r1) goto L_0x0086
            int[] r0 = r11.f115227Q
            r11.getLocationOnScreen(r0)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            r0.mo87878b()
            r11.mo91902b(r4)
            goto L_0x0191
        L_0x0086:
            int r0 = r11.f115236d
            if (r0 != r5) goto L_0x00b7
            android.app.Activity r0 = r11.f115229S
            if (r0 == 0) goto L_0x00a4
            android.app.Activity r0 = r11.f115229S
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity
            if (r0 == 0) goto L_0x00a4
            android.app.Activity r0 = r11.f115229S
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = (com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity) r0
            com.ss.android.ugc.aweme.shortvideo.ui.b.a r0 = r0.f113766E
            com.ss.android.ugc.asve.recorder.view.ASCameraView r0 = r0.mo91307M()
            boolean r0 = r0.mo43642g()
            if (r0 != 0) goto L_0x0194
        L_0x00a4:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            r0.mo87878b()
            r11.mo91902b(r4)
            r11.m99257d(r2)
            r11.f115248p = r2
            r11.f115242j = r3
            r11.f115243k = r3
            goto L_0x0191
        L_0x00b7:
            int r0 = r11.f115236d
            if (r0 == r6) goto L_0x00c3
            long r2 = r11.f115244l
            r6 = 2
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0194
        L_0x00c3:
            int r0 = r11.f115239g
            if (r0 != 0) goto L_0x0194
            goto L_0x0189
        L_0x00c9:
            if (r0 != r4) goto L_0x0145
            int r0 = r11.f115236d
            if (r0 == r6) goto L_0x00d3
            int r0 = r11.f115236d
            if (r0 != r4) goto L_0x0141
        L_0x00d3:
            float r0 = r12.getX()
            float r5 = r11.f115233a
            float r0 = r0 - r5
            r11.f115242j = r0
            float r0 = r12.getY()
            float r5 = r11.f115234b
            float r0 = r0 - r5
            r11.f115243k = r0
            int r0 = r11.f115239g
            if (r0 != 0) goto L_0x012f
            float r0 = r12.getRawX()
            float r5 = r11.f115212B
            float r0 = r0 - r5
            double r5 = (double) r0
            float r0 = r12.getRawY()
            float r7 = r11.f115213C
            float r0 = r0 - r7
            double r7 = (double) r0
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r5
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r7
            double r5 = r5 + r7
            double r5 = java.lang.Math.sqrt(r5)
            int r0 = r11.f115224N
            int r0 = r0 / r4
            double r7 = (double) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x011e
            boolean r0 = r11.f115248p
            if (r0 != 0) goto L_0x011e
            r11.m99257d(r4)
            goto L_0x0141
        L_0x011e:
            boolean r0 = r11.f115248p
            if (r0 == 0) goto L_0x0141
            r11.f115242j = r3
            r11.f115243k = r3
            r11.setHasBeenMoveScaled(r2)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            r0.mo87881e()
            goto L_0x0141
        L_0x012f:
            int r0 = r11.f115238f
            if (r0 == 0) goto L_0x0137
            int r0 = r11.f115238f
            if (r0 != r1) goto L_0x0141
        L_0x0137:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            float r2 = r12.getY()
            float r2 = -r2
            r0.mo87875a(r2)
        L_0x0141:
            r11.invalidate()
            goto L_0x0194
        L_0x0145:
            if (r0 == r1) goto L_0x0149
            if (r0 != r6) goto L_0x0194
        L_0x0149:
            int r0 = r11.f115239g
            if (r0 != 0) goto L_0x0175
            int r0 = r11.f115236d
            if (r0 == r6) goto L_0x0155
            int r0 = r11.f115236d
            if (r0 != r4) goto L_0x0191
        L_0x0155:
            long r4 = r11.f115226P
            long r7 = r7 - r4
            r4 = 350(0x15e, double:1.73E-321)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0191
            r11.setHasBeenMoveScaled(r2)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            r0.mo87881e()
            r11.f115248p = r1
            r11.f115242j = r3
            r11.f115243k = r3
            r11.m99257d(r2)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            r0.mo87876a(r1)
            goto L_0x0191
        L_0x0175:
            int r0 = r11.f115238f
            if (r0 == 0) goto L_0x017d
            int r0 = r11.f115238f
            if (r0 != r1) goto L_0x0189
        L_0x017d:
            boolean r0 = r11.f115246n
            if (r0 == 0) goto L_0x0189
            r11.setHasBeenMoveScaled(r2)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            r0.mo87881e()
        L_0x0189:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            r0.mo87879c()
            r11.mo91902b(r5)
        L_0x0191:
            r11.invalidate()
        L_0x0194:
            android.view.ScaleGestureDetector r0 = r11.f115256x
            if (r0 == 0) goto L_0x01a3
            boolean r0 = r11.m99268m()
            if (r0 != 0) goto L_0x01a3
            android.view.ScaleGestureDetector r0 = r11.f115256x
            r0.onTouchEvent(r12)
        L_0x01a3:
            return r1
        L_0x01a4:
            if (r0 != 0) goto L_0x01b9
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r11.f115249q
            long r7 = r7 - r9
            r9 = 300(0x12c, double:1.48E-321)
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x01b4
            return r1
        L_0x01b4:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r3 = r11.f115258z
            r3.mo87876a(r2)
        L_0x01b9:
            int r3 = r11.f115237e
            if (r3 != 0) goto L_0x024d
            if (r0 != 0) goto L_0x01e4
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            boolean r0 = r0.mo87877a()
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x023d
            float r0 = r12.getX()
            r11.f115233a = r0
            float r0 = r12.getY()
            r11.f115234b = r0
            float r0 = r11.f115234b
            r11.f115235c = r0
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            r0.mo87878b()
            r11.mo91902b(r4)
            r11.invalidate()
            goto L_0x023d
        L_0x01e4:
            if (r0 != r4) goto L_0x0211
            float r0 = r12.getX()
            float r2 = r11.f115233a
            float r0 = r0 - r2
            r11.f115242j = r0
            float r0 = r12.getY()
            float r2 = r11.f115234b
            float r0 = r0 - r2
            r11.f115243k = r0
            int r0 = r11.f115238f
            if (r0 == 0) goto L_0x0200
            int r0 = r11.f115238f
            if (r0 != r1) goto L_0x023d
        L_0x0200:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            float r2 = r12.getY()
            float r2 = -r2
            r0.mo87875a(r2)
            float r0 = r12.getY()
            r11.f115235c = r0
            goto L_0x023d
        L_0x0211:
            if (r0 == r1) goto L_0x0218
            if (r0 != r6) goto L_0x0216
            goto L_0x0218
        L_0x0216:
            r1 = 0
            goto L_0x023d
        L_0x0218:
            int r0 = r11.f115238f
            if (r0 == 0) goto L_0x0220
            int r0 = r11.f115238f
            if (r0 != r1) goto L_0x022c
        L_0x0220:
            boolean r0 = r11.f115246n
            if (r0 == 0) goto L_0x022c
            r11.setHasBeenMoveScaled(r2)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            r0.mo87881e()
        L_0x022c:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r0 = r11.f115258z
            r0.mo87879c()
            long r2 = java.lang.System.currentTimeMillis()
            r11.f115249q = r2
            r11.mo91902b(r5)
            r11.invalidate()
        L_0x023d:
            android.view.ScaleGestureDetector r0 = r11.f115256x
            if (r0 == 0) goto L_0x024c
            boolean r0 = r11.m99268m()
            if (r0 != 0) goto L_0x024c
            android.view.ScaleGestureDetector r0 = r11.f115256x
            r0.onTouchEvent(r12)
        L_0x024c:
            return r1
        L_0x024d:
            android.view.ScaleGestureDetector r0 = r11.f115256x
            if (r0 == 0) goto L_0x025c
            boolean r0 = r11.m99268m()
            if (r0 != 0) goto L_0x025c
            android.view.ScaleGestureDetector r0 = r11.f115256x
            r0.onTouchEvent(r12)
        L_0x025c:
            r11.requestFocus()
            boolean r12 = super.onTouchEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.widget.RecordLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0439, code lost:
        if (r5 == 2) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0476, code lost:
        if (r7 == 1) goto L_0x0478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0478, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04a7, code lost:
        if (r7 == 2) goto L_0x0478;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r0.f115236d
            r3 = 0
            r4 = 6
            if (r2 != r4) goto L_0x0024
            android.graphics.Paint r2 = r0.f115240h
            long r4 = r0.f115244l
            int r4 = r0.m99249a(r4)
            r2.setColor(r4)
            android.graphics.Paint r2 = r0.f115241i
            long r4 = r0.f115244l
            int r4 = r0.m99252b(r4)
            r2.setColor(r4)
            r0.m99250a(r1, r3, r3)
            return
        L_0x0024:
            int r2 = r0.f115236d
            r4 = 7
            r10 = 1
            if (r2 != r4) goto L_0x0044
            android.graphics.Paint r2 = r0.f115240h
            long r4 = r0.f115244l
            int r4 = r0.m99249a(r4)
            r2.setColor(r4)
            android.graphics.Paint r2 = r0.f115241i
            long r4 = r0.f115244l
            int r4 = r0.m99252b(r4)
            r2.setColor(r4)
            r0.m99250a(r1, r3, r10)
            return
        L_0x0044:
            int r2 = r0.f115236d
            r4 = 8
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            r6 = 0
            r7 = 1062836634(0x3f59999a, float:0.85)
            r8 = 300(0x12c, double:1.48E-321)
            r11 = 1133903872(0x43960000, float:300.0)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r2 != r4) goto L_0x00f0
            android.graphics.Paint r2 = r0.f115240h
            long r13 = r0.f115244l
            int r4 = r0.m99249a(r13)
            r2.setColor(r4)
            android.graphics.Paint r2 = r0.f115241i
            long r13 = r0.f115244l
            int r4 = r0.m99252b(r13)
            r2.setColor(r4)
            long r13 = android.os.SystemClock.uptimeMillis()
            long r3 = r0.f115244l
            long r16 = android.os.SystemClock.uptimeMillis()
            int r2 = r0.f115221K
            float r2 = (float) r2
            float r2 = r2 * r7
            long r3 = r16 - r3
            float r3 = (float) r3
            float r3 = r3 * r12
            float r3 = r3 / r11
            float r3 = r12 - r3
            float r2 = r2 * r3
            int r2 = (int) r2
            float r2 = (float) r2
            long r3 = r0.f115244l
            int r3 = r0.f115220J
            float r3 = (float) r3
            android.graphics.Paint r4 = r0.f115241i
            float r7 = r3 - r2
            r4.setStrokeWidth(r7)
            android.graphics.Paint r4 = r0.f115241i
            r4.setPathEffect(r6)
            int r4 = r19.getMeasuredWidth()
            int r4 = r4 >> r10
            float r4 = (float) r4
            int r6 = r19.getMeasuredHeight()
            int r6 = r6 >> r10
            float r6 = (float) r6
            float r3 = r3 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r2
            android.graphics.Paint r2 = r0.f115241i
            r1.drawCircle(r4, r6, r3, r2)
            int r2 = r0.f115220J
            float r2 = (float) r2
            float r2 = r2 * r5
            long r3 = r0.f115244l
            long r3 = r13 - r3
            float r3 = (float) r3
            float r3 = r3 * r12
            float r3 = r3 / r11
            int r4 = r0.f115220J
            float r4 = (float) r4
            float r3 = r3 * r4
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r3 = r3 * r4
            float r2 = r2 + r3
            android.graphics.Paint r3 = r0.f115240h
            r3.setStrokeWidth(r2)
            int r3 = r19.getMeasuredWidth()
            int r3 = r3 >> r10
            float r3 = (float) r3
            int r4 = r19.getMeasuredHeight()
            int r4 = r4 >> r10
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            android.graphics.Paint r5 = r0.f115240h
            r1.drawCircle(r3, r4, r2, r5)
            long r1 = r0.f115244l
            long r13 = r13 - r1
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ec
            r0.mo91902b(r10)
            r1 = 0
            r0.f115237e = r1
        L_0x00ec:
            r19.invalidate()
            return
        L_0x00f0:
            int r2 = r0.f115237e
            r3 = 0
            r4 = 4
            r13 = 3
            r14 = 2
            if (r2 != 0) goto L_0x0189
            r20.save()
            float r2 = r0.f115242j
            float r5 = r0.f115243k
            r1.translate(r2, r5)
            long r5 = android.os.SystemClock.uptimeMillis()
            int r2 = r0.f115236d
            if (r2 != r14) goto L_0x0115
            long r14 = r0.f115244l
            long r14 = r5 - r14
            int r2 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0115
            r0.mo91902b(r13)
        L_0x0115:
            int r2 = r0.f115236d
            if (r2 != r4) goto L_0x014a
            long r13 = r0.f115244l
            long r13 = r5 - r13
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x012c
            r0.mo91902b(r10)
            r0.f115242j = r3
            r0.f115243k = r3
            r19.invalidate()
            goto L_0x014a
        L_0x012c:
            long r2 = r0.f115244l
            long r2 = r5 - r2
            float r2 = (float) r2
            float r2 = r2 * r12
            float r2 = r2 / r11
            float r2 = r12 - r2
            float r3 = r0.f115242j
            float r2 = r2 * r3
            r0.f115242j = r2
            long r2 = r0.f115244l
            long r5 = r5 - r2
            float r2 = (float) r5
            float r2 = r2 * r12
            float r2 = r2 / r11
            float r12 = r12 - r2
            float r2 = r0.f115243k
            float r12 = r12 * r2
            r0.f115243k = r12
        L_0x014a:
            int r2 = r0.f115236d
            long r3 = r0.f115244l
            int r2 = r0.m99258e(r2, r3)
            int r3 = r0.f115236d
            long r4 = r0.f115244l
            int r3 = r0.m99260f(r3, r4)
            int r4 = r3 + r2
            r5 = 2
            int r4 = r4 / r5
            android.graphics.Paint r5 = r0.f115240h
            int r3 = r3 - r2
            float r2 = (float) r3
            r5.setStrokeWidth(r2)
            int r2 = r19.getMeasuredWidth()
            int r2 = r2 >> r10
            float r2 = (float) r2
            int r3 = r19.getMeasuredHeight()
            int r3 = r3 >> r10
            float r3 = (float) r3
            float r4 = (float) r4
            android.graphics.Paint r5 = r0.f115240h
            r1.drawCircle(r2, r3, r4, r5)
            int r2 = r0.f115236d
            if (r2 != r10) goto L_0x017e
            super.dispatchDraw(r20)
        L_0x017e:
            r20.restore()
            int r1 = r0.f115236d
            if (r1 == r10) goto L_0x0188
            r19.invalidate()
        L_0x0188:
            return
        L_0x0189:
            int r2 = r0.f115237e
            if (r2 != r10) goto L_0x0257
            long r2 = android.os.SystemClock.uptimeMillis()
            int r5 = r0.f115236d
            r11 = 2
            if (r5 != r11) goto L_0x019f
            r19.m99264i()
            r19.m99259e()
            r19.m99266k()
        L_0x019f:
            int r5 = r0.f115236d
            if (r5 != r11) goto L_0x01ae
            long r11 = r0.f115244l
            long r11 = r2 - r11
            int r5 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ae
            r0.mo91902b(r13)
        L_0x01ae:
            int r5 = r0.f115236d
            if (r5 != r4) goto L_0x01c8
            long r4 = r0.f115244l
            long r2 = r2 - r4
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x01c8
            r19.m99262g()
            r19.m99256d()
            r19.m99265j()
            r0.mo91902b(r10)
            r19.invalidate()
        L_0x01c8:
            int r2 = r0.f115236d
            long r3 = r0.f115244l
            int r5 = r0.f115236d
            if (r5 != r10) goto L_0x01d7
            int r2 = r0.f115220J
            float r2 = (float) r2
            float r2 = r2 * r7
            int r2 = (int) r2
            goto L_0x01db
        L_0x01d7:
            int r2 = r0.m99258e(r2, r3)
        L_0x01db:
            int r3 = r0.f115236d
            long r4 = r0.f115244l
            int r3 = r0.m99260f(r3, r4)
            int r4 = r3 + r2
            r5 = 2
            int r4 = r4 / r5
            android.graphics.Paint r7 = r0.f115241i
            int r3 = r3 - r2
            float r2 = (float) r3
            r7.setStrokeWidth(r2)
            android.graphics.Paint r2 = r0.f115241i
            r2.setPathEffect(r6)
            int r2 = r19.getMeasuredWidth()
            int r2 = r2 / r5
            float r2 = (float) r2
            int r3 = r19.getMeasuredHeight()
            int r3 = r3 / r5
            float r3 = (float) r3
            float r4 = (float) r4
            android.graphics.Paint r6 = r0.f115241i
            r1.drawCircle(r2, r3, r4, r6)
            int r2 = r0.f115236d
            long r3 = r0.f115244l
            int r2 = r0.m99248a(r2, r3)
            int r3 = r19.getMeasuredWidth()
            int r3 = r3 / r5
            int r4 = r19.getMeasuredHeight()
            int r4 = r4 / r5
            int r5 = r0.f115236d
            long r6 = r0.f115244l
            int r5 = r0.m99251b(r5, r6)
            android.graphics.Paint r6 = r0.f115240h
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.FILL
            r6.setStyle(r7)
            android.graphics.RectF r6 = r0.f115245m
            int r7 = r3 - r5
            float r7 = (float) r7
            r6.left = r7
            android.graphics.RectF r6 = r0.f115245m
            int r7 = r4 - r5
            float r7 = (float) r7
            r6.top = r7
            android.graphics.RectF r6 = r0.f115245m
            int r3 = r3 + r5
            float r3 = (float) r3
            r6.right = r3
            android.graphics.RectF r3 = r0.f115245m
            int r4 = r4 + r5
            float r4 = (float) r4
            r3.bottom = r4
            android.graphics.RectF r3 = r0.f115245m
            float r2 = (float) r2
            android.graphics.Paint r4 = r0.f115240h
            r1.drawRoundRect(r3, r2, r2, r4)
            android.graphics.Paint r1 = r0.f115240h
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            int r1 = r0.f115236d
            if (r1 == r10) goto L_0x0256
            r19.invalidate()
        L_0x0256:
            return
        L_0x0257:
            int r2 = r0.f115237e
            if (r2 != r13) goto L_0x04ea
            r20.save()
            float r2 = r0.f115242j
            float r14 = r0.f115243k
            r1.translate(r2, r14)
            long r16 = android.os.SystemClock.uptimeMillis()
            int r2 = r0.f115236d
            r14 = 2
            if (r2 != r14) goto L_0x0277
            r19.m99264i()
            r19.m99259e()
            r19.m99266k()
        L_0x0277:
            int r2 = r0.f115236d
            if (r2 != r14) goto L_0x028a
            long r5 = r0.f115244l
            long r5 = r16 - r5
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x028a
            r0.mo91902b(r13)
            r2 = 0
            r0.m99257d(r2)
        L_0x028a:
            int r2 = r0.f115236d
            if (r2 != r4) goto L_0x02d2
            long r5 = r0.f115244l
            long r5 = r16 - r5
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x02b0
            r19.m99262g()
            r19.m99256d()
            r19.m99265j()
            r0.mo91902b(r10)
            r2 = 0
            r0.m99257d(r2)
            r0.f115248p = r2
            r0.f115242j = r3
            r0.f115243k = r3
            r19.invalidate()
            goto L_0x02d3
        L_0x02b0:
            r2 = 0
            long r5 = r0.f115244l
            long r5 = r16 - r5
            float r3 = (float) r5
            float r3 = r3 * r12
            float r3 = r3 / r11
            float r3 = r12 - r3
            float r5 = r0.f115242j
            float r3 = r3 * r5
            r0.f115242j = r3
            long r5 = r0.f115244l
            long r5 = r16 - r5
            float r3 = (float) r5
            float r3 = r3 * r12
            float r3 = r3 / r11
            float r3 = r12 - r3
            float r5 = r0.f115243k
            float r3 = r3 * r5
            r0.f115243k = r3
            goto L_0x02d3
        L_0x02d2:
            r2 = 0
        L_0x02d3:
            int r3 = r0.f115236d
            if (r3 != r13) goto L_0x0305
            int r3 = r0.f115239g
            if (r3 != 0) goto L_0x02ee
            long r5 = r0.f115226P
            long r16 = r16 - r5
            r5 = 350(0x15e, double:1.73E-321)
            int r3 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0305
            boolean r3 = r0.f115248p
            if (r3 != 0) goto L_0x0305
            r3 = 2
            r0.m99257d(r3)
            goto L_0x0305
        L_0x02ee:
            r3 = 2
            int r5 = r0.f115239g
            if (r5 != r3) goto L_0x0305
            long r5 = r0.f115222L
            long r16 = r16 - r5
            r5 = 200(0xc8, double:9.9E-322)
            int r8 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0305
            r0.m99257d(r10)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b r5 = r0.f115258z
            r5.mo87876a(r3)
        L_0x0305:
            int r3 = r0.f115239g
            int r5 = r0.f115236d
            long r8 = r0.f115244l
            long r14 = android.os.SystemClock.uptimeMillis()
            int r6 = r0.f115236d
            if (r6 != r10) goto L_0x031a
            int r5 = r0.f115220J
            float r5 = (float) r5
            float r5 = r5 * r7
            int r5 = (int) r5
            goto L_0x035f
        L_0x031a:
            int r6 = r0.f115236d
            if (r6 != r4) goto L_0x035b
            int r6 = r0.f115239g
            if (r6 != 0) goto L_0x0330
            int r5 = r0.f115221K
            float r5 = (float) r5
            long r14 = r14 - r8
            float r6 = (float) r14
            float r6 = r6 * r12
            float r6 = r6 / r11
            float r6 = r12 - r6
            float r5 = r5 * r6
            int r5 = (int) r5
            goto L_0x035f
        L_0x0330:
            int r6 = r0.f115239g
            if (r6 != r10) goto L_0x0345
            int r5 = r0.f115221K
            float r5 = (float) r5
            r6 = 1041865114(0x3e19999a, float:0.15)
            long r14 = r14 - r8
            float r7 = (float) r14
            float r7 = r7 * r6
            float r7 = r7 / r11
            float r6 = r12 - r7
            float r5 = r5 * r6
            int r5 = (int) r5
            goto L_0x035f
        L_0x0345:
            int r6 = r0.f115239g
            r7 = 2
            if (r6 != r7) goto L_0x035b
            int r5 = r0.f115221K
            float r5 = (float) r5
            r6 = 1041865114(0x3e19999a, float:0.15)
            long r14 = r14 - r8
            float r7 = (float) r14
            float r7 = r7 * r6
            float r7 = r7 / r11
            float r6 = r12 - r7
            float r5 = r5 * r6
            int r5 = (int) r5
            goto L_0x035f
        L_0x035b:
            int r5 = r0.m99258e(r5, r8)
        L_0x035f:
            int r6 = r0.f115236d
            long r7 = r0.f115244l
            int r6 = r0.m99260f(r6, r7)
            int r7 = r6 + r5
            r8 = 2
            int r7 = r7 / r8
            if (r3 == 0) goto L_0x038c
            if (r3 != r8) goto L_0x0370
            goto L_0x038c
        L_0x0370:
            if (r3 != r10) goto L_0x03ac
            android.graphics.Paint r3 = r0.f115240h
            int r6 = r6 - r5
            float r5 = (float) r6
            r3.setStrokeWidth(r5)
            int r3 = r19.getMeasuredWidth()
            int r3 = r3 / r8
            float r3 = (float) r3
            int r5 = r19.getMeasuredHeight()
            int r5 = r5 / r8
            float r5 = (float) r5
            float r6 = (float) r7
            android.graphics.Paint r7 = r0.f115240h
            r1.drawCircle(r3, r5, r6, r7)
            goto L_0x03ac
        L_0x038c:
            android.graphics.Paint r3 = r0.f115241i
            int r6 = r6 - r5
            float r5 = (float) r6
            r3.setStrokeWidth(r5)
            android.graphics.Paint r3 = r0.f115241i
            r5 = 0
            r3.setPathEffect(r5)
            int r3 = r19.getMeasuredWidth()
            r5 = 2
            int r3 = r3 / r5
            float r3 = (float) r3
            int r6 = r19.getMeasuredHeight()
            int r6 = r6 / r5
            float r5 = (float) r6
            float r6 = (float) r7
            android.graphics.Paint r7 = r0.f115241i
            r1.drawCircle(r3, r5, r6, r7)
        L_0x03ac:
            int r3 = r0.f115236d
            int r5 = r0.f115239g
            long r6 = r0.f115244l
            long r8 = r0.f115222L
            long r14 = android.os.SystemClock.uptimeMillis()
            r16 = 1128792064(0x43480000, float:200.0)
            r17 = 1036831949(0x3dcccccd, float:0.1)
            r18 = 1053609165(0x3ecccccd, float:0.4)
            if (r3 != r13) goto L_0x0409
            if (r5 != 0) goto L_0x03cd
            int r3 = r0.f115221K
            float r3 = (float) r3
            float r3 = r3 * r17
            int r3 = (int) r3
        L_0x03ca:
            r2 = 2
            goto L_0x0441
        L_0x03cd:
            r2 = 2
            if (r5 != r2) goto L_0x03e9
            long r10 = r14 - r8
            float r2 = (float) r10
            r10 = 1120403456(0x42c80000, float:100.0)
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x03e8
            int r3 = r0.f115221K
            float r3 = (float) r3
            float r3 = r3 * r17
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            float r2 = r2 * r5
            float r2 = r2 / r16
            float r3 = r3 + r2
            int r3 = (int) r3
            goto L_0x03ca
        L_0x03e8:
            r2 = 2
        L_0x03e9:
            if (r5 != r2) goto L_0x0403
            long r8 = r14 - r8
            float r2 = (float) r8
            r8 = 1120403456(0x42c80000, float:100.0)
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x0403
            int r3 = r0.f115221K
            float r3 = (float) r3
            float r3 = r3 * r18
            float r2 = r2 * r12
            float r2 = r2 / r16
            float r2 = r12 - r2
            float r3 = r3 * r2
            int r3 = (int) r3
            goto L_0x03ca
        L_0x0403:
            r2 = 1
            if (r5 != r2) goto L_0x0409
            r2 = 2
        L_0x0407:
            r3 = 0
            goto L_0x0441
        L_0x0409:
            if (r3 != r4) goto L_0x043c
            if (r5 != 0) goto L_0x0424
            int r2 = r0.f115221K
            float r2 = (float) r2
            float r2 = r2 * r17
            int r3 = r0.f115221K
            float r3 = (float) r3
            r5 = 1060320051(0x3f333333, float:0.7)
            float r3 = r3 * r5
            long r14 = r14 - r6
            float r5 = (float) r14
            float r3 = r3 * r5
            r8 = 1133903872(0x43960000, float:300.0)
            float r3 = r3 / r8
            float r2 = r2 + r3
            int r3 = (int) r2
            goto L_0x03ca
        L_0x0424:
            r2 = 1
            r8 = 1133903872(0x43960000, float:300.0)
            if (r5 != r2) goto L_0x0438
            int r2 = r0.f115221K
            float r2 = (float) r2
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r3
            long r14 = r14 - r6
            float r3 = (float) r14
            float r2 = r2 * r3
            float r2 = r2 / r8
            int r3 = (int) r2
            goto L_0x03ca
        L_0x0438:
            r2 = 2
            if (r5 != r2) goto L_0x043d
            goto L_0x0407
        L_0x043c:
            r2 = 2
        L_0x043d:
            int r3 = r0.m99248a(r3, r6)
        L_0x0441:
            int r5 = r19.getMeasuredWidth()
            int r5 = r5 / r2
            int r6 = r19.getMeasuredHeight()
            int r6 = r6 / r2
            int r2 = r0.f115236d
            int r7 = r0.f115239g
            long r8 = r0.f115244l
            long r10 = r0.f115222L
            long r14 = android.os.SystemClock.uptimeMillis()
            if (r2 != r13) goto L_0x047a
            if (r7 != 0) goto L_0x0462
            int r2 = r0.f115221K
            float r2 = (float) r2
            float r2 = r2 * r18
            int r2 = (int) r2
            goto L_0x04ae
        L_0x0462:
            r13 = 2
            if (r7 != r13) goto L_0x0475
            int r2 = r0.f115221K
            float r2 = (float) r2
            float r2 = r2 * r18
            long r14 = r14 - r10
            float r4 = (float) r14
            float r4 = r4 * r12
            float r4 = r4 / r16
            float r12 = r12 - r4
            float r2 = r2 * r12
            int r2 = (int) r2
            goto L_0x04ae
        L_0x0475:
            r10 = 1
            if (r7 != r10) goto L_0x047a
        L_0x0478:
            r2 = 0
            goto L_0x04ae
        L_0x047a:
            if (r2 != r4) goto L_0x04aa
            if (r7 != 0) goto L_0x0492
            int r2 = r0.f115221K
            float r2 = (float) r2
            float r2 = r2 * r18
            int r4 = r0.f115221K
            float r4 = (float) r4
            float r4 = r4 * r18
            long r14 = r14 - r8
            float r7 = (float) r14
            float r4 = r4 * r7
            r10 = 1133903872(0x43960000, float:300.0)
            float r4 = r4 / r10
            float r2 = r2 + r4
            int r2 = (int) r2
            goto L_0x04ae
        L_0x0492:
            r4 = 1
            r10 = 1133903872(0x43960000, float:300.0)
            if (r7 != r4) goto L_0x04a6
            int r2 = r0.f115221K
            float r2 = (float) r2
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r4
            long r14 = r14 - r8
            float r4 = (float) r14
            float r2 = r2 * r4
            float r2 = r2 / r10
            int r2 = (int) r2
            goto L_0x04ae
        L_0x04a6:
            r4 = 2
            if (r7 != r4) goto L_0x04aa
            goto L_0x0478
        L_0x04aa:
            int r2 = r0.m99251b(r2, r8)
        L_0x04ae:
            android.graphics.Paint r4 = r0.f115240h
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.FILL
            r4.setStyle(r7)
            android.graphics.RectF r4 = r0.f115245m
            int r7 = r5 - r2
            float r7 = (float) r7
            r4.left = r7
            android.graphics.RectF r4 = r0.f115245m
            int r7 = r6 - r2
            float r7 = (float) r7
            r4.top = r7
            android.graphics.RectF r4 = r0.f115245m
            int r5 = r5 + r2
            float r5 = (float) r5
            r4.right = r5
            android.graphics.RectF r4 = r0.f115245m
            int r6 = r6 + r2
            float r2 = (float) r6
            r4.bottom = r2
            android.graphics.RectF r2 = r0.f115245m
            float r3 = (float) r3
            android.graphics.Paint r4 = r0.f115240h
            r1.drawRoundRect(r2, r3, r3, r4)
            android.graphics.Paint r2 = r0.f115240h
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            r20.restore()
            int r1 = r0.f115236d
            r2 = 1
            if (r1 == r2) goto L_0x04e9
            r19.invalidate()
        L_0x04e9:
            return
        L_0x04ea:
            long r10 = android.os.SystemClock.uptimeMillis()
            int r2 = r0.f115220J
            float r2 = (float) r2
            float r2 = r2 * r7
            int r2 = (int) r2
            int r3 = r0.f115220J
            int r4 = r3 + r2
            r5 = 2
            int r4 = r4 / r5
            int r3 = r3 - r2
            android.graphics.Paint r2 = r0.f115241i
            float r3 = (float) r3
            r2.setStrokeWidth(r3)
            android.graphics.Paint r2 = r0.f115241i
            android.graphics.DashPathEffect r3 = r19.getDashPathEffect()
            r2.setPathEffect(r3)
            int r2 = r19.getMeasuredWidth()
            int r2 = r2 / r5
            float r2 = (float) r2
            int r3 = r19.getMeasuredHeight()
            int r3 = r3 / r5
            float r3 = (float) r3
            float r4 = (float) r4
            android.graphics.Paint r6 = r0.f115241i
            r1.drawCircle(r2, r3, r4, r6)
            long r2 = r0.f115244l
            r4 = 1
            int r2 = r0.m99248a(r4, r2)
            int r3 = r19.getMeasuredWidth()
            int r3 = r3 / r5
            int r6 = r19.getMeasuredHeight()
            int r6 = r6 / r5
            long r8 = r0.f115244l
            int r5 = r0.m99251b(r4, r8)
            android.graphics.Paint r4 = r0.f115240h
            android.graphics.Paint$Style r8 = android.graphics.Paint.Style.FILL
            r4.setStyle(r8)
            android.graphics.RectF r4 = r0.f115245m
            int r8 = r3 - r5
            float r8 = (float) r8
            r4.left = r8
            android.graphics.RectF r4 = r0.f115245m
            int r8 = r6 - r5
            float r8 = (float) r8
            r4.top = r8
            android.graphics.RectF r4 = r0.f115245m
            int r3 = r3 + r5
            float r3 = (float) r3
            r4.right = r3
            android.graphics.RectF r3 = r0.f115245m
            int r6 = r6 + r5
            float r4 = (float) r6
            r3.bottom = r4
            android.graphics.RectF r3 = r0.f115245m
            float r2 = (float) r2
            android.graphics.Paint r4 = r0.f115240h
            r1.drawRoundRect(r3, r2, r2, r4)
            android.graphics.Paint r2 = r0.f115240h
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            android.graphics.Paint r2 = r0.f115241i
            int r3 = r0.f115215E
            r2.setColor(r3)
            int r2 = r0.f115236d
            if (r2 != r13) goto L_0x05b3
            int r2 = r0.f115220J
            float r2 = (float) r2
            float r2 = r2 * r7
            int r2 = (int) r2
            int r3 = r0.f115220J
            int r3 = r3 + r2
            r2 = 2
            int r3 = r3 / r2
            int r4 = r19.getMeasuredWidth()
            int r4 = r4 / r2
            int r4 = r4 - r3
            float r4 = (float) r4
            int r5 = r19.getMeasuredHeight()
            int r5 = r5 / r2
            int r5 = r5 - r3
            float r5 = (float) r5
            int r6 = r19.getMeasuredWidth()
            int r6 = r6 / r2
            int r6 = r6 + r3
            float r6 = (float) r6
            int r7 = r19.getMeasuredHeight()
            int r7 = r7 / r2
            int r7 = r7 + r3
            float r7 = (float) r7
            r8 = -1028390912(0xffffffffc2b40000, float:-90.0)
            long r2 = r0.f115244l
            long r2 = r10 - r2
            r12 = 360(0x168, double:1.78E-321)
            long r2 = r2 * r12
            r12 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r12
            float r9 = (float) r2
            r12 = 0
            android.graphics.Paint r13 = r0.f115241i
            r1 = r20
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r12
            r9 = r13
            r1.drawArc(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x05b3:
            android.graphics.Paint r1 = r0.f115241i
            int r2 = r0.f115218H
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f115241i
            android.graphics.DashPathEffect r2 = r19.getDashPathEffect()
            r1.setPathEffect(r2)
            int r1 = r0.f115236d
            r2 = 1
            if (r1 == r2) goto L_0x05de
            long r3 = r0.f115244l
            long r10 = r10 - r3
            r3 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x05d7
            r0.mo91902b(r2)
            r19.invalidate()
        L_0x05d7:
            int r1 = r0.f115236d
            if (r1 == r2) goto L_0x05de
            r19.invalidate()
        L_0x05de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.widget.RecordLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    /* renamed from: d */
    private int m99255d(int i, long j) {
        return this.f115220J;
    }

    public RecordLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private int m99254c(int i, long j) {
        return (int) (((((float) this.f115221K) * 0.85f) * ((float) (SystemClock.uptimeMillis() - j))) / 300.0f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(m99253c(i), 1073741824), MeasureSpec.makeMeasureSpec(m99253c(i2), 1073741824));
    }

    /* renamed from: a */
    private int m99248a(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            return (int) ((((float) this.f115221K) * 0.1f) + (((float) this.f115221K) * 0.7f * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f))));
        }
        if (i == 3) {
            return (int) (((float) this.f115221K) * 0.1f);
        }
        if (i == 4) {
            return (int) ((((float) this.f115221K) * 0.1f) + (((((float) this.f115221K) * 0.7f) * ((float) (uptimeMillis - j))) / 300.0f));
        }
        if (i == 1) {
            return (int) (((float) this.f115221K) * 0.8f);
        }
        return 0;
    }

    /* renamed from: b */
    private int m99251b(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            return (int) ((((float) this.f115221K) * 0.4f) + (((float) this.f115221K) * 0.4f * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f))));
        }
        if (i == 3) {
            return (int) (((float) this.f115221K) * 0.4f);
        }
        if (i == 4) {
            return (int) ((((float) this.f115221K) * 0.4f) + (((((float) this.f115221K) * 0.4f) * ((float) (uptimeMillis - j))) / 300.0f));
        }
        if (i == 1) {
            return (int) (((float) this.f115221K) * 0.8f);
        }
        return 0;
    }

    /* renamed from: e */
    private int m99258e(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            return (int) ((((long) this.f115221K) * (uptimeMillis - j)) / 300);
        }
        if (i == 3) {
            double d = (double) this.f115221K;
            double d2 = (double) (uptimeMillis - j);
            Double.isNaN(d2);
            double sin = Math.sin((d2 * 3.141592653589793d) / 700.0d) + 1.0d;
            double d3 = (double) (this.f115219I - this.f115220J);
            Double.isNaN(d3);
            double d4 = sin * d3 * 0.30000001192092896d;
            Double.isNaN(d);
            return (int) (d + d4);
        } else if (i == 4) {
            return (int) (((float) this.f115221K) * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f)));
        } else {
            return i == 1 ? 0 : 0;
        }
    }

    /* renamed from: f */
    private int m99260f(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            return this.f115220J + ((int) ((((long) (this.f115219I - this.f115220J)) * (uptimeMillis - j)) / 300));
        }
        if (i == 3) {
            return this.f115220J + (this.f115219I - this.f115220J);
        }
        if (i == 4) {
            return this.f115220J + ((int) (((float) (this.f115219I - this.f115220J)) * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f))));
        }
        if (i == 1) {
            return this.f115220J;
        }
        return 0;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f115257y == null || motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action != 2) {
            switch (action) {
                case 5:
                    this.f115257y.mo87833d(motionEvent, this.f115227Q);
                    this.f115257y.mo87824b(motionEvent, this.f115227Q);
                    break;
                case 6:
                    this.f115257y.mo87835e(motionEvent, this.f115227Q);
                    this.f115257y.mo87830c(motionEvent, this.f115227Q);
                    break;
            }
        } else {
            this.f115257y.mo87816a(motionEvent, this.f115227Q);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo91900a(int i, boolean z) {
        this.f115250r = this.f115251s;
        this.f115214D = this.f115237e;
        this.f115237e = i;
        this.f115251s = z;
        this.f115252t = true;
        if (!this.f115247o) {
            invalidate();
            super.setOnClickListener(this.f115232V);
            this.f115247o = !this.f115247o;
            return;
        }
        if (this.f115237e != this.f115214D) {
            m99263h();
            m99262g();
            m99261f();
            m99256d();
            if (i == 1) {
                if (!(this.f115240h == null || this.f115241i == null)) {
                    this.f115240h.setColor(this.f115215E);
                    this.f115241i.setColor(this.f115216F);
                }
                super.setOnClickListener(this.f115232V);
                mo91902b(6);
            } else if (i == 0) {
                this.f115240h.setColor(this.f115217G);
                this.f115241i.setColor(this.f115218H);
                super.setOnClickListener(null);
                mo91902b(8);
            } else if (i == 3) {
                m99265j();
                super.setOnClickListener(this.f115232V);
                mo91902b(7);
            }
            invalidate();
        }
    }

    public RecordLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f115237e = 3;
        this.f115214D = -1;
        this.f115223M = -1;
        this.f115224N = (int) C9432q.m18687b(getContext(), 100.0f);
        this.f115245m = new RectF();
        this.f115225O = 0;
        this.f115247o = false;
        this.f115248p = false;
        this.f115227Q = new int[]{0, 0};
        this.f115252t = true;
        this.f115230T = new ArgbEvaluator();
        this.f115253u = C45582a.DEFAULT;
        this.f115258z = new C45603e();
        this.f115232V = new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (RecordLayout.this.f115236d != 1) {
                    if ((RecordLayout.this.f115236d == 3 || RecordLayout.this.f115236d == 2) && RecordLayout.this.f115252t) {
                        RecordLayout.this.mo91902b(4);
                        RecordLayout.this.f115258z.mo87879c();
                    }
                } else if (!RecordLayout.this.f115258z.mo87877a()) {
                    if (RecordLayout.this.f115251s) {
                        if (RecordLayout.this.f115255w != null && (RecordLayout.this.f115253u == C45582a.PLAN_B || RecordLayout.this.f115253u == C45582a.PLAN_C)) {
                            RecordLayout.this.f115255w.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new Runnable() {
                                public final void run() {
                                    RecordLayout.this.f115255w.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                                }
                            }).start();
                        }
                        if (RecordLayout.this.f115254v != null && RecordLayout.this.f115253u == C45582a.PLAN_C) {
                            RecordLayout.this.f115254v.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new Runnable() {
                                public final void run() {
                                    RecordLayout.this.f115254v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                                }
                            }).start();
                        }
                        RecordLayout.this.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new Runnable() {
                            public final void run() {
                                RecordLayout.this.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                            }
                        }).start();
                        RecordLayout.this.f115258z.mo87880d();
                        return;
                    }
                    RecordLayout.this.mo91902b(2);
                    RecordLayout.this.invalidate();
                    RecordLayout.this.f115258z.mo87878b();
                }
            }
        };
        this.f115219I = (int) C9432q.m18687b(context, 55.0f);
        this.f115220J = (int) C9432q.m18687b(context, 40.0f);
        this.f115221K = (int) C9432q.m18687b(context, 40.0f);
        if (context instanceof FragmentActivity) {
            this.f115228R = new C45612j((FragmentActivity) context);
        }
        this.f115236d = 1;
        this.f115240h = new Paint();
        this.f115240h.setStyle(Style.STROKE);
        this.f115240h.setAntiAlias(true);
        this.f115241i = new Paint();
        this.f115241i.setStyle(Style.STROKE);
        this.f115241i.setAntiAlias(true);
        switch (C39629l.m88232a().mo58583n().mo83104b(C40790a.RecordLayoutColorScheme)) {
            case 1:
                this.f115253u = C45582a.PLAN_A;
                break;
            case 2:
                this.f115253u = C45582a.PLAN_B;
                break;
            case 3:
                this.f115253u = C45582a.PLAN_C;
                break;
            default:
                this.f115253u = C45582a.DEFAULT;
                break;
        }
        switch (this.f115253u) {
            case DEFAULT:
                this.f115217G = getResources().getColor(R.color.a3c);
                this.f115218H = getResources().getColor(R.color.a3e);
                this.f115215E = getResources().getColor(R.color.aso);
                this.f115216F = getResources().getColor(R.color.a1o);
                break;
            case PLAN_A:
                this.f115217G = getResources().getColor(R.color.a3c);
                this.f115218H = getResources().getColor(R.color.aso);
                this.f115215E = getResources().getColor(R.color.aso);
                this.f115216F = getResources().getColor(R.color.aso);
                break;
            case PLAN_B:
                this.f115217G = 0;
                this.f115218H = getResources().getColor(R.color.aso);
                this.f115215E = getResources().getColor(R.color.aso);
                this.f115216F = getResources().getColor(R.color.aso);
                break;
            case PLAN_C:
                this.f115217G = getResources().getColor(R.color.a3c);
                this.f115218H = getResources().getColor(R.color.a3c);
                this.f115215E = getResources().getColor(R.color.a3c);
                this.f115216F = getResources().getColor(R.color.a3c);
                break;
        }
        m99265j();
        setOnTouchListener(this);
    }

    /* renamed from: a */
    private void m99250a(Canvas canvas, boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f115253u == C45582a.PLAN_A) {
            f2 = ((float) this.f115220J) * 0.8f;
            float f4 = (float) this.f115220J;
            f3 = ((float) this.f115221K) * 0.85f;
            f = f4;
        } else {
            f3 = (float) m99254c(4, this.f115244l);
            f = (float) m99255d(4, this.f115244l);
            f2 = (((float) this.f115220J) * 0.8f) + ((1.0f - ((((float) (uptimeMillis - this.f115244l)) * 1.0f) / 300.0f)) * ((float) this.f115220J) * 0.2f);
        }
        this.f115241i.setStrokeWidth(f - f3);
        this.f115241i.setPathEffect(null);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (f + f3) / 2.0f, this.f115241i);
        this.f115240h.setStrokeWidth(f2);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), f2 / 2.0f, this.f115240h);
        if (uptimeMillis - this.f115244l > 300) {
            mo91902b(1);
            if (z2) {
                this.f115237e = 3;
            } else {
                this.f115237e = 1;
            }
        }
        invalidate();
    }
}
