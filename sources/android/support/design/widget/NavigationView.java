package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.internal.C0440b;
import android.support.design.internal.C0441c;
import android.support.design.internal.C0441c.C0444b;
import android.support.design.internal.C0456f;
import android.support.design.internal.NavigationMenuView;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1018ac;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.p044a.p045a.C1124a;
import android.support.p043v7.view.C1225g;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1246h.C1247a;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.C1262o;
import android.support.p043v7.widget.C1451bb;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.ss.android.ugc.trill.R;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: d */
    private static final int[] f1747d = {16842912};

    /* renamed from: e */
    private static final int[] f1748e = {-16842910};

    /* renamed from: c */
    C0514a f1749c;

    /* renamed from: f */
    private final C0440b f1750f;

    /* renamed from: g */
    private final C0441c f1751g;

    /* renamed from: h */
    private final int f1752h;

    /* renamed from: i */
    private MenuInflater f1753i;

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        public Bundle f1755a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1755a = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f1755a);
        }
    }

    /* renamed from: android.support.design.widget.NavigationView$a */
    public interface C0514a {
        /* renamed from: a */
        boolean mo1484a(MenuItem menuItem);
    }

    public Menu getMenu() {
        return this.f1750f;
    }

    public MenuItem getCheckedItem() {
        return this.f1751g.f1502e.f1517b;
    }

    public Drawable getItemBackground() {
        return this.f1751g.f1508k;
    }

    public int getItemHorizontalPadding() {
        return this.f1751g.f1509l;
    }

    public int getItemIconPadding() {
        return this.f1751g.f1510m;
    }

    public ColorStateList getItemIconTintList() {
        return this.f1751g.f1507j;
    }

    public ColorStateList getItemTextColor() {
        return this.f1751g.f1506i;
    }

    public int getHeaderCount() {
        return this.f1751g.f1499b.getChildCount();
    }

    private MenuInflater getMenuInflater() {
        if (this.f1753i == null) {
            this.f1753i = new C1225g(getContext());
        }
        return this.f1753i;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1755a = new Bundle();
        this.f1750f.mo4107a(savedState.f1755a);
        return savedState;
    }

    public void setNavigationItemSelectedListener(C0514a aVar) {
        this.f1749c = aVar;
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public void setItemBackground(Drawable drawable) {
        this.f1751g.mo1135a(drawable);
    }

    public void setItemHorizontalPadding(int i) {
        this.f1751g.mo1137b(i);
    }

    public void setItemIconPadding(int i) {
        this.f1751g.mo1140c(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f1751g.mo1134a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.f1751g.mo1133a(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1751g.mo1138b(colorStateList);
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f1750f.findItem(i);
        if (findItem != null) {
            this.f1751g.mo1136a((C1250j) findItem);
        }
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0726c.m2091a(getContext(), i));
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f1751g.mo1137b(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPaddingResource(int i) {
        this.f1751g.mo1140c(getResources().getDimensionPixelSize(i));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3119e);
        this.f1750f.mo4123b(savedState.f1755a);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f1750f.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f1751g.mo1136a((C1250j) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    /* renamed from: a */
    public final void mo1126a(C1018ac acVar) {
        C0441c cVar = this.f1751g;
        int b = acVar.mo3186b();
        if (cVar.f1511n != b) {
            cVar.f1511n = b;
            if (cVar.f1499b.getChildCount() == 0) {
                cVar.f1498a.setPadding(0, cVar.f1511n, 0, cVar.f1498a.getPaddingBottom());
            }
        }
        C1056u.m3041b((View) cVar.f1499b, acVar);
    }

    /* renamed from: a */
    private ColorStateList m1368a(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C1124a.m3313a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.fx, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{f1748e, f1747d, EMPTY_STATE_SET}, new int[]{a.getColorForState(f1748e, defaultColor), i2, defaultColor});
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.uo);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(i), this.f1752h), 1073741824);
        } else if (mode == 0) {
            i = MeasureSpec.makeMeasureSpec(this.f1752h, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int i2;
        boolean z;
        super(context, attributeSet, i);
        this.f1751g = new C0441c();
        this.f1750f = new C0440b(context);
        C1451bb b = C0456f.m1112b(context, attributeSet, new int[]{16842964, 16842973, 16843039, R.attr.k_, R.attr.mz, R.attr.pf, R.attr.pg, R.attr.pi, R.attr.pk, R.attr.pr, R.attr.pu, R.attr.u2}, i, R.style.r1, new int[0]);
        C1056u.m3030a((View) this, b.mo5652a(0));
        if (b.mo5664f(3)) {
            C1056u.m3048c((View) this, (float) b.mo5661e(3, 0));
        }
        C1056u.m3045b((View) this, b.mo5654a(1, false));
        this.f1752h = b.mo5661e(2, 0);
        if (b.mo5664f(8)) {
            colorStateList = b.mo5662e(8);
        } else {
            colorStateList = m1368a(16842808);
        }
        if (b.mo5664f(9)) {
            i2 = b.mo5665g(9, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        ColorStateList colorStateList2 = null;
        if (b.mo5664f(10)) {
            colorStateList2 = b.mo5662e(10);
        }
        if (!z && colorStateList2 == null) {
            colorStateList2 = m1368a(16842806);
        }
        Drawable a = b.mo5652a(5);
        if (b.mo5664f(6)) {
            this.f1751g.mo1137b(b.mo5661e(6, 0));
        }
        int e = b.mo5661e(7, 0);
        this.f1750f.mo4108a((C1247a) new C1247a() {
            /* renamed from: a */
            public final void mo1289a(C1246h hVar) {
            }

            /* renamed from: a */
            public final boolean mo1290a(C1246h hVar, MenuItem menuItem) {
                if (NavigationView.this.f1749c == null || !NavigationView.this.f1749c.mo1484a(menuItem)) {
                    return false;
                }
                return true;
            }
        });
        this.f1751g.f1501d = 1;
        this.f1751g.mo1082a(context, (C1246h) this.f1750f);
        this.f1751g.mo1134a(colorStateList);
        if (z) {
            this.f1751g.mo1133a(i2);
        }
        this.f1751g.mo1138b(colorStateList2);
        this.f1751g.mo1135a(a);
        this.f1751g.mo1140c(e);
        this.f1750f.mo4110a((C1262o) this.f1751g);
        C0441c cVar = this.f1751g;
        if (cVar.f1498a == null) {
            cVar.f1498a = (NavigationMenuView) cVar.f1503f.inflate(R.layout.ja, this, false);
            if (cVar.f1502e == null) {
                cVar.f1502e = new C0444b();
            }
            cVar.f1499b = (LinearLayout) cVar.f1503f.inflate(R.layout.j8, cVar.f1498a, false);
            cVar.f1498a.setAdapter(cVar.f1502e);
        }
        addView(cVar.f1498a);
        if (b.mo5664f(11)) {
            int g = b.mo5665g(11, 0);
            this.f1751g.mo1139b(true);
            getMenuInflater().inflate(g, this.f1750f);
            this.f1751g.mo1139b(false);
            this.f1751g.mo1086a(false);
        }
        if (b.mo5664f(4)) {
            int g2 = b.mo5665g(4, 0);
            C0441c cVar2 = this.f1751g;
            cVar2.f1499b.addView(cVar2.f1503f.inflate(g2, cVar2.f1499b, false));
            cVar2.f1498a.setPadding(0, 0, 0, cVar2.f1498a.getPaddingBottom());
        }
        b.mo5653a();
    }
}
