package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu.C6169a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p383i.C7668a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.o */
public final class C4918o extends C10779d<JSONObject, Object> {

    /* renamed from: a */
    private C10783f f13219a;

    public final void onTerminate() {
        this.f13219a = null;
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        this.f13219a = fVar;
        String optString = jSONObject.optString("type");
        final JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if ("apk".equals(optString) && this.f13219a != null && this.f13219a.f28972a != null && optJSONObject != null) {
            new C6169a(this.f13219a.f28972a, 2).mo12210a(true).mo12208a((CharSequence) optJSONObject.optString("title", "")).mo12213b((CharSequence) optJSONObject.optString(C42311c.f106865i, "")).mo12209a(optJSONObject.optString("cancel_text", ""), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo12214b(optJSONObject.optString("confirm_text", ""), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    String str;
                    File[] listFiles;
                    JSONObject jSONObject = optJSONObject;
                    if (jSONObject != null) {
                        String optString = jSONObject.optString("download_url", "");
                        if (!C9431p.m18664a(optString)) {
                            C7668a aVar = new C7668a(optString);
                            aVar.f21127g = jSONObject.optString("toast_text", "");
                            if (!aVar.f21125e) {
                                aVar.f21125e = true;
                                if (aVar.f21123c != null && aVar.f21123c.exists() && !C9431p.m18664a(aVar.f21126f)) {
                                    try {
                                        File file = aVar.f21123c;
                                        if (file == null && aVar.f21124d != null) {
                                            file = new File(aVar.f21124d);
                                        }
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (file != null && file.exists() && file.isDirectory() && file.listFiles() != null) {
                                            for (File file2 : file.listFiles()) {
                                                if (file2 != null && currentTimeMillis - file2.lastModified() > 600000) {
                                                    file2.delete();
                                                }
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                    if (C7668a.f21121a == null) {
                                        C7668a.f21121a = new AtomicInteger();
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(String.valueOf(System.currentTimeMillis()));
                                    sb.append(C7668a.f21121a.incrementAndGet());
                                    String sb2 = sb.toString();
                                    if (!C7668a.f21122b.contains(aVar.f21126f)) {
                                        if (aVar.f21127g == null) {
                                            str = "";
                                        } else {
                                            str = aVar.f21127g;
                                        }
                                        C4575an.m10987a(str);
                                        C7668a.f21122b.add(aVar.f21126f);
                                        DownloadTask url = Downloader.with(C3922z.m9915e()).url(aVar.f21126f);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(sb2);
                                        sb3.append(".apk");
                                        url.name(sb3.toString()).savePath(aVar.f21124d).retryCount(3).mainThreadListener(new AbsDownloadListener() {
                                            public final void onSuccessed(DownloadInfo downloadInfo) {
                                                super.onSuccessed(downloadInfo);
                                                if (downloadInfo != null) {
                                                    Intent intent = new Intent("android.intent.action.VIEW");
                                                    intent.addFlags(268435456);
                                                    if (VERSION.SDK_INT >= 24) {
                                                        intent.addFlags(1);
                                                    }
                                                    intent.setDataAndType(C7668a.m15691a(downloadInfo.getTargetFilePath()), "application/vnd.android.package-archive");
                                                    C3922z.m9915e().startActivity(intent);
                                                }
                                                C7668a.f21122b.remove(C7668a.this.f21126f);
                                            }

                                            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                                                super.onFailed(downloadInfo, baseException);
                                                C7668a.f21122b.remove(C7668a.this.f21126f);
                                            }
                                        }).download();
                                    }
                                }
                            }
                        }
                    }
                    dialogInterface.dismiss();
                }
            }).mo12215b();
        }
    }
}
