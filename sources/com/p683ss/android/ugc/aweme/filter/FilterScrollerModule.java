package com.p683ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31491d;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31492e;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterScrollerModule */
public class FilterScrollerModule implements C0183j {

    /* renamed from: a */
    AVDmtTabLayout f82147a;

    /* renamed from: b */
    public RecyclerView f82148b;

    /* renamed from: c */
    public AppCompatActivity f82149c;

    /* renamed from: d */
    public LinearLayoutManager f82150d;

    /* renamed from: e */
    public C31420b f82151e;

    /* renamed from: f */
    public List<EffectCategoryResponse> f82152f = new ArrayList();

    /* renamed from: g */
    public AVETParameter f82153g;

    /* renamed from: h */
    C31461i f82154h;

    /* renamed from: i */
    C31459g f82155i;

    /* renamed from: j */
    public C31459g f82156j;

    /* renamed from: k */
    C1690c f82157k = null;

    /* renamed from: l */
    C1710e<C31492e> f82158l = new C1710e<C31492e>() {
        public final /* synthetic */ void accept(Object obj) throws Exception {
            C31491d dVar = ((C31492e) obj).f82403b;
            if (dVar.f82398b == C31494g.FILTER_STATE_DOWNLOADING) {
                int b = FilterScrollerModule.this.mo64261b(dVar.f82397a);
                if (b >= 0 && b < FilterScrollerModule.this.f82151e.getItemCount()) {
                    FilterScrollerModule.this.f82151e.notifyItemChanged(b);
                }
            } else if (dVar.f82398b == C31494g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                int b2 = FilterScrollerModule.this.mo64261b(dVar.f82397a);
                if (b2 >= 0 && b2 < FilterScrollerModule.this.f82151e.getItemCount()) {
                    FilterScrollerModule.this.f82151e.notifyItemChanged(b2);
                }
                if (FilterScrollerModule.this.f82156j != null && dVar.f82397a == FilterScrollerModule.this.f82156j.f82324a) {
                    FilterViewModel.m73161a(FilterScrollerModule.this.f82149c, FilterScrollerModule.this.f82156j);
                    FilterScrollerModule.this.f82156j = null;
                }
            } else {
                if (dVar.f82398b == C31494g.FILTER_STATE_DOWNLOAD_FAILED) {
                    int b3 = FilterScrollerModule.this.mo64261b(dVar.f82397a);
                    if (b3 >= 0 && b3 < FilterScrollerModule.this.f82151e.getItemCount()) {
                        FilterScrollerModule.this.f82151e.notifyItemChanged(b3);
                    }
                }
            }
        }
    };

    /* renamed from: m */
    public C31407aj f82159m;

    /* renamed from: n */
    C31499l f82160n;

    /* renamed from: o */
    public boolean f82161o;

    /* renamed from: p */
    private ImageView f82162p;

    /* renamed from: q */
    private View f82163q;

    /* renamed from: r */
    private C31375b f82164r;

    /* renamed from: s */
    private C31374a f82165s;

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterScrollerModule$a */
    interface C31374a {
        /* renamed from: a */
        boolean mo64267a();
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterScrollerModule$b */
    interface C31375b {
        /* renamed from: a */
        void mo64268a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterScrollerModule$c */
    public class C31376c extends C1415af {
        /* renamed from: b */
        public final int mo5494b() {
            return -1;
        }

        /* renamed from: c */
        public final int mo5496c() {
            return -1;
        }

        C31376c(Context context) {
            super(context);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo64257a() {
        mo64258a(C31456e.m73267a(this.f82151e, this.f82150d.mo4749j()));
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void removeListener() {
        if (this.f82159m != null) {
            this.f82159m.mo64306a();
        }
        if (this.f82157k != null) {
            this.f82157k.dispose();
            this.f82157k = null;
        }
    }

    /* renamed from: a */
    public final void mo64258a(int i) {
        if (this.f82147a != null) {
            C44709f a = this.f82147a.mo90679a(i);
            if (a != null) {
                a.mo90744a();
            }
        }
    }

    /* renamed from: b */
    public final int mo64261b(int i) {
        List b = this.f82151e.mo92825b();
        if (C9376b.m18558a((Collection<T>) b)) {
            return -1;
        }
        for (int i2 = 0; i2 < b.size(); i2++) {
            if (((C31459g) b.get(i2)).f82324a == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64259a(com.p683ss.android.ugc.aweme.filter.C31459g r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.filter.b r0 = r5.f82151e
            int r6 = r6.f82324a
            java.util.List r0 = r0.mo92825b()
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            r2 = -1
            r3 = 0
            if (r1 != 0) goto L_0x0025
            r1 = 0
        L_0x0011:
            int r4 = r0.size()
            if (r1 >= r4) goto L_0x0025
            java.lang.Object r4 = r0.get(r1)
            com.ss.android.ugc.aweme.filter.g r4 = (com.p683ss.android.ugc.aweme.filter.C31459g) r4
            int r4 = r4.f82324a
            if (r6 != r4) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x0011
        L_0x0025:
            r1 = -1
        L_0x0026:
            if (r1 != r2) goto L_0x0029
            return
        L_0x0029:
            com.ss.android.ugc.aweme.filter.b r6 = r5.f82151e
            if (r6 != 0) goto L_0x002f
            r0 = 0
            goto L_0x0051
        L_0x002f:
            java.util.List r6 = r6.mo92825b()
            r0 = 0
        L_0x0034:
            int r2 = r6.size()
            if (r3 >= r2) goto L_0x0051
            if (r3 >= r1) goto L_0x0051
            java.lang.Object r2 = r6.get(r3)
            com.ss.android.ugc.aweme.filter.g r2 = (com.p683ss.android.ugc.aweme.filter.C31459g) r2
            java.lang.String r2 = r2.f82325b
            java.lang.String r4 = "LINE"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004e
            int r0 = r0 + 1
        L_0x004e:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0051:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r6 = r5.f82147a
            int r6 = r6.getSelectedTabPosition()
            if (r6 == r0) goto L_0x005c
            r5.mo64258a(r0)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.FilterScrollerModule.mo64259a(com.ss.android.ugc.aweme.filter.g):void");
    }

    /* renamed from: a */
    public final void mo64260a(boolean z) {
        if (this.f82164r != null) {
            this.f82164r.mo64268a(z);
        }
        this.f82161o = z;
        FilterViewModel.m73163a(this.f82149c, Boolean.valueOf(z));
        this.f82162p.setSelected(z);
        if (this.f82165s == null) {
            this.f82151e.mo64323b(z);
        } else if (z) {
            this.f82151e.mo64323b(true);
        } else if (this.f82165s.mo64267a()) {
            this.f82151e.mo64323b(false);
        } else {
            this.f82151e.mo64323b(true);
        }
        if (z) {
            if (this.f82147a.getCurSelectedTab() != null && (this.f82147a.getCurSelectedTab().f113162f instanceof AVDmtTabItemView)) {
                this.f82147a.getCurSelectedTab().f113162f.setSelected(false);
            }
            this.f82147a.mo90698d();
        }
    }

    FilterScrollerModule(AppCompatActivity appCompatActivity, C31407aj ajVar, C31499l lVar, LinearLayout linearLayout, AVETParameter aVETParameter, C31461i iVar, boolean z, boolean z2, C31375b bVar, C31374a aVar) {
        List list;
        this.f82160n = lVar;
        this.f82148b = (RecyclerView) linearLayout.findViewById(R.id.afj);
        this.f82147a = (AVDmtTabLayout) linearLayout.findViewById(R.id.afm);
        this.f82162p = (ImageView) linearLayout.findViewById(R.id.arw);
        this.f82163q = linearLayout.findViewById(R.id.cx3);
        this.f82164r = bVar;
        this.f82165s = aVar;
        if (z) {
            this.f82162p.setVisibility(0);
            this.f82163q.setVisibility(0);
        }
        this.f82162p.setOnClickListener(new C31481r(this));
        this.f82149c = appCompatActivity;
        this.f82159m = ajVar;
        this.f82153g = aVETParameter;
        this.f82154h = iVar;
        this.f82147a.setTabMargin(12);
        this.f82147a.mo90683a(new C44704c() {
            /* renamed from: b */
            public final void mo64264b(C44709f fVar) {
            }

            /* renamed from: c */
            public final void mo64265c(C44709f fVar) {
            }

            /* renamed from: a */
            public final void mo64263a(C44709f fVar) {
                if (!(fVar == null || fVar.f113162f == null || fVar.f113161e >= FilterScrollerModule.this.f82152f.size())) {
                    View view = fVar.f113162f;
                    if (view instanceof AVDmtTabItemView) {
                        ((AVDmtTabItemView) view).mo93989b(false);
                    }
                    EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) FilterScrollerModule.this.f82152f.get(fVar.f113161e);
                    if (!(effectCategoryResponse == null || FilterScrollerModule.this.f82159m == null)) {
                        FilterScrollerModule.this.f82159m.mo64307a(effectCategoryResponse.getId(), effectCategoryResponse.getTagsUpdateTime(), C31736z.f82891a);
                    }
                }
            }
        });
        this.f82150d = new EffectCenterLayoutManager(this.f82148b.getContext(), 0, false);
        this.f82148b.setLayoutManager(this.f82150d);
        this.f82151e = new C31420b(this.f82159m, this.f82160n);
        List list2 = (List) this.f82160n.mo64415e().mo64419b().getValue();
        C31420b bVar2 = this.f82151e;
        if (list2 != null) {
            list = C31483a.m73319b(list2);
        } else {
            list = Collections.emptyList();
        }
        bVar2.mo64318a(list);
        this.f82151e.mo97992c(false);
        this.f82151e.aY_();
        this.f82148b.setAdapter(this.f82151e);
        this.f82160n.mo64415e().mo64419b().observe(this.f82149c, new C31734x(this));
        this.f82148b.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (!FilterScrollerModule.this.f82161o) {
                    FilterScrollerModule.this.mo64258a(C31456e.m73267a(FilterScrollerModule.this.f82151e, FilterScrollerModule.this.f82150d.mo4749j()));
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
            }
        });
        this.f82151e.f82264c = new C31735y(this);
        this.f82151e.registerAdapterDataObserver(new C1324c() {
            /* renamed from: b */
            public final void mo4988b(int i, int i2) {
                super.mo4988b(i, i2);
                FilterScrollerModule.this.mo64257a();
            }

            /* renamed from: c */
            public final void mo4989c(int i, int i2) {
                super.mo4989c(i, i2);
                FilterScrollerModule.this.mo64257a();
            }
        });
        this.f82160n.mo64411a(false);
        ((FilterViewModel) C0214z.m440a((FragmentActivity) this.f82149c).mo359a(FilterViewModel.class)).mo64287b().observe(this.f82149c, new C31601s(this));
        AppCompatActivity appCompatActivity2 = this.f82149c;
        ((FilterViewModel) C0214z.m440a((FragmentActivity) appCompatActivity2).mo359a(FilterViewModel.class)).mo64288c().observe(appCompatActivity2, new C31602t(this));
        mo64260a(z2);
        this.f82149c.getLifecycle().mo324a(this);
    }
}
