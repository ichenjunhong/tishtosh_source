package android.support.design.p022a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: android.support.design.a.i */
public final class C0397i {

    /* renamed from: a */
    public long f1281a;

    /* renamed from: b */
    public long f1282b = 300;

    /* renamed from: c */
    public int f1283c;

    /* renamed from: d */
    public int f1284d = 1;

    /* renamed from: e */
    private TimeInterpolator f1285e;

    /* renamed from: a */
    public final TimeInterpolator mo893a() {
        if (this.f1285e != null) {
            return this.f1285e;
        }
        return C0389a.f1268b;
    }

    public final int hashCode() {
        return (((((((((int) (this.f1281a ^ (this.f1281a >>> 32))) * 31) + ((int) (this.f1282b ^ (this.f1282b >>> 32)))) * 31) + mo893a().getClass().hashCode()) * 31) + this.f1283c) * 31) + this.f1284d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f1281a);
        sb.append(" duration: ");
        sb.append(this.f1282b);
        sb.append(" interpolator: ");
        sb.append(mo893a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f1283c);
        sb.append(" repeatMode: ");
        sb.append(this.f1284d);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    static C0397i m973a(ValueAnimator valueAnimator) {
        C0397i iVar = new C0397i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m974b(valueAnimator));
        iVar.f1283c = valueAnimator.getRepeatCount();
        iVar.f1284d = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: b */
    private static TimeInterpolator m974b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C0389a.f1268b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C0389a.f1269c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return C0389a.f1270d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public final void mo894a(Animator animator) {
        animator.setStartDelay(this.f1281a);
        animator.setDuration(this.f1282b);
        animator.setInterpolator(mo893a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f1283c);
            valueAnimator.setRepeatMode(this.f1284d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0397i iVar = (C0397i) obj;
        if (this.f1281a == iVar.f1281a && this.f1282b == iVar.f1282b && this.f1283c == iVar.f1283c && this.f1284d == iVar.f1284d) {
            return mo893a().getClass().equals(iVar.mo893a().getClass());
        }
        return false;
    }

    public C0397i(long j, long j2) {
        this.f1281a = j;
        this.f1282b = 150;
    }

    private C0397i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f1281a = j;
        this.f1282b = j2;
        this.f1285e = timeInterpolator;
    }
}
