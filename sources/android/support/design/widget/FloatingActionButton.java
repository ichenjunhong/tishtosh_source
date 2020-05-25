package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.p022a.C0396h;
import android.support.design.p025c.C0420a;
import android.support.design.p025c.C0422c;
import android.support.design.stateful.ExtendableSavedState;
import android.support.design.widget.CoordinatorLayout.C0503b;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.view.C1054s;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1118q;
import android.support.p043v7.widget.C1480g;
import android.support.p043v7.widget.C1487i;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;

@C0503b(mo1378a = Behavior.class)
public final class FloatingActionButton extends C0574u implements C0420a, C1054s, C1118q {

    /* renamed from: a */
    public int f1712a;

    /* renamed from: b */
    boolean f1713b;

    /* renamed from: c */
    final Rect f1714c;

    /* renamed from: d */
    private ColorStateList f1715d;

    /* renamed from: e */
    private Mode f1716e;

    /* renamed from: f */
    private ColorStateList f1717f;

    /* renamed from: g */
    private Mode f1718g;

    /* renamed from: h */
    private ColorStateList f1719h;

    /* renamed from: i */
    private int f1720i;

    /* renamed from: j */
    private int f1721j;

    /* renamed from: k */
    private int f1722k;

    /* renamed from: l */
    private final Rect f1723l;

    /* renamed from: m */
    private final C1487i f1724m;

    /* renamed from: n */
    private final C0422c f1725n;

    /* renamed from: o */
    private C0547i f1726o;

    protected static class BaseBehavior<T extends FloatingActionButton> extends android.support.design.widget.CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f1729a;

        /* renamed from: b */
        private C0509a f1730b;

        /* renamed from: c */
        private boolean f1731c;

        public BaseBehavior() {
            this.f1731c = true;
        }

        /* renamed from: a */
        public void mo1164a(C0505d dVar) {
            if (dVar.f1700h == 0) {
                dVar.f1700h = 80;
            }
        }

        /* renamed from: a */
        private static boolean m1333a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0505d) {
                return ((C0505d) layoutParams).f1693a instanceof BottomSheetBehavior;
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.c6});
            this.f1731c = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        private boolean m1335b(View view, FloatingActionButton floatingActionButton) {
            if (!m1334a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0505d) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo1393b(this.f1730b, false);
            } else {
                floatingActionButton.mo1390a(this.f1730b, false);
            }
            return true;
        }

        /* renamed from: a */
        private boolean m1334a(View view, FloatingActionButton floatingActionButton) {
            C0505d dVar = (C0505d) floatingActionButton.getLayoutParams();
            if (this.f1731c && dVar.f1698f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m1332a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m1334a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f1729a == null) {
                this.f1729a = new Rect();
            }
            Rect rect = this.f1729a;
            C0545g.m1485a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo1393b(this.f1730b, false);
            } else {
                floatingActionButton.mo1390a(this.f1730b, false);
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo934a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            List b = coordinatorLayout.mo1331b((View) floatingActionButton);
            int size = b.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) b.get(i4);
                if (!(view instanceof AppBarLayout)) {
                    if (m1333a(view) && m1335b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m1332a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo1325a((View) floatingActionButton, i);
            Rect rect = floatingActionButton.f1714c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0505d dVar = (C0505d) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - dVar.rightMargin) {
                    i2 = rect.right;
                } else if (floatingActionButton.getLeft() <= dVar.leftMargin) {
                    i2 = -rect.left;
                } else {
                    i2 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - dVar.bottomMargin) {
                    i3 = rect.bottom;
                } else if (floatingActionButton.getTop() <= dVar.topMargin) {
                    i3 = -rect.top;
                }
                if (i3 != 0) {
                    C1056u.m3058g(floatingActionButton, i3);
                }
                if (i2 != 0) {
                    C1056u.m3060h(floatingActionButton, i2);
                }
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo1373a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f1714c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean mo1159b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m1332a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (m1333a(view)) {
                m1335b(view, floatingActionButton);
            }
            return false;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1164a(C0505d dVar) {
            super.mo1164a(dVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1446a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo934a(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1447a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo1373a(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1448a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo1159b(coordinatorLayout, floatingActionButton, view);
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$a */
    public static abstract class C0509a {
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$b */
    class C0510b implements C0562n {
        /* renamed from: b */
        public final boolean mo1452b() {
            return FloatingActionButton.this.f1713b;
        }

        /* renamed from: a */
        public final float mo1449a() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        C0510b() {
        }

        /* renamed from: a */
        public final void mo1451a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        /* renamed from: a */
        public final void mo1450a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f1714c.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f1712a, i2 + FloatingActionButton.this.f1712a, i3 + FloatingActionButton.this.f1712a, i4 + FloatingActionButton.this.f1712a);
        }
    }

    public final ColorStateList getBackgroundTintList() {
        return this.f1715d;
    }

    public final Mode getBackgroundTintMode() {
        return this.f1716e;
    }

    public final int getCustomSize() {
        return this.f1721j;
    }

    public final ColorStateList getRippleColorStateList() {
        return this.f1719h;
    }

    public final int getSize() {
        return this.f1720i;
    }

    public final ColorStateList getSupportImageTintList() {
        return this.f1717f;
    }

    public final Mode getSupportImageTintMode() {
        return this.f1718g;
    }

    public final boolean getUseCompatPadding() {
        return this.f1713b;
    }

    public final void setBackgroundColor(int i) {
    }

    public final void setBackgroundDrawable(Drawable drawable) {
    }

    public final void setBackgroundResource(int i) {
    }

    /* renamed from: a */
    public final boolean mo1020a() {
        return this.f1725n.f1371b;
    }

    public final float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f1981o;
    }

    public final float getCompatPressedTranslationZ() {
        return getImpl().f1982p;
    }

    public final Drawable getContentBackground() {
        return getImpl().f1979m;
    }

    public final int getExpandedComponentIdHint() {
        return this.f1725n.f1372c;
    }

    public final C0396h getHideMotionSpec() {
        return getImpl().f1971e;
    }

    public final C0396h getShowMotionSpec() {
        return getImpl().f1970d;
    }

    /* access modifiers changed from: 0000 */
    public final int getSizeDimension() {
        return m1321a(this.f1720i);
    }

    public final ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public final Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    /* renamed from: b */
    public final boolean mo1394b() {
        return getImpl().mo1724f();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo1718a(getDrawableState());
    }

    public final float getCompatElevation() {
        return getImpl().mo1712a();
    }

    public final int getRippleColor() {
        if (this.f1719h != null) {
            return this.f1719h.getDefaultColor();
        }
        return 0;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo1719b();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0547i impl = getImpl();
        if (impl.f1962C != null) {
            impl.f1960A.getViewTreeObserver().removeOnPreDrawListener(impl.f1962C);
            impl.f1962C = null;
        }
    }

    /* renamed from: c */
    private void m1325c() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (this.f1717f == null) {
                C0809a.m2336e(drawable);
                return;
            }
            int colorForState = this.f1717f.getColorForState(getDrawableState(), 0);
            Mode mode = this.f1718g;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C1480g.m5201a(colorForState, mode));
        }
    }

    public C0547i getImpl() {
        C0547i iVar;
        if (this.f1726o == null) {
            if (VERSION.SDK_INT >= 21) {
                iVar = new C0557j(this, new C0510b());
            } else {
                iVar = new C0547i(this, new C0510b());
            }
            this.f1726o = iVar;
        }
        return this.f1726o;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0547i impl = getImpl();
        if (impl.mo1723e()) {
            if (impl.f1962C == null) {
                impl.f1962C = new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        C0547i iVar = C0547i.this;
                        float rotation = iVar.f1960A.getRotation();
                        if (iVar.f1975i != rotation) {
                            iVar.f1975i = rotation;
                            if (VERSION.SDK_INT == 19) {
                                if (iVar.f1975i % 90.0f != 0.0f) {
                                    if (iVar.f1960A.getLayerType() != 1) {
                                        iVar.f1960A.setLayerType(1, null);
                                    }
                                } else if (iVar.f1960A.getLayerType() != 0) {
                                    iVar.f1960A.setLayerType(0, null);
                                }
                            }
                            if (iVar.f1974h != null) {
                                C0561m mVar = iVar.f1974h;
                                float f = -iVar.f1975i;
                                if (mVar.f2038k != f) {
                                    mVar.f2038k = f;
                                    mVar.invalidateSelf();
                                }
                            }
                            if (iVar.f1978l != null) {
                                C0541d dVar = iVar.f1978l;
                                float f2 = -iVar.f1975i;
                                if (f2 != dVar.f1893i) {
                                    dVar.f1893i = f2;
                                    dVar.invalidateSelf();
                                }
                            }
                        }
                        return true;
                    }
                };
            }
            impl.f1960A.getViewTreeObserver().addOnPreDrawListener(impl.f1962C);
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(super.onSaveInstanceState());
        C0422c cVar = this.f1725n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", cVar.f1371b);
        bundle.putInt("expandedComponentIdHint", cVar.f1372c);
        extendableSavedState.f1528a.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        setBackgroundTintMode(mode);
    }

    public final void setExpandedComponentIdHint(int i) {
        this.f1725n.f1372c = i;
    }

    public final void setHideMotionSpec(C0396h hVar) {
        getImpl().f1971e = hVar;
    }

    public final void setImageResource(int i) {
        this.f1724m.mo5776a(i);
    }

    public final void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public final void setShowMotionSpec(C0396h hVar) {
        getImpl().f1970d = hVar;
    }

    /* renamed from: a */
    private C0554d m1323a(final C0509a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C0554d() {
        };
    }

    public final void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public final void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public final void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public final void setCustomSize(int i) {
        if (i >= 0) {
            this.f1721j = i;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public final void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C0396h.m967a(getContext(), i));
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0547i impl = getImpl();
        impl.mo1714a(impl.f1984r);
    }

    public final void setRippleColor(ColorStateList colorStateList) {
        if (this.f1719h != colorStateList) {
            this.f1719h = colorStateList;
            getImpl().mo1716a(this.f1719h);
        }
    }

    public final void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C0396h.m967a(getContext(), i));
    }

    public final void setSize(int i) {
        this.f1721j = 0;
        if (i != this.f1720i) {
            this.f1720i = i;
            requestLayout();
        }
    }

    public final void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f1717f != colorStateList) {
            this.f1717f = colorStateList;
            m1325c();
        }
    }

    public final void setSupportImageTintMode(Mode mode) {
        if (this.f1718g != mode) {
            this.f1718g = mode;
            m1325c();
        }
    }

    public final void setUseCompatPadding(boolean z) {
        if (this.f1713b != z) {
            this.f1713b = z;
            getImpl().mo1721c();
        }
    }

    public final void setBackgroundTintMode(Mode mode) {
        if (this.f1716e != mode) {
            this.f1716e = mode;
            C0547i impl = getImpl();
            if (impl.f1976j != null) {
                C0809a.m2330a(impl.f1976j, mode);
            }
        }
    }

    public final void setCompatElevation(float f) {
        C0547i impl = getImpl();
        if (impl.f1980n != f) {
            impl.f1980n = f;
            impl.mo1715a(impl.f1980n, impl.f1981o, impl.f1982p);
        }
    }

    public final void setCompatHoveredFocusedTranslationZ(float f) {
        C0547i impl = getImpl();
        if (impl.f1981o != f) {
            impl.f1981o = f;
            impl.mo1715a(impl.f1980n, impl.f1981o, impl.f1982p);
        }
    }

    public final void setCompatPressedTranslationZ(float f) {
        C0547i impl = getImpl();
        if (impl.f1982p != f) {
            impl.f1982p = f;
            impl.mo1715a(impl.f1980n, impl.f1981o, impl.f1982p);
        }
    }

    /* renamed from: a */
    private int m1321a(int i) {
        while (this.f1721j == 0) {
            Resources resources = getResources();
            if (i != -1) {
                if (i != 1) {
                    return resources.getDimensionPixelSize(R.dimen.g4);
                }
                return resources.getDimensionPixelSize(R.dimen.g3);
            } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                return m1321a(1);
            } else {
                i = 0;
            }
        }
        return this.f1721j;
    }

    /* renamed from: b */
    public void mo1392b(Rect rect) {
        rect.left += this.f1714c.left;
        rect.top += this.f1714c.top;
        rect.right -= this.f1714c.right;
        rect.bottom -= this.f1714c.bottom;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo1391a(this.f1723l) || this.f1723l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1715d != colorStateList) {
            this.f1715d = colorStateList;
            C0547i impl = getImpl();
            if (impl.f1976j != null) {
                C0809a.m2327a(impl.f1976j, colorStateList);
            }
            if (impl.f1978l != null) {
                C0541d dVar = impl.f1978l;
                if (colorStateList != null) {
                    dVar.f1891g = colorStateList.getColorForState(dVar.getState(), dVar.f1891g);
                }
                dVar.f1890f = colorStateList;
                dVar.f1892h = true;
                dVar.invalidateSelf();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1391a(Rect rect) {
        if (!C1056u.m3079y(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        mo1392b(rect);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f3119e);
        C0422c cVar = this.f1725n;
        Bundle bundle = (Bundle) extendableSavedState.f1528a.get("expandableWidgetHelper");
        cVar.f1371b = bundle.getBoolean("expanded", false);
        cVar.f1372c = bundle.getInt("expandedComponentIdHint", 0);
        if (cVar.f1371b) {
            ViewParent parent = cVar.f1370a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).mo1324a(cVar.f1370a);
            }
        }
    }

    /* renamed from: a */
    private static int m1322a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f1712a = (sizeDimension - this.f1722k) / 2;
        getImpl().mo1722d();
        int min = Math.min(m1322a(sizeDimension, i), m1322a(sizeDimension, i2));
        setMeasuredDimension(this.f1714c.left + min + this.f1714c.right, min + this.f1714c.top + this.f1714c.bottom);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1393b(C0509a aVar, boolean z) {
        C0396h hVar;
        C0547i impl = getImpl();
        C0554d a = m1323a(aVar);
        boolean z2 = true;
        if (impl.f1960A.getVisibility() != 0 ? impl.f1968b == 2 : impl.f1968b != 1) {
            z2 = false;
        }
        if (!z2) {
            if (impl.f1969c != null) {
                impl.f1969c.cancel();
            }
            if (impl.mo1725g()) {
                if (impl.f1971e != null) {
                    hVar = impl.f1971e;
                } else {
                    if (impl.f1973g == null) {
                        impl.f1973g = C0396h.m967a(impl.f1960A.getContext(), (int) R.animator.b);
                    }
                    hVar = impl.f1973g;
                }
                AnimatorSet a2 = impl.mo1713a(hVar, 0.0f, 0.0f, 0.0f);
                a2.addListener(new AnimatorListenerAdapter(false, a) {

                    /* renamed from: a */
                    final /* synthetic */ boolean f1987a;

                    /* renamed from: b */
                    final /* synthetic */ C0554d f1988b;

                    /* renamed from: d */
                    private boolean f1990d;

                    public final void onAnimationCancel(Animator animator) {
                        this.f1990d = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        int i;
                        C0547i.this.f1968b = 0;
                        C0547i.this.f1969c = null;
                        if (!this.f1990d) {
                            C0574u uVar = C0547i.this.f1960A;
                            if (this.f1987a) {
                                i = 8;
                            } else {
                                i = 4;
                            }
                            uVar.mo1773a(i, this.f1987a);
                        }
                    }

                    public final void onAnimationStart(Animator animator) {
                        C0547i.this.f1960A.mo1773a(0, this.f1987a);
                        C0547i.this.f1968b = 1;
                        C0547i.this.f1969c = animator;
                        this.f1990d = false;
                    }

                    {
                        this.f1987a = r2;
                        this.f1988b = r3;
                    }
                });
                if (impl.f1986t != null) {
                    Iterator it = impl.f1986t.iterator();
                    while (it.hasNext()) {
                        a2.addListener((AnimatorListener) it.next());
                    }
                }
                a2.start();
                return;
            }
            impl.f1960A.mo1773a(4, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1390a(C0509a aVar, boolean z) {
        C0396h hVar;
        C0547i impl = getImpl();
        C0554d a = m1323a(aVar);
        if (!impl.mo1724f()) {
            if (impl.f1969c != null) {
                impl.f1969c.cancel();
            }
            if (impl.mo1725g()) {
                if (impl.f1960A.getVisibility() != 0) {
                    impl.f1960A.setAlpha(0.0f);
                    impl.f1960A.setScaleY(0.0f);
                    impl.f1960A.setScaleX(0.0f);
                    impl.mo1714a(0.0f);
                }
                if (impl.f1970d != null) {
                    hVar = impl.f1970d;
                } else {
                    if (impl.f1972f == null) {
                        impl.f1972f = C0396h.m967a(impl.f1960A.getContext(), (int) R.animator.c);
                    }
                    hVar = impl.f1972f;
                }
                AnimatorSet a2 = impl.mo1713a(hVar, 1.0f, 1.0f, 1.0f);
                a2.addListener(new AnimatorListenerAdapter(false, a) {

                    /* renamed from: a */
                    final /* synthetic */ boolean f1991a;

                    /* renamed from: b */
                    final /* synthetic */ C0554d f1992b;

                    public final void onAnimationEnd(Animator animator) {
                        C0547i.this.f1968b = 0;
                        C0547i.this.f1969c = null;
                    }

                    public final void onAnimationStart(Animator animator) {
                        C0547i.this.f1960A.mo1773a(0, this.f1991a);
                        C0547i.this.f1968b = 2;
                        C0547i.this.f1969c = animator;
                    }

                    {
                        this.f1991a = r2;
                        this.f1992b = r3;
                    }
                });
                if (impl.f1985s != null) {
                    Iterator it = impl.f1985s.iterator();
                    while (it.hasNext()) {
                        a2.addListener((AnimatorListener) it.next());
                    }
                }
                a2.start();
                return;
            }
            impl.f1960A.mo1773a(0, false);
            impl.f1960A.setAlpha(1.0f);
            impl.f1960A.setScaleY(1.0f);
            impl.f1960A.setScaleX(1.0f);
            impl.mo1714a(1.0f);
        }
    }
}
