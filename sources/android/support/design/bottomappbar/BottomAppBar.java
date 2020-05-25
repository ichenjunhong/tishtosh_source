package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.p022a.C0389a;
import android.support.design.p028f.C0427c;
import android.support.design.widget.C0547i;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0502a;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.design.widget.FloatingActionButton;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.ActionMenuView;
import android.support.p043v7.widget.Toolbar;
import android.support.p043v7.widget.Toolbar.LayoutParams;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

public final class BottomAppBar extends Toolbar implements C0502a {

    /* renamed from: a */
    public final C0427c f1313a;

    /* renamed from: b */
    public final C0417a f1314b;

    /* renamed from: c */
    public Animator f1315c;

    /* renamed from: d */
    public Animator f1316d;

    /* renamed from: e */
    public Animator f1317e;

    /* renamed from: f */
    public int f1318f;

    /* renamed from: g */
    public boolean f1319g;

    /* renamed from: h */
    AnimatorListenerAdapter f1320h;

    /* renamed from: i */
    private final int f1321i;

    /* renamed from: j */
    private boolean f1322j;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: b */
        private final Rect f1331b = new Rect();

        public Behavior() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo933a(View view) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            super.mo933a(bottomAppBar);
            FloatingActionButton a = bottomAppBar.mo938a();
            if (a != null) {
                a.clearAnimation();
                a.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(C0389a.f1270d).setDuration(225);
            }
        }

        /* renamed from: b */
        public final /* synthetic */ void mo936b(View view) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            super.mo936b(bottomAppBar);
            FloatingActionButton a = bottomAppBar.mo938a();
            if (a != null) {
                a.mo1391a(this.f1331b);
                float measuredHeight = (float) (a.getMeasuredHeight() - this.f1331b.height());
                a.clearAnimation();
                a.animate().translationY(((float) (-a.getPaddingBottom())) + measuredHeight).setInterpolator(C0389a.f1269c).setDuration(175);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo934a(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            FloatingActionButton a = bottomAppBar.mo938a();
            boolean z = false;
            if (a != null) {
                ((C0505d) a.getLayoutParams()).f1696d = 17;
                bottomAppBar.mo939a(a);
                Rect rect = this.f1331b;
                rect.set(0, 0, a.getMeasuredWidth(), a.getMeasuredHeight());
                a.mo1392b(rect);
                bottomAppBar.setFabDiameter(this.f1331b.height());
            }
            if ((bottomAppBar.f1315c != null && bottomAppBar.f1315c.isRunning()) || ((bottomAppBar.f1317e != null && bottomAppBar.f1317e.isRunning()) || (bottomAppBar.f1316d != null && bottomAppBar.f1316d.isRunning()))) {
                z = true;
            }
            if (!z) {
                bottomAppBar.mo941b();
            }
            coordinatorLayout.mo1325a((View) bottomAppBar, i);
            return super.mo934a(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo967a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (!bottomAppBar.getHideOnScroll() || !super.mo967a(coordinatorLayout, bottomAppBar, view2, view3, i, i2)) {
                return false;
            }
            return true;
        }
    }

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
        int f1332a;

        /* renamed from: b */
        boolean f1333b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1332a);
            parcel.writeInt(this.f1333b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            super(parcel, classLoader);
            this.f1332a = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f1333b = z;
        }
    }

    public final int getFabAlignmentMode() {
        return this.f1318f;
    }

    public final boolean getHideOnScroll() {
        return this.f1322j;
    }

    public final void setSubtitle(CharSequence charSequence) {
    }

    public final void setTitle(CharSequence charSequence) {
    }

    private float getFabTranslationX() {
        return (float) m1014a(this.f1318f);
    }

    public final ColorStateList getBackgroundTint() {
        return this.f1313a.f1391i;
    }

    public final android.support.design.widget.CoordinatorLayout.Behavior<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public final float getCradleVerticalOffset() {
        return this.f1314b.f1337d;
    }

    public final float getFabCradleMargin() {
        return this.f1314b.f1335b;
    }

    public final float getFabCradleRoundedCornerRadius() {
        return this.f1314b.f1334a;
    }

    /* renamed from: c */
    private boolean m1015c() {
        FloatingActionButton a = mo938a();
        if (a == null || !a.mo1394b()) {
            return false;
        }
        return true;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1332a = this.f1318f;
        savedState.f1333b = this.f1319g;
        return savedState;
    }

    /* renamed from: a */
    public final FloatingActionButton mo938a() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).mo1334c((View) this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo941b() {
        float f;
        this.f1314b.f1338e = getFabTranslationX();
        FloatingActionButton a = mo938a();
        C0427c cVar = this.f1313a;
        if (!this.f1319g || !m1015c()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        cVar.mo1021a(f);
        if (a != null) {
            a.setTranslationY(getFabTranslationY());
            a.setTranslationX(getFabTranslationX());
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m1015c()) {
                mo940a(actionMenuView, 0, false);
                return;
            }
            mo940a(actionMenuView, this.f1318f, this.f1319g);
        }
    }

    public final float getFabTranslationY() {
        boolean z = this.f1319g;
        FloatingActionButton a = mo938a();
        if (a == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        a.mo1391a(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) a.getMeasuredHeight();
        }
        float height2 = (float) (a.getHeight() - rect.bottom);
        float f = (-getCradleVerticalOffset()) + (height / 2.0f) + height2;
        float height3 = ((float) (a.getHeight() - rect.height())) - ((float) a.getPaddingBottom());
        float f2 = (float) (-getMeasuredHeight());
        if (z) {
            height3 = f;
        }
        return f2 + height3;
    }

    public final void setHideOnScroll(boolean z) {
        this.f1322j = z;
    }

    public final void setBackgroundTint(ColorStateList colorStateList) {
        C0809a.m2327a((Drawable) this.f1313a, colorStateList);
    }

    /* renamed from: a */
    private int m1014a(int i) {
        boolean z;
        int i2 = 1;
        if (C1056u.m3055f(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f1321i;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3119e);
        this.f1318f = savedState.f1332a;
        this.f1319g = savedState.f1333b;
    }

    public final void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            this.f1314b.f1337d = f;
            this.f1313a.invalidateSelf();
        }
    }

    public final void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            this.f1314b.f1335b = f;
            this.f1313a.invalidateSelf();
        }
    }

    public final void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            this.f1314b.f1334a = f;
            this.f1313a.invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void setFabDiameter(int i) {
        float f = (float) i;
        if (f != this.f1314b.f1336c) {
            this.f1314b.f1336c = f;
            this.f1313a.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo939a(FloatingActionButton floatingActionButton) {
        AnimatorListenerAdapter animatorListenerAdapter = this.f1320h;
        C0547i impl = floatingActionButton.getImpl();
        if (impl.f1986t != null) {
            impl.f1986t.remove(animatorListenerAdapter);
        }
        AnimatorListenerAdapter animatorListenerAdapter2 = this.f1320h;
        C0547i impl2 = floatingActionButton.getImpl();
        if (impl2.f1985s != null) {
            impl2.f1985s.remove(animatorListenerAdapter2);
        }
        AnimatorListenerAdapter animatorListenerAdapter3 = this.f1320h;
        C0547i impl3 = floatingActionButton.getImpl();
        if (impl3.f1986t == null) {
            impl3.f1986t = new ArrayList<>();
        }
        impl3.f1986t.add(animatorListenerAdapter3);
        AnimatorListenerAdapter animatorListenerAdapter4 = this.f1320h;
        C0547i impl4 = floatingActionButton.getImpl();
        if (impl4.f1985s == null) {
            impl4.f1985s = new ArrayList<>();
        }
        impl4.f1985s.add(animatorListenerAdapter4);
    }

    public final void setFabAlignmentMode(int i) {
        final boolean z;
        final int i2;
        if (this.f1318f != i && C1056u.m3079y(this)) {
            if (this.f1316d != null) {
                this.f1316d.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f1319g) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f1314b.f1338e, (float) m1014a(i)});
                ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BottomAppBar.this.f1314b.f1338e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BottomAppBar.this.f1313a.invalidateSelf();
                    }
                });
                ofFloat.setDuration(300);
                arrayList.add(ofFloat);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mo938a(), "translationX", new float[]{(float) m1014a(i)});
            ofFloat2.setDuration(300);
            arrayList.add(ofFloat2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f1316d = animatorSet;
            this.f1316d.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.f1316d = null;
                }
            });
            this.f1316d.start();
        }
        boolean z2 = this.f1319g;
        if (C1056u.m3079y(this)) {
            if (this.f1317e != null) {
                this.f1317e.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (!m1015c()) {
                i2 = 0;
                z = false;
            } else {
                z = z2;
                i2 = i;
            }
            final ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
                if ((this.f1319g || (z && m1015c())) && (this.f1318f == 1 || i2 == 1)) {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                    ofFloat4.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a */
                        public boolean f1326a;

                        public final void onAnimationCancel(Animator animator) {
                            this.f1326a = true;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!this.f1326a) {
                                BottomAppBar.this.mo940a(actionMenuView, i2, z);
                            }
                        }
                    });
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150);
                    animatorSet2.playSequentially(new Animator[]{ofFloat4, ofFloat3});
                    arrayList2.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList2.add(ofFloat3);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f1317e = animatorSet3;
            this.f1317e.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.f1317e = null;
                }
            });
            this.f1317e.start();
        }
        this.f1318f = i;
    }

    /* renamed from: a */
    public final void mo940a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2;
        int i2;
        float f;
        boolean z3;
        int i3;
        if (C1056u.m3055f(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt.getLayoutParams() instanceof LayoutParams) || (((LayoutParams) childAt.getLayoutParams()).f3592a & 8388615) != 8388611) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                if (z2) {
                    i3 = childAt.getLeft();
                } else {
                    i3 = childAt.getRight();
                }
                i4 = Math.max(i4, i3);
            }
        }
        if (z2) {
            i2 = actionMenuView.getRight();
        } else {
            i2 = actionMenuView.getLeft();
        }
        int i6 = i4 - i2;
        if (i != 1 || !z) {
            f = 0.0f;
        } else {
            f = (float) i6;
        }
        actionMenuView.setTranslationX(f);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1315c != null) {
            this.f1315c.cancel();
        }
        if (this.f1317e != null) {
            this.f1317e.cancel();
        }
        if (this.f1316d != null) {
            this.f1316d.cancel();
        }
        mo941b();
    }
}
