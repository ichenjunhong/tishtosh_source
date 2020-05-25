package com.bytedance.android.live.broadcast.effect.sticker;

import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.a */
public final class C3276a {

    /* renamed from: a */
    public static final C3276a f9453a = new C3276a();

    private C3276a() {
    }

    /* renamed from: a */
    public static final String[] m8968a(List<? extends C8688c> list, String[] strArr) {
        Object obj;
        String str;
        C52711k.m112240b(list, "showSticker");
        C52711k.m112240b(strArr, "pathList");
        Collection arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C52711k.m112239a((Object) ((C8688c) obj).f23759t, (Object) str2)) {
                    break;
                }
            }
            C8688c cVar = (C8688c) obj;
            if (cVar != null) {
                str = cVar.f23748i;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            str = "";
            arrayList.add(str);
        }
        Object[] array = ((List) arrayList).toArray(new String[0]);
        if (array != null) {
            String[] strArr2 = (String[]) array;
            StringBuilder sb = new StringBuilder("effect extra list:");
            String arrays = Arrays.toString(strArr2);
            C52711k.m112236a((Object) arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            C3831a.m9707a("ComposerUtils", sb.toString());
            return strArr2;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public static final String[] m8967a(List<? extends C8688c> list, Map<C8688c, ? extends Map<String, Float>> map) {
        Object obj;
        C52711k.m112240b(list, "stickerList");
        C52711k.m112240b(map, "composerTagValueMap");
        ArrayList arrayList = new ArrayList();
        for (C8688c cVar : list) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C8688c) obj).mo15141a(cVar)) {
                    break;
                }
            }
            C8688c cVar2 = (C8688c) obj;
            if (cVar2 == null) {
                arrayList.add(cVar.f23759t);
            } else {
                Map map2 = (Map) map.get(cVar2);
                if (map2 != null) {
                    for (Entry entry : map2.entrySet()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(cVar.f23759t);
                        sb.append(':');
                        sb.append((String) entry.getKey());
                        sb.append(':');
                        sb.append(((Number) entry.getValue()).floatValue());
                        arrayList.add(sb.toString());
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
