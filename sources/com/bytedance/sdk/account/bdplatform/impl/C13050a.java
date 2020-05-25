package com.bytedance.sdk.account.bdplatform.impl;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.bytedance.sdk.account.bdplatform.impl.p857a.C13063b;
import com.bytedance.sdk.account.bdplatform.p854a.C13035a.C13036a;
import com.bytedance.sdk.account.bdplatform.p854a.C13035a.C13037b;
import com.bytedance.sdk.account.bdplatform.p854a.C13035a.C13038c;
import com.bytedance.sdk.account.bdplatform.p854a.C13039b;
import com.bytedance.sdk.account.bdplatform.p855b.C13042a;
import com.bytedance.sdk.account.bdplatform.p855b.C13043b;
import com.bytedance.sdk.account.bdplatform.p855b.C13048e;
import com.bytedance.sdk.account.p849b.p852c.C13029c.C13030a;
import com.bytedance.sdk.account.p849b.p852c.C13029c.C13031b;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.a */
public final class C13050a implements C13037b {

    /* renamed from: a */
    public final C13038c f34097a;

    /* renamed from: b */
    final C13039b f34098b;

    /* renamed from: c */
    final C13036a f34099c;

    /* renamed from: d */
    final Handler f34100d;

    /* renamed from: e */
    C13048e f34101e;

    /* renamed from: f */
    volatile boolean f34102f;

    /* renamed from: g */
    private final Context f34103g;

    /* renamed from: a */
    public final void mo24684a() {
        this.f34102f = false;
        this.f34100d.post(new Runnable() {
            public final void run() {
                if (C13050a.this.f34097a != null) {
                    C13050a.this.f34097a.showLoadingDialog(C13050a.this.f34097a.getInitLoadingText());
                    C13050a.this.f34097a.updateLoginStatus();
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C13031b mo24712b() {
        C13031b bVar = new C13031b();
        bVar.errorCode = -1;
        bVar.errorMsg = this.f34103g.getString(R.string.qp);
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24710a(final C13031b bVar) {
        if (!this.f34102f) {
            this.f34100d.post(new Runnable() {
                public final void run() {
                    if (C13050a.this.f34097a != null) {
                        C13050a.this.f34097a.dismissLoadingDialog();
                        C13050a.this.f34097a.onError(bVar);
                        C13050a.this.f34097a.onLogEvent("platform_auth_result", "fail", bVar.errorCode, bVar.errorMsg);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final boolean mo24687b(final C13030a aVar) {
        this.f34102f = false;
        if (!this.f34098b.mo24702a()) {
            if (this.f34097a != null) {
                this.f34097a.onNeedLogin();
            }
            return false;
        } else if (!this.f34098b.mo24703b()) {
            Toast makeText = Toast.makeText(this.f34103g, this.f34103g.getString(R.string.qu), 0);
            makeText.setGravity(17, 0, 0);
            if (VERSION.SDK_INT == 25) {
                C47905fy.m103630a(makeText);
            }
            makeText.show();
            return false;
        } else {
            this.f34100d.post(new Runnable() {
                public final void run() {
                    if (C13050a.this.f34097a != null) {
                        C13050a.this.f34097a.showLoadingDialog(C13050a.this.f34097a.getAuthLoadingText());
                    }
                }
            });
            this.f34098b.mo24701a((Runnable) new Runnable() {
                public final void run() {
                    C13050a.this.mo24713c(aVar);
                }
            });
            return true;
        }
    }

    /* renamed from: c */
    public final void mo24713c(C13030a aVar) {
        if (!this.f34102f) {
            C13048e eVar = this.f34101e;
            if (eVar == null || !eVar.f34091e) {
                mo24711a(eVar, 2);
                return;
            }
            if (this.f34097a != null) {
                this.f34097a.onLogEvent("platform_auth_ticket", "success", 0, "");
            }
            C13042a a = this.f34099c.mo24681a(aVar, eVar.f34095a);
            if (a == null || !a.f34091e) {
                C13031b b = mo24712b();
                if (a != null) {
                    b.errorCode = a.f34092f;
                    b.errorMsg = a.f34093g;
                }
                m26226a(b, 3);
                if (this.f34097a != null) {
                    this.f34097a.onLogEvent("platform_auth_code", "fail", b.errorCode, b.errorMsg);
                }
                mo24710a(b);
                return;
            }
            final C13031b bVar = new C13031b();
            bVar.f34052a = a.f34056a;
            if (aVar != null) {
                bVar.f34054c = aVar.f34049f;
                bVar.f34053b = aVar.f34044a;
            }
            if (this.f34097a != null) {
                this.f34097a.onLogEvent("platform_auth_code", "success", 0, "");
            }
            if (!this.f34102f) {
                this.f34100d.post(new Runnable() {
                    public final void run() {
                        if (C13050a.this.f34097a != null) {
                            C13050a.this.f34097a.dismissLoadingDialog();
                            C13050a.this.f34097a.onSuccess(bVar);
                            C13050a.this.f34097a.onLogEvent("platform_auth_result", "success", 0, "");
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final boolean mo24686a(final C13030a aVar) {
        this.f34102f = false;
        if (!this.f34098b.mo24702a()) {
            if (this.f34097a != null) {
                this.f34097a.onNeedLogin();
            }
            return false;
        } else if (!this.f34098b.mo24703b()) {
            C13031b bVar = new C13031b();
            bVar.errorCode = -12;
            bVar.errorMsg = this.f34103g.getString(R.string.qu);
            m26226a(bVar, 2);
            mo24710a(bVar);
            return false;
        } else {
            this.f34100d.post(new Runnable() {
                public final void run() {
                    if (C13050a.this.f34097a != null) {
                        C13050a.this.f34097a.showLoadingDialog(C13050a.this.f34097a.getInitLoadingText());
                    }
                }
            });
            this.f34098b.mo24701a((Runnable) new Runnable() {
                public final void run() {
                    C13050a aVar = C13050a.this;
                    C13030a aVar2 = aVar;
                    if (!aVar.f34102f) {
                        C13048e b = aVar.f34099c.mo24683b(aVar2);
                        if (b == null || !b.f34091e) {
                            aVar.mo24711a(b, 2);
                            return;
                        }
                        aVar.f34101e = b;
                        if (aVar.f34097a != null) {
                            aVar.f34097a.onLogEvent("platform_auth_ticket", "success", 0, "");
                        }
                        if (b.f34096b) {
                            if (!aVar.f34102f) {
                                aVar.f34098b.mo24701a((Runnable) new Runnable(aVar2) {

                                    /* renamed from: a */
                                    final /* synthetic */ C13030a f34120a;

                                    public final void run() {
                                        C13050a.this.mo24713c(this.f34120a);
                                    }

                                    {
                                        this.f34120a = r2;
                                    }
                                });
                            }
                        } else if (!aVar.f34102f) {
                            aVar.f34098b.mo24701a((Runnable) new Runnable(aVar2) {

                                /* renamed from: a */
                                final /* synthetic */ C13030a f34105a;

                                public final void run() {
                                    C13050a aVar = C13050a.this;
                                    C13030a aVar2 = this.f34105a;
                                    if (!aVar.f34102f) {
                                        C13043b a = aVar.f34099c.mo24682a(aVar2);
                                        if (a == null || !a.f34091e) {
                                            C13031b b = aVar.mo24712b();
                                            if (a != null) {
                                                b.errorCode = a.f34092f;
                                                b.errorMsg = a.f34093g;
                                            }
                                            C13050a.m26226a(b, 1);
                                            if (aVar.f34097a != null) {
                                                aVar.f34097a.onLogEvent("platform_auth_info", "fail", b.errorCode, b.errorMsg);
                                            }
                                            aVar.mo24710a(b);
                                            return;
                                        }
                                        if (aVar.f34097a != null) {
                                            aVar.f34097a.onLogEvent("platform_auth_info", "success", 0, "");
                                        }
                                        if (!aVar.f34102f) {
                                            aVar.f34100d.post(new Runnable(a) {

                                                /* renamed from: a */
                                                final /* synthetic */ C13043b f34107a;

                                                public final void run() {
                                                    if (C13050a.this.f34097a != null) {
                                                        C13050a.this.f34097a.dismissLoadingDialog();
                                                        C13050a.this.f34097a.onAuthLogin(this.f34107a);
                                                    }
                                                }

                                                {
                                                    this.f34107a = r2;
                                                }
                                            });
                                        }
                                    }
                                }

                                {
                                    this.f34105a = r2;
                                }
                            });
                        }
                    }
                }
            });
            return true;
        }
    }

    /* renamed from: a */
    static void m26226a(C13031b bVar, int i) {
        if (bVar != null) {
            if (bVar.extras == null) {
                bVar.extras = new Bundle();
            }
            bVar.extras.putInt("response_type", i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24711a(C13048e eVar, int i) {
        C13031b b = mo24712b();
        if (eVar != null) {
            b.errorCode = eVar.f34092f;
            b.errorMsg = eVar.f34093g;
        }
        m26226a(b, 2);
        if (this.f34097a != null) {
            this.f34097a.onLogEvent("platform_auth_ticket", "fail", b.errorCode, b.errorMsg);
        }
        mo24710a(b);
    }

    /* renamed from: a */
    public final boolean mo24685a(int i, String str) {
        if (this.f34102f) {
            return false;
        }
        this.f34102f = true;
        this.f34100d.post(new Runnable() {
            public final void run() {
                if (C13050a.this.f34097a != null) {
                    C13050a.this.f34097a.dismissLoadingDialog();
                }
            }
        });
        C13031b bVar = new C13031b();
        bVar.errorCode = -2;
        bVar.errorMsg = this.f34103g.getString(R.string.qo);
        if (this.f34097a != null) {
            this.f34097a.onCancel(bVar);
            this.f34097a.onLogEvent("platform_auth_result", "cancel", i, str);
        }
        return true;
    }

    public C13050a(C13038c cVar, C13039b bVar, Context context) {
        this(cVar, null, bVar, context);
    }

    private C13050a(C13038c cVar, C13036a aVar, C13039b bVar, Context context) {
        this.f34097a = cVar;
        this.f34098b = bVar;
        this.f34103g = context;
        this.f34099c = new C13063b(context, bVar);
        this.f34100d = new Handler(Looper.getMainLooper());
    }
}
