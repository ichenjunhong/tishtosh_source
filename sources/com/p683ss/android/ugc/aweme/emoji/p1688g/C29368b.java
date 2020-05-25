package com.p683ss.android.ugc.aweme.emoji.p1688g;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p524d.C9396a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29356a;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29357b;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29433a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29472b;
import com.p683ss.android.ugc.aweme.emoji.utils.C29473c;
import com.p683ss.android.ugc.aweme.emoji.utils.C29476f;
import com.p683ss.android.ugc.aweme.emoji.utils.C29483k;
import com.p683ss.android.ugc.aweme.emoji.utils.EmojiApi;
import com.ss.android.ugc.trill.R;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.emoji.g.b */
public class C29368b implements C29367a {

    /* renamed from: c */
    private static C29368b f76932c;

    /* renamed from: a */
    List<C29366a> f76933a;

    /* renamed from: b */
    public int f76934b;

    /* renamed from: d */
    private List<C29367a> f76935d = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.emoji.g.b$a */
    class C29370a extends C29371b {

        /* renamed from: a */
        C29366a f76936a;

        private C29370a() {
            super();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.g.b$b */
    class C29371b {

        /* renamed from: c */
        boolean f76938c;

        /* renamed from: d */
        List<C29366a> f76939d;

        /* renamed from: e */
        String f76940e;

        /* renamed from: f */
        int f76941f;

        private C29371b() {
        }
    }

    /* renamed from: a */
    public final void mo59384a(C29367a aVar) {
    }

    /* renamed from: b */
    public final void mo59392b() {
    }

    /* renamed from: b */
    public final void mo59393b(C29367a aVar) {
    }

    /* renamed from: a */
    public final boolean mo59390a(String str, String str2, String str3) {
        Context f = m69247f();
        if (!C29380k.m69266a(f)) {
            C10691a.m21542b(f, (int) R.string.axj).mo19066a();
            return false;
        } else if (mo59395e() >= 79) {
            C10691a.m21542b(f, (int) R.string.axh).mo19066a();
            return false;
        } else {
            C0013i.m18a((Callable<TResult>) new C29375f<TResult>(this, str, str2, str3), (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C29376g<TResult,TContinuationResult>(this), C0013i.f25b);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo59388a(C29366a... aVarArr) {
        Context f = m69247f();
        if (!C29380k.m69266a(f)) {
            C10691a.m21542b(f, (int) R.string.axj).mo19066a();
            return;
        }
        String b = m69244b(aVarArr);
        if (!TextUtils.isEmpty(b)) {
            EmojiApi a = C29472b.m69540a();
            StringBuilder sb = new StringBuilder("[");
            sb.append(b);
            sb.append("]");
            a.collectEmoji(0, sb.toString()).mo20a((C0011g<TResult, TContinuationResult>) new C29373d<TResult,TContinuationResult>(this), (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C29374e<TResult,TContinuationResult>(this, f), C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final void mo51836a(List<C29366a> list, C29366a aVar, boolean z, String str) {
        for (C29367a a : this.f76935d) {
            a.mo51836a(list, aVar, z, str);
        }
    }

    /* renamed from: a */
    public final void mo51837a(List<C29366a> list, boolean z, String str) {
        for (C29367a a : this.f76935d) {
            a.mo51837a(list, z, str);
        }
    }

    /* renamed from: a */
    public final boolean mo59389a(C29366a aVar) {
        return mo59394c().contains(aVar);
    }

    private C29368b() {
    }

    /* renamed from: f */
    private static Context m69247f() {
        Activity g = C11016e.m22312g();
        if (g == null) {
            return C11010c.m22280a();
        }
        return g;
    }

    /* renamed from: a */
    public static C29368b m69241a() {
        if (f76932c == null) {
            synchronized (C29368b.class) {
                if (f76932c == null) {
                    f76932c = new C29368b();
                }
            }
        }
        return f76932c;
    }

    /* renamed from: d */
    static String m69246d() {
        StringBuilder sb = new StringBuilder("SELF_EMOJIS");
        sb.append(C29433a.m69408c());
        return sb.toString();
    }

    /* renamed from: e */
    public final int mo59395e() {
        if (!C9376b.m18558a((Collection<T>) this.f76933a)) {
            return this.f76933a.size();
        }
        return 0;
    }

    /* renamed from: c */
    public final List<C29366a> mo59394c() {
        ArrayList arrayList = new ArrayList();
        if (!C9376b.m18558a((Collection<T>) this.f76933a)) {
            arrayList.addAll(this.f76933a);
        } else {
            this.f76933a = C29476f.m69556a(m69246d(), C29366a.class);
            arrayList.addAll(this.f76933a);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo59387a(boolean z) {
        C29433a.m69406a();
    }

    /* renamed from: a */
    public static List<C29366a> m69242a(List<C29366a> list) {
        if (list.size() > 80) {
            return list.subList(0, 80);
        }
        return list;
    }

    /* renamed from: a */
    private void m69243a(Runnable runnable) {
        Context f = m69247f();
        if (!C29380k.m69266a(f)) {
            C10691a.m21542b(f, (int) R.string.axj).mo19066a();
        } else if (mo59395e() >= 79) {
            C10691a.m21542b(f, (int) R.string.axh).mo19066a();
        } else {
            runnable.run();
        }
    }

    /* renamed from: b */
    private String m69244b(C29366a... aVarArr) {
        String str = ",";
        StringBuilder sb = new StringBuilder();
        for (C29366a aVar : aVarArr) {
            if (aVar != null) {
                long id = aVar.getId();
                if (id <= 0) {
                    List c = mo59394c();
                    int indexOf = c.indexOf(aVar);
                    if (indexOf >= 0 && indexOf < c.size()) {
                        id = ((C29366a) c.get(indexOf)).getId();
                    }
                }
                if (id > 0) {
                    sb.append(aVar.getId());
                    sb.append(str);
                }
            }
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.lastIndexOf(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo59381a(C0013i iVar) throws Exception {
        C29370a aVar;
        if (iVar.mo34e() == null) {
            aVar = new C29370a();
        } else {
            aVar = (C29370a) iVar.mo34e();
        }
        mo51836a(aVar.f76939d, aVar.f76936a, aVar.f76938c, aVar.f76940e);
        m69245b((C29371b) aVar);
        return null;
    }

    /* renamed from: b */
    private void m69245b(C29371b bVar) {
        String str;
        String str2;
        Context f = m69247f();
        if (bVar.f76938c) {
            if (TextUtils.isEmpty(bVar.f76940e)) {
                str2 = f.getString(R.string.ax5);
            } else {
                str2 = bVar.f76940e;
            }
            C10691a.m21537a(f, str2).mo19066a();
            return;
        }
        if (!TextUtils.isEmpty(bVar.f76940e)) {
            str = bVar.f76940e;
        } else if (bVar.f76941f == 7279) {
            str = f.getString(R.string.axh);
        } else if (bVar.f76941f == 7280) {
            str = f.getString(R.string.ax7);
        } else {
            str = f.getString(R.string.axj);
        }
        C10691a.m21545b(f, str).mo19066a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo59385a(C29371b bVar) throws Exception {
        mo51837a(bVar.f76939d, bVar.f76938c, bVar.f76940e);
        m69245b(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo59386a(Throwable th) throws Exception {
        C29371b bVar = new C29371b();
        bVar.f76939d = Collections.emptyList();
        bVar.f76938c = false;
        if (th instanceof C23459a) {
            C23459a aVar = (C23459a) th;
            bVar.f76940e = aVar.getErrorMsg();
            bVar.f76941f = aVar.getErrorCode();
        }
        mo51837a(bVar.f76939d, bVar.f76938c, bVar.f76940e);
        m69245b(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo59382a(Context context, C0013i iVar) throws Exception {
        C29371b bVar;
        String str;
        String str2;
        if (iVar.mo34e() == null) {
            bVar = new C29371b();
        } else {
            bVar = (C29371b) iVar.mo34e();
        }
        if (bVar.f76938c) {
            if (TextUtils.isEmpty(bVar.f76940e)) {
                str2 = context.getString(R.string.axm);
            } else {
                str2 = bVar.f76940e;
            }
            C10691a.m21537a(context, str2).mo19066a();
        } else {
            if (TextUtils.isEmpty(bVar.f76940e)) {
                str = context.getString(R.string.axj);
            } else {
                str = bVar.f76940e;
            }
            C10691a.m21545b(context, str).mo19066a();
        }
        mo51838b(bVar.f76939d, bVar.f76938c, bVar.f76940e);
        return null;
    }

    /* renamed from: b */
    public final void mo51838b(List<C29366a> list, boolean z, String str) {
        for (C29367a b : this.f76935d) {
            b.mo51838b(list, z, str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C29370a mo59391b(String str, String str2, String str3) throws Exception {
        boolean z;
        C29357b bVar = null;
        C29370a aVar = new C29370a();
        try {
            String a = C9395d.m18570a(new File(str));
            C29356a obtain = C29356a.obtain(str2, str3);
            if (obtain != null) {
                bVar = (C29357b) C29472b.m69540a().addSelfEmoji(a, obtain.getAnimateUrl(), obtain.getStaticUrl(), obtain.getAnimateType(), obtain.getStaticType(), obtain.getWidth(), obtain.getHeight()).get();
            }
            if (bVar != null) {
                aVar.f76940e = bVar.status_msg;
                aVar.f76941f = bVar.status_code;
                if (bVar.status_code != 0 || C9376b.m18558a((Collection<T>) bVar.f76898a)) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.f76938c = z;
                if (aVar.f76938c) {
                    aVar.f76936a = (C29366a) bVar.f76898a.get(0);
                    if (aVar.f76936a != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C29483k.m69576b("STICKER", 0, "0"));
                        sb.append("/animate/");
                        String sb2 = sb.toString();
                        C29366a aVar2 = aVar.f76936a;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(aVar2.getId());
                        sb3.append(ClassUtils.PACKAGE_SEPARATOR);
                        sb3.append(aVar2.getAnimateType());
                        C9396a.m18580a(str2, sb2, sb3.toString());
                        C9396a.m18580a(str2, C29473c.m69541a(), C29473c.m69545c(aVar.f76936a));
                    }
                    if (aVar.f76936a != null) {
                        C29366a aVar3 = aVar.f76936a;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aVar3);
                        arrayList.addAll(mo59394c());
                        C29476f.m69557a(m69246d(), (List<? extends T>) arrayList);
                        aVar.f76939d = arrayList;
                        this.f76933a = arrayList;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo59383a(long j, String str, String str2, long j2, int i) {
        C29377h hVar = new C29377h(this, j, str, str2, j2, i);
        m69243a((Runnable) hVar);
    }
}
