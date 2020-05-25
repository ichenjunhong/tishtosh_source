package com.p683ss.android.ugc.aweme.commercialize.splash.livesplash;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.keva.Keva;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.commercialize.splash.ClearDataOptimizeExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.util.C47625i;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.b */
public class C26231b {

    /* renamed from: b */
    private static final long f69259b = TimeUnit.DAYS.toMillis(3);

    /* renamed from: c */
    private static final long f69260c = TimeUnit.DAYS.toMillis(14);

    /* renamed from: f */
    private static String f69261f;

    /* renamed from: g */
    private static String f69262g;

    /* renamed from: h */
    private static String f69263h = "awemes.json";

    /* renamed from: a */
    public Keva f69264a;

    /* renamed from: d */
    private C17971f f69265d = new C17971f();

    /* renamed from: e */
    private volatile Map<String, Aweme> f69266e;

    /* renamed from: i */
    private long f69267i;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo53886c() {
        if (this.f69264a != null) {
            return this.f69264a.getBoolean("live_awesome_splash_filter_enable", false);
        }
        return false;
    }

    /* renamed from: a */
    public final Map<String, Aweme> mo53883a() {
        if (this.f69266e == null) {
            synchronized (C26231b.class) {
                if (this.f69266e == null) {
                    this.f69266e = m63562e();
                }
            }
        }
        return this.f69266e;
    }

    /* renamed from: f */
    private static String m63563f() {
        StringBuilder sb = new StringBuilder();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f69262g);
            sb2.append(f69263h);
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

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Aweme mo53887d() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        for (Aweme aweme : mo53883a().values()) {
            LiveAwesomeSplashInfo f = C26235d.m63575f(aweme);
            if (f != null && f.getTopviewValid() && currentTimeMillis <= f.getEndTime() && currentTimeMillis >= f.getStartTime()) {
                return aweme;
            }
        }
        return null;
    }

    /* renamed from: e */
    private Map<String, Aweme> m63562e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            String f = m63563f();
            if (TextUtils.isEmpty(f)) {
                f = null;
            }
            if (!TextUtils.isEmpty(f)) {
                Map map = (Map) this.f69265d.mo34885a(f, new C17956a<Map<String, Aweme>>() {
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
            sb2.append(f69262g);
            sb2.append(f69263h);
            File file = new File(sb2.toString());
            if (file.exists()) {
                file.delete();
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: g */
    private void m63564g() {
        File file = new File(f69262g);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f69262g);
        sb.append(f69263h);
        File file2 = new File(sb.toString());
        try {
            if ((mo53883a() == null || mo53883a().size() == 0) && C10181b.m20511a().mo18172a(ClearDataOptimizeExperiment.class, true, "clear_splash_data_optimize_enable", 31744, true)) {
                if (file2.exists()) {
                    file2.delete();
                }
                return;
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write(this.f69265d.mo34890b(mo53883a(), new C17956a<Map<String, Aweme>>() {
            }.f49843c));
            bufferedWriter.close();
        } catch (IOException unused) {
        } catch (OutOfMemoryError e) {
            StringBuilder sb2 = new StringBuilder("AwesomeSplash OutOfMemoryError:");
            sb2.append(e.toString());
            C47625i.m103103a(sb2.toString());
            C32458a.m75148a((Throwable) e);
        }
    }

    /* renamed from: b */
    public final void mo53885b() {
        if (this.f69267i == 0 && this.f69264a != null) {
            this.f69267i = this.f69264a.getLong("live_awesome_splash_last_clean_time", 0);
        }
        long j = this.f69267i;
        boolean z = false;
        if (j == 0 || System.currentTimeMillis() - j >= f69259b) {
            if (this.f69264a != null) {
                this.f69264a.storeLong("live_awesome_splash_last_clean_time", System.currentTimeMillis());
            }
            File[] listFiles = new File(f69261f).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.exists() && file.isFile() && System.currentTimeMillis() - file.lastModified() >= f69260c && !m63560a(file.getName())) {
                        file.delete();
                    }
                }
            }
        }
        if (mo53883a() == null || mo53883a().size() == 0) {
            m63564g();
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str : mo53883a().keySet()) {
            Aweme aweme = (Aweme) mo53883a().get(str);
            if (aweme != null) {
                if (!C26235d.m63574e(aweme)) {
                    hashMap.put(str, aweme);
                } else if (m63561b(aweme.getAid())) {
                    String aid = aweme.getAid();
                    String str2 = f69261f;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(aid);
                    File file2 = new File(sb.toString());
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
            z = true;
        }
        if (z) {
            mo53883a().clear();
            mo53883a().putAll(hashMap);
            m63564g();
        }
    }

    C26231b(String str) {
        f69261f = str;
        StringBuilder sb = new StringBuilder();
        sb.append(f69261f);
        sb.append("awemeJson/");
        f69262g = sb.toString();
        this.f69264a = Keva.getRepo("live_awesome_splash", 0);
        C11016e.m22309d().mo6545f((C1710e<? super T>) new C26234c<Object>(this));
    }

    /* renamed from: a */
    static boolean m63559a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        Video video = aweme.getVideo();
        if (video == null) {
            return false;
        }
        VideoUrlModel playAddr = video.getPlayAddr();
        if (playAddr == null || C9376b.m18558a((Collection<T>) playAddr.getUrlList())) {
            return false;
        }
        if (TextUtils.isEmpty(C26237e.m63579b().mo53881a(aweme.getAid()))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m63561b(String str) {
        for (String str2 : mo53883a().keySet()) {
            Aweme aweme = (Aweme) mo53883a().get(str2);
            if (aweme != null && TextUtils.equals(str, aweme.getAid()) && !C26235d.m63574e(aweme)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m63560a(String str) {
        for (Entry value : mo53883a().entrySet()) {
            Aweme aweme = (Aweme) value.getValue();
            if (aweme != null && TextUtils.equals(aweme.getAid(), str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo53884a(List<Aweme> list) {
        for (Aweme aweme : list) {
            boolean z = false;
            if (aweme != null) {
                AwemeStatus status = aweme.getStatus();
                status.setPrivateStatus(0);
                status.setAllowComment(true);
                status.setAllowShare(true);
            }
            if (aweme != null) {
                LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
                if (liveAwesomeSplashInfo != null && liveAwesomeSplashInfo.isTopViewData()) {
                    z = true;
                }
            }
            if (z) {
                String aid = aweme.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    mo53883a().put(aid, aweme);
                }
            }
        }
        m63564g();
    }
}
