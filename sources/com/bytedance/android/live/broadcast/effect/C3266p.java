package com.bytedance.android.live.broadcast.effect;

import android.content.res.Resources;
import android.content.res.TypedArray;
import com.bytedance.android.live.broadcast.C3617q;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.model.LocalFilterModel;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.effectmanager.C48580c;
import com.p683ss.android.ugc.effectmanager.C48893h;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48696a;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1723a;

/* renamed from: com.bytedance.android.live.broadcast.effect.p */
public final class C3266p {

    /* renamed from: a */
    public static String f9430a = C3922z.m9903a((int) R.string.efp);

    /* renamed from: f */
    private static final String[] f9431f = C3922z.m9917f(R.array.ai);

    /* renamed from: g */
    private static final String[] f9432g = C3922z.m9917f(R.array.ah);

    /* renamed from: h */
    private static final int[] f9433h = new int[f9431f.length];

    /* renamed from: b */
    public final List<FilterModel> f9434b;

    /* renamed from: c */
    public C48893h f9435c;

    /* renamed from: d */
    public String f9436d;

    /* renamed from: e */
    public String f9437e;

    /* renamed from: i */
    private final List<Object> f9438i;

    /* renamed from: j */
    private final List<C3271a> f9439j;

    /* renamed from: k */
    private String[] f9440k;

    /* renamed from: com.bytedance.android.live.broadcast.effect.p$a */
    public interface C3271a {
        /* renamed from: a */
        void mo8592a(boolean z);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.p$b */
    static final class C3272b {

        /* renamed from: a */
        public static final C3266p f9449a = new C3266p();
    }

    /* renamed from: a */
    public static final C3266p m8943a() {
        return C3272b.f9449a;
    }

    /* renamed from: d */
    public final boolean mo8636d() {
        if (this.f9434b != null) {
            for (FilterModel isNew : this.f9434b) {
                if (isNew.isNew()) {
                    return true;
                }
            }
        }
        return false;
    }

    private C3266p() {
        this.f9435c = ((IHostContext) C4116c.m10249a(IHostContext.class)).getEffectManager();
        this.f9438i = new ArrayList();
        this.f9439j = new ArrayList();
        this.f9434b = new ArrayList();
        mo8631b();
    }

    /* renamed from: c */
    public final void mo8634c() {
        if (this.f9435c != null) {
            final C32671 r0 = new C48702g() {
                /* renamed from: a */
                public final void mo8637a(C48649d dVar) {
                    C3266p.this.mo8630a(false);
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
                    if (effectChannelResponse != null && !C9414h.m18630a(effectChannelResponse.getAllCategoryEffects())) {
                        if (effectChannelResponse.getPanelModel().getTags().contains("new")) {
                            C3266p.this.f9436d = effectChannelResponse.getPanelModel().getId();
                            C3266p.this.f9437e = effectChannelResponse.getPanelModel().getTags_updated_at();
                        }
                        C3266p pVar = C3266p.this;
                        List allCategoryEffects = effectChannelResponse.getAllCategoryEffects();
                        pVar.mo8631b();
                        if (C9414h.m18630a(allCategoryEffects)) {
                            pVar.mo8630a(true);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < allCategoryEffects.size(); i++) {
                            Effect effect = (Effect) allCategoryEffects.get(i);
                            FilterModel filterModel = new FilterModel();
                            filterModel.setFilterType(2);
                            filterModel.setEffect(effect);
                            filterModel.setTags(effect.getTags());
                            if (C48580c.m105108a()) {
                                if (pVar.f9435c != null && !C48580c.m105110b().mo96134a(pVar.f9435c, effect)) {
                                    pVar.mo8629a(effect, i);
                                }
                            } else if (pVar.f9435c != null && !pVar.f9435c.mo96687a(effect) && !pVar.f9435c.mo96693b(effect)) {
                                pVar.mo8629a(effect, i);
                            }
                            pVar.f9434b.add(filterModel);
                            arrayList.add(filterModel);
                        }
                        C2201v.m6613b((Iterable<? extends T>) arrayList).mo6522a(C3273q.f9450a).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C3274r<Object,Object>(pVar)).mo6514a(C1667a.m5940a()).mo6506a(C1723a.m6037b(), C1723a.m6037b(), (C1706a) new C3275s(pVar));
                    }
                }
            };
            if (!C3365u.m9113a(C3922z.m9915e())) {
                this.f9435c.mo96669a(f9430a, (C48702g) r0);
            } else if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_USED_EFFECT_CHECK_CACHE.mo9431a()).booleanValue()) {
                this.f9435c.mo96668a(f9430a, (C48696a) new C48696a() {
                    /* renamed from: a */
                    public final void mo8639a(C48649d dVar) {
                        C3266p.this.f9435c.mo96681a(C3266p.f9430a, false, r0);
                    }

                    /* renamed from: a */
                    public final void mo8640a(boolean z) {
                        if (z) {
                            C3266p.this.f9435c.mo96681a(C3266p.f9430a, false, r0);
                        } else {
                            C3266p.this.f9435c.mo96669a(C3266p.f9430a, r0);
                        }
                    }
                });
            } else {
                this.f9435c.mo96681a(f9430a, false, (C48702g) r0);
            }
        }
    }

    static {
        TypedArray typedArray;
        Resources a = C3922z.m9901a();
        if (a != null) {
            if (C8607a.f23572a) {
                typedArray = a.obtainTypedArray(R.array.aq);
            } else {
                typedArray = a.obtainTypedArray(R.array.ar);
            }
            for (int i = 0; i < f9431f.length; i++) {
                f9433h[i] = typedArray.getResourceId(i, 0);
            }
            typedArray.recycle();
        }
        if (((Integer) C4525b.f12317M.mo10345a()).intValue() < 0) {
            if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_NO_FILTER.mo9431a()).booleanValue()) {
                C4525b.f12317M.mo10346a(Integer.valueOf(1));
                return;
            }
            C4525b.f12317M.mo10346a(Integer.valueOf(0));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8631b() {
        this.f9434b.clear();
        if (C8607a.f23572a) {
            this.f9440k = C3922z.m9915e().getResources().getStringArray(R.array.as);
        } else {
            this.f9440k = C3922z.m9915e().getResources().getStringArray(R.array.at);
        }
        if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_NO_FILTER.mo9431a()).booleanValue()) {
            LocalFilterModel localFilterModel = new LocalFilterModel();
            localFilterModel.setId("0");
            localFilterModel.setName(C3922z.m9903a((int) R.string.hqj));
            localFilterModel.setCoverResId(R.drawable.c2k);
            localFilterModel.setFilterFilePath("");
            FilterModel filterModel = new FilterModel();
            filterModel.setFilterType(0);
            filterModel.setLocalFilter(localFilterModel);
            this.f9434b.add(filterModel);
        }
        for (int i = 0; i < f9431f.length; i++) {
            LocalFilterModel localFilterModel2 = new LocalFilterModel();
            localFilterModel2.setId(String.valueOf(i));
            localFilterModel2.setName(this.f9440k[i]);
            localFilterModel2.setCoverResId(f9433h[i]);
            StringBuilder sb = new StringBuilder();
            sb.append(C3617q.INST.getFilterFilePath());
            sb.append(File.separator);
            sb.append(f9431f[i]);
            localFilterModel2.setFilterFilePath(sb.toString());
            FilterModel filterModel2 = new FilterModel();
            if (i == 0) {
                filterModel2.setFilterType(0);
            } else {
                filterModel2.setFilterType(1);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(f9432g[i]);
            arrayList.add("beautyTag:whitenIntensity");
            filterModel2.setTags(arrayList);
            filterModel2.setLocalFilter(localFilterModel2);
            this.f9434b.add(filterModel2);
        }
    }

    /* renamed from: a */
    public final void mo8628a(C3271a aVar) {
        this.f9439j.add(aVar);
    }

    /* renamed from: b */
    public final void mo8632b(C3271a aVar) {
        this.f9439j.remove(aVar);
    }

    /* renamed from: c */
    public final boolean mo8635c(FilterModel filterModel) {
        if (filterModel.getFilterType() == 2 && this.f9435c != null && this.f9435c.mo96693b(filterModel.getEffect())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo8627a(FilterModel filterModel) {
        if (filterModel.getFilterType() == 2) {
            mo8629a(filterModel.getEffect(), this.f9434b.indexOf(filterModel));
        }
    }

    /* renamed from: b */
    public final boolean mo8633b(FilterModel filterModel) {
        if (filterModel == null) {
            return false;
        }
        if (filterModel.getFilterType() != 2) {
            return true;
        }
        if (!C48580c.m105108a() || filterModel.getEffect() == null) {
            if (this.f9435c == null || !this.f9435c.mo96687a(filterModel.getEffect())) {
                return false;
            }
            return true;
        } else if (this.f9435c == null || !C48580c.m105110b().mo96134a(this.f9435c, filterModel.getEffect())) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo8630a(boolean z) {
        if (!C9414h.m18630a(this.f9439j)) {
            for (C3271a a : this.f9439j) {
                a.mo8592a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo8626a(int i, boolean z) {
        if (!C9414h.m18630a(this.f9438i)) {
            for (int i2 = 0; i2 < this.f9438i.size(); i2++) {
                this.f9438i.get(i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8629a(Effect effect, final int i) {
        if (effect != null && C3365u.m9113a(C3922z.m9915e())) {
            this.f9435c.mo96665a(effect, (C48705j) new C48705j() {
                /* renamed from: a */
                public final void mo8643a(Effect effect) {
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
                    Effect effect = (Effect) obj;
                    C3266p.this.mo8626a(i, true);
                }

                /* renamed from: a */
                public final void mo8644a(Effect effect, C48649d dVar) {
                    C3266p.this.mo8626a(i, false);
                }
            });
        }
    }
}
