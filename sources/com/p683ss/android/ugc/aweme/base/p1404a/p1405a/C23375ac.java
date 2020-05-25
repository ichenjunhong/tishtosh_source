package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38055e;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ac */
final class C23375ac implements C38055e {

    /* renamed from: a */
    private Context f62388a;

    /* renamed from: b */
    private Keva f62389b = Keva.getRepoFromSp(this.f62388a, "TutorialVideoPreference", 0);

    /* renamed from: b */
    public final void mo48440b(String str) {
        this.f62389b.storeString("tutorial_video_aweme_id", str);
    }

    /* renamed from: d */
    public final void mo48442d(String str) {
        this.f62389b.storeString("tutorial_video_title", str);
    }

    /* renamed from: f */
    public final void mo48444f(String str) {
        this.f62389b.storeString("tutorial_video_content", str);
    }

    /* renamed from: h */
    public final void mo48446h(String str) {
        this.f62389b.storeString("tutorial_video_button", str);
    }

    /* renamed from: a */
    public final String mo48439a(String str) {
        return this.f62389b.getString("tutorial_video_aweme_id", str);
    }

    /* renamed from: c */
    public final String mo48441c(String str) {
        return this.f62389b.getString("tutorial_video_title", str);
    }

    /* renamed from: e */
    public final String mo48443e(String str) {
        return this.f62389b.getString("tutorial_video_content", str);
    }

    /* renamed from: g */
    public final String mo48445g(String str) {
        return this.f62389b.getString("tutorial_video_button", str);
    }

    public C23375ac(Context context) {
        this.f62388a = context;
    }
}
