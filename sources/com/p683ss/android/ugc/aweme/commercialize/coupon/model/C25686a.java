package com.p683ss.android.ugc.aweme.commercialize.coupon.model;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.model.a */
public enum C25686a {
    StatusUnReceived(0),
    StatusValid(1),
    StatusRedeemed(2),
    StatusExpired(3),
    StatusRefunded(6);
    
    public final int value;

    public static C25686a getStatus(int i) {
        C25686a[] values;
        for (C25686a aVar : values()) {
            if (aVar.value == i) {
                return aVar;
            }
        }
        return StatusValid;
    }

    private C25686a(int i) {
        this.value = i;
    }
}
