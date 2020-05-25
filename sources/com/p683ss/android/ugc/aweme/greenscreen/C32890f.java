package com.p683ss.android.ugc.aweme.greenscreen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.f */
public final class C32890f {
    /* renamed from: a */
    public static final String m75776a(List<GreenScreenImage> list) {
        String str;
        if (list != null) {
            Iterable<GreenScreenImage> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (GreenScreenImage greenScreenImage : iterable) {
                if (greenScreenImage != null) {
                    str = greenScreenImage.getImageId();
                } else {
                    str = null;
                }
                arrayList.add(str);
            }
            String a = C52575l.m112120a((List) arrayList, ",", null, null, 0, null, null, 62, null);
            if (a != null) {
                return a;
            }
        }
        return "";
    }

    /* renamed from: b */
    public static final String m75777b(List<GreenScreenImage> list) {
        String str;
        if (list != null) {
            Iterable<GreenScreenImage> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (GreenScreenImage greenScreenImage : iterable) {
                if (greenScreenImage != null) {
                    str = greenScreenImage.getBackgroundType();
                } else {
                    str = null;
                }
                arrayList.add(str);
            }
            String a = C52575l.m112120a((List) arrayList, ",", null, null, 0, null, null, 62, null);
            if (a != null) {
                return a;
            }
        }
        return "";
    }
}
