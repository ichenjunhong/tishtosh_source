package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.editor.EditTextStickerViewModel */
public final class EditTextStickerViewModel extends JediViewModel<EditTextStickerState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f123203d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditTextStickerViewModel.class), "alphaVisible", "getAlphaVisible()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    private final C52668f f123204e = C52732g.m112285a(C48991a.f123205a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditTextStickerViewModel$a */
    static final class C48991a extends C52712l implements C52670a<C0198r<C52847n<? extends Float, ? extends Boolean>>> {

        /* renamed from: a */
        public static final C48991a f123205a = new C48991a();

        C48991a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditTextStickerViewModel$b */
    static final class C48992b extends C52712l implements C52671b<EditTextStickerState, EditTextStickerState> {

        /* renamed from: a */
        public static final C48992b f123206a = new C48992b();

        C48992b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditTextStickerState editTextStickerState = (EditTextStickerState) obj;
            C52711k.m112240b(editTextStickerState, "$receiver");
            return editTextStickerState.copy(new C49561h());
        }
    }

    /* renamed from: f */
    public final C0198r<C52847n<Float, Boolean>> mo96978f() {
        return (C0198r) this.f123204e.getValue();
    }

    /* renamed from: e */
    public final void mo96977e() {
        mo22530c(C48992b.f123206a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditTextStickerState(null, 1, null);
    }

    /* renamed from: a */
    public final void mo96976a(float f, boolean z) {
        mo96978f().setValue(new C52847n(Float.valueOf(f), Boolean.valueOf(false)));
    }
}
