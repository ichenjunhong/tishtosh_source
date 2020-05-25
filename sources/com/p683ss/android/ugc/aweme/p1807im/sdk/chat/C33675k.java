package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.k */
public final class C33675k extends C1352v {

    /* renamed from: a */
    final RemoteImageView f87313a;

    /* renamed from: b */
    public C52682m<? super View, ? super Integer, C52860x> f87314b;

    public C33675k(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bd2, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.a_s);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.emoji_iv)");
        this.f87313a = (RemoteImageView) findViewById;
        this.f87313a.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C33675k f87315a;

            {
                this.f87315a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C52682m<? super View, ? super Integer, C52860x> mVar = this.f87315a.f87314b;
                if (mVar != null) {
                    C52711k.m112236a((Object) view, "it");
                    mVar.invoke(view, Integer.valueOf(this.f87315a.getAdapterPosition()));
                }
            }
        });
        ((C13833a) this.f87313a.getHierarchy()).mo25902b((int) R.drawable.db3);
    }
}
