package com.p683ss.android.ugc.aweme.account.login.p1292v2.base;

import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.i */
public enum C21850i {
    FINISH(-2),
    NONE(-1),
    AGE_GATE(0),
    CREATE_ACCOUNT(1),
    PHONE_EMAIL_SIGN_UP(2),
    PHONE_SMS_SIGN_UP(3),
    CREATE_PASSWORD_FOR_PHONE(4),
    CREATE_USERNAME(5),
    PHONE_EMAIL_LOGIN(6),
    PHONE_SMS_LOGIN(7),
    PHONE_PASSWORD_LOGIN(8),
    INPUT_PHONE_FIND_PASSWORD(9),
    INPUT_EMAIL_FIND_PASSWORD(10),
    PHONE_SMS_FIND_PASSWORD(11),
    EMAIL_SMS_FIND_PASSWORD(12),
    RESET_PASSWORD_FOR_EMAIL(13),
    CREATE_PASSWORD_FOR_EMAIL(14),
    THIRD_PARTY_FTC_AGE_GATE(15),
    THIRD_PARTY_AGE_GATE(16),
    EMAIL_PASSWORD_LOGIN(17),
    INPUT_PHONE_SIGN_UP(18),
    INPUT_EMAIL_SIGN_UP(19),
    INPUT_PHONE_LOGIN(20),
    INPUT_EMAIL_LOGIN(21),
    RESET_PASSWORD_FOR_PHONE(22),
    AGE_GATE_LOGIN(23),
    AGE_GATE_SIGN_UP(24),
    EMAIL_SMS_SIGN_UP(25),
    INPUT_PHONE_BIND(26),
    PHONE_SMS_BIND(27),
    PHONE_SMS_VERIFY(28),
    INPUT_PHONE_MODIFY(29),
    PHONE_SMS_MODIFY(30),
    PHONE_EMAIL_USERNAME_RECOVER(31),
    RECOVER_VERIFY_EMAIL_PHONE_THIRD_PARTY(32),
    RECOVER_PHONE_LOGIN(33),
    RECOVER_EMAIL_LOGIN(34),
    RECOVER_PHONE_SEND_CODE(35),
    PHONE_SMS_CHANGE_PASSWORD(37),
    EMAIL_SMS_CHANGE_PASSWORD(38),
    CHANGE_PASSWORD(39),
    EMAIL_SMS_BIND(40),
    INPUT_EMAIL_BIND(41),
    CONFIRM_EMAIL_BEFORE_VERIFY(42),
    EMAIL_SMS_VERIFY(43),
    INPUT_EMAIL_CHANGE(44),
    EMAIL_SMS_CHANGE(45),
    VERIFY_EMAIL_BEFORE_CHANGE(46),
    VERIFY_PHONE(47),
    TERMS_CONSENT_SIGN_UP(48),
    TERMS_CONSENT_NEW_PHONE_USER(49),
    TERMS_CONSENT_SIGN_UP_THIRD_PARTY(50);
    
    public static final C21851a Companion = null;
    public static final Map<Integer, C21850i> MAP = null;

    /* renamed from: b */
    private final int f59139b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.i$a */
    public static final class C21851a {
        private C21851a() {
        }

        public /* synthetic */ C21851a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C21850i m54529a(int i) {
            C21850i iVar = (C21850i) C21850i.MAP.get(Integer.valueOf(i));
            if (iVar == null) {
                return C21850i.PHONE_SMS_LOGIN;
            }
            return iVar;
        }
    }

    public final int getValue() {
        return this.f59139b;
    }

    static {
        int i;
        Companion = new C21851a(null);
        C21850i[] values = values();
        Map<Integer, C21850i> linkedHashMap = new LinkedHashMap<>(C52753d.m112321c(C52550ab.m112044a(values.length), 16));
        for (C21850i iVar : values) {
            linkedHashMap.put(Integer.valueOf(iVar.f59139b), iVar);
        }
        MAP = linkedHashMap;
    }

    private C21850i(int i) {
        this.f59139b = i;
    }
}
