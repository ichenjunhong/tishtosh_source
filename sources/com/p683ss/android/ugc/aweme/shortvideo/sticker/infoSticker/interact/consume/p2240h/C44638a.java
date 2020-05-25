package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2240h;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.h.a */
public final class C44638a extends C1352v {

    /* renamed from: a */
    public final CircleImageView f112921a;

    /* renamed from: b */
    public final DmtTextView f112922b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.h.a$a */
    public static final class C44639a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44638a f112923a;

        /* renamed from: b */
        final /* synthetic */ User f112924b;

        public C44639a(C44638a aVar, User user) {
            this.f112923a = aVar;
            this.f112924b = user;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            View view2 = this.f112923a.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            UserProfileActivity.m89406a(view2.getContext(), this.f112924b.getUid(), this.f112924b.getSecUid());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.h.a$b */
    public static final class C44640b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44638a f112925a;

        /* renamed from: b */
        final /* synthetic */ User f112926b;

        public C44640b(C44638a aVar, User user) {
            this.f112925a = aVar;
            this.f112926b = user;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            View view2 = this.f112925a.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            UserProfileActivity.m89406a(view2.getContext(), this.f112926b.getUid(), this.f112926b.getSecUid());
        }
    }

    public C44638a(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.b16);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_head)");
        this.f112921a = (CircleImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.dcn);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.tv_name)");
        this.f112922b = (DmtTextView) findViewById2;
    }
}
