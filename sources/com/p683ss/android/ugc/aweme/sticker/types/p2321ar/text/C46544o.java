package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text;

import android.app.Activity;
import android.support.p030v4.app.FragmentActivity;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text.C46541n.C46543b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.o */
public final class C46544o {

    /* renamed from: a */
    private SparseArray<C46541n> f117439a = new SparseArray<>();

    /* renamed from: b */
    private C46535h f117440b;

    /* renamed from: a */
    public final void mo93328a() {
        for (int i = 0; i < this.f117439a.size(); i++) {
            int keyAt = this.f117439a.keyAt(i);
            ((C46541n) this.f117439a.get(keyAt)).mo93325d();
            ((C46541n) this.f117439a.get(keyAt)).f117437k = false;
        }
    }

    /* renamed from: b */
    public final void mo93331b() {
        for (int i = 0; i < this.f117439a.size(); i++) {
            C46541n nVar = (C46541n) this.f117439a.get(this.f117439a.keyAt(i));
            if (nVar != null && nVar.f117437k) {
                nVar.mo93311a();
            }
        }
    }

    /* renamed from: a */
    public final void mo93330a(Effect effect) {
        boolean z;
        if (effect.getTags().contains("AR")) {
            z = false;
        } else {
            effect.getTags().contains("text2d");
            z = true;
        }
        if (!z) {
            C46535h hVar = this.f117440b;
            if (hVar.f117416b != null) {
                hVar.f117415a = hVar.f117416b;
                hVar.f117416b = null;
                hVar.mo93315a(hVar.f117415a);
            }
        }
    }

    public C46544o(FragmentActivity fragmentActivity, C46354l lVar, C20489b bVar) {
        this.f117439a.put(0, new C46526a(fragmentActivity, bVar).mo93318a(0));
        this.f117439a.put(1, new C46531e(fragmentActivity, bVar).mo93318a(1));
        this.f117440b = new C46535h(lVar, this.f117439a, fragmentActivity);
    }

    /* renamed from: a */
    public final void mo93329a(int i, C46543b bVar, Activity activity, ViewGroup viewGroup) {
        EffectTextInputView effectTextInputView;
        switch (i) {
            case 0:
                effectTextInputView = new ARTextInputView(activity);
                break;
            case 1:
                effectTextInputView = new BubbleTextInputView(activity);
                break;
            default:
                effectTextInputView = new EffectTextInputView(activity);
                break;
        }
        viewGroup.addView(effectTextInputView);
        ((C46541n) this.f117439a.get(i)).mo93307a(effectTextInputView);
        ((C46541n) this.f117439a.get(i)).mo93319a(bVar);
        ((C46541n) this.f117439a.get(i)).mo93326e();
        ((C46541n) this.f117439a.get(i)).f117437k = true;
    }
}
