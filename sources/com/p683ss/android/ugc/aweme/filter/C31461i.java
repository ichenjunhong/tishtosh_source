package com.p683ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31482a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31489b;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31495h;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31496i;
import com.p683ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView;
import com.p683ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.C31646c;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.C52847n;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.i */
public final class C31461i implements C31646c {

    /* renamed from: a */
    public boolean f82337a;

    /* renamed from: b */
    View f82338b;

    /* renamed from: c */
    public FilterBoxListView f82339c;

    /* renamed from: d */
    C31384a f82340d;

    /* renamed from: e */
    public int f82341e = -1;

    /* renamed from: f */
    public C24458h f82342f;

    /* renamed from: g */
    public C31495h f82343g;

    /* renamed from: h */
    public int f82344h = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: i */
    C1690c f82345i;

    /* renamed from: j */
    public final C31469j f82346j;

    /* renamed from: k */
    public final AppCompatActivity f82347k;

    /* renamed from: l */
    public final FrameLayout f82348l;

    /* renamed from: m */
    final C31496i f82349m;

    /* renamed from: com.ss.android.ugc.aweme.filter.i$a */
    public static final class C31464a extends C24453c {

        /* renamed from: a */
        final /* synthetic */ C31461i f82352a;

        /* renamed from: c */
        public final void mo50224c() {
            super.mo50224c();
            C31461i.m73284a(this.f82352a).setCategoryMap(C52575l.m112097a());
            C24458h hVar = this.f82352a.f82342f;
            if (hVar != null) {
                hVar.mo50224c();
            }
        }

        C31464a(C31461i iVar) {
            this.f82352a = iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$b */
    static final class C31465b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31461i f82353a;

        C31465b(C31461i iVar) {
            this.f82353a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82353a.mo64361a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$c */
    static final class C31466c<T> implements C1710e<C31495h> {

        /* renamed from: a */
        final /* synthetic */ C31461i f82354a;

        C31466c(C31461i iVar) {
            this.f82354a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C31495h hVar = (C31495h) obj;
            this.f82354a.f82343g = hVar;
            C31482a a = hVar.mo64396a();
            if (a.f82383b.isEmpty()) {
                C31461i.m73284a(this.f82354a).setState(3);
                return;
            }
            C31461i.m73284a(this.f82354a).setState(0);
            C31461i.m73284a(this.f82354a).setCategoryMap(a.f82383b);
            C31461i.m73284a(this.f82354a).setCallback(this.f82354a);
            this.f82354a.f82344h = DynamicTabYellowPointVersion.DEFAULT;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$d */
    static final class C31467d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C31461i f82355a;

        C31467d(C31461i iVar) {
            this.f82355a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C31461i.m73284a(this.f82355a).setState(2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$e */
    public static final class C31468e extends C24453c {

        /* renamed from: a */
        final /* synthetic */ C31461i f82356a;

        /* renamed from: a */
        public final void mo50217a() {
            super.mo50217a();
            C31461i.m73284a(this.f82356a).setVisibility(0);
            C24458h hVar = this.f82356a.f82342f;
            if (hVar != null) {
                hVar.mo50217a();
            }
        }

        C31468e(C31461i iVar) {
            this.f82356a = iVar;
        }
    }

    /* renamed from: a */
    public final void mo64361a() {
        C31384a aVar = this.f82340d;
        if (aVar == null) {
            C52711k.m112237a("chooseFilterTransition");
        }
        aVar.mo50223b(new C24453c());
        C31384a aVar2 = this.f82340d;
        if (aVar2 == null) {
            C52711k.m112237a("chooseFilterTransition");
        }
        aVar2.mo50223b(new C31464a(this));
        C1690c cVar = this.f82345i;
        if (cVar != null) {
            cVar.dispose();
        }
        C31495h hVar = this.f82343g;
        if (hVar != null) {
            hVar.mo64398b();
        }
        this.f82337a = false;
        this.f82344h = DynamicTabYellowPointVersion.DEFAULT;
    }

    /* renamed from: a */
    public final void mo64362a(C31459g gVar) {
        FilterViewModel.m73161a(this.f82347k, gVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ FilterBoxListView m73284a(C31461i iVar) {
        FilterBoxListView filterBoxListView = iVar.f82339c;
        if (filterBoxListView == null) {
            C52711k.m112237a("filterBoxView");
        }
        return filterBoxListView;
    }

    /* renamed from: c */
    public final void mo64365c(EffectCategoryModel effectCategoryModel, C31489b bVar) {
        C52711k.m112240b(effectCategoryModel, "category");
        C52711k.m112240b(bVar, "filter");
        this.f82344h = DynamicTabYellowPointVersion.DEFAULT;
        C31495h hVar = this.f82343g;
        if (hVar != null) {
            hVar.mo64399b(bVar);
        }
        if (this.f82341e == bVar.f82392a.f82404a) {
            mo64362a(this.f82346j.mo64370c());
        }
    }

    /* renamed from: a */
    public final void mo64363a(EffectCategoryModel effectCategoryModel, C31489b bVar) {
        Object obj;
        boolean z;
        C52711k.m112240b(effectCategoryModel, "category");
        C52711k.m112240b(bVar, "filter");
        int i = bVar.f82392a.f82404a;
        this.f82344h = i;
        C31495h hVar = this.f82343g;
        if (hVar != null) {
            hVar.mo64397a(bVar);
        }
        List list = (List) this.f82349m.mo64401b().mo64418a().getValue();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C31459g) obj).f82324a == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C31459g gVar = (C31459g) obj;
            if (gVar != null) {
                mo64362a(gVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo64364b(EffectCategoryModel effectCategoryModel, C31489b bVar) {
        Object obj;
        boolean z;
        C52711k.m112240b(effectCategoryModel, "category");
        C52711k.m112240b(bVar, "filter");
        int i = bVar.f82392a.f82404a;
        this.f82344h = i;
        C31495h hVar = this.f82343g;
        if (hVar != null) {
            hVar.mo64397a(bVar);
        }
        List list = (List) this.f82349m.mo64401b().mo64418a().getValue();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C31459g) obj).f82324a == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C31459g gVar = (C31459g) obj;
            if (gVar != null) {
                mo64362a(gVar);
            }
        }
    }

    public C31461i(C31469j jVar, AppCompatActivity appCompatActivity, FrameLayout frameLayout, C31496i iVar) {
        C52711k.m112240b(jVar, "dependency");
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(frameLayout, "root");
        C52711k.m112240b(iVar, "filterBoxRepository");
        this.f82346j = jVar;
        this.f82347k = appCompatActivity;
        this.f82348l = frameLayout;
        this.f82349m = iVar;
        int i = -1;
        C0209x a = C0214z.m440a((FragmentActivity) this.f82347k).mo359a(FilterViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…terViewModel::class.java)");
        C0198r b = ((FilterViewModel) a).mo64287b();
        C52711k.m112236a((Object) b, "curSelectedFilter");
        C52847n nVar = (C52847n) b.getValue();
        if (nVar != null) {
            C31459g gVar = (C31459g) nVar.getFirst();
            if (gVar != null) {
                i = gVar.f82324a;
            }
        }
        this.f82341e = i;
        b.observe(this.f82347k, new C0199s<C52847n<? extends C31459g, ? extends String>>(this) {

            /* renamed from: a */
            final /* synthetic */ C31461i f82350a;

            {
                this.f82350a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                C52847n nVar = (C52847n) obj;
                if (nVar != null) {
                    C31459g gVar = (C31459g) nVar.getFirst();
                    if (gVar != null) {
                        this.f82350a.f82341e = gVar.f82324a;
                    }
                }
            }
        });
        this.f82349m.mo64401b().mo64418a().observe(this.f82347k, new C0199s<List<? extends C31459g>>(this) {

            /* renamed from: a */
            final /* synthetic */ C31461i f82351a;

            {
                this.f82351a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Object obj2;
                boolean z;
                List list = (List) obj;
                if (!(!this.f82351a.f82337a || this.f82351a.f82344h == Integer.MIN_VALUE || list == null)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((C31459g) obj2).f82324a == this.f82351a.f82344h) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    C31459g gVar = (C31459g) obj2;
                    if (gVar != null) {
                        this.f82351a.mo64362a(gVar);
                    }
                }
            }
        });
    }
}
