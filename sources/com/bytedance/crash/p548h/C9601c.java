package com.bytedance.crash.p548h;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.crash.C9567c.C9568a;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.C9610j;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p540b.C9560f;
import com.bytedance.crash.p541c.C9570b;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p547g.C9589a;
import com.bytedance.crash.p547g.C9590b;
import com.bytedance.crash.p547g.C9591c;
import com.bytedance.crash.p551k.C9644d;
import com.bytedance.crash.p551k.p552a.C9622c.C9623a;
import com.bytedance.crash.p551k.p552a.C9628f;
import com.bytedance.crash.p554m.C9667a;
import com.bytedance.crash.p555n.C9685a;
import com.bytedance.crash.p555n.C9695g;
import com.bytedance.crash.p555n.C9705m;
import com.bytedance.crash.p555n.C9713t;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.h.c */
public final class C9601c implements C9600b {

    /* renamed from: a */
    public Context f26186a;

    public C9601c(Context context) {
        this.f26186a = context;
    }

    /* renamed from: a */
    public final void mo17436a(long j, Thread thread, Throwable th, String str, File file) {
        final Throwable th2 = th;
        C9589a a = C9590b.m19072a(C9571d.JAVA, C9568a.f26097e, j, th2);
        C9591c.m19085b(a);
        final C9589a clone = a.clone();
        final C9589a eventType = a.clone().eventType(C9568a.f26099g);
        File file2 = new File(C9705m.m19391a(this.f26186a), str);
        C9599a.m19103a().mo17434a(file2.getName());
        file2.mkdirs();
        C9695g.m19366e(file2);
        final boolean b = C9713t.m19446b(th);
        C9628f a2 = C9628f.m19195a();
        C9589a aVar = a;
        C96021 r15 = r1;
        final long j2 = j;
        C9571d dVar = C9571d.JAVA;
        final Thread thread2 = thread;
        final File file3 = file2;
        final String str2 = str;
        File file4 = file2;
        final File file5 = file;
        C96021 r1 = new C9623a() {

            /* renamed from: a */
            long f26187a;

            /* renamed from: a */
            public final void mo17439a(Throwable th) {
                C9591c.m19085b(eventType.state(301).errorInfo(th));
            }

            /* renamed from: a */
            public final C9584a mo17437a(int i, C9584a aVar) {
                String str;
                String str2;
                String str3;
                this.f26187a = SystemClock.uptimeMillis();
                switch (i) {
                    case 0:
                        aVar.mo17395a("data", (Object) C9713t.m19435a(th2));
                        aVar.mo17395a("isOOM", (Object) Boolean.valueOf(b));
                        aVar.mo17395a("isJava", (Object) Integer.valueOf(1));
                        aVar.mo17395a("crash_time", (Object) Long.valueOf(j2));
                        break;
                    case 1:
                        String str4 = "crash_thread_name";
                        if (thread2 != null) {
                            str = thread2.getName();
                        } else {
                            str = "";
                        }
                        aVar.mo17395a(str4, (Object) str);
                        aVar.mo17395a("tid", (Object) Integer.valueOf(Process.myTid()));
                        String str5 = "crash_after_crash";
                        if (C9610j.m19140d()) {
                            str2 = "true";
                        } else {
                            str2 = "false";
                        }
                        aVar.mo17390a(str5, str2);
                        String str6 = "crash_after_native";
                        if (NativeImpl.m19469a()) {
                            str3 = "true";
                        } else {
                            str3 = "false";
                        }
                        aVar.mo17390a(str6, str3);
                        C9599a.m19103a();
                        C9599a.m19106a(thread2, th2, false, aVar);
                        break;
                    case 2:
                        if (b) {
                            C9685a.m19312a(C9601c.this.f26186a, aVar.f26141a);
                        }
                        JSONArray b = C9560f.m18975b();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        JSONObject a = C9560f.m18972a(uptimeMillis);
                        JSONArray a2 = C9560f.m18971a(100, uptimeMillis);
                        aVar.mo17395a("history_message", (Object) b);
                        aVar.mo17395a("current_message", (Object) a);
                        aVar.mo17395a("pending_messages", (Object) a2);
                        aVar.mo17390a("npth_force_apm_crash", String.valueOf(C9570b.m18982a()));
                        aVar.mo17392a("memory_info", C9644d.m19237b(file3));
                        break;
                    case 3:
                        JSONObject b2 = C9713t.m19444b(Thread.currentThread().getName());
                        if (b2 != null) {
                            aVar.mo17395a("all_thread_stacks", (Object) b2);
                        }
                        aVar.mo17395a("logcat", (Object) C9644d.m19235a(file3));
                        break;
                    case 4:
                        if (!b) {
                            C9685a.m19312a(C9601c.this.f26186a, aVar.f26141a);
                            break;
                        }
                        break;
                    case 5:
                        aVar.mo17395a("crash_uuid", (Object) str2);
                        break;
                }
                return aVar;
            }

            /* renamed from: a */
            public final C9584a mo17438a(int i, C9584a aVar, boolean z) {
                try {
                    File file = file3;
                    StringBuilder sb = new StringBuilder();
                    sb.append(file3.getName());
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(i);
                    C9695g.m19353a(new File(file, sb.toString()), aVar.f26141a, false);
                } catch (IOException unused) {
                }
                C9695g.m19357a(file5);
                C9589a aVar2 = clone;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C9568a.f26098f);
                sb2.append(i);
                aVar2.eventType(sb2.toString());
                C9591c.m19085b(clone);
                return aVar;
            }
        };
        C9584a a3 = a2.mo17473a(dVar, null, r15, true);
        long currentTimeMillis = System.currentTimeMillis() - j;
        try {
            a3.mo17390a("crash_type", C31483a.f82385b);
            a3.mo17397b("crash_cost", String.valueOf(currentTimeMillis));
            a3.mo17390a("crash_cost", String.valueOf(currentTimeMillis / 1000));
        } catch (Throwable th3) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th3);
        }
        C9667a.m19271a();
        String b2 = C9667a.m19274b(a3.f26141a, file4);
        C9589a crashTime = aVar.clone().eventType(C9568a.f26100h).crashTime(currentTimeMillis);
        if (b2 == null) {
            C9591c.m19085b(crashTime.state(300));
        } else {
            C9591c.m19085b(crashTime.state(0));
        }
    }
}
