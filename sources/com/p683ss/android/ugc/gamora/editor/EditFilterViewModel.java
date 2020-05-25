package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.filter.C31459g;
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

/* renamed from: com.ss.android.ugc.gamora.editor.EditFilterViewModel */
public final class EditFilterViewModel extends JediViewModel<EditFilterState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f123119d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditFilterViewModel.class), "curFilter", "getCurFilter()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditFilterViewModel.class), "cancelStatus", "getCancelStatus()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    private final C52668f f123120e = C52732g.m112285a(C48944b.f123123a);

    /* renamed from: f */
    private final C52668f f123121f = C52732g.m112285a(C48943a.f123122a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditFilterViewModel$a */
    static final class C48943a extends C52712l implements C52670a<C0198r<Object>> {

        /* renamed from: a */
        public static final C48943a f123122a = new C48943a();

        C48943a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditFilterViewModel$b */
    static final class C48944b extends C52712l implements C52670a<C0198r<C31459g>> {

        /* renamed from: a */
        public static final C48944b f123123a = new C48944b();

        C48944b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditFilterViewModel$c */
    static final class C48945c extends C52712l implements C52671b<EditFilterState, EditFilterState> {

        /* renamed from: a */
        public static final C48945c f123124a = new C48945c();

        C48945c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditFilterState editFilterState = (EditFilterState) obj;
            C52711k.m112240b(editFilterState, "$receiver");
            return editFilterState.copy(new C49561h());
        }
    }

    /* renamed from: e */
    public final C0198r<C31459g> mo96827e() {
        return (C0198r) this.f123120e.getValue();
    }

    /* renamed from: f */
    public final C0198r<Object> mo96828f() {
        return (C0198r) this.f123121f.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditFilterState(null, 1, null);
    }
}
