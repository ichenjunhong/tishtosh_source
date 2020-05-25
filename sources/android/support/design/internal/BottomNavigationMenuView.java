package android.support.design.internal;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p019b.C0259b;
import android.support.p019b.C0296m;
import android.support.p019b.C0308q;
import android.support.p030v4.p038f.C0795l.C0796a;
import android.support.p030v4.p038f.C0795l.C0798c;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p042b.C1023b;
import android.support.p043v7.p044a.p045a.C1124a;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.C1262o;
import android.support.p043v7.view.menu.C1264p;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;

public class BottomNavigationMenuView extends ViewGroup implements C1264p {

    /* renamed from: i */
    private static final int[] f1444i = {16842912};

    /* renamed from: j */
    private static final int[] f1445j = {-16842910};

    /* renamed from: a */
    final C0308q f1446a;

    /* renamed from: b */
    public boolean f1447b;

    /* renamed from: c */
    int f1448c;

    /* renamed from: d */
    BottomNavigationItemView[] f1449d;

    /* renamed from: e */
    int f1450e;

    /* renamed from: f */
    int f1451f;

    /* renamed from: g */
    public BottomNavigationPresenter f1452g;

    /* renamed from: h */
    public C1246h f1453h;

    /* renamed from: k */
    private final int f1454k;

    /* renamed from: l */
    private final int f1455l;

    /* renamed from: m */
    private final int f1456m;

    /* renamed from: n */
    private final int f1457n;

    /* renamed from: o */
    private final int f1458o;

    /* renamed from: p */
    private final OnClickListener f1459p;

    /* renamed from: q */
    private final C0796a<BottomNavigationItemView> f1460q;

    /* renamed from: r */
    private ColorStateList f1461r;

    /* renamed from: s */
    private int f1462s;

    /* renamed from: t */
    private ColorStateList f1463t;

    /* renamed from: u */
    private final ColorStateList f1464u;

    /* renamed from: v */
    private int f1465v;

    /* renamed from: w */
    private int f1466w;

    /* renamed from: x */
    private Drawable f1467x;

    /* renamed from: y */
    private int f1468y;

    /* renamed from: z */
    private int[] f1469z;

    /* renamed from: a */
    static boolean m1057a(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    public ColorStateList getIconTintList() {
        return this.f1461r;
    }

    public int getItemBackgroundRes() {
        return this.f1468y;
    }

    public int getItemIconSize() {
        return this.f1462s;
    }

    public int getItemTextAppearanceActive() {
        return this.f1466w;
    }

    public int getItemTextAppearanceInactive() {
        return this.f1465v;
    }

    public ColorStateList getItemTextColor() {
        return this.f1463t;
    }

    public int getLabelVisibilityMode() {
        return this.f1448c;
    }

    public int getSelectedItemId() {
        return this.f1450e;
    }

    public int getWindowAnimations() {
        return 0;
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) this.f1460q.acquire();
        if (bottomNavigationItemView == null) {
            return new BottomNavigationItemView(getContext());
        }
        return bottomNavigationItemView;
    }

    public Drawable getItemBackground() {
        if (this.f1449d == null || this.f1449d.length <= 0) {
            return this.f1467x;
        }
        return this.f1449d[0].getBackground();
    }

    /* renamed from: a */
    public final void mo1057a() {
        BottomNavigationItemView[] bottomNavigationItemViewArr;
        removeAllViews();
        if (this.f1449d != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f1449d) {
                if (bottomNavigationItemView != null) {
                    this.f1460q.release(bottomNavigationItemView);
                }
            }
        }
        if (this.f1453h.size() == 0) {
            this.f1450e = 0;
            this.f1451f = 0;
            this.f1449d = null;
            return;
        }
        this.f1449d = new BottomNavigationItemView[this.f1453h.size()];
        boolean a = m1057a(this.f1448c, this.f1453h.mo4140g().size());
        for (int i = 0; i < this.f1453h.size(); i++) {
            this.f1452g.f1472b = true;
            this.f1453h.getItem(i).setCheckable(true);
            this.f1452g.f1472b = false;
            BottomNavigationItemView newItem = getNewItem();
            this.f1449d[i] = newItem;
            newItem.setIconTintList(this.f1461r);
            newItem.setIconSize(this.f1462s);
            newItem.setTextColor(this.f1464u);
            newItem.setTextAppearanceInactive(this.f1465v);
            newItem.setTextAppearanceActive(this.f1466w);
            newItem.setTextColor(this.f1463t);
            if (this.f1467x != null) {
                newItem.setItemBackground(this.f1467x);
            } else {
                newItem.setItemBackground(this.f1468y);
            }
            newItem.setShifting(a);
            newItem.setLabelVisibilityMode(this.f1448c);
            newItem.mo1036a((C1250j) this.f1453h.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.f1459p);
            addView(newItem);
        }
        this.f1451f = Math.min(this.f1453h.size() - 1, this.f1451f);
        this.f1453h.getItem(this.f1451f).setChecked(true);
    }

    /* renamed from: a */
    public final void mo1058a(C1246h hVar) {
        this.f1453h = hVar;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f1447b = z;
    }

    public void setLabelVisibilityMode(int i) {
        this.f1448c = i;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f1452g = bottomNavigationPresenter;
    }

    public BottomNavigationMenuView(Context context) {
        this(context, null);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1461r = colorStateList;
        if (this.f1449d != null) {
            for (BottomNavigationItemView iconTintList : this.f1449d) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f1467x = drawable;
        if (this.f1449d != null) {
            for (BottomNavigationItemView itemBackground : this.f1449d) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f1468y = i;
        if (this.f1449d != null) {
            for (BottomNavigationItemView itemBackground : this.f1449d) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f1462s = i;
        if (this.f1449d != null) {
            for (BottomNavigationItemView iconSize : this.f1449d) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        BottomNavigationItemView[] bottomNavigationItemViewArr;
        this.f1466w = i;
        if (this.f1449d != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f1449d) {
                bottomNavigationItemView.setTextAppearanceActive(i);
                if (this.f1463t != null) {
                    bottomNavigationItemView.setTextColor(this.f1463t);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        BottomNavigationItemView[] bottomNavigationItemViewArr;
        this.f1465v = i;
        if (this.f1449d != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f1449d) {
                bottomNavigationItemView.setTextAppearanceInactive(i);
                if (this.f1463t != null) {
                    bottomNavigationItemView.setTextColor(this.f1463t);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1463t = colorStateList;
        if (this.f1449d != null) {
            for (BottomNavigationItemView textColor : this.f1449d) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: a */
    public final ColorStateList mo1056a(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList a = C1124a.m3313a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.fx, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{f1445j, f1444i, EMPTY_STATE_SET}, new int[]{a.getColorForState(f1445j, defaultColor), i2, defaultColor});
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1460q = new C0798c(5);
        this.f1450e = 0;
        this.f1451f = 0;
        Resources resources = getResources();
        this.f1454k = resources.getDimensionPixelSize(R.dimen.ft);
        this.f1455l = resources.getDimensionPixelSize(R.dimen.fu);
        this.f1456m = resources.getDimensionPixelSize(R.dimen.fn);
        this.f1457n = resources.getDimensionPixelSize(R.dimen.fo);
        this.f1458o = resources.getDimensionPixelSize(R.dimen.fr);
        this.f1464u = mo1056a(16842808);
        this.f1446a = new C0259b();
        this.f1446a.mo621a(0);
        this.f1446a.mo587a(115);
        this.f1446a.mo588a((TimeInterpolator) new C1023b());
        this.f1446a.mo622a((C0296m) new C0454e());
        this.f1459p = new OnClickListener() {
            public final void onClick(View view) {
                C1250j itemData = ((BottomNavigationItemView) view).getItemData();
                if (!BottomNavigationMenuView.this.f1453h.mo4114a((MenuItem) itemData, (C1262o) BottomNavigationMenuView.this.f1452g, 0)) {
                    itemData.setChecked(true);
                }
            }
        };
        this.f1469z = new int[5];
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = MeasureSpec.getSize(i);
        int size2 = this.f1453h.mo4140g().size();
        int childCount = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f1458o, 1073741824);
        if (!m1057a(this.f1448c, size2) || !this.f1447b) {
            if (size2 == 0) {
                i3 = 1;
            } else {
                i3 = size2;
            }
            int min = Math.min(size / i3, this.f1456m);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    this.f1469z[i8] = min;
                    if (i7 > 0) {
                        int[] iArr = this.f1469z;
                        iArr[i8] = iArr[i8] + 1;
                        i7--;
                    }
                } else {
                    this.f1469z[i8] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f1451f);
            int i9 = this.f1457n;
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(this.f1456m, DynamicTabYellowPointVersion.DEFAULT), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i10 = size2 - i4;
            int min2 = Math.min(size - (this.f1455l * i10), Math.min(i9, this.f1456m));
            int i11 = size - min2;
            if (i10 == 0) {
                i5 = 1;
            } else {
                i5 = i10;
            }
            int min3 = Math.min(i11 / i5, this.f1454k);
            int i12 = i11 - (i10 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr2 = this.f1469z;
                    if (i13 == this.f1451f) {
                        i6 = min2;
                    } else {
                        i6 = min3;
                    }
                    iArr2[i13] = i6;
                    if (i12 > 0) {
                        int[] iArr3 = this.f1469z;
                        iArr3[i13] = iArr3[i13] + 1;
                        i12--;
                    }
                } else {
                    this.f1469z[i13] = 0;
                }
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(MeasureSpec.makeMeasureSpec(this.f1469z[i15], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i14, MeasureSpec.makeMeasureSpec(i14, 1073741824), 0), View.resolveSizeAndState(this.f1458o, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C1056u.m3055f(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }
}
