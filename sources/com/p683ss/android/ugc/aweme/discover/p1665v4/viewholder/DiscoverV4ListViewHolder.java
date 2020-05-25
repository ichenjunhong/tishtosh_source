package com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.rtl.AutoRTLImageView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity;
import com.p683ss.android.ugc.aweme.discover.mob.C28396b;
import com.p683ss.android.ugc.aweme.discover.mob.C28416u;
import com.p683ss.android.ugc.aweme.discover.mob.C28417v;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.p1382aq.C23250t;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.ttm.player.MediaPlayer;
import com.ss.android.ugc.trill.R;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4ListViewHolder */
public final class DiscoverV4ListViewHolder extends JediSimpleViewHolder<DiscoverCategoryStructV4> implements OnClickListener {

    /* renamed from: f */
    public static final C28878a f75643f = new C28878a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4ListViewHolder$a */
    public static final class C28878a {
        private C28878a() {
        }

        public /* synthetic */ C28878a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: i */
    public final void mo22673i() {
        super.mo22673i();
    }

    /* renamed from: g */
    public final void mo22671g() {
        super.mo22671g();
        this.itemView.setOnClickListener(this);
    }

    /* renamed from: h */
    public final void mo22672h() {
        super.mo22672h();
        if (NewDiscoverV4Experiment.m69617a()) {
            int i = ((DiscoverCategoryStructV4) mo22689o()).type;
            if (i != 2) {
                if (i == 4) {
                    C28396b.m67405a(((DiscoverCategoryStructV4) mo22689o()).tabName, ((DiscoverCategoryStructV4) mo22689o()).order, ((DiscoverCategoryStructV4) mo22689o()).logPb);
                }
                return;
            }
            C0013i.m18a((Callable<TResult>) new C28416u<TResult>(((DiscoverCategoryStructV4) mo22689o()).tabName, ((DiscoverCategoryStructV4) mo22689o()).order, ((DiscoverCategoryStructV4) mo22689o()).logPb), (Executor) C26890h.m65003a());
            return;
        }
        C28396b.m67405a(((DiscoverCategoryStructV4) mo22689o()).tabName, this.f31643i - 1, ((DiscoverCategoryStructV4) mo22689o()).logPb);
    }

    public DiscoverV4ListViewHolder(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bhv, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…r_v4_list, parent, false)");
        super(inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        DiscoverCategoryStructV4 discoverCategoryStructV4 = (DiscoverCategoryStructV4) obj;
        C52711k.m112240b(discoverCategoryStructV4, "item");
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        View view2 = this.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        Context context = view2.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        view.setBackground(context.getResources().getDrawable(R.drawable.hb));
        View view3 = this.itemView;
        C52711k.m112236a((Object) view3, "itemView");
        ((AutoRTLImageView) view3.findViewById(R.id.b3o)).setImageResource(R.drawable.d18);
        if (discoverCategoryStructV4.isFirst) {
            View view4 = this.itemView;
            C52711k.m112236a((Object) view4, "itemView");
            View findViewById = view4.findViewById(R.id.e4m);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
        View view5 = this.itemView;
        C52711k.m112236a((Object) view5, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view5.findViewById(R.id.dhb);
        C52711k.m112236a((Object) dmtTextView, "itemView.tv_title");
        dmtTextView.setText(discoverCategoryStructV4.tabText);
        C12208t a = C12203q.m24645a((Object) C23608p.m57874a(discoverCategoryStructV4.coverUrl)).mo23125b(C47788ct.m103417a(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL)).mo23118a("DiscoverV4ListViewHolder");
        View view6 = this.itemView;
        C52711k.m112236a((Object) view6, "itemView");
        a.mo23116a((C12197k) (SmartImageView) view6.findViewById(R.id.ee6)).mo23121a();
        View view7 = this.itemView;
        C52711k.m112236a((Object) view7, "itemView");
        if (C47918gj.m103682a(view7.getContext())) {
            View view8 = this.itemView;
            C52711k.m112236a((Object) view8, "itemView");
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) view8.findViewById(R.id.b3o);
            C52711k.m112236a((Object) autoRTLImageView, "itemView.iv_right");
            autoRTLImageView.setRotation(180.0f);
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (((DiscoverCategoryStructV4) mo22689o()).type == 2) {
            String uuid = UUID.randomUUID().toString();
            C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            SmartRouter.buildRoute(view2.getContext(), "//challenge/detail").withParam("id", ((DiscoverCategoryStructV4) mo22689o()).tabName).withParam("enter_from", "discovery").withParam("extra_challenge_is_hashtag", false).withParam("process_id", uuid).open();
            new C23250t().mo48150f("discovery").mo48154t(((DiscoverCategoryStructV4) mo22689o()).tabName).mo48155u(uuid).mo48076e();
            return;
        }
        C0013i.m18a((Callable<TResult>) new C28417v<TResult>(((DiscoverCategoryStructV4) mo22689o()).tabName, this.f31643i - 1, ((DiscoverCategoryStructV4) mo22689o()).logPb), (Executor) C26890h.m65003a());
        View view3 = this.itemView;
        C52711k.m112236a((Object) view3, "itemView");
        DiscoverDetailActivity.m66410a(view3.getContext(), 0, "", "", this.f31643i - 1, ((DiscoverCategoryStructV4) mo22689o()).tabName, ((DiscoverCategoryStructV4) mo22689o()).tabText);
    }
}
