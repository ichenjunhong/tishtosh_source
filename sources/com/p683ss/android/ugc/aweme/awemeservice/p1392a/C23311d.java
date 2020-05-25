package com.p683ss.android.ugc.aweme.awemeservice.p1392a;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.bytedance.common.utility.p524d.C9398b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.p1057b.p1059b.C17443b;
import com.google.p1057b.p1059b.C17444c;
import com.google.p1057b.p1059b.C17522m;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47710bc;
import com.p683ss.android.ugc.aweme.utils.C47710bc.C47712a;
import com.p683ss.android.ugc.aweme.utils.C47710bc.C47715c;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import java.io.Closeable;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.d */
public final class C23311d implements C23309b<String> {

    /* renamed from: a */
    private C17443b<String, Aweme> f62307a = C17444c.m42708a().mo33776a(100).mo33778a((C17522m<? super K1, ? super V1>) new C23313e<Object,Object>(this)).mo33781d();

    /* renamed from: b */
    private C47710bc f62308b;

    /* renamed from: a */
    public final Collection<Aweme> mo48351a() {
        return this.f62307a.mo33773a().values();
    }

    /* renamed from: b */
    public final void mo48353b() {
        try {
            C47723bk.m103315c(m57338a(C11010c.m22280a(), "awemeCache").getAbsolutePath());
        } catch (Exception unused) {
        }
    }

    public C23311d() {
        try {
            File a = m57338a(C11010c.m22280a(), "awemeCache");
            if (a.exists()) {
                C47723bk.m103315c(a.getAbsolutePath());
            }
            this.f62308b = C47710bc.m103257a(a, MainServiceImpl.createIMainServicebyMonsterPlugin().getAppVersionCode(), 1, 52428800);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Aweme mo48355a(String str) throws Exception {
        Aweme c = m57341c(str);
        if (c != null) {
            if (this.f62308b != null) {
                try {
                    this.f62308b.mo94999c(str);
                } catch (Exception unused) {
                }
            }
            mo48352a(str, c);
        }
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Aweme mo48350a(String str) {
        Aweme aweme;
        try {
            aweme = (Aweme) this.f62307a.mo33772a(str, (Callable<? extends V>) new C23314f<Object>(this, str));
        } catch (Exception unused) {
            aweme = null;
        }
        if (aweme == null) {
            try {
                JSONObject jSONObject = new JSONObject();
                String stackTraceString = Log.getStackTraceString(new Throwable());
                if (stackTraceString.length() > 4096) {
                    stackTraceString = stackTraceString.substring(0, 4096);
                }
                jSONObject.put("error_stack", stackTraceString);
                jSONObject.put("aid", str);
                C23569o.m57779a("aweme_manager_get_aweme_is_null", jSONObject);
            } catch (Exception unused2) {
            }
        }
        return aweme;
    }

    /* renamed from: c */
    private Aweme m57341c(String str) {
        Aweme aweme;
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        if (this.f62308b == null) {
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(this.f62308b.mo94993a(str).mo95015a(0));
            try {
                aweme = (Aweme) objectInputStream.readObject();
                C9398b.m18586a((Closeable) objectInputStream);
            } catch (Exception unused) {
                C9398b.m18586a((Closeable) objectInputStream);
                aweme = null;
                return aweme;
            } catch (Throwable th) {
                th = th;
                objectInputStream2 = objectInputStream;
                C9398b.m18586a((Closeable) objectInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            objectInputStream = null;
            C9398b.m18586a((Closeable) objectInputStream);
            aweme = null;
            return aweme;
        } catch (Throwable th2) {
            th = th2;
            C9398b.m18586a((Closeable) objectInputStream2);
            throw th;
        }
        return aweme;
    }

    /* renamed from: d */
    private boolean m57342d(String str) {
        boolean z = false;
        if (this.f62308b == null || this.f62308b.mo94998c()) {
            return false;
        }
        try {
            C47715c a = this.f62308b.mo94993a(str);
            if (a != null) {
                z = true;
            }
            if (a != null) {
                a.close();
            }
        } catch (Exception unused) {
        }
        return z;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo48354b(Object obj) {
        String str = (String) obj;
        boolean containsKey = this.f62307a.mo33773a().containsKey(str);
        if (!containsKey) {
            return m57342d(str);
        }
        return containsKey;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo48352a(String str, Aweme aweme) {
        this.f62307a.mo33774a(str, aweme);
    }

    /* renamed from: a */
    private static File m57338a(Context context, String str) {
        String str2;
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            str2 = context.getExternalCacheDir().getPath();
        } else {
            str2 = context.getCacheDir().getPath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(File.separator);
        sb.append(str);
        return new File(sb.toString());
    }

    /* renamed from: a */
    public final void mo48356a(String str, Aweme aweme) {
        if (this.f62308b != null) {
            ObjectOutputStream objectOutputStream = null;
            try {
                C47712a b = this.f62308b.mo94996b(str);
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(b.mo95004a(0));
                try {
                    objectOutputStream2.writeObject(aweme);
                    b.mo95005a();
                    C9398b.m18586a((Closeable) objectOutputStream2);
                } catch (Exception unused) {
                    objectOutputStream = objectOutputStream2;
                    C9398b.m18586a((Closeable) objectOutputStream);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    C9398b.m18586a((Closeable) objectOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
                C9398b.m18586a((Closeable) objectOutputStream);
            } catch (Throwable th2) {
                th = th2;
                C9398b.m18586a((Closeable) objectOutputStream);
                throw th;
            }
        }
    }
}
