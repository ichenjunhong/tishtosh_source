package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import android.content.Context;
import android.text.TextUtils;
import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.app.services.C23162j;
import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p683ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi.API;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.main.service.C36685g.C36686a;
import com.p683ss.android.ugc.aweme.music.api.MusicApi;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.IAVMobService;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.a */
public final class C24842a {

    /* renamed from: a */
    public API f65738a = ChooseMusicApi.m60386a();

    /* renamed from: b */
    public DataCenter f65739b;

    /* renamed from: c */
    public boolean f65740c;

    /* renamed from: d */
    Context f65741d;

    /* renamed from: e */
    IAVMobService f65742e;

    /* renamed from: f */
    public boolean f65743f;

    /* renamed from: g */
    public boolean f65744g;

    /* renamed from: h */
    public boolean f65745h;

    public C24842a(Context context, DataCenter dataCenter) {
        this.f65739b = dataCenter;
        this.f65741d = context;
        this.f65742e = AVExternalServiceImpl.getAVServiceImpl_Monster().getAVMobService();
    }

    /* renamed from: a */
    public final void mo50745a(int i, int i2) {
        ChooseMusicApi.m60387b(0, 20).mo20a((C0011g<TResult, TContinuationResult>) new C24849e<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* renamed from: b */
    public final void mo50750b(int i, int i2) {
        if (!this.f65744g) {
            this.f65744g = true;
            ChooseMusicApi.m60383a(0, 20).mo20a((C0011g<TResult, TContinuationResult>) new C24853i<TResult,TContinuationResult>(this, C17429o.m42675b()), C0013i.f25b);
        }
    }

    /* renamed from: c */
    public final void mo50751c(int i, int i2) {
        if (!this.f65745h) {
            this.f65745h = true;
            this.f65738a.getHotMusicList(0, 20).mo20a((C0011g<TResult, TContinuationResult>) new C24855k<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: d */
    public final void mo50752d(int i, int i2) {
        if (!this.f65745h) {
            this.f65745h = true;
            List recommandMusic = AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().recommandMusic();
            this.f65745h = false;
            if (recommandMusic == null) {
                this.f65739b.mo48228a("refresh_status_hot_music_list", (Object) Integer.valueOf(1));
                return;
            }
            ArrayList arrayList = new ArrayList(recommandMusic);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (TextUtils.isEmpty(((MusicModel) it.next()).getLrcUrl())) {
                    it.remove();
                }
            }
            if (arrayList.size() > 50) {
                Iterator it2 = arrayList.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    it2.next();
                    if (i3 == 50) {
                        it2.remove();
                    } else {
                        i3++;
                    }
                }
            }
            C23268b bVar = new C23268b();
            bVar.mo48212a("refresh_status_hot_music_list", Integer.valueOf(0)).mo48212a("list_cursor", Integer.valueOf(0)).mo48212a("list_hasmore", Boolean.valueOf(false)).mo48212a("action_type", Integer.valueOf(1)).mo48212a("list_data", arrayList);
            this.f65739b.mo48228a("hot_music_list_data", (Object) bVar);
        }
    }

    /* renamed from: a */
    public final void mo50747a(String str, int i, int i2) {
        if (!this.f65743f) {
            this.f65743f = true;
            ChooseMusicApi.m60385a(str, 0, 30).mo20a((C0011g<TResult, TContinuationResult>) new C24851g<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final void mo50748a(String str, boolean z, String str2, Music music) {
        C23162j.m56760b().mo47877a("data_challenge", str, str2, music, new C36686a(false) {
            /* renamed from: a */
            public final boolean mo50754a(String str, Challenge challenge) {
                C24842a.this.f65739b.mo48228a(str, (Object) challenge);
                return ((Boolean) C24842a.this.f65739b.mo48230b("is_busi_sticker", Boolean.valueOf(false))).booleanValue();
            }

            /* renamed from: a */
            public final void mo50753a(String str, Music music, boolean z) {
                C24842a.this.mo50749a(false, str, music, z);
            }
        });
    }

    /* renamed from: a */
    public final void mo50749a(boolean z, String str, final Music music, boolean z2) {
        ChooseMusicApi.m60384a((Integer) this.f65739b.mo48230b("radio_cursor", Integer.valueOf(0)), str, z2).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<C24864t, C24864t>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C24864t then(C0013i<C24864t> iVar) throws Exception {
                if (music != null) {
                    try {
                        Music music = MusicApi.m83621a(music.getMid(), 0).music;
                        if (music != null) {
                            music.setCollectStatus(music.getCollectStatus());
                        }
                    } catch (Exception unused) {
                    }
                }
                return (C24864t) iVar.mo34e();
            }
        }, (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C24846b<TResult,TContinuationResult>(this, z, str, music), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo50746a(MusicModel musicModel, String str, int i, int i2, int i3) {
        C0013i collectMusic = this.f65738a.collectMusic(str, i);
        C24848d dVar = new C24848d(this, musicModel, i, i2, i3);
        collectMusic.mo20a((C0011g<TResult, TContinuationResult>) dVar, C0013i.f25b);
    }
}
