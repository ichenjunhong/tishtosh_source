package com.p683ss.android.ugc.aweme.services.interceptor;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13117p;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13136m;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.loginlog.C21378a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22006f;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22006f.C22007a;
import com.p683ss.android.ugc.aweme.account.p1277j.C21000d;
import com.p683ss.android.ugc.aweme.main.service.C36688i;
import com.ss.android.ugc.trill.R;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.PicCaptchaInterceptor */
public class PicCaptchaInterceptor implements IInterceptor {
    private static final boolean DEBUG = false;
    public C13011d mAccountApi;
    public CountDownLatch mCounter = new CountDownLatch(1);
    public C0777a<String, String> mNewParams;
    public URL mURL;

    /* renamed from: com.ss.android.ugc.aweme.services.interceptor.PicCaptchaInterceptor$InterceptorCaptchaData */
    public static class InterceptorCaptchaData {
        public String captcha;
        public String errorMsg;
        public String scenario;

        public InterceptorCaptchaData(String str, String str2, String str3) {
            this.captcha = str;
            this.errorMsg = str2;
            this.scenario = str3;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$showCaptchaAndReleaseLockIfNeeded$0$PicCaptchaInterceptor() {
        this.mCounter.countDown();
    }

    public void showCaptchaAndReleaseLockIfNeeded(InterceptorCaptchaData interceptorCaptchaData) {
        C21000d.m53377a(interceptorCaptchaData.captcha, interceptorCaptchaData.scenario, interceptorCaptchaData.errorMsg);
        this.mAccountApi = C13081d.m26312a(C23826bi.m58460b());
        final C22006f fVar = new C22006f(((C36688i) C23826bi.m58450a(C36688i.class)).mo47883b());
        fVar.f59480i = interceptorCaptchaData.scenario;
        fVar.f59479h = interceptorCaptchaData.captcha;
        if (fVar.f59473b != null) {
            LayoutParams layoutParams = fVar.f59473b.getLayoutParams();
            byte[] decode = Base64.decode(fVar.f59479h, 1);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray != null) {
                fVar.f59473b.setImageBitmap(decodeByteArray);
                if (decodeByteArray.getWidth() <= 0 || decodeByteArray.getHeight() <= 0) {
                    layoutParams.height = 0;
                } else {
                    layoutParams.width = fVar.f59472a.getResources().getDimensionPixelSize(R.dimen.wy);
                    layoutParams.height = (layoutParams.width * decodeByteArray.getHeight()) / decodeByteArray.getWidth();
                }
            }
        }
        if (TextUtils.isEmpty(interceptorCaptchaData.errorMsg)) {
            fVar.f59476e.setVisibility(0);
            fVar.f59475d.setVisibility(8);
        } else {
            fVar.f59476e.setVisibility(8);
            fVar.f59475d.setVisibility(0);
            fVar.f59475d.setText(interceptorCaptchaData.errorMsg);
        }
        fVar.f59478g = new PicCaptchaInterceptor$$Lambda$0(this);
        fVar.f59477f = new C22007a() {
            public void onRefreshCaptcha() {
                fVar.dismiss();
                C21000d.m53378b();
                PicCaptchaInterceptor.this.mAccountApi.mo24604a(C22165u.f59781u, (C13136m) new C13136m() {
                    public void onSuccess(C12993e<C13117p> eVar) {
                        String str;
                        if (eVar != null && eVar.f34007h != null && !TextUtils.isEmpty(((C13117p) eVar.f34007h).f34303a)) {
                            C21000d.m53379b(((C13117p) eVar.f34007h).f34303a, String.valueOf(((C13117p) eVar.f34007h).f34285r));
                            PicCaptchaInterceptor picCaptchaInterceptor = PicCaptchaInterceptor.this;
                            String str2 = ((C13117p) eVar.f34007h).f34303a;
                            if (PicCaptchaInterceptor.this.mURL == null) {
                                str = "";
                            } else {
                                str = PicCaptchaInterceptor.this.mURL.getPath();
                            }
                            picCaptchaInterceptor.showCaptchaAndReleaseLockIfNeeded(new InterceptorCaptchaData(str2, null, str));
                        }
                    }

                    public void onNeedCaptcha(C12993e<C13117p> eVar, String str) {
                        PicCaptchaInterceptor.this.mCounter.countDown();
                    }

                    public void onError(C12993e<C13117p> eVar, int i) {
                        C21000d.m53380c(String.valueOf(eVar.f34000c), eVar.f34001d);
                        PicCaptchaInterceptor.this.mCounter.countDown();
                    }
                });
            }

            public void onOk(String str, String str2) {
                C21378a.m53998a().mo45512a("", "", false, "send_voice_code", "", "注册图片验证码");
                C21000d.m53376a(str, str2);
                PicCaptchaInterceptor.this.mNewParams.put("captcha", str);
                PicCaptchaInterceptor.this.mCounter.countDown();
                fVar.dismiss();
            }
        };
        fVar.f59481j.show();
    }

    private static InterceptorCaptchaData parseCaptchaData(URL url, JSONObject jSONObject) {
        String str;
        try {
            String string = jSONObject.getString("captcha");
            String string2 = jSONObject.getString("description");
            if (url == null) {
                str = "";
            } else {
                str = url.getPath();
            }
            return new InterceptorCaptchaData(string, string2, str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public Map<String, String> tryToIntercept(String str, String str2, int i) {
        this.mNewParams = new C0777a<>();
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2).getJSONObject("data");
                try {
                    this.mURL = new URL(str);
                } catch (MalformedURLException unused) {
                }
                final InterceptorCaptchaData parseCaptchaData = parseCaptchaData(this.mURL, jSONObject);
                if (parseCaptchaData == null) {
                    return this.mNewParams;
                }
                Activity b = ((C36688i) C23826bi.m58450a(C36688i.class)).mo47883b();
                if (b == null) {
                    return this.mNewParams;
                }
                b.runOnUiThread(new Runnable() {
                    public void run() {
                        PicCaptchaInterceptor.this.showCaptchaAndReleaseLockIfNeeded(parseCaptchaData);
                    }
                });
                try {
                    this.mCounter.await();
                } catch (InterruptedException unused2) {
                }
                return this.mNewParams;
            } catch (JSONException unused3) {
                return this.mNewParams;
            }
        } catch (JSONException unused4) {
            return this.mNewParams;
        }
    }
}
