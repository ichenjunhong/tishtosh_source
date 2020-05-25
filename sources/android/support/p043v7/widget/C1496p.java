package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;

/* renamed from: android.support.v7.widget.p */
final class C1496p implements C1500s {
    C1496p() {
    }

    /* renamed from: a */
    public final void mo5814a() {
    }

    /* renamed from: j */
    private static C1431ap m5287j(C1499r rVar) {
        return (C1431ap) rVar.mo4646c();
    }

    /* renamed from: a */
    public final float mo5815a(C1499r rVar) {
        return m5287j(rVar).f5130b;
    }

    /* renamed from: d */
    public final float mo5823d(C1499r rVar) {
        return m5287j(rVar).f5129a;
    }

    /* renamed from: f */
    public final void mo5825f(C1499r rVar) {
        mo5820b(rVar, mo5815a(rVar));
    }

    /* renamed from: g */
    public final void mo5826g(C1499r rVar) {
        mo5820b(rVar, mo5815a(rVar));
    }

    /* renamed from: h */
    public final ColorStateList mo5827h(C1499r rVar) {
        return m5287j(rVar).f5131c;
    }

    /* renamed from: b */
    public final float mo5819b(C1499r rVar) {
        return mo5823d(rVar) * 2.0f;
    }

    /* renamed from: c */
    public final float mo5821c(C1499r rVar) {
        return mo5823d(rVar) * 2.0f;
    }

    /* renamed from: e */
    public final float mo5824e(C1499r rVar) {
        return rVar.mo4647d().getElevation();
    }

    /* renamed from: i */
    private void m5286i(C1499r rVar) {
        if (!rVar.mo4644a()) {
            rVar.mo4642a(0, 0, 0, 0);
            return;
        }
        float a = mo5815a(rVar);
        float d = mo5823d(rVar);
        int ceil = (int) Math.ceil((double) C1432aq.m4968b(a, d, rVar.mo4645b()));
        int ceil2 = (int) Math.ceil((double) C1432aq.m4966a(a, d, rVar.mo4645b()));
        rVar.mo4642a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: c */
    public final void mo5822c(C1499r rVar, float f) {
        rVar.mo4647d().setElevation(f);
    }

    /* renamed from: a */
    public final void mo5818a(C1499r rVar, ColorStateList colorStateList) {
        C1431ap j = m5287j(rVar);
        j.mo5577a(colorStateList);
        j.invalidateSelf();
    }

    /* renamed from: a */
    public final void mo5816a(C1499r rVar, float f) {
        C1431ap j = m5287j(rVar);
        if (f != j.f5129a) {
            j.f5129a = f;
            j.mo5578a((Rect) null);
            j.invalidateSelf();
        }
    }

    /* renamed from: b */
    public final void mo5820b(C1499r rVar, float f) {
        m5287j(rVar).mo5576a(f, rVar.mo4644a(), rVar.mo4645b());
        m5286i(rVar);
    }

    /* renamed from: a */
    public final void mo5817a(C1499r rVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        rVar.mo4643a(new C1431ap(colorStateList, f));
        View d = rVar.mo4647d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo5820b(rVar, f3);
    }
}
