package com.p683ss.android.ugc.aweme;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9376b;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.bu */
public final class C24055bu {

    /* renamed from: a */
    private ArrayList f63847a;

    /* renamed from: b */
    private boolean f63848b;

    /* renamed from: c */
    private boolean f63849c;

    /* renamed from: a */
    public final void mo49812a(Context context) {
        if (VERSION.SDK_INT <= 23 && !this.f63848b) {
            if (this.f63847a == null || this.f63847a.size() <= 0) {
                if (!this.f63849c && this.f63847a == null) {
                    new TextView(context).post(new Runnable() {
                        public final void run() {
                        }
                    });
                    try {
                        Thread currentThread = Thread.currentThread();
                        Field declaredField = Thread.class.getDeclaredField("localValues");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(currentThread);
                        Field declaredField2 = Class.forName("java.lang.ThreadLocal$Values").getDeclaredField("table");
                        declaredField2.setAccessible(true);
                        Object[] objArr = (Object[]) declaredField2.get(obj);
                        int i = 0;
                        while (i < objArr.length) {
                            Object obj2 = objArr[i];
                            if (obj2 == null || !obj2.getClass().getName().equals("android.view.ViewRootImpl$RunQueue")) {
                                i++;
                            } else {
                                Field declaredField3 = Class.forName("android.view.ViewRootImpl$RunQueue").getDeclaredField("mActions");
                                declaredField3.setAccessible(true);
                                C9376b.m18557a(declaredField3.get(obj2));
                                this.f63847a = (ArrayList) declaredField3.get(obj2);
                                this.f63849c = true;
                            }
                        }
                        return;
                    } catch (Exception unused) {
                        this.f63848b = true;
                    }
                }
                return;
            }
            C9376b.m18557a((Object) this.f63847a);
        }
    }
}
