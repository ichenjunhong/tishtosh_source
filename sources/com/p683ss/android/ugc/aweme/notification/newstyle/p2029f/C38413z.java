package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.common.p927k.C13731f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity;
import com.p683ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity.C38244a;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.z */
public final class C38413z extends C38383h implements OnClickListener {

    /* renamed from: e */
    public static final C38414a f97766e = new C38414a(null);

    /* renamed from: d */
    public final boolean f97767d;

    /* renamed from: f */
    private final View f97768f;

    /* renamed from: g */
    private final AvatarImageView f97769g;

    /* renamed from: m */
    private final TextView f97770m;

    /* renamed from: n */
    private AnnouncementNotice f97771n;

    /* renamed from: o */
    private UserTextNotice f97772o;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.z$a */
    public static final class C38414a {
        private C38414a() {
        }

        public /* synthetic */ C38414a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo78083a() {
        return false;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C38350aa.m85648a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        if (view != null) {
            C38244a aVar = MusNotificationDetailActivity.f97338a;
            Context context = view.getContext();
            C52711k.m112236a((Object) context, "it.context");
            aVar.mo78227a(context, 46, C36782d.m82775a().mo75940c(46));
        }
        C26890h.m65011a("enter_official_message", C23089d.m56640a().mo47829a("account_type", "douyin_assistant").mo47826a("client_order", getLayoutPosition()).mo47829a("scene_id", "1004").f61491a);
    }

    public C38413z(View view, boolean z) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f97767d = z;
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97768f = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97769g = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f97770m = (TextView) findViewById3;
        C38432d.m85745a(this.f97768f);
        C38446k.m85764a(this.f97769g);
        OnClickListener onClickListener = this;
        this.f97768f.setOnClickListener(onClickListener);
        this.f97769g.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo78317a(BaseNotice baseNotice, boolean z) {
        C52711k.m112240b(baseNotice, "notice");
        if (baseNotice.getAnnouncement() != null || baseNotice.getTextNotice() != null) {
            if (baseNotice.getAnnouncement() != null && this.f97767d) {
                AnnouncementNotice announcement = baseNotice.getAnnouncement();
                C52711k.m112236a((Object) announcement, "notice.announcement");
                if (announcement.getChallenge() == null) {
                    return;
                }
            }
            this.f97771n = baseNotice.getAnnouncement();
            AnnouncementNotice announcementNotice = this.f97771n;
            if (announcementNotice != null) {
                this.f97769g.setImageURI(C13731f.m27775a((int) R.drawable.clm));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context context = this.f97110c;
                C52711k.m112236a((Object) context, "context");
                spannableStringBuilder.append(context.getResources().getString(R.string.ck0)).append(": ");
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append(8296);
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder.append(announcementNotice.getTitle());
                } else {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append(8297);
                C38389i.m85696a(this.f97770m, spannableStringBuilder, baseNotice, 5, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 132.0f)));
            }
            this.f97772o = baseNotice.getTextNotice();
            UserTextNotice userTextNotice = this.f97772o;
            if (userTextNotice != null) {
                this.f97769g.setImageURI(C13731f.m27775a((int) R.drawable.clm));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                Context context2 = this.f97110c;
                C52711k.m112236a((Object) context2, "context");
                spannableStringBuilder2.append(context2.getResources().getString(R.string.ck0)).append(": ");
                spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append(8296);
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder2.append(userTextNotice.getTitle());
                } else {
                    spannableStringBuilder2.delete(spannableStringBuilder2.length() - 2, spannableStringBuilder2.length());
                }
                spannableStringBuilder2.append(8297);
                C38389i.m85696a(this.f97770m, spannableStringBuilder2, baseNotice, 5, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 132.0f)));
            }
        }
    }
}
