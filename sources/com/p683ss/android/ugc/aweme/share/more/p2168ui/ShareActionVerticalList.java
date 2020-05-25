package com.p683ss.android.ugc.aweme.share.more.p2168ui;

import android.content.Context;
import android.graphics.Color;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.share.more.p2168ui.p2169a.C42221a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42341c;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList */
public final class ShareActionVerticalList extends FrameLayout implements C42341c {

    /* renamed from: d */
    public static final C42218b f106734d = new C42218b(null);

    /* renamed from: a */
    public List<? extends C42357g> f106735a = C52575l.m112097a();

    /* renamed from: b */
    public C42341c f106736b;

    /* renamed from: c */
    public final C42221a f106737c;

    /* renamed from: e */
    private final RecyclerView f106738e;

    /* renamed from: f */
    private final LinearLayoutManager f106739f;

    /* renamed from: g */
    private final Set<String> f106740g = new LinkedHashSet();

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList$a */
    public static final class C42217a extends C1340m {

        /* renamed from: a */
        final /* synthetic */ ShareActionVerticalList f106741a;

        C42217a(ShareActionVerticalList shareActionVerticalList) {
            this.f106741a = shareActionVerticalList;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            this.f106741a.mo86170a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList$b */
    public static final class C42218b {
        private C42218b() {
        }

        public /* synthetic */ C42218b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList$c */
    static final /* synthetic */ class C42219c extends C52710j implements C52670a<C52860x> {
        C42219c(ShareActionVerticalList shareActionVerticalList) {
            super(0, shareActionVerticalList);
        }

        public final String getName() {
            return "filterVisible";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(ShareActionVerticalList.class);
        }

        public final String getSignature() {
            return "filterVisible()V";
        }

        public final /* synthetic */ Object invoke() {
            ((ShareActionVerticalList) this.receiver).mo86170a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo86170a() {
        boolean z;
        Collection collection = this.f106735a;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int l = this.f106739f.mo4751l();
            int j = this.f106739f.mo4749j();
            if (l >= 0 && j >= 0 && j <= l) {
                while (true) {
                    C42357g gVar = (C42357g) this.f106735a.get(j);
                    if (!this.f106740g.contains(gVar.mo49954c())) {
                        this.f106740g.add(gVar.mo49954c());
                        Context context = getContext();
                        C52711k.m112236a((Object) context, "context");
                        gVar.mo49949a(context);
                    }
                    if (j == l) {
                        break;
                    }
                    j++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo86165a(C42357g gVar) {
        C52711k.m112240b(gVar, "action");
        C42341c cVar = this.f106736b;
        if (cVar != null) {
            cVar.mo86165a(gVar);
        }
    }

    public ShareActionVerticalList(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "ctx");
        C52711k.m112240b(attributeSet, "attributeSet");
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.buo, this, true);
        View findViewById = findViewById(R.id.dw8);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.action_vertical_list)");
        this.f106738e = (RecyclerView) findViewById;
        this.f106737c = new C42221a(this);
        this.f106739f = new LinearLayoutManager(context, 1, false);
        this.f106737c.mo86172a(this.f106735a);
        RecyclerView recyclerView = this.f106738e;
        recyclerView.setLayoutManager(this.f106739f);
        recyclerView.setAdapter(this.f106737c);
        recyclerView.mo4801a((C1340m) new C42217a(this));
        int b = (int) C9432q.m18687b(recyclerView.getContext(), 0.5f);
        int b2 = (int) C9432q.m18687b(recyclerView.getContext(), 48.0f);
        int b3 = (int) C9432q.m18687b(recyclerView.getContext(), 16.0f);
        C42220a aVar = new C42220a(b, Color.parseColor("#1F161823"));
        aVar.f106742a = b2;
        aVar.f106743b = b3;
        this.f106738e.mo4798a((C1331h) aVar);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postDelayed(new C42225b(new C42219c(this)), 300);
    }
}
