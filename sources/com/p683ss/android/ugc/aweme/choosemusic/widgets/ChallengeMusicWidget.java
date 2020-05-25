package com.p683ss.android.ugc.aweme.choosemusic.widgets;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.arch.widgets.C23270a;
import com.p683ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24836e;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget */
public class ChallengeMusicWidget extends ListItemWidget<ChallengeMusicView> implements C0199s<C23274a> {

    /* renamed from: h */
    Challenge f66310h;

    /* renamed from: i */
    public C24833b f66311i;

    /* renamed from: j */
    int f66312j = -1;

    /* renamed from: k */
    public int f66313k;

    /* renamed from: l */
    public int f66314l;

    /* renamed from: m */
    C24803a f66315m;

    /* renamed from: n */
    public C37306l<C24806c> f66316n;

    /* renamed from: o */
    public C24836e f66317o;

    /* renamed from: p */
    private int f66318p;

    /* renamed from: d */
    public final void mo51045d() {
        this.f66311i.mo50732a((MusicModel) null);
    }

    /* renamed from: e */
    private void m60864e() {
        if (this.f66310h == null) {
            ((ChallengeMusicView) this.f62218a).itemView.setVisibility(8);
            return;
        }
        ((ChallengeMusicView) this.f62218a).itemView.setVisibility(0);
        ((ChallengeMusicView) this.f62218a).mo50935a(this.f66310h, C24964d.m60740b(this.f66310h.getConnectMusics()), ((Integer) this.f62238e.mo48230b("music_position", Integer.valueOf(-1))).intValue(), this.f66312j, (String) this.f62238e.mo48230b("challenge_id", null), new C25044a(this), this.f66316n);
    }

    public void onCreate() {
        this.f62238e.mo48226a("data_challenge", (C0199s<C23274a>) this).mo48226a("music_index", (C0199s<C23274a>) this).mo48226a("music_collect_status", (C0199s<C23274a>) this).mo48226a("music_loading", (C0199s<C23274a>) this);
        this.f66318p = ((Integer) this.f62238e.mo48229a("key_choose_music_type")).intValue();
        super.onCreate();
        this.f66315m = new C24803a("change_music_page", "attached_song", "", C24963c.m60726b());
        this.f66315m.f65647g = (String) this.f62238e.mo48230b("challenge_id", null);
    }

    /* renamed from: a */
    public final void mo48220a(C23270a aVar) {
        super.mo48220a(aVar);
        this.f66310h = (Challenge) this.f62238e.mo48229a("data_challenge");
        m60864e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(java.lang.Object r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.arch.widgets.base.a r8 = (com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a) r8
            java.lang.String r0 = r8.f62242a
            int r1 = r0.hashCode()
            r2 = -1635157503(0xffffffff9e897a01, float:-1.4555899E-20)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r1 == r2) goto L_0x003e
            r2 = 502104354(0x1ded8122, float:6.2866898E-21)
            if (r1 == r2) goto L_0x0034
            r2 = 1579846200(0x5e2a8a38, float:3.07217403E18)
            if (r1 == r2) goto L_0x002a
            r2 = 2085247502(0x7c4a5a0e, float:4.202682E36)
            if (r1 == r2) goto L_0x0020
            goto L_0x0048
        L_0x0020:
            java.lang.String r1 = "data_challenge"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0048
            r0 = 0
            goto L_0x0049
        L_0x002a:
            java.lang.String r1 = "music_index"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0048
            r0 = 2
            goto L_0x0049
        L_0x0034:
            java.lang.String r1 = "music_loading"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0048
            r0 = 3
            goto L_0x0049
        L_0x003e:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0048
            r0 = 1
            goto L_0x0049
        L_0x0048:
            r0 = -1
        L_0x0049:
            switch(r0) {
                case 0: goto L_0x016c;
                case 1: goto L_0x00fc;
                case 2: goto L_0x00a0;
                case 3: goto L_0x004e;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0178
        L_0x004e:
            com.ss.android.ugc.aweme.arch.widgets.a r8 = r7.f62218a
            if (r8 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r8 = r7.f62238e
            java.lang.String r0 = "music_position"
            java.lang.Object r8 = r8.mo48229a(r0)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            int r5 = r8.intValue()
        L_0x0063:
            int r8 = r7.f66313k
            if (r8 != r5) goto L_0x0178
            com.ss.android.ugc.aweme.arch.widgets.a r8 = r7.f62218a
            com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView r8 = (com.p683ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView) r8
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f62238e
            java.lang.String r1 = "music_index"
            java.lang.Object r0 = r0.mo48229a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.f62238e
            java.lang.String r2 = "music_loading"
            java.lang.Object r1 = r1.mo48229a(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r0 < 0) goto L_0x009f
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r2 = r8.f66099b
            int r2 = r2.size()
            if (r0 < r2) goto L_0x0092
            goto L_0x009f
        L_0x0092:
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r8 = r8.f66099b
            java.lang.Object r8 = r8.get(r0)
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r8 = (com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r8
            r8.mo51012a(r1, r4)
            goto L_0x0178
        L_0x009f:
            return
        L_0x00a0:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r8 = r7.f62238e
            java.lang.String r0 = "music_position"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r8 = r8.mo48230b(r0, r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f62238e
            java.lang.String r1 = "music_index"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r1 = r7.ci_()
            if (r1 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.arch.widgets.a r1 = r7.f62218a
            com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView r1 = (com.p683ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView) r1
            int r2 = r7.f66312j
            r4 = -2
            if (r2 < 0) goto L_0x00e7
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r6 = r1.f66099b
            int r6 = r6.size()
            if (r2 < r6) goto L_0x00dc
            goto L_0x00e7
        L_0x00dc:
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r1 = r1.f66099b
            java.lang.Object r1 = r1.get(r2)
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r1 = (com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r1
            r1.mo51012a(r3, r3)
        L_0x00e7:
            if (r8 == r4) goto L_0x00ed
            r7.f66312j = r5
            goto L_0x0178
        L_0x00ed:
            int r8 = r7.f66312j
            if (r8 != r0) goto L_0x00f9
            com.ss.android.ugc.aweme.choosemusic.b.b r8 = r7.f66311i
            r0 = 0
            r8.mo50732a(r0)
            goto L_0x0178
        L_0x00f9:
            r7.f66312j = r0
        L_0x00fb:
            return
        L_0x00fc:
            java.lang.Object r8 = r8.mo48246a()
            com.ss.android.ugc.aweme.choosemusic.a.a r8 = (com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24804a) r8
            int r0 = r8.f65650a
            if (r0 != r4) goto L_0x010c
            int r0 = r7.f66313k
            int r1 = r8.f65651b
            if (r0 == r1) goto L_0x0110
        L_0x010c:
            int r0 = r8.f65650a
            if (r0 != 0) goto L_0x0178
        L_0x0110:
            com.ss.android.ugc.aweme.arch.widgets.a r0 = r7.f62218a
            if (r0 == 0) goto L_0x016b
            com.ss.android.ugc.aweme.arch.widgets.a r0 = r7.f62218a
            com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView r0 = (com.p683ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView) r0
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r1 = r0.f66099b
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 != 0) goto L_0x016b
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r0 = r0.f66099b
            java.util.Iterator r0 = r0.iterator()
        L_0x0126:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x016b
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r1 = (com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r1
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = r8.f65654e
            if (r2 == 0) goto L_0x0156
            java.lang.String r5 = r2.getMusicId()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0156
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r5 = r1.f66230c
            if (r5 == 0) goto L_0x0156
            java.lang.String r2 = r2.getMusicId()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r5 = r1.f66230c
            java.lang.String r5 = r5.getMusicId()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0156
            r2 = 1
            goto L_0x0157
        L_0x0156:
            r2 = 0
        L_0x0157:
            if (r2 == 0) goto L_0x0126
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r1.f66230c
            int r8 = r8.f65653d
            if (r8 != r4) goto L_0x0162
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r8 = com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType.COLLECTED
            goto L_0x0164
        L_0x0162:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r8 = com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType.NOT_COLLECTED
        L_0x0164:
            r0.setCollectionType(r8)
            r1.mo51013b()
            goto L_0x0178
        L_0x016b:
            return
        L_0x016c:
            java.lang.Object r8 = r8.mo48246a()
            com.ss.android.ugc.aweme.discover.model.Challenge r8 = (com.p683ss.android.ugc.aweme.discover.model.Challenge) r8
            r7.f66310h = r8
            r7.m60864e()
            return
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget.onChanged(java.lang.Object):void");
    }
}
