package com.p683ss.android.ugc.aweme.awemeservice.p1392a;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.bytedance.common.utility.p524d.C9398b;
import com.bytedance.common.utility.p526f.C9407a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.p1057b.p1059b.C17443b;
import com.google.p1057b.p1059b.C17444c;
import com.google.p1057b.p1059b.C17454g.C17495p;
import com.google.p1057b.p1059b.C17522m;
import com.p683ss.android.ugc.aweme.awemeservice.experiment.AsyncSaveDiskExperiment;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
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
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.g */
public final class C23315g implements C23309b<String> {

    /* renamed from: a */
    C17443b<String, Aweme> f62314a = C17444c.m42708a().mo33777a(C17495p.WEAK).mo33776a(200).mo33778a((C17522m<? super K1, ? super V1>) new C23318i<Object,Object>(this)).mo33781d();

    /* renamed from: b */
    private C17443b<String, Aweme> f62315b = C17444c.m42708a().mo33776a(100).mo33778a((C17522m<? super K1, ? super V1>) new C23317h<Object,Object>(this)).mo33781d();

    /* renamed from: c */
    private C47710bc f62316c;

    /* renamed from: d */
    private Map<String, Object> f62317d;

    /* renamed from: e */
    private ExecutorService f62318e = C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49845a("AwemeLruMemoryAndDiskCache").mo49847a());

    /* renamed from: a */
    public final Collection<Aweme> mo48351a() {
        return this.f62315b.mo33773a().values();
    }

    /* renamed from: b */
    public final void mo48353b() {
        try {
            C47723bk.m103315c(m57352a(C11010c.m22280a(), "awemeCache").getAbsolutePath());
        } catch (Exception unused) {
        }
    }

    public C23315g() {
        try {
            File a = m57352a(C11010c.m22280a(), "awemeCache");
            if (a.exists()) {
                C47723bk.m103315c(a.getAbsolutePath());
            }
            this.f62316c = C47710bc.m103257a(a, MainServiceImpl.createIMainServicebyMonsterPlugin().getAppVersionCode(), 1, 52428800);
            this.f62317d = (Map) C9407a.m18598a((Object) this.f62316c, "lruEntries");
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean mo48354b(String str) {
        try {
            if (this.f62315b.mo33771a(str) == null && this.f62314a.mo33771a(str) == null && !m57356d(str)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private Aweme m57354c(String str) {
        Aweme aweme;
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        if (this.f62316c == null) {
            return null;
        }
        try {
            C47715c a = this.f62316c.mo94993a(str);
            if (a == null) {
                C9398b.m18586a((Closeable) null);
                return null;
            }
            objectInputStream = new ObjectInputStream(a.mo95015a(0));
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
            return aweme;
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
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Aweme mo48350a(String str) {
        Aweme aweme = (Aweme) this.f62315b.mo33771a(str);
        if (aweme == null) {
            aweme = (Aweme) this.f62314a.mo33771a(str);
            if (aweme != null) {
                mo48352a(str, aweme);
                this.f62314a.mo33775b(str);
            }
        }
        if (aweme == null) {
            aweme = m57354c(str);
            if (aweme != null) {
                mo48352a(str, aweme);
            }
            StringBuilder sb = new StringBuilder("get Aweme from diskCache， awemeId = ");
            sb.append(str);
            C32458a.m75141a(4, "AwemeLruCache", sb.toString());
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
            } catch (Exception unused) {
            }
        }
        return aweme;
    }

    /* renamed from: d */
    private boolean m57356d(String str) {
        boolean z = false;
        if (this.f62316c == null || this.f62316c.mo94998c()) {
            return false;
        }
        if (!MainServiceImpl.createIMainServicebyMonsterPlugin().isContainsKeyWithLruEntries()) {
            try {
                C47715c a = this.f62316c.mo94993a(str);
                if (a != null) {
                    z = true;
                }
                if (a != null) {
                    a.close();
                }
            } catch (Exception unused) {
            }
            return z;
        } else if (this.f62317d == null) {
            return false;
        } else {
            Object obj = this.f62317d.get(str);
            if (obj == null) {
                return false;
            }
            return ((Boolean) C9407a.m18598a(obj, "readable")).booleanValue();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo48352a(String str, Aweme aweme) {
        this.f62315b.mo33774a(str, aweme);
    }

    /* renamed from: a */
    private static File m57352a(Context context, String str) {
        String path = context.getCacheDir().getPath();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append(File.separator);
        sb.append(str);
        return new File(sb.toString());
    }

    /* renamed from: b */
    public final void mo48360b(String str, Aweme aweme) {
        if (this.f62316c != null) {
            ObjectOutputStream objectOutputStream = null;
            try {
                C47712a b = this.f62316c.mo94996b(str);
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

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo48359a(final String str, final Aweme aweme) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread() || C10181b.m20511a().mo18172a(AsyncSaveDiskExperiment.class, true, "enable_async_put_aweme_disk_cache", 31744, true)) {
            this.f62318e.submit(new Runnable() {
                public final void run() {
                    try {
                        C23315g.this.mo48360b(str, aweme);
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            mo48360b(str, aweme);
        }
    }
}
