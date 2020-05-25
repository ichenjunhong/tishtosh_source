package com.p683ss.android.ugc.aweme.discover.p1635a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27722e.C27725b;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.a.a */
final class C27712a extends C27725b {

    /* renamed from: a */
    private DmtStatusView f72741a;

    /* renamed from: com.ss.android.ugc.aweme.discover.a.a$a */
    static final class C27713a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27722e f72742a;

        C27713a(C27722e eVar) {
            this.f72742a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27722e eVar = this.f72742a;
            eVar.mo56154c(1);
            eVar.mo56153c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.a$b */
    public static final class C27714b implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ DmtStatusView f72743a;

        public final void onViewDetachedFromWindow(View view) {
        }

        C27714b(DmtStatusView dmtStatusView) {
            this.f72743a = dmtStatusView;
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.f72743a.mo19215i() && view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo56138a(int i) {
        switch (i) {
            case 0:
                DmtStatusView dmtStatusView = this.f72741a;
                if (dmtStatusView != null) {
                    dmtStatusView.setStatus(-1);
                    break;
                } else {
                    return;
                }
            case 1:
                DmtStatusView dmtStatusView2 = this.f72741a;
                if (dmtStatusView2 != null) {
                    dmtStatusView2.setStatus(0);
                    break;
                } else {
                    return;
                }
            case 2:
                DmtStatusView dmtStatusView3 = this.f72741a;
                if (dmtStatusView3 != null) {
                    dmtStatusView3.setStatus(1);
                    break;
                } else {
                    return;
                }
            case 3:
                DmtStatusView dmtStatusView4 = this.f72741a;
                if (dmtStatusView4 != null) {
                    dmtStatusView4.setStatus(2);
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final View mo56137a(ViewGroup viewGroup, C27722e eVar) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(eVar, "wrapper");
        DmtStatusView dmtStatusView = new DmtStatusView(viewGroup.getContext());
        dmtStatusView.setLayoutParams(new LayoutParams(-1, (int) C9432q.m18687b(viewGroup.getContext(), 60.0f)));
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.auk, null);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setGravity(17);
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.auk, null);
            if (inflate2 != null) {
                TextView textView2 = (TextView) inflate2;
                textView2.setText(R.string.c0c);
                textView2.setOnClickListener(new C27713a(eVar));
                textView2.setGravity(17);
                DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(viewGroup.getContext());
                dmtLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                dmtLoadingLayout.addOnAttachStateChangeListener(new C27714b(dmtStatusView));
                dmtStatusView.setBuilder(new C10719a(viewGroup.getContext()).mo19228a((View) dmtLoadingLayout).mo19231b((View) textView).mo19234c((View) textView2));
                this.f72741a = dmtStatusView;
                return dmtStatusView;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
    }
}
