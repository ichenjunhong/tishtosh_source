package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.apm.C8936b;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p493m.C9126a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.services.apm.api.C13222e;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.deviceregister.p1154a.C19005d;
import com.p683ss.android.ugc.aweme.app.p1380j.C23110b;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.io.File;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask */
public final class RheaTraceUploadTask implements LegoTask {
    public static final C35962a Companion = new C35962a(null);

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$a */
    public static final class C35962a {
        private C35962a() {
        }

        public /* synthetic */ C35962a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$b */
    static final class C35963b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ RheaTraceUploadTask f92189a;

        /* renamed from: b */
        final /* synthetic */ File f92190b;

        C35963b(RheaTraceUploadTask rheaTraceUploadTask, File file) {
            this.f92189a = rheaTraceUploadTask;
            this.f92190b = file;
        }

        public final /* synthetic */ Object call() {
            try {
                this.f92189a.uploadTraceFile(this.f92190b, "_atrace");
            } catch (Exception unused) {
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$c */
    static final class C35964c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ RheaTraceUploadTask f92191a;

        /* renamed from: b */
        final /* synthetic */ File f92192b;

        C35964c(RheaTraceUploadTask rheaTraceUploadTask, File file) {
            this.f92191a = rheaTraceUploadTask;
            this.f92192b = file;
        }

        public final /* synthetic */ Object call() {
            try {
                this.f92191a.uploadTraceFile(this.f92192b, "_fake_trace");
            } catch (Exception unused) {
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d */
    public static final class C35965d implements C13222e {

        /* renamed from: a */
        final /* synthetic */ File f92193a;

        /* renamed from: a */
        public final void mo24810a(String str) {
            C52711k.m112240b(str, "msg");
        }

        /* renamed from: a */
        public final void mo24809a() {
            this.f92193a.delete();
        }

        C35965d(File file) {
            this.f92193a = file;
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    private final JSONObject buildCommonParams() {
        JSONObject jSONObject = new JSONObject();
        Map h = C8976c.m17752h();
        C52711k.m112236a((Object) h, "ApmContext.getQueryParamsMap()");
        for (Entry entry : h.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        return jSONObject;
    }

    private final void uploadATrace(Context context) {
        File uploadFile = getUploadFile("ATrace", context);
        if (uploadFile.exists() && NetworkUtils.isWifi(context) && C8936b.m17658a("upload_rhea_atrace_file")) {
            C0013i.m16a((Callable<TResult>) new C35963b<TResult>(this, uploadFile));
        }
    }

    private final void uploadFakeTrace(Context context) {
        File uploadFile = getUploadFile("MTrace", context);
        if (uploadFile.exists() && NetworkUtils.isWifi(context) && C8936b.m17658a("upload_rhea_fake_trace_file")) {
            C0013i.m16a((Callable<TResult>) new C35964c<TResult>(this, uploadFile));
        }
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        try {
            boolean z = true;
            if (!C52830p.m112406a("ATrace", C23110b.f61533a, true)) {
                if (!C52830p.m112406a("MTrace", C23110b.f61533a, true)) {
                    z = false;
                }
            }
            if (z) {
                String str = "disabled";
                int hashCode = str.hashCode();
                if (hashCode != -2009454344) {
                    if (hashCode == 1941963140) {
                        if (str.equals("ATrace")) {
                            uploadATrace(context);
                        }
                    }
                } else if (str.equals("MTrace")) {
                    uploadFakeTrace(context);
                }
            }
        } catch (Exception unused) {
        }
    }

    private final File getUploadFile(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        File filesDir = context.getFilesDir();
        C52711k.m112236a((Object) filesDir, "context.filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append("/rhea");
        String sb2 = sb.toString();
        if (C52711k.m112239a((Object) str, (Object) "ATrace")) {
            return new File(sb2, "rhea_startup.trace");
        }
        return new File(sb2, "rhea_startup.fake");
    }

    public final void uploadTraceFile(File file, String str) {
        C9126a aVar = new C9126a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11010c.m22286g());
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.valueOf(C19005d.m46186b()));
        aVar.mo16491a(sb3.toString(), "66812471934", sb2, C52575l.m112092a(file.getAbsolutePath()), "rhea_trace_upload", buildCommonParams(), new C35965d(file));
    }
}
