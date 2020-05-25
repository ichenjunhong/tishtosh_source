package com.p683ss.android.ugc.gamora.recorder.p2481o;

import com.bytedance.common.utility.p524d.C9398b;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.story.shootvideo.publish.C46671a;
import java.io.File;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.gamora.recorder.o.f */
public final class C49937f {

    /* renamed from: a */
    public static final C49937f f125125a = new C49937f();

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.f$a */
    public static final class C49938a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C29059c f125126a;

        public C49938a(C29059c cVar) {
            this.f125126a = cVar;
        }

        public final /* synthetic */ Object call() {
            C9398b.m18587a(this.f125126a.mo58742S().getVideoCoverImgPath());
            C9398b.m18587a(this.f125126a.mo58742S().getEffectPath());
            C9398b.m18587a(this.f125126a.mo58742S().getBgPath());
            C9398b.m18587a(this.f125126a.mo58742S().getMusicPath());
            return C52860x.f131107a;
        }
    }

    private C49937f() {
    }

    /* renamed from: a */
    public static String m107756a(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        File file = new File(str);
        if (file.exists()) {
            String[] list = file.list();
            C52711k.m112236a((Object) list, "file.list()");
            if (C52568f.m112077a((Object[]) list, (Object) "bgimg.json")) {
                String a = C46671a.m101267a(new File(str, "bgimg.json"));
                C52711k.m112236a((Object) a, "BaseFileUtils.readFileFo…ng(File(path, JSON_NAME))");
                return new File(str, new JSONObject(C52830p.m112447b(a).toString()).optString(LeakCanaryFileProvider.f132050j, "")).getPath();
            }
        }
        return null;
    }
}
