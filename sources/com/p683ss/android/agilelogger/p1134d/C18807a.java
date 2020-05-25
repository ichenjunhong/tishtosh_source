package com.p683ss.android.agilelogger.p1134d;

import android.content.Context;
import android.os.Process;
import com.C2240a;
import com.p683ss.android.agilelogger.AgileDelegate;
import com.p683ss.android.agilelogger.C18816f;
import com.p683ss.android.agilelogger.C18832g;
import com.p683ss.android.agilelogger.p1124a.C18782a;
import com.p683ss.android.agilelogger.p1133c.C18804a;
import com.p683ss.android.agilelogger.p1136f.C18826g;
import com.p683ss.android.agilelogger.p1136f.C18831l;
import com.taobao.android.dexposed.ClassUtils;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.agilelogger.d.a */
public final class C18807a extends C18809b {

    /* renamed from: a */
    public AgileDelegate f51959a;

    /* renamed from: f */
    private final Context f51960f;

    /* renamed from: g */
    private final int f51961g;

    /* renamed from: com.ss.android.agilelogger.d.a$a */
    public static class C18808a {

        /* renamed from: a */
        public Context f51962a;

        /* renamed from: b */
        public String f51963b;

        /* renamed from: c */
        public String f51964c;

        /* renamed from: d */
        public int f51965d;

        /* renamed from: e */
        public int f51966e = 2;

        /* renamed from: f */
        public List<C18804a> f51967f;

        /* renamed from: g */
        public boolean f51968g;

        /* renamed from: h */
        public boolean f51969h;

        /* renamed from: i */
        public int f51970i = 3;

        /* renamed from: j */
        public int f51971j = C18782a.f51928c;

        public C18808a(Context context) {
            this.f51962a = context;
        }
    }

    /* renamed from: a */
    public final void mo38400a() {
        super.mo38400a();
        AgileDelegate agileDelegate = this.f51959a;
        if (agileDelegate.f51913a != 0) {
            try {
                agileDelegate.asyncFlush(agileDelegate.f51913a);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo38402b() {
        super.mo38402b();
        AgileDelegate agileDelegate = this.f51959a;
        if (agileDelegate.f51913a != 0) {
            try {
                agileDelegate.release(agileDelegate.f51913a);
            } catch (Throwable unused) {
            }
        }
    }

    public C18807a(C18808a aVar) {
        this.f51960f = aVar.f51962a;
        this.f51961g = aVar.f51970i;
        AgileDelegate agileDelegate = new AgileDelegate(aVar.f51963b, aVar.f51965d, aVar.f51964c, C18826g.m45919a(this.f51960f), C18831l.m45924a(this.f51960f), aVar.f51968g, aVar.f51969h, aVar.f51970i, aVar.f51971j);
        this.f51959a = agileDelegate;
        this.f51974d = aVar.f51965d;
        mo38403a(aVar.f51966e);
        mo38404a(aVar.f51967f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38401a(C18816f fVar) {
        String c = m45878c(fVar);
        AgileDelegate agileDelegate = this.f51959a;
        if (agileDelegate.f51913a != 0) {
            try {
                agileDelegate.write(agileDelegate.f51913a, c);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private String m45878c(C18816f fVar) {
        String str;
        String str2;
        String str3;
        C18816f fVar2 = fVar;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            str = this.f51975e.format(Long.valueOf(currentTimeMillis));
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Locale locale = Locale.ENGLISH;
            String str4 = "[%s][%d:%d%s][%s][%s][%s, %s, %s]%s\n";
            Object[] objArr = new Object[10];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(Process.myPid());
            objArr[2] = Long.valueOf(fVar2.f51989e);
            if (fVar2.f51990f) {
                str3 = "*";
            } else {
                str3 = "";
            }
            objArr[3] = str3;
            objArr[4] = C18832g.m45925a(fVar2.f51986b);
            objArr[5] = fVar2.f51987c;
            objArr[6] = fVar2.f51994j;
            objArr[7] = fVar2.f51995k;
            objArr[8] = fVar2.f51996l;
            objArr[9] = fVar2.f51988d;
            return C2240a.m6773a(locale, str4, objArr);
        }
        long j = currentTimeMillis % 1000;
        long j2 = currentTimeMillis / 1000;
        long j3 = j2 % 60;
        long j4 = j2 / 60;
        long j5 = j4 % 60;
        long j6 = (j4 / 60) % 24;
        StringBuilder sb = new StringBuilder("2099-09-09 GMT+00:00 ");
        sb.append(j6);
        sb.append(":");
        sb.append(j5);
        sb.append(":");
        sb.append(j3);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(j);
        String sb2 = sb.toString();
        Locale locale2 = Locale.ENGLISH;
        String str5 = "[%s][%d:%d%s][%s][%s][%s, %s, %s]%s\n";
        Object[] objArr2 = new Object[10];
        objArr2[0] = sb2;
        objArr2[1] = Integer.valueOf(Process.myPid());
        objArr2[2] = Long.valueOf(fVar2.f51989e);
        if (fVar2.f51990f) {
            str2 = "*";
        } else {
            str2 = "";
        }
        objArr2[3] = str2;
        objArr2[4] = C18832g.m45925a(fVar2.f51986b);
        objArr2[5] = fVar2.f51987c;
        objArr2[6] = fVar2.f51994j;
        objArr2[7] = fVar2.f51995k;
        objArr2[8] = fVar2.f51996l;
        StringBuilder sb3 = new StringBuilder("_");
        sb3.append(currentTimeMillis);
        sb3.append("_:");
        sb3.append(fVar2.f51988d);
        objArr2[9] = sb3.toString();
        return C2240a.m6773a(locale2, str5, objArr2);
    }
}
