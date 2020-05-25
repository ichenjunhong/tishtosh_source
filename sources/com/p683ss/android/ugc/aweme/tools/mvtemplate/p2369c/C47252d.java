package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c;

import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.d */
final /* synthetic */ class C47252d implements Callable {

    /* renamed from: a */
    private final List f119322a;

    C47252d(List list) {
        this.f119322a = list;
    }

    public final Object call() {
        List<String> list = this.f119322a;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            int[] a = C47249a.m102575a(str);
            if (a != null) {
                arrayList.add(PhotoContext.fromUpload(str, a[0], a[1], ""));
            }
        }
        return arrayList;
    }
}
