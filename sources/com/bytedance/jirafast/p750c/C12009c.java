package com.bytedance.jirafast.p750c;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.bytedance.jirafast.c.c */
public final class C12009c {

    /* renamed from: a */
    static final C12013c f31755a;

    /* renamed from: com.bytedance.jirafast.c.c$a */
    public interface C12010a {
        /* renamed from: a */
        void mo22749a(String[] strArr, int[] iArr);
    }

    /* renamed from: com.bytedance.jirafast.c.c$b */
    static class C12011b implements C12013c {

        /* renamed from: a */
        final Handler f31756a = new Handler(Looper.getMainLooper());

        C12011b() {
        }

        /* renamed from: a */
        public final void mo22753a(Activity activity, final String[] strArr, final C12010a aVar) {
            this.f31756a.post(new Runnable() {
                public final void run() {
                    if (aVar != null) {
                        int[] iArr = new int[strArr.length];
                        Arrays.fill(iArr, 0);
                        aVar.mo22749a(strArr, iArr);
                    }
                }
            });
        }
    }

    /* renamed from: com.bytedance.jirafast.c.c$c */
    interface C12013c {
        /* renamed from: a */
        void mo22753a(Activity activity, String[] strArr, C12010a aVar);
    }

    /* renamed from: com.bytedance.jirafast.c.c$d */
    static class C12014d implements C12013c {
        C12014d() {
        }

        /* renamed from: a */
        public final void mo22753a(Activity activity, String[] strArr, C12010a aVar) {
            if (((C12008b) activity.getFragmentManager().findFragmentByTag("JIRApermissions")) == null) {
                C12008b bVar = new C12008b();
                Bundle bundle = new Bundle();
                bundle.putStringArray("JIRApermissions", strArr);
                bVar.setArguments(bundle);
                bVar.f31754a = aVar;
                activity.getFragmentManager().beginTransaction().add(bVar, "JIRApermissions").commitAllowingStateLoss();
            }
        }
    }

    static {
        boolean z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f31755a = new C12014d();
        } else {
            f31755a = new C12011b();
        }
    }
}
