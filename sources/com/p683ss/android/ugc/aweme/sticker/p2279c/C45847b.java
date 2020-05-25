package com.p683ss.android.ugc.aweme.sticker.p2279c;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Base64;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45827c;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45828d;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.EffectConfigViewModel;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

/* renamed from: com.ss.android.ugc.aweme.sticker.c.b */
public final class C45847b {

    /* renamed from: a */
    public FragmentActivity f115863a;

    /* renamed from: b */
    public C20489b f115864b;

    /* renamed from: c */
    public EffectConfigViewModel f115865c;

    /* renamed from: d */
    private ShortVideoContext f115866d;

    /* renamed from: com.ss.android.ugc.aweme.sticker.c.b$a */
    public static final class C45848a<T> implements C0199s<C45846a> {

        /* renamed from: a */
        final /* synthetic */ C45847b f115867a;

        public C45848a(C45847b bVar) {
            this.f115867a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            final C45846a aVar = (C45846a) obj;
            C0013i.m18a((Callable<TResult>) new Callable<Boolean>(this) {

                /* renamed from: a */
                final /* synthetic */ C45848a f115868a;

                {
                    this.f115868a = r1;
                }

                public final /* synthetic */ Object call() {
                    return Boolean.valueOf(this.f115868a.f115867a.mo92277a());
                }
            }, (Executor) C24076h.m58902c()).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Boolean, Boolean>(this) {

                /* renamed from: a */
                final /* synthetic */ C45848a f115869a;

                {
                    this.f115869a = r1;
                }

                public final /* synthetic */ Object then(C0013i iVar) {
                    C52711k.m112236a((Object) iVar, "isSuccess");
                    Object e = iVar.mo34e();
                    C52711k.m112236a(e, "isSuccess.result");
                    if (!((Boolean) e).booleanValue()) {
                        return Boolean.valueOf(false);
                    }
                    this.f115869a.f115867a.mo92276a(aVar);
                    return Boolean.valueOf(true);
                }
            }, (Executor) C24076h.m58902c());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.c.b$b */
    public static final class C45851b<T> implements C0199s<C45846a> {

        /* renamed from: a */
        final /* synthetic */ C45847b f115871a;

        public C45851b(C45847b bVar) {
            this.f115871a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            final C45846a aVar = (C45846a) obj;
            C0013i.m18a((Callable<TResult>) new Callable<Boolean>(this) {

                /* renamed from: a */
                final /* synthetic */ C45851b f115872a;

                {
                    this.f115872a = r1;
                }

                public final /* synthetic */ Object call() {
                    return Boolean.valueOf(this.f115872a.f115871a.mo92277a());
                }
            }, (Executor) C24076h.m58902c()).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Boolean, Boolean>() {
                public final /* synthetic */ Object then(C0013i iVar) {
                    C52711k.m112236a((Object) iVar, "isSuccess");
                    Object e = iVar.mo34e();
                    C52711k.m112236a(e, "isSuccess.result");
                    if (((Boolean) e).booleanValue()) {
                        C45846a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo92275a();
                        }
                    }
                    return (Boolean) iVar.mo34e();
                }
            }, C0013i.f25b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.c.b$c */
    public static final class C45854c<T> implements C0199s<C45846a> {

        /* renamed from: a */
        final /* synthetic */ C45847b f115874a;

        public C45854c(C45847b bVar) {
            this.f115874a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            final C45846a aVar = (C45846a) obj;
            C0013i.m18a((Callable<TResult>) new Callable<Object>(this) {

                /* renamed from: a */
                final /* synthetic */ C45854c f115875a;

                {
                    this.f115875a = r1;
                }

                public final /* synthetic */ Object call() {
                    this.f115875a.f115874a.mo92276a(aVar);
                    return C52860x.f131107a;
                }
            }, (Executor) C24076h.m58902c());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.c.b$d */
    public static final class C45856d extends C45827c {

        /* renamed from: a */
        final /* synthetic */ String f115877a;

        /* renamed from: b */
        final /* synthetic */ int f115878b;

        /* renamed from: c */
        final /* synthetic */ JSONArray f115879c;

        /* renamed from: d */
        final /* synthetic */ C45847b f115880d;

        /* renamed from: e */
        final /* synthetic */ C45846a f115881e;

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            if (downloadInfo != null) {
                C20489b bVar = this.f115880d.f115864b;
                if (bVar != null) {
                    String str = this.f115877a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(downloadInfo.getSavePath());
                    sb.append(downloadInfo.getName());
                    bVar.mo43513d(str, sb.toString());
                }
                if (this.f115878b == this.f115879c.length() - 1) {
                    C45846a aVar = this.f115881e;
                    if (aVar != null) {
                        aVar.mo92275a();
                    }
                }
            }
        }

        C45856d(String str, int i, JSONArray jSONArray, C45847b bVar, C45846a aVar) {
            this.f115877a = str;
            this.f115878b = i;
            this.f115879c = jSONArray;
            this.f115880d = bVar;
            this.f115881e = aVar;
        }
    }

    /* renamed from: a */
    public final boolean mo92277a() {
        CharSequence charSequence;
        if (!(this.f115866d == null || this.f115866d == null)) {
            ShortVideoContext shortVideoContext = this.f115866d;
            String str = null;
            if (shortVideoContext != null) {
                charSequence = shortVideoContext.f107105bd;
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                try {
                    ShortVideoContext shortVideoContext2 = this.f115866d;
                    if (shortVideoContext2 != null) {
                        str = shortVideoContext2.f107105bd;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("effect_key");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("effect_meta_info_value");
                    C20489b bVar = this.f115864b;
                    if (bVar != null) {
                        C52711k.m112236a((Object) optString, "effectKey");
                        String jSONObject3 = jSONObject2.toString();
                        C52711k.m112236a((Object) jSONObject3, "effectMetaInfoValue.toString()");
                        bVar.mo43472a(optString, jSONObject3);
                    }
                    return true;
                } catch (JSONException unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo92276a(C45846a aVar) {
        CharSequence charSequence;
        if (this.f115866d != null) {
            ShortVideoContext shortVideoContext = this.f115866d;
            String str = null;
            if (shortVideoContext != null) {
                charSequence = shortVideoContext.f107106be;
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                try {
                    ShortVideoContext shortVideoContext2 = this.f115866d;
                    if (shortVideoContext2 != null) {
                        str = shortVideoContext2.f107106be;
                    }
                    JSONArray jSONArray = new JSONObject(str).getJSONArray("effect_image_list");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String optString = jSONObject.optString("effect_key");
                            String optString2 = jSONObject.optString("effect_image_value");
                            Context context = this.f115863a;
                            C52711k.m112236a((Object) optString2, "effectImageValue");
                            C45856d dVar = new C45856d(optString, i, jSONArray, this, aVar);
                            C45827c cVar = dVar;
                            C52711k.m112240b(context, "mActivity");
                            C52711k.m112240b(optString2, "imageUrl");
                            C52711k.m112240b(cVar, "listener");
                            DownloadInfo downloadInfo = new DownloadInfo();
                            if (TextUtils.isEmpty(optString2)) {
                                cVar.onFailed(downloadInfo, new BaseException(0, "url=null"));
                            }
                            if (!C45828d.m99652a(context)) {
                                cVar.onFailed(downloadInfo, new BaseException(0, "network error"));
                            }
                            byte[] bytes = optString2.getBytes(C52808d.f131043a);
                            C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                            String encodeToString = Base64.encodeToString(bytes, 2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(EffectPlatform.m68834a());
                            sb.append(File.separator);
                            sb.append(encodeToString);
                            File file = new File(sb.toString());
                            DownloadTask url = Downloader.with(context).url(optString2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(file.getParent());
                            sb2.append(File.separator);
                            url.savePath(sb2.toString()).name(file.getName()).mainThreadListener(cVar).retryCount(1).download();
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    public C45847b(FragmentActivity fragmentActivity, ShortVideoContext shortVideoContext, C20489b bVar, EffectConfigViewModel effectConfigViewModel) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f115863a = fragmentActivity;
        this.f115866d = shortVideoContext;
        this.f115864b = bVar;
        this.f115865c = effectConfigViewModel;
    }
}
