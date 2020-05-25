package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.view.p041a.C1008c;
import android.support.p030v4.view.p041a.C1008c.C1011c;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1332i.C1335a;
import android.support.p043v7.widget.RecyclerView.C1332i.C1336b;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1346r.C1348b;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: android.support.v7.widget.StaggeredGridLayoutManager */
public class StaggeredGridLayoutManager extends C1332i implements C1348b {

    /* renamed from: K */
    private boolean f4892K = false;

    /* renamed from: L */
    private boolean f4893L = true;

    /* renamed from: M */
    private int[] f4894M;

    /* renamed from: N */
    private final Runnable f4895N = new Runnable() {
        public final void run() {
            StaggeredGridLayoutManager.this.mo5244g();
        }
    };

    /* renamed from: a */
    public int f4896a = -1;

    /* renamed from: b */
    C1374b[] f4897b;

    /* renamed from: c */
    C1422ak f4898c;

    /* renamed from: d */
    C1422ak f4899d;

    /* renamed from: e */
    public int f4900e;

    /* renamed from: f */
    public boolean f4901f;

    /* renamed from: g */
    boolean f4902g;

    /* renamed from: h */
    int f4903h = -1;

    /* renamed from: i */
    int f4904i = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: j */
    LazySpanLookup f4905j = new LazySpanLookup();

    /* renamed from: k */
    public int f4906k = 2;

    /* renamed from: l */
    private int f4907l;

    /* renamed from: m */
    private final C1414ae f4908m;

    /* renamed from: n */
    private BitSet f4909n;

    /* renamed from: o */
    private boolean f4910o;

    /* renamed from: p */
    private boolean f4911p;

    /* renamed from: q */
    private SavedState f4912q;

    /* renamed from: r */
    private int f4913r;

    /* renamed from: s */
    private final Rect f4914s = new Rect();

    /* renamed from: t */
    private final C1373a f4915t = new C1373a();

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams */
    public static class LayoutParams extends android.support.p043v7.widget.RecyclerView.LayoutParams {

        /* renamed from: a */
        C1374b f4917a;

        /* renamed from: b */
        public boolean f4918b;

        /* renamed from: d */
        public final int mo5247d() {
            if (this.f4917a == null) {
                return -1;
            }
            return this.f4917a.f4946e;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup */
    static class LazySpanLookup {

        /* renamed from: a */
        int[] f4919a;

        /* renamed from: b */
        List<FullSpanItem> f4920b;

        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem */
        static class FullSpanItem implements Parcelable {
            public static final Creator<FullSpanItem> CREATOR = new Creator<FullSpanItem>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new FullSpanItem[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }
            };

            /* renamed from: a */
            int f4921a;

            /* renamed from: b */
            int f4922b;

            /* renamed from: c */
            int[] f4923c;

            /* renamed from: d */
            boolean f4924d;

            FullSpanItem() {
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("FullSpanItem{mPosition=");
                sb.append(this.f4921a);
                sb.append(", mGapDir=");
                sb.append(this.f4922b);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.f4924d);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.f4923c));
                sb.append('}');
                return sb.toString();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final int mo5258a(int i) {
                if (this.f4923c == null) {
                    return 0;
                }
                return this.f4923c[i];
            }

            FullSpanItem(Parcel parcel) {
                this.f4921a = parcel.readInt();
                this.f4922b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.f4924d = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f4923c = new int[readInt];
                    parcel.readIntArray(this.f4923c);
                }
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4921a);
                parcel.writeInt(this.f4922b);
                parcel.writeInt(this.f4924d ? 1 : 0);
                if (this.f4923c == null || this.f4923c.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(this.f4923c.length);
                parcel.writeIntArray(this.f4923c);
            }
        }

        LazySpanLookup() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5250a() {
            if (this.f4919a != null) {
                Arrays.fill(this.f4919a, -1);
            }
            this.f4920b = null;
        }

        /* renamed from: e */
        private int m4732e(int i) {
            int length = this.f4919a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo5256c(int i) {
            if (this.f4919a == null || i >= this.f4919a.length) {
                return -1;
            }
            return this.f4919a[i];
        }

        /* renamed from: f */
        private void m4733f(int i) {
            if (this.f4919a == null) {
                this.f4919a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f4919a, -1);
                return;
            }
            if (i >= this.f4919a.length) {
                int[] iArr = this.f4919a;
                this.f4919a = new int[m4732e(i)];
                System.arraycopy(iArr, 0, this.f4919a, 0, iArr.length);
                Arrays.fill(this.f4919a, iArr.length, this.f4919a.length, -1);
            }
        }

        /* renamed from: g */
        private int m4734g(int i) {
            if (this.f4920b == null) {
                return -1;
            }
            FullSpanItem d = mo5257d(i);
            if (d != null) {
                this.f4920b.remove(d);
            }
            int size = this.f4920b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((FullSpanItem) this.f4920b.get(i2)).f4921a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f4920b.get(i2);
            this.f4920b.remove(i2);
            return fullSpanItem.f4921a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo5248a(int i) {
            if (this.f4920b != null) {
                for (int size = this.f4920b.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f4920b.get(size)).f4921a >= i) {
                        this.f4920b.remove(size);
                    }
                }
            }
            return mo5254b(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo5254b(int i) {
            if (this.f4919a == null || i >= this.f4919a.length) {
                return -1;
            }
            int g = m4734g(i);
            if (g == -1) {
                int[] iArr = this.f4919a;
                Arrays.fill(iArr, i, iArr.length, -1);
                return this.f4919a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f4919a, i, i2, -1);
            return i2;
        }

        /* renamed from: d */
        public final FullSpanItem mo5257d(int i) {
            if (this.f4920b == null) {
                return null;
            }
            for (int size = this.f4920b.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f4920b.get(size);
                if (fullSpanItem.f4921a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo5253a(FullSpanItem fullSpanItem) {
            if (this.f4920b == null) {
                this.f4920b = new ArrayList();
            }
            int size = this.f4920b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f4920b.get(i);
                if (fullSpanItem2.f4921a == fullSpanItem.f4921a) {
                    this.f4920b.remove(i);
                }
                if (fullSpanItem2.f4921a >= fullSpanItem.f4921a) {
                    this.f4920b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f4920b.add(fullSpanItem);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5252a(int i, C1374b bVar) {
            m4733f(i);
            this.f4919a[i] = bVar.f4946e;
        }

        /* renamed from: c */
        private void m4730c(int i, int i2) {
            if (this.f4920b != null) {
                int i3 = i + i2;
                for (int size = this.f4920b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f4920b.get(size);
                    if (fullSpanItem.f4921a >= i) {
                        if (fullSpanItem.f4921a < i3) {
                            this.f4920b.remove(size);
                        } else {
                            fullSpanItem.f4921a -= i2;
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private void m4731d(int i, int i2) {
            if (this.f4920b != null) {
                for (int size = this.f4920b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f4920b.get(size);
                    if (fullSpanItem.f4921a >= i) {
                        fullSpanItem.f4921a += i2;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5255b(int i, int i2) {
            if (this.f4919a != null && i < this.f4919a.length) {
                int i3 = i + i2;
                m4733f(i3);
                int[] iArr = this.f4919a;
                System.arraycopy(iArr, i, iArr, i3, (this.f4919a.length - i) - i2);
                Arrays.fill(this.f4919a, i, i3, -1);
                m4731d(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5251a(int i, int i2) {
            if (this.f4919a != null && i < this.f4919a.length) {
                int i3 = i + i2;
                m4733f(i3);
                int[] iArr = this.f4919a;
                int[] iArr2 = this.f4919a;
                System.arraycopy(iArr, i3, iArr2, i, (iArr2.length - i) - i2);
                Arrays.fill(this.f4919a, this.f4919a.length - i2, this.f4919a.length, -1);
                m4730c(i, i2);
            }
        }

        /* renamed from: a */
        public final FullSpanItem mo5249a(int i, int i2, int i3, boolean z) {
            if (this.f4920b == null) {
                return null;
            }
            int size = this.f4920b.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f4920b.get(i4);
                if (fullSpanItem.f4921a >= i2) {
                    return null;
                }
                if (fullSpanItem.f4921a >= i && (i3 == 0 || fullSpanItem.f4922b == i3 || fullSpanItem.f4924d)) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$SavedState */
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
        int f4925a;

        /* renamed from: b */
        int f4926b;

        /* renamed from: c */
        int f4927c;

        /* renamed from: d */
        int[] f4928d;

        /* renamed from: e */
        int f4929e;

        /* renamed from: f */
        int[] f4930f;

        /* renamed from: g */
        List<FullSpanItem> f4931g;

        /* renamed from: h */
        boolean f4932h;

        /* renamed from: i */
        boolean f4933i;

        /* renamed from: j */
        boolean f4934j;

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5264a() {
            this.f4928d = null;
            this.f4927c = 0;
            this.f4929e = 0;
            this.f4930f = null;
            this.f4931g = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5265b() {
            this.f4928d = null;
            this.f4927c = 0;
            this.f4925a = -1;
            this.f4926b = -1;
        }

        public SavedState(SavedState savedState) {
            this.f4927c = savedState.f4927c;
            this.f4925a = savedState.f4925a;
            this.f4926b = savedState.f4926b;
            this.f4928d = savedState.f4928d;
            this.f4929e = savedState.f4929e;
            this.f4930f = savedState.f4930f;
            this.f4932h = savedState.f4932h;
            this.f4933i = savedState.f4933i;
            this.f4934j = savedState.f4934j;
            this.f4931g = savedState.f4931g;
        }

        SavedState(Parcel parcel) {
            boolean z;
            boolean z2;
            this.f4925a = parcel.readInt();
            this.f4926b = parcel.readInt();
            this.f4927c = parcel.readInt();
            if (this.f4927c > 0) {
                this.f4928d = new int[this.f4927c];
                parcel.readIntArray(this.f4928d);
            }
            this.f4929e = parcel.readInt();
            if (this.f4929e > 0) {
                this.f4930f = new int[this.f4929e];
                parcel.readIntArray(this.f4930f);
            }
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f4932h = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f4933i = z2;
            if (parcel.readInt() == 1) {
                z3 = true;
            }
            this.f4934j = z3;
            this.f4931g = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4925a);
            parcel.writeInt(this.f4926b);
            parcel.writeInt(this.f4927c);
            if (this.f4927c > 0) {
                parcel.writeIntArray(this.f4928d);
            }
            parcel.writeInt(this.f4929e);
            if (this.f4929e > 0) {
                parcel.writeIntArray(this.f4930f);
            }
            parcel.writeInt(this.f4932h ? 1 : 0);
            parcel.writeInt(this.f4933i ? 1 : 0);
            parcel.writeInt(this.f4934j ? 1 : 0);
            parcel.writeList(this.f4931g);
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$a */
    class C1373a {

        /* renamed from: a */
        int f4935a;

        /* renamed from: b */
        int f4936b;

        /* renamed from: c */
        boolean f4937c;

        /* renamed from: d */
        boolean f4938d;

        /* renamed from: e */
        boolean f4939e;

        /* renamed from: f */
        int[] f4940f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5270a() {
            this.f4935a = -1;
            this.f4936b = DynamicTabYellowPointVersion.DEFAULT;
            this.f4937c = false;
            this.f4938d = false;
            this.f4939e = false;
            if (this.f4940f != null) {
                Arrays.fill(this.f4940f, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5273b() {
            int i;
            if (this.f4937c) {
                i = StaggeredGridLayoutManager.this.f4898c.mo5520c();
            } else {
                i = StaggeredGridLayoutManager.this.f4898c.mo5518b();
            }
            this.f4936b = i;
        }

        C1373a() {
            mo5270a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5271a(int i) {
            if (this.f4937c) {
                this.f4936b = StaggeredGridLayoutManager.this.f4898c.mo5520c() - i;
            } else {
                this.f4936b = StaggeredGridLayoutManager.this.f4898c.mo5518b() + i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5272a(C1374b[] bVarArr) {
            int length = bVarArr.length;
            if (this.f4940f == null || this.f4940f.length < length) {
                this.f4940f = new int[StaggeredGridLayoutManager.this.f4897b.length];
            }
            for (int i = 0; i < length; i++) {
                this.f4940f[i] = bVarArr[i].mo5275a((int) DynamicTabYellowPointVersion.DEFAULT);
            }
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$b */
    class C1374b {

        /* renamed from: a */
        ArrayList<View> f4942a = new ArrayList<>();

        /* renamed from: b */
        int f4943b = DynamicTabYellowPointVersion.DEFAULT;

        /* renamed from: c */
        int f4944c = DynamicTabYellowPointVersion.DEFAULT;

        /* renamed from: d */
        public int f4945d = 0;

        /* renamed from: e */
        final int f4946e;

        /* renamed from: j */
        private void m4757j() {
            this.f4943b = DynamicTabYellowPointVersion.DEFAULT;
            this.f4944c = DynamicTabYellowPointVersion.DEFAULT;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo5274a() {
            if (this.f4943b != Integer.MIN_VALUE) {
                return this.f4943b;
            }
            m4755h();
            return this.f4943b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5283c() {
            this.f4942a.clear();
            m4757j();
            this.f4945d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo5280b() {
            if (this.f4944c != Integer.MIN_VALUE) {
                return this.f4944c;
            }
            m4756i();
            return this.f4944c;
        }

        /* renamed from: f */
        public final int mo5288f() {
            if (StaggeredGridLayoutManager.this.f4901f) {
                return m4753b(this.f4942a.size() - 1, -1, true);
            }
            return m4753b(0, this.f4942a.size(), true);
        }

        /* renamed from: g */
        public final int mo5289g() {
            if (StaggeredGridLayoutManager.this.f4901f) {
                return m4753b(0, this.f4942a.size(), true);
            }
            return m4753b(this.f4942a.size() - 1, -1, true);
        }

        /* renamed from: h */
        private void m4755h() {
            View view = (View) this.f4942a.get(0);
            LayoutParams c = m4754c(view);
            this.f4943b = StaggeredGridLayoutManager.this.f4898c.mo5516a(view);
            if (c.f4918b) {
                FullSpanItem d = StaggeredGridLayoutManager.this.f4905j.mo5257d(c.bw_());
                if (d != null && d.f4922b == -1) {
                    this.f4943b -= d.mo5258a(this.f4946e);
                }
            }
        }

        /* renamed from: i */
        private void m4756i() {
            View view = (View) this.f4942a.get(this.f4942a.size() - 1);
            LayoutParams c = m4754c(view);
            this.f4944c = StaggeredGridLayoutManager.this.f4898c.mo5519b(view);
            if (c.f4918b) {
                FullSpanItem d = StaggeredGridLayoutManager.this.f4905j.mo5257d(c.bw_());
                if (d != null && d.f4922b == 1) {
                    this.f4944c += d.mo5258a(this.f4946e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo5285d() {
            int size = this.f4942a.size();
            View view = (View) this.f4942a.remove(size - 1);
            LayoutParams c = m4754c(view);
            c.f4917a = null;
            if (c.bu_() || c.bv_()) {
                this.f4945d -= StaggeredGridLayoutManager.this.f4898c.mo5525e(view);
            }
            if (size == 1) {
                this.f4943b = DynamicTabYellowPointVersion.DEFAULT;
            }
            this.f4944c = DynamicTabYellowPointVersion.DEFAULT;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo5287e() {
            View view = (View) this.f4942a.remove(0);
            LayoutParams c = m4754c(view);
            c.f4917a = null;
            if (this.f4942a.size() == 0) {
                this.f4944c = DynamicTabYellowPointVersion.DEFAULT;
            }
            if (c.bu_() || c.bv_()) {
                this.f4945d -= StaggeredGridLayoutManager.this.f4898c.mo5525e(view);
            }
            this.f4943b = DynamicTabYellowPointVersion.DEFAULT;
        }

        /* renamed from: c */
        static LayoutParams m4754c(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo5275a(int i) {
            if (this.f4943b != Integer.MIN_VALUE) {
                return this.f4943b;
            }
            if (this.f4942a.size() == 0) {
                return i;
            }
            m4755h();
            return this.f4943b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5284c(int i) {
            this.f4943b = i;
            this.f4944c = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo5286d(int i) {
            if (this.f4943b != Integer.MIN_VALUE) {
                this.f4943b += i;
            }
            if (this.f4944c != Integer.MIN_VALUE) {
                this.f4944c += i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo5281b(int i) {
            if (this.f4944c != Integer.MIN_VALUE) {
                return this.f4944c;
            }
            if (this.f4942a.size() == 0) {
                return i;
            }
            m4756i();
            return this.f4944c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5282b(View view) {
            LayoutParams c = m4754c(view);
            c.f4917a = this;
            this.f4942a.add(view);
            this.f4944c = DynamicTabYellowPointVersion.DEFAULT;
            if (this.f4942a.size() == 1) {
                this.f4943b = DynamicTabYellowPointVersion.DEFAULT;
            }
            if (c.bu_() || c.bv_()) {
                this.f4945d += StaggeredGridLayoutManager.this.f4898c.mo5525e(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5278a(View view) {
            LayoutParams c = m4754c(view);
            c.f4917a = this;
            this.f4942a.add(0, view);
            this.f4943b = DynamicTabYellowPointVersion.DEFAULT;
            if (this.f4942a.size() == 1) {
                this.f4944c = DynamicTabYellowPointVersion.DEFAULT;
            }
            if (c.bu_() || c.bv_()) {
                this.f4945d += StaggeredGridLayoutManager.this.f4898c.mo5525e(view);
            }
        }

        C1374b(int i) {
            this.f4946e = i;
        }

        /* renamed from: a */
        public final View mo5277a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f4942a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f4942a.get(size);
                    if ((StaggeredGridLayoutManager.this.f4901f && StaggeredGridLayoutManager.m4418c(view2) >= i) || ((!StaggeredGridLayoutManager.this.f4901f && StaggeredGridLayoutManager.m4418c(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4942a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f4942a.get(i3);
                    if ((StaggeredGridLayoutManager.this.f4901f && StaggeredGridLayoutManager.m4418c(view3) <= i) || ((!StaggeredGridLayoutManager.this.f4901f && StaggeredGridLayoutManager.m4418c(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5279a(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo5281b((int) DynamicTabYellowPointVersion.DEFAULT);
            } else {
                i2 = mo5275a((int) DynamicTabYellowPointVersion.DEFAULT);
            }
            mo5283c();
            if (i2 != Integer.MIN_VALUE) {
                if ((!z || i2 >= StaggeredGridLayoutManager.this.f4898c.mo5520c()) && (z || i2 <= StaggeredGridLayoutManager.this.f4898c.mo5518b())) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f4944c = i2;
                    this.f4943b = i2;
                }
            }
        }

        /* renamed from: b */
        private int m4753b(int i, int i2, boolean z) {
            return m4752a(i, i2, false, false, true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo5276a(int i, int i2, boolean z) {
            return m4752a(i, i2, z, true, false);
        }

        /* renamed from: a */
        private int m4752a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int b = StaggeredGridLayoutManager.this.f4898c.mo5518b();
            int c = StaggeredGridLayoutManager.this.f4898c.mo5520c();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = (View) this.f4942a.get(i);
                int a = StaggeredGridLayoutManager.this.f4898c.mo5516a(view);
                int b2 = StaggeredGridLayoutManager.this.f4898c.mo5519b(view);
                boolean z5 = false;
                if (!z3 ? a >= c : a > c) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 ? b2 > b : b2 >= b) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.m4418c(view);
                        }
                        if (a < b || b2 > c) {
                            return StaggeredGridLayoutManager.m4418c(view);
                        }
                    } else if (a >= b && b2 <= c) {
                        return StaggeredGridLayoutManager.m4418c(view);
                    }
                }
                i += i3;
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo4725a(RecyclerView recyclerView, C1343o oVar) {
        super.mo4725a(recyclerView, oVar);
        mo5031a(this.f4895N);
        for (int i = 0; i < this.f4896a; i++) {
            this.f4897b[i].mo5283c();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: a */
    private boolean m4648a(C1374b bVar) {
        return this.f4902g ? bVar.mo5280b() < this.f4898c.mo5520c() && !C1374b.m4754c((View) bVar.f4942a.get(bVar.f4942a.size() - 1)).f4918b : bVar.mo5274a() > this.f4898c.mo5518b() && !C1374b.m4754c((View) bVar.f4942a.get(0)).f4918b;
        return false;
    }

    /* renamed from: a */
    public final void mo4672a(int i) {
        mo4729a((String) null);
        if (i != this.f4896a) {
            mo5245h();
            this.f4896a = i;
            this.f4909n = new BitSet(this.f4896a);
            this.f4897b = new C1374b[this.f4896a];
            for (int i2 = 0; i2 < this.f4896a; i2++) {
                this.f4897b[i2] = new C1374b(i2);
            }
            mo5057n();
        }
    }

    /* renamed from: b */
    public final void mo4731b(int i) {
        mo4729a((String) null);
        if (this.f4906k != 0) {
            this.f4906k = 0;
            mo5057n();
        }
    }

    /* renamed from: a */
    public final void mo4729a(String str) {
        if (this.f4912q == null) {
            super.mo4729a(str);
        }
    }

    /* renamed from: a */
    public final void mo4673a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int t = mo5063t() + mo5065v();
        int u = mo5064u() + mo5066w();
        if (this.f4900e == 1) {
            i4 = m4405a(i2, rect.height() + u, mo5015C());
            i3 = m4405a(i, (this.f4907l * this.f4896a) + t, mo5014B());
        } else {
            i3 = m4405a(i, rect.width() + t, mo5014B());
            i4 = m4405a(i2, (this.f4907l * this.f4896a) + u, mo5015C());
        }
        mo5046d(i3, i4);
    }

    /* renamed from: a */
    public final void mo4677a(C1349s sVar) {
        super.mo4677a(sVar);
        this.f4903h = -1;
        this.f4904i = DynamicTabYellowPointVersion.DEFAULT;
        this.f4912q = null;
        this.f4915t.mo5270a();
    }

    /* renamed from: a */
    private void m4642a(C1373a aVar) {
        if (this.f4912q.f4927c > 0) {
            if (this.f4912q.f4927c == this.f4896a) {
                for (int i = 0; i < this.f4896a; i++) {
                    this.f4897b[i].mo5283c();
                    int i2 = this.f4912q.f4928d[i];
                    if (i2 != Integer.MIN_VALUE) {
                        if (this.f4912q.f4933i) {
                            i2 += this.f4898c.mo5520c();
                        } else {
                            i2 += this.f4898c.mo5518b();
                        }
                    }
                    this.f4897b[i].mo5284c(i2);
                }
            } else {
                this.f4912q.mo5264a();
                this.f4912q.f4925a = this.f4912q.f4926b;
            }
        }
        this.f4911p = this.f4912q.f4934j;
        m4647a(this.f4912q.f4932h);
        m4669l();
        if (this.f4912q.f4925a != -1) {
            this.f4903h = this.f4912q.f4925a;
            aVar.f4937c = this.f4912q.f4933i;
        } else {
            aVar.f4937c = this.f4902g;
        }
        if (this.f4912q.f4929e > 1) {
            this.f4905j.f4919a = this.f4912q.f4930f;
            this.f4905j.f4920b = this.f4912q.f4931g;
        }
    }

    /* renamed from: a */
    public final int[] mo5240a(int[] iArr) {
        int i;
        if (iArr == null) {
            iArr = new int[this.f4896a];
        } else if (iArr.length < this.f4896a) {
            StringBuilder sb = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.f4896a);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i2 = 0; i2 < this.f4896a; i2++) {
            C1374b bVar = this.f4897b[i2];
            if (StaggeredGridLayoutManager.this.f4901f) {
                i = bVar.mo5276a(bVar.f4942a.size() - 1, -1, false);
            } else {
                i = bVar.mo5276a(0, bVar.f4942a.size(), false);
            }
            iArr[i2] = i;
        }
        return iArr;
    }

    /* renamed from: b */
    public final int[] mo5241b(int[] iArr) {
        int i;
        int[] iArr2 = new int[this.f4896a];
        for (int i2 = 0; i2 < this.f4896a; i2++) {
            C1374b bVar = this.f4897b[i2];
            if (StaggeredGridLayoutManager.this.f4901f) {
                i = bVar.mo5276a(bVar.f4942a.size() - 1, -1, true);
            } else {
                i = bVar.mo5276a(0, bVar.f4942a.size(), true);
            }
            iArr2[i2] = i;
        }
        return iArr2;
    }

    /* renamed from: a */
    private void m4646a(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f4918b) {
            if (this.f4900e == 1) {
                m4644a(view, this.f4913r, m4406a(this.f4746J, this.f4744H, mo5064u() + mo5066w(), layoutParams.height, true), false);
            } else {
                m4644a(view, m4406a(this.f4745I, this.f4743G, mo5063t() + mo5065v(), layoutParams.width, true), this.f4913r, false);
            }
        } else if (this.f4900e == 1) {
            m4644a(view, m4406a(this.f4907l, this.f4743G, 0, layoutParams.width, false), m4406a(this.f4746J, this.f4744H, mo5064u() + mo5066w(), layoutParams.height, true), false);
        } else {
            m4644a(view, m4406a(this.f4745I, this.f4743G, mo5063t() + mo5065v(), layoutParams.width, true), m4406a(this.f4907l, this.f4744H, 0, layoutParams.height, false), false);
        }
    }

    /* renamed from: a */
    private void m4644a(View view, int i, int i2, boolean z) {
        boolean z2;
        mo5039b(view, this.f4914s);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int b = m4649b(i, layoutParams.leftMargin + this.f4914s.left, layoutParams.rightMargin + this.f4914s.right);
        int b2 = m4649b(i2, layoutParams.topMargin + this.f4914s.top, layoutParams.bottomMargin + this.f4914s.bottom);
        if (z) {
            z2 = mo5029a(view, b, b2, (android.support.p043v7.widget.RecyclerView.LayoutParams) layoutParams);
        } else {
            z2 = mo5040b(view, b, b2, layoutParams);
        }
        if (z2) {
            view.measure(b, b2);
        }
    }

    /* renamed from: a */
    public final void mo4724a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4912q = (SavedState) parcelable;
            mo5057n();
        }
    }

    /* renamed from: a */
    public final void mo4676a(C1343o oVar, C1349s sVar, View view, C1008c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.mo5025a(view, cVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int i5 = 1;
        if (this.f4900e == 0) {
            int d = layoutParams2.mo5247d();
            if (layoutParams2.f4918b) {
                i5 = this.f4896a;
            }
            i4 = d;
            i3 = i5;
            i2 = -1;
            i = -1;
        } else {
            int d2 = layoutParams2.mo5247d();
            if (layoutParams2.f4918b) {
                i2 = d2;
                i = this.f4896a;
                i4 = -1;
                i3 = -1;
            } else {
                i2 = d2;
                i4 = -1;
                i3 = -1;
                i = 1;
            }
        }
        cVar.mo3134a((Object) C1011c.m2925a(i4, i3, i2, i, layoutParams2.f4918b, false));
    }

    /* renamed from: a */
    public final void mo4728a(AccessibilityEvent accessibilityEvent) {
        super.mo4728a(accessibilityEvent);
        if (mo5062s() > 0) {
            View b = m4650b(false);
            View c = m4656c(false);
            if (b != null && c != null) {
                int c2 = m4418c(b);
                int c3 = m4418c(c);
                if (c2 < c3) {
                    accessibilityEvent.setFromIndex(c2);
                    accessibilityEvent.setToIndex(c3);
                    return;
                }
                accessibilityEvent.setFromIndex(c3);
                accessibilityEvent.setToIndex(c2);
            }
        }
    }

    /* renamed from: a */
    public final int mo4666a(C1343o oVar, C1349s sVar) {
        if (this.f4900e == 0) {
            return this.f4896a;
        }
        return super.mo4666a(oVar, sVar);
    }

    /* renamed from: b */
    public final void mo4687b(RecyclerView recyclerView, int i, int i2) {
        m4657c(i, i2, 2);
    }

    /* renamed from: a */
    public final void mo4680a(RecyclerView recyclerView, int i, int i2) {
        m4657c(i, i2, 1);
    }

    /* renamed from: a */
    public final void mo4679a(RecyclerView recyclerView) {
        this.f4905j.mo5250a();
        mo5057n();
    }

    /* renamed from: a */
    public final void mo4681a(RecyclerView recyclerView, int i, int i2, int i3) {
        m4657c(i, i2, 8);
    }

    /* renamed from: a */
    public final void mo4682a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m4657c(i, i2, 4);
    }

    /* renamed from: a */
    private void m4645a(View view, LayoutParams layoutParams, C1414ae aeVar) {
        if (aeVar.f5099e == 1) {
            if (layoutParams.f4918b) {
                m4674o(view);
            } else {
                layoutParams.f4917a.mo5282b(view);
            }
        } else if (layoutParams.f4918b) {
            m4676p(view);
        } else {
            layoutParams.f4917a.mo5278a(view);
        }
    }

    /* renamed from: a */
    private void m4640a(C1343o oVar, C1414ae aeVar) {
        int i;
        int i2;
        if (aeVar.f5095a && !aeVar.f5103i) {
            if (aeVar.f5096b == 0) {
                if (aeVar.f5099e == -1) {
                    m4652b(oVar, aeVar.f5101g);
                } else {
                    m4638a(oVar, aeVar.f5100f);
                }
            } else if (aeVar.f5099e == -1) {
                int n = aeVar.f5100f - m4672n(aeVar.f5100f);
                if (n < 0) {
                    i2 = aeVar.f5101g;
                } else {
                    i2 = aeVar.f5101g - Math.min(n, aeVar.f5096b);
                }
                m4652b(oVar, i2);
            } else {
                int q = m4677q(aeVar.f5101g) - aeVar.f5101g;
                if (q < 0) {
                    i = aeVar.f5100f;
                } else {
                    i = Math.min(q, aeVar.f5096b) + aeVar.f5100f;
                }
                m4638a(oVar, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        C1415af afVar = new C1415af(recyclerView.getContext());
        afVar.f4778g = i;
        mo5022a((C1346r) afVar);
    }

    /* renamed from: a */
    public final void mo4721a(int i, int i2) {
        if (this.f4912q != null) {
            this.f4912q.mo5265b();
        }
        this.f4903h = i;
        this.f4904i = i2;
        mo5057n();
    }

    /* renamed from: a */
    public final void mo4722a(int i, int i2, C1349s sVar, C1335a aVar) {
        int i3;
        if (this.f4900e != 0) {
            i = i2;
        }
        if (mo5062s() != 0 && i != 0) {
            m4651b(i, sVar);
            if (this.f4894M == null || this.f4894M.length < this.f4896a) {
                this.f4894M = new int[this.f4896a];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f4896a; i5++) {
                if (this.f4908m.f5098d == -1) {
                    i3 = this.f4908m.f5100f - this.f4897b[i5].mo5275a(this.f4908m.f5100f);
                } else {
                    i3 = this.f4897b[i5].mo5281b(this.f4908m.f5101g) - this.f4908m.f5101g;
                }
                if (i3 >= 0) {
                    this.f4894M[i4] = i3;
                    i4++;
                }
            }
            Arrays.sort(this.f4894M, 0, i4);
            for (int i6 = 0; i6 < i4 && this.f4908m.mo5488a(sVar); i6++) {
                aVar.mo5075a(this.f4908m.f5097c, this.f4894M[i6]);
                this.f4908m.f5097c += this.f4908m.f5098d;
            }
        }
    }

    /* renamed from: a */
    public final android.support.p043v7.widget.RecyclerView.LayoutParams mo4667a() {
        if (this.f4900e == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: a */
    public final android.support.p043v7.widget.RecyclerView.LayoutParams mo4668a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    public final android.support.p043v7.widget.RecyclerView.LayoutParams mo4669a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (m4671m() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        r11 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (m4671m() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (r9.f4900e == 1) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        if (r9.f4900e == 0) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r9.f4900e == 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0057, code lost:
        if (r9.f4900e == 0) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo4671a(android.view.View r10, int r11, android.support.p043v7.widget.RecyclerView.C1343o r12, android.support.p043v7.widget.RecyclerView.C1349s r13) {
        /*
            r9 = this;
            int r0 = r9.mo5062s()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r10 = r9.mo5045d(r10)
            if (r10 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r9.m4669l()
            r0 = 17
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -1
            r4 = 1
            if (r11 == r0) goto L_0x0055
            r0 = 33
            if (r11 == r0) goto L_0x0050
            r0 = 66
            if (r11 == r0) goto L_0x004b
            r0 = 130(0x82, float:1.82E-43)
            if (r11 == r0) goto L_0x0046
            switch(r11) {
                case 1: goto L_0x0039;
                case 2: goto L_0x002c;
                default: goto L_0x0029;
            }
        L_0x0029:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005a
        L_0x002c:
            int r11 = r9.f4900e
            if (r11 != r4) goto L_0x0032
        L_0x0030:
            r11 = 1
            goto L_0x005a
        L_0x0032:
            boolean r11 = r9.m4671m()
            if (r11 == 0) goto L_0x0030
            goto L_0x003d
        L_0x0039:
            int r11 = r9.f4900e
            if (r11 != r4) goto L_0x003f
        L_0x003d:
            r11 = -1
            goto L_0x005a
        L_0x003f:
            boolean r11 = r9.m4671m()
            if (r11 == 0) goto L_0x003d
            goto L_0x0030
        L_0x0046:
            int r11 = r9.f4900e
            if (r11 != r4) goto L_0x0029
            goto L_0x0030
        L_0x004b:
            int r11 = r9.f4900e
            if (r11 != 0) goto L_0x0029
            goto L_0x0030
        L_0x0050:
            int r11 = r9.f4900e
            if (r11 != r4) goto L_0x0029
            goto L_0x003d
        L_0x0055:
            int r11 = r9.f4900e
            if (r11 != 0) goto L_0x0029
            goto L_0x003d
        L_0x005a:
            if (r11 != r2) goto L_0x005d
            return r1
        L_0x005d:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams r0 = (android.support.p043v7.widget.StaggeredGridLayoutManager.LayoutParams) r0
            boolean r2 = r0.f4918b
            android.support.v7.widget.StaggeredGridLayoutManager$b r0 = r0.f4917a
            if (r11 != r4) goto L_0x006e
            int r5 = r9.m4633I()
            goto L_0x0072
        L_0x006e:
            int r5 = r9.m4634J()
        L_0x0072:
            r9.m4637a(r5, r13)
            r9.m4667k(r11)
            android.support.v7.widget.ae r6 = r9.f4908m
            int r7 = r6.f5098d
            int r7 = r7 + r5
            r6.f5097c = r7
            android.support.v7.widget.ae r6 = r9.f4908m
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            android.support.v7.widget.ak r8 = r9.f4898c
            int r8 = r8.mo5524e()
            float r8 = (float) r8
            float r8 = r8 * r7
            int r7 = (int) r8
            r6.f5096b = r7
            android.support.v7.widget.ae r6 = r9.f4908m
            r6.f5102h = r4
            android.support.v7.widget.ae r6 = r9.f4908m
            r7 = 0
            r6.f5095a = r7
            android.support.v7.widget.ae r6 = r9.f4908m
            r9.m4635a(r12, r6, r13)
            boolean r12 = r9.f4902g
            r9.f4910o = r12
            if (r2 != 0) goto L_0x00ad
            android.view.View r12 = r0.mo5277a(r5, r11)
            if (r12 == 0) goto L_0x00ad
            if (r12 == r10) goto L_0x00ad
            return r12
        L_0x00ad:
            boolean r12 = r9.m4678r(r11)
            if (r12 == 0) goto L_0x00c8
            int r12 = r9.f4896a
            int r12 = r12 - r4
        L_0x00b6:
            if (r12 < 0) goto L_0x00dd
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r13 = r9.f4897b
            r13 = r13[r12]
            android.view.View r13 = r13.mo5277a(r5, r11)
            if (r13 == 0) goto L_0x00c5
            if (r13 == r10) goto L_0x00c5
            return r13
        L_0x00c5:
            int r12 = r12 + -1
            goto L_0x00b6
        L_0x00c8:
            r12 = 0
        L_0x00c9:
            int r13 = r9.f4896a
            if (r12 >= r13) goto L_0x00dd
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r13 = r9.f4897b
            r13 = r13[r12]
            android.view.View r13 = r13.mo5277a(r5, r11)
            if (r13 == 0) goto L_0x00da
            if (r13 == r10) goto L_0x00da
            return r13
        L_0x00da:
            int r12 = r12 + 1
            goto L_0x00c9
        L_0x00dd:
            boolean r12 = r9.f4901f
            r12 = r12 ^ r4
            if (r11 != r3) goto L_0x00e4
            r13 = 1
            goto L_0x00e5
        L_0x00e4:
            r13 = 0
        L_0x00e5:
            if (r12 != r13) goto L_0x00e9
            r12 = 1
            goto L_0x00ea
        L_0x00e9:
            r12 = 0
        L_0x00ea:
            if (r2 != 0) goto L_0x0100
            if (r12 == 0) goto L_0x00f3
            int r13 = r0.mo5288f()
            goto L_0x00f7
        L_0x00f3:
            int r13 = r0.mo5289g()
        L_0x00f7:
            android.view.View r13 = r9.mo4736c(r13)
            if (r13 == 0) goto L_0x0100
            if (r13 == r10) goto L_0x0100
            return r13
        L_0x0100:
            boolean r11 = r9.m4678r(r11)
            if (r11 == 0) goto L_0x012e
            int r11 = r9.f4896a
            int r11 = r11 - r4
        L_0x0109:
            if (r11 < 0) goto L_0x0151
            int r13 = r0.f4946e
            if (r11 == r13) goto L_0x012b
            if (r12 == 0) goto L_0x011a
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r13 = r9.f4897b
            r13 = r13[r11]
            int r13 = r13.mo5288f()
            goto L_0x0122
        L_0x011a:
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r13 = r9.f4897b
            r13 = r13[r11]
            int r13 = r13.mo5289g()
        L_0x0122:
            android.view.View r13 = r9.mo4736c(r13)
            if (r13 == 0) goto L_0x012b
            if (r13 == r10) goto L_0x012b
            return r13
        L_0x012b:
            int r11 = r11 + -1
            goto L_0x0109
        L_0x012e:
            int r11 = r9.f4896a
            if (r7 >= r11) goto L_0x0151
            if (r12 == 0) goto L_0x013d
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r11 = r9.f4897b
            r11 = r11[r7]
            int r11 = r11.mo5288f()
            goto L_0x0145
        L_0x013d:
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r11 = r9.f4897b
            r11 = r11[r7]
            int r11 = r11.mo5289g()
        L_0x0145:
            android.view.View r11 = r9.mo4736c(r11)
            if (r11 == 0) goto L_0x014e
            if (r11 == r10) goto L_0x014e
            return r11
        L_0x014e:
            int r7 = r7 + 1
            goto L_0x012e
        L_0x0151:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.StaggeredGridLayoutManager.mo4671a(android.view.View, int, android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s):android.view.View");
    }

    public final boolean br_() {
        if (this.f4906k != 0) {
            return true;
        }
        return false;
    }

    public final boolean bs_() {
        if (this.f4912q == null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m4671m() {
        if (mo5060q() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo4742e() {
        if (this.f4900e == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo4745f() {
        if (this.f4900e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo5245h() {
        this.f4905j.mo5250a();
        mo5057n();
    }

    /* renamed from: G */
    private boolean m4631G() {
        int b = this.f4897b[0].mo5281b((int) DynamicTabYellowPointVersion.DEFAULT);
        for (int i = 1; i < this.f4896a; i++) {
            if (this.f4897b[i].mo5281b((int) DynamicTabYellowPointVersion.DEFAULT) != b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    private boolean m4632H() {
        int a = this.f4897b[0].mo5275a((int) DynamicTabYellowPointVersion.DEFAULT);
        for (int i = 1; i < this.f4896a; i++) {
            if (this.f4897b[i].mo5275a((int) DynamicTabYellowPointVersion.DEFAULT) != a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    private int m4633I() {
        int s = mo5062s();
        if (s == 0) {
            return 0;
        }
        return m4418c(mo5050g(s - 1));
    }

    /* renamed from: J */
    private int m4634J() {
        if (mo5062s() == 0) {
            return 0;
        }
        return m4418c(mo5050g(0));
    }

    /* renamed from: j */
    private void m4665j() {
        this.f4898c = C1422ak.m4898a(this, this.f4900e);
        this.f4899d = C1422ak.m4898a(this, 1 - this.f4900e);
    }

    /* renamed from: l */
    private void m4669l() {
        boolean z = true;
        if (this.f4900e == 1 || !m4671m()) {
            z = this.f4901f;
        } else if (this.f4901f) {
            z = false;
        }
        this.f4902g = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo5244g() {
        int i;
        int i2;
        int i3;
        if (mo5062s() == 0 || this.f4906k == 0 || !this.f4737A) {
            return false;
        }
        if (this.f4902g) {
            i2 = m4633I();
            i = m4634J();
        } else {
            i2 = m4634J();
            i = m4633I();
        }
        if (i2 == 0 && m4666k() != null) {
            this.f4905j.mo5250a();
            mo5017E();
            mo5057n();
            return true;
        } else if (!this.f4892K) {
            return false;
        } else {
            if (this.f4902g) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            int i4 = i + 1;
            FullSpanItem a = this.f4905j.mo5249a(i2, i4, i3, true);
            if (a == null) {
                this.f4892K = false;
                this.f4905j.mo5248a(i4);
                return false;
            }
            FullSpanItem a2 = this.f4905j.mo5249a(i2, a.f4921a, i3 * -1, true);
            if (a2 == null) {
                this.f4905j.mo5248a(a.f4921a);
            } else {
                this.f4905j.mo5248a(a2.f4921a + 1);
            }
            mo5017E();
            mo5057n();
            return true;
        }
    }

    /* renamed from: F */
    private void m4630F() {
        if (this.f4899d.mo5528g() != 1073741824) {
            int s = mo5062s();
            float f = 0.0f;
            for (int i = 0; i < s; i++) {
                View g = mo5050g(i);
                float e = (float) this.f4899d.mo5525e(g);
                if (e >= f) {
                    if (((LayoutParams) g.getLayoutParams()).f4918b) {
                        e = (e * 1.0f) / ((float) this.f4896a);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f4907l;
            int round = Math.round(f * ((float) this.f4896a));
            if (this.f4899d.mo5528g() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f4899d.mo5524e());
            }
            m4661f(round);
            if (this.f4907l != i2) {
                for (int i3 = 0; i3 < s; i3++) {
                    View g2 = mo5050g(i3);
                    LayoutParams layoutParams = (LayoutParams) g2.getLayoutParams();
                    if (!layoutParams.f4918b) {
                        if (!m4671m() || this.f4900e != 1) {
                            int i4 = layoutParams.f4917a.f4946e * this.f4907l;
                            int i5 = layoutParams.f4917a.f4946e * i2;
                            if (this.f4900e == 1) {
                                g2.offsetLeftAndRight(i4 - i5);
                            } else {
                                g2.offsetTopAndBottom(i4 - i5);
                            }
                        } else {
                            g2.offsetLeftAndRight(((-((this.f4896a - 1) - layoutParams.f4917a.f4946e)) * this.f4907l) - ((-((this.f4896a - 1) - layoutParams.f4917a.f4946e)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r10 == r11) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r10 == r11) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        r10 = false;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m4666k() {
        /*
            r12 = this;
            int r0 = r12.mo5062s()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4896a
            r2.<init>(r3)
            int r3 = r12.f4896a
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4900e
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.m4671m()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f4902g
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00aa
            android.view.View r7 = r12.mo5050g(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams r8 = (android.support.p043v7.widget.StaggeredGridLayoutManager.LayoutParams) r8
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r8.f4917a
            int r9 = r9.f4946e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r8.f4917a
            boolean r9 = r12.m4648a(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r8.f4917a
            int r9 = r9.f4946e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f4918b
            if (r9 != 0) goto L_0x00a8
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a8
            android.view.View r9 = r12.mo5050g(r9)
            boolean r10 = r12.f4902g
            if (r10 == 0) goto L_0x0076
            android.support.v7.widget.ak r10 = r12.f4898c
            int r10 = r10.mo5519b(r7)
            android.support.v7.widget.ak r11 = r12.f4898c
            int r11 = r11.mo5519b(r9)
            if (r10 >= r11) goto L_0x0073
            return r7
        L_0x0073:
            if (r10 != r11) goto L_0x0089
            goto L_0x0087
        L_0x0076:
            android.support.v7.widget.ak r10 = r12.f4898c
            int r10 = r10.mo5516a(r7)
            android.support.v7.widget.ak r11 = r12.f4898c
            int r11 = r11.mo5516a(r9)
            if (r10 <= r11) goto L_0x0085
            return r7
        L_0x0085:
            if (r10 != r11) goto L_0x0089
        L_0x0087:
            r10 = 1
            goto L_0x008a
        L_0x0089:
            r10 = 0
        L_0x008a:
            if (r10 == 0) goto L_0x00a8
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams r9 = (android.support.p043v7.widget.StaggeredGridLayoutManager.LayoutParams) r9
            android.support.v7.widget.StaggeredGridLayoutManager$b r8 = r8.f4917a
            int r8 = r8.f4946e
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r9.f4917a
            int r9 = r9.f4946e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x009f
            r8 = 1
            goto L_0x00a0
        L_0x009f:
            r8 = 0
        L_0x00a0:
            if (r3 >= 0) goto L_0x00a4
            r9 = 1
            goto L_0x00a5
        L_0x00a4:
            r9 = 0
        L_0x00a5:
            if (r8 == r9) goto L_0x00a8
            return r7
        L_0x00a8:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00aa:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.StaggeredGridLayoutManager.m4666k():android.view.View");
    }

    /* renamed from: d */
    public final Parcelable mo4739d() {
        int i;
        View view;
        int i2;
        if (this.f4912q != null) {
            return new SavedState(this.f4912q);
        }
        SavedState savedState = new SavedState();
        savedState.f4932h = this.f4901f;
        savedState.f4933i = this.f4910o;
        savedState.f4934j = this.f4911p;
        if (this.f4905j == null || this.f4905j.f4919a == null) {
            savedState.f4929e = 0;
        } else {
            savedState.f4930f = this.f4905j.f4919a;
            savedState.f4929e = savedState.f4930f.length;
            savedState.f4931g = this.f4905j.f4920b;
        }
        int i3 = -1;
        if (mo5062s() > 0) {
            if (this.f4910o) {
                i = m4633I();
            } else {
                i = m4634J();
            }
            savedState.f4925a = i;
            if (this.f4902g) {
                view = m4656c(true);
            } else {
                view = m4650b(true);
            }
            if (view != null) {
                i3 = m4418c(view);
            }
            savedState.f4926b = i3;
            savedState.f4927c = this.f4896a;
            savedState.f4928d = new int[this.f4896a];
            for (int i4 = 0; i4 < this.f4896a; i4++) {
                if (this.f4910o) {
                    i2 = this.f4897b[i4].mo5281b((int) DynamicTabYellowPointVersion.DEFAULT);
                    if (i2 != Integer.MIN_VALUE) {
                        i2 -= this.f4898c.mo5520c();
                    }
                } else {
                    i2 = this.f4897b[i4].mo5275a((int) DynamicTabYellowPointVersion.DEFAULT);
                    if (i2 != Integer.MIN_VALUE) {
                        i2 -= this.f4898c.mo5518b();
                    }
                }
                savedState.f4928d[i4] = i2;
            }
        } else {
            savedState.f4925a = -1;
            savedState.f4926b = -1;
            savedState.f4927c = 0;
        }
        return savedState;
    }

    /* renamed from: a */
    public final boolean mo4684a(android.support.p043v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: c */
    public final int mo4735c(C1349s sVar) {
        return m4662h(sVar);
    }

    /* renamed from: d */
    public final int mo4737d(C1349s sVar) {
        return m4663i(sVar);
    }

    /* renamed from: e */
    public final int mo4740e(C1349s sVar) {
        return m4663i(sVar);
    }

    /* renamed from: f */
    public final int mo4744f(C1349s sVar) {
        return m4664j(sVar);
    }

    /* renamed from: g */
    public final int mo4746g(C1349s sVar) {
        return m4664j(sVar);
    }

    /* renamed from: j */
    public final void mo5056j(int i) {
        if (i == 0) {
            mo5244g();
        }
    }

    /* renamed from: a */
    private void m4647a(boolean z) {
        mo4729a((String) null);
        if (!(this.f4912q == null || this.f4912q.f4932h == z)) {
            this.f4912q.f4932h = z;
        }
        this.f4901f = z;
        mo5057n();
    }

    /* renamed from: f */
    private void m4661f(int i) {
        this.f4907l = i / this.f4896a;
        this.f4913r = MeasureSpec.makeMeasureSpec(i, this.f4899d.mo5528g());
    }

    /* renamed from: k */
    private void m4667k(int i) {
        boolean z;
        this.f4908m.f5099e = i;
        C1414ae aeVar = this.f4908m;
        boolean z2 = this.f4902g;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        aeVar.f5098d = i2;
    }

    /* renamed from: n */
    private int m4672n(int i) {
        int a = this.f4897b[0].mo5275a(i);
        for (int i2 = 1; i2 < this.f4896a; i2++) {
            int a2 = this.f4897b[i2].mo5275a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: o */
    private int m4673o(int i) {
        int a = this.f4897b[0].mo5275a(i);
        for (int i2 = 1; i2 < this.f4896a; i2++) {
            int a2 = this.f4897b[i2].mo5275a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: p */
    private int m4675p(int i) {
        int b = this.f4897b[0].mo5281b(i);
        for (int i2 = 1; i2 < this.f4896a; i2++) {
            int b2 = this.f4897b[i2].mo5281b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: q */
    private int m4677q(int i) {
        int b = this.f4897b[0].mo5281b(i);
        for (int i2 = 1; i2 < this.f4896a; i2++) {
            int b2 = this.f4897b[i2].mo5281b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: s */
    private int m4679s(int i) {
        boolean z;
        if (mo5062s() != 0) {
            if (i < m4634J()) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f4902g) {
                return -1;
            }
            return 1;
        } else if (this.f4902g) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: t */
    private int m4680t(int i) {
        int s = mo5062s();
        for (int i2 = 0; i2 < s; i2++) {
            int c = m4418c(mo5050g(i2));
            if (c >= 0 && c < i) {
                return c;
            }
        }
        return 0;
    }

    /* renamed from: u */
    private int m4681u(int i) {
        for (int s = mo5062s() - 1; s >= 0; s--) {
            int c = m4418c(mo5050g(s));
            if (c >= 0 && c < i) {
                return c;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final PointF mo4738d(int i) {
        int s = m4679s(i);
        PointF pointF = new PointF();
        if (s == 0) {
            return null;
        }
        if (this.f4900e == 0) {
            pointF.x = (float) s;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) s;
        }
        return pointF;
    }

    /* renamed from: h */
    public final void mo5052h(int i) {
        super.mo5052h(i);
        for (int i2 = 0; i2 < this.f4896a; i2++) {
            this.f4897b[i2].mo5286d(i);
        }
    }

    /* renamed from: i */
    public final void mo5054i(int i) {
        super.mo5054i(i);
        for (int i2 = 0; i2 < this.f4896a; i2++) {
            this.f4897b[i2].mo5286d(i);
        }
    }

    /* renamed from: h */
    private int m4662h(C1349s sVar) {
        if (mo5062s() == 0) {
            return 0;
        }
        return C1435as.m4979a(sVar, this.f4898c, m4650b(!this.f4893L), m4656c(!this.f4893L), this, this.f4893L, this.f4902g);
    }

    /* renamed from: i */
    private int m4663i(C1349s sVar) {
        if (mo5062s() == 0) {
            return 0;
        }
        return C1435as.m4978a(sVar, this.f4898c, m4650b(!this.f4893L), m4656c(!this.f4893L), this, this.f4893L);
    }

    /* renamed from: j */
    private int m4664j(C1349s sVar) {
        if (mo5062s() == 0) {
            return 0;
        }
        return C1435as.m4980b(sVar, this.f4898c, m4650b(!this.f4893L), m4656c(!this.f4893L), this, this.f4893L);
    }

    /* renamed from: l */
    private FullSpanItem m4668l(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f4923c = new int[this.f4896a];
        for (int i2 = 0; i2 < this.f4896a; i2++) {
            fullSpanItem.f4923c[i2] = i - this.f4897b[i2].mo5281b(i);
        }
        return fullSpanItem;
    }

    /* renamed from: m */
    private FullSpanItem m4670m(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f4923c = new int[this.f4896a];
        for (int i2 = 0; i2 < this.f4896a; i2++) {
            fullSpanItem.f4923c[i2] = this.f4897b[i2].mo5275a(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: o */
    private void m4674o(View view) {
        for (int i = this.f4896a - 1; i >= 0; i--) {
            this.f4897b[i].mo5282b(view);
        }
    }

    /* renamed from: p */
    private void m4676p(View view) {
        for (int i = this.f4896a - 1; i >= 0; i--) {
            this.f4897b[i].mo5278a(view);
        }
    }

    /* renamed from: r */
    private boolean m4678r(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f4900e == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f4902g) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f4902g) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == m4671m()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo4741e(int i) {
        if (!(this.f4912q == null || this.f4912q.f4925a == i)) {
            this.f4912q.mo5265b();
        }
        this.f4903h = i;
        this.f4904i = DynamicTabYellowPointVersion.DEFAULT;
        mo5057n();
    }

    /* renamed from: a */
    private C1374b m4636a(C1414ae aeVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m4678r(aeVar.f5099e)) {
            i2 = this.f4896a - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f4896a;
            i = 1;
        }
        C1374b bVar = null;
        if (aeVar.f5099e == 1) {
            int i4 = Integer.MAX_VALUE;
            int b = this.f4898c.mo5518b();
            while (i2 != i3) {
                C1374b bVar2 = this.f4897b[i2];
                int b2 = bVar2.mo5281b(b);
                if (b2 < i4) {
                    bVar = bVar2;
                    i4 = b2;
                }
                i2 += i;
            }
            return bVar;
        }
        int i5 = DynamicTabYellowPointVersion.DEFAULT;
        int c = this.f4898c.mo5520c();
        while (i2 != i3) {
            C1374b bVar3 = this.f4897b[i2];
            int a = bVar3.mo5275a(c);
            if (a > i5) {
                bVar = bVar3;
                i5 = a;
            }
            i2 += i;
        }
        return bVar;
    }

    /* renamed from: b */
    private View m4650b(boolean z) {
        int b = this.f4898c.mo5518b();
        int c = this.f4898c.mo5520c();
        int s = mo5062s();
        View view = null;
        for (int i = 0; i < s; i++) {
            View g = mo5050g(i);
            int a = this.f4898c.mo5516a(g);
            if (this.f4898c.mo5519b(g) > b && a < c) {
                if (a >= b || !z) {
                    return g;
                }
                if (view == null) {
                    view = g;
                }
            }
        }
        return view;
    }

    /* renamed from: c */
    private View m4656c(boolean z) {
        int b = this.f4898c.mo5518b();
        int c = this.f4898c.mo5520c();
        View view = null;
        for (int s = mo5062s() - 1; s >= 0; s--) {
            View g = mo5050g(s);
            int a = this.f4898c.mo5516a(g);
            int b2 = this.f4898c.mo5519b(g);
            if (b2 > b && a < c) {
                if (b2 <= c || !z) {
                    return g;
                }
                if (view == null) {
                    view = g;
                }
            }
        }
        return view;
    }

    /* renamed from: d */
    public final int[] mo5243d(int[] iArr) {
        int i;
        if (3 >= this.f4896a) {
            for (int i2 = 0; i2 < this.f4896a; i2++) {
                C1374b bVar = this.f4897b[i2];
                if (StaggeredGridLayoutManager.this.f4901f) {
                    i = bVar.mo5276a(0, bVar.f4942a.size(), true);
                } else {
                    i = bVar.mo5276a(bVar.f4942a.size() - 1, -1, true);
                }
                iArr[i2] = i;
            }
            return iArr;
        }
        StringBuilder sb = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
        sb.append(this.f4896a);
        sb.append(", array size:3");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final int mo4730b(C1349s sVar) {
        return m4662h(sVar);
    }

    /* renamed from: c */
    public final int[] mo5242c(int[] iArr) {
        int i;
        if (iArr == null) {
            iArr = new int[this.f4896a];
        } else if (iArr.length < this.f4896a) {
            StringBuilder sb = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.f4896a);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i2 = 0; i2 < this.f4896a; i2++) {
            C1374b bVar = this.f4897b[i2];
            if (StaggeredGridLayoutManager.this.f4901f) {
                i = bVar.mo5276a(0, bVar.f4942a.size(), false);
            } else {
                i = bVar.mo5276a(bVar.f4942a.size() - 1, -1, false);
            }
            iArr[i2] = i;
        }
        return iArr;
    }

    /* renamed from: a */
    private void m4641a(C1349s sVar, C1373a aVar) {
        if (!m4659c(sVar, aVar)) {
            m4654b(sVar, aVar);
        }
    }

    /* renamed from: b */
    public final int mo4686b(C1343o oVar, C1349s sVar) {
        if (this.f4900e == 1) {
            return this.f4896a;
        }
        return super.mo4686b(oVar, sVar);
    }

    /* renamed from: c */
    public void mo4689c(C1343o oVar, C1349s sVar) {
        m4639a(oVar, sVar, true);
    }

    /* renamed from: b */
    private boolean m4654b(C1349s sVar, C1373a aVar) {
        int i;
        if (this.f4910o) {
            i = m4681u(sVar.mo5115a());
        } else {
            i = m4680t(sVar.mo5115a());
        }
        aVar.f4935a = i;
        aVar.f4936b = DynamicTabYellowPointVersion.DEFAULT;
        return true;
    }

    /* renamed from: e */
    private void m4660e(int i, int i2) {
        for (int i3 = 0; i3 < this.f4896a; i3++) {
            if (!this.f4897b[i3].f4942a.isEmpty()) {
                m4643a(this.f4897b[i3], i, i2);
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f4900e = i2;
        mo4672a(i);
        this.f4908m = new C1414ae();
        m4665j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4637a(int r5, android.support.p043v7.widget.RecyclerView.C1349s r6) {
        /*
            r4 = this;
            android.support.v7.widget.ae r0 = r4.f4908m
            r1 = 0
            r0.f5096b = r1
            android.support.v7.widget.ae r0 = r4.f4908m
            r0.f5097c = r5
            boolean r0 = r4.mo5059p()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.f4792a
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f4902g
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0027
            android.support.v7.widget.ak r5 = r4.f4898c
            int r5 = r5.mo5524e()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x0027:
            android.support.v7.widget.ak r5 = r4.f4898c
            int r5 = r5.mo5524e()
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo5058o()
            if (r0 == 0) goto L_0x004d
            android.support.v7.widget.ae r0 = r4.f4908m
            android.support.v7.widget.ak r3 = r4.f4898c
            int r3 = r3.mo5518b()
            int r3 = r3 - r5
            r0.f5100f = r3
            android.support.v7.widget.ae r5 = r4.f4908m
            android.support.v7.widget.ak r0 = r4.f4898c
            int r0 = r0.mo5520c()
            int r0 = r0 + r6
            r5.f5101g = r0
            goto L_0x005d
        L_0x004d:
            android.support.v7.widget.ae r0 = r4.f4908m
            android.support.v7.widget.ak r3 = r4.f4898c
            int r3 = r3.mo5522d()
            int r3 = r3 + r6
            r0.f5101g = r3
            android.support.v7.widget.ae r6 = r4.f4908m
            int r5 = -r5
            r6.f5100f = r5
        L_0x005d:
            android.support.v7.widget.ae r5 = r4.f4908m
            r5.f5102h = r1
            android.support.v7.widget.ae r5 = r4.f4908m
            r5.f5095a = r2
            android.support.v7.widget.ae r5 = r4.f4908m
            android.support.v7.widget.ak r6 = r4.f4898c
            int r6 = r6.mo5528g()
            if (r6 != 0) goto L_0x0078
            android.support.v7.widget.ak r6 = r4.f4898c
            int r6 = r6.mo5522d()
            if (r6 != 0) goto L_0x0078
            r1 = 1
        L_0x0078:
            r5.f5103i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.StaggeredGridLayoutManager.m4637a(int, android.support.v7.widget.RecyclerView$s):void");
    }

    /* renamed from: b */
    private void m4651b(int i, C1349s sVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = m4633I();
            i2 = 1;
        } else {
            i3 = m4634J();
            i2 = -1;
        }
        this.f4908m.f5095a = true;
        m4637a(i3, sVar);
        m4667k(i2);
        C1414ae aeVar = this.f4908m;
        aeVar.f5097c = i3 + aeVar.f5098d;
        this.f4908m.f5096b = Math.abs(i);
    }

    /* renamed from: b */
    private void m4652b(C1343o oVar, int i) {
        int s = mo5062s() - 1;
        while (s >= 0) {
            View g = mo5050g(s);
            if (this.f4898c.mo5516a(g) >= i && this.f4898c.mo5523d(g) >= i) {
                LayoutParams layoutParams = (LayoutParams) g.getLayoutParams();
                if (layoutParams.f4918b) {
                    int i2 = 0;
                    while (i2 < this.f4896a) {
                        if (this.f4897b[i2].f4942a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4896a; i3++) {
                        this.f4897b[i3].mo5285d();
                    }
                } else if (layoutParams.f4917a.f4942a.size() != 1) {
                    layoutParams.f4917a.mo5285d();
                } else {
                    return;
                }
                mo5026a(g, oVar);
                s--;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m4638a(C1343o oVar, int i) {
        while (mo5062s() > 0) {
            View g = mo5050g(0);
            if (this.f4898c.mo5519b(g) <= i && this.f4898c.mo5521c(g) <= i) {
                LayoutParams layoutParams = (LayoutParams) g.getLayoutParams();
                if (layoutParams.f4918b) {
                    int i2 = 0;
                    while (i2 < this.f4896a) {
                        if (this.f4897b[i2].f4942a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4896a; i3++) {
                        this.f4897b[i3].mo5287e();
                    }
                } else if (layoutParams.f4917a.f4942a.size() != 1) {
                    layoutParams.f4917a.mo5287e();
                } else {
                    return;
                }
                mo5026a(g, oVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private boolean m4659c(C1349s sVar, C1373a aVar) {
        int i;
        int i2;
        boolean z = false;
        if (sVar.f4798g || this.f4903h == -1) {
            return false;
        }
        if (this.f4903h < 0 || this.f4903h >= sVar.mo5115a()) {
            this.f4903h = -1;
            this.f4904i = DynamicTabYellowPointVersion.DEFAULT;
            return false;
        }
        if (this.f4912q == null || this.f4912q.f4925a == -1 || this.f4912q.f4927c <= 0) {
            View c = mo4736c(this.f4903h);
            if (c != null) {
                if (this.f4902g) {
                    i = m4633I();
                } else {
                    i = m4634J();
                }
                aVar.f4935a = i;
                if (this.f4904i != Integer.MIN_VALUE) {
                    if (aVar.f4937c) {
                        aVar.f4936b = (this.f4898c.mo5520c() - this.f4904i) - this.f4898c.mo5519b(c);
                    } else {
                        aVar.f4936b = (this.f4898c.mo5518b() + this.f4904i) - this.f4898c.mo5516a(c);
                    }
                    return true;
                } else if (this.f4898c.mo5525e(c) > this.f4898c.mo5524e()) {
                    if (aVar.f4937c) {
                        i2 = this.f4898c.mo5520c();
                    } else {
                        i2 = this.f4898c.mo5518b();
                    }
                    aVar.f4936b = i2;
                    return true;
                } else {
                    int a = this.f4898c.mo5516a(c) - this.f4898c.mo5518b();
                    if (a < 0) {
                        aVar.f4936b = -a;
                        return true;
                    }
                    int c2 = this.f4898c.mo5520c() - this.f4898c.mo5519b(c);
                    if (c2 < 0) {
                        aVar.f4936b = c2;
                        return true;
                    }
                    aVar.f4936b = DynamicTabYellowPointVersion.DEFAULT;
                }
            } else {
                aVar.f4935a = this.f4903h;
                if (this.f4904i == Integer.MIN_VALUE) {
                    if (m4679s(aVar.f4935a) == 1) {
                        z = true;
                    }
                    aVar.f4937c = z;
                    aVar.mo5273b();
                } else {
                    aVar.mo5271a(this.f4904i);
                }
                aVar.f4938d = true;
            }
        } else {
            aVar.f4936b = DynamicTabYellowPointVersion.DEFAULT;
            aVar.f4935a = this.f4903h;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo4665a(int i, C1343o oVar, C1349s sVar) {
        return m4655c(i, oVar, sVar);
    }

    /* renamed from: b */
    public int mo4685b(int i, C1343o oVar, C1349s sVar) {
        return m4655c(i, oVar, sVar);
    }

    /* renamed from: a */
    private void m4643a(C1374b bVar, int i, int i2) {
        int i3 = bVar.f4945d;
        if (i == -1) {
            if (bVar.mo5274a() + i3 <= i2) {
                this.f4909n.set(bVar.f4946e, false);
            }
            return;
        }
        if (bVar.mo5280b() - i3 >= i2) {
            this.f4909n.set(bVar.f4946e, false);
        }
    }

    /* renamed from: b */
    private static int m4649b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: c */
    private int m4655c(int i, C1343o oVar, C1349s sVar) {
        if (mo5062s() == 0 || i == 0) {
            return 0;
        }
        m4651b(i, sVar);
        int a = m4635a(oVar, this.f4908m, sVar);
        if (this.f4908m.f5096b >= a) {
            if (i < 0) {
                i = -a;
            } else {
                i = a;
            }
        }
        this.f4898c.mo5517a(-i);
        this.f4910o = this.f4902g;
        this.f4908m.f5096b = 0;
        m4640a(oVar, this.f4908m);
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4657c(int r6, int r7, int r8) {
        /*
            r5 = this;
            boolean r0 = r5.f4902g
            if (r0 == 0) goto L_0x0009
            int r0 = r5.m4633I()
            goto L_0x000d
        L_0x0009:
            int r0 = r5.m4634J()
        L_0x000d:
            r1 = 8
            if (r8 != r1) goto L_0x001b
            if (r6 >= r7) goto L_0x0016
            int r2 = r7 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r6 + 1
            r3 = r2
            r2 = r7
            goto L_0x001f
        L_0x001b:
            int r2 = r6 + r7
        L_0x001d:
            r3 = r2
            r2 = r6
        L_0x001f:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r5.f4905j
            r4.mo5254b(r2)
            if (r8 == r1) goto L_0x0036
            switch(r8) {
                case 1: goto L_0x0030;
                case 2: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0041
        L_0x002a:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f4905j
            r8.mo5251a(r6, r7)
            goto L_0x0041
        L_0x0030:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f4905j
            r8.mo5255b(r6, r7)
            goto L_0x0041
        L_0x0036:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f4905j
            r1 = 1
            r8.mo5251a(r6, r1)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r5.f4905j
            r6.mo5255b(r7, r1)
        L_0x0041:
            if (r3 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r6 = r5.f4902g
            if (r6 == 0) goto L_0x004d
            int r6 = r5.m4634J()
            goto L_0x0051
        L_0x004d:
            int r6 = r5.m4633I()
        L_0x0051:
            if (r2 > r6) goto L_0x0056
            r5.mo5057n()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.StaggeredGridLayoutManager.m4657c(int, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v53 */
    /* JADX WARNING: type inference failed for: r5v54 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v1, types: [boolean, int]
      assigns: []
      uses: [boolean, int, ?[int, short, byte, char]]
      mth insns count: 201
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m4635a(android.support.p043v7.widget.RecyclerView.C1343o r17, android.support.p043v7.widget.C1414ae r18, android.support.p043v7.widget.RecyclerView.C1349s r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.BitSet r3 = r0.f4909n
            int r4 = r0.f4896a
            r5 = 0
            r6 = 1
            r3.set(r5, r4, r6)
            android.support.v7.widget.ae r3 = r0.f4908m
            boolean r3 = r3.f5103i
            if (r3 == 0) goto L_0x0020
            int r3 = r2.f5099e
            if (r3 != r6) goto L_0x001d
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002f
        L_0x001d:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x002f
        L_0x0020:
            int r3 = r2.f5099e
            if (r3 != r6) goto L_0x002a
            int r3 = r2.f5101g
            int r4 = r2.f5096b
            int r3 = r3 + r4
            goto L_0x002f
        L_0x002a:
            int r3 = r2.f5100f
            int r4 = r2.f5096b
            int r3 = r3 - r4
        L_0x002f:
            int r4 = r2.f5099e
            r0.m4660e(r4, r3)
            boolean r4 = r0.f4902g
            if (r4 == 0) goto L_0x003f
            android.support.v7.widget.ak r4 = r0.f4898c
            int r4 = r4.mo5520c()
            goto L_0x0045
        L_0x003f:
            android.support.v7.widget.ak r4 = r0.f4898c
            int r4 = r4.mo5518b()
        L_0x0045:
            r7 = 0
        L_0x0046:
            boolean r8 = r18.mo5488a(r19)
            r9 = -1
            if (r8 == 0) goto L_0x01b2
            android.support.v7.widget.ae r8 = r0.f4908m
            boolean r8 = r8.f5103i
            if (r8 != 0) goto L_0x005b
            java.util.BitSet r8 = r0.f4909n
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x01b2
        L_0x005b:
            android.view.View r7 = r2.mo5487a(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams r8 = (android.support.p043v7.widget.StaggeredGridLayoutManager.LayoutParams) r8
            int r10 = r8.bw_()
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r11 = r0.f4905j
            int r11 = r11.mo5256c(r10)
            if (r11 != r9) goto L_0x0073
            r12 = 1
            goto L_0x0074
        L_0x0073:
            r12 = 0
        L_0x0074:
            if (r12 == 0) goto L_0x0089
            boolean r11 = r8.f4918b
            if (r11 == 0) goto L_0x007f
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r11 = r0.f4897b
            r11 = r11[r5]
            goto L_0x0083
        L_0x007f:
            android.support.v7.widget.StaggeredGridLayoutManager$b r11 = r0.m4636a(r2)
        L_0x0083:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r13 = r0.f4905j
            r13.mo5252a(r10, r11)
            goto L_0x008d
        L_0x0089:
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r13 = r0.f4897b
            r11 = r13[r11]
        L_0x008d:
            r8.f4917a = r11
            int r13 = r2.f5099e
            if (r13 != r6) goto L_0x0097
            r0.mo5037b(r7)
            goto L_0x009a
        L_0x0097:
            r0.mo5038b(r7, r5)
        L_0x009a:
            r0.m4646a(r7, r8, r5)
            int r13 = r2.f5099e
            if (r13 != r6) goto L_0x00c9
            boolean r13 = r8.f4918b
            if (r13 == 0) goto L_0x00aa
            int r13 = r0.m4675p(r4)
            goto L_0x00ae
        L_0x00aa:
            int r13 = r11.mo5281b(r4)
        L_0x00ae:
            android.support.v7.widget.ak r14 = r0.f4898c
            int r14 = r14.mo5525e(r7)
            int r14 = r14 + r13
            if (r12 == 0) goto L_0x00f3
            boolean r15 = r8.f4918b
            if (r15 == 0) goto L_0x00f3
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r15 = r0.m4668l(r13)
            r15.f4922b = r9
            r15.f4921a = r10
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r0.f4905j
            r5.mo5253a(r15)
            goto L_0x00f3
        L_0x00c9:
            boolean r5 = r8.f4918b
            if (r5 == 0) goto L_0x00d3
            int r5 = r0.m4673o(r4)
        L_0x00d1:
            r14 = r5
            goto L_0x00d8
        L_0x00d3:
            int r5 = r11.mo5275a(r4)
            goto L_0x00d1
        L_0x00d8:
            android.support.v7.widget.ak r5 = r0.f4898c
            int r5 = r5.mo5525e(r7)
            int r13 = r14 - r5
            if (r12 == 0) goto L_0x00f3
            boolean r5 = r8.f4918b
            if (r5 == 0) goto L_0x00f3
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r0.m4670m(r14)
            r5.f4922b = r6
            r5.f4921a = r10
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r15 = r0.f4905j
            r15.mo5253a(r5)
        L_0x00f3:
            boolean r5 = r8.f4918b
            if (r5 == 0) goto L_0x011a
            int r5 = r2.f5098d
            if (r5 != r9) goto L_0x011a
            if (r12 != 0) goto L_0x0118
            int r5 = r2.f5099e
            if (r5 != r6) goto L_0x0107
            boolean r5 = r16.m4631G()
        L_0x0105:
            r5 = r5 ^ r6
            goto L_0x010c
        L_0x0107:
            boolean r5 = r16.m4632H()
            goto L_0x0105
        L_0x010c:
            if (r5 == 0) goto L_0x011a
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r0.f4905j
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r5.mo5257d(r10)
            if (r5 == 0) goto L_0x0118
            r5.f4924d = r6
        L_0x0118:
            r0.f4892K = r6
        L_0x011a:
            r0.m4645a(r7, r8, r2)
            boolean r5 = r16.m4671m()
            if (r5 == 0) goto L_0x014c
            int r5 = r0.f4900e
            if (r5 != r6) goto L_0x014c
            boolean r5 = r8.f4918b
            if (r5 == 0) goto L_0x0132
            android.support.v7.widget.ak r5 = r0.f4899d
            int r5 = r5.mo5520c()
            goto L_0x0143
        L_0x0132:
            android.support.v7.widget.ak r5 = r0.f4899d
            int r5 = r5.mo5520c()
            int r9 = r0.f4896a
            int r9 = r9 - r6
            int r10 = r11.f4946e
            int r9 = r9 - r10
            int r10 = r0.f4907l
            int r9 = r9 * r10
            int r5 = r5 - r9
        L_0x0143:
            android.support.v7.widget.ak r9 = r0.f4899d
            int r9 = r9.mo5525e(r7)
            int r9 = r5 - r9
            goto L_0x016d
        L_0x014c:
            boolean r5 = r8.f4918b
            if (r5 == 0) goto L_0x0158
            android.support.v7.widget.ak r5 = r0.f4899d
            int r5 = r5.mo5518b()
        L_0x0156:
            r9 = r5
            goto L_0x0166
        L_0x0158:
            int r5 = r11.f4946e
            int r9 = r0.f4907l
            int r5 = r5 * r9
            android.support.v7.widget.ak r9 = r0.f4899d
            int r9 = r9.mo5518b()
            int r5 = r5 + r9
            goto L_0x0156
        L_0x0166:
            android.support.v7.widget.ak r5 = r0.f4899d
            int r5 = r5.mo5525e(r7)
            int r5 = r5 + r9
        L_0x016d:
            int r10 = r0.f4900e
            if (r10 != r6) goto L_0x0175
            m4416b(r7, r9, r13, r5, r14)
            goto L_0x0178
        L_0x0175:
            m4416b(r7, r13, r9, r14, r5)
        L_0x0178:
            boolean r5 = r8.f4918b
            if (r5 == 0) goto L_0x0184
            android.support.v7.widget.ae r5 = r0.f4908m
            int r5 = r5.f5099e
            r0.m4660e(r5, r3)
            goto L_0x018b
        L_0x0184:
            android.support.v7.widget.ae r5 = r0.f4908m
            int r5 = r5.f5099e
            r0.m4643a(r11, r5, r3)
        L_0x018b:
            android.support.v7.widget.ae r5 = r0.f4908m
            r0.m4640a(r1, r5)
            android.support.v7.widget.ae r5 = r0.f4908m
            boolean r5 = r5.f5102h
            if (r5 == 0) goto L_0x01ae
            boolean r5 = r7.hasFocusable()
            if (r5 == 0) goto L_0x01ae
            boolean r5 = r8.f4918b
            if (r5 == 0) goto L_0x01a6
            java.util.BitSet r5 = r0.f4909n
            r5.clear()
            goto L_0x01ae
        L_0x01a6:
            java.util.BitSet r5 = r0.f4909n
            int r7 = r11.f4946e
            r8 = 0
            r5.set(r7, r8)
        L_0x01ae:
            r5 = 0
            r7 = 1
            goto L_0x0046
        L_0x01b2:
            if (r7 != 0) goto L_0x01b9
            android.support.v7.widget.ae r3 = r0.f4908m
            r0.m4640a(r1, r3)
        L_0x01b9:
            android.support.v7.widget.ae r1 = r0.f4908m
            int r1 = r1.f5099e
            if (r1 != r9) goto L_0x01d1
            android.support.v7.widget.ak r1 = r0.f4898c
            int r1 = r1.mo5518b()
            int r1 = r0.m4673o(r1)
            android.support.v7.widget.ak r3 = r0.f4898c
            int r3 = r3.mo5518b()
            int r3 = r3 - r1
            goto L_0x01e3
        L_0x01d1:
            android.support.v7.widget.ak r1 = r0.f4898c
            int r1 = r1.mo5520c()
            int r1 = r0.m4675p(r1)
            android.support.v7.widget.ak r3 = r0.f4898c
            int r3 = r3.mo5520c()
            int r3 = r1 - r3
        L_0x01e3:
            if (r3 <= 0) goto L_0x01ec
            int r1 = r2.f5096b
            int r1 = java.lang.Math.min(r1, r3)
            return r1
        L_0x01ec:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.StaggeredGridLayoutManager.m4635a(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.ae, android.support.v7.widget.RecyclerView$s):int");
    }

    /* renamed from: c */
    private void m4658c(C1343o oVar, C1349s sVar, boolean z) {
        int o = m4673o(Integer.MAX_VALUE);
        if (o != Integer.MAX_VALUE) {
            int b = o - this.f4898c.mo5518b();
            if (b > 0) {
                int c = b - m4655c(b, oVar, sVar);
                if (z && c > 0) {
                    this.f4898c.mo5517a(-c);
                }
            }
        }
    }

    /* renamed from: b */
    private void m4653b(C1343o oVar, C1349s sVar, boolean z) {
        int p = m4675p((int) DynamicTabYellowPointVersion.DEFAULT);
        if (p != Integer.MIN_VALUE) {
            int c = this.f4898c.mo5520c() - p;
            if (c > 0) {
                int i = c - (-m4655c(-c, oVar, sVar));
                if (z && i > 0) {
                    this.f4898c.mo5517a(i);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0161, code lost:
        if (mo5244g() != false) goto L_0x0165;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4639a(android.support.p043v7.widget.RecyclerView.C1343o r9, android.support.p043v7.widget.RecyclerView.C1349s r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
        L_0x0001:
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f4915t
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r2 = r8.f4912q
            r3 = -1
            if (r2 != 0) goto L_0x000c
            int r2 = r8.f4903h
            if (r2 == r3) goto L_0x0019
        L_0x000c:
            int r2 = r10.mo5115a()
            if (r2 != 0) goto L_0x0019
            r8.mo5042c(r9)
            r1.mo5270a()
            return
        L_0x0019:
            boolean r2 = r1.f4939e
            r4 = 1
            if (r2 == 0) goto L_0x0029
            int r2 = r8.f4903h
            if (r2 != r3) goto L_0x0029
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r2 = r8.f4912q
            if (r2 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            if (r2 == 0) goto L_0x0043
            r1.mo5270a()
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f4912q
            if (r5 == 0) goto L_0x0037
            r8.m4642a(r1)
            goto L_0x003e
        L_0x0037:
            r8.m4669l()
            boolean r5 = r8.f4902g
            r1.f4937c = r5
        L_0x003e:
            r8.m4641a(r10, r1)
            r1.f4939e = r4
        L_0x0043:
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f4912q
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f4903h
            if (r5 != r3) goto L_0x0060
            boolean r5 = r1.f4937c
            boolean r6 = r8.f4910o
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.m4671m()
            boolean r6 = r8.f4911p
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f4905j
            r5.mo5250a()
            r1.f4938d = r4
        L_0x0060:
            int r5 = r8.mo5062s()
            if (r5 <= 0) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f4912q
            if (r5 == 0) goto L_0x0070
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f4912q
            int r5 = r5.f4927c
            if (r5 > 0) goto L_0x00cd
        L_0x0070:
            boolean r5 = r1.f4938d
            if (r5 == 0) goto L_0x0092
            r2 = 0
        L_0x0075:
            int r5 = r8.f4896a
            if (r2 >= r5) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f4897b
            r5 = r5[r2]
            r5.mo5283c()
            int r5 = r1.f4936b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008f
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f4897b
            r5 = r5[r2]
            int r6 = r1.f4936b
            r5.mo5284c(r6)
        L_0x008f:
            int r2 = r2 + 1
            goto L_0x0075
        L_0x0092:
            if (r2 != 0) goto L_0x00b3
            android.support.v7.widget.StaggeredGridLayoutManager$a r2 = r8.f4915t
            int[] r2 = r2.f4940f
            if (r2 != 0) goto L_0x009b
            goto L_0x00b3
        L_0x009b:
            r2 = 0
        L_0x009c:
            int r5 = r8.f4896a
            if (r2 >= r5) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f4897b
            r5 = r5[r2]
            r5.mo5283c()
            android.support.v7.widget.StaggeredGridLayoutManager$a r6 = r8.f4915t
            int[] r6 = r6.f4940f
            r6 = r6[r2]
            r5.mo5284c(r6)
            int r2 = r2 + 1
            goto L_0x009c
        L_0x00b3:
            r2 = 0
        L_0x00b4:
            int r5 = r8.f4896a
            if (r2 >= r5) goto L_0x00c6
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f4897b
            r5 = r5[r2]
            boolean r6 = r8.f4902g
            int r7 = r1.f4936b
            r5.mo5279a(r6, r7)
            int r2 = r2 + 1
            goto L_0x00b4
        L_0x00c6:
            android.support.v7.widget.StaggeredGridLayoutManager$a r2 = r8.f4915t
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f4897b
            r2.mo5272a(r5)
        L_0x00cd:
            r8.mo5020a(r9)
            android.support.v7.widget.ae r2 = r8.f4908m
            r2.f5095a = r0
            r8.f4892K = r0
            android.support.v7.widget.ak r2 = r8.f4899d
            int r2 = r2.mo5524e()
            r8.m4661f(r2)
            int r2 = r1.f4935a
            r8.m4637a(r2, r10)
            boolean r2 = r1.f4937c
            if (r2 == 0) goto L_0x0104
            r8.m4667k(r3)
            android.support.v7.widget.ae r2 = r8.f4908m
            r8.m4635a(r9, r2, r10)
            r8.m4667k(r4)
            android.support.v7.widget.ae r2 = r8.f4908m
            int r3 = r1.f4935a
            android.support.v7.widget.ae r5 = r8.f4908m
            int r5 = r5.f5098d
            int r3 = r3 + r5
            r2.f5097c = r3
            android.support.v7.widget.ae r2 = r8.f4908m
            r8.m4635a(r9, r2, r10)
            goto L_0x011f
        L_0x0104:
            r8.m4667k(r4)
            android.support.v7.widget.ae r2 = r8.f4908m
            r8.m4635a(r9, r2, r10)
            r8.m4667k(r3)
            android.support.v7.widget.ae r2 = r8.f4908m
            int r3 = r1.f4935a
            android.support.v7.widget.ae r5 = r8.f4908m
            int r5 = r5.f5098d
            int r3 = r3 + r5
            r2.f5097c = r3
            android.support.v7.widget.ae r2 = r8.f4908m
            r8.m4635a(r9, r2, r10)
        L_0x011f:
            r8.m4630F()
            int r2 = r8.mo5062s()
            if (r2 <= 0) goto L_0x0139
            boolean r2 = r8.f4902g
            if (r2 == 0) goto L_0x0133
            r8.m4653b(r9, r10, r4)
            r8.m4658c(r9, r10, r0)
            goto L_0x0139
        L_0x0133:
            r8.m4658c(r9, r10, r4)
            r8.m4653b(r9, r10, r0)
        L_0x0139:
            if (r11 == 0) goto L_0x0164
            boolean r11 = r10.f4798g
            if (r11 != 0) goto L_0x0164
            int r11 = r8.f4906k
            if (r11 == 0) goto L_0x0155
            int r11 = r8.mo5062s()
            if (r11 <= 0) goto L_0x0155
            boolean r11 = r8.f4892K
            if (r11 != 0) goto L_0x0153
            android.view.View r11 = r8.m4666k()
            if (r11 == 0) goto L_0x0155
        L_0x0153:
            r11 = 1
            goto L_0x0156
        L_0x0155:
            r11 = 0
        L_0x0156:
            if (r11 == 0) goto L_0x0164
            java.lang.Runnable r11 = r8.f4895N
            r8.mo5031a(r11)
            boolean r11 = r8.mo5244g()
            if (r11 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r4 = 0
        L_0x0165:
            boolean r11 = r10.f4798g
            if (r11 == 0) goto L_0x016e
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f4915t
            r11.mo5270a()
        L_0x016e:
            boolean r11 = r1.f4937c
            r8.f4910o = r11
            boolean r11 = r8.m4671m()
            r8.f4911p = r11
            if (r4 == 0) goto L_0x0182
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f4915t
            r11.mo5270a()
            r11 = 0
            goto L_0x0001
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.StaggeredGridLayoutManager.m4639a(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s, boolean):void");
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C1336b a = m4407a(context, attributeSet, i, i2);
        int i3 = a.f4757a;
        if (i3 == 0 || i3 == 1) {
            mo4729a((String) null);
            if (i3 != this.f4900e) {
                this.f4900e = i3;
                C1422ak akVar = this.f4898c;
                this.f4898c = this.f4899d;
                this.f4899d = akVar;
                mo5057n();
            }
            mo4672a(a.f4758b);
            m4647a(a.f4759c);
            this.f4908m = new C1414ae();
            m4665j();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }
}
