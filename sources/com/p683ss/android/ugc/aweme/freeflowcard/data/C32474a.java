package com.p683ss.android.ugc.aweme.freeflowcard.data;

import android.arch.p011c.p014b.C0141e;
import android.os.Build.VERSION;
import android.os.StatFs;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.freeflowcard.data.database.FreeFlowDatabase;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1786b.C32488a;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1786b.C32489b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.a */
public class C32474a {

    /* renamed from: b */
    private static C32474a f84561b;

    /* renamed from: a */
    public FreeFlowDatabase f84562a = ((FreeFlowDatabase) C0141e.m302a(C11010c.m22280a(), FreeFlowDatabase.class, "free_flow").mo250a().mo252b());

    /* renamed from: c */
    private C32489b f84563c;

    /* renamed from: d */
    public final void mo65793d() {
        C0013i.m16a((Callable<TResult>) new Callable<Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() throws Exception {
                try {
                    C32474a.this.f84562a.mo65804h().mo65801a();
                    C32474a.this.f84562a.mo65805i().mo65797a();
                    C32474a.this.f84562a.mo65803g().mo65800b();
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    private C32474a() {
    }

    /* renamed from: a */
    public static C32474a m75189a() {
        if (f84561b == null) {
            synchronized (C32474a.class) {
                if (f84561b == null) {
                    f84561b = new C32474a();
                }
            }
        }
        return f84561b;
    }

    /* renamed from: c */
    public static boolean m75190c() {
        User curUser = C20902b.m53242a().getCurUser();
        if (curUser == null) {
            return false;
        }
        return curUser.isFlowcardMember();
    }

    /* renamed from: f */
    private boolean m75192f() {
        File g = m75193g();
        if (g != null && m75188a(g) >= 1048576) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static File m75193g() {
        File databasePath = C11010c.m22280a().getDatabasePath("free_flow");
        if (databasePath.exists()) {
            return databasePath;
        }
        return null;
    }

    /* renamed from: e */
    private C32489b m75191e() {
        if (this.f84563c != null) {
            return this.f84563c;
        }
        try {
            List a = this.f84562a.mo65803g().mo65798a();
            if (C9376b.m18558a((Collection<T>) a)) {
                C32489b bVar = new C32489b(m75190c(), 0, 0, 0, false, 0);
                mo65791a(bVar);
                return bVar;
            }
            this.f84563c = (C32489b) a.get(0);
            return this.f84563c;
        } catch (Exception unused) {
            C32489b bVar2 = new C32489b(false, 0, 0, 0, false, 0);
            return bVar2;
        }
    }

    /* renamed from: b */
    public final C32489b mo65792b() {
        C32489b e = m75191e();
        if (e.isOpen && e.resetTime < System.currentTimeMillis() && !m75190c()) {
            e.resetTime = 0;
            e.isOpen = false;
            e.changeType = 0;
            e.monthlyState = 0;
            mo65791a(e);
        }
        if (e.isDayOpen && e.dayOpenResetTime < System.currentTimeMillis()) {
            e.isDayOpen = false;
            e.dayOpenResetTime = 0;
            mo65791a(e);
        }
        if (!e.isOpen && e.changeType == 1 && e.resetTime < System.currentTimeMillis()) {
            e.resetTime = 0;
            e.changeType = 0;
            mo65791a(e);
        }
        return e;
    }

    /* renamed from: a */
    private static long m75188a(File file) {
        StatFs statFs;
        try {
            statFs = new StatFs(file.getPath());
        } catch (IllegalArgumentException unused) {
            statFs = null;
        }
        if (statFs == null) {
            return 0;
        }
        if (VERSION.SDK_INT >= 18) {
            return statFs.getAvailableBytes();
        }
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    /* renamed from: a */
    public final void mo65791a(C32489b bVar) {
        if (m75192f()) {
            try {
                this.f84562a.mo65803g().mo65800b();
                this.f84562a.mo65803g().mo65799a(bVar);
                this.f84563c = bVar;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final List<C32488a> mo65789a(long j, long j2) {
        try {
            return this.f84562a.mo65805i().mo65795a(j, j2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final List<C32488a> mo65790a(long j, long j2, int i) {
        try {
            return this.f84562a.mo65805i().mo65796a(j, j2, 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
