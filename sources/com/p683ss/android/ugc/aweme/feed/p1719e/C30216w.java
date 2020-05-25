package com.p683ss.android.ugc.aweme.feed.p1719e;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1729l.C30468c;
import com.p683ss.android.ugc.aweme.feed.p1729l.C30469d;
import com.p683ss.android.ugc.aweme.language.C35853o;
import com.p683ss.android.ugc.aweme.p1963ml.C37118n;
import com.p683ss.android.ugc.aweme.p1963ml.C37120o;
import java.util.Calendar;
import java.util.HashMap;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.e.w */
final /* synthetic */ class C30216w implements C0011g {

    /* renamed from: a */
    private final Aweme f78907a;

    C30216w(Aweme aweme) {
        this.f78907a = aweme;
    }

    public final Object then(C0013i iVar) {
        Aweme aweme = this.f78907a;
        C37118n nVar = C37118n.f94766c;
        int intValue = ((Number) C37118n.f94765b.getValue()).intValue();
        C30468c a = C30469d.m71398a(aweme.getAid(), intValue);
        if (a != null) {
            HashMap hashMap = new HashMap();
            int size = a.f79617e.size() - 1;
            for (int i = intValue - 1; i >= 0; i--) {
                if (size >= 0) {
                    StringBuilder sb = new StringBuilder("play_time_");
                    sb.append(i);
                    hashMap.put(sb.toString(), a.f79617e.get(size));
                } else {
                    StringBuilder sb2 = new StringBuilder("play_time_");
                    sb2.append(i);
                    hashMap.put(sb2.toString(), Integer.valueOf(0));
                }
                size--;
            }
            hashMap.put("finish_cnt", Integer.valueOf(a.f79615c));
            hashMap.put("head_cnt", Integer.valueOf(a.f79616d));
            hashMap.put("comment_cnt", Integer.valueOf(a.f79614b));
            hashMap.put("like_cnt", Integer.valueOf(a.f79613a));
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            hashMap.put("hour", Integer.valueOf(instance.get(11)));
            hashMap.put("country", C35853o.m80992a());
            C37120o.m83349a().f94768a.mo76395a(aweme, hashMap);
        }
        return null;
    }
}
