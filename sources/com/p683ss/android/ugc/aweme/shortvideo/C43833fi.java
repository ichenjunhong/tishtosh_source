package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.ttuploader.TTVideoUploader;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fi */
public final class C43833fi {

    /* renamed from: a */
    private static C43835a f110998a = new C43836b();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.fi$a */
    public interface C43835a {
        /* renamed from: a */
        void mo89353a(TTVideoUploader tTVideoUploader, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.fi$b */
    static class C43836b implements C43835a {
        private C43836b() {
        }

        /* renamed from: a */
        public final void mo89353a(TTVideoUploader tTVideoUploader, int i) {
            tTVideoUploader.setEnableHttps(i);
        }
    }

    /* renamed from: a */
    public static void m96265a(TTVideoUploader tTVideoUploader, int i) {
        f110998a.mo89353a(tTVideoUploader, i);
    }
}
