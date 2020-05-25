package com.p683ss.android.ugc.aweme.filter.p1744c.p1745a;

import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.p1744c.C31454c;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.c.a.c */
public final class C31452c implements C31454c {
    /* renamed from: c */
    public final C31459g mo64348c() {
        return C31483a.m73318b();
    }

    /* renamed from: a */
    public final void mo64345a() {
        C39629l.m88232a().mo58584o().mo64334d().mo64411a(false);
    }

    /* renamed from: b */
    public final List<C31459g> mo64347b() {
        C31501n e = C39629l.m88232a().mo58584o().mo64334d().mo64415e();
        C52711k.m112240b(e, "$this$getAvailableFilterDataOrEmpty");
        List<C31459g> list = (List) e.mo64418a().getValue();
        if (list == null) {
            return C52575l.m112097a();
        }
        return list;
    }

    /* renamed from: a */
    public final C31459g mo64344a(int i) {
        return C31487c.m73326b(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), i);
    }

    /* renamed from: b */
    public final C31459g mo64346b(int i) {
        return C31487c.m73324a(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), i);
    }

    /* renamed from: c */
    public final String mo64349c(int i) {
        C31459g a = C31487c.m73324a(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), i);
        if (a != null) {
            String str = a.f82332i;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    /* renamed from: d */
    public final String mo64350d(int i) {
        C31459g a = C31487c.m73324a(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), i);
        if (a != null) {
            String str = a.f82326c;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    /* renamed from: e */
    public final String mo64351e(int i) {
        return C39629l.m88232a().mo58584o().mo64334d().mo64416f().mo64405c(i);
    }
}
