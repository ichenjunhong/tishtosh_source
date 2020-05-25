package com.bytedance.android.live.broadcast.effect.p205b;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.broadcast.effect.p205b.p206a.C3216c.C3217a;
import com.bytedance.android.live.broadcast.effect.p208d.C3248a;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.effect.b.a */
public final class C3204a extends C3846a {

    /* renamed from: a */
    public static final C3205a f9284a = new C3205a(null);

    /* renamed from: b */
    private HashMap f9285b;

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a$a */
    public static final class C3205a {
        private C3205a() {
        }

        public /* synthetic */ C3205a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    private View m8850a(int i) {
        if (this.f9285b == null) {
            this.f9285b = new HashMap();
        }
        View view = (View) this.f9285b.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f9285b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f9285b != null) {
            this.f9285b.clear();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        getChildFragmentManager().mo2225a().mo2175a((int) R.id.dz1, (Fragment) C3217a.m8861a(new C3248a((LinearLayout) m8850a(R.id.es3), (AdjustPercentBar) m8850a(R.id.cpn), R.layout.bwx, R.layout.bww))).mo2200e();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bwh, viewGroup, false);
    }
}
