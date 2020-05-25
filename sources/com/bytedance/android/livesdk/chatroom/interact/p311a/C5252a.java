package com.bytedance.android.livesdk.chatroom.interact.p311a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.a */
public final class C5252a extends C1322a<C1352v> {

    /* renamed from: a */
    public List<C5696e> f14051a;

    /* renamed from: b */
    public List<C5696e> f14052b;

    /* renamed from: c */
    public C5254b f14053c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.a$a */
    public class C5253a extends C1352v {

        /* renamed from: a */
        ImageView f14054a;

        /* renamed from: b */
        TextView f14055b;

        /* renamed from: c */
        TextView f14056c;

        /* renamed from: d */
        TextView f14057d;

        /* renamed from: e */
        View f14058e;

        /* renamed from: f */
        View f14059f;

        /* renamed from: g */
        public LottieAnimationView f14060g;

        /* renamed from: h */
        public C5696e f14061h;

        C5253a(View view) {
            super(view);
            this.f14054a = (ImageView) view.findViewById(R.id.amw);
            this.f14055b = (TextView) view.findViewById(R.id.amz);
            this.f14056c = (TextView) view.findViewById(R.id.amx);
            this.f14057d = (TextView) view.findViewById(R.id.amy);
            this.f14058e = view.findViewById(R.id.an0);
            this.f14059f = view.findViewById(R.id.an1);
            this.f14060g = (LottieAnimationView) view.findViewById(R.id.c7x);
            this.f14060g.setAnimation("audio_interact_effect.json");
            this.f14060g.mo6658c(true);
            view.setOnClickListener(new C5256b(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.a$b */
    public interface C5254b {
        /* renamed from: a */
        void mo11104a(int i, boolean z);

        /* renamed from: a */
        void mo11105a(C5696e eVar);

        /* renamed from: b */
        void mo11106b(int i);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.a$c */
    public class C5255c extends C1352v {

        /* renamed from: a */
        TextView f14063a;

        /* renamed from: b */
        int f14064b;

        C5255c(View view) {
            super(view);
            this.f14063a = (TextView) view.findViewById(R.id.aa6);
            view.setOnClickListener(new C5257c(this));
        }
    }

    public final int getItemCount() {
        return this.f14051a.size();
    }

    public final int getItemViewType(int i) {
        if (((C5696e) this.f14051a.get(i)).mo11637a() == null) {
            return 0;
        }
        return 1;
    }

    public C5252a(List<C5696e> list, C5254b bVar) {
        this.f14051a = list;
        this.f14053c = bVar;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C5255c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amo, viewGroup, false));
        }
        return new C5253a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amp, viewGroup, false));
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (vVar instanceof C5255c) {
            C5255c cVar = (C5255c) vVar;
            cVar.f14064b = i;
            cVar.f14063a.setText(String.valueOf(cVar.f14064b + 1));
            return;
        }
        if (vVar instanceof C5253a) {
            C5253a aVar = (C5253a) vVar;
            C5696e eVar = (C5696e) this.f14051a.get(i);
            aVar.f14061h = eVar;
            C5213c.m11824b(aVar.f14054a, eVar.f14953d.getAvatarMedium());
            aVar.f14055b.setText(String.valueOf(i + 1));
            if (eVar.f14953d.getGender() == 1) {
                aVar.f14055b.setBackgroundResource(R.drawable.bm9);
            } else if (eVar.f14953d.getGender() == 2) {
                aVar.f14055b.setBackgroundResource(R.drawable.bm8);
            } else {
                aVar.f14055b.setBackgroundResource(R.drawable.bm_);
            }
            aVar.f14056c.setText(C3890e.m9835c(eVar.f14951b));
            aVar.f14057d.setText(eVar.f14953d.getNickName());
            if (eVar.f14961l != 0) {
                aVar.f14058e.setVisibility(0);
                aVar.f14059f.setVisibility(0);
                aVar.f14060g.setVisibility(4);
                if (aVar.f14060g.mo6660e()) {
                    aVar.f14060g.mo6661f();
                }
            } else {
                aVar.f14058e.setVisibility(8);
                aVar.f14059f.setVisibility(8);
            }
        }
    }
}
