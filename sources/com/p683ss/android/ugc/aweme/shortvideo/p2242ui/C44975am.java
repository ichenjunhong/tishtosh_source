package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.sticker.C45893i;
import com.p683ss.android.ugc.aweme.story.shootvideo.C46668c;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.am */
public final class C44975am implements C45893i {

    /* renamed from: a */
    private FragmentActivity f113906a;

    /* renamed from: b */
    private C50048n f113907b;

    /* renamed from: d */
    public final ShortVideoContext mo91264d() {
        return m98316h().f107134a;
    }

    /* renamed from: h */
    private ShortVideoContextViewModel m98316h() {
        return (ShortVideoContextViewModel) C0214z.m440a(this.f113906a).mo359a(ShortVideoContextViewModel.class);
    }

    /* renamed from: a */
    public final LiveData<Boolean> mo91260a() {
        return m98316h().mo86398g();
    }

    /* renamed from: f */
    public final C42482c mo91266f() {
        return C43214dh.m94817a().mo50201b();
    }

    /* renamed from: b */
    public final boolean mo91262b() {
        if (((Boolean) m98316h().mo86382a("native_inited")) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final LiveData<Boolean> mo91263c() {
        ShortVideoContextViewModel h = m98316h();
        if (h.f107135b == null) {
            h.f107135b = new C0198r<>();
        }
        return h.f107135b;
    }

    /* renamed from: e */
    public final boolean mo91265e() {
        int i;
        Integer num = (Integer) m98316h().mo86382a("shoot_mode");
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        return C46668c.m101263a(i);
    }

    /* renamed from: g */
    public final LiveData<Double> mo91267g() {
        ShortVideoContextViewModel h = m98316h();
        if (h.f107137d == null) {
            h.f107137d = new C0198r<>();
        }
        return h.f107137d;
    }

    /* renamed from: a */
    public final void mo91261a(List<String> list) {
        if (this.f113907b != null) {
            this.f113907b.mo97797B().mo97787a(list);
        }
    }

    public C44975am(FragmentActivity fragmentActivity, C50048n nVar) {
        this.f113906a = fragmentActivity;
        this.f113907b = nVar;
    }
}
