package com.bytedance.android.livesdk.i18n;

import android.text.TextUtils;
import com.bytedance.android.livesdk.i18n.p384db.C7684a;
import com.bytedance.android.livesdk.i18n.p384db.C7688d;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.i18n.g */
final /* synthetic */ class C7695g implements Callable {

    /* renamed from: a */
    private final C7679c f21188a;

    /* renamed from: b */
    private final Map f21189b;

    /* renamed from: c */
    private final long f21190c;

    C7695g(C7679c cVar, Map map, long j) {
        this.f21188a = cVar;
        this.f21189b = map;
        this.f21190c = j;
    }

    public final Object call() {
        C7679c cVar = this.f21188a;
        Map map = this.f21189b;
        long j = this.f21190c;
        Set<Entry> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Entry entry : entrySet) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                arrayList.add(new C7688d((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        C7679c.f21157b.mo14050b();
        C7679c.f21157b.mo14049a(arrayList);
        C7679c.f21158c.mo14047a(new C7684a("locale", cVar.f21159a));
        C7679c.f21158c.mo14047a(new C7684a(C42311c.f106863g, String.valueOf(j)));
        return Boolean.valueOf(true);
    }
}
