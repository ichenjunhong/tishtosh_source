package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.support.p030v4.app.Fragment;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import java.io.File;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.m */
public final class C27252m extends Fragment {

    /* renamed from: e */
    public static final C27253a f71904e = new C27253a(null);

    /* renamed from: a */
    public ValueCallback<Uri> f71905a;

    /* renamed from: b */
    public ValueCallback<Uri[]> f71906b;

    /* renamed from: c */
    public String f71907c;

    /* renamed from: d */
    public boolean f71908d;

    /* renamed from: f */
    private HashMap f71909f;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.m$a */
    public static final class C27253a {
        private C27253a() {
        }

        public /* synthetic */ C27253a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.m$b */
    static final class C27254b implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C27252m f71910a;

        /* renamed from: b */
        final /* synthetic */ ValueCallback f71911b;

        /* renamed from: c */
        final /* synthetic */ FileChooserParams f71912c;

        C27254b(C27252m mVar, ValueCallback valueCallback, FileChooserParams fileChooserParams) {
            this.f71910a = mVar;
            this.f71911b = valueCallback;
            this.f71912c = fileChooserParams;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            boolean z;
            String str;
            C52711k.m112236a((Object) iArr, "grantResults");
            int length = iArr.length;
            int i = 0;
            while (i < length && iArr[i] == 0) {
                this.f71910a.f71906b = this.f71911b;
                C27252m mVar = this.f71910a;
                String[] acceptTypes = this.f71912c.getAcceptTypes();
                C52711k.m112236a((Object) acceptTypes, "fileChooserParams.acceptTypes");
                if (acceptTypes.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = this.f71912c.getAcceptTypes()[0];
                } else {
                    str = "";
                }
                mVar.mo55641a(str, "");
                i++;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.m$c */
    public static final class C27255c implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C27252m f71913a;

        /* renamed from: b */
        final /* synthetic */ ValueCallback f71914b;

        /* renamed from: c */
        final /* synthetic */ String[] f71915c;

        public C27255c(C27252m mVar, ValueCallback valueCallback, String[] strArr) {
            this.f71913a = mVar;
            this.f71914b = valueCallback;
            this.f71915c = strArr;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            String str;
            boolean z;
            C52711k.m112236a((Object) iArr, "grantResults");
            int length = iArr.length;
            int i = 0;
            while (i < length && iArr[i] == 0) {
                this.f71913a.f71906b = this.f71914b;
                C27252m mVar = this.f71913a;
                String[] strArr2 = this.f71915c;
                if (strArr2 != null) {
                    if (strArr2.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        str = this.f71915c[0];
                        mVar.mo55641a(str, "");
                        i++;
                    }
                }
                str = "";
                mVar.mo55641a(str, "");
                i++;
            }
        }
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: c */
    private static Intent m65694c() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    /* renamed from: d */
    private static Intent m65695d() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f71909f != null) {
            this.f71909f.clear();
        }
    }

    /* renamed from: a */
    private final Intent m65690a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a = m65692a(m65693b(), m65694c(), m65695d());
        a.putExtra("android.intent.extra.INTENT", intent);
        return a;
    }

    /* renamed from: b */
    private final Intent m65693b() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        StringBuilder sb = new StringBuilder();
        C52711k.m112236a((Object) externalStoragePublicDirectory, "externalDataDir");
        sb.append(externalStoragePublicDirectory.getAbsolutePath());
        sb.append(File.separator);
        sb.append("browser-photos");
        File file = new File(sb.toString());
        file.mkdirs();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsolutePath());
        sb2.append(File.separator);
        sb2.append(System.currentTimeMillis());
        sb2.append(".jpg");
        this.f71907c = sb2.toString();
        String str = "output";
        Context context = getContext();
        String str2 = this.f71907c;
        if (str2 == null) {
            C52711k.m112234a();
        }
        intent.putExtra(str, C19547d.m47838a(context, new File(str2)));
        return intent;
    }

    /* renamed from: a */
    private static Intent m65691a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    /* renamed from: a */
    private static Intent m65692a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) intentArr);
        return intent;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01a5 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4 A[Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00e9 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55641a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "capture"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            r0 = 2048(0x800, float:2.87E-42)
            r1 = 1
            if (r10 != 0) goto L_0x000c
            java.lang.String r10 = ""
        L_0x000c:
            java.lang.String r2 = "filesystem"
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r3 = ";"
            d.m.l r4 = new d.m.l     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r4.<init>(r3)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r3 = 0
            java.util.List r10 = r4.split(r10, r3)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            boolean r4 = r10.isEmpty()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r4 != 0) goto L_0x004f
            int r4 = r10.size()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.util.ListIterator r4 = r10.listIterator(r4)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x002a:
            boolean r5 = r4.hasPrevious()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.previous()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r5 = r5.length()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r5 != 0) goto L_0x0040
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            if (r5 != 0) goto L_0x002a
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r4 = r4.nextIndex()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r4 = r4 + r1
            java.util.List r10 = p2628d.p2629a.C52575l.m112129b(r10, r4)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            goto L_0x0053
        L_0x004f:
            java.util.List r10 = p2628d.p2629a.C52575l.m112097a()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x0053:
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.Object[] r10 = r10.toArray(r4)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x019c
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r4 = r10.length     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r4 != 0) goto L_0x0064
            r4 = 1
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x006b
            r4 = r10[r3]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            goto L_0x006d
        L_0x006b:
            java.lang.String r4 = ""
        L_0x006d:
            r5 = r11
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r5 != 0) goto L_0x0077
            r2 = r11
        L_0x0077:
            java.lang.String r5 = "filesystem"
            boolean r11 = p2628d.p2639f.p2641b.C52711k.m112239a(r11, r5)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r11 == 0) goto L_0x00f2
            int r11 = r10.length     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r5 = r2
            r2 = 0
        L_0x0082:
            if (r2 >= r11) goto L_0x00f1
            r6 = r10[r2]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r7 = "="
            d.m.l r8 = new d.m.l     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r8.<init>(r7)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.util.List r6 = r8.split(r6, r3)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            boolean r7 = r6.isEmpty()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r7 != 0) goto L_0x00c6
            int r7 = r6.size()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.util.ListIterator r7 = r6.listIterator(r7)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x00a1:
            boolean r8 = r7.hasPrevious()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r8 == 0) goto L_0x00c6
            java.lang.Object r8 = r7.previous()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r8 = r8.length()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r8 != 0) goto L_0x00b7
            r8 = 1
            goto L_0x00b8
        L_0x00b7:
            r8 = 0
        L_0x00b8:
            if (r8 != 0) goto L_0x00a1
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r7 = r7.nextIndex()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r7 = r7 + r1
            java.util.List r6 = p2628d.p2629a.C52575l.m112129b(r6, r7)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            goto L_0x00ca
        L_0x00c6:
            java.util.List r6 = p2628d.p2629a.C52575l.m112097a()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x00ca:
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.Object[] r6 = r6.toArray(r7)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r6 == 0) goto L_0x00e9
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r7 = r6.length     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r8 = 2
            if (r7 != r8) goto L_0x00e6
            java.lang.String r7 = "capture"
            r8 = r6[r3]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r7 == 0) goto L_0x00e6
            r5 = r6[r1]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x0082
        L_0x00e9:
            d.u r10 = new d.u     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Array<T>"
            r10.<init>(r11)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            throw r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x00f1:
            r2 = r5
        L_0x00f2:
            r10 = 0
            r9.f71907c = r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r10 = "image/*"
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x012a
            java.lang.String r10 = "camera"
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x010d
            android.content.Intent r10 = r9.m65693b()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x010d:
            android.content.Intent[] r10 = new android.content.Intent[r1]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r11 = r9.m65693b()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10[r3] = r11     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r10 = m65692a(r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r11 = "android.intent.extra.INTENT"
            java.lang.String r2 = "image/*"
            android.content.Intent r2 = m65691a(r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.os.Parcelable r2 = (android.os.Parcelable) r2     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10.putExtra(r11, r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x012a:
            java.lang.String r10 = "video/*"
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x015f
            java.lang.String r10 = "camcorder"
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x0142
            android.content.Intent r10 = m65694c()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x0142:
            android.content.Intent[] r10 = new android.content.Intent[r1]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r11 = m65694c()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10[r3] = r11     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r10 = m65692a(r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r11 = "android.intent.extra.INTENT"
            java.lang.String r2 = "video/*"
            android.content.Intent r2 = m65691a(r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.os.Parcelable r2 = (android.os.Parcelable) r2     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10.putExtra(r11, r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x015f:
            java.lang.String r10 = "audio/*"
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x0194
            java.lang.String r10 = "microphone"
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x0177
            android.content.Intent r10 = m65695d()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x0177:
            android.content.Intent[] r10 = new android.content.Intent[r1]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r11 = m65695d()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10[r3] = r11     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r10 = m65692a(r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r11 = "android.intent.extra.INTENT"
            java.lang.String r2 = "audio/*"
            android.content.Intent r2 = m65691a(r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.os.Parcelable r2 = (android.os.Parcelable) r2     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10.putExtra(r11, r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x0194:
            android.content.Intent r10 = r9.m65690a()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x019c:
            d.u r10 = new d.u     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Array<T>"
            r10.<init>(r11)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            throw r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x01a4:
            return
        L_0x01a5:
            r9.f71908d = r1     // Catch:{ ActivityNotFoundException -> 0x01af }
            android.content.Intent r10 = r9.m65690a()     // Catch:{ ActivityNotFoundException -> 0x01af }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01af }
            return
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27252m.mo55641a(java.lang.String, java.lang.String):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        if (i == 2048 && !(this.f71905a == null && this.f71906b == null)) {
            if (i2 != 0 || !this.f71908d) {
                if (intent == null || i2 != -1) {
                    uri = null;
                } else {
                    uri = intent.getData();
                }
                if (uri == null && intent == null && i2 == -1) {
                    String str = this.f71907c;
                    if (str == null) {
                        C52711k.m112234a();
                    }
                    File file = new File(str);
                    if (file.exists()) {
                        uri = Uri.fromFile(file);
                        Context context = getContext();
                        if (context != null) {
                            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                        }
                    }
                }
                if (this.f71905a != null) {
                    ValueCallback<Uri> valueCallback = this.f71905a;
                    if (valueCallback == null) {
                        C52711k.m112234a();
                    }
                    valueCallback.onReceiveValue(uri);
                    this.f71905a = null;
                }
                if (this.f71906b != null) {
                    ValueCallback<Uri[]> valueCallback2 = this.f71906b;
                    if (valueCallback2 == null) {
                        C52711k.m112234a();
                    }
                    valueCallback2.onReceiveValue(uri == null ? null : new Uri[]{uri});
                    this.f71906b = null;
                }
                this.f71908d = false;
            } else {
                this.f71908d = false;
            }
        }
    }
}
