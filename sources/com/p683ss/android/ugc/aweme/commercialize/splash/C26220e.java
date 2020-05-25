package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.util.C47625i;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.e */
public class C26220e {

    /* renamed from: b */
    public static String f69244b;

    /* renamed from: c */
    private static final long f69245c = TimeUnit.DAYS.toMillis(3);

    /* renamed from: d */
    private static final long f69246d = TimeUnit.DAYS.toMillis(14);

    /* renamed from: g */
    private static String f69247g;

    /* renamed from: h */
    private static String f69248h = "awemes.json";

    /* renamed from: a */
    public SharedPreferences f69249a;

    /* renamed from: e */
    private C17971f f69250e = new C17971f();

    /* renamed from: f */
    private volatile Map<String, Aweme> f69251f;

    /* renamed from: i */
    private long f69252i;

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo53874d() {
        if (this.f69249a != null) {
            return this.f69249a.getBoolean("awesome_splash_filter_enable", false);
        }
        return false;
    }

    /* renamed from: f */
    private long m63525f() {
        if (this.f69252i == 0 && this.f69249a != null) {
            this.f69252i = this.f69249a.getLong("awesome_splash_last_clean_time", 0);
        }
        return this.f69252i;
    }

    /* renamed from: g */
    private void m63526g() {
        if (this.f69249a != null) {
            this.f69249a.edit().putLong("awesome_splash_last_clean_time", System.currentTimeMillis()).apply();
        }
    }

    /* renamed from: h */
    private static String m63527h() {
        StringBuilder sb = new StringBuilder();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f69247g);
            sb2.append(f69248h);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(sb2.toString())));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    /* renamed from: i */
    private void m63528i() {
        long f = m63525f();
        if (f == 0 || System.currentTimeMillis() - f >= f69245c) {
            m63526g();
            File[] listFiles = new File(f69244b).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.exists() && file.isFile() && System.currentTimeMillis() - file.lastModified() >= f69246d && !m63522c(file.getName())) {
                        file.delete();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final Map<String, Aweme> mo53870a() {
        if (this.f69251f == null) {
            synchronized (C26220e.class) {
                if (this.f69251f == null) {
                    this.f69251f = m63524e();
                }
            }
        }
        return this.f69251f;
    }

    /* renamed from: b */
    public final void mo53872b() {
        m63528i();
        if (mo53870a() == null || mo53870a().size() == 0) {
            mo53873c();
            return;
        }
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (String str : mo53870a().keySet()) {
            Aweme aweme = (Aweme) mo53870a().get(str);
            if (aweme != null) {
                if (!C26512f.m64121W(aweme)) {
                    hashMap.put(str, aweme);
                } else if (m63523d(aweme.getAid())) {
                    m63521a(aweme.getAid(), f69244b);
                }
            }
            z = true;
        }
        if (z) {
            mo53870a().clear();
            mo53870a().putAll(hashMap);
            mo53873c();
        }
    }

    /* renamed from: e */
    private Map<String, Aweme> m63524e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            String h = m63527h();
            if (TextUtils.isEmpty(h)) {
                if (this.f69249a != null) {
                    h = this.f69249a.getString("awesome_splash_info", null);
                    if (!TextUtils.isEmpty(h)) {
                    }
                }
                h = null;
            }
            if (!TextUtils.isEmpty(h)) {
                Map map = (Map) this.f69250e.mo34885a(h, new C17956a<Map<String, Aweme>>() {
                }.f49843c);
                if (map != null) {
                    if (map.size() != 0) {
                        concurrentHashMap.putAll(map);
                    }
                }
                return concurrentHashMap;
            }
        } catch (Exception unused) {
        } catch (OutOfMemoryError e) {
            StringBuilder sb = new StringBuilder("AwesomeSplash OutOfMemoryError:");
            sb.append(e.toString());
            C47625i.m103103a(sb.toString());
            C32458a.m75148a((Throwable) e);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f69247g);
            sb2.append(f69248h);
            File file = new File(sb2.toString());
            if (file.exists()) {
                file.delete();
            }
        }
        return concurrentHashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo53873c() {
        File file = new File(f69247g);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f69247g);
        sb.append(f69248h);
        File file2 = new File(sb.toString());
        boolean z = false;
        try {
            if ((mo53870a() == null || mo53870a().size() == 0) && C10181b.m20511a().mo18172a(ClearDataOptimizeExperiment.class, true, "clear_splash_data_optimize_enable", 31744, true)) {
                if (file2.exists()) {
                    file2.delete();
                }
                return;
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write(this.f69250e.mo34890b(mo53870a(), new C17956a<Map<String, Aweme>>() {
            }.f49843c));
            bufferedWriter.close();
            z = true;
            if (z && this.f69249a != null) {
                this.f69249a.edit().remove("awesome_splash_info").apply();
            }
        } catch (IOException unused) {
        } catch (OutOfMemoryError e) {
            StringBuilder sb2 = new StringBuilder("AwesomeSplash OutOfMemoryError:");
            sb2.append(e.toString());
            C47625i.m103103a(sb2.toString());
            C32458a.m75148a((Throwable) e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Aweme mo53871b(String str) {
        return (Aweme) mo53870a().get(str);
    }

    /* renamed from: a */
    public final Aweme mo53869a(String str) {
        Aweme aweme = (Aweme) mo53870a().get(str);
        if (C26512f.m64121W(aweme)) {
            return null;
        }
        return aweme;
    }

    C26220e(String str) {
        AwemeApplication a = AwemeApplication.m56199a();
        f69244b = str;
        StringBuilder sb = new StringBuilder();
        sb.append(f69244b);
        sb.append("awemeJson/");
        f69247g = sb.toString();
        this.f69249a = C35807d.m80935a(a, "awesome_splash", 0);
        C11016e.m22309d().mo6545f((C1710e<? super T>) new C26223f<Object>(this));
    }

    /* renamed from: c */
    private boolean m63522c(String str) {
        for (Entry value : mo53870a().entrySet()) {
            Aweme aweme = (Aweme) value.getValue();
            if (aweme != null && TextUtils.equals(aweme.getAid(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private boolean m63523d(String str) {
        for (String str2 : mo53870a().keySet()) {
            Aweme aweme = (Aweme) mo53870a().get(str2);
            if (aweme != null && TextUtils.equals(str, aweme.getAid()) && !C26512f.m64121W(aweme)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m63521a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        File file = new File(sb.toString());
        if (file.exists() && file.isFile()) {
            file.delete();
        }
    }
}
