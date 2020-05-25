package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.activity.C23423b;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity.C39064a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.sensitiveserver.C41485a;
import com.p683ss.android.ugc.aweme.sensitiveserver.C41485a.C41486a;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback;
import com.p683ss.android.ugc.aweme.utils.C47720bh;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p001a.C0027j;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.fe.method.p */
public final class C29910p implements C9382a, C10762d, C23423b {

    /* renamed from: d */
    public static final C29911a f78047d = new C29911a(null);

    /* renamed from: a */
    public String f78048a;

    /* renamed from: b */
    boolean f78049b;

    /* renamed from: c */
    public C1689b f78050c;

    /* renamed from: e */
    private String f78051e = "";

    /* renamed from: f */
    private String f78052f = "";

    /* renamed from: g */
    private String f78053g = "";

    /* renamed from: h */
    private boolean f78054h;

    /* renamed from: i */
    private int f78055i;

    /* renamed from: j */
    private boolean f78056j;

    /* renamed from: k */
    private boolean f78057k;

    /* renamed from: l */
    private int f78058l;

    /* renamed from: m */
    private String f78059m = "";

    /* renamed from: n */
    private String f78060n = "";

    /* renamed from: o */
    private String f78061o = "";

    /* renamed from: p */
    private String f78062p = "";

    /* renamed from: q */
    private String f78063q = "";

    /* renamed from: r */
    private String f78064r = "";

    /* renamed from: s */
    private String f78065s = "";

    /* renamed from: t */
    private boolean f78066t = true;

    /* renamed from: u */
    private WeakReference<Context> f78067u;

    /* renamed from: v */
    private C10757a f78068v;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$a */
    public static final class C29911a {
        private C29911a() {
        }

        public /* synthetic */ C29911a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$b */
    static final class C29912b implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C29910p f78069a;

        /* renamed from: b */
        final /* synthetic */ Activity f78070b;

        C29912b(C29910p pVar, Activity activity) {
            this.f78069a = pVar;
            this.f78070b = activity;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            boolean z;
            if (iArr != null) {
                boolean z2 = false;
                if (iArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C52711k.m112240b(iArr, "$this$contains");
                    C52711k.m112240b(iArr, "$this$indexOf");
                    int length = iArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (-1 == iArr[i]) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        z2 = true;
                    }
                    if (z2) {
                        new C10643a(this.f78070b).mo18899b((int) R.string.kb).mo18886a((int) R.string.ah4, (OnClickListener) new OnClickListener(this) {

                            /* renamed from: a */
                            final /* synthetic */ C29912b f78071a;

                            {
                                this.f78071a = r1;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C47720bh.m103294a(this.f78071a.f78070b);
                                dialogInterface.dismiss();
                            }
                        }).mo18900b((int) R.string.wf, (OnClickListener) C299142.f78072a).mo18897a().mo18882b();
                        C29910p pVar = this.f78069a;
                        pVar.mo60111a("image", "1");
                        pVar.f78049b = true;
                        return;
                    }
                    this.f78069a.mo60109a(this.f78070b);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$c */
    static final class C29915c<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C29910p f78073a;

        /* renamed from: b */
        final /* synthetic */ String f78074b;

        C29915c(C29910p pVar, String str) {
            this.f78073a = pVar;
            this.f78074b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            Bitmap rotateBitmap = BitmapUtils.rotateBitmap(C29910p.m70064a(new File(str), 1080), BitmapUtils.readPictureDegree(this.f78074b));
            C52711k.m112236a((Object) rotateBitmap, "BitmapUtils.rotateBitmap(bitmap, degree)");
            return rotateBitmap;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$d */
    static final class C29916d<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C29910p f78075a;

        /* renamed from: b */
        final /* synthetic */ long f78076b;

        /* renamed from: c */
        final /* synthetic */ String f78077c;

        C29916d(C29910p pVar, long j, String str) {
            this.f78075a = pVar;
            this.f78076b = j;
            this.f78077c = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            int i;
            CharSequence charSequence;
            Bitmap bitmap = (Bitmap) obj;
            C52711k.m112240b(bitmap, "it");
            long j = this.f78076b;
            if (10485761 <= j && 15728640 >= j) {
                i = 90;
            } else if (15728641 <= j && 20971520 >= j) {
                i = 85;
            } else {
                i = 100;
            }
            String str = this.f78077c;
            if (str != null) {
                charSequence = str.subSequence(C52830p.m112444b((CharSequence) this.f78077c, '/', 0, false, 6, (Object) null) + 1, C52830p.m112444b((CharSequence) this.f78077c, '.', 0, false, 6, (Object) null));
            } else {
                charSequence = null;
            }
            File createTempFile = File.createTempFile(String.valueOf(charSequence), ".jpg", C48016e.m103945c());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            bitmap.compress(CompressFormat.JPEG, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            C29910p pVar = this.f78075a;
            C52711k.m112236a((Object) createTempFile, "file");
            pVar.f78048a = createTempFile.getAbsolutePath();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$e */
    static final class C29917e<T> implements C1710e<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29910p f78078a;

        C29917e(C29910p pVar) {
            this.f78078a = pVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C52860x xVar = (C52860x) obj;
            this.f78078a.mo60110a(new File(this.f78078a.f78048a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$f */
    static final class C29918f<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C29910p f78079a;

        /* renamed from: b */
        final /* synthetic */ Context f78080b;

        C29918f(C29910p pVar, Context context) {
            this.f78079a = pVar;
            this.f78080b = context;
        }

        public final /* synthetic */ void accept(Object obj) {
            String.valueOf(((Throwable) obj).getMessage());
            C10691a.m21549c(this.f78080b, (int) R.string.gby, 500).mo19066a();
            this.f78079a.mo60111a("image", "1");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$g */
    public static final class C29919g implements IProcessCallback<String> {

        /* renamed from: a */
        final /* synthetic */ C0027j f78081a;

        C29919g(C0027j jVar) {
            this.f78081a = jVar;
        }

        public final /* synthetic */ void finish(Object obj) {
            this.f78081a.mo44a((String) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$h */
    static final class C29920h extends C52712l implements C52670a {

        /* renamed from: a */
        final /* synthetic */ C29910p f78082a;

        /* renamed from: b */
        final /* synthetic */ File f78083b;

        C29920h(C29910p pVar, File file) {
            this.f78082a = pVar;
            this.f78083b = file;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C41485a.m91309a(this.f78083b, "1", "qualification_photo", "1", new C41486a(this) {

                /* renamed from: a */
                final /* synthetic */ C29920h f78084a;

                /* renamed from: com.ss.android.ugc.aweme.fe.method.p$h$1$a */
                static final class C29922a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C299211 f78085a;

                    /* renamed from: b */
                    final /* synthetic */ String f78086b;

                    /* renamed from: c */
                    final /* synthetic */ String f78087c;

                    C29922a(C299211 r1, String str, String str2) {
                        this.f78085a = r1;
                        this.f78086b = str;
                        this.f78087c = str2;
                    }

                    public final void run() {
                        JSONObject a = this.f78085a.f78084a.f78082a.mo60108a(1, "", "");
                        try {
                            a.put("file_id", this.f78086b);
                            a.put("url", this.f78087c);
                        } catch (JSONException unused) {
                        }
                        this.f78085a.f78084a.f78082a.mo60112a("image", a);
                    }
                }

                /* renamed from: a */
                public final void mo60098a() {
                    this.f78084a.f78082a.mo60112a("image", this.f78084a.f78082a.mo60108a(0, "", ""));
                }

                {
                    this.f78084a = r1;
                }

                /* renamed from: a */
                public final void mo60099a(String str, String str2) {
                    C52711k.m112240b(str, "filedId");
                    C52711k.m112240b(str2, "ticketUrl");
                    C1689b bVar = this.f78084a.f78082a.f78050c;
                    if (bVar == null || !bVar.isDisposed()) {
                        C1689b bVar2 = this.f78084a.f78082a.f78050c;
                        if (bVar2 != null) {
                            bVar2.dispose();
                        }
                        new Handler(Looper.getMainLooper()).post(new C29922a(this, str, str2));
                    }
                }
            });
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$i */
    static final class C29923i<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ C29910p f78088a;

        C29923i(C29910p pVar) {
            this.f78088a = pVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            this.f78088a.mo60113b("image", "");
            C1689b bVar = this.f78088a.f78050c;
            if (bVar != null && !bVar.isDisposed()) {
                C1689b bVar2 = this.f78088a.f78050c;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo48596a(int i, int i2, Intent intent) {
        if (i != 1024) {
            return true;
        }
        if (i2 == 0 || intent == null) {
            mo60111a("image", "1");
            return true;
        }
        WeakReference<Context> weakReference = this.f78067u;
        if (weakReference == null) {
            C52711k.m112234a();
        }
        Context context = (Context) weakReference.get();
        if (context == null) {
            return true;
        }
        C52711k.m112236a((Object) context, "mContextRef!!.get() ?: return true");
        String stringExtra = intent.getStringExtra("photo_path");
        if (C9431p.m18664a(stringExtra)) {
            C9432q.m18673a(context, 2131952652, (int) R.string.cos);
            return true;
        }
        File file = new File(stringExtra);
        if (!file.exists()) {
            C9432q.m18673a(context, 2131952652, (int) R.string.cos);
            return true;
        }
        if (intent.getBooleanExtra("need_compress", false)) {
            C1690c a = C2201v.m6614b(stringExtra).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) new C29915c<Object,Object>(this, stringExtra)).mo6541d((C1711f<? super T, ? extends R>) new C29916d<Object,Object>(this, file.length(), stringExtra)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C29917e<Object>(this), (C1710e<? super Throwable>) new C29918f<Object>(this, context));
            C1689b bVar = this.f78050c;
            if (bVar != null) {
                bVar.mo6181a(a);
            }
        } else {
            this.f78048a = stringExtra;
            mo60110a(file);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo60112a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadBusinessLicense");
        } catch (JSONException unused) {
        }
        C10757a aVar = this.f78068v;
        if (aVar != null) {
            aVar.mo19458b("H5_uploadBusinessLicense", jSONObject2);
        }
    }

    /* renamed from: a */
    private final C0013i<String> m70063a() {
        C0027j jVar = new C0027j();
        try {
            if (this.f78054h || !C47723bk.m103311a(this.f78048a)) {
                jVar.mo44a(null);
                this.f78054h = false;
                this.f78048a = "";
                C0013i<TResult> iVar = jVar.f77a;
                C52711k.m112236a((Object) iVar, "taskCompletionSource.task");
                return iVar;
            }
            IAVProcessService processService = AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().processService();
            String str = this.f78048a;
            if (str == null) {
                C52711k.m112234a();
            }
            processService.compressPhoto(str, null, null, new C29919g(jVar));
            this.f78054h = false;
            this.f78048a = "";
            C0013i<TResult> iVar2 = jVar.f77a;
            C52711k.m112236a((Object) iVar2, "taskCompletionSource.task");
            return iVar2;
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f78054h = false;
            this.f78048a = "";
            throw th;
        }
    }

    /* renamed from: b */
    private final void m70065b(File file) {
        C0013i.m16a((Callable) new C29920h(this, file));
    }

    public final void handleMsg(Message message) {
        JSONObject jSONObject;
        C52711k.m112240b(message, "msg");
        C1689b bVar = this.f78050c;
        if (bVar == null || !bVar.isDisposed()) {
            C1689b bVar2 = this.f78050c;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            WeakReference<Context> weakReference = this.f78067u;
            if (weakReference == null) {
                C52711k.m112234a();
            }
            Context context = (Context) weakReference.get();
            if (context != null) {
                if (message.obj instanceof C23459a) {
                    Object obj = message.obj;
                    if (obj != null) {
                        ((C23459a) obj).getErrorMsg();
                        C10691a.m21545b(context, context.getString(R.string.gbz)).mo19066a();
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                    }
                } else if (message.obj instanceof AvatarUri) {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        AvatarUri avatarUri = (AvatarUri) obj2;
                        if (!C9376b.m18558a((Collection<T>) avatarUri.urlList)) {
                            String str = (String) avatarUri.urlList.get(0);
                            C52711k.m112236a((Object) str, "url");
                            String str2 = avatarUri.uri;
                            C52711k.m112236a((Object) str2, "uri.uri");
                            jSONObject = mo60108a(1, str, str2);
                        } else {
                            jSONObject = mo60108a(0, "", "");
                        }
                        mo60112a("image", jSONObject);
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
                }
                jSONObject = mo60108a(0, "", "");
                mo60112a("image", jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo60109a(Activity activity) {
        int i;
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", this.f78062p);
        bundle.putString("tips_text", this.f78059m);
        bundle.putString("link_url", this.f78061o);
        bundle.putString("upload_page_name", this.f78051e);
        bundle.putString("camera_page_name", this.f78052f);
        bundle.putString("title", this.f78063q);
        bundle.putString("camera_tips_vertical", this.f78065s);
        bundle.putString("camera_tips_horizontal", this.f78064r);
        String str = "show_national_emblem";
        if (this.f78066t) {
            i = 0;
        } else {
            i = 4;
        }
        bundle.putInt(str, i);
        C39064a.m86901a(activity, bundle);
    }

    /* renamed from: a */
    public final void mo60110a(File file) {
        C1690c f = C2201v.m6592a(5, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C29923i<Object>(this));
        C1689b bVar = this.f78050c;
        if (bVar != null) {
            bVar.mo6181a(f);
        }
        if (this.f78057k) {
            m70065b(file);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f61283c);
        sb.append("?uid=");
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        sb.append(a.getCurUserId());
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(this.f78053g)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("&source=");
            sb3.append(this.f78053g);
            sb2 = sb3.toString();
        }
        C20854a.m53161a().userService().uploadAvatar(new C9381g(this), sb2, 20971520, this.f78048a, null);
    }

    public C29910p(WeakReference<Context> weakReference, C10757a aVar) {
        this.f78067u = weakReference;
        this.f78068v = aVar;
    }

    /* renamed from: a */
    public final void mo60111a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str2);
            jSONObject.put("code", 1);
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadBusinessLicenseCancel");
        } catch (JSONException unused) {
        }
        C10757a aVar = this.f78068v;
        if (aVar != null) {
            aVar.mo19458b("H5_uploadBusinessLicenseCancel", jSONObject2);
        }
    }

    /* renamed from: b */
    public final void mo60113b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str2);
            jSONObject.put("code", 2);
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFileTimeOut");
        } catch (JSONException unused) {
        }
        C10757a aVar = this.f78068v;
        if (aVar != null) {
            aVar.mo19458b("H5_uploadFileTimeOut", jSONObject2);
        }
    }

    /* renamed from: a */
    public static Bitmap m70064a(File file, int i) {
        Bitmap bitmap;
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            FileInputStream fileInputStream = new FileInputStream(file);
            BitmapFactory.decodeStream(fileInputStream, null, options);
            fileInputStream.close();
            if (options.outWidth > 0) {
                if (options.outHeight > 0) {
                    int i2 = 1;
                    while (options.outWidth >= 1080) {
                        options.outWidth /= 2;
                        options.outHeight /= 2;
                        i2 *= 2;
                    }
                    Options options2 = new Options();
                    options2.inSampleSize = i2;
                    options2.inPurgeable = true;
                    options2.inPreferredConfig = Config.RGB_565;
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    bitmap = BitmapFactory.decodeStream(fileInputStream2, null, options2);
                    try {
                        fileInputStream2.close();
                        if (bitmap == null) {
                            file.delete();
                        }
                    } catch (Exception unused) {
                    }
                    return bitmap;
                }
            }
            file.delete();
            return null;
        } catch (Exception unused2) {
            bitmap = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.p675g.p676a.C10766h r13, org.json.JSONObject r14) throws java.lang.Exception {
        /*
            r12 = this;
            java.lang.String r0 = "msg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            java.lang.String r0 = "res"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r0)
            org.json.JSONObject r0 = r13.f28947d
            java.lang.String r1 = "type"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = ""
            r12.f78053g = r1
            java.lang.String r1 = "image"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x01fe
            java.lang.ref.WeakReference<android.content.Context> r0 = r12.f78067u
            r1 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "source"
            java.lang.String r2 = r2.optString(r3)
            java.lang.String r3 = "msg.params.optString(\"source\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r12.f78053g = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "skip_img_base64"
            r4 = 0
            boolean r2 = r2.optBoolean(r3, r4)
            r12.f78054h = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "maxSelectNum"
            r5 = 1
            int r2 = r2.optInt(r3, r5)
            r12.f78055i = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "skip_img_base64"
            boolean r2 = r2.optBoolean(r3, r4)
            r12.f78056j = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "use_sensitive_server"
            boolean r2 = r2.optBoolean(r3, r4)
            r12.f78057k = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "image_width"
            r6 = -1
            int r2 = r2.optInt(r3, r6)
            r12.f78058l = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "enter_from"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(Mob.Label.ENTER_FROM, \"\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r12.f78062p = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "tips_text"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(TIPS_TEXT, \"\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r12.f78059m = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "tap_text"
            if (r0 == 0) goto L_0x00a9
            android.content.res.Resources r6 = r0.getResources()
            if (r6 == 0) goto L_0x00a9
            r7 = 2132551900(0x7f1c28dc, float:2.0757172E38)
            java.lang.String r6 = r6.getString(r7)
            goto L_0x00aa
        L_0x00a9:
            r6 = r1
        L_0x00aa:
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(TAP…g(R.string.view_example))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r12.f78060n = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "link_url"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(LINK_URL, \"\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r12.f78061o = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "camera_page_name"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(CAMERA_PAGE_NAME, \"\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r12.f78052f = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "upload_page_name"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(UPLOAD_PAGE_NAME, \"\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r12.f78051e = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "title"
            if (r0 == 0) goto L_0x00fc
            android.content.res.Resources r6 = r0.getResources()
            if (r6 == 0) goto L_0x00fc
            r7 = 2132551671(0x7f1c27f7, float:2.0756708E38)
            java.lang.String r6 = r6.getString(r7)
            goto L_0x00fd
        L_0x00fc:
            r6 = r1
        L_0x00fd:
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(TIT…upload_business_license))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r12.f78063q = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "camera_tips_horizontal"
            java.lang.String r6 = "%s\n%s"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 2132542486(0x7f1c0416, float:2.0738078E38)
            if (r0 == 0) goto L_0x0121
            android.content.res.Resources r10 = r0.getResources()
            if (r10 == 0) goto L_0x0121
            java.lang.String r10 = r10.getString(r9)
            goto L_0x0122
        L_0x0121:
            r10 = r1
        L_0x0122:
            r8[r4] = r10
            if (r0 == 0) goto L_0x0134
            android.content.res.Resources r10 = r0.getResources()
            if (r10 == 0) goto L_0x0134
            r11 = 2132542487(0x7f1c0417, float:2.073808E38)
            java.lang.String r10 = r10.getString(r11)
            goto L_0x0135
        L_0x0134:
            r10 = r1
        L_0x0135:
            r8[r5] = r10
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r7)
            java.lang.String r6 = com.C2240a.m6772a(r6, r8)
            java.lang.String r8 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(CAM…_license_camera_hint_2)))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r12.f78064r = r2
            org.json.JSONObject r2 = r13.f28947d
            java.lang.String r3 = "camera_tips_vertical"
            java.lang.String r6 = "%s\n%s"
            java.lang.Object[] r8 = new java.lang.Object[r7]
            if (r0 == 0) goto L_0x0164
            android.content.res.Resources r10 = r0.getResources()
            if (r10 == 0) goto L_0x0164
            java.lang.String r9 = r10.getString(r9)
            goto L_0x0165
        L_0x0164:
            r9 = r1
        L_0x0165:
            r8[r4] = r9
            if (r0 == 0) goto L_0x0176
            android.content.res.Resources r9 = r0.getResources()
            if (r9 == 0) goto L_0x0176
            r1 = 2132542488(0x7f1c0418, float:2.0738082E38)
            java.lang.String r1 = r9.getString(r1)
        L_0x0176:
            r8[r5] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r7)
            java.lang.String r1 = com.C2240a.m6772a(r6, r1)
            java.lang.String r6 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r6)
            java.lang.String r1 = r2.optString(r3, r1)
            java.lang.String r2 = "msg.params.optString(CAM…_license_camera_hint_3)))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r12.f78065s = r1
            org.json.JSONObject r13 = r13.f28947d
            java.lang.String r1 = "show_national_emblem"
            boolean r13 = r13.optBoolean(r1, r5)
            r12.f78066t = r13
            boolean r13 = r0 instanceof com.p683ss.android.ugc.aweme.base.activity.C23440s
            if (r13 == 0) goto L_0x01a8
            r13 = r0
            com.ss.android.ugc.aweme.base.activity.s r13 = (com.p683ss.android.ugc.aweme.base.activity.C23440s) r13
            r1 = r12
            com.ss.android.ugc.aweme.base.activity.b r1 = (com.p683ss.android.ugc.aweme.base.activity.C23423b) r1
            r13.mo48604a(r1)
            goto L_0x01bf
        L_0x01a8:
            boolean r13 = r0 instanceof android.support.p043v7.widget.C1447ay
            if (r13 == 0) goto L_0x01fd
            android.support.v7.widget.ay r0 = (android.support.p043v7.widget.C1447ay) r0
            android.content.Context r0 = r0.getBaseContext()
            boolean r13 = r0 instanceof com.p683ss.android.ugc.aweme.base.activity.C23440s
            if (r13 == 0) goto L_0x01fc
            r13 = r0
            com.ss.android.ugc.aweme.base.activity.s r13 = (com.p683ss.android.ugc.aweme.base.activity.C23440s) r13
            r1 = r12
            com.ss.android.ugc.aweme.base.activity.b r1 = (com.p683ss.android.ugc.aweme.base.activity.C23423b) r1
            r13.mo48604a(r1)
        L_0x01bf:
            java.lang.String r13 = "code"
            r14.put(r13, r5)
            r12.f78049b = r4
            c.a.b.b r13 = new c.a.b.b
            r13.<init>()
            r12.f78050c = r13
            android.app.Activity r0 = (android.app.Activity) r0
            r13 = r0
            android.content.Context r13 = (android.content.Context) r13
            int r14 = com.p683ss.android.ugc.aweme.utils.permission.C47946e.m103737c(r13)
            int r13 = com.p683ss.android.ugc.aweme.utils.permission.C47946e.m103734a(r13)
            if (r14 != 0) goto L_0x01e0
            if (r13 != 0) goto L_0x01e0
            r13 = 1
            goto L_0x01e1
        L_0x01e0:
            r13 = 0
        L_0x01e1:
            if (r13 != 0) goto L_0x01f8
            java.lang.String[] r13 = new java.lang.String[r7]
            java.lang.String r14 = "android.permission.CAMERA"
            r13[r4] = r14
            java.lang.String r14 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r13[r5] = r14
            com.ss.android.ugc.aweme.fe.method.p$b r14 = new com.ss.android.ugc.aweme.fe.method.p$b
            r14.<init>(r12, r0)
            com.ss.android.ugc.aweme.ba.b$b r14 = (com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b) r14
            com.p683ss.android.ugc.aweme.p1403ba.C23361b.m57419a(r0, r13, r14)
            return
        L_0x01f8:
            r12.mo60109a(r0)
            goto L_0x01fe
        L_0x01fc:
            return
        L_0x01fd:
            return
        L_0x01fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.C29910p.call(com.bytedance.ies.g.a.h, org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final JSONObject mo60108a(int i, String str, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        C0013i a = m70063a();
        try {
            a.mo36g();
        } catch (InterruptedException unused) {
        }
        String str4 = (String) a.mo34e();
        if (str4 != null) {
            str3 = C47723bk.m103314b(str4);
        } else {
            str3 = null;
        }
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("url", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("img_base64", str3);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }
}
