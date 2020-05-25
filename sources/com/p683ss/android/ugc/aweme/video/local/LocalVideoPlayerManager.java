package com.p683ss.android.ugc.aweme.video.local;

import android.arch.lifecycle.C0183j;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.live.C2942b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1077b.C17956a;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1062e.C17736e;
import com.google.p1057b.p1062e.C17737f.C17741a;
import com.google.p1057b.p1062e.C17737f.C17742b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.video.experiment.EnableLocalVideoPlayExperiment;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager */
public class LocalVideoPlayerManager implements C0183j {

    /* renamed from: b */
    private static final String f120740b = "LocalVideoPlayerManager";

    /* renamed from: c */
    private static LocalVideoPlayerManager f120741c;

    /* renamed from: a */
    public C48050b f120742a = new C48050b();

    /* renamed from: d */
    private AtomicBoolean f120743d = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager$a */
    public interface C48046a {
        /* renamed from: a */
        void mo90292a();

        /* renamed from: a */
        void mo90293a(String str);
    }

    /* renamed from: b */
    public final void mo95316b() {
        m104051c();
    }

    private LocalVideoPlayerManager() {
    }

    /* renamed from: a */
    public static LocalVideoPlayerManager m104046a() {
        if (f120741c == null) {
            synchronized (LocalVideoPlayerManager.class) {
                if (f120741c == null) {
                    f120741c = new LocalVideoPlayerManager();
                }
            }
        }
        return f120741c;
    }

    /* renamed from: f */
    private static boolean m104054f() {
        return C10181b.m20511a().mo18172a(EnableLocalVideoPlayExperiment.class, true, "is_local_video_play_enable", 31744, true);
    }

    /* renamed from: c */
    private void m104051c() {
        try {
            m104053e();
            SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "aweme_local_video", 0);
            a.edit().putString("extra_data", C2942b.m8369a().mo34889b(this.f120742a.f120756a)).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private Map<String, C48062f> m104052d() {
        Map<String, C48062f> map = null;
        try {
            String string = C35807d.m80935a(C11010c.m22280a(), "aweme_local_video", 0).getString("extra_data", null);
            if (!TextUtils.isEmpty(string)) {
                map = (Map) C2942b.m8369a().mo34885a(string, new C17956a<HashMap<String, C48062f>>() {
                }.f49843c);
            }
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private void m104053e() {
        if (m104054f() && !this.f120743d.get()) {
            Map d = m104052d();
            synchronized (this) {
                if (this.f120743d.compareAndSet(false, true) && d != null && !d.isEmpty()) {
                    this.f120742a.mo95326a(d.values());
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo95314a(long j) {
        m104053e();
        return this.f120742a.mo95327a(j);
    }

    /* renamed from: a */
    private C48062f m104047a(Aweme aweme) {
        return m104048a(aweme.getAid(), aweme.getAuthorUid(), aweme.isVr(), aweme.getVideo());
    }

    /* renamed from: b */
    private boolean m104050b(String str) {
        boolean z;
        if (TextUtils.isEmpty(str) || !m104054f()) {
            return false;
        }
        C48062f a = this.f120742a.mo95323a(str);
        if (a == null) {
            z = false;
        } else {
            z = TextUtils.equals(a.f120779b, C20854a.m53167g().getCurUserId());
        }
        if (!z) {
            return false;
        }
        boolean b = this.f120742a.mo95329b(this.f120742a.mo95323a(str));
        if (b) {
            this.f120742a.mo95328b(str);
        }
        if (!b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String mo95312a(String str) {
        m104053e();
        if (!m104050b(str)) {
            return null;
        }
        C48062f a = this.f120742a.mo95323a(str);
        if (a == null) {
            return "";
        }
        return a.f120778a;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m104049a(String str, String str2) throws Exception {
        File file = new File(str);
        File file2 = new File(str2);
        try {
            C17421k.m42665a(!file.equals(file2), "Source %s and destination %s must be different", (Object) file, (Object) file2);
            new C17742b(file, null).mo34508a(new C17741a(file2, new C17736e[0], null));
        } catch (IOException e) {
            C0013i.m13a((Exception) e);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo95313a(String str, Aweme aweme) {
        if (m104054f() && aweme != null) {
            m104053e();
            C48062f a = m104047a(aweme);
            a.f120778a = str;
            this.f120742a.mo95325a(a);
            mo95316b();
        }
    }

    /* renamed from: a */
    public final boolean mo95315a(String str, String str2, C48046a aVar) {
        String a = mo95312a(str);
        boolean z = !TextUtils.isEmpty(a);
        if (z) {
            C0013i.m16a((Callable<TResult>) new C48060d<TResult>(a, str2)).mo20a((C0011g<TResult, TContinuationResult>) new C48061e<TResult,TContinuationResult>(aVar, str2), C0013i.f25b);
        }
        return z;
    }

    /* renamed from: a */
    private static C48062f m104048a(String str, String str2, boolean z, Video video) {
        boolean z2;
        C48062f fVar = new C48062f(str);
        fVar.f120779b = str2;
        fVar.setVr(z);
        if (video != null) {
            fVar.setDuration((double) video.getDuration());
            fVar.setWidth(video.getWidth());
            fVar.setHeight(video.getHeight());
            if (video.getProperPlayAddr() != null) {
                fVar.setUri(video.getProperPlayAddr().getUri());
                if (video.getPlayAddrH265() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                fVar.setH265(z2);
            }
        }
        return fVar;
    }
}
