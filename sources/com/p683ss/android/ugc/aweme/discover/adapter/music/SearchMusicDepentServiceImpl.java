package com.p683ss.android.ugc.aweme.discover.adapter.music;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View.OnClickListener;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27835aw;
import com.p683ss.android.ugc.aweme.discover.adapter.C27836ax.C27837a;
import com.p683ss.android.ugc.aweme.discover.adapter.SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1;
import com.p683ss.android.ugc.aweme.discover.model.Position;
import com.p683ss.android.ugc.aweme.music.model.MusicTag;
import com.p683ss.android.ugc.aweme.music.p1977e.C37384h;
import com.p683ss.android.ugc.aweme.music.service.ISearchMusicDepentService;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.music.SearchMusicDepentServiceImpl */
public class SearchMusicDepentServiceImpl implements ISearchMusicDepentService {
    public static ISearchMusicDepentService createISearchMusicDepentServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(ISearchMusicDepentService.class);
        if (a != null) {
            return (ISearchMusicDepentService) a;
        }
        return new SearchMusicDepentServiceImpl();
    }

    public void mobShowMusicCardEvent(final String str, final MusicModel musicModel, final int i) {
        C0013i.m18a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                String imprId = musicModel.getLogPb().getImprId();
                String imprId2 = musicModel.getLogPb().getImprId();
                String b = C47759cc.m103382a().getGson().mo34889b(musicModel.getLogPb());
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "general_search").mo47829a("search_id", imprId).mo47829a("search_keyword", musicModel.getSearchKeyWords()).mo47829a("log_pb", b).mo47829a("impr_id", imprId2).mo47829a("enter_from", str).mo47829a("is_aladdin", "1").mo47829a("search_result_id", musicModel.getMusicId()).mo47829a("token_type", "music").mo47829a("is_aladdin", "0").mo47829a("rank", sb.toString());
                if (!(musicModel == null || musicModel.getMusic() == null || musicModel.getMusic().getMusicTags() == null)) {
                    a.mo47829a("music_tag_info", C47759cc.m103382a().getGson().mo34889b(musicModel.getMusic().getMusicTags()));
                }
                C26890h.m65011a("search_result_show", a.f61491a);
                return null;
            }
        }, (Executor) C26890h.m65003a());
    }

    public void showSearchMusicTags(RecyclerView recyclerView, List<MusicTag> list, OnClickListener onClickListener) {
        Context context = recyclerView.getContext();
        C52711k.m112240b(context, "context");
        C52711k.m112240b(list, "musicTags");
        C52711k.m112240b(onClickListener, "onClickListener");
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
            if (recyclerView.getAdapter() == null) {
                SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1 searchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1 = new SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1(context, 0, false, recyclerView, context, onClickListener, list);
                recyclerView.setLayoutManager(searchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1);
                recyclerView.setAdapter(new C27835aw(onClickListener, recyclerView));
                if (C47918gj.m103682a(context)) {
                    recyclerView.addOnAttachStateChangeListener(new C27837a(recyclerView, context, onClickListener, list));
                }
            }
            if (recyclerView.getAdapter() != null) {
                C1322a adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    C27835aw awVar = (C27835aw) adapter;
                    C52711k.m112240b(list, "musicTags");
                    awVar.f73119b = new int[2];
                    awVar.f73118a.clear();
                    awVar.f73118a.addAll(list);
                    awVar.notifyDataSetChanged();
                    C1332i layoutManager = awVar.f73120c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.mo4741e(0);
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchMusicTagAdapter");
                }
            }
        }
    }

    public void mobClickMusicCardEvent(String str, MusicModel musicModel, int i, String str2) {
        final MusicModel musicModel2 = musicModel;
        final String str3 = str;
        final String str4 = str2;
        final int i2 = i;
        C279112 r0 = new Callable<Object>() {
            public final Object call() throws Exception {
                String imprId = musicModel2.getLogPb().getImprId();
                String imprId2 = musicModel2.getLogPb().getImprId();
                String b = C47759cc.m103382a().getGson().mo34889b(musicModel2.getLogPb());
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "general_search").mo47829a("search_id", imprId).mo47829a("search_keyword", musicModel2.getSearchKeyWords()).mo47829a("log_pb", b).mo47829a("impr_id", imprId2).mo47829a("enter_from", str3).mo47829a("button_type", str4).mo47829a("is_aladdin", "1").mo47829a("search_result_id", musicModel2.getMusicId()).mo47829a("token_type", "music").mo47829a("is_aladdin", "0").mo47829a("rank", sb.toString());
                if (!(musicModel2 == null || musicModel2.getMusic() == null || musicModel2.getMusic().getMusicTags() == null)) {
                    a.mo47829a("music_tag_info", C47759cc.m103382a().getGson().mo34889b(musicModel2.getMusic().getMusicTags()));
                }
                C26890h.m65011a("search_result_click", a.f61491a);
                return null;
            }
        };
        C0013i.m18a((Callable<TResult>) r0, (Executor) C26890h.m65003a());
    }

    public SpannableString getSugString(Context context, String str, List<Position> list, int i) {
        if (C10181b.m20511a().mo18168a(SearchSugUIOptimizeExperiment.class, true, "search_sug_highlight_reverse", 31744, 0) != 0) {
            return C37384h.m83711a(context, str, list, 0);
        }
        if (str == null) {
            str = "";
        }
        if (context == null || TextUtils.isEmpty(str) || C9376b.m18558a((Collection<T>) list)) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        for (Position position : list) {
            if (position != null) {
                int begin = position.getBegin() + 0;
                int end = position.getEnd() + 1 + 0;
                int color = context.getResources().getColor(R.color.a0y);
                int max = Math.max(0, begin);
                if (!TextUtils.isEmpty(spannableString) && max <= end && max < spannableString.length() && end <= spannableString.length()) {
                    spannableString.setSpan(new ForegroundColorSpan(color), max, end, 17);
                }
            }
        }
        return spannableString;
    }
}
