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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_ug_settings_UgcPermission */
public final class com_ss_android_ugc_aweme_ug_settings_UgcPermission extends Message<com_ss_android_ugc_aweme_ug_settings_UgcPermission, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_ug_settings_UgcPermission> ADAPTER = new ProtoAdapter_com_ss_android_ugc_aweme_ug_settings_UgcPermission();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3079825)
    public final String desc;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 116079)
    public final String url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_ug_settings_UgcPermission$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_ug_settings_UgcPermission, Builder> {
        public String desc;
        public String url;

        public final com_ss_android_ugc_aweme_ug_settings_UgcPermission build() {
            return new com_ss_android_ugc_aweme_ug_settings_UgcPermission(this.desc, this.url, super.buildUnknownFields());
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_ug_settings_UgcPermission$ProtoAdapter_com_ss_android_ugc_aweme_ug_settings_UgcPermission */
    static final class ProtoAdapter_com_ss_android_ugc_aweme_ug_settings_UgcPermission extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_ug_settings_UgcPermission> {
        public final com_ss_android_ugc_aweme_ug_settings_UgcPermission redact(com_ss_android_ugc_aweme_ug_settings_UgcPermission com_ss_android_ugc_aweme_ug_settings_ugcpermission) {
            return com_ss_android_ugc_aweme_ug_settings_ugcpermission;
        }

        public ProtoAdapter_com_ss_android_ugc_aweme_ug_settings_UgcPermission() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_ug_settings_UgcPermission.class);
        }

        public final com_ss_android_ugc_aweme_ug_settings_UgcPermission decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_ug_settings_UgcPermission) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_ug_settings_UgcPermission com_ss_android_ugc_aweme_ug_settings_ugcpermission) {
            return ProtoAdapter.STRING.encodedSizeWithTag(3079825, com_ss_android_ugc_aweme_ug_settings_ugcpermission.desc) + ProtoAdapter.STRING.encodedSizeWithTag(116079, com_ss_android_ugc_aweme_ug_settings_ugcpermission.url) + com_ss_android_ugc_aweme_ug_settings_ugcpermission.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_ug_settings_UgcPermission com_ss_android_ugc_aweme_ug_settings_ugcpermission) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3079825, com_ss_android_ugc_aweme_ug_settings_ugcpermission.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 116079, com_ss_android_ugc_aweme_ug_settings_ugcpermission.url);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_ug_settings_ugcpermission.unknownFields());
        }

        public final com_ss_android_ugc_aweme_ug_settings_UgcPermission decode(ProtoReader protoReader, com_ss_android_ugc_aweme_ug_settings_UgcPermission com_ss_android_ugc_aweme_ug_settings_ugcpermission) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_ug_settings_UgcPermission com_ss_android_ugc_aweme_ug_settings_ugcpermission2 = (com_ss_android_ugc_aweme_ug_settings_UgcPermission) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_ug_settings_UgcPermission.class, com_ss_android_ugc_aweme_ug_settings_ugcpermission);
            if (com_ss_android_ugc_aweme_ug_settings_ugcpermission2 != null) {
                builder = com_ss_android_ugc_aweme_ug_settings_ugcpermission2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 116079) {
                    builder.url((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3079825) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_ug_settings_ugcpermission2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.desc((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getDesc() throws C10174a {
        if (this.desc != null) {
            return this.desc;
        }
        throw new C10174a();
    }

    public final String getUrl() throws C10174a {
        if (this.url != null) {
            return this.url;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.desc = this.desc;
        builder.url = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.desc != null) {
            i = this.desc.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.url != null) {
            i3 = this.url.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_ug_settings_UgcPermission{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_ug_settings_UgcPermission)) {
            return false;
        }
        com_ss_android_ugc_aweme_ug_settings_UgcPermission com_ss_android_ugc_aweme_ug_settings_ugcpermission = (com_ss_android_ugc_aweme_ug_settings_UgcPermission) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_ug_settings_ugcpermission.unknownFields()) || !Internal.equals(this.desc, com_ss_android_ugc_aweme_ug_settings_ugcpermission.desc) || !Internal.equals(this.url, com_ss_android_ugc_aweme_ug_settings_ugcpermission.url)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_ug_settings_UgcPermission(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_ug_settings_UgcPermission(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.desc = str;
        this.url = str2;
    }
}
