package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.facebook.common.p927k.C13731f;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38087b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.a.r */
public final class C38138r extends C38135o implements OnClickListener {

    /* renamed from: d */
    private View f97122d;

    /* renamed from: e */
    private AvatarImageView f97123e;

    /* renamed from: f */
    private TextView f97124f;

    /* renamed from: g */
    private C38087b f97125g;

    /* renamed from: h */
    private Context f97126h;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo78097c() {
        return R.id.bu1;
    }

    public C38138r(View view) {
        super(view);
        this.f97126h = view.getContext();
        this.f97122d = view.findViewById(R.id.bu1);
        this.f97123e = (AvatarImageView) view.findViewById(R.id.bt7);
        this.f97124f = (TextView) view.findViewById(R.id.bsc);
        C38432d.m85745a(this.f97122d);
        C38446k.m85764a(this.f97123e);
        this.f97122d.setOnClickListener(this);
        this.f97123e.setOnClickListener(this);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C38139s.m85246a(this.f97126h)) {
            C10691a.m21542b(this.f97126h, (int) R.string.cg1).mo19066a();
            return;
        }
        MusNotificationDetailActivity.f97338a.mo78227a(this.f97126h, 21, C38046d.m85098a(21));
    }

    /* renamed from: a */
    public final void mo78111a(MusNotice musNotice, boolean z) {
        if (musNotice != null && musNotice.getAdHelperNotice() != null) {
            this.f97125g = musNotice.getAdHelperNotice();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f97126h.getString(R.string.bnb));
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            if (!TextUtils.isEmpty(this.f97125g.f96890b)) {
                spannableStringBuilder.append(": ");
                spannableStringBuilder.append(this.f97125g.f96890b);
            }
            this.f97123e.setImageURI(C13731f.m27775a((int) R.drawable.clp));
            mo78107a(spannableStringBuilder, (BaseNotice) musNotice);
            this.f97124f.setText(spannableStringBuilder);
        }
    }
}
