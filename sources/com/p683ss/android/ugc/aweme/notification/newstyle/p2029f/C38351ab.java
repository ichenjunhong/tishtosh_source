package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.utils.C38454c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.ab */
public final class C38351ab extends C38383h implements OnClickListener {

    /* renamed from: d */
    public final AvatarImageWithVerify f97586d;

    /* renamed from: e */
    public final AvatarImageView f97587e;

    /* renamed from: f */
    public final AvatarImageView f97588f;

    /* renamed from: g */
    public final TextView f97589g;

    /* renamed from: m */
    public final TextView f97590m;

    /* renamed from: n */
    public CheckProfileNotice f97591n;

    /* renamed from: o */
    private final View f97592o;

    /* renamed from: p */
    private final View f97593p;

    /* renamed from: a */
    public final boolean mo78083a() {
        return false;
    }

    public C38351ab(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97592o = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97593p = findViewById2;
        View findViewById3 = view.findViewById(R.id.bt8);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.…notification_head_single)");
        this.f97586d = (AvatarImageWithVerify) findViewById3;
        View findViewById4 = view.findViewById(R.id.bt9);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.….notification_head_user1)");
        this.f97587e = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bt_);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.….notification_head_user2)");
        this.f97588f = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.notification_name)");
        this.f97589g = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.id.notification_content)");
        this.f97590m = (TextView) findViewById7;
        C38432d.m85745a(this.f97592o);
        C38446k.m85764a(this.f97593p);
        OnClickListener onClickListener = this;
        this.f97592o.setOnClickListener(onClickListener);
        this.f97593p.setOnClickListener(onClickListener);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C38352ac.m85650a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        CheckProfileNotice checkProfileNotice = this.f97591n;
        if (checkProfileNotice != null) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.bt7) {
                List users = checkProfileNotice.getUsers();
                if (users != null) {
                    if (users.size() == 1) {
                        mo78109b(((User) C52575l.m112137e(users)).getUid(), ((User) C52575l.m112137e(users)).getSecUid(), "message");
                        m85185a(((User) C52575l.m112137e(users)).getUid(), "notification_page", "click_head");
                    } else {
                        C38454c.m85775a(view.getContext());
                    }
                }
            } else if (num != null && num.intValue() == R.id.bu1) {
                m85236a("check_profile", getLayoutPosition());
                C38454c.m85775a(view.getContext());
            }
        }
    }
}
