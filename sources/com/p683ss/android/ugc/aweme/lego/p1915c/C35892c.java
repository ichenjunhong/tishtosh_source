package com.p683ss.android.ugc.aweme.lego.p1915c;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9376b;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.lego.c.c */
public final class C35892c {

    /* renamed from: a */
    private ArrayList f92112a;

    /* renamed from: b */
    private boolean f92113b;

    /* renamed from: c */
    private boolean f92114c;

    /* renamed from: a */
    public final void mo74568a(Context context) {
        if (VERSION.SDK_INT <= 23 && !this.f92113b) {
            if (this.f92112a == null || this.f92112a.size() <= 0) {
                if (!this.f92114c && this.f92112a == null) {
                    try {
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
                                    this.f92112a = (ArrayList) declaredField3.get(obj2);
                                    this.f92114c = true;
                                }
                            }
                            return;
                        } catch (Exception unused) {
                            this.f92113b = true;
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            }
            C9376b.m18557a((Object) this.f92112a);
        }
    }
}
