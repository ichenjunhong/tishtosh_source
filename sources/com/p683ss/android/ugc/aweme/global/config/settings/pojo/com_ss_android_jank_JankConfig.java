package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_jank_JankConfig */
public final class com_ss_android_jank_JankConfig extends Message<com_ss_android_jank_JankConfig, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_jank_JankConfig> ADAPTER = new ProtoAdapter_com_ss_android_jank_JankConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5282692)
    public final Boolean collectStack;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 116162307)
    public final Boolean isGlobalCollect;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 69752804)
    public final Boolean isOnline;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 106495344)
    public final Boolean isOpen;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 52726379)
    public final Long jankThreshold;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_jank_JankConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_jank_JankConfig, Builder> {
        public Boolean collectStack;
        public Boolean isGlobalCollect;
        public Boolean isOnline;
        public Boolean isOpen;
        public Long jankThreshold;

        public final com_ss_android_jank_JankConfig build() {
            com_ss_android_jank_JankConfig com_ss_android_jank_jankconfig = new com_ss_android_jank_JankConfig(this.isGlobalCollect, this.jankThreshold, this.isOpen, this.isOnline, this.collectStack, super.buildUnknownFields());
            return com_ss_android_jank_jankconfig;
        }

        public final Builder collectStack(Boolean bool) {
            this.collectStack = bool;
            return this;
        }

        public final Builder isGlobalCollect(Boolean bool) {
            this.isGlobalCollect = bool;
            return this;
        }

        public final Builder isOnline(Boolean bool) {
            this.isOnline = bool;
            return this;
        }

        public final Builder isOpen(Boolean bool) {
            this.isOpen = bool;
            return this;
        }

        public final Builder jankThreshold(Long l) {
            this.jankThreshold = l;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_jank_JankConfig$ProtoAdapter_com_ss_android_jank_JankConfig */
    static final class ProtoAdapter_com_ss_android_jank_JankConfig extends DefaultValueProtoAdapter<com_ss_android_jank_JankConfig> {
        public final com_ss_android_jank_JankConfig redact(com_ss_android_jank_JankConfig com_ss_android_jank_jankconfig) {
            return com_ss_android_jank_jankconfig;
        }

        public ProtoAdapter_com_ss_android_jank_JankConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_jank_JankConfig.class);
        }

        public final com_ss_android_jank_JankConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_jank_JankConfig) null);
        }

        public final int encodedSize(com_ss_android_jank_JankConfig com_ss_android_jank_jankconfig) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(116162307, com_ss_android_jank_jankconfig.isGlobalCollect) + ProtoAdapter.INT64.encodedSizeWithTag(52726379, com_ss_android_jank_jankconfig.jankThreshold) + ProtoAdapter.BOOL.encodedSizeWithTag(106495344, com_ss_android_jank_jankconfig.isOpen) + ProtoAdapter.BOOL.encodedSizeWithTag(69752804, com_ss_android_jank_jankconfig.isOnline) + ProtoAdapter.BOOL.encodedSizeWithTag(5282692, com_ss_android_jank_jankconfig.collectStack) + com_ss_android_jank_jankconfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_jank_JankConfig com_ss_android_jank_jankconfig) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 116162307, com_ss_android_jank_jankconfig.isGlobalCollect);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 52726379, com_ss_android_jank_jankconfig.jankThreshold);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 106495344, com_ss_android_jank_jankconfig.isOpen);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 69752804, com_ss_android_jank_jankconfig.isOnline);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5282692, com_ss_android_jank_jankconfig.collectStack);
            protoWriter.writeBytes(com_ss_android_jank_jankconfig.unknownFields());
        }

        public final com_ss_android_jank_JankConfig decode(ProtoReader protoReader, com_ss_android_jank_JankConfig com_ss_android_jank_jankconfig) throws IOException {
            Builder builder;
            com_ss_android_jank_JankConfig com_ss_android_jank_jankconfig2 = (com_ss_android_jank_JankConfig) C10617a.m21405a().mo18840a(com_ss_android_jank_JankConfig.class, com_ss_android_jank_jankconfig);
            if (com_ss_android_jank_jankconfig2 != null) {
                builder = com_ss_android_jank_jankconfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 5282692:
                            builder.collectStack((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 52726379:
                            builder.jankThreshold((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 69752804:
                            builder.isOnline((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 106495344:
                            builder.isOpen((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 116162307:
                            builder.isGlobalCollect((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (com_ss_android_jank_jankconfig2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Boolean getCollectStack() throws C10174a {
        if (this.collectStack != null) {
            return this.collectStack;
        }
        throw new C10174a();
    }

    public final Boolean getIsGlobalCollect() throws C10174a {
        if (this.isGlobalCollect != null) {
            return this.isGlobalCollect;
        }
        throw new C10174a();
    }

    public final Boolean getIsOnline() throws C10174a {
        if (this.isOnline != null) {
            return this.isOnline;
        }
        throw new C10174a();
    }

    public final Boolean getIsOpen() throws C10174a {
        if (this.isOpen != null) {
            return this.isOpen;
        }
        throw new C10174a();
    }

    public final Long getJankThreshold() throws C10174a {
        if (this.jankThreshold != null) {
            return this.jankThreshold;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.isGlobalCollect = this.isGlobalCollect;
        builder.jankThreshold = this.jankThreshold;
        builder.isOpen = this.isOpen;
        builder.isOnline = this.isOnline;
        builder.collectStack = this.collectStack;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.isGlobalCollect != null) {
            i = this.isGlobalCollect.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.jankThreshold != null) {
            i2 = this.jankThreshold.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.isOpen != null) {
            i3 = this.isOpen.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.isOnline != null) {
            i4 = this.isOnline.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.collectStack != null) {
            i6 = this.collectStack.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.isGlobalCollect != null) {
            sb.append(", isGlobalCollect=");
            sb.append(this.isGlobalCollect);
        }
        if (this.jankThreshold != null) {
            sb.append(", jankThreshold=");
            sb.append(this.jankThreshold);
        }
        if (this.isOpen != null) {
            sb.append(", isOpen=");
            sb.append(this.isOpen);
        }
        if (this.isOnline != null) {
            sb.append(", isOnline=");
            sb.append(this.isOnline);
        }
        if (this.collectStack != null) {
            sb.append(", collectStack=");
            sb.append(this.collectStack);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_jank_JankConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_jank_JankConfig)) {
            return false;
        }
        com_ss_android_jank_JankConfig com_ss_android_jank_jankconfig = (com_ss_android_jank_JankConfig) obj;
        if (!unknownFields().equals(com_ss_android_jank_jankconfig.unknownFields()) || !Internal.equals(this.isGlobalCollect, com_ss_android_jank_jankconfig.isGlobalCollect) || !Internal.equals(this.jankThreshold, com_ss_android_jank_jankconfig.jankThreshold) || !Internal.equals(this.isOpen, com_ss_android_jank_jankconfig.isOpen) || !Internal.equals(this.isOnline, com_ss_android_jank_jankconfig.isOnline) || !Internal.equals(this.collectStack, com_ss_android_jank_jankconfig.collectStack)) {
            return false;
        }
        return true;
    }

    public com_ss_android_jank_JankConfig(Boolean bool, Long l, Boolean bool2, Boolean bool3, Boolean bool4) {
        this(bool, l, bool2, bool3, bool4, ByteString.EMPTY);
    }

    public com_ss_android_jank_JankConfig(Boolean bool, Long l, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.isGlobalCollect = bool;
        this.jankThreshold = l;
        this.isOpen = bool2;
        this.isOnline = bool3;
        this.collectStack = bool4;
    }
}
