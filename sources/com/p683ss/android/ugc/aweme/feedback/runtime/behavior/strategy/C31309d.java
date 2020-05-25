package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c.C31301a;
import com.p683ss.android.ugc.aweme.runtime.behavior.C41319c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.d */
public final class C31309d extends C31304a {

    /* renamed from: a */
    private final String f82064a = "follow_user";

    /* renamed from: b */
    private final String f82065b = "unfollow_user";

    /* renamed from: a */
    public final String mo64209a() {
        return "abnor_follow";
    }

    /* renamed from: b */
    public final long mo64211b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: c */
    public final String mo64212c() {
        long currentTimeMillis = System.currentTimeMillis() - mo64211b();
        List<C41319c> a = C31301a.m73024a().mo64184a(this.f82064a, currentTimeMillis);
        List<C41319c> a2 = C31301a.m73024a().mo64184a(this.f82065b, currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        if (!a.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("关注失败: ");
            sb2.append(a.size());
            sb2.append("次(ECode:");
            sb.append(sb2.toString());
            for (C41319c cVar : a) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cVar.f104782d);
                sb3.append(',');
                sb.append(sb3.toString());
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(");");
        }
        if (!a2.isEmpty()) {
            StringBuilder sb4 = new StringBuilder("取消关注失败: ");
            sb4.append(a2.size());
            sb4.append("次(ECode:");
            sb.append(sb4.toString());
            for (C41319c cVar2 : a2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(cVar2.f104782d);
                sb5.append(',');
                sb.append(sb5.toString());
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(");");
        }
        String sb6 = sb.toString();
        C52711k.m112236a((Object) sb6, "result.toString()");
        return sb6;
    }

    /* renamed from: a */
    public final boolean mo64210a(String str) {
        C52711k.m112240b(str, "type");
        if (C52711k.m112239a((Object) str, (Object) this.f82064a) || C52711k.m112239a((Object) str, (Object) this.f82065b)) {
            return true;
        }
        return false;
    }
}
