package com.bytedance.android.livesdk.gift.effect.doodle.p360a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.effect.doodle.C7363o;
import com.bytedance.android.livesdk.gift.effect.doodle.C7365p;
import com.bytedance.android.livesdk.gift.effect.doodle.C7366q;
import com.bytedance.android.livesdk.gift.model.DoodleTemplate;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.a.c */
public final class C7346c extends C1322a<C7363o> implements C7365p {

    /* renamed from: a */
    public List<DoodleTemplate> f20040a = new ArrayList();

    /* renamed from: b */
    public C7366q f20041b;

    /* renamed from: c */
    public DoodleTemplate f20042c;

    /* renamed from: d */
    private Context f20043d;

    /* renamed from: e */
    private LayoutInflater f20044e;

    public final int getItemCount() {
        return this.f20040a.size();
    }

    /* renamed from: a */
    public final void mo13617a() {
        if (this.f20042c != null) {
            this.f20041b.mo13597a(this.f20042c, false);
        }
        this.f20042c = null;
    }

    public C7346c(Context context) {
        this.f20043d = context;
        this.f20044e = LayoutInflater.from(context);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C7363o(this.f20044e.inflate(R.layout.bwp, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo13613a(C1352v vVar, Object obj) {
        if ((vVar instanceof C7363o) && (obj instanceof DoodleTemplate)) {
            DoodleTemplate doodleTemplate = (DoodleTemplate) obj;
            if (!doodleTemplate.isSelected()) {
                if (this.f20042c != null) {
                    this.f20041b.mo13597a(this.f20042c, false);
                }
                this.f20042c = doodleTemplate;
                this.f20041b.mo13597a(doodleTemplate, true);
            }
        }
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C7363o oVar = (C7363o) vVar;
        DoodleTemplate doodleTemplate = (DoodleTemplate) this.f20040a.get(i);
        if (doodleTemplate.f20510id != 0 && doodleTemplate.image != null && doodleTemplate.image.getUrls() != null && !doodleTemplate.image.getUrls().isEmpty()) {
            C5213c.m11820a(oVar.f20079a, doodleTemplate.image);
            oVar.itemView.setOnClickListener(new OnClickListener(doodleTemplate) {

                /* renamed from: a */
                final /* synthetic */ DoodleTemplate f20083a;

                public final void onClick(View view) {
                    if (C7363o.this.f20080b != null) {
                        C7363o.this.f20080b.mo13613a(C7363o.this, this.f20083a);
                    }
                }

                {
                    this.f20083a = r2;
                }
            });
            oVar.f20080b = this;
            oVar.mo13627a(doodleTemplate.isSelected());
        }
    }
}
