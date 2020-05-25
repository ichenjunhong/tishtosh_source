package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.x */
public final class C38411x extends C38383h implements OnClickListener {

    /* renamed from: d */
    public final AvatarImageWithVerify f97761d;

    /* renamed from: e */
    public final TextView f97762e;

    /* renamed from: f */
    public final TextView f97763f;

    /* renamed from: g */
    public FollowApproveNotice f97764g;

    /* renamed from: m */
    private final View f97765m;

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C38412y.m85720a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        FollowApproveNotice followApproveNotice = this.f97764g;
        if (followApproveNotice != null) {
            User user = followApproveNotice.getUser();
            if (user != null) {
                mo78109b(user.getUid(), user.getSecUid(), "message");
                m85185a(user.getUid(), "notification_page", "click_head");
            }
        }
    }

    public C38411x(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97765m = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97761d = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f97762e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f97763f = (TextView) findViewById4;
        C38432d.m85745a(this.f97765m);
        C38446k.m85764a(this.f97761d);
        OnClickListener onClickListener = this;
        this.f97765m.setOnClickListener(onClickListener);
        this.f97761d.setOnClickListener(onClickListener);
    }
}
