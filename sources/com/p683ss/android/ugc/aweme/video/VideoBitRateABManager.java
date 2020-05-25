package com.p683ss.android.ugc.aweme.video;

import android.content.Context;
import com.bytedance.common.utility.p524d.C9398b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.language.C35853o;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.requestcombine.C41233d;
import com.p683ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel;
import com.p683ss.android.ugc.aweme.setting.AsyncSettingsExperiment;
import com.p683ss.android.ugc.aweme.setting.C41556av;
import com.p683ss.android.ugc.aweme.setting.C41556av.C41557a;
import com.p683ss.android.ugc.aweme.video.api.BitRateSettingsApi;
import com.p683ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.video.VideoBitRateABManager */
public final class VideoBitRateABManager implements C41233d, C41557a {

    /* renamed from: d */
    private static final VideoBitRateABManager f120597d = new VideoBitRateABManager();

    /* renamed from: f */
    private static HashSet<String> f120598f;

    /* renamed from: a */
    public RateSettingsResponse f120599a;

    /* renamed from: b */
    public volatile boolean f120600b;

    /* renamed from: c */
    public boolean f120601c;

    /* renamed from: e */
    private Boolean f120602e;

    /* renamed from: com.ss.android.ugc.aweme.video.VideoBitRateABManager$RequestConfigTask */
    class RequestConfigTask implements LegoTask {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        private void request() {
            try {
                VideoBitRateABManager.this.mo95131a(BitRateSettingsApi.m103826a());
            } catch (Exception unused) {
            }
        }

        private RequestConfigTask() {
        }

        public void run(Context context) {
            C32458a.m75144a("RequestConfigTask");
            synchronized (VideoBitRateABManager.this) {
                if (!VideoBitRateABManager.this.f120601c) {
                    request();
                }
            }
        }
    }

    /* renamed from: c */
    public static VideoBitRateABManager m103801c() {
        return f120597d;
    }

    /* renamed from: a */
    public final void mo83715a() {
        m103802g();
    }

    /* renamed from: d */
    public final boolean mo95132d() {
        if (!C48017a.m103961c() || !this.f120600b) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m103804i() {
        C35857a.m81001b().mo74526a(new RequestConfigTask()).mo74527a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ Object mo95133e() throws Exception {
        mo95131a(((RateSettingCombineModel) C23794bh.m58406t().mo83703a("/aweme/v1/rate/settings/")).getRateSetting());
        return null;
    }

    private VideoBitRateABManager() {
        C41556av.m91389a().mo85339a(2, (C41557a) this);
        if (C48017a.m103961c()) {
            C0013i.m16a((Callable<TResult>) new C47987ag<TResult>(this));
            C23794bh.m58406t().mo83704a((C41233d) this);
        }
    }

    /* renamed from: g */
    private void m103802g() {
        if (C23794bh.m58406t().mo83705b()) {
            RateSettingCombineModel rateSettingCombineModel = (RateSettingCombineModel) C23794bh.m58406t().mo83703a("/aweme/v1/rate/settings/");
            if (rateSettingCombineModel != null && rateSettingCombineModel.getHttpCode() == 200 && rateSettingCombineModel.getRateSetting().status_code == 0) {
                m103803h();
            } else {
                if (rateSettingCombineModel == null || rateSettingCombineModel.getHttpCode() != 509) {
                    m103804i();
                }
            }
        } else {
            m103804i();
        }
    }

    /* renamed from: h */
    private void m103803h() {
        if (C10181b.m20511a().mo18172a(AsyncSettingsExperiment.class, true, "is_async_setting", 31744, true)) {
            C0013i.m16a((Callable<TResult>) new C47988ah<TResult>(this));
        } else {
            mo95131a(((RateSettingCombineModel) C23794bh.m58406t().mo83703a("/aweme/v1/rate/settings/")).getRateSetting());
        }
    }

    /* renamed from: b */
    public final void mo85342b() {
        boolean c = C48017a.m103961c();
        if (this.f120602e == null || c != this.f120602e.booleanValue()) {
            this.f120602e = Boolean.valueOf(c);
            if (c) {
                m103802g();
            }
            return;
        }
        if (c && !this.f120601c) {
            m103802g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ Object mo95134f() throws Exception {
        String str;
        String str2;
        try {
            str = C35807d.m80935a(C11010c.m22280a(), "bitrate_manager_sp_rate_setting", 0).getString("bitrate_manager_sp_rate_setting", null);
            if (str == null) {
                try {
                    if (!f120598f.contains(C35853o.m80992a())) {
                        str2 = "us";
                    } else {
                        str2 = C35853o.m80992a().toLowerCase();
                    }
                    Context a = C11010c.m22280a();
                    StringBuilder sb = new StringBuilder("rate_settings/");
                    sb.append(str2);
                    sb.append(".json");
                    str = m103799a(a, sb.toString());
                } catch (Throwable th) {
                    th = th;
                    C9220a.m18312a(th, str);
                    return null;
                }
            }
            m103800b((RateSettingsResponse) new C17971f().mo34884a(str, RateSettingsResponse.class));
        } catch (Throwable th2) {
            th = th2;
            str = null;
            C9220a.m18312a(th, str);
            return null;
        }
        return null;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f120598f = hashSet;
        hashSet.add("DE");
        f120598f.add("FR");
        f120598f.add("GB");
        f120598f.add("BR");
        f120598f.add("RU");
        f120598f.add("AE");
        f120598f.add("SA");
        f120598f.add("IT");
        f120598f.add("MX");
        f120598f.add("ES");
        f120598f.add("TR");
        f120598f.add("PL");
        f120598f.add("BD");
        f120598f.add("IN");
        f120598f.add("ID");
        f120598f.add("JP");
        f120598f.add("MY");
        f120598f.add("PH");
        f120598f.add("TH");
        f120598f.add("VN");
    }

    /* renamed from: a */
    public final void mo83716a(Throwable th) {
        m103804i();
    }

    /* renamed from: b */
    private void m103800b(RateSettingsResponse rateSettingsResponse) {
        if (rateSettingsResponse != null && rateSettingsResponse.isValid()) {
            try {
                synchronized (this) {
                    this.f120599a = rateSettingsResponse;
                    C35807d.m80935a(C11010c.m22280a(), "bitrate_manager_sp_rate_setting", 0).edit().putString("bitrate_manager_sp_rate_setting", new C17971f().mo34889b(rateSettingsResponse)).apply();
                }
                this.f120600b = true;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo95131a(RateSettingsResponse rateSettingsResponse) {
        if (rateSettingsResponse != null) {
            try {
                if (rateSettingsResponse.isValid()) {
                    m103800b(rateSettingsResponse);
                    this.f120601c = true;
                    C41556av.m91389a().mo85340a(2, true);
                    return;
                }
            } catch (Exception e) {
                C32458a.m75143a(e);
                return;
            }
        }
        C41556av.m91389a().mo85340a(2, false);
    }

    /* renamed from: a */
    private static String m103799a(Context context, String str) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                String str2 = new String(bArr, "UTF-8");
                C9398b.m18586a((Closeable) inputStream);
                return str2;
            } catch (IOException unused) {
                C9398b.m18586a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                C9398b.m18586a((Closeable) inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C9398b.m18586a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C9398b.m18586a((Closeable) inputStream);
            throw th;
        }
    }
}
