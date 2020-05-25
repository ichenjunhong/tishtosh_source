package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33453a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35233bh;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35465b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35457c;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.a */
public class C34567a extends C34587e {

    /* renamed from: a */
    public C34572a f89108a = C34572a.NONE;

    /* renamed from: b */
    public boolean f89109b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.a$a */
    public enum C34572a {
        NONE,
        MUSICIAN,
        ENTERPRISE,
        OTHER
    }

    /* renamed from: b */
    public int mo72634b() {
        return 0;
    }

    /* renamed from: a */
    public C35457c mo72633a() {
        return new C35457c() {
            /* renamed from: a */
            public final void mo72636a(Context context, C35456b bVar, int i) {
                final boolean z;
                String str;
                String valueOf = String.valueOf(C11190e.m22685a(bVar.bm_()));
                if (i == 1) {
                    if (valueOf.equals(C35265e.m79730b())) {
                        C35190af.m79442a();
                        C35190af.m79461a("", "to_myself");
                    } else {
                        C35190af.m79442a();
                        C35190af.m79461a(valueOf, "no_stranger");
                        C35190af.m79442a();
                        C35190af.m79468a(C34567a.this.f91114e, valueOf, "private", "click_message", "message", ChatRoomActivity.m76444a());
                    }
                    C35190af.m79442a();
                    C35190af.m79483b("chat_notice_click", bVar.f91119j);
                    IMUser b = C34010e.m77748a().mo71964b(valueOf);
                    if (b == null) {
                        b = new IMUser();
                        b.setUid(valueOf);
                        if (C34567a.this.f91115f instanceof UrlModel) {
                            b.setAvatarThumb((UrlModel) C34567a.this.f91115f);
                        }
                        b.setNickName(C34567a.this.f91116g);
                    }
                    b.setType(-1);
                    C35465b bVar2 = new C35465b();
                    bVar2.commerceScene = "msg_list";
                    ChatRoomActivity.m76452a(context, b, 3, null, bVar2);
                } else if (i != 2) {
                    if (i == 0) {
                        final C11190e eVar = new C11190e(bVar.bm_());
                        if (eVar.mo20685a() == null || !eVar.mo20685a().isStickTop()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C26891a aVar = new C26891a(context);
                        String[] strArr = new String[2];
                        if (z) {
                            str = context.getString(R.string.bfa);
                        } else {
                            str = context.getString(R.string.bo9);
                        }
                        strArr[0] = str;
                        strArr[1] = context.getString(R.string.bge);
                        final Context context2 = context;
                        final C35456b bVar3 = bVar;
                        C345691 r1 = new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                switch (i) {
                                    case 0:
                                        eVar.mo20694a(!z, (C11162b<C11180b>) new C11162b<C11180b>() {
                                            /* renamed from: a */
                                            public final /* bridge */ /* synthetic */ void mo20506a(Object obj) {
                                            }

                                            /* renamed from: a */
                                            public final void mo20508a(C11202k kVar) {
                                                int i;
                                                if (z) {
                                                    i = R.string.bfb;
                                                } else {
                                                    i = R.string.bo_;
                                                }
                                                C10691a.m21542b(context2, i).mo19066a();
                                            }
                                        });
                                        return;
                                    case 1:
                                        C11182d.m22641a();
                                        C11182d.m22643a(bVar3.bm_(), (C11162b<String>) new C11162b<String>() {
                                            /* renamed from: a */
                                            public final /* bridge */ /* synthetic */ void mo20506a(Object obj) {
                                            }

                                            /* renamed from: a */
                                            public final void mo20508a(C11202k kVar) {
                                                String str = "ChatSession delete conversation failed: ";
                                                if (kVar != null) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(str);
                                                    sb.append(kVar.f30203a);
                                                    sb.append(", ");
                                                    sb.append(kVar.f30205c);
                                                    str = sb.toString();
                                                }
                                                C32458a.m75144a(str);
                                                C10691a.m21548c(C11010c.m22280a(), (int) R.string.bh3).mo19066a();
                                            }
                                        });
                                        C35190af.m79442a();
                                        C35190af.m79482b(bVar3.bm_());
                                        break;
                                }
                            }
                        };
                        aVar.mo54844a((CharSequence[]) strArr, (OnClickListener) r1);
                        aVar.mo54845b();
                    }
                } else if (!C34567a.this.f89109b || C33453a.m76682e()) {
                    C34030j.f87981c.mo71978c(valueOf);
                    C35233bh.m79635a(valueOf);
                    C35190af.m79442a();
                    String bm_ = C34567a.this.bm_();
                    String str2 = "message";
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("enter_from", str2);
                        jSONObject.put("update_cnt", C35190af.m79500e(bm_));
                    } catch (JSONException unused) {
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(bm_).setJsonObject(jSONObject));
                    C35190af.m79442a();
                    C35190af.m79485b(valueOf, "message", "click_head");
                }
            }
        };
    }

    /* renamed from: c */
    public IMUser mo72635c() {
        return C34010e.m77748a().mo71964b(String.valueOf(C11190e.m22685a(bm_())));
    }
}
