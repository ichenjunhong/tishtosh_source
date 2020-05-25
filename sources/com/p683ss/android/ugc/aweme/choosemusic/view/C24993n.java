package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.MusicSheetAdapter;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.n */
public final class C24993n extends BaseMusicListView<MusicCollectionItem> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C26840g mo50934f() {
        MusicSheetAdapter musicSheetAdapter = new MusicSheetAdapter();
        musicSheetAdapter.f65678a = new C24994o(this);
        return musicSheetAdapter;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50985a(MusicCollectionItem musicCollectionItem, int i) {
        if (this.f66089b != null) {
            this.f66089b.mo50728a(musicCollectionItem, i);
        }
    }

    public C24993n(Context context, View view, C24832a aVar, C26846a aVar2, int i) {
        super(context, view, aVar, R.string.chg, aVar2, null, i);
    }
}
