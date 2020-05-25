package com.etsy.android.grid;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import com.etsy.android.grid.ExtendableListView.C13471f;
import com.etsy.android.grid.ExtendableListView.ListSavedState;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.Arrays;

public final class StaggeredGridView extends ExtendableListView {

    /* renamed from: A */
    private int f35132A;

    /* renamed from: B */
    private int f35133B;

    /* renamed from: C */
    private int[] f35134C;

    /* renamed from: D */
    private int[] f35135D;

    /* renamed from: E */
    private int[] f35136E;

    /* renamed from: F */
    private int f35137F;

    /* renamed from: r */
    private int f35138r;

    /* renamed from: s */
    private int f35139s;

    /* renamed from: t */
    private int f35140t;

    /* renamed from: u */
    private boolean f35141u;

    /* renamed from: v */
    private int f35142v;

    /* renamed from: w */
    private int f35143w;

    /* renamed from: x */
    private SparseArray<GridItemRecord> f35144x;

    /* renamed from: y */
    private int f35145y;

    /* renamed from: z */
    private int f35146z;

    static class GridItemRecord implements Parcelable {
        public static final Creator<GridItemRecord> CREATOR = new Creator<GridItemRecord>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new GridItemRecord[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new GridItemRecord(parcel);
            }
        };

        /* renamed from: a */
        int f35147a;

        /* renamed from: b */
        double f35148b;

        /* renamed from: c */
        boolean f35149c;

        GridItemRecord() {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GridItemRecord.ListSavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" column:");
            sb.append(this.f35147a);
            sb.append(" heightRatio:");
            sb.append(this.f35148b);
            sb.append(" isHeaderFooter:");
            sb.append(this.f35149c);
            sb.append("}");
            return sb.toString();
        }

        private GridItemRecord(Parcel parcel) {
            this.f35147a = parcel.readInt();
            this.f35148b = parcel.readDouble();
            boolean z = true;
            if (parcel.readByte() != 1) {
                z = false;
            }
            this.f35149c = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f35147a);
            parcel.writeDouble(this.f35148b);
            parcel.writeByte(this.f35149c ? (byte) 1 : 0);
        }
    }

    public static class GridListSavedState extends ListSavedState {
        public static final Creator<GridListSavedState> CREATOR = new Creator<GridListSavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new GridListSavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new GridListSavedState(parcel);
            }
        };

        /* renamed from: h */
        int f35150h;

        /* renamed from: i */
        int[] f35151i;

        /* renamed from: j */
        SparseArray f35152j;

        public String toString() {
            StringBuilder sb = new StringBuilder("StaggeredGridView.GridListSavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("}");
            return sb.toString();
        }

        public GridListSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public GridListSavedState(Parcel parcel) {
            int i;
            super(parcel);
            this.f35150h = parcel.readInt();
            if (this.f35150h >= 0) {
                i = this.f35150h;
            } else {
                i = 0;
            }
            this.f35151i = new int[i];
            parcel.readIntArray(this.f35151i);
            this.f35152j = parcel.readSparseArray(GridItemRecord.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f35150h);
            parcel.writeIntArray(this.f35151i);
            parcel.writeSparseArray(this.f35152j);
        }
    }

    /* renamed from: com.etsy.android.grid.StaggeredGridView$a */
    public static class C13478a extends C13471f {

        /* renamed from: e */
        int f35153e;

        /* renamed from: a */
        private void m27227a() {
            if (this.width != -1) {
                this.width = -1;
            }
            if (this.height == -1) {
                this.height = -2;
            }
        }

        public C13478a(LayoutParams layoutParams) {
            super(layoutParams);
            m27227a();
        }

        public C13478a(int i, int i2) {
            super(i, -2);
            m27227a();
        }
    }

    private int getChildBottomMargin() {
        return this.f35139s;
    }

    public final int getColumnWidth() {
        return this.f35140t;
    }

    public final int getDistanceToTop() {
        return this.f35137F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25169a(View view, C13471f fVar) {
        int i;
        int i2 = fVar.f35119d;
        int i3 = fVar.f35117b;
        if (i2 == -2 || i2 == -1) {
            super.mo25169a(view, fVar);
        } else {
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f35140t, 1073741824);
            if (fVar.height > 0) {
                i = MeasureSpec.makeMeasureSpec(fVar.height, 1073741824);
            } else {
                i = MeasureSpec.makeMeasureSpec(-2, 0);
            }
            view.measure(makeMeasureSpec, i);
        }
        int b = m27192b(view);
        GridItemRecord l = m27208l(i3);
        double d = (double) b;
        double d2 = (double) this.f35140t;
        Double.isNaN(d);
        Double.isNaN(d2);
        l.f35148b = d / d2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25171a(boolean z) {
        super.mo25171a(z);
        if (!z && this.f35076e == getHeaderViewsCount()) {
            int[] highestNonHeaderTops = getHighestNonHeaderTops();
            int i = Integer.MAX_VALUE;
            boolean z2 = true;
            int i2 = -1;
            for (int i3 = 0; i3 < highestNonHeaderTops.length; i3++) {
                if (z2 && i3 > 0 && highestNonHeaderTops[i3] != i) {
                    z2 = false;
                }
                if (highestNonHeaderTops[i3] < i) {
                    i = highestNonHeaderTops[i3];
                    i2 = i3;
                }
            }
            if (!z2) {
                for (int i4 = 0; i4 < highestNonHeaderTops.length; i4++) {
                    if (i4 != i2) {
                        int i5 = i - highestNonHeaderTops[i4];
                        int childCount = getChildCount();
                        for (int i6 = 0; i6 < childCount; i6++) {
                            View childAt = getChildAt(i6);
                            if (childAt != null && childAt.getLayoutParams() != null && (childAt.getLayoutParams() instanceof C13478a) && ((C13478a) childAt.getLayoutParams()).f35153e == i4) {
                                childAt.offsetTopAndBottom(i5);
                            }
                        }
                        m27197f(i5, i4);
                    }
                }
                invalidate();
            }
        }
    }

    /* renamed from: h */
    private void m27201h() {
        m27202i();
        m27205j();
    }

    public final int getRowPaddingBottom() {
        return getListPaddingBottom() + this.f35133B;
    }

    public final int getRowPaddingLeft() {
        return getListPaddingLeft() + this.f35145y;
    }

    public final int getRowPaddingRight() {
        return getListPaddingRight() + this.f35146z;
    }

    public final int getRowPaddingTop() {
        return getListPaddingTop() + this.f35132A;
    }

    private int getHighestPositionedBottom() {
        return this.f35135D[getHighestPositionedBottomColumn()];
    }

    private int getHighestPositionedTop() {
        return this.f35134C[getHighestPositionedTopColumn()];
    }

    private int getLowestPositionedBottom() {
        return this.f35135D[getLowestPositionedBottomColumn()];
    }

    private int getLowestPositionedTop() {
        return this.f35134C[getLowestPositionedTopColumn()];
    }

    /* renamed from: i */
    private void m27202i() {
        Arrays.fill(this.f35134C, getPaddingTop() + this.f35132A);
    }

    /* renamed from: j */
    private void m27205j() {
        Arrays.fill(this.f35135D, getPaddingTop() + this.f35132A);
    }

    /* renamed from: e */
    private boolean m27195e() {
        if (getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m27196f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                childAt.requestLayout();
            }
        }
    }

    private int getHighestPositionedBottomColumn() {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f35138r; i3++) {
            int i4 = this.f35135D[i3];
            if (i4 < i) {
                i2 = i3;
                i = i4;
            }
        }
        return i2;
    }

    private int getHighestPositionedTopColumn() {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f35138r; i3++) {
            int i4 = this.f35134C[i3];
            if (i4 < i) {
                i2 = i3;
                i = i4;
            }
        }
        return i2;
    }

    private int getLowestPositionedBottomColumn() {
        int i = DynamicTabYellowPointVersion.DEFAULT;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f35138r; i3++) {
            int i4 = this.f35135D[i3];
            if (i4 > i) {
                i2 = i3;
                i = i4;
            }
        }
        return i2;
    }

    private int getLowestPositionedTopColumn() {
        int i = DynamicTabYellowPointVersion.DEFAULT;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f35138r; i3++) {
            int i4 = this.f35134C[i3];
            if (i4 > i) {
                i2 = i3;
                i = i4;
            }
        }
        return i2;
    }

    /* renamed from: k */
    private void m27207k() {
        for (int i = 0; i < this.f35138r; i++) {
            this.f35136E[i] = m27206k(i);
        }
    }

    /* access modifiers changed from: protected */
    public final int getFirstChildTop() {
        if (m27210n(this.f35076e)) {
            return super.getFirstChildTop();
        }
        return getLowestPositionedTop();
    }

    /* access modifiers changed from: protected */
    public final int getHighestChildTop() {
        if (m27210n(this.f35076e)) {
            return super.getHighestChildTop();
        }
        return getHighestPositionedTop();
    }

    /* access modifiers changed from: protected */
    public final int getLastChildBottom() {
        if (m27210n(this.f35076e + (getChildCount() - 1))) {
            return super.getLastChildBottom();
        }
        return getHighestPositionedBottom();
    }

    /* access modifiers changed from: protected */
    public final int getLowestChildBottom() {
        if (m27210n(this.f35076e + (getChildCount() - 1))) {
            return super.getLowestChildBottom();
        }
        return getLowestPositionedBottom();
    }

    /* access modifiers changed from: protected */
    public final void layoutChildren() {
        if (!this.f35141u) {
            Arrays.fill(this.f35135D, 0);
        } else {
            this.f35141u = false;
        }
        System.arraycopy(this.f35134C, 0, this.f35135D, 0, this.f35138r);
        super.layoutChildren();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25173b() {
        int i;
        if (this.f35082k) {
            i = getRowPaddingTop();
        } else {
            i = 0;
        }
        if (getLowestPositionedTop() > i) {
            return true;
        }
        return false;
    }

    private int[] getHighestNonHeaderTops() {
        int[] iArr = new int[this.f35138r];
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt == null || childAt.getLayoutParams() == null || !(childAt.getLayoutParams() instanceof C13478a))) {
                    C13478a aVar = (C13478a) childAt.getLayoutParams();
                    if (aVar.f35119d != -2 && childAt.getTop() < iArr[aVar.f35153e]) {
                        iArr[aVar.f35153e] = childAt.getTop();
                    }
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public final void mo25164a() {
        if (this.f35138r > 0) {
            if (this.f35134C == null) {
                this.f35134C = new int[this.f35138r];
            }
            if (this.f35135D == null) {
                this.f35135D = new int[this.f35138r];
            }
            m27201h();
            this.f35144x.clear();
            this.f35141u = false;
            this.f35137F = 0;
            setSelection(0);
        }
    }

    public final Parcelable onSaveInstanceState() {
        boolean z;
        ListSavedState listSavedState = (ListSavedState) super.onSaveInstanceState();
        GridListSavedState gridListSavedState = new GridListSavedState(listSavedState.f35057b);
        gridListSavedState.f35101c = listSavedState.f35101c;
        gridListSavedState.f35102d = listSavedState.f35102d;
        gridListSavedState.f35103e = listSavedState.f35103e;
        gridListSavedState.f35104f = listSavedState.f35104f;
        gridListSavedState.f35105g = listSavedState.f35105g;
        int i = 0;
        if (getChildCount() <= 0 || getCount() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z || this.f35076e <= 0) {
            if (this.f35138r >= 0) {
                i = this.f35138r;
            }
            gridListSavedState.f35150h = i;
            gridListSavedState.f35151i = new int[gridListSavedState.f35150h];
            gridListSavedState.f35152j = new SparseArray();
        } else {
            gridListSavedState.f35150h = this.f35138r;
            gridListSavedState.f35151i = this.f35134C;
            gridListSavedState.f35152j = this.f35144x;
        }
        return gridListSavedState;
    }

    /* renamed from: g */
    private void m27198g() {
        int min = Math.min(this.f35084m, getCount() - 1);
        SparseArray sparseArray = new SparseArray(min);
        for (int i = 0; i < min; i++) {
            GridItemRecord gridItemRecord = (GridItemRecord) this.f35144x.get(i);
            if (gridItemRecord == null) {
                break;
            }
            sparseArray.append(i, Double.valueOf(gridItemRecord.f35148b));
        }
        this.f35144x.clear();
        for (int i2 = 0; i2 < min; i2++) {
            Double d = (Double) sparseArray.get(i2);
            if (d == null) {
                break;
            }
            GridItemRecord l = m27208l(i2);
            double d2 = (double) this.f35140t;
            double doubleValue = d.doubleValue();
            Double.isNaN(d2);
            int i3 = (int) (d2 * doubleValue);
            l.f35148b = d.doubleValue();
            if (m27210n(i2)) {
                int lowestPositionedBottom = getLowestPositionedBottom();
                int i4 = i3 + lowestPositionedBottom;
                for (int i5 = 0; i5 < this.f35138r; i5++) {
                    this.f35134C[i5] = lowestPositionedBottom;
                    this.f35135D[i5] = i4;
                }
            } else {
                int highestPositionedBottomColumn = getHighestPositionedBottomColumn();
                int i6 = this.f35135D[highestPositionedBottomColumn];
                int h = i3 + i6 + m27200h(i2) + getChildBottomMargin();
                this.f35134C[highestPositionedBottomColumn] = i6;
                this.f35135D[highestPositionedBottomColumn] = h;
                l.f35147a = highestPositionedBottomColumn;
            }
        }
        int highestPositionedBottomColumn2 = getHighestPositionedBottomColumn();
        m27199g(min, highestPositionedBottomColumn2);
        int i7 = -this.f35135D[highestPositionedBottomColumn2];
        m27203i(this.f35085n + i7);
        this.f35137F = i7;
        System.arraycopy(this.f35135D, 0, this.f35134C, 0, this.f35138r);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
    }

    public final void setItemMargin(int i) {
        this.f35139s = i;
    }

    /* renamed from: b */
    private static int m27192b(View view) {
        return view.getMeasuredHeight();
    }

    private void setPositionIsHeaderFooter(int i) {
        m27208l(i).f35149c = true;
    }

    /* renamed from: k */
    private int m27206k(int i) {
        return getRowPaddingLeft() + this.f35139s + ((this.f35139s + this.f35140t) * i);
    }

    /* renamed from: m */
    private int m27209m(int i) {
        GridItemRecord gridItemRecord = (GridItemRecord) this.f35144x.get(i, null);
        if (gridItemRecord != null) {
            return gridItemRecord.f35147a;
        }
        return -1;
    }

    /* renamed from: n */
    private boolean m27210n(int i) {
        if (this.f35074c.getItemViewType(i) == -2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo25181f(int i) {
        super.mo25181f(i);
        m27203i(i);
        this.f35137F += i;
    }

    /* renamed from: h */
    private int m27200h(int i) {
        boolean z;
        if (i < getHeaderViewsCount() + this.f35138r) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f35139s;
        }
        return 0;
    }

    /* renamed from: i */
    private void m27203i(int i) {
        if (i != 0) {
            for (int i2 = 0; i2 < this.f35138r; i2++) {
                m27197f(i, i2);
            }
        }
    }

    /* renamed from: j */
    private int m27204j(int i) {
        return ((i - (getRowPaddingLeft() + getRowPaddingRight())) - (this.f35139s * (this.f35138r + 1))) / this.f35138r;
    }

    /* renamed from: l */
    private GridItemRecord m27208l(int i) {
        GridItemRecord gridItemRecord = (GridItemRecord) this.f35144x.get(i, null);
        if (gridItemRecord != null) {
            return gridItemRecord;
        }
        GridItemRecord gridItemRecord2 = new GridItemRecord();
        this.f35144x.append(i, gridItemRecord2);
        return gridItemRecord2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo25162a(int i) {
        if (m27210n(i)) {
            return super.mo25162a(i);
        }
        return this.f35136E[m27209m(i)];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo25172b(int i) {
        if (m27210n(i)) {
            return super.mo25172b(i);
        }
        int m = m27209m(i);
        if (m == -1) {
            return getHighestPositionedBottom();
        }
        return this.f35135D[m];
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo25175c(int i) {
        if (m27210n(i)) {
            return super.mo25175c(i);
        }
        int m = m27209m(i);
        if (m == -1) {
            return getLowestPositionedTop();
        }
        return this.f35134C[m];
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo25178d(int i) {
        if (m27210n(i)) {
            return super.mo25178d(i);
        }
        return getHighestPositionedBottom();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        GridListSavedState gridListSavedState = (GridListSavedState) parcelable;
        this.f35138r = gridListSavedState.f35150h;
        this.f35134C = gridListSavedState.f35151i;
        this.f35135D = new int[this.f35138r];
        this.f35144x = gridListSavedState.f35152j;
        this.f35141u = true;
        super.onRestoreInstanceState(gridListSavedState);
    }

    public final void setColumnCount(int i) {
        this.f35142v = i;
        this.f35143w = i;
        mo25165a(getWidth(), getHeight());
        m27196f();
    }

    public final void setColumnCountLandscape(int i) {
        this.f35143w = i;
        mo25165a(getWidth(), getHeight());
        m27196f();
    }

    public final void setColumnCountPortrait(int i) {
        this.f35142v = i;
        mo25165a(getWidth(), getHeight());
        m27196f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13471f mo25163a(View view) {
        C13478a aVar;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            aVar = null;
        } else if (layoutParams instanceof C13478a) {
            aVar = (C13478a) layoutParams;
        } else {
            aVar = new C13478a(layoutParams);
        }
        if (aVar == null) {
            return new C13478a(this.f35140t, -2);
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo25180e(int i) {
        if (m27210n(i)) {
            return super.mo25180e(i);
        }
        return getLowestPositionedTop();
    }

    /* renamed from: g */
    private void m27199g(int i, int i2) {
        m27208l(i).f35147a = i2;
    }

    /* renamed from: d */
    private void m27193d(int i, int i2) {
        if (i2 < this.f35134C[i]) {
            this.f35134C[i] = i2;
        }
    }

    /* renamed from: e */
    private void m27194e(int i, int i2) {
        if (i2 > this.f35135D[i]) {
            this.f35135D[i] = i2;
        }
    }

    /* renamed from: f */
    private void m27197f(int i, int i2) {
        if (i != 0) {
            int[] iArr = this.f35134C;
            iArr[i2] = iArr[i2] + i;
            int[] iArr2 = this.f35135D;
            iArr2[i2] = iArr2[i2] + i;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f35138r <= 0) {
            if (m27195e()) {
                i3 = this.f35143w;
            } else {
                i3 = this.f35142v;
            }
            this.f35138r = i3;
        }
        this.f35140t = m27204j(getMeasuredWidth());
        if (this.f35134C == null || this.f35134C.length != this.f35138r) {
            this.f35134C = new int[this.f35138r];
            m27202i();
        }
        if (this.f35135D == null || this.f35135D.length != this.f35138r) {
            this.f35135D = new int[this.f35138r];
            m27205j();
        }
        if (this.f35136E == null || this.f35136E.length != this.f35138r) {
            this.f35136E = new int[this.f35138r];
            m27207k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25165a(int i, int i2) {
        int i3;
        super.mo25165a(i, i2);
        if (m27195e()) {
            i3 = this.f35143w;
        } else {
            i3 = this.f35142v;
        }
        if (this.f35138r != i3) {
            this.f35138r = i3;
            this.f35140t = m27204j(i);
            this.f35134C = new int[this.f35138r];
            this.f35135D = new int[this.f35138r];
            this.f35136E = new int[this.f35138r];
            this.f35137F = 0;
            m27201h();
            m27207k();
            if (getCount() > 0 && this.f35144x.size() > 0) {
                m27198g();
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo25177c(int i, int i2) {
        super.mo25177c(i, i2);
        Arrays.fill(this.f35134C, Integer.MAX_VALUE);
        Arrays.fill(this.f35135D, 0);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                C13471f fVar = (C13471f) childAt.getLayoutParams();
                if (fVar.f35119d == -2 || !(fVar instanceof C13478a)) {
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    for (int i4 = 0; i4 < this.f35138r; i4++) {
                        if (top < this.f35134C[i4]) {
                            this.f35134C[i4] = top;
                        }
                        if (bottom > this.f35135D[i4]) {
                            this.f35135D[i4] = bottom;
                        }
                    }
                } else {
                    C13478a aVar = (C13478a) fVar;
                    int i5 = aVar.f35153e;
                    int i6 = aVar.f35117b;
                    int top2 = childAt.getTop();
                    if (top2 < this.f35134C[i5]) {
                        this.f35134C[i5] = top2 - m27200h(i6);
                    }
                    int bottom2 = childAt.getBottom();
                    if (bottom2 > this.f35135D[i5]) {
                        this.f35135D[i5] = bottom2 + getChildBottomMargin();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25166a(int i, boolean z) {
        super.mo25166a(i, z);
        if (!m27210n(i)) {
            int m = m27209m(i);
            int i2 = this.f35138r;
            if (m < 0 || m >= i2) {
                if (z) {
                    m = getHighestPositionedBottomColumn();
                } else {
                    m = getLowestPositionedTopColumn();
                }
            }
            m27199g(i, m);
            return;
        }
        setPositionIsHeaderFooter(i);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo25165a(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25167a(View view, int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        int highestPositionedTop;
        int b;
        if (m27210n(i)) {
            if (z) {
                b = getLowestPositionedBottom();
                highestPositionedTop = m27192b(view) + b;
            } else {
                highestPositionedTop = getHighestPositionedTop();
                b = highestPositionedTop - m27192b(view);
            }
            int i6 = b;
            for (int i7 = 0; i7 < this.f35138r; i7++) {
                m27193d(i7, i6);
                m27194e(i7, highestPositionedTop);
            }
            super.mo25167a(view, i, z, i2, i6);
            return;
        }
        int m = m27209m(i);
        int h = m27200h(i);
        int childBottomMargin = getChildBottomMargin() + h;
        if (z) {
            i5 = this.f35135D[m];
            i4 = m27192b(view) + childBottomMargin + i5;
        } else {
            i4 = this.f35134C[m];
            i5 = i4 - (m27192b(view) + childBottomMargin);
        }
        ((C13478a) view.getLayoutParams()).f35153e = m;
        m27194e(m, i4);
        m27193d(m, i5);
        super.mo25167a(view, i, z, i2, i5 + h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25168a(View view, int i, boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int highestPositionedTop;
        int b;
        if (m27210n(i)) {
            if (z) {
                b = getLowestPositionedBottom();
                highestPositionedTop = m27192b(view) + b;
            } else {
                highestPositionedTop = getHighestPositionedTop();
                b = highestPositionedTop - m27192b(view);
            }
            int i8 = b;
            int i9 = highestPositionedTop;
            for (int i10 = 0; i10 < this.f35138r; i10++) {
                m27193d(i10, i8);
                m27194e(i10, i9);
            }
            super.mo25168a(view, i, z, i2, i8, i4, i9);
            return;
        }
        int m = m27209m(i);
        int h = m27200h(i);
        int childBottomMargin = getChildBottomMargin();
        int i11 = h + childBottomMargin;
        if (z) {
            i6 = this.f35135D[m];
            i7 = m27192b(view) + i11 + i6;
        } else {
            i7 = this.f35134C[m];
            i6 = i7 - (m27192b(view) + i11);
        }
        ((C13478a) view.getLayoutParams()).f35153e = m;
        m27194e(m, i7);
        m27193d(m, i6);
        view.layout(i2, i6 + h, i4, i7 - childBottomMargin);
    }
}
