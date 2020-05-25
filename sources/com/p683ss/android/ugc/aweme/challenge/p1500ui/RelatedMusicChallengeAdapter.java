package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter */
public final class RelatedMusicChallengeAdapter extends C1322a<TagViewHolder> {

    /* renamed from: a */
    List<RelatedChallengeMusic> f65173a;

    /* renamed from: b */
    public String f65174b;

    /* renamed from: c */
    public Context f65175c;

    /* renamed from: d */
    public String f65176d;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter$TagViewHolder */
    static class TagViewHolder extends C1352v {
        LinearLayout llRelated;
        TextView txtName;

        TagViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter$TagViewHolder_ViewBinding */
    public class TagViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private TagViewHolder f65180a;

        public void unbind() {
            TagViewHolder tagViewHolder = this.f65180a;
            if (tagViewHolder != null) {
                this.f65180a = null;
                tagViewHolder.txtName = null;
                tagViewHolder.llRelated = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public TagViewHolder_ViewBinding(TagViewHolder tagViewHolder, View view) {
            this.f65180a = tagViewHolder;
            tagViewHolder.txtName = (TextView) Utils.findRequiredViewAsType(view, R.id.bpu, "field 'txtName'", TextView.class);
            tagViewHolder.llRelated = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cb0, "field 'llRelated'", LinearLayout.class);
        }
    }

    public final int getItemCount() {
        if (C9376b.m18558a((Collection<T>) this.f65173a)) {
            return 0;
        }
        return this.f65173a.size();
    }

    public final int getItemViewType(int i) {
        RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) this.f65173a.get(i);
        if (relatedChallengeMusic != null) {
            int i2 = relatedChallengeMusic.categoryType;
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2) {
                return 2;
            }
        }
        return super.getItemViewType(i);
    }

    public RelatedMusicChallengeAdapter(List<RelatedChallengeMusic> list, Context context) {
        this.f65173a = list;
        this.f65175c = context;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        TagViewHolder tagViewHolder = (TagViewHolder) vVar;
        final int itemViewType = getItemViewType(i);
        final RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) this.f65173a.get(i);
        if (relatedChallengeMusic != null) {
            if (itemViewType == 2) {
                Challenge challenge = relatedChallengeMusic.challenge;
                if (challenge != null) {
                    tagViewHolder.txtName.setText(challenge.getChallengeName());
                }
            } else if (itemViewType == 1) {
                Music music = relatedChallengeMusic.music;
                if (music != null) {
                    tagViewHolder.txtName.setText(music.getMusicName());
                }
            }
            tagViewHolder.llRelated.setOnClickListener(new OnClickListener() {
                /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
                    if (com.p683ss.android.ugc.aweme.component.music.MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(r5.convertToMusicModel(), r1, true) == false) goto L_0x0024;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.view.View r5) {
                    /*
                        r4 = this;
                        com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r5)
                        int r5 = r0
                        r0 = 1
                        if (r5 != r0) goto L_0x007d
                        com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic r5 = r5
                        com.ss.android.ugc.aweme.music.model.Music r5 = r5.music
                        com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter r1 = com.p683ss.android.ugc.aweme.challenge.p1500ui.RelatedMusicChallengeAdapter.this
                        android.content.Context r1 = r1.f65175c
                        if (r5 == 0) goto L_0x0023
                        com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = r5.convertToMusicModel()
                        com.ss.android.ugc.aweme.music.service.IMusicService r3 = com.p683ss.android.ugc.aweme.component.music.MusicService.createIMusicServicebyMonsterPlugin()
                        com.ss.android.ugc.aweme.music.service.IMusicService r3 = (com.p683ss.android.ugc.aweme.music.service.IMusicService) r3
                        boolean r1 = r3.checkValidMusic(r2, r1, r0)
                        if (r1 != 0) goto L_0x0023
                        goto L_0x0024
                    L_0x0023:
                        r0 = 0
                    L_0x0024:
                        if (r0 == 0) goto L_0x0027
                        return
                    L_0x0027:
                        if (r5 == 0) goto L_0x007c
                        com.ss.android.ugc.aweme.common.MobClick r0 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
                        java.lang.String r1 = "choose_music"
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
                        com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter r1 = com.p683ss.android.ugc.aweme.challenge.p1500ui.RelatedMusicChallengeAdapter.this
                        java.lang.String r1 = r1.f65176d
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
                        java.lang.String r1 = r5.getMid()
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)
                        com.ss.android.ugc.aweme.app.f.c r1 = new com.ss.android.ugc.aweme.app.f.c
                        r1.<init>()
                        java.lang.String r2 = "host"
                        com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter r3 = com.p683ss.android.ugc.aweme.challenge.p1500ui.RelatedMusicChallengeAdapter.this
                        java.lang.String r3 = r3.f65174b
                        com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
                        org.json.JSONObject r1 = r1.mo47825b()
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
                        com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r0)
                        com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter r0 = com.p683ss.android.ugc.aweme.challenge.p1500ui.RelatedMusicChallengeAdapter.this
                        android.content.Context r0 = r0.f65175c
                        java.lang.String r1 = "aweme://music/detail"
                        com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r1)
                        java.lang.String r1 = "id"
                        java.lang.String r5 = r5.getMid()
                        com.bytedance.router.SmartRoute r5 = r0.withParam(r1, r5)
                        java.lang.String r0 = "extra_music_from"
                        java.lang.String r1 = "from_related_tag"
                        com.bytedance.router.SmartRoute r5 = r5.withParam(r0, r1)
                        r5.open()
                    L_0x007c:
                        return
                    L_0x007d:
                        int r5 = r0
                        r0 = 2
                        if (r5 != r0) goto L_0x00cc
                        com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic r5 = r5
                        com.ss.android.ugc.aweme.discover.model.Challenge r5 = r5.challenge
                        if (r5 == 0) goto L_0x00cc
                        com.ss.android.ugc.aweme.common.MobClick r0 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
                        java.lang.String r1 = "choose_challenge"
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
                        com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter r1 = com.p683ss.android.ugc.aweme.challenge.p1500ui.RelatedMusicChallengeAdapter.this
                        java.lang.String r1 = r1.f65176d
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
                        java.lang.String r1 = r5.getCid()
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)
                        com.ss.android.ugc.aweme.app.f.c r1 = new com.ss.android.ugc.aweme.app.f.c
                        r1.<init>()
                        java.lang.String r2 = "host"
                        com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter r3 = com.p683ss.android.ugc.aweme.challenge.p1500ui.RelatedMusicChallengeAdapter.this
                        java.lang.String r3 = r3.f65174b
                        com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
                        org.json.JSONObject r1 = r1.mo47825b()
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
                        com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r0)
                        com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter r0 = com.p683ss.android.ugc.aweme.challenge.p1500ui.RelatedMusicChallengeAdapter.this
                        android.content.Context r0 = r0.f65175c
                        com.p683ss.android.ugc.aweme.commercialize.utils.C26403au.m63862a(r5)
                        java.lang.String r5 = r5.getCid()
                        java.lang.String r1 = "from_related_tag"
                        com.p683ss.android.ugc.aweme.challenge.p1500ui.ChallengeDetailActivity.m60062a(r0, r5, r1)
                    L_0x00cc:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.RelatedMusicChallengeAdapter.C246251.onClick(android.view.View):void");
                }
            });
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            view = from.inflate(R.layout.b8b, viewGroup, false);
        } else {
            view = from.inflate(R.layout.b8j, viewGroup, false);
        }
        return new TagViewHolder(view);
    }
}
