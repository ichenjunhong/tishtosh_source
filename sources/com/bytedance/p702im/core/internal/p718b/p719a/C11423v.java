package com.bytedance.p702im.core.internal.p718b.p719a;

import android.util.Pair;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11313n;
import com.bytedance.p702im.core.internal.p718b.C11324a;
import com.bytedance.p702im.core.internal.p720c.C11446e;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11464c;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11206o;
import com.bytedance.p702im.core.proto.ConversationParticipantsListRequestBody;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.ParticipantsPage;
import com.bytedance.p702im.core.proto.RequestBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.v */
public final class C11423v extends C11406q<List<C11206o>> {

    /* renamed from: a */
    public List<C11206o> f30690a = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20952a() {
        return true;
    }

    public C11423v() {
        super(IMCMD.CONVERSATION_PARTICIPANTS_LIST.getValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.conversation_participants_body == null || fVar.f30732g.body.conversation_participants_body.participants_page == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final long mo21065a(String str, C11446e eVar) {
        return m23328a(str, 0, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(final C11447f fVar, final Runnable runnable) {
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            mo21058b(fVar);
            runnable.run();
            C11176d.m22630a(fVar, false).mo20530b();
        } else {
            ParticipantsPage participantsPage = fVar.f30732g.body.conversation_participants_body.participants_page;
            final String str = (String) fVar.f30730e[0];
            this.f30690a.addAll(C11464c.m23456a(str, participantsPage.participants));
            if (participantsPage.has_more.booleanValue()) {
                m23328a(str, participantsPage.cursor.longValue(), fVar.f30729d);
            } else {
                C11457e.m23434a(new C11456d<Pair<C11180b, List<C11206o>>>() {
                    /* renamed from: a */
                    public final /* synthetic */ Object mo20683a() {
                        int i;
                        C11180b a = C11182d.m22641a().mo20658a(str);
                        C11313n.m23051a();
                        C11313n.m23061d(str);
                        C11313n.m23051a();
                        String str = str;
                        if (a == null) {
                            i = -1;
                        } else {
                            i = a.getConversationType();
                        }
                        C11313n.m23054a(str, i, C11423v.this.f30690a);
                        C11312m.m23038a();
                        return new Pair(C11312m.m23037a(str), C11423v.this.f30690a);
                    }
                }, new C11455c<Pair<C11180b, List<C11206o>>>() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo20684a(Object obj) {
                        Pair pair = (Pair) obj;
                        if (pair.second != null && !((List) pair.second).isEmpty()) {
                            C11472i.m23483a().mo20664a(str, (List) pair.second);
                        }
                        if (pair.first != null) {
                            C11182d.m22641a().mo20668b((C11180b) pair.first);
                        }
                        C11324a.f30475e.remove(str);
                        C11423v.this.mo21055a(pair.second);
                        runnable.run();
                        C11176d.m22630a(fVar, true).mo20530b();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private long m23328a(String str, long j, C11446e eVar) {
        if (C11324a.m23136c(str)) {
            return -1;
        }
        C11324a.m23137d(str);
        C11180b a = C11182d.m22641a().mo20658a(str);
        RequestBody build = new Builder().conversation_participants_body(new ConversationParticipantsListRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).cursor(Long.valueOf(j)).build()).build();
        return mo21053a(a.getInboxType(), build, eVar, str, Long.valueOf(j));
    }
}
