package openeye.protocol.responses;

import com.google.gson.annotations.SerializedName;

public class ResponseFileContents implements IResponse {
	public static final String TYPE = "file_contents";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("signature")
	public String signature;

}
