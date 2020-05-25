package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43501am;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49558e;
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

/* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel */
public final class EditLyricStickerViewModel extends BaseJediViewModel<EditLyricStickerState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f123142d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditLyricStickerViewModel.class), "startChooseMusic", "getStartChooseMusic()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditLyricStickerViewModel.class), "inEditState", "getInEditState()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    private final C52668f f123143e = C52732g.m112285a(C48964j.f123153a);

    /* renamed from: f */
    private final C52668f f123144f = C52732g.m112285a(C48955a.f123145a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel$a */
    static final class C48955a extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C48955a f123145a = new C48955a();

        C48955a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel$b */
    static final class C48956b extends C52712l implements C52671b<EditLyricStickerState, EditLyricStickerState> {

        /* renamed from: a */
        public static final C48956b f123146a = new C48956b();

        C48956b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditLyricStickerState editLyricStickerState = (EditLyricStickerState) obj;
            C52711k.m112240b(editLyricStickerState, "$receiver");
            return EditLyricStickerState.copy$default(editLyricStickerState, null, null, null, null, null, null, new C49558e(0), null, 191, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel$c */
    public static final class C48957c extends C52712l implements C52671b<EditLyricStickerState, EditLyricStickerState> {
        public static final C48957c INSTANCE = new C48957c();

        C48957c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditLyricStickerState editLyricStickerState = (EditLyricStickerState) obj;
            C52711k.m112240b(editLyricStickerState, "$receiver");
            return EditLyricStickerState.copy$default(editLyricStickerState, null, null, null, null, null, null, null, new C49561h(), 127, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel$d */
    static final class C48958d extends C52712l implements C52671b<EditLyricStickerState, EditLyricStickerState> {

        /* renamed from: a */
        final /* synthetic */ Integer f123147a;

        C48958d(Integer num) {
            this.f123147a = num;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int i;
            EditLyricStickerState editLyricStickerState = (EditLyricStickerState) obj;
            C52711k.m112240b(editLyricStickerState, "$receiver");
            Integer num = this.f123147a;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return EditLyricStickerState.copy$default(editLyricStickerState, new C49558e(i), null, null, null, null, null, null, null, 254, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel$e */
    public static final class C48959e extends C52712l implements C52671b<EditLyricStickerState, EditLyricStickerState> {

        /* renamed from: a */
        final /* synthetic */ C49394cw f123148a;

        public C48959e(C49394cw cwVar) {
            this.f123148a = cwVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditLyricStickerState editLyricStickerState = (EditLyricStickerState) obj;
            C52711k.m112240b(editLyricStickerState, "$receiver");
            return EditLyricStickerState.copy$default(editLyricStickerState, null, this.f123148a, null, null, null, null, null, null, 253, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel$f */
    static final class C48960f extends C52712l implements C52671b<EditLyricStickerState, EditLyricStickerState> {

        /* renamed from: a */
        final /* synthetic */ Integer f123149a;

        C48960f(Integer num) {
            this.f123149a = num;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditLyricStickerState editLyricStickerState = (EditLyricStickerState) obj;
            C52711k.m112240b(editLyricStickerState, "$receiver");
            return EditLyricStickerState.copy$default(editLyricStickerState, null, null, null, null, null, this.f123149a, null, null, 223, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel$g */
    static final class C48961g extends C52712l implements C52671b<EditLyricStickerState, EditLyricStickerState> {

        /* renamed from: a */
        public static final C48961g f123150a = new C48961g();

        C48961g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditLyricStickerState editLyricStickerState = (EditLyricStickerState) obj;
            C52711k.m112240b(editLyricStickerState, "$receiver");
            return EditLyricStickerState.copy$default(editLyricStickerState, null, null, new C49561h(), null, null, null, null, null, 251, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel$h */
    public static final class C48962h extends C52712l implements C52671b<EditLyricStickerState, EditLyricStickerState> {

        /* renamed from: a */
        final /* synthetic */ C43501am f123151a;

        public C48962h(C43501am amVar) {
            this.f123151a = amVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditLyricStickerState editLyricStickerState = (EditLyricStickerState) obj;
            C52711k.m112240b(editLyricStickerState, "$receiver");
            return EditLyricStickerState.copy$default(editLyricStickerState, null, null, null, null, this.f123151a, null, null, null, 239, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel$i */
    static final class C48963i extends C52712l implements C52671b<EditLyricStickerState, EditLyricStickerState> {

        /* renamed from: a */
        public static final C48963i f123152a = new C48963i();

        C48963i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditLyricStickerState editLyricStickerState = (EditLyricStickerState) obj;
            C52711k.m112240b(editLyricStickerState, "$receiver");
            return EditLyricStickerState.copy$default(editLyricStickerState, null, null, null, new C49561h(), null, null, null, null, 247, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel$j */
    static final class C48964j extends C52712l implements C52670a<C0198r<C49393cv>> {

        /* renamed from: a */
        public static final C48964j f123153a = new C48964j();

        C48964j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: e */
    public final C0198r<C49393cv> mo96878e() {
        return (C0198r) this.f123143e.getValue();
    }

    /* renamed from: f */
    public final C0198r<Boolean> mo96879f() {
        return (C0198r) this.f123144f.getValue();
    }

    /* renamed from: g */
    public final void mo96880g() {
        mo22530c(C48961g.f123150a);
    }

    /* renamed from: h */
    public final void mo96881h() {
        mo22530c(C48963i.f123152a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        EditLyricStickerState editLyricStickerState = new EditLyricStickerState(null, null, null, null, null, null, null, null, NormalGiftView.ALPHA_255, null);
        return editLyricStickerState;
    }

    /* renamed from: a */
    public final void mo96876a(Integer num) {
        mo22530c(new C48958d(num));
    }

    /* renamed from: b */
    public final void mo96877b(Integer num) {
        mo22530c(new C48960f(num));
    }
}
