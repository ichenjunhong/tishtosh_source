package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.v */
public final class C38407v extends C38383h implements OnClickListener {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f97754d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38407v.class), "mRoot", "getMRoot()Landroid/widget/RelativeLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38407v.class), "mCount", "getMCount()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: e */
    public final C52668f f97755e;

    /* renamed from: f */
    public int f97756f;

    /* renamed from: g */
    private final C52668f f97757g;

    /* renamed from: m */
    private final Fragment f97758m;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.v$a */
    static final class C38408a extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f97759a;

        C38408a(View view) {
            this.f97759a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f97759a.findViewById(R.id.d8u);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.v$b */
    static final class C38409b extends C52712l implements C52670a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ View f97760a;

        C38409b(View view) {
            this.f97760a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RelativeLayout) this.f97760a.findViewById(R.id.bu1);
        }
    }

    /* renamed from: d */
    private final RelativeLayout m85718d() {
        return (RelativeLayout) this.f97757g.getValue();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C38410w.m85719a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        Fragment fragment = this.f97758m;
        int i = this.f97756f;
        C52711k.m112240b(fragment, "fragment");
        Intent intent = new Intent(fragment.getContext(), MusFollowRequestDetailActivity.class);
        intent.putExtra("unread_count", i);
        fragment.startActivityForResult(intent, PreloadTask.BYTE_UNIT_NUMBER);
    }

    public C38407v(View view, Fragment fragment) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(fragment, "fragment");
        super(view);
        this.f97758m = fragment;
        this.f97757g = C52732g.m112285a(new C38409b(view));
        this.f97755e = C52732g.m112285a(new C38408a(view));
        C38432d.m85745a((View) m85718d());
        m85718d().setOnClickListener(this);
    }
}
