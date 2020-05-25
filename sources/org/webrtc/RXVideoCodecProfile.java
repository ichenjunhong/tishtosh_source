package org.webrtc;

enum RXVideoCodecProfile {
    Unknown(0),
    ProfileConstrainedBaseline(1),
    ProfileBaseline(2),
    ProfileMain(3),
    ProfileConstrainedHigh(4),
    ProfileHigh(5),
    HEVCProfileUnknown(10),
    HEVCProfileMain(11),
    HEVCProfileMain10(12),
    HEVCProfileMain10HDR10(100),
    HEVCProfileMax(128);
    
    private int value;

    public final int toInt() {
        return this.value;
    }

    static RXVideoCodecProfile fromValue(int i) {
        if (i == 100) {
            return HEVCProfileMain10HDR10;
        }
        if (i == 128) {
            return HEVCProfileMax;
        }
        switch (i) {
            case 0:
                return Unknown;
            case 1:
                return ProfileConstrainedBaseline;
            case 2:
                return ProfileBaseline;
            case 3:
                return ProfileMain;
            case 4:
                return ProfileConstrainedHigh;
            case 5:
                return ProfileHigh;
            default:
                switch (i) {
                    case 10:
                        return HEVCProfileUnknown;
                    case 11:
                        return HEVCProfileMain;
                    case 12:
                        return HEVCProfileMain10;
                    default:
                        return Unknown;
                }
        }
    }

    private RXVideoCodecProfile(int i) {
        this.value = i;
    }
}
