package com.bytedance.android.livesdk.rank.p413f;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.rank.model.C8217d;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import p2663f.p2664a.p2665a.C53035c;

/* renamed from: com.bytedance.android.livesdk.rank.f.q */
public final class C8194q extends C53035c<C8217d, C8195a> {

    /* renamed from: com.bytedance.android.livesdk.rank.f.q$a */
    class C8195a extends C1352v {

        /* renamed from: a */
        TextView f22362a;

        public C8195a(View view) {
            super(view);
            this.f22362a = (TextView) view.findViewById(R.id.d0k);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8195a(layoutInflater.inflate(R.layout.aoi, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        String str;
        C8217d dVar = (C8217d) obj;
        TextView textView = ((C8195a) vVar).f22362a;
        if (dVar != null) {
            str = dVar.f22439a;
        } else {
            str = "";
        }
        C9432q.m18682a(textView, (CharSequence) str);
    }
}
