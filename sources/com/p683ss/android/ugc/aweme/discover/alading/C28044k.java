package com.p683ss.android.ugc.aweme.discover.alading;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c.C28310a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1657d.C28321a;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1487c.C24478a;
import com.p683ss.android.ugc.aweme.p1487c.C24479b;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.k */
public final class C28044k implements C24478a, C24479b {

    /* renamed from: a */
    public SearchUser f73667a;

    /* renamed from: b */
    public C28310a f73668b;

    /* renamed from: c */
    private View f73669c;

    /* renamed from: d */
    private RecyclerView f73670d;

    /* renamed from: e */
    private View f73671e;

    /* renamed from: f */
    private C28321a f73672f = new C28321a();

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.k$a */
    static final class C28046a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f73674a;

        /* renamed from: b */
        final /* synthetic */ User f73675b;

        /* renamed from: c */
        final /* synthetic */ C28310a f73676c;

        C28046a(String str, User user, C28310a aVar) {
            this.f73674a = str;
            this.f73675b = user;
            this.f73676c = aVar;
        }

        public final /* synthetic */ Object call() {
            String str;
            String str2;
            String str3 = "search_result_click";
            C23089d a = C23089d.m56640a().mo47829a("log_pb", C29981aa.m70153a().mo60161a(this.f73674a)).mo47829a("impr_id", this.f73674a).mo47829a("search_id", this.f73674a);
            String str4 = "search_result_id";
            User user = this.f73675b;
            Integer num = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            C23089d a2 = a.mo47829a(str4, str).mo47829a("enter_from", "general_search");
            String str5 = "search_keyword";
            C28310a aVar = this.f73676c;
            if (aVar != null) {
                str2 = aVar.getSearchKeyWord();
            } else {
                str2 = null;
            }
            C23089d a3 = a2.mo47829a(str5, str2).mo47829a("token_type", "musician").mo47829a("is_aladdin", "1");
            String str6 = "rank";
            C28310a aVar2 = this.f73676c;
            if (aVar2 != null) {
                num = Integer.valueOf(aVar2.getRank());
            }
            C26890h.m65011a(str3, a3.mo47829a(str6, String.valueOf(num)).mo47829a("aladdin_button_type", "click_all_song").f61491a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo50247a() {
        this.f73669c.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo50246a(C28310a aVar) {
        this.f73668b = aVar;
    }

    /* renamed from: a */
    public final boolean mo50249a(SearchUser searchUser) {
        List<Music> list;
        boolean z;
        if (searchUser != null) {
            list = searchUser.musicCards;
        } else {
            list = null;
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public C28044k(ViewStub viewStub) {
        C52711k.m112240b(viewStub, "musicViewStub");
        viewStub.setLayoutResource(R.layout.btc);
        View inflate = viewStub.inflate();
        C52711k.m112236a((Object) inflate, "musicViewStub.inflate()");
        this.f73669c = inflate;
        View findViewById = this.f73669c.findViewById(R.id.ema);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.music_card_list_view)");
        this.f73670d = (RecyclerView) findViewById;
        View findViewById2 = this.f73669c.findViewById(R.id.f75);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.view_all)");
        this.f73671e = findViewById2;
        this.f73670d.setLayoutManager(new LinearLayoutManager(this.f73669c.getContext(), 1, false));
        this.f73670d.setAdapter(this.f73672f);
        this.f73671e.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C28044k f73673a;

            {
                this.f73673a = r1;
            }

            public final void onClick(View view) {
                User user;
                ClickInstrumentation.onClick(view);
                if (view != null && !C32800a.m75679a(view)) {
                    SearchUser searchUser = this.f73673a.f73667a;
                    if (searchUser != null) {
                        User user2 = searchUser.user;
                        if (user2 != null) {
                            SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", user2.getUid()).withParam("sec_user_id", user2.getSecUid()).withParam("enter_from", "general_search").withParam("enter_from_request_id", user2.getRequestId()).withParam("extra_previous_page_position", "main_head").withParam("enter_method", "click_search_result").withParam("general_search_card_type", 2).open();
                            C28044k kVar = this.f73673a;
                            String a = C28381ab.f74518i.mo56813a(3);
                            SearchUser searchUser2 = kVar.f73667a;
                            if (searchUser2 != null) {
                                user = searchUser2.user;
                            } else {
                                user = null;
                            }
                            C0013i.m18a((Callable<TResult>) new C28046a<TResult>(a, user, kVar.f73668b), (Executor) C24076h.m58904e());
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo50248a(SearchUser searchUser, C26110ae aeVar) {
        boolean z;
        this.f73667a = searchUser;
        if (searchUser != null) {
            Collection collection = searchUser.musicCards;
            int i = 0;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f73672f.mo50246a(this.f73668b);
                this.f73669c.setVisibility(0);
                List arrayList = new ArrayList();
                List<Music> list = searchUser.musicCards;
                C52711k.m112236a((Object) list, "searchUser.musicCards");
                for (Music music : list) {
                    if (i >= 3) {
                        break;
                    }
                    C52711k.m112236a((Object) music, "music");
                    arrayList.add(music);
                    i++;
                }
                C28321a aVar = this.f73672f;
                aVar.f74291a.clear();
                Collection collection2 = arrayList;
                if (!collection2.isEmpty()) {
                    aVar.f74291a.addAll(collection2);
                }
                aVar.notifyDataSetChanged();
            }
        }
    }
}
