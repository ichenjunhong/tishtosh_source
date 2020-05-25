package com.p683ss.android.ugc.aweme.feed.unread;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.p683ss.android.ugc.aweme.familiar.service.C29650b;
import com.p683ss.android.ugc.aweme.feed.unread.UnReadFeedSunRoofViewModel.C31151a;
import com.p683ss.android.ugc.aweme.main.service.IUnReadVideoService.C36678a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.unread.UnReadCircleView;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.unread.f */
public final class C31172f extends C1352v {

    /* renamed from: e */
    public static final C31173a f81587e = new C31173a(null);

    /* renamed from: a */
    final SmartCircleImageView f81588a;

    /* renamed from: b */
    final TextView f81589b;

    /* renamed from: c */
    final C36678a f81590c;

    /* renamed from: d */
    User f81591d;

    /* renamed from: f */
    private final UnReadCircleView f81592f;

    /* renamed from: g */
    private final UnReadFeedSunRoofViewModel f81593g;

    /* renamed from: com.ss.android.ugc.aweme.feed.unread.f$a */
    public static final class C31173a {
        private C31173a() {
        }

        public /* synthetic */ C31173a(C52707g gVar) {
            this();
        }
    }

    public C31172f(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.f77);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.view_avatar)");
        this.f81588a = (SmartCircleImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.dcn);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.tv_name)");
        this.f81589b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f7l);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.view_unread)");
        this.f81592f = (UnReadCircleView) findViewById3;
        Context context = view.getContext();
        if (context != null) {
            this.f81593g = C31151a.m72790a((FragmentActivity) context);
            this.f81590c = C29650b.f77509a.getUnReadVideoAvatarListController(this.f81592f, "homepage_hot_window");
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
