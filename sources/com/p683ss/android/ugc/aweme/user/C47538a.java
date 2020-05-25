package com.p683ss.android.ugc.aweme.user;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.user.a */
public final class C47538a {

    /* renamed from: f */
    public static final C47539a f119946f = new C47539a(null);
    @C17952c(mo34828a = "uid")

    /* renamed from: a */
    public final String f119947a;
    @C17952c(mo34828a = "short_id")

    /* renamed from: b */
    public final String f119948b;
    @C17952c(mo34828a = "unique_id")

    /* renamed from: c */
    public final String f119949c;
    @C17952c(mo34828a = "nickname")

    /* renamed from: d */
    public final String f119950d;
    @C17952c(mo34828a = "avatar_url")

    /* renamed from: e */
    public final String f119951e;

    /* renamed from: com.ss.android.ugc.aweme.user.a$a */
    public static final class C47539a {
        private C47539a() {
        }

        public /* synthetic */ C47539a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C47538a m102966a(User user) {
            String str;
            boolean z;
            C52711k.m112240b(user, "u");
            String uid = user.getUid();
            C52711k.m112236a((Object) uid, "u.uid");
            String shortId = user.getShortId();
            C52711k.m112236a((Object) shortId, "u.shortId");
            String uniqueId = user.getUniqueId();
            C52711k.m112236a((Object) uniqueId, "u.uniqueId");
            String nickname = user.getNickname();
            C52711k.m112236a((Object) nickname, "u.nickname");
            if (user.getAvatarThumb() != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                C52711k.m112236a((Object) avatarThumb, "u.avatarThumb");
                Collection urlList = avatarThumb.getUrlList();
                if (urlList == null || urlList.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    UrlModel avatarThumb2 = user.getAvatarThumb();
                    C52711k.m112236a((Object) avatarThumb2, "u.avatarThumb");
                    str = (String) avatarThumb2.getUrlList().get(0);
                    String str2 = str;
                    C52711k.m112236a((Object) str2, "if (u.avatarThumb == nul… u.avatarThumb.urlList[0]");
                    C47538a aVar = new C47538a(uid, shortId, uniqueId, nickname, str2);
                    return aVar;
                }
            }
            str = "";
            String str22 = str;
            C52711k.m112236a((Object) str22, "if (u.avatarThumb == nul… u.avatarThumb.urlList[0]");
            C47538a aVar2 = new C47538a(uid, shortId, uniqueId, nickname, str22);
            return aVar2;
        }
    }

    /* renamed from: a */
    public final String mo94847a() {
        boolean z;
        CharSequence charSequence = this.f119949c;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f119948b;
        }
        return this.f119949c;
    }

    public C47538a(String str, String str2, String str3, String str4, String str5) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, "shortId");
        C52711k.m112240b(str3, "uniqueId");
        C52711k.m112240b(str4, "nickname");
        C52711k.m112240b(str5, "avatarUrl");
        this.f119947a = str;
        this.f119948b = str2;
        this.f119949c = str3;
        this.f119950d = str4;
        this.f119951e = str5;
    }

    public /* synthetic */ C47538a(String str, String str2, String str3, String str4, String str5, int i, C52707g gVar) {
        this(str, "", "", "", "");
    }
}
