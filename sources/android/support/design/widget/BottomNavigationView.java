package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.design.internal.C0439a;
import android.support.design.internal.C0456f;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.view.C1225g;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1246h.C1247a;
import android.support.p043v7.view.menu.C1262o;
import android.support.p043v7.widget.C1451bb;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.ss.android.ugc.trill.R;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: a */
    public C0493b f1622a;

    /* renamed from: b */
    public C0492a f1623b;

    /* renamed from: c */
    private final C1246h f1624c;

    /* renamed from: d */
    private final BottomNavigationMenuView f1625d;

    /* renamed from: e */
    private final BottomNavigationPresenter f1626e;

    /* renamed from: f */
    private MenuInflater f1627f;

    static class SavedState extends AbsSavedState {
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
        Bundle f1629a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1629a = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f1629a);
        }
    }

    /* renamed from: android.support.design.widget.BottomNavigationView$a */
    public interface C0492a {
    }

    /* renamed from: android.support.design.widget.BottomNavigationView$b */
    public interface C0493b {
        /* renamed from: a */
        boolean mo1294a(MenuItem menuItem);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f1624c;
    }

    public Drawable getItemBackground() {
        return this.f1625d.getItemBackground();
    }

    public int getItemBackgroundResource() {
        return this.f1625d.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f1625d.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f1625d.getIconTintList();
    }

    public int getItemTextAppearanceActive() {
        return this.f1625d.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f1625d.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f1625d.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f1625d.getLabelVisibilityMode();
    }

    public int getSelectedItemId() {
        return this.f1625d.getSelectedItemId();
    }

    private MenuInflater getMenuInflater() {
        if (this.f1627f == null) {
            this.f1627f = new C1225g(getContext());
        }
        return this.f1627f;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1629a = new Bundle();
        this.f1624c.mo4107a(savedState.f1629a);
        return savedState;
    }

    public void setOnNavigationItemReselectedListener(C0492a aVar) {
        this.f1623b = aVar;
    }

    public void setOnNavigationItemSelectedListener(C0493b bVar) {
        this.f1622a = bVar;
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public void setItemBackground(Drawable drawable) {
        this.f1625d.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f1625d.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f1625d.setItemIconSize(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f1625d.setIconTintList(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f1625d.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f1625d.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1625d.setItemTextColor(colorStateList);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3119e);
        this.f1624c.mo4123b(savedState.f1629a);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f1625d.f1447b != z) {
            this.f1625d.setItemHorizontalTranslationEnabled(z);
            this.f1626e.mo1086a(false);
        }
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f1625d.getLabelVisibilityMode() != i) {
            this.f1625d.setLabelVisibilityMode(i);
            this.f1626e.mo1086a(false);
        }
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f1624c.findItem(i);
        if (findItem != null && !this.f1624c.mo4114a(findItem, (C1262o) this.f1626e, 0)) {
            findItem.setChecked(true);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cq);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1626e = new BottomNavigationPresenter();
        this.f1624c = new C0439a(context);
        this.f1625d = new BottomNavigationMenuView(context);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f1625d.setLayoutParams(layoutParams);
        this.f1626e.f1471a = this.f1625d;
        this.f1626e.f1473c = 1;
        this.f1625d.setPresenter(this.f1626e);
        this.f1624c.mo4110a((C1262o) this.f1626e);
        this.f1626e.mo1082a(getContext(), this.f1624c);
        C1451bb b = C0456f.m1112b(context, attributeSet, new int[]{R.attr.k_, R.attr.pf, R.attr.ph, R.attr.pj, R.attr.pk, R.attr.ps, R.attr.pt, R.attr.pu, R.attr.q2, R.attr.u2}, i, R.style.qx, 6, 5);
        if (b.mo5664f(4)) {
            this.f1625d.setIconTintList(b.mo5662e(4));
        } else {
            this.f1625d.setIconTintList(this.f1625d.mo1056a(16842808));
        }
        setItemIconSize(b.mo5661e(3, getResources().getDimensionPixelSize(R.dimen.fs)));
        if (b.mo5664f(6)) {
            setItemTextAppearanceInactive(b.mo5665g(6, 0));
        }
        if (b.mo5664f(5)) {
            setItemTextAppearanceActive(b.mo5665g(5, 0));
        }
        if (b.mo5664f(7)) {
            setItemTextColor(b.mo5662e(7));
        }
        if (b.mo5664f(0)) {
            C1056u.m3048c((View) this, (float) b.mo5661e(0, 0));
        }
        setLabelVisibilityMode(b.mo5657c(8, -1));
        setItemHorizontalTranslationEnabled(b.mo5654a(2, true));
        this.f1625d.setItemBackgroundRes(b.mo5665g(1, 0));
        if (b.mo5664f(9)) {
            int g = b.mo5665g(9, 0);
            this.f1626e.f1472b = true;
            getMenuInflater().inflate(g, this.f1624c);
            this.f1626e.f1472b = false;
            this.f1626e.mo1086a(true);
        }
        b.mo5653a();
        addView(this.f1625d, layoutParams);
        if (VERSION.SDK_INT < 21) {
            View view = new View(context);
            view.setBackgroundColor(C0726c.m2098c(context, R.color.kr));
            view.setLayoutParams(new LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.fw)));
            addView(view);
        }
        this.f1624c.mo4108a((C1247a) new C1247a() {
            /* renamed from: a */
            public final void mo1289a(C1246h hVar) {
            }

            /* renamed from: a */
            public final boolean mo1290a(C1246h hVar, MenuItem menuItem) {
                if (BottomNavigationView.this.f1623b != null && menuItem.getItemId() == BottomNavigationView.this.getSelectedItemId()) {
                    return true;
                }
                if (BottomNavigationView.this.f1622a == null || BottomNavigationView.this.f1622a.mo1294a(menuItem)) {
                    return false;
                }
                return true;
            }
        });
    }
}
