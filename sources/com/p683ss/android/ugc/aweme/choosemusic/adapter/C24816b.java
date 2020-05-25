package com.p683ss.android.ugc.aweme.choosemusic.adapter;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24840c;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24841d;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24866v;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24989j;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemNoLyricViewHolder;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.SearchMusicWithLyricViewHolder;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.discover.adapter.music.SearchMusicDepentServiceImpl;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p683ss.android.ugc.aweme.music.p1977e.C37377b;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g.C37383a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw.C37523a;
import com.p683ss.android.ugc.aweme.music.service.ISearchMusicDepentService;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.ss.android.ugc.trill.R;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.b */
public final class C24816b extends C26840g<MusicModel> {

    /* renamed from: A */
    private C24989j f65693A = new C24989j() {
        /* renamed from: a */
        public final void mo50703a(MusicItemViewHolder musicItemViewHolder, View view, MusicModel musicModel, int i) {
            String str;
            String str2;
            String str3;
            if (musicModel != null && view != null && view.getContext() != null) {
                if (!TextUtils.isEmpty(musicModel.getSearchKeyWords())) {
                    MusicSearchHistory musicSearchHistory = new MusicSearchHistory(musicModel.getSearchKeyWords());
                    if (C24816b.this.f65704j) {
                        C24840c.m60407c().mo50743b(musicSearchHistory);
                    } else {
                        C24841d.m60410c().mo50743b(musicSearchHistory);
                    }
                }
                if (!C24826i.m60379a(view.getContext())) {
                    C10691a.m21542b(view.getContext(), (int) R.string.cg1).mo19066a();
                    return;
                }
                int id = view.getId();
                C24816b.this.f65700f.f65649i = musicModel.getLogPb();
                if (id == R.id.b2l) {
                    Activity g = C11016e.m22312g();
                    if (g != null) {
                        g.getString(R.string.b17);
                    }
                    if (!AccountService.createIAccountServicebyMonsterPlugin().userService().isLogin()) {
                        C27965f.m66720a(C11016e.m22312g(), C24964d.m60737a(i), "click_favorite_music", (Bundle) null);
                        return;
                    }
                    musicItemViewHolder.mo51014c();
                    C24963c.m60725a(musicItemViewHolder.f66228a, musicModel.getMusicId(), C24816b.this.f65700f, musicItemViewHolder.f66231d, musicModel.getLogPb());
                    if (C24816b.this.f65704j) {
                        String str4 = C24816b.this.f65699e;
                        String name = musicModel.getName();
                        C26890h.m65011a("favorite_lyricsticker_song", C24963c.m60735g().mo47829a("search_keyword", str4).mo47829a("music_name", name).mo47829a("music_id", musicModel.getMusicId()).mo47826a("after_search", TextUtils.isEmpty(str4) ^ true ? 1 : 0).f61491a);
                    }
                    if (TextUtils.equals("search_music", C24816b.this.f65700f.f65641a)) {
                        ISearchMusicDepentService createISearchMusicDepentServicebyMonsterPlugin = SearchMusicDepentServiceImpl.createISearchMusicDepentServicebyMonsterPlugin();
                        String str5 = C24816b.this.f65700f.f65641a;
                        int position = musicItemViewHolder.getPosition();
                        if (musicItemViewHolder.f66228a) {
                            str3 = "click_favourite_button";
                        } else {
                            str3 = "click_cancel_favourite";
                        }
                        createISearchMusicDepentServicebyMonsterPlugin.mobClickMusicCardEvent(str5, musicModel, position, str3);
                    }
                    return;
                }
                if (id == R.id.b2n) {
                    if (musicModel != null && musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                        String offlineDesc = musicModel.getMusic().getOfflineDesc();
                        if (TextUtils.isEmpty(offlineDesc)) {
                            offlineDesc = view.getContext().getString(R.string.ce6);
                        }
                        C10691a.m21551c(view.getContext(), offlineDesc).mo19066a();
                    } else if (musicModel != null && C37378c.m83700a(musicModel, view.getContext(), true)) {
                        String uuid = UUID.randomUUID().toString();
                        C41302w a = C41302w.m91042a();
                        StringBuilder sb = new StringBuilder("aweme://music/detail/");
                        sb.append(musicModel.getMusicId());
                        a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("process_id", uuid).mo83871a());
                        C24963c.m60719a(C24816b.this.f65700f, musicModel.getMusicId(), false, uuid);
                    }
                } else if (id == R.id.bgp) {
                    if (C37378c.m83700a(musicModel, view.getContext(), true)) {
                        if (C24816b.this.f65695a != null) {
                            SharedPreferences a2 = C35807d.m80935a(view.getContext(), "av_settings.xml", 0);
                            if (!C24816b.this.f65704j || !a2.getBoolean("lyric_first_click_use", true) || a2.getInt("lyric_tip_show_count", 0) >= 3) {
                                C24816b.this.f65695a.mo50734b(musicModel);
                                C24963c.m60717a(C24816b.this.f65700f, musicModel.getMusicId(), musicItemViewHolder.getLayoutPosition(), musicModel.getLogPb());
                            } else {
                                C24816b.this.f65695a.mo50732a(musicModel);
                                C42482c curMusic = AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().getCurMusic();
                                new C10643a(view.getContext()).mo18899b((int) R.string.al1).mo18900b((int) R.string.wf, (OnClickListener) new C24823f(curMusic, musicModel)).mo18886a((int) R.string.f94, (OnClickListener) new C24824g(this, musicModel, musicItemViewHolder, curMusic)).mo18897a().mo18882b().show();
                                a2.edit().putBoolean("lyric_first_click_use", false).apply();
                                int i2 = a2.getInt("lyric_tip_show_count", 0);
                                if (i2 < 3) {
                                    a2.edit().putInt("lyric_tip_show_count", i2 + 1).apply();
                                }
                                if (curMusic == null) {
                                    str2 = "";
                                } else {
                                    str2 = curMusic.mid;
                                }
                                C26890h.m65011a("overwrite_song_toast_show", C24963c.m60735g().mo47829a("music_id", musicModel.getMusicId()).mo47829a("origin_music_id", str2).f61491a);
                            }
                        }
                        if (C24816b.this.f65704j) {
                            String str6 = C24816b.this.f65699e;
                            String name2 = musicModel.getName();
                            C26890h.m65011a("add_lyricsticker_song", C24963c.m60735g().mo47829a("search_keyword", str6).mo47829a("music_name", name2).mo47829a("music_id", musicModel.getMusicId()).mo47826a("after_search", TextUtils.isEmpty(str6) ^ true ? 1 : 0).mo47829a("creation_id", C24963c.m60714a()).f61491a);
                        }
                    }
                } else if (id == R.id.bg1) {
                    if (C24816b.this.f65697c == musicItemViewHolder.getPosition()) {
                        if (C24816b.this.f65695a != null) {
                            C24816b.this.mo50699b();
                        }
                    } else if (C24816b.this.f65695a != null) {
                        C24816b.this.mo50699b();
                        if (musicModel.getMusicType() == MusicType.LOCAL) {
                            MediaPlayer a3 = C37377b.m83689a();
                            try {
                                a3.reset();
                                a3.setDataSource(musicModel.getLocalPath());
                                a3.setAudioStreamType(3);
                                a3.prepareAsync();
                                a3.setOnPreparedListener(new C24820c(musicItemViewHolder));
                                a3.setOnErrorListener(C24821d.f65714a);
                            } catch (IOException unused) {
                            }
                        } else {
                            C24816b.this.f65695a.mo50731a((C37523a) new C24825h(this));
                            C24816b.this.f65695a.mo50733a(musicModel, C24816b.this.f65700f);
                            C24963c.m60715a(musicItemViewHolder.getPosition());
                        }
                        C24816b.this.f65697c = musicItemViewHolder.getPosition();
                    }
                    C24816b.this.f65698d = musicModel;
                    if (TextUtils.equals("search_music", C24816b.this.f65700f.f65641a)) {
                        ISearchMusicDepentService createISearchMusicDepentServicebyMonsterPlugin2 = SearchMusicDepentServiceImpl.createISearchMusicDepentServicebyMonsterPlugin();
                        String str7 = C24816b.this.f65700f.f65641a;
                        int position2 = musicItemViewHolder.getPosition();
                        if (C24816b.this.f65705k) {
                            str = "click_pause_music";
                        } else {
                            str = "click_play_music";
                        }
                        createISearchMusicDepentServicebyMonsterPlugin2.mobClickMusicCardEvent(str7, musicModel, position2, str);
                    }
                    C24816b.this.f65705k = !C24816b.this.f65705k;
                }
            }
        }
    };

    /* renamed from: B */
    private C1324c f65694B = new C1324c() {
        /* renamed from: a */
        public final void mo4984a() {
            super.mo4984a();
            C24816b.this.mo50700e();
        }

        /* renamed from: a */
        public final void mo4985a(int i, int i2) {
            C24816b.this.mo50700e();
        }

        /* renamed from: b */
        public final void mo4988b(int i, int i2) {
            C24816b.this.mo50700e();
        }

        /* renamed from: c */
        public final void mo4989c(int i, int i2) {
            C24816b.this.mo50700e();
        }

        /* renamed from: a */
        public final void mo4986a(int i, int i2, int i3) {
            C24816b.this.mo50700e();
        }
    };

    /* renamed from: a */
    public C24833b f65695a;

    /* renamed from: b */
    RecyclerView f65696b;

    /* renamed from: c */
    public int f65697c = -1;

    /* renamed from: d */
    public MusicModel f65698d;

    /* renamed from: e */
    public String f65699e;

    /* renamed from: f */
    public C24803a f65700f;

    /* renamed from: g */
    public boolean f65701g;

    /* renamed from: h */
    public boolean f65702h = true;

    /* renamed from: i */
    public int f65703i;

    /* renamed from: j */
    public boolean f65704j;

    /* renamed from: k */
    public boolean f65705k;

    /* renamed from: l */
    public C24866v f65706l;

    /* renamed from: m */
    String f65707m = "";

    /* renamed from: y */
    private C37306l<C24806c> f65708y;

    /* renamed from: z */
    private boolean f65709z;

    public final void an_() {
        super.an_();
        C26890h.m65011a("music_search_feedback_show", C23089d.m56640a().mo47829a("enter_from", "video_shoot_page").f61491a);
    }

    /* renamed from: e */
    public final void mo50700e() {
        if (this.f65698d == null || mo50673a() == null) {
            this.f65697c = -1;
        } else {
            this.f65697c = mo50673a().indexOf(this.f65698d);
        }
    }

    /* renamed from: b */
    public final void mo50699b() {
        if (this.f65697c >= 0) {
            MediaPlayer a = C37377b.m83689a();
            if (this.f65697c != -1) {
                C1352v f = this.f65696b.mo4847f(this.f65697c);
                if (f instanceof MusicItemViewHolder) {
                    ((MusicItemViewHolder) f).mo51012a(false, false);
                }
                this.f65697c = -1;
                this.f65698d = null;
            }
            if (a != null && a.isPlaying()) {
                a.pause();
            }
            if (this.f65695a != null) {
                this.f65695a.mo50732a((MusicModel) null);
            }
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f65696b = recyclerView;
        registerAdapterDataObserver(this.f65694B);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.f65694B);
        this.f65696b = null;
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (!this.f65704j || !TextUtils.isEmpty(((MusicModel) this.f70670n.get(i)).getLrcUrl())) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo50697a(boolean z) {
        if (this.f65697c >= 0) {
            this.f65696b.post(new C24822e(this, false));
        }
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        boolean z;
        int i;
        try {
            z = C32816h.m75716b().getShowMusicFeedbackEntrance().booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (this.f65709z && z) {
            C1352v a_ = super.mo49730a_(viewGroup);
            try {
                this.f65707m = C32816h.m75716b().getFeConfigCollection().getMusicFaq().getSchema();
            } catch (Exception unused2) {
            }
            SpannableString spannableString = new SpannableString(viewGroup.getContext().getString(R.string.db1));
            C248171 r6 = new ClickableSpan() {
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }

                public final void onClick(View view) {
                    C37383a a = C37382g.m83707a(C24816b.this.f65707m);
                    a.mo76659a("enter_from", "video_shoot_page");
                    C41302w.m91042a().mo83861a(a.mo76658a().toString());
                    C26890h.m65011a("music_search_feedback_click", C23089d.m56640a().mo47829a("enter_from", "video_shoot_page").f61491a);
                }
            };
            if (spannableString.length() > 9) {
                spannableString.setSpan(r6, 9, spannableString.length(), 33);
                spannableString.setSpan(new ForegroundColorSpan(C0726c.m2098c(viewGroup.getContext(), R.color.a0z)), 9, spannableString.length(), 33);
            }
            TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.auk, null);
            textView.setText(spannableString, BufferType.SPANNABLE);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            if (this.f65704j) {
                i = Color.parseColor("#80ffffff");
            } else {
                i = C0726c.m2098c(viewGroup.getContext(), R.color.ps);
            }
            textView.setTextColor(i);
            textView.setPadding(0, 20, 0, 0);
            DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
            dmtStatusView.setBuilder(dmtStatusView.mo19207c().mo19231b((View) textView));
            return a_;
        } else if (!C24954a.m60699b()) {
            return super.mo49730a_(viewGroup);
        } else {
            C1352v a_2 = super.mo49730a_(viewGroup);
            TextView textView2 = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.auk, null);
            textView2.setText(viewGroup.getContext().getText(R.string.fx3));
            textView2.setTextColor(viewGroup.getContext().getColor(R.color.ps));
            textView2.setPadding((int) C9432q.m18687b(viewGroup.getContext(), 16.0f), (int) C9432q.m18687b(viewGroup.getContext(), 17.0f), (int) C9432q.m18687b(viewGroup.getContext(), 16.0f), 0);
            DmtStatusView dmtStatusView2 = (DmtStatusView) a_2.itemView;
            dmtStatusView2.setBuilder(dmtStatusView2.mo19207c().mo19231b((View) textView2));
            return a_2;
        }
    }

    public C24816b(C24833b bVar, C37306l<C24806c> lVar) {
        this.f65708y = lVar;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            MusicItemViewHolder musicItemViewHolder = new MusicItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x7, viewGroup, false), this.f65703i);
            musicItemViewHolder.mo51008a(this.f65693A, this.f65708y);
            return musicItemViewHolder;
        } else if (i != 2) {
            return new MusicItemNoLyricViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.biq, viewGroup, false));
        } else {
            SearchMusicWithLyricViewHolder searchMusicWithLyricViewHolder = new SearchMusicWithLyricViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bj2, viewGroup, false), this.f65703i);
            searchMusicWithLyricViewHolder.mo51008a(this.f65693A, this.f65708y);
            return searchMusicWithLyricViewHolder;
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        String str;
        boolean z;
        MusicModel musicModel = (MusicModel) mo50673a().get(i);
        int i2 = 0;
        if (vVar instanceof MusicItemViewHolder) {
            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) vVar;
            String str2 = this.f65699e;
            boolean z2 = this.f65701g;
            if (i == this.f65697c) {
                z = true;
            } else {
                z = false;
            }
            musicItemViewHolder.mo51010a(musicModel, str2, z2, z, false, 0, 0, i, this.f65700f, this.f65704j);
            if (this.f65704j) {
                String str3 = this.f65699e;
                String name = musicModel.getName();
                C26890h.m65011a("search_lyricsticker_song_result", C24963c.m60735g().mo47829a("search_keyword", str3).mo47829a("music_name", name).mo47829a("music_id", musicModel.getMusicId()).mo47829a("creation_id", C24963c.m60714a()).mo47826a("after_search", TextUtils.isEmpty(str3) ^ true ? 1 : 0).f61491a);
            }
        } else if (vVar instanceof MusicItemNoLyricViewHolder) {
            MusicItemNoLyricViewHolder musicItemNoLyricViewHolder = (MusicItemNoLyricViewHolder) vVar;
            String str4 = this.f65699e;
            boolean z3 = this.f65701g;
            int i3 = this.f65697c;
            C24803a aVar = this.f65700f;
            boolean z4 = this.f65704j;
            if (musicModel != null) {
                musicItemNoLyricViewHolder.f66223c = z3;
                musicItemNoLyricViewHolder.f66222b = i;
                musicItemNoLyricViewHolder.f66224d = z4;
                musicItemNoLyricViewHolder.f66221a = musicModel;
                musicItemNoLyricViewHolder.mo51006a(str4, false);
                if (!musicItemNoLyricViewHolder.f66223c || musicItemNoLyricViewHolder.f66222b >= 12) {
                    musicItemNoLyricViewHolder.mIvMusicMark.setVisibility(8);
                } else {
                    musicItemNoLyricViewHolder.mIvMusicMark.setVisibility(0);
                    switch (musicItemNoLyricViewHolder.f66222b) {
                        case 0:
                            i2 = R.drawable.b1a;
                            break;
                        case 1:
                            i2 = R.drawable.b1e;
                            break;
                        case 2:
                            i2 = R.drawable.b1f;
                            break;
                        case 3:
                            i2 = R.drawable.b1g;
                            break;
                        case 4:
                            i2 = R.drawable.b1h;
                            break;
                        case 5:
                            i2 = R.drawable.b1i;
                            break;
                        case 6:
                            i2 = R.drawable.b1j;
                            break;
                        case 7:
                            i2 = R.drawable.b1k;
                            break;
                        case 8:
                            i2 = R.drawable.b1l;
                            break;
                        case 9:
                            i2 = R.drawable.b1b;
                            break;
                        case 10:
                            i2 = R.drawable.b1c;
                            break;
                        case 11:
                            i2 = R.drawable.b1d;
                            break;
                    }
                    if (i2 > 0) {
                        if (musicItemNoLyricViewHolder.f66222b < 3) {
                            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) musicItemNoLyricViewHolder.mIvMusicMark.getLayoutParams();
                            marginLayoutParams.topMargin = (int) C9432q.m18687b(musicItemNoLyricViewHolder.mIvMusicMark.getContext(), 0.0f);
                            marginLayoutParams.leftMargin = marginLayoutParams.topMargin;
                        } else {
                            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) musicItemNoLyricViewHolder.mIvMusicMark.getLayoutParams();
                            marginLayoutParams2.topMargin = (int) C9432q.m18687b(musicItemNoLyricViewHolder.mIvMusicMark.getContext(), 2.0f);
                            marginLayoutParams2.leftMargin = marginLayoutParams2.topMargin;
                        }
                        musicItemNoLyricViewHolder.mIvMusicMark.setImageResource(i2);
                    }
                }
            }
            if (this.f65704j) {
                String str5 = this.f65699e;
                String name2 = musicModel.getName();
                C26890h.m65011a("search_lyricsticker_song_unavailable", C24963c.m60735g().mo47829a("search_keyword", str5).mo47829a("music_name", name2).mo47829a("music_id", musicModel.getMusicId()).mo47829a("creation_id", C24963c.m60714a()).f61491a);
            }
        }
        this.f65700f.f65649i = musicModel.getLogPb();
        C24803a aVar2 = this.f65700f;
        if (this.f65706l != null) {
            str = this.f65706l.f65798a;
        } else {
            str = "normal_search";
        }
        aVar2.f65643c = str;
        C24963c.m60718a(this.f65700f, musicModel.getMusicId(), i, this.f65702h);
    }

    public C24816b(C24833b bVar, C37306l<C24806c> lVar, boolean z, boolean z2) {
        this.f65708y = lVar;
        this.f65709z = z;
        this.f65704j = z2;
    }
}
