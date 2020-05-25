package com.facebook.common.p927k;

/* renamed from: com.facebook.common.k.e */
public enum C13729e {
    YES,
    NO,
    UNSET;

    public final boolean isSet() {
        if (this != UNSET) {
            return true;
        }
        return false;
    }

    public final int getDbValue() {
        switch (this) {
            case YES:
                return 1;
            case NO:
                return 2;
            default:
                return 3;
        }
    }

    public final boolean asBoolean() {
        switch (this) {
            case YES:
                return true;
            case NO:
                return false;
            case UNSET:
                throw new IllegalStateException("No boolean equivalent for UNSET");
            default:
                StringBuilder sb = new StringBuilder("Unrecognized TriState value: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final Boolean asBooleanObject() {
        switch (this) {
            case YES:
                return Boolean.TRUE;
            case NO:
                return Boolean.FALSE;
            case UNSET:
                return null;
            default:
                StringBuilder sb = new StringBuilder("Unrecognized TriState value: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString());
        }
    }

    public static C13729e valueOf(boolean z) {
        if (z) {
            return YES;
        }
        return NO;
    }

    public static C13729e valueOf(Boolean bool) {
        if (bool != null) {
            return valueOf(bool.booleanValue());
        }
        return UNSET;
    }

    public static C13729e fromDbValue(int i) {
        switch (i) {
            case 1:
                return YES;
            case 2:
                return NO;
            default:
                return UNSET;
        }
    }

    public final boolean asBoolean(boolean z) {
        switch (this) {
            case YES:
                return true;
            case NO:
                return false;
            case UNSET:
                return z;
            default:
                StringBuilder sb = new StringBuilder("Unrecognized TriState value: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString());
        }
    }
}
