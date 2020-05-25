package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a;

import android.text.TextUtils;
import com.bytedance.falconx.statistic.StatisticData;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C18085o;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EncryptedVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33445y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1819b.C33396a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35422a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import com.p683ss.ttuploader.TTImageUploader;
import com.p683ss.ttuploader.TTVideoInfo;
import com.p683ss.ttuploader.TTVideoUploader;
import com.p683ss.ttuploader.TTVideoUploaderListener;
import com.p683ss.ttuploader.UploadEventManager;
import java.io.File;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.a.e */
public class C33380e {

    /* renamed from: h */
    private static volatile C33380e f86554h;

    /* renamed from: a */
    public final Object f86555a = new Object();

    /* renamed from: b */
    public volatile boolean f86556b = false;

    /* renamed from: c */
    public volatile boolean f86557c = false;

    /* renamed from: d */
    public final Object f86558d = new Object();

    /* renamed from: e */
    public volatile boolean f86559e = false;

    /* renamed from: f */
    public volatile boolean f86560f = false;

    /* renamed from: g */
    public int f86561g = 0;

    /* renamed from: a */
    public final void mo70771a(final String str, final int i, final C33445y yVar, boolean z) {
        m76539a(z).mo6152a((C1710e<? super T>) new C1710e<C33377b>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C33378c publicImageConfig;
                C33377b bVar = (C33377b) obj;
                C33380e eVar = C33380e.this;
                String str = str;
                int i = i;
                C33445y yVar = yVar;
                try {
                    if (TextUtils.isEmpty(str)) {
                        yVar.mo70784a("96");
                        return;
                    }
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.isFile()) {
                            if (bVar == null) {
                                yVar.mo70784a("97");
                                return;
                            }
                            if (i == 1) {
                                publicImageConfig = bVar.getInnerImageConfig();
                            } else {
                                publicImageConfig = bVar.getPublicImageConfig();
                            }
                            C33378c cVar = publicImageConfig;
                            C35460j f = C34004b.m77717a().mo71949f();
                            if (f != null) {
                                if (!f.isCheckPlugin() || eVar.f86556b) {
                                    eVar.mo70770a(str, i, yVar, cVar, false);
                                } else {
                                    eVar.f86557c = false;
                                    f.checkPluginAndLoadLibrary(f.getCurrentActivity(), true, "ttvideouploader", new C35422a() {
                                    });
                                    synchronized (eVar.f86555a) {
                                        while (!eVar.f86556b && !eVar.f86557c) {
                                            eVar.f86555a.wait();
                                        }
                                        if (eVar.f86557c) {
                                            yVar.mo70785a((Throwable) new RuntimeException("download plugin failed"));
                                        } else if (eVar.f86556b) {
                                            eVar.mo70770a(str, i, yVar, cVar, eVar.f86556b);
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    }
                    yVar.mo70784a("95");
                } catch (Exception unused) {
                    yVar.mo70784a(StatisticData.ERROR_CODE_NOT_FOUND);
                }
            }
        }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C32458a.m75148a((Throwable) obj);
            }
        });
    }

    /* renamed from: a */
    public final void mo70773a(final String str, final C33396a aVar, boolean z) {
        m76539a(z).mo6152a((C1710e<? super T>) new C1710e<C33377b>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C33377b bVar = (C33377b) obj;
                C33380e eVar = C33380e.this;
                String str = str;
                C33396a aVar = aVar;
                try {
                    if (TextUtils.isEmpty(str)) {
                        aVar.mo70784a("102");
                        return;
                    }
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.isFile()) {
                            if (bVar == null) {
                                aVar.mo70784a("103");
                                return;
                            }
                            C35460j f = C34004b.m77717a().mo71949f();
                            if (f != null) {
                                C33378c publicImageConfig = bVar.getPublicImageConfig();
                                if (!f.isCheckPlugin() || eVar.f86559e) {
                                    eVar.mo70772a(str, aVar, publicImageConfig, false);
                                } else {
                                    eVar.f86560f = false;
                                    f.checkPluginAndLoadLibrary(f.getCurrentActivity(), true, "ttvideouploader", new C35422a() {
                                    });
                                    synchronized (eVar.f86558d) {
                                        while (!eVar.f86559e && !eVar.f86560f) {
                                            eVar.f86558d.wait();
                                        }
                                        if (eVar.f86560f) {
                                            aVar.mo70785a((Throwable) new RuntimeException("download plugin failed"));
                                        } else if (eVar.f86559e) {
                                            eVar.mo70772a(str, aVar, publicImageConfig, eVar.f86559e);
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    }
                    aVar.mo70784a(StatisticData.ERROR_CODE_IO_ERROR);
                } catch (Exception unused) {
                    aVar.mo70784a(StatisticData.ERROR_CODE_NOT_FOUND);
                }
            }
        }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C32458a.m75148a((Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo70772a(final String str, final C33396a aVar, C33378c cVar, boolean z) {
        TTVideoUploader a = m76542a(cVar);
        if (a == null) {
            aVar.mo70784a("104");
            return;
        }
        if (z) {
            m76544a(a);
        }
        a.setListener(new TTVideoUploaderListener() {
            public final String getStringFromExtern(int i) {
                return "";
            }

            public final void onUploadVideoStage(int i, long j) {
            }

            public final int videoUploadCheckNetState(int i, int i2) {
                return -1;
            }

            public final void onLog(int i, int i2, String str) {
                StringBuilder sb = new StringBuilder("code=");
                sb.append(i2);
                sb.append(" info=");
                sb.append(str);
                C32458a.m75150b("UploadManager", sb.toString());
            }

            public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
                switch (i) {
                    case 0:
                        EncryptedVideoContent encryptedVideoContent = new EncryptedVideoContent();
                        encryptedVideoContent.setSecretKey(tTVideoInfo.mSecretKey);
                        encryptedVideoContent.setSourceMD5(tTVideoInfo.mSourceMd5);
                        encryptedVideoContent.setTosKey(tTVideoInfo.mTosKey);
                        C33376a aVar = new C33376a();
                        C18085o oVar = (C18085o) C35277o.m79760a(tTVideoInfo.mExtra, C18085o.class);
                        aVar.f86547a = oVar.mo35022b("thumb_uri").mo34905c();
                        aVar.f86549c = oVar.mo35022b("thumb_md5").mo34905c();
                        aVar.f86548b = oVar.mo35022b("thumb_secret").mo34905c();
                        aVar.mo70780a(str, encryptedVideoContent, aVar);
                        break;
                    case 1:
                        if (aVar != null) {
                            aVar.mo70783a((double) ((((float) j) * 1.0f) / 100.0f));
                            return;
                        }
                        break;
                    case 2:
                        long j2 = tTVideoInfo.mErrcode;
                        if ((j2 != 10401 && j2 != 10402 && j2 != 10403 && j2 != 10408) || C33380e.this.f86561g >= 2) {
                            if (aVar != null) {
                                aVar.mo70784a(String.valueOf(j2));
                                break;
                            }
                        } else {
                            C33380e.this.f86561g++;
                            C33380e.this.mo70773a(str, aVar, true);
                            break;
                        }
                        break;
                }
                C33380e.m76545b();
            }
        });
        a.setPathName(str);
        a.start();
    }

    private C33380e() {
    }

    /* renamed from: a */
    public static C33380e m76540a() {
        if (f86554h == null) {
            synchronized (C33380e.class) {
                if (f86554h == null) {
                    f86554h = new C33380e();
                }
            }
        }
        return f86554h;
    }

    /* renamed from: b */
    public static void m76545b() {
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        if (popAllEvents != null) {
            for (int i = 0; i < popAllEvents.length(); i++) {
                try {
                    JSONObject jSONObject = popAllEvents.getJSONObject(i);
                    if (jSONObject != null) {
                        StringBuilder sb = new StringBuilder("uploadVideoLog=");
                        sb.append(jSONObject.toString());
                        C35459a.m80148a("UploadManager", sb.toString());
                        TeaAgent.recordMiscLog(C11010c.m22280a(), "video_upload", popAllEvents.getJSONObject(i));
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private C1680ad<C33377b> m76539a(boolean z) {
        return C2201v.m6602a((C2206z<? extends T>) C2201v.m6601a((C2205y<T>) new C33388f<T>(this, z)).mo6529b(C2168a.m6521b()), (C2206z<? extends T>) C35286u.f90624a.getUploadAuthKeyConfig().mo6529b(C2168a.m6521b()).mo6518a(C33389g.f86578a)).mo6538d();
    }

    /* renamed from: a */
    private TTVideoUploader m76542a(C33378c cVar) {
        try {
            this.f86561g = 0;
            TTVideoUploader tTVideoUploader = new TTVideoUploader(1);
            tTVideoUploader.setSocketNum(cVar.socketNumber);
            tTVideoUploader.setVideoUploadDomain(cVar.imageHostName);
            tTVideoUploader.setMaxFailTime(cVar.maxFailTime);
            tTVideoUploader.setFileUploadDomain(cVar.fileHostName);
            tTVideoUploader.setFileRetryCount(cVar.fileRetryCount);
            tTVideoUploader.setUserKey(cVar.appKey);
            tTVideoUploader.setAuthorization(cVar.authorization);
            tTVideoUploader.setEnableHttps(cVar.enableHttps);
            return tTVideoUploader;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m76543a(TTImageUploader tTImageUploader) {
        try {
            Field declaredField = tTImageUploader.getClass().getDeclaredField("IsErrored");
            declaredField.setAccessible(true);
            declaredField.set(tTImageUploader, Boolean.valueOf(false));
        } catch (NoSuchFieldException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    /* renamed from: a */
    private static void m76544a(TTVideoUploader tTVideoUploader) {
        try {
            Field declaredField = tTVideoUploader.getClass().getDeclaredField("IsErrored");
            declaredField.setAccessible(true);
            declaredField.set(tTVideoUploader, Boolean.valueOf(false));
        } catch (NoSuchFieldException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    /* renamed from: a */
    private TTImageUploader m76541a(int i, C33378c cVar) {
        int i2 = 0;
        try {
            this.f86561g = 0;
            if (i == 0) {
                i2 = 1;
            }
            TTImageUploader tTImageUploader = new TTImageUploader(i2);
            tTImageUploader.setSocketNum(cVar.socketNumber);
            tTImageUploader.setImageUploadDomain(cVar.imageHostName);
            tTImageUploader.setMaxFailTime(cVar.maxFailTime);
            tTImageUploader.setFileUploadDomain(cVar.fileHostName);
            tTImageUploader.setFileRetryCount(cVar.fileRetryCount);
            tTImageUploader.setUserKey(cVar.appKey);
            tTImageUploader.setAuthorization(cVar.authorization);
            tTImageUploader.setEnableHttps(cVar.enableHttps);
            return tTImageUploader;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo70770a(String str, int i, C33445y yVar, C33378c cVar, boolean z) {
        StringBuilder sb = new StringBuilder("internalUploadImage localPath=");
        sb.append(str);
        C35459a.m80148a("UploadManager", sb.toString());
        TTImageUploader a = m76541a(i, cVar);
        if (a == null) {
            yVar.mo70784a("98");
            return;
        }
        if (z) {
            m76543a(a);
        }
        a.setListener(new C33390h(this, yVar, i, str));
        a.setFilePath(1, new String[]{str});
        a.start();
    }
}
