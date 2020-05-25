package com.bytedance.android.livesdk.chatroom.p325ui;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.model.C5710ac;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dr */
public final class C6116dr extends C1322a<C6117a> {

    /* renamed from: a */
    List<C5710ac> f16387a;

    /* renamed from: b */
    private LayoutInflater f16388b;

    /* renamed from: c */
    private int f16389c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dr$a */
    static class C6117a extends C1352v {

        /* renamed from: a */
        HSImageView f16390a;

        /* renamed from: b */
        TextView f16391b;

        C6117a(View view) {
            super(view);
            this.f16390a = (HSImageView) view.findViewById(R.id.ar5);
            this.f16391b = (TextView) view.findViewById(R.id.d8u);
        }
    }

    public final int getItemCount() {
        if (this.f16387a == null) {
            return 0;
        }
        return this.f16387a.size();
    }

    C6116dr(LayoutInflater layoutInflater, int i) {
        this.f16388b = layoutInflater;
        this.f16389c = i;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6117a(this.f16388b.inflate(this.f16389c, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C6117a aVar = (C6117a) vVar;
        C5710ac acVar = (C5710ac) this.f16387a.get(i);
        if (acVar.f15009a != null) {
            C5213c.m11820a(aVar.f16390a, acVar.f15009a);
        }
        aVar.f16391b.setText(acVar.f15010b);
    }
}
