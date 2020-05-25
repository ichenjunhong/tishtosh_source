package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23899b;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c */
public final class C43550c {
    /* renamed from: a */
    public static final LinkedHashMap<String, List<InteractStickerStruct>> m95624a(Map<String, ? extends InteractStickerStruct> map) {
        LinkedHashMap<String, List<InteractStickerStruct>> linkedHashMap = new LinkedHashMap<>();
        if (map == null) {
            return linkedHashMap;
        }
        for (String str : map.keySet()) {
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, new ArrayList());
            }
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) map.get(str);
            if (C23899b.m58625a((Object) interactStickerStruct)) {
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    C52711k.m112234a();
                }
                ((List) obj).add(interactStickerStruct);
            }
        }
        return linkedHashMap;
    }
}
