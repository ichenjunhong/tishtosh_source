package android.support.design.p022a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p030v4.p038f.C0800n;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.design.a.h */
public final class C0396h {

    /* renamed from: a */
    private final C0800n<String, C0397i> f1280a = new C0800n<>();

    public final int hashCode() {
        return this.f1280a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.f1280a);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    public final long mo888a() {
        int size = this.f1280a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C0397i iVar = (C0397i) this.f1280a.mo2577c(i);
            j = Math.max(j, iVar.f1281a + iVar.f1282b);
        }
        return j;
    }

    /* renamed from: a */
    private static C0396h m968a(List<Animator> list) {
        C0396h hVar = new C0396h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m969a(hVar, (Animator) list.get(i));
        }
        return hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f1280a.equals(((C0396h) obj).f1280a);
    }

    /* renamed from: a */
    public final C0397i mo889a(String str) {
        boolean z;
        if (this.f1280a.get(str) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (C0397i) this.f1280a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private void m970a(String str, C0397i iVar) {
        this.f1280a.put(str, iVar);
    }

    /* renamed from: a */
    public static C0396h m967a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m968a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m968a((List<Animator>) arrayList);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m969a(C0396h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.m970a(objectAnimator.getPropertyName(), C0397i.m973a((ValueAnimator) objectAnimator));
            return;
        }
        StringBuilder sb = new StringBuilder("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }
}
