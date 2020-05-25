package com.p683ss.android.ugc.aweme.choosemusic.adapter;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.arch.widgets.C23271b;
import com.p683ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24836e;
import com.p683ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView;
import com.p683ss.android.ugc.aweme.choosemusic.view.StickerMusicView;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.C25025e;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicClassViewHolder;
import com.p683ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget;
import com.p683ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget;
import com.p683ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget;
import com.p683ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget;
import com.p683ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.a */
public final class C24814a extends C23271b {

    /* renamed from: d */
    public C24833b f65682d;

    /* renamed from: e */
    public C24836e f65683e;

    /* renamed from: f */
    public int f65684f;

    /* renamed from: g */
    public boolean f65685g;

    /* renamed from: h */
    public C37306l<C24806c> f65686h;

    /* renamed from: i */
    private int f65687i;

    /* renamed from: j */
    private RecyclerView f65688j;

    /* renamed from: k */
    private int f65689k;

    /* renamed from: l */
    private boolean f65690l;

    /* renamed from: m */
    private int f65691m;

    /* renamed from: c */
    public final int mo48636c() {
        if (this.f65690l) {
            return this.f65684f + 1;
        }
        return this.f65684f;
    }

    /* renamed from: b */
    public final void mo50695b() {
        if (((Integer) this.f62221b.mo48230b("music_position", Integer.valueOf(-1))).intValue() != -1) {
            if (this.f65682d != null) {
                this.f65682d.mo50732a((MusicModel) null);
            }
            this.f62221b.mo48228a("music_position", (Object) Integer.valueOf(-1));
            this.f62221b.mo48228a("music_index", (Object) Integer.valueOf(-1));
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f65688j = recyclerView;
        this.f65688j.mo4801a((C1340m) new C1340m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                C24814a.this.mo50693a(false);
            }
        });
    }

    /* renamed from: c */
    public final void mo50696c(int i) {
        if (this.f65689k != i) {
            this.f65689k = i;
            mo50693a(false);
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (this.f65690l) {
            if (i == 0) {
                return this.f65691m;
            }
            if (i == 1 && this.f65685g) {
                return 3;
            }
            if (i == 2) {
                return 1;
            }
            return 2;
        } else if (i == 0 && this.f65685g) {
            return 3;
        } else {
            if (i == 1) {
                return 1;
            }
            return 2;
        }
    }

    /* renamed from: b */
    public final ListItemWidget mo48223b(int i) {
        switch (getItemViewType(i)) {
            case 1:
                MusicClassWidget musicClassWidget = new MusicClassWidget();
                if (this.f65690l) {
                    i--;
                }
                musicClassWidget.f66335h = i;
                musicClassWidget.f66336i = musicClassWidget.f66335h + 10086;
                return musicClassWidget;
            case 2:
                MusicBoardWidget musicBoardWidget = new MusicBoardWidget();
                musicBoardWidget.f66321h = this.f65682d;
                musicBoardWidget.f66329p = this.f65686h;
                if (this.f65690l) {
                    i--;
                }
                musicBoardWidget.f66324k = i;
                musicBoardWidget.f66325l = musicBoardWidget.f66324k + 10086;
                return musicBoardWidget;
            case 3:
                MusicRadioWidget musicRadioWidget = new MusicRadioWidget();
                C24833b bVar = this.f65682d;
                C52711k.m112240b(bVar, "ISelectMusic");
                musicRadioWidget.f66341j = bVar;
                musicRadioWidget.f66342k = this.f65686h;
                C24836e eVar = this.f65683e;
                C52711k.m112240b(eVar, "postSelectMusicListener");
                musicRadioWidget.f66343l = eVar;
                if (this.f65690l) {
                    i--;
                }
                musicRadioWidget.f66340i = i;
                return musicRadioWidget;
            case 4:
                StickerMusicWidget stickerMusicWidget = new StickerMusicWidget();
                stickerMusicWidget.f66350h = this.f65682d;
                stickerMusicWidget.f66355m = this.f65686h;
                stickerMusicWidget.f66356n = this.f65683e;
                stickerMusicWidget.f66352j = -2;
                stickerMusicWidget.f66353k = stickerMusicWidget.f66352j + 10086;
                return stickerMusicWidget;
            case 5:
                ChallengeMusicWidget challengeMusicWidget = new ChallengeMusicWidget();
                challengeMusicWidget.f66311i = this.f65682d;
                challengeMusicWidget.f66316n = this.f65686h;
                challengeMusicWidget.f66317o = this.f65683e;
                challengeMusicWidget.f66313k = -2;
                challengeMusicWidget.f66314l = challengeMusicWidget.f66313k + 10086;
                return challengeMusicWidget;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo50693a(boolean z) {
        int i;
        int i2;
        C1332i layoutManager = this.f65688j.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int j = linearLayoutManager.mo4749j();
            int l = linearLayoutManager.mo4751l();
            int i3 = j;
            while (i3 <= l) {
                View childAt = this.f65688j.getChildAt(i3 - j);
                if (childAt != null) {
                    if (!this.f70699x || i3 != mo48636c()) {
                        ListItemWidget b_ = mo48224b_(i3);
                        if (b_ instanceof MusicBoardWidget) {
                            if (z) {
                                ((MusicBoardWidget) b_).mo51047d();
                            }
                            if (childAt.getTop() > 0) {
                                i = 0;
                            } else {
                                i = -childAt.getTop();
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            if (childAt.getBottom() > this.f65689k) {
                                i2 = (measuredHeight + this.f65689k) - childAt.getBottom();
                            } else {
                                i2 = childAt.getMeasuredHeight();
                            }
                            ((MusicBoardWidget) b_).mo51046a(i, i2);
                        }
                        i3++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50694a(boolean z, int i) {
        this.f65690l = true;
        this.f65691m = i;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new MusicClassViewHolder(mo50692a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i));
        }
        switch (i) {
            case 3:
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                C52711k.m112240b(from, "inflater");
                C52711k.m112240b(viewGroup, "viewGroup");
                View inflate = from.inflate(R.layout.xf, viewGroup, false);
                C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_radio, viewGroup, false)");
                return new C25025e(inflate);
            case 4:
                StickerMusicView stickerMusicView = new StickerMusicView(mo50692a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f65687i);
                stickerMusicView.f66139c = ((Boolean) this.f62221b.mo48229a("mvtheme_music_type")).booleanValue();
                return stickerMusicView;
            case 5:
                return new ChallengeMusicView(mo50692a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f65687i);
            default:
                return new MusicBoardViewHolder(mo50692a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f65687i);
        }
    }

    /* renamed from: a */
    public final View mo50692a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        if (i == 1) {
            return layoutInflater.inflate(R.layout.a5w, viewGroup, false);
        }
        if (i == 5 || i == 4) {
            return layoutInflater.inflate(R.layout.a1m, viewGroup, false);
        }
        return layoutInflater.inflate(R.layout.a5v, viewGroup, false);
    }

    public C24814a(C23279d dVar, DataCenter dataCenter, C24833b bVar, C24836e eVar, C37306l<C24806c> lVar, int i) {
        super(dVar, dataCenter);
        this.f65682d = bVar;
        this.f65683e = eVar;
        this.f65686h = lVar;
        this.f65687i = i;
    }
}
