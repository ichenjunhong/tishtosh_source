package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.arch.lifecycle.C0199s;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.arch.C23269c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24816b;
import com.p683ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24804a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24842a;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24854j;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.BaseMusicListView;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24988i;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24995p.C24997a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b.C26991a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw.C37523a;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.k */
public final class C24934k extends C24908a implements C24832a<Music>, C26846a, C26991a {

    /* renamed from: l */
    public C24833b f66024l;

    /* renamed from: m */
    private C24803a f66025m;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50728a(Object obj, int i) {
    }

    /* renamed from: c */
    public final String mo48208c() {
        return "user_collected_music_list";
    }

    /* renamed from: d */
    public final String mo48209d() {
        return "refresh_status_user_collected_music";
    }

    /* renamed from: e */
    public final String mo48210e() {
        return "loadmore_status_user_collected_music";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo50875m() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final String mo50876n() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo50877o() {
        return R.layout.om;
    }

    /* renamed from: r */
    public final void mo50730r() {
    }

    /* renamed from: a */
    public final void mo48207a() {
        super.mo48207a();
        this.f65963d.mo50750b(0, 20);
    }

    /* renamed from: l */
    public final View mo50471l() {
        if (this.f65965j == null) {
            return null;
        }
        return ((BaseMusicListView) this.f65965j).mRecyclerView;
    }

    /* renamed from: p */
    public final C24816b mo50874k() {
        if (this.f65965j != null) {
            return (C24816b) this.f65965j.mo48219d();
        }
        return null;
    }

    /* renamed from: q */
    public final void mo50729q() {
        if (this.f65963d != null) {
            this.f65963d.mo50750b(0, 20);
        }
    }

    /* renamed from: f */
    public final DataCenter mo48211f() {
        this.f65964e = super.mo48211f();
        this.f65964e.mo48226a("music_collect_status", (C0199s<C23274a>) this).mo48226a("music_index", (C0199s<C23274a>) this);
        return this.f65964e;
    }

    public final void ar_() {
        if (this.f65963d != null && this.f65964e != null) {
            C23268b bVar = (C23268b) this.f65964e.mo48229a(mo48208c());
            if ((this.f65965j instanceof BaseMusicListView) && ((BaseMusicListView) this.f65965j).f66092e) {
                if (this.f65965j != null) {
                    this.f65965j.mo48214a();
                }
                C24842a aVar = this.f65963d;
                int intValue = ((Integer) bVar.mo48213a("list_cursor")).intValue();
                if (!aVar.f65744g) {
                    aVar.f65744g = true;
                    ChooseMusicApi.m60383a(intValue, 20).mo20a((C0011g<TResult, TContinuationResult>) new C24854j<TResult,TContinuationResult>(aVar), C0013i.f25b);
                }
            }
        }
    }

    @C53771m
    public final void onEvent(C37351d dVar) {
        if (this.f65964e != null && dVar != null) {
            C24804a aVar = new C24804a(0, dVar.f95311a, -1, -1, dVar.f95312b);
            this.f65964e.mo48228a("music_collect_status", (Object) aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23269c mo50872b(View view) {
        C24988i iVar = new C24988i(getContext(), view, this, this, this, this.f65966k);
        iVar.mo50975a((C24833b) new C24833b() {
            /* renamed from: a */
            public final void mo50731a(C37523a aVar) {
                if (C24934k.this.f66024l != null) {
                    C24934k.this.f66024l.mo50731a(aVar);
                }
            }

            /* renamed from: b */
            public final void mo50734b(MusicModel musicModel) {
                if (C24934k.this.f66024l != null) {
                    C24934k.this.f66024l.mo50734b(musicModel);
                }
            }

            /* renamed from: a */
            public final void mo50732a(MusicModel musicModel) {
                if (C24934k.this.f66024l != null) {
                    C24934k.this.f66024l.mo50732a(musicModel);
                }
            }

            /* renamed from: a */
            public final void mo50733a(MusicModel musicModel, C24803a aVar) {
                if (C24934k.this.f66024l != null) {
                    C24934k.this.f66024l.mo50733a(musicModel, aVar);
                }
                if (((Integer) C24934k.this.f65964e.mo48230b("music_position", Integer.valueOf(-1))).intValue() == -2) {
                    C24934k.this.f65964e.mo48228a("music_position", (Object) Integer.valueOf(-1));
                    C24934k.this.f65964e.mo48228a("music_index", (Object) Integer.valueOf(-1));
                }
            }
        });
        this.f66025m = new C24803a("change_music_page", "favorite_song", "", C24963c.m60726b());
        iVar.mo50974a(this.f66025m);
        iVar.mo50976a(false);
        iVar.mo50932a((C24997a) new C24936l(this), 10);
        return iVar;
    }

    /* renamed from: c */
    private void m60592c(MusicModel musicModel) {
        if (this.f65965j != null && this.f65965j.mo48219d() != null && this.f65965j.mo48219d().mo50673a() != null) {
            List a = this.f65965j.mo48219d().mo50673a();
            for (int i = 0; i < a.size(); i++) {
                if (musicModel.getMusicId().equals(((MusicModel) a.get(i)).getMusicId())) {
                    a.remove(i);
                    this.f65965j.mo48219d().notifyItemRemoved(i);
                    if (a.size() == 0) {
                        this.f65965j.mo48218c();
                    }
                    return;
                }
            }
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && (mo50471l() instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) mo50471l();
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int l = linearLayoutManager.mo4751l();
                C26840g d = this.f65965j.mo48219d();
                if (d != null) {
                    List a = d.mo50673a();
                    if (!C9376b.m18558a((Collection<T>) a)) {
                        for (int j = linearLayoutManager.mo4749j(); j < l; j++) {
                            if (j >= 0 && j < a.size()) {
                                MusicModel musicModel = (MusicModel) a.get(j);
                                if (musicModel != null) {
                                    C24963c.m60718a(this.f66025m, musicModel.getMusicId(), j, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.f65965j instanceof C24988i) {
            ((C24988i) this.f65965j).mo50976a(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50870a(com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a r7) {
        /*
            r6 = this;
            super.onChanged(r7)
            boolean r0 = r6.isViewValid()
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r0 = r7.f62242a
            int r1 = r0.hashCode()
            r2 = -1635157503(0xffffffff9e897a01, float:-1.4555899E-20)
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == r2) goto L_0x0028
            r2 = 1579846200(0x5e2a8a38, float:3.07217403E18)
            if (r1 == r2) goto L_0x001e
            goto L_0x0032
        L_0x001e:
            java.lang.String r1 = "music_index"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0032
            r0 = 0
            goto L_0x0033
        L_0x0028:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = -1
        L_0x0033:
            switch(r0) {
                case 0: goto L_0x00be;
                case 1: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x00db
        L_0x0038:
            java.lang.Object r7 = r7.mo48246a()
            com.ss.android.ugc.aweme.choosemusic.a.a r7 = (com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24804a) r7
            int r0 = r7.f65650a
            if (r0 != 0) goto L_0x00db
            int r0 = r7.f65653d
            if (r0 != r4) goto L_0x00b8
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = r7.f65654e
            com.ss.android.ugc.aweme.arch.c r0 = r6.f65965j
            if (r0 == 0) goto L_0x00db
            com.ss.android.ugc.aweme.arch.c r0 = r6.f65965j
            com.ss.android.ugc.aweme.common.a.g r0 = r0.mo48219d()
            if (r0 != 0) goto L_0x0056
            goto L_0x00db
        L_0x0056:
            com.ss.android.ugc.aweme.arch.c r0 = r6.f65965j
            com.ss.android.ugc.aweme.common.a.g r0 = r0.mo48219d()
            java.util.List r0 = r0.mo50673a()
            if (r0 != 0) goto L_0x0067
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0067:
            r1 = 0
        L_0x0068:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x0085
            java.lang.Object r2 = r0.get(r1)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = (com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel) r2
            java.lang.String r3 = r7.getMusicId()
            java.lang.String r2 = r2.getMusicId()
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00b7
            int r1 = r1 + 1
            goto L_0x0068
        L_0x0085:
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0094
            r0.add(r7)
            com.ss.android.ugc.aweme.arch.c r7 = r6.f65965j
            r7.mo48215a(r0, r5)
            goto L_0x00db
        L_0x0094:
            r0.add(r5, r7)
            com.ss.android.ugc.aweme.arch.c r7 = r6.f65965j
            com.ss.android.ugc.aweme.common.a.g r7 = r7.mo48219d()
            r7.notifyItemInserted(r5)
            com.ss.android.ugc.aweme.arch.c r7 = r6.f65965j
            boolean r7 = r7 instanceof com.p683ss.android.ugc.aweme.choosemusic.view.BaseMusicListView
            if (r7 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.arch.c r7 = r6.f65965j
            com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView r7 = (com.p683ss.android.ugc.aweme.choosemusic.view.BaseMusicListView) r7
            android.support.v7.widget.RecyclerView r7 = r7.mRecyclerView
            if (r7 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.arch.c r7 = r6.f65965j
            com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView r7 = (com.p683ss.android.ugc.aweme.choosemusic.view.BaseMusicListView) r7
            android.support.v7.widget.RecyclerView r7 = r7.mRecyclerView
            r7.mo4814b(r5)
        L_0x00b7:
            return
        L_0x00b8:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = r7.f65654e
            r6.m60592c(r7)
            goto L_0x00db
        L_0x00be:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r7 = r6.f65964e
            java.lang.String r0 = "music_position"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r7 = r7.mo48230b(r0, r1)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0 = -2
            if (r7 != r0) goto L_0x00db
            com.ss.android.ugc.aweme.choosemusic.adapter.b r7 = r6.mo50874k()
            r7.mo50699b()
            return
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.fragment.C24934k.mo50870a(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50900a(int i, int i2) {
        ar_();
    }
}
