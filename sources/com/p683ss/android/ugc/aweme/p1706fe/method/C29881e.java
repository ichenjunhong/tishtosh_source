package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.support.p043v7.widget.C1447ay;
import android.text.TextUtils;
import android.util.SparseArray;
import com.aweme.storage.C2562f;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23423b;
import com.p683ss.android.ugc.aweme.base.activity.C23440s;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feedback.C31346w;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.C29941b;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.ImageChooseUploadActivity;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.utils.C47830du;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.C45331a;
import com.zhihu.matisse.C45333b;
import com.zhihu.matisse.internal.entity.C45352b;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.p2249a.C45332a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.fe.method.e */
public final class C29881e implements C10762d, C23423b, C29941b {

    /* renamed from: a */
    protected WeakReference<Context> f77985a;

    /* renamed from: b */
    protected C10757a f77986b;

    /* renamed from: c */
    public long f77987c;

    /* renamed from: d */
    private String f77988d = "";

    /* renamed from: e */
    private String f77989e;

    /* renamed from: f */
    private boolean f77990f;

    /* renamed from: g */
    private int f77991g;

    /* renamed from: h */
    private boolean f77992h;

    /* renamed from: i */
    private boolean f77993i;

    /* renamed from: j */
    private boolean f77994j;

    /* renamed from: k */
    private SparseArray<AvatarUri> f77995k;

    /* renamed from: l */
    private List<String> f77996l;

    /* renamed from: m */
    private AtomicInteger f77997m;

    /* renamed from: n */
    private AtomicInteger f77998n;

    /* renamed from: o */
    private C52670a<C52860x> f77999o;

    /* renamed from: p */
    private List<C9382a> f78000p;

    /* renamed from: q */
    private boolean f78001q;

    /* renamed from: r */
    private int f78002r;

    /* renamed from: s */
    private String f78003s;

    /* renamed from: t */
    private boolean f78004t;

    /* renamed from: u */
    private float f78005u = 1.0f;

    /* renamed from: v */
    private int f78006v;

    /* renamed from: w */
    private int f78007w;

    /* renamed from: k */
    public final void mo49932k() {
        this.f77999o = null;
    }

    /* renamed from: a */
    public final boolean mo48596a(int i, int i2, Intent intent) {
        Uri uri;
        if (i == 10003) {
            if (i2 == 0 || intent == null) {
                m70031a("image", "1");
                return true;
            }
            Context context = (Context) this.f77985a.get();
            if (context == null) {
                return true;
            }
            List a = C45331a.m98818a(intent);
            if (a == null || a.isEmpty()) {
                uri = intent.getData();
            } else {
                uri = (Uri) a.get(0);
            }
            String a2 = C19547d.m47839a(context, uri);
            if (C9431p.m18664a(a2)) {
                C9432q.m18673a(context, 2131952652, (int) R.string.cos);
                return true;
            }
            File file = new File(a2);
            if (!file.exists()) {
                C9432q.m18673a(context, 2131952652, (int) R.string.cos);
                return true;
            } else if (this.f78004t) {
                if (context instanceof Activity) {
                    C40733z.f103767a.gotoCropActivity((Activity) context, a2, false, this.f78005u, (int) C9432q.m18687b(context, 16.0f), 10004, this.f78006v, this.f78007w);
                }
                return true;
            } else {
                this.f77989e = a2;
                if (this.f77994j) {
                    m70030a(file);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Api.f61283c);
                    sb.append("?uid=");
                    sb.append(C20902b.m53242a().getCurUserId());
                    String sb2 = sb.toString();
                    if (!TextUtils.isEmpty(this.f77988d)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(sb2);
                        sb3.append("&source=");
                        sb3.append(this.f77988d);
                        sb2 = sb3.toString();
                    }
                    C20854a.m53161a().userService().uploadAvatar(new C9381g(this), sb2, 4194304, a2, null);
                }
                return true;
            }
        } else if (i != 10004) {
            return true;
        } else {
            if (i2 == 0 || intent == null) {
                m70031a("image", "1");
                return true;
            }
            Context context2 = (Context) this.f77985a.get();
            if (context2 == null) {
                return true;
            }
            String a3 = C19547d.m47839a(context2, intent.getData());
            if (C9431p.m18664a(a3)) {
                C9432q.m18673a(context2, 2131952652, (int) R.string.cos);
                return true;
            }
            File file2 = new File(a3);
            if (!file2.exists()) {
                C9432q.m18673a(context2, 2131952652, (int) R.string.cos);
                return true;
            }
            this.f77989e = a3;
            if (this.f77994j) {
                m70030a(file2);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(Api.f61283c);
                sb4.append("?uid=");
                sb4.append(C20902b.m53242a().getCurUserId());
                String sb5 = sb4.toString();
                if (!TextUtils.isEmpty(this.f77988d)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb5);
                    sb6.append("&source=");
                    sb6.append(this.f77988d);
                    sb5 = sb6.toString();
                }
                C20854a.m53161a().userService().uploadAvatar(new C9381g(this), sb5, 4194304, a3, null);
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo49930a(List<String> list, C52670a<C52860x> aVar) {
        if (!C23715d.m58202a((Collection<T>) list)) {
            this.f77999o = aVar;
            this.f77997m = new AtomicInteger(0);
            this.f77998n = new AtomicInteger(0);
            this.f77996l = list;
            this.f77995k = new SparseArray<>();
            m70029a(this.f77996l.size());
            for (int i = 0; i < list.size(); i++) {
                String str = (String) list.get(i);
                if (C9431p.m18664a(str)) {
                    this.f77995k.put(i, new AvatarUri());
                    this.f77998n.incrementAndGet();
                } else {
                    File file = new File(str);
                    if (!file.exists()) {
                        this.f77995k.put(i, new AvatarUri());
                        this.f77998n.incrementAndGet();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Api.f61283c);
                        sb.append("?uid=");
                        sb.append(C20902b.m53242a().getCurUserId());
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(this.f77988d)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(sb2);
                            sb3.append("&source=");
                            sb3.append(this.f77988d);
                            sb2 = sb3.toString();
                        }
                        C20854a.m53161a().userService().uploadAvatar(new C9381g((C9382a) this.f78000p.get(i)), sb2, 4194304, C31346w.f82109a.mo64224a(str, file, this.f78002r), null);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60096a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFile");
        } catch (JSONException unused) {
        }
        if (this.f77986b != null) {
            this.f77986b.mo19458b("H5_uploadFile", jSONObject2);
        }
    }

    /* renamed from: j */
    public final void mo49931j() {
        m70031a("image", "1");
        this.f78001q = true;
    }

    /* renamed from: a */
    private C0013i<String> m70027a() {
        C0027j jVar = new C0027j();
        try {
            if (this.f77990f || !C47723bk.m103311a(this.f77989e)) {
                jVar.mo44a(null);
            } else {
                IAVProcessService processService = AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().processService();
                String str = this.f77989e;
                Integer valueOf = Integer.valueOf(216);
                Integer valueOf2 = Integer.valueOf(384);
                jVar.getClass();
                processService.compressPhoto(str, valueOf, valueOf2, new C29900h(jVar));
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f77990f = false;
            this.f77989e = "";
            throw th;
        }
        this.f77990f = false;
        this.f77989e = "";
        return jVar.f77a;
    }

    /* renamed from: a */
    private void m70030a(File file) {
        C0013i.m16a((Callable<TResult>) new C29904j<TResult>(this, file));
    }

    /* renamed from: a */
    private void m70029a(int i) {
        this.f78000p = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            this.f78000p.add(new C29901i(this, i2));
        }
    }

    public final void handleMsg(Message message) {
        JSONObject jSONObject;
        Context context = (Context) this.f77985a.get();
        if (context != null) {
            if (message.obj instanceof C23459a) {
                C10691a.m21545b(context, ((C23459a) message.obj).getErrorMsg()).mo19066a();
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                    jSONObject = mo60093a(0, "", "");
                } else {
                    jSONObject = mo60093a(1, (String) avatarUri.urlList.get(0), avatarUri.uri);
                }
                mo60096a("image", jSONObject);
            }
            jSONObject = mo60093a(0, "", "");
            mo60096a("image", jSONObject);
        }
    }

    /* renamed from: a */
    private static JSONArray m70028a(SparseArray<AvatarUri> sparseArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            String str = "";
            String str2 = "";
            if (sparseArray.get(i) != null && C23715d.m58204b(((AvatarUri) sparseArray.get(i)).urlList)) {
                str = ((AvatarUri) sparseArray.get(i)).uri;
                str2 = (String) ((AvatarUri) sparseArray.get(i)).urlList.get(0);
            }
            try {
                jSONObject.put("url", str2);
                jSONObject.put("uri", str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public C29881e(WeakReference<Context> weakReference, C10757a aVar) {
        this.f77985a = weakReference;
        this.f77986b = aVar;
    }

    /* renamed from: a */
    private void m70031a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str2);
            jSONObject.put("code", 1);
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFileCancel");
        } catch (JSONException unused) {
        }
        if (this.f77986b != null) {
            this.f77986b.mo19458b("H5_uploadFileCancel", jSONObject2);
        }
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        Context context;
        String string = hVar.f28947d.getString("type");
        this.f77988d = "";
        if (TextUtils.equals("image", string)) {
            this.f77988d = hVar.f28947d.optString("source");
            this.f77990f = hVar.f28947d.optBoolean("skip_img_base64", false);
            this.f77991g = hVar.f28947d.optInt("maxSelectNum", 1);
            this.f77992h = hVar.f28947d.optBoolean("isMultiSelect", false);
            this.f77993i = hVar.f28947d.optBoolean("skip_img_base64", false);
            this.f77994j = hVar.f28947d.optBoolean("use_sensitive_server", false);
            this.f78002r = hVar.f28947d.optInt("image_width", -1);
            this.f78003s = hVar.f28947d.optString("from", "");
            this.f77987c = hVar.f28947d.optLong("maxFileSize", 0);
            this.f78004t = hVar.f28947d.optBoolean("isNeedCut", false);
            this.f78006v = hVar.f28947d.optInt("minImageWidth");
            this.f78007w = hVar.f28947d.optInt("minImageHeight");
            int optInt = hVar.f28947d.optInt("cropRatioWidth", 0);
            int optInt2 = hVar.f28947d.optInt("cropRatioHeight", 0);
            if (optInt * optInt2 != 0) {
                this.f78005u = (((float) optInt2) * 1.0f) / ((float) optInt);
            }
            if (this.f77985a != null) {
                context = (Context) this.f77985a.get();
            } else {
                context = null;
            }
            if (context instanceof C23440s) {
                ((C23440s) context).mo48604a(this);
            } else if (context instanceof C1447ay) {
                context = ((C1447ay) context).getBaseContext();
                if (context instanceof C23440s) {
                    ((C23440s) context).mo48604a(this);
                } else {
                    return;
                }
            } else {
                return;
            }
            jSONObject.put("code", 1);
            this.f78001q = false;
            if (this.f77992h) {
                Activity activity = (Activity) context;
                C23361b.m57419a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C29899g(this, activity));
                return;
            }
            Activity activity2 = (Activity) context;
            C23361b.m57419a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C29884f(this, activity2));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo60094a(int i, Message message) {
        if (this.f77995k != null && this.f77998n != null && this.f77997m != null && this.f77996l != null && this.f77985a != null && !this.f78001q) {
            if (message.obj instanceof C23459a) {
                Context context = (Context) this.f77985a.get();
                if (context != null) {
                    C10691a.m21545b(context, ((C23459a) message.obj).getErrorMsg()).mo19066a();
                }
                this.f77995k.put(i, new AvatarUri());
                this.f77998n.incrementAndGet();
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (C23715d.m58204b(avatarUri.urlList)) {
                    this.f77995k.put(i, avatarUri);
                    this.f77997m.incrementAndGet();
                } else {
                    this.f77995k.put(i, new AvatarUri());
                    this.f77998n.incrementAndGet();
                }
            } else {
                this.f77995k.put(i, new AvatarUri());
                this.f77998n.incrementAndGet();
            }
            if (this.f77998n.get() + this.f77997m.get() == this.f77996l.size()) {
                if (this.f77998n.get() == this.f77996l.size()) {
                    mo60096a("image", mo60093a(0, "", ""));
                } else {
                    JSONArray a = m70028a(this.f77995k);
                    String str = "image";
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", str);
                        jSONObject.put("args", a);
                        jSONObject.put("msg", "H5_uploadFile");
                    } catch (JSONException unused) {
                    }
                    if (this.f77986b != null) {
                        this.f77986b.mo19458b("H5_uploadFile", jSONObject);
                    }
                }
                if (this.f77999o != null) {
                    this.f77999o.invoke();
                }
                C31346w.f82109a.mo64225a(this.f78002r);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo60097b(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                try {
                    C45331a.m98815a(activity).mo91622a(C45333b.ofImage()).mo91630a(true).mo91632b(false).mo91631b(1).mo91633c(-1).mo91628a((int) R.style.hh).mo91629a((C45332a) new C45332a() {
                        /* renamed from: a */
                        public final C45352b mo49933a(Context context, Item item) {
                            String a = C19547d.m47839a(context, item.f114655c);
                            if (C9431p.m18664a(a)) {
                                return new C45352b(1, context.getString(R.string.coz));
                            }
                            File file = new File(a);
                            if (!file.exists()) {
                                return new C45352b(1, context.getString(R.string.coz));
                            }
                            if (C29881e.this.f77987c == 0 || C2562f.m7491a(file) <= C29881e.this.f77987c) {
                                return null;
                            }
                            return new C45352b(1, context.getString(R.string.gxe, new Object[]{C47830du.m103470a(C29881e.this.f77987c)}));
                        }
                    }).mo91634d(10003);
                } catch (Exception e) {
                    C32458a.m75143a(e);
                    C19547d.m47841a(activity, null, 10003);
                }
            } else {
                C10691a.m21551c((Context) activity, activity.getString(R.string.co0)).mo19066a();
                mo49931j();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[Catch:{ JSONException -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036 A[Catch:{ JSONException -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041 A[Catch:{ JSONException -> 0x0046 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo60093a(int r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            a.i r1 = r4.m70027a()
            r1.mo36g()     // Catch:{ InterruptedException -> 0x000c }
        L_0x000c:
            java.lang.String r2 = ""
            java.lang.Object r3 = r1.mo34e()
            if (r3 == 0) goto L_0x001f
            java.lang.Object r1 = r1.mo34e()     // Catch:{ IOException -> 0x001f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x001f }
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47723bk.m103314b(r1)     // Catch:{ IOException -> 0x001f }
            goto L_0x0020
        L_0x001f:
            r1 = r2
        L_0x0020:
            java.lang.String r2 = "code"
            r0.put(r2, r5)     // Catch:{ JSONException -> 0x0046 }
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0046 }
            if (r5 != 0) goto L_0x0030
            java.lang.String r5 = "url"
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x0046 }
        L_0x0030:
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0046 }
            if (r5 != 0) goto L_0x003b
            java.lang.String r5 = "uri"
            r0.put(r5, r7)     // Catch:{ JSONException -> 0x0046 }
        L_0x003b:
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0046 }
            if (r5 != 0) goto L_0x0046
            java.lang.String r5 = "img_base64"
            r0.put(r5, r1)     // Catch:{ JSONException -> 0x0046 }
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.C29881e.mo60093a(int, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo60095a(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
                intent.putExtra("shouldWithCamera", this.f77993i);
                intent.putExtra("maxSelectNum", this.f77991g);
                intent.putExtra("enter_from", this.f78003s);
                activity.startActivity(intent);
                C26890h.m65011a("enter_image_choose", new C23089d().mo47829a("enter_from", this.f78003s).f61491a);
                ImageChooseUploadActivity.f78095i = this;
                return;
            }
            C10691a.m21551c((Context) activity, activity.getString(R.string.co0)).mo19066a();
            m70031a("image", "0");
        }
    }
}
