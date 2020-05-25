package com.p683ss.android.ugc.aweme.sharer.p2173ui.bar;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42310b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.d */
public final class C42342d extends C1322a<C42343a> {

    /* renamed from: a */
    public List<? extends C42307b> f106935a;

    /* renamed from: b */
    public final C42345e f106936b;

    /* renamed from: c */
    private final boolean f106937c;

    /* renamed from: d */
    private final boolean f106938d;

    /* renamed from: e */
    private final int f106939e;

    /* renamed from: f */
    private final boolean f106940f;

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.d$a */
    public static final class C42343a extends C1352v {

        /* renamed from: a */
        public final RemoteImageView f106941a;

        /* renamed from: b */
        public final DmtTextView f106942b;

        public C42343a(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.cmu);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.share_channel_icon)");
            this.f106941a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.cmv);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.share_channel_label)");
            this.f106942b = (DmtTextView) findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.d$b */
    static final class C42344b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42342d f106943a;

        /* renamed from: b */
        final /* synthetic */ int f106944b;

        C42344b(C42342d dVar, int i) {
            this.f106943a = dVar;
            this.f106944b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C42310b.m92909a(view, 1200)) {
                this.f106943a.f106936b.mo66353a((C42307b) this.f106943a.f106935a.get(this.f106944b));
            }
        }
    }

    public final int getItemCount() {
        return this.f106935a.size();
    }

    /* renamed from: a */
    public final void mo86255a(List<? extends C42307b> list) {
        C52711k.m112240b(list, "channels");
        this.f106935a = list;
        notifyDataSetChanged();
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C42343a aVar = (C42343a) vVar;
        C52711k.m112240b(aVar, "holder");
        ((C42307b) this.f106935a.get(i)).mo86139a(aVar.f106941a, this.f106937c);
        aVar.f106942b.setText(((C42307b) this.f106935a.get(i)).mo86137c());
        aVar.itemView.setOnClickListener(new C42344b(this, i));
        if (((C42307b) this.f106935a.get(i)).mo86143g()) {
            View view = aVar.itemView;
            C52711k.m112236a((Object) view, "holder.itemView");
            view.setAlpha(((C42307b) this.f106935a.get(i)).mo86142f());
            return;
        }
        View view2 = aVar.itemView;
        C52711k.m112236a((Object) view2, "holder.itemView");
        view2.setAlpha(1.0f);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        C52711k.m112240b(viewGroup, "parent");
        if (this.f106940f) {
            i2 = R.layout.bke;
        } else if (!this.f106937c) {
            i2 = R.layout.a7m;
        } else {
            i2 = R.layout.a7n;
        }
        boolean z = false;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        C42343a aVar = new C42343a(inflate);
        if (this.f106938d) {
            aVar.f106942b.setVisibility(8);
        }
        DmtTextView dmtTextView = aVar.f106942b;
        Integer valueOf = Integer.valueOf(this.f106939e);
        if (valueOf.intValue() != 0) {
            z = true;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i3 = valueOf.intValue();
        } else {
            i3 = viewGroup.getResources().getColor(R.color.a44);
        }
        dmtTextView.setTextColor(i3);
        return aVar;
    }

    public C42342d(C42345e eVar, boolean z, boolean z2, int i, boolean z3) {
        C52711k.m112240b(eVar, "listener");
        this.f106936b = eVar;
        this.f106937c = z;
        this.f106938d = z2;
        this.f106939e = i;
        this.f106940f = z3;
        this.f106935a = C52575l.m112097a();
    }

    public /* synthetic */ C42342d(C42345e eVar, boolean z, boolean z2, int i, boolean z3, int i2, C52707g gVar) {
        this(eVar, true, z2, 0, false);
    }
}
