package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c.C31301a;
import com.p683ss.android.ugc.aweme.runtime.behavior.C41319c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.b */
public final class C31305b extends C31304a {

    /* renamed from: a */
    public static final C31306a f82062a = new C31306a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.b$a */
    public static final class C31306a {
        private C31306a() {
        }

        public /* synthetic */ C31306a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo64209a() {
        return "abnor_im";
    }

    /* renamed from: b */
    public final long mo64211b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: c */
    public final String mo64212c() {
        long currentTimeMillis = System.currentTimeMillis() - mo64211b();
        List a = C31301a.m73024a().mo64184a("message_send_fail", currentTimeMillis);
        List a2 = C31301a.m73024a().mo64184a("message_self_visiable", currentTimeMillis);
        List arrayList = new ArrayList();
        arrayList.addAll(a);
        arrayList.addAll(a2);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((C41319c) arrayList.get(i)).f104782d);
            if (i != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "result.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final boolean mo64210a(String str) {
        C52711k.m112240b(str, "type");
        int hashCode = str.hashCode();
        if (hashCode == -1082517890 ? !str.equals("message_self_visiable") : hashCode != 171840317 || !str.equals("message_send_fail")) {
            return false;
        }
        return true;
    }
}
