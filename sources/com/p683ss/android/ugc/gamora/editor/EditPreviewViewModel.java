package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import android.graphics.Bitmap;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49556c;
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

/* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel */
public final class EditPreviewViewModel extends JediViewModel<EditPreviewState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f123169d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditPreviewViewModel.class), "editFirstFrameDone", "getEditFirstFrameDone()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditPreviewViewModel.class), "firstFrameVisible", "getFirstFrameVisible()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditPreviewViewModel.class), "firstFrameBitmap", "getFirstFrameBitmap()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditPreviewViewModel.class), "editPrepareDonePersist", "getEditPrepareDonePersist()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditPreviewViewModel.class), "lightDetectionDone", "getLightDetectionDone()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: e */
    private final C52668f f123170e = C52732g.m112285a(C48974a.f123175a);

    /* renamed from: f */
    private final C52668f f123171f = C52732g.m112285a(C48977d.f123178a);

    /* renamed from: g */
    private final C52668f f123172g = C52732g.m112285a(C48976c.f123177a);

    /* renamed from: h */
    private final C52668f f123173h = C52732g.m112285a(C48975b.f123176a);

    /* renamed from: i */
    private final C52668f f123174i = C52732g.m112285a(C48978e.f123179a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$a */
    static final class C48974a extends C52712l implements C52670a<C0198r<Void>> {

        /* renamed from: a */
        public static final C48974a f123175a = new C48974a();

        C48974a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$b */
    static final class C48975b extends C52712l implements C52670a<C0198r<Void>> {

        /* renamed from: a */
        public static final C48975b f123176a = new C48975b();

        C48975b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$c */
    static final class C48976c extends C52712l implements C52670a<C0198r<Bitmap>> {

        /* renamed from: a */
        public static final C48976c f123177a = new C48976c();

        C48976c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$d */
    static final class C48977d extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C48977d f123178a = new C48977d();

        C48977d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$e */
    static final class C48978e extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C48978e f123179a = new C48978e();

        C48978e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$f */
    static final class C48979f extends C52712l implements C52671b<EditPreviewState, EditPreviewState> {

        /* renamed from: a */
        public static final C48979f f123180a = new C48979f();

        C48979f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditPreviewState editPreviewState = (EditPreviewState) obj;
            C52711k.m112240b(editPreviewState, "$receiver");
            return EditPreviewState.copy$default(editPreviewState, new C49561h(), null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$g */
    static final class C48980g extends C52712l implements C52671b<EditPreviewState, EditPreviewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123181a;

        C48980g(boolean z) {
            this.f123181a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditPreviewState editPreviewState = (EditPreviewState) obj;
            C52711k.m112240b(editPreviewState, "$receiver");
            return EditPreviewState.copy$default(editPreviewState, null, null, new C49556c(this.f123181a), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPreviewViewModel$h */
    static final class C48981h extends C52712l implements C52671b<EditPreviewState, EditPreviewState> {

        /* renamed from: a */
        final /* synthetic */ int f123182a;

        C48981h(int i) {
            this.f123182a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditPreviewState editPreviewState = (EditPreviewState) obj;
            C52711k.m112240b(editPreviewState, "$receiver");
            return EditPreviewState.copy$default(editPreviewState, null, Integer.valueOf(this.f123182a), null, 5, null);
        }
    }

    /* renamed from: e */
    public final C0198r<Void> mo96924e() {
        return (C0198r) this.f123170e.getValue();
    }

    /* renamed from: f */
    public final C0198r<Boolean> mo96925f() {
        return (C0198r) this.f123171f.getValue();
    }

    /* renamed from: g */
    public final C0198r<Bitmap> mo96926g() {
        return (C0198r) this.f123172g.getValue();
    }

    /* renamed from: h */
    public final C0198r<Void> mo96927h() {
        return (C0198r) this.f123173h.getValue();
    }

    /* renamed from: i */
    public final C0198r<Boolean> mo96928i() {
        return (C0198r) this.f123174i.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        EditPreviewState editPreviewState = new EditPreviewState(null, null, null, 7, null);
        return editPreviewState;
    }

    /* renamed from: a */
    public final void mo96922a(int i) {
        mo22530c(new C48981h(i));
    }

    /* renamed from: a */
    public final void mo96923a(boolean z) {
        mo22530c(new C48980g(z));
    }
}
