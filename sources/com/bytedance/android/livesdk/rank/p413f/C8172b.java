package com.bytedance.android.livesdk.rank.p413f;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.rank.model.C8215b;
import com.ss.android.ugc.trill.R;
import p2663f.p2664a.p2665a.C53035c;

/* renamed from: com.bytedance.android.livesdk.rank.f.b */
public final class C8172b extends C53035c<C8215b, C8173a> {

    /* renamed from: com.bytedance.android.livesdk.rank.f.b$a */
    class C8173a extends C1352v {

        /* renamed from: a */
        TextView f22307a;

        /* renamed from: b */
        TextView f22308b;

        /* renamed from: c */
        TextView f22309c;

        C8173a(View view) {
            super(view);
            this.f22307a = (TextView) view.findViewById(R.id.a18);
            this.f22308b = (TextView) view.findViewById(R.id.a13);
            this.f22309c = (TextView) view.findViewById(R.id.title);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8173a(layoutInflater.inflate(R.layout.al5, viewGroup, false));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        SpannableString spannableString;
        C8173a aVar = (C8173a) vVar;
        C8215b bVar = (C8215b) obj;
        if (bVar != null) {
            aVar.f22307a.setText(bVar.f22432b);
            aVar.f22308b.setText(bVar.f22433c);
            if (bVar == null || TextUtils.isEmpty(bVar.f22431a)) {
                spannableString = new SpannableString("");
            } else {
                spannableString = new SpannableString(bVar.f22431a);
            }
            switch (bVar.f22434d) {
                case 1:
                case 2:
                    aVar.f22309c.setText(spannableString);
                    aVar.f22309c.setVisibility(0);
                    return;
                default:
                    aVar.f22309c.setVisibility(8);
                    break;
            }
        }
    }
}
