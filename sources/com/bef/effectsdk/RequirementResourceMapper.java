package com.bef.effectsdk;

public final class RequirementResourceMapper {
    private RequirementResourceMapper() {
    }

    private static native String[] nativePeekResourcesNeededByRequirements(String[] strArr);

    /* renamed from: a */
    public static String[] m7540a(String[] strArr) {
        return nativePeekResourcesNeededByRequirements(strArr);
    }
}
