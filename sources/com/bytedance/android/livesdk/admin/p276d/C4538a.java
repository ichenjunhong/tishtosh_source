package com.bytedance.android.livesdk.admin.p276d;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.admin.p274b.C4531b;
import com.bytedance.android.livesdk.admin.p274b.C4532c;
import com.bytedance.android.livesdk.p330f.C6766a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.admin.d.a */
public final class C4538a extends C1322a<C6766a> {

    /* renamed from: a */
    private Context f12478a;

    /* renamed from: b */
    private List<C4531b> f12479b = new ArrayList();

    /* renamed from: c */
    private C4532c f12480c;

    /* renamed from: d */
    private long f12481d;

    /* renamed from: e */
    private long f12482e;

    public final int getItemCount() {
        return this.f12479b.size();
    }

    /* renamed from: a */
    public final void mo10358a(C4532c cVar) {
        this.f12480c = cVar;
        if (cVar != null) {
            List<C4531b> list = cVar.f12466a;
            if (list != null && list.size() > 0) {
                this.f12479b.clear();
                this.f12479b.addAll(list);
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    public final void mo10357a(long j) {
        for (int size = this.f12479b.size() - 1; size >= 0; size--) {
            C4531b bVar = (C4531b) this.f12479b.get(size);
            if (bVar != null) {
                User user = bVar.f12464a;
                if (user != null && user.getId() == j) {
                    this.f12479b.remove(size);
                    notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        ((C6766a) vVar).mo10361a((C4531b) this.f12479b.get(i));
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C4539b bVar = new C4539b(this.f12478a, LayoutInflater.from(this.f12478a).inflate(R.layout.ala, viewGroup, false), this.f12481d, this.f12482e);
        return bVar;
    }

    public C4538a(Context context, long j, long j2) {
        this.f12478a = context;
        this.f12481d = j;
        this.f12482e = j2;
    }
}
