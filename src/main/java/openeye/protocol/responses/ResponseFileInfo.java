package openeye.protocol.responses;

import com.google.gson.annotations.SerializedName;

public class ResponseFileInfo implements IResponse {
	public static final String TYPE = "file_info";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("signature")
	public String signature;

}
