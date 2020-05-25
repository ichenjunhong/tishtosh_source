package com.bytedance.ies.p675g.p678c;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.g.c.a */
public final class C10825a {

    /* renamed from: a */
    public boolean f29081a;

    /* renamed from: b */
    public final LinkedHashMap<String, List<C10858n>> f29082b = new LinkedHashMap<>();

    /* renamed from: c */
    final Executor f29083c;

    /* renamed from: d */
    public final C10828c f29084d;

    /* renamed from: com.bytedance.ies.g.c.a$a */
    static final class C10826a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10825a f29085a;

        /* renamed from: b */
        final /* synthetic */ C52670a f29086b;

        C10826a(C10825a aVar, C52670a aVar2) {
            this.f29085a = aVar;
            this.f29086b = aVar2;
        }

        public final void run() {
            this.f29085a.f29082b.clear();
            for (String str : this.f29085a.f29084d.mo10467a()) {
                try {
                    this.f29085a.mo19604a(new JSONObject(str));
                } catch (JSONException e) {
                    StringBuilder sb = new StringBuilder("Failed to parse JSONObject: ");
                    sb.append(str);
                    C10833f.m21993b(sb.toString(), e);
                }
            }
            this.f29085a.f29081a = true;
            C10833f.m21990a("ConfigManager initialized successfully.");
            this.f29086b.invoke();
        }
    }

    /* renamed from: a */
    public final List<C10858n> mo19603a(String str) {
        C52711k.m112240b(str, "baseUrl");
        Set<Entry> entrySet = this.f29082b.entrySet();
        C52711k.m112236a((Object) entrySet, "configMap.entries");
        for (Entry entry : entrySet) {
            if (C52711k.m112239a((Object) str, (Object) (String) entry.getKey())) {
                return (List) entry.getValue();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo19604a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("configs");
        Iterator keys = jSONObject2.keys();
        C52711k.m112236a((Object) keys, "configListMap.keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            LinkedList linkedList = new LinkedList();
            Map map = this.f29082b;
            C52711k.m112236a((Object) str, "it");
            map.put(str, linkedList);
            JSONArray jSONArray = jSONObject2.getJSONArray(str);
            int i = 0;
            int length = jSONArray.length();
            while (true) {
                if (i < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    try {
                        C10858n nVar = new C10858n();
                        String string = jSONObject3.getString("url");
                        C52711k.m112236a((Object) string, "configObject.getString(\"url\")");
                        C52711k.m112240b(string, "<set-?>");
                        nVar.f29146a = string;
                        String string2 = jSONObject3.getString("method");
                        C52711k.m112236a((Object) string2, "configObject.getString(\"method\")");
                        Locale locale = Locale.ROOT;
                        C52711k.m112236a((Object) locale, "Locale.ROOT");
                        if (string2 != null) {
                            String lowerCase = string2.toLowerCase(locale);
                            C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            C52711k.m112240b(lowerCase, "<set-?>");
                            nVar.f29147b = lowerCase;
                            nVar.f29148c = jSONObject3.getLong("expires");
                            C52711k.m112236a((Object) jSONObject3, "configObject");
                            List<String> a = m21963a(jSONObject3, "conditions");
                            C52711k.m112240b(a, "<set-?>");
                            nVar.f29149d = a;
                            SortedMap<String, String> b = m21964b(jSONObject3, "headers");
                            C52711k.m112240b(b, "<set-?>");
                            nVar.f29150e = b;
                            SortedMap<String, C10861q> c = m21965c(jSONObject3, "params");
                            C52711k.m112240b(c, "<set-?>");
                            nVar.f29151f = c;
                            SortedMap<String, C10861q> c2 = m21965c(jSONObject3, "data");
                            C52711k.m112240b(c2, "<set-?>");
                            nVar.f29152g = c2;
                            linkedList.add(nVar);
                            i++;
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    } catch (JSONException e) {
                        StringBuilder sb = new StringBuilder("Failed to parse config at ");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(jSONObject3);
                        C10833f.m21991a(sb.toString(), e);
                    }
                }
            }
        }
    }

    public C10825a(Executor executor, C10828c cVar) {
        C52711k.m112240b(executor, "workerExecutor");
        C52711k.m112240b(cVar, "configProvider");
        this.f29083c = executor;
        this.f29084d = cVar;
    }

    /* renamed from: a */
    private static List<String> m21963a(JSONObject jSONObject, String str) {
        LinkedList linkedList = new LinkedList();
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return linkedList;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            linkedList.add(optJSONArray.getString(i));
        }
        return linkedList;
    }

    /* renamed from: b */
    private static SortedMap<String, String> m21964b(JSONObject jSONObject, String str) {
        TreeMap treeMap = new TreeMap();
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return treeMap;
        }
        Iterator keys = optJSONObject.keys();
        C52711k.m112236a((Object) keys, "objectMap.keys()");
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            Map map = treeMap;
            C52711k.m112236a((Object) str2, "it");
            String string = optJSONObject.getString(str2);
            C52711k.m112236a((Object) string, "objectMap.getString(it)");
            map.put(str2, string);
        }
        return treeMap;
    }

    /* renamed from: c */
    private static SortedMap<String, C10861q> m21965c(JSONObject jSONObject, String str) {
        TreeMap treeMap = new TreeMap();
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return treeMap;
        }
        Iterator keys = optJSONObject.keys();
        C52711k.m112236a((Object) keys, "objectMap.keys()");
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            JSONObject jSONObject2 = optJSONObject.getJSONObject(str2);
            String string = jSONObject2.getString("type");
            C52711k.m112236a((Object) string, "getString(\"type\")");
            Locale locale = Locale.ROOT;
            C52711k.m112236a((Object) locale, "Locale.ROOT");
            if (string != null) {
                String lowerCase = string.toLowerCase(locale);
                C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String string2 = jSONObject2.getString("value");
                int hashCode = lowerCase.hashCode();
                if (hashCode != -892481938) {
                    if (hashCode == 107944136 && lowerCase.equals("query")) {
                        Map map = treeMap;
                        C52711k.m112236a((Object) str2, "it");
                        C52711k.m112236a((Object) string2, "value");
                        map.put(str2, new C10835g(string2));
                    }
                } else if (lowerCase.equals("static")) {
                    Map map2 = treeMap;
                    C52711k.m112236a((Object) str2, "it");
                    C52711k.m112236a((Object) string2, "value");
                    map2.put(str2, new C10859o(string2));
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
        }
        return treeMap;
    }
}
