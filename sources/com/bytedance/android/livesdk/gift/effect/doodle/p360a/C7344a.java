package com.bytedance.android.livesdk.gift.effect.doodle.p360a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.effect.doodle.C7361m;
import com.bytedance.android.livesdk.gift.effect.doodle.C7362n;
import com.bytedance.android.livesdk.gift.effect.doodle.C7365p;
import com.bytedance.android.livesdk.gift.effect.doodle.C7366q;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.p379a.C7495f;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.a.a */
public final class C7344a extends C1322a<C7361m> implements C7365p {

    /* renamed from: a */
    public C7366q f20035a;

    /* renamed from: b */
    private Context f20036b;

    /* renamed from: c */
    private LayoutInflater f20037c;

    /* renamed from: d */
    private List<C7495f> f20038d = new ArrayList();

    /* renamed from: e */
    private C7495f f20039e;

    public final int getItemCount() {
        return this.f20038d.size();
    }

    /* renamed from: a */
    public final void mo13614a(C7495f fVar) {
        if (fVar != null) {
            m15185b(fVar);
        }
    }

    public C7344a(Context context) {
        this.f20036b = context;
        this.f20037c = LayoutInflater.from(context);
    }

    /* renamed from: b */
    private void m15185b(C7495f fVar) {
        if (!fVar.f20514b) {
            if (this.f20039e != null) {
                this.f20035a.mo13597a(this.f20039e, false);
            }
            this.f20039e = fVar;
            this.f20035a.mo13597a(fVar, true);
        }
    }

    /* renamed from: a */
    public final C7495f mo13612a(long j) {
        for (C7495f fVar : this.f20038d) {
            if (fVar != null && fVar.mo13919p() == j) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo13615a(List<C7495f> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size() % 4;
            if (size > 0) {
                for (int i = 0; i < 4 - size; i++) {
                    C7505d dVar = new C7505d();
                    dVar.f20548i = true;
                    dVar.f20543d = -1;
                    list.add(new C7495f(dVar));
                }
            }
            this.f20038d.clear();
            this.f20038d.addAll(list);
        }
    }

    /* renamed from: b */
    public final int mo13616b(long j) {
        for (int i = 0; i < this.f20038d.size(); i++) {
            if (this.f20038d.get(i) != null && ((C7495f) this.f20038d.get(i)).mo13919p() == j) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo13613a(C1352v vVar, Object obj) {
        if ((vVar instanceof C7361m) && (obj instanceof C7495f)) {
            m15185b((C7495f) obj);
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C7361m(this.f20037c.inflate(R.layout.bwo, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C7361m mVar = (C7361m) vVar;
        C7495f fVar = (C7495f) this.f20038d.get(i);
        if (fVar != null && fVar.mo13906c()) {
            if (fVar != null) {
                if (fVar.mo13921r().f20543d == -1) {
                    mVar.itemView.setVisibility(8);
                } else {
                    mVar.itemView.setVisibility(0);
                    C5213c.m11820a(mVar.f20072c, fVar.mo13918o());
                    if (fVar.mo13914k() != 0) {
                        mVar.f20073d.setTextColor(fVar.mo13914k());
                    }
                    mVar.f20073d.setText(fVar.mo13913j());
                    if (fVar.mo13916m() != 0) {
                        mVar.f20074e.setTextColor(fVar.mo13916m());
                    }
                    mVar.f20074e.setText(mVar.f20070a.getString(R.string.e8s, new Object[]{Integer.valueOf(fVar.mo13904a())}));
                    mVar.f20071b.setOnClickListener(new C7362n(mVar, fVar));
                }
            }
            mVar.f20075f = this;
            mVar.mo13625a(fVar.f20514b);
        }
    }
}
