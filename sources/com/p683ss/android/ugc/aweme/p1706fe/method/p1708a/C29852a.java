package com.p683ss.android.ugc.aweme.p1706fe.method.p1708a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Message;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29848a.C29851a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29908n;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.C29938a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.fe.method.a.a */
public final class C29852a implements C9382a, C29938a {

    /* renamed from: a */
    public String f77933a = "";

    /* renamed from: b */
    public C29908n f77934b;

    /* renamed from: c */
    private String f77935c = "";

    /* renamed from: d */
    private C29856c f77936d;

    /* renamed from: e */
    private WeakReference<Activity> f77937e;

    /* renamed from: f */
    private C29851a f77938f;

    /* renamed from: g */
    private Executor f77939g = C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49845a("takephoto").mo49847a());

    /* renamed from: h */
    private Executor f77940h = C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49845a("uploadphoto").mo49847a());

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a.a$a */
    static class C29854a implements Runnable {

        /* renamed from: a */
        private WeakReference<C29855b> f77943a;

        /* renamed from: b */
        private WeakReference<C29908n> f77944b;

        public final void run() {
            C29855b bVar = (C29855b) this.f77943a.get();
            C29908n nVar = (C29908n) this.f77944b.get();
            if (bVar != null && nVar != null) {
                try {
                    nVar.mo49923a(m70006a(bVar));
                } catch (JSONException unused) {
                    nVar.mo49922a(0, "uploadFailed");
                }
            }
        }

        /* renamed from: a */
        private static C0013i<String> m70005a(String str) {
            C0027j jVar = new C0027j();
            try {
                IAVProcessService processService = AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().processService();
                Integer valueOf = Integer.valueOf(216);
                Integer valueOf2 = Integer.valueOf(384);
                jVar.getClass();
                processService.compressPhoto(str, valueOf, valueOf2, new C29857b(jVar));
            } catch (Exception unused) {
            }
            return jVar.f77a;
        }

        /* renamed from: a */
        private JSONArray m70006a(C29855b bVar) throws JSONException {
            C0013i a = m70005a(bVar.f77947c);
            try {
                a.mo36g();
            } catch (InterruptedException unused) {
            }
            String str = (String) a.mo34e();
            if (str != null) {
                try {
                    str = C47723bk.m103314b(str);
                } catch (IOException unused2) {
                }
            }
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(bVar.f77945a)) {
                jSONObject.put("url", bVar.f77945a);
            }
            if (!TextUtils.isEmpty(bVar.f77946b)) {
                jSONObject.put("uri", bVar.f77946b);
            }
            jSONObject.put("base64", str);
            jSONArray.put(jSONObject);
            return jSONArray;
        }

        C29854a(C29855b bVar, C29908n nVar) {
            this.f77943a = new WeakReference<>(bVar);
            this.f77944b = new WeakReference<>(nVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a.a$b */
    static class C29855b {

        /* renamed from: a */
        public String f77945a;

        /* renamed from: b */
        public String f77946b;

        /* renamed from: c */
        public String f77947c;

        C29855b(String str, String str2, String str3) {
            this.f77945a = str;
            this.f77946b = str2;
            this.f77947c = str3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a.a$c */
    static class C29856c extends AsyncTask<Void, Void, File> {

        /* renamed from: a */
        private WeakReference<Activity> f77948a;

        /* renamed from: b */
        private WeakReference<C29852a> f77949b;

        /* access modifiers changed from: protected */
        public final void onCancelled() {
            C29852a aVar = (C29852a) this.f77949b.get();
            if (aVar != null) {
                aVar.f77934b.mo49922a(0, "uploadCancel");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public File doInBackground(Void... voidArr) {
            Context context = (Context) this.f77948a.get();
            if (context == null) {
                return null;
            }
            try {
                String format = new SimpleDateFormat("yyyy-MMdd_HHmmss").format(new Date());
                StringBuilder sb = new StringBuilder("Dou_fsm_");
                sb.append(format);
                String sb2 = sb.toString();
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
                    externalStoragePublicDirectory = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                }
                if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
                    externalStoragePublicDirectory = context.getFilesDir();
                }
                return File.createTempFile(sb2, ".jpg", externalStoragePublicDirectory);
            } catch (IOException unused) {
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            File file = (File) obj;
            C29852a aVar = (C29852a) this.f77949b.get();
            Activity activity = (Activity) this.f77948a.get();
            if (aVar != null && activity != null) {
                if (file == null) {
                    aVar.f77934b.mo49922a(0, "uploadFailed");
                    return;
                }
                aVar.f77933a = file.getAbsolutePath();
                Uri a = C19547d.m47838a((Context) activity, file);
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", a);
                intent.addFlags(3);
                activity.startActivityForResult(intent, 1);
            }
        }

        C29856c(Activity activity, C29852a aVar) {
            this.f77948a = new WeakReference<>(activity);
            this.f77949b = new WeakReference<>(aVar);
        }
    }

    /* renamed from: a */
    public final void mo60080a() {
    }

    /* renamed from: a */
    public final void mo60081a(Activity activity) {
        if (this.f77936d != null) {
            this.f77936d.cancel(false);
        }
        this.f77936d = new C29856c(activity, this);
        this.f77936d.executeOnExecutor(this.f77939g, new Void[0]);
    }

    /* renamed from: a */
    public final void mo60082a(JSONObject jSONObject) {
        String str;
        final Activity activity = (Activity) this.f77937e.get();
        if (activity == null) {
            this.f77934b.mo49922a(0, "uploadFailed");
            return;
        }
        PackageManager packageManager = activity.getPackageManager();
        if (VERSION.SDK_INT > 16) {
            str = "android.hardware.camera.any";
        } else {
            str = "android.hardware.camera";
        }
        if (!packageManager.hasSystemFeature(str)) {
            this.f77934b.mo49922a(0, "uploadFailed");
        } else if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity.getPackageManager()) == null) {
            this.f77934b.mo49922a(0, "uploadFailed");
        } else {
            this.f77935c = jSONObject.optString("source");
            if (C0726c.m2090a((Context) activity, "android.permission.CAMERA") == 0 && C0726c.m2090a((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                mo60081a(activity);
                return;
            }
            C23361b.m57419a(activity, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
                /* renamed from: a */
                public final void mo40906a(String[] strArr, int[] iArr) {
                    int i;
                    if (strArr.length > 1 && iArr[0] == 0 && iArr[1] == 0) {
                        C29852a.this.mo60081a(activity);
                        return;
                    }
                    if (iArr[0] != 0) {
                        i = R.string.cny;
                    } else {
                        i = R.string.co0;
                    }
                    C10691a.m21543b((Context) activity, i, 0).mo19066a();
                    C29852a.this.f77934b.mo49922a(-1, "uploadFailed");
                }
            });
        }
    }

    public final void handleMsg(Message message) {
        Context context = (Context) this.f77937e.get();
        if (context == null) {
            this.f77934b.mo49922a(0, "uploadFailed");
            return;
        }
        if (message.obj instanceof C23459a) {
            C10691a.m21545b(context, ((C23459a) message.obj).getErrorMsg()).mo19066a();
        } else if (message.obj instanceof AvatarUri) {
            AvatarUri avatarUri = (AvatarUri) message.obj;
            if (avatarUri == null || avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                this.f77934b.mo49922a(0, "uploadFailed");
                return;
            }
            this.f77940h.execute(new C29854a(new C29855b((String) avatarUri.urlList.get(0), avatarUri.uri, this.f77933a), this.f77934b));
        }
        this.f77934b.mo49922a(0, "uploadFailed");
    }

    public C29852a(WeakReference<Activity> weakReference, C29851a aVar, C29908n nVar) {
        this.f77938f = aVar;
        this.f77934b = nVar;
        this.f77937e = weakReference;
    }

    /* renamed from: a */
    public final boolean mo60083a(int i, int i2, Intent intent) {
        if (i2 == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(Api.f61283c);
            sb.append("?uid=");
            sb.append(C20902b.m53242a().getCurUserId());
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(this.f77935c)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("&source=");
                sb3.append(this.f77935c);
                sb2 = sb3.toString();
            }
            String str = sb2;
            this.f77938f.mo60078a();
            Context context = (Context) this.f77937e.get();
            File file = new File(this.f77933a);
            Intent intent2 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent2.setData(Uri.fromFile(file));
            context.sendBroadcast(intent2);
            MediaScannerConnection.scanFile(context, new String[]{file.toString()}, null, null);
            this.f77938f.mo60079a((Context) this.f77937e.get());
            C20902b.m53242a().uploadAvatar(new C9381g(this), str, 8388608, this.f77933a, null);
        } else {
            this.f77934b.mo49922a(0, "uploadFailed");
        }
        return true;
    }
}
