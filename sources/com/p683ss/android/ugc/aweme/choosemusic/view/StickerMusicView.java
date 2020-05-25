package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.arch.widgets.C23270a;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StickerMusicView */
public class StickerMusicView extends C23270a {

    /* renamed from: b */
    public List<MusicItemViewHolder> f66138b = new ArrayList();

    /* renamed from: c */
    public boolean f66139c;

    /* renamed from: d */
    private Context f66140d;

    /* renamed from: e */
    private int f66141e;

    /* renamed from: f */
    private C24803a f66142f;
    LinearLayout mLlMusicContainer;
    TextView mTvwContent;
    LinearLayout mVgContainer;
    View mVwDivider;

    public StickerMusicView(View view, int i) {
        super(view);
        this.f66140d = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.f66141e = i;
        this.mTvwContent.getPaint().setFakeBoldText(true);
        float b = C9432q.m18687b(this.f66140d, 16.0f);
        this.mVgContainer.setPadding(0, 0, 0, 0);
        this.mVgContainer.setBackgroundColor(0);
        ((MarginLayoutParams) this.mVgContainer.getLayoutParams()).rightMargin = 0;
        this.mVgContainer.requestLayout();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mTvwContent.getLayoutParams();
        marginLayoutParams.rightMargin = (int) (((float) marginLayoutParams.rightMargin) + b);
        ((MarginLayoutParams) this.mVwDivider.getLayoutParams()).rightMargin = (int) b;
        this.mVwDivider.setVisibility(0);
        this.f66142f = new C24803a("change_music_page", "attached_song", "", C24963c.m60726b());
        this.f66142f.f65642b = "prop";
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50967a(java.util.List<com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel> r18, int r19, int r20, boolean r21, java.lang.String r22, com.p683ss.android.ugc.aweme.choosemusic.view.C24989j r23, com.p683ss.android.ugc.aweme.music.adapter.C37306l<com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c> r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r0.f66139c
            if (r2 == 0) goto L_0x0011
            android.widget.TextView r2 = r0.mTvwContent
            r3 = 2132548236(0x7f1c1a8c, float:2.074974E38)
            r2.setText(r3)
            goto L_0x0024
        L_0x0011:
            if (r21 == 0) goto L_0x001c
            android.widget.TextView r2 = r0.mTvwContent
            r3 = 2132547232(0x7f1c16a0, float:2.0747704E38)
            r2.setText(r3)
            goto L_0x0024
        L_0x001c:
            android.widget.TextView r2 = r0.mTvwContent
            r3 = 2132548237(0x7f1c1a8d, float:2.0749743E38)
            r2.setText(r3)
        L_0x0024:
            int r2 = r18.size()
            android.widget.LinearLayout r3 = r0.mLlMusicContainer
            int r3 = r3.getChildCount()
            int r2 = r2 - r3
            com.ss.android.ugc.aweme.choosemusic.a r3 = r0.f66142f
            r4 = r22
            r3.f65646f = r4
            android.content.Context r3 = r0.f66140d
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 0
            r5 = 0
        L_0x003d:
            if (r5 >= r2) goto L_0x0061
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r6 = new com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder
            r7 = 2132215044(0x7f170504, float:2.0073947E38)
            android.widget.LinearLayout r8 = r0.mLlMusicContainer
            android.view.View r7 = r3.inflate(r7, r8, r4)
            int r8 = r0.f66141e
            r6.<init>(r7, r8)
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r7 = r0.f66138b
            r7.add(r6)
            r6.mo51007a()
            android.widget.LinearLayout r7 = r0.mLlMusicContainer
            android.view.View r6 = r6.itemView
            r7.addView(r6)
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0061:
            r2 = 0
        L_0x0062:
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r3 = r0.f66138b
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x00b9
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r3 = r0.f66138b
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r3 = (com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r3
            java.lang.Object r5 = r1.get(r2)
            r7 = r5
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = (com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel) r7
            java.lang.String r8 = ""
            r9 = 0
            r5 = -2
            r15 = 1
            r14 = r19
            if (r5 != r14) goto L_0x0088
            r5 = r20
            if (r2 != r5) goto L_0x008a
            r10 = 1
            goto L_0x008b
        L_0x0088:
            r5 = r20
        L_0x008a:
            r10 = 0
        L_0x008b:
            r11 = 0
            r12 = 0
            r13 = 0
            com.ss.android.ugc.aweme.choosemusic.a r6 = r0.f66142f
            r16 = r6
            r6 = r3
            r14 = r2
            r4 = 1
            r15 = r16
            r6.mo51009a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r6 = r23
            r7 = r24
            r3.mo51008a(r6, r7)
            java.lang.Object r3 = r1.get(r2)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = (com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel) r3
            com.ss.android.ugc.aweme.choosemusic.a r8 = r0.f66142f
            if (r3 == 0) goto L_0x00b0
            java.lang.String r3 = r3.getMusicId()
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r3 = ""
        L_0x00b2:
            com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c.m60718a(r8, r3, r2, r4)
            int r2 = r2 + 1
            r4 = 0
            goto L_0x0062
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.view.StickerMusicView.mo50967a(java.util.List, int, int, boolean, java.lang.String, com.ss.android.ugc.aweme.choosemusic.view.j, com.ss.android.ugc.aweme.music.adapter.l):void");
    }
}
