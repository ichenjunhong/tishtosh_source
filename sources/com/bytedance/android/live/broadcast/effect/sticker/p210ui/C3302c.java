package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3044a;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3277a;
import com.bytedance.android.live.broadcast.effect.sticker.p210ui.C3338i.C3340b;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.c */
public final class C3302c extends C1322a implements C3044a {

    /* renamed from: a */
    final C3277a f9496a;

    /* renamed from: b */
    public C3340b f9497b;

    /* renamed from: c */
    C8688c f9498c;

    /* renamed from: d */
    List<C8688c> f9499d = new ArrayList();

    /* renamed from: e */
    C8688c f9500e;

    /* renamed from: f */
    boolean f9501f;

    /* renamed from: g */
    C8688c f9502g;

    /* renamed from: h */
    boolean f9503h;

    /* renamed from: i */
    private EffectCategoryResponse f9504i;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.c$a */
    class C3303a extends C1352v {
        C3303a(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.c$b */
    class C3304b extends C1352v {

        /* renamed from: a */
        public final ImageView f9506a;

        /* renamed from: b */
        public final View f9507b;

        /* renamed from: c */
        public final View f9508c;

        /* renamed from: d */
        public final ProgressBar f9509d;

        C3304b(View view) {
            super(view);
            this.f9506a = (ImageView) view.findViewById(R.id.ar5);
            this.f9507b = view.findViewById(R.id.iz);
            this.f9508c = view.findViewById(R.id.a7x);
            this.f9509d = (ProgressBar) view.findViewById(R.id.bh6);
        }
    }

    public final int getItemCount() {
        if (C9414h.m18630a(this.f9499d)) {
            return 0;
        }
        if (this.f9499d.size() <= 3) {
            return this.f9499d.size() + 1;
        }
        return this.f9499d.size();
    }

    /* renamed from: a */
    public final void mo8676a() {
        this.f9503h = true;
        if (this.f9504i != null && !C9414h.m18630a(this.f9504i.getTotalEffects()) && !this.f9501f) {
            this.f9501f = true;
            if (this.f9502g == null) {
                for (C8688c cVar : this.f9499d) {
                    Iterator it = C3395f.m9156f().mo8740a().mo8260a(C3037b.f8913a).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C8688c) it.next()).mo15141a(cVar)) {
                                this.f9498c = cVar;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (this.f9498c != null) {
                        break;
                    }
                }
                if (this.f9498c == null) {
                    this.f9498c = C3287f.m9010a((Effect) this.f9504i.getTotalEffects().get(0));
                }
            } else {
                this.f9498c = this.f9502g;
            }
            if (!this.f9496a.mo8282a(this.f9498c)) {
                this.f9500e = this.f9498c;
                this.f9496a.mo8281a(C3037b.f8913a, this.f9498c, (C3044a) this);
            } else if (this.f9497b != null) {
                this.f9497b.mo8685a(Boolean.valueOf(true), this.f9498c);
            }
            if (this.f9497b != null) {
                this.f9497b.mo8685a(Boolean.valueOf(true), this.f9498c);
            }
            notifyDataSetChanged();
        }
    }

    public C3302c(C3277a aVar) {
        this.f9496a = aVar;
    }

    public final int getItemViewType(int i) {
        if (i >= this.f9499d.size()) {
            return 2;
        }
        return 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo8675a(C8688c cVar) {
        for (int i = 0; i < this.f9499d.size(); i++) {
            if (C8688c.m17189a(cVar, (C8688c) this.f9499d.get(i))) {
                this.f9499d.set(i, cVar);
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo8677a(EffectCategoryResponse effectCategoryResponse) {
        if (effectCategoryResponse != null && !C9414h.m18630a(effectCategoryResponse.getTotalEffects())) {
            this.f9504i = effectCategoryResponse;
            this.f9499d.clear();
            for (Effect a : effectCategoryResponse.getTotalEffects()) {
                C8688c a2 = C3287f.m9010a(a);
                a2.f23760u = this.f9496a.mo8282a(a2);
                this.f9499d.add(a2);
            }
            if (this.f9503h) {
                mo8676a();
                this.f9503h = false;
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo8283a(String str, C8688c cVar) {
        if (mo8675a(cVar) >= 0) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final void mo8284b(String str, C8688c cVar) {
        C4575an.m10981a((int) R.string.efn);
        int a = mo8675a(cVar);
        if (a >= 0) {
            notifyItemChanged(a);
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            return new C3303a(from.inflate(R.layout.am_, viewGroup, false));
        }
        return new C3304b(from.inflate(R.layout.am8, viewGroup, false));
    }

    /* renamed from: c */
    public final void mo8285c(String str, C8688c cVar) {
        if (this.f9501f && cVar.f23744e == this.f9500e.f23744e && this.f9497b != null) {
            this.f9497b.mo8685a(Boolean.valueOf(false), this.f9498c);
            C8688c cVar2 = this.f9498c;
            this.f9498c = cVar;
            if (cVar2 != null && this.f9499d.contains(cVar2)) {
                int indexOf = this.f9499d.indexOf(cVar2);
                if (indexOf >= 0) {
                    notifyItemChanged(indexOf);
                }
            }
            this.f9497b.mo8685a(Boolean.valueOf(true), this.f9498c);
        }
        int a = mo8675a(cVar);
        if (a >= 0) {
            notifyItemChanged(a);
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        if (getItemViewType(i) == 1) {
            C3304b bVar = (C3304b) vVar;
            C8688c cVar = (C8688c) this.f9499d.get(i);
            C5213c.m11814a(bVar.f9506a, cVar.f23740a.mo7701a());
            int i3 = 8;
            bVar.f9507b.setVisibility(8);
            if (this.f9498c != null && this.f9498c.f23744e == cVar.f23744e) {
                bVar.f9507b.setVisibility(0);
            }
            ProgressBar progressBar = bVar.f9509d;
            if (cVar.f23761v) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            progressBar.setVisibility(i2);
            View view = bVar.f9508c;
            if (!cVar.f23760u) {
                i3 = 0;
            }
            view.setVisibility(i3);
            bVar.itemView.setOnClickListener(new C3305d(this, i));
        }
    }
}
