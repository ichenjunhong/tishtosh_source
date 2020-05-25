package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji;

import android.content.Context;
import android.support.p030v4.view.ViewPager.C1000h;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29343d;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29355m;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29359n;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29362q;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29358c;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.p1686a.C29336b;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29291g;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29292h;
import com.p683ss.android.ugc.aweme.emoji.p1682c.C29297a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.C29302c;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29367a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b;
import com.p683ss.android.ugc.aweme.emoji.p1693i.C29410a;
import com.p683ss.android.ugc.aweme.emoji.p1693i.C29419g;
import com.p683ss.android.ugc.aweme.emoji.p1693i.C29420h;
import com.p683ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33243e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33475a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33519b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33631o;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.a */
public final class C33546a extends C33475a<C33519b, C29343d> implements C29292h, C29302c, C29367a, C29420h {

    /* renamed from: d */
    public Button f86945d;

    /* renamed from: e */
    RecyclerView f86946e;

    /* renamed from: f */
    C29362q f86947f;

    /* renamed from: g */
    public C29355m f86948g;

    /* renamed from: h */
    LinearLayoutManager f86949h;

    /* renamed from: i */
    public C33519b f86950i;

    /* renamed from: j */
    int f86951j;

    /* renamed from: l */
    private SwipeControlledViewPager f86952l;

    /* renamed from: m */
    private RecyclerView f86953m;

    /* renamed from: n */
    private C29336b f86954n;

    /* renamed from: o */
    private C33554c f86955o;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.a$a */
    public static class C33549a {

        /* renamed from: a */
        public C33519b f86958a;

        /* renamed from: b */
        public ViewGroup f86959b;

        /* renamed from: c */
        public C29343d f86960c = new C29343d();

        public C33549a(C33519b bVar, ViewGroup viewGroup) {
            this.f86958a = bVar;
            this.f86959b = viewGroup;
        }
    }

    /* renamed from: d */
    public final int mo70885d() {
        return R.layout.lj;
    }

    /* renamed from: f */
    public final C29355m mo59239f() {
        return this.f86948g;
    }

    /* renamed from: g */
    public final C29359n mo59240g() {
        return null;
    }

    /* renamed from: m */
    private void m76907m() {
        this.f86955o.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final View mo70881a() {
        return super.mo70881a();
    }

    /* renamed from: k */
    public final void mo71015k() {
        if (((C29343d) this.f86751b).f76836c) {
            C29297a.m69081a().mo59244b();
        }
    }

    /* renamed from: c */
    public final void mo70884c() {
        this.f86945d.setOnClickListener(new C33631o() {
            public final void onClick(View view) {
                if (view.equals(C33546a.this.f86945d)) {
                    if (C33546a.this.f86950i == null) {
                        C33546a.this.f86950i = new C33243e((C33519b) C33546a.this.f86750a, view.getContext());
                    }
                    C33546a.this.f86950i.bh_();
                }
            }
        });
        mo73331a(this.f86945d);
    }

    /* renamed from: h */
    public final void mo71012h() {
        if (!C29410a.m69356a().mo59477e()) {
            this.f86948g.mo59300a();
            m76907m();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo71014j() {
        this.f86955o.notifyDataSetChanged();
        this.f86952l.setCurrentItem(this.f86948g.mo59303b(), false);
    }

    /* renamed from: e */
    public final void mo70886e() {
        if (((C29343d) this.f86751b).f76835b) {
            C29368b.m69241a().mo59393b((C29367a) this);
        }
        if (((C29343d) this.f86751b).f76836c) {
            C29297a.m69081a().mo59245b(this);
        }
        if (((C29343d) this.f86751b).f76837d) {
            C29410a.m69356a().mo59475b(this);
        }
    }

    /* renamed from: i */
    public final void mo71013i() {
        if (this.f86948g.f76886a.mo59223i() == 3 && this.f86948g.f76886a.mo59224j() == 0) {
            this.f86953m.setVisibility(4);
            return;
        }
        this.f86954n.mo59273a(this.f86948g.mo59305c(), this.f86948g.mo59307d(), this.f86948g.f76886a.mo59223i());
        this.f86953m.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo70883b() {
        Context context = this.f86752c.getContext();
        this.f86948g = new C29355m((C29343d) this.f86751b);
        this.f86945d = (Button) this.f86752c.findViewById(R.id.a_y);
        this.f86952l = (SwipeControlledViewPager) this.f86752c.findViewById(R.id.a_v);
        this.f86953m = (RecyclerView) this.f86752c.findViewById(R.id.a_r);
        this.f86946e = (RecyclerView) this.f86752c.findViewById(R.id.aa1);
        this.f86955o = new C33554c((C33519b) this.f86750a, this.f86952l, this);
        this.f86952l.setAdapter(this.f86955o);
        this.f86949h = new LinearLayoutManager(context, 0, false);
        this.f86946e.setLayoutManager(this.f86949h);
        this.f86947f = new C29362q(this);
        this.f86946e.setAdapter(this.f86947f);
        this.f86954n = new C29336b(this.f86953m);
        mo71013i();
        this.f86952l.addOnPageChangeListener(new C1000h() {
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
                if (r8.f86949h.mo4736c(r8.f86949h.mo4749j()).getLeft() < 0) goto L_0x005d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
                if (r8.f86949h.mo4736c(r8.f86949h.mo4751l()).getRight() > r8.f86946e.getWidth()) goto L_0x005d;
             */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(int r8) {
                /*
                    r7 = this;
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.a r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33546a.this
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r0 = r0.f86948g
                    r0.mo59304b(r8)
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.a r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33546a.this
                    r8.mo71013i()
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.a r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33546a.this
                    int r0 = r8.f86951j
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r1 = r8.f86948g
                    int r1 = r1.f76888c
                    r2 = 0
                    r3 = 1
                    if (r0 == r1) goto L_0x00af
                    com.ss.android.ugc.aweme.emoji.emojichoose.q r0 = r8.f86947f
                    r0.notifyDataSetChanged()
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r0 = r8.f86948g
                    int r0 = r0.f76888c
                    int r1 = r8.f86951j
                    if (r0 >= r1) goto L_0x005f
                    android.support.v7.widget.LinearLayoutManager r0 = r8.f86949h
                    int r0 = r0.mo4749j()
                    int r1 = r8.f86951j
                    if (r0 != r1) goto L_0x0031
                    r0 = 1
                    goto L_0x0032
                L_0x0031:
                    r0 = 0
                L_0x0032:
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86949h
                    int r1 = r1.mo4749j()
                    int r4 = r8.f86951j
                    int r4 = r4 - r3
                    if (r1 != r4) goto L_0x009e
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86949h
                    android.support.v7.widget.LinearLayoutManager r4 = r8.f86949h
                    int r4 = r4.mo4749j()
                    android.view.View r1 = r1.mo4736c(r4)
                    if (r1 == 0) goto L_0x009e
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86949h
                    android.support.v7.widget.LinearLayoutManager r4 = r8.f86949h
                    int r4 = r4.mo4749j()
                    android.view.View r1 = r1.mo4736c(r4)
                    int r1 = r1.getLeft()
                    if (r1 >= 0) goto L_0x009e
                L_0x005d:
                    r0 = 1
                    goto L_0x009e
                L_0x005f:
                    android.support.v7.widget.LinearLayoutManager r0 = r8.f86949h
                    int r0 = r0.mo4751l()
                    int r1 = r8.f86951j
                    if (r0 != r1) goto L_0x006b
                    r0 = 1
                    goto L_0x006c
                L_0x006b:
                    r0 = 0
                L_0x006c:
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86949h
                    int r1 = r1.mo4751l()
                    int r4 = r8.f86951j
                    int r4 = r4 + r3
                    if (r1 != r4) goto L_0x009e
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86949h
                    android.support.v7.widget.LinearLayoutManager r4 = r8.f86949h
                    int r4 = r4.mo4751l()
                    android.view.View r1 = r1.mo4736c(r4)
                    if (r1 == 0) goto L_0x009e
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86949h
                    android.support.v7.widget.LinearLayoutManager r4 = r8.f86949h
                    int r4 = r4.mo4751l()
                    android.view.View r1 = r1.mo4736c(r4)
                    int r1 = r1.getRight()
                    android.support.v7.widget.RecyclerView r4 = r8.f86946e
                    int r4 = r4.getWidth()
                    if (r1 <= r4) goto L_0x009e
                    goto L_0x005d
                L_0x009e:
                    if (r0 == 0) goto L_0x00a9
                    android.support.v7.widget.RecyclerView r0 = r8.f86946e
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r1 = r8.f86948g
                    int r1 = r1.f76888c
                    r0.mo4814b(r1)
                L_0x00a9:
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r0 = r8.f86948g
                    int r0 = r0.f76888c
                    r8.f86951j = r0
                L_0x00af:
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.a r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33546a.this
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r0 = r8.f86948g
                    com.ss.android.ugc.aweme.emoji.a.g r0 = r0.f76886a
                    int r0 = r0.mo59223i()
                    r1 = 2
                    if (r0 != r1) goto L_0x00d4
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r0 = r8.f86948g
                    com.ss.android.ugc.aweme.emoji.a.g r0 = r0.f76886a
                    boolean r0 = r0.mo59222h()
                    if (r0 != 0) goto L_0x00d4
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r8 = r8.f86948g
                    com.ss.android.ugc.aweme.emoji.a.g r8 = r8.f76886a
                    com.ss.android.ugc.aweme.emoji.i.g r8 = (com.p683ss.android.ugc.aweme.emoji.p1693i.C29419g) r8
                    com.p683ss.android.ugc.aweme.emoji.p1693i.C29410a.m69356a()
                    com.ss.android.ugc.aweme.emoji.emojichoose.model.c r8 = r8.f77046d
                    com.p683ss.android.ugc.aweme.emoji.p1693i.C29410a.m69358a(r8, r3)
                L_0x00d4:
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.a r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33546a.this
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r0 = r8.f86948g
                    com.ss.android.ugc.aweme.emoji.a.g r0 = r0.f76886a
                    int r0 = r0.mo59223i()
                    r1 = 2132544402(0x7f1c0b92, float:2.0741964E38)
                    r4 = 4
                    r5 = 3
                    if (r0 != r5) goto L_0x00f9
                    com.ss.android.ugc.aweme.emoji.g.b r6 = com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b.m69241a()
                    int r6 = r6.f76934b
                    if (r6 != r3) goto L_0x00f9
                    android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r8, r1)
                    r8.mo19066a()
                    goto L_0x0120
                L_0x00f9:
                    if (r0 != r4) goto L_0x0120
                    com.ss.android.ugc.aweme.emoji.c.a r0 = com.p683ss.android.ugc.aweme.emoji.p1682c.C29297a.m69081a()
                    int r0 = r0.f76679a
                    if (r0 != r3) goto L_0x0120
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r0 = r8.f86948g
                    com.ss.android.ugc.aweme.emoji.a.g r0 = r0.f76886a
                    com.ss.android.ugc.aweme.emoji.c.b r0 = (com.p683ss.android.ugc.aweme.emoji.p1682c.C29301b) r0
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r8 = r8.f86948g
                    int r8 = r8.mo59307d()
                    boolean r8 = r0.mo59247d(r8)
                    if (r8 == 0) goto L_0x0120
                    android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r8, r1)
                    r8.mo19066a()
                L_0x0120:
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.a r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33546a.this
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r0 = r8.f86948g
                    com.ss.android.ugc.aweme.emoji.a.g r0 = r0.f76886a
                    int r1 = r0.mo59223i()
                    if (r1 != r4) goto L_0x0161
                    com.ss.android.ugc.aweme.emoji.c.a r1 = com.p683ss.android.ugc.aweme.emoji.p1682c.C29297a.m69081a()
                    int r1 = r1.f76679a
                    if (r1 != r5) goto L_0x0161
                    com.ss.android.ugc.aweme.emoji.utils.d r1 = com.p683ss.android.ugc.aweme.emoji.utils.C29474d.m69546a()
                    boolean r1 = r1.mo59574b()
                    if (r1 == 0) goto L_0x0161
                    com.ss.android.ugc.aweme.emoji.c.b r0 = (com.p683ss.android.ugc.aweme.emoji.p1682c.C29301b) r0
                    com.ss.android.ugc.aweme.emoji.emojichoose.m r8 = r8.f86948g
                    int r8 = r8.mo59307d()
                    boolean r8 = r0.mo59247d(r8)
                    if (r8 == 0) goto L_0x0161
                    android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    r0 = 2132544404(0x7f1c0b94, float:2.0741968E38)
                    com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21533a(r8, r0)
                    r8.mo19066a()
                    com.ss.android.ugc.aweme.emoji.utils.d r8 = com.p683ss.android.ugc.aweme.emoji.utils.C29474d.m69546a()
                    r8.mo59573a(r2)
                L_0x0161:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33546a.C335482.onPageSelected(int):void");
            }
        });
        m76907m();
    }

    /* renamed from: a */
    public final void mo59474a(LinkedHashMap<C29358c, List<C29366a>> linkedHashMap) {
        mo71012h();
    }

    /* renamed from: a */
    public final void mo59238a(int i) {
        if (this.f86948g != null) {
            this.f86948g.mo59301a(i);
            this.f86952l.setCurrentItem(this.f86948g.mo59303b(), false);
        }
    }

    /* renamed from: a */
    private void m76906a(List<C29366a> list) {
        ArrayList arrayList = new ArrayList();
        if (!C9376b.m18558a((Collection<T>) list)) {
            arrayList.add(null);
        }
        arrayList.addAll(list);
        C29368b.m69241a();
        this.f86948g.mo59302a(C29368b.m69242a((List<C29366a>) arrayList));
        mo71014j();
    }

    /* renamed from: a */
    public final void mo70882a(boolean z) {
        this.f86945d.setEnabled(z);
        if (z) {
            this.f86945d.setTextColor(this.f86945d.getContext().getResources().getColor(R.color.sb));
        } else {
            this.f86945d.setTextColor(this.f86945d.getContext().getResources().getColor(R.color.qw));
        }
    }

    /* renamed from: a */
    public final void mo59472a(C29358c cVar, List<C29366a> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            for (int i = 0; i < this.f86948g.mo59311f(); i++) {
                C29291g f = this.f86948g.mo59312f(i);
                if (f.mo59223i() == 2) {
                    C29419g gVar = (C29419g) f;
                    if (gVar.f77046d.equals(cVar)) {
                        gVar.f77045c = list;
                        this.f86948g.mo59301a(this.f86948g.f76888c);
                        m76907m();
                        this.f86952l.setCurrentItem(this.f86948g.mo59303b(), false);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo51838b(List<C29366a> list, boolean z, String str) {
        if (z) {
            m76906a(list);
        }
    }

    private C33546a(C33519b bVar, C29343d dVar, ViewGroup viewGroup) {
        super(bVar, dVar, viewGroup);
        if (((C29343d) this.f86751b).f76835b) {
            C29368b.m69241a().mo59384a((C29367a) this);
            C29368b.m69241a().mo59392b();
        }
        if (((C29343d) this.f86751b).f76836c) {
            C29297a.m69081a().mo59242a(this);
            C29297a.m69081a().mo59244b();
        }
        if (((C29343d) this.f86751b).f76837d) {
            C29410a.m69356a().mo59473a((C29420h) this);
            C29410a.m69356a();
            if (C29410a.m69359b()) {
                C29410a.m69356a();
                C29410a.m69360c();
            }
        }
    }

    /* renamed from: a */
    public final void mo51837a(List<C29366a> list, boolean z, String str) {
        if (z) {
            m76906a(list);
        }
    }

    /* renamed from: a */
    public final void mo51836a(List<C29366a> list, C29366a aVar, boolean z, String str) {
        if (z) {
            m76906a(list);
        }
    }
}
