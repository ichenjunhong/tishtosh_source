package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38443j;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.l */
public final class C38394l extends C38383h implements OnClickListener {

    /* renamed from: d */
    private final View f97704d;

    /* renamed from: e */
    private final AvatarImageWithVerify f97705e;

    /* renamed from: f */
    private final TextView f97706f;

    /* renamed from: g */
    private final TextView f97707g;

    /* renamed from: m */
    private final RemoteImageView f97708m;

    /* renamed from: n */
    private DuetNotice f97709n;

    /* renamed from: b */
    public final void mo78306b(int i) {
        UrlModel urlModel;
        Bundle bundle = new Bundle();
        bundle.putInt("from_where", i);
        bundle.putString("username", this.f97706f.getText().toString());
        DuetNotice duetNotice = this.f97709n;
        if (duetNotice != null) {
            User fromUser = duetNotice.getFromUser();
            if (fromUser != null) {
                urlModel = fromUser.getAvatarThumb();
            } else {
                urlModel = null;
            }
            bundle.putString(C42311c.f106865i, this.f97110c.getString(R.string.cjd));
            bundle.putSerializable("avatar_thumb", urlModel);
        }
        this.f97677j = bundle;
        this.f97676i = true;
    }

    public C38394l(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97704d = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97705e = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f97706f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f97707g = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bsd);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.notification_cover)");
        this.f97708m = (RemoteImageView) findViewById5;
        C38432d.m85745a(this.f97704d);
        C38446k.m85764a(this.f97705e);
        C38446k.m85764a(this.f97708m);
        OnClickListener onClickListener = this;
        this.f97708m.setOnClickListener(onClickListener);
        this.f97704d.setOnClickListener(onClickListener);
        this.f97705e.setOnClickListener(onClickListener);
        this.f97705e.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C38395m.m85702a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        DuetNotice duetNotice = this.f97709n;
        if (duetNotice != null) {
            Aweme aweme = duetNotice.getAweme();
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
                        m85236a("duet", getLayoutPosition());
                        if (this.f97676i) {
                            C38443j.m85761a(this.f97677j, getAdapterPosition());
                        }
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

    /* renamed from: a */
    public final void mo78311a(BaseNotice baseNotice, boolean z) {
        C52711k.m112240b(baseNotice, "notice");
        if (baseNotice.getDuetNotice() != null) {
            this.f97709n = baseNotice.getDuetNotice();
            DuetNotice duetNotice = this.f97709n;
            if (duetNotice != null) {
                Aweme aweme = duetNotice.getAweme();
                if (aweme != null) {
                    UserVerify userVerify = new UserVerify(aweme.getAuthor().getAvatarThumb(), aweme.getAuthor().getCustomVerify(), aweme.getAuthor().getEnterpriseVerifyReason(), Integer.valueOf(aweme.getAuthor().getVerificationType()), aweme.getAuthor().getWeiboVerify());
                    this.f97705e.setUserData(userVerify);
                    this.f97705e.mo48964b();
                    TextView textView = this.f97706f;
                    User author = aweme.getAuthor();
                    C52711k.m112236a((Object) author, "it.author");
                    mo78303a(textView, author, (BaseNotice) null, (String) null, (String) null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Context context = this.f97110c;
                    C52711k.m112236a((Object) context, "context");
                    spannableStringBuilder.append(context.getResources().getString(R.string.cjd));
                    mo78107a(spannableStringBuilder, baseNotice);
                    this.f97707g.setText(spannableStringBuilder);
                    RemoteImageView remoteImageView = this.f97708m;
                    Video video = aweme.getVideo();
                    C52711k.m112236a((Object) video, "it.video");
                    C23515d.m57669a(remoteImageView, video.getCover());
                }
            }
        }
    }
}
