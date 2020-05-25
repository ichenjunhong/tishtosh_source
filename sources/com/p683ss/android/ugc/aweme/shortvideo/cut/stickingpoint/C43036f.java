package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.common.utility.C9395d;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.C43846fo;
import com.p683ss.android.ugc.aweme.shortvideo.C43852fu;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43017a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.p2425e.C48557d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f */
public final class C43036f {

    /* renamed from: a */
    public static String f108636a;

    /* renamed from: b */
    public static final C43036f f108637b = new C43036f();

    /* renamed from: c */
    private static String f108638c;

    /* renamed from: d */
    private static boolean f108639d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f$a */
    public static final class C43037a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f108640a;

        /* renamed from: b */
        final /* synthetic */ View f108641b;

        /* renamed from: c */
        final /* synthetic */ C10660a f108642c;

        /* renamed from: d */
        final /* synthetic */ C23543g f108643d;

        public C43037a(Activity activity, View view, C10660a aVar, C23543g gVar) {
            this.f108640a = activity;
            this.f108641b = view;
            this.f108642c = aVar;
            this.f108643d = gVar;
        }

        public final void run() {
            int i;
            float width;
            if (this.f108640a != null && !this.f108640a.isFinishing()) {
                int[] iArr = new int[2];
                this.f108641b.getLocationOnScreen(iArr);
                int c = iArr[1] - this.f108642c.mo19002c();
                if (C47918gj.m103682a(this.f108640a)) {
                    i = (iArr[0] + this.f108641b.getWidth()) - this.f108642c.mo19003d();
                    width = ((float) this.f108642c.mo19003d()) - (((float) this.f108641b.getWidth()) / 2.0f);
                } else {
                    i = iArr[0];
                    width = ((float) this.f108641b.getWidth()) / 2.0f;
                }
                this.f108642c.mo18998a(this.f108641b, 48, i, c, width);
                this.f108643d.mo48710b("bubble_to_stick_point_hint_shown", true);
                C26890h.m65011a("sound_sync_reminder", C23089d.m56640a().mo47829a("enter_from", "album_panel").f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f$b */
    public static final class C43038b implements C17824h<Object> {

        /* renamed from: a */
        final /* synthetic */ C20347c f108644a;

        /* renamed from: b */
        final /* synthetic */ C43017a f108645b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f$b$a */
        static final class C43039a<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

            /* renamed from: a */
            final /* synthetic */ C43038b f108646a;

            C43039a(C43038b bVar) {
                this.f108646a = bVar;
            }

            public final /* synthetic */ Object then(C0013i iVar) {
                boolean z;
                C52711k.m112236a((Object) iVar, "it");
                if (iVar.mo26b() && ((StickPointUploadTask) iVar.mo34e()).f108563a != null) {
                    String str = ((StickPointUploadTask) iVar.mo34e()).f108563a;
                    if (str == null) {
                        C52711k.m112234a();
                    }
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C43017a aVar = this.f108646a.f108645b;
                        if (aVar == null) {
                            return null;
                        }
                        aVar.mo87277a(((StickPointUploadTask) iVar.mo34e()).f108563a);
                        return C52860x.f131107a;
                    }
                }
                C43017a aVar2 = this.f108646a.f108645b;
                if (aVar2 == null) {
                    return null;
                }
                aVar2.mo87278a((Throwable) iVar.mo35f());
                return C52860x.f131107a;
            }
        }

        public final void onFailure(Throwable th) {
            C52711k.m112240b(th, "t");
            C43017a aVar = this.f108645b;
            if (aVar != null) {
                aVar.mo87278a(th);
            }
        }

        public final void onSuccess(Object obj) {
            String e = C39629l.m88232a().mo58574e().mo83121e(C40796a.SdkV4AuthKey);
            if (!TextUtils.isEmpty(e)) {
                C43846fo foVar = (C43846fo) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34884a(e, C43846fo.class);
                File file = new File(C43036f.m94303a());
                String path = file.getPath();
                C52711k.m112236a((Object) path, "file.path");
                if (!file.exists()) {
                    file.createNewFile();
                }
                if (this.f108644a == null) {
                    C43017a aVar = this.f108645b;
                    if (aVar != null) {
                        aVar.mo87278a(new Throwable("veEditor = null"));
                    }
                }
                int c = this.f108644a.mo43042c(path);
                if (c != 0) {
                    C43017a aVar2 = this.f108645b;
                    if (aVar2 != null) {
                        aVar2.mo87278a(new Throwable(String.valueOf(c)));
                        return;
                    }
                    return;
                }
                int d = this.f108644a.mo43050d(path);
                if (d != 0) {
                    C43017a aVar3 = this.f108645b;
                    if (aVar3 != null) {
                        aVar3.mo87278a(new Throwable(String.valueOf(d)));
                        return;
                    }
                    return;
                }
                StickPointUploadTask stickPointUploadTask = new StickPointUploadTask(path);
                C52711k.m112236a((Object) foVar, "config");
                C43852fu fuVar = foVar.f111026a;
                C52711k.m112236a((Object) fuVar, "config.uploadVideoConfig");
                stickPointUploadTask.mo87370a(fuVar).mo19a((C0011g<TResult, TContinuationResult>) new C43039a<TResult,TContinuationResult>(this));
            }
        }

        public C43038b(C20347c cVar, C43017a aVar) {
            this.f108644a = cVar;
            this.f108645b = aVar;
        }
    }

    private C43036f() {
    }

    /* renamed from: a */
    public static String m94303a() {
        return f108638c;
    }

    /* renamed from: b */
    public final int mo87418b() {
        if (m94312e()) {
            return C44300e.f112161a;
        }
        return 12;
    }

    /* renamed from: f */
    public final boolean mo87419f() {
        if (!f108639d || !m94312e()) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C43308eb.f109491d);
        sb.append("aiCutData.txt");
        f108638c = sb.toString();
    }

    /* renamed from: d */
    public static final boolean m94311d() {
        return C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableSmartStickPointFeedback);
    }

    /* renamed from: e */
    public static boolean m94312e() {
        return C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableMusicStickPoint);
    }

    /* renamed from: g */
    public static boolean m94313g() {
        if (C39629l.m88232a().mo58583n().mo83104b(C40790a.StickPointDefaltMode) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m94309c() {
        return C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableSmartMusicStickPoint);
    }

    /* renamed from: a */
    public static void m94304a(String str) {
        f108636a = str;
    }

    /* renamed from: a */
    public static void m94305a(boolean z) {
        f108639d = z;
    }

    /* renamed from: b */
    public static String m94306b(C42482c cVar) {
        if (cVar == null || cVar.getStickPointMusicAlg() == null) {
            return "";
        }
        return cVar.getStickPointMusicAlg().getDefaultLocalPath();
    }

    /* renamed from: c */
    public static String m94308c(C42482c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.getPath())) {
            return null;
        }
        return C48557d.m105031a().mo96061a(cVar.getPath());
    }

    /* renamed from: b */
    private static String m94307b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C48557d a = C48557d.m105031a();
        C52711k.m112236a((Object) a, "MusicProviderConfig.getInstance()");
        String b = a.mo96062b();
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        Uri parse = Uri.parse(str);
        C52711k.m112236a((Object) parse, "Uri.parse(fileUrl)");
        sb.append(C9395d.m18571a(parse.getPath()));
        sb.append(".json");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0013  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo87415a(android.content.Context r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0010
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x0010
            r0 = 2132549489(0x7f1c1f71, float:2.0752282E38)
            java.lang.String r5 = r5.getString(r0)
            goto L_0x0011
        L_0x0010:
            r5 = 0
        L_0x0011:
            if (r5 != 0) goto L_0x0016
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0016:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            int r3 = r4.mo87418b()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r5 = com.C2240a.m6772a(r5, r0)
            java.lang.String r0 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.mo87415a(android.content.Context):java.lang.String");
    }

    /* renamed from: d */
    public static String m94310d(C42482c cVar) {
        String str;
        if (cVar == null) {
            return "music == null";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("music_id", cVar.getMusicId());
            if (cVar.getStickPointMusicAlg() != null) {
                jSONObject.put("AO_url", cVar.getStickPointMusicAlg().getVeBeatsUrl());
                jSONObject.put("C_url", cVar.getStickPointMusicAlg().getDownBeatsUrl());
                jSONObject.put("A1_url", cVar.getStickPointMusicAlg().getNoStrengthBeatsUrl());
                jSONObject.put("man_mode_url", cVar.getStickPointMusicAlg().getManModeBeatsUrl());
            } else {
                jSONObject.put("no_url", cVar.getId());
            }
            str = jSONObject.toString();
            C52711k.m112236a((Object) str, "jsonStr.toString()");
        } catch (Exception unused) {
            str = "exception";
        }
        return str;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0079 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0086 A[Catch:{ Exception -> 0x00b6 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87416a(com.p683ss.android.ugc.aweme.shortvideo.C42482c r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            com.ss.android.ugc.aweme.shortvideo.ew r0 = new com.ss.android.ugc.aweme.shortvideo.ew
            r0.<init>()
            java.lang.String r1 = r4.getMusicId()
            r0.setMusicId(r1)
            r4.setStickPointMusicAlg(r0)
            java.lang.String r1 = r4.getPath()
            r0.setDefaultLocalUrl(r1)
            java.lang.String r1 = r0.getDefaultLocalUrl()
            java.lang.String r1 = m94307b(r1)
            r0.setDefaultLocalPath(r1)
            java.lang.String r4 = r4.extra
            r1 = r4
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0030
            return
        L_0x0030:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0079 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = "beats"
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x0079 }
            if (r1 == 0) goto L_0x0079
            java.lang.String r2 = "audio_effect_onset"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Exception -> 0x0079 }
            r0.setVeBeatsUrl(r2)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = "merged_beats"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Exception -> 0x0079 }
            r0.setDownBeatsUrl(r2)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = "beats_tracker"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ Exception -> 0x0079 }
            r0.setNoStrengthBeatsUrl(r1)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = r0.getDownBeatsUrl()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = m94307b(r1)     // Catch:{ Exception -> 0x0079 }
            r0.setDownBeatsPath(r1)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = r0.getVeBeatsUrl()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = m94307b(r1)     // Catch:{ Exception -> 0x0079 }
            r0.setVeBeatsPath(r1)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = r0.getNoStrengthBeatsUrl()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = m94307b(r1)     // Catch:{ Exception -> 0x0079 }
            r0.setNoStrengthBeatsPath(r1)     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b6 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r4 = "douyin_beats_info"
            org.json.JSONObject r4 = r1.optJSONObject(r4)     // Catch:{ Exception -> 0x00b6 }
            if (r4 == 0) goto L_0x00b6
            java.lang.String r1 = "min_video_num"
            int r1 = r4.optInt(r1)     // Catch:{ Exception -> 0x00b6 }
            r0.setMinSeg(r1)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r1 = "max_video_num"
            int r1 = r4.optInt(r1)     // Catch:{ Exception -> 0x00b6 }
            r0.setMaxSeg(r1)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r1 = "type"
            int r1 = r4.optInt(r1)     // Catch:{ Exception -> 0x00b6 }
            r0.setAlgType(r1)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r1 = "man_made_beats"
            java.lang.String r4 = r4.optString(r1)     // Catch:{ Exception -> 0x00b6 }
            r0.setManModeBeatsUrl(r4)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r4 = r0.getManModeBeatsUrl()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r4 = m94307b(r4)     // Catch:{ Exception -> 0x00b6 }
            r0.setManModeBeatsPath(r4)     // Catch:{ Exception -> 0x00b6 }
            return
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.mo87416a(com.ss.android.ugc.aweme.shortvideo.c):void");
    }

    /* renamed from: a */
    public final boolean mo87417a(Activity activity, ArrayList<String> arrayList, long j) {
        if (C9190h.m18253a((List<?>) arrayList)) {
            return false;
        }
        int b = mo87418b();
        if (arrayList == null) {
            C52711k.m112234a();
        }
        int size = b - arrayList.size();
        if (size <= 0) {
            Context context = activity;
            C10691a.m21537a(context, mo87415a(context)).mo19066a();
            return false;
        }
        long j2 = 3600000 - j;
        Bundle bundle = new Bundle();
        int i = 4;
        if (C44300e.m97041c()) {
            i = 6;
            bundle.putInt("key_photo_select_min_count", 0);
            bundle.putInt("key_photo_select_max_count", size);
        }
        bundle.putInt("key_support_flag", i);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_video_select_min_count", 0);
        bundle.putInt("key_video_select_max_count", size);
        bundle.putLong("Key_max_duration", j2);
        bundle.putLong("Key_min_duration", 1000);
        bundle.putStringArrayList("key_selected_video_path", arrayList);
        if (activity != null) {
            C44403a.m97196a().mo48297a(activity, bundle, 2, 1001);
        }
        return true;
    }
}
