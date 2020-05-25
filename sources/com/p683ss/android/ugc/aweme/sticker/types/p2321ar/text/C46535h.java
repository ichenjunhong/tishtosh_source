package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text;

import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.h */
public final class C46535h {

    /* renamed from: a */
    C46540m f117415a;

    /* renamed from: b */
    C46540m f117416b;

    /* renamed from: c */
    private SparseArray<C46541n> f117417c;

    /* renamed from: d */
    private final C46354l f117418d;

    /* renamed from: a */
    private boolean m100996a() {
        return C46059g.m100081e(m100997b());
    }

    /* renamed from: b */
    private Effect m100997b() {
        return (Effect) this.f117418d.mo92989g().mo93014b().getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo93315a(C46540m mVar) {
        C46541n nVar = (C46541n) this.f117417c.get(mVar.f117425c);
        if (mVar.f117423a != 32) {
            if (mVar.f117423a == 33) {
                nVar.mo93324c();
            }
        } else if (m100996a() && nVar != null) {
            nVar.f117430d = this.f117415a;
            nVar.mo93323b(mVar.f117424b, mVar.f117426d);
            nVar.mo93322b();
            nVar.mo93321a(mVar.f117426d, mVar.f117424b);
        }
    }

    public C46535h(C46354l lVar, SparseArray<C46541n> sparseArray, FragmentActivity fragmentActivity) {
        this.f117418d = lVar;
        if (fragmentActivity != null) {
            this.f117417c = sparseArray;
            ((ARTextResultModule) C0214z.m440a(fragmentActivity).mo359a(ARTextResultModule.class)).mo93285a().observe(fragmentActivity, new C46536i(this));
            ((ARTextResultModule) C0214z.m440a(fragmentActivity).mo359a(ARTextResultModule.class)).mo93286b().observe(fragmentActivity, new C46537j(this));
        }
    }
}
