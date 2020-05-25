package com.p683ss.android.ugc.aweme.profile.util;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.commercialize.abtest.NormalSplashDelayExperiment;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.DmtStatusViewDialog;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.utils.C47720bh;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.C45331a;
import com.zhihu.matisse.C45333b;
import com.zhihu.matisse.internal.entity.C45352b;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.p2249a.C45332a;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.util.p */
public class C40557p {

    /* renamed from: a */
    private int f103481a = NormalSplashDelayExperiment.GROUP1;

    /* renamed from: b */
    protected final Activity f103482b;

    /* renamed from: c */
    protected final Resources f103483c;

    /* renamed from: d */
    protected final Fragment f103484d;

    /* renamed from: e */
    public final String f103485e;

    /* renamed from: f */
    protected final String f103486f;

    /* renamed from: g */
    protected final C9381g f103487g;

    /* renamed from: h */
    protected final C40564a f103488h;

    /* renamed from: i */
    public int f103489i = 1;

    /* renamed from: j */
    private int f103490j = NormalSplashDelayExperiment.GROUP1;

    /* renamed from: k */
    private DmtStatusViewDialog f103491k;

    /* renamed from: com.ss.android.ugc.aweme.profile.util.p$a */
    public interface C40564a {
        /* renamed from: a */
        void mo53275a();

        /* renamed from: a */
        void mo53276a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.p$b */
    public static class C40565b extends C45332a {

        /* renamed from: a */
        private int f103509a = NormalSplashDelayExperiment.GROUP1;

        /* renamed from: b */
        private int f103510b = NormalSplashDelayExperiment.GROUP1;

        public C40565b() {
        }

        public C40565b(int i, int i2) {
            this.f103509a = i;
            this.f103510b = i2;
        }

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
            if (C40567r.m90000a(file.getAbsolutePath(), this.f103509a, this.f103510b)) {
                return new C45352b(1, context.getString(R.string.cp3));
            }
            return null;
        }
    }

    /* renamed from: d */
    public static int m89976d(int i) {
        if (i == 0) {
            return 10004;
        }
        if (i != 3) {
            return i != 5 ? 10004 : 10011;
        }
        return 10009;
    }

    /* renamed from: a */
    public final void mo82827a(int i, Activity activity, View view, User user, String str) {
        String[] a = m89975a(this.f103483c, 0, 1, 3, 4);
        C11105a aVar = new C11105a(this.f103482b);
        final int i2 = i;
        final Activity activity2 = activity;
        final View view2 = view;
        final String str2 = str;
        final User user2 = user;
        C405603 r3 = new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.isEmpty(C40557p.this.f103485e)) {
                    C10691a.m21542b((Context) C40557p.this.f103482b, (int) R.string.da8).mo19066a();
                    C32458a.m75148a((Throwable) new Exception("SD card 不可用"));
                    return;
                }
                switch (i) {
                    case 0:
                        C40557p.this.mo82838f(i2);
                        return;
                    case 1:
                        C40557p.this.mo82834c(i2);
                        return;
                    case 2:
                        C40026s.f101964a.startHeaderDetailActivity(activity2, view2, str2, user2);
                        return;
                    default:
                        C18898c.m46009a(C40557p.this.f103482b, "live_image_popup", "cancel");
                        return;
                }
            }
        };
        aVar.mo20142a((CharSequence[]) a, (OnClickListener) r3).mo20143a().show();
    }

    /* renamed from: a */
    public boolean mo82810a(int i, int i2, Intent intent) {
        Uri uri;
        Uri uri2;
        if (i == 10004 || i == 10009 || i == 10011) {
            C40026s.f101964a.getNotificationManagerHandleSystemCamera().invoke(Boolean.valueOf(false));
        }
        if (i2 != -1) {
            return false;
        }
        if (i != 10003 && i != 10008 && i != 10006 && i != 10010) {
            if (i == 10007 || i == 10014) {
                if (intent == null) {
                    return false;
                }
                List a = C45331a.m98818a(intent);
                if (a == null || a.isEmpty()) {
                    uri2 = intent.getData();
                } else {
                    uri2 = (Uri) a.get(0);
                }
                String a2 = C19547d.m47839a((Context) this.f103482b, uri2);
                if (C9431p.m18664a(a2)) {
                    C9432q.m18673a((Context) this.f103482b, 2131952652, (int) R.string.cos);
                    return false;
                } else if (!new File(a2).exists()) {
                    C9432q.m18673a((Context) this.f103482b, 2131952652, (int) R.string.cos);
                    return false;
                } else if (this.f103488h != null) {
                    this.f103488h.mo53276a(a2);
                }
            } else if (i == 10004 || i == 10009 || i == 10011) {
                try {
                    m89973a(mo82809a(mo82811b()), true, i);
                    return true;
                } catch (Exception unused) {
                }
            } else if (i != 10002 || intent == null) {
                return false;
            } else {
                Uri data = intent.getData();
                if (data == null) {
                    return false;
                }
                String a3 = C19547d.m47839a((Context) this.f103482b, data);
                if (a3 == null) {
                    return false;
                }
                File file = new File(a3);
                if (!file.exists()) {
                    return false;
                }
                if (C40567r.m90000a(file.getAbsolutePath(), this.f103481a, this.f103490j)) {
                    C10691a.m21542b((Context) this.f103482b, (int) R.string.cp3).mo19066a();
                    return true;
                }
                if (this.f103488h != null) {
                    this.f103488h.mo53276a(file.getAbsolutePath());
                }
                return true;
            }
            return false;
        } else if (intent == null) {
            return false;
        } else {
            List a4 = C45331a.m98818a(intent);
            if (a4 == null || a4.isEmpty()) {
                uri = intent.getData();
            } else {
                uri = (Uri) a4.get(0);
            }
            String a5 = C19547d.m47839a((Context) this.f103482b, uri);
            if (C9431p.m18664a(a5)) {
                C9432q.m18673a((Context) this.f103482b, 2131952652, (int) R.string.cos);
                return false;
            } else if (!new File(a5).exists()) {
                C9432q.m18673a((Context) this.f103482b, 2131952652, (int) R.string.cos);
                return false;
            } else {
                if ("file".equals(uri.getScheme())) {
                    uri = m89969a((Context) this.f103482b, a5);
                }
                m89973a(uri, false, i);
                return true;
            }
        }
    }

    /* renamed from: a */
    public final void mo82830a(String str, List<C19180e> list) {
        if (this.f103488h != null) {
            this.f103488h.mo53275a();
        }
        mo82828a(0, str, list);
    }

    /* renamed from: a */
    public final void mo82828a(int i, final String str, final List<C19180e> list) {
        C18842a.m45933a(new Runnable() {
            public final void run() {
                File file;
                int i;
                try {
                    file = new File(str);
                } catch (Exception e) {
                    C32458a.m75148a((Throwable) e);
                    file = null;
                }
                if (file == null || !file.exists() || file.length() <= 4194304) {
                    i = 4194304;
                } else {
                    StringBuilder sb = new StringBuilder("upload file size: ");
                    sb.append(file.length());
                    C32458a.m75144a(sb.toString());
                    i = (((int) (file.length() / 1024)) + 1) * PreloadTask.BYTE_UNIT_NUMBER;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Api.f61283c);
                sb2.append("?uid=");
                sb2.append(C20854a.m53167g().getCurUserId());
                C20854a.m53167g().uploadAvatar(C40557p.this.f103487g, sb2.toString(), i, str, list);
            }
        }, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82829a(DialogInterface dialogInterface, int i) {
        try {
            StringBuilder sb = new StringBuilder("package:");
            sb.append(this.f103482b.getPackageName());
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            this.f103482b.startActivity(intent);
        } catch (Exception unused) {
            C47720bh.m103294a(this.f103482b);
        }
    }

    /* renamed from: e */
    public final String mo82836e() {
        return mo82811b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo82811b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f103485e);
        sb.append("/");
        sb.append(this.f103486f);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo82833c() {
        if (this.f103491k == null) {
            this.f103491k = new DmtStatusViewDialog(this.f103482b);
            this.f103491k.setCancelable(false);
        }
        this.f103491k.show();
    }

    /* renamed from: d */
    public final void mo82835d() {
        if (this.f103491k != null && this.f103491k.isShowing()) {
            this.f103491k.dismiss();
        }
    }

    /* renamed from: g */
    public final void mo82839g(int i) {
        m89971a(i, mo82811b());
    }

    /* renamed from: a */
    private Uri mo82809a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                File file2 = new File(this.f103485e);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    /* renamed from: b */
    public final void mo82831b(int i) {
        m89972a(i, m89975a(this.f103483c, 0, 1, 4));
    }

    /* renamed from: c */
    public final void mo82834c(final int i) {
        try {
            C23361b.m57419a(this.f103482b, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C23364b() {
                /* renamed from: a */
                public final void mo40906a(String[] strArr, int[] iArr) {
                    if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                        C18898c.m46009a(C40557p.this.f103482b, "live_image_popup", "album");
                        C40557p pVar = C40557p.this;
                        int i = 10003;
                        switch (i) {
                            case 1:
                                i = 10006;
                                break;
                            case 2:
                                i = 10007;
                                break;
                            case 3:
                                i = 10008;
                                break;
                            case 5:
                                i = 10010;
                                break;
                            case 6:
                                i = 10013;
                                break;
                            case 7:
                                i = 10014;
                                break;
                        }
                        pVar.mo82837e(i);
                    } else if (!C0636b.m1719a(C40557p.this.f103482b, "android.permission.READ_EXTERNAL_STORAGE")) {
                        C40557p.this.mo82825a((int) R.string.e03, (int) R.string.wv);
                    } else {
                        C10691a.m21551c((Context) C40557p.this.f103482b, C40557p.this.f103482b.getString(R.string.co0)).mo19066a();
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo82832b(String str) {
        if (this.f103488h != null) {
            this.f103488h.mo53275a();
        }
        mo82833c();
        m89971a(0, str);
    }

    /* renamed from: f */
    public final void mo82838f(final int i) {
        if (C47946e.m103735a()) {
            C23361b.m57419a(this.f103482b, new String[]{"android.permission.CAMERA"}, new C23364b() {
                /* renamed from: a */
                public final void mo40906a(String[] strArr, int[] iArr) {
                    if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                        C18898c.m46009a(C40557p.this.f103482b, "live_image_popup", "take_photo");
                        C40026s.f101964a.getStartCameraActivity().mo58987a(C40557p.this.f103482b, C40557p.this.f103484d, Integer.valueOf(C40557p.m89976d(i)), C40557p.this.f103485e, C40557p.this.f103486f);
                    } else if (!C0636b.m1719a(C40557p.this.f103482b, "android.permission.CAMERA")) {
                        C40557p.this.mo82825a((int) R.string.e02, (int) R.string.wu);
                    } else {
                        C10691a.m21551c((Context) C40557p.this.f103482b, C40557p.this.f103482b.getString(R.string.cny)).mo19066a();
                    }
                }
            });
        } else if (C47946e.m103734a(this.f103482b) != -1) {
            C18898c.m46009a(this.f103482b, "live_image_popup", "take_photo");
            C40026s.f101964a.getStartCameraActivity().mo58987a(this.f103482b, this.f103484d, Integer.valueOf(m89976d(i)), this.f103485e, this.f103486f);
        } else if (!C0636b.m1719a(this.f103482b, "android.permission.CAMERA")) {
            mo82825a((int) R.string.e02, (int) R.string.wu);
        } else {
            C10691a.m21551c((Context) this.f103482b, this.f103482b.getString(R.string.cny)).mo19066a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo82837e(int i) {
        C18898c.m46009a(this.f103482b, "live_image_popup", "album");
        try {
            if (this.f103484d != null) {
                C45331a.m98816a(this.f103484d).mo91622a(C45333b.ofImage()).mo91630a(true).mo91632b(false).mo91631b(this.f103489i).mo91633c(-1).mo91628a((int) R.style.hh).mo91627a(0.85f).mo91629a((C45332a) new C40565b(this.f103481a, this.f103490j)).mo91634d(i);
            } else {
                C45331a.m98815a(this.f103482b).mo91622a(C45333b.ofImage()).mo91630a(true).mo91632b(false).mo91631b(this.f103489i).mo91633c(-1).mo91628a((int) R.style.hh).mo91627a(0.85f).mo91629a((C45332a) new C40565b(this.f103481a, this.f103490j)).mo91634d(i);
            }
        } catch (Exception e) {
            C32458a.m75143a(e);
            C19547d.m47841a(this.f103482b, this.f103484d, i);
        }
    }

    /* renamed from: a */
    public static String[] m89975a(Resources resources, short... sArr) {
        return m89974a(resources, (int) R.array.b7, sArr);
    }

    /* renamed from: a */
    private void m89971a(int i, final String str) {
        C18842a.m45933a(new Runnable() {
            public final void run() {
                StringBuilder sb = new StringBuilder();
                sb.append(Api.f61283c);
                sb.append("?uid=");
                sb.append(C20854a.m53167g().getCurUserId());
                String sb2 = sb.toString();
                if (C47915gg.m103662k(C20854a.m53167g().getCurUser())) {
                    C20854a.m53167g().uploadCommerceHeadImage(C40557p.this.f103487g, sb2, 4194304, str, "1");
                } else {
                    C20854a.m53167g().uploadCover(C40557p.this.f103487g, sb2, 4194304, str);
                }
            }
        }, i);
    }

    /* renamed from: a */
    private void m89972a(final int i, String[] strArr) {
        new C11105a(this.f103482b).mo20142a((CharSequence[]) strArr, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.isEmpty(C40557p.this.f103485e)) {
                    C10691a.m21542b((Context) C40557p.this.f103482b, (int) R.string.da8).mo19066a();
                    C32458a.m75148a((Throwable) new Exception("SD card 不可用"));
                    return;
                }
                switch (i) {
                    case 0:
                        C40557p.this.mo82838f(i);
                        return;
                    case 1:
                        C40557p.this.mo82834c(i);
                        return;
                    default:
                        C18898c.m46009a(C40557p.this.f103482b, "live_image_popup", "cancel");
                        return;
                }
            }
        }).mo20143a().show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r8 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r8 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri m89969a(android.content.Context r8, java.lang.String r9) {
        /*
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String r5 = "_data= ?"
            r8 = 1
            java.lang.String[] r6 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            r0 = 0
            r6[r0] = r9     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String r8 = "_id"
            r4[r0] = r8     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            if (r9 == 0) goto L_0x003b
            java.lang.String r9 = r8.getString(r0)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            long r2 = java.lang.Long.parseLong(r9)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            android.net.Uri r9 = android.content.ContentUris.withAppendedId(r0, r2)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            if (r8 == 0) goto L_0x003a
            r8.close()
        L_0x003a:
            return r9
        L_0x003b:
            if (r8 == 0) goto L_0x004e
            goto L_0x004b
        L_0x003e:
            r9 = move-exception
            r1 = r8
            goto L_0x0042
        L_0x0041:
            r9 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()
        L_0x0047:
            throw r9
        L_0x0048:
            r8 = r1
        L_0x0049:
            if (r8 == 0) goto L_0x004e
        L_0x004b:
            r8.close()
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.util.C40557p.m89969a(android.content.Context, java.lang.String):android.net.Uri");
    }

    /* renamed from: a */
    public final void mo82825a(int i, int i2) {
        new C10643a(this.f103482b).mo18885a(i).mo18899b(i2).mo18900b((int) R.string.wf, (OnClickListener) null).mo18886a((int) R.string.b9e, (OnClickListener) new C40566q(this)).mo18897a().mo18882b();
    }

    /* renamed from: a */
    private void m89973a(Uri uri, boolean z, int i) {
        Context context;
        boolean z2;
        float f;
        if (uri != null) {
            if (!z) {
                String lastPathSegment = uri.getLastPathSegment();
                if (VERSION.SDK_INT >= 19 && !C9431p.m18664a(lastPathSegment) && lastPathSegment.contains(":")) {
                    lastPathSegment = lastPathSegment.split(":")[1];
                }
                try {
                    uri = ContentUris.withAppendedId(Media.EXTERNAL_CONTENT_URI, Long.parseLong(lastPathSegment));
                } catch (NumberFormatException unused) {
                }
            }
            if (this.f103484d != null) {
                context = this.f103484d.getContext();
            } else {
                context = this.f103482b;
            }
            if (context != null) {
                String a = C19547d.m47839a((Context) this.f103482b, uri);
                if (i == 10003 || i == 10004) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || i == 10009 || i == 10008 || i == 10010 || i == 10011) {
                    f = 1.0f;
                } else {
                    f = 0.5625f;
                }
                if (Math.abs(f - 1.0f) < Float.MIN_NORMAL) {
                    C9432q.m18687b(context, 30.0f);
                } else {
                    C9432q.m18687b(context, 16.0f);
                }
                int b = (int) C9432q.m18687b(context, 16.0f);
                if (this.f103484d == null) {
                    C40026s.f101964a.gotoCropActivity(this.f103482b, a, z2, f, b, 10002, this.f103481a, this.f103490j);
                } else {
                    C40026s.f101964a.gotoCropActivity(this.f103484d, a, z2, f, b, 10002, this.f103481a, this.f103490j);
                }
            }
        }
    }

    /* renamed from: a */
    private static String[] m89974a(Resources resources, int i, short... sArr) {
        String[] stringArray = resources.getStringArray(i);
        String[] strArr = new String[sArr.length];
        for (int i2 = 0; i2 < sArr.length; i2++) {
            strArr[i2] = stringArray[sArr[i2]];
        }
        return strArr;
    }

    /* renamed from: a */
    public final void mo82826a(int i, int i2, short... sArr) {
        m89972a(i, m89974a(this.f103483c, (int) R.array.b7, sArr));
    }

    public C40557p(Activity activity, Fragment fragment, C9381g gVar, C40564a aVar) {
        File file;
        this.f103482b = activity;
        this.f103484d = fragment;
        this.f103487g = gVar;
        this.f103488h = aVar;
        String str = "head";
        if (!C48016e.m103956f() || !C48016e.m103957g() || TextUtils.isEmpty(str)) {
            file = null;
        } else {
            File externalCacheDir = this.f103482b.getExternalCacheDir();
            if (externalCacheDir == null) {
                externalCacheDir = Environment.getExternalStorageDirectory();
            }
            file = new File(externalCacheDir, str);
            C48016e.m103937a(file);
        }
        if (file != null) {
            this.f103485e = file.getPath();
        } else {
            this.f103485e = "";
        }
        this.f103486f = "head.data";
        this.f103483c = this.f103482b.getResources();
    }
}
