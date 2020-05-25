package com.bytedance.p702im.core.internal.p710a.p711a;

import android.content.Context;
import com.bytedance.p702im.core.internal.p710a.C11268b;
import com.bytedance.p702im.core.internal.p710a.C11305f;
import com.bytedance.p702im.core.internal.p710a.C11310k;
import com.bytedance.p702im.core.internal.p710a.C11311l;
import com.bytedance.p702im.core.internal.p710a.C11313n;
import com.bytedance.p702im.core.internal.p710a.C11314o;
import com.bytedance.p702im.core.internal.p710a.C11317p;
import com.bytedance.p702im.core.internal.p710a.C11318q;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p710a.C11320s;
import com.bytedance.p702im.core.internal.p710a.C11321t;
import com.bytedance.p702im.core.internal.p710a.p712b.C11270b;
import com.bytedance.p702im.core.internal.p710a.p712b.C11273c;
import com.bytedance.p702im.core.internal.p710a.p713c.C11275a;
import com.bytedance.p702im.core.internal.p710a.p713c.C11299d;
import com.bytedance.p702im.core.internal.p710a.p713c.p714a.C11278a;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p703a.C11165c;

/* renamed from: com.bytedance.im.core.internal.a.a.a */
public class C11263a extends C11275a {
    /* renamed from: a */
    public C11278a mo20956a() {
        return this;
    }

    /* renamed from: a */
    public void mo20957a(C11299d dVar) {
        C11268b[] values;
        C11467e.m23462a("IMDBHelper onCreate");
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_list (");
        for (C11268b bVar : C11268b.values()) {
            sb.append(bVar.key);
            sb.append(" ");
            sb.append(bVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        dVar.mo21000a(sb3.toString());
        dVar.mo21000a(C11319r.m23090b());
        dVar.mo21000a(C11310k.m23029b());
        dVar.mo21000a(C11313n.m23056b());
        dVar.mo21000a(C11311l.m23034b());
        dVar.mo21000a(C11317p.m23072b());
        dVar.mo21000a(C11273c.m22901a(C11270b.m22892b()));
        dVar.mo21000a(C11318q.m23077b());
        dVar.mo21000a(C11321t.m23118b());
        dVar.mo21000a(C11314o.m23065b());
        dVar.mo21000a(C11320s.m23108b());
        StringBuilder sb4 = new StringBuilder("CREATE INDEX UID_INDEX ON msg(");
        sb4.append(C11305f.COLUMN_SERVER_ID.key);
        sb4.append(")");
        StringBuilder sb5 = new StringBuilder("CREATE INDEX SENDER_INDEX ON msg(");
        sb5.append(C11305f.COLUMN_SENDER.key);
        sb5.append(")");
        StringBuilder sb6 = new StringBuilder("CREATE INDEX CONVERSATION_INDEX ON msg(");
        sb6.append(C11305f.COLUMN_CONVERSATION_ID.key);
        sb6.append(",");
        sb6.append(C11305f.COLUMN_INNER_INDEX.key);
        sb6.append(")");
        String[] strArr = {sb4.toString(), sb5.toString(), sb6.toString()};
        for (int i = 0; i < 3; i++) {
            dVar.mo21000a(strArr[i]);
        }
    }

    public C11263a(Context context, String str) {
        super(context, str, null, 17);
    }

    public C11263a(Context context, String str, String str2) {
        super(context, str, str2, null, 17);
    }

    /* renamed from: b */
    public final void mo20959b(C11299d dVar, int i, int i2) {
        StringBuilder sb = new StringBuilder("IMDBHelper onDowngrade oldVersion=");
        sb.append(i);
        sb.append(",newVersion=");
        sb.append(i2);
        C11467e.m23462a(sb.toString());
        C11165c.m22588a().mo20518f();
        this.f30375a.deleteDatabase(this.f30376b);
    }

    /* renamed from: a */
    public void mo20958a(C11299d dVar, int i, int i2) {
        C11467e.m23462a("IMDBHelper onUpgrade");
        StringBuilder sb = new StringBuilder("db onUpgrade...oldVersion=");
        sb.append(i);
        sb.append(",newVersion=");
        sb.append(i2);
        C11467e.m23467b(sb.toString());
        if (i == 1) {
            dVar.mo21000a("alter table conversation_list add column member_count integer");
        }
        if (i <= 2) {
            dVar.mo21000a("alter table msg add column read_status integer");
        }
        if (i <= 3) {
            dVar.mo21000a("alter table conversation_list add column min_index bigint");
        }
        if (i <= 4) {
            dVar.mo21000a(C11311l.m23034b());
            dVar.mo21000a(C11317p.m23072b());
        } else if (i == 5) {
            dVar.mo21000a("alter table conversation_setting add column favor integer");
        }
        if (i <= 6) {
            dVar.mo21000a("alter table attchment add column display_type text");
            dVar.mo21000a("alter table attchment add column mime_type text");
        }
        if (i <= 7) {
            dVar.mo21000a(C11273c.m22901a(C11270b.m22892b()));
        }
        if (i < 9) {
            dVar.mo21000a(C11318q.m23077b());
        }
        if (i < 10) {
            dVar.mo21000a("alter table participant add column sec_uid text");
        }
        if (i < 11) {
            dVar.mo21000a("alter table conversation_list add column status integer");
            dVar.mo21000a("alter table conversation_list add column participant text");
            if (i > 4) {
                dVar.mo21000a("alter table conversation_core add column owner_id integer default -1");
                dVar.mo21000a("alter table conversation_core add column sec_owner text");
            }
        }
        if (i < 12) {
            dVar.mo21000a(C11321t.m23118b());
        }
        if (i < 13) {
            dVar.mo21000a("alter table msg add column sec_sender text");
        }
        if (i < 14) {
            dVar.mo21000a("alter table msg add column property_list text");
        }
        if (i < 15) {
            dVar.mo21000a(C11314o.m23065b());
        }
        if (i < 16) {
            dVar.mo21000a("alter table conversation_list add column last_msg_order_index bigint");
        }
        if (i < 17) {
            dVar.mo21000a(C11320s.m23108b());
        }
    }
}
