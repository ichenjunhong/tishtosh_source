package com.p683ss.android.ugc.aweme.commercialize.egg.p1560e;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26136q;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import com.p683ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.e.a */
public final class C25773a {

    /* renamed from: a */
    public String f68153a;

    /* renamed from: b */
    public String f68154b;

    /* renamed from: c */
    public String f68155c;

    /* renamed from: d */
    public String f68156d;

    /* renamed from: e */
    public String f68157e;

    /* renamed from: f */
    public String f68158f;

    /* renamed from: g */
    public final boolean f68159g;

    /* renamed from: h */
    public final int f68160h;

    /* renamed from: i */
    public final boolean f68161i;

    /* renamed from: j */
    public AtomicBoolean f68162j;

    /* renamed from: k */
    public C25777c f68163k;

    /* renamed from: l */
    public C25776b f68164l;

    /* renamed from: m */
    public final String f68165m;

    /* renamed from: n */
    public final String f68166n;

    /* renamed from: o */
    public String f68167o;

    /* renamed from: p */
    private final C25774a<?> f68168p;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.e.a$a */
    public static final class C25774a<T> {

        /* renamed from: a */
        public T f68169a;

        /* renamed from: b */
        public boolean f68170b = true;

        /* renamed from: c */
        public int f68171c = 1;

        /* renamed from: d */
        public boolean f68172d = true;

        /* renamed from: e */
        public String f68173e = "";

        /* renamed from: f */
        public String f68174f = "";

        /* renamed from: g */
        public String f68175g = "";

        /* renamed from: h */
        public AwemeRawAd f68176h;

        /* renamed from: a */
        public final C25773a mo52977a() {
            return new C25773a(this, null);
        }

        /* renamed from: a */
        public final C25774a<T> mo52974a(AwemeRawAd awemeRawAd) {
            this.f68176h = awemeRawAd;
            return this;
        }

        /* renamed from: a */
        public final C25774a<T> mo52975a(T t) {
            this.f68169a = t;
            return this;
        }

        /* renamed from: b */
        public final C25774a<T> mo52978b(String str) {
            if (str == null) {
                str = "";
            }
            this.f68174f = str;
            return this;
        }

        /* renamed from: c */
        public final C25774a<T> mo52979c(String str) {
            C52711k.m112240b(str, "enterFrom");
            this.f68175g = str;
            return this;
        }

        /* renamed from: a */
        public final C25774a<T> mo52976a(String str) {
            if (str == null) {
                str = "";
            }
            this.f68173e = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.e.a$b */
    final class C25775b {
        public C25775b() {
        }
    }

    private C25773a(C25774a<?> aVar) {
        String str;
        String str2;
        this.f68168p = aVar;
        this.f68156d = "";
        this.f68157e = "";
        this.f68158f = "";
        this.f68159g = this.f68168p.f68170b;
        this.f68160h = this.f68168p.f68171c;
        this.f68161i = this.f68168p.f68172d;
        boolean z = false;
        this.f68162j = new AtomicBoolean(false);
        this.f68165m = this.f68168p.f68173e;
        this.f68166n = this.f68168p.f68174f;
        this.f68167o = this.f68168p.f68175g;
        C25775b bVar = new C25775b();
        C25774a<?> aVar2 = this.f68168p;
        C52711k.m112240b(aVar2, "builder");
        T t = aVar2.f68169a;
        String str3 = null;
        if (t instanceof ItemLikeEggData) {
            ItemLikeEggData itemLikeEggData = (ItemLikeEggData) t;
            C25773a aVar3 = C25773a.this;
            aVar3.f68153a = itemLikeEggData.getMaterialUrl();
            aVar3.f68154b = itemLikeEggData.getFileType();
            AwemeRawAd awemeRawAd = aVar2.f68176h;
            String str4 = "like";
            if (awemeRawAd != null) {
                str2 = awemeRawAd.getCreativeIdStr();
            } else {
                str2 = null;
            }
            if (awemeRawAd != null) {
                str3 = awemeRawAd.getLogExtra();
            }
            C25776b bVar2 = new C25776b(str4, str2, str3, aVar2.f68173e, null, 16, null);
            aVar3.f68164l = bVar2;
        } else if (t instanceof ItemCommentEggData) {
            ItemCommentEggData itemCommentEggData = (ItemCommentEggData) t;
            C25773a aVar4 = C25773a.this;
            aVar4.f68153a = itemCommentEggData.getMaterialUrl();
            aVar4.f68154b = itemCommentEggData.getFileType();
            aVar4.f68155c = itemCommentEggData.getRegex();
            String eggId = itemCommentEggData.getEggId();
            C52711k.m112236a((Object) eggId, "data.eggId");
            C52711k.m112240b(eggId, "<set-?>");
            aVar4.f68158f = eggId;
            String webUrl = itemCommentEggData.getWebUrl();
            C52711k.m112236a((Object) webUrl, "data.webUrl");
            C52711k.m112240b(webUrl, "<set-?>");
            aVar4.f68156d = webUrl;
            String openUrl = itemCommentEggData.getOpenUrl();
            C52711k.m112236a((Object) openUrl, "data.openUrl");
            C52711k.m112240b(openUrl, "<set-?>");
            aVar4.f68157e = openUrl;
            AwemeRawAd awemeRawAd2 = aVar2.f68176h;
            String str5 = "comment";
            if (awemeRawAd2 != null) {
                str = awemeRawAd2.getCreativeIdStr();
            } else {
                str = null;
            }
            if (awemeRawAd2 != null) {
                str3 = awemeRawAd2.getLogExtra();
            }
            C25776b bVar3 = new C25776b(str5, str, str3, aVar2.f68174f, null, 16, null);
            aVar4.f68164l = bVar3;
        } else {
            if (t instanceof C26136q) {
                C26136q qVar = (C26136q) t;
                UrlModel sourceUrl = qVar.getSourceUrl();
                if (sourceUrl != null) {
                    List urlList = sourceUrl.getUrlList();
                    if (urlList != null) {
                        String str6 = (String) C52575l.m112118a(urlList, 0);
                        if (str6 != null) {
                            if (str6 != null) {
                                str3 = C52830p.m112447b(str6).toString();
                            } else {
                                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        }
                    }
                }
                CharSequence sourceType = qVar.getSourceType();
                if (TextUtils.equals(sourceType, C25790a.m62414b()) || TextUtils.equals(sourceType, C25790a.m62415c()) || TextUtils.equals(sourceType, C25790a.m62416d())) {
                    z = true;
                }
                if (z && TextUtils.isEmpty(str3)) {
                    C25776b bVar4 = new C25776b("search", "-1", "", "", qVar.getId());
                    C25773a aVar5 = C25773a.this;
                    aVar5.f68153a = str3;
                    aVar5.f68154b = qVar.getSourceType();
                    aVar5.f68164l = bVar4;
                }
            }
        }
    }

    public /* synthetic */ C25773a(C25774a aVar, C52707g gVar) {
        this(aVar);
    }
}
