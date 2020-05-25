package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.internal.measurement.C16636dr;
import com.google.android.gms.internal.measurement.C16637ds;
import com.google.android.gms.internal.measurement.C16638dt;
import com.google.android.gms.internal.measurement.C16639du;
import com.google.android.gms.internal.measurement.C16640dv;
import com.google.android.gms.internal.measurement.C16644dz;
import com.google.android.gms.internal.measurement.C16646ea;
import com.google.android.gms.internal.measurement.C16647eb;
import com.google.android.gms.internal.measurement.C16648ec;
import com.google.android.gms.internal.measurement.C16649ed;
import com.google.android.gms.internal.measurement.C16650ee;
import com.google.android.gms.internal.measurement.C16651ef;
import com.google.android.gms.internal.measurement.C16652eg;
import com.google.android.gms.internal.measurement.C16653eh;
import com.google.android.gms.internal.measurement.C16663er;
import com.google.android.gms.internal.measurement.C16674fb;
import com.google.android.gms.internal.measurement.C16841ks;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.google.android.gms.measurement.internal.ej */
public final class C17099ej extends C17091ec {
    C17099ej(C17092ed edVar) {
        super(edVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32904d() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33126a(C16653eh ehVar, Object obj) {
        C15464q.m32123a(obj);
        ehVar.f46851c = null;
        ehVar.f46852d = null;
        ehVar.f46853e = null;
        if (obj instanceof String) {
            ehVar.f46851c = (String) obj;
        } else if (obj instanceof Long) {
            ehVar.f46852d = (Long) obj;
        } else if (obj instanceof Double) {
            ehVar.f46853e = (Double) obj;
        } else {
            mo32854q().f48445b.mo33377a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33125a(C16648ec ecVar, Object obj) {
        C15464q.m32123a(obj);
        ecVar.f46794b = null;
        ecVar.f46795c = null;
        ecVar.f46796d = null;
        if (obj instanceof String) {
            ecVar.f46794b = (String) obj;
        } else if (obj instanceof Long) {
            ecVar.f46795c = (Long) obj;
        } else if (obj instanceof Double) {
            ecVar.f46796d = (Double) obj;
        } else {
            mo32854q().f48445b.mo33377a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte[] mo33129a(C16649ed edVar) {
        try {
            byte[] bArr = new byte[edVar.mo32479e()];
            C16841ks a = C16841ks.m40859a(bArr, 0, bArr.length);
            edVar.mo31924a(a);
            a.mo32439a();
            return bArr;
        } catch (IOException e) {
            mo32854q().f48445b.mo33377a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    /* renamed from: a */
    static C16648ec m41615a(C16647eb ebVar, String str) {
        C16648ec[] ecVarArr;
        for (C16648ec ecVar : ebVar.f46787a) {
            if (ecVar.f46793a.equals(str)) {
                return ecVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    static Object m41625b(C16647eb ebVar, String str) {
        C16648ec a = m41615a(ebVar, str);
        if (a != null) {
            if (a.f46794b != null) {
                return a.f46794b;
            }
            if (a.f46795c != null) {
                return a.f46795c;
            }
            if (a.f46796d != null) {
                return a.f46796d;
            }
        }
        return null;
    }

    /* renamed from: a */
    static C16648ec[] m41624a(C16648ec[] ecVarArr, String str, Object obj) {
        for (C16648ec ecVar : ecVarArr) {
            if (str.equals(ecVar.f46793a)) {
                ecVar.f46795c = null;
                ecVar.f46794b = null;
                ecVar.f46796d = null;
                if (obj instanceof Long) {
                    ecVar.f46795c = (Long) obj;
                }
                return ecVarArr;
            }
        }
        C16648ec[] ecVarArr2 = new C16648ec[(ecVarArr.length + 1)];
        System.arraycopy(ecVarArr, 0, ecVarArr2, 0, ecVarArr.length);
        C16648ec ecVar2 = new C16648ec();
        ecVar2.f46793a = str;
        if (obj instanceof Long) {
            ecVar2.f46795c = (Long) obj;
        }
        ecVarArr2[ecVarArr.length] = ecVar2;
        return ecVarArr2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo33131b(C16649ed edVar) {
        C16650ee[] eeVarArr;
        int i;
        int i2;
        C16649ed edVar2 = edVar;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (edVar2.f46798a != null) {
            for (C16650ee eeVar : edVar2.f46798a) {
                if (!(eeVar == null || eeVar == null)) {
                    m41616a(sb, 1);
                    sb.append("bundle {\n");
                    m41620a(sb, 1, "protocol_version", (Object) eeVar.f46815a);
                    m41620a(sb, 1, "platform", (Object) eeVar.f46823i);
                    m41620a(sb, 1, "gmp_version", (Object) eeVar.f46831q);
                    m41620a(sb, 1, "uploading_gmp_version", (Object) eeVar.f46832r);
                    m41620a(sb, 1, "config_version", (Object) eeVar.f46804E);
                    m41620a(sb, 1, "gmp_app_id", (Object) eeVar.f46839y);
                    m41620a(sb, 1, "admob_app_id", (Object) eeVar.f46808I);
                    m41620a(sb, 1, "app_id", (Object) eeVar.f46829o);
                    m41620a(sb, 1, "app_version", (Object) eeVar.f46830p);
                    m41620a(sb, 1, "app_version_major", (Object) eeVar.f46802C);
                    m41620a(sb, 1, "firebase_instance_id", (Object) eeVar.f46801B);
                    m41620a(sb, 1, "dev_cert_hash", (Object) eeVar.f46836v);
                    m41620a(sb, 1, "app_store", (Object) eeVar.f46828n);
                    m41620a(sb, 1, "upload_timestamp_millis", (Object) eeVar.f46818d);
                    m41620a(sb, 1, "start_timestamp_millis", (Object) eeVar.f46819e);
                    m41620a(sb, 1, "end_timestamp_millis", (Object) eeVar.f46820f);
                    m41620a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) eeVar.f46821g);
                    m41620a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) eeVar.f46822h);
                    m41620a(sb, 1, "app_instance_id", (Object) eeVar.f46835u);
                    m41620a(sb, 1, "resettable_device_id", (Object) eeVar.f46833s);
                    m41620a(sb, 1, "device_id", (Object) eeVar.f46803D);
                    m41620a(sb, 1, "ds_id", (Object) eeVar.f46806G);
                    m41620a(sb, 1, "limited_ad_tracking", (Object) eeVar.f46834t);
                    m41620a(sb, 1, "os_version", (Object) eeVar.f46824j);
                    m41620a(sb, 1, "device_model", (Object) eeVar.f46825k);
                    m41620a(sb, 1, "user_default_language", (Object) eeVar.f46826l);
                    m41620a(sb, 1, "time_zone_offset_minutes", (Object) eeVar.f46827m);
                    m41620a(sb, 1, "bundle_sequential_index", (Object) eeVar.f46837w);
                    m41620a(sb, 1, "service_upload", (Object) eeVar.f46840z);
                    m41620a(sb, 1, "health_monitor", (Object) eeVar.f46838x);
                    if (!(eeVar.f46805F == null || eeVar.f46805F.longValue() == 0)) {
                        m41620a(sb, 1, "android_id", (Object) eeVar.f46805F);
                    }
                    if (eeVar.f46807H != null) {
                        m41620a(sb, 1, "retry_counter", (Object) eeVar.f46807H);
                    }
                    C16653eh[] ehVarArr = eeVar.f46817c;
                    if (ehVarArr != null) {
                        for (C16653eh ehVar : ehVarArr) {
                            if (ehVar != null) {
                                m41616a(sb, 2);
                                sb.append("user_property {\n");
                                m41620a(sb, 2, "set_timestamp_millis", (Object) ehVar.f46849a);
                                m41620a(sb, 2, LeakCanaryFileProvider.f132049i, (Object) mo32851n().mo33371c(ehVar.f46850b));
                                m41620a(sb, 2, "string_value", (Object) ehVar.f46851c);
                                m41620a(sb, 2, "int_value", (Object) ehVar.f46852d);
                                m41620a(sb, 2, "double_value", (Object) ehVar.f46853e);
                                m41616a(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    C16644dz[] dzVarArr = eeVar.f46800A;
                    String str = eeVar.f46829o;
                    if (dzVarArr != null) {
                        int length = dzVarArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            C16644dz dzVar = dzVarArr[i3];
                            if (dzVar != null) {
                                m41616a(sb, 2);
                                sb.append("audience_membership {\n");
                                m41620a(sb, 2, "audience_id", (Object) dzVar.f46775a);
                                m41620a(sb, 2, "new_audience", (Object) dzVar.f46778d);
                                StringBuilder sb2 = sb;
                                C16644dz dzVar2 = dzVar;
                                i2 = i3;
                                i = length;
                                String str2 = str;
                                m41619a(sb2, 2, "current_data", dzVar.f46776b, str2);
                                m41619a(sb2, 2, "previous_data", dzVar2.f46777c, str2);
                                m41616a(sb, 2);
                                sb.append("}\n");
                            } else {
                                i2 = i3;
                                i = length;
                            }
                            i3 = i2 + 1;
                            length = i;
                        }
                    }
                    C16647eb[] ebVarArr = eeVar.f46816b;
                    if (ebVarArr != null) {
                        for (C16647eb ebVar : ebVarArr) {
                            if (ebVar != null) {
                                m41616a(sb, 2);
                                sb.append("event {\n");
                                m41620a(sb, 2, LeakCanaryFileProvider.f132049i, (Object) mo32851n().mo33369a(ebVar.f46788b));
                                m41620a(sb, 2, "timestamp_millis", (Object) ebVar.f46789c);
                                m41620a(sb, 2, "previous_timestamp_millis", (Object) ebVar.f46790d);
                                m41620a(sb, 2, "count", (Object) ebVar.f46791e);
                                C16648ec[] ecVarArr = ebVar.f46787a;
                                if (ecVarArr != null) {
                                    for (C16648ec ecVar : ecVarArr) {
                                        if (ecVar != null) {
                                            m41616a(sb, 3);
                                            sb.append("param {\n");
                                            m41620a(sb, 3, LeakCanaryFileProvider.f132049i, (Object) mo32851n().mo33370b(ecVar.f46793a));
                                            m41620a(sb, 3, "string_value", (Object) ecVar.f46794b);
                                            m41620a(sb, 3, "int_value", (Object) ecVar.f46795c);
                                            m41620a(sb, 3, "double_value", (Object) ecVar.f46796d);
                                            m41616a(sb, 3);
                                            sb.append("}\n");
                                        }
                                    }
                                }
                                m41616a(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    m41616a(sb, 1);
                    sb.append("}\n");
                }
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo33123a(C16636dr drVar) {
        if (drVar == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        m41620a(sb, 0, "filter_id", (Object) drVar.f46731a);
        m41620a(sb, 0, "event_name", (Object) mo32851n().mo33369a(drVar.f46732b));
        m41618a(sb, 1, "event_count_filter", drVar.f46734d);
        sb.append("  filters {\n");
        for (C16637ds a : drVar.f46733c) {
            m41617a(sb, 2, a);
        }
        m41616a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo33124a(C16639du duVar) {
        if (duVar == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        m41620a(sb, 0, "filter_id", (Object) duVar.f46749a);
        m41620a(sb, 0, "property_name", (Object) mo32851n().mo33371c(duVar.f46750b));
        m41617a(sb, 1, duVar.f46751c);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    private final void m41619a(StringBuilder sb, int i, String str, C16651ef efVar, String str2) {
        if (efVar != null) {
            m41616a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (efVar.f46842b != null) {
                m41616a(sb, 4);
                sb.append("results: ");
                long[] jArr = efVar.f46842b;
                int length = jArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    Long valueOf = Long.valueOf(jArr[i2]);
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf);
                    i2++;
                    i3 = i4;
                }
                sb.append(10);
            }
            if (efVar.f46841a != null) {
                m41616a(sb, 4);
                sb.append("status: ");
                long[] jArr2 = efVar.f46841a;
                int length2 = jArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    Long valueOf2 = Long.valueOf(jArr2[i5]);
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf2);
                    i5++;
                    i6 = i7;
                }
                sb.append(10);
            }
            if (mo32856s().mo33284f(str2)) {
                if (efVar.f46843c != null) {
                    m41616a(sb, 4);
                    sb.append("dynamic_filter_timestamps: {");
                    C16646ea[] eaVarArr = efVar.f46843c;
                    int length3 = eaVarArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        C16646ea eaVar = eaVarArr[i8];
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(", ");
                        }
                        sb.append(eaVar.f46784a);
                        sb.append(":");
                        sb.append(eaVar.f46785b);
                        i8++;
                        i9 = i10;
                    }
                    sb.append("}\n");
                }
                if (efVar.f46844d != null) {
                    m41616a(sb, 4);
                    sb.append("sequence_filter_timestamps: {");
                    C16652eg[] egVarArr = efVar.f46844d;
                    int length4 = egVarArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length4) {
                        C16652eg egVar = egVarArr[i11];
                        int i13 = i12 + 1;
                        if (i12 != 0) {
                            sb.append(", ");
                        }
                        sb.append(egVar.f46846a);
                        sb.append(": [");
                        long[] jArr3 = egVar.f46847b;
                        int length5 = jArr3.length;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < length5) {
                            long j = jArr3[i14];
                            int i16 = i15 + 1;
                            if (i15 != 0) {
                                sb.append(", ");
                            }
                            sb.append(j);
                            i14++;
                            i15 = i16;
                        }
                        sb.append("]");
                        i11++;
                        i12 = i13;
                    }
                    sb.append("}\n");
                }
            }
            m41616a(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m41618a(StringBuilder sb, int i, String str, C16638dt dtVar) {
        if (dtVar != null) {
            m41616a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (dtVar.f46743a != null) {
                String str2 = "UNKNOWN_COMPARISON_TYPE";
                switch (dtVar.f46743a.intValue()) {
                    case 1:
                        str2 = "LESS_THAN";
                        break;
                    case 2:
                        str2 = "GREATER_THAN";
                        break;
                    case 3:
                        str2 = "EQUAL";
                        break;
                    case 4:
                        str2 = "BETWEEN";
                        break;
                }
                m41620a(sb, i, "comparison_type", (Object) str2);
            }
            m41620a(sb, i, "match_as_float", (Object) dtVar.f46744b);
            m41620a(sb, i, "comparison_value", (Object) dtVar.f46745c);
            m41620a(sb, i, "min_comparison_value", (Object) dtVar.f46746d);
            m41620a(sb, i, "max_comparison_value", (Object) dtVar.f46747e);
            m41616a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private final void m41617a(StringBuilder sb, int i, C16637ds dsVar) {
        String[] strArr;
        if (dsVar != null) {
            m41616a(sb, i);
            sb.append("filter {\n");
            m41620a(sb, i, "complement", (Object) dsVar.f46741c);
            m41620a(sb, i, "param_name", (Object) mo32851n().mo33370b(dsVar.f46742d));
            int i2 = i + 1;
            String str = "string_filter";
            C16640dv dvVar = dsVar.f46739a;
            if (dvVar != null) {
                m41616a(sb, i2);
                sb.append(str);
                sb.append(" {\n");
                if (dvVar.f46754a != null) {
                    String str2 = "UNKNOWN_MATCH_TYPE";
                    switch (dvVar.f46754a.intValue()) {
                        case 1:
                            str2 = "REGEXP";
                            break;
                        case 2:
                            str2 = "BEGINS_WITH";
                            break;
                        case 3:
                            str2 = "ENDS_WITH";
                            break;
                        case 4:
                            str2 = "PARTIAL";
                            break;
                        case 5:
                            str2 = "EXACT";
                            break;
                        case 6:
                            str2 = "IN_LIST";
                            break;
                    }
                    m41620a(sb, i2, "match_type", (Object) str2);
                }
                m41620a(sb, i2, "expression", (Object) dvVar.f46755b);
                m41620a(sb, i2, "case_sensitive", (Object) dvVar.f46756c);
                if (dvVar.f46757d.length > 0) {
                    m41616a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str3 : dvVar.f46757d) {
                        m41616a(sb, i2 + 2);
                        sb.append(str3);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m41616a(sb, i2);
                sb.append("}\n");
            }
            m41618a(sb, i2, "number_filter", dsVar.f46740b);
            m41616a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m41616a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private static void m41620a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m41616a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo32854q().f48445b.mo33376a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo33122a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002b
        L_0x001c:
            com.google.android.gms.measurement.internal.r r5 = r4.mo32854q()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.t r5 = r5.f48445b     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo33376a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002b:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17099ej.mo33122a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33128a(zzag zzag, zzk zzk) {
        C15464q.m32123a(zzag);
        C15464q.m32123a(zzk);
        return !TextUtils.isEmpty(zzk.f48488b) || !TextUtils.isEmpty(zzk.f48504r);
    }

    /* renamed from: a */
    static boolean m41621a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: a */
    static boolean m41622a(long[] jArr, int i) {
        if (i >= (jArr.length << 6)) {
            return false;
        }
        if (((1 << (i % 64)) & jArr[i / 64]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static long[] m41623a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
            }
        }
        return jArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33127a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo32849l().mo28523a() - j) > j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte[] mo33130a(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo32854q().f48445b.mo33377a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final byte[] mo33132b(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo32854q().f48445b.mo33377a("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int[] mo33133e() {
        Map a = C16663er.m39812a(this.f48232b.mo32850m().getContentResolver(), C16674fb.m39831a("com.google.android.gms.measurement")).mo31977a();
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) C17122h.f48358V.mo33351b()).intValue();
        Iterator it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo32854q().f48448e.mo33377a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo32854q().f48448e.mo33377a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            int i3 = i2 + 1;
            iArr[i2] = ((Integer) obj).intValue();
            i2 = i3;
        }
        return iArr;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C17099ej mo32906f() {
        return super.mo32906f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C17107er mo32908g() {
        return super.mo32908g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C17113ex mo32910h() {
        return super.mo32910h();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32834a() {
        super.mo32834a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32838b() {
        super.mo32838b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo32840c() {
        super.mo32840c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C17007b mo32848k() {
        return super.mo32848k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15514e mo32849l() {
        return super.mo32849l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo32850m() {
        return super.mo32850m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C17131p mo32851n() {
        return super.mo32851n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C17102em mo32852o() {
        return super.mo32852o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C17000at mo32853p() {
        return super.mo32853p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C17133r mo32854q() {
        return super.mo32854q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16986af mo32855r() {
        return super.mo32855r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C17110eu mo32856s() {
        return super.mo32856s();
    }
}
