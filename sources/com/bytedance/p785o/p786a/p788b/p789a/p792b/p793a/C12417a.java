package com.bytedance.p785o.p786a.p788b.p789a.p792b.p793a;

import com.bytedance.p785o.p786a.p787a.C12409d;
import com.bytedance.p785o.p786a.p788b.p789a.p790a.p791a.C12415a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.o.a.b.a.b.a.a */
public final class C12417a implements C12415a {

    /* renamed from: a */
    private static List<String> f32670a;

    static {
        ArrayList arrayList = new ArrayList();
        f32670a = arrayList;
        arrayList.add("FILE_PROVIDER_PATHS");
        f32670a.add("NullPointerException");
        f32670a.add("Failed to resolve canonical path");
        f32670a.add("android.os.DeadSystemException");
    }

    /* renamed from: a */
    public final boolean mo23476a(Object obj, Throwable th) {
        for (StackTraceElement methodName : Thread.currentThread().getStackTrace()) {
            if (methodName.getMethodName().contains("installProvider") && th != null) {
                String th2 = th.toString();
                for (String str : f32670a) {
                    if (th2.contains(str)) {
                        StringBuilder sb = new StringBuilder("Hint the crash ");
                        sb.append(str);
                        C12409d.m24993c("ProviderInstallFailed", sb.toString());
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
