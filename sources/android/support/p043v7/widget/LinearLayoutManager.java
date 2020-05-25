package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1332i.C1335a;
import android.support.p043v7.widget.RecyclerView.C1332i.C1336b;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1346r.C1348b;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.support.p043v7.widget.p052a.C1385a.C1397d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.List;

/* renamed from: android.support.v7.widget.LinearLayoutManager */
public class LinearLayoutManager extends C1332i implements C1348b, C1397d {

    /* renamed from: a */
    private C1306c f4549a;

    /* renamed from: b */
    private boolean f4550b;

    /* renamed from: c */
    private final C1305b f4551c;

    /* renamed from: i */
    public int f4552i;

    /* renamed from: j */
    C1422ak f4553j;

    /* renamed from: k */
    public boolean f4554k;

    /* renamed from: l */
    boolean f4555l;

    /* renamed from: m */
    public boolean f4556m;

    /* renamed from: n */
    public boolean f4557n;

    /* renamed from: o */
    int f4558o;

    /* renamed from: p */
    int f4559p;

    /* renamed from: q */
    public boolean f4560q;

    /* renamed from: r */
    SavedState f4561r;

    /* renamed from: s */
    final C1304a f4562s;

    /* renamed from: t */
    public int f4563t;

    /* renamed from: android.support.v7.widget.LinearLayoutManager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f4564a;

        /* renamed from: b */
        int f4565b;

        /* renamed from: c */
        boolean f4566c;

        public SavedState() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo4754b() {
            this.f4564a = -1;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo4753a() {
            if (this.f4564a >= 0) {
                return true;
            }
            return false;
        }

        public SavedState(SavedState savedState) {
            this.f4564a = savedState.f4564a;
            this.f4565b = savedState.f4565b;
            this.f4566c = savedState.f4566c;
        }

        SavedState(Parcel parcel) {
            this.f4564a = parcel.readInt();
            this.f4565b = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f4566c = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4564a);
            parcel.writeInt(this.f4565b);
            parcel.writeInt(this.f4566c ? 1 : 0);
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$a */
    static class C1304a {

        /* renamed from: a */
        C1422ak f4567a;

        /* renamed from: b */
        int f4568b;

        /* renamed from: c */
        int f4569c;

        /* renamed from: d */
        boolean f4570d;

        /* renamed from: e */
        boolean f4571e;

        C1304a() {
            mo4759a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4759a() {
            this.f4568b = -1;
            this.f4569c = DynamicTabYellowPointVersion.DEFAULT;
            this.f4570d = false;
            this.f4571e = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo4761b() {
            int i;
            if (this.f4570d) {
                i = this.f4567a.mo5520c();
            } else {
                i = this.f4567a.mo5518b();
            }
            this.f4569c = i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f4568b);
            sb.append(", mCoordinate=");
            sb.append(this.f4569c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f4570d);
            sb.append(", mValid=");
            sb.append(this.f4571e);
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: b */
        public final void mo4762b(View view, int i) {
            if (this.f4570d) {
                this.f4569c = this.f4567a.mo5519b(view) + this.f4567a.mo5515a();
            } else {
                this.f4569c = this.f4567a.mo5516a(view);
            }
            this.f4568b = i;
        }

        /* renamed from: a */
        public final void mo4760a(View view, int i) {
            int a = this.f4567a.mo5515a();
            if (a >= 0) {
                mo4762b(view, i);
                return;
            }
            this.f4568b = i;
            if (this.f4570d) {
                int c = (this.f4567a.mo5520c() - a) - this.f4567a.mo5519b(view);
                this.f4569c = this.f4567a.mo5520c() - c;
                if (c > 0) {
                    int e = this.f4569c - this.f4567a.mo5525e(view);
                    int b = this.f4567a.mo5518b();
                    int min = e - (b + Math.min(this.f4567a.mo5516a(view) - b, 0));
                    if (min < 0) {
                        this.f4569c += Math.min(c, -min);
                    }
                }
                return;
            }
            int a2 = this.f4567a.mo5516a(view);
            int b2 = a2 - this.f4567a.mo5518b();
            this.f4569c = a2;
            if (b2 > 0) {
                int c2 = (this.f4567a.mo5520c() - Math.min(0, (this.f4567a.mo5520c() - a) - this.f4567a.mo5519b(view))) - (a2 + this.f4567a.mo5525e(view));
                if (c2 < 0) {
                    this.f4569c -= Math.min(b2, -c2);
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$b */
    protected static class C1305b {

        /* renamed from: a */
        public int f4572a;

        /* renamed from: b */
        public boolean f4573b;

        /* renamed from: c */
        public boolean f4574c;

        /* renamed from: d */
        public boolean f4575d;

        protected C1305b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4764a() {
            this.f4572a = 0;
            this.f4573b = false;
            this.f4574c = false;
            this.f4575d = false;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$c */
    static class C1306c {

        /* renamed from: a */
        boolean f4576a = true;

        /* renamed from: b */
        int f4577b;

        /* renamed from: c */
        int f4578c;

        /* renamed from: d */
        int f4579d;

        /* renamed from: e */
        int f4580e;

        /* renamed from: f */
        int f4581f;

        /* renamed from: g */
        int f4582g;

        /* renamed from: h */
        int f4583h;

        /* renamed from: i */
        boolean f4584i;

        /* renamed from: j */
        int f4585j;

        /* renamed from: k */
        List<C1352v> f4586k;

        /* renamed from: l */
        boolean f4587l;

        C1306c() {
        }

        /* renamed from: a */
        public final void mo4766a() {
            m4216a((View) null);
        }

        /* renamed from: b */
        private View m4217b() {
            int size = this.f4586k.size();
            int i = 0;
            while (i < size) {
                View view = ((C1352v) this.f4586k.get(i)).itemView;
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (layoutParams.bu_() || this.f4579d != layoutParams.bw_()) {
                    i++;
                } else {
                    m4216a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo4767a(C1349s sVar) {
            if (this.f4579d < 0 || this.f4579d >= sVar.mo5115a()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private void m4216a(View view) {
            View b = m4218b(view);
            if (b == null) {
                this.f4579d = -1;
            } else {
                this.f4579d = ((LayoutParams) b.getLayoutParams()).bw_();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final View mo4765a(C1343o oVar) {
            if (this.f4586k != null) {
                return m4217b();
            }
            View b = oVar.mo5096b(this.f4579d);
            this.f4579d += this.f4580e;
            return b;
        }

        /* renamed from: b */
        private View m4218b(View view) {
            int size = this.f4586k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((C1352v) this.f4586k.get(i2)).itemView;
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.bu_()) {
                    int bw_ = (layoutParams.bw_() - this.f4579d) * this.f4580e;
                    if (bw_ >= 0 && bw_ < i) {
                        if (bw_ == 0) {
                            return view3;
                        }
                        view2 = view3;
                        i = bw_;
                    }
                }
            }
            return view2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4674a(C1343o oVar, C1349s sVar, C1304a aVar, int i) {
    }

    public final boolean br_() {
        return true;
    }

    /* renamed from: a */
    public LayoutParams mo4667a() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: a */
    public final void mo4725a(RecyclerView recyclerView, C1343o oVar) {
        super.mo4725a(recyclerView, oVar);
        if (this.f4560q) {
            mo5042c(oVar);
            oVar.mo5091a();
        }
    }

    /* renamed from: a */
    public final void mo4728a(AccessibilityEvent accessibilityEvent) {
        super.mo4728a(accessibilityEvent);
        if (mo5062s() > 0) {
            accessibilityEvent.setFromIndex(mo4749j());
            accessibilityEvent.setToIndex(mo4751l());
        }
    }

    /* renamed from: a */
    public final void mo4724a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4561r = (SavedState) parcelable;
            mo5057n();
        }
    }

    /* renamed from: a */
    public void mo4683a(boolean z) {
        mo4729a((String) null);
        if (this.f4556m != z) {
            this.f4556m = z;
            mo5057n();
        }
    }

    /* renamed from: a */
    public void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        C1415af afVar = new C1415af(recyclerView.getContext());
        afVar.f4778g = i;
        mo5022a((C1346r) afVar);
    }

    /* renamed from: a */
    public void mo4677a(C1349s sVar) {
        super.mo4677a(sVar);
        this.f4561r = null;
        this.f4558o = -1;
        this.f4559p = DynamicTabYellowPointVersion.DEFAULT;
        this.f4562s.mo4759a();
    }

    /* renamed from: a */
    public void mo4721a(int i, int i2) {
        this.f4558o = i;
        this.f4559p = i2;
        if (this.f4561r != null) {
            this.f4561r.mo4754b();
        }
        mo5057n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4678a(C1349s sVar, C1306c cVar, C1335a aVar) {
        int i = cVar.f4579d;
        if (i >= 0 && i < sVar.mo5115a()) {
            aVar.mo5075a(i, Math.max(0, cVar.f4582g));
        }
    }

    /* renamed from: a */
    public final void mo4723a(int i, C1335a aVar) {
        int i2;
        boolean z;
        int i3 = -1;
        if (this.f4561r == null || !this.f4561r.mo4753a()) {
            m4140F();
            z = this.f4555l;
            i2 = this.f4558o == -1 ? z ? i - 1 : 0 : this.f4558o;
        } else {
            z = this.f4561r.f4566c;
            i2 = this.f4561r.f4564a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f4563t && i2 >= 0 && i2 < i; i4++) {
            aVar.mo5075a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: a */
    public final void mo4722a(int i, int i2, C1349s sVar, C1335a aVar) {
        if (this.f4552i != 0) {
            i = i2;
        }
        if (mo5062s() != 0 && i != 0) {
            mo4748h();
            m4149a(i > 0 ? 1 : -1, Math.abs(i), true, sVar);
            mo4678a(sVar, this.f4549a, aVar);
        }
    }

    /* renamed from: a */
    public final void mo4729a(String str) {
        if (this.f4561r == null) {
            super.mo4729a(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4675a(C1343o oVar, C1349s sVar, C1306c cVar, C1305b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View a = cVar.mo4765a(oVar);
        if (a == null) {
            bVar.f4573b = true;
            return;
        }
        LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
        if (cVar.f4586k == null) {
            if (this.f4555l == (cVar.f4581f == -1)) {
                mo5037b(a);
            } else {
                mo5038b(a, 0);
            }
        } else {
            if (this.f4555l == (cVar.f4581f == -1)) {
                mo5023a(a);
            } else {
                mo5024a(a, 0);
            }
        }
        mo5032a_(a, 0, 0);
        bVar.f4572a = this.f4553j.mo5525e(a);
        if (this.f4552i == 1) {
            if (mo4747g()) {
                i7 = this.f4745I - mo5065v();
                i2 = i7 - this.f4553j.mo5527f(a);
            } else {
                i2 = mo5063t();
                i7 = this.f4553j.mo5527f(a) + i2;
            }
            if (cVar.f4581f == -1) {
                i3 = cVar.f4577b;
                int i8 = i7;
                i4 = cVar.f4577b - bVar.f4572a;
                i = i8;
            } else {
                int i9 = cVar.f4577b;
                i3 = cVar.f4577b + bVar.f4572a;
                i = i7;
                i4 = i9;
            }
        } else {
            i4 = mo5064u();
            int f = this.f4553j.mo5527f(a) + i4;
            if (cVar.f4581f == -1) {
                i5 = f;
                i6 = cVar.f4577b - bVar.f4572a;
                i = cVar.f4577b;
            } else {
                int i10 = cVar.f4577b;
                i = cVar.f4577b + bVar.f4572a;
                i5 = f;
                i6 = i10;
            }
            i3 = i5;
        }
        m4416b(a, i2, i4, i, i3);
        if (layoutParams.bu_() || layoutParams.bv_()) {
            bVar.f4574c = true;
        }
        bVar.f4575d = a.hasFocusable();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo4670a(C1343o oVar, C1349s sVar, int i, int i2, int i3) {
        mo4748h();
        int b = this.f4553j.mo5518b();
        int c = this.f4553j.mo5520c();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View g = mo5050g(i);
            int c2 = m4418c(g);
            if (c2 >= 0 && c2 < i3) {
                if (((LayoutParams) g.getLayoutParams()).bu_()) {
                    if (view2 == null) {
                        view2 = g;
                    }
                } else if (this.f4553j.mo5516a(g) < c && this.f4553j.mo5519b(g) >= b) {
                    return g;
                } else {
                    if (view == null) {
                        view = g;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: a */
    public View mo4671a(View view, int i, C1343o oVar, C1349s sVar) {
        View view2;
        View view3;
        m4140F();
        if (mo5062s() == 0) {
            return null;
        }
        int f = mo4743f(i);
        if (f == Integer.MIN_VALUE) {
            return null;
        }
        mo4748h();
        mo4748h();
        m4149a(f, (int) (((float) this.f4553j.mo5524e()) * 0.33333334f), false, sVar);
        this.f4549a.f4582g = DynamicTabYellowPointVersion.DEFAULT;
        this.f4549a.f4576a = false;
        m4146a(oVar, this.f4549a, sVar, true);
        if (f == -1) {
            if (this.f4555l) {
                view2 = m4163g(oVar, sVar);
            } else {
                view2 = m4160f(oVar, sVar);
            }
        } else if (this.f4555l) {
            view2 = m4160f(oVar, sVar);
        } else {
            view2 = m4163g(oVar, sVar);
        }
        if (f == -1) {
            view3 = m4143I();
        } else {
            view3 = m4144J();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: a */
    public final void mo4727a(View view, View view2, int i, int i2) {
        mo4729a("Cannot drop a view during a scroll or layout calculation");
        mo4748h();
        m4140F();
        int c = m4418c(view);
        int c2 = m4418c(view2);
        char c3 = c < c2 ? (char) 1 : 65535;
        if (this.f4555l) {
            if (c3 == 1) {
                mo4721a(c2, this.f4553j.mo5520c() - (this.f4553j.mo5516a(view2) + this.f4553j.mo5525e(view)));
            } else {
                mo4721a(c2, this.f4553j.mo5520c() - this.f4553j.mo5519b(view2));
            }
        } else if (c3 == 65535) {
            mo4721a(c2, this.f4553j.mo5516a(view2));
        } else {
            mo4721a(c2, this.f4553j.mo5519b(view2) - this.f4553j.mo5525e(view));
        }
    }

    /* renamed from: G */
    private static C1306c m4141G() {
        return new C1306c();
    }

    public boolean bs_() {
        if (this.f4561r == null && this.f4550b == this.f4556m) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo4742e() {
        if (this.f4552i == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo4748h() {
        if (this.f4549a == null) {
            this.f4549a = m4141G();
        }
    }

    /* renamed from: F */
    private void m4140F() {
        boolean z = true;
        if (this.f4552i == 1 || !mo4747g()) {
            z = this.f4554k;
        } else if (this.f4554k) {
            z = false;
        }
        this.f4555l = z;
    }

    /* renamed from: H */
    private boolean m4142H() {
        if (this.f4553j.mo5528g() == 0 && this.f4553j.mo5522d() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    private View m4143I() {
        int i;
        if (this.f4555l) {
            i = mo5062s() - 1;
        } else {
            i = 0;
        }
        return mo5050g(i);
    }

    /* renamed from: J */
    private View m4144J() {
        int i;
        if (this.f4555l) {
            i = 0;
        } else {
            i = mo5062s() - 1;
        }
        return mo5050g(i);
    }

    /* renamed from: f */
    public boolean mo4745f() {
        if (this.f4552i == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo4747g() {
        if (mo5060q() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int mo4749j() {
        View a = m4147a(0, mo5062s(), false, true);
        if (a == null) {
            return -1;
        }
        return m4418c(a);
    }

    /* renamed from: k */
    public final int mo4750k() {
        View a = m4147a(0, mo5062s(), true, false);
        if (a == null) {
            return -1;
        }
        return m4418c(a);
    }

    /* renamed from: l */
    public final int mo4751l() {
        View a = m4147a(mo5062s() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return m4418c(a);
    }

    /* renamed from: m */
    public final int mo4752m() {
        View a = m4147a(mo5062s() - 1, -1, true, false);
        if (a == null) {
            return -1;
        }
        return m4418c(a);
    }

    /* access modifiers changed from: 0000 */
    public final boolean bt_() {
        boolean z;
        if (!(this.f4744H == 1073741824 || this.f4743G == 1073741824)) {
            int s = mo5062s();
            int i = 0;
            while (true) {
                if (i >= s) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = mo5050g(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final Parcelable mo4739d() {
        if (this.f4561r != null) {
            return new SavedState(this.f4561r);
        }
        SavedState savedState = new SavedState();
        if (mo5062s() > 0) {
            mo4748h();
            boolean z = this.f4550b ^ this.f4555l;
            savedState.f4566c = z;
            if (z) {
                View J = m4144J();
                savedState.f4565b = this.f4553j.mo5520c() - this.f4553j.mo5519b(J);
                savedState.f4564a = m4418c(J);
            } else {
                View I = m4143I();
                savedState.f4564a = m4418c(I);
                savedState.f4565b = this.f4553j.mo5516a(I) - this.f4553j.mo5518b();
            }
        } else {
            savedState.mo4754b();
        }
        return savedState;
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: a */
    private void m4150a(C1304a aVar) {
        m4159e(aVar.f4568b, aVar.f4569c);
    }

    /* renamed from: b */
    private void m4155b(C1304a aVar) {
        m4161f(aVar.f4568b, aVar.f4569c);
    }

    /* renamed from: c */
    public int mo4735c(C1349s sVar) {
        return m4165i(sVar);
    }

    /* renamed from: d */
    public final int mo4737d(C1349s sVar) {
        return m4166j(sVar);
    }

    /* renamed from: e */
    public final int mo4740e(C1349s sVar) {
        return m4166j(sVar);
    }

    /* renamed from: f */
    public final int mo4744f(C1349s sVar) {
        return m4167k(sVar);
    }

    /* renamed from: g */
    public final int mo4746g(C1349s sVar) {
        return m4167k(sVar);
    }

    /* renamed from: h */
    private int m4164h(C1349s sVar) {
        boolean z;
        if (sVar.f4792a != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f4553j.mo5524e();
        }
        return 0;
    }

    /* renamed from: i */
    private int m4165i(C1349s sVar) {
        if (mo5062s() == 0) {
            return 0;
        }
        mo4748h();
        C1422ak akVar = this.f4553j;
        View a = m4148a(!this.f4557n, true);
        return C1435as.m4979a(sVar, akVar, a, m4154b(!this.f4557n, true), this, this.f4557n, this.f4555l);
    }

    /* renamed from: j */
    private int m4166j(C1349s sVar) {
        if (mo5062s() == 0) {
            return 0;
        }
        mo4748h();
        C1422ak akVar = this.f4553j;
        View a = m4148a(!this.f4557n, true);
        return C1435as.m4978a(sVar, akVar, a, m4154b(!this.f4557n, true), this, this.f4557n);
    }

    /* renamed from: k */
    private int m4167k(C1349s sVar) {
        if (mo5062s() == 0) {
            return 0;
        }
        mo4748h();
        C1422ak akVar = this.f4553j;
        View a = m4148a(!this.f4557n, true);
        return C1435as.m4980b(sVar, akVar, a, m4154b(!this.f4557n, true), this, this.f4557n);
    }

    /* renamed from: d */
    public final PointF mo4738d(int i) {
        if (mo5062s() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < m4418c(mo5050g(0))) {
            z = true;
        }
        if (z != this.f4555l) {
            i2 = -1;
        }
        if (this.f4552i == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: b */
    public final int mo4730b(C1349s sVar) {
        return m4165i(sVar);
    }

    /* renamed from: c */
    public final View mo4736c(int i) {
        int s = mo5062s();
        if (s == 0) {
            return null;
        }
        int c = i - m4418c(mo5050g(0));
        if (c >= 0 && c < s) {
            View g = mo5050g(c);
            if (m4418c(g) == i) {
                return g;
            }
        }
        return super.mo4736c(i);
    }

    /* renamed from: e */
    public void mo4741e(int i) {
        this.f4558o = i;
        this.f4559p = DynamicTabYellowPointVersion.DEFAULT;
        if (this.f4561r != null) {
            this.f4561r.mo4754b();
        }
        mo5057n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int mo4743f(int i) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        switch (i) {
                            case 1:
                                if (this.f4552i != 1 && mo4747g()) {
                                    return 1;
                                }
                                return -1;
                            case 2:
                                if (this.f4552i != 1 && mo4747g()) {
                                    return -1;
                                }
                                return 1;
                            default:
                                return DynamicTabYellowPointVersion.DEFAULT;
                        }
                    } else if (this.f4552i == 1) {
                        return 1;
                    } else {
                        return DynamicTabYellowPointVersion.DEFAULT;
                    }
                } else if (this.f4552i == 0) {
                    return 1;
                } else {
                    return DynamicTabYellowPointVersion.DEFAULT;
                }
            } else if (this.f4552i == 1) {
                return -1;
            } else {
                return DynamicTabYellowPointVersion.DEFAULT;
            }
        } else if (this.f4552i == 0) {
            return -1;
        } else {
            return DynamicTabYellowPointVersion.DEFAULT;
        }
    }

    /* renamed from: b */
    public final void mo4731b(int i) {
        if (i == 0 || i == 1) {
            mo4729a((String) null);
            if (i != this.f4552i || this.f4553j == null) {
                this.f4553j = C1422ak.m4898a(this, i);
                this.f4562s.f4567a = this.f4553j;
                this.f4552i = i;
                mo5057n();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final void mo4732b(boolean z) {
        mo4729a((String) null);
        if (z != this.f4554k) {
            this.f4554k = z;
            mo5057n();
        }
    }

    /* renamed from: f */
    private View m4160f(C1343o oVar, C1349s sVar) {
        return m4162g(0, mo5062s());
    }

    /* renamed from: g */
    private View m4163g(C1343o oVar, C1349s sVar) {
        return m4162g(mo5062s() - 1, -1);
    }

    /* renamed from: a */
    private View m4148a(boolean z, boolean z2) {
        if (this.f4555l) {
            return m4147a(mo5062s() - 1, -1, z, true);
        }
        return m4147a(0, mo5062s(), z, true);
    }

    /* renamed from: b */
    private View m4154b(boolean z, boolean z2) {
        if (this.f4555l) {
            return m4147a(0, mo5062s(), z, true);
        }
        return m4147a(mo5062s() - 1, -1, z, true);
    }

    /* renamed from: d */
    private View m4157d(C1343o oVar, C1349s sVar) {
        return mo4670a(oVar, sVar, 0, mo5062s(), sVar.mo5115a());
    }

    /* renamed from: e */
    private View m4158e(C1343o oVar, C1349s sVar) {
        return mo4670a(oVar, sVar, mo5062s() - 1, -1, sVar.mo5115a());
    }

    /* renamed from: e */
    private void m4159e(int i, int i2) {
        int i3;
        this.f4549a.f4578c = this.f4553j.mo5520c() - i2;
        C1306c cVar = this.f4549a;
        if (this.f4555l) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.f4580e = i3;
        this.f4549a.f4579d = i;
        this.f4549a.f4581f = 1;
        this.f4549a.f4577b = i2;
        this.f4549a.f4582g = DynamicTabYellowPointVersion.DEFAULT;
    }

    /* renamed from: f */
    private void m4161f(int i, int i2) {
        int i3;
        this.f4549a.f4578c = i2 - this.f4553j.mo5518b();
        this.f4549a.f4579d = i;
        C1306c cVar = this.f4549a;
        if (this.f4555l) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        cVar.f4580e = i3;
        this.f4549a.f4581f = -1;
        this.f4549a.f4577b = i2;
        this.f4549a.f4582g = DynamicTabYellowPointVersion.DEFAULT;
    }

    /* renamed from: g */
    private View m4162g(int i, int i2) {
        char c;
        int i3;
        int i4;
        mo4748h();
        if (i2 > i) {
            c = 1;
        } else if (i2 < i) {
            c = 65535;
        } else {
            c = 0;
        }
        if (c == 0) {
            return mo5050g(i);
        }
        if (this.f4553j.mo5516a(mo5050g(i)) < this.f4553j.mo5518b()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f4552i == 0) {
            return this.f4751w.mo5707a(i, i2, i4, i3);
        }
        return this.f4752x.mo5707a(i, i2, i4, i3);
    }

    /* renamed from: a */
    private void m4152a(C1343o oVar, C1306c cVar) {
        if (cVar.f4576a && !cVar.f4587l) {
            if (cVar.f4581f == -1) {
                int i = cVar.f4582g;
                int s = mo5062s();
                if (i >= 0) {
                    int d = this.f4553j.mo5522d() - i;
                    if (this.f4555l) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= s) {
                                break;
                            }
                            View g = mo5050g(i2);
                            if (this.f4553j.mo5516a(g) < d || this.f4553j.mo5523d(g) < d) {
                                m4151a(oVar, 0, i2);
                            } else {
                                i2++;
                            }
                        }
                        m4151a(oVar, 0, i2);
                    } else {
                        int i3 = s - 1;
                        int i4 = i3;
                        while (i4 >= 0) {
                            View g2 = mo5050g(i4);
                            if (this.f4553j.mo5516a(g2) < d || this.f4553j.mo5523d(g2) < d) {
                                m4151a(oVar, i3, i4);
                            } else {
                                i4--;
                            }
                        }
                    }
                }
                return;
            }
            int i5 = cVar.f4582g;
            if (i5 >= 0) {
                int s2 = mo5062s();
                if (this.f4555l) {
                    int i6 = s2 - 1;
                    for (int i7 = i6; i7 >= 0; i7--) {
                        View g3 = mo5050g(i7);
                        if (this.f4553j.mo5519b(g3) > i5 || this.f4553j.mo5521c(g3) > i5) {
                            m4151a(oVar, i6, i7);
                            return;
                        }
                    }
                    return;
                }
                for (int i8 = 0; i8 < s2; i8++) {
                    View g4 = mo5050g(i8);
                    if (this.f4553j.mo5519b(g4) > i5 || this.f4553j.mo5521c(g4) > i5) {
                        m4151a(oVar, 0, i8);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4689c(android.support.p043v7.widget.RecyclerView.C1343o r17, android.support.p043v7.widget.RecyclerView.C1349s r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            android.support.v7.widget.LinearLayoutManager$SavedState r3 = r0.f4561r
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f4558o
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r18.mo5115a()
            if (r3 != 0) goto L_0x0019
            r16.mo5042c(r17)
            return
        L_0x0019:
            android.support.v7.widget.LinearLayoutManager$SavedState r3 = r0.f4561r
            if (r3 == 0) goto L_0x002b
            android.support.v7.widget.LinearLayoutManager$SavedState r3 = r0.f4561r
            boolean r3 = r3.mo4753a()
            if (r3 == 0) goto L_0x002b
            android.support.v7.widget.LinearLayoutManager$SavedState r3 = r0.f4561r
            int r3 = r3.f4564a
            r0.f4558o = r3
        L_0x002b:
            r16.mo4748h()
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r5 = 0
            r3.f4576a = r5
            r16.m4140F()
            android.view.View r3 = r16.mo5069z()
            android.support.v7.widget.LinearLayoutManager$a r6 = r0.f4562s
            boolean r6 = r6.f4571e
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1
            if (r6 == 0) goto L_0x0075
            int r6 = r0.f4558o
            if (r6 != r4) goto L_0x0075
            android.support.v7.widget.LinearLayoutManager$SavedState r6 = r0.f4561r
            if (r6 == 0) goto L_0x004c
            goto L_0x0075
        L_0x004c:
            if (r3 == 0) goto L_0x024a
            android.support.v7.widget.ak r6 = r0.f4553j
            int r6 = r6.mo5516a(r3)
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5520c()
            if (r6 >= r9) goto L_0x006a
            android.support.v7.widget.ak r6 = r0.f4553j
            int r6 = r6.mo5519b(r3)
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5518b()
            if (r6 > r9) goto L_0x024a
        L_0x006a:
            android.support.v7.widget.LinearLayoutManager$a r6 = r0.f4562s
            int r9 = m4418c(r3)
            r6.mo4760a(r3, r9)
            goto L_0x024a
        L_0x0075:
            android.support.v7.widget.LinearLayoutManager$a r3 = r0.f4562s
            r3.mo4759a()
            android.support.v7.widget.LinearLayoutManager$a r3 = r0.f4562s
            boolean r6 = r0.f4555l
            boolean r9 = r0.f4556m
            r6 = r6 ^ r9
            r3.f4570d = r6
            android.support.v7.widget.LinearLayoutManager$a r3 = r0.f4562s
            boolean r6 = r2.f4798g
            if (r6 != 0) goto L_0x018b
            int r6 = r0.f4558o
            if (r6 != r4) goto L_0x008f
            goto L_0x018b
        L_0x008f:
            int r6 = r0.f4558o
            if (r6 < 0) goto L_0x0187
            int r6 = r0.f4558o
            int r9 = r18.mo5115a()
            if (r6 < r9) goto L_0x009d
            goto L_0x0187
        L_0x009d:
            int r6 = r0.f4558o
            r3.f4568b = r6
            android.support.v7.widget.LinearLayoutManager$SavedState r6 = r0.f4561r
            if (r6 == 0) goto L_0x00d5
            android.support.v7.widget.LinearLayoutManager$SavedState r6 = r0.f4561r
            boolean r6 = r6.mo4753a()
            if (r6 == 0) goto L_0x00d5
            android.support.v7.widget.LinearLayoutManager$SavedState r6 = r0.f4561r
            boolean r6 = r6.f4566c
            r3.f4570d = r6
            boolean r6 = r3.f4570d
            if (r6 == 0) goto L_0x00c5
            android.support.v7.widget.ak r6 = r0.f4553j
            int r6 = r6.mo5520c()
            android.support.v7.widget.LinearLayoutManager$SavedState r9 = r0.f4561r
            int r9 = r9.f4565b
            int r6 = r6 - r9
            r3.f4569c = r6
            goto L_0x00d2
        L_0x00c5:
            android.support.v7.widget.ak r6 = r0.f4553j
            int r6 = r6.mo5518b()
            android.support.v7.widget.LinearLayoutManager$SavedState r9 = r0.f4561r
            int r9 = r9.f4565b
            int r6 = r6 + r9
            r3.f4569c = r6
        L_0x00d2:
            r6 = 1
            goto L_0x018c
        L_0x00d5:
            int r6 = r0.f4559p
            if (r6 != r7) goto L_0x0165
            int r6 = r0.f4558o
            android.view.View r6 = r0.mo4736c(r6)
            if (r6 == 0) goto L_0x0142
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5525e(r6)
            android.support.v7.widget.ak r10 = r0.f4553j
            int r10 = r10.mo5524e()
            if (r9 <= r10) goto L_0x00f3
            r3.mo4761b()
            goto L_0x00d2
        L_0x00f3:
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5516a(r6)
            android.support.v7.widget.ak r10 = r0.f4553j
            int r10 = r10.mo5518b()
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x010d
            android.support.v7.widget.ak r6 = r0.f4553j
            int r6 = r6.mo5518b()
            r3.f4569c = r6
            r3.f4570d = r5
            goto L_0x00d2
        L_0x010d:
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5520c()
            android.support.v7.widget.ak r10 = r0.f4553j
            int r10 = r10.mo5519b(r6)
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x0127
            android.support.v7.widget.ak r6 = r0.f4553j
            int r6 = r6.mo5520c()
            r3.f4569c = r6
            r3.f4570d = r8
            goto L_0x00d2
        L_0x0127:
            boolean r9 = r3.f4570d
            if (r9 == 0) goto L_0x0139
            android.support.v7.widget.ak r9 = r0.f4553j
            int r6 = r9.mo5519b(r6)
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5515a()
            int r6 = r6 + r9
            goto L_0x013f
        L_0x0139:
            android.support.v7.widget.ak r9 = r0.f4553j
            int r6 = r9.mo5516a(r6)
        L_0x013f:
            r3.f4569c = r6
            goto L_0x00d2
        L_0x0142:
            int r6 = r16.mo5062s()
            if (r6 <= 0) goto L_0x0160
            android.view.View r6 = r0.mo5050g(r5)
            int r6 = m4418c(r6)
            int r9 = r0.f4558o
            if (r9 >= r6) goto L_0x0156
            r6 = 1
            goto L_0x0157
        L_0x0156:
            r6 = 0
        L_0x0157:
            boolean r9 = r0.f4555l
            if (r6 != r9) goto L_0x015d
            r6 = 1
            goto L_0x015e
        L_0x015d:
            r6 = 0
        L_0x015e:
            r3.f4570d = r6
        L_0x0160:
            r3.mo4761b()
            goto L_0x00d2
        L_0x0165:
            boolean r6 = r0.f4555l
            r3.f4570d = r6
            boolean r6 = r0.f4555l
            if (r6 == 0) goto L_0x017a
            android.support.v7.widget.ak r6 = r0.f4553j
            int r6 = r6.mo5520c()
            int r9 = r0.f4559p
            int r6 = r6 - r9
            r3.f4569c = r6
            goto L_0x00d2
        L_0x017a:
            android.support.v7.widget.ak r6 = r0.f4553j
            int r6 = r6.mo5518b()
            int r9 = r0.f4559p
            int r6 = r6 + r9
            r3.f4569c = r6
            goto L_0x00d2
        L_0x0187:
            r0.f4558o = r4
            r0.f4559p = r7
        L_0x018b:
            r6 = 0
        L_0x018c:
            if (r6 != 0) goto L_0x0246
            int r6 = r16.mo5062s()
            if (r6 == 0) goto L_0x0233
            android.view.View r6 = r16.mo5069z()
            if (r6 == 0) goto L_0x01c5
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            android.support.v7.widget.RecyclerView$LayoutParams r9 = (android.support.p043v7.widget.RecyclerView.LayoutParams) r9
            boolean r10 = r9.bu_()
            if (r10 != 0) goto L_0x01b8
            int r10 = r9.bw_()
            if (r10 < 0) goto L_0x01b8
            int r9 = r9.bw_()
            int r10 = r18.mo5115a()
            if (r9 >= r10) goto L_0x01b8
            r9 = 1
            goto L_0x01b9
        L_0x01b8:
            r9 = 0
        L_0x01b9:
            if (r9 == 0) goto L_0x01c5
            int r9 = m4418c(r6)
            r3.mo4760a(r6, r9)
        L_0x01c2:
            r6 = 1
            goto L_0x0234
        L_0x01c5:
            boolean r6 = r0.f4550b
            boolean r9 = r0.f4556m
            if (r6 != r9) goto L_0x0233
            boolean r6 = r3.f4570d
            if (r6 == 0) goto L_0x01dd
            boolean r6 = r0.f4555l
            if (r6 == 0) goto L_0x01d8
            android.view.View r6 = r16.m4157d(r17, r18)
            goto L_0x01ea
        L_0x01d8:
            android.view.View r6 = r16.m4158e(r17, r18)
            goto L_0x01ea
        L_0x01dd:
            boolean r6 = r0.f4555l
            if (r6 == 0) goto L_0x01e6
            android.view.View r6 = r16.m4158e(r17, r18)
            goto L_0x01ea
        L_0x01e6:
            android.view.View r6 = r16.m4157d(r17, r18)
        L_0x01ea:
            if (r6 == 0) goto L_0x0233
            int r9 = m4418c(r6)
            r3.mo4762b(r6, r9)
            boolean r9 = r2.f4798g
            if (r9 != 0) goto L_0x01c2
            boolean r9 = r16.bs_()
            if (r9 == 0) goto L_0x01c2
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5516a(r6)
            android.support.v7.widget.ak r10 = r0.f4553j
            int r10 = r10.mo5520c()
            if (r9 >= r10) goto L_0x021c
            android.support.v7.widget.ak r9 = r0.f4553j
            int r6 = r9.mo5519b(r6)
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5518b()
            if (r6 >= r9) goto L_0x021a
            goto L_0x021c
        L_0x021a:
            r6 = 0
            goto L_0x021d
        L_0x021c:
            r6 = 1
        L_0x021d:
            if (r6 == 0) goto L_0x01c2
            boolean r6 = r3.f4570d
            if (r6 == 0) goto L_0x022a
            android.support.v7.widget.ak r6 = r0.f4553j
            int r6 = r6.mo5520c()
            goto L_0x0230
        L_0x022a:
            android.support.v7.widget.ak r6 = r0.f4553j
            int r6 = r6.mo5518b()
        L_0x0230:
            r3.f4569c = r6
            goto L_0x01c2
        L_0x0233:
            r6 = 0
        L_0x0234:
            if (r6 != 0) goto L_0x0246
            r3.mo4761b()
            boolean r6 = r0.f4556m
            if (r6 == 0) goto L_0x0243
            int r6 = r18.mo5115a()
            int r6 = r6 - r8
            goto L_0x0244
        L_0x0243:
            r6 = 0
        L_0x0244:
            r3.f4568b = r6
        L_0x0246:
            android.support.v7.widget.LinearLayoutManager$a r3 = r0.f4562s
            r3.f4571e = r8
        L_0x024a:
            int r3 = r0.m4164h(r2)
            android.support.v7.widget.LinearLayoutManager$c r6 = r0.f4549a
            int r6 = r6.f4585j
            if (r6 < 0) goto L_0x0257
            r6 = r3
            r3 = 0
            goto L_0x0258
        L_0x0257:
            r6 = 0
        L_0x0258:
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5518b()
            int r3 = r3 + r9
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5526f()
            int r6 = r6 + r9
            boolean r9 = r2.f4798g
            if (r9 == 0) goto L_0x02a4
            int r9 = r0.f4558o
            if (r9 == r4) goto L_0x02a4
            int r9 = r0.f4559p
            if (r9 == r7) goto L_0x02a4
            int r7 = r0.f4558o
            android.view.View r7 = r0.mo4736c(r7)
            if (r7 == 0) goto L_0x02a4
            boolean r9 = r0.f4555l
            if (r9 == 0) goto L_0x028f
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5520c()
            android.support.v7.widget.ak r10 = r0.f4553j
            int r7 = r10.mo5519b(r7)
            int r9 = r9 - r7
            int r7 = r0.f4559p
            int r9 = r9 - r7
            goto L_0x029f
        L_0x028f:
            android.support.v7.widget.ak r9 = r0.f4553j
            int r7 = r9.mo5516a(r7)
            android.support.v7.widget.ak r9 = r0.f4553j
            int r9 = r9.mo5518b()
            int r7 = r7 - r9
            int r9 = r0.f4559p
            int r9 = r9 - r7
        L_0x029f:
            if (r9 <= 0) goto L_0x02a3
            int r3 = r3 + r9
            goto L_0x02a4
        L_0x02a3:
            int r6 = r6 - r9
        L_0x02a4:
            android.support.v7.widget.LinearLayoutManager$a r7 = r0.f4562s
            boolean r7 = r7.f4570d
            if (r7 == 0) goto L_0x02b2
            boolean r7 = r0.f4555l
            if (r7 == 0) goto L_0x02b0
        L_0x02ae:
            r7 = 1
            goto L_0x02b7
        L_0x02b0:
            r7 = -1
            goto L_0x02b7
        L_0x02b2:
            boolean r7 = r0.f4555l
            if (r7 == 0) goto L_0x02ae
            goto L_0x02b0
        L_0x02b7:
            android.support.v7.widget.LinearLayoutManager$a r9 = r0.f4562s
            r0.mo4674a(r1, r2, r9, r7)
            r16.mo5020a(r17)
            android.support.v7.widget.LinearLayoutManager$c r7 = r0.f4549a
            boolean r9 = r16.m4142H()
            r7.f4587l = r9
            android.support.v7.widget.LinearLayoutManager$c r7 = r0.f4549a
            boolean r9 = r2.f4798g
            r7.f4584i = r9
            android.support.v7.widget.LinearLayoutManager$a r7 = r0.f4562s
            boolean r7 = r7.f4570d
            if (r7 == 0) goto L_0x032c
            android.support.v7.widget.LinearLayoutManager$a r7 = r0.f4562s
            r0.m4155b(r7)
            android.support.v7.widget.LinearLayoutManager$c r7 = r0.f4549a
            r7.f4583h = r3
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r0.m4146a(r1, r3, r2, r5)
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            int r3 = r3.f4577b
            android.support.v7.widget.LinearLayoutManager$c r7 = r0.f4549a
            int r7 = r7.f4579d
            android.support.v7.widget.LinearLayoutManager$c r9 = r0.f4549a
            int r9 = r9.f4578c
            if (r9 <= 0) goto L_0x02f4
            android.support.v7.widget.LinearLayoutManager$c r9 = r0.f4549a
            int r9 = r9.f4578c
            int r6 = r6 + r9
        L_0x02f4:
            android.support.v7.widget.LinearLayoutManager$a r9 = r0.f4562s
            r0.m4150a(r9)
            android.support.v7.widget.LinearLayoutManager$c r9 = r0.f4549a
            r9.f4583h = r6
            android.support.v7.widget.LinearLayoutManager$c r6 = r0.f4549a
            int r9 = r6.f4579d
            android.support.v7.widget.LinearLayoutManager$c r10 = r0.f4549a
            int r10 = r10.f4580e
            int r9 = r9 + r10
            r6.f4579d = r9
            android.support.v7.widget.LinearLayoutManager$c r6 = r0.f4549a
            r0.m4146a(r1, r6, r2, r5)
            android.support.v7.widget.LinearLayoutManager$c r6 = r0.f4549a
            int r6 = r6.f4577b
            android.support.v7.widget.LinearLayoutManager$c r9 = r0.f4549a
            int r9 = r9.f4578c
            if (r9 <= 0) goto L_0x0384
            android.support.v7.widget.LinearLayoutManager$c r9 = r0.f4549a
            int r9 = r9.f4578c
            r0.m4161f(r7, r3)
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r3.f4583h = r9
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r0.m4146a(r1, r3, r2, r5)
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            int r3 = r3.f4577b
            goto L_0x0384
        L_0x032c:
            android.support.v7.widget.LinearLayoutManager$a r7 = r0.f4562s
            r0.m4150a(r7)
            android.support.v7.widget.LinearLayoutManager$c r7 = r0.f4549a
            r7.f4583h = r6
            android.support.v7.widget.LinearLayoutManager$c r6 = r0.f4549a
            r0.m4146a(r1, r6, r2, r5)
            android.support.v7.widget.LinearLayoutManager$c r6 = r0.f4549a
            int r6 = r6.f4577b
            android.support.v7.widget.LinearLayoutManager$c r7 = r0.f4549a
            int r7 = r7.f4579d
            android.support.v7.widget.LinearLayoutManager$c r9 = r0.f4549a
            int r9 = r9.f4578c
            if (r9 <= 0) goto L_0x034d
            android.support.v7.widget.LinearLayoutManager$c r9 = r0.f4549a
            int r9 = r9.f4578c
            int r3 = r3 + r9
        L_0x034d:
            android.support.v7.widget.LinearLayoutManager$a r9 = r0.f4562s
            r0.m4155b(r9)
            android.support.v7.widget.LinearLayoutManager$c r9 = r0.f4549a
            r9.f4583h = r3
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            int r9 = r3.f4579d
            android.support.v7.widget.LinearLayoutManager$c r10 = r0.f4549a
            int r10 = r10.f4580e
            int r9 = r9 + r10
            r3.f4579d = r9
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r0.m4146a(r1, r3, r2, r5)
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            int r3 = r3.f4577b
            android.support.v7.widget.LinearLayoutManager$c r9 = r0.f4549a
            int r9 = r9.f4578c
            if (r9 <= 0) goto L_0x0384
            android.support.v7.widget.LinearLayoutManager$c r9 = r0.f4549a
            int r9 = r9.f4578c
            r0.m4159e(r7, r6)
            android.support.v7.widget.LinearLayoutManager$c r6 = r0.f4549a
            r6.f4583h = r9
            android.support.v7.widget.LinearLayoutManager$c r6 = r0.f4549a
            r0.m4146a(r1, r6, r2, r5)
            android.support.v7.widget.LinearLayoutManager$c r6 = r0.f4549a
            int r6 = r6.f4577b
        L_0x0384:
            int r7 = r16.mo5062s()
            if (r7 <= 0) goto L_0x03aa
            boolean r7 = r0.f4555l
            boolean r9 = r0.f4556m
            r7 = r7 ^ r9
            if (r7 == 0) goto L_0x039e
            int r7 = r0.m4145a(r6, r1, r2, r8)
            int r3 = r3 + r7
            int r6 = r6 + r7
            int r7 = r0.m4153b(r3, r1, r2, r5)
            int r3 = r3 + r7
            int r6 = r6 + r7
            goto L_0x03aa
        L_0x039e:
            int r7 = r0.m4153b(r3, r1, r2, r8)
            int r3 = r3 + r7
            int r6 = r6 + r7
            int r7 = r0.m4145a(r6, r1, r2, r5)
            int r3 = r3 + r7
            int r6 = r6 + r7
        L_0x03aa:
            boolean r7 = r2.f4802k
            if (r7 == 0) goto L_0x044f
            int r7 = r16.mo5062s()
            if (r7 == 0) goto L_0x044f
            boolean r7 = r2.f4798g
            if (r7 != 0) goto L_0x044f
            boolean r7 = r16.bs_()
            if (r7 != 0) goto L_0x03c0
            goto L_0x044f
        L_0x03c0:
            java.util.List<android.support.v7.widget.RecyclerView$v> r7 = r1.f4770d
            int r9 = r7.size()
            android.view.View r10 = r0.mo5050g(r5)
            int r10 = m4418c(r10)
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x03d1:
            if (r11 >= r9) goto L_0x0408
            java.lang.Object r14 = r7.get(r11)
            android.support.v7.widget.RecyclerView$v r14 = (android.support.p043v7.widget.RecyclerView.C1352v) r14
            boolean r15 = r14.isRemoved()
            if (r15 != 0) goto L_0x0404
            int r15 = r14.getLayoutPosition()
            if (r15 >= r10) goto L_0x03e7
            r15 = 1
            goto L_0x03e8
        L_0x03e7:
            r15 = 0
        L_0x03e8:
            boolean r8 = r0.f4555l
            if (r15 == r8) goto L_0x03ee
            r8 = -1
            goto L_0x03ef
        L_0x03ee:
            r8 = 1
        L_0x03ef:
            if (r8 != r4) goto L_0x03fb
            android.support.v7.widget.ak r8 = r0.f4553j
            android.view.View r14 = r14.itemView
            int r8 = r8.mo5525e(r14)
            int r12 = r12 + r8
            goto L_0x0404
        L_0x03fb:
            android.support.v7.widget.ak r8 = r0.f4553j
            android.view.View r14 = r14.itemView
            int r8 = r8.mo5525e(r14)
            int r13 = r13 + r8
        L_0x0404:
            int r11 = r11 + 1
            r8 = 1
            goto L_0x03d1
        L_0x0408:
            android.support.v7.widget.LinearLayoutManager$c r4 = r0.f4549a
            r4.f4586k = r7
            if (r12 <= 0) goto L_0x042b
            android.view.View r4 = r16.m4143I()
            int r4 = m4418c(r4)
            r0.m4161f(r4, r3)
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r3.f4583h = r12
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r3.f4578c = r5
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r3.mo4766a()
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r0.m4146a(r1, r3, r2, r5)
        L_0x042b:
            if (r13 <= 0) goto L_0x044a
            android.view.View r3 = r16.m4144J()
            int r3 = m4418c(r3)
            r0.m4159e(r3, r6)
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r3.f4583h = r13
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r3.f4578c = r5
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r3.mo4766a()
            android.support.v7.widget.LinearLayoutManager$c r3 = r0.f4549a
            r0.m4146a(r1, r3, r2, r5)
        L_0x044a:
            android.support.v7.widget.LinearLayoutManager$c r1 = r0.f4549a
            r3 = 0
            r1.f4586k = r3
        L_0x044f:
            boolean r1 = r2.f4798g
            if (r1 != 0) goto L_0x045c
            android.support.v7.widget.ak r1 = r0.f4553j
            int r2 = r1.mo5524e()
            r1.f5120b = r2
            goto L_0x0461
        L_0x045c:
            android.support.v7.widget.LinearLayoutManager$a r1 = r0.f4562s
            r1.mo4759a()
        L_0x0461:
            boolean r1 = r0.f4556m
            r0.f4550b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.LinearLayoutManager.mo4689c(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s):void");
    }

    /* renamed from: a */
    public int mo4665a(int i, C1343o oVar, C1349s sVar) {
        if (this.f4552i == 1) {
            return 0;
        }
        return m4156c(i, oVar, sVar);
    }

    /* renamed from: b */
    public int mo4685b(int i, C1343o oVar, C1349s sVar) {
        if (this.f4552i == 0) {
            return 0;
        }
        return m4156c(i, oVar, sVar);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f4552i = 1;
        this.f4557n = true;
        this.f4558o = -1;
        this.f4559p = DynamicTabYellowPointVersion.DEFAULT;
        this.f4562s = new C1304a();
        this.f4551c = new C1305b();
        this.f4563t = 2;
        mo4731b(i);
        mo4732b(z);
    }

    /* renamed from: c */
    private int m4156c(int i, C1343o oVar, C1349s sVar) {
        int i2;
        if (mo5062s() == 0 || i == 0) {
            return 0;
        }
        this.f4549a.f4576a = true;
        mo4748h();
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m4149a(i2, abs, true, sVar);
        int a = this.f4549a.f4582g + m4146a(oVar, this.f4549a, sVar, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f4553j.mo5517a(-i);
        this.f4549a.f4585j = i;
        return i;
    }

    /* renamed from: a */
    private void m4151a(C1343o oVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo5018a(i3, oVar);
                }
                return;
            }
            while (i > i2) {
                mo5018a(i, oVar);
                i--;
            }
        }
    }

    /* renamed from: a */
    private int m4145a(int i, C1343o oVar, C1349s sVar, boolean z) {
        int c = this.f4553j.mo5520c() - i;
        if (c <= 0) {
            return 0;
        }
        int i2 = -m4156c(-c, oVar, sVar);
        int i3 = i + i2;
        if (z) {
            int c2 = this.f4553j.mo5520c() - i3;
            if (c2 > 0) {
                this.f4553j.mo5517a(c2);
                return c2 + i2;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private int m4153b(int i, C1343o oVar, C1349s sVar, boolean z) {
        int b = i - this.f4553j.mo5518b();
        if (b <= 0) {
            return 0;
        }
        int i2 = -m4156c(b, oVar, sVar);
        int i3 = i + i2;
        if (z) {
            int b2 = i3 - this.f4553j.mo5518b();
            if (b2 > 0) {
                this.f4553j.mo5517a(-b2);
                return i2 - b2;
            }
        }
        return i2;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4552i = 1;
        this.f4557n = true;
        this.f4558o = -1;
        this.f4559p = DynamicTabYellowPointVersion.DEFAULT;
        this.f4562s = new C1304a();
        this.f4551c = new C1305b();
        this.f4563t = 2;
        C1336b a = m4407a(context, attributeSet, i, i2);
        mo4731b(a.f4757a);
        mo4732b(a.f4759c);
        mo4683a(a.f4760d);
    }

    /* renamed from: a */
    private int m4146a(C1343o oVar, C1306c cVar, C1349s sVar, boolean z) {
        int i = cVar.f4578c;
        if (cVar.f4582g != Integer.MIN_VALUE) {
            if (cVar.f4578c < 0) {
                cVar.f4582g += cVar.f4578c;
            }
            m4152a(oVar, cVar);
        }
        int i2 = cVar.f4578c + cVar.f4583h;
        C1305b bVar = this.f4551c;
        while (true) {
            if ((!cVar.f4587l && i2 <= 0) || !cVar.mo4767a(sVar)) {
                break;
            }
            bVar.mo4764a();
            mo4675a(oVar, sVar, cVar, bVar);
            if (bVar.f4573b) {
                break;
            }
            cVar.f4577b += bVar.f4572a * cVar.f4581f;
            if (!bVar.f4574c || this.f4549a.f4586k != null || !sVar.f4798g) {
                cVar.f4578c -= bVar.f4572a;
                i2 -= bVar.f4572a;
            }
            if (cVar.f4582g != Integer.MIN_VALUE) {
                cVar.f4582g += bVar.f4572a;
                if (cVar.f4578c < 0) {
                    cVar.f4582g += cVar.f4578c;
                }
                m4152a(oVar, cVar);
            }
            if (z && bVar.f4575d) {
                break;
            }
        }
        return i - cVar.f4578c;
    }

    /* renamed from: a */
    private View m4147a(int i, int i2, boolean z, boolean z2) {
        int i3;
        mo4748h();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.f4552i == 0) {
            return this.f4751w.mo5707a(i, i2, i3, i4);
        }
        return this.f4752x.mo5707a(i, i2, i3, i4);
    }

    /* renamed from: a */
    private void m4149a(int i, int i2, boolean z, C1349s sVar) {
        int i3;
        this.f4549a.f4587l = m4142H();
        this.f4549a.f4583h = m4164h(sVar);
        this.f4549a.f4581f = i;
        int i4 = -1;
        if (i == 1) {
            this.f4549a.f4583h += this.f4553j.mo5526f();
            View J = m4144J();
            C1306c cVar = this.f4549a;
            if (!this.f4555l) {
                i4 = 1;
            }
            cVar.f4580e = i4;
            this.f4549a.f4579d = m4418c(J) + this.f4549a.f4580e;
            this.f4549a.f4577b = this.f4553j.mo5519b(J);
            i3 = this.f4553j.mo5519b(J) - this.f4553j.mo5520c();
        } else {
            View I = m4143I();
            this.f4549a.f4583h += this.f4553j.mo5518b();
            C1306c cVar2 = this.f4549a;
            if (this.f4555l) {
                i4 = 1;
            }
            cVar2.f4580e = i4;
            this.f4549a.f4579d = m4418c(I) + this.f4549a.f4580e;
            this.f4549a.f4577b = this.f4553j.mo5516a(I);
            i3 = (-this.f4553j.mo5516a(I)) + this.f4553j.mo5518b();
        }
        this.f4549a.f4578c = i2;
        if (z) {
            this.f4549a.f4578c -= i3;
        }
        this.f4549a.f4582g = i3;
    }
}
