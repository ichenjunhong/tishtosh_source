package com.p683ss.android.ugc.effectmanager;

import com.p683ss.android.ugc.effectmanager.common.C48639e;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48678n;
import com.p683ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.o */
public final class C48909o {

    /* renamed from: a */
    private C48639e<String, ModelInfo> f123058a;

    /* renamed from: b */
    private C48904l f123059b;

    /* renamed from: a */
    public final C48904l mo96738a() {
        Collection<ModelInfo> collection;
        if (this.f123059b == null) {
            HashMap hashMap = new HashMap();
            for (ModelInfo modelInfo : this.f123058a.mo96217a()) {
                String name = modelInfo.getName();
                if (!hashMap.containsKey(name)) {
                    hashMap.put(name, modelInfo.getVersion());
                } else if (!((String) hashMap.get(name)).equals(modelInfo.getVersion())) {
                    StringBuilder sb = new StringBuilder("model ");
                    sb.append(name);
                    sb.append(" has different versions in ServerTable,Please modify the file to the correct format ");
                    throw new RuntimeException(sb.toString());
                }
            }
            this.f123059b = new C48904l();
            C48639e<String, C48905a> eVar = new C48639e<>();
            for (String str : this.f123058a.f122270a.keySet()) {
                Collection collection2 = (Collection) this.f123058a.f122270a.get(str);
                if (collection2 == null) {
                    collection = Collections.emptyList();
                } else {
                    collection = Collections.unmodifiableCollection(collection2);
                }
                for (ModelInfo aVar : collection) {
                    eVar.mo96218a(str, new C48905a(aVar));
                }
            }
            this.f123059b.f123052a = eVar;
        }
        return this.f123059b;
    }

    public C48909o(C48639e<String, ModelInfo> eVar) {
        this.f123058a = (C48639e) C48678n.m105349a(eVar);
    }
}
