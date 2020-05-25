package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ahj.C15575a;
import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class beg extends C15717bef {
    /* renamed from: a */
    public static beg m35493a(String str, Context context, boolean z) {
        m35484a(context, z);
        return new beg(context, str, z);
    }

    private beg(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<Callable<Void>> mo30077a(bey bey, Context context, C15588a aVar, C15575a aVar2) {
        if (bey.f42217b == null || !this.f42184r) {
            return super.mo30077a(bey, context, aVar, aVar2);
        }
        int b = bey.mo30097b();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo30077a(bey, context, aVar, aVar2));
        bft bft = new bft(bey, "qFtd4C5d0KtcWzWeFLmuiEXghbgUuLNC6Ve2ufc1M4U3XrnmTraQBUqm3xNwgk3c", "CKWARAW2rIlqCmo31AsybLnBFwRJcX2Vc+m6JImxUIM=", aVar, b, 24);
        arrayList.add(bft);
        return arrayList;
    }
}
