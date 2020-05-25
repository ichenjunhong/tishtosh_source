package com.p683ss.android.ugc.aweme.account.login.model;

import com.google.p1057b.p1060c.C17530ab;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.a */
public final class C21386a {

    /* renamed from: e */
    public static final C21386a f58037e = new C21386a(R.string.f72, "U", "US", "+1");

    /* renamed from: f */
    public static final C21386a f58038f = new C21386a(R.string.a2d, "C", "CN", "+86");

    /* renamed from: g */
    public static final C52668f f58039g = C52732g.m112285a(C21388b.f58046a);

    /* renamed from: h */
    public static final C21387a f58040h = new C21387a(null);

    /* renamed from: a */
    public final int f58041a;

    /* renamed from: b */
    public String f58042b;

    /* renamed from: c */
    public final String f58043c;

    /* renamed from: d */
    public final String f58044d;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.a$a */
    public static final class C21387a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f58045a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21387a.class), "countries", "getCountries()Lcom/google/common/collect/ImmutableList;"))};

        private C21387a() {
        }

        /* renamed from: a */
        public static C17530ab<C21386a> m54009a() {
            return (C17530ab) C21386a.f58039g.getValue();
        }

        public /* synthetic */ C21387a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C21386a mo45572a(C21135a aVar) {
            boolean z;
            C52711k.m112240b(aVar, "phoneNumber");
            Iterable a = m54009a();
            Collection arrayList = new ArrayList();
            Iterator it = a.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C21386a aVar2 = (C21386a) next;
                if (aVar2.mo45568a() == aVar.getCountryCode()) {
                    CharSequence countryIso = aVar.getCountryIso();
                    if (countryIso == null || countryIso.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || C52711k.m112239a((Object) aVar2.f58043c, (Object) aVar.getCountryIso())) {
                        z2 = true;
                    }
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            if (list.isEmpty()) {
                return null;
            }
            return (C21386a) list.get(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.a$b */
    static final class C21388b extends C52712l implements C52670a<C17530ab<C21386a>> {

        /* renamed from: a */
        public static final C21388b f58046a = new C21388b();

        C21388b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C21386a aVar = new C21386a(R.string.fg, "A", "AF", "+93");
            C21386a aVar2 = new C21386a(R.string.fgj, "A", "AX", "+358 18");
            C21386a aVar3 = new C21386a(R.string.fl, "A", "AL", "+355");
            C21386a aVar4 = new C21386a(R.string.gv, "A", "DZ", "+213");
            C21386a aVar5 = new C21386a(R.string.i5, "A", C20315a.f55811a, "+1 684");
            C21386a aVar6 = new C21386a(R.string.i9, "A", "AD", "+376");
            C21386a aVar7 = new C21386a(R.string.ib, "A", "AO", "+244");
            C21386a aVar8 = new C21386a(R.string.ic, "A", "AI", "+1 264");
            C21386a aVar9 = new C21386a(R.string.il, "A", "AG", "+1 268");
            C21386a aVar10 = new C21386a(R.string.kj, "A", "AR", "+54");
            C21386a aVar11 = new C21386a(R.string.kk, "A", "AM", "+374");
            return C17530ab.m43068of(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, new C21386a(R.string.ko, "A", "AW", "+297"), new C21386a(R.string.kp, "A", "SH", "+247"), new C21386a(R.string.l5, "A", "AU", "+61"), new C21386a(R.string.l6, "A", "AU", "+672"), new C21386a(R.string.l7, "A", "AT", "+43"), new C21386a(R.string.pa, "A", "AZ", "+994"), new C21386a(R.string.q1, "B", "BS", "+1 242"), new C21386a(R.string.q2, "B", "BH", "+973"), new C21386a(R.string.q5, "B", "BD", "+880"), new C21386a(R.string.q_, "B", "BB", "+1 246"), new C21386a(R.string.qa, "B", "AG", "+1 268"), new C21386a(R.string.r7, "B", "BY", "+375"), new C21386a(R.string.r8, "B", "BE", "+32"), new C21386a(R.string.r9, "B", "BZ", "+501"), new C21386a(R.string.r_, "B", "BJ", "+229"), new C21386a(R.string.ra, "B", "BM", "+1 441"), new C21386a(R.string.rd, "B", "BT", "+975"), new C21386a(R.string.um, "B", "BO", "+591"), new C21386a(R.string.uo, "B", "BA", "+387"), new C21386a(R.string.up, "B", "BW", "+267"), new C21386a(R.string.ux, "B", "BR", "+55"), new C21386a(R.string.uz, "B", "IO", "+246"), new C21386a(R.string.v0, "B", "VG", "+1 284"), new C21386a(R.string.v4, "B", "BN", "+673"), new C21386a(R.string.vf, "B", "BG", "+359"), new C21386a(R.string.vg, "B", "BF", "+226"), new C21386a(R.string.vh, "B", "BI", "+257"), new C21386a(R.string.w2, "C", "KH", "+855"), new C21386a(R.string.w8, "C", "CM", "+237"), new C21386a(R.string.we, "C", "CA", "+1"), new C21386a(R.string.x7, "C", "CV", "+238"), new C21386a(R.string.xe, "C", "BQ", "+599 7"), new C21386a(R.string.yr, "C", "KY", "+1 345"), new C21386a(R.string.yt, "C", "CF", "+236"), new C21386a(R.string.yu, "C", "TD", "+235"), new C21386a(R.string.a2c, "C", "CL", "+56"), new C21386a(R.string.a2d, "C", "CN", "+86"), new C21386a(R.string.a35, "C", "CX", "+61"), new C21386a(R.string.a44, "C", "CC", "+61"), new C21386a(R.string.a4l, "C", "CO", "+57"), new C21386a(R.string.agi, "C", "KM", "+269"), new C21386a(R.string.ahn, "C", "CG", "+242"), new C21386a(R.string.aho, "C", "CD", "+243"), new C21386a(R.string.ain, "C", "CK", "+682"), new C21386a(R.string.aj0, "C", "CR", "+506"), new C21386a(R.string.amp, "C", "HR", "+385"), new C21386a(R.string.an0, "C", "CU", "+53"), new C21386a(R.string.an4, "C", "CW", "+599 9"), new C21386a(R.string.ank, "C", "CY", "+357"), new C21386a(R.string.anl, "C", "CZ", "+420"), new C21386a(R.string.ann, "C", "CI", "+225"), new C21386a(R.string.aon, "D", "DK", "+45"), new C21386a(R.string.apl, "D", "DG", "+246"), new C21386a(R.string.arb, "D", "DJ", "+253"), new C21386a(R.string.ari, "D", "DM", "+1 767"), new C21386a(R.string.arj, "D", "DO", "+1 809"), new C21386a(R.string.arj, "D", "DO", "+1 829"), new C21386a(R.string.arj, "D", "DO", "+1 849"), new C21386a(R.string.auk, "E", "EC", "+593"), new C21386a(R.string.awp, "E", "EG", "+20"), new C21386a(R.string.awq, "E", "SV", "+503"), new C21386a(R.string.ays, "E", "GQ", "+240"), new C21386a(R.string.ayt, "E", "ER", "+291"), new C21386a(R.string.azk, "E", "EE", "+372"), new C21386a(R.string.azl, "E", "ET", "+251"), new C21386a(R.string.b0g, "F", "FK", "+500"), new C21386a(R.string.b0y, "F", "FO", "+298"), new C21386a(R.string.b2h, "F", "FJ", "+679"), new C21386a(R.string.b3h, "F", "FI", "+358"), new C21386a(R.string.b6a, "F", "FR", "+33"), new C21386a(R.string.b6f, "F", "GF", "+594"), new C21386a(R.string.b6g, "F", "PF", "+689"), new C21386a(R.string.b7w, "G", "GA", "+241"), new C21386a(R.string.b7z, "G", "GM", "+220"), new C21386a(R.string.b8d, "G", "GE", "+995"), new C21386a(R.string.b8e, "G", "DE", "+49"), new C21386a(R.string.b8k, "G", "GH", "+233"), new C21386a(R.string.b8l, "G", "GI", "+350"), new C21386a(R.string.b_p, "G", "GR", "+30"), new C21386a(R.string.b_q, "G", "GL", "+299"), new C21386a(R.string.b_r, "G", "GD", "+1 473"), new C21386a(R.string.b_s, "G", "GP", "+590"), new C21386a(R.string.b_t, "G", "GU", "+1 671"), new C21386a(R.string.b_u, "G", "GT", "+502"), new C21386a(R.string.b_v, "G", "GG", "+44"), new C21386a(R.string.ba5, "G", "GN", "+224"), new C21386a(R.string.ba6, "G", "GW", "+245"), new C21386a(R.string.ba7, "G", "GY", "+592"), new C21386a(R.string.ba_, "H", "HT", "+509"), new C21386a(R.string.bc_, "H", "HN", "+504"), new C21386a(R.string.bcb, "H", "HK", "+852"), new C21386a(R.string.bcu, "H", "HU", "+36"), new C21386a(R.string.bdg, "I", "IS", "+354"), new C21386a(R.string.br3, "I", "IN", "+91"), new C21386a(R.string.br4, "I", "ID", "+62"), new C21386a(R.string.bte, "I", "IR", "+98"), new C21386a(R.string.btf, "I", "IQ", "+964"), new C21386a(R.string.btg, "I", "IE", "+353"), new C21386a(R.string.btq, "I", "IL", "+972"), new C21386a(R.string.btr, "I", "IT", "+39"), new C21386a(R.string.btv, "J", "JM", "+1 876"), new C21386a(R.string.btw, "J", "JP", "+81"), new C21386a(R.string.btx, "J", "JE", "+44"), new C21386a(R.string.bu4, "J", "JO", "+962"), new C21386a(R.string.bub, "K", "KZ", "+7 6"), new C21386a(R.string.bub, "K", "KZ", "+7 7"), new C21386a(R.string.buc, "K", "KE", "+254"), new C21386a(R.string.buh, "K", "KI", "+686"), new C21386a(R.string.bul, "K", "KW", "+965"), new C21386a(R.string.bum, "K", "KG", "+996"), new C21386a(R.string.bvo, "L", "LA", "+856"), new C21386a(R.string.bvy, "L", "LV", "+371"), new C21386a(R.string.bw5, "L", "LB", "+961"), new C21386a(R.string.bw7, "L", "LS", "+266"), new C21386a(R.string.bwc, "L", "LR", "+231"), new C21386a(R.string.bwe, "L", "LY", "+218"), new C21386a(R.string.bwf, "L", "LI", "+423"), new C21386a(R.string.bx7, "L", "LT", "+370"), new C21386a(R.string.c3f, "L", "LU", "+352"), new C21386a(R.string.c3h, "M", "MO", "+853"), new C21386a(R.string.c3i, "M", "MK", "+389"), new C21386a(R.string.c3j, "M", "MG", "+261"), new C21386a(R.string.c3u, "M", "MW", "+265"), new C21386a(R.string.c3v, "M", "MY", "+60"), new C21386a(R.string.c3w, "M", "MV", "+960"), new C21386a(R.string.c3y, "M", "ML", "+223"), new C21386a(R.string.c3z, "M", "MT", "+356"), new C21386a(R.string.c4e, "M", "MH", "+692"), new C21386a(R.string.c4f, "M", "MQ", "+596"), new C21386a(R.string.c54, "M", "MR", "+222"), new C21386a(R.string.c55, "M", "MU", "+230"), new C21386a(R.string.c5a, "M", "YT", "+262"), new C21386a(R.string.c60, "M", "MX", "+52"), new C21386a(R.string.c68, "M", "FM", "+691"), new C21386a(R.string.c7a, "M", "MD", "+373"), new C21386a(R.string.c7b, "M", "MC", "+377"), new C21386a(R.string.c7d, "M", "MN", "+976"), new C21386a(R.string.c7e, "M", "ME", "+382"), new C21386a(R.string.c7f, "M", "MS", "+1 664"), new C21386a(R.string.c7p, "M", "MA", "+212"), new C21386a(R.string.c7z, "M", "MZ", "+258"), new C21386a(R.string.cff, "M", "MM", "+95"), new C21386a(R.string.cfi, "N", "NA", "+264"), new C21386a(R.string.cfk, "N", "NR", "+674"), new C21386a(R.string.cfp, "N", "NP", "+977"), new C21386a(R.string.cfq, "N", "NL", "+31"), new C21386a(R.string.cg_, "N", "NC", "+687"), new C21386a(R.string.cgl, "N", "NZ", "+64"), new C21386a(R.string.cgp, "N", "NI", "+505"), new C21386a(R.string.cgu, "N", "NE", "+227"), new C21386a(R.string.cgv, "N", "NG", "+234"), new C21386a(R.string.cgx, "N", "NU", "+683"), new C21386a(R.string.cic, "N", "NF", "+672"), new C21386a(R.string.cid, "N", "KP", "+850"), new C21386a(R.string.cie, "N", "MP", "+1 670"), new C21386a(R.string.cif, "N", "NO", "+47"), new C21386a(R.string.clg, "O", "OM", "+968"), new C21386a(R.string.cmk, "P", "PK", "+92"), new C21386a(R.string.cml, "P", "PW", "+680"), new C21386a(R.string.cmn, "P", "PS", "+970"), new C21386a(R.string.cmo, "P", "PA", "+507"), new C21386a(R.string.cmp, "P", "PG", "+675"), new C21386a(R.string.cmq, "P", "PY", "+595"), new C21386a(R.string.co4, "P", "PE", "+51"), new C21386a(R.string.co_, "P", "PH", "+63"), new C21386a(R.string.cp4, "P", "PN", "+64"), new C21386a(R.string.ctm, "P", "PL", "+48"), new C21386a(R.string.cvr, "P", "PT", "+351"), new C21386a(R.string.d15, "P", "PR", "+1 787"), new C21386a(R.string.d15, "P", "PR", "+1 939"), new C21386a(R.string.d26, "Q", "QA", "+974"), new C21386a(R.string.d97, "R", "RO", "+40"), new C21386a(R.string.d9c, "R", "RU", "+7"), new C21386a(R.string.d9e, "R", "RW", "+250"), new C21386a(R.string.d9f, "R", "SURVEY", "+262"), new C21386a(R.string.d9y, "S", "WS", "+685"), new C21386a(R.string.d9z, "S", "SM", "+378"), new C21386a(R.string.d_0, "S", "SA", "+966"), new C21386a(R.string.ddd, "S", "SN", "+221"), new C21386a(R.string.dde, "S", "RS", "+381"), new C21386a(R.string.dhb, "S", "SC", "+248"), new C21386a(R.string.djt, "S", "SL", "+232"), new C21386a(R.string.dk_, "S", "SG", "+65"), new C21386a(R.string.dkb, "S", "BQ", "+599 3"), new C21386a(R.string.dkc, "S", "SX", "+1 721"), new C21386a(R.string.dkj, "S", "SK", "+421"), new C21386a(R.string.dkk, "S", "SI", "+386"), new C21386a(R.string.dl0, "S", "SB", "+677"), new C21386a(R.string.dl1, "S", "SO", "+252"), new C21386a(R.string.dl9, "S", "ZA", "+27"), new C21386a(R.string.dl_, "S", "GS", "+500"), new C21386a(R.string.dla, "S", "KR", "+82"), new C21386a(R.string.dlc, "S", "SS", "+211"), new C21386a(R.string.dlf, "S", "ES", "+34"), new C21386a(R.string.dmc, "S", "LK", "+94"), new C21386a(R.string.dpr, "S", "BL", "+590"), new C21386a(R.string.dps, "S", "SH", "+290"), new C21386a(R.string.dpt, "S", "KN", "+1 869"), new C21386a(R.string.dpu, "S", "LC", "+1 758"), new C21386a(R.string.dpv, "S", "MF", "+590"), new C21386a(R.string.dpw, "S", "PM", "+508"), new C21386a(R.string.dpx, "S", "VC", "+1 784"), new C21386a(R.string.du_, "S", "SD", "+249"), new C21386a(R.string.dun, "S", "SR", "+597"), new C21386a(R.string.duo, "S", "SJ", "+47 79"), new C21386a(R.string.dup, "S", "SJ", "+47 79"), new C21386a(R.string.duq, "S", "SZ", "+268"), new C21386a(R.string.dur, "S", "SE", "+46"), new C21386a(R.string.dv7, "S", "CH", "+41"), new C21386a(R.string.dvc, "S", "SY", "+963"), new C21386a(R.string.dvd, "S", "ST", "+239"), new C21386a(R.string.dvn, "T", "TW", "+886"), new C21386a(R.string.dvo, "T", "TJ", "+992"), new C21386a(R.string.dvp, "T", "TZ", "+255"), new C21386a(R.string.dx3, "T", "TH", "+66"), new C21386a(R.string.dzy, "T", "TL", "+670"), new C21386a(R.string.e1g, "T", "TG", "+228"), new C21386a(R.string.e1h, "T", "TK", "+690"), new C21386a(R.string.e1i, "T", "TO", "+676"), new C21386a(R.string.e2k, "T", "TT", "+1 868"), new C21386a(R.string.f48, "T", "TN", "+216"), new C21386a(R.string.f49, "T", "TR", "+90"), new C21386a(R.string.f4_, "T", "TM", "+993"), new C21386a(R.string.f4a, "T", "TC", "+1 649"), new C21386a(R.string.f4k, "T", "TV", "+688"), new C21386a(R.string.f59, "U", "VI", "+1 340"), new C21386a(R.string.f5e, "U", "UG", "+256"), new C21386a(R.string.f68, "U", "UA", "+380"), new C21386a(R.string.f70, "U", "AE", "+971"), new C21386a(R.string.f71, "U", "GB", "+44"), new C21386a(R.string.f72, "U", "US", "+1"), new C21386a(R.string.f93, "U", "UY", "+598"), new C21386a(R.string.fa4, "U", "UZ", "+998"), new C21386a(R.string.fa7, "V", "VU", "+678"), new C21386a(R.string.fa8, "V", "VA", "+39 06 698"), new C21386a(R.string.fa8, "V", "VA", "+379"), new C21386a(R.string.fa_, "V", "VE", "+58"), new C21386a(R.string.fcj, "V", "VN", "+84"), new C21386a(R.string.fdl, "W", "WF", "+681"), new C21386a(R.string.fg5, "Y", "YE", "+967"), new C21386a(R.string.fgd, "Z", "ZM", "+260"), new C21386a(R.string.fgf, "Z", "!1", "+255"), new C21386a(R.string.fgg, "Z", "ZW", "+263"));
        }
    }

    /* renamed from: b */
    public static final C17530ab<C21386a> m54007b() {
        return C21387a.m54009a();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21386a) {
                C21386a aVar = (C21386a) obj;
                if (!(this.f58041a == aVar.f58041a) || !C52711k.m112239a((Object) this.f58042b, (Object) aVar.f58042b) || !C52711k.m112239a((Object) this.f58043c, (Object) aVar.f58043c) || !C52711k.m112239a((Object) this.f58044d, (Object) aVar.f58044d)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f58041a * 31;
        String str = this.f58042b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f58043c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f58044d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CountryCode(nameRes=");
        sb.append(this.f58041a);
        sb.append(", nameIndex=");
        sb.append(this.f58042b);
        sb.append(", alpha2=");
        sb.append(this.f58043c);
        sb.append(", code=");
        sb.append(this.f58044d);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo45568a() {
        try {
            return Integer.parseInt(C52830p.m112401a(C52830p.m112401a(this.f58044d, "+", "", false, 4, (Object) null), " ", "", false, 4, (Object) null));
        } catch (NumberFormatException unused) {
            return 86;
        }
    }

    public C21386a(int i, String str, String str2, String str3) {
        C52711k.m112240b(str, "nameIndex");
        C52711k.m112240b(str2, "alpha2");
        C52711k.m112240b(str3, "code");
        this.f58041a = i;
        this.f58042b = str;
        this.f58043c = str2;
        this.f58044d = str3;
    }
}
