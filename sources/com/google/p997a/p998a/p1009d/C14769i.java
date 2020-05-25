package com.google.p997a.p998a.p1009d;

import com.p683ss.android.ugc.aweme.policy.Policy;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: com.google.a.a.d.i */
public abstract class C14769i {

    /* renamed from: a */
    static final Logger f38280a = Logger.getLogger(C14769i.class.getName());

    /* renamed from: b */
    private static final String[] f38281b;

    static {
        String[] strArr = {Policy.ACTION_DELETE, "GET", "POST", "PUT"};
        f38281b = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: a */
    public final C14767g mo27063a(C14768h hVar) {
        return new C14767g(this, hVar);
    }
}
