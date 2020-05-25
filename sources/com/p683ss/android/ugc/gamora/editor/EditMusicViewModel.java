package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.asve.p1239c.C20346b;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49558e;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53200af;
import kotlinx.coroutines.C53263bl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p2628d.p2631c.C52599a;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditMusicViewModel */
public final class EditMusicViewModel extends BaseJediViewModel<EditMusicState> {

    /* renamed from: d */
    public static final C48968b f123158d = new C48968b(null);

    /* renamed from: e */
    private final C53263bl f123159e = C53270bq.m113187a(null, 1, null);

    /* renamed from: f */
    private final CoroutineExceptionHandler f123160f = new C48967a(CoroutineExceptionHandler.f131765b);

    /* renamed from: g */
    private final C53199ae f123161g = C53200af.m113027a(C20346b.m50242a().plus(this.f123159e).plus(this.f123160f));

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicViewModel$a */
    public static final class C48967a extends C52599a implements CoroutineExceptionHandler {
        public final void handleException(C52628e eVar, Throwable th) {
            C52711k.m112240b(eVar, "context");
            C52711k.m112240b(th, "exception");
        }

        public C48967a(C52633c cVar) {
            super(cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicViewModel$b */
    public static final class C48968b {
        private C48968b() {
        }

        public /* synthetic */ C48968b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicViewModel$c */
    static final class C48969c extends C52712l implements C52671b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ int f123162a;

        C48969c(int i) {
            this.f123162a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditMusicState editMusicState = (EditMusicState) obj;
            C52711k.m112240b(editMusicState, "$receiver");
            return EditMusicState.copy$default(editMusicState, null, new C49558e(this.f123162a), null, 5, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicViewModel$d */
    static final class C48970d extends C52712l implements C52671b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123163a;

        C48970d(boolean z) {
            this.f123163a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditMusicState editMusicState = (EditMusicState) obj;
            C52711k.m112240b(editMusicState, "$receiver");
            return EditMusicState.copy$default(editMusicState, Boolean.valueOf(this.f123163a), null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMusicViewModel$e */
    static final class C48971e extends C52712l implements C52671b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ C42482c f123164a;

        C48971e(C42482c cVar) {
            this.f123164a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditMusicState editMusicState = (EditMusicState) obj;
            C52711k.m112240b(editMusicState, "$receiver");
            return EditMusicState.copy$default(editMusicState, null, null, this.f123164a, 3, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        EditMusicState editMusicState = new EditMusicState(null, null, null, 7, null);
        return editMusicState;
    }

    public final void onCleared() {
        super.onCleared();
        this.f123159e.mo110868m();
    }

    /* renamed from: a */
    public final void mo96902a(boolean z) {
        mo22530c(new C48970d(z));
    }
}
