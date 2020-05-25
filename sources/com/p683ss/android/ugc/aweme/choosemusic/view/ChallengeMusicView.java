package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.arch.widgets.C23270a;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView */
public class ChallengeMusicView extends C23270a {

    /* renamed from: b */
    public List<MusicItemViewHolder> f66099b = new ArrayList();

    /* renamed from: c */
    int f66100c;

    /* renamed from: d */
    C24803a f66101d;

    /* renamed from: e */
    private Context f66102e;
    LinearLayout mLlMusicContainer;
    TextView mTvwContent;
    LinearLayout mVgContainer;
    View mVwDivider;

    /* renamed from: a */
    public final void mo50936a(final String str) {
        String str2;
        SpannableString spannableString;
        int measuredWidth = this.mTvwContent.getMeasuredWidth();
        if (measuredWidth == 0) {
            this.mTvwContent.post(new Runnable() {
                public final void run() {
                    ChallengeMusicView.this.mo50936a(str);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder("#");
        sb.append(str);
        String sb2 = sb.toString();
        TextPaint paint = this.mTvwContent.getPaint();
        String string = this.f66102e.getString(R.string.d4o);
        float measureText = ((float) measuredWidth) - paint.measureText(string.replace("%s", ""));
        if (paint.measureText(sb2) > measureText) {
            str2 = C2240a.m6772a(string, new Object[]{TextUtils.ellipsize(sb2, paint, measureText, TruncateAt.END)});
            spannableString = new SpannableString(str2);
        } else {
            str2 = C2240a.m6772a(string, new Object[]{sb2});
            spannableString = new SpannableString(str2);
        }
        spannableString.setSpan(new StyleSpan(1), string.indexOf("%s"), ((string.indexOf("%s") + 2) + str2.length()) - string.length(), 17);
        this.mTvwContent.setText(spannableString);
    }

    public ChallengeMusicView(View view, int i) {
        super(view);
        this.f66102e = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.f66100c = i;
        float b = C9432q.m18687b(this.f66102e, 16.0f);
        this.mVgContainer.setPadding(0, 0, 0, 0);
        this.mVgContainer.setBackgroundColor(0);
        ((MarginLayoutParams) this.mVgContainer.getLayoutParams()).rightMargin = 0;
        this.mVgContainer.requestLayout();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mTvwContent.getLayoutParams();
        marginLayoutParams.rightMargin = (int) (((float) marginLayoutParams.rightMargin) + b);
        ((MarginLayoutParams) this.mVwDivider.getLayoutParams()).rightMargin = (int) b;
        this.mVwDivider.setVisibility(0);
        this.f66101d = new C24803a("change_music_page", "attached_song", "", C24963c.m60726b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50935a(com.p683ss.android.ugc.aweme.discover.model.Challenge r18, java.util.List<com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel> r19, int r20, int r21, java.lang.String r22, com.p683ss.android.ugc.aweme.choosemusic.view.C24989j r23, com.p683ss.android.ugc.aweme.music.adapter.C37306l<com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c> r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            if (r18 != 0) goto L_0x0007
            return
        L_0x0007:
            android.content.Context r3 = r0.f66102e
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            java.lang.String r2 = r18.getChallengeName()
            r0.mo50936a(r2)
            com.ss.android.ugc.aweme.choosemusic.a r2 = r0.f66101d
            r4 = r22
            r2.f65647g = r4
            int r2 = r19.size()
            android.widget.LinearLayout r4 = r0.mLlMusicContainer
            int r4 = r4.getChildCount()
            int r2 = r2 - r4
            r4 = 0
            r5 = 0
        L_0x0027:
            if (r5 >= r2) goto L_0x004b
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r6 = new com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder
            r7 = 2132215044(0x7f170504, float:2.0073947E38)
            android.widget.LinearLayout r8 = r0.mLlMusicContainer
            android.view.View r7 = r3.inflate(r7, r8, r4)
            int r8 = r0.f66100c
            r6.<init>(r7, r8)
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r7 = r0.f66099b
            r7.add(r6)
            r6.mo51007a()
            android.widget.LinearLayout r7 = r0.mLlMusicContainer
            android.view.View r6 = r6.itemView
            r7.addView(r6)
            int r5 = r5 + 1
            goto L_0x0027
        L_0x004b:
            r2 = 0
        L_0x004c:
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r3 = r0.f66099b
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x00a3
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r3 = r0.f66099b
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r3 = (com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r3
            java.lang.Object r5 = r1.get(r2)
            r7 = r5
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = (com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel) r7
            java.lang.String r8 = ""
            r9 = 0
            r5 = -2
            r15 = 1
            r14 = r20
            if (r14 != r5) goto L_0x0072
            r5 = r21
            if (r2 != r5) goto L_0x0074
            r10 = 1
            goto L_0x0075
        L_0x0072:
            r5 = r21
        L_0x0074:
            r10 = 0
        L_0x0075:
            r11 = 0
            r12 = 0
            r13 = 0
            com.ss.android.ugc.aweme.choosemusic.a r6 = r0.f66101d
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
            com.ss.android.ugc.aweme.choosemusic.a r8 = r0.f66101d
            if (r3 == 0) goto L_0x009a
            java.lang.String r3 = r3.getMusicId()
            goto L_0x009c
        L_0x009a:
            java.lang.String r3 = ""
        L_0x009c:
            com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c.m60718a(r8, r3, r2, r4)
            int r2 = r2 + 1
            r4 = 0
            goto L_0x004c
        L_0x00a3:
            com.ss.android.ugc.aweme.services.IExternalService r2 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r2 = (com.p683ss.android.ugc.aweme.services.IExternalService) r2
            com.ss.android.ugc.aweme.services.video.IAVPublishService r2 = r2.publishService()
            java.lang.String r2 = r2.getShootWay()
            com.ss.android.ugc.aweme.services.IExternalService r3 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r3 = (com.p683ss.android.ugc.aweme.services.IExternalService) r3
            com.ss.android.ugc.aweme.services.video.IAVPublishService r3 = r3.publishService()
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r3 = r3.getCurChallenge()
            java.lang.String r4 = "challenge"
            boolean r4 = android.text.TextUtils.equals(r2, r4)
            if (r4 == 0) goto L_0x011a
            if (r3 == 0) goto L_0x011a
            boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r19)
            if (r4 == 0) goto L_0x00d0
            goto L_0x011a
        L_0x00d0:
            boolean r4 = r3.isCommerce
            if (r4 == 0) goto L_0x0119
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r19.iterator()
        L_0x00dd:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00f3
            java.lang.Object r5 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r5 = (com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel) r5
            if (r5 == 0) goto L_0x00dd
            java.lang.String r5 = r5.getMusicId()
            r4.add(r5)
            goto L_0x00dd
        L_0x00f3:
            java.lang.String r1 = "music_recommendations_monitor"
            com.ss.android.ugc.aweme.app.f.c r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r6 = "shoot_way"
            com.ss.android.ugc.aweme.app.f.c r2 = r5.mo47824a(r6, r2)
            java.lang.String r5 = "challenge_id"
            java.lang.String r3 = r3.cid
            com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r5, r3)
            java.lang.String r3 = "music_ids"
            java.lang.String r4 = r4.toString()
            com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r3, r4)
            org.json.JSONObject r2 = r2.mo47825b()
            r3 = 0
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r1, r3, r2)
        L_0x0119:
            return
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView.mo50935a(com.ss.android.ugc.aweme.discover.model.Challenge, java.util.List, int, int, java.lang.String, com.ss.android.ugc.aweme.choosemusic.view.j, com.ss.android.ugc.aweme.music.adapter.l):void");
    }
}
