package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31492e;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31634f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import com.p683ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel */
public final class FilterListViewSelectionViewModel extends HumbleViewModel implements C31730p {

    /* renamed from: a */
    public C31459g f82695a;

    /* renamed from: b */
    private final C0198r<C31459g> f82696b = new C0198r<>();

    /* renamed from: d */
    private C1690c f82697d;

    /* renamed from: e */
    private final C31499l f82698e;

    /* renamed from: f */
    private final C31634f f82699f;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel$a */
    static final class C31661a<T> implements C1710e<List<C31492e>> {

        /* renamed from: a */
        final /* synthetic */ FilterListViewSelectionViewModel f82700a;

        C31661a(FilterListViewSelectionViewModel filterListViewSelectionViewModel) {
            this.f82700a = filterListViewSelectionViewModel;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[EDGE_INSN: B:16:0x0035->B:13:0x0035 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r5) {
            /*
                r4 = this;
                java.util.List r5 = (java.util.List) r5
                java.lang.String r0 = "filterInfoEvent"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x000d:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x0034
                java.lang.Object r0 = r5.next()
                r1 = r0
                com.ss.android.ugc.aweme.filter.repository.a.e r1 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31492e) r1
                com.ss.android.ugc.aweme.filter.repository.a.d r1 = r1.f82403b
                com.ss.android.ugc.aweme.filter.repository.a.g r2 = r1.f82398b
                com.ss.android.ugc.aweme.filter.repository.a.g r3 = com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g.FILTER_STATE_DOWNLOAD_SUCCESS
                if (r2 != r3) goto L_0x0030
                com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel r2 = r4.f82700a
                com.ss.android.ugc.aweme.filter.g r2 = r2.f82695a
                if (r2 == 0) goto L_0x0030
                int r2 = r2.f82324a
                int r1 = r1.f82397a
                if (r2 != r1) goto L_0x0030
                r1 = 1
                goto L_0x0031
            L_0x0030:
                r1 = 0
            L_0x0031:
                if (r1 == 0) goto L_0x000d
                goto L_0x0035
            L_0x0034:
                r0 = 0
            L_0x0035:
                com.ss.android.ugc.aweme.filter.repository.a.e r0 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31492e) r0
                if (r0 == 0) goto L_0x0042
                com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel r5 = r4.f82700a
                com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel r0 = r4.f82700a
                com.ss.android.ugc.aweme.filter.g r0 = r0.f82695a
                r5.mo64575b(r0)
            L_0x0042:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel.C31661a.accept(java.lang.Object):void");
        }
    }

    /* renamed from: b */
    private void m73566b() {
        this.f82695a = null;
    }

    /* renamed from: a */
    public final LiveData<C31459g> mo64559a() {
        return this.f82696b;
    }

    public final void onCleared() {
        C1690c cVar = this.f82697d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f82697d = null;
    }

    /* renamed from: b */
    public final void mo64575b(C31459g gVar) {
        m73566b();
        this.f82696b.setValue(gVar);
        if (gVar != null) {
            C31634f fVar = this.f82699f;
            if (fVar != null) {
                fVar.mo64544a(gVar, (C48715t) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo64574a(C31459g gVar) {
        if (gVar == null) {
            mo64575b(null);
        } else if (C31487c.m73325a(this.f82698e, gVar)) {
            mo64575b(gVar);
        } else {
            this.f82695a = gVar;
            if (gVar != null) {
                this.f82698e.mo64406a(gVar);
            }
        }
        if (this.f82695a != null && !this.f125792c && this.f82697d == null) {
            this.f82697d = this.f82698e.mo64414d().mo6528b(1000, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C31661a<Object>(this), C1723a.m6037b());
        }
    }

    public FilterListViewSelectionViewModel(C0184k kVar, C31499l lVar, C31634f fVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(lVar, "repository");
        super(kVar);
        this.f82698e = lVar;
        this.f82699f = fVar;
    }
}
