package com.p683ss.android.ugc.aweme.journey.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.C1422ak;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1332i.C1336b;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1346r.C1348b;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager */
public class FlexboxLayoutManager extends C1332i implements C1348b, C35754a {

    /* renamed from: i */
    static final /* synthetic */ boolean f91762i = (!FlexboxLayoutManager.class.desiredAssertionStatus());

    /* renamed from: j */
    private static final Rect f91763j = new Rect();

    /* renamed from: K */
    private int f91764K;

    /* renamed from: L */
    private int f91765L;

    /* renamed from: M */
    private int f91766M;

    /* renamed from: N */
    private SparseArray<View> f91767N;

    /* renamed from: O */
    private final Context f91768O;

    /* renamed from: P */
    private View f91769P;

    /* renamed from: Q */
    private int f91770Q;

    /* renamed from: R */
    private C35757a f91771R;

    /* renamed from: a */
    public int f91772a;

    /* renamed from: b */
    public int f91773b;

    /* renamed from: c */
    public boolean f91774c;

    /* renamed from: d */
    public List<C35755b> f91775d;

    /* renamed from: e */
    public final C35756c f91776e;

    /* renamed from: f */
    public C1422ak f91777f;

    /* renamed from: g */
    public C1422ak f91778g;

    /* renamed from: h */
    public boolean f91779h;

    /* renamed from: k */
    private int f91780k;

    /* renamed from: l */
    private int f91781l;

    /* renamed from: m */
    private int f91782m;

    /* renamed from: n */
    private boolean f91783n;

    /* renamed from: o */
    private C1343o f91784o;

    /* renamed from: p */
    private C1349s f91785p;

    /* renamed from: q */
    private C35753b f91786q;

    /* renamed from: r */
    private C35752a f91787r;

    /* renamed from: s */
    private SavedState f91788s;

    /* renamed from: t */
    private int f91789t;

    /* renamed from: com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$LayoutParams */
    public static class LayoutParams extends android.support.p043v7.widget.RecyclerView.LayoutParams implements FlexItem {
        public static final Creator<LayoutParams> CREATOR = new Creator<LayoutParams>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new LayoutParams[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }
        };

        /* renamed from: a */
        private float f91790a;

        /* renamed from: b */
        private float f91791b = 1.0f;

        /* renamed from: g */
        private int f91792g = -1;

        /* renamed from: h */
        private float f91793h = -1.0f;

        /* renamed from: i */
        private int f91794i;

        /* renamed from: j */
        private int f91795j;

        /* renamed from: k */
        private int f91796k = 16777215;

        /* renamed from: l */
        private int f91797l = 16777215;

        /* renamed from: m */
        private boolean f91798m;

        /* renamed from: a */
        public final int mo74349a() {
            return this.width;
        }

        /* renamed from: b */
        public final int mo74350b() {
            return this.height;
        }

        /* renamed from: c */
        public final float mo74351c() {
            return this.f91790a;
        }

        /* renamed from: d */
        public final float mo74352d() {
            return this.f91791b;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final int mo74353e() {
            return this.f91792g;
        }

        /* renamed from: f */
        public final int mo74354f() {
            return this.f91794i;
        }

        /* renamed from: g */
        public final int mo74355g() {
            return this.f91795j;
        }

        /* renamed from: h */
        public final int mo74356h() {
            return this.f91796k;
        }

        /* renamed from: i */
        public final int mo74357i() {
            return this.f91797l;
        }

        /* renamed from: j */
        public final boolean mo74358j() {
            return this.f91798m;
        }

        /* renamed from: k */
        public final float mo74359k() {
            return this.f91793h;
        }

        /* renamed from: l */
        public final int mo74360l() {
            return this.leftMargin;
        }

        /* renamed from: m */
        public final int mo74361m() {
            return this.topMargin;
        }

        /* renamed from: n */
        public final int mo74362n() {
            return this.rightMargin;
        }

        /* renamed from: o */
        public final int mo74363o() {
            return this.bottomMargin;
        }

        protected LayoutParams(Parcel parcel) {
            boolean z;
            super(-2, -2);
            this.f91790a = parcel.readFloat();
            this.f91791b = parcel.readFloat();
            this.f91792g = parcel.readInt();
            this.f91793h = parcel.readFloat();
            this.f91794i = parcel.readInt();
            this.f91795j = parcel.readInt();
            this.f91796k = parcel.readInt();
            this.f91797l = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f91798m = z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(int i, int i2) {
            super(-2, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f91790a);
            parcel.writeFloat(this.f91791b);
            parcel.writeInt(this.f91792g);
            parcel.writeFloat(this.f91793h);
            parcel.writeInt(this.f91794i);
            parcel.writeInt(this.f91795j);
            parcel.writeInt(this.f91796k);
            parcel.writeInt(this.f91797l);
            parcel.writeByte(this.f91798m ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$SavedState */
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
        public int f91799a;

        /* renamed from: b */
        public int f91800b;

        SavedState() {
        }

        /* renamed from: a */
        public final void mo74383a() {
            this.f91799a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.f91799a);
            sb.append(", mAnchorOffset=");
            sb.append(this.f91800b);
            sb.append('}');
            return sb.toString();
        }

        private SavedState(Parcel parcel) {
            this.f91799a = parcel.readInt();
            this.f91800b = parcel.readInt();
        }

        /* renamed from: a */
        public final boolean mo74384a(int i) {
            if (this.f91799a < 0 || this.f91799a >= i) {
                return false;
            }
            return true;
        }

        private SavedState(SavedState savedState) {
            this.f91799a = savedState.f91799a;
            this.f91800b = savedState.f91800b;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f91799a);
            parcel.writeInt(this.f91800b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a */
    class C35752a {

        /* renamed from: h */
        static final /* synthetic */ boolean f91801h = (!FlexboxLayoutManager.class.desiredAssertionStatus());

        /* renamed from: a */
        public int f91802a;

        /* renamed from: b */
        public int f91803b;

        /* renamed from: c */
        public int f91804c;

        /* renamed from: d */
        public int f91805d;

        /* renamed from: e */
        public boolean f91806e;

        /* renamed from: f */
        public boolean f91807f;

        /* renamed from: g */
        public boolean f91808g;

        /* renamed from: a */
        public final void mo74390a() {
            this.f91802a = -1;
            this.f91803b = -1;
            this.f91804c = DynamicTabYellowPointVersion.DEFAULT;
            boolean z = false;
            this.f91807f = false;
            this.f91808g = false;
            if (FlexboxLayoutManager.this.mo74374i()) {
                if (FlexboxLayoutManager.this.f91773b == 0) {
                    if (FlexboxLayoutManager.this.f91772a == 1) {
                        z = true;
                    }
                    this.f91806e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f91773b == 2) {
                    z = true;
                }
                this.f91806e = z;
            } else if (FlexboxLayoutManager.this.f91773b == 0) {
                if (FlexboxLayoutManager.this.f91772a == 3) {
                    z = true;
                }
                this.f91806e = z;
            } else {
                if (FlexboxLayoutManager.this.f91773b == 2) {
                    z = true;
                }
                this.f91806e = z;
            }
        }

        /* renamed from: b */
        public final void mo74391b() {
            int i;
            int i2;
            if (FlexboxLayoutManager.this.mo74374i() || !FlexboxLayoutManager.this.f91774c) {
                if (this.f91806e) {
                    i = FlexboxLayoutManager.this.f91777f.mo5520c();
                } else {
                    i = FlexboxLayoutManager.this.f91777f.mo5518b();
                }
                this.f91804c = i;
                return;
            }
            if (this.f91806e) {
                i2 = FlexboxLayoutManager.this.f91777f.mo5520c();
            } else {
                i2 = FlexboxLayoutManager.this.f4745I - FlexboxLayoutManager.this.f91777f.mo5518b();
            }
            this.f91804c = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f91802a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.f91803b);
            sb.append(", mCoordinate=");
            sb.append(this.f91804c);
            sb.append(", mPerpendicularCoordinate=");
            sb.append(this.f91805d);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f91806e);
            sb.append(", mValid=");
            sb.append(this.f91807f);
            sb.append(", mAssignedFromSavedState=");
            sb.append(this.f91808g);
            sb.append('}');
            return sb.toString();
        }

        private C35752a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b */
    static class C35753b {

        /* renamed from: a */
        public int f91810a;

        /* renamed from: b */
        public boolean f91811b;

        /* renamed from: c */
        public int f91812c;

        /* renamed from: d */
        public int f91813d;

        /* renamed from: e */
        public int f91814e;

        /* renamed from: f */
        public int f91815f;

        /* renamed from: g */
        public int f91816g;

        /* renamed from: h */
        public int f91817h;

        /* renamed from: i */
        public int f91818i;

        /* renamed from: j */
        public boolean f91819j;

        private C35753b() {
            this.f91817h = 1;
            this.f91818i = 1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.f91810a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.f91812c);
            sb.append(", mPosition=");
            sb.append(this.f91813d);
            sb.append(", mOffset=");
            sb.append(this.f91814e);
            sb.append(", mScrollingOffset=");
            sb.append(this.f91815f);
            sb.append(", mLastScrollDelta=");
            sb.append(this.f91816g);
            sb.append(", mItemDirection=");
            sb.append(this.f91817h);
            sb.append(", mLayoutDirection=");
            sb.append(this.f91818i);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: c */
    public final int mo74370c() {
        return this.f91772a;
    }

    /* renamed from: g */
    public final int mo74372g() {
        return this.f91773b;
    }

    /* renamed from: h */
    public final int mo74373h() {
        return this.f91781l;
    }

    /* renamed from: k */
    public final int mo74376k() {
        return this.f91782m;
    }

    /* renamed from: l */
    public final List<C35755b> mo74377l() {
        return this.f91775d;
    }

    /* renamed from: a */
    public final int mo74364a(View view, int i, int i2) {
        if (mo74374i()) {
            return m4425m(view) + m4426n(view);
        }
        return m4423k(view) + m4424l(view);
    }

    /* renamed from: a */
    public final void mo74366a(View view, int i, int i2, C35755b bVar) {
        mo5039b(view, f91763j);
        if (mo74374i()) {
            int m = m4425m(view) + m4426n(view);
            bVar.f91824e += m;
            bVar.f91825f += m;
            return;
        }
        int k = m4423k(view) + m4424l(view);
        bVar.f91824e += k;
        bVar.f91825f += k;
    }

    /* renamed from: a */
    public final View mo4672a(int i) {
        return m80765l(i);
    }

    /* renamed from: a */
    public final void mo74365a(int i, View view) {
        this.f91767N.put(i, view);
    }

    /* renamed from: a */
    public final android.support.p043v7.widget.RecyclerView.LayoutParams mo4668a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    public final boolean mo4684a(android.support.p043v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: a */
    public final void mo4724a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f91788s = (SavedState) parcelable;
            mo5057n();
        }
    }

    /* renamed from: a */
    public final void mo4680a(RecyclerView recyclerView, int i, int i2) {
        super.mo4680a(recyclerView, i, i2);
        m80766m(i);
    }

    /* renamed from: a */
    public final void mo4682a(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo4682a(recyclerView, i, i2, obj);
        m80766m(i);
    }

    /* renamed from: b */
    public final void mo4687b(RecyclerView recyclerView, int i, int i2) {
        super.mo4687b(recyclerView, i, i2);
        m80766m(i);
    }

    /* renamed from: a */
    public final void mo4681a(RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo4681a(recyclerView, i, i2, i3);
        m80766m(Math.min(i, i2));
    }

    /* renamed from: a */
    public final void mo4677a(C1349s sVar) {
        super.mo4677a(sVar);
        this.f91788s = null;
        this.f91789t = -1;
        this.f91764K = DynamicTabYellowPointVersion.DEFAULT;
        this.f91770Q = -1;
        this.f91787r.mo74390a();
        this.f91767N.clear();
    }

    /* renamed from: a */
    private void m80746a(C35752a aVar, boolean z, boolean z2) {
        if (z2) {
            m80733G();
        } else {
            this.f91786q.f91811b = false;
        }
        if (mo74374i() || !this.f91774c) {
            this.f91786q.f91810a = this.f91777f.mo5520c() - aVar.f91804c;
        } else {
            this.f91786q.f91810a = aVar.f91804c - mo5065v();
        }
        this.f91786q.f91813d = aVar.f91802a;
        this.f91786q.f91817h = 1;
        this.f91786q.f91818i = 1;
        this.f91786q.f91814e = aVar.f91804c;
        this.f91786q.f91815f = DynamicTabYellowPointVersion.DEFAULT;
        this.f91786q.f91812c = aVar.f91803b;
        if (z && this.f91775d.size() > 1 && aVar.f91803b >= 0 && aVar.f91803b < this.f91775d.size() - 1) {
            C35755b bVar = (C35755b) this.f91775d.get(aVar.f91803b);
            this.f91786q.f91812c++;
            this.f91786q.f91813d += bVar.f91827h;
        }
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        C1415af afVar = new C1415af(recyclerView.getContext());
        afVar.f4778g = i;
        mo5022a((C1346r) afVar);
    }

    /* renamed from: a */
    public final void mo4725a(RecyclerView recyclerView, C1343o oVar) {
        super.mo4725a(recyclerView, oVar);
        if (this.f91779h) {
            mo5042c(oVar);
            oVar.mo5091a();
        }
    }

    /* renamed from: a */
    public final int mo4665a(int i, C1343o oVar, C1349s sVar) {
        if (!mo74374i() || (this.f91773b == 0 && mo74374i())) {
            int c = m80753c(i, oVar, sVar);
            this.f91767N.clear();
            return c;
        }
        int p = m80769p(i);
        this.f91787r.f91805d += p;
        this.f91778g.mo5517a(-p);
        return p;
    }

    /* renamed from: a */
    private boolean m80747a(View view, boolean z) {
        int t = mo5063t();
        int u = mo5064u();
        int v = this.f4745I - mo5065v();
        int w = this.f4746J - mo5066w();
        int g = mo5049g(view) - ((android.support.p043v7.widget.RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
        int h = mo5051h(view) - ((android.support.p043v7.widget.RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
        int i = mo5053i(view) + ((android.support.p043v7.widget.RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
        int j = mo5055j(view) + ((android.support.p043v7.widget.RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
        return z ? (t <= g && v >= i) && (u <= h && w >= j) : (g >= v || i >= t) && (h >= w || j >= u);
    }

    /* renamed from: F */
    private View m80732F() {
        return mo5050g(0);
    }

    /* renamed from: a */
    public final android.support.p043v7.widget.RecyclerView.LayoutParams mo4667a() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: b */
    public final int mo74368b() {
        return this.f91785p.mo5115a();
    }

    /* renamed from: I */
    private void m80735I() {
        if (this.f91786q == null) {
            this.f91786q = new C35753b();
        }
    }

    /* renamed from: J */
    private void m80736J() {
        this.f91775d.clear();
        this.f91787r.mo74390a();
        this.f91787r.f91805d = 0;
    }

    /* renamed from: i */
    public final boolean mo74374i() {
        if (this.f91772a == 0 || this.f91772a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    private void m80733G() {
        int i;
        boolean z;
        if (mo74374i()) {
            i = this.f4744H;
        } else {
            i = this.f4743G;
        }
        C35753b bVar = this.f91786q;
        if (i == 0 || i == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        bVar.f91811b = z;
    }

    /* renamed from: K */
    private int m80737K() {
        View a = m80741a(0, mo5062s(), false);
        if (a == null) {
            return -1;
        }
        return m4418c(a);
    }

    /* renamed from: m */
    public final int mo74378m() {
        View a = m80741a(mo5062s() - 1, -1, false);
        if (a == null) {
            return -1;
        }
        return m4418c(a);
    }

    /* renamed from: H */
    private void m80734H() {
        if (this.f91777f == null) {
            if (mo74374i()) {
                if (this.f91773b != 0) {
                    this.f91777f = C1422ak.m4899b((C1332i) this);
                    this.f91778g = C1422ak.m4897a((C1332i) this);
                    return;
                }
            } else if (this.f91773b == 0) {
                this.f91777f = C1422ak.m4899b((C1332i) this);
                this.f91778g = C1422ak.m4897a((C1332i) this);
                return;
            }
            this.f91777f = C1422ak.m4897a((C1332i) this);
            this.f91778g = C1422ak.m4899b((C1332i) this);
        }
    }

    /* renamed from: e */
    public final boolean mo4742e() {
        int i;
        if (this.f91773b == 0) {
            return mo74374i();
        }
        if (mo74374i()) {
            int i2 = this.f4745I;
            if (this.f91769P != null) {
                i = this.f91769P.getWidth();
            } else {
                i = 0;
            }
            if (i2 <= i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final int mo74375j() {
        if (this.f91775d.size() == 0) {
            return 0;
        }
        int i = DynamicTabYellowPointVersion.DEFAULT;
        int size = this.f91775d.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((C35755b) this.f91775d.get(i2)).f91824e);
        }
        return i;
    }

    /* renamed from: f */
    public final boolean mo4745f() {
        int i;
        if (this.f91773b != 0) {
            if (!mo74374i()) {
                int i2 = this.f4746J;
                if (this.f91769P != null) {
                    i = this.f91769P.getHeight();
                } else {
                    i = 0;
                }
                if (i2 > i) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (!mo74374i()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final Parcelable mo4739d() {
        if (this.f91788s != null) {
            return new SavedState(this.f91788s);
        }
        SavedState savedState = new SavedState();
        if (mo5062s() > 0) {
            View F = m80732F();
            savedState.f91799a = m4418c(F);
            savedState.f91800b = this.f91777f.mo5516a(F) - this.f91777f.mo5518b();
        } else {
            savedState.mo74383a();
        }
        return savedState;
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    /* renamed from: c */
    public final int mo4735c(C1349s sVar) {
        return m80762i(sVar);
    }

    /* renamed from: d */
    public final int mo4737d(C1349s sVar) {
        return m80761h(sVar);
    }

    /* renamed from: e */
    public final int mo4740e(C1349s sVar) {
        return m80761h(sVar);
    }

    /* renamed from: f */
    public final int mo4744f(C1349s sVar) {
        return m80763j(sVar);
    }

    /* renamed from: g */
    public final int mo4746g(C1349s sVar) {
        return m80763j(sVar);
    }

    /* renamed from: d */
    public final void mo5047d(RecyclerView recyclerView) {
        super.mo5047d(recyclerView);
        this.f91769P = (View) recyclerView.getParent();
    }

    /* renamed from: b */
    private void m80750b(int i) {
        if (this.f91772a != i) {
            mo5061r();
            this.f91772a = i;
            this.f91777f = null;
            this.f91778g = null;
            m80736J();
            mo5057n();
        }
    }

    /* renamed from: k */
    private void m80764k(int i) {
        if (this.f91781l != 4) {
            mo5061r();
            m80736J();
            this.f91781l = 4;
            mo5057n();
        }
    }

    /* renamed from: l */
    private View m80765l(int i) {
        View view = (View) this.f91767N.get(i);
        if (view != null) {
            return view;
        }
        return this.f91784o.mo5096b(i);
    }

    /* renamed from: d_ */
    public final int mo74371d_(View view) {
        if (mo74374i()) {
            return m4423k(view) + m4424l(view);
        }
        return m4425m(view) + m4426n(view);
    }

    /* renamed from: e */
    public final void mo4741e(int i) {
        this.f91789t = i;
        this.f91764K = DynamicTabYellowPointVersion.DEFAULT;
        if (this.f91788s != null) {
            this.f91788s.mo74383a();
        }
        mo5057n();
    }

    /* renamed from: f */
    private void m80760f(int i) {
        if (i == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        } else if (this.f91773b != i) {
            if (this.f91773b == 0 || i == 0) {
                mo5061r();
                m80736J();
            }
            this.f91773b = i;
            this.f91777f = null;
            this.f91778g = null;
            mo5057n();
        }
    }

    /* renamed from: h */
    private int m80761h(C1349s sVar) {
        if (mo5062s() == 0) {
            return 0;
        }
        int a = sVar.mo5115a();
        m80734H();
        View n = m80767n(a);
        View o = m80768o(a);
        if (sVar.mo5115a() == 0 || n == null || o == null) {
            return 0;
        }
        return Math.min(this.f91777f.mo5524e(), this.f91777f.mo5519b(o) - this.f91777f.mo5516a(n));
    }

    /* renamed from: n */
    private View m80767n(int i) {
        if (f91762i || this.f91776e.f91839a != null) {
            View c = m80754c(0, mo5062s(), i);
            if (c == null) {
                return null;
            }
            int i2 = this.f91776e.f91839a[m4418c(c)];
            if (i2 == -1) {
                return null;
            }
            return m80742a(c, (C35755b) this.f91775d.get(i2));
        }
        throw new AssertionError();
    }

    /* renamed from: o */
    private View m80768o(int i) {
        if (f91762i || this.f91776e.f91839a != null) {
            View c = m80754c(mo5062s() - 1, -1, i);
            if (c == null) {
                return null;
            }
            return m80749b(c, (C35755b) this.f91775d.get(this.f91776e.f91839a[m4418c(c)]));
        }
        throw new AssertionError();
    }

    /* renamed from: i */
    private int m80762i(C1349s sVar) {
        if (mo5062s() == 0) {
            return 0;
        }
        int a = sVar.mo5115a();
        View n = m80767n(a);
        View o = m80768o(a);
        if (sVar.mo5115a() == 0 || n == null || o == null) {
            return 0;
        }
        if (f91762i || this.f91776e.f91839a != null) {
            int c = m4418c(n);
            int c2 = m4418c(o);
            int abs = Math.abs(this.f91777f.mo5519b(o) - this.f91777f.mo5516a(n));
            int i = this.f91776e.f91839a[c];
            if (i == 0 || i == -1) {
                return 0;
            }
            return Math.round((((float) i) * (((float) abs) / ((float) ((this.f91776e.f91839a[c2] - i) + 1)))) + ((float) (this.f91777f.mo5518b() - this.f91777f.mo5516a(n))));
        }
        throw new AssertionError();
    }

    /* renamed from: j */
    private int m80763j(C1349s sVar) {
        if (mo5062s() == 0) {
            return 0;
        }
        int a = sVar.mo5115a();
        View n = m80767n(a);
        View o = m80768o(a);
        if (sVar.mo5115a() == 0 || n == null || o == null) {
            return 0;
        }
        if (f91762i || this.f91776e.f91839a != null) {
            int K = m80737K();
            return (int) ((((float) Math.abs(this.f91777f.mo5519b(o) - this.f91777f.mo5516a(n))) / ((float) ((mo74378m() - K) + 1))) * ((float) sVar.mo5115a()));
        }
        throw new AssertionError();
    }

    /* renamed from: m */
    private void m80766m(int i) {
        if (i < mo74378m()) {
            int s = mo5062s();
            this.f91776e.mo74412c(s);
            this.f91776e.mo74410b(s);
            this.f91776e.mo74414d(s);
            if (!f91762i && this.f91776e.f91839a == null) {
                throw new AssertionError();
            } else if (i < this.f91776e.f91839a.length) {
                this.f91770Q = i;
                View F = m80732F();
                if (F != null) {
                    this.f91789t = m4418c(F);
                    if (mo74374i() || !this.f91774c) {
                        this.f91764K = this.f91777f.mo5516a(F) - this.f91777f.mo5518b();
                    } else {
                        this.f91764K = this.f91777f.mo5519b(F) + this.f91777f.mo5526f();
                    }
                }
            }
        }
    }

    /* renamed from: p */
    private int m80769p(int i) {
        int i2;
        int i3;
        boolean z = false;
        if (mo5062s() == 0 || i == 0) {
            return 0;
        }
        m80734H();
        boolean i4 = mo74374i();
        if (i4) {
            i2 = this.f91769P.getWidth();
        } else {
            i2 = this.f91769P.getHeight();
        }
        if (i4) {
            i3 = this.f4745I;
        } else {
            i3 = this.f4746J;
        }
        if (mo5060q() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                i = -Math.min((i3 + this.f91787r.f91805d) - i2, abs);
            } else if (this.f91787r.f91805d + i > 0) {
                i = -this.f91787r.f91805d;
            }
        } else if (i > 0) {
            i = Math.min((i3 - this.f91787r.f91805d) - i2, i);
        } else if (this.f91787r.f91805d + i < 0) {
            i = -this.f91787r.f91805d;
        }
        return i;
    }

    /* renamed from: d */
    public final PointF mo4738d(int i) {
        int i2;
        if (mo5062s() == 0) {
            return null;
        }
        if (i < m4418c(mo5050g(0))) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (mo74374i()) {
            return new PointF(0.0f, (float) i2);
        }
        return new PointF((float) i2, 0.0f);
    }

    /* renamed from: b */
    public final int mo4730b(C1349s sVar) {
        return m80762i(sVar);
    }

    /* renamed from: a */
    public final void mo5019a(C1322a aVar, C1322a aVar2) {
        mo5061r();
    }

    /* renamed from: c */
    private boolean m80756c(View view, int i) {
        if (mo74374i() || !this.f91774c) {
            if (this.f91777f.mo5519b(view) <= i) {
                return true;
            }
            return false;
        } else if (this.f91777f.mo5522d() - this.f91777f.mo5516a(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private View m80742a(View view, C35755b bVar) {
        boolean i = mo74374i();
        int i2 = bVar.f91827h;
        for (int i3 = 1; i3 < i2; i3++) {
            View g = mo5050g(i3);
            if (!(g == null || g.getVisibility() == 8)) {
                if (!this.f91774c || i) {
                    if (this.f91777f.mo5516a(view) <= this.f91777f.mo5516a(g)) {
                    }
                } else if (this.f91777f.mo5519b(view) >= this.f91777f.mo5519b(g)) {
                }
                view = g;
            }
        }
        return view;
    }

    /* renamed from: d */
    private boolean m80759d(View view, int i) {
        if (mo74374i() || !this.f91774c) {
            if (this.f91777f.mo5516a(view) >= this.f91777f.mo5522d() - i) {
                return true;
            }
            return false;
        } else if (this.f91777f.mo5519b(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private void m80745a(C1343o oVar, C35753b bVar) {
        if (bVar.f91819j) {
            if (bVar.f91818i == -1) {
                m80755c(oVar, bVar);
            } else {
                m80751b(oVar, bVar);
            }
        }
    }

    /* renamed from: b */
    private View m80749b(View view, C35755b bVar) {
        boolean i = mo74374i();
        int s = (mo5062s() - bVar.f91827h) - 1;
        for (int s2 = mo5062s() - 2; s2 > s; s2--) {
            View g = mo5050g(s2);
            if (!(g == null || g.getVisibility() == 8)) {
                if (!this.f91774c || i) {
                    if (this.f91777f.mo5519b(view) >= this.f91777f.mo5519b(g)) {
                    }
                } else if (this.f91777f.mo5516a(view) <= this.f91777f.mo5516a(g)) {
                }
                view = g;
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m80743a(int i, int i2) {
        boolean z;
        int i3;
        if (f91762i || this.f91776e.f91839a != null) {
            this.f91786q.f91818i = i;
            boolean i4 = mo74374i();
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f4745I, this.f4743G);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(this.f4746J, this.f4744H);
            int i5 = 0;
            if (i4 || !this.f91774c) {
                z = false;
            } else {
                z = true;
            }
            if (i == 1) {
                View g = mo5050g(mo5062s() - 1);
                this.f91786q.f91814e = this.f91777f.mo5519b(g);
                int c = m4418c(g);
                View b = m80749b(g, (C35755b) this.f91775d.get(this.f91776e.f91839a[c]));
                this.f91786q.f91817h = 1;
                C35753b bVar = this.f91786q;
                bVar.f91813d = c + bVar.f91817h;
                if (this.f91776e.f91839a.length <= this.f91786q.f91813d) {
                    this.f91786q.f91812c = -1;
                } else {
                    this.f91786q.f91812c = this.f91776e.f91839a[this.f91786q.f91813d];
                }
                if (z) {
                    this.f91786q.f91814e = this.f91777f.mo5516a(b);
                    this.f91786q.f91815f = (-this.f91777f.mo5516a(b)) + this.f91777f.mo5518b();
                    C35753b bVar2 = this.f91786q;
                    if (this.f91786q.f91815f >= 0) {
                        i5 = this.f91786q.f91815f;
                    }
                    bVar2.f91815f = i5;
                } else {
                    this.f91786q.f91814e = this.f91777f.mo5519b(b);
                    this.f91786q.f91815f = this.f91777f.mo5519b(b) - this.f91777f.mo5520c();
                }
                if ((this.f91786q.f91812c == -1 || this.f91786q.f91812c > this.f91775d.size() - 1) && this.f91786q.f91813d <= mo74368b()) {
                    int i6 = i2 - this.f91786q.f91815f;
                    this.f91771R.mo74416a();
                    if (i6 > 0) {
                        if (i4) {
                            this.f91776e.mo74408a(this.f91771R, makeMeasureSpec, makeMeasureSpec2, i6, this.f91786q.f91813d, this.f91775d);
                        } else {
                            this.f91776e.mo74413c(this.f91771R, makeMeasureSpec, makeMeasureSpec2, i6, this.f91786q.f91813d, this.f91775d);
                        }
                        this.f91776e.mo74404a(makeMeasureSpec, makeMeasureSpec2, this.f91786q.f91813d);
                        this.f91776e.mo74402a(this.f91786q.f91813d);
                    }
                }
            } else {
                View g2 = mo5050g(0);
                this.f91786q.f91814e = this.f91777f.mo5516a(g2);
                int c2 = m4418c(g2);
                View a = m80742a(g2, (C35755b) this.f91775d.get(this.f91776e.f91839a[c2]));
                this.f91786q.f91817h = 1;
                int i7 = this.f91776e.f91839a[c2];
                if (i7 == -1) {
                    i7 = 0;
                }
                if (i7 > 0) {
                    C35755b bVar3 = (C35755b) this.f91775d.get(i7 - 1);
                    this.f91786q.f91813d = c2 - bVar3.f91827h;
                } else {
                    this.f91786q.f91813d = -1;
                }
                C35753b bVar4 = this.f91786q;
                if (i7 > 0) {
                    i3 = i7 - 1;
                } else {
                    i3 = 0;
                }
                bVar4.f91812c = i3;
                if (z) {
                    this.f91786q.f91814e = this.f91777f.mo5519b(a);
                    this.f91786q.f91815f = this.f91777f.mo5519b(a) - this.f91777f.mo5520c();
                    C35753b bVar5 = this.f91786q;
                    if (this.f91786q.f91815f >= 0) {
                        i5 = this.f91786q.f91815f;
                    }
                    bVar5.f91815f = i5;
                } else {
                    this.f91786q.f91814e = this.f91777f.mo5516a(a);
                    this.f91786q.f91815f = (-this.f91777f.mo5516a(a)) + this.f91777f.mo5518b();
                }
            }
            C35753b bVar6 = this.f91786q;
            bVar6.f91810a = i2 - bVar6.f91815f;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    private void m80751b(C1343o oVar, C35753b bVar) {
        if (bVar.f91815f >= 0) {
            if (f91762i || this.f91776e.f91839a != null) {
                int s = mo5062s();
                if (s != 0) {
                    int i = this.f91776e.f91839a[m4418c(mo5050g(0))];
                    if (i != -1) {
                        C35755b bVar2 = (C35755b) this.f91775d.get(i);
                        int i2 = i;
                        int i3 = 0;
                        int i4 = -1;
                        while (true) {
                            if (i3 >= s) {
                                break;
                            }
                            View g = mo5050g(i3);
                            if (!m80756c(g, bVar.f91815f)) {
                                break;
                            }
                            if (bVar2.f91835p == m4418c(g)) {
                                if (i2 >= this.f91775d.size() - 1) {
                                    break;
                                }
                                i2 += bVar.f91818i;
                                bVar2 = (C35755b) this.f91775d.get(i2);
                                i4 = i3;
                            }
                            i3++;
                        }
                        i3 = i4;
                        m80744a(oVar, 0, i3);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: c */
    private void m80755c(C1343o oVar, C35753b bVar) {
        if (bVar.f91815f >= 0) {
            if (f91762i || this.f91776e.f91839a != null) {
                int s = mo5062s();
                if (s != 0) {
                    int i = s - 1;
                    int i2 = this.f91776e.f91839a[m4418c(mo5050g(i))];
                    if (i2 != -1) {
                        C35755b bVar2 = (C35755b) this.f91775d.get(i2);
                        int i3 = s;
                        int i4 = i;
                        while (true) {
                            if (i4 < 0) {
                                break;
                            }
                            View g = mo5050g(i4);
                            if (!m80759d(g, bVar.f91815f)) {
                                break;
                            }
                            if (bVar2.f91834o == m4418c(g)) {
                                if (i2 <= 0) {
                                    break;
                                }
                                i2 += bVar.f91818i;
                                bVar2 = (C35755b) this.f91775d.get(i2);
                                i3 = i4;
                            }
                            i4--;
                        }
                        i4 = i3;
                        m80744a(oVar, i4, i);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private int m80740a(C35755b bVar, C35753b bVar2) {
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        View view;
        float f4;
        float f5;
        C35755b bVar3 = bVar;
        C35753b bVar4 = bVar2;
        if (f91762i || this.f91776e.f91840b != null) {
            int u = mo5064u();
            int w = mo5066w();
            int i3 = this.f4746J;
            int i4 = bVar4.f91814e;
            int i5 = bVar4.f91814e;
            if (bVar4.f91818i == -1) {
                i4 -= bVar3.f91826g;
                i5 += bVar3.f91826g;
            }
            int i6 = i4;
            int i7 = i5;
            int i8 = bVar4.f91813d;
            switch (this.f91780k) {
                case 0:
                    f3 = (float) u;
                    f2 = (float) (i3 - w);
                    break;
                case 1:
                    f = 0.0f;
                    float f6 = (float) ((i3 - bVar3.f91824e) + w);
                    f2 = (float) (bVar3.f91824e - u);
                    f3 = f6;
                    break;
                case 2:
                    f3 = ((float) u) + (((float) (i3 - bVar3.f91824e)) / 2.0f);
                    f2 = ((float) (i3 - w)) - (((float) (i3 - bVar3.f91824e)) / 2.0f);
                    break;
                case 3:
                    f3 = (float) u;
                    if (bVar3.f91827h != 1) {
                        f4 = (float) (bVar3.f91827h - 1);
                    } else {
                        f4 = 1.0f;
                    }
                    f = ((float) (i3 - bVar3.f91824e)) / f4;
                    f2 = (float) (i3 - w);
                    break;
                case 4:
                    if (bVar3.f91827h != 0) {
                        f5 = ((float) (i3 - bVar3.f91824e)) / ((float) bVar3.f91827h);
                    } else {
                        f5 = 0.0f;
                    }
                    float f7 = f / 2.0f;
                    f3 = ((float) u) + f7;
                    f2 = ((float) (i3 - w)) - f7;
                    break;
                case 5:
                    if (bVar3.f91827h != 0) {
                        f = ((float) (i3 - bVar3.f91824e)) / ((float) (bVar3.f91827h + 1));
                    } else {
                        f = 0.0f;
                    }
                    f3 = ((float) u) + f;
                    f2 = ((float) (i3 - w)) - f;
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Invalid justifyContent is set: ");
                    sb.append(this.f91780k);
                    throw new IllegalStateException(sb.toString());
            }
            f = 0.0f;
            float f8 = f3 - ((float) this.f91787r.f91805d);
            float f9 = f2 - ((float) this.f91787r.f91805d);
            float max = Math.max(f, 0.0f);
            int i9 = 0;
            int i10 = bVar3.f91827h;
            int i11 = i8;
            while (i11 < i8 + i10) {
                View l = m80765l(i11);
                if (l != null) {
                    long j = this.f91776e.f91840b[i11];
                    int a = C35756c.m80856a(j);
                    int b = C35756c.m80868b(j);
                    LayoutParams layoutParams = (LayoutParams) l.getLayoutParams();
                    if (m80757c(l, a, b, layoutParams)) {
                        l.measure(a, b);
                    }
                    float k = f8 + ((float) (layoutParams.topMargin + m4423k(l)));
                    float l2 = f9 - ((float) (layoutParams.rightMargin + m4424l(l)));
                    if (bVar4.f91818i == 1) {
                        mo5039b(l, f91763j);
                        mo5037b(l);
                    } else {
                        mo5039b(l, f91763j);
                        mo5038b(l, i9);
                        i9++;
                    }
                    int i12 = i9;
                    int m = i6 + m4425m(l);
                    int n = i7 - m4426n(l);
                    if (!this.f91774c) {
                        view = l;
                        i2 = i11;
                        i = i10;
                        if (this.f91783n) {
                            this.f91776e.mo74406a(view, bVar, this.f91774c, m, Math.round(l2) - view.getMeasuredHeight(), m + view.getMeasuredWidth(), Math.round(l2));
                        } else {
                            this.f91776e.mo74406a(view, bVar, this.f91774c, m, Math.round(k), m + view.getMeasuredWidth(), Math.round(k) + view.getMeasuredHeight());
                        }
                    } else if (this.f91783n) {
                        int measuredWidth = n - l.getMeasuredWidth();
                        view = l;
                        int round = Math.round(l2) - l.getMeasuredHeight();
                        i2 = i11;
                        i = i10;
                        this.f91776e.mo74406a(l, bVar, this.f91774c, measuredWidth, round, n, Math.round(l2));
                    } else {
                        view = l;
                        i2 = i11;
                        i = i10;
                        this.f91776e.mo74406a(view, bVar, this.f91774c, n - view.getMeasuredWidth(), Math.round(k), n, Math.round(k) + view.getMeasuredHeight());
                    }
                    f8 = k + ((float) (view.getMeasuredHeight() + layoutParams.topMargin + m4424l(view))) + max;
                    f9 = l2 - (((float) ((view.getMeasuredHeight() + layoutParams.bottomMargin) + m4423k(view))) + max);
                    i9 = i12;
                } else {
                    i2 = i11;
                    i = i10;
                }
                i11 = i2 + 1;
                i10 = i;
            }
            bVar4.f91812c += this.f91786q.f91818i;
            return bVar3.f91826g;
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02b6  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4689c(android.support.p043v7.widget.RecyclerView.C1343o r19, android.support.p043v7.widget.RecyclerView.C1349s r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r0.f91784o = r1
            r0.f91785p = r2
            int r3 = r20.mo5115a()
            if (r3 != 0) goto L_0x0015
            boolean r4 = r2.f4798g
            if (r4 == 0) goto L_0x0015
            return
        L_0x0015:
            int r4 = r18.mo5060q()
            int r5 = r0.f91772a
            r6 = 2
            r7 = 1
            r8 = 0
            switch(r5) {
                case 0: goto L_0x005d;
                case 1: goto L_0x004c;
                case 2: goto L_0x0039;
                case 3: goto L_0x0026;
                default: goto L_0x0021;
            }
        L_0x0021:
            r0.f91774c = r8
            r0.f91783n = r8
            goto L_0x006d
        L_0x0026:
            if (r4 != r7) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            r0.f91774c = r4
            int r4 = r0.f91773b
            if (r4 != r6) goto L_0x0036
            boolean r4 = r0.f91774c
            r4 = r4 ^ r7
            r0.f91774c = r4
        L_0x0036:
            r0.f91783n = r7
            goto L_0x006d
        L_0x0039:
            if (r4 != r7) goto L_0x003d
            r4 = 1
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            r0.f91774c = r4
            int r4 = r0.f91773b
            if (r4 != r6) goto L_0x0049
            boolean r4 = r0.f91774c
            r4 = r4 ^ r7
            r0.f91774c = r4
        L_0x0049:
            r0.f91783n = r8
            goto L_0x006d
        L_0x004c:
            if (r4 == r7) goto L_0x0050
            r4 = 1
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            r0.f91774c = r4
            int r4 = r0.f91773b
            if (r4 != r6) goto L_0x0059
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            r0.f91783n = r4
            goto L_0x006d
        L_0x005d:
            if (r4 != r7) goto L_0x0061
            r4 = 1
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            r0.f91774c = r4
            int r4 = r0.f91773b
            if (r4 != r6) goto L_0x006a
            r4 = 1
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            r0.f91783n = r4
        L_0x006d:
            r18.m80734H()
            r18.m80735I()
            com.ss.android.ugc.aweme.journey.flexbox.c r4 = r0.f91776e
            r4.mo74412c(r3)
            com.ss.android.ugc.aweme.journey.flexbox.c r4 = r0.f91776e
            r4.mo74410b(r3)
            com.ss.android.ugc.aweme.journey.flexbox.c r4 = r0.f91776e
            r4.mo74414d(r3)
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r4 = r0.f91786q
            r4.f91819j = r8
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$SavedState r4 = r0.f91788s
            if (r4 == 0) goto L_0x0098
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$SavedState r4 = r0.f91788s
            boolean r4 = r4.mo74384a(r3)
            if (r4 == 0) goto L_0x0098
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$SavedState r4 = r0.f91788s
            int r4 = r4.f91799a
            r0.f91789t = r4
        L_0x0098:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r4 = r0.f91787r
            boolean r4 = r4.f91807f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = -1
            if (r4 == 0) goto L_0x00a9
            int r4 = r0.f91789t
            if (r4 != r6) goto L_0x00a9
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$SavedState r4 = r0.f91788s
            if (r4 == 0) goto L_0x02c1
        L_0x00a9:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r4 = r0.f91787r
            r4.mo74390a()
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r4 = r0.f91787r
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$SavedState r9 = r0.f91788s
            boolean r10 = f91762i
            if (r10 != 0) goto L_0x00c3
            com.ss.android.ugc.aweme.journey.flexbox.c r10 = r0.f91776e
            int[] r10 = r10.f91839a
            if (r10 == 0) goto L_0x00bd
            goto L_0x00c3
        L_0x00bd:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x00c3:
            boolean r10 = r2.f4798g
            if (r10 != 0) goto L_0x01bb
            int r10 = r0.f91789t
            if (r10 != r6) goto L_0x00cd
            goto L_0x01bb
        L_0x00cd:
            int r10 = r0.f91789t
            if (r10 < 0) goto L_0x01b7
            int r10 = r0.f91789t
            int r11 = r20.mo5115a()
            if (r10 < r11) goto L_0x00db
            goto L_0x01b7
        L_0x00db:
            int r10 = r0.f91789t
            r4.f91802a = r10
            com.ss.android.ugc.aweme.journey.flexbox.c r10 = r0.f91776e
            int[] r10 = r10.f91839a
            int r11 = r4.f91802a
            r10 = r10[r11]
            r4.f91803b = r10
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$SavedState r10 = r0.f91788s
            if (r10 == 0) goto L_0x010a
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$SavedState r10 = r0.f91788s
            int r11 = r20.mo5115a()
            boolean r10 = r10.mo74384a(r11)
            if (r10 == 0) goto L_0x010a
            android.support.v7.widget.ak r10 = r0.f91777f
            int r10 = r10.mo5518b()
            int r9 = r9.f91800b
            int r10 = r10 + r9
            r4.f91804c = r10
            r4.f91808g = r7
            r4.f91803b = r6
            goto L_0x01b5
        L_0x010a:
            int r9 = r0.f91764K
            if (r9 != r5) goto L_0x0194
            int r9 = r0.f91789t
            android.view.View r9 = r0.mo4736c(r9)
            if (r9 == 0) goto L_0x0179
            android.support.v7.widget.ak r10 = r0.f91777f
            int r10 = r10.mo5525e(r9)
            android.support.v7.widget.ak r11 = r0.f91777f
            int r11 = r11.mo5524e()
            if (r10 <= r11) goto L_0x0129
            r4.mo74391b()
            goto L_0x01b5
        L_0x0129:
            android.support.v7.widget.ak r10 = r0.f91777f
            int r10 = r10.mo5516a(r9)
            android.support.v7.widget.ak r11 = r0.f91777f
            int r11 = r11.mo5518b()
            int r10 = r10 - r11
            if (r10 >= 0) goto L_0x0144
            android.support.v7.widget.ak r9 = r0.f91777f
            int r9 = r9.mo5518b()
            r4.f91804c = r9
            r4.f91806e = r8
            goto L_0x01b5
        L_0x0144:
            android.support.v7.widget.ak r10 = r0.f91777f
            int r10 = r10.mo5520c()
            android.support.v7.widget.ak r11 = r0.f91777f
            int r11 = r11.mo5519b(r9)
            int r10 = r10 - r11
            if (r10 >= 0) goto L_0x015e
            android.support.v7.widget.ak r9 = r0.f91777f
            int r9 = r9.mo5520c()
            r4.f91804c = r9
            r4.f91806e = r7
            goto L_0x01b5
        L_0x015e:
            boolean r10 = r4.f91806e
            if (r10 == 0) goto L_0x0170
            android.support.v7.widget.ak r10 = r0.f91777f
            int r9 = r10.mo5519b(r9)
            android.support.v7.widget.ak r10 = r0.f91777f
            int r10 = r10.mo5515a()
            int r9 = r9 + r10
            goto L_0x0176
        L_0x0170:
            android.support.v7.widget.ak r10 = r0.f91777f
            int r9 = r10.mo5516a(r9)
        L_0x0176:
            r4.f91804c = r9
            goto L_0x01b5
        L_0x0179:
            int r9 = r18.mo5062s()
            if (r9 <= 0) goto L_0x0190
            android.view.View r9 = r0.mo5050g(r8)
            int r9 = m4418c(r9)
            int r10 = r0.f91789t
            if (r10 >= r9) goto L_0x018d
            r9 = 1
            goto L_0x018e
        L_0x018d:
            r9 = 0
        L_0x018e:
            r4.f91806e = r9
        L_0x0190:
            r4.mo74391b()
            goto L_0x01b5
        L_0x0194:
            boolean r9 = r18.mo74374i()
            if (r9 != 0) goto L_0x01aa
            boolean r9 = r0.f91774c
            if (r9 == 0) goto L_0x01aa
            int r9 = r0.f91764K
            android.support.v7.widget.ak r10 = r0.f91777f
            int r10 = r10.mo5526f()
            int r9 = r9 - r10
            r4.f91804c = r9
            goto L_0x01b5
        L_0x01aa:
            android.support.v7.widget.ak r9 = r0.f91777f
            int r9 = r9.mo5518b()
            int r10 = r0.f91764K
            int r9 = r9 + r10
            r4.f91804c = r9
        L_0x01b5:
            r9 = 1
            goto L_0x01bc
        L_0x01b7:
            r0.f91789t = r6
            r0.f91764K = r5
        L_0x01bb:
            r9 = 0
        L_0x01bc:
            if (r9 != 0) goto L_0x02bd
            int r9 = r18.mo5062s()
            if (r9 == 0) goto L_0x02b3
            boolean r9 = r4.f91806e
            if (r9 == 0) goto L_0x01d1
            int r9 = r20.mo5115a()
            android.view.View r9 = r0.m80768o(r9)
            goto L_0x01d9
        L_0x01d1:
            int r9 = r20.mo5115a()
            android.view.View r9 = r0.m80767n(r9)
        L_0x01d9:
            if (r9 == 0) goto L_0x02b3
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager r10 = com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.this
            int r10 = r10.f91773b
            if (r10 != 0) goto L_0x01e6
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager r10 = com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.this
            android.support.v7.widget.ak r10 = r10.f91778g
            goto L_0x01ea
        L_0x01e6:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager r10 = com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.this
            android.support.v7.widget.ak r10 = r10.f91777f
        L_0x01ea:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager r11 = com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.this
            boolean r11 = r11.mo74374i()
            if (r11 != 0) goto L_0x020f
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager r11 = com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.this
            boolean r11 = r11.f91774c
            if (r11 == 0) goto L_0x020f
            boolean r11 = r4.f91806e
            if (r11 == 0) goto L_0x0208
            int r11 = r10.mo5516a(r9)
            int r10 = r10.mo5515a()
            int r11 = r11 + r10
            r4.f91804c = r11
            goto L_0x0225
        L_0x0208:
            int r10 = r10.mo5519b(r9)
            r4.f91804c = r10
            goto L_0x0225
        L_0x020f:
            boolean r11 = r4.f91806e
            if (r11 == 0) goto L_0x021f
            int r11 = r10.mo5519b(r9)
            int r10 = r10.mo5515a()
            int r11 = r11 + r10
            r4.f91804c = r11
            goto L_0x0225
        L_0x021f:
            int r10 = r10.mo5516a(r9)
            r4.f91804c = r10
        L_0x0225:
            int r10 = m4418c(r9)
            r4.f91802a = r10
            r4.f91808g = r8
            boolean r10 = com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.C35752a.f91801h
            if (r10 != 0) goto L_0x0240
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager r10 = com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.this
            com.ss.android.ugc.aweme.journey.flexbox.c r10 = r10.f91776e
            int[] r10 = r10.f91839a
            if (r10 == 0) goto L_0x023a
            goto L_0x0240
        L_0x023a:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x0240:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager r10 = com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.this
            com.ss.android.ugc.aweme.journey.flexbox.c r10 = r10.f91776e
            int[] r10 = r10.f91839a
            int r11 = r4.f91802a
            if (r11 == r6) goto L_0x024d
            int r11 = r4.f91802a
            goto L_0x024e
        L_0x024d:
            r11 = 0
        L_0x024e:
            r10 = r10[r11]
            if (r10 == r6) goto L_0x0253
            goto L_0x0254
        L_0x0253:
            r10 = 0
        L_0x0254:
            r4.f91803b = r10
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager r10 = com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.this
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r10 = r10.f91775d
            int r10 = r10.size()
            int r11 = r4.f91803b
            if (r10 <= r11) goto L_0x0272
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager r10 = com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.this
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r10 = r10.f91775d
            int r11 = r4.f91803b
            java.lang.Object r10 = r10.get(r11)
            com.ss.android.ugc.aweme.journey.flexbox.b r10 = (com.p683ss.android.ugc.aweme.journey.flexbox.C35755b) r10
            int r10 = r10.f91834o
            r4.f91802a = r10
        L_0x0272:
            boolean r10 = r2.f4798g
            if (r10 != 0) goto L_0x02b1
            boolean r10 = r18.bs_()
            if (r10 == 0) goto L_0x02b1
            android.support.v7.widget.ak r10 = r0.f91777f
            int r10 = r10.mo5516a(r9)
            android.support.v7.widget.ak r11 = r0.f91777f
            int r11 = r11.mo5520c()
            if (r10 >= r11) goto L_0x029b
            android.support.v7.widget.ak r10 = r0.f91777f
            int r9 = r10.mo5519b(r9)
            android.support.v7.widget.ak r10 = r0.f91777f
            int r10 = r10.mo5518b()
            if (r9 >= r10) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            r9 = 0
            goto L_0x029c
        L_0x029b:
            r9 = 1
        L_0x029c:
            if (r9 == 0) goto L_0x02b1
            boolean r9 = r4.f91806e
            if (r9 == 0) goto L_0x02a9
            android.support.v7.widget.ak r9 = r0.f91777f
            int r9 = r9.mo5520c()
            goto L_0x02af
        L_0x02a9:
            android.support.v7.widget.ak r9 = r0.f91777f
            int r9 = r9.mo5518b()
        L_0x02af:
            r4.f91804c = r9
        L_0x02b1:
            r9 = 1
            goto L_0x02b4
        L_0x02b3:
            r9 = 0
        L_0x02b4:
            if (r9 != 0) goto L_0x02bd
            r4.mo74391b()
            r4.f91802a = r8
            r4.f91803b = r8
        L_0x02bd:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r4 = r0.f91787r
            r4.f91807f = r7
        L_0x02c1:
            r18.mo5020a(r19)
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r4 = r0.f91787r
            boolean r4 = r4.f91806e
            if (r4 == 0) goto L_0x02d0
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r4 = r0.f91787r
            r0.m80752b(r4, r8, r7)
            goto L_0x02d5
        L_0x02d0:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r4 = r0.f91787r
            r0.m80746a(r4, r8, r7)
        L_0x02d5:
            int r4 = r0.f4745I
            int r9 = r0.f4743G
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r9 = r0.f4746J
            int r10 = r0.f4744H
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = r0.f4745I
            int r11 = r0.f4746J
            boolean r12 = r18.mo74374i()
            if (r12 == 0) goto L_0x0313
            int r12 = r0.f91765L
            if (r12 == r5) goto L_0x02f9
            int r5 = r0.f91765L
            if (r5 == r10) goto L_0x02f9
            r5 = 1
            goto L_0x02fa
        L_0x02f9:
            r5 = 0
        L_0x02fa:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r12 = r0.f91786q
            boolean r12 = r12.f91811b
            if (r12 == 0) goto L_0x030d
            android.content.Context r12 = r0.f91768O
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.heightPixels
            goto L_0x0311
        L_0x030d:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r12 = r0.f91786q
            int r12 = r12.f91810a
        L_0x0311:
            r14 = r12
            goto L_0x0336
        L_0x0313:
            int r12 = r0.f91766M
            if (r12 == r5) goto L_0x031d
            int r5 = r0.f91766M
            if (r5 == r11) goto L_0x031d
            r5 = 1
            goto L_0x031e
        L_0x031d:
            r5 = 0
        L_0x031e:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r12 = r0.f91786q
            boolean r12 = r12.f91811b
            if (r12 == 0) goto L_0x0331
            android.content.Context r12 = r0.f91768O
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.widthPixels
            goto L_0x0311
        L_0x0331:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r12 = r0.f91786q
            int r12 = r12.f91810a
            goto L_0x0311
        L_0x0336:
            r0.f91765L = r10
            r0.f91766M = r11
            int r10 = r0.f91770Q
            if (r10 != r6) goto L_0x03b6
            int r10 = r0.f91789t
            if (r10 != r6) goto L_0x0344
            if (r5 == 0) goto L_0x03b6
        L_0x0344:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r3 = r0.f91787r
            boolean r3 = r3.f91806e
            if (r3 != 0) goto L_0x0453
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r3 = r0.f91775d
            r3.clear()
            boolean r3 = f91762i
            if (r3 != 0) goto L_0x0360
            com.ss.android.ugc.aweme.journey.flexbox.c r3 = r0.f91776e
            int[] r3 = r3.f91839a
            if (r3 == 0) goto L_0x035a
            goto L_0x0360
        L_0x035a:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x0360:
            com.ss.android.ugc.aweme.journey.flexbox.c$a r3 = r0.f91771R
            r3.mo74416a()
            boolean r3 = r18.mo74374i()
            if (r3 == 0) goto L_0x037d
            com.ss.android.ugc.aweme.journey.flexbox.c r10 = r0.f91776e
            com.ss.android.ugc.aweme.journey.flexbox.c$a r11 = r0.f91771R
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r3 = r0.f91787r
            int r15 = r3.f91802a
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r3 = r0.f91775d
            r12 = r4
            r13 = r9
            r16 = r3
            r10.mo74411b(r11, r12, r13, r14, r15, r16)
            goto L_0x038e
        L_0x037d:
            com.ss.android.ugc.aweme.journey.flexbox.c r10 = r0.f91776e
            com.ss.android.ugc.aweme.journey.flexbox.c$a r11 = r0.f91771R
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r3 = r0.f91787r
            int r15 = r3.f91802a
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r3 = r0.f91775d
            r12 = r4
            r13 = r9
            r16 = r3
            r10.mo74415d(r11, r12, r13, r14, r15, r16)
        L_0x038e:
            com.ss.android.ugc.aweme.journey.flexbox.c$a r3 = r0.f91771R
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r3 = r3.f91844a
            r0.f91775d = r3
            com.ss.android.ugc.aweme.journey.flexbox.c r3 = r0.f91776e
            r3.mo74403a(r4, r9)
            com.ss.android.ugc.aweme.journey.flexbox.c r3 = r0.f91776e
            r3.mo74401a()
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r3 = r0.f91787r
            com.ss.android.ugc.aweme.journey.flexbox.c r4 = r0.f91776e
            int[] r4 = r4.f91839a
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r5 = r0.f91787r
            int r5 = r5.f91802a
            r4 = r4[r5]
            r3.f91803b = r4
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r3 = r0.f91786q
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r4 = r0.f91787r
            int r4 = r4.f91803b
            r3.f91812c = r4
            goto L_0x0453
        L_0x03b6:
            int r5 = r0.f91770Q
            if (r5 == r6) goto L_0x03c5
            int r5 = r0.f91770Q
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r6 = r0.f91787r
            int r6 = r6.f91802a
            int r5 = java.lang.Math.min(r5, r6)
            goto L_0x03c9
        L_0x03c5:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r5 = r0.f91787r
            int r5 = r5.f91802a
        L_0x03c9:
            com.ss.android.ugc.aweme.journey.flexbox.c$a r6 = r0.f91771R
            r6.mo74416a()
            boolean r6 = r18.mo74374i()
            if (r6 == 0) goto L_0x040c
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r6 = r0.f91775d
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x03f8
            com.ss.android.ugc.aweme.journey.flexbox.c r3 = r0.f91776e
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r6 = r0.f91775d
            r3.mo74409a(r6, r5)
            com.ss.android.ugc.aweme.journey.flexbox.c r10 = r0.f91776e
            com.ss.android.ugc.aweme.journey.flexbox.c$a r11 = r0.f91771R
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r3 = r0.f91787r
            int r3 = r3.f91802a
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r6 = r0.f91775d
            r12 = r4
            r13 = r9
            r15 = r5
            r16 = r3
            r17 = r6
            r10.mo74407a(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0443
        L_0x03f8:
            com.ss.android.ugc.aweme.journey.flexbox.c r6 = r0.f91776e
            r6.mo74414d(r3)
            com.ss.android.ugc.aweme.journey.flexbox.c r10 = r0.f91776e
            com.ss.android.ugc.aweme.journey.flexbox.c$a r11 = r0.f91771R
            r15 = 0
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r3 = r0.f91775d
            r12 = r4
            r13 = r9
            r16 = r3
            r10.mo74408a(r11, r12, r13, r14, r15, r16)
            goto L_0x0443
        L_0x040c:
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r6 = r0.f91775d
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0430
            com.ss.android.ugc.aweme.journey.flexbox.c r3 = r0.f91776e
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r6 = r0.f91775d
            r3.mo74409a(r6, r5)
            com.ss.android.ugc.aweme.journey.flexbox.c r10 = r0.f91776e
            com.ss.android.ugc.aweme.journey.flexbox.c$a r11 = r0.f91771R
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r3 = r0.f91787r
            int r3 = r3.f91802a
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r6 = r0.f91775d
            r12 = r9
            r13 = r4
            r15 = r5
            r16 = r3
            r17 = r6
            r10.mo74407a(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0443
        L_0x0430:
            com.ss.android.ugc.aweme.journey.flexbox.c r6 = r0.f91776e
            r6.mo74414d(r3)
            com.ss.android.ugc.aweme.journey.flexbox.c r10 = r0.f91776e
            com.ss.android.ugc.aweme.journey.flexbox.c$a r11 = r0.f91771R
            r15 = 0
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r3 = r0.f91775d
            r12 = r4
            r13 = r9
            r16 = r3
            r10.mo74413c(r11, r12, r13, r14, r15, r16)
        L_0x0443:
            com.ss.android.ugc.aweme.journey.flexbox.c$a r3 = r0.f91771R
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r3 = r3.f91844a
            r0.f91775d = r3
            com.ss.android.ugc.aweme.journey.flexbox.c r3 = r0.f91776e
            r3.mo74404a(r4, r9, r5)
            com.ss.android.ugc.aweme.journey.flexbox.c r3 = r0.f91776e
            r3.mo74402a(r5)
        L_0x0453:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r3 = r0.f91787r
            boolean r3 = r3.f91806e
            if (r3 == 0) goto L_0x0471
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r3 = r0.f91786q
            r0.m80739a(r1, r2, r3)
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r3 = r0.f91786q
            int r3 = r3.f91814e
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r4 = r0.f91787r
            r0.m80746a(r4, r7, r8)
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r4 = r0.f91786q
            r0.m80739a(r1, r2, r4)
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r4 = r0.f91786q
            int r4 = r4.f91814e
            goto L_0x0488
        L_0x0471:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r3 = r0.f91786q
            r0.m80739a(r1, r2, r3)
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r3 = r0.f91786q
            int r4 = r3.f91814e
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r3 = r0.f91787r
            r0.m80752b(r3, r7, r8)
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r3 = r0.f91786q
            r0.m80739a(r1, r2, r3)
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r3 = r0.f91786q
            int r3 = r3.f91814e
        L_0x0488:
            int r5 = r18.mo5062s()
            if (r5 <= 0) goto L_0x04a5
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r5 = r0.f91787r
            boolean r5 = r5.f91806e
            if (r5 == 0) goto L_0x049d
            int r4 = r0.m80748b(r4, r1, r2, r7)
            int r3 = r3 + r4
            r0.m80738a(r3, r1, r2, r8)
            return
        L_0x049d:
            int r3 = r0.m80738a(r3, r1, r2, r7)
            int r4 = r4 + r3
            r0.m80748b(r4, r1, r2, r8)
        L_0x04a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.mo4689c(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s):void");
    }

    /* renamed from: a */
    private void m80744a(C1343o oVar, int i, int i2) {
        while (i2 >= i) {
            mo5018a(i2, oVar);
            i2--;
        }
    }

    /* renamed from: a_ */
    public final int mo74367a_(int i, int i2, int i3) {
        return m4406a(this.f4745I, this.f4743G, i2, i3, mo4742e());
    }

    /* renamed from: b */
    public final int mo74369b(int i, int i2, int i3) {
        return m4406a(this.f4746J, this.f4744H, i2, i3, mo4745f());
    }

    /* renamed from: c */
    public final void mo5044c(RecyclerView recyclerView, int i, int i2) {
        super.mo5044c(recyclerView, i, i2);
        m80766m(i);
    }

    /* renamed from: a */
    private View m80741a(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View g = mo5050g(i);
            if (m80747a(g, false)) {
                return g;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m80758d(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i) {
                return true;
            }
            return false;
        } else if (size >= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final int mo4685b(int i, C1343o oVar, C1349s sVar) {
        if (mo74374i() || (this.f91773b == 0 && !mo74374i())) {
            int c = m80753c(i, oVar, sVar);
            this.f91767N.clear();
            return c;
        }
        int p = m80769p(i);
        this.f91787r.f91805d += p;
        this.f91778g.mo5517a(-p);
        return p;
    }

    private FlexboxLayoutManager(Context context, int i, int i2) {
        this.f91782m = -1;
        this.f91775d = new ArrayList();
        this.f91776e = new C35756c(this);
        this.f91787r = new C35752a();
        this.f91789t = -1;
        this.f91764K = DynamicTabYellowPointVersion.DEFAULT;
        this.f91765L = DynamicTabYellowPointVersion.DEFAULT;
        this.f91766M = DynamicTabYellowPointVersion.DEFAULT;
        this.f91767N = new SparseArray<>();
        this.f91770Q = -1;
        this.f91771R = new C35757a();
        m80750b(0);
        m80760f(1);
        m80764k(4);
        this.f4738B = true;
        this.f91768O = context;
    }

    /* renamed from: c */
    private int m80753c(int i, C1343o oVar, C1349s sVar) {
        boolean z;
        if (mo5062s() == 0 || i == 0) {
            return 0;
        }
        m80734H();
        int i2 = 1;
        this.f91786q.f91819j = true;
        if (mo74374i() || !this.f91774c) {
            z = false;
        } else {
            z = true;
        }
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m80743a(i2, abs);
        int a = this.f91786q.f91815f + m80739a(oVar, sVar, this.f91786q);
        if (a < 0) {
            return 0;
        }
        if (z) {
            if (abs > a) {
                i = (-i2) * a;
            }
        } else if (abs > a) {
            i = i2 * a;
        }
        this.f91777f.mo5517a(-i);
        this.f91786q.f91816g = i;
        return i;
    }

    /* renamed from: c */
    private View m80754c(int i, int i2, int i3) {
        int i4;
        m80734H();
        m80735I();
        int b = this.f91777f.mo5518b();
        int c = this.f91777f.mo5520c();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View g = mo5050g(i);
            int c2 = m4418c(g);
            if (c2 >= 0 && c2 < i3) {
                if (((android.support.p043v7.widget.RecyclerView.LayoutParams) g.getLayoutParams()).bu_()) {
                    if (view2 == null) {
                        view2 = g;
                    }
                } else if (this.f91777f.mo5516a(g) >= b && this.f91777f.mo5519b(g) <= c) {
                    return g;
                } else {
                    if (view == null) {
                        view = g;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX INFO: used method not loaded: com.ss.android.ugc.aweme.journey.flexbox.c.a(long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.ss.android.ugc.aweme.journey.flexbox.c.b(long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.ss.android.ugc.aweme.journey.flexbox.c.a(android.view.View, com.ss.android.ugc.aweme.journey.flexbox.b, int, int, int, int):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0110, code lost:
        r4 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0111, code lost:
        r10 = r10 - ((float) r0.f91787r.f91805d);
        r12 = r12 - ((float) r0.f91787r.f91805d);
        r4 = java.lang.Math.max(r4, 0.0f);
        r14 = r9.f91827h;
        r13 = r10;
        r16 = r12;
        r10 = r15;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012b, code lost:
        if (r10 >= (r15 + r14)) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012d, code lost:
        r11 = m80765l(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0131, code lost:
        if (r11 == null) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0133, code lost:
        r21 = r14;
        r22 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
        if (r2.f91818i != 1) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013c, code lost:
        mo5039b(r11, f91763j);
        mo5037b(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0144, code lost:
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0147, code lost:
        mo5039b(r11, f91763j);
        mo5038b(r11, r12);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0152, code lost:
        r17 = r0.f91776e.f91840b[r10];
        r12 = com.p683ss.android.ugc.aweme.journey.flexbox.C35756c.m80856a(r17);
        r14 = com.p683ss.android.ugc.aweme.journey.flexbox.C35756c.m80868b(r17);
        r3 = (com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.LayoutParams) r11.getLayoutParams();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016c, code lost:
        if (m80757c(r11, r12, r14, r3) == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016e, code lost:
        r11.measure(r12, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0171, code lost:
        r20 = r13 + ((float) (r3.leftMargin + m4425m(r11)));
        r23 = r16 - ((float) (r3.rightMargin + m4426n(r11)));
        r16 = r7 + m4423k(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018d, code lost:
        if (r0.f91774c == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018f, code lost:
        r25 = r15;
        r0.f91776e.mo74405a(r11, r9, java.lang.Math.round(r23) - r11.getMeasuredWidth(), r16, java.lang.Math.round(r23), r16 + r11.getMeasuredHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b3, code lost:
        r25 = r15;
        r0.f91776e.mo74405a(r11, r9, java.lang.Math.round(r20), r16, java.lang.Math.round(r20) + r11.getMeasuredWidth(), r16 + r11.getMeasuredHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d0, code lost:
        r12 = r19;
        r13 = r20 + (((float) ((r11.getMeasuredWidth() + r3.rightMargin) + m4426n(r11))) + r4);
        r16 = r23 - (((float) ((r11.getMeasuredWidth() + r3.leftMargin) + m4425m(r11))) + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f7, code lost:
        r22 = r3;
        r21 = r14;
        r25 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01fd, code lost:
        r10 = r10 + 1;
        r14 = r21;
        r3 = r22;
        r15 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0207, code lost:
        r22 = r3;
        r2.f91812c += r0.f91786q.f91818i;
        r3 = r9.f91826g;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m80739a(android.support.p043v7.widget.RecyclerView.C1343o r27, android.support.p043v7.widget.RecyclerView.C1349s r28, com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.C35753b r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r29
            int r3 = r2.f91815f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x001a
            int r3 = r2.f91810a
            if (r3 >= 0) goto L_0x0017
            int r3 = r2.f91815f
            int r5 = r2.f91810a
            int r3 = r3 + r5
            r2.f91815f = r3
        L_0x0017:
            r0.m80745a(r1, r2)
        L_0x001a:
            int r3 = r2.f91810a
            int r5 = r2.f91810a
            boolean r6 = r26.mo74374i()
            r8 = 0
        L_0x0023:
            if (r5 > 0) goto L_0x0030
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r9 = r0.f91786q
            boolean r9 = r9.f91811b
            if (r9 == 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            r22 = r3
            goto L_0x0242
        L_0x0030:
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r9 = r0.f91775d
            int r10 = r2.f91813d
            r11 = 1
            if (r10 < 0) goto L_0x004d
            int r10 = r2.f91813d
            int r12 = r28.mo5115a()
            if (r10 >= r12) goto L_0x004d
            int r10 = r2.f91812c
            if (r10 < 0) goto L_0x004d
            int r10 = r2.f91812c
            int r9 = r9.size()
            if (r10 >= r9) goto L_0x004d
            r9 = 1
            goto L_0x004e
        L_0x004d:
            r9 = 0
        L_0x004e:
            if (r9 == 0) goto L_0x002c
            java.util.List<com.ss.android.ugc.aweme.journey.flexbox.b> r9 = r0.f91775d
            int r10 = r2.f91812c
            java.lang.Object r9 = r9.get(r10)
            com.ss.android.ugc.aweme.journey.flexbox.b r9 = (com.p683ss.android.ugc.aweme.journey.flexbox.C35755b) r9
            int r10 = r9.f91834o
            r2.f91813d = r10
            boolean r10 = r26.mo74374i()
            if (r10 == 0) goto L_0x0215
            boolean r10 = f91762i
            if (r10 != 0) goto L_0x0075
            com.ss.android.ugc.aweme.journey.flexbox.c r10 = r0.f91776e
            long[] r10 = r10.f91840b
            if (r10 == 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x0075:
            int r10 = r26.mo5063t()
            int r12 = r26.mo5065v()
            int r13 = r0.f4745I
            int r14 = r2.f91814e
            int r15 = r2.f91818i
            r7 = -1
            if (r15 != r7) goto L_0x0089
            int r7 = r9.f91826g
            int r14 = r14 - r7
        L_0x0089:
            r7 = r14
            int r15 = r2.f91813d
            int r14 = r0.f91780k
            r16 = 1073741824(0x40000000, float:2.0)
            switch(r14) {
                case 0: goto L_0x010d;
                case 1: goto L_0x0102;
                case 2: goto L_0x00ed;
                case 3: goto L_0x00d7;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00a9;
                default: goto L_0x0093;
            }
        L_0x0093:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.<init>(r3)
            int r3 = r0.f91780k
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00a9:
            int r14 = r9.f91827h
            if (r14 == 0) goto L_0x00b9
            int r14 = r9.f91824e
            int r14 = r13 - r14
            float r14 = (float) r14
            int r4 = r9.f91827h
            int r4 = r4 + r11
            float r4 = (float) r4
            float r4 = r14 / r4
            goto L_0x00ba
        L_0x00b9:
            r4 = 0
        L_0x00ba:
            float r10 = (float) r10
            float r10 = r10 + r4
            int r13 = r13 - r12
            float r12 = (float) r13
            float r12 = r12 - r4
            goto L_0x0111
        L_0x00c0:
            int r4 = r9.f91827h
            if (r4 == 0) goto L_0x00ce
            int r4 = r9.f91824e
            int r4 = r13 - r4
            float r4 = (float) r4
            int r14 = r9.f91827h
            float r14 = (float) r14
            float r4 = r4 / r14
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            float r10 = (float) r10
            float r14 = r4 / r16
            float r10 = r10 + r14
            int r13 = r13 - r12
            float r12 = (float) r13
            float r12 = r12 - r14
            goto L_0x0111
        L_0x00d7:
            float r10 = (float) r10
            int r4 = r9.f91827h
            if (r4 == r11) goto L_0x00e1
            int r4 = r9.f91827h
            int r4 = r4 - r11
            float r4 = (float) r4
            goto L_0x00e3
        L_0x00e1:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x00e3:
            int r14 = r9.f91824e
            int r14 = r13 - r14
            float r14 = (float) r14
            float r4 = r14 / r4
            int r13 = r13 - r12
            float r12 = (float) r13
            goto L_0x0111
        L_0x00ed:
            float r4 = (float) r10
            int r10 = r9.f91824e
            int r10 = r13 - r10
            float r10 = (float) r10
            float r10 = r10 / r16
            float r10 = r10 + r4
            int r4 = r13 - r12
            float r4 = (float) r4
            int r12 = r9.f91824e
            int r13 = r13 - r12
            float r12 = (float) r13
            float r12 = r12 / r16
            float r12 = r4 - r12
            goto L_0x0110
        L_0x0102:
            int r4 = r9.f91824e
            int r13 = r13 - r4
            int r13 = r13 + r12
            float r4 = (float) r13
            int r12 = r9.f91824e
            int r12 = r12 - r10
            float r12 = (float) r12
            r10 = r4
            goto L_0x0110
        L_0x010d:
            float r10 = (float) r10
            int r13 = r13 - r12
            float r12 = (float) r13
        L_0x0110:
            r4 = 0
        L_0x0111:
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r13 = r0.f91787r
            int r13 = r13.f91805d
            float r13 = (float) r13
            float r10 = r10 - r13
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a r13 = r0.f91787r
            int r13 = r13.f91805d
            float r13 = (float) r13
            float r12 = r12 - r13
            r13 = 0
            float r4 = java.lang.Math.max(r4, r13)
            int r14 = r9.f91827h
            r13 = r10
            r16 = r12
            r10 = r15
            r12 = 0
        L_0x0129:
            int r11 = r15 + r14
            if (r10 >= r11) goto L_0x0207
            android.view.View r11 = r0.m80765l(r10)
            if (r11 == 0) goto L_0x01f7
            r21 = r14
            int r14 = r2.f91818i
            r22 = r3
            r3 = 1
            if (r14 != r3) goto L_0x0147
            android.graphics.Rect r14 = f91763j
            r0.mo5039b(r11, r14)
            r0.mo5037b(r11)
        L_0x0144:
            r19 = r12
            goto L_0x0152
        L_0x0147:
            android.graphics.Rect r14 = f91763j
            r0.mo5039b(r11, r14)
            r0.mo5038b(r11, r12)
            int r12 = r12 + 1
            goto L_0x0144
        L_0x0152:
            com.ss.android.ugc.aweme.journey.flexbox.c r12 = r0.f91776e
            long[] r12 = r12.f91840b
            r17 = r12[r10]
            int r12 = com.p683ss.android.ugc.aweme.journey.flexbox.C35756c.m80856a(r17)
            int r14 = com.p683ss.android.ugc.aweme.journey.flexbox.C35756c.m80868b(r17)
            android.view.ViewGroup$LayoutParams r17 = r11.getLayoutParams()
            r3 = r17
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$LayoutParams r3 = (com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.LayoutParams) r3
            boolean r17 = r0.m80757c(r11, r12, r14, r3)
            if (r17 == 0) goto L_0x0171
            r11.measure(r12, r14)
        L_0x0171:
            int r12 = r3.leftMargin
            int r14 = m4425m(r11)
            int r12 = r12 + r14
            float r12 = (float) r12
            float r20 = r13 + r12
            int r12 = r3.rightMargin
            int r13 = m4426n(r11)
            int r12 = r12 + r13
            float r12 = (float) r12
            float r23 = r16 - r12
            int r12 = m4423k(r11)
            int r16 = r7 + r12
            boolean r12 = r0.f91774c
            if (r12 == 0) goto L_0x01b3
            com.ss.android.ugc.aweme.journey.flexbox.c r12 = r0.f91776e
            int r13 = java.lang.Math.round(r23)
            int r14 = r11.getMeasuredWidth()
            int r17 = r13 - r14
            int r18 = java.lang.Math.round(r23)
            int r13 = r11.getMeasuredHeight()
            int r24 = r16 + r13
            r13 = r11
            r14 = r9
            r25 = r15
            r15 = r17
            r17 = r18
            r18 = r24
            r12.mo74405a(r13, r14, r15, r16, r17, r18)
            goto L_0x01d0
        L_0x01b3:
            r25 = r15
            com.ss.android.ugc.aweme.journey.flexbox.c r12 = r0.f91776e
            int r15 = java.lang.Math.round(r20)
            int r13 = java.lang.Math.round(r20)
            int r14 = r11.getMeasuredWidth()
            int r17 = r13 + r14
            int r13 = r11.getMeasuredHeight()
            int r18 = r16 + r13
            r13 = r11
            r14 = r9
            r12.mo74405a(r13, r14, r15, r16, r17, r18)
        L_0x01d0:
            int r12 = r11.getMeasuredWidth()
            int r13 = r3.rightMargin
            int r12 = r12 + r13
            int r13 = m4426n(r11)
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 + r4
            float r20 = r20 + r12
            int r12 = r11.getMeasuredWidth()
            int r3 = r3.leftMargin
            int r12 = r12 + r3
            int r3 = m4425m(r11)
            int r12 = r12 + r3
            float r3 = (float) r12
            float r3 = r3 + r4
            float r23 = r23 - r3
            r12 = r19
            r13 = r20
            r16 = r23
            goto L_0x01fd
        L_0x01f7:
            r22 = r3
            r21 = r14
            r25 = r15
        L_0x01fd:
            int r10 = r10 + 1
            r14 = r21
            r3 = r22
            r15 = r25
            goto L_0x0129
        L_0x0207:
            r22 = r3
            int r3 = r2.f91812c
            com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b r4 = r0.f91786q
            int r4 = r4.f91818i
            int r3 = r3 + r4
            r2.f91812c = r3
            int r3 = r9.f91826g
            goto L_0x021b
        L_0x0215:
            r22 = r3
            int r3 = r0.m80740a(r9, r2)
        L_0x021b:
            int r8 = r8 + r3
            if (r6 != 0) goto L_0x022e
            boolean r3 = r0.f91774c
            if (r3 == 0) goto L_0x022e
            int r3 = r2.f91814e
            int r4 = r9.f91826g
            int r7 = r2.f91818i
            int r4 = r4 * r7
            int r3 = r3 - r4
            r2.f91814e = r3
            goto L_0x0239
        L_0x022e:
            int r3 = r2.f91814e
            int r4 = r9.f91826g
            int r7 = r2.f91818i
            int r4 = r4 * r7
            int r3 = r3 + r4
            r2.f91814e = r3
        L_0x0239:
            int r3 = r9.f91826g
            int r5 = r5 - r3
            r3 = r22
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0023
        L_0x0242:
            int r3 = r2.f91810a
            int r3 = r3 - r8
            r2.f91810a = r3
            int r3 = r2.f91815f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x0260
            int r3 = r2.f91815f
            int r3 = r3 + r8
            r2.f91815f = r3
            int r3 = r2.f91810a
            if (r3 >= 0) goto L_0x025d
            int r3 = r2.f91815f
            int r4 = r2.f91810a
            int r3 = r3 + r4
            r2.f91815f = r3
        L_0x025d:
            r0.m80745a(r1, r2)
        L_0x0260:
            int r1 = r2.f91810a
            int r3 = r22 - r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager.m80739a(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s, com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b):int");
    }

    /* renamed from: b */
    private void m80752b(C35752a aVar, boolean z, boolean z2) {
        if (z2) {
            m80733G();
        } else {
            this.f91786q.f91811b = false;
        }
        if (mo74374i() || !this.f91774c) {
            this.f91786q.f91810a = aVar.f91804c - this.f91777f.mo5518b();
        } else {
            this.f91786q.f91810a = (this.f91769P.getWidth() - aVar.f91804c) - this.f91777f.mo5518b();
        }
        this.f91786q.f91813d = aVar.f91802a;
        this.f91786q.f91817h = 1;
        this.f91786q.f91818i = -1;
        this.f91786q.f91814e = aVar.f91804c;
        this.f91786q.f91815f = DynamicTabYellowPointVersion.DEFAULT;
        this.f91786q.f91812c = aVar.f91803b;
        if (z && aVar.f91803b > 0 && this.f91775d.size() > aVar.f91803b) {
            C35755b bVar = (C35755b) this.f91775d.get(aVar.f91803b);
            this.f91786q.f91812c--;
            this.f91786q.f91813d -= bVar.f91827h;
        }
    }

    /* renamed from: a */
    private int m80738a(int i, C1343o oVar, C1349s sVar, boolean z) {
        int i2;
        if (mo74374i() || !this.f91774c) {
            int b = i - this.f91777f.mo5518b();
            if (b <= 0) {
                return 0;
            }
            i2 = -m80753c(b, oVar, sVar);
        } else {
            int c = this.f91777f.mo5520c() - i;
            if (c <= 0) {
                return 0;
            }
            i2 = m80753c(-c, oVar, sVar);
        }
        int i3 = i + i2;
        if (z) {
            int b2 = i3 - this.f91777f.mo5518b();
            if (b2 > 0) {
                this.f91777f.mo5517a(-b2);
                return i2 - b2;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private int m80748b(int i, C1343o oVar, C1349s sVar, boolean z) {
        boolean z2;
        int i2;
        if (mo74374i() || !this.f91774c) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int b = i - this.f91777f.mo5518b();
            if (b <= 0) {
                return 0;
            }
            i2 = m80753c(b, oVar, sVar);
        } else {
            int c = this.f91777f.mo5520c() - i;
            if (c <= 0) {
                return 0;
            }
            i2 = -m80753c(-c, oVar, sVar);
        }
        int i3 = i + i2;
        if (z) {
            int c2 = this.f91777f.mo5520c() - i3;
            if (c2 > 0) {
                this.f91777f.mo5517a(c2);
                return c2 + i2;
            }
        }
        return i2;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f91782m = -1;
        this.f91775d = new ArrayList();
        this.f91776e = new C35756c(this);
        this.f91787r = new C35752a();
        this.f91789t = -1;
        this.f91764K = DynamicTabYellowPointVersion.DEFAULT;
        this.f91765L = DynamicTabYellowPointVersion.DEFAULT;
        this.f91766M = DynamicTabYellowPointVersion.DEFAULT;
        this.f91767N = new SparseArray<>();
        this.f91770Q = -1;
        this.f91771R = new C35757a();
        C1336b a = m4407a(context, attributeSet, i, i2);
        switch (a.f4757a) {
            case 0:
                if (!a.f4759c) {
                    m80750b(0);
                    break;
                } else {
                    m80750b(1);
                    break;
                }
            case 1:
                if (!a.f4759c) {
                    m80750b(2);
                    break;
                } else {
                    m80750b(3);
                    break;
                }
        }
        m80760f(1);
        m80764k(4);
        this.f4738B = true;
        this.f91768O = context;
    }

    /* renamed from: c */
    private boolean m80757c(View view, int i, int i2, android.support.p043v7.widget.RecyclerView.LayoutParams layoutParams) {
        if (view.isLayoutRequested() || !this.f4739C || !m80758d(view.getWidth(), i, layoutParams.width) || !m80758d(view.getHeight(), i2, layoutParams.height)) {
            return true;
        }
        return false;
    }
}
