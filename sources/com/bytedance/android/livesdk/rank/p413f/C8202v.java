package com.bytedance.android.livesdk.rank.p413f;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.ss.android.ugc.trill.R;
import p2663f.p2664a.p2665a.C53035c;

/* renamed from: com.bytedance.android.livesdk.rank.f.v */
public final class C8202v extends C53035c<String, C8203a> {

    /* renamed from: com.bytedance.android.livesdk.rank.f.v$a */
    static class C8203a extends C1352v {
        C8203a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8203a(layoutInflater.inflate(R.layout.amt, viewGroup, false));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        C8203a aVar = (C8203a) vVar;
        String str = (String) obj;
        Context context = aVar.itemView.getContext();
        if (!C9431p.m18664a(str)) {
            int lastIndexOf = str.lastIndexOf(" ");
            if (context != null && context.getResources() != null && lastIndexOf >= 0) {
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.als)), lastIndexOf, str.length(), 33);
                ((TextView) aVar.itemView).setText(spannableString);
            }
        }
    }
}
