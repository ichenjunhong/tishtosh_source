package com.bytedance.p702im.core.p706c;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11313n;
import com.bytedance.p702im.core.internal.p718b.p719a.C11339ad;
import com.bytedance.p702im.core.internal.p718b.p719a.C11354ak;
import com.bytedance.p702im.core.internal.p718b.p719a.C11357al;
import com.bytedance.p702im.core.internal.p718b.p719a.C11361an;
import com.bytedance.p702im.core.internal.p718b.p719a.C11409r;
import com.bytedance.p702im.core.internal.p718b.p719a.C11415t;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.proto.ConversationLeaveRequestBody;
import com.bytedance.p702im.core.proto.ConversationRemoveParticipantsRequestBody;
import com.bytedance.p702im.core.proto.RequestBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import com.bytedance.p702im.core.proto.SetConversationCoreInfoRequestBody;
import com.bytedance.p702im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.p702im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.c.e */
public final class C11190e extends C11204m implements C11200i {

    /* renamed from: a */
    public String f30190a;

    /* renamed from: b */
    private C11200i f30191b;

    /* renamed from: a */
    public final void mo20693a(Map<String, String> map, Runnable runnable) {
        m22688a(this.f30190a, map, (Runnable) null);
    }

    /* renamed from: a */
    public final void mo20694a(boolean z, C11162b<C11180b> bVar) {
        if (C11182d.m22641a().mo20658a(this.f30190a) != null) {
            C11409r.m23292a();
            String str = this.f30190a;
            C11357al alVar = new C11357al(bVar);
            C11180b a = C11182d.m22641a().mo20658a(str);
            RequestBody build = new Builder().set_conversation_setting_info_body(new SetConversationSettingInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).set_stick_on_top(Boolean.valueOf(z)).build()).build();
            int inboxType = a.getInboxType();
            Object[] objArr = new Object[3];
            boolean z2 = false;
            objArr[0] = str;
            if (C11165c.m22588a().mo20513b().f30126A && z) {
                z2 = true;
            }
            objArr[1] = Boolean.valueOf(z2);
            objArr[2] = "s:stick_on_top";
            alVar.mo21053a(inboxType, build, null, objArr);
        }
    }

    /* renamed from: a */
    public final void mo20689a(String str, C11162b<C11180b> bVar) {
        if (C11182d.m22641a().mo20658a(this.f30190a) != null) {
            C11409r.m23292a();
            String str2 = this.f30190a;
            C11354ak akVar = new C11354ak(bVar);
            C11180b a = C11182d.m22641a().mo20658a(str2);
            RequestBody build = new Builder().set_conversation_core_info_body(new SetConversationCoreInfoRequestBody.Builder().conversation_id(str2).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).name(str).is_name_set(Boolean.valueOf(true)).build()).build();
            akVar.mo21053a(a.getInboxType(), build, null, str2, "s:name");
        }
    }

    /* renamed from: a */
    public final void mo20692a(Map<String, String> map, C11162b bVar) {
        if (C11182d.m22641a().mo20658a(this.f30190a) != null) {
            C11409r.m23292a();
            String str = this.f30190a;
            C11361an anVar = new C11361an(bVar);
            if (map != null) {
                C11180b a = C11182d.m22641a().mo20658a(str);
                RequestBody build = new Builder().upsert_conversation_setting_ext_info_body(new UpsertConversationSettingExtInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).ext(map).build()).build();
                anVar.mo21053a(a.getInboxType(), build, null, str);
            }
        }
    }

    /* renamed from: a */
    public final void mo20690a(final String str, final String str2, final C11162b<C11206o> bVar) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C11457e.m23434a(new C11456d<C11206o>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Object mo20683a() {
                    C11313n.m23051a();
                    return C11313n.m23050a(str, str2);
                }
            }, new C11455c<C11206o>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo20684a(Object obj) {
                    bVar.mo20506a((C11206o) obj);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20691a(List<Long> list, Map<String, String> map, C11162b<List<C11206o>> bVar) {
        C11409r.m23292a();
        C11409r.m23301a(this.f30190a, list, map, bVar);
    }

    /* renamed from: a */
    public final void mo20664a(String str, List<C11206o> list) {
        if (this.f30191b != null) {
            this.f30191b.mo20664a(str, list);
        }
    }

    /* renamed from: a */
    public final void mo20665a(List<C11206o> list) {
        if (this.f30191b != null) {
            this.f30191b.mo20665a(list);
        }
    }

    /* renamed from: c */
    public final void mo20700c() {
        mo20687a(null);
    }

    /* renamed from: a */
    public final C11180b mo20685a() {
        return C11182d.m22641a().mo20658a(this.f30190a);
    }

    /* renamed from: b */
    public final void mo20695b() {
        this.f30191b = null;
        C11472i a = C11472i.m23483a();
        String str = this.f30190a;
        List list = (List) a.f30780d.get(str);
        list.remove(this);
        a.f30780d.put(str, list);
        super.mo20695b();
    }

    public C11190e(String str) {
        this.f30190a = str;
    }

    /* renamed from: a */
    public static String m22687a(long j) {
        return m22686a(0, j);
    }

    /* renamed from: b */
    public final void mo20668b(C11180b bVar) {
        if (this.f30191b != null) {
            this.f30191b.mo20668b(bVar);
        }
    }

    /* renamed from: c */
    public final void mo20673c(C11180b bVar) {
        if (this.f30191b != null) {
            this.f30191b.mo20673c(bVar);
        }
    }

    /* renamed from: d */
    public final void mo20676d(C11180b bVar) {
        if (this.f30191b != null) {
            this.f30191b.mo20676d(bVar);
        }
    }

    /* renamed from: e */
    public final void mo20679e(C11180b bVar) {
        if (this.f30191b != null) {
            this.f30191b.mo20679e(bVar);
        }
    }

    /* renamed from: a */
    public static long m22685a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String[] split = str.split(":");
        if (split.length != 4) {
            return -1;
        }
        long longValue = Long.valueOf(split[2]).longValue();
        long longValue2 = Long.valueOf(split[3]).longValue();
        long a = C11165c.m22588a().f30108c.mo20490a();
        if (a == longValue) {
            return longValue2;
        }
        if (a == longValue2) {
            return longValue;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo20670b(List<C11206o> list) {
        if (this.f30191b != null) {
            this.f30191b.mo20670b(list);
        }
    }

    /* renamed from: b */
    public final void mo20696b(C11162b<String> bVar) {
        C11409r.m23292a();
        String str = this.f30190a;
        C11415t tVar = new C11415t(bVar);
        C11180b a = C11182d.m22641a().mo20658a(str);
        RequestBody build = new Builder().leave_conversation_body(new ConversationLeaveRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).build()).build();
        tVar.mo21053a(a.getInboxType(), build, null, str, Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final void mo20687a(final C11162b<List<C11206o>> bVar) {
        C11457e.m23434a(new C11456d<List<C11206o>>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                C11313n.m23051a();
                return C11313n.m23057b(C11190e.this.f30190a);
            }
        }, new C11455c<List<C11206o>>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo20684a(Object obj) {
                List list = (List) obj;
                C11190e.this.mo20664a(C11190e.this.f30190a, list);
                if (bVar != null) {
                    bVar.mo20506a(list);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo20662a(C11180b bVar) {
        if (this.f30191b != null) {
            this.f30191b.mo20662a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo20688a(C11200i iVar) {
        this.f30191b = iVar;
        C11472i a = C11472i.m23483a();
        String str = this.f30190a;
        List list = (List) a.f30780d.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        if (!list.contains(this)) {
            list.add(this);
        }
        a.f30780d.put(str, list);
    }

    /* renamed from: a */
    public static String m22686a(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(Math.max(0, i));
        sb.append(":");
        sb.append(C11170a.f30115a);
        sb.append(":");
        long a = C11165c.m22588a().f30108c.mo20490a();
        if (a < j) {
            sb.append(a);
            sb.append(":");
            sb.append(j);
        } else {
            sb.append(j);
            sb.append(":");
            sb.append(a);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo20697b(String str, C11162b<C11180b> bVar) {
        if (C11182d.m22641a().mo20658a(this.f30190a) != null) {
            C11409r.m23292a();
            String str2 = this.f30190a;
            C11354ak akVar = new C11354ak(bVar);
            C11180b a = C11182d.m22641a().mo20658a(str2);
            RequestBody build = new Builder().set_conversation_core_info_body(new SetConversationCoreInfoRequestBody.Builder().conversation_id(str2).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).notice(str).is_notice_set(Boolean.valueOf(true)).build()).build();
            akVar.mo21053a(a.getInboxType(), build, null, str2, "s:notice");
        }
    }

    /* renamed from: b */
    public final void mo20699b(boolean z, C11162b<C11180b> bVar) {
        if (C11182d.m22641a().mo20658a(this.f30190a) != null) {
            C11409r.m23292a();
            String str = this.f30190a;
            C11357al alVar = new C11357al(bVar);
            C11180b a = C11182d.m22641a().mo20658a(str);
            RequestBody build = new Builder().set_conversation_setting_info_body(new SetConversationSettingInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).set_mute(Boolean.valueOf(z)).build()).build();
            alVar.mo21053a(a.getInboxType(), build, null, str, Boolean.valueOf(false), "s:mute");
        }
    }

    /* renamed from: a */
    public static void m22688a(final String str, final Map<String, String> map, final Runnable runnable) {
        C11457e.m23434a(new C11456d<C11180b>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                C11180b a = C11182d.m22641a().mo20658a(str);
                a.setLocalExt(map);
                C11312m.m23038a();
                C11312m.m23044b(a);
                return a;
            }
        }, new C11455c<C11180b>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                C11180b bVar = (C11180b) obj;
                if (bVar != null) {
                    C11182d.m22641a().mo20668b(bVar);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo20698b(List<Long> list, Map<String, String> map, C11162b<List<C11206o>> bVar) {
        C11409r.m23292a();
        String str = this.f30190a;
        C11339ad adVar = new C11339ad(bVar);
        if (list != null && !list.isEmpty()) {
            C11180b a = C11182d.m22641a().mo20658a(str);
            RequestBody build = new Builder().conversation_remove_participants_body(new ConversationRemoveParticipantsRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).participants(list).build()).build();
            adVar.mo21053a(a.getInboxType(), build, null, str, list);
        }
    }

    /* renamed from: a */
    public final void mo20686a(long j, List<Long> list, Map<String, String> map, C11162b<List<C11206o>> bVar) {
        C11409r.m23292a();
        C11409r.m23300a(this.f30190a, j, list, map, bVar);
    }
}
