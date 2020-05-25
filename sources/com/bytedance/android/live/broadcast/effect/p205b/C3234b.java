package com.bytedance.android.live.broadcast.effect.p205b;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.effect.C3258j;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.broadcast.effect.p204a.C3202c;
import com.bytedance.android.live.broadcast.effect.p208d.C3249b;
import com.bytedance.android.live.core.p229f.C3846a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.effect.b.b */
public final class C3234b extends C3846a {

    /* renamed from: b */
    public static final C3235a f9346b = new C3235a(null);

    /* renamed from: a */
    public C3199a f9347a;

    /* renamed from: c */
    private HashMap f9348c;

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.b$a */
    public static final class C3235a {
        private C3235a() {
        }

        public /* synthetic */ C3235a(C52707g gVar) {
            this();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f9348c != null) {
            this.f9348c.clear();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C3199a aVar = this.f9347a;
        C3266p a = C3266p.m8943a();
        C52711k.m112236a((Object) a, "LiveFilterManager.inst()");
        getChildFragmentManager().mo2225a().mo2175a((int) R.id.e8q, (Fragment) C3258j.m8927a(aVar, a.f9434b, new C3249b(R.layout.bwy, new C3202c()))).mo2200e();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bwi, viewGroup, false);
    }
}
