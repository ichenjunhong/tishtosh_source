package dmt.p2652av.video;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43449bd;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43451be;
import com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.ResultData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.State;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.C50585a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: dmt.av.video.j */
public final class C52972j {

    /* renamed from: dmt.av.video.j$a */
    public static final class C52973a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((C52969g) t).f131376a), Integer.valueOf(((C52969g) t2).f131376a));
        }
    }

    /* renamed from: dmt.av.video.j$b */
    static final class C52974b extends C52712l implements C52671b<String, List<? extends C52969g>> {

        /* renamed from: a */
        public static final C52974b f131381a = new C52974b();

        C52974b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m112702a((String) obj);
        }

        /* renamed from: a */
        public static List<C52969g> m112702a(String str) {
            C52711k.m112240b(str, "synthesisSettingsJson");
            List<C52969g> arrayList = new ArrayList<>();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        int optInt = jSONObject.optInt("max_speed");
                        JSONObject optJSONObject = jSONObject.optJSONObject("setting");
                        if (optJSONObject != null) {
                            String jSONObject2 = optJSONObject.toString();
                            C52711k.m112236a((Object) jSONObject2, "settings.toString()");
                            arrayList.add(new C52969g(optInt, jSONObject2));
                        }
                    }
                }
            } catch (JSONException unused) {
            }
            return arrayList;
        }
    }

    /* renamed from: dmt.av.video.j$c */
    static final class C52975c extends C52712l implements C52671b<CompileProbeResult, Integer> {

        /* renamed from: a */
        public static final C52975c f131382a = new C52975c();

        C52975c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m112703a((CompileProbeResult) obj);
        }

        /* renamed from: a */
        public static Integer m112703a(CompileProbeResult compileProbeResult) {
            if (compileProbeResult == null || compileProbeResult.getStatus().getState() != State.SUCCESS) {
                return null;
            }
            ResultData data = compileProbeResult.getData();
            if (data != null) {
                return Integer.valueOf(data.getCrf());
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final void m112698a(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "source");
        if (videoPublishEditModel.compileProbeResult != null) {
            CompileProbeResult compileProbeResult = videoPublishEditModel.compileProbeResult;
            if (compileProbeResult == null) {
                C52711k.m112234a();
            }
            if (compileProbeResult.getStatus().getState() == State.SUCCESS) {
                return;
            }
        }
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.uploadSpeedInfo;
        C52711k.m112236a((Object) uploadSpeedInfo, "source.uploadSpeedInfo");
        m112697a(uploadSpeedInfo);
    }

    /* renamed from: a */
    private static final String m112697a(UploadSpeedInfo uploadSpeedInfo) {
        boolean z;
        String e = C39618d.f101152P.mo83107e(C40790a.VESynthesisSettingsByUploadSpeed);
        long speed = uploadSpeedInfo.getSpeed();
        if (speed > 0 && !TextUtils.isEmpty(e)) {
            C52711k.m112236a((Object) e, "synthesisSettingsByUploadSpeed");
            Iterable a = C52974b.m112702a(e);
            Collection arrayList = new ArrayList();
            for (Object next : a) {
                if (((long) ((C52969g) next).f131376a) > speed) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            C52969g gVar = (C52969g) C52575l.m112140f(C52575l.m112122a((Iterable<? extends T>) (List) arrayList, (Comparator<? super T>) new C52973a<Object>()));
            if (gVar != null) {
                uploadSpeedInfo.setUsedCompilerSettingGroup(gVar.f131376a);
                return gVar.f131377b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m112700a(VideoPublishEditModel videoPublishEditModel, Integer[] numArr) {
        boolean z;
        int i;
        int i2;
        long j;
        int i3;
        C52711k.m112240b(videoPublishEditModel, "source");
        C52711k.m112240b(numArr, "outVideoSize");
        if (videoPublishEditModel.mWatermarkVideoWidth <= 0 || videoPublishEditModel.mWatermarkVideoHeight <= 0) {
            boolean z2 = false;
            videoPublishEditModel.mWatermarkVideoWidth = numArr[0].intValue();
            videoPublishEditModel.mWatermarkVideoHeight = numArr[1].intValue();
            C40790a aVar = C40790a.WatermarkResSetting;
            String e = C39618d.f101152P.mo83107e(aVar);
            CharSequence charSequence = e;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            Object obj = null;
            if (!z) {
                try {
                    obj = C39618d.f101161b.mo34884a(e, WatermarkResSetting.class);
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("Json AB 配置错误，AB:");
                    sb.append(aVar.name());
                    sb.append(" 配置:");
                    sb.append(e);
                    C50203g.m108361b(sb.toString());
                }
            }
            WatermarkResSetting watermarkResSetting = (WatermarkResSetting) obj;
            int i4 = -1;
            if (watermarkResSetting != null) {
                long minAllowDiskMB = ((long) watermarkResSetting.getMinAllowDiskMB()) * 1024 * 1024;
                j = C48016e.m103958h();
                if (j >= minAllowDiskMB) {
                    C43449bd a = C43451be.m95243a(videoPublishEditModel, false);
                    i3 = a.mo88244b(false);
                    i4 = a.mo88243a(false);
                    int max = Math.max(i3, i4);
                    int min = Math.min(i3, i4);
                    i = watermarkResSetting.getHeight();
                    i2 = watermarkResSetting.getWidth();
                    int max2 = Math.max(i, i2);
                    int min2 = Math.min(i, i2);
                    if (max >= max2 && min >= min2) {
                        if (videoPublishEditModel.mWatermarkVideoWidth >= videoPublishEditModel.mWatermarkVideoHeight) {
                            videoPublishEditModel.mWatermarkVideoWidth = max2;
                            videoPublishEditModel.mWatermarkVideoHeight = min2;
                        } else {
                            videoPublishEditModel.mWatermarkVideoWidth = min2;
                            videoPublishEditModel.mWatermarkVideoHeight = max2;
                        }
                        z2 = true;
                    }
                    StringBuilder sb2 = new StringBuilder("CalculateWatermarkSize useWatermarkSetting:");
                    sb2.append(z2);
                    sb2.append(' ');
                    sb2.append("sourceWidth:");
                    sb2.append(i4);
                    sb2.append(" sourceHeight:");
                    sb2.append(i3);
                    sb2.append(' ');
                    sb2.append("targetWidth:");
                    sb2.append(i2);
                    sb2.append(" targetHeight:");
                    sb2.append(i);
                    sb2.append(' ');
                    sb2.append("width:");
                    sb2.append(videoPublishEditModel.mWatermarkVideoWidth);
                    sb2.append(" height:");
                    sb2.append(videoPublishEditModel.mWatermarkVideoHeight);
                    sb2.append(' ');
                    sb2.append("sdAvailableSize:");
                    sb2.append(j);
                    C45407ay.m98968a(sb2.toString());
                    return;
                }
            } else {
                j = -1;
            }
            i3 = -1;
            i2 = -1;
            i = -1;
            StringBuilder sb22 = new StringBuilder("CalculateWatermarkSize useWatermarkSetting:");
            sb22.append(z2);
            sb22.append(' ');
            sb22.append("sourceWidth:");
            sb22.append(i4);
            sb22.append(" sourceHeight:");
            sb22.append(i3);
            sb22.append(' ');
            sb22.append("targetWidth:");
            sb22.append(i2);
            sb22.append(" targetHeight:");
            sb22.append(i);
            sb22.append(' ');
            sb22.append("width:");
            sb22.append(videoPublishEditModel.mWatermarkVideoWidth);
            sb22.append(" height:");
            sb22.append(videoPublishEditModel.mWatermarkVideoHeight);
            sb22.append(' ');
            sb22.append("sdAvailableSize:");
            sb22.append(j);
            C45407ay.m98968a(sb22.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("CalculateWatermarkSize exist ");
        sb3.append("width:");
        sb3.append(videoPublishEditModel.mWatermarkVideoWidth);
        sb3.append(" height:");
        sb3.append(videoPublishEditModel.mWatermarkVideoHeight);
        sb3.append(' ');
        C45407ay.m98968a(sb3.toString());
    }

    /* renamed from: a */
    public static final void m112699a(VideoPublishEditModel videoPublishEditModel, C50585a aVar, Integer[] numArr) {
        C52711k.m112240b(videoPublishEditModel, "source");
        C52711k.m112240b(aVar, "settingsBuilder");
        C52711k.m112240b(numArr, "outVideoSize");
        m112700a(videoPublishEditModel, numArr);
        aVar.mo98708b(videoPublishEditModel.mWatermarkVideoWidth, videoPublishEditModel.mWatermarkVideoHeight);
    }

    /* renamed from: a */
    public static final void m112701a(UploadSpeedInfo uploadSpeedInfo, CompileProbeResult compileProbeResult, C50585a aVar) {
        C52711k.m112240b(uploadSpeedInfo, "uploadSpeedInfo");
        C52711k.m112240b(aVar, "settingsBuilder");
        String e = C39618d.f101152P.mo83107e(C40790a.VESynthesisSettings);
        String a = m112697a(uploadSpeedInfo);
        if (a != null) {
            StringBuilder sb = new StringBuilder("VECompile setExternalSettings uploadSpeedProbeSettings: ");
            sb.append(a);
            C45407ay.m98968a(sb.toString());
            aVar.mo98701a(a);
            return;
        }
        Integer a2 = C52975c.m112703a(compileProbeResult);
        if (a2 != null) {
            StringBuilder sb2 = new StringBuilder("VECompile setExternalSettings preCompileCrf: ");
            sb2.append(a2);
            C45407ay.m98968a(sb2.toString());
            aVar.mo98702a(e, a2.intValue(), C39618d.f101152P.mo83103a(C40790a.EnableVECompileCrfReencode));
            return;
        }
        StringBuilder sb3 = new StringBuilder("VECompile setExternalSettings defaultSettings: ");
        sb3.append(e);
        C45407ay.m98968a(sb3.toString());
        aVar.mo98701a(e);
    }
}
