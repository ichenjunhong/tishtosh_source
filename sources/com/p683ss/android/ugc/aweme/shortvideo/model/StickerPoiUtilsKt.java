package com.p683ss.android.ugc.aweme.shortvideo.model;

import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44985aq;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.StickerPoiUtilsKt */
public final class StickerPoiUtilsKt {
    public static final C44985aq findLastDoorplateLevelPoi(ArrayList<TimeSpeedModelExtension> arrayList) {
        Object obj;
        boolean z;
        C52711k.m112240b(arrayList, "segments");
        List list = arrayList;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C44985aq stickerPoi = ((TimeSpeedModelExtension) obj).getStickerPoi();
            if (stickerPoi != null) {
                z = stickerPoi.isDoorplateLevel();
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) obj;
        if (timeSpeedModelExtension != null) {
            return timeSpeedModelExtension.getStickerPoi();
        }
        return null;
    }
}
