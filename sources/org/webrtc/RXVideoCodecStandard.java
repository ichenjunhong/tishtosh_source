package org.webrtc;

enum RXVideoCodecStandard {
    H264(0),
    H265(1),
    Unknown(2),
    VP8(8),
    VP9(9);
    
    private final int value;

    public final int toInt() {
        return this.value;
    }

    /* access modifiers changed from: 0000 */
    public final String mimeType() {
        switch (this.value) {
            case 0:
                return "video/avc";
            case 1:
                return "video/hevc";
            default:
                return "video/avc";
        }
    }

    static RXVideoCodecStandard fromValue(int i) {
        switch (i) {
            case 0:
                return H264;
            case 1:
                return H265;
            default:
                return H264;
        }
    }

    private RXVideoCodecStandard(int i) {
        this.value = i;
    }
}
