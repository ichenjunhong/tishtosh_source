package com.p683ss.android.ugc.aweme.favorites.adapter;

import android.view.View;
import android.widget.TextView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.PoiCollectListHeadViewHolder */
public final class PoiCollectListHeadViewHolder extends JediSimpleViewHolder<C29677g> {

    /* renamed from: g */
    public static final C29666a f77553g = new C29666a(null);

    /* renamed from: f */
    public final View f77554f;

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.PoiCollectListHeadViewHolder$a */
    public static final class C29666a {
        private C29666a() {
        }

        public /* synthetic */ C29666a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        C29677g gVar = (C29677g) obj;
        C52711k.m112240b(gVar, "item");
        if (gVar.f77571b instanceof Integer) {
            TextView textView = (TextView) this.f77554f.findViewById(R.id.bc1);
            Object obj2 = gVar.f77571b;
            if (C52711k.m112239a(obj2, (Object) Integer.valueOf(0))) {
                C52711k.m112236a((Object) textView, "textView");
                textView.setText(this.f77554f.getContext().getString(R.string.cfn));
            } else if (C52711k.m112239a(obj2, (Object) Integer.valueOf(1))) {
                C52711k.m112236a((Object) textView, "textView");
                textView.setText(this.f77554f.getContext().getString(R.string.d_a));
            }
        }
    }
}
