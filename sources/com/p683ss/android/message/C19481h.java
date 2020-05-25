package com.p683ss.android.message;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.pushmanager.C19700f;

/* renamed from: com.ss.android.message.h */
public class C19481h {

    /* renamed from: a */
    private static final String f53804a = "h";

    /* renamed from: a */
    public static Class m47691a() {
        return NotifyService.class;
    }

    /* renamed from: a */
    public static Intent m47690a(Context context) {
        return new Intent(context.getApplicationContext(), m47691a());
    }

    /* renamed from: b */
    public static Intent m47693b(Context context) {
        Intent a = m47690a(context);
        a.setAction("pull_do_schedule");
        a.putExtra("from_schedule", true);
        return a;
    }

    /* renamed from: c */
    public static Intent m47694c(Context context) {
        Intent a = m47690a(context);
        a.setAction("push_heart_beat");
        a.putExtra("push_heart_beat", true);
        return a;
    }

    /* renamed from: d */
    public static void m47695d(Context context) {
        try {
            Intent a = m47690a(context);
            a.putExtra("do_schedule_start", true);
            a.putExtra("do_schedule_start_type", 1);
            C19482i.m47696a(context, a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m47692a(Context context, int i) {
        if (C19700f.f54210a.contains(Integer.valueOf(2))) {
            try {
                Intent a = m47690a(context);
                a.putExtra("do_schedule_start", true);
                a.putExtra("do_schedule_start_type", 2);
                C19482i.m47696a(context, a);
            } catch (Exception unused) {
            }
        }
    }
}
