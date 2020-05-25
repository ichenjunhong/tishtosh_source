package com.p683ss.android.ugc.aweme.challenge.viewmodel;

import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import p064c.p065a.C1680ad;
import p064c.p065a.C1682af;
import p064c.p065a.C1684ah;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel */
public final class ChallengeDetailJediViewModel extends JediViewModel<ChallengeDetailState> {

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel$a */
    static final class C24783a<T> implements C1684ah<T> {

        /* renamed from: a */
        final /* synthetic */ String f65600a;

        /* renamed from: b */
        final /* synthetic */ int f65601b;

        /* renamed from: c */
        final /* synthetic */ boolean f65602c;

        C24783a(String str, int i, boolean z) {
            this.f65600a = str;
            this.f65601b = i;
            this.f65602c = z;
        }

        /* renamed from: a */
        public final void mo6171a(C1682af<ChallengeDetail> afVar) {
            C52711k.m112240b(afVar, "emitter");
            try {
                afVar.mo6164a(ChallengeApi.m59966a(this.f65600a, this.f65601b, this.f65602c));
            } catch (Throwable th) {
                if (!afVar.isDisposed()) {
                    afVar.mo6165a(th);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel$b */
    static final class C24784b extends C52712l implements C52682m<ChallengeDetailState, C11787a<? extends ChallengeDetail>, ChallengeDetailState> {

        /* renamed from: a */
        public static final C24784b f65603a = new C24784b();

        C24784b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ChallengeDetailState challengeDetailState = (ChallengeDetailState) obj;
            C11787a aVar = (C11787a) obj2;
            C52711k.m112240b(challengeDetailState, "$receiver");
            C52711k.m112240b(aVar, "state");
            return challengeDetailState.copy(aVar);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new ChallengeDetailState(null, 1, null);
    }

    /* renamed from: a */
    public final void mo50657a(String str, int i, boolean z) {
        C1680ad b = C1680ad.m5958a((C1684ah<T>) new C24783a<T>(str, i, z)).mo6155b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "Single.create<ChallengeD…scribeOn(Schedulers.io())");
        mo22520a(b, (C52682m<? super S, ? super C11787a<? extends T>, ? extends S>) C24784b.f65603a);
    }
}
