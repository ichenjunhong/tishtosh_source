package com.p683ss.android.ugc.aweme.friends.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23392f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.friends.C32502a;
import com.p683ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32504a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32753b;
import com.p683ss.android.ugc.aweme.friends.p1792ui.FacebookAuthorizeActivity;
import com.p683ss.android.ugc.aweme.friends.utils.FriendslistPermissionApi.C32780a;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47720bh;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.permission.C47940b.C47943a;
import com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0013i;
import p064c.p065a.p071d.C1710e;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.utils.c */
public final class C32783c {

    /* renamed from: a */
    public static boolean f85368a;

    /* renamed from: b */
    public static boolean f85369b;

    /* renamed from: c */
    public static final String[] f85370c = {"android.permission.READ_CONTACTS"};

    /* renamed from: d */
    public static final C32783c f85371d = new C32783c();

    /* renamed from: e */
    private static int f85372e;

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.c$a */
    public static final class C32784a implements C32753b {

        /* renamed from: a */
        final /* synthetic */ String f85373a;

        /* renamed from: a */
        public final void mo60072a() {
            C26890h.m65011a("authorize_contact_response", C23089d.m56640a().mo47829a("enter_from", this.f85373a).mo47826a("is_allow", 1).mo47829a("pop_up_type", "authorize").f61491a);
            C32783c.m75668b();
            C32783c.m75665a("facebook_friend_list", 1);
            C32783c.m75666a(this.f85373a, false);
        }

        /* renamed from: b */
        public final void mo60073b() {
            C26890h.m65011a("authorize_contact_response", C23089d.m56640a().mo47829a("enter_from", this.f85373a).mo47826a("is_allow", 0).mo47829a("pop_up_type", "authorize").f61491a);
            C32783c.m75665a("facebook_friend_list", 0);
            C32783c.m75666a(this.f85373a, false);
        }

        public C32784a(String str) {
            this.f85373a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.c$b */
    public static final class C32785b implements C47943a {

        /* renamed from: a */
        final /* synthetic */ String f85374a;

        public C32785b(String str) {
            this.f85374a = str;
        }

        /* renamed from: a */
        public final void mo66302a() {
            C47718bf.m103288a(new C32504a(this.f85374a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.c$c */
    public static final class C32786c implements C47943a {

        /* renamed from: a */
        final /* synthetic */ String f85375a;

        public C32786c(String str) {
            this.f85375a = str;
        }

        /* renamed from: a */
        public final void mo66302a() {
            C47718bf.m103288a(new C32504a(this.f85375a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.c$d */
    static final class C32787d<T> implements C1710e<BaseResponse> {

        /* renamed from: a */
        public static final C32787d f85376a = new C32787d();

        C32787d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.c$e */
    static final class C32788e<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C32788e f85377a = new C32788e();

        C32788e() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C17840a.m43754b(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.c$f */
    static final class C32789f implements OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ int f85378a;

        /* renamed from: b */
        final /* synthetic */ String f85379b;

        C32789f(int i, String str) {
            this.f85378a = i;
            this.f85379b = str;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            String str;
            if (this.f85378a == 0) {
                str = "facebook_friend_list";
            } else {
                str = "contact_list";
            }
            C32783c.m75665a(str, 0);
            C32783c.m75666a(this.f85379b, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.c$g */
    static final class C32790g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f85380a;

        /* renamed from: b */
        final /* synthetic */ Activity f85381b;

        /* renamed from: c */
        final /* synthetic */ String f85382c;

        C32790g(int i, Activity activity, String str) {
            this.f85380a = i;
            this.f85381b = activity;
            this.f85382c = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f85380a == 0) {
                ((C32502a) C23392f.m57473a(this.f85381b, C32502a.class)).mo48498b(true);
            }
            C32783c.f85371d.mo66363a(this.f85380a, this.f85382c, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.c$h */
    static final class C32791h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f85383a;

        /* renamed from: b */
        final /* synthetic */ Activity f85384b;

        /* renamed from: c */
        final /* synthetic */ C47943a f85385c;

        /* renamed from: d */
        final /* synthetic */ String f85386d;

        C32791h(int i, Activity activity, C47943a aVar, String str) {
            this.f85383a = i;
            this.f85384b = activity;
            this.f85385c = aVar;
            this.f85386d = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f85383a == 0) {
                C47720bh.m103294a(this.f85384b);
                C47943a aVar = this.f85385c;
                if (aVar != null) {
                    aVar.mo66302a();
                }
            } else {
                Context context = this.f85384b;
                String str = this.f85386d;
                C52711k.m112240b(str, "enterFrom");
                if (context != null) {
                    Intent intent = new Intent(context, FacebookAuthorizeActivity.class);
                    intent.putExtra("enter_from", str);
                    context.startActivity(intent);
                }
            }
            C32783c.f85371d.mo66363a(this.f85383a, this.f85386d, 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.c$i */
    public static final class C32792i<T> implements C1710e<BaseResponse> {

        /* renamed from: a */
        public static final C32792i f85387a = new C32792i();

        C32792i() {
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((BaseResponse) obj).status_code == 0) {
                Keva.getRepo("friendslist_permission_keva_name").storeLong("authorize_info_upload_next_time_key", System.currentTimeMillis() + (C10193n.m20607a().mo18201a(AuthorizeInfoUploadIntervalSettings.class, "authorize_info_upload_interval", C10181b.m20511a().mo18175c().getAuthorizeInfoUploadInterval(), 86400) * 1000));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.c$j */
    public static final class C32793j<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C32793j f85388a = new C32793j();

        C32793j() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C17840a.m43754b(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.c$k */
    static final class C32794k<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C32794k f85389a = new C32794k();

        C32794k() {
        }

        public final /* synthetic */ Object call() {
            List a = C47673an.m103183a(C11010c.m22280a());
            C52711k.m112236a((Object) a, "ContactsUtils.getContact….getApplicationContext())");
            if (!C9376b.m18558a((Collection<T>) a)) {
                UploadContactsApi.m75335a(a, 1);
                Keva.getRepo("friendslist_permission_keva_name").storeLong("contact_upload_next_time_key", System.currentTimeMillis() + (C10193n.m20607a().mo18201a(AddressbookUploadIntervalSettings.class, "addressbook_upload_interval", C10181b.m20511a().mo18175c().getAddressbookUploadInterval(), 86400) * 1000));
            }
            return C52860x.f131107a;
        }
    }

    private C32783c() {
    }

    /* renamed from: a */
    public static final boolean m75667a() {
        try {
            if (C0726c.m2090a(C11010c.m22280a(), "android.permission.READ_CONTACTS") != -1) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m75669c() {
        if (m75667a() || Keva.getRepo("friendslist_permission_keva_name").getLong("contact_next_time_key", 0) >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final void m75668b() {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin() && C32795d.m75676a(C11010c.m22280a()) && m75667a()) {
            C0013i.m16a((Callable<TResult>) C32794k.f85389a);
        }
    }

    /* renamed from: d */
    private static boolean m75670d() {
        if (!TextUtils.isEmpty(C50310a.m108577b()) || Keva.getRepo("friendslist_permission_keva_name").getLong("facebook_next_time_key", 0) >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m75663a(int i) {
        if (i == 0) {
            if (ContactPermissionExperiment.m75656a() != null) {
                C32796e a = ContactPermissionExperiment.m75656a();
                if (a == null) {
                    C52711k.m112234a();
                }
                long j = a.f85390a * 1000;
                Keva.getRepo("friendslist_permission_keva_name").storeLong("contact_next_time_key", System.currentTimeMillis() + j);
                if (f85372e == 2) {
                    Keva.getRepo("friendslist_permission_keva_name").storeLong("facebook_next_time_key", System.currentTimeMillis() + j);
                }
                int i2 = Keva.getRepo("friendslist_permission_keva_name").getInt("contact_freq_time_key", 0);
                C32796e a2 = ContactPermissionExperiment.m75656a();
                if (a2 == null) {
                    C52711k.m112234a();
                }
                if (i2 < a2.f85397h) {
                    Keva.getRepo("friendslist_permission_keva_name").storeInt("contact_freq_time_key", i2 + 1);
                }
            }
        } else if (FacebookPermissionExperiment.m75657a() != null) {
            C32796e a3 = FacebookPermissionExperiment.m75657a();
            if (a3 == null) {
                C52711k.m112234a();
            }
            long j2 = a3.f85390a * 1000;
            Keva.getRepo("friendslist_permission_keva_name").storeLong("facebook_next_time_key", System.currentTimeMillis() + j2);
            if (f85372e == 2) {
                Keva.getRepo("friendslist_permission_keva_name").storeLong("contact_next_time_key", System.currentTimeMillis() + j2);
            }
            int i3 = Keva.getRepo("friendslist_permission_keva_name").getInt("facebook_freq_time_key", 0);
            C32796e a4 = FacebookPermissionExperiment.m75657a();
            if (a4 == null) {
                C52711k.m112234a();
            }
            if (i3 < a4.f85397h) {
                Keva.getRepo("friendslist_permission_keva_name").storeInt("facebook_freq_time_key", i3 + 1);
            }
        }
        if (f85368a) {
            f85368a = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d7, code lost:
        r2 = r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m75662a(java.lang.String r7) {
        /*
            java.lang.String r0 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.isLogin()
            r1 = 0
            if (r0 == 0) goto L_0x012e
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r0 != 0) goto L_0x012e
            boolean r0 = f85369b
            if (r0 != 0) goto L_0x0021
            goto L_0x012e
        L_0x0021:
            boolean r0 = m75669c()
            if (r0 == 0) goto L_0x007d
            com.ss.android.ugc.aweme.friends.utils.e r0 = com.p683ss.android.ugc.aweme.friends.utils.ContactPermissionExperiment.m75656a()
            if (r0 == 0) goto L_0x007c
            java.lang.String r2 = "friendslist_permission_keva_name"
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r2)
            java.lang.String r3 = "contact_freq_time_key"
            int r2 = r2.getInt(r3, r1)
            int r3 = r0.f85397h
            if (r2 >= r3) goto L_0x007c
            int r2 = r7.hashCode()
            switch(r2) {
                case -1572049565: goto L_0x0071;
                case -1271119582: goto L_0x0066;
                case -562830579: goto L_0x005b;
                case 809483594: goto L_0x0050;
                case 1691937916: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x007c
        L_0x0045:
            java.lang.String r2 = "homepage_hot"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x007c
            boolean r0 = r0.f85391b
            goto L_0x007d
        L_0x0050:
            java.lang.String r2 = "others_homepage"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x007c
            boolean r0 = r0.f85396g
            goto L_0x007d
        L_0x005b:
            java.lang.String r2 = "personal_homepage"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x007c
            boolean r0 = r0.f85393d
            goto L_0x007d
        L_0x0066:
            java.lang.String r2 = "homepage_follow"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x007c
            boolean r0 = r0.f85395f
            goto L_0x007d
        L_0x0071:
            java.lang.String r2 = "notification_page"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x007c
            boolean r0 = r0.f85394e
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            boolean r2 = m75670d()
            if (r2 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.friends.utils.e r2 = com.p683ss.android.ugc.aweme.friends.utils.FacebookPermissionExperiment.m75657a()
            if (r2 == 0) goto L_0x00d9
            java.lang.String r3 = "friendslist_permission_keva_name"
            com.bytedance.keva.Keva r3 = com.bytedance.keva.Keva.getRepo(r3)
            java.lang.String r4 = "facebook_freq_time_key"
            int r3 = r3.getInt(r4, r1)
            int r4 = r2.f85397h
            if (r3 >= r4) goto L_0x00d9
            int r3 = r7.hashCode()
            switch(r3) {
                case -1572049565: goto L_0x00cd;
                case -1271119582: goto L_0x00c2;
                case -562830579: goto L_0x00b7;
                case 809483594: goto L_0x00ac;
                case 1691937916: goto L_0x00a1;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            goto L_0x00d9
        L_0x00a1:
            java.lang.String r3 = "homepage_hot"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x00d9
            boolean r7 = r2.f85391b
            goto L_0x00d7
        L_0x00ac:
            java.lang.String r3 = "others_homepage"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x00d9
            boolean r7 = r2.f85396g
            goto L_0x00d7
        L_0x00b7:
            java.lang.String r3 = "personal_homepage"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x00d9
            boolean r7 = r2.f85393d
            goto L_0x00d7
        L_0x00c2:
            java.lang.String r3 = "homepage_follow"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x00d9
            boolean r7 = r2.f85395f
            goto L_0x00d7
        L_0x00cd:
            java.lang.String r3 = "notification_page"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x00d9
            boolean r7 = r2.f85394e
        L_0x00d7:
            r2 = r7
            goto L_0x00da
        L_0x00d9:
            r2 = 0
        L_0x00da:
            r7 = 1
            if (r0 == 0) goto L_0x00e2
            if (r2 != 0) goto L_0x00e2
            f85372e = r7
            return r7
        L_0x00e2:
            r3 = 2
            if (r0 != 0) goto L_0x00ea
            if (r2 == 0) goto L_0x00ea
            f85372e = r7
            return r3
        L_0x00ea:
            if (r0 == 0) goto L_0x012b
            if (r2 == 0) goto L_0x012b
            f85372e = r3
            java.lang.String r0 = "friendslist_permission_keva_name"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r2 = "popup_next_show_key"
            int r0 = r0.getInt(r2, r1)
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = "friendslist_permission_keva_name"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r1 = "contact_next_time_key"
            r4 = 0
            long r0 = r0.getLong(r1, r4)
            java.lang.String r2 = "friendslist_permission_keva_name"
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r2)
            java.lang.String r6 = "facebook_next_time_key"
            long r4 = r2.getLong(r6, r4)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x011d
            return r7
        L_0x011d:
            return r3
        L_0x011e:
            java.lang.String r7 = "friendslist_permission_keva_name"
            com.bytedance.keva.Keva r7 = com.bytedance.keva.Keva.getRepo(r7)
            java.lang.String r0 = "popup_next_show_key"
            int r7 = r7.getInt(r0, r1)
            return r7
        L_0x012b:
            f85372e = r1
            return r1
        L_0x012e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.utils.C32783c.m75662a(java.lang.String):int");
    }

    /* renamed from: a */
    public static void m75666a(String str, boolean z) {
        if (TextUtils.equals(str, "personal_homepage")) {
            C40733z.f103767a.updateProfilePermission(false);
        }
    }

    /* renamed from: a */
    public static final void m75665a(String str, int i) {
        C32781a aVar;
        C52711k.m112240b(str, C42311c.f106865i);
        if (i == 1 && f85372e == 1) {
            f85372e = 0;
            Keva.getRepo("friendslist_permission_keva_name").storeInt("popup_next_show_key", 0);
        } else if (f85372e == 2) {
            if (i == 1) {
                f85372e = 1;
            }
            if (TextUtils.equals(str, "facebook_friend_list")) {
                Keva.getRepo("friendslist_permission_keva_name").storeInt("popup_next_show_key", 2);
            } else {
                Keva.getRepo("friendslist_permission_keva_name").storeInt("popup_next_show_key", 1);
            }
        }
        if (TextUtils.equals(str, "contact_list") || i == 0) {
            aVar = new C32781a(str, i, null, 4, null);
        } else {
            JSONObject jSONObject = new JSONObject();
            Long c = C50310a.m108581c();
            C52711k.m112236a((Object) c, "FriendSharePref.getFacebookAccessTokenExpDate()");
            jSONObject.put("expired_time", c.longValue());
            aVar = new C32781a(str, i, jSONObject.toString());
        }
        C32780a.m75658a().uploadAuthInfo(C47760cd.m103385a(C52575l.m112092a(aVar))).mo6152a((C1710e<? super T>) C32787d.f85376a, (C1710e<? super Throwable>) C32788e.f85377a);
    }

    /* renamed from: a */
    public final void mo66363a(int i, String str, int i2) {
        String str2;
        if (i == 0) {
            C26890h.m65011a("authorize_contact_response", C23089d.m56640a().mo47829a("enter_from", str).mo47826a("is_allow", i2).mo47829a("pop_up_type", "guide").f61491a);
        } else {
            C26890h.m65011a("authorize_facebook_response", C23089d.m56640a().mo47829a("enter_from", str).mo47826a("is_allow", i2).f61491a);
        }
        if (i2 == 0) {
            if (i == 0) {
                str2 = "facebook_friend_list";
            } else {
                str2 = "contact_list";
            }
            m75665a(str2, i2);
            m75666a(str, false);
        }
    }

    /* renamed from: a */
    public static void m75664a(Activity activity, int i, String str, C47943a aVar) {
        int i2;
        int i3;
        int i4;
        Context context = activity;
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setScaleType(ScaleType.CENTER_CROP);
        int i5 = R.drawable.cy9;
        if (i == 0) {
            i2 = R.drawable.cy8;
        } else {
            i2 = R.drawable.cy9;
        }
        smartImageView.setImageResource(i2);
        C10643a a = new C10643a(context).mo18885a((int) R.string.h34);
        if (i == 0) {
            i3 = R.string.h32;
        } else {
            i3 = R.string.h33;
        }
        C10643a d = a.mo18899b(i3).mo18910d(C0726c.m2098c(context, R.color.au9));
        if (i == 0) {
            i5 = R.drawable.cy8;
        }
        C10643a b = d.mo18907c(i5).mo18900b((int) R.string.h2z, (OnClickListener) new C32790g(i, activity, str));
        if (i == 0) {
            i4 = R.string.h30;
        } else {
            i4 = R.string.h31;
        }
        b.mo18886a(i4, (OnClickListener) new C32791h(i, activity, aVar, str)).mo18905b(true).mo18897a().mo18883c().setOnCancelListener(new C32789f(i, str));
        m75663a(i);
        if (i == 0) {
            C26890h.m65011a("show_authorize_contact_pop_up", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("pop_up_type", "guide").f61491a);
        } else {
            C26890h.m65011a("show_authorize_facebook_pop_up", C23089d.m56640a().mo47829a("enter_from", str).f61491a);
        }
    }
}
