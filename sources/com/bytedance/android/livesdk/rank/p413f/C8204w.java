package com.bytedance.android.livesdk.rank.p413f;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.rank.model.C8220g;
import com.ss.android.ugc.trill.R;
import p2663f.p2664a.p2665a.C53035c;

/* renamed from: com.bytedance.android.livesdk.rank.f.w */
public final class C8204w extends C53035c<C8220g, C8205a> {

    /* renamed from: com.bytedance.android.livesdk.rank.f.w$a */
    static class C8205a extends C1352v {
        C8205a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8205a(layoutInflater.inflate(R.layout.amr, viewGroup, false));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        C8205a aVar = (C8205a) vVar;
        C8220g gVar = (C8220g) obj;
        String str = gVar.f22452a;
        int i = gVar.f22453b;
        ((TextView) aVar.itemView).setText(str);
        aVar.itemView.setBackgroundColor(i);
    }
}
