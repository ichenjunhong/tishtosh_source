package com.p683ss.android.ugc.aweme.search.model;

import com.p683ss.android.ugc.aweme.search.p2124d.C41412a;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.search.model.e */
public final class C41440e implements Serializable, Cloneable {
    public static final int FROM_CLICK_BUBBLE;
    public static final int FROM_CLICK_CAPTION;
    public static final int FROM_CLICK_SERIES;
    public static final int FROM_FILTER;
    public static final int FROM_MOVIE_CHALLENGE = 23;
    public static final int FROM_NEARBY;

    /* renamed from: a */
    private static int f105031a = 23;

    /* renamed from: A */
    private boolean f105032A;

    /* renamed from: B */
    private C41412a f105033B;

    /* renamed from: b */
    private int f105034b;

    /* renamed from: c */
    private boolean f105035c;

    /* renamed from: d */
    private String f105036d;

    /* renamed from: e */
    private int f105037e;
    public HashMap<String, String> extra = new HashMap<>();

    /* renamed from: f */
    private String f105038f;

    /* renamed from: g */
    private String f105039g;

    /* renamed from: h */
    private String f105040h;

    /* renamed from: i */
    private String f105041i;

    /* renamed from: j */
    private int f105042j;

    /* renamed from: k */
    private String f105043k = "";

    /* renamed from: l */
    private boolean f105044l;
    public HashMap<String, String> logExtra = new HashMap<>();

    /* renamed from: m */
    private int f105045m;

    /* renamed from: n */
    private String f105046n;

    /* renamed from: o */
    private int f105047o;

    /* renamed from: p */
    private String f105048p;

    /* renamed from: q */
    private String f105049q;

    /* renamed from: r */
    private int f105050r;

    /* renamed from: s */
    private C41441f f105051s;

    /* renamed from: t */
    private String f105052t;

    /* renamed from: u */
    private String f105053u;

    /* renamed from: v */
    private String f105054v;

    /* renamed from: w */
    private String f105055w;

    /* renamed from: x */
    private String f105056x;

    /* renamed from: y */
    private String f105057y;

    /* renamed from: z */
    private String f105058z;

    public final String getBackTo() {
        return this.f105046n;
    }

    public final String getEnterFrom() {
        return this.f105043k;
    }

    public final String getEnterMethod() {
        return this.f105041i;
    }

    public final HashMap<String, String> getExtra() {
        return this.extra;
    }

    public final C41412a getFilterOption() {
        return this.f105033B;
    }

    public final String getImprId() {
        return this.f105039g;
    }

    public final int getIndex() {
        return this.f105047o;
    }

    public final int getIntermediatePageIndex() {
        return this.f105042j;
    }

    public final String getItemIdList() {
        return this.f105055w;
    }

    public final String getKeyword() {
        return this.f105052t;
    }

    public final String getListItemId() {
        return this.f105057y;
    }

    public final HashMap<String, String> getLogExtra() {
        return this.logExtra;
    }

    public final String getOutAwemeId() {
        return this.f105058z;
    }

    public final int getPosition() {
        return this.f105037e;
    }

    public final String getPreviousPage() {
        return this.f105040h;
    }

    public final int getRankInList() {
        return this.f105045m;
    }

    public final String getRealSearchWord() {
        return this.f105054v;
    }

    public final String getRefer() {
        return this.f105048p;
    }

    public final int getSearchFrom() {
        return this.f105034b;
    }

    public final String getSearchResultId() {
        return this.f105038f;
    }

    public final String getSource() {
        return this.f105036d;
    }

    public final String getSugType() {
        return this.f105049q;
    }

    public final C41441f getTimeParam() {
        return this.f105051s;
    }

    public final boolean getTrending() {
        return this.f105044l;
    }

    public final int getWordType() {
        return this.f105050r;
    }

    public final boolean isAd() {
        return this.f105032A;
    }

    public final boolean isOpenNewSearchContainer() {
        return this.f105035c;
    }

    public final boolean fromGuideSearch() {
        if (9 == this.f105034b) {
            return true;
        }
        return false;
    }

    public final String getCurrentSearchKeyword() {
        if (this.f105053u != null) {
            return this.f105053u;
        }
        return this.f105052t;
    }

    public final String getGuideSearchBaseWord() {
        if (this.f105056x == null) {
            return this.f105052t;
        }
        return this.f105056x;
    }

    public final int getId() {
        int i;
        int i2 = this.f105047o * 31;
        if (this.f105052t != null) {
            i = this.f105052t.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    static {
        int i = f105031a + 1;
        f105031a = i;
        FROM_CLICK_BUBBLE = i;
        int i2 = f105031a + 1;
        f105031a = i2;
        FROM_CLICK_CAPTION = i2;
        int i3 = f105031a + 1;
        f105031a = i3;
        FROM_NEARBY = i3;
        int i4 = f105031a + 1;
        f105031a = i4;
        FROM_FILTER = i4;
        int i5 = f105031a + 1;
        f105031a = i5;
        FROM_CLICK_SERIES = i5;
    }

    public final C41440e copy() {
        try {
            return (C41440e) clone();
        } catch (CloneNotSupportedException unused) {
            C41440e eVar = new C41440e();
            eVar.f105052t = this.f105052t;
            eVar.f105043k = this.f105043k;
            eVar.f105047o = this.f105047o;
            eVar.f105041i = this.f105041i;
            eVar.f105033B = this.f105033B;
            eVar.f105056x = this.f105056x;
            eVar.f105046n = this.f105046n;
            eVar.f105042j = this.f105042j;
            eVar.f105032A = this.f105032A;
            eVar.f105035c = this.f105035c;
            eVar.f105034b = this.f105034b;
            eVar.f105037e = this.f105037e;
            eVar.f105044l = this.f105044l;
            eVar.f105036d = this.f105036d;
            eVar.f105040h = this.f105040h;
            eVar.f105045m = this.f105045m;
            eVar.f105054v = this.f105054v;
            eVar.f105055w = this.f105055w;
            eVar.f105058z = this.f105058z;
            eVar.f105050r = this.f105050r;
            return eVar;
        }
    }

    public final C41440e setAd(boolean z) {
        this.f105032A = z;
        return this;
    }

    public final void setBackTo(String str) {
        this.f105046n = str;
    }

    public final C41440e setCurrentSearchKeyword(String str) {
        this.f105053u = str;
        return this;
    }

    public final C41440e setEnterFrom(String str) {
        this.f105043k = str;
        return this;
    }

    public final C41440e setEnterMethod(String str) {
        this.f105041i = str;
        return this;
    }

    public final C41440e setExtra(HashMap<String, String> hashMap) {
        this.extra = hashMap;
        return this;
    }

    public final C41440e setFilterOption(C41412a aVar) {
        this.f105033B = aVar;
        return this;
    }

    public final C41440e setGuideSearchBaseWord(String str) {
        this.f105056x = str;
        return this;
    }

    public final C41440e setImprId(String str) {
        this.f105039g = str;
        return this;
    }

    public final void setIndex(int i) {
        this.f105047o = i;
    }

    public final C41440e setIntermediatePageIndex(int i) {
        this.f105042j = i;
        return this;
    }

    public final C41440e setItemIdList(String str) {
        this.f105055w = str;
        return this;
    }

    public final C41440e setKeyword(String str) {
        this.f105052t = str;
        return this;
    }

    public final C41440e setListItemId(String str) {
        this.f105057y = str;
        return this;
    }

    public final C41440e setLogExtra(HashMap<String, String> hashMap) {
        this.logExtra = hashMap;
        return this;
    }

    public final C41440e setOpenNewSearchContainer(boolean z) {
        this.f105035c = z;
        return this;
    }

    public final C41440e setOutAwemeId(String str) {
        this.f105058z = str;
        return this;
    }

    public final C41440e setPosition(int i) {
        this.f105037e = i;
        return this;
    }

    public final C41440e setPreviousPage(String str) {
        this.f105040h = str;
        return this;
    }

    public final void setRankInList(int i) {
        this.f105045m = i;
    }

    public final C41440e setRealSearchWord(String str) {
        this.f105054v = str;
        return this;
    }

    public final C41440e setRefer(String str) {
        this.f105048p = str;
        return this;
    }

    public final C41440e setSearchFrom(int i) {
        this.f105034b = i;
        return this;
    }

    public final C41440e setSearchResultId(String str) {
        this.f105038f = str;
        return this;
    }

    public final C41440e setSource(String str) {
        this.f105036d = str;
        return this;
    }

    public final C41440e setSugType(String str) {
        this.f105049q = str;
        return this;
    }

    public final C41440e setTimeParam(C41441f fVar) {
        this.f105051s = fVar;
        return this;
    }

    public final C41440e setWordType(int i) {
        this.f105050r = i;
        return this;
    }

    public final C41440e setTrending(Boolean bool) {
        this.f105044l = bool.booleanValue();
        return this;
    }
}
