package com.p683ss.android.ugc.aweme;

import com.bytedance.sdk.account.p859d.C13089g;
import com.bytedance.sdk.account.p868i.p869a.C13176a;
import com.bytedance.sdk.account.p868i.p870b.C13179a;
import com.p683ss.android.account.C18495c;
import com.p683ss.android.ugc.aweme.IAccountService.C20834a;
import com.p683ss.android.ugc.aweme.IAccountService.C20836c;
import com.p683ss.android.ugc.aweme.account.AgeGateService;
import com.p683ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p683ss.android.ugc.aweme.account.network.p1301a.C22078a;
import com.p683ss.android.ugc.aweme.services.BindService;
import com.p683ss.android.ugc.aweme.services.DataService;
import com.p683ss.android.ugc.aweme.services.InterceptorService;
import com.p683ss.android.ugc.aweme.services.LoginService;
import com.p683ss.android.ugc.aweme.services.PasswordService;
import com.p683ss.android.ugc.aweme.services.ProAccountService;
import com.p683ss.android.ugc.aweme.services.RnAndH5Service;
import com.p683ss.android.ugc.aweme.services.VcdService;
import com.p683ss.android.ugc.aweme.services.VerificationService;

/* renamed from: com.ss.android.ugc.aweme.q */
public abstract class C27980q implements IAccountService {
    private AccountUserService mAccountUserService;
    private AgeGateService mAgeGateService;
    private BindService mBindService;
    private DataService mDataService;
    private volatile boolean mHasInitialized;
    private InterceptorService mInterceptorService;
    private LoginService mLoginService;
    private PasswordService mPasswordService;
    private ProAccountService mProAccountService;
    private RnAndH5Service mRnAndH5Service;
    private C23771be mVcdService;
    private VerificationService mVerificationService;
    C23762bb userNameService;

    private void tryInit() {
        if (!this.mHasInitialized) {
            this.mHasInitialized = true;
            init();
        }
    }

    public IAgeGateService ageGateService() {
        tryInit();
        if (this.mAgeGateService == null) {
            this.mAgeGateService = new AgeGateService();
        }
        return this.mAgeGateService;
    }

    public C22551ak bindService() {
        tryInit();
        if (this.mBindService == null) {
            this.mBindService = new BindService();
        }
        return this.mBindService;
    }

    public C23189aq dataService() {
        tryInit();
        if (this.mDataService == null) {
            this.mDataService = new DataService();
        }
        return this.mDataService;
    }

    /* access modifiers changed from: protected */
    public void init() {
        C23826bi.f63474b = this;
        C22078a aVar = new C22078a();
        C18495c.f50958a = aVar;
        C13176a a = C13089g.m26338a(aVar.mo38462b());
        Class<C13176a> cls = C13176a.class;
        if (a != null) {
            C13179a.f34406a.put(cls, a);
        }
        C18495c.f50959b = C27981r.f73407a;
    }

    public C23285as interceptorService() {
        tryInit();
        if (this.mInterceptorService == null) {
            this.mInterceptorService = new InterceptorService();
        }
        return this.mInterceptorService;
    }

    public C23291au loginService() {
        tryInit();
        if (this.mLoginService == null) {
            this.mLoginService = new LoginService();
        }
        return this.mLoginService;
    }

    public C23299aw passwordService() {
        tryInit();
        if (this.mPasswordService == null) {
            this.mPasswordService = new PasswordService();
        }
        return this.mPasswordService;
    }

    public C23330az proAccountService() {
        tryInit();
        if (this.mProAccountService == null) {
            this.mProAccountService = new ProAccountService();
        }
        return this.mProAccountService;
    }

    public C23359ba rnAndH5Service() {
        tryInit();
        if (this.mRnAndH5Service == null) {
            this.mRnAndH5Service = new RnAndH5Service();
        }
        return this.mRnAndH5Service;
    }

    public IAccountUserService userService() {
        tryInit();
        if (this.mAccountUserService == null) {
            this.mAccountUserService = new AccountUserService();
            this.mAccountUserService.setNetworkProxyInstance(NetworkProxyAccount.f59579c);
        }
        return this.mAccountUserService;
    }

    public C23771be vcdService() {
        tryInit();
        if (this.mVcdService == null) {
            this.mVcdService = new VcdService();
        }
        return this.mVcdService;
    }

    public C23786bf verificationService() {
        tryInit();
        if (this.mVerificationService == null) {
            this.mVerificationService = new VerificationService();
        }
        return this.mVerificationService;
    }

    public void addLoginOrLogoutListener(C20834a aVar) {
        C23826bi.m58456a(aVar);
    }

    public void login(C20836c cVar) {
        tryInit();
        loginService().showLoginAndRegisterView(cVar);
    }

    public void removeLoginOrLogoutListener(C20834a aVar) {
        synchronized (C23826bi.class) {
            C23826bi.f63473a.remove(aVar);
        }
    }

    public void notifyProgress(int i, int i2, String str) {
        if (this.mLoginService != null) {
            this.mLoginService.notifyProgress(i, i2, str);
        }
    }

    public void returnResult(int i, int i2, Object obj) {
        if (i == 1) {
            if (this.mLoginService != null) {
                this.mLoginService.returnResult(i, i2, obj);
            }
        } else if (i == 15) {
            if (this.userNameService != null) {
                this.userNameService.returnResult(i, i2, obj);
                this.userNameService = null;
            }
        } else if (i != 16) {
            if (this.mBindService != null) {
                this.mBindService.returnResult(i, i2, obj);
            }
            if (this.mPasswordService != null) {
                this.mPasswordService.returnResult(i, i2, obj);
            }
            if (this.mProAccountService != null) {
                this.mProAccountService.returnResult(i, i2, obj);
            }
        } else if (this.mVerificationService != null) {
            this.mVerificationService.returnResult(i, i2, obj);
        }
    }
}
