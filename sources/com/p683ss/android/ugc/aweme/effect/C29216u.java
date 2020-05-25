package com.p683ss.android.ugc.aweme.effect;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0678q;
import android.support.p030v4.app.Fragment;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a.C29128b;
import com.p683ss.android.ugc.aweme.effect.p1671b.p1672a.C29138c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.u */
public final class C29216u extends C0678q {

    /* renamed from: a */
    public Fragment f76523a;

    /* renamed from: b */
    C29126a f76524b;

    /* renamed from: c */
    public boolean f76525c = false;

    /* renamed from: d */
    private List<EffectCategoryResponse> f76526d = new ArrayList();

    /* renamed from: e */
    private Context f76527e;

    /* renamed from: f */
    private List<Effect> f76528f = new ArrayList();

    public final int getCount() {
        return this.f76526d.size();
    }

    /* renamed from: a */
    public final EffectCategoryResponse mo59110a(int i) {
        if (i < this.f76526d.size()) {
            return (EffectCategoryResponse) this.f76526d.get(i);
        }
        return null;
    }

    public final CharSequence getPageTitle(int i) {
        if (i == getCount() - 1) {
            return this.f76527e.getString(R.string.dvl);
        }
        return ((EffectCategoryResponse) this.f76526d.get(i)).getName();
    }

    /* renamed from: a */
    public final void mo59111a(List<EffectCategoryResponse> list) {
        if (list != null) {
            this.f76526d = list;
            if (this.f76526d != null) {
                this.f76528f.clear();
                ArrayList<Effect> arrayList = new ArrayList<>();
                for (EffectCategoryResponse totalEffects : this.f76526d) {
                    List totalEffects2 = totalEffects.getTotalEffects();
                    if (totalEffects2 != null) {
                        arrayList.addAll(totalEffects2);
                    }
                }
                int c = C39629l.m88232a().mo58575f().mo58632c();
                if (c >= 0) {
                    int i = 0;
                    while (i < c && i < arrayList.size()) {
                        Effect effect = (Effect) arrayList.get(i);
                        if (!C29126a.m68614a().mo59142a(effect)) {
                            this.f76528f.add(effect);
                        }
                        i++;
                    }
                } else {
                    for (Effect effect2 : arrayList) {
                        if (!C29126a.m68614a().mo59142a(effect2)) {
                            this.f76528f.add(effect2);
                        }
                    }
                }
                this.f76524b.mo58999a(this.f76528f);
            }
            notifyDataSetChanged();
        }
    }

    public final Fragment getItem(int i) {
        if (i == getCount() - 1 && !this.f76525c) {
            return new C29233z();
        }
        if (C29207l.m68793b(((EffectCategoryResponse) this.f76526d.get(i)).getKey())) {
            List totalEffects = ((EffectCategoryResponse) this.f76526d.get(i)).getTotalEffects();
            String key = ((EffectCategoryResponse) this.f76526d.get(i)).getKey();
            C52711k.m112240b(totalEffects, "effects");
            C52711k.m112240b(key, "category");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("effect_list", (ArrayList) C52575l.m112139e((Collection<? extends T>) totalEffects));
            bundle.putString("effect_category", key);
            C29228y yVar = new C29228y();
            yVar.setArguments(bundle);
            yVar.f76450e = this.f76524b;
            return yVar;
        }
        List totalEffects2 = ((EffectCategoryResponse) this.f76526d.get(i)).getTotalEffects();
        String key2 = ((EffectCategoryResponse) this.f76526d.get(i)).getKey();
        C52711k.m112240b(totalEffects2, "effects");
        C52711k.m112240b(key2, "category");
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("effect_list", (ArrayList) C52575l.m112139e((Collection<? extends T>) totalEffects2));
        bundle2.putString("effect_category", key2);
        C29221w wVar = new C29221w();
        wVar.setArguments(bundle2);
        wVar.f76450e = this.f76524b;
        return wVar;
    }

    C29216u(C0654k kVar, Context context) {
        super(kVar);
        this.f76527e = context;
        this.f76524b = new C29128b().mo59004a(Integer.valueOf(3)).mo59003a((C29138c) new C29138c() {
            /* renamed from: a */
            public final Effect mo59011a(Queue<Effect> queue) {
                return null;
            }

            /* renamed from: a */
            public final boolean mo59012a() {
                return false;
            }
        }).mo59005a();
        C39629l.m88232a().mo58587r();
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f76523a = (Fragment) obj;
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
