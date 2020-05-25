package com.p683ss.android.ugc.aweme.music.presenter;

import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.music.api.MusicApi;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.MusicList;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.v */
public final class C37428v implements C9382a {

    /* renamed from: a */
    protected C9381g f95457a;

    /* renamed from: b */
    public int f95458b;

    /* renamed from: c */
    public boolean f95459c = true;

    /* renamed from: d */
    private C37399e f95460d;

    /* renamed from: e */
    private MusicList f95461e;

    /* renamed from: f */
    private boolean f95462f;

    public C37428v(C37399e eVar) {
        this.f95460d = eVar;
        this.f95461e = new MusicList();
        this.f95461e.items = new ArrayList();
        this.f95457a = new C9381g(this);
    }

    /* renamed from: a */
    public final void mo76931a(final String str) {
        if (!this.f95462f) {
            this.f95462f = true;
            C23566n.m57766a().mo48750a(this.f95457a, new Callable() {
                public final Object call() throws Exception {
                    return MusicApi.m83620a(str, C37428v.this.f95458b, 16);
                }
            }, 1010);
        }
    }

    public final void handleMsg(Message message) {
        this.f95462f = false;
        if (message.what == 1010) {
            if (message.obj instanceof Exception) {
                this.f95460d.mo76910a(null);
                return;
            }
            MusicList musicList = (MusicList) message.obj;
            if (musicList != null) {
                this.f95459c &= musicList.isHasMore();
                if (!this.f95459c) {
                    this.f95460d.mo76909a();
                }
                this.f95458b = musicList.getCursor();
                if (musicList.items != null) {
                    for (Music add : musicList.items) {
                        this.f95461e.items.add(add);
                    }
                }
                if (musicList.mcInfo != null) {
                    this.f95461e.mcInfo = musicList.mcInfo;
                }
                this.f95460d.mo76910a(this.f95461e);
            }
        }
    }

    /* renamed from: a */
    public final void mo76932a(final String str, int i, int i2) {
        if (!this.f95462f) {
            this.f95462f = true;
            C23566n.m57766a().mo48750a(this.f95457a, new Callable(0, 30) {
                public final Object call() throws Exception {
                    return MusicApi.m83620a(str, 0, 30);
                }
            }, 1010);
        }
    }
}
