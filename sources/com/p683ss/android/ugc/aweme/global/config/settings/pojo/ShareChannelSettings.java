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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShareChannelSettings */
public final class ShareChannelSettings extends Message<ShareChannelSettings, Builder> {
    public static final DefaultValueProtoAdapter<ShareChannelSettings> ADAPTER = new ProtoAdapter_ShareChannelSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)

    /* renamed from: id */
    public final String f85446id;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShareChannelSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ShareChannelSettings, Builder> {

        /* renamed from: id */
        public String f85447id;

        public final ShareChannelSettings build() {
            return new ShareChannelSettings(this.f85447id, super.buildUnknownFields());
        }

        /* renamed from: id */
        public final Builder mo68597id(String str) {
            this.f85447id = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShareChannelSettings$ProtoAdapter_ShareChannelSettings */
    static final class ProtoAdapter_ShareChannelSettings extends DefaultValueProtoAdapter<ShareChannelSettings> {
        public final ShareChannelSettings redact(ShareChannelSettings shareChannelSettings) {
            return shareChannelSettings;
        }

        public ProtoAdapter_ShareChannelSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareChannelSettings.class);
        }

        public final ShareChannelSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ShareChannelSettings) null);
        }

        public final int encodedSize(ShareChannelSettings shareChannelSettings) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, shareChannelSettings.f85446id) + shareChannelSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ShareChannelSettings shareChannelSettings) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareChannelSettings.f85446id);
            protoWriter.writeBytes(shareChannelSettings.unknownFields());
        }

        public final ShareChannelSettings decode(ProtoReader protoReader, ShareChannelSettings shareChannelSettings) throws IOException {
            Builder builder;
            ShareChannelSettings shareChannelSettings2 = (ShareChannelSettings) C10617a.m21405a().mo18840a(ShareChannelSettings.class, shareChannelSettings);
            if (shareChannelSettings2 != null) {
                builder = shareChannelSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (shareChannelSettings2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.mo68597id((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getId() throws C10174a {
        if (this.f85446id != null) {
            return this.f85446id;
        }
        throw new C10174a();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.f85446id != null) {
            i = this.f85446id.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f85447id = this.f85446id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f85446id != null) {
            sb.append(", id=");
            sb.append(this.f85446id);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareChannelSettings{");
        replace.append('}');
        return replace.toString();
    }

    public ShareChannelSettings(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShareChannelSettings)) {
            return false;
        }
        ShareChannelSettings shareChannelSettings = (ShareChannelSettings) obj;
        if (!unknownFields().equals(shareChannelSettings.unknownFields()) || !Internal.equals(this.f85446id, shareChannelSettings.f85446id)) {
            return false;
        }
        return true;
    }

    public ShareChannelSettings(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f85446id = str;
    }
}
