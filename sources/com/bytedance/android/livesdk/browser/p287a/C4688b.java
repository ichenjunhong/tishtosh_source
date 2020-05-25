package com.bytedance.android.livesdk.browser.p287a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.browser.a.b */
public class C4688b extends WebChromeClient {

    /* renamed from: a */
    public ValueCallback<Uri> f12759a;

    /* renamed from: b */
    public ValueCallback<Uri[]> f12760b;

    /* renamed from: c */
    public String f12761c;

    /* renamed from: d */
    public boolean f12762d;

    /* renamed from: e */
    private WeakReference<Fragment> f12763e;

    /* renamed from: f */
    private WeakReference<Activity> f12764f;

    /* renamed from: d */
    static Intent m11168d() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    /* renamed from: e */
    static Intent m11169e() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    /* renamed from: a */
    public Context mo10475a() {
        if (this.f12763e != null && this.f12763e.get() != null) {
            return ((Fragment) this.f12763e.get()).getActivity();
        }
        if (this.f12764f == null || this.f12764f.get() == null) {
            return null;
        }
        return (Context) this.f12764f.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Intent mo10477b() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a = m11167a(mo10478c(), m11168d(), m11169e());
        a.putExtra("android.intent.extra.INTENT", intent);
        return a;
    }

    public View getVideoLoadingProgressView() {
        Context a = mo10475a();
        if (a == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(a);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        return frameLayout;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Intent mo10478c() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        StringBuilder sb = new StringBuilder();
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
        this.f12761c = sb2.toString();
        intent.putExtra("output", Uri.fromFile(new File(this.f12761c)));
        return intent;
    }

    public C4688b(Fragment fragment) {
        this.f12763e = new WeakReference<>(fragment);
    }

    /* renamed from: a */
    static Intent m11166a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    /* renamed from: a */
    static Intent m11167a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10476a(Intent intent) {
        if (this.f12763e == null || this.f12763e.get() == null) {
            if (!(this.f12764f == null || this.f12764f.get() == null)) {
                ((Activity) this.f12764f.get()).startActivityForResult(intent, 2048);
            }
            return;
        }
        ((Fragment) this.f12763e.get()).startActivityForResult(intent, 2048);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r6 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onShowFileChooser(android.webkit.WebView r4, final android.webkit.ValueCallback<android.net.Uri[]> r5, android.webkit.WebChromeClient.FileChooserParams r6) {
        /*
            r3 = this;
            java.lang.String r4 = ""
            java.lang.String[] r0 = r6.getAcceptTypes()
            int r0 = r0.length
            r1 = 0
            if (r0 <= 0) goto L_0x0010
            java.lang.String[] r4 = r6.getAcceptTypes()
            r4 = r4[r1]
        L_0x0010:
            java.lang.ref.WeakReference<android.app.Activity> r6 = r3.f12764f
            if (r6 == 0) goto L_0x001f
            java.lang.ref.WeakReference<android.app.Activity> r6 = r3.f12764f
            java.lang.Object r6 = r6.get()
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x001f
            goto L_0x0033
        L_0x001f:
            java.lang.ref.WeakReference<android.support.v4.app.Fragment> r6 = r3.f12763e
            if (r6 == 0) goto L_0x0032
            java.lang.ref.WeakReference<android.support.v4.app.Fragment> r6 = r3.f12763e
            java.lang.Object r6 = r6.get()
            android.support.v4.app.Fragment r6 = (android.support.p030v4.app.Fragment) r6
            if (r6 == 0) goto L_0x0032
            android.support.v4.app.FragmentActivity r6 = r6.getActivity()
            goto L_0x0033
        L_0x0032:
            r6 = 0
        L_0x0033:
            com.bytedance.android.livesdk.t.f$b r6 = com.bytedance.android.livesdk.p416t.C8302f.m16453a(r6)
            com.bytedance.android.livesdk.browser.a.b$1 r0 = new com.bytedance.android.livesdk.browser.a.b$1
            r0.<init>(r5, r4)
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r5 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r4[r1] = r5
            java.lang.String r5 = "android.permission.READ_EXTERNAL_STORAGE"
            r1 = 1
            r4[r1] = r5
            r5 = 2
            java.lang.String r2 = "android.permission.CAMERA"
            r4[r5] = r2
            r6.mo14484a(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.p287a.C4688b.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }
}
