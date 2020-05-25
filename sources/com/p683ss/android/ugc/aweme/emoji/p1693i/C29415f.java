package com.p683ss.android.ugc.aweme.emoji.p1693i;

import com.bytedance.common.utility.C9431p;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29358c;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29476f;
import com.p683ss.android.ugc.aweme.emoji.utils.C29483k;
import com.p683ss.android.ugc.aweme.emoji.utils.C29487m;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.f */
public class C29415f extends C29423k implements C29420h {

    /* renamed from: c */
    private static volatile C29415f f77037c;

    /* renamed from: a */
    List<C29420h> f77038a = new ArrayList();

    /* renamed from: a */
    public static C29415f m69368a() {
        if (f77037c == null) {
            synchronized (C29415f.class) {
                if (f77037c == null) {
                    f77037c = new C29415f();
                }
            }
        }
        return f77037c;
    }

    /* renamed from: a */
    static List<C29366a> m69369a(C29358c cVar) {
        JSONObject jSONObject;
        StringBuilder sb = new StringBuilder();
        sb.append(C29483k.m69575b(cVar));
        sb.append("/info.json");
        String a = C29476f.m69555a(new File(sb.toString()));
        ArrayList arrayList = new ArrayList();
        if (C9431p.m18664a(a)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONObject(a).getJSONArray("stickers");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        C29366a aVar = new C29366a();
                        aVar.setAnimateType(jSONObject2.getString("animate_type"));
                        aVar.setDisplayName(jSONObject2.getString("display_name"));
                        aVar.setId(jSONObject2.getLong("id"));
                        aVar.setWidth(jSONObject2.getInt("width"));
                        aVar.setHeight(jSONObject2.getInt("height"));
                        String string = jSONObject2.getString("static_url");
                        String string2 = jSONObject2.getString("animate_url");
                        aVar.setStaticUrl(C29487m.m69578a(string, aVar.getWidth(), aVar.getHeight()));
                        aVar.setStaticType(jSONObject2.getString("static_type"));
                        aVar.setAnimateUrl(C29487m.m69578a(string2, aVar.getWidth(), aVar.getHeight()));
                        aVar.setVersion(cVar.getVersion());
                        aVar.setResourcesId(cVar.getId());
                        try {
                            jSONObject = jSONObject2.getJSONObject("display_name_lang");
                        } catch (JSONException unused) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            if (jSONObject.keys() != null) {
                                HashMap hashMap = new HashMap();
                                Iterator keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String str = (String) keys.next();
                                    hashMap.put(str, jSONObject.getString(str));
                                }
                                aVar.setDisplayNameLangs(hashMap);
                            }
                        }
                        arrayList.add(aVar);
                    }
                }
            }
        } catch (JSONException unused2) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo59474a(LinkedHashMap<C29358c, List<C29366a>> linkedHashMap) {
        for (C29420h a : this.f77038a) {
            a.mo59474a(linkedHashMap);
        }
    }

    /* renamed from: a */
    public final void mo59472a(C29358c cVar, List<C29366a> list) {
        for (C29420h a : this.f77038a) {
            a.mo59472a(cVar, list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59480a(final C29358c cVar, boolean z) {
        final List list;
        if (z) {
            list = m69369a(cVar);
        } else {
            list = null;
        }
        C18842a.m45934b(new Runnable() {
            public final void run() {
                C29415f.this.mo59472a(cVar, list);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59481a(String str, final List<C29358c> list) {
        C0013i.m18a((Callable<TResult>) new Callable<LinkedHashMap<C29358c, List<C29366a>>>() {
            public final /* synthetic */ Object call() throws Exception {
                List<C29358c> list = list;
                ArrayList arrayList = new ArrayList();
                if (list.size() > 0) {
                    for (C29358c a : list) {
                        arrayList.add(C29415f.m69369a(a));
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    linkedHashMap.put(list.get(i), arrayList.get(i));
                }
                return linkedHashMap;
            }
        }, (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<LinkedHashMap<C29358c, List<C29366a>>, Void>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                LinkedHashMap linkedHashMap = (LinkedHashMap) iVar.mo34e();
                if (linkedHashMap == null || linkedHashMap.size() == 0) {
                    C29415f.this.f77049b = true;
                } else {
                    C29415f.this.f77049b = false;
                }
                C29415f.this.mo59474a((LinkedHashMap) iVar.mo34e());
                return null;
            }
        }, C0013i.f25b);
    }
}
