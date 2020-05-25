package com.p683ss.android.ugc.aweme.music.p1977e;

import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IFilterMedia;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.music.e.d */
final /* synthetic */ class C37379d implements IFilterMedia {

    /* renamed from: a */
    private final ArrayList f95370a;

    C37379d(ArrayList arrayList) {
        this.f95370a = arrayList;
    }

    public final boolean filter(Object obj) {
        ArrayList arrayList = this.f95370a;
        Integer num = (Integer) obj;
        return ((Long) arrayList.get(num.intValue())).longValue() > 10000 && ((Long) arrayList.get(num.intValue())).longValue() < 600000;
    }
}
