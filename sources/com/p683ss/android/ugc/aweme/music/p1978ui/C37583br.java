package com.p683ss.android.ugc.aweme.music.p1978ui;

import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.music.ui.br */
final class C37583br {
    /* renamed from: a */
    public static final ArrayList<String> m84026a(String str) {
        String[] split;
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : str.split(",")) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
