package com.bytedance.android.livesdk.rank.p413f;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import p2663f.p2664a.p2665a.C53035c;

/* renamed from: com.bytedance.android.livesdk.rank.f.c */
public final class C8174c extends C53035c<String, C8175a> {

    /* renamed from: com.bytedance.android.livesdk.rank.f.c$a */
    class C8175a extends C1352v {

        /* renamed from: a */
        TextView f22311a;

        public C8175a(View view) {
            super(view);
            this.f22311a = (TextView) view.findViewById(R.id.title);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8175a(layoutInflater.inflate(R.layout.aol, viewGroup, false));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        ((C8175a) vVar).f22311a.setText((String) obj);
    }
}
