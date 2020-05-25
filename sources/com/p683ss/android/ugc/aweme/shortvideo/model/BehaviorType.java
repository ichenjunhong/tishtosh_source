package com.p683ss.android.ugc.aweme.shortvideo.model;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.BehaviorType */
public enum BehaviorType {
    START("ST"),
    SUCCESS("SU"),
    FAILED("FA"),
    CANCEL("CC"),
    EVENT("EV");
    
    private final String simpleName;

    public final String getSimpleName() {
        return this.simpleName;
    }

    private BehaviorType(String str) {
        this.simpleName = str;
    }
}
