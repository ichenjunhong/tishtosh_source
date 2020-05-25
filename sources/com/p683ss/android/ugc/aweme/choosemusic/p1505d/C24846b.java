package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.b */
final /* synthetic */ class C24846b implements C0011g {

    /* renamed from: a */
    private final C24842a f65756a;

    /* renamed from: b */
    private final boolean f65757b;

    /* renamed from: c */
    private final String f65758c;

    /* renamed from: d */
    private final Music f65759d;

    C24846b(C24842a aVar, boolean z, String str, Music music) {
        this.f65756a = aVar;
        this.f65757b = z;
        this.f65758c = str;
        this.f65759d = music;
    }

    public final Object then(C0013i iVar) {
        C24842a aVar = this.f65756a;
        boolean z = this.f65757b;
        String str = this.f65758c;
        Music music = this.f65759d;
        if (!iVar.mo31c()) {
            if (iVar.mo33d()) {
                if (!z) {
                    aVar.f65739b.mo48228a("pick_status", (Object) Integer.valueOf(1));
                } else {
                    aVar.f65739b.mo48228a("status_pick_load_more", (Object) Integer.valueOf(1));
                }
            } else if (iVar.mo26b()) {
                if (!z) {
                    ArrayList arrayList = new ArrayList();
                    C24864t tVar = (C24864t) iVar.mo34e();
                    aVar.f65739b.mo48228a("data_banner", (Object) tVar.f65790a);
                    MusicCollectionItem musicCollectionItem = new MusicCollectionItem();
                    musicCollectionItem.mcName = aVar.f65741d.getString(R.string.d4u);
                    arrayList.add(new C24860p(C24964d.m60738a(tVar.f65792c), musicCollectionItem, 1));
                    arrayList.add(new C24863s(tVar.f65791b));
                    aVar.f65739b.mo48228a("radio_cursor", (Object) Integer.valueOf(tVar.f65795f));
                    aVar.f65739b.mo48228a("show_music_radio", (Object) Boolean.valueOf(tVar.f65794e == 1));
                    if (str != null && tVar.f65793d != null && tVar.f65793d.size() > 0) {
                        aVar.f65739b.mo48228a("data_sticker_music_from_video", (Object) Boolean.valueOf(false));
                        aVar.f65739b.mo48228a("data_sticker", (Object) tVar.f65793d);
                    } else if (music != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(music);
                        aVar.f65739b.mo48228a("data_sticker_music_from_video", (Object) Boolean.valueOf(true));
                        aVar.f65739b.mo48228a("data_sticker", (Object) arrayList2);
                    }
                    aVar.f65739b.mo48228a("list", (Object) arrayList);
                    aVar.f65739b.mo48228a("pick_status", (Object) Integer.valueOf(0));
                } else {
                    C24864t tVar2 = (C24864t) iVar.mo34e();
                    aVar.f65739b.mo48228a("pick_list_more", (Object) C24964d.m60738a(tVar2.f65792c));
                    aVar.f65739b.mo48228a("radio_cursor", (Object) Integer.valueOf(tVar2.f65795f));
                }
            }
        }
        return null;
    }
}
