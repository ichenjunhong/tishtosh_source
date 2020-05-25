package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity;
import com.p683ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity.C38244a;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.aj */
public final class C38360aj extends C38383h implements OnClickListener {

    /* renamed from: m */
    public static final C38361a f97613m = new C38361a(null);

    /* renamed from: d */
    public final AvatarImageView f97614d;

    /* renamed from: e */
    public final TextView f97615e;

    /* renamed from: f */
    public UserTextNotice f97616f;

    /* renamed from: g */
    public AnnouncementNotice f97617g;

    /* renamed from: n */
    private final View f97618n;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.aj$a */
    public static final class C38361a {
        private C38361a() {
        }

        public /* synthetic */ C38361a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo78083a() {
        return false;
    }

    public C38360aj(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97618n = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97614d = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f97615e = (TextView) findViewById3;
        C38432d.m85745a(this.f97618n);
        C38446k.m85764a(this.f97614d);
        OnClickListener onClickListener = this;
        this.f97618n.setOnClickListener(onClickListener);
        this.f97614d.setOnClickListener(onClickListener);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C38362ak.m85656a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
        } else if (!C32800a.m75679a(view)) {
            if (view != null) {
                C38244a aVar = MusNotificationDetailActivity.f97338a;
                Context context = view.getContext();
                C52711k.m112236a((Object) context, "it.context");
                aVar.mo78227a(context, 47, C36782d.m82775a().mo75940c(47));
            }
            C26890h.m65011a("enter_official_message", C23089d.m56640a().mo47829a("account_type", "official_info").mo47826a("client_order", getLayoutPosition()).mo47829a("scene_id", "1004").f61491a);
        }
    }
}
