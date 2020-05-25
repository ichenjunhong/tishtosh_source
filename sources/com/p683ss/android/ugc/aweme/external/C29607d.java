package com.p683ss.android.ugc.aweme.external;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.services.video.IActivityNameService;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VEVideoPublishPreviewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoPublishActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordPermissionActivity;
import com.p683ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.external.d */
public final class C29607d implements IActivityNameService {

    /* renamed from: a */
    public static final C52668f f77459a = C52732g.m112285a(C29609b.f77462a);

    /* renamed from: b */
    public static final C29608a f77460b = new C29608a(null);

    /* renamed from: com.ss.android.ugc.aweme.external.d$a */
    public static final class C29608a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f77461a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29608a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/external/ActivityNameServiceImpl;"))};

        private C29608a() {
        }

        public /* synthetic */ C29608a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.d$b */
    static final class C29609b extends C52712l implements C52670a<C29607d> {

        /* renamed from: a */
        public static final C29609b f77462a = new C29609b();

        C29609b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29607d(null);
        }
    }

    private C29607d() {
    }

    public final Class<? extends Activity> getDraftBoxActivity() {
        return DraftBoxActivity.class;
    }

    public final Class<? extends Activity> getVideoPublishActivityClass() {
        return VideoPublishActivity.class;
    }

    public final Class<? extends Activity> getVideoPublishPreviewActivityClass() {
        return VEVideoPublishPreviewActivity.class;
    }

    public final Class<? extends Activity> getVideoRecordActivityClass() {
        return VideoRecordNewActivity.class;
    }

    public final Class<? extends Activity> getVideoRecordPermissionActivityClass() {
        return VideoRecordPermissionActivity.class;
    }

    public /* synthetic */ C29607d(C52707g gVar) {
        this();
    }
}
