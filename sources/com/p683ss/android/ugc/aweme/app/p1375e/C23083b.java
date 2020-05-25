package com.p683ss.android.ugc.aweme.app.p1375e;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.crash.C9544a;
import com.bytedance.crash.C9571d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p723j.C11530d;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.deviceregister.p1154a.C19005d;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.services.C23160h;
import com.p683ss.android.ugc.aweme.common.p1597i.C26897a;
import com.p683ss.android.ugc.aweme.live.C36065d;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.memory.p1947a.C36769a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p683ss.android.ugc.aweme.utils.C47689aw;
import com.p683ss.android.ugc.aweme.utils.C47689aw.C47698f;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.app.e.b */
public final class C23083b implements C9544a {

    /* renamed from: a */
    private Map<String, String> f61486a = new HashMap();

    /* renamed from: b */
    private C9544a f61487b;

    /* renamed from: a */
    private static Map<String, String> m56623a(Map<String, String> map) {
        if (map != null && !map.containsKey("curUserId") && C20854a.m53167g().isLogin()) {
            map.put("curUserId", C20854a.m53167g().getCurUserId());
            if (C20854a.m53167g().getCurUser() != null) {
                map.put("shortId", C20854a.m53167g().getCurUser().getShortId());
                map.put("nickname", C20854a.m53167g().getCurUser().getNickname());
            }
        }
        return map;
    }

    /* renamed from: a */
    public final Map<? extends String, ? extends String> mo17347a(C9571d dVar) {
        if (dVar == C9571d.JAVA || dVar == C9571d.LAUNCH || dVar == C9571d.NATIVE) {
            C47698f e = C47689aw.m103224e();
            if (e != null) {
                this.f61486a.put("vmPeak", String.valueOf(e.f120188a));
                this.f61486a.put("vmSize", String.valueOf(e.f120189b));
                this.f61486a.put("fdCount", String.valueOf(e.f120191d));
                this.f61486a.put("maxFdCount", String.valueOf(e.f120190c));
                this.f61486a.put("threadCount", String.valueOf(e.f120192e));
            }
        }
        this.f61486a.put("root", String.valueOf(C47689aw.m103225f()));
        if (TextUtils.equals(C11010c.m22295p(), "local_test") && !TextUtils.isEmpty(C36769a.m82756a())) {
            this.f61486a.put("mapping", C36769a.m82756a());
        }
        this.f61486a.put("librarian", Arrays.toString(C11530d.getErrors()));
        this.f61486a.put("class_loader", getClass().getClassLoader().toString());
        return m56623a(this.f61486a);
    }

    public C23083b(Context context, C9544a aVar) {
        String str;
        this.f61487b = aVar;
        IAVSettingsService avsettingsConfig = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig();
        this.f61486a.put("git_sha", C11010c.m22291l());
        this.f61486a.put("git_branch", C11010c.m22290k());
        this.f61486a.put("abi", System.getProperty("os.arch"));
        this.f61486a.put("veSdk", avsettingsConfig.getVESDKVersion());
        this.f61486a.put("effectSdk", avsettingsConfig.getEffectVersion());
        this.f61486a.put("player_type", String.valueOf(C50109a.m108068s().mo95420a()));
        this.f61486a.put("preloader_type", String.valueOf(C50109a.m108068s().mo95427h()));
        this.f61486a.put("ttplayer_version", "295682");
        this.f61486a.put("release_build", C19005d.m46178a());
        this.f61486a.put("real_machine", String.valueOf(C26897a.m65024a()));
        String a = C23160h.m56752a(context).mo47873a("JENKINS_BUILD_RESULT", "");
        if (!TextUtils.isEmpty(a)) {
            this.f61486a.put("jenkins_build_result", a);
        }
        this.f61486a.putAll(AVExternalServiceImpl.getAVServiceImpl_Monster().provideErrorReporter().retrieveUserData(context));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append("&&");
        sb.append(Build.BRAND);
        sb.append("&&");
        sb.append(Build.MODEL);
        sb.append("&&");
        sb.append(Build.FINGERPRINT);
        this.f61486a.put("device_info", sb.toString());
        Map a2 = this.f61487b.mo17347a(C9571d.ALL);
        if (a2 != null) {
            this.f61486a.putAll(a2);
        }
        if (C18920g.m46048a(context)) {
            C36065d live = C36173w.m81665a().getLive();
            Map<String, String> map = this.f61486a;
            String str2 = "liveCoreSdk";
            if (live != null) {
                str = live.mo15059l();
            } else {
                str = "";
            }
            map.put(str2, str);
            m56623a(this.f61486a);
        }
    }
}
