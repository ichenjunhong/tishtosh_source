package com.bytedance.android.live.broadcast.effect.p204a;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;

/* renamed from: com.bytedance.android.live.broadcast.effect.a.b */
final /* synthetic */ class C3201b implements OnClickListener {

    /* renamed from: a */
    private final C3198a f9281a;

    /* renamed from: b */
    private final int f9282b;

    /* renamed from: c */
    private final C3200b f9283c;

    C3201b(C3198a aVar, int i, C3200b bVar) {
        this.f9281a = aVar;
        this.f9282b = i;
        this.f9283c = bVar;
    }

    public final void onClick(View view) {
        C3198a aVar = this.f9281a;
        int i = this.f9282b;
        C3200b bVar = this.f9283c;
        if (aVar.f9273c != null) {
            aVar.f9272b = i;
            if (!(aVar.f9271a == null || aVar.f9271a.size() <= i || ((FilterModel) aVar.f9271a.get(i)).getEffect() == null)) {
                if (bVar != null) {
                    bVar.mo8548a();
                }
                ((FilterModel) aVar.f9271a.get(i)).setNew(false);
                C3266p a = C3266p.m8943a();
                String id = ((FilterModel) aVar.f9271a.get(i)).getEffect().getId();
                if (a.f9434b != null && !TextUtils.isEmpty(id)) {
                    for (FilterModel filterModel : a.f9434b) {
                        if (filterModel.getEffect() != null && id.equals(filterModel.getEffect().getId())) {
                            filterModel.setNew(false);
                            String tagsUpdatedAt = filterModel.getEffect().getTagsUpdatedAt();
                            if (a.f9435c != null) {
                                a.f9435c.mo96676a(id, tagsUpdatedAt, (C48715t) null);
                            }
                        }
                    }
                }
            }
            aVar.f9273c.mo8488a(i);
            aVar.notifyDataSetChanged();
        }
    }
}
