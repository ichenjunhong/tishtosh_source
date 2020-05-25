package com.twitter.sdk.android.core.models;

import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18086p;
import com.google.gson.C18089s;
import com.google.gson.C18090t;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BindingValuesAdapter implements C18081k<C52196c>, C18090t<C52196c> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C18082l mo9500a(Object obj, Type type, C18089s sVar) {
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        if (!lVar.mo35006j()) {
            return new C52196c();
        }
        Set<Entry> a = lVar.mo35009m().mo35016a();
        HashMap hashMap = new HashMap(32);
        for (Entry entry : a) {
            String str = (String) entry.getKey();
            C18085o m = ((C18082l) entry.getValue()).mo35009m();
            C18082l b = m.mo35022b("type");
            Object obj = null;
            if (b != null && b.mo35007k()) {
                String c = b.mo34905c();
                char c2 = 65535;
                int hashCode = c.hashCode();
                if (hashCode != -1838656495) {
                    if (hashCode != 2614219) {
                        if (hashCode != 69775675) {
                            if (hashCode == 782694408 && c.equals("BOOLEAN")) {
                                c2 = 3;
                            }
                        } else if (c.equals("IMAGE")) {
                            c2 = 1;
                        }
                    } else if (c.equals("USER")) {
                        c2 = 2;
                    }
                } else if (c.equals("STRING")) {
                    c2 = 0;
                }
                switch (c2) {
                    case 0:
                        obj = jVar.mo34940a(m.mo35022b("string_value"), String.class);
                        break;
                    case 1:
                        obj = jVar.mo34940a(m.mo35022b("image_value"), C52201h.class);
                        break;
                    case 2:
                        obj = jVar.mo34940a(m.mo35022b("user_value"), C52216s.class);
                        break;
                    case 3:
                        obj = jVar.mo34940a(m.mo35022b("boolean_value"), Boolean.class);
                        break;
                }
            }
            hashMap.put(str, obj);
        }
        return new C52196c(hashMap);
    }
}
