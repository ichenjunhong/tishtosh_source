package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24804a;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.d */
final /* synthetic */ class C24848d implements C0011g {

    /* renamed from: a */
    private final C24842a f65762a;

    /* renamed from: b */
    private final MusicModel f65763b;

    /* renamed from: c */
    private final int f65764c;

    /* renamed from: d */
    private final int f65765d;

    /* renamed from: e */
    private final int f65766e;

    C24848d(C24842a aVar, MusicModel musicModel, int i, int i2, int i3) {
        this.f65762a = aVar;
        this.f65763b = musicModel;
        this.f65764c = i;
        this.f65765d = i2;
        this.f65766e = i3;
    }

    public final Object then(C0013i iVar) {
        C24842a aVar = this.f65762a;
        MusicModel musicModel = this.f65763b;
        int i = this.f65764c;
        int i2 = this.f65765d;
        int i3 = this.f65766e;
        if (!iVar.mo31c()) {
            if (iVar.mo33d()) {
                musicModel.setCollectionType(i == 1 ? CollectionType.NOT_COLLECTED : CollectionType.COLLECTED);
                C24804a aVar2 = new C24804a(1, i, i2, i3, musicModel);
                aVar.f65739b.mo48228a("music_collect_status", (Object) aVar2);
            } else if (iVar.mo26b()) {
                musicModel.setCollectionType(i == 1 ? CollectionType.COLLECTED : CollectionType.NOT_COLLECTED);
                C24804a aVar3 = new C24804a(0, i, i2, i3, musicModel);
                aVar.f65739b.mo48228a("music_collect_status", (Object) aVar3);
            }
        }
        return null;
    }
}
