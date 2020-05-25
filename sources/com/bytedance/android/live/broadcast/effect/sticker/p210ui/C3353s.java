package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3044a;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3277a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.s */
public final class C3353s extends C1322a<C3357b> implements C3044a {

    /* renamed from: a */
    final C3277a f9630a;

    /* renamed from: b */
    C8688c f9631b;

    /* renamed from: c */
    List<C8688c> f9632c = new ArrayList();

    /* renamed from: d */
    public C3356a f9633d;

    /* renamed from: e */
    C8688c f9634e;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.s$a */
    public interface C3356a {
        /* renamed from: a */
        void mo8727a(C8688c cVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.s$b */
    class C3357b extends C1352v {

        /* renamed from: a */
        ImageView f9639a;

        /* renamed from: b */
        View f9640b;

        /* renamed from: c */
        View f9641c;

        /* renamed from: d */
        View f9642d;

        /* renamed from: e */
        View f9643e;

        C3357b(View view) {
            super(view);
            this.f9639a = (ImageView) view.findViewById(R.id.ar5);
            this.f9640b = view.findViewById(R.id.ckf);
            this.f9641c = view.findViewById(R.id.a7x);
            this.f9642d = view.findViewById(R.id.bh6);
            this.f9643e = view.findViewById(R.id.a70);
        }
    }

    public final int getItemCount() {
        return this.f9632c.size();
    }

    public C3353s(C3277a aVar) {
        this.f9630a = aVar;
    }

    /* renamed from: a */
    public final void mo8724a(C8688c cVar) {
        C8688c cVar2 = this.f9631b;
        this.f9631b = cVar;
        if (cVar2 != null && this.f9632c.contains(cVar2)) {
            int indexOf = this.f9632c.indexOf(cVar2);
            if (indexOf >= 0) {
                notifyItemChanged(indexOf);
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final int mo8726b(C8688c cVar) {
        for (int i = 0; i < this.f9632c.size(); i++) {
            if (C8688c.m17189a(cVar, (C8688c) this.f9632c.get(i))) {
                this.f9632c.set(i, cVar);
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo8283a(String str, C8688c cVar) {
        int b = mo8726b(cVar);
        if (b >= 0) {
            notifyItemChanged(b);
        }
    }

    /* renamed from: b */
    public final void mo8284b(String str, C8688c cVar) {
        C4575an.m10981a((int) R.string.etk);
        int b = mo8726b(cVar);
        if (b >= 0) {
            notifyItemChanged(b);
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C3357b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amc, viewGroup, false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8725a(C8688c cVar, C48710o oVar) {
        if (cVar == null || C9414h.m18630a(cVar.f23747h) || !cVar.f23747h.contains("new")) {
            oVar.mo8642b();
        } else {
            this.f9630a.mo8645a(cVar.f23756q, cVar.f23754o, oVar);
        }
    }

    /* renamed from: c */
    public final void mo8285c(String str, C8688c cVar) {
        if (C8688c.m17189a(this.f9634e, cVar) && this.f9633d != null) {
            C8688c cVar2 = this.f9631b;
            this.f9631b = cVar;
            if (cVar2 != null && this.f9632c.contains(cVar2)) {
                int indexOf = this.f9632c.indexOf(cVar2);
                if (indexOf >= 0) {
                    notifyItemChanged(indexOf);
                }
            }
            this.f9633d.mo8727a(this.f9631b);
        }
        int b = mo8726b(cVar);
        if (b >= 0) {
            notifyItemChanged(b);
        }
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        final C3357b bVar = (C3357b) vVar;
        C8688c cVar = (C8688c) this.f9632c.get(i);
        if (cVar != null) {
            int i3 = 0;
            if (!cVar.f23760u && this.f9630a != null && this.f9630a.mo8282a(cVar)) {
                cVar.f23761v = false;
                cVar.f23760u = true;
            }
            C5213c.m11814a(bVar.f9639a, cVar.f23740a.mo7701a());
            View view = bVar.f9642d;
            int i4 = 8;
            if (cVar.f23761v) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            View view2 = bVar.f9641c;
            if (!cVar.f23760u) {
                i4 = 0;
            }
            view2.setVisibility(i4);
            boolean a = C8688c.m17189a(this.f9631b, cVar);
            View view3 = bVar.f9640b;
            if (!a) {
                i3 = 4;
            }
            view3.setVisibility(i3);
            mo8725a(cVar, (C48710o) new C48710o() {
                /* renamed from: a */
                public final void mo8641a() {
                    bVar.f9643e.setVisibility(0);
                }

                /* renamed from: b */
                public final void mo8642b() {
                    bVar.f9643e.setVisibility(8);
                }
            });
            bVar.itemView.setOnClickListener(new C3358t(this, i, bVar, cVar));
        }
    }
}
