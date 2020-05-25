package com.p683ss.android.ugc.aweme.discover.adapter;

import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.music.model.MusicTag;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.aw */
public final class C27835aw extends C1322a<C27838ay> {

    /* renamed from: a */
    public final List<MusicTag> f73118a = new ArrayList();

    /* renamed from: b */
    public int[] f73119b = new int[2];

    /* renamed from: c */
    public final RecyclerView f73120c;

    /* renamed from: d */
    private final OnClickListener f73121d;

    public final int getItemCount() {
        return this.f73118a.size();
    }

    public C27835aw(OnClickListener onClickListener, RecyclerView recyclerView) {
        C52711k.m112240b(onClickListener, "onClickListener");
        C52711k.m112240b(recyclerView, "recyclerView");
        this.f73121d = onClickListener;
        this.f73120c = recyclerView;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bj1, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C27838ay(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C27838ay ayVar = (C27838ay) vVar;
        C52711k.m112240b(ayVar, "holder");
        MusicTag musicTag = (MusicTag) this.f73118a.get(i);
        ayVar.itemView.setOnClickListener(this.f73121d);
        C52711k.m112240b(musicTag, "tag");
        if (!TextUtils.isEmpty(musicTag.getTagColor()) && !TextUtils.isEmpty(musicTag.getTagTitle())) {
            TextView textView = ayVar.f73128b;
            if (textView != null) {
                textView.setText(musicTag.getTagTitle());
            }
            try {
                TextView textView2 = ayVar.f73128b;
                if (textView2 != null) {
                    textView2.setBackgroundColor(Color.parseColor(musicTag.getTagColor()));
                }
                TextView textView3 = ayVar.f73128b;
                if (textView3 != null) {
                    textView3.setTextColor(Color.parseColor(musicTag.getTagTitleColor()));
                }
            } catch (Exception unused) {
            }
            TextView textView4 = ayVar.f73128b;
            if (textView4 != null) {
                textView4.setLayoutParams((LayoutParams) ayVar.f73129c.getValue());
            }
            if (ayVar.f73128b != null) {
                TextView textView5 = ayVar.f73128b;
                if (textView5 != null) {
                    View view = textView5;
                    if (VERSION.SDK_INT >= 21) {
                        view.setOutlineProvider(new C47856en(view.getResources().getDimensionPixelOffset(R.dimen.a0h)));
                        view.setClipToOutline(true);
                        return;
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.View");
            }
        }
    }
}
