package com.p683ss.android.ugc.aweme.filter.view.internal.filterbox;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31482a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31489b;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31495h;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31496i;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31610f.C31611a;
import com.p683ss.android.ugc.tools.view.base.HumbleViewModel;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxViewModel */
public final class FilterBoxViewModel extends HumbleViewModel implements C31658d {

    /* renamed from: a */
    public final C0198r<C52847n<C31611a, C31482a>> f82673a = new C0198r<>();

    /* renamed from: b */
    public C31495h f82674b;

    /* renamed from: d */
    private C1690c f82675d;

    /* renamed from: e */
    private final C31496i f82676e;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxViewModel$a */
    static final class C31649a<T> implements C1710e<C31495h> {

        /* renamed from: a */
        final /* synthetic */ FilterBoxViewModel f82677a;

        C31649a(FilterBoxViewModel filterBoxViewModel) {
            this.f82677a = filterBoxViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            C31495h hVar = (C31495h) obj;
            this.f82677a.f82674b = hVar;
            C31482a a = hVar.mo64396a();
            if (a.f82383b.isEmpty()) {
                this.f82677a.f82673a.setValue(C52856t.m112465a(C31611a.EMPTY, null));
            } else {
                this.f82677a.f82673a.setValue(C52856t.m112465a(C31611a.OK, a));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxViewModel$b */
    static final class C31650b<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ FilterBoxViewModel f82678a;

        C31650b(FilterBoxViewModel filterBoxViewModel) {
            this.f82678a = filterBoxViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f82678a.f82673a.setValue(C52856t.m112465a(C31611a.ERROR, null));
        }
    }

    /* renamed from: a */
    public final LiveData<C52847n<C31611a, C31482a>> mo64559a() {
        return this.f82673a;
    }

    /* renamed from: c */
    public final void mo64563c() {
        C31495h hVar = this.f82674b;
        if (hVar != null) {
            hVar.mo64398b();
        }
    }

    public final void onCleared() {
        C1690c cVar = this.f82675d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f82675d = null;
    }

    /* renamed from: b */
    public final void mo64561b() {
        C1690c cVar = this.f82675d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f82675d = null;
        this.f82674b = null;
        if (!this.f125792c) {
            this.f82673a.setValue(C52856t.m112465a(C31611a.LOADING, null));
            this.f82675d = this.f82676e.mo64400a().mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C31649a<Object>(this), (C1710e<? super Throwable>) new C31650b<Object>(this));
        }
    }

    /* renamed from: a */
    public final void mo64560a(C31489b bVar) {
        C52711k.m112240b(bVar, "filterBoxMeta");
        C31495h hVar = this.f82674b;
        if (hVar != null) {
            hVar.mo64397a(bVar);
        }
    }

    /* renamed from: b */
    public final void mo64562b(C31489b bVar) {
        C52711k.m112240b(bVar, "filterBoxMeta");
        C31495h hVar = this.f82674b;
        if (hVar != null) {
            hVar.mo64399b(bVar);
        }
    }

    public FilterBoxViewModel(C0184k kVar, C31496i iVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(iVar, "repository");
        super(kVar);
        this.f82676e = iVar;
    }
}
