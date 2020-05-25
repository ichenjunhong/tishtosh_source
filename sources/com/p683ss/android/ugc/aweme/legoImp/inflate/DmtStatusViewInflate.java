package com.p683ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30790be;
import com.p683ss.android.ugc.aweme.lego.LegoInflate;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate */
public class DmtStatusViewInflate implements LegoInflate {
    private DmtStatusView mDmtStatusView;
    private C35908a mInnerClickListener = new C35908a();

    /* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate$a */
    class C35908a implements OnClickListener {

        /* renamed from: a */
        public OnClickListener f92131a;

        private C35908a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92131a.onClick(view);
        }
    }

    public Class<? extends Activity> activity() {
        return null;
    }

    public int theme() {
        return R.style.hg;
    }

    static final /* synthetic */ View lambda$createDmtStatusView$0$DmtStatusViewInflate(View view) {
        return new DmtLoadingLayout(view.getContext());
    }

    static final /* synthetic */ View lambda$createDmtStatusView$1$DmtStatusViewInflate(View view) {
        C10722c cVar = new C10723a(view.getContext()).mo19282c(R.string.ay4).f28711a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(view.getContext());
        dmtDefaultView.setStatus(cVar);
        return dmtDefaultView;
    }

    public void inflate(Context context, Activity activity) {
        this.mDmtStatusView = createDmtStatusView(context, this.mInnerClickListener);
    }

    public DmtStatusView getDmtStatusView(Context context, OnClickListener onClickListener) {
        if (this.mDmtStatusView == null) {
            return createDmtStatusView(context, onClickListener);
        }
        this.mInnerClickListener.f92131a = onClickListener;
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        this.mDmtStatusView = null;
        this.mInnerClickListener = null;
        return dmtStatusView;
    }

    private DmtStatusView createDmtStatusView(Context context, OnClickListener onClickListener) {
        C30790be beVar = new C30790be(context);
        beVar.mo63502a(C35910a.f92133a, C35911b.f92134a, new C35912c(context, onClickListener));
        beVar.mo19029a(1);
        beVar.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.a04));
        beVar.mo63503c(0);
        return beVar;
    }

    static final /* synthetic */ View lambda$createDmtStatusView$2$DmtStatusViewInflate(Context context, OnClickListener onClickListener, View view) {
        C10722c cVar = new C10723a(context).mo19277a((int) R.drawable.dgl).mo19280b((int) R.string.f5o).mo19282c(R.string.f5k).mo19278a(C10720a.BORDER, R.string.f5u, onClickListener).f28711a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(view.getContext());
        dmtDefaultView.setStatus(cVar);
        return dmtDefaultView;
    }
}
