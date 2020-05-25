package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.model.C5770y.C5771a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ee */
public final class C6133ee extends C1322a<C6134a> {

    /* renamed from: a */
    private List<C5771a> f16440a;

    /* renamed from: b */
    private LayoutInflater f16441b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ee$a */
    static class C6134a extends C1352v {

        /* renamed from: a */
        public TextView f16442a;

        /* renamed from: b */
        public TextView f16443b;

        /* renamed from: c */
        public HSImageView f16444c;

        C6134a(View view) {
            super(view);
            this.f16442a = (TextView) view.findViewById(R.id.bpp);
            this.f16443b = (TextView) view.findViewById(R.id.a0y);
            this.f16444c = (HSImageView) view.findViewById(R.id.ar5);
        }
    }

    public final int getItemCount() {
        if (this.f16440a != null) {
            return this.f16440a.size();
        }
        return 0;
    }

    C6133ee(Context context, List<C5771a> list) {
        this.f16441b = LayoutInflater.from(context);
        this.f16440a = list;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6134a(this.f16441b.inflate(R.layout.aqq, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C6134a aVar = (C6134a) vVar;
        C5771a aVar2 = (C5771a) this.f16440a.get(i);
        if (aVar2 != null && aVar2.f15208a != null) {
            aVar.f16442a.setText(aVar2.f15208a.getNickName());
            if (!TextUtils.isEmpty(aVar2.f15210c)) {
                aVar.f16443b.setVisibility(0);
                aVar.f16443b.setText(aVar2.f15210c);
            } else {
                aVar.f16443b.setVisibility(8);
            }
            if (aVar2.f15209b != null) {
                aVar.f16444c.setVisibility(0);
                C5213c.m11820a(aVar.f16444c, aVar2.f15209b);
                return;
            }
            aVar.f16444c.setVisibility(8);
        }
    }
}
