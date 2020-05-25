package com.p683ss.android.ugc.aweme.dfbase;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p763l.C12153d;
import com.bytedance.p763l.p764a.C12139b;
import com.bytedance.p763l.p764a.C12140c;
import com.bytedance.p763l.p765b.C12150a;
import com.bytedance.p763l.p765b.C12151b;
import com.google.android.play.core.p1053e.C17342g;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27544b;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27544b.C27545a;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27547c;
import com.p683ss.android.ugc.aweme.dfbase.view.C27574a;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.dfbase.q */
public class C27562q implements C12151b, C27545a {

    /* renamed from: a */
    protected volatile C27574a f72446a;

    /* renamed from: b */
    protected volatile C27538a f72447b;

    /* renamed from: c */
    protected volatile int f72448c;

    /* renamed from: d */
    protected volatile C12150a f72449d;

    /* renamed from: e */
    protected volatile boolean f72450e;

    /* renamed from: f */
    public String f72451f;

    /* renamed from: g */
    private volatile boolean f72452g;

    /* renamed from: h */
    private C27544b f72453h = new C27544b(this);

    /* renamed from: a */
    public boolean mo56007a(AmeSSActivity ameSSActivity) {
        if (this.f72449d == null) {
            return false;
        }
        try {
            ameSSActivity.setOnActivityResultListener(1001, new C27565t(this, ameSSActivity));
            C12150a aVar = this.f72449d;
            C12140c b = C12140c.m24571b();
            C12139b a = C12139b.m24568a();
            C17342g gVar = (C17342g) a.f32051a.get(aVar.f32069a);
            if (gVar == null) {
                return false;
            }
            return b.f32055c.mo33619a(gVar, ameSSActivity, 8);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo56001a() {
        C12153d.m24598a().f32083a.add(this);
    }

    /* renamed from: b */
    public void mo56008b() {
        C12153d.m24598a().f32083a.remove(this);
    }

    /* renamed from: e */
    public final void mo56013e() {
        C0013i.m18a((Callable<TResult>) new C27535aa<TResult>(this), C0013i.f25b);
    }

    /* renamed from: c */
    public final void mo55996c() {
        if (this.f72447b != null) {
            C27547c.m66214a(this.f72447b, 3, (String) null);
            this.f72447b.f72411o = C27541b.TIMEOUT;
            this.f72453h.mo55995b();
            C27536b.m66176a();
            C27536b.m66179b(this.f72447b);
        }
    }

    /* renamed from: d */
    public final void mo56012d() {
        if (this.f72447b == null || this.f72447b.f72403g) {
            this.f72446a = null;
            this.f72450e = false;
            return;
        }
        C0013i.m18a((Callable<TResult>) new C27575w<TResult>(this), C0013i.f25b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ Object mo56014f() throws Exception {
        if (!(this.f72446a == null || this.f72446a.f72491b == null || this.f72446a.f72491b.isFinishing())) {
            this.f72446a.dismiss();
        }
        this.f72446a = null;
        this.f72450e = false;
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ Object mo56016h() throws Exception {
        if (!(this.f72446a == null || this.f72446a.f72491b == null)) {
            this.f72446a.setMessage(this.f72446a.getContext().getString(R.string.dnt));
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ Object mo56017i() throws Exception {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity == null || this.f72449d == null) {
            return null;
        }
        Intent intent = new Intent(validTopActivity, DFInstallBlankActivity.class);
        intent.putExtra("module_name", this.f72451f);
        intent.putExtra("is_hold_permission_dialog", true);
        validTopActivity.startActivity(intent);
        validTopActivity.overridePendingTransition(0, 0);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ Object mo56015g() throws Exception {
        if (!this.f72450e) {
            Activity validTopActivity = ActivityStack.getValidTopActivity();
            if (validTopActivity == null) {
                return null;
            }
            Intent intent = new Intent(validTopActivity, DFInstallBlankActivity.class);
            intent.putExtra("module_name", this.f72451f);
            intent.putExtra("is_hold_progress_dialog", true);
            validTopActivity.startActivity(intent);
            validTopActivity.overridePendingTransition(0, 0);
            this.f72450e = true;
        } else if (!(this.f72446a == null || this.f72446a.f72491b == null || this.f72446a.f72491b.isFinishing())) {
            this.f72446a.show();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo56011c(C12150a aVar) throws Exception {
        mo56009b(aVar);
        return null;
    }

    /* renamed from: b */
    static final /* synthetic */ Object m66237b(int i) throws Exception {
        Context validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity == null) {
            validTopActivity = C11010c.m22280a();
        }
        C10691a.m21542b(validTopActivity, i).mo19066a();
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo56002a(int i) {
        if (this.f72447b != null && !this.f72447b.f72403g) {
            C0013i.m18a((Callable<TResult>) new C27566u<TResult>(i), C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final void mo56003a(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f72446a = new C27574a(activity, 3);
        this.f72446a.setCancelable(true);
        this.f72446a.setCanceledOnTouchOutside(false);
        this.f72446a.setIndeterminate(false);
        this.f72446a.setMax(100);
        this.f72446a.setMessage(activity.getString(R.string.ggz));
        this.f72446a.setOnCancelListener(new C27576x(this));
        this.f72446a.setOnDismissListener(new C27577y(weakReference));
        if (!activity.isFinishing()) {
            this.f72446a.show();
        }
    }

    /* renamed from: b */
    public final void mo56010b(C27538a aVar) {
        if (this.f72447b != null && aVar.f72405i >= this.f72447b.f72405i) {
            C27538a aVar2 = this.f72447b;
            aVar2.f72399c = aVar.f72399c;
            aVar2.f72400d = aVar.f72400d;
            aVar2.f72401e = aVar.f72401e;
            aVar2.f72402f = aVar.f72402f;
            aVar2.f72403g = aVar.f72403g;
            aVar2.f72404h = aVar.f72404h;
            aVar2.f72405i = aVar.f72405i;
            aVar2.f72407k = aVar.f72407k;
            aVar2.f72409m = aVar.f72409m;
            aVar2.f72412p = aVar.f72412p;
            aVar2.f72408l = aVar.f72408l;
            aVar2.f72413q = aVar.f72413q;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo56004a(DialogInterface dialogInterface) {
        if (this.f72447b != null) {
            C27538a aVar = this.f72447b;
            int i = this.f72448c;
            if (aVar != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (C27558m.m66230d(aVar.f72398b)) {
                        jSONObject.put(LeakCanaryFileProvider.f132049i, "df_language");
                        Locale locale = aVar.f72410n;
                        if (locale != null) {
                            jSONObject.put("language", locale.getLanguage());
                        }
                    } else {
                        jSONObject.put(LeakCanaryFileProvider.f132049i, aVar.f72397a);
                        jSONObject.put("dependent_modules", aVar.mo55984b());
                        jSONObject.put("is_all_dependent_modules_installed", aVar.mo55985c());
                    }
                    jSONObject.put("status", i);
                    jSONObject.put("task_type", aVar.f72405i);
                    C26890h.m65014b("df_cancel_progress_dialog", jSONObject);
                    C23569o.m57776a("df_cancel_progress_dialog", C27547c.m66212a(i), jSONObject);
                } catch (Exception unused) {
                }
            }
            if (this.f72447b.f72411o != C27541b.RUNNING) {
                C27536b.m66176a();
                C27536b.m66179b(this.f72447b);
                return;
            }
            boolean z = this.f72447b.f72403g;
            this.f72447b.mo55982a();
            if (this.f72447b.f72412p != null) {
                this.f72447b.f72412p.mo50034b(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo23064a(C12150a aVar) {
        if (this.f72447b != null && TextUtils.equals(this.f72447b.f72398b, aVar.f32069a)) {
            C27547c.m66216a(this.f72447b, aVar);
            if (aVar.f32071c == 5 && !this.f72447b.mo55985c()) {
                aVar.f32071c = 6;
            }
            C0013i.m16a((Callable<TResult>) new C27563r<TResult>(this, aVar));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01df, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo56009b(com.bytedance.p763l.p765b.C12150a r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.ss.android.ugc.aweme.dfbase.b.a r0 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r10)
            return
        L_0x0007:
            r10.f72449d = r11     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a r0 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.n r0 = r0.f72412p     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b r1 = com.p683ss.android.ugc.aweme.dfbase.C27536b.m66176a()     // Catch:{ all -> 0x01e0 }
            int r2 = r11.f32071c     // Catch:{ all -> 0x01e0 }
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L_0x01a1;
                case 1: goto L_0x0191;
                case 2: goto L_0x0145;
                case 3: goto L_0x013b;
                case 4: goto L_0x0101;
                case 5: goto L_0x00e1;
                case 6: goto L_0x00a8;
                case 7: goto L_0x004e;
                case 8: goto L_0x0026;
                case 9: goto L_0x001a;
                default: goto L_0x0018;
            }     // Catch:{ all -> 0x01e0 }
        L_0x0018:
            goto L_0x01a9
        L_0x001a:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r0 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.RUNNING     // Catch:{ all -> 0x01e0 }
            r11.f72411o = r0     // Catch:{ all -> 0x01e0 }
            r11 = 9
            r10.f72448c = r11     // Catch:{ all -> 0x01e0 }
            goto L_0x01a9
        L_0x0026:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r0 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.RUNNING     // Catch:{ all -> 0x01e0 }
            r11.f72411o = r0     // Catch:{ all -> 0x01e0 }
            r11 = 8
            r10.f72448c = r11     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.c.b r11 = r10.f72453h     // Catch:{ all -> 0x01e0 }
            r11.mo55995b()     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            boolean r11 = r11.f72399c     // Catch:{ all -> 0x01e0 }
            if (r11 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.dfbase.s r11 = new com.ss.android.ugc.aweme.dfbase.s     // Catch:{ all -> 0x01e0 }
            r11.<init>(r10)     // Catch:{ all -> 0x01e0 }
            java.util.concurrent.Executor r0 = p001a.C0013i.f25b     // Catch:{ all -> 0x01e0 }
            p001a.C0013i.m18a(r11, r0)     // Catch:{ all -> 0x01e0 }
            monitor-exit(r10)
            return
        L_0x0047:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.p683ss.android.ugc.aweme.dfbase.C27536b.m66179b(r11)     // Catch:{ all -> 0x01e0 }
            goto L_0x01a9
        L_0x004e:
            int r11 = r10.f72448c     // Catch:{ all -> 0x01e0 }
            r2 = 7
            if (r11 == r2) goto L_0x009e
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r11 = r11.f72411o     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r5 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.TIMEOUT     // Catch:{ all -> 0x01e0 }
            if (r11 != r5) goto L_0x0085
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            boolean r11 = r11.f72402f     // Catch:{ all -> 0x01e0 }
            if (r11 == 0) goto L_0x007e
            boolean r11 = r10.f72452g     // Catch:{ all -> 0x01e0 }
            if (r11 != 0) goto L_0x007e
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r5 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.UNKNOWN     // Catch:{ all -> 0x01e0 }
            r11.f72411o = r5     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            boolean r11 = r1.mo55979d(r11)     // Catch:{ all -> 0x01e0 }
            if (r11 == 0) goto L_0x0077
            r10.f72452g = r4     // Catch:{ all -> 0x01e0 }
            monitor-exit(r10)
            return
        L_0x0077:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            long r4 = com.p683ss.android.ugc.aweme.dfbase.p1629a.C27533a.f72380a     // Catch:{ all -> 0x01e0 }
            r1.mo55972a(r11, r4)     // Catch:{ all -> 0x01e0 }
        L_0x007e:
            r11 = 2132546783(0x7f1c14df, float:2.0746794E38)
            r10.mo56002a(r11)     // Catch:{ all -> 0x01e0 }
            goto L_0x0092
        L_0x0085:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            boolean r11 = r11.f72401e     // Catch:{ all -> 0x01e0 }
            if (r11 == 0) goto L_0x0092
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            long r4 = com.p683ss.android.ugc.aweme.dfbase.p1629a.C27533a.f72380a     // Catch:{ all -> 0x01e0 }
            r1.mo55972a(r11, r4)     // Catch:{ all -> 0x01e0 }
        L_0x0092:
            r10.mo56013e()     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x009e
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            boolean r11 = r11.f72403g     // Catch:{ all -> 0x01e0 }
            r0.mo50034b(r11)     // Catch:{ all -> 0x01e0 }
        L_0x009e:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r0 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.CANCELED     // Catch:{ all -> 0x01e0 }
            r11.f72411o = r0     // Catch:{ all -> 0x01e0 }
            r10.f72448c = r2     // Catch:{ all -> 0x01e0 }
            goto L_0x01a9
        L_0x00a8:
            int r2 = r10.f72448c     // Catch:{ all -> 0x01e0 }
            r4 = 6
            if (r2 == r4) goto L_0x00d7
            int r11 = r11.f32075g     // Catch:{ all -> 0x01e0 }
            r2 = -10
            if (r11 != r2) goto L_0x00ba
            r11 = 2132549107(0x7f1c1df3, float:2.0751507E38)
            r10.mo56002a(r11)     // Catch:{ all -> 0x01e0 }
            goto L_0x00c0
        L_0x00ba:
            r11 = 2132544935(0x7f1c0da7, float:2.0743045E38)
            r10.mo56002a(r11)     // Catch:{ all -> 0x01e0 }
        L_0x00c0:
            r10.mo56013e()     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x00cc
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            boolean r11 = r11.f72403g     // Catch:{ all -> 0x01e0 }
            r0.mo50034b(r11)     // Catch:{ all -> 0x01e0 }
        L_0x00cc:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            boolean r11 = r11.f72400d     // Catch:{ all -> 0x01e0 }
            if (r11 == 0) goto L_0x00d7
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            r1.mo55978c(r11)     // Catch:{ all -> 0x01e0 }
        L_0x00d7:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r0 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.FAILED     // Catch:{ all -> 0x01e0 }
            r11.f72411o = r0     // Catch:{ all -> 0x01e0 }
            r10.f72448c = r4     // Catch:{ all -> 0x01e0 }
            goto L_0x01a9
        L_0x00e1:
            int r11 = r10.f72448c     // Catch:{ all -> 0x01e0 }
            r2 = 5
            if (r11 == r2) goto L_0x00f2
            r10.mo56013e()     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x00f2
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            boolean r11 = r11.f72403g     // Catch:{ all -> 0x01e0 }
            r0.mo50033a(r11)     // Catch:{ all -> 0x01e0 }
        L_0x00f2:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r0 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.SUCCEEDED     // Catch:{ all -> 0x01e0 }
            r11.f72411o = r0     // Catch:{ all -> 0x01e0 }
            r10.f72448c = r2     // Catch:{ all -> 0x01e0 }
            java.lang.String r11 = r10.f72451f     // Catch:{ all -> 0x01e0 }
            r1.mo55973a(r11)     // Catch:{ all -> 0x01e0 }
            goto L_0x01a9
        L_0x0101:
            int r0 = r10.f72448c     // Catch:{ all -> 0x01e0 }
            r1 = 4
            if (r0 == r1) goto L_0x0116
            com.ss.android.ugc.aweme.dfbase.b.a r0 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            boolean r0 = r0.f72402f     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x0111
            com.ss.android.ugc.aweme.dfbase.c.b r0 = r10.f72453h     // Catch:{ all -> 0x01e0 }
            r0.mo55995b()     // Catch:{ all -> 0x01e0 }
        L_0x0111:
            com.ss.android.ugc.aweme.dfbase.c.b r0 = r10.f72453h     // Catch:{ all -> 0x01e0 }
            r0.mo55994a()     // Catch:{ all -> 0x01e0 }
        L_0x0116:
            com.ss.android.ugc.aweme.dfbase.b.a r0 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x012b
            com.ss.android.ugc.aweme.dfbase.b.a r0 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            boolean r0 = r0.f72403g     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x0121
            goto L_0x012b
        L_0x0121:
            com.ss.android.ugc.aweme.dfbase.v r0 = new com.ss.android.ugc.aweme.dfbase.v     // Catch:{ all -> 0x01e0 }
            r0.<init>(r10)     // Catch:{ all -> 0x01e0 }
            java.util.concurrent.Executor r2 = p001a.C0013i.f25b     // Catch:{ all -> 0x01e0 }
            p001a.C0013i.m18a(r0, r2)     // Catch:{ all -> 0x01e0 }
        L_0x012b:
            long r4 = r11.f32073e     // Catch:{ all -> 0x01e0 }
            long r6 = r11.f32072d     // Catch:{ all -> 0x01e0 }
            r10.m66238b(r4, r6)     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r0 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.RUNNING     // Catch:{ all -> 0x01e0 }
            r11.f72411o = r0     // Catch:{ all -> 0x01e0 }
            r10.f72448c = r1     // Catch:{ all -> 0x01e0 }
            goto L_0x01a9
        L_0x013b:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r0 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.DOWNLOADED     // Catch:{ all -> 0x01e0 }
            r11.f72411o = r0     // Catch:{ all -> 0x01e0 }
            r11 = 3
            r10.f72448c = r11     // Catch:{ all -> 0x01e0 }
            goto L_0x01a9
        L_0x0145:
            int r0 = r10.f72448c     // Catch:{ all -> 0x01e0 }
            r1 = 2
            if (r0 == r1) goto L_0x0170
            com.ss.android.ugc.aweme.dfbase.c.b r0 = r10.f72453h     // Catch:{ all -> 0x01e0 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01e0 }
            r0.f72432d = r4     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a r0 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            boolean r0 = r0.f72402f     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x017c
            com.ss.android.ugc.aweme.dfbase.c.b r0 = r10.f72453h     // Catch:{ all -> 0x01e0 }
            java.util.Timer r2 = new java.util.Timer     // Catch:{ all -> 0x01e0 }
            r2.<init>()     // Catch:{ all -> 0x01e0 }
            r0.f72429a = r2     // Catch:{ all -> 0x01e0 }
            java.util.Timer r4 = r0.f72429a     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.c.b$b r5 = new com.ss.android.ugc.aweme.dfbase.c.b$b     // Catch:{ all -> 0x01e0 }
            r5.<init>()     // Catch:{ all -> 0x01e0 }
            r6 = 0
            long r8 = com.p683ss.android.ugc.aweme.dfbase.p1629a.C27533a.f72382c     // Catch:{ all -> 0x01e0 }
            r4.schedule(r5, r6, r8)     // Catch:{ all -> 0x01e0 }
            goto L_0x017c
        L_0x0170:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.c.b r0 = r10.f72453h     // Catch:{ all -> 0x01e0 }
            long r6 = r0.f72432d     // Catch:{ all -> 0x01e0 }
            r0 = 0
            long r4 = r4 - r6
            r11.f32074f = r4     // Catch:{ all -> 0x01e0 }
        L_0x017c:
            com.ss.android.ugc.aweme.dfbase.c.b r0 = r10.f72453h     // Catch:{ all -> 0x01e0 }
            r0.mo55994a()     // Catch:{ all -> 0x01e0 }
            long r4 = r11.f32073e     // Catch:{ all -> 0x01e0 }
            long r6 = r11.f32072d     // Catch:{ all -> 0x01e0 }
            r10.m66238b(r4, r6)     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r0 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.RUNNING     // Catch:{ all -> 0x01e0 }
            r11.f72411o = r0     // Catch:{ all -> 0x01e0 }
            r10.f72448c = r1     // Catch:{ all -> 0x01e0 }
            goto L_0x01a9
        L_0x0191:
            int r11 = r10.f72448c     // Catch:{ all -> 0x01e0 }
            if (r11 == r4) goto L_0x0198
            r10.mo56012d()     // Catch:{ all -> 0x01e0 }
        L_0x0198:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r0 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.PENDING     // Catch:{ all -> 0x01e0 }
            r11.f72411o = r0     // Catch:{ all -> 0x01e0 }
            r10.f72448c = r4     // Catch:{ all -> 0x01e0 }
            goto L_0x01a9
        L_0x01a1:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r0 = com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b.UNKNOWN     // Catch:{ all -> 0x01e0 }
            r11.f72411o = r0     // Catch:{ all -> 0x01e0 }
            r10.f72448c = r3     // Catch:{ all -> 0x01e0 }
        L_0x01a9:
            com.ss.android.ugc.aweme.dfbase.b.a r11 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a$b r11 = r11.f72411o     // Catch:{ all -> 0x01e0 }
            boolean r11 = r11.isFinished()     // Catch:{ all -> 0x01e0 }
            if (r11 == 0) goto L_0x01de
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "解绑："
            r11.<init>(r0)     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b.a r0 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            if (r0 != 0) goto L_0x01c1
            java.lang.String r0 = "null"
            goto L_0x01c5
        L_0x01c1:
            com.ss.android.ugc.aweme.dfbase.b.a r0 = r10.f72447b     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = r0.f72397a     // Catch:{ all -> 0x01e0 }
        L_0x01c5:
            r11.append(r0)     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.c.b r11 = r10.f72453h     // Catch:{ all -> 0x01e0 }
            r11.mo55995b()     // Catch:{ all -> 0x01e0 }
            r10.f72452g = r3     // Catch:{ all -> 0x01e0 }
            r11 = 0
            r10.f72449d = r11     // Catch:{ all -> 0x01e0 }
            r10.f72447b = r11     // Catch:{ all -> 0x01e0 }
            com.ss.android.ugc.aweme.dfbase.b r11 = com.p683ss.android.ugc.aweme.dfbase.C27536b.m66176a()     // Catch:{ all -> 0x01e0 }
            r11.mo55977c()     // Catch:{ all -> 0x01e0 }
            r11.mo55976b()     // Catch:{ all -> 0x01e0 }
        L_0x01de:
            monitor-exit(r10)
            return
        L_0x01e0:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.dfbase.C27562q.mo56009b(com.bytedance.l.b.a):void");
    }

    /* renamed from: a */
    public final void mo56006a(C27538a aVar) {
        Object obj;
        StringBuilder sb = new StringBuilder("cur: ");
        if (this.f72447b == null) {
            obj = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            obj = this.f72447b.f72411o;
        }
        sb.append(obj);
        sb.append(" -> 绑定：");
        sb.append(aVar.f72397a);
        this.f72447b = aVar;
        this.f72448c = -1;
        this.f72449d = null;
        this.f72447b.f72411o = C27541b.UNKNOWN;
    }

    /* renamed from: b */
    private void m66238b(long j, long j2) {
        if (this.f72447b != null && !this.f72447b.f72403g) {
            C27578z zVar = new C27578z(this, j, j2);
            C0013i.m18a((Callable<TResult>) zVar, C0013i.f25b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo56000a(long j, long j2) throws Exception {
        int i;
        if (!(this.f72446a == null || this.f72446a.f72491b == null)) {
            if (j <= 0 || j2 <= 0) {
                i = 0;
            } else {
                i = (int) Math.ceil((double) ((((float) j) * 100.0f) / ((float) j2)));
            }
            int max = Math.max(0, Math.min(i, 100));
            if (max > this.f72446a.getProgress()) {
                this.f72446a.setProgress(max);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo56005a(AmeSSActivity ameSSActivity, int i, int i2, Intent intent) {
        if (this.f72447b != null && i == 8) {
            ameSSActivity.finish();
            C27547c.m66213a(this.f72447b, i2);
            if (i2 == -1) {
                this.f72447b.f72411o = C27541b.UNKNOWN;
                return;
            }
            C27536b.m66176a();
            C27536b.m66179b(this.f72447b);
        }
    }
}
