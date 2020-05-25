package com.p683ss.android.ugc.aweme.choosemusic.widgets;

import android.arch.lifecycle.C0199s;
import android.content.Intent;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.arch.widgets.C23270a;
import com.p683ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24860p;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24989j;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw.C37523a;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget */
public class MusicBoardWidget extends ListItemWidget<MusicBoardViewHolder> implements C0199s<C23274a> {

    /* renamed from: h */
    public C24833b f66321h;

    /* renamed from: i */
    public int f66322i;

    /* renamed from: j */
    int f66323j = -1;

    /* renamed from: k */
    public int f66324k = -1;

    /* renamed from: l */
    public int f66325l;

    /* renamed from: m */
    int f66326m;

    /* renamed from: n */
    C24803a f66327n;

    /* renamed from: o */
    List<MusicModel> f66328o;

    /* renamed from: p */
    public C37306l<C24806c> f66329p;

    /* renamed from: q */
    boolean[] f66330q = new boolean[3];

    /* renamed from: r */
    boolean[] f66331r = new boolean[3];

    /* renamed from: s */
    public C37523a f66332s = new C25046c(this);

    /* renamed from: t */
    private C0997e f66333t = new C0997e() {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            MusicBoardWidget.this.f66322i = i;
            for (int i2 = 0; i2 < MusicBoardWidget.this.f66331r.length; i2++) {
                MusicBoardWidget.this.f66331r[i2] = MusicBoardWidget.this.f66330q[i2];
            }
            MusicBoardWidget.this.mo51048e();
        }
    };

    /* renamed from: f */
    public final void mo51049f() {
        this.f66321h.mo50732a((MusicModel) null);
    }

    /* renamed from: d */
    public final void mo51047d() {
        for (int i = 0; i < this.f66331r.length; i++) {
            this.f66330q[i] = false;
            this.f66331r[i] = false;
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f62238e.mo48226a("list", (C0199s<C23274a>) this).mo48226a("music_index", (C0199s<C23274a>) this).mo48226a("music_collect_status", (C0199s<C23274a>) this).mo48226a("play_compeleted", (C0199s<C23274a>) this).mo48226a("music_loading", (C0199s<C23274a>) this);
        this.f66326m = ((Integer) this.f62238e.mo48229a("key_choose_music_type")).intValue();
    }

    /* renamed from: e */
    public final void mo51048e() {
        int i;
        if (!C9376b.m18558a((Collection<T>) this.f66328o)) {
            if (this.f66322i * 3 < 0) {
                i = 0;
            } else {
                i = this.f66322i * 3;
            }
            int min = Math.min(i + 3, this.f66328o.size());
            for (int i2 = i; i2 < min; i2++) {
                int i3 = i2 - i;
                if (this.f66331r[i3]) {
                    this.f66331r[i3] = false;
                    MusicModel musicModel = (MusicModel) this.f66328o.get(i2);
                    if (musicModel != null) {
                        C24963c.m60718a(this.f66327n, musicModel.getMusicId(), i2, true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m60869a(List<Object> list) {
        if (list != null && this.f66324k < list.size()) {
            m60870a(((C24860p) list.get(this.f66324k)).f65782b, ((C24860p) list.get(this.f66324k)).f65781a);
        }
    }

    /* renamed from: a */
    public final void mo48220a(C23270a aVar) {
        super.mo48220a(aVar);
        m60869a((List) this.f62238e.mo48229a("list"));
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(java.lang.Object r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.arch.widgets.base.a r9 = (com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a) r9
            java.lang.String r0 = r9.f62242a
            int r1 = r0.hashCode()
            r2 = 0
            r3 = -1
            r4 = 1
            switch(r1) {
                case -1635157503: goto L_0x0037;
                case -1322093457: goto L_0x002d;
                case 3322014: goto L_0x0023;
                case 502104354: goto L_0x0019;
                case 1579846200: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0041
        L_0x000f:
            java.lang.String r1 = "music_index"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0019:
            java.lang.String r1 = "music_loading"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0041
            r0 = 2
            goto L_0x0042
        L_0x0023:
            java.lang.String r1 = "list"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0041
            r0 = 0
            goto L_0x0042
        L_0x002d:
            java.lang.String r1 = "play_compeleted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0041
            r0 = 4
            goto L_0x0042
        L_0x0037:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0041
            r0 = 3
            goto L_0x0042
        L_0x0041:
            r0 = -1
        L_0x0042:
            switch(r0) {
                case 0: goto L_0x017e;
                case 1: goto L_0x015e;
                case 2: goto L_0x0110;
                case 3: goto L_0x0089;
                case 4: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x018c
        L_0x0047:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f62238e
            java.lang.String r0 = "music_position"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r9 = r9.mo48230b(r0, r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r8.f62238e
            java.lang.String r1 = "music_index"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.m60871b(r9, r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f62238e
            java.lang.String r0 = "music_position"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r9.mo48228a(r0, r1)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f62238e
            java.lang.String r0 = "music_index"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r9.mo48228a(r0, r1)
            r8.mo51049f()
            goto L_0x018c
        L_0x0089:
            java.lang.Object r9 = r9.mo48246a()
            com.ss.android.ugc.aweme.choosemusic.a.a r9 = (com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24804a) r9
            int r0 = r9.f65650a
            if (r0 != r4) goto L_0x0099
            int r0 = r8.f66324k
            int r1 = r9.f65651b
            if (r0 == r1) goto L_0x009d
        L_0x0099:
            int r0 = r9.f65650a
            if (r0 != 0) goto L_0x018c
        L_0x009d:
            com.ss.android.ugc.aweme.arch.widgets.a r0 = r8.f62218a
            if (r0 == 0) goto L_0x010f
            com.ss.android.ugc.aweme.arch.widgets.a r0 = r8.f62218a
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder r0 = (com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder) r0
            r1 = 0
        L_0x00a6:
            android.support.v4.view.ViewPager r3 = r0.mVpMusicContainer
            int r3 = r3.getChildCount()
            if (r1 >= r3) goto L_0x010f
            android.support.v4.view.ViewPager r3 = r0.mVpMusicContainer
            android.view.View r3 = r3.getChildAt(r1)
            com.ss.android.ugc.aweme.choosemusic.view.l r3 = (com.p683ss.android.ugc.aweme.choosemusic.view.C24991l) r3
            if (r3 == 0) goto L_0x010f
            java.util.ArrayList r3 = r3.getMusicItemViews()
            if (r3 == 0) goto L_0x018c
            if (r9 != 0) goto L_0x00c2
            goto L_0x018c
        L_0x00c2:
            java.util.Iterator r3 = r3.iterator()
        L_0x00c6:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x010c
            java.lang.Object r5 = r3.next()
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r5 = (com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r5
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r6 = r9.f65654e
            if (r6 == 0) goto L_0x00f6
            java.lang.String r7 = r6.getMusicId()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00f6
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = r5.f66230c
            if (r7 == 0) goto L_0x00f6
            java.lang.String r6 = r6.getMusicId()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = r5.f66230c
            java.lang.String r7 = r7.getMusicId()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00f6
            r6 = 1
            goto L_0x00f7
        L_0x00f6:
            r6 = 0
        L_0x00f7:
            if (r6 == 0) goto L_0x00c6
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r5.f66230c
            int r9 = r9.f65653d
            if (r9 != r4) goto L_0x0102
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r9 = com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType.COLLECTED
            goto L_0x0104
        L_0x0102:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r9 = com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType.NOT_COLLECTED
        L_0x0104:
            r0.setCollectionType(r9)
            r5.mo51013b()
            goto L_0x018c
        L_0x010c:
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x010f:
            return
        L_0x0110:
            com.ss.android.ugc.aweme.arch.widgets.a r9 = r8.f62218a
            if (r9 == 0) goto L_0x018c
            com.ss.android.ugc.aweme.arch.widgets.a r9 = r8.f62218a
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder r9 = (com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder) r9
            int r0 = r8.f66323j
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r8.f62238e
            java.lang.String r3 = "music_loading"
            java.lang.Object r1 = r1.mo48229a(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r0 < 0) goto L_0x015d
        L_0x012a:
            android.support.v4.view.ViewPager r3 = r9.mVpMusicContainer
            int r3 = r3.getChildCount()
            if (r2 >= r3) goto L_0x015d
            android.support.v4.view.ViewPager r3 = r9.mVpMusicContainer
            android.view.View r3 = r3.getChildAt(r2)
            com.ss.android.ugc.aweme.choosemusic.view.l r3 = (com.p683ss.android.ugc.aweme.choosemusic.view.C24991l) r3
            if (r3 == 0) goto L_0x015d
            java.util.ArrayList r3 = r3.getMusicItemViews()
            if (r3 == 0) goto L_0x015d
            java.util.Iterator r3 = r3.iterator()
        L_0x0146:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x015a
            java.lang.Object r5 = r3.next()
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r5 = (com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r5
            int r6 = r5.f66231d
            if (r6 != r0) goto L_0x0146
            r5.mo51012a(r1, r4)
            goto L_0x018c
        L_0x015a:
            int r2 = r2 + 1
            goto L_0x012a
        L_0x015d:
            return
        L_0x015e:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r9 = r8.f62238e
            java.lang.String r0 = "music_position"
            java.lang.Object r9 = r9.mo48229a(r0)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r8.f62238e
            java.lang.String r1 = "music_index"
            java.lang.Object r0 = r0.mo48229a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.m60871b(r9, r0)
            return
        L_0x017e:
            com.ss.android.ugc.aweme.arch.widgets.a r0 = r8.f62218a
            if (r0 == 0) goto L_0x018c
            java.lang.Object r9 = r9.mo48246a()
            java.util.List r9 = (java.util.List) r9
            r8.m60869a(r9)
            return
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget.onChanged(java.lang.Object):void");
    }

    /* renamed from: a */
    public final void mo51046a(int i, int i2) {
        if (this.f62218a != null) {
            ((MusicBoardViewHolder) this.f62218a).mo50998a(i, i2, this.f66330q, this.f66331r);
            mo51048e();
        }
    }

    /* renamed from: b */
    private void m60871b(int i, int i2) {
        int i3;
        if (this.f62218a != null) {
            MusicBoardViewHolder musicBoardViewHolder = (MusicBoardViewHolder) this.f62218a;
            int i4 = this.f66323j;
            if (i == this.f66324k) {
                i3 = i2;
            } else {
                i3 = -1;
            }
            musicBoardViewHolder.mo50997a(i4, i3);
        }
        if (i != this.f66324k) {
            this.f66323j = -1;
        } else if (this.f66323j == i2) {
            this.f66321h.mo50732a((MusicModel) null);
        } else {
            this.f66323j = i2;
        }
    }

    /* renamed from: a */
    private void m60870a(List<MusicModel> list, MusicCollectionItem musicCollectionItem) {
        if (list == null || musicCollectionItem == null) {
            LayoutParams layoutParams = ((MusicBoardViewHolder) this.f62218a).itemView.getLayoutParams();
            layoutParams.height = 0;
            ((MusicBoardViewHolder) this.f62218a).itemView.setLayoutParams(layoutParams);
            return;
        }
        if (this.f66324k == 0) {
            ((MusicBoardViewHolder) this.f62218a).mo51002b();
        } else {
            ((MusicBoardViewHolder) this.f62218a).mo50996a();
        }
        this.f66328o = list;
        this.f66327n = new C24803a("change_music_page", musicCollectionItem.mcName, "", C24963c.m60726b());
        this.f66327n.f65645e = musicCollectionItem.mcId;
        ((MusicBoardViewHolder) this.f62218a).mo50999a(this.f66333t);
        ((MusicBoardViewHolder) this.f62218a).mo51001a(musicCollectionItem, list, this.f66322i, this.f66323j, this.f66324k, this.f66327n, musicCollectionItem.isHot);
        ((MusicBoardViewHolder) this.f62218a).mo51000a((C24989j) new C25047d(this, musicCollectionItem), this.f66329p);
    }

    /* renamed from: a */
    public final void mo48239a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.f66325l) {
            mo48242c().setResult(-1, intent);
            mo48242c().finish();
        }
    }
}
