package com.p683ss.android.ugc.aweme.mvp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.scene.C12924i;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mvp.d */
public final class C37728d extends C12924i {

    /* renamed from: i */
    public final C52670a<C52860x> f96141i;

    /* renamed from: j */
    public final C52670a<C52860x> f96142j;

    /* renamed from: com.ss.android.ugc.aweme.mvp.d$a */
    static final class C37729a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37728d f96143a;

        C37729a(C37728d dVar) {
            this.f96143a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96143a.f96141i.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvp.d$b */
    static final class C37730b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37728d f96144a;

        C37730b(C37728d dVar) {
            this.f96144a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96144a.f96142j.invoke();
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        ((Button) mo24467j_(R.id.pq)).setOnClickListener(new C37729a(this));
        ((Button) mo24467j_(R.id.ex7)).setOnClickListener(new C37730b(this));
    }

    public C37728d(C52670a<C52860x> aVar, C52670a<C52860x> aVar2) {
        C52711k.m112240b(aVar, "onClick");
        C52711k.m112240b(aVar2, "onStickerClicked");
        this.f96141i = aVar;
        this.f96142j = aVar2;
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.brh, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…sample, container, false)");
        return inflate;
    }
}
