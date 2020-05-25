package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p030v4.view.p042b.C1024c;
import android.support.p043v7.widget.C1506w;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.jedi.ext.adapter.p747b.C11949e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.i */
public final class C32760i extends C1506w {

    /* renamed from: n */
    private final List<C1352v> f85319n = new ArrayList();

    /* renamed from: o */
    private final List<C1352v> f85320o = new ArrayList();

    /* renamed from: b */
    public final boolean mo4997b() {
        if (!this.f85319n.isEmpty() || !this.f85320o.isEmpty() || super.mo4997b()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo5001d() {
        for (int size = this.f85319n.size() - 1; size >= 0; size--) {
            C1352v vVar = (C1352v) this.f85319n.get(size);
            m75634a(vVar.itemView);
            mo5632i(vVar);
            this.f85319n.remove(size);
        }
        for (int size2 = this.f85320o.size() - 1; size2 >= 0; size2--) {
            C1352v vVar2 = (C1352v) this.f85320o.get(size2);
            m75634a(vVar2.itemView);
            mo5632i(vVar2);
            this.f85320o.remove(size2);
        }
        super.mo5001d();
    }

    /* renamed from: a */
    public final void mo4993a() {
        super.mo4993a();
        if (!this.f85319n.isEmpty()) {
            for (int size = this.f85319n.size() - 1; size >= 0; size--) {
                final C1352v vVar = (C1352v) this.f85319n.get(size);
                vVar.itemView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(this.f4728i).setListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        C32760i.m75634a(vVar.itemView);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animator.getListeners().remove(this);
                        C32760i.m75634a(vVar.itemView);
                        C32760i.this.mo5632i(vVar);
                        C32760i.m75635a(C32760i.this);
                    }
                }).setInterpolator(new C1024c());
                this.f85319n.remove(size);
            }
        }
        if (!this.f85320o.isEmpty()) {
            for (int size2 = this.f85320o.size() - 1; size2 >= 0; size2--) {
                final C1352v vVar2 = (C1352v) this.f85320o.get(size2);
                vVar2.itemView.animate().alpha(0.0f).translationX((float) (-vVar2.itemView.getWidth())).setDuration(this.f4729j).setListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        C32760i.m75634a(vVar2.itemView);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animator.getListeners().remove(this);
                        C32760i.m75634a(vVar2.itemView);
                        C32760i.this.mo5630g(vVar2);
                        C32760i.m75635a(C32760i.this);
                    }
                }).setInterpolator(new C1024c());
                this.f85320o.remove(size2);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m75635a(C32760i iVar) {
        if (!iVar.mo4997b()) {
            iVar.mo5002e();
        }
    }

    /* renamed from: a */
    public static void m75634a(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* renamed from: a */
    public final boolean mo5626a(C1352v vVar) {
        if (!(vVar instanceof C32763j) && !(vVar instanceof C11949e)) {
            return super.mo5626a(vVar);
        }
        vVar.itemView.setAlpha(1.0f);
        vVar.itemView.setTranslationX(0.0f);
        this.f85320o.add(vVar);
        return true;
    }

    /* renamed from: b */
    public final boolean mo5629b(C1352v vVar) {
        if (!(vVar instanceof C32763j)) {
            return super.mo5629b(vVar);
        }
        vVar.itemView.setAlpha(0.0f);
        vVar.itemView.setTranslationY((float) vVar.itemView.getHeight());
        vVar.itemView.setScaleX(0.5f);
        vVar.itemView.setScaleY(0.5f);
        this.f85319n.add(vVar);
        return true;
    }

    /* renamed from: c */
    public final void mo4999c(C1352v vVar) {
        vVar.itemView.animate().cancel();
        if (this.f85319n.remove(vVar)) {
            mo5632i(vVar);
            m75634a(vVar.itemView);
        }
        if (this.f85320o.remove(vVar)) {
            mo5630g(vVar);
            m75634a(vVar.itemView);
        }
        super.mo4999c(vVar);
    }
}
