package com.p683ss.android.ugc.aweme.share;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.MuteDownloadForJapanExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.music.model.Music;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.share.t */
public final class C42233t {

    /* renamed from: b */
    public static final C42234a f106768b = new C42234a(null);

    /* renamed from: a */
    public C42235b f106769a;

    /* renamed from: com.ss.android.ugc.aweme.share.t$a */
    public static final class C42234a {
        private C42234a() {
        }

        public /* synthetic */ C42234a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m92671a(Aweme aweme) {
            if (aweme == null) {
                return false;
            }
            Music music = aweme.getMusic();
            if (music == null || !music.isPreventDownload() || !C35837h.m80982g() || !C10181b.m20511a().mo18172a(MuteDownloadForJapanExperiment.class, false, "download_video_with_mute", 31744, false)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static void m92670a(String str, String str2, String str3, String str4, String str5) {
            C26890h.m65011a("download_alert", C23089d.m56640a().mo47829a("group_id", str).mo47829a("author_id", str2).mo47829a("enter_from", str3).mo47829a("download_method", str4).mo47829a("action_type", str5).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.t$b */
    public interface C42235b {
        /* renamed from: a */
        void mo86127a();

        /* renamed from: b */
        void mo86128b();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.t$c */
    public static final class C42236c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42233t f106770a;

        public C42236c(C42233t tVar) {
            this.f106770a = tVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C42235b bVar = this.f106770a.f106769a;
            if (bVar != null) {
                bVar.mo86127a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.t$d */
    public static final class C42237d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42233t f106771a;

        public C42237d(C42233t tVar) {
            this.f106771a = tVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C42235b bVar = this.f106771a.f106769a;
            if (bVar != null) {
                bVar.mo86128b();
            }
        }
    }
}
