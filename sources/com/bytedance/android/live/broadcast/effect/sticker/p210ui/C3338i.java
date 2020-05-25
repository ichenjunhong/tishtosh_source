package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3277a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.i */
public final class C3338i extends C1322a<C3339a> {

    /* renamed from: a */
    public C3340b f9593a;

    /* renamed from: b */
    Map<String, C8688c> f9594b = new HashMap();

    /* renamed from: c */
    List<EffectCategoryResponse> f9595c;

    /* renamed from: d */
    SparseArray<C3302c> f9596d = new SparseArray<>();

    /* renamed from: e */
    boolean f9597e;

    /* renamed from: f */
    boolean f9598f;

    /* renamed from: g */
    private final C3277a f9599g;

    /* renamed from: h */
    private Context f9600h;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.i$a */
    class C3339a extends C1352v {

        /* renamed from: a */
        ImageView f9601a;

        /* renamed from: b */
        RecyclerView f9602b;

        C3339a(View view) {
            super(view);
            this.f9601a = (ImageView) view.findViewById(R.id.ar5);
            this.f9602b = (RecyclerView) view.findViewById(R.id.caf);
            this.f9602b.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
            this.f9602b.mo4798a((C1331h) new C3301b());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.i$b */
    public interface C3340b {
        /* renamed from: a */
        void mo8685a(Boolean bool, C8688c cVar);
    }

    public final int getItemCount() {
        if (C9414h.m18630a(this.f9595c)) {
            return 0;
        }
        return this.f9595c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo8713a() {
        this.f9598f = true;
        if (!this.f9597e) {
            this.f9597e = true;
            for (int i = 0; i < this.f9595c.size(); i++) {
                if (this.f9596d.get(i) == null) {
                    EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) this.f9595c.get(i);
                    C3302c cVar = new C3302c(this.f9599g);
                    this.f9596d.put(i, cVar);
                    cVar.mo8677a(effectCategoryResponse);
                    cVar.f9497b = new C3342k(this, effectCategoryResponse, i);
                }
                ((C3302c) this.f9596d.get(i)).mo8676a();
            }
            notifyDataSetChanged();
        }
    }

    public C3338i(C3277a aVar) {
        this.f9599g = aVar;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        onBindViewHolder((C3339a) vVar, i, new ArrayList());
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.f9600h = viewGroup.getContext();
        return new C3339a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.am9, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C3339a aVar, int i, List<Object> list) {
        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) this.f9595c.get(i);
        ImageModel imageModel = new ImageModel();
        ArrayList arrayList = new ArrayList();
        if (this.f9594b.containsKey(effectCategoryResponse.getId())) {
            if (!C9431p.m18664a(effectCategoryResponse.getIcon_selected_url())) {
                arrayList.add(effectCategoryResponse.getIcon_selected_url());
            }
        } else if (!C9431p.m18664a(effectCategoryResponse.getIcon_normal_url())) {
            arrayList.add(effectCategoryResponse.getIcon_normal_url());
        }
        if (C9414h.m18630a(arrayList)) {
            aVar.f9601a.setImageResource(R.drawable.btz);
        } else {
            imageModel.setUrls(arrayList);
            C5213c.m11814a(aVar.f9601a, imageModel);
        }
        if (this.f9596d.get(i) == null) {
            C3302c cVar = new C3302c(this.f9599g);
            this.f9596d.put(i, cVar);
            cVar.mo8677a(effectCategoryResponse);
            cVar.f9497b = new C3341j(this, effectCategoryResponse, i);
            aVar.f9602b.setAdapter(cVar);
        }
        if (aVar.f9602b.getAdapter() == null) {
            aVar.f9602b.setAdapter((C3302c) this.f9596d.get(i));
            return;
        }
        ((C3302c) aVar.f9602b.getAdapter()).mo8677a(effectCategoryResponse);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8714a(C8688c cVar, boolean z, EffectCategoryResponse effectCategoryResponse, int i) {
        if (cVar != null) {
            if (z) {
                this.f9594b.put(effectCategoryResponse.getId(), cVar);
            } else {
                this.f9594b.remove(effectCategoryResponse.getId());
            }
            if (this.f9593a != null) {
                this.f9593a.mo8685a(Boolean.valueOf(z), cVar);
            }
            notifyItemChanged(i, Integer.valueOf(0));
        }
    }
}
