package com.bytedance.polaris.widget.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.polaris.p821a.C12562h;
import com.bytedance.polaris.p821a.C12563i;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.polaris.widget.webview.b */
public class C12657b extends WebChromeClient {

    /* renamed from: a */
    private WeakReference<Fragment> f33244a;

    /* renamed from: b */
    public ValueCallback<Uri[]> f33245b;

    /* renamed from: c */
    public boolean f33246c;

    /* renamed from: d */
    public ValueCallback<Uri> f33247d;

    /* renamed from: e */
    public String f33248e;

    /* renamed from: f */
    private WeakReference<Activity> f33249f;

    /* renamed from: a */
    public Context mo23786a() {
        if (this.f33244a != null && this.f33244a.get() != null) {
            return ((Fragment) this.f33244a.get()).getActivity();
        }
        if (this.f33249f == null || this.f33249f.get() == null) {
            return null;
        }
        return (Context) this.f33249f.get();
    }

    public View getVideoLoadingProgressView() {
        Context a = mo23786a();
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

    public C12657b(Fragment fragment) {
        this.f33244a = new WeakReference<>(fragment);
        if (fragment.getActivity() != null) {
            this.f33249f = new WeakReference<>(fragment.getActivity());
        }
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        if (VERSION.SDK_INT < 21) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        this.f33245b = valueCallback;
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        String str = "";
        final String str2 = "filesystem";
        try {
            final String str3 = acceptTypes[0];
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            if (str.equals("filesystem")) {
                String str4 = str2;
                for (String split : acceptTypes) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2 && "capture".equals(split2[0])) {
                        str4 = split2[1];
                    }
                }
                str2 = str4;
            }
            this.f33248e = null;
            if (!str3.equals("image/*") && !str3.equals("video/*")) {
                if (!str3.equals("audio/*")) {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.setType("*/*");
                    Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
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
                    this.f33248e = sb2.toString();
                    intent2.putExtra("output", Uri.fromFile(new File(this.f33248e)));
                    Intent[] intentArr = {intent2, new Intent("android.media.action.VIDEO_CAPTURE"), new Intent("android.provider.MediaStore.RECORD_SOUND")};
                    Intent intent3 = new Intent("android.intent.action.CHOOSER");
                    intent3.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
                    intent3.putExtra("android.intent.extra.INTENT", intent);
                    if (this.f33244a == null || this.f33244a.get() == null) {
                        if (!(this.f33249f == null || this.f33249f.get() == null)) {
                            ((Activity) this.f33249f.get()).startActivityForResult(intent3, 2048);
                        }
                        return true;
                    }
                    ((Fragment) this.f33244a.get()).startActivityForResult(intent3, 2048);
                    return true;
                }
            }
            C12563i.m25225g().mo23611a((Activity) this.f33249f.get(), new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, (C12562h) new C12562h() {
            });
        } catch (Exception unused) {
        }
        return true;
    }
}
