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
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29358c;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b */
public final class C33550b extends C33475a<C33519b, C29343d> implements C29292h, C29302c, C29367a, C29420h {

    /* renamed from: d */
    public Button f86961d;

    /* renamed from: e */
    RecyclerView f86962e;

    /* renamed from: f */
    C33573k f86963f;

    /* renamed from: g */
    LinearLayoutManager f86964g;

    /* renamed from: h */
    public C33519b f86965h;

    /* renamed from: i */
    public C29359n f86966i;

    /* renamed from: j */
    int f86967j;

    /* renamed from: l */
    private SwipeControlledViewPager f86968l;

    /* renamed from: m */
    private C33556d f86969m;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b$a */
    public static class C33553a {

        /* renamed from: a */
        public C33519b f86972a;

        /* renamed from: b */
        public ViewGroup f86973b;

        /* renamed from: c */
        public C29343d f86974c = new C29343d();

        public C33553a(C33519b bVar, ViewGroup viewGroup) {
            this.f86972a = bVar;
            this.f86973b = viewGroup;
        }
    }

    /* renamed from: d */
    public final int mo70885d() {
        return R.layout.b_1;
    }

    /* renamed from: f */
    public final C29355m mo59239f() {
        return null;
    }

    /* renamed from: g */
    public final C29359n mo59240g() {
        return this.f86966i;
    }

    /* renamed from: k */
    private void m76927k() {
        this.f86969m.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final View mo70881a() {
        return super.mo70881a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo71017i() {
        this.f86969m.notifyDataSetChanged();
        this.f86968l.setCurrentItem(this.f86966i.f76908c, false);
    }

    /* renamed from: j */
    public final void mo71018j() {
        if (((C29343d) this.f86751b).f76836c) {
            C29297a.m69081a().mo59244b();
        }
    }

    /* renamed from: c */
    public final void mo70884c() {
        this.f86961d.setOnClickListener(new C33631o() {
            public final void onClick(View view) {
                if (view.equals(C33550b.this.f86961d)) {
                    if (C33550b.this.f86965h == null) {
                        C33550b.this.f86965h = new C33243e((C33519b) C33550b.this.f86750a, view.getContext());
                    }
                    C33550b.this.f86965h.bh_();
                }
            }
        });
        mo73331a(this.f86961d);
    }

    /* renamed from: h */
    public final void mo71016h() {
        if (!C29410a.m69356a().mo59477e()) {
            this.f86966i.mo59345a();
            m76927k();
        }
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

    /* renamed from: b */
    public final void mo70883b() {
        Context context = this.f86752c.getContext();
        this.f86966i = new C29359n((C29343d) this.f86751b);
        this.f86961d = (Button) this.f86752c.findViewById(R.id.a_y);
        this.f86968l = (SwipeControlledViewPager) this.f86752c.findViewById(R.id.a_v);
        this.f86962e = (RecyclerView) this.f86752c.findViewById(R.id.aa1);
        this.f86969m = new C33556d((C33519b) this.f86750a, this.f86968l, this);
        this.f86968l.setAdapter(this.f86969m);
        this.f86964g = new LinearLayoutManager(context, 0, false);
        this.f86962e.setLayoutManager(this.f86964g);
        this.f86963f = new C33573k(this);
        this.f86963f.f87024b = true;
        this.f86962e.setAdapter(this.f86963f);
        this.f86968l.addOnPageChangeListener(new C1000h() {
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
                if (r8.f86964g.mo4736c(r8.f86964g.mo4749j()).getLeft() < 0) goto L_0x0058;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
                if (r8.f86964g.mo4736c(r8.f86964g.mo4751l()).getRight() > r8.f86962e.getWidth()) goto L_0x0058;
             */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(int r8) {
                /*
                    r7 = this;
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33550b.this
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r0 = r0.f86966i
                    r0.mo59346a(r8)
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33550b.this
                    int r0 = r8.f86967j
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r1 = r8.f86966i
                    int r1 = r1.f76908c
                    r2 = 0
                    r3 = 1
                    if (r0 == r1) goto L_0x00aa
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.k r0 = r8.f86963f
                    r0.notifyDataSetChanged()
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r0 = r8.f86966i
                    int r0 = r0.f76908c
                    int r1 = r8.f86967j
                    if (r0 >= r1) goto L_0x005a
                    android.support.v7.widget.LinearLayoutManager r0 = r8.f86964g
                    int r0 = r0.mo4749j()
                    int r1 = r8.f86967j
                    if (r0 != r1) goto L_0x002c
                    r0 = 1
                    goto L_0x002d
                L_0x002c:
                    r0 = 0
                L_0x002d:
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86964g
                    int r1 = r1.mo4749j()
                    int r4 = r8.f86967j
                    int r4 = r4 - r3
                    if (r1 != r4) goto L_0x0099
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86964g
                    android.support.v7.widget.LinearLayoutManager r4 = r8.f86964g
                    int r4 = r4.mo4749j()
                    android.view.View r1 = r1.mo4736c(r4)
                    if (r1 == 0) goto L_0x0099
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86964g
                    android.support.v7.widget.LinearLayoutManager r4 = r8.f86964g
                    int r4 = r4.mo4749j()
                    android.view.View r1 = r1.mo4736c(r4)
                    int r1 = r1.getLeft()
                    if (r1 >= 0) goto L_0x0099
                L_0x0058:
                    r0 = 1
                    goto L_0x0099
                L_0x005a:
                    android.support.v7.widget.LinearLayoutManager r0 = r8.f86964g
                    int r0 = r0.mo4751l()
                    int r1 = r8.f86967j
                    if (r0 != r1) goto L_0x0066
                    r0 = 1
                    goto L_0x0067
                L_0x0066:
                    r0 = 0
                L_0x0067:
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86964g
                    int r1 = r1.mo4751l()
                    int r4 = r8.f86967j
                    int r4 = r4 + r3
                    if (r1 != r4) goto L_0x0099
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86964g
                    android.support.v7.widget.LinearLayoutManager r4 = r8.f86964g
                    int r4 = r4.mo4751l()
                    android.view.View r1 = r1.mo4736c(r4)
                    if (r1 == 0) goto L_0x0099
                    android.support.v7.widget.LinearLayoutManager r1 = r8.f86964g
                    android.support.v7.widget.LinearLayoutManager r4 = r8.f86964g
                    int r4 = r4.mo4751l()
                    android.view.View r1 = r1.mo4736c(r4)
                    int r1 = r1.getRight()
                    android.support.v7.widget.RecyclerView r4 = r8.f86962e
                    int r4 = r4.getWidth()
                    if (r1 <= r4) goto L_0x0099
                    goto L_0x0058
                L_0x0099:
                    if (r0 == 0) goto L_0x00a4
                    android.support.v7.widget.RecyclerView r0 = r8.f86962e
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r1 = r8.f86966i
                    int r1 = r1.f76908c
                    r0.mo4814b(r1)
                L_0x00a4:
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r0 = r8.f86966i
                    int r0 = r0.f76908c
                    r8.f86967j = r0
                L_0x00aa:
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33550b.this
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r0 = r8.f86966i
                    com.ss.android.ugc.aweme.emoji.a.g r0 = r0.f76906a
                    int r0 = r0.mo59223i()
                    r1 = 2
                    if (r0 != r1) goto L_0x00cf
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r0 = r8.f86966i
                    com.ss.android.ugc.aweme.emoji.a.g r0 = r0.f76906a
                    boolean r0 = r0.mo59222h()
                    if (r0 != 0) goto L_0x00cf
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r8 = r8.f86966i
                    com.ss.android.ugc.aweme.emoji.a.g r8 = r8.f76906a
                    com.ss.android.ugc.aweme.emoji.i.g r8 = (com.p683ss.android.ugc.aweme.emoji.p1693i.C29419g) r8
                    com.p683ss.android.ugc.aweme.emoji.p1693i.C29410a.m69356a()
                    com.ss.android.ugc.aweme.emoji.emojichoose.model.c r8 = r8.f77046d
                    com.p683ss.android.ugc.aweme.emoji.p1693i.C29410a.m69358a(r8, r3)
                L_0x00cf:
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33550b.this
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r0 = r8.f86966i
                    com.ss.android.ugc.aweme.emoji.a.g r0 = r0.f76906a
                    int r0 = r0.mo59223i()
                    r1 = 2132544402(0x7f1c0b92, float:2.0741964E38)
                    r4 = 4
                    r5 = 3
                    if (r0 != r5) goto L_0x00f4
                    com.ss.android.ugc.aweme.emoji.g.b r6 = com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b.m69241a()
                    int r6 = r6.f76934b
                    if (r6 != r3) goto L_0x00f4
                    android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r8, r1)
                    r8.mo19066a()
                    goto L_0x011b
                L_0x00f4:
                    if (r0 != r4) goto L_0x011b
                    com.ss.android.ugc.aweme.emoji.c.a r0 = com.p683ss.android.ugc.aweme.emoji.p1682c.C29297a.m69081a()
                    int r0 = r0.f76679a
                    if (r0 != r3) goto L_0x011b
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r0 = r8.f86966i
                    com.ss.android.ugc.aweme.emoji.a.g r0 = r0.f76906a
                    com.ss.android.ugc.aweme.emoji.c.b r0 = (com.p683ss.android.ugc.aweme.emoji.p1682c.C29301b) r0
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r8 = r8.f86966i
                    int r8 = r8.mo59348b()
                    boolean r8 = r0.mo59247d(r8)
                    if (r8 == 0) goto L_0x011b
                    android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r8, r1)
                    r8.mo19066a()
                L_0x011b:
                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33550b.this
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r0 = r8.f86966i
                    com.ss.android.ugc.aweme.emoji.a.g r0 = r0.f76906a
                    int r1 = r0.mo59223i()
                    if (r1 != r4) goto L_0x015c
                    com.ss.android.ugc.aweme.emoji.c.a r1 = com.p683ss.android.ugc.aweme.emoji.p1682c.C29297a.m69081a()
                    int r1 = r1.f76679a
                    if (r1 != r5) goto L_0x015c
                    com.ss.android.ugc.aweme.emoji.utils.d r1 = com.p683ss.android.ugc.aweme.emoji.utils.C29474d.m69546a()
                    boolean r1 = r1.mo59574b()
                    if (r1 == 0) goto L_0x015c
                    com.ss.android.ugc.aweme.emoji.c.b r0 = (com.p683ss.android.ugc.aweme.emoji.p1682c.C29301b) r0
                    com.ss.android.ugc.aweme.emoji.emojichoose.n r8 = r8.f86966i
                    int r8 = r8.mo59348b()
                    boolean r8 = r0.mo59247d(r8)
                    if (r8 == 0) goto L_0x015c
                    android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    r0 = 2132544404(0x7f1c0b94, float:2.0741968E38)
                    com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21533a(r8, r0)
                    r8.mo19066a()
                    com.ss.android.ugc.aweme.emoji.utils.d r8 = com.p683ss.android.ugc.aweme.emoji.utils.C29474d.m69546a()
                    r8.mo59573a(r2)
                L_0x015c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33550b.C335522.onPageSelected(int):void");
            }
        });
        m76927k();
    }

    /* renamed from: a */
    public final void mo59474a(LinkedHashMap<C29358c, List<C29366a>> linkedHashMap) {
        mo71016h();
    }

    /* renamed from: a */
    public final void mo59238a(int i) {
        if (this.f86966i != null) {
            this.f86966i.mo59346a(i);
            this.f86968l.setCurrentItem(this.f86966i.f76908c, false);
        }
    }

    /* renamed from: a */
    private void m76926a(List<C29366a> list) {
        ArrayList arrayList = new ArrayList();
        if (!C9376b.m18558a((Collection<T>) list)) {
            arrayList.add(null);
        }
        arrayList.addAll(list);
        C29368b.m69241a();
        this.f86966i.mo59347a(C29368b.m69242a((List<C29366a>) arrayList));
        mo71017i();
    }

    /* renamed from: a */
    public final void mo70882a(boolean z) {
        this.f86961d.setEnabled(z);
        if (z) {
            this.f86961d.setTextColor(this.f86961d.getContext().getResources().getColor(R.color.sb));
        } else {
            this.f86961d.setTextColor(this.f86961d.getContext().getResources().getColor(R.color.qw));
        }
    }

    /* renamed from: a */
    public final void mo59472a(C29358c cVar, List<C29366a> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            for (int i = 0; i < this.f86966i.mo59350c(); i++) {
                C29291g b = this.f86966i.mo59349b(i);
                if (b.mo59223i() == 2) {
                    C29419g gVar = (C29419g) b;
                    if (gVar.f77046d.equals(cVar)) {
                        gVar.f77045c = list;
                        this.f86966i.mo59346a(this.f86966i.f76908c);
                        m76927k();
                        this.f86968l.setCurrentItem(this.f86966i.f76908c, false);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo51838b(List<C29366a> list, boolean z, String str) {
        if (z) {
            m76926a(list);
        }
    }

    private C33550b(C33519b bVar, C29343d dVar, ViewGroup viewGroup) {
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
            m76926a(list);
        }
    }

    /* renamed from: a */
    public final void mo51836a(List<C29366a> list, C29366a aVar, boolean z, String str) {
        if (z) {
            m76926a(list);
        }
    }
}
