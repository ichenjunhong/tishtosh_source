package com.p683ss.android.ugc.aweme.p1706fe.method.upload;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.support.p030v4.content.C0726c;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feedback.C31346w;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29848a.C29851a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29908n;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d */
public final class C29951d implements C9382a, C29938a, C29941b {

    /* renamed from: j */
    public static final C29952a f78175j = new C29952a(null);

    /* renamed from: a */
    public int f78176a;

    /* renamed from: b */
    public boolean f78177b;

    /* renamed from: c */
    public HashMap<Integer, AvatarUri> f78178c;

    /* renamed from: d */
    public List<String> f78179d;

    /* renamed from: e */
    public AtomicInteger f78180e;

    /* renamed from: f */
    public AtomicInteger f78181f;

    /* renamed from: g */
    public C52670a<C52860x> f78182g;

    /* renamed from: h */
    public final WeakReference<Activity> f78183h;

    /* renamed from: i */
    public final C29908n f78184i;

    /* renamed from: k */
    private int f78185k = 1;

    /* renamed from: l */
    private String f78186l = "";

    /* renamed from: m */
    private boolean f78187m;

    /* renamed from: n */
    private String f78188n = "";

    /* renamed from: o */
    private String f78189o = "";

    /* renamed from: p */
    private List<C9382a> f78190p;

    /* renamed from: q */
    private final C29851a f78191q;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$a */
    public static final class C29952a {
        private C29952a() {
        }

        public /* synthetic */ C29952a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$b */
    static final class C29953b {

        /* renamed from: a */
        public final String f78192a;

        /* renamed from: b */
        public final String f78193b;

        /* renamed from: c */
        public final String f78194c;

        public C29953b(String str, String str2, String str3) {
            C52711k.m112240b(str, "url");
            C52711k.m112240b(str2, "uri");
            C52711k.m112240b(str3, "fileName");
            this.f78192a = str;
            this.f78193b = str2;
            this.f78194c = str3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$c */
    public static final class C29954c implements IProcessCallback<String> {

        /* renamed from: a */
        final /* synthetic */ C0027j f78195a;

        C29954c(C0027j jVar) {
            this.f78195a = jVar;
        }

        public final /* synthetic */ void finish(Object obj) {
            this.f78195a.mo44a((String) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$d */
    static final class C29955d implements C9382a {

        /* renamed from: a */
        final /* synthetic */ C29951d f78196a;

        /* renamed from: b */
        final /* synthetic */ int f78197b;

        C29955d(C29951d dVar, int i) {
            this.f78196a = dVar;
            this.f78197b = i;
        }

        public final void handleMsg(Message message) {
            if (!this.f78196a.f78177b) {
                if (message.obj instanceof C23459a) {
                    Activity activity = (Activity) this.f78196a.f78183h.get();
                    if (activity != null) {
                        Context context = activity;
                        Object obj = message.obj;
                        if (obj != null) {
                            C10691a.m21545b(context, ((C23459a) obj).getErrorMsg()).mo19066a();
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                        }
                    }
                    C29951d.m70088a(this.f78196a).incrementAndGet();
                } else if (message.obj instanceof AvatarUri) {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        AvatarUri avatarUri = (AvatarUri) obj2;
                        if (C23715d.m58204b(avatarUri.urlList)) {
                            C29951d.m70090b(this.f78196a).put(Integer.valueOf(this.f78197b), avatarUri);
                            C29951d.m70091c(this.f78196a).incrementAndGet();
                        } else {
                            C29951d.m70088a(this.f78196a).incrementAndGet();
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
                    }
                } else {
                    C29951d.m70088a(this.f78196a).incrementAndGet();
                }
                if (C29951d.m70088a(this.f78196a).get() + C29951d.m70091c(this.f78196a).get() == C29951d.m70092d(this.f78196a).size()) {
                    int size = C29951d.m70092d(this.f78196a).size();
                    int i = C29951d.m70091c(this.f78196a).get();
                    if (i == 0) {
                        this.f78196a.f78184i.mo49922a(0, "uploadFailedAll");
                        C52670a<C52860x> aVar = this.f78196a.f78182g;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        C31346w.f82109a.mo64225a(this.f78196a.f78176a);
                    } else if (i >= 0 && size > i) {
                        this.f78196a.f78184i.mo49922a(0, "uploadFailed");
                        C52670a<C52860x> aVar2 = this.f78196a.f78182g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        C31346w.f82109a.mo64225a(this.f78196a.f78176a);
                    } else if (i == size) {
                        ArrayList arrayList = new ArrayList();
                        int size2 = C29951d.m70092d(this.f78196a).size();
                        int i2 = 0;
                        while (true) {
                            List<String> list = null;
                            if (i2 >= size2) {
                                break;
                            }
                            AvatarUri avatarUri2 = (AvatarUri) C29951d.m70090b(this.f78196a).get(Integer.valueOf(i2));
                            if (avatarUri2 != null) {
                                list = avatarUri2.urlList;
                            }
                            if (list != null) {
                                List<String> list2 = avatarUri2.urlList;
                                C52711k.m112236a((Object) list2, "uri.urlList");
                                if (!list2.isEmpty()) {
                                    String str = (String) avatarUri2.urlList.get(0);
                                    C52711k.m112236a((Object) str, "url");
                                    String str2 = avatarUri2.uri;
                                    C52711k.m112236a((Object) str2, "uri.uri");
                                    arrayList.add(new C29953b(str, str2, (String) C29951d.m70092d(this.f78196a).get(this.f78197b)));
                                }
                            }
                            i2++;
                        }
                        if (arrayList.size() == C29951d.m70090b(this.f78196a).size()) {
                            this.f78196a.mo60138a((C29953b) null, arrayList);
                            return;
                        }
                        this.f78196a.f78184i.mo49922a(0, "uploadFailed");
                        C52670a<C52860x> aVar3 = this.f78196a.f78182g;
                        if (aVar3 != null) {
                            aVar3.invoke();
                        }
                        C31346w.f82109a.mo64225a(this.f78196a.f78176a);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$e */
    static final class C29956e implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C29951d f78198a;

        /* renamed from: b */
        final /* synthetic */ Activity f78199b;

        C29956e(C29951d dVar, Activity activity) {
            this.f78198a = dVar;
            this.f78199b = activity;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            boolean z;
            C52711k.m112236a((Object) iArr, "grantResults");
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (iArr[0] == 0) {
                    C19547d.m47841a(this.f78199b, null, 10003);
                } else {
                    C10691a.m21551c((Context) this.f78199b, this.f78199b.getString(R.string.co0)).mo19066a();
                    this.f78198a.f78184i.mo49922a(-1, "uploadFailed");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$f */
    static final class C29957f implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C29951d f78200a;

        /* renamed from: b */
        final /* synthetic */ Activity f78201b;

        C29957f(C29951d dVar, Activity activity) {
            this.f78200a = dVar;
            this.f78201b = activity;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            boolean z;
            C52711k.m112236a((Object) iArr, "grantResults");
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (iArr[0] == 0) {
                    this.f78200a.mo60137a(this.f78201b);
                } else {
                    C10691a.m21551c((Context) this.f78201b, this.f78201b.getString(R.string.co0)).mo19066a();
                    this.f78200a.f78184i.mo49922a(-1, "uploadFailed");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$g */
    static final class C29958g<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C29951d f78202a;

        /* renamed from: b */
        final /* synthetic */ C29953b f78203b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f78204c;

        C29958g(C29951d dVar, C29953b bVar, ArrayList arrayList) {
            this.f78202a = dVar;
            this.f78203b = bVar;
            this.f78204c = arrayList;
        }

        public final /* synthetic */ Object call() {
            if (this.f78203b != null) {
                this.f78204c.add(this.f78203b);
            }
            return this.f78202a.mo60136a((List<C29953b>) this.f78204c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$h */
    static final class C29959h<TTaskResult, TContinuationResult> implements C0011g<JSONArray, Object> {

        /* renamed from: a */
        final /* synthetic */ C29951d f78205a;

        /* renamed from: b */
        final /* synthetic */ C29953b f78206b;

        C29959h(C29951d dVar, C29953b bVar) {
            this.f78205a = dVar;
            this.f78206b = bVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (!this.f78205a.f78177b) {
                C52711k.m112236a((Object) iVar, "it");
                if (iVar.mo34e() != null) {
                    this.f78205a.f78184i.mo49923a((JSONArray) iVar.mo34e());
                } else {
                    this.f78205a.f78184i.mo49922a(0, "uploadFailed");
                }
                if (this.f78206b == null) {
                    C52670a<C52860x> aVar = this.f78205a.f78182g;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    C31346w.f82109a.mo64225a(this.f78205a.f78176a);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo60080a() {
    }

    /* renamed from: k */
    public final void mo49932k() {
        this.f78182g = null;
    }

    /* renamed from: a */
    public final boolean mo60083a(int i, int i2, Intent intent) {
        if (i2 == 0 || intent == null) {
            this.f78184i.mo49922a(0, "uploadCancel");
            return true;
        }
        Activity activity = (Activity) this.f78183h.get();
        if (activity == null) {
            this.f78184i.mo49922a(0, "uploadFailed");
            return true;
        }
        Context context = activity;
        String a = C19547d.m47839a(context, intent.getData());
        if (C9431p.m18664a(a)) {
            C9432q.m18673a(context, 2131952652, (int) R.string.cos);
            this.f78184i.mo49922a(0, "uploadFailed");
            return true;
        } else if (!new File(a).exists()) {
            C9432q.m18673a(context, 2131952652, (int) R.string.cos);
            this.f78184i.mo49922a(0, "uploadFailed");
            return true;
        } else {
            C18922i iVar = new C18922i(Api.f61283c);
            IAccountUserService userService = C20854a.m53161a().userService();
            C52711k.m112236a((Object) userService, "AccountProxyService.get().userService()");
            iVar.mo38778a("uid", userService.getCurUserId());
            iVar.mo38778a("source", this.f78186l);
            String a2 = iVar.mo38774a();
            C52711k.m112236a((Object) a, "fileName");
            this.f78189o = a;
            this.f78191q.mo60079a(context);
            C20854a.m53161a().userService().uploadAvatar(new C9381g(this), a2, 8388608, a, null);
            return true;
        }
    }

    /* renamed from: j */
    public final void mo49931j() {
        this.f78184i.mo49922a(0, "uploadCancel");
        this.f78177b = true;
    }

    /* renamed from: a */
    public static final /* synthetic */ AtomicInteger m70088a(C29951d dVar) {
        AtomicInteger atomicInteger = dVar.f78181f;
        if (atomicInteger == null) {
            C52711k.m112237a("mMultiUploadFailNum");
        }
        return atomicInteger;
    }

    /* renamed from: b */
    public static final /* synthetic */ HashMap m70090b(C29951d dVar) {
        HashMap<Integer, AvatarUri> hashMap = dVar.f78178c;
        if (hashMap == null) {
            C52711k.m112237a("mAvatarUriList");
        }
        return hashMap;
    }

    /* renamed from: c */
    public static final /* synthetic */ AtomicInteger m70091c(C29951d dVar) {
        AtomicInteger atomicInteger = dVar.f78180e;
        if (atomicInteger == null) {
            C52711k.m112237a("mMultiUploadSuccessNum");
        }
        return atomicInteger;
    }

    /* renamed from: d */
    public static final /* synthetic */ List m70092d(C29951d dVar) {
        List<String> list = dVar.f78179d;
        if (list == null) {
            C52711k.m112237a("mFileNameList");
        }
        return list;
    }

    /* renamed from: a */
    private static C0013i<String> m70087a(String str) {
        C0027j jVar = new C0027j();
        try {
            AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().processService().compressPhoto(str, Integer.valueOf(216), Integer.valueOf(384), new C29954c(jVar));
        } catch (Exception unused) {
            jVar.mo44a(null);
        }
        C0013i<TResult> iVar = jVar.f77a;
        C52711k.m112236a((Object) iVar, "taskCompletionSource.task");
        return iVar;
    }

    /* renamed from: a */
    private final void m70089a(int i) {
        this.f78190p = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            C9382a dVar = new C29955d(this, i2);
            List<C9382a> list = this.f78190p;
            if (list == null) {
                C52711k.m112237a("mIHandlerList");
            }
            list.add(dVar);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d A[Catch:{ IOException -> 0x0054 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONArray mo60136a(java.util.List<com.p683ss.android.ugc.aweme.p1706fe.method.upload.C29951d.C29953b> r6) {
        /*
            r5 = this;
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x005f }
            r0.<init>()     // Catch:{ JSONException -> 0x005f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ JSONException -> 0x005f }
        L_0x0009:
            boolean r1 = r6.hasNext()     // Catch:{ JSONException -> 0x005f }
            if (r1 == 0) goto L_0x0060
            java.lang.Object r1 = r6.next()     // Catch:{ JSONException -> 0x005f }
            com.ss.android.ugc.aweme.fe.method.upload.d$b r1 = (com.p683ss.android.ugc.aweme.p1706fe.method.upload.C29951d.C29953b) r1     // Catch:{ JSONException -> 0x005f }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005f }
            r2.<init>()     // Catch:{ JSONException -> 0x005f }
            java.lang.String r3 = r1.f78192a     // Catch:{ JSONException -> 0x005f }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ JSONException -> 0x005f }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x005f }
            if (r3 != 0) goto L_0x002b
            java.lang.String r3 = "url"
            java.lang.String r4 = r1.f78192a     // Catch:{ JSONException -> 0x005f }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x005f }
        L_0x002b:
            java.lang.String r3 = r1.f78193b     // Catch:{ JSONException -> 0x005f }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ JSONException -> 0x005f }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x005f }
            if (r3 != 0) goto L_0x003c
            java.lang.String r3 = "uri"
            java.lang.String r4 = r1.f78193b     // Catch:{ JSONException -> 0x005f }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x005f }
        L_0x003c:
            java.lang.String r1 = r1.f78194c     // Catch:{ JSONException -> 0x005f }
            a.i r1 = m70087a(r1)     // Catch:{ JSONException -> 0x005f }
            r1.mo36g()     // Catch:{ InterruptedException -> 0x0045 }
        L_0x0045:
            java.lang.Object r1 = r1.mo34e()     // Catch:{ IOException -> 0x0054 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x0054 }
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = ""
        L_0x004f:
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47723bk.m103314b(r1)     // Catch:{ IOException -> 0x0054 }
            goto L_0x0056
        L_0x0054:
            java.lang.String r1 = ""
        L_0x0056:
            java.lang.String r3 = "base64"
            r2.put(r3, r1)     // Catch:{ JSONException -> 0x005f }
            r0.put(r2)     // Catch:{ JSONException -> 0x005f }
            goto L_0x0009
        L_0x005f:
            r0 = 0
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.upload.C29951d.mo60136a(java.util.List):org.json.JSONArray");
    }

    public final void handleMsg(Message message) {
        this.f78191q.mo60078a();
        Activity activity = (Activity) this.f78183h.get();
        if (activity == null || message == null) {
            this.f78184i.mo49922a(0, "uploadFailed");
            return;
        }
        if (message.obj instanceof C23459a) {
            Context context = activity;
            Object obj = message.obj;
            if (obj != null) {
                C10691a.m21545b(context, ((C23459a) obj).getErrorMsg()).mo19066a();
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            }
        } else if (message.obj instanceof AvatarUri) {
            Object obj2 = message.obj;
            if (obj2 != null) {
                AvatarUri avatarUri = (AvatarUri) obj2;
                if (avatarUri.urlList != null) {
                    List<String> list = avatarUri.urlList;
                    C52711k.m112236a((Object) list, "uri.urlList");
                    if (!list.isEmpty()) {
                        String str = (String) avatarUri.urlList.get(0);
                        C52711k.m112236a((Object) str, "url");
                        String str2 = avatarUri.uri;
                        C52711k.m112236a((Object) str2, "uri.uri");
                        mo60138a(new C29953b(str, str2, this.f78189o), new ArrayList<>());
                        return;
                    }
                }
                this.f78184i.mo49922a(0, "uploadFailed");
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
        }
        this.f78184i.mo49922a(0, "uploadFailed");
    }

    /* renamed from: a */
    public final void mo60137a(Activity activity) {
        Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
        intent.putExtra("maxSelectNum", this.f78185k);
        intent.putExtra("enter_from", this.f78188n);
        activity.startActivity(intent);
        C26890h.m65011a("enter_image_choose", new C23089d().mo47829a("enter_from", this.f78188n).f61491a);
        ImageChooseUploadActivity.f78095i = this;
    }

    /* renamed from: a */
    public final void mo60082a(JSONObject jSONObject) {
        C52711k.m112240b(jSONObject, "params");
        this.f78185k = jSONObject.optInt("maxSelectNum", 1);
        String optString = jSONObject.optString("source", "");
        C52711k.m112236a((Object) optString, "params.optString(\"source\", \"\")");
        this.f78186l = optString;
        this.f78187m = jSONObject.optBoolean("isMultiSelect", false);
        String optString2 = jSONObject.optString("from", "");
        C52711k.m112236a((Object) optString2, "params.optString(\"from\", \"\")");
        this.f78188n = optString2;
        this.f78176a = jSONObject.optInt("image_width", 216);
        if (((Activity) this.f78183h.get()) != null) {
            if (this.f78187m) {
                Object obj = this.f78183h.get();
                if (obj != null) {
                    Activity activity = (Activity) obj;
                    if (C0726c.m2090a((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                        mo60137a(activity);
                    } else {
                        C23361b.m57419a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C29957f(this, activity));
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                }
            } else {
                Object obj2 = this.f78183h.get();
                if (obj2 != null) {
                    Activity activity2 = (Activity) obj2;
                    if (C0726c.m2090a((Context) activity2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                        C19547d.m47841a(activity2, null, 10003);
                    } else {
                        C23361b.m57419a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C29956e(this, activity2));
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60138a(C29953b bVar, ArrayList<C29953b> arrayList) {
        C0013i.m16a((Callable<TResult>) new C29958g<TResult>(this, bVar, arrayList)).mo20a((C0011g<TResult, TContinuationResult>) new C29959h<TResult,TContinuationResult>(this, bVar), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo49930a(List<String> list, C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "onUploadFinishedListener");
        if (list != null) {
            this.f78182g = aVar;
            this.f78180e = new AtomicInteger(0);
            this.f78181f = new AtomicInteger(0);
            this.f78179d = list;
            this.f78178c = new HashMap<>();
            List<String> list2 = this.f78179d;
            if (list2 == null) {
                C52711k.m112237a("mFileNameList");
            }
            m70089a(list2.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = (String) list.get(i);
                if (C9431p.m18664a(str)) {
                    AtomicInteger atomicInteger = this.f78181f;
                    if (atomicInteger == null) {
                        C52711k.m112237a("mMultiUploadFailNum");
                    }
                    atomicInteger.incrementAndGet();
                } else {
                    File file = new File(str);
                    if (!file.exists()) {
                        AtomicInteger atomicInteger2 = this.f78181f;
                        if (atomicInteger2 == null) {
                            C52711k.m112237a("mMultiUploadFailNum");
                        }
                        atomicInteger2.incrementAndGet();
                    } else {
                        C18922i iVar = new C18922i(Api.f61283c);
                        IAccountUserService userService = C20854a.m53161a().userService();
                        C52711k.m112236a((Object) userService, "AccountProxyService.get().userService()");
                        iVar.mo38778a("uid", userService.getCurUserId());
                        iVar.mo38778a("source", this.f78186l);
                        String a = iVar.mo38774a();
                        IAccountUserService userService2 = C20854a.m53161a().userService();
                        List<C9382a> list3 = this.f78190p;
                        if (list3 == null) {
                            C52711k.m112237a("mIHandlerList");
                        }
                        userService2.uploadAvatar(new C9381g((C9382a) list3.get(i)), a, 8388608, C31346w.f82109a.mo64224a(str, file, this.f78176a), null);
                    }
                }
            }
        }
    }

    public C29951d(WeakReference<Activity> weakReference, C29851a aVar, C29908n nVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "upLoadDialog");
        C52711k.m112240b(nVar, "onFileSelected");
        this.f78183h = weakReference;
        this.f78191q = aVar;
        this.f78184i = nVar;
    }
}
