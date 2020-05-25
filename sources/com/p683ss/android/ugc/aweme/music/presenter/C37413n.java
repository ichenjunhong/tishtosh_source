package com.p683ss.android.ugc.aweme.music.presenter;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.music.api.MusicApi;
import com.p683ss.android.ugc.aweme.music.model.MusicCollection;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.n */
public final class C37413n extends C26851b<C26832a<MusicCollection>, C37398d> {
    public C37413n() {
        mo54799a(new C26832a<MusicCollection>() {
            public final boolean checkParams(Object... objArr) {
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                C23566n.m57766a().mo48750a(this.mHandler, new Callable(0, PreloadTask.BYTE_UNIT_NUMBER) {
                    public final Object call() throws Exception {
                        int i = 0;
                        int i2 = PreloadTask.BYTE_UNIT_NUMBER;
                        if (C24954a.m60699b()) {
                            return (MusicCollection) MusicApi.f95243a.fetchCommerceMusicCollection((long) i, i2).get();
                        }
                        return (MusicCollection) MusicApi.f95243a.fetchMusicCollection((long) i, i2).get();
                    }
                }, 0);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo44838b() {
        List list;
        if (this.f70701g != null && this.f70700f != null) {
            C37398d dVar = (C37398d) this.f70701g;
            if (this.f70700f.getData() == null) {
                list = null;
            } else {
                list = ((MusicCollection) this.f70700f.getData()).getItems();
            }
            dVar.mo76907a(list);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C37398d) this.f70701g).mo76908d(exc);
        }
    }
}
