package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e */
public final class C43594e implements Serializable {

    /* renamed from: a */
    private String f110319a;

    /* renamed from: b */
    private LinkedHashMap<String, InteractStickerStruct> f110320b;

    /* renamed from: c */
    private LinkedHashMap<String, InteractStickerStruct> f110321c;
    @C17952c(mo34828a = "multi_edit_map")

    /* renamed from: d */
    private LinkedHashMap<String, List<InteractStickerStruct>> f110322d;
    @C17952c(mo34828a = "multi_record_map")

    /* renamed from: e */
    private LinkedHashMap<String, List<InteractStickerStruct>> f110323e;

    public final String getExtra() {
        return this.f110319a;
    }

    public final void setExtra(String str) {
        this.f110319a = str;
    }

    public final boolean isEmpty(C43596f... fVarArr) {
        for (C43596f a : fVarArr) {
            if (!m95770a(a).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private LinkedHashMap<String, List<InteractStickerStruct>> m95770a(C43596f fVar) {
        switch (fVar) {
            case TRACK_PAGE_RECORD:
                if (this.f110323e == null) {
                    this.f110323e = C43550c.m95624a(this.f110320b);
                }
                return this.f110323e;
            case TRACK_PAGE_EDIT:
                if (this.f110322d == null) {
                    this.f110322d = C43550c.m95624a(this.f110321c);
                }
                return this.f110322d;
            default:
                return new LinkedHashMap<>();
        }
    }

    public final List<InteractStickerStruct> getStickerStructsByPage(C43596f... fVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C43596f a : fVarArr) {
            LinkedHashMap a2 = m95770a(a);
            for (String str : a2.keySet()) {
                List list = (List) a2.get(str);
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    public final List<InteractStickerStruct> getTrackByType(Integer num, C43596f fVar) {
        LinkedHashMap a = m95770a(fVar);
        if (a.isEmpty()) {
            return null;
        }
        return (List) a.get(String.valueOf(num));
    }

    public final void upDateStickerStructs(List<InteractStickerStruct> list, C43596f fVar) {
        LinkedHashMap a = m95770a(fVar);
        a.clear();
        if (!C9376b.m18558a((Collection<T>) list)) {
            for (InteractStickerStruct interactStickerStruct : list) {
                int i = -1;
                int type = interactStickerStruct.getType();
                if (type != 1) {
                    switch (type) {
                        case 3:
                            i = 1;
                            break;
                        case 4:
                            i = 2;
                            break;
                        case 5:
                            i = 3;
                            break;
                        case 6:
                            i = 4;
                            break;
                    }
                } else {
                    i = 0;
                }
                if (a.get(String.valueOf(i)) == null) {
                    a.put(String.valueOf(i), new ArrayList());
                }
                ((List) a.get(String.valueOf(i))).add(interactStickerStruct);
            }
        }
    }
}
