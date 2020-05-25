package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38105r;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38297c;
import com.p683ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity;
import com.p683ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity.C38244a;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.ah */
public final class C38357ah extends C38383h implements OnClickListener {

    /* renamed from: m */
    public static final C38358a f97606m = new C38358a(null);

    /* renamed from: d */
    public final AvatarImageView f97607d;

    /* renamed from: e */
    public final TextView f97608e;

    /* renamed from: f */
    public final AutoRTLImageView f97609f;

    /* renamed from: g */
    public C38105r f97610g;

    /* renamed from: n */
    private final View f97611n;

    /* renamed from: o */
    private final Fragment f97612o;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.ah$a */
    public static final class C38358a {
        private C38358a() {
        }

        public /* synthetic */ C38358a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo78083a() {
        return false;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C38359ai.m85654a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
        } else if (!C32800a.m75679a(view) && view != null) {
            if ((this.f97612o instanceof C38297c) && C36782d.m82775a().mo75940c(61) > 0) {
                ((C38297c) this.f97612o).f97500e = true;
            }
            C38244a aVar = MusNotificationDetailActivity.f97338a;
            Context context = view.getContext();
            C52711k.m112236a((Object) context, "it.context");
            aVar.mo78227a(context, 62, C36782d.m82775a().mo75940c(62));
            C38046d.m85103c(61);
        }
    }

    public C38357ah(View view, Fragment fragment) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(fragment, "fragment");
        super(view);
        this.f97612o = fragment;
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97611n = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97607d = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f97608e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.efc);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.….iv_notification_red_dot)");
        this.f97609f = (AutoRTLImageView) findViewById4;
        C38432d.m85745a(this.f97611n);
        C38446k.m85764a(this.f97607d);
        OnClickListener onClickListener = this;
        this.f97611n.setOnClickListener(onClickListener);
        this.f97607d.setOnClickListener(onClickListener);
    }
}
