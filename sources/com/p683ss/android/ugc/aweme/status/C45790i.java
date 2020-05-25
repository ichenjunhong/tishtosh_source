package com.p683ss.android.ugc.aweme.status;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.status.p2273b.C45739a;
import com.p683ss.android.ugc.aweme.status.p2274c.C45764a;
import com.p683ss.android.ugc.aweme.status.p2274c.C45770b;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.status.i */
public final class C45790i extends C1322a<C1352v> {

    /* renamed from: l */
    public static final C45793a f115721l = new C45793a(null);

    /* renamed from: a */
    public LayoutInflater f115722a;

    /* renamed from: b */
    public ArrayList<C45739a> f115723b = new ArrayList<>();

    /* renamed from: c */
    public RecordStatusViewModel f115724c;

    /* renamed from: d */
    public CategoryPageModel f115725d;

    /* renamed from: e */
    public ArrayList<C45770b> f115726e = new ArrayList<>();

    /* renamed from: f */
    public boolean f115727f;

    /* renamed from: g */
    public boolean f115728g;

    /* renamed from: h */
    public FragmentActivity f115729h;

    /* renamed from: i */
    public String f115730i;

    /* renamed from: j */
    public int f115731j;

    /* renamed from: k */
    public String f115732k;

    /* renamed from: com.ss.android.ugc.aweme.status.i$a */
    public static final class C45793a {
        private C45793a() {
        }

        public /* synthetic */ C45793a(C52707g gVar) {
            this();
        }
    }

    public final int getItemCount() {
        return this.f115723b.size();
    }

    public final int getItemViewType(int i) {
        return ((C45739a) this.f115723b.get(i)).f115618b;
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C45770b) {
            C45770b bVar = (C45770b) vVar;
            if (bVar.f115676c != null && this.f115728g) {
                C0198r n = this.f115724c.mo92169n();
                C45739a aVar = bVar.f115676c;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                n.setValue(aVar.f115619c.getEffectId());
            }
        }
    }

    /* renamed from: a */
    public static String[] m99594a(Effect effect) {
        String str;
        C52711k.m112240b(effect, "effect");
        String str2 = "";
        String str3 = "";
        try {
            JSONObject jSONObject = new JSONObject(effect.getExtra());
            str = jSONObject.optString("status_template_cover_picture", "");
            C52711k.m112236a((Object) str, "jsonObject.optString(\"st…plate_cover_picture\", \"\")");
            try {
                String optString = jSONObject.optString("status_template_cover_video", "");
                C52711k.m112236a((Object) optString, "jsonObject.optString(\"st…emplate_cover_video\", \"\")");
                return new String[]{str, optString};
            } catch (Exception unused) {
                return new String[]{str, str3};
            } catch (Throwable unused2) {
                return new String[]{str, str3};
            }
        } catch (Exception unused3) {
            str = str2;
            return new String[]{str, str3};
        } catch (Throwable unused4) {
            str = str2;
            return new String[]{str, str3};
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "vg");
        if (i != 1) {
            View inflate = this.f115722a.inflate(R.layout.bj4, null);
            RecordStatusViewModel recordStatusViewModel = this.f115724c;
            C52711k.m112236a((Object) inflate, "view");
            C1352v bVar = new C45770b(recordStatusViewModel, inflate, this.f115729h, this.f115731j);
            this.f115726e.add(bVar);
            return bVar;
        }
        View inflate2 = this.f115722a.inflate(R.layout.bj3, null);
        C52711k.m112236a((Object) inflate2, "view");
        RecordStatusViewModel recordStatusViewModel2 = this.f115724c;
        FragmentActivity fragmentActivity = this.f115729h;
        Object obj = this.f115723b.get(0);
        C52711k.m112236a(obj, "effectList.get(0)");
        return new C45764a(inflate2, recordStatusViewModel2, fragmentActivity, (C45739a) obj);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "vh");
        if (!(vVar instanceof C45764a) && (vVar instanceof C45770b)) {
            C45770b bVar = (C45770b) vVar;
            Object obj = this.f115723b.get(i);
            C52711k.m112236a(obj, "effectList.get(position)");
            C45739a aVar = (C45739a) obj;
            C52711k.m112240b(aVar, "effect");
            bVar.f115676c = aVar;
            bVar.f115675b.setVisibility(0);
            switch (bVar.f115682i) {
                case 0:
                    if (bVar.f115678e) {
                        C50181a.m108304b(bVar.f115675b, aVar.f115621e, bVar.f115675b.getWidth(), bVar.f115675b.getHeight());
                        return;
                    } else {
                        C50181a.m108293a(bVar.f115675b, aVar.f115620d, bVar.f115675b.getWidth(), bVar.f115675b.getHeight());
                        return;
                    }
                case 1:
                    C50181a.m108293a(bVar.f115675b, aVar.f115620d, bVar.f115675b.getWidth(), bVar.f115675b.getHeight());
                    return;
                case 2:
                    C50181a.m108304b(bVar.f115675b, aVar.f115621e, bVar.f115675b.getWidth(), bVar.f115675b.getHeight());
                    return;
                default:
                    if (!bVar.f115678e) {
                        C50181a.m108293a(bVar.f115675b, aVar.f115620d, bVar.f115675b.getWidth(), bVar.f115675b.getHeight());
                        break;
                    } else {
                        C50181a.m108304b(bVar.f115675b, aVar.f115621e, bVar.f115675b.getWidth(), bVar.f115675b.getHeight());
                        return;
                    }
            }
        }
    }

    public C45790i(FragmentActivity fragmentActivity, String str, int i, String str2) {
        C52711k.m112240b(fragmentActivity, "context");
        C52711k.m112240b(str, "category");
        C52711k.m112240b(str2, "tabName");
        this.f115729h = fragmentActivity;
        this.f115730i = str;
        this.f115731j = i;
        this.f115732k = str2;
        FragmentActivity fragmentActivity2 = this.f115729h;
        if (fragmentActivity2 != null) {
            LayoutInflater from = LayoutInflater.from(fragmentActivity2);
            C52711k.m112236a((Object) from, "LayoutInflater.from(context as Context)");
            this.f115722a = from;
            C0209x a = C0214z.m440a(this.f115729h).mo359a(RecordStatusViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(co…tusViewModel::class.java)");
            this.f115724c = (RecordStatusViewModel) a;
            this.f115727f = C39618d.f101152P.mo83103a(C40790a.EnableRecordStatusRandomAll);
            this.f115724c.mo92159d().observe(this.f115729h, new C0199s<CategoryPageModel>(this) {

                /* renamed from: a */
                final /* synthetic */ C45790i f115733a;

                {
                    this.f115733a = r1;
                }

                public final /* synthetic */ void onChanged(Object obj) {
                    String str;
                    CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
                    if (categoryPageModel != null && categoryPageModel.getCategoryEffects() != null) {
                        CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
                        C52711k.m112236a((Object) categoryEffects, "it.categoryEffects");
                        if (categoryEffects.getEffects() != null) {
                            CategoryEffectModel categoryEffects2 = categoryPageModel.getCategoryEffects();
                            C52711k.m112236a((Object) categoryEffects2, "it.categoryEffects");
                            if (C52711k.m112239a((Object) categoryEffects2.getCategoryKey(), (Object) this.f115733a.f115730i)) {
                                this.f115733a.f115725d = categoryPageModel;
                                this.f115733a.f115723b.clear();
                                CategoryEffectModel categoryEffects3 = categoryPageModel.getCategoryEffects();
                                C52711k.m112236a((Object) categoryEffects3, "it.categoryEffects");
                                List effects = categoryEffects3.getEffects();
                                int size = effects.size();
                                for (int i = 0; i < size; i++) {
                                    Effect effect = (Effect) effects.get(i);
                                    C52711k.m112236a((Object) effect, "effect");
                                    String[] a = C45790i.m99594a(effect);
                                    CategoryPageModel categoryPageModel2 = this.f115733a.f115725d;
                                    if (categoryPageModel2 != null) {
                                        List url_prefix = categoryPageModel2.getUrl_prefix();
                                        if (url_prefix != null) {
                                            str = (String) url_prefix.get(0);
                                            ArrayList<C45739a> arrayList = this.f115733a.f115723b;
                                            C45739a aVar = new C45739a(2, effect, C52711k.m112231a(str, (Object) a[0]), C52711k.m112231a(str, (Object) a[1]), a[1]);
                                            arrayList.add(aVar);
                                        }
                                    }
                                    str = null;
                                    ArrayList<C45739a> arrayList2 = this.f115733a.f115723b;
                                    C45739a aVar2 = new C45739a(2, effect, C52711k.m112231a(str, (Object) a[0]), C52711k.m112231a(str, (Object) a[1]), a[1]);
                                    arrayList2.add(aVar2);
                                }
                                if (C52711k.m112239a((Object) this.f115733a.f115730i, (Object) "all") && this.f115733a.f115723b.size() > 0) {
                                    if (this.f115733a.f115727f) {
                                        Collections.shuffle(this.f115733a.f115723b);
                                    }
                                    Object obj2 = this.f115733a.f115723b.get(0);
                                    C52711k.m112236a(obj2, "effectList.get(0)");
                                    C45739a aVar3 = (C45739a) obj2;
                                    ArrayList<C45739a> arrayList3 = this.f115733a.f115723b;
                                    C45739a aVar4 = new C45739a(1, aVar3.f115619c, aVar3.f115620d, aVar3.f115621e, aVar3.f115622f);
                                    arrayList3.add(0, aVar4);
                                }
                                this.f115733a.notifyDataSetChanged();
                            }
                        }
                    }
                }
            });
            this.f115724c.mo92171p().observe(this.f115729h, new C0199s<String>(this) {

                /* renamed from: a */
                final /* synthetic */ C45790i f115734a;

                {
                    this.f115734a = r1;
                }

                public final /* synthetic */ void onChanged(Object obj) {
                    Effect effect;
                    String str = (String) obj;
                    if (str != null) {
                        if (C52711k.m112239a((Object) this.f115734a.f115732k, (Object) str)) {
                            this.f115734a.f115728g = true;
                            for (C45770b bVar : this.f115734a.f115726e) {
                                C45739a aVar = bVar.f115676c;
                                if (aVar == null || aVar.f115618b != 1) {
                                    C0198r n = this.f115734a.f115724c.mo92169n();
                                    C45739a aVar2 = bVar.f115676c;
                                    if (aVar2 != null) {
                                        effect = aVar2.f115619c;
                                    } else {
                                        effect = null;
                                    }
                                    if (effect == null) {
                                        C52711k.m112234a();
                                    }
                                    n.setValue(effect.getEffectId());
                                }
                            }
                        } else {
                            this.f115734a.f115728g = false;
                        }
                    }
                }
            });
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.content.Context");
    }
}
