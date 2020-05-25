package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.support.p030v4.view.ViewPager.C1000h;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.p1686a.C29336b;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29287c;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29291g;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29292h;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29293i;
import com.p683ss.android.ugc.aweme.emoji.p1682c.C29297a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.C29301b;
import com.p683ss.android.ugc.aweme.emoji.p1682c.C29302c;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29367a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b;
import com.p683ss.android.ugc.aweme.emoji.utils.C29474d;
import com.p683ss.android.ugc.aweme.emoji.utils.C29475e;
import com.p683ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c */
public final class C29340c extends C29287c<C29293i, C29343d> implements C29292h, C29302c, C29367a {

    /* renamed from: e */
    public static int f76818e;

    /* renamed from: d */
    public C29355m f76819d;

    /* renamed from: f */
    public boolean f76820f;

    /* renamed from: i */
    private SwipeControlledViewPager f76821i;

    /* renamed from: j */
    private RecyclerView f76822j;

    /* renamed from: k */
    private Button f76823k;

    /* renamed from: l */
    private RecyclerView f76824l;

    /* renamed from: m */
    private C29336b f76825m;

    /* renamed from: n */
    private C29349h f76826n;

    /* renamed from: o */
    private C29362q f76827o;

    /* renamed from: p */
    private LinearLayoutManager f76828p;

    /* renamed from: q */
    private int f76829q;

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$a */
    public static class C29342a {

        /* renamed from: a */
        public C29343d f76831a = new C29343d();

        /* renamed from: b */
        private C29293i f76832b;

        /* renamed from: c */
        private ViewGroup f76833c;

        /* renamed from: b */
        public final C29340c mo59282b() {
            return new C29340c(this.f76832b, this.f76831a, this.f76833c);
        }

        /* renamed from: a */
        public final C29342a mo59281a() {
            this.f76831a.f76834a = true;
            this.f76831a.f76840g.add(Integer.valueOf(1));
            return this;
        }

        public C29342a(C29293i iVar, ViewGroup viewGroup) {
            this.f76832b = iVar;
            this.f76833c = viewGroup;
        }
    }

    /* renamed from: d */
    public final int mo59230d() {
        return R.layout.lj;
    }

    /* renamed from: f */
    public final C29355m mo59239f() {
        return this.f76819d;
    }

    /* renamed from: g */
    public final C29359n mo59240g() {
        return null;
    }

    /* renamed from: l */
    private void m69155l() {
        if (this.f76821i != null) {
            int a = C29475e.m69554a(this.f76819d, this.f76821i.getCurrentItem());
            if (this.f76670a != null) {
                ((C29293i) this.f76670a).mo51888b(a);
            }
        }
    }

    /* renamed from: c */
    public final void mo59229c() {
        View[] viewArr = {this.f76823k};
        for (int i = 0; i <= 0; i++) {
            View view = viewArr[0];
            if (view != null) {
                view.setOnTouchListener(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo59280k() {
        this.f76826n.notifyDataSetChanged();
        this.f76821i.setCurrentItem(this.f76819d.mo59303b(), false);
        mo59279j();
    }

    /* renamed from: e */
    public final void mo59232e() {
        super.mo59232e();
        if (((C29343d) this.f76671b).f76836c) {
            C29297a.m69081a().mo59245b(this);
        }
        if (((C29343d) this.f76671b).f76835b) {
            C29368b.m69241a().mo59393b((C29367a) this);
        }
    }

    /* renamed from: j */
    public final void mo59279j() {
        if (this.f76819d.f76886a.mo59223i() == 3 && this.f76819d.f76886a.mo59224j() == 0) {
            this.f76822j.setVisibility(4);
            return;
        }
        this.f76825m.mo59273a(this.f76819d.mo59305c(), this.f76819d.mo59307d(), this.f76819d.f76886a.mo59223i());
        this.f76822j.setVisibility(0);
    }

    /* renamed from: h */
    public final void mo59277h() {
        int i;
        int currentItem = this.f76821i.getCurrentItem();
        int a = C29475e.m69554a(this.f76819d, currentItem);
        if (a == 4) {
            List<C29285a> d = this.f76819d.mo59308d(currentItem);
            if (d != null && !d.isEmpty()) {
                C29301b bVar = (C29301b) this.f76819d.f76886a;
                for (C29285a aVar : d) {
                    if (aVar != null) {
                        C29366a aVar2 = aVar.f76668d;
                        if (!(aVar2 == null || (aVar2.getStaticUrl() == null && aVar2.getAnimateUrl() == null))) {
                            List<C29366a> list = bVar.f76683b;
                            if (list == null) {
                                i = -1;
                            } else {
                                i = list.indexOf(aVar2);
                            }
                            ((C29293i) this.f76670a).mo51886a(aVar, a, i);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo59228b() {
        boolean z;
        int i;
        this.f76819d = new C29355m((C29343d) this.f76671b);
        this.f76821i = (SwipeControlledViewPager) this.f76672c.findViewById(R.id.a_v);
        this.f76824l = (RecyclerView) this.f76672c.findViewById(R.id.aa1);
        this.f76822j = (RecyclerView) this.f76672c.findViewById(R.id.a_r);
        this.f76823k = (Button) this.f76672c.findViewById(R.id.a_y);
        this.f76826n = new C29349h((C29293i) this.f76670a, this, this.f76821i);
        this.f76821i.setAdapter(this.f76826n);
        int i2 = 0;
        this.f76828p = new LinearLayoutManager(this.f76824l.getContext(), 0, false);
        this.f76824l.setLayoutManager(this.f76828p);
        this.f76827o = new C29362q(this);
        this.f76824l.setAdapter(this.f76827o);
        View findViewById = this.f76672c.findViewById(R.id.dr5);
        View findViewById2 = this.f76672c.findViewById(R.id.b7j);
        if (((C29343d) this.f76671b).f76840g.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        if (!z) {
            i2 = 8;
        }
        findViewById2.setVisibility(i2);
        this.f76825m = new C29336b(this.f76822j);
        mo59279j();
        this.f76821i.addOnPageChangeListener(new C1000h() {
            public final void onPageSelected(int i) {
                C29340c.this.f76820f = false;
                C29340c.this.f76819d.mo59304b(i);
                C29340c.f76818e = C29340c.this.f76819d.f76888c;
                C29340c.this.mo59279j();
                C29340c.this.mo59278i();
                C29340c cVar = C29340c.this;
                int i2 = cVar.f76819d.f76886a.mo59223i();
                if (i2 == 3 && C29368b.m69241a().f76934b == 1) {
                    C10691a.m21542b(C11010c.m22280a(), (int) R.string.axc).mo19066a();
                } else if (i2 == 4 && C29297a.m69081a().f76679a == 1 && ((C29301b) cVar.f76819d.f76886a).mo59247d(cVar.f76819d.mo59307d())) {
                    C10691a.m21542b(C11010c.m22280a(), (int) R.string.axc).mo19066a();
                }
                C29340c cVar2 = C29340c.this;
                C29291g gVar = cVar2.f76819d.f76886a;
                if (gVar.mo59223i() == 4 && C29297a.m69081a().f76679a == 3 && C29474d.m69546a().mo59574b() && ((C29301b) gVar).mo59247d(cVar2.f76819d.mo59307d())) {
                    C10691a.m21533a(C11010c.m22280a(), (int) R.string.axe).mo19066a();
                    C29474d.m69546a().mo59573a(false);
                }
                C29340c.this.mo59277h();
            }
        });
        this.f76820f = true;
        mo59238a(f76818e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r4.f76828p.mo4736c(r4.f76828p.mo4749j()).getLeft() < 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if (r4.f76828p.mo4736c(r4.f76828p.mo4751l()).getRight() > r4.f76824l.getWidth()) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59278i() {
        /*
            r4 = this;
            int r0 = r4.f76829q
            com.ss.android.ugc.aweme.emoji.emojichoose.m r1 = r4.f76819d
            int r1 = r1.f76888c
            if (r0 == r1) goto L_0x00a0
            com.ss.android.ugc.aweme.emoji.emojichoose.q r0 = r4.f76827o
            r0.notifyDataSetChanged()
            r0 = 0
            com.ss.android.ugc.aweme.emoji.emojichoose.m r1 = r4.f76819d
            int r1 = r1.f76888c
            int r2 = r4.f76829q
            r3 = 1
            if (r1 >= r2) goto L_0x004f
            android.support.v7.widget.LinearLayoutManager r1 = r4.f76828p
            int r1 = r1.mo4749j()
            int r2 = r4.f76829q
            if (r1 != r2) goto L_0x0022
            r0 = 1
        L_0x0022:
            android.support.v7.widget.LinearLayoutManager r1 = r4.f76828p
            int r1 = r1.mo4749j()
            int r2 = r4.f76829q
            int r2 = r2 - r3
            if (r1 != r2) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f76828p
            android.support.v7.widget.LinearLayoutManager r2 = r4.f76828p
            int r2 = r2.mo4749j()
            android.view.View r1 = r1.mo4736c(r2)
            if (r1 == 0) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f76828p
            android.support.v7.widget.LinearLayoutManager r2 = r4.f76828p
            int r2 = r2.mo4749j()
            android.view.View r1 = r1.mo4736c(r2)
            int r1 = r1.getLeft()
            if (r1 >= 0) goto L_0x008c
        L_0x004d:
            r0 = 1
            goto L_0x008c
        L_0x004f:
            android.support.v7.widget.LinearLayoutManager r1 = r4.f76828p
            int r1 = r1.mo4751l()
            int r2 = r4.f76829q
            if (r1 != r2) goto L_0x005a
            r0 = 1
        L_0x005a:
            android.support.v7.widget.LinearLayoutManager r1 = r4.f76828p
            int r1 = r1.mo4751l()
            int r2 = r4.f76829q
            int r2 = r2 + r3
            if (r1 != r2) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f76828p
            android.support.v7.widget.LinearLayoutManager r2 = r4.f76828p
            int r2 = r2.mo4751l()
            android.view.View r1 = r1.mo4736c(r2)
            if (r1 == 0) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f76828p
            android.support.v7.widget.LinearLayoutManager r2 = r4.f76828p
            int r2 = r2.mo4751l()
            android.view.View r1 = r1.mo4736c(r2)
            int r1 = r1.getRight()
            android.support.v7.widget.RecyclerView r2 = r4.f76824l
            int r2 = r2.getWidth()
            if (r1 <= r2) goto L_0x008c
            goto L_0x004d
        L_0x008c:
            if (r0 == 0) goto L_0x0097
            android.support.v7.widget.RecyclerView r0 = r4.f76824l
            com.ss.android.ugc.aweme.emoji.emojichoose.m r1 = r4.f76819d
            int r1 = r1.f76888c
            r0.mo4814b(r1)
        L_0x0097:
            com.ss.android.ugc.aweme.emoji.emojichoose.m r0 = r4.f76819d
            int r0 = r0.f76888c
            r4.f76829q = r0
            r4.m69155l()
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.emojichoose.C29340c.mo59278i():void");
    }

    /* renamed from: a */
    private void m69154a(List<C29366a> list) {
        ArrayList arrayList = new ArrayList();
        if (((C29343d) this.f76671b).f76838e || (!C9376b.m18558a((Collection<T>) list) && C32816h.m75716b().getEnableCommentCreateSticker().booleanValue())) {
            arrayList.add(null);
        }
        arrayList.addAll(list);
        C29368b.m69241a();
        this.f76819d.mo59302a(C29368b.m69242a((List<C29366a>) arrayList));
        mo59280k();
    }

    /* renamed from: a */
    public final void mo59238a(int i) {
        if (this.f76819d != null) {
            this.f76819d.mo59301a(i);
            int b = this.f76819d.mo59303b();
            this.f76821i.setCurrentItem(b, false);
            if (this.f76820f && b == 0) {
                this.f76820f = false;
                m69155l();
            }
        }
    }

    /* renamed from: b */
    public final void mo51838b(List<C29366a> list, boolean z, String str) {
        if (z) {
            m69154a(list);
        }
    }

    /* renamed from: a */
    public final void mo51837a(List<C29366a> list, boolean z, String str) {
        if (z) {
            m69154a(list);
        }
    }

    private C29340c(C29293i iVar, C29343d dVar, ViewGroup viewGroup) {
        super(iVar, dVar, viewGroup);
        if (((C29343d) this.f76671b).f76835b) {
            C29368b.m69241a().mo59384a((C29367a) this);
            C29368b.m69241a().mo59392b();
        }
        if (((C29343d) this.f76671b).f76836c) {
            C29297a.m69081a().mo59242a(this);
            C29297a.m69081a().mo59243a(true, false, "comment", ((C29343d) this.f76671b).f76839f);
        }
    }

    /* renamed from: a */
    public final void mo51836a(List<C29366a> list, C29366a aVar, boolean z, String str) {
        if (z) {
            m69154a(list);
        }
    }
}
