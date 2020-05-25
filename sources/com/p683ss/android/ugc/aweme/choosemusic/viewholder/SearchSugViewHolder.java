package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24805b;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24866v;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24870z;
import com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1509b.C24876a;
import com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1511d.C24885a;
import com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1512e.C24886a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C25000q.C25001a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.music.SearchMusicDepentServiceImpl;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.SearchSugViewHolder */
public class SearchSugViewHolder extends C1352v implements C24886a {

    /* renamed from: a */
    public C24870z f66259a;

    /* renamed from: b */
    public int f66260b;
    TextView mSugView;

    public SearchSugViewHolder(View view, C25001a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        view.setOnTouchListener(new C24876a() {
            /* renamed from: a */
            public final void mo50797a(View view, MotionEvent motionEvent) {
                String str;
                if (!C32800a.m75679a(view) && SearchSugViewHolder.this.f66259a != null && !TextUtils.isEmpty(SearchSugViewHolder.this.f66259a.getContent())) {
                    int i = SearchSugViewHolder.this.f66260b;
                    C24870z zVar = SearchSugViewHolder.this.f66259a;
                    String str2 = "trending_words_click";
                    C24885a a = C24885a.m60440a().mo50806a("words_source", "sug").mo50806a("search_position", "video_music").mo50805a("words_position", i).mo50806a("words_content", zVar.getContent());
                    String str3 = "group_id";
                    if (zVar.getWordRecord() != null) {
                        str = zVar.getWordRecord().getId();
                    } else {
                        str = "";
                    }
                    C26890h.m65011a(str2, a.mo50806a(str3, str).mo50806a("creation_id", C24963c.m60714a()).mo50807a(zVar.getExtraParam()).f65839a);
                    C24866v a2 = new C24866v().mo50773a(false);
                    a2.f65802e = SearchSugViewHolder.this.f66260b;
                    C47718bf.m103288a(new C24805b(a2.mo50772a(SearchSugViewHolder.this.f66259a.getContent()).mo50774b("search_sug").mo50771a(3)));
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo50808a(C24870z zVar, int i) {
        String str;
        if (zVar != null) {
            this.f66259a = zVar;
            this.f66260b = i;
            this.mSugView.setText(SearchMusicDepentServiceImpl.createISearchMusicDepentServicebyMonsterPlugin().getSugString(this.itemView.getContext(), zVar.getContent(), zVar.getPosition(), 0));
            if (!zVar.isMobShow()) {
                zVar.setMobShow(true);
                String str2 = "trending_words_show";
                C24885a a = C24885a.m60440a().mo50806a("words_source", "sug").mo50806a("search_position", "video_music").mo50805a("words_position", i).mo50806a("words_content", zVar.getContent());
                String str3 = "group_id";
                if (zVar.getWordRecord() != null) {
                    str = zVar.getWordRecord().getId();
                } else {
                    str = "";
                }
                C26890h.m65011a(str2, a.mo50806a(str3, str).mo50806a("creation_id", C24963c.m60714a()).mo50807a(zVar.getExtraParam()).f65839a);
            }
        }
    }
}
