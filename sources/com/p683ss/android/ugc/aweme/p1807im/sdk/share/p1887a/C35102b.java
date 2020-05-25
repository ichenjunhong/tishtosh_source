package com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.b */
public final class C35102b {

    /* renamed from: b */
    public static final C35102b f90275b = new C35102b();

    /* renamed from: c */
    public static final C35103a f90276c = new C35103a(null);

    /* renamed from: a */
    public IMContact f90277a;

    /* renamed from: d */
    private final Keva f90278d = Keva.getRepo("last_share_user_keva");

    /* renamed from: e */
    private String f90279e = "";

    /* renamed from: f */
    private String f90280f = "";

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.b$a */
    public static final class C35103a {

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.b$a$a */
        public static final class C35104a extends C52712l implements C52682m<List<IMContact>, Boolean, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C23371a f90281a;

            public C35104a(C23371a aVar) {
                this.f90281a = aVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                boolean z;
                List list = (List) obj;
                ((Boolean) obj2).booleanValue();
                C52711k.m112240b(list, "list");
                C23371a aVar = this.f90281a;
                if (C35102b.f90275b.mo73220a(list) != null) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.run(Boolean.valueOf(z));
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.b$a$b */
        public static final class C35105b extends C52712l implements C52671b<Throwable, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C23371a f90282a;

            public C35105b(C23371a aVar) {
                this.f90282a = aVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                C52711k.m112240b((Throwable) obj, "it");
                this.f90282a.run(Boolean.valueOf(false));
                return C52860x.f131107a;
            }
        }

        private C35103a() {
        }

        /* renamed from: a */
        public static boolean m79323a() {
            if (!C35265e.m79727a() || !C35102b.f90275b.mo73226c()) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C35103a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m79322a(IMContact iMContact) {
            String str;
            C52711k.m112240b(iMContact, "contact");
            if (iMContact instanceof IMConversation) {
                str = ((IMConversation) iMContact).getConversationId();
                if (str == null) {
                    return "";
                }
            } else if (!(iMContact instanceof IMUser)) {
                return "";
            } else {
                str = ((IMUser) iMContact).getUid();
                if (str == null) {
                    return "";
                }
            }
            return str;
        }

        /* renamed from: a */
        public final List<IMContact> mo73227a(List<IMContact> list) {
            C52711k.m112240b(list, "contactList");
            if (C23715d.m58202a((Collection<T>) list) || !m79323a()) {
                return list;
            }
            C35102b.f90275b.mo73220a(list);
            ArrayList arrayList = new ArrayList();
            if (C35102b.f90275b.f90277a == null) {
                return list;
            }
            IMContact iMContact = C35102b.f90275b.f90277a;
            if (iMContact != null && iMContact.isStickTop()) {
                return list;
            }
            boolean z = false;
            for (IMContact iMContact2 : list) {
                if (!TextUtils.equals(m79322a(iMContact2), C35102b.f90275b.mo73224b())) {
                    if (!iMContact2.isStickTop() && !z) {
                        IMContact iMContact3 = C35102b.f90275b.f90277a;
                        if (iMContact3 == null) {
                            C52711k.m112234a();
                        }
                        arrayList.add(iMContact3);
                        z = true;
                    }
                    arrayList.add(iMContact2);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: c */
    public final boolean mo73226c() {
        if (TextUtils.isEmpty(mo73221a()) || TextUtils.isEmpty(mo73224b())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final String mo73224b() {
        String obj = C35265e.m79730b().toString();
        Keva keva = this.f90278d;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append("keva_user_id");
        String string = keva.getString(sb.toString(), "");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: a */
    public final String mo73221a() {
        String obj = C35265e.m79730b().toString();
        Keva keva = this.f90278d;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append("keva_user_head_url");
        String string = keva.getString(sb.toString(), "");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: a */
    public final IMContact mo73220a(List<? extends IMContact> list) {
        IMContact iMContact;
        C52711k.m112240b(list, "contactList");
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            iMContact = (IMContact) it.next();
            if (i >= 15) {
                break;
            } else if (TextUtils.equals(C35103a.m79322a(iMContact), mo73224b())) {
                break;
            } else {
                i++;
            }
        }
        iMContact = null;
        this.f90277a = iMContact;
        if (iMContact != null) {
            mo73222a(iMContact);
        }
        return iMContact;
    }

    /* renamed from: b */
    public final void mo73225b(String str) {
        this.f90280f = str;
        String obj = C35265e.m79730b().toString();
        Keva keva = this.f90278d;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append("keva_user_id");
        keva.storeString(sb.toString(), str);
    }

    /* renamed from: a */
    public final void mo73222a(IMContact iMContact) {
        C52711k.m112240b(iMContact, "contact");
        this.f90277a = iMContact;
        mo73225b(C35103a.m79322a(iMContact));
        if (iMContact.getDisplayAvatar() != null) {
            UrlModel displayAvatar = iMContact.getDisplayAvatar();
            C52711k.m112236a((Object) displayAvatar, "contact.displayAvatar");
            if (C23715d.m58204b(displayAvatar.getUrlList())) {
                UrlModel displayAvatar2 = iMContact.getDisplayAvatar();
                C52711k.m112236a((Object) displayAvatar2, "contact.displayAvatar");
                Object obj = displayAvatar2.getUrlList().get(0);
                C52711k.m112236a(obj, "contact.displayAvatar.urlList[0]");
                mo73223a((String) obj);
            }
        }
    }

    /* renamed from: a */
    public final void mo73223a(String str) {
        this.f90279e = str;
        String obj = C35265e.m79730b().toString();
        Keva keva = this.f90278d;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append("keva_user_head_url");
        keva.storeString(sb.toString(), str);
    }
}
