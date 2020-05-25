package android.support.design.transformation;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.design.p022a.C0389a;
import android.support.design.p022a.C0396h;
import android.support.design.p022a.C0397i;
import android.support.design.p022a.C0398j;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f1536c = new Rect();

    /* renamed from: d */
    private final RectF f1537d = new RectF();

    /* renamed from: e */
    private final RectF f1538e = new RectF();

    /* renamed from: f */
    private final int[] f1539f = new int[2];

    /* renamed from: android.support.design.transformation.FabTransformationBehavior$a */
    protected static class C0465a {

        /* renamed from: a */
        public C0396h f1551a;

        /* renamed from: b */
        public C0398j f1552b;

        protected C0465a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0465a mo1163a(Context context, boolean z);

    public FabTransformationBehavior() {
    }

    /* renamed from: a */
    private static ViewGroup m1126a(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo1164a(C0505d dVar) {
        if (dVar.f1700h == 0) {
            dVar.f1700h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m1128a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f1539f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: b */
    private float m1129b(View view, View view2, C0398j jVar) {
        float f;
        RectF rectF = this.f1537d;
        RectF rectF2 = this.f1538e;
        m1128a(view, rectF);
        m1128a(view2, rectF2);
        int i = jVar.f1286a & 112;
        if (i == 16) {
            f = rectF2.centerY() - rectF.centerY();
        } else if (i == 48) {
            f = rectF2.top - rectF.top;
        } else if (i != 80) {
            f = 0.0f;
        } else {
            f = rectF2.bottom - rectF.bottom;
        }
        return f + jVar.f1288c;
    }

    /* renamed from: a */
    private float m1125a(View view, View view2, C0398j jVar) {
        float f;
        RectF rectF = this.f1537d;
        RectF rectF2 = this.f1538e;
        m1128a(view, rectF);
        m1128a(view2, rectF2);
        int i = jVar.f1286a & 7;
        if (i == 1) {
            f = rectF2.centerX() - rectF.centerX();
        } else if (i == 3) {
            f = rectF2.left - rectF.left;
        } else if (i != 5) {
            f = 0.0f;
        } else {
            f = rectF2.right - rectF.right;
        }
        return f + jVar.f1287b;
    }

    /* renamed from: a */
    public final boolean mo1157a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private static float m1124a(C0465a aVar, C0397i iVar, float f, float f2) {
        long j = iVar.f1281a;
        long j2 = iVar.f1282b;
        C0397i a = aVar.f1551a.mo889a("expansion");
        return C0389a.m963a(f, f2, iVar.mo893a().getInterpolation(((float) (((a.f1281a + a.f1282b) + 17) - j)) / ((float) j2)));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0377 A[LOOP:0: B:95:0x0375->B:96:0x0377, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet mo1161b(android.view.View r30, android.view.View r31, boolean r32, boolean r33) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r9 = r31
            r10 = r32
            android.content.Context r2 = r31.getContext()
            android.support.design.transformation.FabTransformationBehavior$a r11 = r0.mo1163a(r2, r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r14 = 21
            r8 = 1
            r7 = 0
            r6 = 0
            if (r2 < r14) goto L_0x0058
            float r2 = android.support.p030v4.view.C1056u.m3069o(r31)
            float r3 = android.support.p030v4.view.C1056u.m3069o(r30)
            float r2 = r2 - r3
            if (r10 == 0) goto L_0x003f
            if (r33 != 0) goto L_0x0034
            float r2 = -r2
            r9.setTranslationZ(r2)
        L_0x0034:
            android.util.Property r2 = android.view.View.TRANSLATION_Z
            float[] r3 = new float[r8]
            r3[r6] = r7
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r9, r2, r3)
            goto L_0x004a
        L_0x003f:
            android.util.Property r3 = android.view.View.TRANSLATION_Z
            float[] r4 = new float[r8]
            float r2 = -r2
            r4[r6] = r2
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r9, r3, r4)
        L_0x004a:
            android.support.design.a.h r3 = r11.f1551a
            java.lang.String r4 = "elevation"
            android.support.design.a.i r3 = r3.mo889a(r4)
            r3.mo894a(r2)
            r12.add(r2)
        L_0x0058:
            android.graphics.RectF r2 = r0.f1537d
            android.support.design.a.j r3 = r11.f1552b
            float r3 = r0.m1125a(r1, r9, r3)
            android.support.design.a.j r4 = r11.f1552b
            float r4 = r0.m1129b(r1, r9, r4)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x009d
            int r5 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x006f
            goto L_0x009d
        L_0x006f:
            if (r10 == 0) goto L_0x0075
            int r5 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x007b
        L_0x0075:
            if (r10 != 0) goto L_0x008c
            int r5 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x008c
        L_0x007b:
            android.support.design.a.h r5 = r11.f1551a
            java.lang.String r14 = "translationXCurveUpwards"
            android.support.design.a.i r5 = r5.mo889a(r14)
            android.support.design.a.h r14 = r11.f1551a
            java.lang.String r6 = "translationYCurveUpwards"
            android.support.design.a.i r6 = r14.mo889a(r6)
            goto L_0x00ad
        L_0x008c:
            android.support.design.a.h r5 = r11.f1551a
            java.lang.String r6 = "translationXCurveDownwards"
            android.support.design.a.i r5 = r5.mo889a(r6)
            android.support.design.a.h r6 = r11.f1551a
            java.lang.String r14 = "translationYCurveDownwards"
            android.support.design.a.i r6 = r6.mo889a(r14)
            goto L_0x00ad
        L_0x009d:
            android.support.design.a.h r5 = r11.f1551a
            java.lang.String r6 = "translationXLinear"
            android.support.design.a.i r5 = r5.mo889a(r6)
            android.support.design.a.h r6 = r11.f1551a
            java.lang.String r14 = "translationYLinear"
            android.support.design.a.i r6 = r6.mo889a(r14)
        L_0x00ad:
            if (r10 == 0) goto L_0x00f9
            if (r33 != 0) goto L_0x00b9
            float r14 = -r3
            r9.setTranslationX(r14)
            float r14 = -r4
            r9.setTranslationY(r14)
        L_0x00b9:
            android.util.Property r14 = android.view.View.TRANSLATION_X
            r17 = r13
            float[] r13 = new float[r8]
            r16 = 0
            r13[r16] = r7
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r9, r14, r13)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            r18 = r13
            float[] r13 = new float[r8]
            r13[r16] = r7
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r9, r14, r13)
            float r3 = -r3
            float r4 = -r4
            float r3 = m1124a(r11, r5, r3, r7)
            float r4 = m1124a(r11, r6, r4, r7)
            android.graphics.Rect r14 = r0.f1536c
            r9.getWindowVisibleDisplayFrame(r14)
            android.graphics.RectF r7 = r0.f1537d
            r7.set(r14)
            android.graphics.RectF r14 = r0.f1538e
            r0.m1128a(r9, r14)
            r14.offset(r3, r4)
            r14.intersect(r7)
            r2.set(r14)
            r3 = r13
            r13 = r18
            goto L_0x0112
        L_0x00f9:
            r17 = r13
            android.util.Property r7 = android.view.View.TRANSLATION_X
            float[] r13 = new float[r8]
            float r3 = -r3
            r14 = 0
            r13[r14] = r3
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r9, r7, r13)
            android.util.Property r3 = android.view.View.TRANSLATION_Y
            float[] r7 = new float[r8]
            float r4 = -r4
            r7[r14] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r9, r3, r7)
        L_0x0112:
            r5.mo894a(r13)
            r6.mo894a(r3)
            r12.add(r13)
            r12.add(r3)
            float r23 = r2.width()
            float r24 = r2.height()
            boolean r13 = r9 instanceof android.support.design.p023b.C0405d
            if (r13 == 0) goto L_0x017f
            boolean r2 = r1 instanceof android.widget.ImageView
            if (r2 != 0) goto L_0x012f
            goto L_0x017f
        L_0x012f:
            r2 = r9
            android.support.design.b.d r2 = (android.support.design.p023b.C0405d) r2
            r3 = r1
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            if (r3 == 0) goto L_0x017f
            r3.mutate()
            r4 = 255(0xff, float:3.57E-43)
            if (r10 == 0) goto L_0x0153
            if (r33 != 0) goto L_0x0147
            r3.setAlpha(r4)
        L_0x0147:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r4 = android.support.design.p022a.C0393e.f1274a
            int[] r5 = new int[r8]
            r6 = 0
            r5[r6] = r6
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofInt(r3, r4, r5)
            goto L_0x015e
        L_0x0153:
            r6 = 0
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r5 = android.support.design.p022a.C0393e.f1274a
            int[] r7 = new int[r8]
            r7[r6] = r4
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofInt(r3, r5, r7)
        L_0x015e:
            android.support.design.transformation.FabTransformationBehavior$2 r5 = new android.support.design.transformation.FabTransformationBehavior$2
            r5.<init>(r9)
            r4.addUpdateListener(r5)
            android.support.design.a.h r5 = r11.f1551a
            java.lang.String r7 = "iconFade"
            android.support.design.a.i r5 = r5.mo889a(r7)
            r5.mo894a(r4)
            r12.add(r4)
            android.support.design.transformation.FabTransformationBehavior$3 r4 = new android.support.design.transformation.FabTransformationBehavior$3
            r4.<init>(r2, r3)
            r14 = r17
            r14.add(r4)
            goto L_0x0182
        L_0x017f:
            r14 = r17
            r6 = 0
        L_0x0182:
            if (r13 == 0) goto L_0x0296
            r7 = r9
            android.support.design.b.d r7 = (android.support.design.p023b.C0405d) r7
            android.support.design.a.j r2 = r11.f1552b
            android.graphics.RectF r3 = r0.f1537d
            android.graphics.RectF r4 = r0.f1538e
            r0.m1128a(r1, r3)
            r0.m1128a(r9, r4)
            float r2 = r0.m1125a(r1, r9, r2)
            float r2 = -r2
            r5 = 0
            r4.offset(r2, r5)
            float r2 = r3.centerX()
            float r3 = r4.left
            float r2 = r2 - r3
            android.support.design.a.j r3 = r11.f1552b
            android.graphics.RectF r4 = r0.f1537d
            android.graphics.RectF r6 = r0.f1538e
            r0.m1128a(r1, r4)
            r0.m1128a(r9, r6)
            float r3 = r0.m1129b(r1, r9, r3)
            float r3 = -r3
            r6.offset(r5, r3)
            float r3 = r4.centerY()
            float r4 = r6.top
            float r3 = r3 - r4
            r4 = r1
            android.support.design.widget.FloatingActionButton r4 = (android.support.design.widget.FloatingActionButton) r4
            android.graphics.Rect r6 = r0.f1536c
            r4.mo1391a(r6)
            android.graphics.Rect r4 = r0.f1536c
            int r4 = r4.width()
            float r4 = (float) r4
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r4 / r6
            android.support.design.a.h r4 = r11.f1551a
            java.lang.String r5 = "expansion"
            android.support.design.a.i r5 = r4.mo889a(r5)
            if (r10 == 0) goto L_0x0230
            if (r33 != 0) goto L_0x01e5
            android.support.design.b.d$d r4 = new android.support.design.b.d$d
            r4.<init>(r2, r3, r6)
            r7.setRevealInfo(r4)
        L_0x01e5:
            if (r33 == 0) goto L_0x01ef
            android.support.design.b.d$d r4 = r7.getRevealInfo()
            float r4 = r4.f1308c
            r15 = r4
            goto L_0x01f0
        L_0x01ef:
            r15 = r6
        L_0x01f0:
            r21 = 0
            r22 = 0
            r19 = r2
            r20 = r3
            float r4 = android.support.design.widget.C0560l.m1542a(r19, r20, r21, r22, r23, r24)
            android.animation.Animator r6 = android.support.design.p023b.C0399a.m977a(r7, r2, r3, r4)
            android.support.design.transformation.FabTransformationBehavior$4 r4 = new android.support.design.transformation.FabTransformationBehavior$4
            r4.<init>(r7)
            r6.addListener(r4)
            long r8 = r5.f1281a
            int r4 = (int) r2
            int r3 = (int) r3
            r2 = r31
            r17 = r3
            r16 = r4
            r3 = r8
            r9 = r5
            r8 = 0
            r5 = r16
            r16 = r6
            r0 = 0
            r6 = r17
            r8 = r7
            r17 = 0
            r7 = r15
            r25 = r8
            r0 = 1
            r8 = r12
            m1127a(r2, r3, r5, r6, r7, r8)
            r28 = r11
            r0 = r16
            r1 = r25
            r4 = r31
            goto L_0x0287
        L_0x0230:
            r9 = r5
            r25 = r7
            r0 = 1
            r17 = 0
            android.support.design.b.d$d r4 = r25.getRevealInfo()
            float r7 = r4.f1308c
            r8 = r25
            android.animation.Animator r16 = android.support.design.p023b.C0399a.m977a(r8, r2, r3, r6)
            long r4 = r9.f1281a
            int r2 = (int) r2
            int r3 = (int) r3
            r26 = r2
            r2 = r31
            r27 = r3
            r3 = r4
            r5 = r26
            r0 = r6
            r6 = r27
            r1 = r8
            r8 = r12
            m1127a(r2, r3, r5, r6, r7, r8)
            long r2 = r9.f1281a
            long r4 = r9.f1282b
            android.support.design.a.h r6 = r11.f1551a
            long r6 = r6.mo888a()
            int r8 = android.os.Build.VERSION.SDK_INT
            r28 = r11
            r11 = 21
            if (r8 < r11) goto L_0x0283
            long r2 = r2 + r4
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0283
            r5 = r26
            r8 = r27
            r4 = r31
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r4, r5, r8, r0, r0)
            r0.setStartDelay(r2)
            long r6 = r6 - r2
            r0.setDuration(r6)
            r12.add(r0)
            goto L_0x0285
        L_0x0283:
            r4 = r31
        L_0x0285:
            r0 = r16
        L_0x0287:
            r9.mo894a(r0)
            r12.add(r0)
            android.support.design.b.a$1 r0 = new android.support.design.b.a$1
            r0.<init>(r1)
            r14.add(r0)
            goto L_0x029b
        L_0x0296:
            r4 = r9
            r28 = r11
            r17 = 0
        L_0x029b:
            if (r13 == 0) goto L_0x02ee
            r0 = r4
            android.support.design.b.d r0 = (android.support.design.p023b.C0405d) r0
            android.content.res.ColorStateList r1 = android.support.p030v4.view.C1056u.m3076v(r30)
            if (r1 == 0) goto L_0x02b3
            int[] r2 = r30.getDrawableState()
            int r3 = r1.getDefaultColor()
            int r6 = r1.getColorForState(r2, r3)
            goto L_0x02b4
        L_0x02b3:
            r6 = 0
        L_0x02b4:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r6
            if (r10 == 0) goto L_0x02cc
            if (r33 != 0) goto L_0x02bf
            r0.setCircularRevealScrimColor(r6)
        L_0x02bf:
            android.util.Property<android.support.design.b.d, java.lang.Integer> r2 = android.support.design.p023b.C0405d.C0409c.f1305a
            r3 = 1
            int[] r5 = new int[r3]
            r7 = 0
            r5[r7] = r1
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r2, r5)
            goto L_0x02d8
        L_0x02cc:
            r3 = 1
            r7 = 0
            android.util.Property<android.support.design.b.d, java.lang.Integer> r1 = android.support.design.p023b.C0405d.C0409c.f1305a
            int[] r2 = new int[r3]
            r2[r7] = r6
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r1, r2)
        L_0x02d8:
            android.support.design.a.c r1 = android.support.design.p022a.C0391c.f1272a
            r0.setEvaluator(r1)
            r1 = r28
            android.support.design.a.h r2 = r1.f1551a
            java.lang.String r3 = "color"
            android.support.design.a.i r2 = r2.mo889a(r3)
            r2.mo894a(r0)
            r12.add(r0)
            goto L_0x02f0
        L_0x02ee:
            r1 = r28
        L_0x02f0:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x035b
            if (r13 == 0) goto L_0x02fa
            int r0 = android.support.design.p023b.C0403c.f1292a
            if (r0 == 0) goto L_0x035b
        L_0x02fa:
            r0 = 2132021128(0x7f140f88, float:1.9680639E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x0308
            android.view.ViewGroup r0 = m1126a(r0)
            goto L_0x0322
        L_0x0308:
            boolean r0 = r4 instanceof android.support.design.transformation.C0468b
            if (r0 != 0) goto L_0x0316
            boolean r0 = r4 instanceof android.support.design.transformation.C0467a
            if (r0 == 0) goto L_0x0311
            goto L_0x0316
        L_0x0311:
            android.view.ViewGroup r0 = m1126a(r31)
            goto L_0x0322
        L_0x0316:
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2 = 0
            android.view.View r0 = r0.getChildAt(r2)
            android.view.ViewGroup r0 = m1126a(r0)
        L_0x0322:
            if (r0 == 0) goto L_0x035b
            if (r10 == 0) goto L_0x0340
            if (r33 != 0) goto L_0x0331
            android.util.Property<android.view.ViewGroup, java.lang.Float> r2 = android.support.design.p022a.C0392d.f1273a
            java.lang.Float r3 = java.lang.Float.valueOf(r17)
            r2.set(r0, r3)
        L_0x0331:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r2 = android.support.design.p022a.C0392d.f1273a
            r3 = 1
            float[] r3 = new float[r3]
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r3[r6] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r2, r3)
            goto L_0x034c
        L_0x0340:
            r3 = 1
            r6 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r2 = android.support.design.p022a.C0392d.f1273a
            float[] r3 = new float[r3]
            r3[r6] = r17
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r2, r3)
        L_0x034c:
            android.support.design.a.h r1 = r1.f1551a
            java.lang.String r2 = "contentFade"
            android.support.design.a.i r1 = r1.mo889a(r2)
            r1.mo894a(r0)
            r12.add(r0)
            goto L_0x035c
        L_0x035b:
            r6 = 0
        L_0x035c:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            android.support.design.p022a.C0390b.m965a(r0, r12)
            android.support.design.transformation.FabTransformationBehavior$1 r1 = new android.support.design.transformation.FabTransformationBehavior$1
            r2 = r29
            r3 = r30
            r5 = 0
            r1.<init>(r10, r4, r3)
            r0.addListener(r1)
            int r1 = r14.size()
        L_0x0375:
            if (r5 >= r1) goto L_0x0383
            java.lang.Object r3 = r14.get(r5)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r0.addListener(r3)
            int r5 = r5 + 1
            goto L_0x0375
        L_0x0383:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.transformation.FabTransformationBehavior.mo1161b(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    /* renamed from: a */
    private static void m1127a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }
}
