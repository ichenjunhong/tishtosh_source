package com.p683ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.retrofit2.mime.TypedFile;
import okhttp3.C53679x.C53681b;
import p001a.C0013i;
import p2666g.p2672c.C53070a;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53080k;
import p2666g.p2672c.C53081l;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53086q;
import p2666g.p2672c.C53089t;
import p2666g.p2672c.C53093x;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi */
public interface SubtitleApi {

    /* renamed from: a */
    public static final C44767a f113305a = C44767a.f113306a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi$a */
    public static final class C44767a {

        /* renamed from: a */
        static final /* synthetic */ C44767a f113306a = new C44767a();

        private C44767a() {
        }
    }

    @C53080k(mo110609a = {"Content-Type: application/json"})
    @C53084o(mo110612a = "/aweme/v1/videocaption/feedback/")
    C0013i<C44861e> feedback(@C53089t(mo110619a = "vid") String str, @C53089t(mo110619a = "aweme_id") String str2, @C53089t(mo110619a = "task_id") String str3, @C53070a C44857a aVar);

    @C53075f(mo110603a = "/api/v1/vc/query")
    C0013i<C44859c> queryAudio(@C53089t(mo110619a = "appid") String str, @C53089t(mo110619a = "token") String str2, @C53089t(mo110619a = "id") String str3);

    @C53080k(mo110609a = {"Content-Type: audio/m4a"})
    @C53081l
    @C53084o(mo110612a = "/api/v1/vc/submit")
    C0013i<C44861e> submitAudio(@C53089t(mo110619a = "appid") String str, @C53089t(mo110619a = "token") String str2, @C53089t(mo110619a = "words_per_line") int i, @C53089t(mo110619a = "max_lines") int i2, @C53086q TypedFile typedFile);

    @C53080k(mo110609a = {"Content-Type: application/json"})
    @C53084o(mo110612a = "/api/v1/vc/submit")
    C0013i<C44861e> submitAudio(@C53089t(mo110619a = "appid") String str, @C53089t(mo110619a = "token") String str2, @C53089t(mo110619a = "words_per_line") int i, @C53089t(mo110619a = "max_lines") int i2, @C53070a C44862f fVar);

    @C53080k(mo110609a = {"Content-Type: audio/m4a"})
    @C53081l
    @C53084o
    C0013i<C44861e> submitAudio(@C53093x String str, @C53086q C53681b bVar);
}
