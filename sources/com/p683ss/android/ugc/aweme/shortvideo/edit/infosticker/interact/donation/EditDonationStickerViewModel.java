package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel */
public final class EditDonationStickerViewModel extends BaseJediViewModel<EditDonationStickerState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f110300d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditDonationStickerViewModel.class), "viewAlpha", "getViewAlpha()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    public C0198r<Boolean> f110301e;

    /* renamed from: f */
    private final C52668f f110302f = C52732g.m112285a(C43586c.f110305a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel$a */
    static final class C43584a extends C52712l implements C52671b<EditDonationStickerState, EditDonationStickerState> {

        /* renamed from: a */
        public static final C43584a f110303a = new C43584a();

        C43584a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditDonationStickerState editDonationStickerState = (EditDonationStickerState) obj;
            C52711k.m112240b(editDonationStickerState, "$receiver");
            return EditDonationStickerState.copy$default(editDonationStickerState, new C49561h(), false, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel$b */
    static final class C43585b extends C52712l implements C52671b<EditDonationStickerState, EditDonationStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f110304a;

        C43585b(boolean z) {
            this.f110304a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditDonationStickerState editDonationStickerState = (EditDonationStickerState) obj;
            C52711k.m112240b(editDonationStickerState, "$receiver");
            return EditDonationStickerState.copy$default(editDonationStickerState, null, this.f110304a, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel$c */
    static final class C43586c extends C52712l implements C52670a<C0198r<Float>> {

        /* renamed from: a */
        public static final C43586c f110305a = new C43586c();

        C43586c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: e */
    public final C0198r<Float> mo88797e() {
        return (C0198r) this.f110302f.getValue();
    }

    /* renamed from: f */
    public final void mo88798f() {
        mo22530c(C43584a.f110303a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditDonationStickerState(null, false, 3, null);
    }

    /* renamed from: a */
    public final void mo88795a(float f) {
        mo88797e().setValue(Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo88796a(boolean z) {
        mo22530c(new C43585b(z));
        C0198r<Boolean> rVar = this.f110301e;
        if (rVar != null && (!C52711k.m112239a((Object) (Boolean) rVar.getValue(), (Object) Boolean.valueOf(z)))) {
            rVar.setValue(Boolean.valueOf(z));
        }
    }
}
