package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.IAccountService */
public interface IAccountService {
    public static final int ACCOUNT_LOGIN = 1;
    public static final int ACCOUNT_LOGIN_END = 4;
    public static final int ACCOUNT_LOGOUT = 3;
    public static final int ACCOUNT_SWITCH = 2;
    public static final int ACTION_BIND_MOBILE = 7;
    public static final int ACTION_CANCEL = 2;
    public static final int ACTION_CHANGE_MOBILE = 9;
    public static final int ACTION_CHANGE_PWD = 8;
    public static final int ACTION_DONE = 3;
    public static final int ACTION_FAILED = 3;
    public static final int ACTION_LOGIN = 1;
    public static final int ACTION_LOGIN_ENTER = 11;
    public static final int ACTION_LOGIN_PAGE_CLOSE = 5;
    public static final int ACTION_LOGOUT = 6;
    public static final int ACTION_SET_PASSWORD = 13;
    public static final int ACTION_SET_USERNAME = 15;
    public static final int ACTION_SUCCESS = 1;
    public static final int ACTION_SWITCH_PROACCOUNT = 14;
    public static final int ACTION_UPDATE_USER = 12;
    public static final int ACTION_VERIFY = 16;
    public static final int ACTION_VIEW_HIDE = 4;
    public static final int ACTION_VIEW_SHOW = 1;
    public static final int ACTION_WILL_DO = 2;
    public static final int VIEW_PAGE_BIND_MOBILE = 8;
    public static final int VIEW_PAGE_CODE_AND_THIRD_PARTY_LOGIN_DIALOG = 1;
    public static final int VIEW_PAGE_CODE_AND_THIRD_PARTY_LOGIN_FRAGMENT = 2;
    public static final int VIEW_PAGE_LOGIN_ACTIVITY = 7;
    public static final int VIEW_PAGE_ONE_LOGIN = 6;
    public static final int VIEW_PAGE_PASSWORD_LOGIN = 3;
    public static final int VIEW_PAGE_RECOVER_ACCOUNT = 9;
    public static final int VIEW_PAGE_RESET_PASSWORD = 4;
    public static final int VIEW_PAGE_SIGN_UP_ACTIVITY_V2 = 10;
    public static final int VIEW_PAGE_THIRD_PARTY_AUTH = 5;
    public static final int VIEW_PAGE_VIDEO_COMMENT_BIND_MOBILE = 50;

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$a */
    public interface C20834a {
        /* renamed from: a */
        void mo44376a(int i, boolean z, int i2, User user);
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$b */
    public interface C20835b {
        /* renamed from: a */
        C0013i<Bundle> mo44377a(Bundle bundle);

        /* renamed from: b */
        C0013i<Bundle> mo44378b(Bundle bundle);

        /* renamed from: c */
        C0013i<Bundle> mo44379c(Bundle bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$c */
    public static class C20836c {

        /* renamed from: a */
        public Activity f56769a;

        /* renamed from: b */
        public String f56770b;

        /* renamed from: c */
        public String f56771c;

        /* renamed from: d */
        public Bundle f56772d;

        /* renamed from: e */
        public C20840g f56773e;

        /* renamed from: f */
        public C20839f f56774f;

        /* renamed from: g */
        public boolean f56775g;

        private C20836c(C20837d dVar) {
            Bundle bundle;
            this.f56769a = dVar.f56776a;
            this.f56770b = dVar.f56777b;
            this.f56771c = dVar.f56778c;
            if (dVar.f56779d == null) {
                bundle = new Bundle();
            } else {
                bundle = dVar.f56779d;
            }
            this.f56772d = bundle;
            this.f56773e = dVar.f56780e;
            this.f56774f = dVar.f56781f;
            this.f56775g = dVar.f56782g;
            if (!TextUtils.isEmpty(this.f56770b)) {
                this.f56772d.putString("enter_from", this.f56770b);
            }
            if (!TextUtils.isEmpty(this.f56771c)) {
                this.f56772d.putString("enter_method", this.f56771c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$d */
    public static class C20837d {

        /* renamed from: a */
        public Activity f56776a;

        /* renamed from: b */
        public String f56777b;

        /* renamed from: c */
        public String f56778c;

        /* renamed from: d */
        public Bundle f56779d;

        /* renamed from: e */
        public C20840g f56780e;

        /* renamed from: f */
        public C20839f f56781f;

        /* renamed from: g */
        public boolean f56782g;

        /* renamed from: a */
        public final C20836c mo44380a() {
            return new C20836c(this);
        }

        /* renamed from: a */
        public final C20837d mo44381a(Activity activity) {
            this.f56776a = activity;
            return this;
        }

        /* renamed from: b */
        public final C20837d mo44386b(String str) {
            this.f56778c = str;
            return this;
        }

        /* renamed from: a */
        public final C20837d mo44382a(Bundle bundle) {
            this.f56779d = bundle;
            return this;
        }

        /* renamed from: a */
        public final C20837d mo44383a(C20839f fVar) {
            this.f56781f = fVar;
            return this;
        }

        /* renamed from: a */
        public final C20837d mo44384a(C20840g gVar) {
            this.f56780e = gVar;
            return this;
        }

        /* renamed from: a */
        public final C20837d mo44385a(String str) {
            this.f56777b = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$e */
    public interface C20838e {
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$f */
    public interface C20839f {
        /* renamed from: a */
        void mo44387a(int i, int i2, String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$g */
    public interface C20840g {
        void onResult(int i, int i2, Object obj);
    }

    void addLoginOrLogoutListener(C20834a aVar);

    IAgeGateService ageGateService();

    C22551ak bindService();

    C23189aq dataService();

    C23285as interceptorService();

    void login(C20836c cVar);

    C23291au loginService();

    C23299aw passwordService();

    void preLoadOrRequest();

    C23330az proAccountService();

    void removeLoginOrLogoutListener(C20834a aVar);

    C23359ba rnAndH5Service();

    C23762bb userNameService();

    IAccountUserService userService();

    C23771be vcdService();

    C23786bf verificationService();
}
