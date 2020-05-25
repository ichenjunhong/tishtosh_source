package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Space;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ba */
public final class C27852ba extends C1352v implements C27934y {

    /* renamed from: i */
    public static final C27854a f73172i = new C27854a(null);

    /* renamed from: a */
    final DmtTextView f73173a;

    /* renamed from: b */
    final ViewGroup f73174b;

    /* renamed from: c */
    final View f73175c;

    /* renamed from: d */
    final View f73176d;

    /* renamed from: e */
    final Space f73177e;

    /* renamed from: f */
    public final Context f73178f;

    /* renamed from: g */
    public SearchMusic f73179g;

    /* renamed from: h */
    String f73180h;

    /* renamed from: j */
    private final C27934y f73181j;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ba$a */
    public static final class C27854a {
        private C27854a() {
        }

        public /* synthetic */ C27854a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo56275a() {
        String str = "enter_artist_card_detail";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "search_result");
        String str2 = "music_num";
        SearchMusic searchMusic = this.f73179g;
        if (searchMusic == null) {
            C52711k.m112234a();
        }
        List musicList = searchMusic.getMusicList();
        if (musicList == null) {
            C52711k.m112234a();
        }
        C23089d a2 = a.mo47826a(str2, musicList.size());
        String str3 = "music_list";
        SearchMusic searchMusic2 = this.f73179g;
        if (searchMusic2 == null) {
            C52711k.m112234a();
        }
        C23089d a3 = a2.mo47829a(str3, m66602a(searchMusic2)).mo47829a("search_keyword", this.f73180h);
        String str4 = "log_pb";
        C29981aa a4 = C29981aa.m70153a();
        SearchMusic searchMusic3 = this.f73179g;
        if (searchMusic3 == null) {
            C52711k.m112234a();
        }
        List musicList2 = searchMusic3.getMusicList();
        if (musicList2 == null) {
            C52711k.m112234a();
        }
        C26890h.m65011a(str, a3.mo47829a(str4, a4.mo60161a(((Music) musicList2.get(0)).getRequestId())).f61491a);
    }

    /* renamed from: a */
    public final int mo56250a(Music music) {
        C52711k.m112240b(music, "music");
        C27934y yVar = this.f73181j;
        SearchMusic searchMusic = this.f73179g;
        if (searchMusic == null) {
            C52711k.m112234a();
        }
        List musicList = searchMusic.getMusicList();
        if (musicList == null) {
            C52711k.m112234a();
        }
        int a = yVar.mo56250a((Music) C52575l.m112137e(musicList));
        SearchMusic searchMusic2 = this.f73179g;
        if (searchMusic2 == null) {
            C52711k.m112234a();
        }
        List musicList2 = searchMusic2.getMusicList();
        if (musicList2 == null) {
            C52711k.m112234a();
        }
        return a + musicList2.indexOf(music);
    }

    /* renamed from: a */
    static String m66602a(SearchMusic searchMusic) {
        StringBuilder sb = new StringBuilder();
        List<Music> musicList = searchMusic.getMusicList();
        if (musicList == null) {
            C52711k.m112234a();
        }
        for (Music mid : musicList) {
            sb.append(mid.getMid());
            sb.append(",");
        }
        C52830p.m112428a((CharSequence) sb, (CharSequence) ",");
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "musicIdList.toString()");
        return sb2;
    }

    public C27852ba(View view, C27934y yVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(yVar, "provider");
        super(view);
        this.f73181j = yVar;
        View findViewById = view.findViewById(R.id.title);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.title)");
        this.f73173a = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.ze);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.content)");
        this.f73174b = (ViewGroup) findViewById2;
        View findViewById3 = view.findViewById(R.id.dqs);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.viewMore)");
        this.f73175c = findViewById3;
        View findViewById4 = view.findViewById(R.id.d2c);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.topDivider)");
        this.f73176d = findViewById4;
        View findViewById5 = view.findViewById(R.id.ln);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.bottomGap)");
        this.f73177e = (Space) findViewById5;
        this.f73178f = view.getContext();
        this.f73175c.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C27852ba f73182a;

            {
                this.f73182a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SearchMusic searchMusic = this.f73182a.f73179g;
                if (searchMusic != null) {
                    List musicList = searchMusic.getMusicList();
                    if (musicList != null && !C9376b.m18558a((Collection<T>) musicList)) {
                        int a = this.f73182a.mo56250a((Music) C52575l.m112142g(musicList)) + 1;
                        Context context = this.f73182a.f73178f;
                        C52711k.m112236a((Object) context, "context");
                        String authorName = ((Music) C52575l.m112137e(musicList)).getAuthorName();
                        C52711k.m112236a((Object) authorName, "musicList.first().authorName");
                        C52711k.m112240b(context, "context");
                        C52711k.m112240b(authorName, "author");
                        Intent intent = new Intent(context, MusicianMusicListActivity.class);
                        intent.putExtra("param_music_author", authorName);
                        intent.putExtra("param_holder_postion", a);
                        context.startActivity(intent);
                        this.f73182a.mo56275a();
                    }
                }
            }
        });
    }
}
