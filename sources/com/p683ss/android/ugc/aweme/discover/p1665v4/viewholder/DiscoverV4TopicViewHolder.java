package com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.mob.C28406k;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.DiscoverV4TrendingActivity;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4TopicViewHolder */
public final class DiscoverV4TopicViewHolder extends JediSimpleViewHolder<DiscoverCategoryStructV4> {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f75661f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoverV4TopicViewHolder.class), "context", "getContext()Landroid/content/Context;"))};

    /* renamed from: g */
    public final ViewGroup f75662g;

    /* renamed from: j */
    public final boolean f75663j;

    /* renamed from: k */
    private final C52668f f75664k = C52732g.m112285a(new C28888a(this));

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4TopicViewHolder$a */
    static final class C28888a extends C52712l implements C52670a<Context> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4TopicViewHolder f75665a;

        C28888a(DiscoverV4TopicViewHolder discoverV4TopicViewHolder) {
            this.f75665a = discoverV4TopicViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75665a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return view.getContext();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4TopicViewHolder$b */
    static final class C28889b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4TopicViewHolder f75666a;

        C28889b(DiscoverV4TopicViewHolder discoverV4TopicViewHolder) {
            this.f75666a = discoverV4TopicViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C0013i.m18a(C28406k.f74622a, (Executor) C26890h.m65003a());
            this.f75666a.mo58458p().startActivity(new Intent(this.f75666a.mo58458p(), DiscoverV4TrendingActivity.class));
        }
    }

    /* renamed from: p */
    public final Context mo58458p() {
        return (Context) this.f75664k.getValue();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        C52711k.m112240b((DiscoverCategoryStructV4) obj, "item");
        if (this.f75663j) {
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.f3e);
            if (dmtTextView != null) {
                dmtTextView.setVisibility(0);
            }
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            DmtTextView dmtTextView2 = (DmtTextView) view2.findViewById(R.id.f3e);
            if (dmtTextView2 != null) {
                dmtTextView2.setOnClickListener(new C28889b(this));
            }
            View view3 = this.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            DmtTextView dmtTextView3 = (DmtTextView) view3.findViewById(R.id.f53);
            if (dmtTextView3 != null) {
                View view4 = this.itemView;
                C52711k.m112236a((Object) view4, "itemView");
                Context context = view4.getContext();
                C52711k.m112236a((Object) context, "itemView.context");
                dmtTextView3.setText(context.getResources().getString(R.string.aqv));
            }
        }
    }

    public DiscoverV4TopicViewHolder(ViewGroup viewGroup, boolean z) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bhx, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…_v4_topic, parent, false)");
        super(inflate);
        this.f75662g = viewGroup;
        this.f75663j = z;
    }
}
