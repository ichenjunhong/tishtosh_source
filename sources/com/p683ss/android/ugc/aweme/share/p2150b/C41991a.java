package com.p683ss.android.ugc.aweme.share.p2150b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.ss.android.ugc.aweme.share.b.a */
public final class C41991a {

    /* renamed from: a */
    private static int f106283a = 2437;

    /* renamed from: b */
    private static int f106284b = 3000;

    /* renamed from: c */
    private static int f106285c = 1243;

    /* renamed from: a */
    public static void m91954a(Context context, String str) {
        SharedPreferences a = C35807d.m80935a(context.getApplicationContext(), "share_command", 0);
        String string = a.getString("img_command_list", null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!TextUtils.isEmpty(string)) {
            linkedHashSet.addAll(Arrays.asList(string.split(",")));
        }
        if (linkedHashSet.size() >= 5) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2 != null) {
                    linkedHashSet.remove(str2);
                    break;
                }
            }
        }
        linkedHashSet.add(str);
        StringBuilder sb = new StringBuilder();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append(",");
        }
        a.edit().putString("img_command_list", sb.toString()).apply();
    }
}
