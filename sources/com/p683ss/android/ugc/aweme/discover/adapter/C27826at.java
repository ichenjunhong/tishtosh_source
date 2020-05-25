package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.C2240a;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.arch.ext.list.C11837a;
import com.bytedance.jedi.arch.ext.list.C11837a.C11838a;
import com.bytedance.jedi.arch.ext.list.p744a.C11841b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27831av.C27834b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27840az.C27845a;
import com.p683ss.android.ugc.aweme.discover.adapter.music.C27914c;
import com.p683ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p683ss.android.ugc.aweme.discover.model.CardType;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g.C37383a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.search.p2122b.C41406a;
import com.p683ss.android.ugc.aweme.search.p2122b.C41407b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.at */
public final class C27826at extends C27818an<SearchMusic> implements C11837a<SearchMusic>, C27834b, C27934y {

    /* renamed from: h */
    public static final C27827a f73106h = new C27827a(null);

    /* renamed from: i */
    private final C27830au f73107i;

    /* renamed from: j */
    private final C11841b<SearchMusic> f73108j;

    /* renamed from: k */
    private final MusicPlayHelper f73109k;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.at$a */
    public static final class C27827a {
        private C27827a() {
        }

        public /* synthetic */ C27827a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.at$b */
    public static final class C27828b extends C1212c<SearchMusic> {
        C27828b() {
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo3932a(Object obj, Object obj2) {
            SearchMusic searchMusic = (SearchMusic) obj2;
            C52711k.m112240b((SearchMusic) obj, "p0");
            C52711k.m112240b(searchMusic, "p1");
            return false;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ boolean mo3933b(Object obj, Object obj2) {
            SearchMusic searchMusic = (SearchMusic) obj2;
            C52711k.m112240b((SearchMusic) obj, "p0");
            C52711k.m112240b(searchMusic, "p1");
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.at$c */
    public static final class C27829c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C52727e f73110a;

        C27829c(C52727e eVar) {
            this.f73110a = eVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "textView");
            C37383a a = C37382g.m83707a((String) this.f73110a.element);
            a.mo76659a("enter_from", "music_search_result");
            C41302w.m91042a().mo83861a(a.mo76658a().toString());
            C26890h.m65011a("music_search_feedback_click", C23089d.m56640a().mo47829a("enter_from", "music_search_result").f61491a);
        }
    }

    /* renamed from: a */
    public final void mo22590a(List<? extends SearchMusic> list, C52670a<C52860x> aVar) {
        C52711k.m112240b(list, "list");
    }

    public final C11841b<SearchMusic> aH_() {
        return this.f73108j;
    }

    public final int getItemCount() {
        return super.getItemCount();
    }

    public final void an_() {
        super.an_();
        C26890h.m65011a("music_search_feedback_show", C23089d.m56640a().mo47829a("enter_from", "music_search_result").f61491a);
    }

    /* renamed from: a */
    public final void mo50303a(List<? extends SearchMusic> list) {
        MusicPlayHelper musicPlayHelper = this.f73109k;
        if (musicPlayHelper != null) {
            musicPlayHelper.mo56585a();
        }
        C41407b bVar = this.f73084g;
        if (bVar != null) {
            bVar.mo84080a();
        }
        super.mo50303a(this.f73107i.mo56254a(list));
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        Object obj = this.f70670n.get(i);
        C52711k.m112236a(obj, "mItems[position]");
        if (C27830au.m66578a((SearchMusic) obj)) {
            return 17;
        }
        if (((SearchMusic) this.f70670n.get(i)).getCardType() == CardType.TYPE_MUSICIAN.getValue()) {
            return 18;
        }
        return 16;
    }

    /* renamed from: a */
    public final void mo56251a(C27907k kVar) {
        C52711k.m112240b(kVar, "cluster");
        List list = this.f70670n;
        C52711k.m112240b(kVar, "cluster");
        Iterable<Music> clusterList = kVar.getClusterList();
        Collection arrayList = new ArrayList(C52575l.m112104a(clusterList, 10));
        for (Music music : clusterList) {
            SearchMusic searchMusic = new SearchMusic();
            searchMusic.setMusic(music);
            arrayList.add(searchMusic);
        }
        List e = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
        int indexOf = list.indexOf(kVar);
        if (indexOf >= 0) {
            list.remove(kVar);
            notifyItemRemoved(indexOf);
            list.addAll(indexOf, e);
            notifyItemRangeInserted(indexOf, e.size());
        }
    }

    /* renamed from: b */
    public final void mo50304b(List<? extends SearchMusic> list) {
        boolean z;
        boolean z2;
        C27830au auVar = this.f73107i;
        List<? extends SearchMusic> list2 = this.f70670n;
        Collection collection = list2;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Collection collection2 = list;
            if (collection2 == null || collection2.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                int indexOf = list.indexOf(C52575l.m112142g(auVar.f73111a));
                if (indexOf < list.size() - 1) {
                    if (indexOf <= 0) {
                        auVar.mo56255b(list);
                        super.mo50304b(list);
                    }
                    list2 = auVar.mo56254a(list.subList(indexOf + 1, list.size()));
                    list2.addAll(0, collection);
                    auVar.mo56255b(list);
                }
                list = list2;
                super.mo50304b(list);
            }
        }
        if (list != null) {
            auVar.mo56255b(list);
        } else {
            list = null;
        }
        super.mo50304b(list);
    }

    /* renamed from: a */
    public final int mo56250a(Music music) {
        C52711k.m112240b(music, "music");
        if (C9376b.m18558a((Collection<T>) this.f70670n)) {
            return -1;
        }
        if (this.f73082e.f73042e >= 0) {
            return this.f73082e.f73042e;
        }
        int i = -1;
        for (SearchMusic searchMusic : this.f70670n) {
            if (music == searchMusic.getMusic()) {
                return i + 1;
            }
            if (searchMusic.getCardType() == CardType.TYPE_MUSICIAN.getValue() && !C9376b.m18558a((Collection<T>) searchMusic.getMusicList())) {
                List musicList = searchMusic.getMusicList();
                if (musicList == null) {
                    C52711k.m112234a();
                }
                if (music == ((Music) C52575l.m112137e(musicList))) {
                    return i + 1;
                }
            }
            C52711k.m112236a((Object) searchMusic, "searchMusic");
            if (!C27830au.m66578a(searchMusic)) {
                if (searchMusic.getCardType() == CardType.TYPE_MUSICIAN.getValue()) {
                    if (!C9376b.m18558a((Collection<T>) searchMusic.getMusicList())) {
                        List musicList2 = searchMusic.getMusicList();
                        if (musicList2 == null) {
                            C52711k.m112234a();
                        }
                        i += musicList2.size();
                    }
                    if (searchMusic.getHasMore()) {
                        i++;
                    }
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        boolean z;
        C52711k.m112240b(viewGroup, "parent");
        C1352v a_ = super.mo49730a_(viewGroup);
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean showMusicFeedbackEntrance = b.getShowMusicFeedbackEntrance();
            C52711k.m112236a((Object) showMusicFeedbackEntrance, "SettingsReader.get().showMusicFeedbackEntrance");
            z = showMusicFeedbackEntrance.booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            C52727e eVar = new C52727e();
            eVar.element = "";
            try {
                IESSettingsProxy b2 = C32816h.m75716b();
                C52711k.m112236a((Object) b2, "SettingsReader.get()");
                FeConfigCollection feConfigCollection = b2.getFeConfigCollection();
                C52711k.m112236a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
                FEConfig musicFaq = feConfigCollection.getMusicFaq();
                C52711k.m112236a((Object) musicFaq, "SettingsReader.get().feConfigCollection.musicFaq");
                T schema = musicFaq.getSchema();
                C52711k.m112236a((Object) schema, "SettingsReader.get().feC…ollection.musicFaq.schema");
                eVar.element = schema;
            } catch (Exception unused2) {
            }
            SpannableString spannableString = new SpannableString(viewGroup.getContext().getString(R.string.db1));
            spannableString.setSpan(new C27829c(eVar), 9, spannableString.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(C0726c.m2098c(viewGroup.getContext(), R.color.a0y)), 9, spannableString.length(), 33);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.auk, null);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                textView.setText(spannableString, BufferType.SPANNABLE);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setTextColor(C0726c.m2098c(viewGroup.getContext(), R.color.a1a));
                textView.setPadding(0, 20, 0, 0);
                View view = a_.itemView;
                if (view != null) {
                    DmtStatusView dmtStatusView = (DmtStatusView) view;
                    dmtStatusView.setBuilder(dmtStatusView.mo19207c().mo19231b((View) textView));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
            }
        }
        C52711k.m112236a((Object) a_, "superFooterHolder");
        return a_;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo22589a(int i, boolean z) {
        return (SearchMusic) C11838a.m24186a((C11837a<T>) this, i, z);
    }

    /* renamed from: b */
    public final C1352v mo49206b(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        switch (i) {
            case 17:
                C27834b bVar = this;
                C52711k.m112240b(viewGroup, "parent");
                C52711k.m112240b(bVar, "listener");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsk, viewGroup, false);
                C52711k.m112236a((Object) inflate, "view");
                return new C27831av(inflate, bVar);
            case 18:
                C27934y yVar = this;
                C52711k.m112240b(viewGroup, "parent");
                C52711k.m112240b(yVar, "provider");
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.btd, viewGroup, false);
                C52711k.m112236a((Object) inflate2, "view");
                return new C27852ba(inflate2, yVar);
            default:
                String str = this.f73083f;
                C52711k.m112236a((Object) str, "mKeyword");
                C27797ad adVar = this.f73082e;
                C52711k.m112236a((Object) adVar, "mobParam");
                C27934y yVar2 = this;
                C52711k.m112240b(viewGroup, "parent");
                C52711k.m112240b(str, "keyword");
                C52711k.m112240b(adVar, "mobParam");
                C52711k.m112240b(yVar2, "pp");
                C27840az a = C27845a.m66591a(viewGroup, null, yVar2);
                C52711k.m112240b(str, "<set-?>");
                a.f73134e = str;
                a.mo56261a("search_result");
                a.mo56270a(adVar);
                return a;
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        try {
            if (vVar instanceof C27840az) {
                C27840az azVar = (C27840az) vVar;
                Music music = ((SearchMusic) this.f70670n.get(i)).getMusic();
                String str = this.f73083f;
                C52711k.m112236a((Object) str, "mKeyword");
                azVar.mo56260a(music, str);
            } else if (vVar instanceof C27914c) {
                C27914c cVar = (C27914c) vVar;
                Music music2 = ((SearchMusic) this.f70670n.get(i)).getMusic();
                String str2 = this.f73083f;
                C52711k.m112236a((Object) str2, "mKeyword");
                cVar.mo56260a(music2, str2);
            } else if (vVar instanceof C27831av) {
                C27831av avVar = (C27831av) vVar;
                SearchMusic searchMusic = (SearchMusic) this.f70670n.get(i);
                String str3 = this.f73083f;
                C52711k.m112236a((Object) str3, "mKeyword");
                C52711k.m112240b(str3, "keyword");
                if (searchMusic instanceof C27907k) {
                    int size = ((C27907k) searchMusic).getClusterList().size();
                    View view = avVar.itemView;
                    C52711k.m112236a((Object) view, "itemView");
                    Context context = view.getContext();
                    C52711k.m112236a((Object) context, "itemView.context");
                    String string = context.getResources().getString(R.string.dat);
                    DmtTextView dmtTextView = avVar.f73113a;
                    C52711k.m112236a((Object) string, "format");
                    String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                    dmtTextView.setText(a);
                    avVar.f73114b = (C27907k) searchMusic;
                    avVar.f73115c = str3;
                    if (!((C27907k) searchMusic).isMobShowSent()) {
                        avVar.mo56256a("matched_sounds_show", (C27907k) searchMusic);
                        ((C27907k) searchMusic).setMobShowSent(true);
                    }
                }
            } else if (vVar instanceof C27852ba) {
                C27852ba baVar = (C27852ba) vVar;
                SearchMusic searchMusic2 = (SearchMusic) this.f70670n.get(i);
                String str4 = this.f73083f;
                C52711k.m112236a((Object) str4, "mKeyword");
                C52711k.m112240b(str4, "keyword");
                if (searchMusic2 != null) {
                    List<Music> musicList = searchMusic2.getMusicList();
                    if (musicList != null) {
                        if (!C9376b.m18558a((Collection<T>) musicList)) {
                            baVar.f73179g = searchMusic2;
                            baVar.f73180h = str4;
                            DmtTextView dmtTextView2 = baVar.f73173a;
                            String string2 = baVar.f73178f.getString(R.string.ce3, new Object[]{((Music) C52575l.m112137e(musicList)).getAuthorName()});
                            C52711k.m112236a((Object) string2, "context.getString(R.stri…cList.first().authorName)");
                            String a2 = C2240a.m6772a(string2, Arrays.copyOf(new Object[0], 0));
                            C52711k.m112236a((Object) a2, "java.lang.String.format(format, *args)");
                            dmtTextView2.setText(a2);
                            baVar.f73174b.removeAllViews();
                            C27797ad adVar = new C27797ad(false);
                            adVar.f73043f = "artist_card";
                            for (Music music3 : musicList) {
                                C27840az a3 = C27845a.m66591a(baVar.f73174b, null, baVar);
                                a3.mo56261a("search_result");
                                a3.mo56270a(adVar);
                                a3.mo56260a(music3, str4);
                                baVar.f73174b.addView(a3.mo56209d());
                            }
                            int i2 = 8;
                            if (searchMusic2.getHasMore()) {
                                baVar.f73175c.setVisibility(0);
                                baVar.f73177e.setVisibility(8);
                            } else {
                                baVar.f73175c.setVisibility(8);
                                baVar.f73177e.setVisibility(0);
                            }
                            View view2 = baVar.f73176d;
                            if (baVar.getAdapterPosition() != 0) {
                                if (baVar.getAdapterPosition() != 1) {
                                    i2 = 0;
                                }
                            }
                            view2.setVisibility(i2);
                            if (!searchMusic2.getHasMobShow()) {
                                String str5 = "artist_card_show";
                                C23089d a4 = C23089d.m56640a().mo47829a("enter_from", "search_result");
                                String str6 = "music_num";
                                SearchMusic searchMusic3 = baVar.f73179g;
                                if (searchMusic3 == null) {
                                    C52711k.m112234a();
                                }
                                List musicList2 = searchMusic3.getMusicList();
                                if (musicList2 == null) {
                                    C52711k.m112234a();
                                }
                                C23089d a5 = a4.mo47826a(str6, musicList2.size());
                                String str7 = "music_list";
                                SearchMusic searchMusic4 = baVar.f73179g;
                                if (searchMusic4 == null) {
                                    C52711k.m112234a();
                                }
                                C23089d a6 = a5.mo47829a(str7, C27852ba.m66602a(searchMusic4));
                                String str8 = "is_more_sounds";
                                SearchMusic searchMusic5 = baVar.f73179g;
                                if (searchMusic5 == null) {
                                    C52711k.m112234a();
                                }
                                C23089d a7 = a6.mo47826a(str8, searchMusic5.getHasMore() ? 1 : 0).mo47829a("search_keyword", baVar.f73180h);
                                String str9 = "log_pb";
                                C29981aa a8 = C29981aa.m70153a();
                                SearchMusic searchMusic6 = baVar.f73179g;
                                if (searchMusic6 == null) {
                                    C52711k.m112234a();
                                }
                                List musicList3 = searchMusic6.getMusicList();
                                if (musicList3 == null) {
                                    C52711k.m112234a();
                                }
                                C26890h.m65011a(str5, a7.mo47829a(str9, a8.mo60161a(((Music) musicList3.get(0)).getRequestId())).f61491a);
                                searchMusic2.setHasMobShow(true);
                            }
                        }
                    }
                }
            } else {
                super.mo48222a(vVar, i);
            }
        } finally {
            C41407b bVar = this.f73084g;
            if (bVar != null) {
                bVar.mo84081a(i, mo48636c());
            }
        }
    }

    public C27826at(MusicPlayHelper musicPlayHelper, C27797ad adVar, String str, C41406a aVar) {
        C52711k.m112240b(adVar, "mobParam");
        C52711k.m112240b(str, "mKeyword");
        super(adVar, str, aVar);
        this.f73109k = musicPlayHelper;
        this.f73107i = new C27830au();
        C11841b bVar = new C11841b(this, new C27828b(), null, 4, null);
        this.f73108j = bVar;
    }

    public /* synthetic */ C27826at(MusicPlayHelper musicPlayHelper, C27797ad adVar, String str, C41406a aVar, int i, C52707g gVar) {
        this(null, adVar, str, null);
    }
}
