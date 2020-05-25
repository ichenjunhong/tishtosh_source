package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.view.C1019b;
import android.support.p030v4.view.C1019b.C1020a;
import android.support.p043v7.view.C1217a;
import android.support.p043v7.view.menu.ActionMenuItemView;
import android.support.p043v7.view.menu.ActionMenuItemView.C1232b;
import android.support.p043v7.view.menu.C1234b;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.C1260n;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.view.menu.C1264p;
import android.support.p043v7.view.menu.C1264p.C1265a;
import android.support.p043v7.view.menu.C1268s;
import android.support.p043v7.view.menu.C1272u;
import android.support.p043v7.widget.ActionMenuView.C1287a;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.ActionMenuPresenter */
final class ActionMenuPresenter extends C1234b implements C1020a {

    /* renamed from: A */
    private final SparseBooleanArray f4377A = new SparseBooleanArray();

    /* renamed from: B */
    private View f4378B;

    /* renamed from: C */
    private C1281b f4379C;

    /* renamed from: i */
    C1283d f4380i;

    /* renamed from: j */
    Drawable f4381j;

    /* renamed from: k */
    boolean f4382k;

    /* renamed from: l */
    public boolean f4383l;

    /* renamed from: m */
    public boolean f4384m;

    /* renamed from: n */
    C1285e f4385n;

    /* renamed from: o */
    C1280a f4386o;

    /* renamed from: p */
    C1282c f4387p;

    /* renamed from: q */
    final C1286f f4388q = new C1286f();

    /* renamed from: r */
    int f4389r;

    /* renamed from: s */
    private boolean f4390s;

    /* renamed from: t */
    private int f4391t;

    /* renamed from: u */
    private int f4392u;

    /* renamed from: v */
    private int f4393v;

    /* renamed from: w */
    private boolean f4394w;

    /* renamed from: x */
    private boolean f4395x;

    /* renamed from: y */
    private boolean f4396y;

    /* renamed from: z */
    private int f4397z;

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$SavedState */
    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        public int f4398a;

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        SavedState(Parcel parcel) {
            this.f4398a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4398a);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$a */
    class C1280a extends C1260n {
        /* renamed from: c */
        public final void mo4278c() {
            ActionMenuPresenter.this.f4386o = null;
            ActionMenuPresenter.this.f4389r = 0;
            super.mo4278c();
        }

        public C1280a(Context context, C1272u uVar, View view) {
            View view2;
            super(context, uVar, view, false, R.attr.a4);
            if (!((C1250j) uVar.getItem()).mo4172f()) {
                if (ActionMenuPresenter.this.f4380i == null) {
                    view2 = (View) ActionMenuPresenter.this.f4150g;
                } else {
                    view2 = ActionMenuPresenter.this.f4380i;
                }
                this.f4285a = view2;
            }
            mo4275a((C1263a) ActionMenuPresenter.this.f4388q);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$b */
    class C1281b extends C1232b {
        /* renamed from: a */
        public final C1268s mo4011a() {
            if (ActionMenuPresenter.this.f4386o != null) {
                return ActionMenuPresenter.this.f4386o.mo4273a();
            }
            return null;
        }

        C1281b() {
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$c */
    class C1282c implements Runnable {

        /* renamed from: b */
        private C1285e f4402b;

        public final void run() {
            if (ActionMenuPresenter.this.f4146c != null) {
                C1246h hVar = ActionMenuPresenter.this.f4146c;
                if (hVar.f4217c != null) {
                    hVar.f4217c.mo1289a(hVar);
                }
            }
            View view = (View) ActionMenuPresenter.this.f4150g;
            if (!(view == null || view.getWindowToken() == null || !this.f4402b.mo4277b())) {
                ActionMenuPresenter.this.f4385n = this.f4402b;
            }
            ActionMenuPresenter.this.f4387p = null;
        }

        public C1282c(C1285e eVar) {
            this.f4402b = eVar;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$d */
    class C1283d extends AppCompatImageView implements C1287a {

        /* renamed from: b */
        private final float[] f4404b = new float[2];

        /* renamed from: c */
        public final boolean mo3994c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo3995d() {
            return false;
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo4415d();
            return true;
        }

        public C1283d(Context context) {
            super(context, null, R.attr.a3);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C1455bd.m5087a(this, getContentDescription());
            setOnTouchListener(new C1407ac(this, ActionMenuPresenter.this) {
                /* renamed from: b */
                public final boolean mo4010b() {
                    ActionMenuPresenter.this.mo4415d();
                    return true;
                }

                /* renamed from: a */
                public final C1268s mo4009a() {
                    if (ActionMenuPresenter.this.f4385n == null) {
                        return null;
                    }
                    return ActionMenuPresenter.this.f4385n.mo4273a();
                }

                /* renamed from: c */
                public final boolean mo4427c() {
                    if (ActionMenuPresenter.this.f4387p != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.mo4416e();
                    return true;
                }
            });
        }

        /* access modifiers changed from: protected */
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0809a.m2326a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$e */
    class C1285e extends C1260n {
        /* renamed from: c */
        public final void mo4278c() {
            if (ActionMenuPresenter.this.f4146c != null) {
                ActionMenuPresenter.this.f4146c.close();
            }
            ActionMenuPresenter.this.f4385n = null;
            super.mo4278c();
        }

        public C1285e(Context context, C1246h hVar, View view, boolean z) {
            super(context, hVar, view, true, R.attr.a4);
            mo4275a((C1263a) ActionMenuPresenter.this.f4388q);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$f */
    class C1286f implements C1263a {
        C1286f() {
        }

        /* renamed from: a */
        public final boolean mo3716a(C1246h hVar) {
            if (hVar == null) {
                return false;
            }
            ActionMenuPresenter.this.f4389r = ((C1272u) hVar).getItem().getItemId();
            C1263a aVar = ActionMenuPresenter.this.f4149f;
            if (aVar != null) {
                return aVar.mo3716a(hVar);
            }
            return false;
        }

        /* renamed from: a */
        public final void mo3715a(C1246h hVar, boolean z) {
            if (hVar instanceof C1272u) {
                hVar.mo4146j().mo4126b(false);
            }
            C1263a aVar = ActionMenuPresenter.this.f4149f;
            if (aVar != null) {
                aVar.mo3715a(hVar, z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo4063a(int i, C1250j jVar) {
        return jVar.mo4172f();
    }

    /* renamed from: a */
    public final boolean mo4064a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f4380i) {
            return false;
        }
        return super.mo4064a(viewGroup, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1089a(android.support.p043v7.view.menu.C1272u r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r8
        L_0x0009:
            android.support.v7.view.menu.h r2 = r0.f4321m
            android.support.v7.view.menu.h r3 = r7.f4146c
            if (r2 == r3) goto L_0x0014
            android.support.v7.view.menu.h r0 = r0.f4321m
            android.support.v7.view.menu.u r0 = (android.support.p043v7.view.menu.C1272u) r0
            goto L_0x0009
        L_0x0014:
            android.view.MenuItem r0 = r0.getItem()
            android.support.v7.view.menu.p r2 = r7.f4150g
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x003a
            int r3 = r2.getChildCount()
            r4 = 0
        L_0x0023:
            if (r4 >= r3) goto L_0x003a
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof android.support.p043v7.view.menu.C1264p.C1265a
            if (r6 == 0) goto L_0x0037
            r6 = r5
            android.support.v7.view.menu.p$a r6 = (android.support.p043v7.view.menu.C1264p.C1265a) r6
            android.support.v7.view.menu.j r6 = r6.getItemData()
            if (r6 != r0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            int r4 = r4 + 1
            goto L_0x0023
        L_0x003a:
            r5 = 0
        L_0x003b:
            if (r5 != 0) goto L_0x003e
            return r1
        L_0x003e:
            android.view.MenuItem r0 = r8.getItem()
            int r0 = r0.getItemId()
            r7.f4389r = r0
            int r0 = r8.size()
            r2 = 0
        L_0x004d:
            r3 = 1
            if (r2 >= r0) goto L_0x0065
            android.view.MenuItem r4 = r8.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L_0x0062
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L_0x0062
            r1 = 1
            goto L_0x0065
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004d
        L_0x0065:
            android.support.v7.widget.ActionMenuPresenter$a r0 = new android.support.v7.widget.ActionMenuPresenter$a
            android.content.Context r2 = r7.f4145b
            r0.<init>(r2, r8, r5)
            r7.f4386o = r0
            android.support.v7.widget.ActionMenuPresenter$a r0 = r7.f4386o
            r0.mo4276a(r1)
            android.support.v7.widget.ActionMenuPresenter$a r0 = r7.f4386o
            boolean r0 = r0.mo4277b()
            if (r0 == 0) goto L_0x007f
            super.mo1089a(r8)
            return r3
        L_0x007f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.ActionMenuPresenter.mo1089a(android.support.v7.view.menu.u):boolean");
    }

    /* renamed from: a */
    public final boolean mo1087a() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        int i5 = 0;
        if (actionMenuPresenter.f4146c != null) {
            arrayList = actionMenuPresenter.f4146c.mo4140g();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f4393v;
        int i7 = actionMenuPresenter.f4392u;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f4150g;
        int i8 = i6;
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            C1250j jVar = (C1250j) arrayList.get(i11);
            if (jVar.mo4186h()) {
                i9++;
            } else if (jVar.mo4173g()) {
                i10++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.f4384m && jVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (actionMenuPresenter.f4383l && (z2 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f4377A;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f4395x) {
            i3 = i7 / actionMenuPresenter.f4397z;
            i2 = ((i7 % actionMenuPresenter.f4397z) / i3) + actionMenuPresenter.f4397z;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = i7;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i) {
            C1250j jVar2 = (C1250j) arrayList.get(i14);
            if (jVar2.mo4186h()) {
                View a = actionMenuPresenter.mo4061a(jVar2, actionMenuPresenter.f4378B, viewGroup);
                if (actionMenuPresenter.f4378B == null) {
                    actionMenuPresenter.f4378B = a;
                }
                if (actionMenuPresenter.f4395x) {
                    i3 -= ActionMenuView.m4035a(a, i2, i3, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i15 != 0) {
                    measuredWidth = i15;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                jVar2.mo4168d(z);
                i4 = i;
                i15 = measuredWidth;
            } else if (jVar2.mo4173g()) {
                int groupId2 = jVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i13 > 0 && (!actionMenuPresenter.f4395x || i3 > 0);
                if (z4) {
                    boolean z5 = z4;
                    View a2 = actionMenuPresenter.mo4061a(jVar2, actionMenuPresenter.f4378B, viewGroup);
                    i4 = i;
                    if (actionMenuPresenter.f4378B == null) {
                        actionMenuPresenter.f4378B = a2;
                    }
                    if (actionMenuPresenter.f4395x) {
                        int a3 = ActionMenuView.m4035a(a2, i2, i3, makeMeasureSpec, 0);
                        i3 -= a3;
                        if (a3 == 0) {
                            z5 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    if (actionMenuPresenter.f4395x) {
                        z4 = z5 & (i13 >= 0);
                    } else {
                        z4 = z5 & (i13 + i15 > 0);
                    }
                } else {
                    boolean z6 = z4;
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i16 = 0;
                    while (i16 < i14) {
                        C1250j jVar3 = (C1250j) arrayList.get(i16);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.mo4172f()) {
                                i12++;
                            }
                            jVar3.mo4168d(false);
                        }
                        i16++;
                    }
                }
                if (z4) {
                    i12--;
                }
                jVar2.mo4168d(z4);
            } else {
                i4 = i;
                jVar2.mo4168d(false);
                i14++;
                i = i4;
                actionMenuPresenter = this;
                i5 = 0;
            }
            i14++;
            i = i4;
            actionMenuPresenter = this;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: c */
    public final Parcelable mo1092c() {
        SavedState savedState = new SavedState();
        savedState.f4398a = this.f4389r;
        return savedState;
    }

    /* renamed from: f */
    public final boolean mo4417f() {
        return mo4416e() | mo4418g();
    }

    /* renamed from: g */
    public final boolean mo4418g() {
        if (this.f4386o == null) {
            return false;
        }
        this.f4386o.dismiss();
        return true;
    }

    /* renamed from: h */
    public final boolean mo4419h() {
        if (this.f4385n == null || !this.f4385n.mo4279d()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo4416e() {
        if (this.f4387p == null || this.f4150g == null) {
            C1285e eVar = this.f4385n;
            if (eVar == null) {
                return false;
            }
            eVar.dismiss();
            return true;
        }
        ((View) this.f4150g).removeCallbacks(this.f4387p);
        this.f4387p = null;
        return true;
    }

    /* renamed from: d */
    public final boolean mo4415d() {
        if (!this.f4383l || mo4419h() || this.f4146c == null || this.f4150g == null || this.f4387p != null || this.f4146c.mo4144i().isEmpty()) {
            return false;
        }
        C1285e eVar = new C1285e(this.f4145b, this.f4146c, this.f4380i, true);
        this.f4387p = new C1282c(eVar);
        ((View) this.f4150g).post(this.f4387p);
        super.mo1089a((C1272u) null);
        return true;
    }

    /* renamed from: c */
    public final void mo4414c(boolean z) {
        this.f4383l = true;
        this.f4390s = true;
    }

    /* renamed from: a */
    public final C1264p mo4060a(ViewGroup viewGroup) {
        C1264p pVar = this.f4150g;
        C1264p a = super.mo4060a(viewGroup);
        if (pVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.d, R.layout.c);
    }

    /* renamed from: a */
    public final void mo4412a(Configuration configuration) {
        if (!this.f4394w) {
            this.f4393v = C1217a.m3676a(this.f4145b).mo3935a();
        }
        if (this.f4146c != null) {
            this.f4146c.mo1150a(true);
        }
    }

    /* renamed from: b */
    public final void mo3201b(boolean z) {
        if (z) {
            super.mo1089a((C1272u) null);
            return;
        }
        if (this.f4146c != null) {
            this.f4146c.mo4126b(false);
        }
    }

    /* renamed from: a */
    public final void mo1083a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.f4398a > 0) {
                MenuItem findItem = this.f4146c.findItem(savedState.f4398a);
                if (findItem != null) {
                    mo1089a((C1272u) findItem.getSubMenu());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4413a(ActionMenuView actionMenuView) {
        this.f4150g = actionMenuView;
        actionMenuView.mo1058a(this.f4146c);
    }

    /* renamed from: a */
    public final void mo1086a(boolean z) {
        ArrayList arrayList;
        super.mo1086a(z);
        ((View) this.f4150g).requestLayout();
        boolean z2 = false;
        if (this.f4146c != null) {
            C1246h hVar = this.f4146c;
            hVar.mo4142h();
            ArrayList<C1250j> arrayList2 = hVar.f4219e;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C1019b a = ((C1250j) arrayList2.get(i)).mo1778a();
                if (a != null) {
                    a.f3273b = this;
                }
            }
        }
        if (this.f4146c != null) {
            arrayList = this.f4146c.mo4144i();
        } else {
            arrayList = null;
        }
        if (this.f4383l && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !((C1250j) arrayList.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f4380i == null) {
                this.f4380i = new C1283d(this.f4144a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f4380i.getParent();
            if (viewGroup != this.f4150g) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f4380i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4150g;
                actionMenuView.addView(this.f4380i, actionMenuView.mo4428a());
            }
        } else if (this.f4380i != null && this.f4380i.getParent() == this.f4150g) {
            ((ViewGroup) this.f4150g).removeView(this.f4380i);
        }
        ((ActionMenuView) this.f4150g).setOverflowReserved(this.f4383l);
    }

    /* renamed from: a */
    public final void mo1084a(C1246h hVar, boolean z) {
        mo4417f();
        super.mo1084a(hVar, z);
    }

    /* renamed from: a */
    public final void mo1082a(Context context, C1246h hVar) {
        super.mo1082a(context, hVar);
        Resources resources = context.getResources();
        C1217a a = C1217a.m3676a(context);
        if (!this.f4390s) {
            boolean z = true;
            if (VERSION.SDK_INT < 19 && ViewConfiguration.get(a.f4017a).hasPermanentMenuKey()) {
                z = false;
            }
            this.f4383l = z;
        }
        if (!this.f4396y) {
            this.f4391t = a.f4017a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.f4394w) {
            this.f4393v = a.mo3935a();
        }
        int i = this.f4391t;
        if (this.f4383l) {
            if (this.f4380i == null) {
                this.f4380i = new C1283d(this.f4144a);
                if (this.f4382k) {
                    this.f4380i.setImageDrawable(this.f4381j);
                    this.f4381j = null;
                    this.f4382k = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f4380i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f4380i.getMeasuredWidth();
        } else {
            this.f4380i = null;
        }
        this.f4392u = i;
        this.f4397z = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f4378B = null;
    }

    /* renamed from: a */
    public final void mo4062a(C1250j jVar, C1265a aVar) {
        aVar.mo1036a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f4150g);
        if (this.f4379C == null) {
            this.f4379C = new C1281b();
        }
        actionMenuItemView.setPopupCallback(this.f4379C);
    }

    /* renamed from: a */
    public final View mo4061a(C1250j jVar, View view, ViewGroup viewGroup) {
        int i;
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.mo4193j()) {
            actionView = super.mo4061a(jVar, view, viewGroup);
        }
        if (jVar.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }
}
