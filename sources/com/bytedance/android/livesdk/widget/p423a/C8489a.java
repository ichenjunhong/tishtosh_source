package com.bytedance.android.livesdk.widget.p423a;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3895i;
import com.bytedance.android.live.core.p230g.C3898l;
import com.bytedance.android.live.core.widget.LiveEditText;
import com.bytedance.android.live.core.widget.LiveTextView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.C5752i;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b.C4511a;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p064c.p065a.C1674ab;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p093k.C2168a;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.widget.a.a */
public final class C8489a implements C3898l {

    /* renamed from: a */
    public C2180b<C8494b> f23307a;

    /* renamed from: b */
    public Map<String, C8494b> f23308b;

    /* renamed from: c */
    public boolean f23309c;

    /* renamed from: d */
    private File f23310d;

    /* renamed from: e */
    private boolean f23311e;

    /* renamed from: com.bytedance.android.livesdk.widget.a.a$a */
    public static final class C8493a implements C4510b<C3898l> {
        /* renamed from: a */
        public final C4511a<C3898l> mo10307a(C4511a<C3898l> aVar) {
            return aVar.mo10337a(new C8489a()).mo10336a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.a.a$b */
    static final class C8494b {

        /* renamed from: a */
        public Typeface f23316a;

        /* renamed from: b */
        public String f23317b;

        private C8494b(String str, Typeface typeface) {
            this.f23316a = typeface;
            this.f23317b = str;
        }
    }

    private C8489a() {
        this.f23307a = C2180b.m6534l();
        this.f23308b = new ConcurrentHashMap();
    }

    /* renamed from: b */
    public final C1680ad<Typeface> mo9254b() {
        String str = ((C5752i) LiveConfigSettingKeys.LIVE_CUSTOM_FONT_CONFIG.mo9431a()).f15118a;
        C8494b bVar = (C8494b) this.f23308b.get(str);
        if (bVar != null) {
            return C1680ad.m5961a(bVar.f23316a).mo6148a(C1667a.m5940a());
        }
        return this.f23307a.mo6522a((C1715j<? super T>) new C8495b<Object>(str)).mo6541d(C8496c.f23319a).mo6538d().mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a());
    }

    /* renamed from: a */
    public final void mo9253a() {
        if (!this.f23311e) {
            LiveTextView.setFontManager(this);
            LiveEditText.setFontManager(this);
            LiveTextView.setEnableHostTypeface(true);
            LiveEditText.setEnableHostTypeface(true);
            this.f23310d = new File(m16757a(TTLiveSDKContext.getHostService().mo10308a().context()));
            if (C3895i.m9848a(this.f23310d)) {
                this.f23307a.mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<C8494b>() {
                    public final void onComplete() {
                    }

                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(C1690c cVar) {
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        C8494b bVar = (C8494b) obj;
                        C8489a.this.f23308b.put(bVar.f23317b, bVar);
                    }
                });
                File[] listFiles = this.f23310d.listFiles();
                if (listFiles == null) {
                    mo14941c();
                } else {
                    C2201v.m6609a((T[]) listFiles).mo6529b(C2168a.m6521b()).mo6522a(C8497d.f23320a).mo6541d(C8498e.f23321a).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<C8494b>() {
                        public final void onSubscribe(C1690c cVar) {
                        }

                        public final void onComplete() {
                            C8489a.this.mo14941c();
                        }

                        public final void onError(Throwable th) {
                            C8489a.this.mo14941c();
                        }

                        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                            C8489a.this.f23307a.onNext((C8494b) obj);
                        }
                    });
                }
                this.f23311e = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo14941c() {
        if (!this.f23309c) {
            C5752i iVar = (C5752i) LiveConfigSettingKeys.LIVE_CUSTOM_FONT_CONFIG.mo9431a();
            final String str = iVar.f15118a;
            if (!TextUtils.isEmpty(str) && this.f23308b.get(str) == null) {
                ImageModel imageModel = iVar.f15119b;
                if (imageModel != null) {
                    String str2 = null;
                    Iterator it = imageModel.getUrls().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str3 = (String) it.next();
                        if (!TextUtils.isEmpty(str3)) {
                            str2 = str3;
                            break;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        this.f23309c = true;
                        DownloadTask url = Downloader.with(TTLiveSDKContext.getHostService().mo10308a().context()).url(str2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(".ttf");
                        url.name(sb.toString()).savePath(this.f23310d.getAbsolutePath()).mainThreadListener(new AbsDownloadListener() {
                            public final void onSuccessed(DownloadInfo downloadInfo) {
                                super.onSuccessed(downloadInfo);
                                C8489a.this.f23309c = false;
                                C2201v.m6607a((Callable<? extends T>) new C8499f<Object>(downloadInfo)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8500g<Object>(this, str), C8501h.f23325a);
                            }

                            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                                super.onFailed(downloadInfo, baseException);
                                C8489a.this.f23309c = false;
                                C3831a.m9714b("LiveFontManager", (Throwable) baseException);
                            }
                        }).download();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final Typeface mo9252a(int i) {
        return TTLiveSDKContext.getHostService().mo10310c().getHostTypeface(i);
    }

    /* renamed from: a */
    private static String m16757a(Context context) {
        try {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(externalCacheDir.getAbsolutePath());
                sb.append("/fonts");
                return sb.toString();
            }
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/Android/data/");
            sb2.append(context.getPackageName());
            sb2.append("/cache/fonts");
            return sb2.toString();
        } catch (Throwable th) {
            C3837e.m9748a(th, th.getMessage());
            return "";
        }
    }
}
