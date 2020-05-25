package android.support.p043v7.view.menu;

import android.content.Context;
import android.support.p030v4.p031a.p032a.C0576b;
import android.support.p030v4.view.C1019b.C1021b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.menu.l */
final class C1257l extends C1252k {

    /* renamed from: android.support.v7.view.menu.l$a */
    class C1258a extends C1253a implements VisibilityListener {

        /* renamed from: f */
        C1021b f4282f;

        /* renamed from: b */
        public final boolean mo3197b() {
            return this.f4277d.overridesItemVisibility();
        }

        /* renamed from: c */
        public final boolean mo3198c() {
            return this.f4277d.isVisible();
        }

        /* renamed from: a */
        public final View mo3193a(MenuItem menuItem) {
            return this.f4277d.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public final void mo3194a(C1021b bVar) {
            this.f4282f = bVar;
            this.f4277d.setVisibilityListener(this);
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            if (this.f4282f != null) {
                this.f4282f.mo3202a(z);
            }
        }

        public C1258a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1253a mo4213a(ActionProvider actionProvider) {
        return new C1258a(this.f4154a, actionProvider);
    }

    C1257l(Context context, C0576b bVar) {
        super(context, bVar);
    }
}
