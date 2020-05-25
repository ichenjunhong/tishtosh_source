package com.p683ss.android.ugc.aweme.poi.nearby.p2065c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.nearby.c.a */
public final class C39150a extends C23526a {

    /* renamed from: a */
    public static final C39151a f99883a = new C39151a(null);

    /* renamed from: b */
    private HashMap f99884b;

    /* renamed from: com.ss.android.ugc.aweme.poi.nearby.c.a$a */
    public static final class C39151a {
        private C39151a() {
        }

        public /* synthetic */ C39151a(C52707g gVar) {
            this();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f99884b != null) {
            this.f99884b.clear();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.bks, viewGroup, false);
    }
}
