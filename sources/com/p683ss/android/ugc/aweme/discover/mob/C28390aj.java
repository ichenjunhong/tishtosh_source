package com.p683ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.model.C26112af;
import com.p683ss.android.ugc.aweme.commercialize.model.C26136q;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52555ag;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.aj */
public final class C28390aj implements C28423z {

    /* renamed from: a */
    public static final C28390aj f74551a = new C28390aj();

    /* renamed from: b */
    private static final String[] f74552b = {"person", "tag", "music", "poi", "ecommerce"};

    /* renamed from: c */
    private static final String[] f74553c = {"user_list", "tag_list", "music_list", "poi_list", "ecommerce_list"};

    /* renamed from: d */
    private static HashSet<C28380aa>[] f74554d = {new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>()};

    /* renamed from: e */
    private static final Set<String> f74555e = C52555ag.m112063a("tag_detail", "movie_detail", "discovery");

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.aj$a */
    static final class C28391a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C41434a f74556a;

        C28391a(C41434a aVar) {
            this.f74556a = aVar;
        }

        public final /* synthetic */ Object call() {
            String str = "enter_search";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f74556a.getEnterSearchFrom()).mo47829a("group_id", this.f74556a.getGroupId()).mo47829a("author_id", this.f74556a.getAuthorId());
            if (this.f74556a.getPreviousPage() != null) {
                a.mo47829a("previous_page", this.f74556a.getPreviousPage());
            }
            C26890h.m65011a(str, a.f61491a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.aj$b */
    static final class C28392b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C28382ac f74557a;

        C28392b(C28382ac acVar) {
            this.f74557a = acVar;
        }

        public final /* synthetic */ Object call() {
            String str;
            String str2;
            String str3;
            String str4;
            boolean z;
            String str5;
            C23089d a = C23089d.m56640a();
            C28382ac acVar = this.f74557a;
            if (a != null) {
                C23089d a2 = a.mo47829a("search_keyword", acVar.f74523b).mo47829a("request_id", acVar.f74526e).mo47829a("log_pb", C29981aa.m70153a().mo60161a(acVar.f74526e)).mo47829a("search_type", acVar.f74522a);
                String str6 = "enter_from";
                C41434a aVar = acVar.f74527f;
                C26136q qVar = null;
                if (aVar != null) {
                    str = aVar.getEnterSearchFrom();
                } else {
                    str = null;
                }
                C23089d a3 = a2.mo47829a(str6, str);
                String str7 = "previous_page";
                C41434a aVar2 = acVar.f74527f;
                if (aVar2 != null) {
                    str2 = aVar2.getPreviousPage();
                } else {
                    str2 = null;
                }
                C23089d a4 = a3.mo47829a(str7, str2);
                String str8 = "group_id";
                C41434a aVar3 = acVar.f74527f;
                if (aVar3 != null) {
                    str3 = aVar3.getGroupId();
                } else {
                    str3 = null;
                }
                C23089d a5 = a4.mo47829a(str8, str3);
                String str9 = "author_id";
                C41434a aVar4 = acVar.f74527f;
                if (aVar4 != null) {
                    str4 = aVar4.getAuthorId();
                } else {
                    str4 = null;
                }
                a5.mo47829a(str9, str4).mo47826a("is_success", acVar.f74528g ? 1 : 0);
                C26112af afVar = acVar.f74529h;
                if (afVar != null) {
                    qVar = afVar.getEasterEggInfo();
                }
                if (qVar != null) {
                    a.mo47826a("is_bonus", 1);
                }
                int i = acVar.f74524c;
                if (i == C41440e.FROM_CLICK_BUBBLE || i == C41440e.FROM_CLICK_CAPTION) {
                    a.mo47829a("video_source", "movie");
                } else if (i == C41440e.FROM_NEARBY) {
                    a.mo47829a("enter_from", "homepage_fresh");
                }
                if (acVar.f74536o) {
                    a.mo47829a("enter_method", "click_more_general_list");
                } else if (acVar.f74531j != acVar.f74530i) {
                    a.mo47829a("enter_method", "switch_tab");
                    a.mo47829a("from_search_subtab", C28389ai.m67369b(acVar.f74531j));
                } else if (acVar.f74524c != 2) {
                    CharSequence charSequence = acVar.f74535n;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        a.mo47829a("enter_method", acVar.f74535n);
                    } else {
                        int i2 = acVar.f74524c;
                        if (i2 == 7 || i2 == 6) {
                            str5 = acVar.f74534m;
                        } else if (i2 == C41440e.FROM_NEARBY) {
                            str5 = "homepage_fresh";
                        } else if (i2 == 1) {
                            str5 = "search_history";
                        } else if (i2 == 3) {
                            a.mo47829a("sug_type", acVar.f74532k);
                            str5 = "search_sug";
                        } else if (i2 == 4) {
                            str5 = "related_search_keywords";
                        } else if (i2 == 5) {
                            str5 = "default_search_keyword";
                        } else if (i2 == 9) {
                            str5 = "guide_search";
                        } else if (i2 == 16) {
                            str5 = "recom_search";
                        } else if (i2 == 21) {
                            str5 = "click_recom";
                        } else if (i2 == C41440e.FROM_FILTER) {
                            str5 = "tab_search";
                        } else {
                            str5 = "normal_search";
                        }
                        a.mo47829a("enter_method", str5);
                    }
                } else if (TextUtils.equals(acVar.f74523b, acVar.f74525d)) {
                    a.mo47829a("enter_method", acVar.f74534m);
                } else {
                    a.mo47829a("enter_method", "normal_search");
                }
            }
            JSONObject a6 = C23198ae.m56851a(a.f61491a);
            a6.put("duration", this.f74557a.f74537p);
            C26890h.m65012a("search", a6);
            if (this.f74557a.f74533l) {
                a6.put("time_interval", C28395am.f74565a);
                C26890h.m65012a("first_search", a6);
            }
            return C52860x.f131107a;
        }
    }

    private C28390aj() {
    }

    /* renamed from: a */
    public final void mo56824a(String str, String str2, String str3, boolean z, String str4) {
        C52711k.m112240b(str, "event");
        C52711k.m112240b(str2, "toUserId");
        C52711k.m112240b(str3, "enterFrom");
        C52711k.m112240b(str4, "enterMethod");
        Map<String, String> map = C23089d.m56640a().mo47829a("enter_from", str3).mo47829a("enter_method", str4).mo47829a("to_user_id", str2).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C28381ab.m67359d().mo56813a(0))).mo47829a("search_result_id", C28381ab.m67354b()).f61491a;
        C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        m67374a(str, map);
    }

    /* renamed from: a */
    public final void mo56823a(String str, String str2, String str3, boolean z) {
        String str4;
        C52711k.m112240b(str, "event");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "musicId");
        if (z) {
            str4 = C28381ab.m67359d().mo56813a(1);
        } else {
            str4 = C28381ab.m67359d().mo56813a(3);
        }
        Map<String, String> map = C23089d.m56640a().mo47829a("enter_from", str2).mo47829a("music_id", str3).mo47829a("log_pb", C29981aa.m70153a().mo60161a(str4)).mo47829a("search_result_id", C28381ab.m67354b()).f61491a;
        C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        m67374a(str, map);
    }

    /* renamed from: a */
    private static void m67371a() {
        for (HashSet<C28380aa> clear : f74554d) {
            clear.clear();
        }
    }

    /* renamed from: a */
    public static void m67372a(C28382ac acVar) {
        C0013i.m16a((Callable<TResult>) new C28392b<TResult>(acVar));
    }

    /* renamed from: a */
    public static void m67373a(C41434a aVar) {
        if (aVar != null) {
            C0013i.m18a((Callable<TResult>) new C28391a<TResult>(aVar), (Executor) C24076h.m58904e());
        }
    }

    /* renamed from: a */
    public static int m67370a(String str) {
        switch (str.hashCode()) {
            case 111178:
                if (str.equals("poi")) {
                    return 5;
                }
                break;
            case 114586:
                if (str.equals("tag")) {
                    return 2;
                }
                break;
            case 3599307:
                if (str.equals("user")) {
                    return 0;
                }
                break;
            case 104263205:
                if (str.equals("music")) {
                    return 1;
                }
                break;
            case 998835423:
                if (str.equals("general_search")) {
                    return 3;
                }
                break;
            case 1528280640:
                if (str.equals("ecommerce")) {
                    return 7;
                }
                break;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r1 == null) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void m67375a(java.util.List<? extends T> r7) {
        /*
            if (r7 == 0) goto L_0x00ef
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r0 = -1
        L_0x0009:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l
            r3 = 1
            r4 = 2
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.discover.mixfeed.l r1 = (com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l) r1
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchUser> r2 = r1.f74349b
            m67375a(r2)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchChallenge> r2 = r1.f74354g
            m67375a(r2)
            java.util.List<com.ss.android.ugc.aweme.music.model.Music> r2 = r1.f74353f
            m67375a(r2)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchPoi> r2 = r1.f74358k
            m67375a(r2)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchCommodity> r2 = r1.f74360m
            m67375a(r2)
            com.ss.android.ugc.aweme.discover.model.SearchMovie r1 = r1.f74361n
            java.util.List r1 = p2628d.p2629a.C52575l.m112092a(r1)
            m67375a(r1)     // Catch:{ Throwable -> 0x00f0 }
            goto L_0x00e3
        L_0x0041:
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.discover.model.SearchUser
            if (r2 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.discover.mob.aa r6 = new com.ss.android.ugc.aweme.discover.mob.aa
            com.ss.android.ugc.aweme.discover.model.SearchUser r1 = (com.p683ss.android.ugc.aweme.discover.model.SearchUser) r1
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.user
            java.lang.String r2 = "it.user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r0 = r0.getUid()
            java.lang.String r2 = "it.user.uid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            boolean r1 = r1.isAladdin()
            r6.<init>(r0, r1)
            r0 = 0
            goto L_0x00e3
        L_0x0063:
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.discover.model.SearchChallenge
            if (r2 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.discover.mob.aa r0 = new com.ss.android.ugc.aweme.discover.mob.aa
            com.ss.android.ugc.aweme.discover.model.SearchChallenge r1 = (com.p683ss.android.ugc.aweme.discover.model.SearchChallenge) r1
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r1.getChallenge()
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = r1.getCid()
            if (r1 != 0) goto L_0x0079
        L_0x0077:
            java.lang.String r1 = ""
        L_0x0079:
            r0.<init>(r1, r5, r4, r6)
            r6 = r0
        L_0x007d:
            r0 = 1
            goto L_0x00e3
        L_0x007f:
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.music.model.Music
            if (r2 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.discover.mob.aa r0 = new com.ss.android.ugc.aweme.discover.mob.aa
            com.ss.android.ugc.aweme.music.model.Music r1 = (com.p683ss.android.ugc.aweme.music.model.Music) r1
            java.lang.String r1 = r1.getMid()
            java.lang.String r2 = "it.mid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r0.<init>(r1, r5, r4, r6)
            r6 = r0
            r0 = 2
            goto L_0x00e3
        L_0x0096:
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.discover.model.SearchPoi
            if (r2 == 0) goto L_0x00b4
            r0 = 3
            com.ss.android.ugc.aweme.discover.mob.aa r2 = new com.ss.android.ugc.aweme.discover.mob.aa
            com.ss.android.ugc.aweme.discover.model.SearchPoi r1 = (com.p683ss.android.ugc.aweme.discover.model.SearchPoi) r1
            com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r1 = r1.poi
            java.lang.String r3 = "it.poi"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.String r1 = r1.getPoiId()
            java.lang.String r3 = "it.poi.poiId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            r2.<init>(r1, r5, r4, r6)
        L_0x00b2:
            r6 = r2
            goto L_0x00e3
        L_0x00b4:
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.discover.model.SearchCommodity
            if (r2 == 0) goto L_0x00c9
            r0 = 4
            com.ss.android.ugc.aweme.discover.mob.aa r2 = new com.ss.android.ugc.aweme.discover.mob.aa
            com.ss.android.ugc.aweme.discover.model.SearchCommodity r1 = (com.p683ss.android.ugc.aweme.discover.model.SearchCommodity) r1
            com.ss.android.ugc.aweme.discover.model.Commodity r1 = r1.getCommodity()
            java.lang.String r1 = r1.getGid()
            r2.<init>(r1, r5, r4, r6)
            goto L_0x00b2
        L_0x00c9:
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.discover.model.SearchMovie
            if (r2 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.discover.model.SearchMovie r1 = (com.p683ss.android.ugc.aweme.discover.model.SearchMovie) r1
            com.ss.android.ugc.aweme.discover.model.Movie r0 = r1.getMovie()
            if (r0 == 0) goto L_0x00d9
            java.lang.String r6 = r0.getChallengeId()
        L_0x00d9:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            com.ss.android.ugc.aweme.discover.mob.aa r6 = new com.ss.android.ugc.aweme.discover.mob.aa
            r6.<init>(r0, r3)
            goto L_0x007d
        L_0x00e3:
            if (r6 == 0) goto L_0x0009
            java.util.HashSet<com.ss.android.ugc.aweme.discover.mob.aa>[] r1 = f74554d
            r1 = r1[r0]
            r1.add(r6)
            goto L_0x0009
        L_0x00ee:
            return
        L_0x00ef:
            return
        L_0x00f0:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.mob.C28390aj.m67375a(java.util.List):void");
    }

    /* renamed from: a */
    public static void m67374a(String str, Map<String, String> map) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(map, "map");
        C26890h.m65012a(str, C23198ae.m56851a(map));
    }

    /* renamed from: a */
    public final void mo56822a(String str, String str2) {
        HashSet<C28380aa>[] hashSetArr;
        String str3;
        String str4;
        C52711k.m112240b(str, "labelName");
        C52711k.m112240b(str2, "keyword");
        int a = m67370a(str);
        if (a >= 0) {
            String a2 = C28381ab.m67359d().mo56813a(a);
            int i = 0;
            for (Iterable<C28380aa> iterable : f74554d) {
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (((C28380aa) next).f74510b) {
                        arrayList.add(next);
                    }
                }
                for (C28380aa aaVar : (List) arrayList) {
                    CharSequence charSequence = str;
                    if (TextUtils.equals(charSequence, "general_search")) {
                        C52711k.m112239a((Object) f74553c[i], (Object) "user_list");
                    } else {
                        C23089d a3 = C23089d.m56640a();
                        String str5 = "enter_from";
                        if (TextUtils.equals(charSequence, "general_search")) {
                            str4 = "general_search";
                        } else {
                            str4 = "search_result";
                        }
                        Map<String, String> map = a3.mo47829a(str5, str4).mo47829a("token_type", f74552b[i]).mo47829a(f74553c[i], aaVar.f74509a).mo47829a("search_keyword", str2).mo47829a("log_pb", C29981aa.m70153a().mo60161a(a2)).mo47829a("search_id", a2).mo47826a("is_aladdin", 1).f61491a;
                        C52711k.m112236a((Object) map, "builder.builder()");
                        m67374a("search_result_show", map);
                    }
                }
                CharSequence charSequence2 = str;
                if ((!TextUtils.equals(charSequence2, "general_search") || !TextUtils.equals(f74552b[i], "music")) && (!TextUtils.equals(charSequence2, "general_search") || !TextUtils.equals(f74552b[i], "person"))) {
                    Collection arrayList2 = new ArrayList();
                    for (Object next2 : iterable) {
                        if (!((C28380aa) next2).f74510b) {
                            arrayList2.add(next2);
                        }
                    }
                    if (((List) arrayList2).size() > 0) {
                        C23089d a4 = C23089d.m56640a();
                        String str6 = "enter_from";
                        if (TextUtils.equals(charSequence2, "general_search")) {
                            str3 = "general_search";
                        } else {
                            str3 = "search_result";
                        }
                        C23089d a5 = a4.mo47829a(str6, str3).mo47829a("token_type", f74552b[i]);
                        String str7 = f74553c[i];
                        Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable, 10));
                        for (C28380aa aaVar2 : iterable) {
                            arrayList3.add(aaVar2.f74509a);
                        }
                        C23089d a6 = a5.mo47829a(str7, ((List) arrayList3).toString()).mo47829a("search_keyword", str2).mo47829a("log_pb", C29981aa.m70153a().mo60161a(a2));
                        String str8 = "is_aladdin";
                        Collection arrayList4 = new ArrayList(C52575l.m112104a(iterable, 10));
                        for (C28380aa aaVar3 : iterable) {
                            arrayList4.add(Integer.valueOf(aaVar3.f74510b ? 1 : 0));
                        }
                        Map<String, String> map2 = a6.mo47829a(str8, ((List) arrayList4).toString()).f61491a;
                        C52711k.m112236a((Object) map2, "builder.builder()");
                        m67374a("search_result_show", map2);
                    }
                }
                i++;
            }
            m67371a();
        }
    }

    /* renamed from: a */
    public final void mo56821a(String str, Aweme aweme, String str2, boolean z) {
        String str3;
        String str4;
        C52711k.m112240b(str, "event");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str, "event");
        C52711k.m112240b(str2, "enterFrom");
        String a = C28381ab.f74518i.mo56813a(C28381ab.f74514e);
        C23089d a2 = C23089d.m56640a().mo47829a("enter_from", str2);
        String str5 = "author_id";
        String str6 = null;
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        C23089d a3 = a2.mo47829a(str5, str3);
        String str7 = "group_id";
        if (aweme != null) {
            str6 = aweme.getAid();
        }
        C23089d a4 = a3.mo47829a(str7, str6).mo47829a("log_pb", C29981aa.m70153a().mo60161a(a));
        String str8 = "search_type";
        if (C52711k.m112239a((Object) C28381ab.m67357c(), (Object) "general_search")) {
            str4 = "general";
        } else {
            str4 = C28381ab.m67357c();
        }
        Map<String, String> map = a4.mo47829a(str8, str4).mo47829a("search_result_id", C28381ab.m67354b()).mo47829a("video_tag", "").mo47826a("rank", C28381ab.f74515f).f61491a;
        C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        m67374a(str, map);
    }
}
