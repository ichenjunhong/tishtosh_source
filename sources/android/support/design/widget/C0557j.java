package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.design.p027e.C0424a;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.j */
final class C0557j extends C0547i {

    /* renamed from: D */
    private InsetDrawable f2003D;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1719b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo1721c() {
        mo1722d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo1723e() {
        return false;
    }

    /* renamed from: a */
    public final float mo1712a() {
        return this.f1960A.getElevation();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1716a(ColorStateList colorStateList) {
        if (this.f1977k instanceof RippleDrawable) {
            ((RippleDrawable) this.f1977k).setColor(C0424a.m1036a(colorStateList));
        } else {
            super.mo1716a(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1720b(Rect rect) {
        if (this.f1961B.mo1452b()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.f1977k, rect.left, rect.top, rect.right, rect.bottom);
            this.f2003D = insetDrawable;
            this.f1961B.mo1451a(this.f2003D);
            return;
        }
        this.f1961B.mo1451a(this.f1977k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1717a(Rect rect) {
        if (this.f1961B.mo1452b()) {
            float a = this.f1961B.mo1449a();
            float a2 = mo1712a() + this.f1982p;
            int ceil = (int) Math.ceil((double) C0561m.m1546b(a2, a, false));
            int ceil2 = (int) Math.ceil((double) C0561m.m1545a(a2, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1718a(int[] iArr) {
        if (VERSION.SDK_INT == 21) {
            if (this.f1960A.isEnabled()) {
                this.f1960A.setElevation(this.f1980n);
                if (this.f1960A.isPressed()) {
                    this.f1960A.setTranslationZ(this.f1982p);
                } else if (this.f1960A.isFocused() || this.f1960A.isHovered()) {
                    this.f1960A.setTranslationZ(this.f1981o);
                } else {
                    this.f1960A.setTranslationZ(0.0f);
                }
            } else {
                this.f1960A.setElevation(0.0f);
                this.f1960A.setTranslationZ(0.0f);
            }
        }
    }

    C0557j(C0574u uVar, C0562n nVar) {
        super(uVar, nVar);
    }

    /* renamed from: a */
    private Animator m1510a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f1960A, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f1960A, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(f1953a);
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1715a(float f, float f2, float f3) {
        if (VERSION.SDK_INT == 21) {
            this.f1960A.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f1954u, m1510a(f, f3));
            stateListAnimator.addState(f1955v, m1510a(f, f2));
            stateListAnimator.addState(f1956w, m1510a(f, f2));
            stateListAnimator.addState(f1957x, m1510a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f1960A, "elevation", new float[]{f}).setDuration(0));
            if (VERSION.SDK_INT >= 22 && VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.f1960A, View.TRANSLATION_Z, new float[]{this.f1960A.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f1960A, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f1953a);
            stateListAnimator.addState(f1958y, animatorSet);
            stateListAnimator.addState(f1959z, m1510a(0.0f, 0.0f));
            this.f1960A.setStateListAnimator(stateListAnimator);
        }
        if (this.f1961B.mo1452b()) {
            mo1722d();
        }
    }
}
