package com.p683ss.android.ugc.aweme.sticker.p2278b;

import android.app.Application;
import com.bytedance.common.utility.C9414h;
import com.bytedance.keva.Keva;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46036g;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48637d;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2638e.C52647c;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.sticker.b.j */
public final class C45841j {

    /* renamed from: a */
    public static final C45841j f115858a = new C45841j();

    private C45841j() {
    }

    /* renamed from: a */
    public static String m99668a() {
        StringBuilder sb = new StringBuilder();
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        File filesDir = b.getFilesDir();
        C52711k.m112236a((Object) filesDir, "CameraClient.getApplication().filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("personalEffect");
        return sb.toString();
    }

    /* renamed from: b */
    public static final Map<String, List<String>> m99677b() {
        Keva repo = Keva.getRepo("personal_effect");
        C52711k.m112236a((Object) repo, "keva");
        Map all = repo.getAll();
        C52711k.m112236a((Object) all, "keva.all");
        Map<String, List<String>> hashMap = new HashMap<>();
        for (Entry entry : all.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String str = (String) value;
                hashMap.put(entry.getKey(), C52830p.m112452b((CharSequence) str, new String[]{"#######"}, false, 0, 6, (Object) null));
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.String");
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public static final boolean m99680c(C45830f fVar) {
        C52711k.m112240b(fVar, "resourceId");
        return C48671i.m105324a(m99681d(fVar));
    }

    /* renamed from: b */
    public static final boolean m99678b(String str) {
        C52711k.m112240b(str, "id");
        return C9414h.m18631b((List) m99677b().get(str));
    }

    /* renamed from: c */
    public static final void m99679c(String str) {
        C52711k.m112240b(str, "dir");
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: d */
    private static String m99681d(C45830f fVar) {
        C52711k.m112240b(fVar, "resourceBean");
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.f115837e);
        sb.append(File.separator);
        sb.append(fVar.f115833a);
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m99676b(C45830f fVar) {
        C52711k.m112240b(fVar, "resourceBean");
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.f115837e);
        sb.append(File.separator);
        sb.append(fVar.f115833a);
        sb.append(".zip");
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m99670a(String str) {
        C52711k.m112240b(str, "id");
        StringBuilder sb = new StringBuilder();
        sb.append(m99668a());
        sb.append(File.separator);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static final List<String> m99671a(List<C45830f> list) {
        C52711k.m112240b(list, "resourceList");
        ArrayList arrayList = new ArrayList();
        for (C45830f d : list) {
            arrayList.add(m99681d(d));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final void m99674a(C45830f fVar) {
        C52711k.m112240b(fVar, "resourceBean");
        String b = m99676b(fVar);
        try {
            C48671i.f122310a.mo96258b(b, m99681d(fVar));
        } catch (C48637d unused) {
            C48671i.f122310a.mo96264e(m99681d(fVar));
        }
        C48671i.f122310a.mo96260b(b);
    }

    /* renamed from: a */
    private static String m99669a(Effect effect, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append(effect.getId());
        return sb.toString();
    }

    /* renamed from: a */
    private final void m99673a(StickerWrapper stickerWrapper, List<StickerWrapper> list, String str) {
        if (stickerWrapper != null) {
            HashSet hashSet = new HashSet();
            List<Effect> a = C46036g.m100019a(list);
            for (Effect composerPath : a) {
                List<String> composerPath2 = composerPath.getComposerPath();
                if (composerPath2 != null) {
                    for (String add : composerPath2) {
                        hashSet.add(add);
                    }
                }
            }
            StringBuilder sb = new StringBuilder("memoji: all path: ");
            Object[] array = a.toArray(new Effect[0]);
            if (array != null) {
                sb.append(Arrays.toString(array));
                C50203g.m108358a(sb.toString());
                C48671i iVar = C48671i.f122310a;
                Effect effect = stickerWrapper.f115779a;
                C52711k.m112236a((Object) effect, "wrapper.effect");
                iVar.mo96260b(m99669a(effect, str));
                Effect effect2 = stickerWrapper.f115779a;
                C52711k.m112236a((Object) effect2, "wrapper.effect");
                List<String> composerPath3 = effect2.getComposerPath();
                if (composerPath3 != null) {
                    for (String str2 : composerPath3) {
                        if (!hashSet.contains(str2)) {
                            StringBuilder sb2 = new StringBuilder("memoji: delete path: ");
                            sb2.append(str2);
                            C50203g.m108358a(sb2.toString());
                            C48671i.f122310a.mo96264e(str2);
                        }
                    }
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: a */
    public static final void m99672a(int i, StickerWrapper stickerWrapper, List<StickerWrapper> list, String str) {
        String[] strArr;
        C52711k.m112240b(list, "wrapperList");
        C52711k.m112240b(str, "dir");
        if (stickerWrapper != null) {
            StringBuilder sb = new StringBuilder("memoji: modify: ");
            Effect effect = stickerWrapper.f115779a;
            C52711k.m112236a((Object) effect, "wrapper.effect");
            List composerPath = effect.getComposerPath();
            if (composerPath != null) {
                Object[] array = composerPath.toArray(new String[0]);
                if (array != null) {
                    strArr = (String[]) array;
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                strArr = null;
            }
            sb.append(Arrays.toString(strArr));
            C50203g.m108358a(sb.toString());
            f115858a.m99673a((StickerWrapper) list.set(i, stickerWrapper), list, str);
        }
    }

    /* renamed from: a */
    public static final void m99675a(String str, String str2, List<StickerWrapper> list, StickerWrapper stickerWrapper) {
        Throwable th;
        C52711k.m112240b(str, "id");
        C52711k.m112240b(str2, "dir");
        C52711k.m112240b(list, "wrapperList");
        if (stickerWrapper != null) {
            Effect effect = stickerWrapper.f115779a;
            C52711k.m112236a((Object) effect, "wrapper.effect");
            String a = m99669a(effect, str2);
            C17971f D = C39629l.m88232a().mo58566D();
            Closeable outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(a)), C52808d.f131043a);
            String[] strArr = null;
            try {
                D.mo34887a((Object) stickerWrapper.f115779a, (Appendable) (OutputStreamWriter) outputStreamWriter);
                C52647c.m112189a(outputStreamWriter, null);
                List arrayList = new ArrayList();
                List arrayList2 = new ArrayList();
                for (Effect effect2 : C46036g.m100019a(list)) {
                    if (effect2.getExtra() != null) {
                        arrayList.add(m99669a(effect2, str2));
                        String extra = effect2.getExtra();
                        if (extra == null) {
                            C52711k.m112234a();
                        }
                        C52711k.m112236a((Object) extra, "it.extra!!");
                        arrayList2.add(extra);
                    }
                }
                StringBuilder sb = new StringBuilder("memoji: save effect composer: ");
                Effect effect3 = stickerWrapper.f115779a;
                C52711k.m112236a((Object) effect3, "wrapper.effect");
                List composerPath = effect3.getComposerPath();
                if (composerPath != null) {
                    Object[] array = composerPath.toArray(new String[0]);
                    if (array != null) {
                        strArr = (String[]) array;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                sb.append(Arrays.toString(strArr));
                C50203g.m108358a(sb.toString());
                Keva.getRepo("personal_effect").storeString(str, C52575l.m112120a(arrayList, "#######", null, null, 0, null, null, 62, null));
            } catch (Throwable th2) {
                C52647c.m112189a(outputStreamWriter, th);
                throw th2;
            }
        }
    }
}
