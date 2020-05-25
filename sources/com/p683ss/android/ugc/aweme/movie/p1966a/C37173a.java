package com.p683ss.android.ugc.aweme.movie.p1966a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.movie.a.a */
public final class C37173a {

    /* renamed from: o */
    public static final C37174a f94876o = new C37174a(null);
    @C17952c(mo34828a = "template_id")

    /* renamed from: a */
    public final long f94877a;
    @C17952c(mo34828a = "author")

    /* renamed from: b */
    public final User f94878b;
    @C17952c(mo34828a = "music")

    /* renamed from: c */
    public final Music f94879c;
    @C17952c(mo34828a = "video")

    /* renamed from: d */
    public final Video f94880d;
    @C17952c(mo34828a = "title")

    /* renamed from: e */
    public final String f94881e;
    @C17952c(mo34828a = "desc")

    /* renamed from: f */
    public final String f94882f;
    @C17952c(mo34828a = "template_url")

    /* renamed from: g */
    public final String f94883g;
    @C17952c(mo34828a = "fragment_count")

    /* renamed from: h */
    public final int f94884h;
    @C17952c(mo34828a = "usage_amount")

    /* renamed from: i */
    public final long f94885i;
    @C17952c(mo34828a = "extra")

    /* renamed from: j */
    public final String f94886j;
    @C17952c(mo34828a = "is_collected")

    /* renamed from: k */
    public final boolean f94887k;
    @C17952c(mo34828a = "sdk_version")

    /* renamed from: l */
    public final String f94888l;
    @C17952c(mo34828a = "item_type")

    /* renamed from: m */
    public final int f94889m;
    @C17952c(mo34828a = "md5")

    /* renamed from: n */
    public final String f94890n;

    /* renamed from: com.ss.android.ugc.aweme.movie.a.a$a */
    public static final class C37174a {
        private C37174a() {
        }

        public /* synthetic */ C37174a(C52707g gVar) {
            this();
        }
    }

    public C37173a() {
        this(0, null, null, null, null, null, null, 0, 0, null, false, null, 0, null, 16383, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37173a) {
                C37173a aVar = (C37173a) obj;
                if ((this.f94877a == aVar.f94877a) && C52711k.m112239a((Object) this.f94878b, (Object) aVar.f94878b) && C52711k.m112239a((Object) this.f94879c, (Object) aVar.f94879c) && C52711k.m112239a((Object) this.f94880d, (Object) aVar.f94880d) && C52711k.m112239a((Object) this.f94881e, (Object) aVar.f94881e) && C52711k.m112239a((Object) this.f94882f, (Object) aVar.f94882f) && C52711k.m112239a((Object) this.f94883g, (Object) aVar.f94883g)) {
                    if (this.f94884h == aVar.f94884h) {
                        if ((this.f94885i == aVar.f94885i) && C52711k.m112239a((Object) this.f94886j, (Object) aVar.f94886j)) {
                            if ((this.f94887k == aVar.f94887k) && C52711k.m112239a((Object) this.f94888l, (Object) aVar.f94888l)) {
                                if (!(this.f94889m == aVar.f94889m) || !C52711k.m112239a((Object) this.f94890n, (Object) aVar.f94890n)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f94877a) * 31;
        User user = this.f94878b;
        int i = 0;
        int hashCode2 = (hashCode + (user != null ? user.hashCode() : 0)) * 31;
        Music music = this.f94879c;
        int hashCode3 = (hashCode2 + (music != null ? music.hashCode() : 0)) * 31;
        Video video = this.f94880d;
        int hashCode4 = (hashCode3 + (video != null ? video.hashCode() : 0)) * 31;
        String str = this.f94881e;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f94882f;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f94883g;
        int hashCode7 = (((((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.f94884h)) * 31) + Long.hashCode(this.f94885i)) * 31;
        String str4 = this.f94886j;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.f94887k;
        if (z) {
            z = true;
        }
        int i2 = (hashCode8 + (z ? 1 : 0)) * 31;
        String str5 = this.f94888l;
        int hashCode9 = (((i2 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.f94889m)) * 31;
        String str6 = this.f94890n;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemplateResponseItem(id=");
        sb.append(this.f94877a);
        sb.append(", author=");
        sb.append(this.f94878b);
        sb.append(", music=");
        sb.append(this.f94879c);
        sb.append(", video=");
        sb.append(this.f94880d);
        sb.append(", title=");
        sb.append(this.f94881e);
        sb.append(", description=");
        sb.append(this.f94882f);
        sb.append(", templateUrl=");
        sb.append(this.f94883g);
        sb.append(", fragmentCount=");
        sb.append(this.f94884h);
        sb.append(", usageAmount=");
        sb.append(this.f94885i);
        sb.append(", extra=");
        sb.append(this.f94886j);
        sb.append(", isCollected=");
        sb.append(this.f94887k);
        sb.append(", sdkVersion=");
        sb.append(this.f94888l);
        sb.append(", itemType=");
        sb.append(this.f94889m);
        sb.append(", md5=");
        sb.append(this.f94890n);
        sb.append(")");
        return sb.toString();
    }

    private C37173a(long j, User user, Music music, Video video, String str, String str2, String str3, int i, long j2, String str4, boolean z, String str5, int i2, String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, "description");
        C52711k.m112240b(str9, "templateUrl");
        C52711k.m112240b(str10, "extra");
        C52711k.m112240b(str11, "sdkVersion");
        this.f94877a = j;
        this.f94878b = user;
        this.f94879c = music;
        this.f94880d = video;
        this.f94881e = str7;
        this.f94882f = str8;
        this.f94883g = str9;
        this.f94884h = i;
        this.f94885i = j2;
        this.f94886j = str10;
        this.f94887k = z;
        this.f94888l = str11;
        this.f94889m = i2;
        this.f94890n = str6;
    }

    private /* synthetic */ C37173a(long j, User user, Music music, Video video, String str, String str2, String str3, int i, long j2, String str4, boolean z, String str5, int i2, String str6, int i3, C52707g gVar) {
        this(-1, null, null, null, "not_set", "not_set", "not_set", 0, 0, "not_set", false, "not_set", -1, "not_set");
    }
}
