package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4571ak;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.verify.ZhimaVerifyApi;
import com.bytedance.android.livesdk.verify.model.C8388a;
import com.bytedance.android.livesdk.verify.model.QueryZhimaStatusResponse;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.ss.android.ugc.trill.R;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p071d.C1710e;

public class VerifyZhimaCreditMethod extends C10779d<JSONObject, Object> implements C0183j {
    private static final String TAG = "VerifyZhimaCreditMethod";
    public Activity activity;
    public boolean backFromAliPay;
    private ProgressDialog mProgressDialog;
    public String mZhimaToken;

    public void hideProgressDlg() {
        if (this.mProgressDialog != null && this.mProgressDialog.isShowing()) {
            this.mProgressDialog.dismiss();
        }
    }

    public void onTerminate() {
        if (this.activity instanceof AppCompatActivity) {
            ((AppCompatActivity) this.activity).getLifecycle().mo325b(this);
        }
    }

    public void jump2AliVerify() {
        AppCompatActivity appCompatActivity;
        showProgressDlg(this.activity);
        C2201v a = ((ZhimaVerifyApi) C4514j.m10883j().mo10321b().mo9550a(ZhimaVerifyApi.class)).zhimaVerify("snssdk1112://", "0").mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
        if (this.activity instanceof AppCompatActivity) {
            appCompatActivity = (AppCompatActivity) this.activity;
        } else {
            appCompatActivity = null;
        }
        ((C4002ac) a.mo6525a((C2203w<T, ? extends R>) C4021e.m10138a((FragmentActivity) appCompatActivity))).mo9406a(new C1710e<C4177d<C8388a>>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C4177d dVar = (C4177d) obj;
                VerifyZhimaCreditMethod.this.hideProgressDlg();
                Intent intent = new Intent("android.intent.action.VIEW");
                StringBuilder sb = new StringBuilder("alipays://platformapi/startapp?appId=20000067&url=");
                sb.append(URLEncoder.encode(((C8388a) dVar.data).f22821e));
                intent.setData(Uri.parse(sb.toString()));
                VerifyZhimaCreditMethod.this.mZhimaToken = ((C8388a) dVar.data).f22822f;
                VerifyZhimaCreditMethod.this.backFromAliPay = true;
                VerifyZhimaCreditMethod.this.activity.startActivity(intent);
            }
        }, new C1710e<Throwable>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                Throwable th = (Throwable) obj;
                VerifyZhimaCreditMethod.this.hideProgressDlg();
                C4602l.m11046a(VerifyZhimaCreditMethod.this.activity, th);
            }
        });
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        AppCompatActivity appCompatActivity;
        if (this.backFromAliPay) {
            C2201v a = ((ZhimaVerifyApi) C4514j.m10883j().mo10321b().mo9550a(ZhimaVerifyApi.class)).queryZhimaVerifyStatus(this.mZhimaToken).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
            if (this.activity instanceof AppCompatActivity) {
                appCompatActivity = (AppCompatActivity) this.activity;
            } else {
                appCompatActivity = null;
            }
            ((C4002ac) a.mo6525a((C2203w<T, ? extends R>) C4021e.m10138a((FragmentActivity) appCompatActivity))).mo9406a(new C1710e<C4177d<QueryZhimaStatusResponse>>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    final C4177d dVar = (C4177d) obj;
                    VerifyZhimaCreditMethod.this.backFromAliPay = false;
                    if (((QueryZhimaStatusResponse) dVar.data).getPassed()) {
                        C4575an.m10981a((int) R.string.f39);
                        C8049c.m15979a().mo14203a("credit_auth_success", new Object[0]);
                        HashMap hashMap = new HashMap();
                        hashMap.put("eventName", "credit_auth_success");
                        C8064d.m16005b().mo9199b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                        return;
                    }
                    if (!TextUtils.isEmpty(((QueryZhimaStatusResponse) dVar.data).getFailedReason())) {
                        new C4221a(VerifyZhimaCreditMethod.this.activity).mo9684a((int) R.string.e9g).mo9695b((CharSequence) ((QueryZhimaStatusResponse) dVar.data).getFailedReason()).mo9691a(true).mo9694b(R.string.e45, new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("status", String.valueOf(((QueryZhimaStatusResponse) dVar.data).getStatusCode()));
                                hashMap.put("prompt", ((QueryZhimaStatusResponse) dVar.data).getFailedReason());
                                hashMap.put("action_type", "cancel");
                                C8049c.m15979a().mo14202a("credit_auth_fail", hashMap, new Object[0]);
                                hashMap.put("eventName", "credit_auth_fail");
                                C8064d.m16005b().mo9199b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                                dialogInterface.dismiss();
                            }
                        }).mo9685a((int) R.string.f0g, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("status", String.valueOf(((QueryZhimaStatusResponse) dVar.data).getStatusCode()));
                                hashMap.put("prompt", ((QueryZhimaStatusResponse) dVar.data).getFailedReason());
                                hashMap.put("action_type", "retry");
                                C8049c.m15979a().mo14202a("credit_auth_fail", hashMap, new Object[0]);
                                hashMap.put("eventName", "credit_auth_fail");
                                C8064d.m16005b().mo9199b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                                VerifyZhimaCreditMethod.this.jump2AliVerify();
                                dialogInterface.dismiss();
                            }
                        }).mo9692a().show();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("status", String.valueOf(((QueryZhimaStatusResponse) dVar.data).getStatusCode()));
                        hashMap2.put("prompt", ((QueryZhimaStatusResponse) dVar.data).getFailedReason());
                        C8049c.m15979a().mo14202a("credit_auth_fail", hashMap2, new Object[0]);
                        hashMap2.put("eventName", "credit_auth_fail");
                        C8064d.m16005b().mo9199b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap2);
                    }
                }
            }, new C1710e<Throwable>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    Throwable th = (Throwable) obj;
                    VerifyZhimaCreditMethod.this.backFromAliPay = false;
                    if (th instanceof C2949a) {
                        C2949a aVar = (C2949a) th;
                        if (aVar.getErrorCode() == 20207) {
                            String a = C3922z.m9903a((int) R.string.ews);
                            if (!TextUtils.isEmpty(aVar.getAlert())) {
                                a = aVar.getAlert();
                            } else if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                                a = aVar.getErrorMsg();
                            }
                            if (VerifyZhimaCreditMethod.this.activity != null) {
                                new C4221a(VerifyZhimaCreditMethod.this.activity).mo9684a((int) R.string.e9g).mo9695b((CharSequence) a).mo9691a(true).mo9694b(R.string.e45, new OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("action_type", "cancel");
                                        C8049c.m15979a().mo14202a("artificial_auth_popup", hashMap, new Object[0]);
                                        hashMap.put("eventName", "artificial_auth_popup");
                                        C8064d.m16005b().mo9199b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                                        dialogInterface.dismiss();
                                    }
                                }).mo9685a((int) R.string.ecn, (OnClickListener) new OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        TTLiveSDKContext.getHostService().mo10318k();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("action_type", "confirm");
                                        C8049c.m15979a().mo14202a("artificial_auth_popup", hashMap, new Object[0]);
                                        hashMap.put("eventName", "artificial_auth_popup");
                                        C8064d.m16005b().mo9199b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                                        dialogInterface.dismiss();
                                    }
                                }).mo9692a().show();
                                HashMap hashMap = new HashMap();
                                hashMap.put("status", "0");
                                String str = "prompt";
                                if (a == null) {
                                    a = "";
                                }
                                hashMap.put(str, a);
                                C8049c.m15979a().mo14202a("credit_auth_fail", hashMap, new Object[0]);
                                hashMap.put("eventName", "credit_auth_fail");
                                C8064d.m16005b().mo9199b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                            }
                        }
                    }
                }
            });
            this.mZhimaToken = "";
        }
    }

    private static boolean hasAlipayInstalled(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("alipays://"));
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }

    public void showProgressDlg(Activity activity2) {
        if (activity2 != null && !activity2.isFinishing()) {
            this.mProgressDialog = C4571ak.m10972a(activity2, "");
            if (this.mProgressDialog != null) {
                this.mProgressDialog.setCancelable(false);
                this.mProgressDialog.setCanceledOnTouchOutside(false);
            }
        }
    }

    public void invoke(JSONObject jSONObject, C10783f fVar) throws Exception {
        this.activity = C3889d.m9831a(fVar.f28972a);
        if (this.activity != null) {
            if (!hasAlipayInstalled(this.activity)) {
                new C4221a(this.activity).mo9684a((int) R.string.e9g).mo9693b((int) R.string.f47).mo9685a((int) R.string.ese, (OnClickListener) null).mo9692a().show();
                C8049c.m15979a().mo14203a("alipay_install_notification", new Object[0]);
                return;
            }
            jump2AliVerify();
        }
    }
}
