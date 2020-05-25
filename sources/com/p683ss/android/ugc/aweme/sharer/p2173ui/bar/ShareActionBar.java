package com.p683ss.android.ugc.aweme.sharer.p2173ui.bar;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar */
public final class ShareActionBar extends FrameLayout implements C42341c {

    /* renamed from: a */
    public List<? extends C42357g> f106915a = C52575l.m112097a();

    /* renamed from: b */
    public final RecyclerView f106916b;

    /* renamed from: c */
    private C42341c f106917c;

    /* renamed from: d */
    private final C42336a f106918d;

    /* renamed from: e */
    private final LinearLayoutManager f106919e;

    /* renamed from: f */
    private final Set<String> f106920f = new LinkedHashSet();

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar$a */
    public static final class C42334a extends C1340m {

        /* renamed from: a */
        final /* synthetic */ ShareActionBar f106921a;

        C42334a(ShareActionBar shareActionBar) {
            this.f106921a = shareActionBar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            this.f106921a.mo86246a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar$b */
    static final /* synthetic */ class C42335b extends C52710j implements C52670a<C52860x> {
        C42335b(ShareActionBar shareActionBar) {
            super(0, shareActionBar);
        }

        public final String getName() {
            return "filterVisible";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(ShareActionBar.class);
        }

        public final String getSignature() {
            return "filterVisible()V";
        }

        public final /* synthetic */ Object invoke() {
            ((ShareActionBar) this.receiver).mo86246a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo86246a() {
        boolean z;
        Collection collection = this.f106915a;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int l = this.f106919e.mo4751l();
            int j = this.f106919e.mo4749j();
            if (l >= 0 && j >= 0 && j <= l) {
                while (true) {
                    C42357g gVar = (C42357g) this.f106915a.get(j);
                    if (!this.f106920f.contains(gVar.mo49954c())) {
                        this.f106920f.add(gVar.mo49954c());
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
    public final void mo86247a(C42341c cVar) {
        C52711k.m112240b(cVar, "listener");
        this.f106917c = cVar;
    }

    /* renamed from: a */
    public final void mo86165a(C42357g gVar) {
        C52711k.m112240b(gVar, "action");
        C42341c cVar = this.f106917c;
        if (cVar != null) {
            cVar.mo86165a(gVar);
        }
    }

    /* renamed from: a */
    public final void mo86248a(List<? extends C42357g> list) {
        C52711k.m112240b(list, "actions");
        this.f106915a = list;
        this.f106918d.mo86252a(list);
    }

    public ShareActionBar(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "ctx");
        C52711k.m112240b(attributeSet, "attributeSet");
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.a7i, this, true);
        View findViewById = findViewById(R.id.ag);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.action_list)");
        this.f106916b = (RecyclerView) findViewById;
        this.f106918d = new C42336a(this);
        this.f106919e = new LinearLayoutManager(context, 0, false);
        this.f106918d.mo86252a(this.f106915a);
        RecyclerView recyclerView = this.f106916b;
        recyclerView.setLayoutManager(this.f106919e);
        recyclerView.setAdapter(this.f106918d);
        recyclerView.mo4801a((C1340m) new C42334a(this));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postDelayed(new C42340b(new C42335b(this)), 300);
    }
}
