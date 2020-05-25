package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.trill.R;

public final class Constraints extends ViewGroup {

    /* renamed from: a */
    C0359b f884a;

    public static class LayoutParams extends android.support.constraint.ConstraintLayout.LayoutParams {

        /* renamed from: an */
        public float f885an = 1.0f;

        /* renamed from: ao */
        public boolean f886ao;

        /* renamed from: ap */
        public float f887ap;

        /* renamed from: aq */
        public float f888aq;

        /* renamed from: ar */
        public float f889ar;

        /* renamed from: as */
        public float f890as;

        /* renamed from: at */
        public float f891at = 1.0f;

        /* renamed from: au */
        public float f892au = 1.0f;

        /* renamed from: av */
        public float f893av;

        /* renamed from: aw */
        public float f894aw;

        /* renamed from: ax */
        public float f895ax;

        /* renamed from: ay */
        public float f896ay;

        /* renamed from: az */
        public float f897az;

        public LayoutParams(int i, int i2) {
            super(-2, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.qi, R.attr.qj, R.attr.qk, R.attr.ql, R.attr.qm, R.attr.qn, R.attr.qo, R.attr.qp, R.attr.qq, R.attr.qr, R.attr.qs, R.attr.qt, R.attr.qu, R.attr.qv, R.attr.qw, R.attr.qx, R.attr.qy, R.attr.qz, R.attr.r0, R.attr.r1, R.attr.r2, R.attr.r3, R.attr.r4, R.attr.r5, R.attr.r6, R.attr.r7, R.attr.r8, R.attr.r9, R.attr.r_, R.attr.ra, R.attr.rb, R.attr.rc, R.attr.rd, R.attr.re, R.attr.rf, R.attr.rg, R.attr.rh, R.attr.ri, R.attr.rj, R.attr.rk, R.attr.rl, R.attr.rn, R.attr.ro, R.attr.rp, R.attr.rq, R.attr.rr, R.attr.rs, R.attr.rt, R.attr.ru});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.f885an = obtainStyledAttributes.getFloat(index, this.f885an);
                } else if (index == 22) {
                    this.f887ap = obtainStyledAttributes.getFloat(index, this.f887ap);
                    this.f886ao = true;
                } else if (index == 17) {
                    this.f889ar = obtainStyledAttributes.getFloat(index, this.f889ar);
                } else if (index == 18) {
                    this.f890as = obtainStyledAttributes.getFloat(index, this.f890as);
                } else if (index == 16) {
                    this.f888aq = obtainStyledAttributes.getFloat(index, this.f888aq);
                } else if (index == 14) {
                    this.f891at = obtainStyledAttributes.getFloat(index, this.f891at);
                } else if (index == 15) {
                    this.f892au = obtainStyledAttributes.getFloat(index, this.f892au);
                } else if (index == 10) {
                    this.f893av = obtainStyledAttributes.getFloat(index, this.f893av);
                } else if (index == 11) {
                    this.f894aw = obtainStyledAttributes.getFloat(index, this.f894aw);
                } else if (index == 12) {
                    this.f895ax = obtainStyledAttributes.getFloat(index, this.f895ax);
                } else if (index == 13) {
                    this.f896ay = obtainStyledAttributes.getFloat(index, this.f896ay);
                } else if (index == 21) {
                    this.f895ax = obtainStyledAttributes.getFloat(index, this.f897az);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public final C0359b getConstraintSet() {
        if (this.f884a == null) {
            this.f884a = new C0359b();
        }
        C0359b bVar = this.f884a;
        int childCount = getChildCount();
        bVar.f1146b.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!bVar.f1146b.containsKey(Integer.valueOf(id))) {
                    bVar.f1146b.put(Integer.valueOf(id), new C0361a());
                }
                C0361a aVar = (C0361a) bVar.f1146b.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    aVar.mo819a(id, layoutParams);
                    if (constraintHelper instanceof C0323a) {
                        aVar.f1192as = 1;
                        C0323a aVar2 = (C0323a) constraintHelper;
                        aVar.f1191ar = aVar2.getType();
                        aVar.f1193at = aVar2.getReferencedIds();
                    }
                }
                aVar.mo819a(id, layoutParams);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f884a;
    }

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new android.support.constraint.ConstraintLayout.LayoutParams(layoutParams);
    }

    public final /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
