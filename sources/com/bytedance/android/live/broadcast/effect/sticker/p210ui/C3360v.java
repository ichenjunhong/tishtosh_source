package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3277a;
import com.bytedance.android.live.uikit.viewpager.C4281a;
import com.bytedance.android.livesdk.chatroom.p325ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.v */
class C3360v extends C4281a {

    /* renamed from: e */
    private static final String f9652e = "v";

    /* renamed from: a */
    public C3362b f9653a;

    /* renamed from: f */
    private final C3277a f9654f;

    /* renamed from: g */
    private List<EffectCategoryResponse> f9655g;

    /* renamed from: h */
    private SparseArray<C3353s> f9656h = new SparseArray<>();

    /* renamed from: i */
    private C8688c f9657i;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.v$a */
    static class C3361a {

        /* renamed from: a */
        RecyclerView f9658a;

        /* renamed from: b */
        C3353s f9659b;

        C3361a() {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.v$b */
    public interface C3362b {
        /* renamed from: a */
        void mo8723a(C8688c cVar, C8688c cVar2);
    }

    public int getCount() {
        if (C9414h.m18630a(this.f9655g)) {
            return 0;
        }
        return this.f9655g.size();
    }

    /* renamed from: a */
    public final void mo8731a(List<EffectCategoryResponse> list) {
        if (!C9414h.m18630a(list)) {
            this.f9655g = list;
            notifyDataSetChanged();
        }
    }

    public CharSequence getPageTitle(int i) {
        return ((EffectCategoryResponse) this.f9655g.get(i)).getName();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8730a(int i, C8688c cVar) {
        C4525b.f12377at.mo10346a(Integer.valueOf(i));
        if (this.f9653a != null) {
            this.f9653a.mo8723a(this.f9657i, cVar);
        }
        this.f9657i = cVar;
        for (int i2 = 0; i2 < this.f9655g.size(); i2++) {
            C3353s sVar = (C3353s) this.f9656h.get(i2);
            if (sVar != null) {
                sVar.mo8724a(this.f9657i);
            }
        }
    }

    C3360v(Context context, C8688c cVar, C3277a aVar) {
        super(context, LayoutInflater.from(context));
        this.f9654f = aVar;
        this.f9657i = cVar;
    }

    /* renamed from: a */
    public final View mo8729a(int i, View view, ViewGroup viewGroup) {
        View view2;
        C3361a aVar;
        if (view == null) {
            aVar = new C3361a();
            view2 = this.f11772c.inflate(R.layout.aop, viewGroup, false);
            aVar.f9658a = (RecyclerView) view2;
            aVar.f9658a.setLayoutManager(new SSGridLayoutManager(this.f11773d, 5, 1, false));
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C3361a) view.getTag();
        }
        if (this.f9656h.indexOfKey(i) < 0) {
            C3353s sVar = new C3353s(this.f9654f);
            sVar.mo8724a(this.f9657i);
            sVar.f9633d = new C3363w(this, i);
            this.f9656h.put(i, sVar);
        }
        aVar.f9659b = (C3353s) this.f9656h.get(i);
        aVar.f9658a.setAdapter(aVar.f9659b);
        C3353s sVar2 = aVar.f9659b;
        List<Effect> totalEffects = ((EffectCategoryResponse) this.f9655g.get(i)).getTotalEffects();
        sVar2.f9632c.clear();
        for (Effect a : totalEffects) {
            C8688c a2 = C3287f.m9010a(a);
            a2.f23760u = sVar2.f9630a.mo8282a(a2);
            sVar2.f9632c.add(a2);
        }
        sVar2.notifyDataSetChanged();
        return view2;
    }
}
