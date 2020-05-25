package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.PostNotice;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.ad */
public final class C38353ad extends C38383h implements OnClickListener {

    /* renamed from: d */
    public final AvatarImageWithVerify f97594d;

    /* renamed from: e */
    public final TextView f97595e;

    /* renamed from: f */
    public final TextView f97596f;

    /* renamed from: g */
    public final RemoteImageView f97597g;

    /* renamed from: m */
    public PostNotice f97598m;

    /* renamed from: n */
    private final View f97599n;

    public C38353ad(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97599n = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97594d = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f97595e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f97596f = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bsd);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.notification_cover)");
        this.f97597g = (RemoteImageView) findViewById5;
        C38432d.m85745a(this.f97599n);
        C38446k.m85764a(this.f97594d);
        C38446k.m85764a(this.f97597g);
        OnClickListener onClickListener = this;
        this.f97597g.setOnClickListener(onClickListener);
        this.f97599n.setOnClickListener(onClickListener);
        this.f97594d.setOnClickListener(onClickListener);
        this.f97594d.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
        this.f97594d.mo48964b();
        ((C13833a) this.f97597g.getHierarchy()).mo25902b((int) R.color.c8);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C38354ae.m85651a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        PostNotice postNotice = this.f97598m;
        if (postNotice != null) {
            Aweme aweme = postNotice.getAweme();
            if (aweme != null) {
                if (view != null) {
                    num = Integer.valueOf(view.getId());
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == R.id.bt7) {
                    User author = aweme.getAuthor();
                    C52711k.m112236a((Object) author, "it.author");
                    String uid = author.getUid();
                    User author2 = aweme.getAuthor();
                    C52711k.m112236a((Object) author2, "it.author");
                    mo78109b(uid, author2.getSecUid(), "message");
                    User author3 = aweme.getAuthor();
                    C52711k.m112236a((Object) author3, "it.author");
                    m85185a(author3.getUid(), "notification_page", "click_head");
                } else {
                    if ((num != null && num.intValue() == R.id.bu1) || (num != null && num.intValue() == R.id.bsd)) {
                        C41302w a = C41302w.m91042a();
                        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                        sb.append(aweme.getAid());
                        a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("refer", "message").mo83871a());
                        String aid = aweme.getAid();
                        if (!TextUtils.isEmpty(aid)) {
                            MobClick value = new MobClick().setEventName("video_play").setLabelName("message").setValue(aid);
                            User author4 = aweme.getAuthor();
                            C52711k.m112236a((Object) author4, "it.author");
                            C26890h.onEvent(value.setJsonObject(new C26898j().mo54849a("request_id", author4.getRequestId()).mo54850a()));
                        }
                    }
                }
            }
        }
    }
}
