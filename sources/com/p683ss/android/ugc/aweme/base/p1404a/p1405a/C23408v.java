package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36211e;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.v */
final class C23408v implements C36211e {

    /* renamed from: a */
    private Context f62442a;

    /* renamed from: b */
    private Keva f62443b = Keva.getRepoFromSp(this.f62442a, "LiveWallPaper", 0);

    /* renamed from: b */
    public final void mo48502b(int i) {
        this.f62443b.storeInt("current_video_width", i);
    }

    /* renamed from: d */
    public final void mo48506d(int i) {
        this.f62443b.storeInt("current_video_height", i);
    }

    /* renamed from: f */
    public final void mo48509f(String str) {
        this.f62443b.storeString("source", str);
    }

    /* renamed from: a */
    public final int mo48500a(int i) {
        return this.f62443b.getInt("current_video_width", 0);
    }

    /* renamed from: b */
    public final void mo48503b(String str) {
        this.f62443b.storeString("live_wall_paper_list", str);
    }

    /* renamed from: c */
    public final int mo48504c(int i) {
        return this.f62443b.getInt("current_video_height", 0);
    }

    /* renamed from: d */
    public final void mo48507d(String str) {
        this.f62443b.storeString("current_video_path", str);
    }

    /* renamed from: e */
    public final String mo48508e(String str) {
        return this.f62443b.getString("source", str);
    }

    public C23408v(Context context) {
        this.f62442a = context;
    }

    /* renamed from: a */
    public final String mo48501a(String str) {
        return this.f62443b.getString("live_wall_paper_list", str);
    }

    /* renamed from: c */
    public final String mo48505c(String str) {
        return this.f62443b.getString("current_video_path", str);
    }
}
