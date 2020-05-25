package com.p683ss.android.ugc.aweme.initializer;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.MusicDetail;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1977e.C37381f;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37517av;
import com.p683ss.android.ugc.aweme.music.presenter.C37416o;
import com.p683ss.android.ugc.aweme.music.presenter.C37424s;
import com.p683ss.android.ugc.aweme.port.p2082in.C39568at;
import com.p683ss.android.ugc.aweme.port.p2082in.C39569au;
import com.p683ss.android.ugc.aweme.port.p2082in.C39569au.C39570a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39569au.C39571b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39569au.C39572c;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45627c;
import com.p683ss.android.ugc.aweme.shortvideo.presenter.C44355d;
import com.p683ss.android.ugc.aweme.shortvideo.presenter.C44356e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.initializer.l */
public final class C35699l implements C39569au {
    /* renamed from: a */
    public final String mo74294a(String str) {
        return C37381f.m83705a(str);
    }

    /* renamed from: a */
    public final UrlModel mo74291a(Object obj) {
        if (obj != null) {
            MusicModel musicModel = (MusicModel) obj;
            if (musicModel.getMusic() != null) {
                return musicModel.getMusic().getAudioTrack();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C39570a mo74292a(final C39571b bVar) {
        final C44356e eVar = new C44356e();
        eVar.mo54799a(new MusicListModel());
        eVar.mo54800a(new C44355d() {
            /* renamed from: a */
            public final void mo74302a(Exception exc, String str) {
                if (bVar != null) {
                    bVar.mo80659a(exc, str);
                }
            }

            /* renamed from: a */
            public final void mo74301a(MusicList musicList, String str) {
                if (bVar != null) {
                    ArrayList arrayList = null;
                    if (!(musicList == null || musicList.musicList == null)) {
                        arrayList = new ArrayList(musicList.musicList.size());
                        for (Music music : musicList.musicList) {
                            new C45627c();
                            arrayList.add(C45627c.m99362a(music.convertToMusicModel()));
                        }
                    }
                    bVar.mo80660a((List<C42482c>) arrayList, str);
                }
            }
        });
        return new C39570a() {
            /* renamed from: a */
            public final boolean mo74303a(Object... objArr) {
                return eVar.mo44934a_(objArr);
            }
        };
    }

    /* renamed from: a */
    public final boolean mo74297a(int i) {
        if (MusicType.LOCAL.ordinal() == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C39572c mo74293a(String str, String str2) {
        return new C37517av(str, str2);
    }

    /* renamed from: a */
    public final void mo74296a(String str, final C39568at atVar) {
        C37416o oVar = new C37416o();
        oVar.mo54800a(new C37424s() {
            /* renamed from: d_ */
            public final void mo74300d_(Exception exc) {
                if (atVar != null) {
                    atVar.mo80658a(exc);
                }
            }

            /* renamed from: a */
            public final void mo74299a(MusicDetail musicDetail) {
                C42482c cVar;
                if (atVar != null) {
                    C39568at atVar = atVar;
                    if (musicDetail.music != null) {
                        new C45627c();
                        cVar = C45627c.m99362a(musicDetail.music.convertToMusicModel());
                    } else {
                        cVar = null;
                    }
                    atVar.mo80657a(cVar);
                }
            }
        });
        oVar.mo44934a_(str, Integer.valueOf(0));
    }

    /* renamed from: a */
    public final boolean mo74298a(C42482c cVar, Context context, boolean z) {
        if ((cVar == null || !TextUtils.isEmpty(cVar.getPath())) && (cVar == null || cVar.getMusicStatus() != 0)) {
            return true;
        }
        String offlineDesc = cVar.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.ce6);
        }
        if (z) {
            C10691a.m21545b(context, offlineDesc).mo19066a();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo74295a(Fragment fragment, int i, String str, int i2, Object obj, boolean z, Bundle bundle, String str2, String str3) {
        boolean z2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        boolean z3 = true;
        if (bundle2 == null || !bundle2.getBoolean("has_lyric", false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C24963c.m60728b("video_edit_page");
            C37378c.m83699a("//choosemusic/home", fragment, i, fragment.getString(R.string.a2t), i2, null, z, bundle, str2, str3);
            return;
        }
        if (i2 == 2) {
            C24963c.m60728b("video_shoot_page");
        } else {
            C24963c.m60728b("video_edit_page");
        }
        if (!C24964d.m60741b()) {
            if (!(C37249a.m83510a() == 1 || C37249a.m83510a() == 2)) {
                z3 = false;
            }
            if (z3) {
                C37378c.m83699a("//choosemusic/home", fragment, i, fragment.getString(R.string.a2t), i2, null, z, bundle, str2, str3);
                return;
            }
        }
        C37378c.m83699a("//onlinemusic/home", fragment, i, str, i2, null, z, bundle, str2, str3);
    }
}
