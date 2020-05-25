package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.log.C26052as;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38101n;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p683ss.android.ugc.aweme.notification.p2031ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.notification.util.C38426a;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.story.live.C46648i;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.a.v */
public final class C38142v extends C38135o implements OnClickListener {

    /* renamed from: d */
    private ConstraintLayout f97134d;

    /* renamed from: e */
    private AvatarImageView f97135e;

    /* renamed from: f */
    private LiveCircleView f97136f;

    /* renamed from: g */
    private TextView f97137g;

    /* renamed from: h */
    private Button f97138h;

    /* renamed from: i */
    private C38101n f97139i;

    /* renamed from: j */
    private Context f97140j;

    /* renamed from: k */
    private C38426a f97141k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo78083a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo78097c() {
        return R.id.bu1;
    }

    /* renamed from: d */
    public final void mo78114d() {
        if (this.f97141k != null) {
            C38426a aVar = this.f97141k;
            if (aVar.f97813f != null) {
                aVar.f97813f.cancel();
            }
        }
    }

    /* renamed from: e */
    public final void mo78115e() {
        if (this.f97141k != null) {
            this.f97141k.mo78328a();
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C38143w.m85255a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97140j, (int) R.string.cg1).mo19066a();
            return;
        }
        int id = view.getId();
        if (id == R.id.bu1 || id == R.id.bs3 || id == R.id.avs || id == R.id.avw) {
            m85236a(CustomActionPushReceiver.f104061f, getLayoutPosition());
            Bundle bundle = new Bundle();
            bundle.putString("style", "head");
            bundle.putString("position", "live_merge");
            bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", true);
            bundle.putString("requestPage", "message");
            C46641d.m101210a("message");
            C26052as.m63104a().logEnterLiveMerge("message", "new_type");
            C46648i.m101247a().enterLiveConverge(this.f97140j, bundle);
        }
    }

    public C38142v(View view) {
        super(view);
        this.f97140j = view.getContext();
        this.f97134d = (ConstraintLayout) view.findViewById(R.id.bu1);
        this.f97135e = (AvatarImageView) view.findViewById(R.id.avs);
        this.f97136f = (LiveCircleView) view.findViewById(R.id.avw);
        this.f97137g = (TextView) view.findViewById(R.id.bsc);
        this.f97138h = (Button) view.findViewById(R.id.bs3);
        this.f97138h.getLayoutParams().width = C38432d.m85744a(this.f97140j);
        C38432d.m85745a((View) this.f97134d);
        C38432d.m85745a((View) this.f97135e);
        C38432d.m85745a((View) this.f97138h);
        this.f97138h.setOnClickListener(this);
        this.f97134d.setOnClickListener(this);
        this.f97135e.setOnClickListener(this);
        this.f97141k = new C38426a();
        C38426a aVar = this.f97141k;
        ConstraintLayout constraintLayout = this.f97134d;
        aVar.f97809b = (AvatarImageView) constraintLayout.findViewById(R.id.avs);
        aVar.f97808a = (LiveCircleView) constraintLayout.findViewById(R.id.avw);
    }

    /* renamed from: a */
    public final void mo78113a(MusNotice musNotice, boolean z) {
        if (musNotice != null && musNotice.getRecommendAvatars() != null) {
            this.f97139i = musNotice.getRecommendAvatars();
            C38426a aVar = this.f97141k;
            List<UrlModel> list = this.f97139i.f96933a;
            if (!(list == null || list.size() == 0)) {
                aVar.f97815h.addAll(list);
                C23515d.m57669a((RemoteImageView) aVar.f97809b, (UrlModel) aVar.f97815h.get(0));
            }
            this.f97141k.mo78328a();
            String charSequence = this.f97137g.getText().toString();
            if (!TextUtils.isEmpty(charSequence)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                this.f97137g.setText(spannableStringBuilder);
            }
        }
    }
}
