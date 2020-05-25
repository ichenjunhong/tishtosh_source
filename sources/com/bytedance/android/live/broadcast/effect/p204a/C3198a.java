package com.bytedance.android.live.broadcast.effect.p204a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.p208d.C3249b;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.a.a */
public final class C3198a extends C1322a<C3200b> {

    /* renamed from: a */
    List<FilterModel> f9271a;

    /* renamed from: b */
    int f9272b;

    /* renamed from: c */
    C3199a f9273c;

    /* renamed from: d */
    private final int f9274d;

    /* renamed from: e */
    private Context f9275e;

    /* renamed from: com.bytedance.android.live.broadcast.effect.a.a$a */
    public interface C3199a {
        /* renamed from: a */
        void mo8488a(int i);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.a.a$b */
    static class C3200b extends C1352v {

        /* renamed from: a */
        public final View f9276a;

        /* renamed from: b */
        public View f9277b;

        /* renamed from: c */
        public HSImageView f9278c;

        /* renamed from: d */
        public TextView f9279d;

        /* renamed from: e */
        View f9280e;

        /* renamed from: a */
        public final void mo8548a() {
            this.f9280e.setVisibility(4);
        }

        C3200b(View view) {
            super(view);
            this.f9277b = view.findViewById(R.id.li);
            this.f9278c = (HSImageView) view.findViewById(R.id.ayg);
            this.f9279d = (TextView) view.findViewById(R.id.dcn);
            this.f9276a = view.findViewById(R.id.b25);
            this.f9280e = view.findViewById(R.id.avj);
        }
    }

    public final int getItemCount() {
        return this.f9271a.size();
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C3200b(LayoutInflater.from(this.f9275e).inflate(this.f9274d, viewGroup, false));
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(android.support.p043v7.widget.RecyclerView.C1352v r9, int r10) {
        /*
            r8 = this;
            com.bytedance.android.live.broadcast.effect.a.a$b r9 = (com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3200b) r9
            java.util.List<com.bytedance.android.live.broadcast.effect.model.FilterModel> r0 = r8.f9271a
            java.lang.Object r0 = r0.get(r10)
            com.bytedance.android.live.broadcast.effect.model.FilterModel r0 = (com.bytedance.android.live.broadcast.effect.model.FilterModel) r0
            int r1 = r8.f9272b
            r2 = 1
            r3 = 0
            if (r10 != r1) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            android.view.View r4 = r9.f9277b
            r5 = 4
            if (r1 == 0) goto L_0x001a
            r6 = 0
            goto L_0x001b
        L_0x001a:
            r6 = 4
        L_0x001b:
            r4.setVisibility(r6)
            if (r1 == 0) goto L_0x0033
            android.widget.TextView r1 = r9.f9279d
            android.content.Context r4 = r8.f9275e
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131822194(0x7f110672, float:1.9277153E38)
            int r4 = r4.getColor(r6)
            r1.setTextColor(r4)
            goto L_0x0045
        L_0x0033:
            android.widget.TextView r1 = r9.f9279d
            android.content.Context r4 = r8.f9275e
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131822195(0x7f110673, float:1.9277155E38)
            int r4 = r4.getColor(r6)
            r1.setTextColor(r4)
        L_0x0045:
            int r1 = r0.getFilterType()
            r4 = 8
            switch(r1) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00b0;
                case 2: goto L_0x0050;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0111
        L_0x0050:
            com.bytedance.android.live.core.widget.HSImageView r1 = r9.f9278c
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r0.getEffect()
            com.ss.android.ugc.effectmanager.common.model.UrlModel r2 = r2.getIconUrl()
            com.bytedance.android.live.base.model.ImageModel r6 = new com.bytedance.android.live.base.model.ImageModel
            r6.<init>()
            java.lang.String r7 = r2.getUri()
            r6.setUri(r7)
            java.util.List r2 = r2.getUrlList()
            r6.setUrls(r2)
            com.bytedance.android.live.core.p230g.C3899m.m9868b(r1, r6)
            android.widget.TextView r1 = r9.f9279d
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r0.getEffect()
            java.lang.String r2 = r2.getName()
            r1.setText(r2)
            com.bytedance.android.live.broadcast.effect.p r1 = com.bytedance.android.live.broadcast.effect.C3266p.m8943a()
            boolean r1 = r1.mo8635c(r0)
            if (r1 == 0) goto L_0x008d
            android.view.View r1 = r9.f9276a
            r1.setVisibility(r3)
            goto L_0x0092
        L_0x008d:
            android.view.View r1 = r9.f9276a
            r1.setVisibility(r4)
        L_0x0092:
            boolean r1 = r0.isNew()
            if (r1 == 0) goto L_0x010e
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r0.getEffect()
            if (r1 == 0) goto L_0x00aa
            boolean r0 = r0.isNew()
            if (r0 == 0) goto L_0x00aa
            android.view.View r0 = r9.f9280e
            r0.setVisibility(r3)
            goto L_0x0111
        L_0x00aa:
            android.view.View r0 = r9.f9280e
            r0.setVisibility(r5)
            goto L_0x0111
        L_0x00b0:
            com.bytedance.android.live.core.widget.HSImageView r1 = r9.f9278c
            com.bytedance.android.live.broadcast.effect.model.LocalFilterModel r2 = r0.getLocalFilter()
            int r2 = r2.getCoverResId()
            android.graphics.drawable.Drawable r2 = com.bytedance.android.live.core.p230g.C3922z.m9911c(r2)
            r1.setImageDrawable(r2)
            android.widget.TextView r1 = r9.f9279d
            com.bytedance.android.live.broadcast.effect.model.LocalFilterModel r0 = r0.getLocalFilter()
            java.lang.String r0 = r0.getName()
            r1.setText(r0)
            android.view.View r0 = r9.f9276a
            r0.setVisibility(r4)
            goto L_0x010e
        L_0x00d4:
            com.bytedance.android.live.core.setting.p<java.lang.Integer> r1 = com.bytedance.android.livesdk.config.LiveSettingKeys.START_LIVE_STYLE
            java.lang.Object r1 = r1.mo9431a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x00eb
            com.bytedance.android.live.core.widget.HSImageView r1 = r9.f9278c
            r2 = 2131956297(0x7f131249, float:1.9549146E38)
            r1.setImageResource(r2)
            goto L_0x00fc
        L_0x00eb:
            com.bytedance.android.live.core.widget.HSImageView r1 = r9.f9278c
            com.bytedance.android.live.broadcast.effect.model.LocalFilterModel r2 = r0.getLocalFilter()
            int r2 = r2.getCoverResId()
            android.graphics.drawable.Drawable r2 = com.bytedance.android.live.core.p230g.C3922z.m9911c(r2)
            r1.setImageDrawable(r2)
        L_0x00fc:
            android.widget.TextView r1 = r9.f9279d
            com.bytedance.android.live.broadcast.effect.model.LocalFilterModel r0 = r0.getLocalFilter()
            java.lang.String r0 = r0.getName()
            r1.setText(r0)
            android.view.View r0 = r9.f9276a
            r0.setVisibility(r4)
        L_0x010e:
            r9.mo8548a()
        L_0x0111:
            android.view.View r0 = r9.itemView
            com.bytedance.android.live.broadcast.effect.a.b r1 = new com.bytedance.android.live.broadcast.effect.a.b
            r1.<init>(r8, r10, r9)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.p204a.C3198a.onBindViewHolder(android.support.v7.widget.RecyclerView$v, int):void");
    }

    public C3198a(Context context, List<FilterModel> list, C3199a aVar, C3249b bVar) {
        this.f9275e = context;
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f9271a = list;
        this.f9272b = ((Integer) C4525b.f12317M.mo10345a()).intValue();
        this.f9273c = aVar;
        if (bVar == null || bVar.f9384a == -1) {
            this.f9274d = R.layout.am7;
        } else {
            this.f9274d = bVar.f9384a;
        }
    }
}
