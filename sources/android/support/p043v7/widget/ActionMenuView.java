package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p043v7.view.menu.ActionMenuItemView;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1246h.C1247a;
import android.support.p043v7.view.menu.C1246h.C1248b;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.C1262o;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.view.menu.C1264p;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends LinearLayoutCompat implements C1248b, C1264p {

    /* renamed from: a */
    public C1246h f4409a;

    /* renamed from: b */
    public boolean f4410b;

    /* renamed from: c */
    ActionMenuPresenter f4411c;

    /* renamed from: d */
    C1247a f4412d;

    /* renamed from: e */
    C1290d f4413e;

    /* renamed from: h */
    private Context f4414h;

    /* renamed from: i */
    private int f4415i;

    /* renamed from: j */
    private C1263a f4416j;

    /* renamed from: k */
    private boolean f4417k;

    /* renamed from: l */
    private int f4418l;

    /* renamed from: m */
    private int f4419m;

    /* renamed from: n */
    private int f4420n;

    /* renamed from: android.support.v7.widget.ActionMenuView$LayoutParams */
    public static class LayoutParams extends android.support.p043v7.widget.LinearLayoutCompat.LayoutParams {
        @ExportedProperty

        /* renamed from: a */
        public boolean f4421a;
        @ExportedProperty

        /* renamed from: b */
        public int f4422b;
        @ExportedProperty

        /* renamed from: c */
        public int f4423c;
        @ExportedProperty

        /* renamed from: d */
        public boolean f4424d;
        @ExportedProperty

        /* renamed from: e */
        public boolean f4425e;

        /* renamed from: f */
        boolean f4426f;

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f4421a = layoutParams.f4421a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(-2, -2);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C1287a {
        /* renamed from: c */
        boolean mo3994c();

        /* renamed from: d */
        boolean mo3995d();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    static class C1288b implements C1263a {
        C1288b() {
        }

        /* renamed from: a */
        public final void mo3715a(C1246h hVar, boolean z) {
        }

        /* renamed from: a */
        public final boolean mo3716a(C1246h hVar) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    class C1289c implements C1247a {
        C1289c() {
        }

        /* renamed from: a */
        public final void mo1289a(C1246h hVar) {
            if (ActionMenuView.this.f4412d != null) {
                ActionMenuView.this.f4412d.mo1289a(hVar);
            }
        }

        /* renamed from: a */
        public final boolean mo1290a(C1246h hVar, MenuItem menuItem) {
            if (ActionMenuView.this.f4413e == null || !ActionMenuView.this.f4413e.mo4453a(menuItem)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    public interface C1290d {
        /* renamed from: a */
        boolean mo4453a(MenuItem menuItem);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getPopupTheme() {
        return this.f4415i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: a */
    public final LayoutParams mo4428a() {
        LayoutParams d = m4038d();
        d.f4421a = true;
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ android.support.p043v7.widget.LinearLayoutCompat.LayoutParams mo4434c() {
        return m4038d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4038d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo4433b();
    }

    /* renamed from: d */
    private static LayoutParams m4038d() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f4548h = 16;
        return layoutParams;
    }

    /* renamed from: b */
    public final void mo4433b() {
        if (this.f4411c != null) {
            this.f4411c.mo4417f();
        }
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f4411c;
        if (actionMenuPresenter.f4380i != null) {
            return actionMenuPresenter.f4380i.getDrawable();
        }
        if (actionMenuPresenter.f4382k) {
            return actionMenuPresenter.f4381j;
        }
        return null;
    }

    public Menu getMenu() {
        C1263a aVar;
        if (this.f4409a == null) {
            Context context = getContext();
            this.f4409a = new C1246h(context);
            this.f4409a.mo4108a((C1247a) new C1289c());
            this.f4411c = new ActionMenuPresenter(context);
            this.f4411c.mo4414c(true);
            ActionMenuPresenter actionMenuPresenter = this.f4411c;
            if (this.f4416j != null) {
                aVar = this.f4416j;
            } else {
                aVar = new C1288b();
            }
            actionMenuPresenter.mo1085a(aVar);
            this.f4409a.mo4111a((C1262o) this.f4411c, this.f4414h);
            this.f4411c.mo4413a(this);
        }
        return this.f4409a;
    }

    /* renamed from: a */
    public final void mo1058a(C1246h hVar) {
        this.f4409a = hVar;
    }

    public void setOnMenuItemClickListener(C1290d dVar) {
        this.f4413e = dVar;
    }

    public void setOverflowReserved(boolean z) {
        this.f4410b = z;
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f4411c.f4384m = z;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f4411c = actionMenuPresenter;
        this.f4411c.mo4413a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null || !(layoutParams instanceof LayoutParams)) {
            return false;
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f4411c != null) {
            this.f4411c.mo1086a(false);
            if (this.f4411c.mo4419h()) {
                this.f4411c.mo4416e();
                this.f4411c.mo4415d();
            }
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f4411c;
        if (actionMenuPresenter.f4380i != null) {
            actionMenuPresenter.f4380i.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.f4382k = true;
        actionMenuPresenter.f4381j = drawable;
    }

    public void setPopupTheme(int i) {
        if (this.f4415i != i) {
            this.f4415i = i;
            if (i == 0) {
                this.f4414h = getContext();
                return;
            }
            this.f4414h = new ContextThemeWrapper(getContext(), i);
        }
    }

    /* renamed from: b */
    private boolean m4037b(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C1287a)) {
            z = false | ((C1287a) childAt).mo3995d();
        }
        if (i > 0 && (childAt2 instanceof C1287a)) {
            z |= ((C1287a) childAt2).mo3994c();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return m4038d();
        }
        if (layoutParams instanceof LayoutParams) {
            layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (layoutParams2.f4548h <= 0) {
            layoutParams2.f4548h = 16;
        }
        return layoutParams2;
    }

    /* renamed from: a */
    public final boolean mo4012a(C1250j jVar) {
        return this.f4409a.mo4113a((MenuItem) jVar, 0);
    }

    /* renamed from: a */
    public final void mo4431a(C1263a aVar, C1247a aVar2) {
        this.f4416j = aVar;
        this.f4412d = aVar2;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4419m = (int) (56.0f * f);
        this.f4420n = (int) (f * 4.0f);
        this.f4414h = context;
        this.f4415i = 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r34, int r35) {
        /*
            r33 = this;
            r0 = r33
            boolean r1 = r0.f4417k
            int r2 = android.view.View.MeasureSpec.getMode(r34)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            r0.f4417k = r2
            boolean r2 = r0.f4417k
            if (r1 == r2) goto L_0x0019
            r0.f4418l = r4
        L_0x0019:
            int r1 = android.view.View.MeasureSpec.getSize(r34)
            boolean r2 = r0.f4417k
            if (r2 == 0) goto L_0x0030
            android.support.v7.view.menu.h r2 = r0.f4409a
            if (r2 == 0) goto L_0x0030
            int r2 = r0.f4418l
            if (r1 == r2) goto L_0x0030
            r0.f4418l = r1
            android.support.v7.view.menu.h r1 = r0.f4409a
            r1.mo1150a(r5)
        L_0x0030:
            int r1 = r33.getChildCount()
            boolean r2 = r0.f4417k
            if (r2 == 0) goto L_0x02b5
            if (r1 <= 0) goto L_0x02b5
            int r1 = android.view.View.MeasureSpec.getMode(r35)
            int r2 = android.view.View.MeasureSpec.getSize(r34)
            int r6 = android.view.View.MeasureSpec.getSize(r35)
            int r7 = r33.getPaddingLeft()
            int r8 = r33.getPaddingRight()
            int r7 = r7 + r8
            int r8 = r33.getPaddingTop()
            int r9 = r33.getPaddingBottom()
            int r8 = r8 + r9
            r9 = -2
            r10 = r35
            int r9 = getChildMeasureSpec(r10, r8, r9)
            int r2 = r2 - r7
            int r7 = r0.f4419m
            int r7 = r2 / r7
            int r10 = r0.f4419m
            int r10 = r2 % r10
            if (r7 != 0) goto L_0x006f
            r0.setMeasuredDimension(r2, r4)
            goto L_0x02cf
        L_0x006f:
            int r11 = r0.f4419m
            int r10 = r10 / r7
            int r11 = r11 + r10
            int r10 = r33.getChildCount()
            r16 = r7
            r3 = 0
            r7 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r20 = 0
        L_0x0082:
            if (r7 >= r10) goto L_0x010b
            android.view.View r13 = r0.getChildAt(r7)
            int r5 = r13.getVisibility()
            r4 = 8
            if (r5 == r4) goto L_0x0101
            boolean r4 = r13 instanceof android.support.p043v7.view.menu.ActionMenuItemView
            int r15 = r15 + 1
            if (r4 == 0) goto L_0x00a3
            int r5 = r0.f4420n
            r22 = r6
            int r6 = r0.f4420n
            r23 = r15
            r15 = 0
            r13.setPadding(r5, r15, r6, r15)
            goto L_0x00a8
        L_0x00a3:
            r22 = r6
            r23 = r15
            r15 = 0
        L_0x00a8:
            android.view.ViewGroup$LayoutParams r5 = r13.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r5 = (android.support.p043v7.widget.ActionMenuView.LayoutParams) r5
            r5.f4426f = r15
            r5.f4423c = r15
            r5.f4422b = r15
            r5.f4424d = r15
            r5.leftMargin = r15
            r5.rightMargin = r15
            if (r4 == 0) goto L_0x00c7
            r4 = r13
            android.support.v7.view.menu.ActionMenuItemView r4 = (android.support.p043v7.view.menu.ActionMenuItemView) r4
            boolean r4 = r4.mo3993b()
            if (r4 == 0) goto L_0x00c7
            r4 = 1
            goto L_0x00c8
        L_0x00c7:
            r4 = 0
        L_0x00c8:
            r5.f4425e = r4
            boolean r4 = r5.f4421a
            if (r4 == 0) goto L_0x00d0
            r4 = 1
            goto L_0x00d2
        L_0x00d0:
            r4 = r16
        L_0x00d2:
            int r4 = m4035a(r13, r11, r4, r9, r8)
            int r3 = java.lang.Math.max(r3, r4)
            boolean r6 = r5.f4424d
            if (r6 == 0) goto L_0x00e0
            int r17 = r17 + 1
        L_0x00e0:
            boolean r5 = r5.f4421a
            if (r5 == 0) goto L_0x00e5
            r14 = 1
        L_0x00e5:
            int r16 = r16 - r4
            int r5 = r13.getMeasuredHeight()
            int r5 = java.lang.Math.max(r12, r5)
            r6 = 1
            if (r4 != r6) goto L_0x00fd
            int r4 = r6 << r7
            long r12 = (long) r4
            long r12 = r20 | r12
            r20 = r12
            r15 = r23
            r12 = r5
            goto L_0x0103
        L_0x00fd:
            r12 = r5
            r15 = r23
            goto L_0x0103
        L_0x0101:
            r22 = r6
        L_0x0103:
            int r7 = r7 + 1
            r6 = r22
            r4 = 0
            r5 = 1
            goto L_0x0082
        L_0x010b:
            r22 = r6
            r4 = 2
            if (r14 == 0) goto L_0x0114
            if (r15 != r4) goto L_0x0114
            r5 = 1
            goto L_0x0115
        L_0x0114:
            r5 = 0
        L_0x0115:
            r6 = r16
            r7 = 0
        L_0x0118:
            r23 = 1
            if (r17 <= 0) goto L_0x01b9
            if (r6 <= 0) goto L_0x01b9
            r8 = 2147483647(0x7fffffff, float:NaN)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r8 = 0
            r13 = 0
            r25 = 0
        L_0x0128:
            if (r8 >= r10) goto L_0x015b
            android.view.View r16 = r0.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r16 = r16.getLayoutParams()
            r27 = r7
            r7 = r16
            android.support.v7.widget.ActionMenuView$LayoutParams r7 = (android.support.p043v7.widget.ActionMenuView.LayoutParams) r7
            r28 = r12
            boolean r12 = r7.f4424d
            if (r12 == 0) goto L_0x0154
            int r12 = r7.f4422b
            if (r12 >= r4) goto L_0x014a
            int r4 = r7.f4422b
            long r12 = r23 << r8
            r25 = r12
            r13 = 1
            goto L_0x0154
        L_0x014a:
            int r7 = r7.f4422b
            if (r7 != r4) goto L_0x0154
            long r29 = r23 << r8
            long r25 = r25 | r29
            int r13 = r13 + 1
        L_0x0154:
            int r8 = r8 + 1
            r7 = r27
            r12 = r28
            goto L_0x0128
        L_0x015b:
            r27 = r7
            r28 = r12
            long r20 = r20 | r25
            if (r13 > r6) goto L_0x01b4
            int r4 = r4 + 1
            r7 = r6
            r6 = 0
        L_0x0167:
            if (r6 >= r10) goto L_0x01ad
            android.view.View r8 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r12 = r8.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r12 = (android.support.p043v7.widget.ActionMenuView.LayoutParams) r12
            r31 = r2
            r13 = 1
            int r2 = r13 << r6
            r32 = r1
            long r1 = (long) r2
            long r23 = r25 & r1
            r18 = 0
            int r13 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x018a
            int r8 = r12.f4422b
            if (r8 != r4) goto L_0x01a6
            long r20 = r20 | r1
            goto L_0x01a6
        L_0x018a:
            if (r5 == 0) goto L_0x019c
            boolean r1 = r12.f4425e
            if (r1 == 0) goto L_0x019c
            r1 = 1
            if (r7 != r1) goto L_0x019c
            int r2 = r0.f4420n
            int r2 = r2 + r11
            int r13 = r0.f4420n
            r1 = 0
            r8.setPadding(r2, r1, r13, r1)
        L_0x019c:
            int r1 = r12.f4422b
            r2 = 1
            int r1 = r1 + r2
            r12.f4422b = r1
            r12.f4426f = r2
            int r7 = r7 + -1
        L_0x01a6:
            int r6 = r6 + 1
            r2 = r31
            r1 = r32
            goto L_0x0167
        L_0x01ad:
            r6 = r7
            r12 = r28
            r4 = 2
            r7 = 1
            goto L_0x0118
        L_0x01b4:
            r32 = r1
            r31 = r2
            goto L_0x01c1
        L_0x01b9:
            r32 = r1
            r31 = r2
            r27 = r7
            r28 = r12
        L_0x01c1:
            if (r14 != 0) goto L_0x01c8
            r1 = 1
            if (r15 != r1) goto L_0x01c9
            r2 = 1
            goto L_0x01ca
        L_0x01c8:
            r1 = 1
        L_0x01c9:
            r2 = 0
        L_0x01ca:
            if (r6 <= 0) goto L_0x027b
            r4 = 0
            int r7 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x027b
            int r15 = r15 - r1
            if (r6 < r15) goto L_0x01d9
            if (r2 != 0) goto L_0x01d9
            if (r3 <= r1) goto L_0x027b
        L_0x01d9:
            int r1 = java.lang.Long.bitCount(r20)
            float r1 = (float) r1
            if (r2 != 0) goto L_0x0217
            long r2 = r20 & r23
            r4 = 1056964608(0x3f000000, float:0.5)
            r7 = 0
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01fa
            r2 = 0
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r2 = (android.support.p043v7.widget.ActionMenuView.LayoutParams) r2
            boolean r2 = r2.f4425e
            if (r2 != 0) goto L_0x01fa
            float r1 = r1 - r4
        L_0x01fa:
            int r2 = r10 + -1
            r3 = 1
            int r5 = r3 << r2
            long r7 = (long) r5
            long r7 = r20 & r7
            r12 = 0
            int r3 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0217
            android.view.View r2 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r2 = (android.support.p043v7.widget.ActionMenuView.LayoutParams) r2
            boolean r2 = r2.f4425e
            if (r2 != 0) goto L_0x0217
            float r1 = r1 - r4
        L_0x0217:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0222
            int r6 = r6 * r11
            float r2 = (float) r6
            float r2 = r2 / r1
            int r4 = (int) r2
            goto L_0x0223
        L_0x0222:
            r4 = 0
        L_0x0223:
            r5 = r27
            r1 = 0
        L_0x0226:
            if (r1 >= r10) goto L_0x0279
            r2 = 1
            int r3 = r2 << r1
            long r6 = (long) r3
            long r6 = r20 & r6
            r12 = 0
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0275
            android.view.View r3 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r6 = (android.support.p043v7.widget.ActionMenuView.LayoutParams) r6
            boolean r3 = r3 instanceof android.support.p043v7.view.menu.ActionMenuItemView
            if (r3 == 0) goto L_0x0256
            r6.f4423c = r4
            r6.f4426f = r2
            if (r1 != 0) goto L_0x0252
            boolean r2 = r6.f4425e
            if (r2 != 0) goto L_0x0252
            int r2 = -r4
            r3 = 2
            int r2 = r2 / r3
            r6.leftMargin = r2
            goto L_0x0253
        L_0x0252:
            r3 = 2
        L_0x0253:
            r2 = 1
        L_0x0254:
            r5 = 1
            goto L_0x0276
        L_0x0256:
            r3 = 2
            boolean r2 = r6.f4421a
            if (r2 == 0) goto L_0x0265
            r6.f4423c = r4
            r2 = 1
            r6.f4426f = r2
            int r5 = -r4
            int r5 = r5 / r3
            r6.rightMargin = r5
            goto L_0x0254
        L_0x0265:
            r2 = 1
            if (r1 == 0) goto L_0x026c
            int r7 = r4 / 2
            r6.leftMargin = r7
        L_0x026c:
            int r7 = r10 + -1
            if (r1 == r7) goto L_0x0276
            int r7 = r4 / 2
            r6.rightMargin = r7
            goto L_0x0276
        L_0x0275:
            r3 = 2
        L_0x0276:
            int r1 = r1 + 1
            goto L_0x0226
        L_0x0279:
            r27 = r5
        L_0x027b:
            if (r27 == 0) goto L_0x02a4
            r1 = 0
        L_0x027e:
            if (r1 >= r10) goto L_0x02a4
            android.view.View r2 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r3 = (android.support.p043v7.widget.ActionMenuView.LayoutParams) r3
            boolean r4 = r3.f4426f
            if (r4 == 0) goto L_0x029f
            int r4 = r3.f4422b
            int r4 = r4 * r11
            int r3 = r3.f4423c
            int r4 = r4 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            r2.measure(r4, r9)
            goto L_0x02a1
        L_0x029f:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x02a1:
            int r1 = r1 + 1
            goto L_0x027e
        L_0x02a4:
            r3 = 1073741824(0x40000000, float:2.0)
            r1 = r32
            if (r1 == r3) goto L_0x02ad
            r1 = r28
            goto L_0x02af
        L_0x02ad:
            r1 = r22
        L_0x02af:
            r2 = r31
            r0.setMeasuredDimension(r2, r1)
            return
        L_0x02b5:
            r10 = r35
            r2 = 0
        L_0x02b8:
            if (r2 >= r1) goto L_0x02cc
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r3 = (android.support.p043v7.widget.ActionMenuView.LayoutParams) r3
            r4 = 0
            r3.rightMargin = r4
            r3.leftMargin = r4
            int r2 = r2 + 1
            goto L_0x02b8
        L_0x02cc:
            super.onMeasure(r34, r35)
        L_0x02cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    /* renamed from: a */
    static int m4035a(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView == null || !actionMenuItemView.mo3993b()) {
            z = false;
        } else {
            z = true;
        }
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, DynamicTabYellowPointVersion.DEFAULT), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.f4421a || !z) {
            z2 = false;
        }
        layoutParams.f4424d = z2;
        layoutParams.f4422b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f4417k) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C1467bj.m5138a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4421a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m4037b(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + layoutParams.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    m4037b(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f4421a) {
                    int i19 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
                i6++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f4421a) {
                int i21 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
            i6++;
        }
    }
}
