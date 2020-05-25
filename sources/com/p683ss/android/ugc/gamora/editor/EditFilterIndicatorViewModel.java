package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditFilterIndicatorViewModel */
public final class EditFilterIndicatorViewModel extends JediViewModel<EditFilterIndicatorState> {

    /* renamed from: d */
    public boolean f123116d;

    /* renamed from: com.ss.android.ugc.gamora.editor.EditFilterIndicatorViewModel$a */
    static final class C48942a extends C52712l implements C52671b<EditFilterIndicatorState, EditFilterIndicatorState> {

        /* renamed from: a */
        final /* synthetic */ boolean f123117a;

        /* renamed from: b */
        final /* synthetic */ C31459g f123118b;

        C48942a(boolean z, C31459g gVar) {
            this.f123117a = z;
            this.f123118b = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EditFilterIndicatorState editFilterIndicatorState = (EditFilterIndicatorState) obj;
            C52711k.m112240b(editFilterIndicatorState, "$receiver");
            return editFilterIndicatorState.copy(this.f123117a, this.f123118b);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new EditFilterIndicatorState(true, null, 2, null);
    }

    /* renamed from: a */
    public final void mo96820a(boolean z, C31459g gVar) {
        this.f123116d = z;
        mo22530c(new C48942a(z, gVar));
    }
}
