package com.p683ss.android.pushmanager;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.message.C19475d;
import com.p683ss.android.message.C19475d.C19476a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.pushmanager.j */
public class C19704j implements C19475d {

    /* renamed from: a */
    private static volatile C19704j f54237a;

    /* renamed from: b */
    private List<C19475d> f54238b = new ArrayList();

    /* renamed from: c */
    private C19476a f54239c;

    private C19704j() {
    }

    /* renamed from: b */
    public static C19704j m48136b() {
        if (f54237a == null) {
            synchronized (C19704j.class) {
                if (f54237a == null) {
                    f54237a = new C19704j();
                }
            }
        }
        return f54237a;
    }

    /* renamed from: a */
    public final void mo40614a() {
        for (C19475d a : this.f54238b) {
            try {
                a.mo40614a();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo40615a(Context context) {
        for (C19475d a : this.f54238b) {
            try {
                a.mo40615a(context);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo40616a(Intent intent) {
        for (C19475d a : this.f54238b) {
            try {
                a.mo40616a(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo40612a(Context context, C19698d dVar) {
        this.f54239c = new C19476a() {
        };
        for (C19475d a : this.f54238b) {
            try {
                a.mo40612a(context, dVar);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo40613a(Context context, Map<String, String> map) {
        for (C19475d a : this.f54238b) {
            try {
                a.mo40613a(context, map);
            } catch (Throwable unused) {
            }
        }
    }
}
