package com.etsy.android.grid;

import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.p038f.C0801o;
import android.support.p030v4.view.C1056u;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListAdapter;
import android.widget.Scroller;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class ExtendableListView extends AbsListView {

    /* renamed from: A */
    private int f35059A;

    /* renamed from: B */
    private int f35060B;

    /* renamed from: C */
    private boolean f35061C;

    /* renamed from: D */
    private boolean f35062D;

    /* renamed from: E */
    private C13466a f35063E;

    /* renamed from: F */
    private int f35064F;

    /* renamed from: G */
    private C13470e f35065G;

    /* renamed from: H */
    private C13472g f35066H;

    /* renamed from: I */
    private Runnable f35067I;

    /* renamed from: J */
    private ArrayList<C13469d> f35068J;

    /* renamed from: K */
    private ArrayList<C13469d> f35069K;

    /* renamed from: L */
    private OnScrollListener f35070L;

    /* renamed from: M */
    private ListSavedState f35071M;

    /* renamed from: a */
    public int f35072a;

    /* renamed from: b */
    public int f35073b;

    /* renamed from: c */
    ListAdapter f35074c;

    /* renamed from: d */
    public int f35075d;

    /* renamed from: e */
    protected int f35076e;

    /* renamed from: f */
    public boolean f35077f;

    /* renamed from: g */
    public int f35078g;

    /* renamed from: h */
    public int f35079h;

    /* renamed from: i */
    final boolean[] f35080i;

    /* renamed from: j */
    public C13473h f35081j;

    /* renamed from: k */
    protected boolean f35082k;

    /* renamed from: l */
    public C13467b f35083l;

    /* renamed from: m */
    protected int f35084m;

    /* renamed from: n */
    protected int f35085n;

    /* renamed from: o */
    long f35086o;

    /* renamed from: p */
    long f35087p;

    /* renamed from: q */
    boolean f35088q;

    /* renamed from: r */
    private int f35089r;

    /* renamed from: s */
    private VelocityTracker f35090s;

    /* renamed from: t */
    private int f35091t;

    /* renamed from: u */
    private int f35092u;

    /* renamed from: v */
    private int f35093v;

    /* renamed from: w */
    private boolean f35094w;

    /* renamed from: x */
    private int f35095x;

    /* renamed from: y */
    private int f35096y;

    /* renamed from: z */
    private int f35097z;

    public static class ListSavedState extends ClassLoaderSavedState {
        public static final Creator<ListSavedState> CREATOR = new Creator<ListSavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ListSavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ListSavedState(parcel);
            }
        };

        /* renamed from: c */
        protected long f35101c;

        /* renamed from: d */
        protected long f35102d;

        /* renamed from: e */
        protected int f35103e;

        /* renamed from: f */
        protected int f35104f;

        /* renamed from: g */
        protected int f35105g;

        public String toString() {
            StringBuilder sb = new StringBuilder("ExtendableListView.ListSavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" selectedId=");
            sb.append(this.f35101c);
            sb.append(" firstId=");
            sb.append(this.f35102d);
            sb.append(" viewTop=");
            sb.append(this.f35103e);
            sb.append(" position=");
            sb.append(this.f35104f);
            sb.append(" height=");
            sb.append(this.f35105g);
            sb.append("}");
            return sb.toString();
        }

        public ListSavedState(Parcelable parcelable) {
            super(parcelable, AbsListView.class.getClassLoader());
        }

        public ListSavedState(Parcel parcel) {
            super(parcel);
            this.f35101c = parcel.readLong();
            this.f35102d = parcel.readLong();
            this.f35103e = parcel.readInt();
            this.f35104f = parcel.readInt();
            this.f35105g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f35101c);
            parcel.writeLong(this.f35102d);
            parcel.writeInt(this.f35103e);
            parcel.writeInt(this.f35104f);
            parcel.writeInt(this.f35105g);
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$a */
    class C13466a extends DataSetObserver {

        /* renamed from: a */
        final /* synthetic */ ExtendableListView f35106a;

        /* renamed from: b */
        private Parcelable f35107b;

        public final void onInvalidated() {
            this.f35106a.f35077f = true;
            if (this.f35106a.getAdapter().hasStableIds()) {
                this.f35107b = this.f35106a.onSaveInstanceState();
            }
            this.f35106a.f35079h = this.f35106a.f35078g;
            this.f35106a.f35078g = 0;
            this.f35106a.f35088q = false;
            this.f35106a.mo25176c();
            this.f35106a.requestLayout();
        }

        public final void onChanged() {
            this.f35106a.f35077f = true;
            this.f35106a.f35079h = this.f35106a.f35078g;
            this.f35106a.f35078g = this.f35106a.getAdapter().getCount();
            C13473h hVar = this.f35106a.f35081j;
            if (hVar.f35125d != null) {
                hVar.f35125d.mo2601d();
            }
            if (!this.f35106a.getAdapter().hasStableIds() || this.f35107b == null || this.f35106a.f35079h != 0 || this.f35106a.f35078g <= 0) {
                this.f35106a.mo25179d();
            } else {
                this.f35106a.onRestoreInstanceState(this.f35107b);
                this.f35107b = null;
            }
            this.f35106a.mo25176c();
            this.f35106a.requestLayout();
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$b */
    class C13467b extends C13474i implements Runnable {
        public final void run() {
            boolean z;
            View childAt = ExtendableListView.this.getChildAt(ExtendableListView.this.f35075d);
            if (childAt != null) {
                int i = ExtendableListView.this.f35075d;
                long itemId = ExtendableListView.this.f35074c.getItemId(ExtendableListView.this.f35075d + ExtendableListView.this.f35076e);
                if (!mo25234b() || ExtendableListView.this.f35077f) {
                    z = false;
                } else {
                    ExtendableListView extendableListView = ExtendableListView.this;
                    int i2 = i + ExtendableListView.this.f35076e;
                    OnItemLongClickListener onItemLongClickListener = extendableListView.getOnItemLongClickListener();
                    if (onItemLongClickListener != null) {
                        z = onItemLongClickListener.onItemLongClick(extendableListView, childAt, i2, itemId);
                    } else {
                        z = false;
                    }
                    if (z) {
                        extendableListView.performHapticFeedback(0);
                    }
                }
                if (z) {
                    ExtendableListView.this.f35073b = 0;
                    ExtendableListView.this.setPressed(false);
                    childAt.setPressed(false);
                    return;
                }
                ExtendableListView.this.f35073b = 5;
            }
        }

        private C13467b() {
            super();
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$c */
    final class C13468c implements Runnable {
        public final void run() {
            if (ExtendableListView.this.f35073b == 3) {
                ExtendableListView.this.f35073b = 4;
                View childAt = ExtendableListView.this.getChildAt(ExtendableListView.this.f35075d);
                if (childAt != null && !childAt.hasFocusable()) {
                    ExtendableListView.this.f35072a = 0;
                    if (!ExtendableListView.this.f35077f) {
                        ExtendableListView.this.layoutChildren();
                        childAt.setPressed(true);
                        ExtendableListView.this.setPressed(true);
                        int longPressTimeout = ViewConfiguration.getLongPressTimeout();
                        if (ExtendableListView.this.isLongClickable()) {
                            if (ExtendableListView.this.f35083l == null) {
                                ExtendableListView.this.f35083l = new C13467b();
                            }
                            ExtendableListView.this.f35083l.mo25233a();
                            ExtendableListView.this.postDelayed(ExtendableListView.this.f35083l, (long) longPressTimeout);
                        } else {
                            ExtendableListView.this.f35073b = 5;
                        }
                    } else {
                        ExtendableListView.this.f35073b = 5;
                    }
                }
            }
        }

        C13468c() {
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$d */
    public class C13469d {

        /* renamed from: a */
        public View f35110a;

        /* renamed from: b */
        public Object f35111b;

        /* renamed from: c */
        public boolean f35112c;
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$e */
    class C13470e implements Runnable {

        /* renamed from: a */
        final Scroller f35113a;

        /* renamed from: b */
        int f35114b;

        /* renamed from: a */
        public final void mo25223a() {
            this.f35114b = 0;
            ExtendableListView.this.f35073b = 0;
            ExtendableListView.this.mo25182g(0);
            ExtendableListView.this.removeCallbacks(this);
            this.f35113a.forceFinished(true);
        }

        public final void run() {
            int i;
            if (ExtendableListView.this.f35073b == 2) {
                if (ExtendableListView.this.f35078g == 0 || ExtendableListView.this.getChildCount() == 0) {
                    mo25223a();
                    return;
                }
                Scroller scroller = this.f35113a;
                boolean computeScrollOffset = scroller.computeScrollOffset();
                int currY = scroller.getCurrY();
                int i2 = this.f35114b - currY;
                if (i2 > 0) {
                    ExtendableListView.this.f35075d = ExtendableListView.this.f35076e;
                    i = Math.min(((ExtendableListView.this.getHeight() - ExtendableListView.this.getPaddingBottom()) - ExtendableListView.this.getPaddingTop()) - 1, i2);
                } else {
                    int childCount = ExtendableListView.this.getChildCount() - 1;
                    ExtendableListView.this.f35075d = ExtendableListView.this.f35076e + childCount;
                    i = Math.max(-(((ExtendableListView.this.getHeight() - ExtendableListView.this.getPaddingBottom()) - ExtendableListView.this.getPaddingTop()) - 1), i2);
                }
                boolean b = ExtendableListView.this.mo25174b(i, i);
                if (!computeScrollOffset || b) {
                    mo25223a();
                    return;
                }
                ExtendableListView.this.invalidate();
                this.f35114b = currY;
                ExtendableListView.this.mo25170a((Runnable) this);
            }
        }

        C13470e() {
            this.f35113a = new Scroller(ExtendableListView.this.getContext());
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$f */
    public static class C13471f extends LayoutParams {

        /* renamed from: a */
        boolean f35116a;

        /* renamed from: b */
        int f35117b;

        /* renamed from: c */
        long f35118c;

        /* renamed from: d */
        int f35119d;

        public C13471f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f35118c = -1;
        }

        public C13471f(int i, int i2) {
            super(i, i2);
            this.f35118c = -1;
        }

        public C13471f(int i, int i2, int i3) {
            super(-1, -2);
            this.f35118c = -1;
            this.f35119d = 0;
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$g */
    class C13472g extends C13474i implements Runnable {

        /* renamed from: a */
        int f35120a;

        public final void run() {
            if (!ExtendableListView.this.f35077f) {
                ListAdapter listAdapter = ExtendableListView.this.f35074c;
                int i = this.f35120a;
                if (listAdapter != null && ExtendableListView.this.f35078g > 0 && i != -1 && i < listAdapter.getCount() && mo25234b()) {
                    View childAt = ExtendableListView.this.getChildAt(i);
                    if (childAt != null) {
                        int i2 = i + ExtendableListView.this.f35076e;
                        ExtendableListView.this.performItemClick(childAt, i2, listAdapter.getItemId(i2));
                    }
                }
            }
        }

        private C13472g() {
            super();
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$h */
    class C13473h {

        /* renamed from: a */
        ArrayList<View>[] f35122a;

        /* renamed from: b */
        int f35123b;

        /* renamed from: c */
        ArrayList<View> f35124c;

        /* renamed from: d */
        C0801o<View> f35125d;

        /* renamed from: e */
        final /* synthetic */ ExtendableListView f35126e;

        /* renamed from: f */
        private int f35127f;

        /* renamed from: g */
        private View[] f35128g;

        /* renamed from: h */
        private ArrayList<View> f35129h;

        /* renamed from: c */
        private static boolean m27182c(int i) {
            return i >= 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo25227a() {
            if (this.f35123b == 1) {
                ArrayList<View> arrayList = this.f35124c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    this.f35126e.removeDetachedView((View) arrayList.remove((size - 1) - i), false);
                }
            } else {
                int i2 = this.f35123b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ArrayList<View> arrayList2 = this.f35122a[i3];
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        this.f35126e.removeDetachedView((View) arrayList2.remove((size2 - 1) - i4), false);
                    }
                }
            }
            if (this.f35125d != null) {
                this.f35125d.mo2601d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo25231b() {
            if (this.f35129h != null) {
                int size = this.f35129h.size();
                for (int i = 0; i < size; i++) {
                    this.f35126e.removeDetachedView((View) this.f35129h.get(i), false);
                }
                this.f35129h.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo25232c() {
            boolean z;
            View[] viewArr = this.f35128g;
            int i = 0;
            if (this.f35123b > 1) {
                z = true;
            } else {
                z = false;
            }
            ArrayList<View> arrayList = this.f35124c;
            for (int length = viewArr.length - 1; length >= 0; length--) {
                View view = viewArr[length];
                if (view != null) {
                    C13471f fVar = (C13471f) view.getLayoutParams();
                    viewArr[length] = null;
                    boolean c = C1056u.m3050c(view);
                    int i2 = fVar.f35119d;
                    if (!m27182c(i2) || c) {
                        if (i2 != -2 || c) {
                            this.f35126e.removeDetachedView(view, false);
                        }
                        if (c) {
                            if (this.f35125d == null) {
                                this.f35125d = new C0801o<>();
                            }
                            this.f35125d.mo2595b(this.f35127f + length, view);
                        }
                    } else {
                        if (z) {
                            arrayList = this.f35122a[i2];
                        }
                        fVar.f35117b = this.f35127f + length;
                        arrayList.add(view);
                    }
                }
            }
            int length2 = this.f35128g.length;
            int i3 = this.f35123b;
            ArrayList<View>[] arrayListArr = this.f35122a;
            for (int i4 = 0; i4 < i3; i4++) {
                ArrayList<View> arrayList2 = arrayListArr[i4];
                int size = arrayList2.size();
                int i5 = size - length2;
                int i6 = size - 1;
                int i7 = 0;
                while (i7 < i5) {
                    int i8 = i6 - 1;
                    this.f35126e.removeDetachedView((View) arrayList2.remove(i6), false);
                    i7++;
                    i6 = i8;
                }
            }
            if (this.f35125d != null) {
                while (i < this.f35125d.mo2596c()) {
                    if (!C1056u.m3050c((View) this.f35125d.mo2600d(i))) {
                        C0801o<View> oVar = this.f35125d;
                        if (oVar.f2726d[i] != C0801o.f2723a) {
                            oVar.f2726d[i] = C0801o.f2723a;
                            oVar.f2724b = true;
                        }
                        i--;
                    }
                    i++;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final View mo25226a(int i) {
            int i2 = i - this.f35127f;
            View[] viewArr = this.f35128g;
            if (i2 < 0 || i2 >= viewArr.length) {
                return null;
            }
            View view = viewArr[i2];
            viewArr[i2] = null;
            return view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final View mo25230b(int i) {
            if (this.f35123b == 1) {
                return ExtendableListView.m27132a(this.f35124c, i);
            }
            int itemViewType = this.f35126e.f35074c.getItemViewType(i);
            if (itemViewType < 0 || itemViewType >= this.f35122a.length) {
                return null;
            }
            return ExtendableListView.m27132a(this.f35122a[itemViewType], i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo25228a(int i, int i2) {
            if (this.f35128g.length < i) {
                this.f35128g = new View[i];
            }
            this.f35127f = i2;
            View[] viewArr = this.f35128g;
            for (int i3 = 0; i3 < i; i3++) {
                View childAt = this.f35126e.getChildAt(i3);
                C13471f fVar = (C13471f) childAt.getLayoutParams();
                if (!(fVar == null || fVar.f35119d == -2)) {
                    viewArr[i3] = childAt;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo25229a(View view, int i) {
            C13471f fVar = (C13471f) view.getLayoutParams();
            if (fVar != null) {
                fVar.f35117b = i;
                int i2 = fVar.f35119d;
                boolean c = C1056u.m3050c(view);
                if (!m27182c(i2) || c) {
                    if (i2 != -2 || c) {
                        if (this.f35129h == null) {
                            this.f35129h = new ArrayList<>();
                        }
                        this.f35129h.add(view);
                    }
                    if (c) {
                        if (this.f35125d == null) {
                            this.f35125d = new C0801o<>();
                        }
                        this.f35125d.mo2595b(i, view);
                    }
                } else if (this.f35123b == 1) {
                    this.f35124c.add(view);
                } else {
                    this.f35122a[i2].add(view);
                }
            }
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$i */
    class C13474i {

        /* renamed from: a */
        private int f35130a;

        /* renamed from: a */
        public final void mo25233a() {
            this.f35130a = ExtendableListView.this.getWindowAttachCount();
        }

        /* renamed from: b */
        public final boolean mo25234b() {
            if (!ExtendableListView.this.hasWindowFocus() || ExtendableListView.this.getWindowAttachCount() != this.f35130a) {
                return false;
            }
            return true;
        }

        private C13474i() {
        }
    }

    /* renamed from: a */
    public void mo25164a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25166a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo25173b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo25177c(int i, int i2) {
    }

    public ListAdapter getAdapter() {
        return this.f35074c;
    }

    public int getCount() {
        return this.f35078g;
    }

    public View getSelectedView() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
    }

    public void onWindowFocusChanged(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25165a(int i, int i2) {
        if (getChildCount() > 0) {
            m27155j();
            this.f35081j.mo25227a();
            this.f35077f = true;
            mo25179d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25171a(boolean z) {
        if (z) {
            m27159l(getChildCount());
            return;
        }
        int childCount = getChildCount();
        if (this.f35076e == 0 && childCount > 0) {
            int top = (getTop() - getBottom()) - getListPaddingBottom();
            int highestChildTop = getHighestChildTop() - getListPaddingTop();
            int lowestChildBottom = getLowestChildBottom();
            int i = (this.f35076e + childCount) - 1;
            if (highestChildTop > 0) {
                if (i < this.f35078g - 1 || lowestChildBottom > top) {
                    if (i == this.f35078g - 1) {
                        highestChildTop = Math.min(highestChildTop, lowestChildBottom - top);
                    }
                    mo25181f(-highestChildTop);
                    if (i < this.f35078g - 1) {
                        int i2 = i + 1;
                        m27142d(i2, mo25178d(i2));
                        m27148f();
                    }
                } else if (i == this.f35078g - 1) {
                    m27148f();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13471f mo25163a(View view) {
        return m27138b(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25169a(View view, C13471f fVar) {
        int i;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f35064F, getListPaddingLeft() + getListPaddingRight(), fVar.width);
        int i2 = fVar.height;
        if (i2 > 0) {
            i = MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            i = MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25168a(View view, int i, boolean z, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25167a(View view, int i, boolean z, int i2, int i3) {
        view.offsetLeftAndRight(i2 - view.getLeft());
        view.offsetTopAndBottom(i3 - view.getTop());
    }

    /* renamed from: a */
    public final void mo25170a(Runnable runnable) {
        C1056u.m3034a((View) this, runnable);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m27145e();
    }

    public int getFooterViewsCount() {
        return this.f35069K.size();
    }

    public int getHeaderViewsCount() {
        return this.f35068J.size();
    }

    /* renamed from: e */
    private static C13471f m27145e() {
        return new C13471f(-1, -2, 0);
    }

    /* renamed from: g */
    private boolean m27149g() {
        if (getChildCount() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m27150h() {
        if (this.f35090s == null) {
            this.f35090s = VelocityTracker.obtain();
        }
    }

    /* renamed from: i */
    private void m27152i() {
        if (this.f35090s != null) {
            this.f35090s.recycle();
            this.f35090s = null;
        }
    }

    /* renamed from: j */
    private void m27155j() {
        if (this.f35065G != null) {
            this.f35065G.mo25223a();
        }
    }

    public int getFirstVisiblePosition() {
        return Math.max(0, this.f35076e - getHeaderViewsCount());
    }

    public void requestLayout() {
        if (!this.f35062D && !this.f35094w) {
            super.requestLayout();
        }
    }

    /* renamed from: f */
    private void m27148f() {
        if (getChildCount() > 0) {
            int highestChildTop = getHighestChildTop() - getListPaddingTop();
            if (highestChildTop < 0) {
                highestChildTop = 0;
            }
            if (highestChildTop != 0) {
                mo25181f(-highestChildTop);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getFirstChildTop() {
        if (m27149g()) {
            return getChildAt(0).getTop();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getHighestChildTop() {
        if (m27149g()) {
            return getChildAt(0).getTop();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getLastChildBottom() {
        if (m27149g()) {
            return getChildAt(getChildCount() - 1).getBottom();
        }
        return 0;
    }

    public int getLastVisiblePosition() {
        int i;
        int childCount = (this.f35076e + getChildCount()) - 1;
        if (this.f35074c != null) {
            i = this.f35074c.getCount() - 1;
        } else {
            i = 0;
        }
        return Math.min(childCount, i);
    }

    /* access modifiers changed from: protected */
    public int getLowestChildBottom() {
        if (m27149g()) {
            return getChildAt(getChildCount() - 1).getBottom();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35074c != null) {
            this.f35077f = true;
            this.f35079h = this.f35078g;
            this.f35078g = this.f35074c.getCount();
        }
        this.f35061C = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35081j.mo25227a();
        if (this.f35065G != null) {
            removeCallbacks(this.f35065G);
        }
        this.f35061C = false;
    }

    /* renamed from: k */
    private void m27157k() {
        if (this.f35070L != null) {
            this.f35070L.onScroll(this, this.f35076e, getChildCount(), this.f35078g);
        }
    }

    /* renamed from: l */
    private void m27158l() {
        m27136a(this.f35068J);
        m27136a(this.f35069K);
        removeAllViewsInLayout();
        this.f35076e = 0;
        this.f35077f = false;
        this.f35081j.mo25227a();
        this.f35088q = false;
        this.f35071M = null;
        this.f35072a = 0;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void handleDataChanged() {
        super.handleDataChanged();
        int i = this.f35078g;
        if (i <= 0 || !this.f35088q) {
            this.f35072a = 1;
            this.f35088q = false;
            this.f35071M = null;
            return;
        }
        this.f35088q = false;
        this.f35071M = null;
        this.f35072a = 2;
        this.f35084m = Math.min(Math.max(0, this.f35084m), i - 1);
    }

    /* renamed from: c */
    public final void mo25176c() {
        boolean z;
        if (getAdapter() == null || getAdapter().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (isInFilterMode()) {
            z = false;
        }
        View emptyView = getEmptyView();
        if (z) {
            if (emptyView != null) {
                emptyView.setVisibility(0);
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            if (this.f35077f) {
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
            }
        } else {
            if (emptyView != null) {
                emptyView.setVisibility(8);
            }
            setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo25179d() {
        if (getChildCount() > 0) {
            this.f35088q = true;
            this.f35087p = (long) getHeight();
            View childAt = getChildAt(0);
            ListAdapter adapter = getAdapter();
            if (this.f35076e < 0 || this.f35076e >= adapter.getCount()) {
                this.f35086o = -1;
            } else {
                this.f35086o = adapter.getItemId(this.f35076e);
            }
            if (childAt != null) {
                this.f35085n = childAt.getTop();
            }
            this.f35084m = this.f35076e;
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        ListSavedState listSavedState = new ListSavedState(super.onSaveInstanceState());
        if (this.f35071M != null) {
            listSavedState.f35101c = this.f35071M.f35101c;
            listSavedState.f35102d = this.f35071M.f35102d;
            listSavedState.f35103e = this.f35071M.f35103e;
            listSavedState.f35104f = this.f35071M.f35104f;
            listSavedState.f35105g = this.f35071M.f35105g;
            return listSavedState;
        }
        if (getChildCount() <= 0 || this.f35078g <= 0) {
            z = false;
        } else {
            z = true;
        }
        listSavedState.f35101c = getSelectedItemId();
        listSavedState.f35105g = getHeight();
        if (!z || this.f35076e <= 0) {
            listSavedState.f35103e = 0;
            listSavedState.f35102d = -1;
            listSavedState.f35104f = 0;
        } else {
            listSavedState.f35103e = getChildAt(0).getTop();
            int i = this.f35076e;
            if (i >= this.f35078g) {
                i = this.f35078g - 1;
            }
            listSavedState.f35104f = i;
            listSavedState.f35102d = this.f35074c.getItemId(i);
        }
        return listSavedState;
    }

    /* access modifiers changed from: protected */
    public void layoutChildren() {
        if (!this.f35062D) {
            this.f35062D = true;
            try {
                super.layoutChildren();
                invalidate();
                if (this.f35074c == null) {
                    m27158l();
                    m27157k();
                    return;
                }
                int listPaddingTop = getListPaddingTop();
                int childCount = getChildCount();
                View view = null;
                if (this.f35072a == 0) {
                    view = getChildAt(0);
                }
                boolean z = this.f35077f;
                if (z) {
                    handleDataChanged();
                }
                if (this.f35078g == 0) {
                    m27158l();
                    m27157k();
                    this.f35062D = false;
                } else if (this.f35078g == this.f35074c.getCount()) {
                    int i = this.f35076e;
                    C13473h hVar = this.f35081j;
                    if (z) {
                        for (int i2 = 0; i2 < childCount; i2++) {
                            hVar.mo25229a(getChildAt(i2), i + i2);
                        }
                    } else {
                        hVar.mo25228a(childCount, i);
                    }
                    detachAllViewsFromParent();
                    hVar.mo25231b();
                    switch (this.f35072a) {
                        case 1:
                            this.f35076e = 0;
                            mo25164a();
                            m27148f();
                            m27156k(listPaddingTop);
                            m27148f();
                            break;
                        case 2:
                            m27147f(this.f35084m, this.f35085n);
                            break;
                        default:
                            if (childCount != 0) {
                                if (this.f35076e >= this.f35078g) {
                                    m27147f(0, listPaddingTop);
                                    break;
                                } else {
                                    int i3 = this.f35076e;
                                    if (view != null) {
                                        listPaddingTop = view.getTop();
                                    }
                                    m27147f(i3, listPaddingTop);
                                    break;
                                }
                            } else {
                                m27156k(listPaddingTop);
                                break;
                            }
                    }
                    hVar.mo25232c();
                    this.f35077f = false;
                    this.f35088q = false;
                    this.f35072a = 0;
                    m27157k();
                    this.f35062D = false;
                } else {
                    StringBuilder sb = new StringBuilder("The content of the adapter has changed but ExtendableListView did not receive a notification. Make sure the content of your adapter is not modified from a background thread, but only from the UI thread. [in ExtendableListView(");
                    sb.append(getId());
                    sb.append(", ");
                    sb.append(getClass());
                    sb.append(") with Adapter(");
                    sb.append(this.f35074c.getClass());
                    sb.append(")]");
                    throw new IllegalStateException(sb.toString());
                }
            } finally {
                this.f35062D = false;
            }
        }
    }

    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        this.f35082k = z;
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
        this.f35070L = onScrollListener;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m27152i();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* renamed from: b */
    private C13471f m27138b(View view) {
        C13471f fVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            fVar = null;
        } else if (layoutParams instanceof C13471f) {
            fVar = (C13471f) layoutParams;
        } else {
            fVar = new C13471f(layoutParams);
        }
        if (fVar == null) {
            return m27145e();
        }
        return fVar;
    }

    /* renamed from: j */
    private int m27154j(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i <= getChildAt(i2).getBottom()) {
                    return this.f35076e + i2;
                }
            }
        }
        return -1;
    }

    /* renamed from: k */
    private View m27156k(int i) {
        this.f35076e = Math.min(this.f35076e, this.f35078g - 1);
        if (this.f35076e < 0) {
            this.f35076e = 0;
        }
        return m27142d(this.f35076e, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo25162a(int i) {
        return getListPaddingLeft();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo25175c(int i) {
        int i2;
        int childCount = getChildCount();
        if (this.f35082k) {
            i2 = getListPaddingBottom();
        } else {
            i2 = 0;
        }
        if (childCount > 0) {
            return getChildAt(0).getTop();
        }
        return getHeight() - i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo25178d(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            return getChildAt(childCount - 1).getBottom();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo25180e(int i) {
        int childCount = getChildCount();
        if (childCount != 0 && childCount > 0) {
            return getChildAt(0).getTop();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo25182g(int i) {
        if (i != this.f35089r) {
            this.f35089r = i;
            if (this.f35070L != null) {
                this.f35070L.onScrollStateChanged(this, i);
            }
        }
    }

    public void setSelection(int i) {
        if (i >= 0) {
            this.f35072a = 2;
            this.f35085n = getListPaddingTop();
            this.f35076e = 0;
            if (this.f35088q) {
                this.f35084m = i;
                this.f35086o = this.f35074c.getItemId(i);
            }
            requestLayout();
        }
    }

    /* renamed from: b */
    private void m27140b(boolean z) {
        int childCount = getChildCount();
        if (z) {
            int i = this.f35076e + childCount;
            m27142d(i, mo25172b(i));
        } else {
            int i2 = this.f35076e - 1;
            m27144e(i2, mo25175c(i2));
        }
        mo25171a(z);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ListSavedState listSavedState = (ListSavedState) parcelable;
        super.onRestoreInstanceState(listSavedState.f35057b);
        this.f35077f = true;
        this.f35087p = (long) listSavedState.f35105g;
        if (listSavedState.f35102d >= 0) {
            this.f35088q = true;
            this.f35071M = listSavedState;
            this.f35086o = listSavedState.f35102d;
            this.f35084m = listSavedState.f35104f;
            this.f35085n = listSavedState.f35103e;
        }
        requestLayout();
    }

    /* renamed from: h */
    private boolean m27151h(int i) {
        int i2;
        int i3 = i - this.f35095x;
        if (Math.abs(i3) <= this.f35091t) {
            return false;
        }
        this.f35073b = 1;
        if (i3 > 0) {
            i2 = this.f35091t;
        } else {
            i2 = -this.f35091t;
        }
        this.f35097z = i2;
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f35083l);
        }
        setPressed(false);
        View childAt = getChildAt(this.f35075d - this.f35076e);
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        m27153i(i);
        return true;
    }

    /* renamed from: i */
    private void m27153i(int i) {
        int i2;
        int i3;
        int i4 = i - this.f35095x;
        int i5 = i4 - this.f35097z;
        if (this.f35059A != Integer.MIN_VALUE) {
            i2 = i - this.f35059A;
        } else {
            i2 = i5;
        }
        if (this.f35073b == 1 && i != this.f35059A) {
            if (Math.abs(i4) > this.f35091t) {
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (this.f35075d >= 0) {
                i3 = this.f35075d - this.f35076e;
            } else {
                i3 = getChildCount() / 2;
            }
            if (i2 != 0) {
                mo25174b(i5, i2);
            }
            if (getChildAt(i3) != null) {
                this.f35095x = i;
            }
            this.f35059A = i;
        }
    }

    /* renamed from: l */
    private void m27159l(int i) {
        if ((this.f35076e + i) - 1 == this.f35078g - 1 && i > 0) {
            int bottom = ((getBottom() - getTop()) - getListPaddingBottom()) - getLowestChildBottom();
            int highestChildTop = getHighestChildTop();
            if (bottom <= 0) {
                return;
            }
            if (this.f35076e > 0 || highestChildTop < getListPaddingTop()) {
                if (this.f35076e == 0) {
                    bottom = Math.min(bottom, getListPaddingTop() - highestChildTop);
                }
                mo25181f(bottom);
                if (this.f35076e > 0) {
                    int i2 = this.f35076e - 1;
                    m27144e(i2, mo25180e(i2));
                    m27148f();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo25172b(int i) {
        int i2;
        int childCount = getChildCount();
        if (this.f35082k) {
            i2 = getListPaddingTop();
        } else {
            i2 = 0;
        }
        if (childCount > 0) {
            return getChildAt(childCount - 1).getBottom();
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo25181f(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).offsetTopAndBottom(i);
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        int i;
        if (this.f35074c != null) {
            this.f35074c.unregisterDataSetObserver(this.f35063E);
        }
        if (this.f35068J.size() > 0 || this.f35069K.size() > 0) {
            this.f35074c = new C13479a(this.f35068J, this.f35069K, listAdapter);
        } else {
            this.f35074c = listAdapter;
        }
        this.f35077f = true;
        if (this.f35074c != null) {
            i = this.f35074c.getCount();
        } else {
            i = 0;
        }
        this.f35078g = i;
        if (this.f35074c != null) {
            this.f35074c.registerDataSetObserver(this.f35063E);
            C13473h hVar = this.f35081j;
            int viewTypeCount = this.f35074c.getViewTypeCount();
            if (viewTypeCount > 0) {
                ArrayList<View>[] arrayListArr = new ArrayList[viewTypeCount];
                for (int i2 = 0; i2 < viewTypeCount; i2++) {
                    arrayListArr[i2] = new ArrayList<>();
                }
                hVar.f35123b = viewTypeCount;
                hVar.f35124c = arrayListArr[0];
                hVar.f35122a = arrayListArr;
            } else {
                throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
            }
        }
        requestLayout();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.f35061C) {
            return false;
        }
        int i = action & NormalGiftView.ALPHA_255;
        if (i != 6) {
            switch (i) {
                case 0:
                    int i2 = this.f35073b;
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    this.f35060B = motionEvent.getPointerId(0);
                    int j = m27154j(y);
                    if (i2 != 2 && j >= 0) {
                        this.f35096y = x;
                        this.f35095x = y;
                        this.f35075d = j;
                        this.f35073b = 3;
                    }
                    this.f35059A = DynamicTabYellowPointVersion.DEFAULT;
                    if (this.f35090s == null) {
                        this.f35090s = VelocityTracker.obtain();
                    } else {
                        this.f35090s.clear();
                    }
                    this.f35090s.addMovement(motionEvent);
                    if (i2 == 2) {
                        return true;
                    }
                    break;
                case 1:
                case 3:
                    this.f35073b = 0;
                    this.f35060B = -1;
                    m27152i();
                    mo25182g(0);
                    break;
                case 2:
                    if (this.f35073b == 3) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f35060B);
                        if (findPointerIndex == -1) {
                            this.f35060B = motionEvent.getPointerId(0);
                            findPointerIndex = 0;
                        }
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        m27150h();
                        this.f35090s.addMovement(motionEvent);
                        if (m27151h(y2)) {
                            return true;
                        }
                    }
                    break;
            }
        } else {
            m27133a(motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    private void m27133a(MotionEvent motionEvent) {
        int i;
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f35060B) {
            if (action == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f35096y = (int) motionEvent.getX(i);
            this.f35095x = (int) motionEvent.getY(i);
            this.f35060B = motionEvent.getPointerId(i);
            m27152i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0208, code lost:
        if (r6 < 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r15 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            boolean r0 = r14.isEnabled()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            boolean r15 = r14.isClickable()
            if (r15 != 0) goto L_0x0016
            boolean r15 = r14.isLongClickable()
            if (r15 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            return r2
        L_0x0016:
            return r1
        L_0x0017:
            r14.m27150h()
            android.view.VelocityTracker r0 = r14.f35090s
            r0.addMovement(r15)
            boolean r0 = r14.m27149g()
            if (r0 != 0) goto L_0x0026
            return r2
        L_0x0026:
            int r0 = r15.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 6
            r4 = 2
            if (r0 == r3) goto L_0x0224
            r3 = -1
            r5 = 3
            switch(r0) {
                case 0: goto L_0x01be;
                case 1: goto L_0x0078;
                case 2: goto L_0x0053;
                case 3: goto L_0x0038;
                default: goto L_0x0035;
            }
        L_0x0035:
            r15 = 0
            goto L_0x0237
        L_0x0038:
            r14.f35073b = r2
            r14.setPressed(r2)
            r14.invalidate()
            android.os.Handler r15 = r14.getHandler()
            if (r15 == 0) goto L_0x004b
            com.etsy.android.grid.ExtendableListView$b r0 = r14.f35083l
            r15.removeCallbacks(r0)
        L_0x004b:
            r14.m27152i()
            r14.f35060B = r3
        L_0x0050:
            r15 = 1
            goto L_0x0237
        L_0x0053:
            int r0 = r14.f35060B
            int r0 = android.support.p030v4.view.C1044i.m2982a(r15, r0)
            if (r0 >= 0) goto L_0x005c
            goto L_0x0035
        L_0x005c:
            float r15 = android.support.p030v4.view.C1044i.m2986d(r15, r0)
            int r15 = (int) r15
            boolean r0 = r14.f35077f
            if (r0 == 0) goto L_0x0068
            r14.layoutChildren()
        L_0x0068:
            int r0 = r14.f35073b
            if (r0 == r1) goto L_0x0074
            switch(r0) {
                case 3: goto L_0x0070;
                case 4: goto L_0x0070;
                case 5: goto L_0x0070;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0050
        L_0x0070:
            r14.m27151h(r15)
            goto L_0x0050
        L_0x0074:
            r14.m27153i(r15)
            goto L_0x0050
        L_0x0078:
            int r15 = r14.f35073b
            if (r15 == r1) goto L_0x0123
            switch(r15) {
                case 3: goto L_0x0096;
                case 4: goto L_0x0096;
                case 5: goto L_0x0096;
                default: goto L_0x007f;
            }
        L_0x007f:
            r14.setPressed(r2)
            r14.invalidate()
            android.os.Handler r15 = r14.getHandler()
            if (r15 == 0) goto L_0x0090
            com.etsy.android.grid.ExtendableListView$b r0 = r14.f35083l
            r15.removeCallbacks(r0)
        L_0x0090:
            r14.m27152i()
            r14.f35060B = r3
            goto L_0x0050
        L_0x0096:
            int r15 = r14.f35075d
            if (r15 < 0) goto L_0x011f
            android.view.View r0 = r14.getChildAt(r15)
            if (r0 == 0) goto L_0x011f
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x011f
            int r3 = r14.f35073b
            if (r3 == r5) goto L_0x00ad
            r0.setPressed(r2)
        L_0x00ad:
            com.etsy.android.grid.ExtendableListView$g r3 = r14.f35066H
            if (r3 != 0) goto L_0x00bc
            r14.invalidate()
            com.etsy.android.grid.ExtendableListView$g r3 = new com.etsy.android.grid.ExtendableListView$g
            r6 = 0
            r3.<init>()
            r14.f35066H = r3
        L_0x00bc:
            com.etsy.android.grid.ExtendableListView$g r3 = r14.f35066H
            r3.f35120a = r15
            r3.mo25233a()
            int r6 = r14.f35073b
            r7 = 4
            if (r6 == r5) goto L_0x00df
            int r6 = r14.f35073b
            if (r6 != r7) goto L_0x00cd
            goto L_0x00df
        L_0x00cd:
            boolean r0 = r14.f35077f
            if (r0 != 0) goto L_0x011f
            if (r15 < 0) goto L_0x011f
            android.widget.ListAdapter r0 = r14.f35074c
            boolean r15 = r0.isEnabled(r15)
            if (r15 == 0) goto L_0x011f
            r14.post(r3)
            goto L_0x011f
        L_0x00df:
            android.os.Handler r6 = r14.getHandler()
            if (r6 == 0) goto L_0x00f1
            int r8 = r14.f35073b
            if (r8 != r5) goto L_0x00ec
            java.lang.Runnable r5 = r14.f35067I
            goto L_0x00ee
        L_0x00ec:
            com.etsy.android.grid.ExtendableListView$b r5 = r14.f35083l
        L_0x00ee:
            r6.removeCallbacks(r5)
        L_0x00f1:
            r14.f35072a = r2
            boolean r5 = r14.f35077f
            if (r5 != 0) goto L_0x011b
            if (r15 < 0) goto L_0x011b
            android.widget.ListAdapter r5 = r14.f35074c
            boolean r15 = r5.isEnabled(r15)
            if (r15 == 0) goto L_0x011b
            r14.f35073b = r7
            r14.layoutChildren()
            r0.setPressed(r1)
            r14.setPressed(r1)
            com.etsy.android.grid.ExtendableListView$1 r15 = new com.etsy.android.grid.ExtendableListView$1
            r15.<init>(r0, r3)
            int r0 = android.view.ViewConfiguration.getPressedStateDuration()
            long r5 = (long) r0
            r14.postDelayed(r15, r5)
            goto L_0x0050
        L_0x011b:
            r14.f35073b = r2
            goto L_0x0050
        L_0x011f:
            r14.f35073b = r2
            goto L_0x0050
        L_0x0123:
            boolean r15 = r14.m27149g()
            if (r15 == 0) goto L_0x01b4
            int r15 = r14.getFirstChildTop()
            int r0 = r14.getLastChildBottom()
            int r3 = r14.f35076e
            if (r3 != 0) goto L_0x0153
            int r3 = r14.getListPaddingTop()
            if (r15 < r3) goto L_0x0153
            int r15 = r14.f35076e
            int r3 = r14.getChildCount()
            int r15 = r15 + r3
            int r3 = r14.f35078g
            if (r15 >= r3) goto L_0x0153
            int r15 = r14.getHeight()
            int r3 = r14.getListPaddingBottom()
            int r15 = r15 - r3
            if (r0 > r15) goto L_0x0153
            r15 = 1
            goto L_0x0154
        L_0x0153:
            r15 = 0
        L_0x0154:
            if (r15 != 0) goto L_0x01b4
            android.view.VelocityTracker r15 = r14.f35090s
            r0 = 1000(0x3e8, float:1.401E-42)
            int r3 = r14.f35092u
            float r3 = (float) r3
            r15.computeCurrentVelocity(r0, r3)
            android.view.VelocityTracker r15 = r14.f35090s
            int r0 = r14.f35060B
            float r15 = r15.getYVelocity(r0)
            float r0 = java.lang.Math.abs(r15)
            int r3 = r14.f35093v
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b4
            com.etsy.android.grid.ExtendableListView$e r0 = r14.f35065G
            if (r0 != 0) goto L_0x017e
            com.etsy.android.grid.ExtendableListView$e r0 = new com.etsy.android.grid.ExtendableListView$e
            r0.<init>()
            r14.f35065G = r0
        L_0x017e:
            com.etsy.android.grid.ExtendableListView$e r0 = r14.f35065G
            float r15 = -r15
            int r9 = (int) r15
            if (r9 >= 0) goto L_0x018b
            r15 = 2147483647(0x7fffffff, float:NaN)
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x018c
        L_0x018b:
            r7 = 0
        L_0x018c:
            r0.f35114b = r7
            android.widget.Scroller r15 = r0.f35113a
            r15.forceFinished(r1)
            android.widget.Scroller r5 = r0.f35113a
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 0
            r13 = 2147483647(0x7fffffff, float:NaN)
            r5.fling(r6, r7, r8, r9, r10, r11, r12, r13)
            com.etsy.android.grid.ExtendableListView r15 = com.etsy.android.grid.ExtendableListView.this
            r15.f35073b = r4
            com.etsy.android.grid.ExtendableListView r15 = com.etsy.android.grid.ExtendableListView.this
            r15.mo25170a(r0)
            r14.f35073b = r4
            r14.f35095x = r2
            r14.invalidate()
            goto L_0x0050
        L_0x01b4:
            r14.m27155j()
            r14.m27152i()
            r14.f35073b = r2
            goto L_0x0050
        L_0x01be:
            float r0 = r15.getX()
            int r0 = (int) r0
            float r3 = r15.getY()
            int r3 = (int) r3
            int r6 = r14.pointToPosition(r0, r3)
            android.view.VelocityTracker r7 = r14.f35090s
            r7.clear()
            int r7 = android.support.p030v4.view.C1044i.m2984b(r15, r2)
            r14.f35060B = r7
            int r7 = r14.f35073b
            if (r7 == r4) goto L_0x020c
            boolean r7 = r14.f35077f
            if (r7 != 0) goto L_0x020c
            if (r6 < 0) goto L_0x020c
            android.widget.ListAdapter r7 = r14.getAdapter()
            boolean r7 = r7.isEnabled(r6)
            if (r7 == 0) goto L_0x020c
            r14.f35073b = r5
            java.lang.Runnable r5 = r14.f35067I
            if (r5 != 0) goto L_0x01f8
            com.etsy.android.grid.ExtendableListView$c r5 = new com.etsy.android.grid.ExtendableListView$c
            r5.<init>()
            r14.f35067I = r5
        L_0x01f8:
            java.lang.Runnable r5 = r14.f35067I
            int r7 = android.view.ViewConfiguration.getTapTimeout()
            long r7 = (long) r7
            r14.postDelayed(r5, r7)
            int r15 = r15.getEdgeFlags()
            if (r15 == 0) goto L_0x0218
            if (r6 >= 0) goto L_0x0218
            goto L_0x0035
        L_0x020c:
            int r15 = r14.f35073b
            if (r15 != r4) goto L_0x0218
            r14.f35073b = r1
            r14.f35097z = r2
            int r6 = r14.m27154j(r3)
        L_0x0218:
            r14.f35096y = r0
            r14.f35095x = r3
            r14.f35075d = r6
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r14.f35059A = r15
            goto L_0x0050
        L_0x0224:
            r14.m27133a(r15)
            int r15 = r14.f35096y
            int r0 = r14.f35095x
            int r15 = r14.pointToPosition(r15, r0)
            if (r15 < 0) goto L_0x0233
            r14.f35075d = r15
        L_0x0233:
            r14.f35059A = r0
            goto L_0x0050
        L_0x0237:
            int r0 = r14.f35073b
            switch(r0) {
                case 0: goto L_0x0245;
                case 1: goto L_0x0241;
                case 2: goto L_0x023d;
                default: goto L_0x023c;
            }
        L_0x023c:
            goto L_0x0248
        L_0x023d:
            r14.mo25182g(r4)
            goto L_0x0248
        L_0x0241:
            r14.mo25182g(r1)
            goto L_0x0248
        L_0x0245:
            r14.mo25182g(r2)
        L_0x0248:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.grid.ExtendableListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private static void m27136a(ArrayList<C13469d> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ViewGroup.LayoutParams layoutParams = ((C13469d) it.next()).f35110a.getLayoutParams();
                if (layoutParams instanceof C13471f) {
                    ((C13471f) layoutParams).f35116a = false;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        this.f35064F = i;
    }

    /* renamed from: d */
    private View m27142d(int i, int i2) {
        int height = getHeight();
        if (this.f35082k) {
            height -= getListPaddingBottom();
        }
        while (i2 < height && i < this.f35078g) {
            m27130a(i, i2, true, false);
            i++;
            i2 = mo25178d(i);
        }
        return null;
    }

    /* renamed from: e */
    private View m27144e(int i, int i2) {
        int i3;
        if (this.f35082k) {
            i3 = getListPaddingTop();
        } else {
            i3 = 0;
        }
        while (true) {
            if ((i2 > i3 || mo25173b()) && i >= 0) {
                m27130a(i, i2, false, false);
                i--;
                i2 = mo25180e(i);
            }
        }
        this.f35076e = i + 1;
        return null;
    }

    /* renamed from: f */
    private View m27147f(int i, int i2) {
        m27130a(i, i2, true, false);
        this.f35076e = i;
        int i3 = i - 1;
        int e = mo25180e(i3);
        int i4 = i + 1;
        int d = mo25178d(i4);
        m27144e(i3, e);
        m27148f();
        m27142d(i4, d);
        int childCount = getChildCount();
        if (childCount > 0) {
            m27159l(childCount);
        }
        return null;
    }

    /* renamed from: a */
    private View m27131a(int i, boolean[] zArr) {
        zArr[0] = false;
        View b = this.f35081j.mo25230b(i);
        if (b == null) {
            return this.f35074c.getView(i, null, this);
        }
        View view = this.f35074c.getView(i, b, this);
        if (view != b) {
            this.f35081j.mo25229a(b, i);
            return view;
        }
        zArr[0] = true;
        return view;
    }

    /* renamed from: a */
    static View m27132a(ArrayList<View> arrayList, int i) {
        int size = arrayList.size();
        if (size <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) arrayList.get(i2);
            if (((C13471f) view.getLayoutParams()).f35117b == i) {
                arrayList.remove(i2);
                return view;
            }
        }
        return (View) arrayList.remove(size - 1);
    }

    /* renamed from: b */
    public final boolean mo25174b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        int i6;
        int i7;
        int i8 = i2;
        if (!m27149g()) {
            return true;
        }
        int highestChildTop = getHighestChildTop();
        int lowestChildBottom = getLowestChildBottom();
        if (this.f35082k) {
            i4 = getListPaddingTop();
            i3 = getListPaddingBottom();
        } else {
            i4 = 0;
            i3 = 0;
        }
        int height = getHeight();
        int firstChildTop = i4 - getFirstChildTop();
        int lastChildBottom = getLastChildBottom() - (height - i3);
        int listPaddingBottom = (height - getListPaddingBottom()) - getListPaddingTop();
        if (i8 < 0) {
            i5 = Math.max(-(listPaddingBottom - 1), i8);
        } else {
            i5 = Math.min(listPaddingBottom - 1, i8);
        }
        int i9 = this.f35076e;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom2 = height - getListPaddingBottom();
        int childCount = getChildCount();
        if (i9 != 0 || highestChildTop < listPaddingTop || i5 < 0) {
            z = false;
        } else {
            z = true;
        }
        if (i9 + childCount != this.f35078g || lowestChildBottom > listPaddingBottom2 || i5 > 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            if (i5 != 0) {
                return true;
            }
            return false;
        } else if (!z2) {
            if (i5 < 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int headerViewsCount = getHeaderViewsCount();
            int footerViewsCount = this.f35078g - getFooterViewsCount();
            if (!z3) {
                int i10 = height - i5;
                if (this.f35082k) {
                    i10 -= getListPaddingBottom();
                }
                i7 = 0;
                int i11 = 0;
                for (int i12 = childCount - 1; i12 >= 0; i12--) {
                    View childAt = getChildAt(i12);
                    if (childAt.getTop() <= i10) {
                        break;
                    }
                    i11 = i6 + 1;
                    int i13 = i9 + i12;
                    if (i13 >= headerViewsCount && i13 < footerViewsCount) {
                        this.f35081j.mo25229a(childAt, i13);
                    }
                    i7 = i12;
                }
            } else {
                int i14 = -i5;
                if (this.f35082k) {
                    i14 += getListPaddingTop();
                }
                i6 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt2 = getChildAt(i15);
                    if (childAt2.getBottom() >= i14) {
                        break;
                    }
                    i6++;
                    int i16 = i9 + i15;
                    if (i16 >= headerViewsCount && i16 < footerViewsCount) {
                        this.f35081j.mo25229a(childAt2, i16);
                    }
                }
                i7 = 0;
            }
            this.f35062D = true;
            if (i6 > 0) {
                detachViewsFromParent(i7, i6);
                this.f35081j.mo25231b();
                mo25177c(i7, i6);
            }
            if (!awakenScrollBars()) {
                invalidate();
            }
            mo25181f(i5);
            if (z3) {
                this.f35076e += i6;
            }
            int abs = Math.abs(i5);
            if (firstChildTop < abs || lastChildBottom < abs) {
                m27140b(z3);
            }
            this.f35062D = false;
            m27157k();
            return false;
        } else if (i5 != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo25165a(i, i2);
    }

    /* renamed from: a */
    private View m27130a(int i, int i2, boolean z, boolean z2) {
        mo25166a(i, z);
        if (!this.f35077f) {
            View a = this.f35081j.mo25226a(i);
            if (a != null) {
                m27134a(a, i, i2, z, false, true);
                return a;
            }
        }
        View a2 = m27131a(i, this.f35080i);
        m27134a(a2, i, i2, z, false, this.f35080i[0]);
        return a2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f35074c != null) {
            if (z) {
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    getChildAt(i5).forceLayout();
                }
                C13473h hVar = this.f35081j;
                if (hVar.f35123b == 1) {
                    ArrayList<View> arrayList = hVar.f35124c;
                    int size = arrayList.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        ((View) arrayList.get(i6)).forceLayout();
                    }
                } else {
                    int i7 = hVar.f35123b;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ArrayList<View> arrayList2 = hVar.f35122a[i8];
                        int size2 = arrayList2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            ((View) arrayList2.get(i9)).forceLayout();
                        }
                    }
                }
                if (hVar.f35125d != null) {
                    int c = hVar.f35125d.mo2596c();
                    for (int i10 = 0; i10 < c; i10++) {
                        ((View) hVar.f35125d.mo2600d(i10)).forceLayout();
                    }
                }
            }
            this.f35094w = true;
            layoutChildren();
            this.f35094w = false;
        }
    }

    /* renamed from: a */
    private void m27134a(View view, int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        C13471f fVar;
        int i3;
        View view2 = view;
        int i4 = i;
        boolean isSelected = view.isSelected();
        int i5 = this.f35073b;
        if (i5 <= 3 || i5 > 0 || this.f35075d != i4) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4 != view.isPressed()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z3 || isSelected || view.isLayoutRequested()) {
            z6 = true;
        } else {
            z6 = false;
        }
        int itemViewType = this.f35074c.getItemViewType(i4);
        if (itemViewType == -2) {
            fVar = m27138b(view);
        } else {
            fVar = mo25163a(view);
        }
        fVar.f35119d = itemViewType;
        fVar.f35117b = i4;
        int i6 = -1;
        if (z3 || (fVar.f35116a && fVar.f35119d == -2)) {
            if (!z) {
                i6 = 0;
            }
            attachViewToParent(view, i6, fVar);
        } else {
            if (fVar.f35119d == -2) {
                fVar.f35116a = true;
            }
            if (!z) {
                i6 = 0;
            }
            addViewInLayout(view, i6, fVar, true);
        }
        if (isSelected) {
            view.setSelected(false);
        }
        if (z5) {
            view.setPressed(z4);
        }
        if (z6) {
            mo25169a(view, fVar);
        } else {
            cleanupLayoutState(view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (z) {
            i3 = i2;
        } else {
            i3 = i2 - measuredHeight;
        }
        int a = mo25162a(i4);
        if (z6) {
            mo25168a(view, i, z, a, i3, a + measuredWidth, i3 + measuredHeight);
            return;
        }
        mo25167a(view, i, z, a, i3);
    }
}
