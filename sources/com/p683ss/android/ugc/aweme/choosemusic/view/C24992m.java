package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24816b;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.m */
public final class C24992m extends BaseMusicListView<MusicModel> {

    /* renamed from: g */
    boolean f66167g;

    /* renamed from: h */
    public long f66168h;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C26840g mo50934f() {
        C24816b bVar = new C24816b(null, this.f66090c, false, this.f66093f);
        bVar.f65701g = this.f66167g;
        bVar.f65703i = this.f66091d;
        return bVar;
    }

    /* renamed from: a */
    public final void mo50981a(int i) {
        this.mTitleBar.setTitle(i);
    }

    /* renamed from: a */
    public final void mo50982a(C24803a aVar) {
        if (this.f66088a instanceof C24816b) {
            ((C24816b) this.f66088a).f65700f = aVar;
        }
    }

    /* renamed from: a */
    public final void mo50983a(C24833b bVar) {
        if (this.f66088a instanceof C24816b) {
            ((C24816b) this.f66088a).f65695a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo50984a(boolean z) {
        this.f66167g = z;
        if (this.f66088a instanceof C24816b) {
            ((C24816b) this.f66088a).f65701g = this.f66167g;
        }
    }

    /* renamed from: a */
    public final void mo48215a(List<MusicModel> list, boolean z) {
        super.mo48215a(list, z);
        if (list != null && this.f66168h > 0) {
            C24963c.m60716a(System.currentTimeMillis() - this.f66168h);
        }
    }

    public C24992m(Context context, View view, C24832a aVar, int i, C26846a aVar2, C37306l<C24806c> lVar, int i2) {
        super(context, view, aVar, i, aVar2, lVar, i2);
    }

    public C24992m(Context context, View view, C24832a aVar, int i, C26846a aVar2, C37306l<C24806c> lVar, int i2, boolean z) {
        super(context, view, aVar, i, aVar2, lVar, i2, true);
    }
}
