package com.p683ss.android.ugc.aweme.commercialize.model;

import android.os.Build.VERSION;
import android.util.ArrayMap;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.f */
public final class C26121f {

    /* renamed from: d */
    public static final C26122a f68971d = new C26122a(null);
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public String f68972a;
    @C17952c(mo34828a = "name")

    /* renamed from: b */
    public String f68973b;
    @C17952c(mo34828a = "image")

    /* renamed from: c */
    public UrlModel f68974c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.f$a */
    public static final class C26122a {
        private C26122a() {
        }

        /* renamed from: a */
        private static boolean m63398a() {
            C26131l a = CommerceSettingsApi.m62160a();
            if (a == null || !a.f69010e) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C26122a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static boolean m63399a(UrlModel urlModel) {
            if (urlModel == null) {
                return false;
            }
            List urlList = urlModel.getUrlList();
            if (urlList == null || urlList.isEmpty()) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final Long mo53637b(User user) {
            if (user != null) {
                AvatarDecoration c = m63401c(user);
                if (c != null) {
                    return Long.valueOf(c.getId());
                }
            }
            return null;
        }

        /* renamed from: a */
        private static boolean m63400a(AvatarDecoration avatarDecoration) {
            CharSequence charSequence;
            boolean z;
            UrlModel urlModel = null;
            if (avatarDecoration != null) {
                charSequence = avatarDecoration.getName();
            } else {
                charSequence = null;
            }
            CharSequence charSequence2 = charSequence;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (avatarDecoration != null) {
                    urlModel = avatarDecoration.getSourceUrl();
                }
                if (m63399a(urlModel)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        private static AvatarDecoration m63401c(User user) {
            String str;
            IAccountUserService userService = C20854a.m53161a().userService();
            C52711k.m112236a((Object) userService, "AccountProxyService.get().userService()");
            User curUser = userService.getCurUser();
            String uid = user.getUid();
            if (curUser != null) {
                str = curUser.getUid();
            } else {
                str = null;
            }
            if (C52711k.m112239a((Object) uid, (Object) str)) {
                user = curUser;
            }
            C52711k.m112236a((Object) user, "u");
            return user.getAvatarDecoration();
        }

        /* renamed from: a */
        public final boolean mo53636a(User user) {
            AvatarDecoration avatarDecoration;
            if (m63398a()) {
                if (user != null) {
                    avatarDecoration = m63401c(user);
                } else {
                    avatarDecoration = null;
                }
                if (m63400a(avatarDecoration)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0017 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo53634a(com.p683ss.android.ugc.aweme.profile.model.User r3, com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView r4) {
            /*
                r2 = this;
                if (r4 != 0) goto L_0x0003
                return
            L_0x0003:
                if (r3 == 0) goto L_0x0010
                com.ss.android.ugc.aweme.profile.model.AvatarDecoration r3 = m63401c(r3)
                if (r3 == 0) goto L_0x0010
                com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getSourceUrl()
                goto L_0x0011
            L_0x0010:
                r3 = 0
            L_0x0011:
                boolean r0 = m63399a(r3)
                if (r0 != 0) goto L_0x0018
                return
            L_0x0018:
                com.facebook.drawee.h.b r0 = r4.getHierarchy()
                com.facebook.drawee.f.a r0 = (com.facebook.drawee.p940f.C13833a) r0
                r1 = 17170445(0x106000d, float:2.461195E-38)
                if (r0 == 0) goto L_0x0026
                r0.mo25902b(r1)
            L_0x0026:
                com.facebook.drawee.h.b r0 = r4.getHierarchy()
                com.facebook.drawee.f.a r0 = (com.facebook.drawee.p940f.C13833a) r0
                if (r0 == 0) goto L_0x0031
                r0.mo25907c(r1)
            L_0x0031:
                com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r4, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.model.C26121f.C26122a.mo53634a(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.base.ui.RemoteImageView):void");
        }

        /* renamed from: a */
        public final void mo53635a(User user, String str) {
            String str2;
            Map map;
            Long b = mo53637b(user);
            if (user != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            if (b != null) {
                b.longValue();
                if (str != null && str2 != null) {
                    if (VERSION.SDK_INT >= 19) {
                        map = new ArrayMap(4);
                    } else {
                        map = new HashMap();
                    }
                    map.put("dec_id", String.valueOf(b.longValue()));
                    map.put("enter_from", str);
                    map.put("author_id", str2);
                    C26890h.m65011a("show_head_decoration", map);
                }
            }
        }
    }

    /* renamed from: a */
    public static final Long m63397a(User user) {
        return f68971d.mo53637b(user);
    }
}
