package com.p683ss.android.ugc.aweme.music.adapter;

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
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicDetailRelatedAdapter */
public final class MusicDetailRelatedAdapter extends C1322a<TagViewHolder> {

    /* renamed from: a */
    List<RelatedChallengeMusic> f95109a;

    /* renamed from: b */
    public String f95110b;

    /* renamed from: c */
    public Context f95111c;

    /* renamed from: d */
    public String f95112d;

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicDetailRelatedAdapter$TagViewHolder */
    static class TagViewHolder extends C1352v {
        LinearLayout llRelated;
        TextView txtName;

        TagViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicDetailRelatedAdapter$TagViewHolder_ViewBinding */
    public class TagViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private TagViewHolder f95116a;

        public void unbind() {
            TagViewHolder tagViewHolder = this.f95116a;
            if (tagViewHolder != null) {
                this.f95116a = null;
                tagViewHolder.txtName = null;
                tagViewHolder.llRelated = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public TagViewHolder_ViewBinding(TagViewHolder tagViewHolder, View view) {
            this.f95116a = tagViewHolder;
            tagViewHolder.txtName = (TextView) Utils.findRequiredViewAsType(view, R.id.bpu, "field 'txtName'", TextView.class);
            tagViewHolder.llRelated = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cb0, "field 'llRelated'", LinearLayout.class);
        }
    }

    public final int getItemCount() {
        if (C9376b.m18558a((Collection<T>) this.f95109a)) {
            return 0;
        }
        return this.f95109a.size();
    }

    public final int getItemViewType(int i) {
        RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) this.f95109a.get(i);
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

    public MusicDetailRelatedAdapter(List<RelatedChallengeMusic> list, Context context) {
        this.f95109a = list;
        this.f95111c = context;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        TagViewHolder tagViewHolder = (TagViewHolder) vVar;
        final int itemViewType = getItemViewType(i);
        final RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) this.f95109a.get(i);
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
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (itemViewType == 1) {
                        Music music = relatedChallengeMusic.music;
                        if (music != null) {
                            if (!MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(music.convertToMusicModel(), MusicDetailRelatedAdapter.this.f95111c, true)) {
                                return;
                            }
                        }
                        if (music != null) {
                            C26890h.onEvent(MobClick.obtain().setEventName("choose_music").setLabelName(MusicDetailRelatedAdapter.this.f95112d).setValue(music.getMid()).setJsonObject(new C23088c().mo47824a("host", MusicDetailRelatedAdapter.this.f95110b).mo47825b()));
                            SmartRouter.buildRoute(view.getContext(), "aweme://music/detail/").withParam("id", music.getMid()).withParam("extra_music_from", "from_related_tag").open();
                        }
                        return;
                    }
                    if (itemViewType == 2) {
                        Challenge challenge = relatedChallengeMusic.challenge;
                        if (challenge != null) {
                            C26403au.m63862a(challenge);
                            C26890h.onEvent(MobClick.obtain().setEventName("choose_challenge").setLabelName(MusicDetailRelatedAdapter.this.f95112d).setValue(challenge.getCid()).setJsonObject(new C23088c().mo47824a("host", MusicDetailRelatedAdapter.this.f95110b).mo47825b()));
                            SmartRouter.buildRoute(MusicDetailRelatedAdapter.this.f95111c, "//challenge/detail").withParam("aweme_id", "").withParam("id", challenge.getCid()).withParam("extra_challenge_from", "from_related_tag").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("extra_challenge_is_hashtag", false).open();
                        }
                    }
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
