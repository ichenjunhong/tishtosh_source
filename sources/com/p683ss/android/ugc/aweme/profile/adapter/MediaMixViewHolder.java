package com.p683ss.android.ugc.aweme.profile.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MediaMixListState;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixViewHolder */
public final class MediaMixViewHolder extends JediSimpleViewHolder<MixStruct> {

    /* renamed from: j */
    public static final float f101414j = 13.0f;

    /* renamed from: k */
    public static final C39736a f101415k = new C39736a(null);

    /* renamed from: f */
    public final TextView f101416f;

    /* renamed from: g */
    public final MediaMixListViewModel f101417g;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixViewHolder$a */
    public static final class C39736a {
        private C39736a() {
        }

        public /* synthetic */ C39736a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixViewHolder$b */
    static final class C39737b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaMixViewHolder f101418a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f101419b;

        C39737b(MediaMixViewHolder mediaMixViewHolder, MixStruct mixStruct) {
            this.f101418a = mediaMixViewHolder;
            this.f101419b = mixStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f101418a.mo22552a(this.f101418a.f101417g, (C52671b<? super S1, ? extends R>) new C52671b<MediaMixListState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C39737b f101420a;

                {
                    this.f101420a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    MediaMixListState mediaMixListState = (MediaMixListState) obj;
                    C52711k.m112240b(mediaMixListState, "it");
                    View view = this.f101420a.f101418a.itemView;
                    C52711k.m112236a((Object) view, "itemView");
                    SmartRouter.buildRoute(view.getContext(), "aweme://mix/detail").withParam("mix_id", this.f101420a.f101419b.mixId).withParam("uid", mediaMixListState.getUid()).withParam("event_type", mediaMixListState.getEnterFrom()).withParam("enter_method", "direct_click").withParam(C47661ab.m103163a().mo94972a("uid", mediaMixListState.getUid()).mo94972a(C22835a.f61196a, mediaMixListState.getSuid()).f120139a).open();
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        MixStruct mixStruct = (MixStruct) obj;
        C52711k.m112240b(mixStruct, "item");
        this.f101416f.setText(mixStruct.mixName);
        this.itemView.setOnClickListener(new C39737b(this, mixStruct));
        this.f101417g.mo82863a(mixStruct);
    }

    private MediaMixViewHolder(ViewGroup viewGroup, MediaMixListViewModel mediaMixListViewModel, View view) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(mediaMixListViewModel, "mMediaMixListViewModel");
        C52711k.m112240b(view, "view");
        super(view);
        this.f101417g = mediaMixListViewModel;
        View findViewById = this.itemView.findViewById(R.id.bmp);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.mix_name)");
        this.f101416f = (TextView) findViewById;
    }

    public /* synthetic */ MediaMixViewHolder(ViewGroup viewGroup, MediaMixListViewModel mediaMixListViewModel, View view, int i, C52707g gVar) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpg, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…media_mix, parent, false)");
        this(viewGroup, mediaMixListViewModel, inflate);
    }
}
