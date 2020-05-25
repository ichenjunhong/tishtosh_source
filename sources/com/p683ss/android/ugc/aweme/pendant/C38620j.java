package com.p683ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.pendant.C38612i.C38616c;
import com.p683ss.android.ugc.aweme.pendant.C38612i.C38618e;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p093k.C2168a;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.pendant.j */
public final class C38620j implements C38591c {

    /* renamed from: a */
    public static final C38621a f98224a = new C38621a(null);

    /* renamed from: b */
    private String f98225b = "";

    /* renamed from: c */
    private List<String> f98226c = C52575l.m112097a();

    /* renamed from: d */
    private String f98227d = "";

    /* renamed from: e */
    private final Keva f98228e = Keva.getRepo("pendant_lottie_keva");

    /* renamed from: f */
    private final String f98229f = this.f98228e.getString("previous_activity_id", "");

    /* renamed from: g */
    private C38612i f98230g;

    /* renamed from: h */
    private boolean f98231h;

    /* renamed from: com.ss.android.ugc.aweme.pendant.j$a */
    public static final class C38621a {
        private C38621a() {
        }

        public /* synthetic */ C38621a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo78525a() {
        if (this.f98231h) {
            C38612i iVar = this.f98230g;
            if (iVar != null) {
                return iVar.mo78540d();
            }
            return null;
        }
        throw new Throwable("未初始化");
    }

    /* renamed from: b */
    public final void mo78528b() {
        String str = this.f98229f;
        C52711k.m112236a((Object) str, "previousActivityId");
        new C38612i(str, this.f98226c, this.f98227d).mo78541e();
    }

    /* renamed from: a */
    public final InputStream mo78524a(int i) {
        String str;
        if (this.f98231h) {
            C38612i iVar = this.f98230g;
            if (iVar == null) {
                return null;
            }
            if (i == 0) {
                str = "new_year_normal_button";
            } else {
                str = "new_year_normal_button_collapsed";
            }
            C52711k.m112240b(str, "resName");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".json");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(iVar.mo78540d());
            sb3.append(File.separator);
            sb3.append(sb2);
            return new FileInputStream(new File(sb3.toString()));
        }
        throw new Throwable("未初始化");
    }

    /* renamed from: a */
    public final void mo78526a(Context context, C38624l lVar) {
        boolean z;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(lVar, "callback");
        if (this.f98231h) {
            C38612i iVar = this.f98230g;
            if (iVar != null) {
                File file = new File(iVar.mo78539c());
                File file2 = new File(iVar.mo78540d());
                String str = iVar.f98213d;
                boolean z2 = false;
                if (file.exists() && file2.exists() && file2.isDirectory()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        if (listFiles.length == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            z2 = C38612i.m85943a(file, str);
                        }
                    }
                }
                if (z2) {
                    lVar.mo78543a();
                } else {
                    C38612i iVar2 = this.f98230g;
                    if (iVar2 != null) {
                        C52711k.m112240b(context, "context");
                        C52711k.m112240b(lVar, "callback");
                        C2201v a = C2201v.m6601a((C2205y<T>) new C38614b<T>(iVar2, context)).mo6510a(Long.MAX_VALUE, (C1715j<? super Throwable>) new C38616c<Object>(iVar2));
                        C52711k.m112236a((Object) a, "Observable.create<String…\n            }\n        })");
                        a.mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C38617d<Object,Object>(iVar2)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C38618e<Object>(iVar2, lVar));
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        throw new Throwable("未初始化");
    }

    /* renamed from: a */
    public final void mo78527a(String str, List<String> list, String str2) {
        C52711k.m112240b(str, "activityId");
        C52711k.m112240b(list, "zipurl");
        C52711k.m112240b(str2, "md5");
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            str = "default_activity";
        }
        this.f98225b = str;
        this.f98226c = list;
        this.f98227d = str2;
        this.f98231h = true;
        this.f98228e.storeString("previous_activity_id", this.f98225b);
        this.f98230g = new C38612i(this.f98225b, list, str2);
        if (!TextUtils.isEmpty(this.f98229f) && !TextUtils.equals(charSequence, this.f98229f)) {
            mo78528b();
        }
    }
}
