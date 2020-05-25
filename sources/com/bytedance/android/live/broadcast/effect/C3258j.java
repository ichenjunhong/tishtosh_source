package com.bytedance.android.live.broadcast.effect;

import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.broadcast.effect.p208d.C3249b;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.j */
public final class C3258j extends C3846a {

    /* renamed from: a */
    C3199a f9412a;

    /* renamed from: b */
    private List<FilterModel> f9413b;

    /* renamed from: c */
    private C3249b f9414c;

    /* renamed from: a */
    public static C3258j m8927a(C3199a aVar, List<FilterModel> list, C3249b bVar) {
        C3258j jVar = new C3258j();
        jVar.f9412a = aVar;
        Bundle bundle = new Bundle();
        if (list == null) {
            list = new ArrayList<>();
        }
        jVar.f9413b = list;
        jVar.f9414c = bVar;
        jVar.setArguments(bundle);
        return jVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ak0, viewGroup, false);
        final RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.c97);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        if (!(this.f9414c == null || this.f9414c.f9385b == null)) {
            recyclerView.mo4798a(this.f9414c.f9385b);
        }
        recyclerView.setAdapter(new C3198a(getContext(), this.f9413b, new C3260k(this), this.f9414c));
        recyclerView.post(new Runnable() {
            public final void run() {
                recyclerView.mo4814b(((Integer) C4525b.f12317M.mo10345a()).intValue());
            }
        });
        return inflate;
    }
}
