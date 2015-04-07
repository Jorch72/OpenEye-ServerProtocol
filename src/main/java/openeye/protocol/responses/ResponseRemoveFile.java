package openeye.protocol.responses;

import com.google.gson.annotations.SerializedName;

public class ResponseRemoveFile implements IResponse {
	public static final String TYPE = "remove_file_suggestion";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("signature")
	public String signature;

	@SerializedName("url")
	public String url;

}
