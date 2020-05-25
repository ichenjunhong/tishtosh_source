package com.p683ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.arch.widgets.C23270a;
import com.p683ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24836e;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24860p;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.C25025e;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.C25025e.C25033b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.adapter.C37289e;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw.C37523a;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget */
public final class MusicRadioWidget extends ListItemWidget<C25025e> implements C0199s<C23274a> {

    /* renamed from: h */
    public C24803a f66339h;

    /* renamed from: i */
    public int f66340i = -1;

    /* renamed from: j */
    public C24833b f66341j;

    /* renamed from: k */
    public C37306l<C24806c> f66342k;

    /* renamed from: l */
    public C24836e f66343l;

    /* renamed from: m */
    private int f66344m = -1;

    /* renamed from: n */
    private boolean f66345n;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget$a */
    static final class C25041a implements C37289e {

        /* renamed from: a */
        final /* synthetic */ MusicRadioWidget f66346a;

        /* renamed from: b */
        final /* synthetic */ List f66347b;

        C25041a(MusicRadioWidget musicRadioWidget, List list) {
            this.f66346a = musicRadioWidget;
            this.f66347b = list;
        }

        /* renamed from: a */
        public final void mo51050a(C1352v vVar, View view, MusicModel musicModel) {
            String str;
            MusicModel musicModel2;
            MusicModel musicModel3;
            String str2;
            if (vVar instanceof C25025e) {
                boolean z = false;
                if (musicModel == null) {
                    Collection collection = this.f66347b;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    }
                    if (z) {
                        this.f66346a.mo51051d();
                    }
                    return;
                }
                C52711k.m112236a((Object) view, "view");
                int id = view.getId();
                if (id == R.id.b2l) {
                    Activity g = C11016e.m22312g();
                    if (g != null) {
                        g.getString(R.string.b17);
                    }
                    IAccountUserService userService = AccountService.createIAccountServicebyMonsterPlugin().userService();
                    C52711k.m112236a((Object) userService, "ServiceManager.get().get…class.java).userService()");
                    MusicModel musicModel4 = null;
                    if (!userService.isLogin()) {
                        C27965f.m66720a(C11016e.m22312g(), C24964d.m60737a(0), "click_favorite_music", (Bundle) null);
                        return;
                    }
                    C25025e eVar = (C25025e) vVar;
                    List<MusicModel> list = eVar.f66288q;
                    if (list != null) {
                        musicModel2 = (MusicModel) C52575l.m112118a(list, eVar.f66289r);
                    } else {
                        musicModel2 = null;
                    }
                    if (musicModel2 != null) {
                        List<MusicModel> list2 = eVar.f66288q;
                        if (list2 != null) {
                            musicModel3 = (MusicModel) C52575l.m112118a(list2, eVar.f66289r);
                        } else {
                            musicModel3 = null;
                        }
                        if (C37378c.m83700a(musicModel3, eVar.f66290s, true)) {
                            C37306l<C24806c> lVar = eVar.f66287p;
                            if (lVar != null) {
                                List<MusicModel> list3 = eVar.f66288q;
                                if (list3 != null) {
                                    musicModel4 = (MusicModel) C52575l.m112118a(list3, eVar.f66289r);
                                }
                                if (eVar.f66291t) {
                                    str2 = "unfollow_type";
                                } else {
                                    str2 = "follow_type";
                                }
                                lVar.mo50815a(new C24806c(musicModel4, str2, 0, eVar.f66289r));
                            }
                            eVar.f66291t = !eVar.f66291t;
                            CheckableImageView checkableImageView = eVar.f66280i;
                            if (checkableImageView != null) {
                                checkableImageView.mo76959b();
                            }
                        }
                    }
                    C24803a aVar = this.f66346a.f66339h;
                    if (aVar != null) {
                        aVar.f65643c = "click_button";
                    }
                    C24963c.m60725a(eVar.f66291t, musicModel.getMusicId(), this.f66346a.f66339h, eVar.f66289r, musicModel.getLogPb());
                } else if (id == R.id.bg1 || id == R.id.bf9 || id == R.id.bgo) {
                    Integer num = (Integer) this.f66346a.f62238e.mo48230b("music_position", Integer.valueOf(-1));
                    int i = this.f66346a.f66340i;
                    if (num != null && num.intValue() == i) {
                        Integer num2 = (Integer) this.f66346a.f62238e.mo48230b("music_index", Integer.valueOf(-1));
                        int i2 = ((C25025e) vVar).f66289r;
                        if (num2 != null && num2.intValue() == i2) {
                            this.f66346a.f62238e.mo48228a("music_position", (Object) Integer.valueOf(-1));
                            this.f66346a.f62238e.mo48228a("music_index", (Object) Integer.valueOf(-1));
                            this.f66346a.mo51052e();
                            return;
                        }
                    }
                    C25025e eVar2 = (C25025e) vVar;
                    C24963c.m60715a(eVar2.f66289r);
                    C24803a aVar2 = this.f66346a.f66339h;
                    if (aVar2 != null) {
                        if (view.getId() == R.id.bf9) {
                            str = "click_start_your_fm";
                        } else {
                            str = "click_play_icon";
                        }
                        aVar2.f65643c = str;
                    }
                    if (view.getId() == R.id.bgo) {
                        C24963c.m60723a(musicModel.getMusicId(), (String) this.f66346a.f62238e.mo48230b("last_play_music_id", ""), this.f66346a.f66339h);
                    }
                    this.f66346a.mo51052e();
                    eVar2.mo51031a(true, true);
                    C24833b bVar = this.f66346a.f66341j;
                    if (bVar != null) {
                        bVar.mo50731a((C37523a) new C37523a(this) {

                            /* renamed from: a */
                            final /* synthetic */ C25041a f66348a;

                            {
                                this.f66348a = r1;
                            }

                            /* renamed from: a */
                            public final void mo50709a() {
                                this.f66348a.f66346a.f62238e.mo48228a("music_loading", (Object) Boolean.valueOf(false));
                            }
                        });
                    }
                    C24833b bVar2 = this.f66346a.f66341j;
                    if (bVar2 != null) {
                        bVar2.mo50733a(musicModel, this.f66346a.f66339h);
                    }
                    this.f66346a.f62238e.mo48228a("music_position", (Object) Integer.valueOf(this.f66346a.f66340i));
                    this.f66346a.f62238e.mo48228a("music_index", (Object) Integer.valueOf(eVar2.f66289r));
                    this.f66346a.f62238e.mo48228a("music_loading", (Object) Boolean.valueOf(true));
                } else {
                    if (id == R.id.bgp) {
                        C24803a aVar3 = this.f66346a.f66339h;
                        if (aVar3 != null) {
                            aVar3.f65643c = "";
                        }
                        C24836e eVar3 = this.f66346a.f66343l;
                        if (eVar3 != null) {
                            eVar3.mo50737c(8);
                        }
                        C24833b bVar3 = this.f66346a.f66341j;
                        if (bVar3 != null) {
                            bVar3.mo50734b(musicModel);
                        }
                        C24963c.m60717a(this.f66346a.f66339h, musicModel.getMusicId(), this.f66346a.f66340i, musicModel.getLogPb());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget$b */
    public static final class C25043b implements C25033b {

        /* renamed from: a */
        final /* synthetic */ MusicRadioWidget f66349a;

        /* renamed from: a */
        public final void mo51040a() {
            this.f66349a.mo51051d();
        }

        C25043b(MusicRadioWidget musicRadioWidget) {
            this.f66349a = musicRadioWidget;
        }
    }

    /* renamed from: e */
    public final void mo51052e() {
        C24833b bVar = this.f66341j;
        if (bVar != null) {
            bVar.mo50732a((MusicModel) null);
        }
    }

    /* renamed from: d */
    public final void mo51051d() {
        if (!this.f66345n) {
            this.f66345n = true;
            this.f62238e.mo48228a("should_load_more_pick", (Object) Boolean.valueOf(true));
        }
    }

    public final void onCreate() {
        super.onCreate();
        C0199s sVar = this;
        this.f62238e.mo48226a("music_index", sVar).mo48226a("music_collect_status", sVar).mo48226a("status_pick_load_more", sVar).mo48226a("pick_list_more", sVar).mo48226a("play_compeleted", sVar).mo48226a("play_error", sVar).mo48226a("music_loading", sVar);
    }

    /* renamed from: a */
    public final void mo48220a(C23270a aVar) {
        C52711k.m112240b(aVar, "view");
        super.mo48220a(aVar);
        List list = (List) this.f62238e.mo48229a("list");
        this.f66339h = new C24803a("change_music_page", "my_fm", "click_start_your_fm", C24963c.m60726b());
        C24803a aVar2 = this.f66339h;
        if (aVar2 != null) {
            aVar2.f65648h = true;
        }
        if (list != null && this.f66340i < list.size()) {
            Object obj = list.get(this.f66340i);
            if (obj != null) {
                List<MusicModel> list2 = ((C24860p) obj).f65782b;
                C25025e eVar = (C25025e) this.f62218a;
                eVar.f66288q = list2;
                List<MusicModel> list3 = eVar.f66288q;
                if (list3 != null && !list3.isEmpty()) {
                    eVar.mo51028a(eVar.f66289r, false);
                }
                C25025e eVar2 = (C25025e) this.f62218a;
                C37289e aVar3 = new C25041a(this, list2);
                C52711k.m112240b(aVar3, "IOnClickListener");
                eVar2.f66286o = aVar3;
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.model.MusicBlockItem");
            }
        }
        ((C25025e) this.f62218a).f66287p = this.f66342k;
        ((C25025e) this.f62218a).f66285n = new C25043b(this);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (this.f62218a != null) {
            if (aVar == null) {
                C52711k.m112234a();
            }
            String str = aVar.f62242a;
            String str2 = null;
            int i = -1;
            switch (str.hashCode()) {
                case -1322093457:
                    if (str.equals("play_compeleted")) {
                        String str3 = (String) aVar.mo48246a();
                        MusicModel c = ((C25025e) this.f62218a).mo51033c();
                        if (c != null) {
                            str2 = c.getMusicId();
                        }
                        if (C52711k.m112239a((Object) str3, (Object) str2)) {
                            this.f62238e.mo48228a("music_position", (Object) Integer.valueOf(-1));
                            this.f62238e.mo48228a("music_index", (Object) Integer.valueOf(-1));
                            return;
                        }
                    }
                    break;
                case -60075939:
                    if (str.equals("status_pick_load_more")) {
                        this.f66345n = false;
                        ((C25025e) this.f62218a).mo51030a(null);
                        return;
                    }
                    break;
                case 502104354:
                    if (str.equals("music_loading")) {
                        Integer num = (Integer) this.f62238e.mo48229a("music_position");
                        if (num != null) {
                            i = num.intValue();
                        }
                        if (this.f66340i == i) {
                            C25025e eVar = (C25025e) this.f62218a;
                            Object a = this.f62238e.mo48229a("music_loading");
                            C52711k.m112236a(a, "mDataCenter[WidgetConstants.KEY_MUSIC_LOADING]");
                            eVar.mo51031a(true, ((Boolean) a).booleanValue());
                            break;
                        }
                    }
                    break;
                case 945257400:
                    if (str.equals("pick_list_more")) {
                        this.f66345n = false;
                        ((C25025e) this.f62218a).mo51030a((List) aVar.mo48246a());
                        return;
                    }
                    break;
                case 1579846200:
                    if (str.equals("music_index")) {
                        Integer num2 = (Integer) this.f62238e.mo48230b("music_position", Integer.valueOf(-1));
                        Integer num3 = (Integer) this.f62238e.mo48230b("music_index", Integer.valueOf(-1));
                        int i2 = this.f66340i;
                        if (num2 != null && num2.intValue() == i2) {
                            int i3 = this.f66344m;
                            if (num3 != null && i3 == num3.intValue()) {
                                ((C25025e) this.f62218a).mo51031a(false, false);
                                C24833b bVar = this.f66341j;
                                if (bVar != null) {
                                    bVar.mo50732a((MusicModel) null);
                                    break;
                                } else {
                                    return;
                                }
                            } else {
                                C52711k.m112236a((Object) num3, "musicIndex");
                                this.f66344m = num3.intValue();
                                return;
                            }
                        } else {
                            ((C25025e) this.f62218a).mo51031a(false, false);
                            this.f66344m = -1;
                            return;
                        }
                    }
                    break;
                case 1912965437:
                    if (str.equals("play_error")) {
                        String str4 = (String) aVar.mo48246a();
                        MusicModel c2 = ((C25025e) this.f62218a).mo51033c();
                        if (c2 != null) {
                            str2 = c2.getMusicId();
                        }
                        if (C52711k.m112239a((Object) str4, (Object) str2)) {
                            this.f62238e.mo48228a("music_position", (Object) Integer.valueOf(-1));
                            this.f62238e.mo48228a("music_index", (Object) Integer.valueOf(-1));
                            return;
                        }
                    }
                    break;
            }
        }
    }
}
