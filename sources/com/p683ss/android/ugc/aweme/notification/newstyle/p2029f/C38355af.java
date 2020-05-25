package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.commercialize.log.C26052as;
import com.p683ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p683ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.story.live.C46649j;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.af */
public final class C38355af extends C38383h implements OnClickListener {

    /* renamed from: d */
    public final AvatarImageWithVerify f97600d;

    /* renamed from: e */
    public final TextView f97601e;

    /* renamed from: f */
    public final TextView f97602f;

    /* renamed from: g */
    public LiveNotice f97603g;

    /* renamed from: m */
    private final View f97604m;

    /* renamed from: n */
    private final Button f97605n;

    public C38355af(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97604m = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97600d = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f97601e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f97602f = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bs3);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.notification_button)");
        this.f97605n = (Button) findViewById5;
        C38432d.m85745a(this.f97604m);
        C38446k.m85764a(this.f97600d);
        C38446k.m85764a(this.f97605n);
        OnClickListener onClickListener = this;
        this.f97605n.setOnClickListener(onClickListener);
        this.f97604m.setOnClickListener(onClickListener);
        this.f97600d.setOnClickListener(onClickListener);
        this.f97600d.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
        this.f97605n.getLayoutParams().width = C38432d.m85744a(this.f97110c);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C38356ag.m85652a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        LiveNotice liveNotice = this.f97603g;
        if (liveNotice != null) {
            User user = liveNotice.getUser();
            if (user != null) {
                if (view != null) {
                    num = Integer.valueOf(view.getId());
                } else {
                    num = null;
                }
                if ((num != null && num.intValue() == R.id.bu1) || (num != null && num.intValue() == R.id.bs3)) {
                    m85236a(CustomActionPushReceiver.f104061f, getLayoutPosition());
                    LogHelper a = C26052as.m63104a();
                    Context context = this.f97110c;
                    C52711k.m112236a((Object) context, "context");
                    String requestId = user.getRequestId();
                    String uid = user.getUid();
                    C52711k.m112236a((Object) uid, "it.uid");
                    a.logLiveFromMessage(context, requestId, uid, user.roomId);
                    NoticeLiveWatcherUtil a2 = C46649j.m101248a();
                    Context context2 = this.f97110c;
                    C52711k.m112236a((Object) context2, "context");
                    a2.watchFromNotification(context2, user);
                } else {
                    if (num != null && num.intValue() == R.id.bt7) {
                        mo78109b(user.getUid(), user.getSecUid(), "message");
                        m85185a(user.getUid(), "notification_page", "click_head");
                    }
                }
            }
        }
    }
}
