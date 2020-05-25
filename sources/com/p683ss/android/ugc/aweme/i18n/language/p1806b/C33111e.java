package com.p683ss.android.ugc.aweme.i18n.language.p1806b;

import android.app.Dialog;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.b.e */
public final class C33111e extends C1322a<C33112a> {

    /* renamed from: a */
    Context f85943a;

    /* renamed from: b */
    Dialog f85944b;

    /* renamed from: c */
    private List<C35834e> f85945c;

    /* renamed from: com.ss.android.ugc.aweme.i18n.language.b.e$a */
    static class C33112a extends C1352v {

        /* renamed from: a */
        TextView f85946a;

        C33112a(View view) {
            super(view);
            this.f85946a = (TextView) view.findViewById(R.id.b6d);
            ButterKnife.bind((Object) this, view);
        }
    }

    public final int getItemCount() {
        return this.f85945c.size();
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C33112a aVar = (C33112a) vVar;
        C35834e eVar = (C35834e) this.f85945c.get(i);
        aVar.f85946a.setText(eVar.mo70126f());
        aVar.itemView.setOnClickListener(new C33113f(this, eVar));
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C33112a(LayoutInflater.from(this.f85943a).inflate(R.layout.b3w, viewGroup, false));
    }

    public C33111e(Context context, List<C35834e> list, Dialog dialog) {
        this.f85943a = context;
        this.f85945c = list;
        this.f85944b = dialog;
    }
}
