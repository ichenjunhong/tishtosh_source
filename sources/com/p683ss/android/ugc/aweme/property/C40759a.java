package com.p683ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40803n.C40804a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.property.a */
public final class C40759a {

    /* renamed from: c */
    public static final C40760a f103850c = new C40760a(null);

    /* renamed from: a */
    public final SharedPreferences f103851a = C35807d.m80935a(this.f103852b, "language_switch", 0);

    /* renamed from: b */
    public final FragmentActivity f103852b;

    /* renamed from: d */
    private ABAndSettingViewModel f103853d;

    /* renamed from: com.ss.android.ugc.aweme.property.a$a */
    public static final class C40760a {
        private C40760a() {
        }

        public /* synthetic */ C40760a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    private final void m90156b() {
        ABAndSettingViewModel aBAndSettingViewModel = this.f103853d;
        C40804a aVar = C40803n.f103930c;
        Object[] enumConstants = C40790a.class.getEnumConstants();
        C52711k.m112236a((Object) enumConstants, "AVAB.Property::class.java.enumConstants");
        Collection arrayList = new ArrayList(enumConstants.length);
        int length = enumConstants.length;
        int i = 0;
        while (i < length) {
            C40790a aVar2 = (C40790a) enumConstants[i];
            C52711k.m112236a((Object) aVar2, "it");
            C40762a aVar3 = aVar2;
            C52711k.m112240b(aVar2, "$this$getItemMoreMessage");
            C40808o oVar = (C40808o) aVar2.getClass().getField(aVar2.name()).getAnnotation(C40808o.class);
            if (oVar != null) {
                arrayList.add(new C40776c(aVar3, C40793j.m90225a(oVar)));
                i++;
            } else {
                StringBuilder sb = new StringBuilder("Item (");
                sb.append(aVar2.name());
                sb.append(") 配置项必须由 DetailMessage 进行注解 有问题@liuhao.65537");
                throw new RuntimeException(sb.toString());
            }
        }
        ArrayList arrayList2 = new ArrayList((List) arrayList);
        C40804a.m90269a(arrayList2);
        C40803n nVar = new C40803n(arrayList2);
        C52711k.m112240b(nVar, "<set-?>");
        aBAndSettingViewModel.f103797f = nVar;
        ABAndSettingViewModel aBAndSettingViewModel2 = this.f103853d;
        C40803n a = C40803n.f103930c.mo83134a();
        C52711k.m112240b(a, "<set-?>");
        aBAndSettingViewModel2.f103798g = a;
        ABAndSettingViewModel aBAndSettingViewModel3 = this.f103853d;
        C40803n b = C40803n.f103930c.mo83135b();
        C52711k.m112240b(b, "<set-?>");
        aBAndSettingViewModel3.f103799h = b;
        this.f103853d.f103800i.setValue(this.f103853d.mo83028a().mo83130c());
        this.f103853d.f103801j.setValue(this.f103853d.mo83029b().mo83130c());
        this.f103853d.f103802k.setValue(this.f103853d.mo83030c().mo83130c());
        mo83061a();
    }

    /* renamed from: a */
    public final void mo83061a() {
        String str;
        String str2;
        String str3;
        boolean z;
        if (((C40829x) this.f103853d.f103793b.getValue()) == C40829x.Chinese) {
            this.f103853d.f103793b.setValue(C40829x.EngAndChi);
            this.f103853d.f103792a.setValue("切换中文");
            C0198r<C40803n> rVar = this.f103853d.f103800i;
            Object value = this.f103853d.f103800i.getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            ((C40803n) value).mo83129b();
            rVar.setValue(value);
            C0198r<C40803n> rVar2 = this.f103853d.f103801j;
            Object value2 = this.f103853d.f103801j.getValue();
            if (value2 == null) {
                C52711k.m112234a();
            }
            ((C40803n) value2).mo83129b();
            rVar2.setValue(value2);
            C0198r<C40803n> rVar3 = this.f103853d.f103802k;
            Object value3 = this.f103853d.f103802k.getValue();
            if (value3 == null) {
                C52711k.m112234a();
            }
            ((C40803n) value3).mo83129b();
            rVar3.setValue(value3);
        } else {
            this.f103853d.f103793b.setValue(C40829x.Chinese);
            this.f103853d.f103792a.setValue("English");
            C0198r<C40803n> rVar4 = this.f103853d.f103800i;
            Object value4 = this.f103853d.f103800i.getValue();
            if (value4 == null) {
                C52711k.m112234a();
            }
            ((C40803n) value4).mo83127a();
            rVar4.setValue(value4);
            C0198r<C40803n> rVar5 = this.f103853d.f103801j;
            Object value5 = this.f103853d.f103801j.getValue();
            if (value5 == null) {
                C52711k.m112234a();
            }
            ((C40803n) value5).mo83127a();
            rVar5.setValue(value5);
            C0198r<C40803n> rVar6 = this.f103853d.f103802k;
            Object value6 = this.f103853d.f103802k.getValue();
            if (value6 == null) {
                C52711k.m112234a();
            }
            ((C40803n) value6).mo83127a();
            rVar6.setValue(value6);
        }
        C0198r<String> rVar7 = this.f103853d.f103803l;
        StringBuilder sb = new StringBuilder("在 ");
        sb.append(this.f103853d.mo83028a().f103931a);
        sb.append(" 项中搜索");
        if (((C40829x) this.f103853d.f103793b.getValue()) == C40829x.Chinese) {
            str = "中文 key";
        } else {
            str = "英文 key 或者 owner";
        }
        sb.append(str);
        rVar7.setValue(sb.toString());
        C0198r<String> rVar8 = this.f103853d.f103804m;
        StringBuilder sb2 = new StringBuilder("在 ");
        sb2.append(this.f103853d.mo83029b().f103931a);
        sb2.append(" 项中搜索");
        if (((C40829x) this.f103853d.f103793b.getValue()) == C40829x.Chinese) {
            str2 = "中文 key";
        } else {
            str2 = "英文 key 或者 owner";
        }
        sb2.append(str2);
        rVar8.setValue(sb2.toString());
        C0198r<String> rVar9 = this.f103853d.f103805n;
        StringBuilder sb3 = new StringBuilder("在 ");
        sb3.append(this.f103853d.mo83030c().f103931a);
        sb3.append(" 项中搜索");
        if (((C40829x) this.f103853d.f103793b.getValue()) == C40829x.Chinese) {
            str3 = "中文 key";
        } else {
            str3 = "英文 key 或者 owner";
        }
        sb3.append(str3);
        rVar9.setValue(sb3.toString());
        Editor edit = this.f103851a.edit();
        String str4 = "English";
        if (((C40829x) this.f103853d.f103793b.getValue()) == C40829x.EngAndChi) {
            z = true;
        } else {
            z = false;
        }
        edit.putBoolean(str4, z).apply();
    }

    public C40759a(FragmentActivity fragmentActivity) {
        C40829x xVar;
        C52711k.m112240b(fragmentActivity, "context");
        this.f103852b = fragmentActivity;
        C0209x a = C0214z.m440a(this.f103852b).mo359a(ABAndSettingViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(co…ingViewModel::class.java)");
        this.f103853d = (ABAndSettingViewModel) a;
        boolean z = this.f103851a.getBoolean("English", false);
        C0198r<C40829x> rVar = this.f103853d.f103793b;
        if (z) {
            xVar = C40829x.Chinese;
        } else {
            xVar = C40829x.EngAndChi;
        }
        rVar.setValue(xVar);
        m90156b();
    }
}
