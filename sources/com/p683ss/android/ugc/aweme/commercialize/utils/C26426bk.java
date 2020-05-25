package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bk */
public final class C26426bk {
    /* renamed from: a */
    public static boolean m63900a(Intent intent) {
        if (intent == null || !TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m63899a(Intent intent, Intent intent2) {
        if (intent != null) {
            Set<String> categories = intent.getCategories();
            if (!C9376b.m18558a((Collection<T>) categories)) {
                for (String addCategory : categories) {
                    intent2.addCategory(addCategory);
                }
            }
        }
    }
}
