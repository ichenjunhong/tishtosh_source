package com.bytedance.android.livesdk.i18n;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import java.util.Map;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

final class I18nUpdateManager {

    /* renamed from: i */
    private static long[] f21130i = {3000, 6000, 9000, 60000, 60000, 60000, 600000};

    /* renamed from: j */
    private static I18nApi f21131j;

    /* renamed from: a */
    public String f21132a;

    /* renamed from: b */
    Handler f21133b;

    /* renamed from: c */
    public C7674a f21134c;

    /* renamed from: d */
    public boolean f21135d;

    /* renamed from: e */
    public int f21136e;

    /* renamed from: f */
    public long f21137f;

    /* renamed from: g */
    public long f21138g;

    /* renamed from: h */
    C1690c f21139h = null;

    /* renamed from: k */
    private Callback f21140k = new Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            I18nUpdateManager.this.mo14031a(I18nUpdateManager.this.f21138g);
            return true;
        }
    };

    public interface I18nApi {
        @C12706h(mo23876a = "/webcast/setting/i18n/package/")
        C2201v<C4177d<C7675a>> update(@C12724z(mo23894a = "locale") String str, @C12724z(mo23894a = "cur_version") long j);
    }

    /* renamed from: com.bytedance.android.livesdk.i18n.I18nUpdateManager$a */
    interface C7674a {
        /* renamed from: a */
        void mo14035a(String str, long j, Map<String, String> map);
    }

    /* renamed from: a */
    public final void mo14032a(Throwable th) {
        long j;
        this.f21136e++;
        Handler handler = this.f21133b;
        int i = this.f21136e;
        int length = f21130i.length;
        if (i >= length || i < 0) {
            j = f21130i[length - 1];
        } else {
            j = f21130i[i];
        }
        handler.sendEmptyMessageDelayed(0, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14031a(long j) {
        if (!this.f21135d && !this.f21133b.hasMessages(0)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime <= this.f21137f || elapsedRealtime - this.f21137f >= 60000) {
                this.f21138g = j;
                this.f21135d = true;
                try {
                    this.f21139h = f21131j.update(this.f21132a, j).mo6514a(C1667a.m5940a()).mo6529b(C2168a.m6521b()).mo6506a((C1710e<? super T>) new C1710e<C4177d<C7675a>>() {
                        public final /* synthetic */ void accept(Object obj) throws Exception {
                            C4177d dVar = (C4177d) obj;
                            I18nUpdateManager.this.f21135d = false;
                            if (dVar == null || dVar.statusCode != 0 || dVar.data == null) {
                                I18nUpdateManager.this.mo14032a(new Throwable("response == null || response.statusCode != 0 || response.data == null"));
                                return;
                            }
                            I18nUpdateManager.this.f21136e = 0;
                            I18nUpdateManager.this.f21137f = SystemClock.elapsedRealtime();
                            C7675a aVar = (C7675a) dVar.data;
                            if (I18nUpdateManager.this.f21134c != null) {
                                I18nUpdateManager.this.f21134c.mo14035a(I18nUpdateManager.this.f21132a, aVar.f21145a, aVar.f21146b);
                            }
                        }
                    }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
                        public final /* synthetic */ void accept(Object obj) throws Exception {
                            Throwable th = (Throwable) obj;
                            I18nUpdateManager.this.f21135d = false;
                            I18nUpdateManager.this.mo14032a(th);
                        }
                    }, (C1706a) new C1706a() {
                        /* renamed from: a */
                        public final void mo6199a() throws Exception {
                            I18nUpdateManager.this.f21135d = false;
                        }
                    });
                } catch (Throwable th) {
                    C3831a.m9714b("I18nUpdateManager", th);
                }
            }
        }
    }

    I18nUpdateManager(String str, C7674a aVar) {
        this.f21132a = str;
        this.f21134c = aVar;
        this.f21133b = new Handler(Looper.getMainLooper(), this.f21140k);
        if (f21131j == null) {
            f21131j = (I18nApi) C4157e.m10322a().mo9550a(I18nApi.class);
        }
    }
}
