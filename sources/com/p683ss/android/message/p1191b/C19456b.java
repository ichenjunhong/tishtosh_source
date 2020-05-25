package com.p683ss.android.message.p1191b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.message.b.b */
public final class C19456b {
    /* renamed from: a */
    public static void m47610a(Context context) {
        Context applicationContext = context.getApplicationContext();
        C19461d b = m47612b(applicationContext);
        long currentTimeMillis = System.currentTimeMillis();
        b.mo40596a(Long.valueOf(currentTimeMillis));
        if (b.mo40594a() < 5 || currentTimeMillis - ((Long) b.mo40595a(0)).longValue() > 7000) {
            m47611a(applicationContext, b);
            Process.killProcess(Process.myPid());
        }
    }

    /* renamed from: b */
    private static C19461d<Long> m47612b(Context context) {
        SharedPreferences a = C35807d.m80935a(context.getApplicationContext(), "kill_process_sp", 0);
        C19461d<Long> dVar = new C19461d<>(5);
        String string = a.getString("last_kill_times", "");
        if (TextUtils.isEmpty(string)) {
            return dVar;
        }
        String[] split = string.split("\\|");
        for (int i = 0; i < split.length; i++) {
            try {
                dVar.mo40596a(Long.valueOf(Long.parseLong(split[i])));
            } catch (Exception unused) {
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private static void m47611a(Context context, C19461d<Long> dVar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dVar.mo40594a(); i++) {
            sb.append(dVar.mo40595a(i));
            sb.append("|");
        }
        C35807d.m80935a(context.getApplicationContext(), "kill_process_sp", 0).edit().putString("last_kill_times", sb.toString()).commit();
    }
}
