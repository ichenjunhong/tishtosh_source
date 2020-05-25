package com.bytedance.android.live.broadcast.effect.p207c;

import com.bytedance.android.live.broadcast.C3617q;
import com.bytedance.android.live.broadcast.api.p195b.C3038a;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.api.p195b.C3040c.C3041a;
import com.bytedance.android.live.broadcast.api.p195b.C3040c.C3042b;
import com.bytedance.android.live.broadcast.api.p195b.C3046e;
import com.bytedance.android.live.broadcast.effect.sticker.C3276a;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.p211f.C3388d.C3391b;
import com.bytedance.android.live.broadcast.p211f.C3388d.C3391b.C3392a;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C18085o;
import com.google.gson.C18087q;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcast.effect.c.a */
public final class C3237a implements C3040c {

    /* renamed from: a */
    private C3046e f9354a;

    /* renamed from: b */
    private boolean f9355b;

    /* renamed from: c */
    private final Map<String, Map<String, C8688c>> f9356c;

    /* renamed from: d */
    private final Map<C8688c, Map<String, Float>> f9357d;

    /* renamed from: e */
    private final List<C8688c> f9358e;

    /* renamed from: f */
    private final List<C3042b> f9359f;

    /* renamed from: g */
    private final List<C3041a> f9360g;

    /* renamed from: h */
    private final Map<String, List<String>> f9361h;

    /* renamed from: i */
    private final Map<String, List<String>> f9362i;

    /* renamed from: j */
    private final Map<String, Map<String, Float>> f9363j;

    /* renamed from: k */
    private final Map<String, Map<String, Float>> f9364k;

    /* renamed from: l */
    private final Map<String, Integer> f9365l;

    /* renamed from: com.bytedance.android.live.broadcast.effect.c.a$a */
    public static final class C3239a implements C3391b<C3040c> {
        /* renamed from: a */
        public final C3392a<C3040c> mo8221a(C3392a<C3040c> aVar) {
            return aVar.mo8748a(new C3237a()).mo8747a();
        }
    }

    /* renamed from: a */
    public final Map<String, Map<String, C8688c>> mo8261a() {
        return this.f9356c;
    }

    /* renamed from: a */
    public final void mo8263a(C3042b bVar) {
        if (bVar != null && !this.f9359f.contains(bVar)) {
            this.f9359f.add(bVar);
        }
    }

    /* renamed from: a */
    public final void mo8268a(String str, C8688c cVar) {
        if (cVar != null && this.f9354a != null) {
            if (!this.f9356c.containsKey(str)) {
                this.f9356c.put(str, new HashMap());
            }
            Map map = (Map) this.f9356c.get(str);
            if (map.containsKey(cVar.f23759t)) {
                ((C8688c) map.get(cVar.f23759t)).f23751l.addAll(cVar.f23751l);
                return;
            }
            map.put(cVar.f23759t, cVar);
            if (this.f9354a.f8921b.contains(str)) {
                m8875c(str, cVar);
            }
            m8876d();
            for (C3042b a : this.f9359f) {
                a.mo8278a(true, str, cVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo8269a(String str, C8688c cVar, C8688c cVar2) {
        if (this.f9354a != null) {
            if (cVar != null && this.f9356c.containsKey(str) && ((Map) this.f9356c.get(str)).size() > 0) {
                ((Map) this.f9356c.get(str)).remove(cVar.f23759t);
                if (this.f9354a.f8921b.contains(str)) {
                    m8877d(str, cVar);
                }
                for (C3042b a : this.f9359f) {
                    a.mo8278a(false, str, cVar);
                }
            }
            if (cVar2 != null) {
                if (!this.f9356c.containsKey(str)) {
                    this.f9356c.put(str, new HashMap());
                }
                Map map = (Map) this.f9356c.get(str);
                if (map.containsKey(cVar2.f23759t)) {
                    ((C8688c) map.get(cVar2.f23759t)).f23751l.addAll(cVar2.f23751l);
                    return;
                }
                map.put(cVar2.f23759t, cVar2);
                if (this.f9354a.f8921b.contains(str)) {
                    m8875c(str, cVar2);
                }
                for (C3042b a2 : this.f9359f) {
                    a2.mo8278a(true, str, cVar2);
                }
            }
            if (!(cVar2 == null && cVar == null)) {
                m8876d();
            }
        }
    }

    /* renamed from: a */
    public final void mo8266a(EffectChannelResponse effectChannelResponse) {
        if (this.f9354a != null) {
            String panel = effectChannelResponse.getPanel();
            if (this.f9354a.f8921b.contains(panel) && this.f9362i != null && !this.f9362i.isEmpty() && this.f9362i.containsKey(panel)) {
                List list = (List) this.f9362i.get(panel);
                for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                    if (effect != null) {
                        boolean z = true;
                        if (effect.getEffectType() != 1 || C9376b.m18558a((Collection<T>) effect.getChildEffects())) {
                            z = false;
                        }
                        if (z) {
                            for (int i = 0; i < effect.getChildEffects().size(); i++) {
                                Effect effect2 = (Effect) effect.getChildEffects().get(i);
                                if (!(list == null || effect2 == null || !list.contains(effect2.getUnzipPath()))) {
                                    this.f9365l.put(effect.getEffectId(), Integer.valueOf(i));
                                }
                                m8871a(effect2, panel, list);
                            }
                        } else {
                            m8871a(effect, panel, list);
                        }
                    }
                }
                this.f9362i.remove(panel);
            }
        }
    }

    /* renamed from: a */
    public final void mo8267a(String str, float f) {
        if (this.f9354a != null) {
            for (C8688c cVar : this.f9358e) {
                if (!C9414h.m18630a(cVar.f23751l) && cVar.f23751l.contains(str)) {
                    if (!this.f9357d.containsKey(cVar) || !((Map) this.f9357d.get(cVar)).containsKey(str) || !((Float) ((Map) this.f9357d.get(cVar)).get(str)).equals(Float.valueOf(f))) {
                        int a = this.f9354a.f8922c.mo8254a(cVar.f23759t, str, f);
                        StringBuilder sb = new StringBuilder("updateTagValue path:");
                        sb.append(cVar.f23759t);
                        sb.append(" tag:");
                        sb.append(str);
                        sb.append(" value:");
                        sb.append(f);
                        sb.append(" return:");
                        sb.append(a);
                        C3831a.m9707a("LiveComposerManager", sb.toString());
                        C8688c cVar2 = null;
                        Iterator it = this.f9357d.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C8688c cVar3 = (C8688c) it.next();
                            if (cVar3.f23759t.equals(cVar.f23759t) && cVar3.f23751l.contains(str)) {
                                cVar2 = cVar3;
                                break;
                            }
                        }
                        if (cVar2 == null) {
                            this.f9357d.put(cVar, new HashMap());
                            Map map = (Map) this.f9357d.get(cVar);
                            if (map != null) {
                                map.put(str, Float.valueOf(f));
                            }
                        } else {
                            Map map2 = (Map) this.f9357d.get(cVar2);
                            if (map2 != null) {
                                map2.put(str, Float.valueOf(f));
                            }
                        }
                        String str2 = "";
                        Iterator it2 = this.f9356c.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String str3 = (String) it2.next();
                            if (((Map) this.f9356c.get(str3)).containsValue(cVar2 != null ? cVar2 : cVar)) {
                                str2 = str3;
                                break;
                            }
                        }
                        m8872a(str2, cVar, str, f);
                        if (!this.f9360g.isEmpty()) {
                            for (C3041a aVar : this.f9360g) {
                                if (aVar != null) {
                                    aVar.mo8277a(str2, cVar, str, f);
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8265a(C8688c cVar, String str, float f, boolean z) {
        if (this.f9354a != null && !C9414h.m18630a(cVar.f23751l) && cVar.f23751l.contains(str) && (z || !this.f9357d.containsKey(cVar) || !((Map) this.f9357d.get(cVar)).containsKey(str) || !((Float) ((Map) this.f9357d.get(cVar)).get(str)).equals(Float.valueOf(f)))) {
            int a = this.f9354a.f8922c.mo8254a(cVar.f23759t, str, f);
            StringBuilder sb = new StringBuilder("updateTagValue path:");
            sb.append(cVar.f23759t);
            sb.append(" tag:");
            sb.append(str);
            sb.append(" value:");
            sb.append(f);
            sb.append(" return:");
            sb.append(a);
            C3831a.m9707a("LiveComposerManager", sb.toString());
            C8688c cVar2 = null;
            Iterator it = this.f9357d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8688c cVar3 = (C8688c) it.next();
                if (cVar3.f23759t.equals(cVar.f23759t) && cVar3.f23751l.contains(str)) {
                    cVar2 = cVar3;
                    break;
                }
            }
            if (cVar2 == null) {
                this.f9357d.put(cVar, new HashMap());
                Map map = (Map) this.f9357d.get(cVar);
                if (map != null) {
                    map.put(str, Float.valueOf(f));
                }
            } else {
                Map map2 = (Map) this.f9357d.get(cVar2);
                if (map2 != null) {
                    map2.put(str, Float.valueOf(f));
                }
            }
            String str2 = "";
            Iterator it2 = this.f9356c.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str3 = (String) it2.next();
                if (((Map) this.f9356c.get(str3)).containsValue(cVar2 != null ? cVar2 : cVar)) {
                    str2 = str3;
                    break;
                }
            }
            m8872a(str2, cVar, str, f);
            if (!this.f9360g.isEmpty()) {
                for (C3041a aVar : this.f9360g) {
                    if (aVar != null) {
                        aVar.mo8277a(str2, cVar, str, f);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m8876d() {
        m8873a(false);
    }

    private C3237a() {
        this.f9357d = new HashMap();
        this.f9363j = new HashMap();
        this.f9359f = new ArrayList();
        this.f9362i = (Map) C4525b.f12375ar.mo10345a();
        this.f9364k = (Map) C4525b.f12376as.mo10345a();
        this.f9361h = new HashMap();
        this.f9356c = new HashMap();
        this.f9358e = new ArrayList();
        this.f9360g = new ArrayList();
        this.f9365l = new HashMap();
    }

    /* renamed from: b */
    public final void mo8270b() {
        this.f9355b = true;
        this.f9358e.clear();
        m8876d();
        HashMap hashMap = new HashMap(this.f9357d);
        this.f9357d.clear();
        for (Map map : hashMap.values()) {
            if (!(map == null || map.size() == 0)) {
                for (String str : map.keySet()) {
                    if (map.get(str) != null) {
                        mo8267a(str, ((Float) map.get(str)).floatValue());
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo8276c() {
        if (!this.f9362i.isEmpty()) {
            this.f9361h.putAll(this.f9362i);
        }
        this.f9355b = true;
        C4525b.f12375ar.mo10346a(this.f9361h);
        C4525b.f12376as.mo10346a(this.f9363j);
        if (!(this.f9354a == null || this.f9354a.f8922c == null)) {
            try {
                this.f9354a.f8922c.mo8257a(new String[0]);
                this.f9354a.f8922c.mo8253a();
            } catch (Throwable th) {
                C3831a.m9714b("LiveComposerManager", th);
            }
        }
        this.f9362i.clear();
        this.f9362i.putAll(this.f9361h);
        this.f9364k.clear();
        this.f9364k.putAll(this.f9363j);
        this.f9356c.clear();
        this.f9359f.clear();
        this.f9360g.clear();
        this.f9361h.clear();
        this.f9358e.clear();
        this.f9357d.clear();
        this.f9363j.clear();
        this.f9354a = null;
    }

    /* renamed from: a */
    public final void mo8264a(C3046e eVar) {
        this.f9354a = eVar;
        this.f9355b = true;
    }

    /* renamed from: b */
    public final void mo8271b(C3041a aVar) {
        if (aVar != null) {
            this.f9360g.remove(aVar);
        }
    }

    /* renamed from: a */
    public final Integer mo8259a(Effect effect) {
        if (effect != null) {
            Integer num = (Integer) this.f9365l.get(effect.getEffectId());
            if (num != null) {
                this.f9365l.remove(effect.getEffectId());
                return num;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo8272b(C3042b bVar) {
        if (bVar != null) {
            this.f9359f.remove(bVar);
        }
    }

    /* renamed from: c */
    public final Float mo8275c(String str) {
        for (Map map : this.f9357d.values()) {
            if (map != null && map.containsKey(str)) {
                return (Float) map.get(str);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo8273b(String str) {
        if (this.f9356c.containsKey(str) && ((Map) this.f9356c.get(str)).size() > 0) {
            for (C8688c d : ((Map) this.f9356c.get(str)).values()) {
                m8877d(str, d);
            }
            this.f9356c.remove(str);
            m8876d();
            for (C3042b a : this.f9359f) {
                a.mo8278a(false, str, null);
            }
        }
    }

    /* renamed from: a */
    private void m8873a(boolean z) {
        if (this.f9354a != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (C3038a aVar : this.f9354a.f8920a) {
                if (this.f9356c.containsKey(aVar.f8918b) && m8874a((List<Integer>) arrayList2, aVar.f8917a)) {
                    if (arrayList2.isEmpty()) {
                        arrayList2.addAll(aVar.f8917a);
                    } else {
                        arrayList2.retainAll(aVar.f8917a);
                    }
                    if (this.f9354a.f8923d.contains(aVar.f8918b)) {
                        z2 = true;
                    }
                    arrayList.addAll(((Map) this.f9356c.get(aVar.f8918b)).values());
                }
            }
            if (!this.f9358e.containsAll(arrayList) || !arrayList.containsAll(this.f9358e)) {
                this.f9358e.clear();
                this.f9358e.addAll(arrayList);
                if (this.f9355b) {
                    int a = this.f9354a.f8922c.mo8255a(C3617q.INST.getLiveComposerFilePath(), z2);
                    StringBuilder sb = new StringBuilder("show sticker: ");
                    sb.append(C3617q.INST.getLiveComposerFilePath());
                    sb.append(" return: ");
                    sb.append(a);
                    C3831a.m9707a("LiveComposerManager", sb.toString());
                    this.f9355b = false;
                }
                this.f9354a.f8922c.mo8256a(z2);
                String[] a2 = C3276a.m8967a((List<? extends C8688c>) arrayList, this.f9357d);
                if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_EFFECT_NEW_ENGINE.mo9431a()).booleanValue()) {
                    String[] a3 = C3276a.m8968a((List<? extends C8688c>) arrayList, a2);
                    int a4 = this.f9354a.f8922c.mo8258a(a2, a3);
                    StringBuilder sb2 = new StringBuilder("show sticker composer: ");
                    sb2.append(Arrays.toString(a2));
                    sb2.append(" extra:");
                    sb2.append(Arrays.toString(a3));
                    sb2.append(" return: ");
                    sb2.append(a4);
                    C3831a.m9707a("LiveComposerManager", sb2.toString());
                    return;
                }
                int a5 = this.f9354a.f8922c.mo8257a(a2);
                StringBuilder sb3 = new StringBuilder("show sticker composer: ");
                sb3.append(Arrays.toString(a2));
                sb3.append(" return: ");
                sb3.append(a5);
                C3831a.m9707a("LiveComposerManager", sb3.toString());
            }
        }
    }

    /* renamed from: a */
    public final List<C8688c> mo8260a(String str) {
        if (this.f9356c.containsKey(str)) {
            return new ArrayList(((Map) this.f9356c.get(str)).values());
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public final void mo8262a(C3041a aVar) {
        if (aVar != null && !this.f9360g.contains(aVar)) {
            this.f9360g.add(aVar);
        }
    }

    /* renamed from: a */
    private static boolean m8874a(List<Integer> list, List<Integer> list2) {
        if (list.isEmpty()) {
            return true;
        }
        for (Integer contains : list) {
            if (list2.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m8877d(String str, C8688c cVar) {
        if (this.f9361h.containsKey(str) && cVar != null && !C9431p.m18664a(cVar.f23759t)) {
            ((List) this.f9361h.get(str)).remove(cVar.f23759t);
        }
    }

    /* renamed from: c */
    private void m8875c(String str, C8688c cVar) {
        if (this.f9354a != null && cVar != null) {
            if (!this.f9361h.containsKey(str)) {
                this.f9361h.put(str, new ArrayList());
            }
            if (!((List) this.f9361h.get(str)).contains(cVar.f23759t) && !C9431p.m18664a(cVar.f23759t) && this.f9354a.f8921b.contains(str)) {
                ((List) this.f9361h.get(str)).add(cVar.f23759t);
            }
        }
    }

    /* renamed from: b */
    public final void mo8274b(String str, C8688c cVar) {
        if (this.f9354a != null && this.f9356c.containsKey(str) && ((Map) this.f9356c.get(str)).size() > 0) {
            ((Map) this.f9356c.get(str)).remove(cVar.f23759t);
            if (this.f9354a.f8921b.contains(str)) {
                m8877d(str, cVar);
            }
            m8876d();
            for (C3042b a : this.f9359f) {
                a.mo8278a(false, str, cVar);
            }
        }
    }

    /* renamed from: a */
    private void m8871a(Effect effect, String str, List<String> list) {
        Float f;
        if (effect != null && list.contains(effect.getUnzipPath())) {
            try {
                C18085o m = new C18087q().mo35029a(effect.getExtra()).mo35009m();
                if (m.mo35021a("ab_group") && ((Integer) LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP.mo9431a()).intValue() != m.mo35022b("ab_group").mo34910g()) {
                    return;
                }
            } catch (Exception e) {
                C3831a.m9714b("LiveComposerManager", (Throwable) e);
            }
            if (this.f9364k.containsKey(effect.getUnzipPath())) {
                C8688c a = C3287f.m9010a(effect);
                Map map = (Map) this.f9364k.get(effect.getUnzipPath());
                a.f23751l.addAll(map.keySet());
                mo8268a(str, a);
                for (Object next : map.keySet()) {
                    if (!this.f9363j.containsKey(effect.getUnzipPath()) || !((Map) this.f9363j.get(effect.getUnzipPath())).containsKey(next)) {
                        String str2 = (String) next;
                        if (effect.getExtra().contains(str2)) {
                            a.f23751l.add(str2);
                            Object obj = map.get(next);
                            if (obj instanceof Double) {
                                f = Float.valueOf(((Double) obj).floatValue());
                            } else {
                                f = (Float) obj;
                            }
                            mo8267a(str2, f.floatValue());
                        }
                    }
                }
                return;
            }
            mo8268a(str, C3287f.m9010a(effect));
        }
    }

    /* renamed from: a */
    private void m8872a(String str, C8688c cVar, String str2, float f) {
        if (this.f9361h.containsKey(str) && ((List) this.f9361h.get(str)).contains(cVar.f23759t)) {
            if (!this.f9363j.containsKey(cVar.f23759t)) {
                this.f9363j.put(cVar.f23759t, new HashMap());
            }
            ((Map) this.f9363j.get(cVar.f23759t)).put(str2, Float.valueOf(f));
        }
    }
}
