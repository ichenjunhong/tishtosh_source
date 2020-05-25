package com.p683ss.android.ugc.aweme.discover.mixfeed;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.i */
public final class C28327i implements Serializable {

    /* renamed from: a */
    private int f74310a;
    @C17952c(mo34828a = "mix_info")
    public MixStruct mixInfo;
    @C17952c(mo34828a = "mix_items")
    public List<Aweme> mixItems;

    public final int hashCode() {
        int i;
        int i2 = this.f74310a;
        if (i2 != 0) {
            return i2;
        }
        int i3 = 0;
        if (this.mixInfo == null || this.mixInfo.mixId == null) {
            i = 0;
        } else {
            i = this.mixInfo.mixId.hashCode();
        }
        int i4 = (i + 31) * 31;
        if (this.mixItems != null) {
            i3 = this.mixItems.hashCode();
        }
        int i5 = i4 + i3;
        this.f74310a = i5;
        return i5;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28327i iVar = (C28327i) obj;
        MixStruct mixStruct = this.mixInfo;
        MixStruct mixStruct2 = iVar.mixInfo;
        if (mixStruct == mixStruct2) {
            z = true;
        } else if (mixStruct == null || mixStruct2 == null) {
            z = false;
        } else {
            z = TextUtils.equals(mixStruct.mixId, mixStruct2.mixId);
        }
        if (!z || !C23722i.m58215a(this.mixItems, iVar.mixItems)) {
            return false;
        }
        return true;
    }
}
