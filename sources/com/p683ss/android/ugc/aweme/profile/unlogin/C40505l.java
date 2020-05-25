package com.p683ss.android.ugc.aweme.profile.unlogin;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.UnloginDiggShowInProfileExperiment;
import com.p683ss.android.ugc.aweme.feed.C30134ak;
import com.p683ss.android.ugc.aweme.feed.C30136al;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.l */
public final class C40505l {

    /* renamed from: a */
    public static final C40505l f103378a = new C40505l();

    private C40505l() {
    }

    /* renamed from: a */
    public static void m89919a() {
        C26890h.m65011a("sync_notify", C23089d.m56640a().f61491a);
    }

    /* renamed from: b */
    private static String m89920b(List<? extends Aweme> list) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (i != 0) {
                stringBuffer.append(",");
            }
            StringBuilder sb = new StringBuilder();
            int i2 = i + 1;
            sb.append(i2);
            sb.append(':');
            sb.append(((Aweme) list.get(i)).getAid());
            stringBuffer.append(sb.toString());
            i = i2;
        }
        stringBuffer.append("]");
        String stringBuffer2 = stringBuffer.toString();
        C52711k.m112236a((Object) stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    /* renamed from: a */
    public final void mo82790a(List<? extends Aweme> list) {
        boolean z;
        C52711k.m112240b(list, "awemeList");
        String[] b = C30134ak.m70712b();
        String str = "me_unlogin_show";
        C23089d a = C23089d.m56640a().mo47826a("unlogin_like_item_show", list.size()).mo47826a("unlogin_like_item_show_limit", UnloginDiggShowInProfileExperiment.INSTANCE.mo59616b()).mo47826a("unlogin_like_item_total", b.length);
        String str2 = "unlogin_like_item_recent_week";
        Collection arrayList = new ArrayList();
        for (String str3 : b) {
            if (C30136al.m70721a(str3) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(str3);
            }
        }
        C26890h.m65011a(str, a.mo47826a(str2, ((List) arrayList).size()).mo47829a("unlogin_like_item_show_detail", m89920b(list)).f61491a);
    }
}
