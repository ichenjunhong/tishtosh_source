package com.p683ss.android.ugc.aweme.poi.p2074ui.p2075a;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.poi.model.C39105ak;
import com.p683ss.android.ugc.aweme.poi.model.C39125i;
import com.p683ss.android.ugc.aweme.poi.model.C39136t;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39384j;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39384j.C39386a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39387k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a.a */
public final class C39278a extends C39384j<C39125i> {

    /* renamed from: p */
    public boolean f100407p;

    /* renamed from: q */
    private C39105ak f100408q;

    /* renamed from: w */
    public final C39125i mo54803n() {
        return (C39125i) this.f70700f;
    }

    /* renamed from: u */
    public final C39136t mo80092u() {
        if (this.f100408q != null) {
            return this.f100408q.getActivity();
        }
        return null;
    }

    /* renamed from: s */
    public final boolean mo77307s() {
        if (this.f100408q == null || this.f100408q.getException() != null || !mo80091t()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public final boolean mo80091t() {
        C39136t tVar;
        if (this.f100408q != null) {
            tVar = this.f100408q.getActivity();
        } else {
            tVar = null;
        }
        if (tVar == null || !tVar.isValid()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final List<C37859b> mo80093v() {
        if (this.f70700f != null) {
            return ((C39125i) this.f70700f).getItems();
        }
        return new ArrayList();
    }

    /* renamed from: b */
    public final void mo44838b() {
        if (this.f70700f != null && this.f70701g != null && ((C39387k) this.f70701g).isViewValid()) {
            int i = ((C39125i) this.f70700f).mListQueryType;
            boolean z = false;
            if (i != 1) {
                switch (i) {
                    case 4:
                    case 5:
                        C39387k kVar = (C39387k) this.f70701g;
                        List items = ((C39125i) this.f70700f).getItems();
                        if (((C39125i) this.f70700f).isHasMore() && !((C39125i) this.f70700f).isNewDataEmpty()) {
                            z = true;
                        }
                        kVar.mo64883b(items, z);
                        break;
                }
                return;
            }
            this.f100407p = false;
            ((C39387k) this.f70701g).mo64876a(((C39125i) this.f70700f).getItems(), ((C39125i) this.f70700f).isHasMore());
        }
    }

    public C39278a(C39386a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo80090a(List<C37859b> list) {
        if (this.f70700f != null) {
            ((C39125i) this.f70700f).setItems(list);
        }
    }

    /* renamed from: a */
    public final void mo80088a(Activity activity) {
        if (this.f100408q != null && this.f100408q.getException() != null) {
            C22971a.m56493a((Context) activity, (Throwable) this.f100408q.getException());
        }
    }

    /* renamed from: a */
    public final void mo80089a(C39105ak akVar) {
        this.f100408q = akVar;
        if (this.f100739o != null) {
            if (mo77307s()) {
                this.f100739o.mo80032k();
            }
            if (mo64727q().getActivity() != null) {
                mo80088a((Activity) mo64727q().getActivity());
            }
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70700f != null && this.f70701g != null && ((C39387k) this.f70701g).isViewValid()) {
            ((C39387k) this.f70701g).mo64877a(false);
            int i = ((C39125i) this.f70700f).mListQueryType;
            if (i != 1) {
                switch (i) {
                    case 4:
                        ((C39387k) this.f70701g).mo64885b(1);
                        return;
                    case 5:
                        ((C39387k) this.f70701g).mo64885b(5);
                        break;
                }
                return;
            }
            ((C39387k) this.f70701g).mo64861a(1);
            this.f100407p = true;
        }
    }
}
