package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.p1822a;

import android.content.Context;
import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33604b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33605c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33606d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33608f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33609g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1825b.C33595a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1825b.C33596b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1826c.p1827a.C33598b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1826c.p1827a.C33599c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35234bi;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35273k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.a.a */
public final class C33476a extends C1322a<C1352v> {

    /* renamed from: g */
    private static final int f86753g;

    /* renamed from: a */
    public int f86754a;

    /* renamed from: b */
    public boolean f86755b;

    /* renamed from: c */
    public boolean f86756c = true;

    /* renamed from: d */
    public int f86757d;

    /* renamed from: e */
    public C33481d f86758e;

    /* renamed from: f */
    public C33480c f86759f;

    /* renamed from: h */
    private List<C33595a> f86760h = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.a.a$a */
    class C33478a extends C1352v {
        C33478a(View view) {
            super(view);
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = view.getResources().getDisplayMetrics().widthPixels;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.a.a$b */
    class C33479b extends C1352v {

        /* renamed from: a */
        RemoteImageView f86763a;

        C33479b(View view) {
            super(view);
            this.f86763a = (RemoteImageView) view.findViewById(R.id.b0x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.a.a$c */
    public interface C33480c {
        /* renamed from: a */
        void mo70897a(int i);

        /* renamed from: a */
        void mo70898a(C33598b bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.a.a$d */
    public interface C33481d {
        /* renamed from: a */
        void mo70899a();
    }

    /* renamed from: c */
    public final void mo70895c() {
        if (this.f86755b) {
            this.f86755b = false;
        }
    }

    /* renamed from: e */
    private void m76723e() {
        this.f86757d = 0;
        this.f86760h.clear();
    }

    /* renamed from: f */
    private void m76724f() {
        this.f86760h.add(new C33595a());
        m76722a(false, 0);
    }

    public final int getItemCount() {
        if (this.f86760h != null) {
            return this.f86760h.size();
        }
        return 0;
    }

    static {
        float f;
        Context a = C11010c.m22280a();
        if (C35279p.m79763a()) {
            f = 16.0f;
        } else {
            f = 17.0f;
        }
        f86753g = (int) C9432q.m18687b(a, f);
    }

    /* renamed from: d */
    public final void mo70896d() {
        if (this.f86760h.size() > 0) {
            this.f86760h.clear();
            notifyDataSetChanged();
        }
        this.f86755b = false;
        this.f86756c = true;
    }

    /* renamed from: b */
    public final List<C33595a> mo70892b() {
        if (this.f86757d <= 0) {
            return null;
        }
        int size = this.f86760h.size() - 1;
        if (this.f86757d == size) {
            return this.f86760h;
        }
        if (this.f86757d < size) {
            return this.f86760h.subList(0, this.f86757d + 1);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo70891a() {
        if (this.f86760h == null || this.f86760h.isEmpty()) {
            return true;
        }
        return false;
    }

    public C33476a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.mo4801a((C1340m) new C1340m() {
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    if (!C33476a.this.f86755b && C33476a.this.f86756c) {
                        C1332i layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                            int l = linearLayoutManager.mo4751l();
                            if (l > C33476a.this.f86757d) {
                                C33476a.this.f86757d = l;
                            }
                            int A = linearLayoutManager.mo5013A();
                            int i3 = l + 1;
                            if (A > 0 && A != i3 && A - i3 <= 4 && C33476a.this.f86758e != null) {
                                C33476a.this.f86758e.mo70899a();
                                C33476a.this.f86755b = true;
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo70893b(C33599c cVar) {
        ArrayList arrayList = new ArrayList(this.f86760h);
        m76719a(this.f86760h, cVar);
        m76721a(this.f86760h, (List<C33595a>) arrayList);
        this.f86755b = false;
    }

    public final int getItemViewType(int i) {
        if (TextUtils.equals(((C33595a) this.f86760h.get(i)).getClass().getCanonicalName(), C33595a.class.getCanonicalName())) {
            return 220;
        }
        return 221;
    }

    /* renamed from: b */
    public final void mo70894b(C33605c cVar) {
        ArrayList arrayList = new ArrayList(this.f86760h);
        m76720a(this.f86760h, cVar);
        m76721a(this.f86760h, (List<C33595a>) arrayList);
        this.f86755b = false;
    }

    /* renamed from: a */
    public final void mo70889a(C33599c cVar) {
        m76723e();
        m76719a(this.f86760h, cVar);
        notifyDataSetChanged();
        this.f86755b = false;
    }

    /* renamed from: a */
    public final void mo70890a(C33605c cVar) {
        m76723e();
        m76720a(this.f86760h, cVar);
        if (this.f86760h.isEmpty()) {
            m76724f();
        }
        notifyDataSetChanged();
        this.f86755b = false;
    }

    /* renamed from: a */
    private void m76722a(boolean z, int i) {
        this.f86756c = z;
        this.f86754a = i;
    }

    /* renamed from: a */
    private void m76719a(List<C33595a> list, C33599c cVar) {
        if (cVar == null) {
            m76722a(false, 0);
            return;
        }
        m76722a(cVar.f87084b, cVar.f87085c);
        List<C33598b> list2 = cVar.f87083a;
        if (list2 != null && !list2.isEmpty()) {
            int i = cVar.f87086d;
            for (C33598b bVar : list2) {
                if (bVar != null) {
                    bVar.f87082f = i;
                    list.add(bVar);
                }
            }
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 221) {
            return new C33479b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bd0, viewGroup, false));
        }
        return new C33478a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bd1, viewGroup, false));
    }

    /* renamed from: a */
    private void m76720a(List<C33595a> list, C33605c cVar) {
        C33609g gVar = cVar.f87099c;
        if (gVar != null) {
            List<C33604b> list2 = gVar.f87104a;
            if (list2 != null && list2.size() > 0) {
                for (C33604b bVar : list2) {
                    C33606d dVar = bVar.f87095b;
                    if (dVar != null) {
                        list.add(dVar.f87100a);
                    }
                }
            }
            C33608f fVar = gVar.f87105b;
            if (fVar != null) {
                m76722a(fVar.f87102a, fVar.f87103b);
                return;
            }
            m76722a(false, 0);
        }
    }

    /* renamed from: a */
    private void m76721a(List<C33595a> list, List<C33595a> list2) {
        if (list.size() != list2.size()) {
            C1208c.m3654a(new C35273k(list2, list)).mo3931a((C1322a) this);
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        boolean z;
        if (vVar instanceof C33479b) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) vVar.itemView.getLayoutParams();
            if (i == 0) {
                i2 = f86753g;
            } else {
                i2 = (int) C9432q.m18687b(C11010c.m22280a(), 4.0f);
            }
            marginLayoutParams.setMargins(i2, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            C33479b bVar = (C33479b) vVar;
            C33595a aVar = (C33595a) this.f86760h.get(i);
            if (aVar instanceof C33596b) {
                C33596b bVar2 = (C33596b) aVar;
                m76718a(bVar.f86763a, Integer.parseInt(bVar2.f87074b), Integer.parseInt(bVar2.f87075c));
                bVar.f86763a.setOnClickListener(new C33482b(this, vVar));
                int parseInt = Integer.parseInt(bVar2.f87075c);
                int parseInt2 = Integer.parseInt(bVar2.f87074b);
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(Collections.singletonList(bVar2.f87073a));
                urlModel.setHeight(parseInt);
                urlModel.setWidth(parseInt2);
                C35234bi.m79641a(bVar.f86763a, urlModel, parseInt2, parseInt, false);
            } else if (aVar instanceof C33598b) {
                C33598b bVar3 = (C33598b) aVar;
                UrlModel urlModel2 = bVar3.f87077a;
                if (urlModel2 != null) {
                    if (bVar3.f87078b != null) {
                        if (C34004b.m77717a().mo71949f().getAssociativeEmoji() == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            urlModel2 = bVar3.f87078b;
                        }
                    }
                    m76718a(bVar.f86763a, urlModel2.getWidth(), urlModel2.getHeight());
                    bVar.f86763a.setOnClickListener(new C33483c(this, bVar3));
                    C35234bi.m79641a(bVar.f86763a, urlModel2, urlModel2.getWidth(), urlModel2.getHeight(), false);
                }
            }
        }
    }

    /* renamed from: a */
    private static int m76717a(int i, int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return i;
        }
        return (i * i2) / i3;
    }

    /* renamed from: a */
    private void m76718a(RemoteImageView remoteImageView, int i, int i2) {
        LayoutParams layoutParams = remoteImageView.getLayoutParams();
        layoutParams.width = m76717a(layoutParams.height, i, i2);
        remoteImageView.setLayoutParams(layoutParams);
    }
}
