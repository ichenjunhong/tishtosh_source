package com.p683ss.android.ugc.aweme.message.p1949b;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.message.api.MultiUserNoticeApi;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.message.b.b */
public class C36780b {

    /* renamed from: b */
    private static C36780b f93995b;

    /* renamed from: a */
    HashMap<Long, Integer> f93996a = new HashMap<>();

    /* renamed from: a */
    public static C36780b m82772a() {
        if (f93995b == null) {
            synchronized (C36780b.class) {
                if (f93995b == null) {
                    f93995b = new C36780b();
                }
            }
        }
        return f93995b;
    }

    /* renamed from: a */
    public final int mo75929a(String str) {
        try {
            Integer num = (Integer) this.f93996a.get(Long.valueOf(Long.parseLong(str)));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo75930a(List<String> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            MultiUserNoticeApi.f93993a.getMultiUserNoticeCount(TextUtils.join(",", list)).mo20a((C0011g<TResult, TContinuationResult>) new C36781c<TResult,TContinuationResult>(this), (Executor) C0013i.f24a);
        }
    }
}
