package com.p683ss.android.ugc.aweme.bullet.bridge.common;

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
import com.bytedance.ies.bullet.p628b.p633e.C10254a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.p675g.p676a.C10757a;
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
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feedback.C31346w;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29881e;
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
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod */
public class UploadFileMethod extends BaseBridgeMethod implements C23423b, C29941b {

    /* renamed from: b */
    protected WeakReference<Context> f64119b;

    /* renamed from: c */
    public int f64120c;

    /* renamed from: d */
    public boolean f64121d;

    /* renamed from: e */
    public C24112a f64122e;

    /* renamed from: f */
    public SparseArray<AvatarUri> f64123f;

    /* renamed from: g */
    public List<String> f64124g;

    /* renamed from: h */
    public AtomicInteger f64125h;

    /* renamed from: i */
    public AtomicInteger f64126i;

    /* renamed from: j */
    public C52670a<C52860x> f64127j;

    /* renamed from: k */
    public boolean f64128k;

    /* renamed from: l */
    public int f64129l;

    /* renamed from: m */
    public String f64130m;

    /* renamed from: n */
    public long f64131n;

    /* renamed from: o */
    private String f64132o = "";

    /* renamed from: p */
    private String f64133p;

    /* renamed from: q */
    private boolean f64134q;

    /* renamed from: r */
    private boolean f64135r;

    /* renamed from: s */
    private List<C9382a> f64136s;

    /* renamed from: t */
    private boolean f64137t;

    /* renamed from: u */
    private float f64138u = 1.0f;

    /* renamed from: v */
    private int f64139v;

    /* renamed from: w */
    private int f64140w;

    /* renamed from: x */
    private C10326b f64141x;

    /* renamed from: d */
    public final String mo18313d() {
        return "uploadFile";
    }

    /* renamed from: k */
    public final void mo49932k() {
        this.f64127j = null;
    }

    /* renamed from: j */
    public final void mo49931j() {
        this.f64122e.mo49910a(0, "H5_uploadFileCancel");
        this.f64128k = true;
    }

    /* renamed from: l */
    private C0013i<String> m59136l() {
        C0027j jVar = new C0027j();
        try {
            if (this.f64134q || !C47723bk.m103311a(this.f64133p)) {
                jVar.mo44a(null);
            } else {
                IAVProcessService processService = AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().processService();
                String str = this.f64133p;
                Integer valueOf = Integer.valueOf(216);
                Integer valueOf2 = Integer.valueOf(384);
                jVar.getClass();
                processService.compressPhoto(str, valueOf, valueOf2, new C24178a(jVar));
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f64134q = false;
            this.f64133p = "";
            throw th;
        }
        this.f64134q = false;
        this.f64133p = "";
        return jVar.f77a;
    }

    public UploadFileMethod(C10326b bVar) {
        super(bVar);
        this.f64141x = bVar;
        if (mo18743e() != null) {
            this.f64119b = new WeakReference<>(mo18743e());
        }
    }

    /* renamed from: a */
    private void m59135a(int i) {
        this.f64136s = new ArrayList();
        for (final int i2 = 0; i2 < i; i2++) {
            this.f64136s.add(new C9382a() {
                public final void handleMsg(Message message) {
                    if (UploadFileMethod.this.f64123f != null && UploadFileMethod.this.f64126i != null && UploadFileMethod.this.f64125h != null && UploadFileMethod.this.f64124g != null && UploadFileMethod.this.f64122e != null && UploadFileMethod.this.f64119b != null && !UploadFileMethod.this.f64128k) {
                        if (message.obj instanceof C23459a) {
                            Context context = (Context) UploadFileMethod.this.f64119b.get();
                            if (context != null) {
                                C10691a.m21545b(context, ((C23459a) message.obj).getErrorMsg()).mo19066a();
                            }
                            UploadFileMethod.this.f64123f.put(i2, new AvatarUri());
                            UploadFileMethod.this.f64126i.incrementAndGet();
                        } else if (message.obj instanceof AvatarUri) {
                            AvatarUri avatarUri = (AvatarUri) message.obj;
                            if (C23715d.m58204b(avatarUri.urlList)) {
                                UploadFileMethod.this.f64123f.put(i2, avatarUri);
                                UploadFileMethod.this.f64125h.incrementAndGet();
                            } else {
                                UploadFileMethod.this.f64123f.put(i2, new AvatarUri());
                                UploadFileMethod.this.f64126i.incrementAndGet();
                            }
                        } else {
                            UploadFileMethod.this.f64123f.put(i2, new AvatarUri());
                            UploadFileMethod.this.f64126i.incrementAndGet();
                        }
                        if (UploadFileMethod.this.f64126i.get() + UploadFileMethod.this.f64125h.get() == UploadFileMethod.this.f64124g.size()) {
                            if (UploadFileMethod.this.f64126i.get() == UploadFileMethod.this.f64124g.size()) {
                                UploadFileMethod.m59133a(UploadFileMethod.this.f64123f);
                                UploadFileMethod.this.f64122e.mo49910a(0, "H5_uploadFileFailed");
                            } else {
                                UploadFileMethod.this.f64122e.mo49912a(UploadFileMethod.m59133a(UploadFileMethod.this.f64123f), 1, "H5_uploadFile");
                            }
                            if (UploadFileMethod.this.f64127j != null) {
                                UploadFileMethod.this.f64127j.invoke();
                            }
                            C31346w.f82109a.mo64225a(UploadFileMethod.this.f64129l);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static JSONArray m59133a(SparseArray<AvatarUri> sparseArray) {
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

    public void handleMsg(Message message) {
        Context context = (Context) this.f64119b.get();
        if (context != null) {
            if (message.obj instanceof C23459a) {
                C10691a.m21545b(context, ((C23459a) message.obj).getErrorMsg()).mo19066a();
                m59134a(0, "", "");
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (avatarUri == null || avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                    m59134a(0, "", "");
                    try {
                        this.f64122e.mo49910a(0, "H5_uploadFileFailed");
                    } catch (Exception unused) {
                    }
                } else {
                    try {
                        this.f64122e.mo49912a(m59134a(1, (String) avatarUri.urlList.get(0), avatarUri.uri), 1, "H5_uploadFile");
                    } catch (Exception unused2) {
                    }
                }
            } else {
                m59134a(0, "", "");
                this.f64122e.mo49910a(0, "H5_uploadFileFailed");
            }
        }
    }

    /* renamed from: a */
    public final void mo49930a(List<String> list, C52670a<C52860x> aVar) {
        if (!C23715d.m58202a((Collection<T>) list)) {
            this.f64127j = aVar;
            this.f64125h = new AtomicInteger(0);
            this.f64126i = new AtomicInteger(0);
            this.f64124g = list;
            this.f64123f = new SparseArray<>();
            m59135a(this.f64124g.size());
            for (int i = 0; i < list.size(); i++) {
                String str = (String) list.get(i);
                if (C9431p.m18664a(str)) {
                    this.f64123f.put(i, new AvatarUri());
                    this.f64126i.incrementAndGet();
                } else {
                    File file = new File(str);
                    if (!file.exists()) {
                        this.f64123f.put(i, new AvatarUri());
                        this.f64126i.incrementAndGet();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Api.f61283c);
                        sb.append("?uid=");
                        sb.append(C20902b.m53242a().getCurUserId());
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(this.f64132o)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(sb2);
                            sb3.append("&source=");
                            sb3.append(this.f64132o);
                            sb2 = sb3.toString();
                        }
                        C20854a.m53161a().userService().uploadAvatar(new C9381g((C9382a) this.f64136s.get(i)), sb2, 4194304, C31346w.f82109a.mo64224a(str, file, this.f64129l), null);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        Context context;
        if (mo49908h() == C10254a.WEB) {
            C10766h a = m58998a(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("res");
            C10757a aVar2 = (C10757a) this.f64141x.mo18401c(C10757a.class);
            if (!(this.f64119b == null || aVar2 == null)) {
                try {
                    new C29881e(this.f64119b, aVar2).call(a, optJSONObject);
                    return;
                } catch (Exception unused) {
                }
            }
            return;
        }
        this.f64122e = aVar;
        String optString = jSONObject.optString("type");
        this.f64132o = jSONObject.optString("source");
        this.f64134q = jSONObject.optBoolean("skip_img_base64", false);
        this.f64120c = jSONObject.optInt("maxSelectNum", 1);
        this.f64135r = jSONObject.optBoolean("isMultiSelect", false);
        this.f64121d = jSONObject.optBoolean("skip_img_base64", false);
        this.f64129l = jSONObject.optInt("image_width", -1);
        this.f64130m = jSONObject.optString("from", "");
        this.f64131n = jSONObject.optLong("maxFileSize", 0);
        this.f64137t = jSONObject.optBoolean("isNeedCut", false);
        this.f64139v = jSONObject.optInt("minImageWidth");
        this.f64140w = jSONObject.optInt("minImageHeight");
        int optInt = jSONObject.optInt("cropRatioWidth", 0);
        int optInt2 = jSONObject.optInt("cropRatioHeight", 0);
        if (optInt * optInt2 != 0) {
            this.f64138u = (((float) optInt2) * 1.0f) / ((float) optInt);
        }
        if ("image".equals(optString)) {
            if (this.f64119b != null) {
                context = (Context) this.f64119b.get();
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
            this.f64128k = false;
            if (this.f64135r) {
                final Activity activity = (Activity) context;
                C23361b.m57419a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
                    /* renamed from: a */
                    public final void mo40906a(String[] strArr, int[] iArr) {
                        if (iArr != null && iArr.length > 0) {
                            if (iArr[0] == 0) {
                                Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
                                intent.putExtra("shouldWithCamera", UploadFileMethod.this.f64121d);
                                intent.putExtra("maxSelectNum", UploadFileMethod.this.f64120c);
                                intent.putExtra("enter_from", UploadFileMethod.this.f64130m);
                                activity.startActivity(intent);
                                C26890h.m65011a("enter_image_choose", new C23089d().mo47829a("enter_from", UploadFileMethod.this.f64130m).f61491a);
                                ImageChooseUploadActivity.f78095i = UploadFileMethod.this;
                                return;
                            }
                            C10691a.m21551c((Context) activity, activity.getString(R.string.co0)).mo19066a();
                            UploadFileMethod.this.mo49931j();
                        }
                    }
                });
                return;
            }
            final Activity activity2 = (Activity) context;
            C23361b.m57419a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
                /* renamed from: a */
                public final void mo40906a(String[] strArr, int[] iArr) {
                    if (iArr != null && iArr.length > 0) {
                        if (iArr[0] == 0) {
                            UploadFileMethod uploadFileMethod = UploadFileMethod.this;
                            Activity activity = activity2;
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
                                        if (UploadFileMethod.this.f64131n == 0 || C2562f.m7491a(file) <= UploadFileMethod.this.f64131n) {
                                            return null;
                                        }
                                        return new C45352b(1, context.getString(R.string.gxe, new Object[]{C47830du.m103470a(UploadFileMethod.this.f64131n)}));
                                    }
                                }).mo91634d(10003);
                            } catch (Exception e) {
                                C32458a.m75143a(e);
                                C19547d.m47841a(activity, null, 10003);
                            }
                        } else {
                            C10691a.m21551c((Context) activity2, activity2.getString(R.string.co0)).mo19066a();
                            UploadFileMethod.this.mo49931j();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private JSONObject m59134a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        C0013i l = m59136l();
        try {
            l.mo36g();
        } catch (InterruptedException unused) {
        }
        String str3 = (String) l.mo34e();
        if (str3 != null) {
            try {
                str3 = C47723bk.m103314b(str3);
            } catch (IOException unused2) {
            }
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
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final boolean mo48596a(int i, int i2, Intent intent) {
        Uri uri;
        if (i == 10003) {
            if (i2 == 0 || intent == null) {
                mo49931j();
                return true;
            }
            Context context = (Context) this.f64119b.get();
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
            } else if (!new File(a2).exists()) {
                C9432q.m18673a(context, 2131952652, (int) R.string.cos);
                return true;
            } else if (this.f64137t) {
                if (context instanceof Activity) {
                    C40733z.f103767a.gotoCropActivity((Activity) context, a2, false, this.f64138u, (int) C9432q.m18687b(context, 16.0f), 10004, this.f64139v, this.f64140w);
                }
                return true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(Api.f61283c);
                sb.append("?uid=");
                sb.append(C20902b.m53242a().getCurUserId());
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(this.f64132o)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("&source=");
                    sb3.append(this.f64132o);
                    sb2 = sb3.toString();
                }
                String str = sb2;
                this.f64133p = a2;
                C20854a.m53161a().userService().uploadAvatar(new C9381g(this), str, 4194304, a2, null);
                return true;
            }
        } else if (i != 10004) {
            return true;
        } else {
            if (i2 == 0 || intent == null) {
                mo49931j();
                return true;
            }
            Context context2 = (Context) this.f64119b.get();
            if (context2 == null) {
                return true;
            }
            String a3 = C19547d.m47839a(context2, intent.getData());
            if (C9431p.m18664a(a3)) {
                C9432q.m18673a(context2, 2131952652, (int) R.string.cos);
                return true;
            } else if (!new File(a3).exists()) {
                C9432q.m18673a(context2, 2131952652, (int) R.string.cos);
                return true;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(Api.f61283c);
                sb4.append("?uid=");
                sb4.append(C20902b.m53242a().getCurUserId());
                String sb5 = sb4.toString();
                if (!TextUtils.isEmpty(this.f64132o)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb5);
                    sb6.append("&source=");
                    sb6.append(this.f64132o);
                    sb5 = sb6.toString();
                }
                String str2 = sb5;
                this.f64133p = a3;
                C20854a.m53161a().userService().uploadAvatar(new C9381g(this), str2, 4194304, a3, null);
                return true;
            }
        }
    }
}
